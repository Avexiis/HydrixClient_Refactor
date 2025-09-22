import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class PrefsIO {
    private PrefsIO() {}

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    public static Path prefsDir() {
        String home = System.getenv("USERPROFILE");
        if (home == null || home.isEmpty()) {
            home = System.getProperty("user.home");
        }
        String server = Settings.SERVER_NAME == null ? "server" : Settings.SERVER_NAME.toLowerCase();
        return Paths.get(home, "." + server);
    }

    public static Path prefsPath() {
        return prefsDir().resolve("client-prefs.json");
    }

    public static ClientPrefs loadOrNull() {
        Path p = prefsPath();
        if (!Files.exists(p)) {
            return null;
        }
        try (BufferedReader r = Files.newBufferedReader(p, StandardCharsets.UTF_8)) {
            ClientPrefs prefs = GSON.fromJson(r, ClientPrefs.class);
            if (prefs == null) {
                return null;
            }
            prefs.normalize();
            return prefs;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static boolean save(ClientPrefs prefs) {
        try {
            Path dir = prefsDir();
            if (!Files.exists(dir)) {
                Files.createDirectories(dir);
            }
            Path p = prefsPath();
            try (BufferedWriter w = Files.newBufferedWriter(p, StandardCharsets.UTF_8)) {
                GSON.toJson(prefs, w);
            }
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
