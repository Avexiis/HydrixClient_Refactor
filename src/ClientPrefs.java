import java.util.Objects;

public final class ClientPrefs {
    public int antialias;
    public int bloom;
    public int textureQuality;
    public int waterDetail;
    public int fog;
    public int groundBlending;
    public int lighting;
    public int sceneryShadows;
    public int characterShadows;
    public int particles;
    public int mapSize;
    public int screenSize;
    public int toolkit;
    public int toolkitSecondary;
    public int graphicsPreset;
    public int cpuUsage;
    public int compressionType;
    public int safemode;
    public int cursor;
    public int graphicsAutoSetup;
    public int groundDecor;
    public int class422_1;
    public int class422_2;
    public int windowModePreference_A;
    public int windowModePreference_B;
    public int volumeMaster;
    public int volumeMusic;
    public int volumeSfx;
    public int volumeAmbient;
    public int volumeVoice;

    public static ClientPrefs defaults() {
        ClientPrefs p = new ClientPrefs();
        p.antialias = 1;
        p.bloom = 1;
        p.textureQuality = 1;
        p.waterDetail = 0;
        p.fog = 0;
        p.groundBlending = 1;
        p.lighting = 0;
        p.sceneryShadows = 1;
        p.characterShadows = 0;
        p.particles = 1;
        p.mapSize = 0;
        p.screenSize = 0;
        p.toolkit = 1;
        p.toolkitSecondary = 1;
        p.graphicsPreset = 0;
        p.cpuUsage = 2;
        p.compressionType = 2;
        p.safemode = 0;
        p.cursor = 0;
        p.graphicsAutoSetup = 0;
        p.groundDecor = 0;
        p.class422_1 = 3;
        p.class422_2 = 1;
        p.windowModePreference_A = 1;
        p.windowModePreference_B = 1;
        p.volumeMaster = 75;
        p.volumeMusic = 75;
        p.volumeSfx = 75;
        p.volumeAmbient = 75;
        p.volumeVoice = 75;
        return p;
    }

    public void normalize() { //most of these could be 0,1 but 10 is safe for all, so it's gon be 10
        antialias = clamp(antialias, 0, 10);
        bloom = clamp(bloom, 0, 10);
        textureQuality = clamp(textureQuality, 0, 10);
        waterDetail = clamp(waterDetail, 0, 10);
        fog = clamp(fog, 0, 10);
        groundBlending = clamp(groundBlending, 0, 10);
        lighting = clamp(lighting, 0, 1);
        sceneryShadows = clamp(sceneryShadows, 0, 10);
        characterShadows = clamp(characterShadows, 0, 10);
        particles = clamp(particles, 0, 10);
        mapSize = clamp(mapSize, 0, 10);
        screenSize = clamp(screenSize, 0, 10);
        toolkit = clamp(toolkit, 0, 10);
        toolkitSecondary = clamp(toolkitSecondary, 0, 10);
        graphicsPreset = clamp(graphicsPreset, 0, 10);
        cpuUsage = clamp(cpuUsage, 0, 10);
        compressionType = clamp(compressionType, 0, 10);
        safemode = clamp(safemode, 0, 10);
        cursor = clamp(cursor, 0, 10);
        graphicsAutoSetup = clamp(graphicsAutoSetup, 0, 10);
        groundDecor = clamp(groundDecor, 0, 10);
        class422_1 = clamp(class422_1, 0, 10);
        class422_2 = clamp(class422_2, 0, 10);
        windowModePreference_A = clamp(windowModePreference_A, 0, 10);
        windowModePreference_B = clamp(windowModePreference_B, 0, 10);
        volumeMaster = clamp(volumeMaster, 0, 100);
        volumeMusic = clamp(volumeMusic, 0, 100);
        volumeSfx = clamp(volumeSfx, 0, 100);
        volumeAmbient = clamp(volumeAmbient, 0, 100);
        volumeVoice = clamp(volumeVoice, 0, 100);
    }

    private static int clamp(int v, int lo, int hi) {
        return Math.max(lo, Math.min(hi, v));
    }

    @Override
    public String toString() {
        return "ClientPrefs{}";
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof ClientPrefs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(1);
    }
}
