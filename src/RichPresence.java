import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import java.util.regex.Pattern;

public class RichPresence {
    private DiscordRPC lib;
    private DiscordRichPresence presence;
    private String lastUsername = null;
    private volatile boolean enabled = false;
    private Thread callbackThread = null;

    /**Application client ID from Discord Developer portal*/
    private final String CLIENT_ID = "removed";

    /**RPC Image and default status config*/
    private String customState = "Exploring " + Settings.SERVER_NAME; //Default if a user doesn't set their own w/command
    private String largeImageKey = "default"; //Main image key, these are added in the Discord dev portal under Rich Presence > Art Assets
    private String smallImageKey = "rsps"; //Same as above
    private String largeImageText = Settings.SERVER_NAME; //This one is the text that shows when you hover over the large image
    private String smallImageText = "Join Us Now!"; //Same for small image

    /**Not allowed to show on RPC card, for obvious reasons. Makes it just show default if a pattern is matched*/
    private static final String[] FORBIDDEN_WORDS = {
        "fuck", "shit", "bitch", "nigger", "nigga", "cunt", "asshole", "fag", "rape",
        "porn", "dick", "cock", "pussy", "blowjob", "cum", "sex", "nazi",
        "trump", "biden", "democrat", "republican", "conservative", "liberal", "antifa", "maga", "blm",
        "jesus", "allah", "christ", "god", "atheist", "islam", "muslim", "christian", "jew", "jihad",
        "hamas", "israel", "palestine", "ukraine", "russia" //bleh so much politics in one array. I'm tired of this, grandpa
    };

    /**Don't permit Discord invite links on RPC card*/
    private static final Pattern URL_PATTERN = Pattern.compile("https?://|www\\.|discord\\.gg/|\\.com|\\.net|\\.org|\\.xyz|\\.io|\\.ly|\\.to", Pattern.CASE_INSENSITIVE);

    private static boolean containsForbiddenWordOrUrl(String input) {
        if (input == null) return false;
        String lower = input.toLowerCase();
        for (String word : FORBIDDEN_WORDS) {
            if (lower.matches(".*\\b" + Pattern.quote(word) + "\\b.*"))
                return true;
        }
        return URL_PATTERN.matcher(lower).find();
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
                presence.largeImageKey = largeImageKey;
                presence.largeImageText = largeImageText;
                presence.smallImageKey = smallImageKey;
                presence.smallImageText = smallImageText;
                String username = AntiDebug.getLastKnownUsername();
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
                String currentUsername = AntiDebug.getLastKnownUsername();
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
					//no stack trace because this is fired when rpc is turned off, false positive 
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
            state = "Exploring " + Settings.SERVER_NAME + "...";
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
