import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import java.util.regex.Pattern;

public class RichPresence {

    private final String CLIENT_ID = "YOUR_APP_CLIENT_ID_GOES_HERE";

    private DiscordRPC lib;
    private DiscordRichPresence presence;
    private String lastUsername = null;

    private volatile boolean enabled = false;
    private Thread callbackThread = null;
    private String customState = "Exploring Nexus";

    private static final String[] FORBIDDEN_WORDS = { //this was uh, fun..to make..right let's go with "fun"
        "fuck", "shit", "bitch", "nigger", "cunt", "asshole", "fag", "rape",
        "porn", "dick", "cock", "pussy", "blowjob", "cum", "sex",
        "trump", "biden", "democrat", "republican", "conservative", "liberal", "antifa", "maga", "blm",
        "jesus", "allah", "christ", "god", "atheist", "islam", "muslim", "christian", "jew", "jihad"
    };

    private static final Pattern URL_PATTERN = Pattern.compile("https?://|www\\.|discord\\.gg/|\\.com|\\.net|\\.org|\\.xyz|\\.io|\\.ly|\\.to", Pattern.CASE_INSENSITIVE);

    private static boolean containsForbiddenWordOrUrl(String input) {
        if (input == null) return false;
        String lower = input.toLowerCase();
        for (String word : FORBIDDEN_WORDS) {
            if (lower.matches(".*\\b" + Pattern.quote(word) + "\\b.*"))
                return true;
        }
        if (URL_PATTERN.matcher(lower).find()) return true;
        return false;
    }

    public synchronized void setEnabled(boolean value) {
        if (value) {
            if (enabled) return;
            enabled = true;
            try {
                lib = DiscordRPC.INSTANCE;
                DiscordEventHandlers handlers = new DiscordEventHandlers();
                lib.Discord_Initialize(CLIENT_ID, handlers, true, "");
                presence = new DiscordRichPresence();
                presence.startTimestamp = System.currentTimeMillis() / 1000;
                presence.largeImageKey = "default";
                presence.largeImageText = "Nexus";
                presence.smallImageKey = "rsps";
                presence.smallImageText = "Join us now!";

                String username = TamperScanner.getLastKnownUsername();
                if (username == null || username.isEmpty() || username.equalsIgnoreCase("Unknown")) {
                    presence.details = "Not Logged In";
                    lastUsername = "Unknown"; 
                } else {
                    presence.details = "Logged in as: " + username;
                    lastUsername = username;
                }
                presence.state = customState;
                updatePresence();
                startCallbackThread();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (!enabled) return;
            enabled = false;
            try {
                stopCallbackThread();
                if (lib != null) {
                    lib.Discord_ClearPresence();
                    lib.Discord_Shutdown();
                }
                presence = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void startCallbackThread() {
        stopCallbackThread();
        callbackThread = new Thread(() -> {
            while (enabled && !Thread.currentThread().isInterrupted()) {
                lib.Discord_RunCallbacks();

                String currentUsername = TamperScanner.getLastKnownUsername();
                boolean isLoggedOut = (currentUsername == null || currentUsername.isEmpty() || currentUsername.equalsIgnoreCase("Unknown"));

                String displayDetails;
                if (isLoggedOut) {
                    displayDetails = "Not Logged In";
                    currentUsername = "Unknown";
                } else {
                    displayDetails = "Logged in as: " + currentUsername;
                }

                if (presence != null && (!currentUsername.equals(lastUsername) || !displayDetails.equals(presence.details))) {
                    lastUsername = currentUsername;
                    presence.details = displayDetails;
                    updatePresence();
                }

                try {
                    Thread.sleep(30000);
                } catch (InterruptedException ignored) {
					//ignored because false positive 
                }
            }
        }, "RPC-Callback-Handler");
        callbackThread.setDaemon(true);
        callbackThread.start();
    }

    private void stopCallbackThread() {
        if (callbackThread != null) {
            callbackThread.interrupt();
            callbackThread = null;
        }
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setCustomState(String state) {
        if (!enabled) {
            return;
        }
        if (state == null || state.isEmpty() || containsForbiddenWordOrUrl(state)) {
            state = "Exploring Nexus...";
        }
        if (state.length() > 128) state = state.substring(0, 128);
        customState = state;
        if (presence != null) {
            presence.state = state;
            updatePresence();
        }
    }

    public void initiate() {
        setEnabled(true);
    }

    public boolean presenceIsNull() {
        return presence == null;
    }

    public void updateDetails(String details) {
        if (presence != null) {
            presence.details = details;
            updatePresence();
        }
    }

    public void updateState(String state) {
        setCustomState(state);
    }

    public void updateSmallImageKey(String key) {
        if (presence != null) {
            presence.smallImageKey = key;
            updatePresence();
        }
    }

    public void updateSmallImageText(String text) {
        if (presence != null) {
            presence.smallImageText = text;
            updatePresence();
        }
    }

    public void updateLargeImageKey(String key) {
        if (presence != null) {
            presence.largeImageKey = key;
            updatePresence();
        }
    }

    public void updateLargeImageText(String text) {
        if (presence != null) {
            presence.largeImageText = text;
            updatePresence();
        }
    }

    public void updateTime(int update) {
        if (presence != null && update == 1) {
            presence.startTimestamp = System.currentTimeMillis() / 1000;
            updatePresence();
        }
    }

    public void updatePresence() {
        if (!enabled || presence == null) return;
        lib.Discord_UpdatePresence(presence);
    }
}
