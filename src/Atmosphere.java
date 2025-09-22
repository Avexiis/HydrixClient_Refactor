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
			sunColor = atmosphere_0_.sunColor;
			sunIntensity = atmosphere_0_.sunIntensity;
			shadowIntensity = atmosphere_0_.shadowIntensity;
			diffusion = atmosphere_0_.diffusion;
			sunDirection.method2013(atmosphere_0_.sunDirection);
			fogColor = atmosphere_0_.fogColor;
			fogNearDistance = atmosphere_0_.fogNearDistance;
			skyMaterial = atmosphere_0_.skyMaterial;
			sunBrightness = atmosphere_0_.sunBrightness;
			ambientLight = atmosphere_0_.ambientLight;
			fogIntensity = atmosphere_0_.fogIntensity;
			model = atmosphere_0_.model;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.f(" + ')');
		}
	}

	void blendWith(GraphicsToolkit class_ra, Atmosphere atmosphere_1_, Atmosphere atmosphere_2_, float f, int i) {
		try {
			sunColor = BASType.method4215((-1951302757 * atmosphere_1_.sunColor), (atmosphere_2_.sunColor * -1951302757), f * 255.0F, -394247366) * 743535251;
			shadowIntensity = (f * (atmosphere_2_.shadowIntensity - atmosphere_1_.shadowIntensity) + atmosphere_1_.shadowIntensity);
			diffusion = ((atmosphere_2_.diffusion - atmosphere_1_.diffusion) * f + atmosphere_1_.diffusion);
			sunIntensity = (f * (atmosphere_2_.sunIntensity - atmosphere_1_.sunIntensity) + atmosphere_1_.sunIntensity);
			fogIntensity = ((atmosphere_2_.fogIntensity - atmosphere_1_.fogIntensity) * f + atmosphere_1_.fogIntensity);
			sunBrightness = (atmosphere_1_.sunBrightness + f * (atmosphere_2_.sunBrightness - atmosphere_1_.sunBrightness));
			ambientLight = (atmosphere_1_.ambientLight + f * (atmosphere_2_.ambientLight - atmosphere_1_.ambientLight));
			fogColor = BASType.method4215((atmosphere_1_.fogColor * -1269717659), (-1269717659 * atmosphere_2_.fogColor), f * 255.0F, 561967704) * -316996499;
			fogNearDistance = (1820271565 * (int) ((float) (atmosphere_1_.fogNearDistance * -1939701499) + f * (float) ((atmosphere_2_.fogNearDistance * -1939701499) - (atmosphere_1_.fogNearDistance) * -1939701499)));
			if (atmosphere_1_.skyMaterial != atmosphere_2_.skyMaterial)
				skyMaterial = class_ra.method5179((atmosphere_1_.skyMaterial), (atmosphere_2_.skyMaterial), f, skyMaterial);
			if (atmosphere_2_.model != atmosphere_1_.model) {
				if (null == atmosphere_1_.model) {
					model = atmosphere_2_.model;
					if (model != null)
						model.method2583((int) (f * 255.0F), 0, -909735354);
				} else {
					model = atmosphere_1_.model;
					if (model != null)
						model.method2583((int) (f * 255.0F), 255, 398258366);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.b(" + ')');
		}
	}

	public void readFromPacket(Packet class298_sub53, AtmosphereManager atmosphereManager, short i) {
		try {
			int i_3_ = class298_sub53.readUnsignedByte();
			if (GraphicsSetup.clientPreferences.lightingPreference.getValue(-1934130167) == 1 && OverlayType.activeToolkit.method5048() > 0) {
				if (0 != (i_3_ & 0x1))
					sunColor = class298_sub53.readUnsignedInt() * 743535251;
				else
					sunColor = -980012211 * AtmosphereManager.DEFAULT_SUN_COLOR_GLOBAL;
				if ((i_3_ & 0x2) != 0)
					sunIntensity = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					sunIntensity = 1.1523438F;
				if (0 != (i_3_ & 0x4))
					shadowIntensity = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					shadowIntensity = 0.69921875F;
				if (0 != (i_3_ & 0x8))
					diffusion = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					diffusion = 1.2F;
			} else {
				if ((i_3_ & 0x1) != 0)
					class298_sub53.readUnsignedInt();
				if ((i_3_ & 0x2) != 0)
					class298_sub53.readUnsignedShort();
				if ((i_3_ & 0x4) != 0)
					class298_sub53.readUnsignedShort();
				if ((i_3_ & 0x8) != 0)
					class298_sub53.readUnsignedShort();
				sunColor = AtmosphereManager.DEFAULT_SUN_COLOR_GLOBAL * -980012211;
				diffusion = 1.2F;
				shadowIntensity = 0.69921875F;
				sunIntensity = 1.1523438F;
			}
			if ((i_3_ & 0x10) != 0)
				sunDirection =
						SceneObjectPosition.method2004((float) class298_sub53.readShort(2126608204),
								(float) class298_sub53.readShort(1708860776),
								(float) class298_sub53.readShort(1771057202));
			else
				sunDirection = SceneObjectPosition.method2004(-50.0F, -60.0F, -50.0F);
			if ((i_3_ & 0x20) != 0)
				fogColor = class298_sub53.readUnsignedInt() * -316996499;
			else
				fogColor = AtmosphereManager.DEFAULT_FOG_COLOR_GLOBAL * 1359380751;
			if (0 != (i_3_ & 0x40))
				fogNearDistance = class298_sub53.readUnsignedShort() * 1820271565;
			else
				fogNearDistance = 0;
			if (0 != (i_3_ & 0x80)) {
				int i_4_ = class298_sub53.readUnsignedShort();
				int i_5_ = class298_sub53.readUnsignedShort();
				int i_6_ = class298_sub53.readUnsignedShort();
				int i_7_ = class298_sub53.readUnsignedShort();
				int i_8_ = class298_sub53.readUnsignedShort();
				int i_9_ = class298_sub53.readUnsignedShort();
				skyMaterial = atmosphereManager.createSkybox(i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, 257018874);
			} else
				skyMaterial = Class82_Sub12.defaultEnvironment;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.p(" + ')');
		}
	}

	public void copyFrom(Packet class298_sub53, int i) {
		try {
			sunBrightness = (float) (class298_sub53.readUnsignedByte() * 8) / 255.0F;
			ambientLight = (float) (class298_sub53.readUnsignedByte() * 8) / 255.0F;
			fogIntensity = ((float) (class298_sub53.readUnsignedByte() * 8) / 255.0F);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.i(" + ')');
		}
	}

	public Atmosphere() {
		resetToDefaults((byte) 115);
	}

	boolean equalsAtmosphere(Atmosphere atmosphere_10_, int i) {
		try {
			return ((
					-1951302757 * atmosphere_10_.sunColor == sunColor * -1951302757)
					&& (sunIntensity == atmosphere_10_.sunIntensity)
					&& (atmosphere_10_.shadowIntensity == shadowIntensity)
					&& (atmosphere_10_.diffusion == diffusion)
					&& (atmosphere_10_.ambientLight == ambientLight)
					&& (sunBrightness == atmosphere_10_.sunBrightness)
					&& (atmosphere_10_.fogIntensity == fogIntensity)
					&& (-1269717659 * fogColor == atmosphere_10_.fogColor * -1269717659)
					&& (atmosphere_10_.fogNearDistance * -1939701499 == fogNearDistance * -1939701499)
					&& (atmosphere_10_.skyMaterial == skyMaterial) && (atmosphere_10_.model == model));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.d(" + ')');
		}
	}

	public int getFogColor(int i) {
		try {
			return -1269717659 * fogColor;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.u(" + ')');
		}
	}

	public Skybox getSkybox(byte i) {
		try {
			return model;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.x(" + ')');
		}
	}

	void resetToDefaults(byte i) {
		try {
			sunColor = AtmosphereManager.DEFAULT_SUN_COLOR_GLOBAL * -980012211;
			sunDirection = SceneObjectPosition.method2004(-50.0F, -60.0F, -50.0F);
			sunIntensity = 1.1523438F;
			shadowIntensity = 0.69921875F;
			diffusion = 1.2F;
			fogColor = AtmosphereManager.DEFAULT_FOG_COLOR_GLOBAL * 1359380751;
			fogNearDistance = 0;
			skyMaterial = Class82_Sub12.defaultEnvironment;
			sunBrightness = 1.0F;
			ambientLight = 0.25F;
			fogIntensity = 1.0F;
			model = Class254.aSkybox_2789;
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
			model = atmosphereManager.createSkybox(i_11_, i_12_, i_13_, i_14_, (short) -3311);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pz.k(" + ')');
		}
	}

	static final void scriptOp_GetClientByte(ClientScript2 class403, int i) {
		try {
			class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = GameClient.aByte8959;
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
			class403.anInt5241 -= 969361751;
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
