/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Atmosphere {
	SceneObjectPosition sunDirection;
	float sunIntensity;
	float shadowIntensity;
	float fogIntensity;
	int sunColor;
	int fogColor;
	int fogNearDistance;
	EnvironmentMap skyMaterial;
	float diffusion;
	float ambientLight;
	float sunBrightness;
	Skybox model;
	public static GameClient gameClientInstance;
	static Class89 scriptCache;
	private int editorSunYaw; // horizontal sun direction
    private int editorSunPitch; // vertical sun direction
    private int editorSunColor; // sun color (0xRRGGBB)
    private int editorFogColor; // fog color (0xRRGGBB)
    private int editorFogNearDistance; // fog near distance
    private int editorFogFarDistance; // fog far distance

	public Atmosphere(Packet class298_sub53, AtmosphereManager atmosphereManager) {
		readFromPacket(class298_sub53, atmosphereManager, (short) 9475);
	}

	void method4704(Atmosphere atmosphere_0_, byte i) {
		try {
			((Atmosphere) this).sunColor = ((Atmosphere) atmosphere_0_).sunColor;
			((Atmosphere) this).sunIntensity = ((Atmosphere) atmosphere_0_).sunIntensity;
			((Atmosphere) this).shadowIntensity = ((Atmosphere) atmosphere_0_).shadowIntensity;
			((Atmosphere) this).diffusion = ((Atmosphere) atmosphere_0_).diffusion;
			((Atmosphere) this).sunDirection.method2013(((Atmosphere) atmosphere_0_).sunDirection);
			((Atmosphere) this).fogColor = ((Atmosphere) atmosphere_0_).fogColor;
			((Atmosphere) this).fogNearDistance = ((Atmosphere) atmosphere_0_).fogNearDistance;
			((Atmosphere) this).skyMaterial = ((Atmosphere) atmosphere_0_).skyMaterial;
			((Atmosphere) this).sunBrightness = ((Atmosphere) atmosphere_0_).sunBrightness;
			((Atmosphere) this).ambientLight = ((Atmosphere) atmosphere_0_).ambientLight;
			((Atmosphere) this).fogIntensity = ((Atmosphere) atmosphere_0_).fogIntensity;
			((Atmosphere) this).model = ((Atmosphere) atmosphere_0_).model;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.f(" + ')');
		}
	}

	void blendWith(GraphicsToolkit class_ra, Atmosphere atmosphere_1_, Atmosphere atmosphere_2_, float f, int i) {
		try {
			((Atmosphere) this).sunColor = BASType.method4215((-1951302757 * ((Atmosphere) atmosphere_1_).sunColor), (((Atmosphere) atmosphere_2_).sunColor * -1951302757), f * 255.0F, -394247366) * 743535251;
			((Atmosphere) this).shadowIntensity = (f * (((Atmosphere) atmosphere_2_).shadowIntensity - ((Atmosphere) atmosphere_1_).shadowIntensity) + ((Atmosphere) atmosphere_1_).shadowIntensity);
			((Atmosphere) this).diffusion = ((((Atmosphere) atmosphere_2_).diffusion - ((Atmosphere) atmosphere_1_).diffusion) * f + ((Atmosphere) atmosphere_1_).diffusion);
			((Atmosphere) this).sunIntensity = (f * (((Atmosphere) atmosphere_2_).sunIntensity - ((Atmosphere) atmosphere_1_).sunIntensity) + ((Atmosphere) atmosphere_1_).sunIntensity);
			((Atmosphere) this).fogIntensity = ((((Atmosphere) atmosphere_2_).fogIntensity - ((Atmosphere) atmosphere_1_).fogIntensity) * f + ((Atmosphere) atmosphere_1_).fogIntensity);
			((Atmosphere) this).sunBrightness = (((Atmosphere) atmosphere_1_).sunBrightness + f * (((Atmosphere) atmosphere_2_).sunBrightness - ((Atmosphere) atmosphere_1_).sunBrightness));
			((Atmosphere) this).ambientLight = (((Atmosphere) atmosphere_1_).ambientLight + f * (((Atmosphere) atmosphere_2_).ambientLight - ((Atmosphere) atmosphere_1_).ambientLight));
			((Atmosphere) this).fogColor = BASType.method4215((((Atmosphere) atmosphere_1_).fogColor * -1269717659), (-1269717659 * ((Atmosphere) atmosphere_2_).fogColor), f * 255.0F, 561967704) * -316996499;
			((Atmosphere) this).fogNearDistance = (1820271565 * (int) ((float) (((Atmosphere) atmosphere_1_).fogNearDistance * -1939701499) + f * (float) ((((Atmosphere) atmosphere_2_).fogNearDistance * -1939701499) - (((Atmosphere) atmosphere_1_).fogNearDistance) * -1939701499)));
			if (((Atmosphere) atmosphere_1_).skyMaterial != ((Atmosphere) atmosphere_2_).skyMaterial)
				((Atmosphere) this).skyMaterial = class_ra.method5179((((Atmosphere) atmosphere_1_).skyMaterial), (((Atmosphere) atmosphere_2_).skyMaterial), f, ((Atmosphere) this).skyMaterial);
			if (((Atmosphere) atmosphere_2_).model != ((Atmosphere) atmosphere_1_).model) {
				if (null == ((Atmosphere) atmosphere_1_).model) {
					((Atmosphere) this).model = ((Atmosphere) atmosphere_2_).model;
					if (((Atmosphere) this).model != null)
						((Atmosphere) this).model.method2583((int) (f * 255.0F), 0, -909735354);
				} else {
					((Atmosphere) this).model = ((Atmosphere) atmosphere_1_).model;
					if (((Atmosphere) this).model != null)
						((Atmosphere) this).model.method2583((int) (f * 255.0F), 255, 398258366);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.b(" + ')');
		}
	}

	public void readFromPacket(Packet class298_sub53, AtmosphereManager atmosphereManager, short i) {
		try {
			int i_3_ = class298_sub53.readUnsignedByte();
			if (GraphicsAutoSetup.clientPreferences.lightingPreference.getValue(-1934130167) == 1 && OverlayType.activeToolkit.method5048() > 0) {
				if (0 != (i_3_ & 0x1))
					((Atmosphere) this).sunColor = class298_sub53.readUnsignedInt() * 743535251;
				else
					((Atmosphere) this).sunColor = -980012211 * AtmosphereManager.DEFAULT_SUN_COLOR_GLOBAL;
				if ((i_3_ & 0x2) != 0)
					((Atmosphere) this).sunIntensity = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((Atmosphere) this).sunIntensity = 1.1523438F;
				if (0 != (i_3_ & 0x4))
					((Atmosphere) this).shadowIntensity = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((Atmosphere) this).shadowIntensity = 0.69921875F;
				if (0 != (i_3_ & 0x8))
					((Atmosphere) this).diffusion = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((Atmosphere) this).diffusion = 1.2F;
			} else {
				if ((i_3_ & 0x1) != 0)
					class298_sub53.readUnsignedInt();
				if ((i_3_ & 0x2) != 0)
					class298_sub53.readUnsignedShort();
				if ((i_3_ & 0x4) != 0)
					class298_sub53.readUnsignedShort();
				if ((i_3_ & 0x8) != 0)
					class298_sub53.readUnsignedShort();
				((Atmosphere) this).sunColor = AtmosphereManager.DEFAULT_SUN_COLOR_GLOBAL * -980012211;
				((Atmosphere) this).diffusion = 1.2F;
				((Atmosphere) this).shadowIntensity = 0.69921875F;
				((Atmosphere) this).sunIntensity = 1.1523438F;
			}
			if ((i_3_ & 0x10) != 0)
				((Atmosphere) this).sunDirection = SceneObjectPosition.method2004((float) class298_sub53.readShort(2126608204), (float) class298_sub53.readShort(1708860776), (float) class298_sub53.readShort(1771057202));
			else
				((Atmosphere) this).sunDirection = SceneObjectPosition.method2004(-50.0F, -60.0F, -50.0F);
			if ((i_3_ & 0x20) != 0)
				((Atmosphere) this).fogColor = class298_sub53.readUnsignedInt() * -316996499;
			else
				((Atmosphere) this).fogColor = AtmosphereManager.DEFAULT_FOG_COLOR_GLOBAL * 1359380751;
			if (0 != (i_3_ & 0x40))
				((Atmosphere) this).fogNearDistance = class298_sub53.readUnsignedShort() * 1820271565;
			else
				((Atmosphere) this).fogNearDistance = 0;
			if (0 != (i_3_ & 0x80)) {
				int i_4_ = class298_sub53.readUnsignedShort();
				int i_5_ = class298_sub53.readUnsignedShort();
				int i_6_ = class298_sub53.readUnsignedShort();
				int i_7_ = class298_sub53.readUnsignedShort();
				int i_8_ = class298_sub53.readUnsignedShort();
				int i_9_ = class298_sub53.readUnsignedShort();
				((Atmosphere) this).skyMaterial = atmosphereManager.createSkybox(i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, 257018874);
			} else
				((Atmosphere) this).skyMaterial = Class82_Sub12.defaultEnvironment;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.p(" + ')');
		}
	}

	public void copyFrom(Packet class298_sub53, int i) {
		try {
			((Atmosphere) this).sunBrightness = (float) (class298_sub53.readUnsignedByte() * 8) / 255.0F;
			((Atmosphere) this).ambientLight = (float) (class298_sub53.readUnsignedByte() * 8) / 255.0F;
			((Atmosphere) this).fogIntensity = ((float) (class298_sub53.readUnsignedByte() * 8) / 255.0F);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.i(" + ')');
		}
	}

	public Atmosphere() {
		resetToDefaults((byte) 115);
	}

	boolean equalsAtmosphere(Atmosphere atmosphere_10_, int i) {
		try {
			return ((-1951302757 * ((Atmosphere) atmosphere_10_).sunColor == ((Atmosphere) this).sunColor * -1951302757) && (((Atmosphere) this).sunIntensity == ((Atmosphere) atmosphere_10_).sunIntensity) && (((Atmosphere) atmosphere_10_).shadowIntensity == ((Atmosphere) this).shadowIntensity) && (((Atmosphere) atmosphere_10_).diffusion == ((Atmosphere) this).diffusion) && (((Atmosphere) atmosphere_10_).ambientLight == ((Atmosphere) this).ambientLight) && (((Atmosphere) this).sunBrightness == ((Atmosphere) atmosphere_10_).sunBrightness) && (((Atmosphere) atmosphere_10_).fogIntensity == ((Atmosphere) this).fogIntensity) && (-1269717659 * ((Atmosphere) this).fogColor == ((Atmosphere) atmosphere_10_).fogColor * -1269717659) && (((Atmosphere) atmosphere_10_).fogNearDistance * -1939701499 == ((Atmosphere) this).fogNearDistance * -1939701499) && (((Atmosphere) atmosphere_10_).skyMaterial == ((Atmosphere) this).skyMaterial) && (((Atmosphere) atmosphere_10_).model == ((Atmosphere) this).model));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.d(" + ')');
		}
	}

	public int getFogColor(int i) {
		try {
			return -1269717659 * ((Atmosphere) this).fogColor;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.u(" + ')');
		}
	}

	public Skybox getSkybox(byte i) {
		try {
			return ((Atmosphere) this).model;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.x(" + ')');
		}
	}

	void resetToDefaults(byte i) {
		try {
			((Atmosphere) this).sunColor = AtmosphereManager.DEFAULT_SUN_COLOR_GLOBAL * -980012211;
			((Atmosphere) this).sunDirection = SceneObjectPosition.method2004(-50.0F, -60.0F, -50.0F);
			((Atmosphere) this).sunIntensity = 1.1523438F;
			((Atmosphere) this).shadowIntensity = 0.69921875F;
			((Atmosphere) this).diffusion = 1.2F;
			((Atmosphere) this).fogColor = AtmosphereManager.DEFAULT_FOG_COLOR_GLOBAL * 1359380751;
			((Atmosphere) this).fogNearDistance = 0;
			((Atmosphere) this).skyMaterial = Class82_Sub12.defaultEnvironment;
			((Atmosphere) this).sunBrightness = 1.0F;
			((Atmosphere) this).ambientLight = 0.25F;
			((Atmosphere) this).fogIntensity = 1.0F;
			((Atmosphere) this).model = Class254.aSkybox_2789;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.a(" + ')');
		}
	}

	public void setSkybox(Packet class298_sub53, AtmosphereManager atmosphereManager, byte i) {
		try {
			int i_11_ = class298_sub53.readUnsignedShort();
			int i_12_ = class298_sub53.readShort(2107553233);
			int i_13_ = class298_sub53.readShort(1662518170);
			int i_14_ = class298_sub53.readShort(2045049677);
			int i_15_ = class298_sub53.readUnsignedShort();
			Class163.anInt1685 = 1827318333 * i_15_;
			((Atmosphere) this).model = atmosphereManager.createSkybox(i_11_, i_12_, i_13_, i_14_, (short) -3311);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.k(" + ')');
		}
	}

	static final void scriptOp_GetClientByte(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GameClient.aByte8959;
			if (GameClient.aByte8959 != -1)
				GameClient.aByte8959 = (byte) -6;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.abk(" + ')');
		}
	}

	public static void shutdownIcmpService(int i) {
		try {
			if (IcmpService_Sub1.anIcmpService_Sub1_8551 != null) {
				try {
					IcmpService_Sub1.anIcmpService_Sub1_8551.quit();
				} catch (Throwable throwable) {
					/* empty */
				}
				IcmpService_Sub1.anIcmpService_Sub1_8551 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.d(" + ')');
		}
	}

	static final void scriptOp_PopStack(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5241 -= 969361751;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.aj(" + ')');
		}
	}

	public static Class343_Sub1 getNextRegionLoader(byte i) {
		try {
			Class474.anInt5977 = 0;
			return Wall.method4537(-1079868050);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.i(" + ')');
		}
	}
}
