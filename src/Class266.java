/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class266 {
	static Class266 aClass266_2845;
	public static Class266 aClass266_2846;
	public static Class266 LOAD_MAP_SCENE_NORMAL;
	public static Class266 aClass266_2848 = new Class266(false, false);
	static Class266 aClass266_2849;
	static Class266 aClass266_2850;
	boolean aBoolean2851;
	public static Class266 aClass266_2852;
	boolean allowDynamicMap;
	public static Class266 LOAD_MAP_SCENE_DYNAMIC;
	public static Js5 aClass243_2855;

	boolean allowDynamicMapScene(int i) {
		try {
			return ((Class266) this).allowDynamicMap;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lb.a(").append(')').toString());
		}
	}

	public boolean method2522(byte i) {
		try {
			return ((Class266) this).aBoolean2851;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lb.f(").append(')').toString());
		}
	}

	static {
		aClass266_2846 = new Class266(true, false);
		LOAD_MAP_SCENE_NORMAL = new Class266(false, false);
		LOAD_MAP_SCENE_DYNAMIC = new Class266(true, false);
		aClass266_2849 = new Class266(true, false);
		aClass266_2845 = new Class266(true, true);
		aClass266_2850 = new Class266(true, true);
		aClass266_2852 = new Class266(false, false);
	}

	Class266(boolean bool, boolean bool_0_) {
		((Class266) this).allowDynamicMap = bool;
		((Class266) this).aBoolean2851 = bool_0_;
	}

	public static AppletParam[] getAppletParams(int i) {
		try {
			return (new AppletParam[] { AppletParam.aAppletParam_2363, AppletParam.aAppletParam_2392, AppletParam.aAppletParam_2380, AppletParam.aAppletParam_2370, AppletParam.aAppletParam_2381, AppletParam.aAppletParam_2393, AppletParam.aAppletParam_2384, AppletParam.aAppletParam_2364, AppletParam.aAppletParam_2376, AppletParam.aAppletParam_2387, AppletParam.aAppletParam_2390, AppletParam.aAppletParam_2388, AppletParam.aAppletParam_2372, AppletParam.aAppletParam_2365, AppletParam.aAppletParam_2389, AppletParam.aAppletParam_2366, AppletParam.aAppletParam_2368, AppletParam.aAppletParam_2378, AppletParam.aAppletParam_2377, AppletParam.aAppletParam_2385, AppletParam.aAppletParam_2375, AppletParam.aAppletParam_2394, AppletParam.aAppletParam_2391, AppletParam.aAppletParam_2371, AppletParam.aAppletParam_2374, AppletParam.aAppletParam_2369, AppletParam.aAppletParam_2383, AppletParam.aAppletParam_2373, AppletParam.aAppletParam_2386, AppletParam.aAppletParam_2382, AppletParam.aAppletParam_2379, AppletParam.aAppletParam_2367});
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lb.a(").append(')').toString());
		}
	}

	public static Class128 method2524(Packet class298_sub53, byte i) {
		try {
			Class128 class128 = SpotAnimation.method608(class298_sub53, -2082890426);
			int i_1_ = class298_sub53.gSmart2or4n();
			int i_2_ = class298_sub53.gSmart2or4n();
			int i_3_ = class298_sub53.gSmart2or4n();
			int i_4_ = class298_sub53.gSmart2or4n();
			int i_5_ = class298_sub53.gSmart2or4n();
			int i_6_ = class298_sub53.gSmart2or4n();
			return new Class128_Sub3(class128.aClass139_6322, class128.aClass133_6323, -39975161 * class128.anInt6327, class128.anInt6325 * 1886882435, class128.anInt6326 * -944287579, class128.anInt6330 * -1387457793, -684094775 * class128.anInt6328, class128.anInt6329 * 955568089, class128.anInt6324 * 782326281, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lb.i(").append(')').toString());
		}
	}

	static final int method2525(Entity class365_sub1_sub1_sub2, int i) {
		try {
			if (0 == 907865649 * class365_sub1_sub1_sub2.anInt10115)
				return 0;
			if (class365_sub1_sub1_sub2.anInt10090 * 1433412323 != -1) {
				Entity class365_sub1_sub1_sub2_7_ = null;
				if (class365_sub1_sub1_sub2.anInt10090 * 1433412323 < 32768) {
					LinkableObject linkableObject = ((LinkableObject) (GameClient.npcs.get((long) (1433412323 * class365_sub1_sub1_sub2.anInt10090))));
					if (linkableObject != null)
						class365_sub1_sub1_sub2_7_ = ((Entity) linkableObject.anObject7366);
				} else if (class365_sub1_sub1_sub2.anInt10090 * 1433412323 >= 32768)
					class365_sub1_sub1_sub2_7_ = (GameClient.players[(1433412323 * class365_sub1_sub1_sub2.anInt10090 - 32768)]);
				if (class365_sub1_sub1_sub2_7_ != null) {
					SceneObjectPosition sceneObjectPosition = SceneObjectPosition.method2011(class365_sub1_sub1_sub2.method4337().aSceneObjectPosition_2599, (class365_sub1_sub1_sub2_7_.method4337().aSceneObjectPosition_2599));
					int i_8_ = (int) sceneObjectPosition.x;
					int i_9_ = (int) sceneObjectPosition.z;
					if (i_8_ != 0 || 0 != i_9_)
						class365_sub1_sub1_sub2.method4414((int) (Math.atan2((double) i_8_, (double) i_9_) * 2607.5945876176133) & 0x3fff, (byte) 1);
				}
			}
			if (class365_sub1_sub1_sub2 instanceof Player) {
				Player class365_sub1_sub1_sub2_sub2 = (Player) class365_sub1_sub1_sub2;
				if (-1 != class365_sub1_sub1_sub2_sub2.chatIcon * 1208589843 && (0 == (class365_sub1_sub1_sub2_sub2.moveQueueSize * 2050671733) || (-1531994851 * class365_sub1_sub1_sub2_sub2.anInt10124) > 0)) {
					class365_sub1_sub1_sub2_sub2.method4414(1208589843 * class365_sub1_sub1_sub2_sub2.chatIcon, (byte) 1);
					class365_sub1_sub1_sub2_sub2.chatIcon = 1530078181;
				}
			} else if (class365_sub1_sub1_sub2 instanceof NPC) {
				NPC class365_sub1_sub1_sub2_sub1 = (NPC) class365_sub1_sub1_sub2;
				if (-1 != class365_sub1_sub1_sub2_sub1.anInt10179 * 579792529 && ((class365_sub1_sub1_sub2_sub1.moveQueueSize * 2050671733 == 0) || (-1531994851 * class365_sub1_sub1_sub2_sub1.anInt10124) > 0)) {
					SceneObjectPosition sceneObjectPosition = (class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599);
					WorldTile worldTile = GameClient.map.getRegionStart(681479919);
					int i_10_ = ((int) sceneObjectPosition.x - ((class365_sub1_sub1_sub2_sub1.anInt10179 * -1896967936) - 263081728 * worldTile.x - 263081728 * worldTile.x));
					int i_11_ = ((int) sceneObjectPosition.z - ((893346048 * class365_sub1_sub1_sub2_sub1.anInt10180) - worldTile.y * -434703616 - worldTile.y * -434703616));
					if (0 != i_10_ || i_11_ != 0)
						class365_sub1_sub1_sub2_sub1.method4414((int) (Math.atan2((double) i_10_, (double) i_11_) * 2607.5945876176133) & 0x3fff, (byte) 1);
					class365_sub1_sub1_sub2_sub1.anInt10179 = -1312461425;
				}
			}
			return class365_sub1_sub1_sub2.method4450((short) 6752);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lb.ha(").append(')').toString());
		}
	}

	static void method2526(GraphicsToolkit class_ra, LinkedNodeList linkedNodeList, int i, int i_12_, int i_13_) {
		try {
			DiskFile.aLinkedNodeList_5986.method5943((byte) 1);
			if (!Class301_Sub1.aBoolean7635) {
				for (WorldMapArea worldMapArea = (WorldMapArea) linkedNodeList.method5939(1766612795); worldMapArea != null; worldMapArea = (WorldMapArea) linkedNodeList.method5944(49146)) {
					WorldMapLabel worldMapLabel = (Class301_Sub1.aWorldMapLabelList_3251.method4116(-530122905 * worldMapArea.mapAreaId, -1838109089));
					if (!VolumePreference.method5728(worldMapLabel, 1541069402)) {
						if (i_13_ <= -4851154) {
							/* empty */
						}
					} else {
						boolean bool = AnimationController.method4726(class_ra, worldMapArea, worldMapLabel, i, i_12_, -1417215477);
						if (bool)
							Class368.method4556(class_ra, worldMapArea, worldMapLabel, 1387394029);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lb.bh(").append(')').toString());
		}
	}

	static final void method2527(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = EnvironmentMap.anInt666 * -1972322437;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lb.amk(").append(')').toString());
		}
	}
}
