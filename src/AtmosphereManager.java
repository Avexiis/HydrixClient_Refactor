/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
 
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeEvent;

import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.io.IOException;
import java.io.File;
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
	static int MIN_SUN_PITCH = -50;
	static int MIN_SUN_YAW = -60;
	static int MIN_SUN_ROLL = -50;
	static int ZERO = 0;
	private int anInt9123; // horizontal sun direction
    private int anInt9124; // vertical sun direction
    private int anInt9125; // sun light color
    private int anInt9126; // fog color
    private int anInt9127; // fog near distance
    private int anInt9128; // fog far distance
	private final int defaultColorSun;
    private final int defaultColorFog;
    private final int defaultFogNear;
    private final int defaultFogFar;
	static float BASE_INTENSITY_MULTIPLIER = 1.1523438F;
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
	private static final Path PRESET_DIR  = Paths.get("EnvPresets");
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
		anInt9123 = currentAtmosphere.sunColor;
		anInt9124 = 0;
		anInt9125 = currentAtmosphere.sunColor;
		anInt9126 = currentAtmosphere.fogColor;
		anInt9127 = currentAtmosphere.fogNearDistance;
		anInt9128 = anInt9127 + 100;
		defaultColorSun = anInt9125;
        defaultColorFog  = anInt9126;
        defaultFogNear   = anInt9127;
        defaultFogFar    = anInt9128;
		try {
			Files.createDirectories(PRESET_DIR);
			if (Files.exists(PRESET_FILE)) {
				ObjectMapper M = new ObjectMapper();
				List<EnvPreset> list = M.readValue(
					Files.newBufferedReader(PRESET_FILE),
					new TypeReference<List<EnvPreset>>() {}
				);
				presets = list.stream().collect(Collectors.toMap(
					p -> p.name, p -> p, (a,b)->a, LinkedHashMap::new
				));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	private void savePresets() {
		try {
			Files.createDirectories(PRESET_DIR);
			ObjectMapper mapper = new ObjectMapper()
				.enable(SerializationFeature.INDENT_OUTPUT);
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

	void updateGraphics(byte i) {
		toolkit.IA((0.7f + GraphicsAutoSetup.clientPreferences.aClass422_Sub1_7552.method5625(-712203354) * 0.1f
						 + GameClient.map.method2633(2016671740)) * currentAtmosphere.sunIntensity
		);

		if (editorActive && customOverrideEnabled) {
			float yawRad   = (float) Math.toRadians(sunDirection.x);
			float pitchDeg = Math.max(-50f, Math.min(50f, sunDirection.y));
			float pitchRad = (float) Math.toRadians(pitchDeg);
			float dist     = 200.0f;
			float dirX = (float)(Math.cos(pitchRad) * Math.sin(yawRad)) * dist;
			float dirY = (float)(Math.sin(pitchRad))              * dist;
			float dirZ = (float)(Math.cos(pitchRad) * Math.cos(yawRad)) * dist;

			toolkit.m(
					overrideSunColor,
					currentAtmosphere.shadowIntensity,
					currentAtmosphere.diffusion,
					dirX, dirY, dirZ
			);

			toolkit.c(
					overrideFogColor,
					overrideFogFar,
					overrideFogNear
			);

			EnvironmentMap customSky = createSkybox(
					overrideSkyId,
					overrideParam1,
					overrideParam2,
					overrideParam3,
					overrideParam4,
					INITIAL_COLORS[5],
					2001255265
			);
			toolkit.method5095(customSky);
			return;
		}

		toolkit.m(
				DEFAULT_SUN_COLOR_GLOBAL * 332664479,
				DEFAULT_SUN_INTENSITY,
				DEFAULT_SHADOW_INTENSITY,
				-200.0f,
				-240.0f,
				-200.0f
		);
		toolkit.c(
				DEFAULT_FOG_COLOR_GLOBAL * -1971415573,
				 -1,
				 0
		);
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
			float baseIntensity = 0.7F
				+ (GraphicsAutoSetup.clientPreferences.aClass422_Sub1_7552.method5625(-1693044274) * 0.1F)
				+ GameClient.map.method2633(1910914073);
			toolkit.IA(baseIntensity * 1.1523438F);

			if (editorActive && customOverrideEnabled) {
				currentAtmosphere.sunColor = overrideSunColor;
				currentAtmosphere.fogColor = overrideFogColor;
				currentAtmosphere.fogNearDistance = overrideFogNear;

				float yawRad   = (float) Math.toRadians(sunDirection.x);
				float pitchDeg = Math.max(-50f, Math.min(50f, sunDirection.y));
				float pitchRad = (float) Math.toRadians(pitchDeg);
				float dist     = 200.0f;
				float dirX = (float)(Math.cos(pitchRad) * Math.sin(yawRad)) * dist;
				float dirY = (float)(Math.sin(pitchRad))              * dist;
				float dirZ = (float)(Math.cos(pitchRad) * Math.cos(yawRad)) * dist;

				toolkit.m(
					overrideSunColor,
					currentAtmosphere.shadowIntensity,
					currentAtmosphere.diffusion,
					dirX,
					dirY,
					dirZ
				);

				toolkit.c(
					overrideFogColor,
					overrideFogFar,
					0
				);

				currentAtmosphere.skyMaterial = createSkybox(
						overrideSkyId,
						overrideParam1,
						overrideParam2,
						overrideParam3,
						overrideParam4,
						INITIAL_COLORS[5],
						2001255265
				);
				toolkit.method5095(currentAtmosphere.skyMaterial);

			} else {
				toolkit.m(
					DEFAULT_SUN_COLOR_GLOBAL * 332664479,
					0.69921875F,
					1.2F,
					-200.0F,
					-240.0F,
					-200.0F
				);
				toolkit.c(
					DEFAULT_FOG_COLOR_GLOBAL * -1971415573,
					-1,
					0
				);
				toolkit.method5095(Class82_Sub12.defaultEnvironment);
			}

		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception,
					"pd.t(" + ')');
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
					this.currentAtmosphere.blendWith(this.toolkit, this.previousAtmosphere, this.targetAtmosphere,
							((float) (913546523 * this.totalTransitionDuration - this.remainingTransitionTime * -1051268423) / (float) (913546523 * this.totalTransitionDuration)), 937279263);
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
				toolkit.c(
					currentAtmosphere.fogColor,
					overrideFogFar,
					overrideFogNear
				);
				return;
			}

			int i_23_ = 0;
			int i_24_ = ((currentAtmosphere.fogNearDistance + 256) << 2);
			toolkit.c(
				currentAtmosphere.fogColor,
				GraphicsAutoSetup.clientPreferences.fogPreference.method5633(1323547629) == 1
					? i_24_
					: -1,
				currentAtmosphere.fogNearDistance
			);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception,
					"pd.z(" + ')');
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

	public static Class412 getCurrentGameState(int i) {
		try {
			if (null == Class525.aClass412_6299)
				return Class412.aClass412_6568;
			return Class525.aClass412_6299;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pd.d(" + ')');
		}
	}
	
	/**
	 * Environment Editor
	 */
	public void openEnvironmentEditor() {
		final int openColorSun  = anInt9125;
		final int openColorFog  = anInt9126;
		final int openFogNear   = anInt9127;
		final int openFogFar    = anInt9128;

		overrideSunColor = openColorSun;
		overrideFogColor = openColorFog;
		overrideFogNear  = openFogNear;
		overrideFogFar   = openFogFar;

		final float initialF4130 = currentAtmosphere.sunIntensity;
		final float initialF4131 = currentAtmosphere.shadowIntensity;
		final float initialF4137 = currentAtmosphere.diffusion;
		final float initialF4132 = currentAtmosphere.fogIntensity;
		final float initialF4138 = currentAtmosphere.ambientLight;
		final float initialF4139 = currentAtmosphere.sunBrightness;
		final float initialYaw   = sunDirection.x;
		final float initialPitch = sunDirection.y;

		EventQueue.invokeLater(() -> {
			editorActive = true;
			try {
				for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						UIManager.setLookAndFeel(info.getClassName());
						UIManager.put("control",               new Color(60,63,65));
						UIManager.put("info",                  new Color(60,63,65));
						UIManager.put("nimbusBase",            new Color(18,30,49));
						UIManager.put("nimbusAlertYellow",     new Color(248,187,0));
						UIManager.put("nimbusDisabledText",    new Color(128,128,128));
						UIManager.put("nimbusFocus",           new Color(115,164,209));
						UIManager.put("nimbusGreen",           new Color(176,179,50));
						UIManager.put("nimbusInfoBlue",        new Color(66,139,221));
						UIManager.put("nimbusLightBackground", new Color(43,43,43));
						UIManager.put("nimbusOrange",          new Color(191,98,4));
						UIManager.put("nimbusRed",             new Color(169,46,34));
						UIManager.put("nimbusSelectedText",    new Color(255,255,255));
						UIManager.put("nimbusSelectionBackground", new Color(104,93,156));
						UIManager.put("text",                  new Color(230,230,230));
						break;
					}
				}
			} catch (Exception ignore) {}

			JFrame frame = new JFrame("Environment Editor");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setSize(680, 800);
			frame.setResizable(false);
			frame.setLayout(new BorderLayout());

			Font big = UIManager.getFont("Label.font").deriveFont(14f);

			JCheckBox chkDark = new JCheckBox("Dark Mode", true);
			chkDark.setFont(big);
			chkDark.addActionListener(e -> SwingUtilities.updateComponentTreeUI(frame));
			JComboBox<String> combo = new JComboBox<>(presets.keySet().toArray(new String[0]));
			combo.setFont(big);
			JButton btnSave   = new JButton("Save Preset");   btnSave.setFont(big);
			JButton btnDelete = new JButton("Delete Preset"); btnDelete.setFont(big);
			JButton btnExport = new JButton("Export Preset"); btnExport.setFont(big);
			JButton btnImport = new JButton("Import Preset"); btnImport.setFont(big);
			JPanel presetRow = new JPanel(new FlowLayout(FlowLayout.LEFT,6,4));
			presetRow.add(new JLabel("Preset:")); presetRow.getComponent(0).setFont(big);
			presetRow.add(combo);
			presetRow.add(btnSave);
			presetRow.add(btnDelete);
			presetRow.add(btnExport);
			presetRow.add(btnImport);
			presetRow.add(chkDark);
			frame.add(presetRow, BorderLayout.NORTH);

			int cr = clamp((openColorSun>>16)&0xFF,0,255);
			int cg = clamp((openColorSun>> 8)&0xFF,0,255);
			int cb = clamp( openColorSun      &0xFF,0,255);
			JPanel sunPanel = new JPanel(new GridLayout(0,2,4,4));
			sunPanel.setBorder(BorderFactory.createTitledBorder("Sun Color"));
			JLabel lSR = new JLabel("RED:");    lSR.setFont(big);
			JLabel lSG = new JLabel("GREEN:");  lSG.setFont(big);
			JLabel lSB = new JLabel("BLUE:");   lSB.setFont(big);
			JLabel lSunHex = new JLabel("Hex (Press ENTER to apply!):"); lSunHex.setFont(big);
			JSlider sR = new JSlider(0,255,cr), sG = new JSlider(0,255,cg), sB = new JSlider(0,255,cb);
			for (JSlider sl : new JSlider[]{sR,sG,sB}) sl.setFont(big);
			JTextField sunHex = new JTextField(String.format("#%02X%02X%02X",cr,cg,cb),8); sunHex.setFont(big);
			sunPanel.add(lSR); sunPanel.add(sR);
			sunPanel.add(lSG); sunPanel.add(sG);
			sunPanel.add(lSB); sunPanel.add(sB);
			sunPanel.add(lSunHex); sunPanel.add(sunHex);

			int fr = clamp((openColorFog>>16)&0xFF,0,255);
			int fg = clamp((openColorFog>> 8)&0xFF,0,255);
			int fb = clamp( openColorFog      &0xFF,0,255);
			JPanel fogPanel = new JPanel(new GridLayout(0,2,4,4));
			fogPanel.setBorder(BorderFactory.createTitledBorder("Fog"));
			JLabel lFR = new JLabel("RED:");   lFR.setFont(big);
			JLabel lFG = new JLabel("GREEN:"); lFG.setFont(big);
			JLabel lFB = new JLabel("BLUE:");  lFB.setFont(big);
			JLabel lFogHex = new JLabel("Hex (Press ENTER to apply!):"); lFogHex.setFont(big);
			JLabel lFogDist = new JLabel("Fog Dist:");     lFogDist.setFont(big);
			JSlider fR = new JSlider(0,255,fr), fG = new JSlider(0,255,fg), fB = new JSlider(0,255,fb);
			for (JSlider fl : new JSlider[]{fR,fG,fB}) fl.setFont(big);
			JTextField fogHex = new JTextField(String.format("#%02X%02X%02X",fr,fg,fb),8); fogHex.setFont(big);
			JSlider fogDist = new JSlider(0,15000, clamp(openFogFar,0,15000)); fogDist.setFont(big);
			JCheckBox chkLive = new JCheckBox("Live Preview", true); chkLive.setFont(big); chkLive.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
			fogPanel.add(lFR); fogPanel.add(fR);
			fogPanel.add(lFG); fogPanel.add(fG);
			fogPanel.add(lFB); fogPanel.add(fB);
			fogPanel.add(lFogHex); fogPanel.add(fogHex);
			fogPanel.add(lFogDist); fogPanel.add(fogDist);

			JPanel dirPanel = new JPanel(new GridLayout(0,2,4,4));
			dirPanel.setBorder(BorderFactory.createTitledBorder("Sun Direction"));
			JLabel lYaw = new JLabel("Yaw:"), lPitch = new JLabel("Pitch:");
			lYaw.setFont(big); lPitch.setFont(big);
			JSlider yawSlider = new JSlider(-180, 180, clamp((int)initialYaw, -180, 180));
			yawSlider.setMajorTickSpacing(60);
			yawSlider.setMinorTickSpacing(15);
			yawSlider.setPaintTicks(true);
			yawSlider.setPaintLabels(true);
			yawSlider.setFont(big);
			JSlider pitchSlider = new JSlider(-45, 45, clamp((int)initialPitch, -45, 45));
			pitchSlider.setMajorTickSpacing(10);
			pitchSlider.setMinorTickSpacing(5);
			pitchSlider.setPaintTicks(true);
			pitchSlider.setPaintLabels(true);
			pitchSlider.setFont(big);
			dirPanel.add(lYaw); dirPanel.add(yawSlider);
			dirPanel.add(lPitch); dirPanel.add(pitchSlider);

			JPanel advPanel = new JPanel(new GridLayout(0,2,4,4));
			advPanel.setBorder(BorderFactory.createTitledBorder("Advanced"));
			JSlider fl4130 = makeFloatSlider("Sun Intensity",           initialF4130,0f,3f,100,advPanel,"Sun intensity");
			JSlider fl4131 = makeFloatSlider("Shadow Intensity",        initialF4131,0f,1f,100,advPanel,"Shadow intensity"); fl4131.setInverted(true);
			JSlider fl4137 = makeFloatSlider("Diffusion",               initialF4137,0f,1f,100,advPanel,"Diffusion");
			JSlider fl4132 = makeFloatSlider("Fog Intensity",           initialF4132,0f,3f,100,advPanel,"Fog intensity");    fl4132.setInverted(true);
			JSlider fl4138 = makeFloatSlider("Ambient Light",           initialF4138,0f,1f,100,advPanel,"Ambient light");
			JSlider fl4139 = makeFloatSlider("Sun Brightness",          initialF4139,0f,1f,100,advPanel,"Sun brightness");   fl4139.setInverted(true);
			for (Component c : advPanel.getComponents()) c.setFont(big);
			JPanel skyboxPanel = new JPanel(new GridLayout(0,2,4,4));
			skyboxPanel.setBorder(BorderFactory.createTitledBorder("Skybox Settings - Fields labeled [BETA] are experimental and may not function as expected!"));

			JLabel lSkyId = new JLabel("Skyboxes:");
			lSkyId.setFont(big);
			JSlider skyIdSlider = new JSlider(0, 10, 0);
			skyIdSlider.setFont(big);
			skyboxPanel.add(lSkyId);
			skyboxPanel.add(skyIdSlider);

			JLabel lUn1 = new JLabel("[BETA] Rotation:");
			lUn1.setFont(big);
			JSlider un1Slider = new JSlider(0, 255, 0);
			un1Slider.setFont(big);
			skyboxPanel.add(lUn1);
			skyboxPanel.add(un1Slider);

			JLabel lUn2 = new JLabel("[BETA] Color:");
			lUn2.setFont(big);
			JSlider un2Slider = new JSlider(0, 255, 0);
			un2Slider.setFont(big);
			skyboxPanel.add(lUn2);
			skyboxPanel.add(un2Slider);

			JLabel lUn3 = new JLabel("[BETA] Brightness:");
			lUn3.setFont(big);
			JSlider un3Slider = new JSlider(0, 255, 0);
			un3Slider.setFont(big);
			skyboxPanel.add(lUn3);
			skyboxPanel.add(un3Slider);

			JLabel lUn4 = new JLabel("[BETA] Contrast:");
			lUn4.setFont(big);
			JSlider un4Slider = new JSlider(0, 255, 0);
			un4Slider.setFont(big);
			skyboxPanel.add(lUn4);
			skyboxPanel.add(un4Slider);

			final int initSkyId = skyIdSlider.getValue();
			final int initUn1 = un1Slider.getValue();
			final int initUn2 = un2Slider.getValue();
			final int initUn3 = un3Slider.getValue();
			final int initUn4 = un4Slider.getValue();
			overrideSkyId = initSkyId;
			overrideParam1 = initUn1;
			overrideParam2 = initUn2;
			overrideParam3 = initUn3;
			overrideParam4 = initUn4;
			ChangeListener skyListener = e -> {
				overrideSkyId = skyIdSlider.getValue();
				overrideParam1 = un1Slider.getValue();
				overrideParam2 = un2Slider.getValue();
				overrideParam3 = un3Slider.getValue();
				overrideParam4 = un4Slider.getValue();
				Packet pkt = new Packet(10);
				pkt.writeShort(skyIdSlider.getValue(), 0);
				pkt.writeShort(un1Slider.getValue(), 0);
				pkt.writeShort(un2Slider.getValue(), 0);
				pkt.writeShort(un3Slider.getValue(), 0);
				pkt.writeShort(un4Slider.getValue(), 0);

				enqueueOnRenderThread(() -> {
					for (Atmosphere[] row : atmosphereDefinitions) {
						for (Atmosphere atm : row) {
							pkt.pos = 0;
							atm.setSkybox(pkt, AtmosphereManager.this, (byte)-1);
						}
					}
				});
			};

			skyIdSlider.addChangeListener(skyListener);
			un1Slider .addChangeListener(skyListener);
			un2Slider .addChangeListener(skyListener);
			un3Slider .addChangeListener(skyListener);
			un4Slider .addChangeListener(skyListener);

			JPanel main = new JPanel();
			main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
			for (JPanel p : new JPanel[]{ sunPanel, fogPanel, dirPanel, advPanel, skyboxPanel }) {
				p.setAlignmentX(Component.LEFT_ALIGNMENT);
				main.add(p);
				main.add(Box.createVerticalStrut(8));
			}
			JScrollPane scroll = new JScrollPane(main);
			scroll.getVerticalScrollBar().setUnitIncrement(48);
			scroll.getVerticalScrollBar().setBlockIncrement(192);
			frame.add(scroll, BorderLayout.CENTER);

			JPanel btnRow = new JPanel(new FlowLayout(FlowLayout.RIGHT,6,4));
			JButton btnReset = new JButton("Reset"); btnReset.setFont(big);
			JButton btnApply = new JButton("Apply"); btnApply.setFont(big);
			btnRow.add(btnReset);
			btnRow.add(btnApply);
			JPanel bottom = new JPanel(new BorderLayout());
			bottom.add(chkLive, BorderLayout.WEST);
			bottom.add(btnRow, BorderLayout.EAST);
			frame.add(bottom, BorderLayout.SOUTH);
			pitchSlider.addChangeListener(e -> {
				if (!pitchSlider.getValueIsAdjusting() && chkLive.isSelected()) {
					btnApply.doClick();
				}
			});

			Timer debounce = new Timer(100, e -> { if (chkLive.isSelected()) btnApply.doClick(); });
			debounce.setRepeats(false);

			ChangeListener liveListener = e -> debounce.restart();
			for (JSlider slider : new JSlider[]{ sR, sG, sB, fR, fG, fB, fogDist, fl4130, fl4131, fl4137, fl4132, fl4138, fl4139, yawSlider }) {
				slider.addChangeListener(liveListener);
			}

			sunHex.addActionListener(e -> { try {
				String t = sunHex.getText().replace("#","");
				int col = Integer.parseInt(t,16);
				sR.setValue((col>>16)&0xFF);
				sG.setValue((col>>8)&0xFF);
				sB.setValue(col&0xFF);
			} catch(Exception ignored){} debounce.restart(); });
			fogHex.addActionListener(e -> { try {
				String t = fogHex.getText().replace("#","");
				int col = Integer.parseInt(t,16);
				fR.setValue((col>>16)&0xFF);
				fG.setValue((col>>8)&0xFF);
				fB.setValue(col&0xFF);
			} catch(Exception ignored){} debounce.restart(); });

			btnApply.addActionListener(e -> {
				overrideSunColor = (sR.getValue()<<16)|(sG.getValue()<<8)|sB.getValue();
				overrideFogColor = (fR.getValue()<<16)|(fG.getValue()<<8)|fB.getValue();
				overrideFogFar = fogDist.getValue();
				currentAtmosphere.sunIntensity = fl4130.getValue()/100f;
				currentAtmosphere.shadowIntensity = fl4131.getValue()/100f;
				currentAtmosphere.diffusion = fl4137.getValue()/100f;
				currentAtmosphere.fogIntensity = fl4132.getValue()/100f;
				currentAtmosphere.ambientLight = fl4138.getValue()/100f;
				currentAtmosphere.sunBrightness = fl4139.getValue()/100f;
				sunDirection.x = yawSlider.getValue();
				sunDirection.y = pitchSlider.getValue();
				customOverrideEnabled = true;
				enqueueOnRenderThread(this::applyAtmosphereSettings);
			});

			btnReset.addActionListener(e -> {
				customOverrideEnabled = false;
				overrideSunColor = defaultColorSun;
				overrideFogColor = defaultColorFog;
				overrideFogNear  = defaultFogNear;
				overrideFogFar   = defaultFogFar;
				sR.setValue((defaultColorSun>>16)&0xFF);
				sG.setValue((defaultColorSun>>8)&0xFF);
				sB.setValue(defaultColorSun&0xFF);
				sunHex.setText(String.format("#%02X%02X%02X",(defaultColorSun>>16)&0xFF,(defaultColorSun>>8)&0xFF,defaultColorSun&0xFF));
				fR.setValue((defaultColorFog>>16)&0xFF);
				fG.setValue((defaultColorFog>>8)&0xFF);
				fB.setValue(defaultColorFog&0xFF);
				fogHex.setText(String.format("#%02X%02X%02X",(defaultColorFog>>16)&0xFF,(defaultColorFog>>8)&0xFF,defaultColorFog&0xFF));
				fogDist.setValue(clamp(defaultFogFar,0,15000));
				fl4130.setValue((int)(initialF4130*100));
				fl4131.setValue((int)(initialF4131*100));
				fl4137.setValue((int)(initialF4137*100));
				fl4132.setValue((int)(initialF4132*100));
				fl4138.setValue((int)(initialF4138*100));
				fl4139.setValue((int)(initialF4139*100));
				yawSlider.setValue(clamp((int)initialYaw,-180,180));
				pitchSlider.setValue(clamp((int)initialPitch,-50,50));
				currentAtmosphere.sunColor = defaultColorSun;
				currentAtmosphere.fogColor = defaultColorFog;
				currentAtmosphere.fogNearDistance = defaultFogNear;
				 //currentAtmosphere.anIntFogFar = defaultFogFar; //buggy
				currentAtmosphere.sunIntensity = initialF4130;
				currentAtmosphere.shadowIntensity = initialF4131;
				currentAtmosphere.diffusion = initialF4137;
				currentAtmosphere.fogIntensity = initialF4132;
				currentAtmosphere.ambientLight = initialF4138;
				currentAtmosphere.sunBrightness = initialF4139;
				sunDirection.x = initialYaw;
				sunDirection.y = initialPitch;
				skyIdSlider.setValue(initSkyId);
				un1Slider  .setValue(initUn1);
				un2Slider  .setValue(initUn2);
				un3Slider  .setValue(initUn3);
				un4Slider  .setValue(initUn4);
				resetCaches((byte)0);
				skyListener.stateChanged(new ChangeEvent(skyIdSlider));
				enqueueOnRenderThread(this::applyAtmosphereSettings);
			});

			combo.addActionListener(e -> {
				String key = (String)combo.getSelectedItem();
				EnvPreset p = presets.get(key);
				if (p == null) return;
				sR.setValue((p.sunColor>>16)&0xFF);
				sG.setValue((p.sunColor>>8)&0xFF);
				sB.setValue(p.sunColor&0xFF);
				sunHex.setText(String.format("#%02X%02X%02X",(p.sunColor>>16)&0xFF,(p.sunColor>>8)&0xFF,p.sunColor&0xFF));
				fR.setValue((p.fogColor>>16)&0xFF);
				fG.setValue((p.fogColor>>8)&0xFF);
				fB.setValue(p.fogColor&0xFF);
				fogHex.setText(String.format("#%02X%02X%02X",(p.fogColor>>16)&0xFF,(p.fogColor>>8)&0xFF,p.fogColor&0xFF));
				fogDist.setValue(p.fogFar);
				fl4130.setValue(Math.round(p.f4130*100));
				fl4131.setValue(Math.round(p.f4131*100));
				fl4137.setValue(Math.round(p.f4137*100));
				fl4132.setValue(Math.round(p.f4132*100));
				fl4138.setValue(Math.round(p.f4138*100));
				fl4139.setValue(Math.round(p.f4139*100));
				yawSlider.setValue(Math.round(p.sunYaw));
				pitchSlider.setValue(Math.round(p.sunPitch));
				overrideSunColor = p.sunColor;
				overrideFogColor = p.fogColor;
				overrideFogNear  = p.fogNear;
				overrideFogFar   = p.fogFar;
				customOverrideEnabled = true;
				enqueueOnRenderThread(this::applyAtmosphereSettings);
			});

			btnSave.addActionListener(e -> {
				String name = JOptionPane.showInputDialog(frame, "Preset name:", "Save Preset", JOptionPane.PLAIN_MESSAGE);
				if (name == null || name.trim().isEmpty()) return;
				name = name.trim();
				if (presets.containsKey(name)
				  && JOptionPane.showConfirmDialog(frame,
						"Overwrite \""+name+"\"?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
					return;
				EnvPreset p = new EnvPreset(
					name,
					overrideSunColor,
					overrideFogColor,
					overrideFogNear,
					overrideFogFar,
					0,
					fl4130.getValue()/100f,
					fl4131.getValue()/100f,
					fl4137.getValue()/100f,
					fl4132.getValue()/100f,
					fl4138.getValue()/100f,
					fl4139.getValue()/100f,
					yawSlider.getValue(),
					pitchSlider.getValue()
				);
				presets.put(name, p);
				savePresets();
				if (((DefaultComboBoxModel<String>)combo.getModel()).getIndexOf(name) == -1)
					combo.addItem(name);
				combo.setSelectedItem(name);
			});

			btnDelete.addActionListener(e -> {
				String key = (String)combo.getSelectedItem();
				if (key == null) return;
				if (JOptionPane.showConfirmDialog(frame,
					  "Delete preset \""+key+"\"?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					presets.remove(key);
					savePresets();
					combo.removeItem(key);
				}
			});

			btnExport.addActionListener(e -> {
				String key = (String) combo.getSelectedItem();
				if (key == null) return;
				EnvPreset p = presets.get(key);
				if (p == null) return;

				JFileChooser fc = new JFileChooser();
				FileNameExtensionFilter jsonFilter = new FileNameExtensionFilter("JSON files", "json");
				fc.setFileFilter(jsonFilter);
				fc.setAcceptAllFileFilterUsed(false);

				if (fc.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					if (!file.getName().toLowerCase().endsWith(".json")) { //must be json
						file = new File(file.getParentFile(), file.getName() + ".json");
					}
					try (Writer w = Files.newBufferedWriter(file.toPath())) {
						new ObjectMapper()
							.enable(SerializationFeature.INDENT_OUTPUT)
							.writeValue(w, p);
					} catch(IOException ex) {
						ex.printStackTrace();
					}
				}
			});

			btnImport.addActionListener(e -> {
				JFileChooser fc = new JFileChooser();
				FileNameExtensionFilter jsonFilter = new FileNameExtensionFilter("JSON files", "json");
				fc.setFileFilter(jsonFilter);
				fc.setAcceptAllFileFilterUsed(false);

				if (fc.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
					try {
						EnvPreset p = new ObjectMapper().readValue(fc.getSelectedFile(), EnvPreset.class);
						String name = p.name;
						if (presets.containsKey(name)
						  && JOptionPane.showConfirmDialog(frame,
								"Overwrite \"" + name + "\"?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
							return;
						presets.put(name, p);
						savePresets();
						if (((DefaultComboBoxModel<String>) combo.getModel()).getIndexOf(name) == -1)
							combo.addItem(name);
						combo.setSelectedItem(name);
					} catch(IOException ex) {
						ex.printStackTrace();
					}
				}
			});

			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		});
	}

	private JSlider makeFloatSlider(String label, float value, float min, float max, int steps, JPanel panel, String tooltip) {
		if (steps < 1) steps = 1;
		if (max < min) max = min + 1;
		final float step = (max - min) / steps;
		int sliderMin = 0;
		int sliderMax = steps;
		value = clamp(value, min, max);
		int sliderValue = Math.round((value - min) / step);
		sliderValue = clamp(sliderValue, sliderMin, sliderMax);
		JSlider slider = new JSlider(sliderMin, sliderMax, sliderValue);
		slider.setToolTipText(tooltip);
		JLabel lbl = new JLabel(label);
		lbl.setToolTipText(tooltip);
		panel.add(lbl);
		panel.add(slider);
		return slider;
	}

    private int clamp(int v, int min, int max) {
        return v < min ? min : (v > max ? max : v);
    }
	private float clamp(float val, float min, float max) {
		return Math.max(min, Math.min(max, val));
	}
	private double clamp(double val, double min, double max) {
		return Math.max(min, Math.min(max, val));
	}

	private void applyAtmosphereSettings() {
		boolean useOverride = editorActive && customOverrideEnabled;
		int sunColor = useOverride ? overrideSunColor : defaultColorSun;
		int fogColor = useOverride ? overrideFogColor : defaultColorFog;
		int fogNear = useOverride ? overrideFogNear  : defaultFogNear;
		int fogFar = useOverride ? overrideFogFar   : defaultFogFar;
		currentAtmosphere.sunColor = sunColor;
		currentAtmosphere.fogColor = fogColor;
		currentAtmosphere.fogNearDistance = fogNear;
		float rawYaw = sunDirection.x;
		float rawPitch = sunDirection.y;
		if (Float.isNaN(rawYaw) || Float.isInfinite(rawYaw))   rawYaw   = 0f;
		if (Float.isNaN(rawPitch) || Float.isInfinite(rawPitch)) rawPitch = 0f;
		float yawDeg = Math.max(-180f, Math.min(180f, rawYaw));
		float pitchDeg = Math.max(-45f, Math.min(45f,  rawPitch));
		float yawRad = (float) Math.toRadians(yawDeg);
		float pitchRad = (float) Math.toRadians(pitchDeg);
		float dist = 200.0f;
		float dirX = (float)(Math.cos(pitchRad) * Math.sin(yawRad)) * dist;
		float dirY = (float)(Math.sin(pitchRad)) * dist;
		float dirZ = (float)(Math.cos(pitchRad) * Math.cos(yawRad)) * dist;
		toolkit.IA((0.7f + GameClient.map.method2633(0)) * currentAtmosphere.sunIntensity);
		toolkit.m(sunColor, currentAtmosphere.shadowIntensity, currentAtmosphere.diffusion, dirX, dirY, dirZ);
		toolkit.c(fogColor, fogFar, 0);
		toolkit.method5095(currentAtmosphere.skyMaterial);
	}
}