/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.concurrent.ConcurrentLinkedQueue;

public class AtmosphereManager {
	private static final ConcurrentLinkedQueue<Runnable> renderTasks = new ConcurrentLinkedQueue<>();
	public static void enqueueOnRenderThread(Runnable task) {
		renderTasks.offer(task);
	}
	Atmosphere previousAtmosphere;
	static int DEFAULT_FOG_COLOR_GLOBAL;
	long lastTransitionTimeNs;
	static float DEFAULT_SUN_INTENSITY = 0.69921875F;
	static float DEFAULT_SHADOW_INTENSITY = 1.2F;
	private final int SUN_COLOR;
	private final int FOG_COLOR;
	private final int FOG_NEAR_DIST;
	private final int FOG_FAR_DIST;
	private final int defaultColorSun;
	private final int defaultColorFog;
	private final int defaultFogNear;
	private final int defaultFogFar;
	static int DEFAULT_TRANSITION_DURATION;
	GraphicsToolkit toolkit;
	Atmosphere[][] atmosphereDefinitions;
	int totalTransitionDuration = 0;
	int remainingTransitionTime = -1117911945;
	public static int[] INITIAL_COLORS;
	SceneObjectPosition sunDirection;
	Atmosphere fallbackAtmosphere;
	Atmosphere currentAtmosphere;
	Atmosphere targetAtmosphere;
	static int DEFAULT_SUN_COLOR_GLOBAL = 1373663905;
	CachingHashMap skyboxCache;
	boolean forceUpdate;
	CachingHashMap modelCache;
	private boolean customOverrideEnabled = false;
	private boolean editorActive = false;
	private int overrideSunColor, overrideFogColor, overrideFogNear, overrideFogFar;
	private Map<String,EnvPreset> presets = new LinkedHashMap<>();
	private static final Path PRESET_DIR = Paths.get("EnvPresets");
	private static final Path PRESET_FILE = PRESET_DIR.resolve("presets.json");
	private int overrideSkyId, overrideParam1, overrideParam2, overrideParam3, overrideParam4;

	public AtmosphereManager(GraphicsToolkit class_ra, int i, int i_0_) {
		this.lastTransitionTimeNs = 0L;
		this.forceUpdate = false;
		this.sunDirection = new SceneObjectPosition(-50.0F, -60.0F, -50.0F);
		this.skyboxCache = new CachingHashMap(8);
		this.modelCache = new CachingHashMap(8);
		this.toolkit = class_ra;
		this.atmosphereDefinitions = new Atmosphere[i][i_0_];
		if (null != INITIAL_COLORS)
			Class82_Sub12.defaultEnvironment = createSkybox(INITIAL_COLORS[0], INITIAL_COLORS[1], INITIAL_COLORS[2], INITIAL_COLORS[3], INITIAL_COLORS[4], INITIAL_COLORS[5], 2001255265);
		Class254.aSkybox_2789 = null;
		this.fallbackAtmosphere = new Atmosphere();
		this.currentAtmosphere = new Atmosphere();
		this.previousAtmosphere = new Atmosphere();
		this.targetAtmosphere = new Atmosphere();
		forceUpdate(-1545496874);
		SUN_COLOR = currentAtmosphere.sunColor;
		FOG_COLOR = currentAtmosphere.fogColor;
		FOG_NEAR_DIST = currentAtmosphere.fogNearDistance;
		FOG_FAR_DIST = FOG_NEAR_DIST + 100;
		defaultColorSun = SUN_COLOR;
		defaultColorFog = FOG_COLOR;
		defaultFogNear = FOG_NEAR_DIST;
		defaultFogFar = FOG_FAR_DIST;
		overrideSunColor = defaultColorSun;
		overrideFogColor = defaultColorFog;
		overrideFogNear = defaultFogNear;
		overrideFogFar = defaultFogFar;
		try {
			Files.createDirectories(PRESET_DIR);
			if (Files.exists(PRESET_FILE)) {
				ObjectMapper M = new ObjectMapper();
				List<EnvPreset> list = M.readValue(Files.newBufferedReader(PRESET_FILE), new TypeReference<List<EnvPreset>>() {});
				presets = list.stream().collect(Collectors.toMap(p -> p.name, p -> p, (a,b)->a, LinkedHashMap::new));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void savePresets() {
		try {
			Files.createDirectories(PRESET_DIR);
			ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
			try (Writer w = Files.newBufferedWriter(PRESET_FILE)) {
				mapper.writeValue(w, presets.values());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Atmosphere getCurrentAtmosphere(byte i) {
		try {
			return this.currentAtmosphere;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.f(" + ')');
		}
	}

	public void resetCaches(byte i) {
		try {
			this.skyboxCache.method4187();
			this.modelCache.method4187();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.p(" + ')');
		}
	}

	private void fixFogBounds() { //didn't work
		if (overrideFogNear <= 0) {
			int derived = Math.max(defaultFogNear, Math.max(256, overrideFogFar - 2048));
			overrideFogNear = Math.min(derived, Math.max(0, overrideFogFar - 64));
		}
		if (overrideFogFar <= overrideFogNear + 32) {
			overrideFogFar = overrideFogNear + 32;
		}
	}

	void updateGraphics(byte i) {
		toolkit.IA((0.7f + GraphicsSetup.clientPreferences.aClass422_Sub1_7552.method5625(-712203354) *
					0.1f + GameClient.map.method2633(2016671740)) * currentAtmosphere.sunIntensity);
		if (editorActive && customOverrideEnabled) {
			fixFogBounds();
			float yawRad   = (float) Math.toRadians(sunDirection.x);
			float pitchDeg = Math.max(-50f, Math.min(50f, sunDirection.y));
			float pitchRad = (float) Math.toRadians(pitchDeg);
			float dist = 200.0f;
			float dirX = (float)(Math.cos(pitchRad) * Math.sin(yawRad)) * dist;
			float dirY = (float)(Math.sin(pitchRad)) * dist;
			float dirZ = (float)(Math.cos(pitchRad) * Math.cos(yawRad)) * dist;
			toolkit.m(overrideSunColor, currentAtmosphere.shadowIntensity, currentAtmosphere.diffusion, dirX, dirY, dirZ);
			toolkit.c(overrideFogColor, overrideFogFar, overrideFogNear);
			EnvironmentMap customSky = createSkybox(overrideSkyId, overrideParam1, overrideParam2, overrideParam3, overrideParam4, INITIAL_COLORS[5], 2001255265);
			toolkit.method5095(customSky);
			return;
		}
		toolkit.m(DEFAULT_SUN_COLOR_GLOBAL * 332664479, DEFAULT_SUN_INTENSITY, DEFAULT_SHADOW_INTENSITY, -200.0f, -240.0f, -200.0f);
		toolkit.c(DEFAULT_FOG_COLOR_GLOBAL * -1971415573, -1, 0);
		toolkit.method5095(currentAtmosphere.skyMaterial);
	}

	public void setRegionAtmosphere(int i, int i_1_, Atmosphere atmosphere, byte i_2_) {
		try {
			this.atmosphereDefinitions[i][i_1_] = atmosphere;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.d(" + ')');
		}
	}

	public void clearRegionAtmosphere(byte i) {
		try {
			for (int i_3_ = 0; i_3_ < this.atmosphereDefinitions.length; i_3_++) {
				for (int i_4_ = 0; i_4_ < (this.atmosphereDefinitions[i_3_]).length; i_4_++)
					this.atmosphereDefinitions[i_3_][i_4_] = this.fallbackAtmosphere;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.u(" + ')');
		}
	}

	public void applySunDirectionToRegion(int i, int i_5_, int i_6_) {
		try {
			Atmosphere atmosphere = this.atmosphereDefinitions[i][i_5_];
			if (atmosphere != null)
				this.sunDirection.method2013(atmosphere.sunDirection);
			updateGraphics((byte) -41);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.x(" + ')');
		}
	}

	void beginTransition(int i, int i_7_, int i_8_, int i_9_) {
		try {
			if (customOverrideEnabled) {
				return;
			}
			Atmosphere atmosphere = this.atmosphereDefinitions[i][i_7_];
			if (null == atmosphere)
				atmosphere = this.fallbackAtmosphere;
			if (this.forceUpdate) {
				this.forceUpdate = false;
				i_8_ = 0;
			}
			if (!this.targetAtmosphere.equalsAtmosphere(atmosphere, -759773054)) {
				this.targetAtmosphere.method4704(atmosphere, (byte) -51);
				this.lastTransitionTimeNs = TimeUtils.getTime((byte) 1) * 858881257410153067L;
				this.totalTransitionDuration = ((this.remainingTransitionTime = 1117911945 * i_8_) * -2145126213);
				if (913546523 * this.totalTransitionDuration != 0) {
					this.previousAtmosphere.method4704(this.currentAtmosphere, (byte) -80);
					if ((this.currentAtmosphere.model) != null) {
						if (this.currentAtmosphere.model.method2586((byte) -18))
							this.currentAtmosphere.model = this.previousAtmosphere.model = this.currentAtmosphere.model.method2587(1076468319);
						if ((null != (this.currentAtmosphere.model)) && ((this.targetAtmosphere.model) != (this.currentAtmosphere.model)))
							this.currentAtmosphere.model.method2584((this.targetAtmosphere.model), -583959548);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.r(" + ')');
		}
	}

	public void updateAtmosphereScene(GameMap gameMap, int i) {
		Runnable task;
		while ((task = renderTasks.poll()) != null) {
			task.run();
		}
		try {
			if (Class413.method5584(-1233866115 * GameClient.anInt8752, 2068577506) || Class299.method3682(-1233866115 * GameClient.anInt8752, 1765230881))
				beginTransition(Class367.anInt4000 * -1740717447 >> 12, -299812095 * Class146.anInt1575 >> 12, DEFAULT_TRANSITION_DURATION * -450037889, -1055017698);
			else {
				int i_10_ = -1;
				int i_11_ = -1;
				if (null != Class287.myPlayer) {
					i_10_ = (Class287.myPlayer.scenePositionXQueue[0]) >> 3;
					i_11_ = (Class287.myPlayer.scenePositionYQueue[0]) >> 3;
				}
				if (i_10_ < 0 || i_10_ >= gameMap.upperX(-2064159072) >> 3 || i_11_ < 0 || i_11_ >= gameMap.upperY(-1098820218) >> 3)
					beginTransition(gameMap.upperX(-1944264656) >> 4, gameMap.upperY(211843254) >> 4, 0, -1158726222);
				else
					beginTransition(i_10_, i_11_, DEFAULT_TRANSITION_DURATION * -450037889, -908271345);
			}
			updateTransitionProgress(828656850);
			updateGraphics((byte) 67);
			updateFogParams(394959545);
			applyFogSettings((byte) 7);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.a(" + ')');
		}
	}

	public void forceUpdate(int i) {
		try {
			this.forceUpdate = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.n(" + ')');
		}
	}

	void updateFogParams(int i) {
		try {
			this.toolkit.method5152(this.currentAtmosphere.fogIntensity, this.currentAtmosphere.sunBrightness, this.currentAtmosphere.ambientLight, -1795302913);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.y(" + ')');
		}
	}

	public void renderFrameAtmosphere(byte i) {
		try {
			Runnable task;
			while ((task = renderTasks.poll()) != null) {
				task.run();
			}
			float baseIntensity = 0.7F + (GraphicsSetup.clientPreferences.aClass422_Sub1_7552.method5625(-1693044274) * 0.1F) + GameClient.map.method2633(1910914073);
			toolkit.IA(baseIntensity * 1.1523438F);
			if (editorActive && customOverrideEnabled) {
				fixFogBounds();
				currentAtmosphere.sunColor = overrideSunColor;
				currentAtmosphere.fogColor = overrideFogColor;
				currentAtmosphere.fogNearDistance = overrideFogNear;
				float yawRad   = (float) Math.toRadians(sunDirection.x);
				float pitchDeg = Math.max(-50f, Math.min(50f, sunDirection.y));
				float pitchRad = (float) Math.toRadians(pitchDeg);
				float dist = 200.0f;
				float dirX = (float)(Math.cos(pitchRad) * Math.sin(yawRad)) * dist;
				float dirY = (float)(Math.sin(pitchRad)) * dist;
				float dirZ = (float)(Math.cos(pitchRad) * Math.cos(yawRad)) * dist;
				toolkit.m(overrideSunColor, currentAtmosphere.shadowIntensity, currentAtmosphere.diffusion, dirX, dirY, dirZ);
				toolkit.c(overrideFogColor, overrideFogFar, overrideFogNear);
				currentAtmosphere.skyMaterial = createSkybox(overrideSkyId, overrideParam1, overrideParam2, overrideParam3, overrideParam4, INITIAL_COLORS[5], 2001255265);
				toolkit.method5095(currentAtmosphere.skyMaterial);
			} else {
				toolkit.m(DEFAULT_SUN_COLOR_GLOBAL * 332664479, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
				toolkit.c(DEFAULT_FOG_COLOR_GLOBAL * -1971415573, -1, 0);
				toolkit.method5095(Class82_Sub12.defaultEnvironment);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.t(" + ')');
		}
	}

	static {
		DEFAULT_FOG_COLOR_GLOBAL = 615272440;
		DEFAULT_TRANSITION_DURATION = -816669807;
	}

	public void copyStateFrom(AtmosphereManager atmosphereManager_12_, int i) {
		try {
			this.currentAtmosphere.method4704((atmosphereManager_12_.currentAtmosphere), (byte) 37);
			this.previousAtmosphere.method4704((atmosphereManager_12_.previousAtmosphere), (byte) -76);
			this.targetAtmosphere.method4704((atmosphereManager_12_.targetAtmosphere), (byte) 34);
			this.lastTransitionTimeNs = atmosphereManager_12_.lastTransitionTimeNs;
			this.totalTransitionDuration = atmosphereManager_12_.totalTransitionDuration;
			this.remainingTransitionTime = atmosphereManager_12_.remainingTransitionTime;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.b(" + ')');
		}
	}

	Skybox createSkybox(int i, int i_13_, int i_14_, int i_15_, short i_16_) {
		try {
			long l = (((long) i_13_ & 0xffffL) << 48 | ((long) i_14_ & 0xffffL) << 32 | ((long) i_15_ & 0xffffL) << 16 | (long) i & 0xffffL);
			Skybox skybox = (Skybox) this.modelCache.get(l);
			if (null == skybox) {
				skybox = VarBitType.aClass317_3472.createSkyboxFace(i, i_13_, i_14_, i_15_, (Class138_Sub1.aClass131_7010), (byte) -51);
				this.modelCache.put(skybox, l);
			}
			return skybox;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.k(" + ')');
		}
	}

	EnvironmentMap createSkybox(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		try {
			long textureId = (67481L * (long) i ^ (long) i_17_ * 97549L ^ 475427L * (long) i_18_ ^ (long) i_19_ * 986053L ^ (long) i_20_ * 32147369L ^ (long) i_21_ * 76724863L);
			EnvironmentMap skybox = (EnvironmentMap) this.skyboxCache.get(textureId);
			if (null != skybox)
				return skybox;
			skybox = this.toolkit.createEnvironmentMap(i, i_17_, i_18_, i_19_, i_20_, i_21_);
			this.skyboxCache.put(skybox, textureId);
			return skybox;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.i(" + ')');
		}
	}

	void updateTransitionProgress(int i) {
		try {
			if (this.remainingTransitionTime * -1051268423 >= 0) {
				long l = TimeUtils.getTime((byte) 1);
				this.remainingTransitionTime -= ((l - 5777556104771211843L * this.lastTransitionTimeNs) * 1117911945L);
				if (-1051268423 * this.remainingTransitionTime > 0)
					this.currentAtmosphere.blendWith(
							this.toolkit,
							this.previousAtmosphere,
							this.targetAtmosphere,
							((float) (913546523 * this.totalTransitionDuration - this.remainingTransitionTime * -1051268423) / (float) (913546523 * this.totalTransitionDuration)),
							937279263);
				else {
					this.currentAtmosphere.method4704(this.targetAtmosphere, (byte) -42);
					if ((this.currentAtmosphere.model) != null)
						this.currentAtmosphere.model.method2585((byte) -128);
					this.remainingTransitionTime = -1117911945;
				}
				this.lastTransitionTimeNs = 858881257410153067L * l;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.q(" + ')');
		}
	}

	public void applyFogSettings(byte i) {
		try {
			if (editorActive && customOverrideEnabled) {
				fixFogBounds();
				toolkit.c(currentAtmosphere.fogColor, overrideFogFar, overrideFogNear);
				return;
			}
			int i_23_ = 0;
			int i_24_ = ((currentAtmosphere.fogNearDistance + 256) << 2);
			toolkit.c(currentAtmosphere.fogColor, GraphicsSetup.clientPreferences.fogPreference.method5633(1323547629) == 1 ? i_24_ : -1, currentAtmosphere.fogNearDistance);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.z(" + ')');
		}
	}

	private volatile boolean skyboxRebuildQueued = false;

	public void queueRebuildAllSkyboxes(final Packet pktTemplate) {
		if (skyboxRebuildQueued) return;
		skyboxRebuildQueued = true;
		enqueueOnRenderThread(() -> {
			try {
				for (Atmosphere[] row : atmosphereDefinitions) {
					for (Atmosphere atm : row) {
						if (atm == null) continue;
						pktTemplate.pos = 0;
						atm.setSkybox(pktTemplate, this, (byte) -1);
					}
				}
			} finally {
				skyboxRebuildQueued = false;
			}
		});
	}

	public static Class412 getCurrentGameState(int i) {
		try {
			if (null == Class525.aClass412_6299) return Class412.aClass412_6568; return Class525.aClass412_6299;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.d(" + ')');
		}
	}

	public static boolean isAlphabetic(char c, int i) {
		try {
			return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.s(" + ')');
		}
	}

	static final void scriptOpComponentAction(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (class403.aBoolean5261 ? class403.aClass390_5247 : class403.aClass390_5246);
			IComponentDefinition class105 = class390.aClass105_4168;
			RSInterface RSInterface = class390.aRSInterface_4167;
			Class522.method6326(class105, RSInterface, class403, -1905856494);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.ir(" + ')');
		}
	}

	static final void scriptOpQuickChatPrivateMessage(ClientScript2 class403, int i) {
		try {
			String string = (String) (class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393]);
			Class25 class25 = Language.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.QUICK_CHAT_PRIVATE_MESSAGE, class25.aClass449_330, (byte) 109);
			class298_sub36.buffer.writeByte(0);
			int i_25_ = (385051775 * class298_sub36.buffer.pos);
			class298_sub36.buffer.writeString(string, 2120587039);
			class298_sub36.buffer.writeShort(class403.aClass177_5243.anInt1787 * -2034569943, 16711935);
			class403.aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(class298_sub36.buffer, class403.aClass177_5243.anIntArray1789, 535185989);
			class298_sub36.buffer.method3649((class298_sub36.buffer.pos * 385051775) - i_25_, (byte) -99);
			class25.writeOutboundPacket(class298_sub36, (byte) -26);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.acd(" + ')');
		}
	}

	static final void scriptOpCloseInterfaces(ClientScript2 class403, int i) {
		try {
			Class216.method2001(false, (byte) 38);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.ahb(" + ')');
		}
	}

	public void setEditorActive(boolean active) {
		this.editorActive = active;
	}

	public boolean isEditorActive() {
		return editorActive;
	}

	public void setCustomOverrideEnabled(boolean enabled) {
		this.customOverrideEnabled = enabled;
	}

	public boolean isCustomOverrideEnabled() {
		return customOverrideEnabled;
	}

	public int getDefaultSunColor() {
		return defaultColorSun;
	}

	public int getDefaultFogColor() {
		return defaultColorFog;
	}

	public int getDefaultFogNear() {
		return defaultFogNear;
	}

	public int getDefaultFogFar() {
		return defaultFogFar;
	}

	public int getOverrideSunColor() {
		return overrideSunColor;
	}

	public void setOverrideSunColor(int c) {
		overrideSunColor = c;
	}

	public int getOverrideFogColor() {
		return overrideFogColor;
	}

	public void setOverrideFogColor(int c) {
		overrideFogColor = c;
	}

	public int getOverrideFogNear() {
		return overrideFogNear;
	}

	public void setOverrideFogNear(int v) {
		overrideFogNear = v;
	}

	public int getOverrideFogFar() {
		return overrideFogFar;
	}

	public void setOverrideFogFar(int v) {
		overrideFogFar = v;
	}

	public int getOverrideSkyId() {
		return overrideSkyId;
	}

	public void setOverrideSkyId(int v) {
		overrideSkyId = v;
	}

	public int getOverrideParam1() {
		return overrideParam1;
	}

	public void setOverrideParam1(int v) {
		overrideParam1 = v;
	}

	public int getOverrideParam2() {
		return overrideParam2;
	}

	public void setOverrideParam2(int v) {
		overrideParam2 = v;
	}

	public int getOverrideParam3() {
		return overrideParam3;
	}

	public void setOverrideParam3(int v) {
		overrideParam3 = v;
	}

	public int getOverrideParam4() {
		return overrideParam4;
	}

	public void setOverrideParam4(int v) {
		overrideParam4 = v;
	}

	public Map<String, EnvPreset> getPresetsView() {
		return presets;
	}

	public void savePresetsPublic() {
		savePresets();
	}

	public void resetCachesPublic() {
		resetCaches((byte)0);
	}

	public void applyAtmosphereSettingsPublic() {
		applyAtmosphereSettings();
	}

	public void resetToDefaultsPublic() {
		enqueueOnRenderThread(this::resetToDefaults);
	}

	private void resetToDefaults() {
		customOverrideEnabled = false;
		overrideSunColor = defaultColorSun;
		overrideFogColor = defaultColorFog;
		overrideFogNear = defaultFogNear;
		overrideFogFar = defaultFogFar;
		applyAtmosphereSettings();
	}

	private void applyAtmosphereSettings() {
		boolean useOverride = editorActive && customOverrideEnabled;
		int sunColor = useOverride ? overrideSunColor : defaultColorSun;
		int fogColor = useOverride ? overrideFogColor : defaultColorFog;
		int fogNear = useOverride ? overrideFogNear : defaultFogNear;
		int fogFar = useOverride ? overrideFogFar : defaultFogFar;
		if (useOverride) fixFogBounds();
		currentAtmosphere.sunColor = sunColor;
		currentAtmosphere.fogColor = fogColor;
		currentAtmosphere.fogNearDistance = fogNear;
		float rawYaw = sunDirection.x;
		float rawPitch = sunDirection.y;
		if (Float.isNaN(rawYaw) || Float.isInfinite(rawYaw))   rawYaw   = 0f;
		if (Float.isNaN(rawPitch) || Float.isInfinite(rawPitch)) rawPitch = 0f;
		float yawDeg = Math.max(-180f, Math.min(180f, rawYaw));
		float pitchDeg = Math.max(-45f, Math.min(45f, rawPitch));
		float yawRad = (float) Math.toRadians(yawDeg);
		float pitchRad = (float) Math.toRadians(pitchDeg);
		float dist = 200.0f;
		float dirX = (float)(Math.cos(pitchRad) * Math.sin(yawRad)) * dist;
		float dirY = (float)(Math.sin(pitchRad)) * dist;
		float dirZ = (float)(Math.cos(pitchRad) * Math.cos(yawRad)) * dist;
		toolkit.IA((0.7f + GameClient.map.method2633(0)) * currentAtmosphere.sunIntensity);
		toolkit.m(sunColor, currentAtmosphere.shadowIntensity, currentAtmosphere.diffusion, dirX, dirY, dirZ);
		toolkit.c(fogColor, fogFar, fogNear);
		toolkit.method5095(currentAtmosphere.skyMaterial);
	}
}
