/**
 * JSON bridge that maps between GamePreferences (engine) and ClientPrefs (JSON).
 */
public final class GamePreferencesJsonBridge {
    private GamePreferencesJsonBridge() {}
    
    public static ClientPrefs fromGamePreferences(GamePreferences gp) {
        ClientPrefs p = ClientPrefs.defaults();
        if (gp == null) {
            p.normalize();
            return p;
        }
        if (gp.antialiasPreference != null) p.antialias = gp.antialiasPreference.getValue(0);
        if (gp.bloomPreference != null) p.bloom = gp.bloomPreference.method5647(0);
        if (gp.aClass422_Sub1_7552 != null) p.class422_1 = gp.aClass422_Sub1_7552.method5625(0);
        if (gp.aMapSizePreference_7558 != null) p.mapSize = gp.aMapSizePreference_7558.method5667(0);
        if (gp.aClass422_Sub24_7554 != null) p.graphicsAutoSetup = gp.aClass422_Sub24_7554.method5713((byte)0);
        if (gp.flickeringPreference != null) p.particles = gp.flickeringPreference.method5655(0);
        if (gp.fogPreference != null) p.fog = gp.fogPreference.method5633(0);
        if (gp.groundBlendingPreference != null) p.groundBlending = gp.groundBlendingPreference.method5724(0);
        if (gp.aRemoveRoofPreference_7547 != null) p.class422_2 = gp.aRemoveRoofPreference_7547.method5629(0);
        if (gp.aGraphicsSetup_7569 != null) p.graphicsAutoSetup = gp.aGraphicsSetup_7569.method5716((byte)0);
        if (gp.lightingPreference != null) p.lighting = gp.lightingPreference.getValue(0);
        if (gp.sceneryShadowPreference != null) p.sceneryShadows = gp.sceneryShadowPreference.getValue(0);
        if (gp.aGroundDecorPreference_7548 != null) p.groundDecor = gp.aGroundDecorPreference_7548.method5661((byte)0);
        if (gp.particlePreference != null) p.particles = gp.particlePreference.method5636(0);
        if (gp.aClass422_Sub17_7564 != null) p.graphicsPreset = gp.aClass422_Sub17_7564.method5689(0);
        if (gp.aScreenSizePreference_7566 != null) p.screenSize = gp.aScreenSizePreference_7566.method5654(0);
        if (gp.aClass422_Sub19_7567 != null) p.cpuUsage = gp.aClass422_Sub19_7567.getValue(0);
        if (gp.characterShadowPreference != null) p.characterShadows = gp.characterShadowPreference.method5693(0);
        if (gp.texturePreference != null) p.textureQuality = gp.texturePreference.getValue(0);
        if (gp.aToolkitPreference_7570 != null) p.toolkit = gp.aToolkitPreference_7570.getValue(0);
        if (gp.waterDetailPreference != null) p.waterDetail = gp.waterDetailPreference.getValue(0);
        if (gp.windowMode != null) p.windowModePreference_A = gp.windowMode.getWindowMode((byte)0);
        if (gp.cursorPreference != null) p.cursor = gp.cursorPreference.method5730(0);
        if (gp.aGraphicsPresetPreference_7576 != null) p.graphicsPreset = gp.aGraphicsPresetPreference_7576.method5709(0);
        if (gp.aClass422_Sub26_7577 != null) p.cpuUsage = gp.aClass422_Sub26_7577.method5717((byte)1);
        if (gp.aCompressionType_7578 != null) p.compressionType = gp.aCompressionType_7578.method5700(0);
        if (gp.safemodePreference != null) p.safemode = gp.safemodePreference.getValue((byte)0);
        if (gp.aClass422_Sub21_7580 != null) p.toolkitSecondary = gp.aClass422_Sub21_7580.getValue((byte)0);
        if (gp.aVolumePreference_7553 != null) p.volumeMaster = gp.aVolumePreference_7553.method5726(0);
        if (gp.aVolumePreference_7582 != null) p.volumeAmbient = gp.aVolumePreference_7582.method5726(0);
        if (gp.aVolumePreference_7583 != null) p.volumeMusic = gp.aVolumePreference_7583.method5726(0);
        if (gp.aVolumePreference_7584 != null) p.volumeSfx = gp.aVolumePreference_7584.method5726(0);
        if (gp.aVolumePreference_7587 != null) p.volumeVoice = gp.aVolumePreference_7587.method5726(0);
        if (gp.graphicsPreference != null) p.toolkitSecondary = gp.graphicsPreference.getValue(0);
        if (gp.windowModeShadow != null) p.windowModePreference_B = gp.windowModeShadow.getWindowMode((byte)0);
        p.normalize();
        return p;
    }

    public static void applyToGamePreferences(ClientPrefs p, GamePreferences gp) {
        if (p == null || gp == null) return;
        gp.method3537(false, 0);
        setInt(gp.antialiasPreference, p.antialias);
        setInt(gp.bloomPreference, p.bloom);
        setInt(gp.aClass422_Sub1_7552, p.class422_1);
        setInt(gp.aMapSizePreference_7558,        p.mapSize);
        setInt(gp.aClass422_Sub24_7554, p.graphicsAutoSetup);
        setInt(gp.flickeringPreference, p.particles);
        setInt(gp.fogPreference, p.fog);
        setInt(gp.groundBlendingPreference, p.groundBlending);
        setInt(gp.aRemoveRoofPreference_7547, p.class422_2);
        setInt(gp.aGraphicsSetup_7569, p.graphicsAutoSetup);
        setInt(gp.lightingPreference, p.lighting);
        setInt(gp.sceneryShadowPreference, p.sceneryShadows);
        setInt(gp.aGroundDecorPreference_7548, p.groundDecor);
        setInt(gp.particlePreference, p.particles);
        setInt(gp.aClass422_Sub17_7564, p.graphicsPreset);
        setInt(gp.aScreenSizePreference_7566, p.screenSize);
        setInt(gp.aClass422_Sub19_7567, p.cpuUsage);
        setInt(gp.characterShadowPreference, p.characterShadows);
        setInt(gp.texturePreference, p.textureQuality);
        setInt(gp.aToolkitPreference_7570, p.toolkit);
        setInt(gp.graphicsPreference, p.toolkitSecondary);
        setInt(gp.waterDetailPreference, p.waterDetail);
        setInt(gp.windowMode, p.windowModePreference_A);
        setInt(gp.cursorPreference, p.cursor);
        setInt(gp.aGraphicsPresetPreference_7576, p.graphicsPreset);
        setInt(gp.aClass422_Sub26_7577, p.cpuUsage);
        setInt(gp.aCompressionType_7578, p.compressionType);
        setInt(gp.safemodePreference, p.safemode);
        setInt(gp.aClass422_Sub21_7580, p.toolkitSecondary);
        setInt(gp.aVolumePreference_7553, p.volumeMaster);
        setInt(gp.aVolumePreference_7583, p.volumeMusic);
        setInt(gp.aVolumePreference_7584, p.volumeSfx);
        setInt(gp.aVolumePreference_7582, p.volumeAmbient);
        setInt(gp.aVolumePreference_7587, p.volumeVoice);
        gp.applyPreferences((short)0);
    }

    private static void setInt(Object maybeIntPref, int value) {
        if (maybeIntPref == null) return;
        try {
            maybeIntPref.getClass().getMethod("method5613", int.class, int.class).invoke(maybeIntPref, value, 0);
        } catch (NoSuchMethodException ignored) {
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
