import java.util.Iterator;

public class GameMap {
	Class240_Sub1 aClass240_Sub1_3000;
	Class266 aClass266_3001;
	byte[][] aByteArrayArray3002;
	Class115 aClass115_3003;
	Class266 aClass266_3004;
	MapKeys aMapKeys_3005;
	WorldTile aWorldTile_3006 = new WorldTile();
	WorldTile aWorldTile_3007 = new WorldTile();
	public boolean aBoolean3008;
	int anInt3009;
	int[] anIntArray3010;
	int anInt3011;
	TileFlags aTileFlags_3012;
	AtmosphereManager aAtmosphereManager_3013;
	byte[][] locsData;
	int anInt3015;
	int zFar;
	MapDetails aMapDetails_3017;
	boolean aBoolean3018;
	Class287 aClass287_3019 = new Class287(0, 0, 0, 0);
	float aFloat3020;
	int anInt3021;
	Region[] SCENE_CLIP_DATA_PLANES = new Region[4];
	int[][] anIntArrayArray3023;
	int anInt3024;
	Class273 aClass273_3025;
	int[][] anIntArrayArray3026;
	int anInt3027 = 0;
	int anInt3028 = 255626399;
	Class240_Sub1 aClass240_Sub1_3029;
	int anInt3030;
	int[] anIntArray3031;
	byte[][][] aByteArrayArrayArray3032;
	int[] anIntArray3033;
	int[] anIntArray3034;
	int[] anIntArray3035;
	int[] anIntArray3036;
	SceneGraph aSceneGraph_3037;
	byte[][] aByteArrayArray3038;
	int anInt3039;
	ObjectTypeList aClass433_3040;
	byte[][] aByteArrayArray3041;
	int[][] anIntArrayArray3042;
	int[][][] anIntArrayArrayArray3043;
	byte[][] aByteArrayArray3044;
	public long aLong3045;

	public Class273 method2627(byte i) {
		try {
			return aClass273_3025;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.f(").append(')').toString());
		}
	}

	public WorldTile getRegionStart(int i) {
		try {
			return aWorldTile_3006;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.i(").append(')').toString());
		}
	}

	public int upperX(int i) {
		try {
			return anInt3039 * -991330803;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.k(").append(')').toString());
		}
	}

	public int upperY(int i) {
		try {
			return anInt3011 * -1456212765;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.d(").append(')').toString());
		}
	}

	public MapKeys method2631(int i) {
		try {
			return aMapKeys_3005;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.u(").append(')').toString());
		}
	}

	public Class287 method2632(int i) {
		try {
			return aClass287_3019;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.x(").append(')').toString());
		}
	}

	public float method2633(int i) {
		try {
			return aFloat3020;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.r(").append(')').toString());
		}
	}

	public int method2634(byte i) {
		try {
			return anInt3015 * -2091897981;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.q(").append(')').toString());
		}
	}

	public int method2635(int i) {
		try {
			return 2073578817 * zFar;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.n(").append(')').toString());
		}
	}

	void method2636(Class240_Sub1 class240_sub1, byte[][] datas, byte i) {
		try {
			for (int i_0_ = 0; i_0_ < 1551623871 * class240_sub1.planesHeight; i_0_++) {
				if (!aBoolean3018) {
					Class247.method2365(-286862514);
				}
				for (int i_1_ = 0; i_1_ < -991330803 * anInt3039 >> 3; i_1_++) {
					for (int i_2_ = 0; i_2_ < anInt3011 * -1456212765 >> 3; i_2_++) {
						int i_3_ = anIntArrayArrayArray3043[i_0_][i_1_][i_2_];
						if (-1 != i_3_) {
							int i_4_ = i_3_ >> 24 & 0x3;
							if (!class240_sub1.isUnderwater || i_4_ == 0) {
								int i_5_ = i_3_ >> 1 & 0x3;
								int i_6_ = i_3_ >> 14 & 0x3ff;
								int i_7_ = i_3_ >> 3 & 0x7ff;
								int i_8_ = i_7_ / 8 + (i_6_ / 8 << 8);
								for (int i_9_ = 0; i_9_ < anIntArray3031.length; i_9_++) {
									if (i_8_ == anIntArray3031[i_9_] && null != datas[i_9_]) {
										byte[] data = datas[i_9_];
										boolean osrs = data[0] == 'O' && data[1] == 'S' && data[2] == 'R' && data[3] == 'S';
										Packet buffer = new Packet(data);
										if (osrs) {
											buffer.readUnsignedInt();
										}
										class240_sub1.deserialize_region(buffer, i_0_, i_1_ * 8, i_2_ * 8, i_4_, i_6_, i_7_, i_5_, SCENE_CLIP_DATA_PLANES, osrs);
										class240_sub1.method2236(OverlayType.activeToolkit, buffer, i_0_, 8 * i_1_, 8 * i_2_, i_4_, i_6_, i_7_, i_5_, -2145736118);
										break;
									}
								}
							}
						}
					}
				}
			}
			for (int i_10_ = 0; i_10_ < 1551623871 * class240_sub1.planesHeight; i_10_++) {
				if (!aBoolean3018) {
					Class247.method2365(788826930);
				}
				for (int i_11_ = 0; i_11_ < -991330803 * anInt3039 >> 3; i_11_++) {
					for (int i_12_ = 0; i_12_ < anInt3011 * -1456212765 >> 3; i_12_++) {
						int i_13_ = anIntArrayArrayArray3043[i_10_][i_11_][i_12_];
						if (-1 == i_13_) {// XXX
							class240_sub1.calculateMapHeights(i_10_, 8 * i_11_, 8 * i_12_, 8, 8);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.aq(").append(')').toString());
		}
	}

	public byte[][] method2637(int i, int i_14_) {
		try {
			if (null != aClass240_Sub1_3029 && aClass240_Sub1_3029.aByteArrayArrayArray2631 != null && aClass240_Sub1_3029.aByteArrayArrayArray2631[i] != null) {
				return aClass240_Sub1_3029.aByteArrayArrayArray2631[i];
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.z(").append(')').toString());
		}
	}

	public int[][] method2638(int i) {
		try {
			return anIntArrayArray3026;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.e(").append(')').toString());
		}
	}

	public Region getSceneClipDataPlane(int i) {
		try {
			return SCENE_CLIP_DATA_PLANES[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.t(").append(')').toString());
		}
	}

	public AtmosphereManager method2640(byte i) {
		try {
			return aAtmosphereManager_3013;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.h(").append(')').toString());
		}
	}

	public ObjectTypeList method2641(int i) {
		try {
			return aClass433_3040;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.v(").append(')').toString());
		}
	}

	public byte[][][] method2642(int i) {
		try {
			return aByteArrayArrayArray3032;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.c(").append(')').toString());
		}
	}

	public void method2643(byte[][][] is, int i) {
		try {
			aByteArrayArrayArray3032 = is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.m(").append(')').toString());
		}
	}

	public Class240_Sub1 method2644(int i) {
		try {
			return aClass240_Sub1_3029;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.w(").append(')').toString());
		}
	}

	public void method2645(ObjectTypeList class433, int i) {
		try {
			aClass433_3040 = class433;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.j(").append(')').toString());
		}
	}

	public void method2646(byte i) {
		try {
			if (null != aSceneGraph_3037) {
				EnvironmentMap.method764((byte) 1);
				aSceneGraph_3037.aClass324_3528.method3956(-1174492425);
				aSceneGraph_3037 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.l(").append(')').toString());
		}
	}

	public void method2647(int i) {
		try {
			aAtmosphereManager_3013 = new AtmosphereManager(OverlayType.activeToolkit, -991330803 * anInt3039 >> 3, anInt3011 * -1456212765 >> 3);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.aa(").append(')').toString());
		}
	}

	public void method2648(int i) {
		try {
			anInt3015 = -896386664;
			zFar = (int) (34.46 * (-991330803 * anInt3039)) * -2038218047; //zFar renamed from anInt3016
			zFar = (2073578817 * zFar << 2) * -2038218047;
			if (OverlayType.activeToolkit.method4998()) {
				zFar += Loader.EXTRA_DRAW_DISTANCE * 4 * 109412864; //no more fog bubble
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ak(").append(')').toString());
		}
	}

	void method2649(byte i) {
		try {
			if (aClass266_3001 != Class266.aClass266_2846 && Class266.aClass266_2846 != aClass266_3004) {
				if (aClass266_3001 == Class266.LOAD_MAP_SCENE_DYNAMIC || aClass266_3001 == Class266.aClass266_2845 || aClass266_3004 != aClass266_3001 && (Class266.LOAD_MAP_SCENE_NORMAL == aClass266_3001 || aClass266_3004 == Class266.LOAD_MAP_SCENE_NORMAL)) {
					GameClient.npcCount = 0;
					GameClient.anInt8772 = 0;
					GameClient.npcs.method5811((byte) -6);
				}
				aClass266_3004 = aClass266_3001;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.as(").append(')').toString());
		}
	}

	public void sendMapScene(Class267 class267, int i) {
		try {
			aClass266_3001 = class267.aClass266_2857;
			if (aClass266_3001 == Class266.aClass266_2848) {
				method2651(-1676557011);
			} else if (aClass266_3001 == Class266.LOAD_MAP_SCENE_NORMAL) {
				loadMapSceneNormal(class267.aClass298_Sub53_Sub2_2856, -444215668);
			} else if (aClass266_3001 == Class266.aClass266_2846) {
				method2665((byte) -112);
			} else if (aClass266_3001.allowDynamicMapScene(-1578454249)) {
				// maps
				loadMapSceneDynamic(class267.aClass298_Sub53_Sub2_2856, 1483918042);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ad(").append(')').toString());
		}
	}

	void method2651(int i) {
		try {
			method2655(Class94.method1020(GraphicsAutoSetup.clientPreferences.aMapSizePreference_7558.method5667(-369768513), 2010588610), 226677224);
			int i_16_ = aWorldTile_3006.x * -1760580017;
			int i_17_ = aWorldTile_3006.y * 283514611;
			int i_18_ = (Class367.anInt4000 * -1740717447 >> 12) + (i_16_ >> 3);
			int i_19_ = (i_17_ >> 3) + (-299812095 * Class146.anInt1575 >> 12);
			Class287.myPlayer.plane = (byte) 0;
			Class99.anInt952 = 0;
			Class287.myPlayer.method4472(8, 8, -1960083958);
			int i_20_ = 18;
			anIntArrayArray3042 = new int[i_20_][4];
			anIntArray3031 = new int[i_20_];
			anIntArray3010 = new int[i_20_];
			anIntArray3033 = new int[i_20_];
			anIntArray3034 = new int[i_20_];
			aByteArrayArray3038 = new byte[i_20_][];
			locsData = new byte[i_20_][];
			aByteArrayArray3044 = new byte[i_20_][];
			anIntArray3035 = new int[i_20_];
			anIntArray3036 = new int[i_20_];
			aByteArrayArray3041 = new byte[i_20_][];
			aByteArrayArray3002 = new byte[i_20_][];
			i_20_ = 0;
			for (int i_21_ = (i_18_ - (anInt3039 * -991330803 >> 4)) / 8; i_21_ <= ((-991330803 * anInt3039 >> 4) + i_18_) / 8; i_21_++) {
				for (int i_22_ = (i_19_ - (anInt3011 * -1456212765 >> 4)) / 8; i_22_ <= ((-1456212765 * anInt3011 >> 4) + i_19_) / 8; i_22_++) {
					int i_23_ = (i_21_ << 8) + i_22_;
					anIntArray3031[i_20_] = i_23_;
					anIntArray3010[i_20_] = Class65.aClass243_665.getArchiveIdByName(method2669(true, false, i_21_, i_22_, (byte) -40), -2024507927);
					anIntArray3033[i_20_] = Class65.aClass243_665.getArchiveIdByName(method2669(false, false, i_21_, i_22_, (byte) 85), -1204727759);
					anIntArray3034[i_20_] = Class65.aClass243_665.getArchiveIdByName(new StringBuilder().append("n").append(i_21_).append('_').append(i_22_).toString(), -386533519);
					anIntArray3035[i_20_] = Class65.aClass243_665.getArchiveIdByName(method2669(true, true, i_21_, i_22_, (byte) -47), -1725557270);
					anIntArray3036[i_20_] = Class65.aClass243_665.getArchiveIdByName(method2669(false, true, i_21_, i_22_, (byte) -30), -1962303314);
					if (anIntArray3034[i_20_] == -1) {
						anIntArray3010[i_20_] = -1;
						anIntArray3033[i_20_] = -1;
						anIntArray3035[i_20_] = -1;
						anIntArray3036[i_20_] = -1;
					}
					i_20_++;
				}
			}
			for (int i_24_ = i_20_; i_24_ < anIntArray3034.length; i_24_++) {
				anIntArray3034[i_24_] = -1;
				anIntArray3010[i_24_] = -1;
				anIntArray3033[i_24_] = -1;
				anIntArray3035[i_24_] = -1;
				anIntArray3036[i_24_] = -1;
			}
			int i_25_;
			if (GameClient.anInt8752 * -1233866115 == 19) {
				i_25_ = 1;
			} else if (18 == -1233866115 * GameClient.anInt8752) {
				i_25_ = 16;
			} else if (14 == GameClient.anInt8752 * -1233866115) {
				i_25_ = 15;
			} else if (GameClient.anInt8752 * -1233866115 == 8) {
				i_25_ = 9;
			} else {
				throw new RuntimeException(new StringBuilder().append("").append(-1233866115 * GameClient.anInt8752).toString());
			}
			method2657(i_18_, i_19_, i_25_, false, -815771659);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.av(").append(')').toString());
		}
	}

	void loadMapSceneNormal(RsBitsBuffer class298_sub53_sub2, int i) {
		try {
			int mapSize = class298_sub53_sub2.readUnsignedByteC((short) -9830);
			boolean forceRefresh = class298_sub53_sub2.readUnsignedByte() == 1;
			int chunkX = class298_sub53_sub2.readUnsignedShort();
			int chunkY = class298_sub53_sub2.readUnsignedShort();
			if (!aBoolean3018) {
				method2649((byte) 38);
			}
			method2655(Class94.method1020(mapSize, -1114771755), 226677224);
			int i_29_ = (class298_sub53_sub2.payload.length - class298_sub53_sub2.pos * 385051775) / 16;
			anIntArrayArray3042 = new int[i_29_][4];
			for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
				for (int i_31_ = 0; i_31_ < 4; i_31_++) {
					anIntArrayArray3042[i_30_][i_31_] = class298_sub53_sub2.readUnsignedInt();
				}
			}
			anIntArray3031 = new int[i_29_];
			anIntArray3010 = new int[i_29_];
			anIntArray3033 = new int[i_29_];
			anIntArray3034 = null;
			aByteArrayArray3038 = new byte[i_29_][];
			locsData = new byte[i_29_][];
			aByteArrayArray3044 = null;
			anIntArray3035 = new int[i_29_];
			anIntArray3036 = new int[i_29_];
			aByteArrayArray3041 = new byte[i_29_][];
			aByteArrayArray3002 = new byte[i_29_][];
			i_29_ = 0;
			for (int i_32_ = (chunkX - (anInt3039 * -991330803 >> 4)) / 8; i_32_ <= (chunkX + (anInt3039 * -991330803 >> 4)) / 8; i_32_++) {
				for (int i_33_ = (chunkY - (-1456212765 * anInt3011 >> 4)) / 8; i_33_ <= ((anInt3011 * -1456212765 >> 4) + chunkY) / 8; i_33_++) {
					anIntArray3031[i_29_] = i_33_ + (i_32_ << 8);
					anIntArray3010[i_29_] = Class65.aClass243_665.getArchiveIdByName(method2669(true, false, i_32_, i_33_, (byte) -113), -317623107);
					anIntArray3033[i_29_] = Class65.aClass243_665.getArchiveIdByName(method2669(false, false, i_32_, i_33_, (byte) -82), -1013661811);
					anIntArray3035[i_29_] = Class65.aClass243_665.getArchiveIdByName(method2669(true, true, i_32_, i_33_, (byte) -99), -1834537704);
					anIntArray3036[i_29_] = Class65.aClass243_665.getArchiveIdByName(method2669(false, true, i_32_, i_33_, (byte) -80), -1244616261);
					i_29_++;
				}
			}
			method2657(chunkX, chunkY, 17, forceRefresh, -815771659);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.at(").append(')').toString());
		}
	}

	void loadMapSceneDynamic(RsBitsBuffer stream, int i) {
		try {
			int loadType = stream.readUnsigned128Byte((byte) 93);
			if (1 == loadType) {
				aClass266_3001 = Class266.LOAD_MAP_SCENE_DYNAMIC;
			} else if (2 == loadType) {
				aClass266_3001 = Class266.aClass266_2849;
			} else if (loadType == 3) {
				aClass266_3001 = Class266.aClass266_2845;
			} else if (4 == loadType) {
				aClass266_3001 = Class266.aClass266_2850;
			}
			int chunkY = stream.readUnsignedShortLE((byte) -29);
			int chunkX = stream.readUnsignedShortLE128(1478539457);
			int forceRefreshMask = stream.readUnsigned128Byte((byte) 19);
			boolean forceRefresh = (forceRefreshMask & 0x1) != 0;
			int mapSize = stream.readUnsignedByteC((short) -21481);
			if (!aBoolean3018) {
				method2649((byte) 124);
			}
			method2655(Class94.method1020(mapSize, 1925270996), 226677224);
			stream.initBitAccess(-1836176958);
			for (int i_39_ = 0; i_39_ < 4; i_39_++) {
				for (int i_40_ = 0; i_40_ < -991330803 * anInt3039 >> 3; i_40_++) {
					for (int i_41_ = 0; i_41_ < -1456212765 * anInt3011 >> 3; i_41_++) {
						int i_42_ = stream.readBits(1);
						if (1 == i_42_) {
							anIntArrayArrayArray3043[i_39_][i_40_][i_41_] = stream.readBits(26);
						} else {
							anIntArrayArrayArray3043[i_39_][i_40_][i_41_] = -1;
						}
					}
				}
			}
			stream.finishBitAccess((byte) 65);
			int i_43_ = (stream.payload.length - stream.pos * 385051775) / 16;
			anIntArrayArray3042 = new int[i_43_][4];
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
				for (int i_45_ = 0; i_45_ < 4; i_45_++) {
					anIntArrayArray3042[i_44_][i_45_] = stream.readUnsignedInt();
				}
			}
			anIntArray3031 = new int[i_43_];
			anIntArray3010 = new int[i_43_];
			anIntArray3033 = new int[i_43_];
			anIntArray3034 = null;
			aByteArrayArray3038 = new byte[i_43_][];
			locsData = new byte[i_43_][];
			aByteArrayArray3044 = null;
			anIntArray3035 = new int[i_43_];
			anIntArray3036 = new int[i_43_];
			aByteArrayArray3041 = new byte[i_43_][];
			aByteArrayArray3002 = new byte[i_43_][];
			i_43_ = 0;
			for (int i_46_ = 0; i_46_ < 4; i_46_++) {
				for (int i_47_ = 0; i_47_ < -991330803 * anInt3039 >> 3; i_47_++) {
					for (int i_48_ = 0; i_48_ < -1456212765 * anInt3011 >> 3; i_48_++) {
						int i_49_ = anIntArrayArrayArray3043[i_46_][i_47_][i_48_];
						if (i_49_ != -1) {
							int i_50_ = i_49_ >> 14 & 0x3ff;
							int i_51_ = i_49_ >> 3 & 0x7ff;
							int i_52_ = (i_50_ / 8 << 8) + i_51_ / 8;
							for (int i_53_ = 0; i_53_ < i_43_; i_53_++) {
								if (i_52_ == anIntArray3031[i_53_]) {
									i_52_ = -1;
									break;
								}
							}
							if (-1 != i_52_) {
								anIntArray3031[i_43_] = i_52_;
								int i_54_ = i_52_ >> 8 & 0xff;
								int i_55_ = i_52_ & 0xff;
								anIntArray3010[i_43_] = Class65.aClass243_665.getArchiveIdByName(method2669(true, false, i_54_, i_55_, (byte) -94), -976709735);
								anIntArray3033[i_43_] = Class65.aClass243_665.getArchiveIdByName(method2669(false, false, i_54_, i_55_, (byte) -94), -666597667);
								anIntArray3035[i_43_] = Class65.aClass243_665.getArchiveIdByName(method2669(true, true, i_54_, i_55_, (byte) 105), -1176293113);
								anIntArray3036[i_43_] = Class65.aClass243_665.getArchiveIdByName(method2669(false, true, i_54_, i_55_, (byte) 23), -1142086956);
								i_43_++;
							}
						}
					}
				}
			}
			method2657(chunkX, chunkY, 17, forceRefresh, -815771659);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ah(").append(')').toString());
		}
	}

	public TileFlags method2654(int i) {
		try {
			return aTileFlags_3012;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.y(").append(')').toString());
		}
	}

	void method2655(Class115 class115, int i) {
		try {
			if (class115 != aClass115_3003) {
				anInt3039 = (anInt3011 = class115.anInt1382 * 723673737) * -116821329;
				anIntArrayArrayArray3043 = new int[4][-991330803 * anInt3039 >> 3][-1456212765 * anInt3011 >> 3];
				anIntArrayArray3023 = new int[anInt3039 * -991330803][-1456212765 * anInt3011];
				anIntArrayArray3026 = new int[-991330803 * anInt3039][-1456212765 * anInt3011];
				for (int i_56_ = 0; i_56_ < 4; i_56_++) {
					SCENE_CLIP_DATA_PLANES[i_56_] = Class16.method354(-991330803 * anInt3039, anInt3011 * -1456212765, -617039163);
				}
				aByteArrayArrayArray3032 = new byte[4][-991330803 * anInt3039][anInt3011 * -1456212765];
				aTileFlags_3012 = new TileFlags(4, -991330803 * anInt3039, anInt3011 * -1456212765);
				method2647(-1528485886);
				aClass115_3003 = class115;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.az(").append(')').toString());
		}
	}

	public int[][] method2656(byte i) {
		try {
			return anIntArrayArray3023;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.g(").append(')').toString());
		}
	}

	void method2657(int i, int i_57_, int i_58_, boolean bool, int i_59_) {
		try {
			if (1596783995 * GameClient.cutsceneStage == 2) {
				if (aBoolean3018) {
					throw new IllegalStateException();
				}
				GameClient.cutsceneStage = -1334571751;
				GameClient.anInt8870 = -221729505;
			}
			if (bool || anInt3030 * 19679283 != i || i_57_ != anInt3009 * 306966675) {
				anInt3030 = i * -1135086853;
				anInt3009 = i_57_ * -1928942181;
				if (!aBoolean3018) {
					Class439.method5851(i_58_, 430070283);
					Class139.method1548(LocalizedString.MESSAGE_LOADING_PLEASE_WAIT.getText(Class321.ACTIVE_LANGUAGE, -875414210), true, OverlayType.activeToolkit, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) 103);
				}
				if (aWorldTile_3006 != null) {
					aWorldTile_3007 = aWorldTile_3006;
				} else {
					aWorldTile_3007 = new WorldTile(0, 0, 0);
				}
				aWorldTile_3006 = new WorldTile(0, 8 * (anInt3030 * 19679283 - (-991330803 * anInt3039 >> 4)), 8 * (306966675 * anInt3009 - (anInt3011 * -1456212765 >> 4)));
				aMapDetails_3017 = WorldMap.method3708(-1760580017 * aWorldTile_3006.x, aWorldTile_3006.y * 283514611);
				aMapKeys_3005 = null;
				if (!aBoolean3018) {
					method2663(i_58_, 1177231331);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ap(").append(')').toString());
		}
	}

	public GameMap(boolean bool) {
		anInt3021 = 0;
		anInt3024 = -861507225;
		aBoolean3008 = false;
		aBoolean3018 = bool;
	}

	void method2658(int i, byte i_60_) {
		try {
			try {
				Thread.sleep(i);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.aj(").append(')').toString());
		}
	}

	void method2659(Class240_Sub1 class240_sub1, byte[][] is) {
		int i_61_ = is.length;
		for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
			byte[] data = is[i_62_];
			if (null != data) {
				boolean osrs = data[0] == 'O' && data[1] == 'S' && data[2] == 'R' && data[3] == 'S';
				Packet buffer = new Packet(data);
				if (osrs) {
					buffer.readUnsignedInt();
				}
				int i_64_ = anIntArray3031[i_62_] >> 8;
				int i_65_ = anIntArray3031[i_62_] & 0xff;
				int i_66_ = 64 * i_64_ - aWorldTile_3006.x * -1760580017;
				int i_67_ = 64 * i_65_ - 283514611 * aWorldTile_3006.y;
				if (!aBoolean3018) {
					Class247.method2365(408539711);
				}
				class240_sub1.method2215(buffer, i_66_, i_67_, -1760580017 * aWorldTile_3006.x, aWorldTile_3006.y * 283514611, SCENE_CLIP_DATA_PLANES, osrs);
				class240_sub1.method2235(OverlayType.activeToolkit, buffer, i_66_, i_67_, (byte) -72);
			}
		}
		for (int i_68_ = 0; i_68_ < i_61_; i_68_++) {
			int i_69_ = (anIntArray3031[i_68_] >> 8) * 64 - aWorldTile_3006.x * -1760580017;
			int i_70_ = (anIntArray3031[i_68_] & 0xff) * 64 - aWorldTile_3006.y * 283514611;
			byte[] is_71_ = is[i_68_];
			if (is_71_ == null && anInt3009 * 306966675 < 800) {
				if (!aBoolean3018) {
					Class247.method2365(-918952780);
				}
				class240_sub1.calculateMapHeightPlanes(i_69_, i_70_, 64, 64, (byte) 0);
			}
		}
	}

	void method2660(Class240_Sub1 class240_sub1, byte[][] datas, byte i) {
		int i_72_ = aByteArrayArray3038.length;
		for (int i_73_ = 0; i_73_ < i_72_; i_73_++) {
			byte[] data = datas[i_73_];
			if (data != null) {
				int i_75_ = 64 * (anIntArray3031[i_73_] >> 8) - -1760580017 * aWorldTile_3006.x;
				int i_76_ = (anIntArray3031[i_73_] & 0xff) * 64 - 283514611 * aWorldTile_3006.y;
				if (!aBoolean3018) {
					Class247.method2365(-802890876);
				}
				class240_sub1.method2237(OverlayType.activeToolkit, data, i_75_, i_76_, SCENE_CLIP_DATA_PLANES, 1861855341);
				if (aBoolean3018) {
					method2658(10, (byte) 22);
				}
			}
		}
	}

	void method2661(int i) {
		try {
			int i_77_ = aByteArrayArray3044.length;
			for (int i_78_ = 0; i_78_ < i_77_; i_78_++) {
				if (aByteArrayArray3044[i_78_] == null) {
					if (i <= -1776092464) {
						/* empty */
					}
				} else {
					int i_79_ = -1;
					for (int i_80_ = 0; i_80_ < GameClient.anInt8721 * -160072615; i_80_++) {
						if (anIntArray3031[i_78_] == GameClient.anIntArray8751[i_80_]) {
							i_79_ = i_80_;
							break;
						}
					}
					if (i_79_ == -1) {
						GameClient.anIntArray8751[GameClient.anInt8721 * -160072615] = anIntArray3031[i_78_];
						i_79_ = (GameClient.anInt8721 += 424283113) * -160072615 - 1;
					}
					Packet class298_sub53 = new Packet(aByteArrayArray3044[i_78_]);
					int i_81_ = 0;
					while (385051775 * class298_sub53.pos < aByteArrayArray3044[i_78_].length && i_81_ < 511) {
						if (GameClient.npcCount * -1230451913 >= 1023) {
							if (i <= -1776092464) {
								/* empty */
							}
							break;
						}
						int i_82_ = i_79_ | i_81_++ << 6;
						int i_83_ = class298_sub53.readUnsignedShort();
						int i_84_ = i_83_ >> 14;
						int i_85_ = i_83_ >> 7 & 0x3f;
						int i_86_ = i_83_ & 0x3f;
						int i_87_ = 64 * (anIntArray3031[i_78_] >> 8) - aWorldTile_3006.x * -1760580017 + i_85_;
						int i_88_ = i_86_ + 64 * (anIntArray3031[i_78_] & 0xff) - aWorldTile_3006.y * 283514611;
						NPCType class503 = Class15.aClass507_224.method6269(class298_sub53.readUnsignedShort(), -806262033);
						LinkableObject linkableObject = (LinkableObject) GameClient.npcs.get(i_82_);
						if (linkableObject == null && (class503.walkMask & 0x1) > 0 && i_87_ >= 0 && -2095128707 * class503.size + i_87_ < -991330803 * anInt3039 && i_88_ >= 0 && i_88_ + class503.size * -2095128707 < anInt3011 * -1456212765) {
							NPC class365_sub1_sub1_sub2_sub1 = new NPC(aSceneGraph_3037);
							class365_sub1_sub1_sub2_sub1.entityIndex = i_82_ * 1714292119;
							LinkableObject linkableObject_89_ = new LinkableObject(class365_sub1_sub1_sub2_sub1);
							GameClient.npcs.method5817(linkableObject_89_, i_82_);
							GameClient.aLinkableObjectArray8816[(GameClient.anInt8772 += -118843751) * 1962237353 - 1] = linkableObject_89_;
							GameClient.npcIndicies[(GameClient.npcCount += -409937273) * -1230451913 - 1] = i_82_;
							class365_sub1_sub1_sub2_sub1.anInt10075 = GameClient.anInt8884 * -128551287;
							class365_sub1_sub1_sub2_sub1.method4464(class503, 1908625985);
							class365_sub1_sub1_sub2_sub1.updateSize(class365_sub1_sub1_sub2_sub1.definition.size * -2095128707, -948262466);
							class365_sub1_sub1_sub2_sub1.anInt10115 = (-1927065533 * class365_sub1_sub1_sub2_sub1.definition.anInt6181 << 3) * -1186616623;
							class365_sub1_sub1_sub2_sub1.method4415(class365_sub1_sub1_sub2_sub1.definition.aClass274_6183.method2567((byte) 73).method242(694163818) << 11 & 0x3fff, true, 822135678);
							class365_sub1_sub1_sub2_sub1.method4456(i_84_, i_87_, i_88_, true, class365_sub1_sub1_sub2_sub1.getSize(), (byte) 78);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.au(").append(')').toString());
		}
	}

	public int method2662(int i) {
		try {
			return 100 - -1285506348 * anInt3027 / (anInt3028 * -316305569);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.b(").append(')').toString());
		}
	}

	void method2663(int i, int i_90_) {
		try {
			int i_91_ = aWorldTile_3006.x * -1760580017 - aWorldTile_3007.x * -1760580017;
			int i_92_ = aWorldTile_3006.y * 283514611 - 283514611 * aWorldTile_3007.y;
			if (17 == i) {
				for (int i_93_ = 0; i_93_ < 1962237353 * GameClient.anInt8772; i_93_++) {
					LinkableObject linkableObject = GameClient.aLinkableObjectArray8816[i_93_];
					if (null != linkableObject) {
						NPC class365_sub1_sub1_sub2_sub1 = (NPC) linkableObject.anObject7366;
						for (int i_94_ = 0; i_94_ < class365_sub1_sub1_sub2_sub1.scenePositionXQueue.length; i_94_++) {
							class365_sub1_sub1_sub2_sub1.scenePositionXQueue[i_94_] -= i_91_;
							class365_sub1_sub1_sub2_sub1.scenePositionYQueue[i_94_] -= i_92_;
						}
						SceneObjectPosition sceneObjectPosition = SceneObjectPosition.method2005(class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599);
						sceneObjectPosition.x -= 512 * i_91_;
						sceneObjectPosition.z -= i_92_ * 512;
						class365_sub1_sub1_sub2_sub1.method4340(sceneObjectPosition);
						sceneObjectPosition.method2006();
					}
				}
			} else {
				boolean bool = false;
				GameClient.npcCount = 0;
				int i_95_ = -755230208 * anInt3039 - 512;
				int i_96_ = anInt3011 * 1743373824 - 512;
				for (int i_97_ = 0; i_97_ < GameClient.anInt8772 * 1962237353; i_97_++) {
					LinkableObject linkableObject = GameClient.aLinkableObjectArray8816[i_97_];
					if (null != linkableObject) {
						NPC class365_sub1_sub1_sub2_sub1 = (NPC) linkableObject.anObject7366;
						SceneObjectPosition sceneObjectPosition = SceneObjectPosition.method2005(class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599);
						sceneObjectPosition.x -= 512 * i_91_;
						sceneObjectPosition.z -= 512 * i_92_;
						class365_sub1_sub1_sub2_sub1.method4340(sceneObjectPosition);
						if ((int) sceneObjectPosition.x < 0 || (int) sceneObjectPosition.x > i_95_ || (int) sceneObjectPosition.z < 0 || (int) sceneObjectPosition.z > i_96_) {
							class365_sub1_sub1_sub2_sub1.method4464(null, 1741344135);
							linkableObject.unlink(-1460969981);
							bool = true;
						} else {
							boolean bool_98_ = true;
							for (int i_99_ = 0; i_99_ < class365_sub1_sub1_sub2_sub1.scenePositionXQueue.length; i_99_++) {
								class365_sub1_sub1_sub2_sub1.scenePositionXQueue[i_99_] -= i_91_;
								class365_sub1_sub1_sub2_sub1.scenePositionYQueue[i_99_] -= i_92_;
								if (class365_sub1_sub1_sub2_sub1.scenePositionXQueue[i_99_] < 0 || class365_sub1_sub1_sub2_sub1.scenePositionXQueue[i_99_] >= anInt3039 * -991330803 || class365_sub1_sub1_sub2_sub1.scenePositionYQueue[i_99_] < 0 || class365_sub1_sub1_sub2_sub1.scenePositionYQueue[i_99_] >= anInt3011 * -1456212765) {
									bool_98_ = false;
								}
							}
							if (bool_98_) {
								GameClient.npcIndicies[(GameClient.npcCount += -409937273) * -1230451913 - 1] = class365_sub1_sub1_sub2_sub1.entityIndex * 1888274983;
							} else {
								class365_sub1_sub1_sub2_sub1.method4464(null, 2025506166);
								linkableObject.unlink(-1460969981);
								bool = true;
							}
						}
						sceneObjectPosition.method2006();
					}
				}
				if (bool) {
					GameClient.anInt8772 = GameClient.npcs.method5814(2145683355) * -118843751;
					int i_100_ = 0;
					Iterator iterator = GameClient.npcs.iterator();
					while (iterator.hasNext()) {
						LinkableObject linkableObject = (LinkableObject) iterator.next();
						GameClient.aLinkableObjectArray8816[i_100_++] = linkableObject;
					}
				}
			}
			for (int i_101_ = 0; i_101_ < 2048; i_101_++) {
				Player class365_sub1_sub1_sub2_sub2 = GameClient.players[i_101_];
				if (class365_sub1_sub1_sub2_sub2 != null) {
					for (int i_102_ = 0; i_102_ < class365_sub1_sub1_sub2_sub2.scenePositionXQueue.length; i_102_++) {
						class365_sub1_sub1_sub2_sub2.scenePositionXQueue[i_102_] -= i_91_;
						class365_sub1_sub1_sub2_sub2.scenePositionYQueue[i_102_] -= i_92_;
					}
					SceneObjectPosition sceneObjectPosition = SceneObjectPosition.method2005(class365_sub1_sub1_sub2_sub2.method4337().aSceneObjectPosition_2599);
					sceneObjectPosition.x -= 512 * i_91_;
					sceneObjectPosition.z -= i_92_ * 512;
					class365_sub1_sub1_sub2_sub2.method4340(sceneObjectPosition);
					sceneObjectPosition.method2006();
				}
			}
			HintIcon[] hintIcons = GameClient.hintIcons;
			for (HintIcon class192 : hintIcons) {
				HintIcon hintIcon = class192;
				if (hintIcon != null) {
					hintIcon.anInt260 -= i_91_ * -1268095488;
					hintIcon.anInt261 -= i_92_ * 1688061440;
				}
			}
			for (ObjectDeque objectDeque = (ObjectDeque) ObjectDeque.aLinkedNodeList_7152.method5939(1766612795); null != objectDeque; objectDeque = (ObjectDeque) ObjectDeque.aLinkedNodeList_7152.method5944(49146)) {
				objectDeque.anInt7150 -= i_91_ * 656787783;
				objectDeque.anInt7155 -= i_92_ * 284247153;
				if (aClass266_3001 != Class266.aClass266_2850 && (objectDeque.anInt7150 * 634196087 < 0 || -2146829167 * objectDeque.anInt7155 < 0 || 634196087 * objectDeque.anInt7150 >= anInt3039 * -991330803 || -2146829167 * objectDeque.anInt7155 >= anInt3011 * -1456212765)) {
					objectDeque.unlink(-1460969981);
				}
			}
			for (ObjectDeque objectDeque = (ObjectDeque) ObjectDeque.aLinkedNodeList_7162.method5939(1766612795); null != objectDeque; objectDeque = (ObjectDeque) ObjectDeque.aLinkedNodeList_7162.method5944(49146)) {
				objectDeque.anInt7150 -= i_91_ * 656787783;
				objectDeque.anInt7155 -= 284247153 * i_92_;
				if (aClass266_3001 != Class266.aClass266_2850 && (634196087 * objectDeque.anInt7150 < 0 || -2146829167 * objectDeque.anInt7155 < 0 || objectDeque.anInt7150 * 634196087 >= anInt3039 * -991330803 || -2146829167 * objectDeque.anInt7155 >= -1456212765 * anInt3011)) {
					objectDeque.unlink(-1460969981);
				}
			}
			for (Class298_Sub2 class298_sub2 = (Class298_Sub2) GameClient.groundTiles.method5816(1670233657); null != class298_sub2; class298_sub2 = (Class298_Sub2) GameClient.groundTiles.method5815((byte) -33)) {
				int i_104_ = (int) (class298_sub2.aLong3188 * 7051297995265073167L >> 28 & 0x3L);
				int i_105_ = (int) (7051297995265073167L * class298_sub2.aLong3188 & 0x3fffL);
				int i_106_ = i_105_ - -1760580017 * aWorldTile_3006.x;
				int i_107_ = (int) (class298_sub2.aLong3188 * 7051297995265073167L >> 14 & 0x3fffL);
				int i_108_ = i_107_ - 283514611 * aWorldTile_3006.y;
				if (null != aSceneGraph_3037) {
					if (i_106_ < 0 || i_108_ < 0 || i_106_ >= -991330803 * anInt3039 || i_108_ >= anInt3011 * -1456212765 || i_106_ >= aSceneGraph_3037.anInt3514 * 1988988347 || i_108_ >= 1340714547 * aSceneGraph_3037.anInt3549) {
						if (aClass266_3001 != Class266.aClass266_2850) {
							class298_sub2.unlink(-1460969981);
						}
					} else if (aSceneGraph_3037.aClass326ArrayArrayArray3516 != null) {
						aSceneGraph_3037.method4059(i_104_, i_106_, i_108_, (byte) 116);
					}
				}
			}
			if (2076926079 * Class3.anInt62 != 0) {
				Class3.anInt62 -= i_91_ * -1129029761;
				Class3.anInt54 -= -1835291189 * i_92_;
			}
			Class127_Sub3.method1434(-1799857115);
			Class264_Sub4.method2513(false, -1299725311);
			if (17 == i) {
				GameClient.anInt8753 -= i_91_ * 721337856;
				GameClient.anInt8755 -= i_92_ * 601815552;
				Class75.anInt708 -= -1853832704 * i_91_;
				Class106.anInt1309 -= 1181634048 * i_92_;
				if (2 != -863531439 * ObjectDeque.anInt7164) {
					ObjectDeque.anInt7164 = 1355934404;
					Class418.anInt5339 = -1001372047;
					Class100.anInt1081 = 178575833;
				}
			} else {
				VarClanSettings.anInt4089 -= i_91_ * 2140348215;
				Class82_Sub4.anInt6832 -= -2108764285 * i_92_;
				Ground.anInt6292 -= 446226445 * i_91_;
				IPAddress.anInt5959 -= i_92_ * 2019382975;
				Class367.anInt4000 -= i_91_ * 1343197696;
				Class146.anInt1575 -= i_92_ * -276168192;
				if (Math.abs(i_91_) > -991330803 * anInt3039 || Math.abs(i_92_) > anInt3011 * -1456212765) {
					aAtmosphereManager_3013.forceUpdate(-1910257839);
				}
			}
			Class447.method5905(2108312995);
			InputStream_Sub1.method273(632959802);
			GameClient.animatedObjects.method5811((byte) -16);
			GameClient.projectiles.method5943((byte) 1);
			GameClient.tileMessages.method5869(268098313);
			Class298_Sub27.method3105((short) 255);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.af(").append(')').toString());
		}
	}

	void method2664(byte i) {
		try {
			aClass240_Sub1_3000 = null;
			aClass240_Sub1_3029 = null;
			for (int i_109_ = 0; i_109_ < 4; i_109_++) {
				if (null != SCENE_CLIP_DATA_PLANES[i_109_]) {
					SCENE_CLIP_DATA_PLANES[i_109_].method2731(-2096339600);
				}
			}
			if (aTileFlags_3012 != null) {
				aTileFlags_3012.method2319(-1035232458);
			}
			if (null != aAtmosphereManager_3013) {
				aAtmosphereManager_3013.clearRegionAtmosphere((byte) 38);
			}
			if (null != aSceneGraph_3037) {
				aSceneGraph_3037.aClass324_3528.method3956(-1174492425);
				aSceneGraph_3037 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.aw(").append(')').toString());
		}
	}

	void method2665(byte i) {
		try {
			aClass266_3004 = aClass266_3001;
			method2655(Class115.aClass115_1383, 226677224);
			for (int i_110_ = 0; i_110_ < 4; i_110_++) {
				for (int i_111_ = 0; i_111_ < anInt3039 * -991330803 >> 3; i_111_++) {
					for (int i_112_ = 0; i_112_ < -1456212765 * anInt3011 >> 3; i_112_++) {
						anIntArrayArrayArray3043[i_110_][i_111_][i_112_] = -1;
					}
				}
			}
			for (Class298_Sub7 class298_sub7 = (Class298_Sub7) Class87.aLinkedNodeList_799.method5939(1766612795); null != class298_sub7; class298_sub7 = (Class298_Sub7) Class87.aLinkedNodeList_799.method5944(49146)) {
				int i_113_ = -1895845629 * class298_sub7.anInt7220;
				boolean bool = (i_113_ & 0x1) == 1;
				int i_114_ = 783342041 * class298_sub7.anInt7218 >> 3;
				int i_115_ = class298_sub7.anInt7212 * -1769464355 >> 3;
				int i_116_ = class298_sub7.anInt7216 * -815575585;
				int i_117_ = 35898435 * class298_sub7.anInt7217;
				int i_118_ = -802955793 * class298_sub7.anInt7214;
				int i_119_ = 25889883 * class298_sub7.anInt7215;
				int i_120_ = -60744569 * class298_sub7.anInt7219;
				int i_121_ = 1016983439 * class298_sub7.anInt7213;
				int i_122_ = 0;
				int i_123_ = 0;
				int i_124_ = 1;
				int i_125_ = 1;
				if (1 == i_113_) {
					i_123_ = i_120_ - 1;
					i_124_ = -1;
				} else if (2 == i_113_) {
					i_123_ = i_120_ - 1;
					i_122_ = i_121_ - 1;
					i_124_ = -1;
					i_125_ = -1;
				} else if (i_113_ == 3) {
					i_122_ = i_121_ - 1;
					i_124_ = 1;
					i_125_ = -1;
				}
				int i_126_ = i_115_;
				while (i_126_ < i_121_ + i_115_) {
					int i_127_ = i_123_;
					int i_128_ = i_114_;
					while (i_128_ < i_114_ + i_120_) {
						if (bool) {
							anIntArrayArrayArray3043[i_119_][i_116_ + i_122_][i_117_ + i_127_] = (i_126_ << 3) + (i_128_ << 14) + (i_118_ << 24) + (i_113_ << 1);
						} else {
							anIntArrayArrayArray3043[i_119_][i_116_ + i_127_][i_122_ + i_117_] = (i_113_ << 1) + (i_126_ << 3) + (i_128_ << 14) + (i_118_ << 24);
						}
						i_128_++;
						i_127_ += i_124_;
					}
					i_126_++;
					i_122_ += i_125_;
				}
			}
			int i_129_ = Class298_Sub37.anIntArrayArray7407.length;
			anIntArray3031 = new int[i_129_];
			anIntArray3010 = new int[i_129_];
			anIntArray3033 = new int[i_129_];
			anIntArray3034 = null;
			aByteArrayArray3038 = new byte[i_129_][];
			locsData = new byte[i_129_][];
			aByteArrayArray3044 = null;
			anIntArray3035 = new int[i_129_];
			anIntArray3036 = new int[i_129_];
			aByteArrayArray3041 = new byte[i_129_][];
			aByteArrayArray3002 = new byte[i_129_][];
			i_129_ = 0;
			for (Class298_Sub7 class298_sub7 = (Class298_Sub7) Class87.aLinkedNodeList_799.method5939(1766612795); class298_sub7 != null; class298_sub7 = (Class298_Sub7) Class87.aLinkedNodeList_799.method5944(49146)) {
				int i_130_ = class298_sub7.anInt7218 * 783342041 >>> 3;
				int i_131_ = -1769464355 * class298_sub7.anInt7212 >>> 3;
				int i_132_ = i_130_ + class298_sub7.anInt7219 * -60744569;
				if ((i_132_ & 0x7) == 0) {
					i_132_--;
				}
				i_132_ >>>= 3;
				int i_133_ = class298_sub7.anInt7213 * 1016983439 + i_131_;
				if ((i_133_ & 0x7) == 0) {
					i_133_--;
				}
				i_133_ >>>= 3;
				for (int i_134_ = i_130_ >>> 3; i_134_ <= i_132_; i_134_++) {
					while_71_: for (int i_135_ = i_131_ >>> 3; i_135_ <= i_133_; i_135_++) {
						int i_136_ = i_134_ << 8 | i_135_;
						for (int i_137_ = 0; i_137_ < i_129_; i_137_++) {
							if (anIntArray3031[i_137_] == i_136_) {
								if (i >= 0) {
									/* empty */
								}
								continue while_71_;
							}
						}
						anIntArray3031[i_129_] = i_136_;
						anIntArray3010[i_129_] = Class65.aClass243_665.getArchiveIdByName(method2669(true, false, i_134_, i_135_, (byte) -52), -1034865468);
						anIntArray3033[i_129_] = Class65.aClass243_665.getArchiveIdByName(method2669(false, false, i_134_, i_135_, (byte) 111), -1106973771);
						anIntArray3035[i_129_] = Class65.aClass243_665.getArchiveIdByName(method2669(true, true, i_134_, i_135_, (byte) 24), -740435939);
						anIntArray3036[i_129_] = Class65.aClass243_665.getArchiveIdByName(method2669(false, true, i_134_, i_135_, (byte) 86), -1244375919);
						i_129_++;
					}
				}
			}
			anIntArrayArray3042 = Class298_Sub37.anIntArrayArray7407;
			Class298_Sub37.anIntArrayArray7407 = null;
			method2657(-991330803 * anInt3039 >> 4, -1456212765 * anInt3011 >> 4, 17, false, -815771659);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ai(").append(')').toString());
		}
	}

	public void method2666(int i) {
		try {
			aWorldTile_3006 = new WorldTile();
			anInt3009 = 0;
			anInt3030 = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.o(").append(')').toString());
		}
	}

	public void method2667(int i) {
		try {
			if (aBoolean3018) {
				method2673((byte) 2);
				Class423.method5733(true, 1336561252);
				GameMap gameMap_138_ = GameClient.map;
				anIntArray3031 = gameMap_138_.anIntArray3031;
				anIntArray3010 = gameMap_138_.anIntArray3010;
				anIntArray3033 = gameMap_138_.anIntArray3033;
				anIntArray3034 = gameMap_138_.anIntArray3034;
				anIntArray3035 = gameMap_138_.anIntArray3035;
				anIntArray3036 = gameMap_138_.anIntArray3036;
				anIntArrayArray3042 = gameMap_138_.anIntArrayArray3042;
				aByteArrayArray3038 = gameMap_138_.aByteArrayArray3038;
				locsData = gameMap_138_.locsData;
				aByteArrayArray3044 = gameMap_138_.aByteArrayArray3044;
				aByteArrayArray3041 = gameMap_138_.aByteArrayArray3041;
				aByteArrayArray3002 = gameMap_138_.aByteArrayArray3002;
				SCENE_CLIP_DATA_PLANES = gameMap_138_.SCENE_CLIP_DATA_PLANES;
				aTileFlags_3012 = gameMap_138_.aTileFlags_3012;
				aAtmosphereManager_3013 = gameMap_138_.aAtmosphereManager_3013;
				anIntArrayArrayArray3043 = gameMap_138_.anIntArrayArrayArray3043;
				anInt3015 = 1 * gameMap_138_.anInt3015;
				zFar = 1 * gameMap_138_.zFar;
				aMapDetails_3017 = gameMap_138_.aMapDetails_3017;
				aMapKeys_3005 = gameMap_138_.aMapKeys_3005;
				anIntArrayArray3023 = gameMap_138_.anIntArrayArray3023;
				anIntArrayArray3026 = gameMap_138_.anIntArrayArray3026;
				aByteArrayArrayArray3032 = gameMap_138_.aByteArrayArrayArray3032;
				aClass266_3001 = gameMap_138_.aClass266_3001;
				aClass115_3003 = gameMap_138_.aClass115_3003;
				aWorldTile_3006 = gameMap_138_.aWorldTile_3006;
				aWorldTile_3007 = gameMap_138_.aWorldTile_3007;
				anInt3030 = gameMap_138_.anInt3030 * 1;
				anInt3009 = 1 * gameMap_138_.anInt3009;
				anInt3039 = gameMap_138_.anInt3039 * 1;
				anInt3011 = gameMap_138_.anInt3011 * 1;
			} else if (19 == -1233866115 * GameClient.anInt8752) {
				Class439.method5851(1, -193120332);
			} else if (GameClient.anInt8752 * -1233866115 == 14) {
				Class439.method5851(15, 1644134026);
			} else if (GameClient.anInt8752 * -1233866115 == 18) {
				Class439.method5851(16, 1118439953);
			} else if (0 == -1233866115 * GameClient.anInt8752) {
				Class439.method5851(17, 1835904519);
			} else if (8 == GameClient.anInt8752 * -1233866115) {
				Class439.method5851(9, -169912530);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ao(").append(')').toString());
		}
	}

	void method2668(GameMap gameMap_139_, byte i) {
		try {
			boolean bool = gameMap_139_.aBoolean3018;
			gameMap_139_.aBoolean3018 = aBoolean3018;
			aBoolean3018 = bool;
			Class266 class266 = gameMap_139_.aClass266_3004;
			gameMap_139_.aClass266_3004 = aClass266_3004;
			aClass266_3004 = class266;
			gameMap_139_.aWorldTile_3007 = aWorldTile_3006;
			aWorldTile_3007 = gameMap_139_.aWorldTile_3006;
			aAtmosphereManager_3013.copyStateFrom(gameMap_139_.method2640((byte) 49), -1162508016);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ae(").append(')').toString());
		}
	}

	String method2669(boolean bool, boolean bool_140_, int i, int i_141_, byte i_142_) {
		try {
			String string = "";
			if (bool) {
				string = new StringBuilder().append(string).append("m").append(i).append('_').append(i_141_).toString();
			} else {
				string = new StringBuilder().append(string).append("l").append(i).append('_').append(i_141_).toString();
			}
			if (bool_140_) {
				string = new StringBuilder().append('u').append(string).toString();
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.al(").append(')').toString());
		}
	}

	public int method2670(byte i) {
		try {
			return 100 - anInt3021 * -1732877004 / (1792875095 * anInt3024);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.p(").append(')').toString());
		}
	}

	void method2671(Class240_Sub1 class240_sub1, byte[][] is, int i) {
		try {
			for (int i_143_ = 0; i_143_ < class240_sub1.planesHeight * 1551623871; i_143_++) {
				if (!aBoolean3018) {
					Class247.method2365(140857778);
				}
				for (int i_144_ = 0; i_144_ < -991330803 * anInt3039 >> 3; i_144_++) {
					for (int i_145_ = 0; i_145_ < -1456212765 * anInt3011 >> 3; i_145_++) {
						int i_146_ = anIntArrayArrayArray3043[i_143_][i_144_][i_145_];
						if (-1 != i_146_) {
							int i_147_ = i_146_ >> 24 & 0x3;
							if (!class240_sub1.isUnderwater || 0 == i_147_) {
								int i_148_ = i_146_ >> 1 & 0x3;
								int i_149_ = i_146_ >> 14 & 0x3ff;
								int i_150_ = i_146_ >> 3 & 0x7ff;
								int i_151_ = (i_149_ / 8 << 8) + i_150_ / 8;
								for (int i_152_ = 0; i_152_ < anIntArray3031.length; i_152_++) {
									if (anIntArray3031[i_152_] == i_151_ && null != is[i_152_]) {
										class240_sub1.method2238(OverlayType.activeToolkit, is[i_152_], i_143_, 8 * i_144_, i_145_ * 8, i_147_, 8 * (i_149_ & 0x7), (i_150_ & 0x7) * 8, i_148_, SCENE_CLIP_DATA_PLANES, -174685332);
										break;
									}
								}
							}
						}
						if (aBoolean3018) {
							method2658(5, (byte) 22);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.an(").append(')').toString());
		}
	}

	public boolean sendRegionUpdate(int i) {
		try {
			if (!aBoolean3018) {
				VarClanTypeList.method6310(false, -583672467);
			}
			anInt3027 = 0;
			for (int i_153_ = 0; i_153_ < aByteArrayArray3038.length; i_153_++) {
				if (-1 != anIntArray3010[i_153_] && aByteArrayArray3038[i_153_] == null) {
					aByteArrayArray3038[i_153_] = Class65.aClass243_665.getFileFromArchive(anIntArray3010[i_153_], 0, (byte) -67);
					if (null == aByteArrayArray3038[i_153_]) {
						anInt3027 += -427342251;
					}
				}
				if (-1 != anIntArray3033[i_153_] && null == locsData[i_153_]) {
					locsData[i_153_] = Class65.aClass243_665.method2289(anIntArray3033[i_153_], 0, anIntArrayArray3042[i_153_], -1251594466);
					if (null == locsData[i_153_]) {
						anInt3027 += -427342251;
					}
				}
				if (anIntArray3035[i_153_] != -1 && null == aByteArrayArray3041[i_153_]) {
					aByteArrayArray3041[i_153_] = Class65.aClass243_665.getFileFromArchive(anIntArray3035[i_153_], 0, (byte) -60);
					if (aByteArrayArray3041[i_153_] == null) {
						anInt3027 += -427342251;
					}
				}
				if (anIntArray3036[i_153_] != -1 && aByteArrayArray3002[i_153_] == null) {
					aByteArrayArray3002[i_153_] = Class65.aClass243_665.getFileFromArchive(anIntArray3036[i_153_], 0, (byte) -33);
					if (null == aByteArrayArray3002[i_153_]) {
						anInt3027 += -427342251;
					}
				}
				if (null != anIntArray3034 && null == aByteArrayArray3044[i_153_] && anIntArray3034[i_153_] != -1) {
					aByteArrayArray3044[i_153_] = Class65.aClass243_665.method2289(anIntArray3034[i_153_], 0, anIntArrayArray3042[i_153_], -1874141869);
					if (null == aByteArrayArray3044[i_153_]) {
						anInt3027 += -427342251;
					}
				}
			}
			if (aMapKeys_3005 == null) {
				if (null != aMapDetails_3017 && Class_v.index_23_worldMap.method2295(new StringBuilder().append(aMapDetails_3017.fileName).append("_staticelements").toString(), -400372089)) {
					if (!Class_v.index_23_worldMap.method2312(new StringBuilder().append(aMapDetails_3017.fileName).append("_staticelements").toString(), -2144896080)) {
						anInt3027 += -427342251;
					} else {
						aMapKeys_3005 = Class237.method2192(Class_v.index_23_worldMap, new StringBuilder().append(aMapDetails_3017.fileName).append("_staticelements").toString(), GameClient.isMemberWorld, 565671699);
					}
				} else {
					aMapKeys_3005 = new MapKeys(0);
				}
			}
			if (-528251139 * anInt3027 > 0) {
				if (-316305569 * anInt3028 < anInt3027 * -528251139) {
					anInt3028 = anInt3027 * -707841245;
				}
				aClass273_3025 = Class273.aClass273_2906;
				return false;
			}
			anInt3021 = 0;
			for (int i_154_ = 0; i_154_ < aByteArrayArray3038.length; i_154_++) {
				byte[] is = locsData[i_154_];
				if (is != null) {
					int i_155_ = (anIntArray3031[i_154_] >> 8) * 64 - -1760580017 * aWorldTile_3006.x;
					int i_156_ = (anIntArray3031[i_154_] & 0xff) * 64 - aWorldTile_3006.y * 283514611;
					if (aClass266_3001.allowDynamicMapScene(-1692375482)) {
						i_155_ = 10;
						i_156_ = 10;
					}
					int i_157_ = Class82_Sub13.method910(aClass433_3040, is, i_155_, i_156_, anInt3039 * -991330803, -1456212765 * anInt3011, (byte) -75);
					if (i_157_ > 0) {
						anInt3021 += i_157_ * 94764029;
					}
				}
				is = aByteArrayArray3002[i_154_];
				if (is != null) {
					int i_158_ = 64 * (anIntArray3031[i_154_] >> 8) - aWorldTile_3006.x * -1760580017;
					int i_159_ = 64 * (anIntArray3031[i_154_] & 0xff) - aWorldTile_3006.y * 283514611;
					if (aClass266_3001.allowDynamicMapScene(-105390577)) {
						i_158_ = 10;
						i_159_ = 10;
					}
					int i_160_ = Class82_Sub13.method910(aClass433_3040, is, i_158_, i_159_, anInt3039 * -991330803, -1456212765 * anInt3011, (byte) 54);
					if (i_160_ > 0) {
						anInt3021 += 94764029 * i_160_;
					}
				}
			}
			if (-1134020267 * anInt3021 > 0) {
				if (1792875095 * anInt3024 < anInt3021 * -1134020267) {
					anInt3024 = anInt3021 * -1201957325;
				}
				aClass273_3025 = Class273.aClass273_2904;
				return false;
			}
			if (!aBoolean3018 && aClass273_3025 != Class273.aClass273_2905) {
				Class139.method1548(new StringBuilder().append(LocalizedString.MESSAGE_LOADING_PLEASE_WAIT.getText(Class321.ACTIVE_LANGUAGE, -875414210)).append(Class26.aString350).append("(100%)").toString(), true, OverlayType.activeToolkit, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) -16);
			}
			aClass273_3025 = Class273.aClass273_2907;
			if (!aBoolean3018) {
				Class247.method2365(-1142860499);
			}
			if (!aBoolean3018) {
				for (int i_161_ = 0; i_161_ < 2048; i_161_++) {
					Player class365_sub1_sub1_sub2_sub2 = GameClient.players[i_161_];
					if (class365_sub1_sub1_sub2_sub2 != null) {
						class365_sub1_sub1_sub2_sub2.aSceneGraph_7722 = null;
					}
				}
				for (LinkableObject element : GameClient.aLinkableObjectArray8816) {
					LinkableObject linkableObject = element;
					if (linkableObject != null) {
						((Class365_Sub1) linkableObject.anObject7366).aSceneGraph_7722 = null;
					}
				}
			}
			if (!aBoolean3018) {
				Class223.method2082(true, -1663847334);
			}
			if (!aBoolean3018) {
				Class117.method1278((byte) 84);
			}
			boolean bool = false;
			if (GraphicsAutoSetup.clientPreferences.waterDetailPreference.getValue(-1598768408) == 2) {
				for (int i_163_ = 0; i_163_ < aByteArrayArray3038.length; i_163_++) {
					if (aByteArrayArray3002[i_163_] != null || aByteArrayArray3041[i_163_] != null) {
						bool = true;
						break;
					}
				}
			}
			int i_164_ = Class69.method787(GraphicsAutoSetup.clientPreferences.aClass422_Sub24_7554.method5713((byte) 73), (byte) 16).anInt1581 * 2098573928;
			if (OverlayType.activeToolkit.method4998()) {
				i_164_++;
			}
			method2648(-1878791507);
			method2664((byte) 12);
			aSceneGraph_3037 = new SceneGraph(OverlayType.activeToolkit, 9, 4, anInt3039 * -991330803, anInt3011 * -1456212765, i_164_, bool, OverlayType.activeToolkit.method5048() > 0);
			aSceneGraph_3037.method4052(false, -740850409);
			aSceneGraph_3037.method4007(GameClient.anInt8814 * -2081556469, (byte) -26);
			if (0 != GameClient.anInt8814 * -2081556469) {
				aSceneGraph_3037.method4008(ScriptContext.aClass264_7534, -972568309);
			} else {
				aSceneGraph_3037.method4008(null, 1333003580);
			}
			aClass287_3019 = new Class287();
			aFloat3020 = -0.05F + (float) (Math.random() / 10.0);
			aClass240_Sub1_3029 = new Class240_Sub1(aSceneGraph_3037, aClass433_3040, 4, -991330803 * anInt3039, -1456212765 * anInt3011, false, aTileFlags_3012, aAtmosphereManager_3013);
			aClass240_Sub1_3029.method2212(-403694446);
			aClass240_Sub1_3029.anInt2621 = GraphicsAutoSetup.clientPreferences.sceneryShadowPreference.getValue(-809818345) * 275039235;
			aClass240_Sub1_3029.sceneryShadows = GraphicsAutoSetup.clientPreferences.waterDetailPreference.getValue(-2131698628) == 2;
			aClass240_Sub1_3029.highDetailWater = GraphicsAutoSetup.clientPreferences.lightingPreference.getValue(-2037839529) == 1;
			aClass240_Sub1_3029.groundBlending = GraphicsAutoSetup.clientPreferences.groundBlendingPreference.method5724(1917266854) == 1;
			aClass240_Sub1_3029.aBoolean2625 = GraphicsAutoSetup.clientPreferences.texturePreference.getValue(1803060969) == 1;
			if (!aClass266_3001.allowDynamicMapScene(338257036)) {
				method2659(aClass240_Sub1_3029, aByteArrayArray3038);
			} else {
				method2636(aClass240_Sub1_3029, aByteArrayArray3038, (byte) 53);
			}
			if (aBoolean3018) {
				method2658(50, (byte) -75);
			}
			aAtmosphereManager_3013.applySunDirectionToRegion(anInt3039 * -991330803 >> 4, -1456212765 * anInt3011 >> 4, 1532552397);
			aAtmosphereManager_3013.updateAtmosphereScene(this, 1783211969);
			if (bool) {
				aSceneGraph_3037.method4052(true, -740850409);
				aClass240_Sub1_3000 = new Class240_Sub1(aSceneGraph_3037, aClass433_3040, 1, -991330803 * anInt3039, -1456212765 * anInt3011, true, aTileFlags_3012, aAtmosphereManager_3013);
				aClass240_Sub1_3000.method2212(-1978540544);
				aClass240_Sub1_3000.anInt2621 = GraphicsAutoSetup.clientPreferences.sceneryShadowPreference.getValue(-15786995) * 275039235;
				aClass240_Sub1_3000.sceneryShadows = GraphicsAutoSetup.clientPreferences.waterDetailPreference.getValue(864049094) == 2;
				aClass240_Sub1_3000.highDetailWater = GraphicsAutoSetup.clientPreferences.lightingPreference.getValue(-1853244696) == 1;
				aClass240_Sub1_3000.groundBlending = GraphicsAutoSetup.clientPreferences.groundBlendingPreference.method5724(281198825) == 1;
				aClass240_Sub1_3000.aBoolean2625 = GraphicsAutoSetup.clientPreferences.texturePreference.getValue(2103749887) == 1;
				if (!aClass266_3001.allowDynamicMapScene(1753743768)) {
					method2659(aClass240_Sub1_3000, aByteArrayArray3041);
					if (!aBoolean3018) {
						VarClanTypeList.method6310(true, 1696867322);
					}
				} else {
					method2636(aClass240_Sub1_3000, aByteArrayArray3041, (byte) 95);
					if (!aBoolean3018) {
						VarClanTypeList.method6310(true, -428383733);
					}
				}
				aClass240_Sub1_3000.method2211(0, aClass240_Sub1_3029.heights[0], -1177013471);
				aClass240_Sub1_3000.method2218(OverlayType.activeToolkit, null, null, (byte) -27);
				aSceneGraph_3037.method4052(false, -740850409);
				if (aBoolean3018) {
					method2658(50, (byte) 33);
				}
			}
			aClass240_Sub1_3029.method2218(OverlayType.activeToolkit, bool ? aClass240_Sub1_3000.heights : null, SCENE_CLIP_DATA_PLANES, (byte) 23);
			if (!aClass266_3001.allowDynamicMapScene(-1767246323)) {
				if (!aBoolean3018) {
					VarClanTypeList.method6310(true, 1723627031);
				}
				method2660(aClass240_Sub1_3029, locsData, (byte) -90);
				if (null != aByteArrayArray3044) {
					method2661(-388258926);
				}
			} else {
				if (!aBoolean3018) {
					VarClanTypeList.method6310(true, 2071599739);
				}
				method2671(aClass240_Sub1_3029, locsData, 1378612829);
			}
			if (!aBoolean3018) {
				VarClanTypeList.method6310(true, -741926161);
			}
			aClass240_Sub1_3029.method2219(OverlayType.activeToolkit, bool ? aSceneGraph_3037.aGroundArray3521[0] : null, null, (byte) -119);
			if (aBoolean3018) {
				method2658(75, (byte) 18);
			}
			aClass240_Sub1_3029.method2242(OverlayType.activeToolkit, false, 1773155741);
			if (aBoolean3018) {
				method2658(75, (byte) 61);
			}
			if (!aBoolean3018) {
				VarClanTypeList.method6310(true, 1278015476);
			}
			if (bool) {
				aSceneGraph_3037.method4052(true, -740850409);
				if (!aBoolean3018) {
					VarClanTypeList.method6310(true, -2085672109);
				}
				if (!aClass266_3001.allowDynamicMapScene(423424816)) {
					method2660(aClass240_Sub1_3000, aByteArrayArray3002, (byte) -36);
				} else {
					method2671(aClass240_Sub1_3000, aByteArrayArray3002, -957252436);
				}
				if (!aBoolean3018) {
					VarClanTypeList.method6310(true, 1319323091);
				}
				aClass240_Sub1_3000.method2219(OverlayType.activeToolkit, null, aSceneGraph_3037.aGroundArray3519[0], (byte) 43);
				aClass240_Sub1_3000.method2242(OverlayType.activeToolkit, true, 1773155741);
				if (!aBoolean3018) {
					VarClanTypeList.method6310(true, 1345203008);
				}
				aSceneGraph_3037.method4052(false, -740850409);
				if (aBoolean3018) {
					method2658(50, (byte) -40);
				}
			}
			aClass240_Sub1_3029.method2217(-702552699);
			if (aClass240_Sub1_3000 != null) {
				aClass240_Sub1_3000.method2217(-702552699);
			}
			aSceneGraph_3037.method4050(-1802988635);
			if (aBoolean3018) {
				TimeUtils.getTime((byte) 1);
				while (!OverlayType.activeToolkit.method5041(2085922748)) {
					method2658(1, (byte) -1);
				}
			}
			boolean bool_165_ = false;
			if (aBoolean3018) {
				GameMap gameMap_166_ = GameClient.map;
				method2668(gameMap_166_, (byte) -125);
				overheadString.aClass248_612.method2381(gameMap_166_, -1651604);
				bool_165_ = true;
				TimeUtils.getTime((byte) 1);
				synchronized (GameClient.anObject8661) {
					GameClient.aBoolean8717 = true;
					try {
						GameClient.anObject8661.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				GameClient.map = this;
				gameMap_166_.method2664((byte) 12);
				method2663(17, 1856850794);
				method2649((byte) 34);
			} else {
				Class247.method2365(-913079296);
				aAtmosphereManager_3013.applyFogSettings((byte) 3);
				Huffman.method1247(1506910584);
			}
			for (int i_167_ = 0; i_167_ < 4; i_167_++) {
				for (int i_168_ = 0; i_168_ < anInt3039 * -991330803; i_168_++) {
					for (int i_169_ = 0; i_169_ < -1456212765 * anInt3011; i_169_++) {
						Class173.method1820(i_167_, i_168_, i_169_, 814827061);
					}
				}
			}
			for (Class299 element : GameClient.aClass299Array8671) {
				if (element != null) {
					element.method3676(aSceneGraph_3037, 1790221759);
				}
			}
			Class475.method6075((short) -8812);
			Class420.method5608(2113027902);
			if (SpotAnimTypeList.method4865((byte) -6) == Class292.aClass292_3162 && GameClient.gameConnection.method387(537308016) != null && 17 == GameClient.anInt8752 * -1233866115) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2040, GameClient.gameConnection.aClass449_330, (byte) 55);
				class298_sub36.buffer.writeInt(1057001181, -2024753870);
				GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -45);
			}
			if (!aClass266_3001.allowDynamicMapScene(1503430704)) {
				int i_171_ = (19679283 * anInt3030 - (anInt3039 * -991330803 >> 4)) / 8;
				int i_172_ = (19679283 * anInt3030 + (anInt3039 * -991330803 >> 4)) / 8;
				int i_173_ = (306966675 * anInt3009 - (anInt3011 * -1456212765 >> 4)) / 8;
				int i_174_ = (306966675 * anInt3009 + (-1456212765 * anInt3011 >> 4)) / 8;
				for (int i_175_ = i_171_ - 1; i_175_ <= 1 + i_172_; i_175_++) {
					for (int i_176_ = i_173_ - 1; i_176_ <= i_174_ + 1; i_176_++) {
						if (i_175_ >= i_171_ && i_175_ <= i_172_ && i_176_ >= i_173_ && i_176_ <= i_174_) {
							if (i >= 1047709682) {
								throw new IllegalStateException();
							}
						} else {
							Class65.aClass243_665.method2304(method2669(true, false, i_175_, i_176_, (byte) 34), -1752946353);
							Class65.aClass243_665.method2304(method2669(false, false, i_175_, i_176_, (byte) -61), -1482810579);
							Class65.aClass243_665.method2304(method2669(true, true, i_175_, i_176_, (byte) -69), -1377878894);
							Class65.aClass243_665.method2304(method2669(false, true, i_175_, i_176_, (byte) -104), -180643080);
						}
					}
				}
			}
			if (-1233866115 * GameClient.anInt8752 == 1) {
				Class439.method5851(19, 1314741993);
			} else if (GameClient.anInt8752 * -1233866115 == 15) {
				Class439.method5851(14, 1781016763);
			} else if (16 == GameClient.anInt8752 * -1233866115) {
				Class439.method5851(18, 1023292756);
			} else if (-1233866115 * GameClient.anInt8752 == 9) {
				Class439.method5851(8, 6222714);
			} else {
				Class439.method5851(0, 2061499324);
				if (GameClient.gameConnection.method387(537308016) != null) {
					Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.DONE_LOADING_REGION_PACKET, GameClient.gameConnection.aClass449_330, (byte) 9);
					GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -71);
				}
			}
			Class82_Sub19.method926(55767460);
			if (aBoolean3008) {
				Class255.sendDevConsoleMsg(Long.toString(TimeUtils.getTime((byte) 1) - aLong3045 * 4917044907588821591L), 180430926);
				aBoolean3008 = false;
			}
			if (bool_165_) {
				synchronized (GameClient.anObject8718) {
					GameClient.anObject8718.notify();
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ab(").append(')').toString());
		}
	}

	public void method2673(byte i) {
		try {
			aClass273_3025 = Class273.aClass273_2905;
			anInt3027 = 0;
			anInt3028 = 255626399;
			anInt3021 = 0;
			anInt3024 = -861507225;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ax(").append(')').toString());
		}
	}

	public Class266 method2674(int i) {
		try {
			return aClass266_3001;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.a(").append(')').toString());
		}
	}

	public SceneGraph method2675(int i) {
		try {
			return aSceneGraph_3037;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.s(").append(')').toString());
		}
	}

	static final void method2676(ClientScript2 class403, int i) {
		try {
			int i_177_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_177_, (byte) -54);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_177_ >> 16];
			Class225.method2101(class105, RSInterface, class403, -1146943352);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ea(").append(')').toString());
		}
	}

	static final void method2677(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, byte i) {
		try {
			String string = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
			int[] is = Class298_Sub6.method2863(string, class403, -1881953326);
			if (null != is) {
				string = string.substring(0, string.length() - 1);
			}
			class105.anObjectArray1255 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.anIntArray1256 = is;
			class105.hasScripts = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.ml(").append(')').toString());
		}
	}

	public static ModelPart method2678(GraphicsToolkit class_ra, int i, int i_178_, int i_179_, int i_180_, int i_181_, ModelPart modelPart, int i_182_, int i_183_, int i_184_, int i_185_, Animator animator, int i_186_) {
		try {
			if (null == modelPart) {
				return null;
			}
			int i_187_ = 2055;
			if (null != animator) {
				i_187_ |= animator.method5829(-1790708337);
				i_187_ &= ~0x200;
			}
			long l = ((long) i_183_ << 48) + (i_185_ << 24) + ((i_184_ << 16) + i_181_) + ((long) i_182_ << 32);
			ModelPart modelPart_188_;
			synchronized (Class462.aClass348_5682) {
				modelPart_188_ = (ModelPart) Class462.aClass348_5682.get(l);
			}
			if (modelPart_188_ == null || class_ra.method5017(modelPart_188_.m(), i_187_) != 0) {
				if (modelPart_188_ != null) {
					i_187_ = class_ra.method5004(i_187_, modelPart_188_.m());
				}
				int i_189_;
				if (i_181_ == 1) {
					i_189_ = 9;
				} else if (2 == i_181_) {
					i_189_ = 12;
				} else if (i_181_ == 3) {
					i_189_ = 15;
				} else if (4 == i_181_) {
					i_189_ = 18;
				} else {
					i_189_ = 21;
				}
				int i_190_ = 3;
				int[] is = { 64, 96, 128 };
				Model class64 = new Model(1 + i_190_ * i_189_, 2 * i_190_ * i_189_ - i_189_, 0);
				int i_191_ = class64.method747(0, 0, 0);
				int[][] is_192_ = new int[i_190_][i_189_];
				for (int i_193_ = 0; i_193_ < i_190_; i_193_++) {
					int i_194_ = is[i_193_];
					int i_195_ = is[i_193_];
					for (int i_196_ = 0; i_196_ < i_189_; i_196_++) {
						int i_197_ = (i_196_ << 14) / i_189_;
						int i_198_ = i_194_ * Class220.SINE[i_197_] >> 14;
						int i_199_ = i_195_ * Class220.COSINE[i_197_] >> 14;
						is_192_[i_193_][i_196_] = class64.method747(i_198_, 0, i_199_);
					}
				}
				for (int i_200_ = 0; i_200_ < i_190_; i_200_++) {
					int i_201_ = (128 + i_200_ * 256) / i_190_;
					int i_202_ = 256 - i_201_;
					byte i_203_ = (byte) (i_185_ * i_201_ + i_202_ * i_184_ >> 8);
					short i_204_ = (short) ((i_202_ * (i_182_ & 0x7f) + i_201_ * (i_183_ & 0x7f) & 0x7f00) + ((i_183_ & 0xfc00) * i_201_ + (i_182_ & 0xfc00) * i_202_ & 0xfc0000) + (i_201_ * (i_183_ & 0x380) + i_202_ * (i_182_ & 0x380) & 0x38000) >> 8);
					for (int i_205_ = 0; i_205_ < i_189_; i_205_++) {
						if (0 == i_200_) {
							class64.method748(i_191_, is_192_[0][(1 + i_205_) % i_189_], is_192_[0][i_205_], (byte) 1, (byte) -1, i_204_, i_203_, (short) -1);
						} else {
							class64.method748(is_192_[i_200_ - 1][i_205_], is_192_[i_200_ - 1][(1 + i_205_) % i_189_], is_192_[i_200_][(1 + i_205_) % i_189_], (byte) 1, (byte) -1, i_204_, i_203_, (short) -1);
							class64.method748(is_192_[i_200_ - 1][i_205_], is_192_[i_200_][(i_205_ + 1) % i_189_], is_192_[i_200_][i_205_], (byte) 1, (byte) -1, i_204_, i_203_, (short) -1);
						}
					}
				}
				modelPart_188_ = class_ra.method5037(class64, i_187_, 161976139 * Class419.anInt5341, 64, 768);
				synchronized (Class462.aClass348_5682) {
					Class462.aClass348_5682.put(modelPart_188_, l);
				}
			}
			int i_206_ = modelPart.RA();
			int i_207_ = modelPart.ya();
			int i_208_ = modelPart.AA();
			int i_209_ = modelPart.ha();
			if (animator != null) {
				modelPart_188_ = modelPart_188_.method4755((byte) 3, i_187_, true);
				modelPart_188_.oa(i_207_ - i_206_ >> 1, 128, i_209_ - i_208_ >> 1);
				modelPart_188_.ia(i_206_ + i_207_ >> 1, 0, i_208_ + i_209_ >> 1);
				animator.method5831(modelPart_188_, 574844997);
			} else {
				modelPart_188_ = modelPart_188_.method4755((byte) 3, i_187_, true);
				modelPart_188_.oa(i_207_ - i_206_ >> 1, 128, i_209_ - i_208_ >> 1);
				modelPart_188_.ia(i_206_ + i_207_ >> 1, 0, i_209_ + i_208_ >> 1);
			}
			if (i_178_ != 0) {
				modelPart_188_.t(i_178_);
			}
			if (0 != i_179_) {
				modelPart_188_.EA(i_179_);
			}
			if (i_180_ != 0) {
				modelPart_188_.ia(0, i_180_, 0);
			}
			return modelPart_188_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lt.a(").append(')').toString());
		}
	}
}
