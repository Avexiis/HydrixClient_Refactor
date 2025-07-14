/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class116 {
	Class298_Sub31[] aClass298_Sub31Array1390;
	Interface4 anInterface4_1391;
	HashTable aClass437_1392;

	public Class298_Sub31 method1263(String string, int i) {
		try {
			long l = ((Class116) this).anInterface4_1391.method47(string, (byte) 93);
			for (Class298_Sub31 class298_sub31 = ((Class298_Sub31) ((Class116) this).aClass437_1392.get(l)); null != class298_sub31; class298_sub31 = (Class298_Sub31) ((Class116) this).aClass437_1392.method5813(-1712985598)) {
				if (((Class298_Sub31) class298_sub31).aString7370.equals(string))
					return class298_sub31;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.f(").append(')').toString());
		}
	}

	void method1264(int i, int i_0_) {
		try {
			Class298_Sub31 class298_sub31 = method1266(i, (byte) -123);
			if (class298_sub31 != null) {
				class298_sub31.unlink(-1460969981);
				((Class116) this).aClass298_Sub31Array1390[-1836037967 * ((Class298_Sub31) class298_sub31).anInt7369] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.b(").append(')').toString());
		}
	}

	public void method1265(int i, String string, Class298_Sub31 class298_sub31, int i_1_) {
		try {
			Class298_Sub31 class298_sub31_2_ = method1263(string, -1827449503);
			if (null != class298_sub31_2_ && i != (((Class298_Sub31) class298_sub31_2_).anInt7369 * -1836037967))
				throw new IllegalArgumentException(string);
			method1264(i, -1882252920);
			if (i >= ((Class116) this).aClass298_Sub31Array1390.length) {
				int i_3_;
				for (i_3_ = ((Class116) this).aClass298_Sub31Array1390.length; i >= i_3_; i_3_ += i_3_) {
					/* empty */
				}
				((Class116) this).aClass437_1392 = new HashTable(i_3_);
				for (int i_4_ = 0; i_4_ < ((Class116) this).aClass298_Sub31Array1390.length; i_4_++) {
					Class298_Sub31 class298_sub31_5_ = ((Class116) this).aClass298_Sub31Array1390[i_4_];
					if (class298_sub31_5_ != null)
						((Class116) this).aClass437_1392.method5817(class298_sub31_5_, (class298_sub31_5_.aLong3188 * 7051297995265073167L));
				}
				Class298_Sub31[] class298_sub31s = new Class298_Sub31[i_3_];
				for (int i_6_ = 0; i_6_ < ((Class116) this).aClass298_Sub31Array1390.length; i_6_++)
					class298_sub31s[i_6_] = ((Class116) this).aClass298_Sub31Array1390[i_6_];
				((Class116) this).aClass298_Sub31Array1390 = class298_sub31s;
			}
			((Class298_Sub31) class298_sub31).anInt7369 = -1138163631 * i;
			((Class298_Sub31) class298_sub31).aString7370 = string;
			((Class116) this).aClass437_1392.method5817(class298_sub31, ((Class116) this).anInterface4_1391.method47(string, (byte) -48));
			((Class116) this).aClass298_Sub31Array1390[i] = class298_sub31;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.p(").append(')').toString());
		}
	}

	public Class116(int i, Interface4 interface4) {
		int i_7_;
		for (i_7_ = 1; i_7_ < i; i_7_ += i_7_) {
			/* empty */
		}
		((Class116) this).aClass437_1392 = new HashTable(i_7_);
		((Class116) this).aClass298_Sub31Array1390 = new Class298_Sub31[i_7_];
		((Class116) this).anInterface4_1391 = interface4;
	}

	public Class298_Sub31 method1266(int i, byte i_8_) {
		try {
			if (i >= ((Class116) this).aClass298_Sub31Array1390.length)
				return null;
			return ((Class116) this).aClass298_Sub31Array1390[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.a(").append(')').toString());
		}
	}

	public static void method1267(int i) {
		try {
			Class276.method2574();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.f(").append(')').toString());
		}
	}

	public static void method1268(Class95 class95, int i, byte i_9_) {
		try {
			i = i * GraphicsAutoSetup.clientPreferences.aVolumePreference_7584.method5726(-2144031703) >> 8;
			if (null == class95)
				Class134.method1489((byte) -122);
			else {
				Class298_Sub32_Sub10.method3200(class95, i, -391880689);
				Class368.method4555((short) -1817);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.e(").append(')').toString());
		}
	}

	static final void method1269(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = class105.aString1212;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.pf(").append(')').toString());
		}
	}

	static final void method1270(Entity class365_sub1_sub1_sub2, int i) {
		try {
			if (null != class365_sub1_sub1_sub2.anIntArray10092 || class365_sub1_sub1_sub2.turnQueue != null) {
				boolean bool = true;
				WorldTile worldTile = GameClient.map.getRegionStart(681479919);
				for (int i_10_ = 0; i_10_ < class365_sub1_sub1_sub2.anIntArray10092.length; i_10_++) {
					int i_11_ = -1;
					if (null != class365_sub1_sub1_sub2.anIntArray10092)
						i_11_ = class365_sub1_sub1_sub2.anIntArray10092[i_10_];
					if (-1 == i_11_) {
						if (!class365_sub1_sub1_sub2.method4417(i_10_, -1, (byte) 65))
							bool = false;
					} else {
						bool = false;
						boolean bool_12_ = false;
						boolean bool_13_ = false;
						SceneObjectPosition sceneObjectPosition = (class365_sub1_sub1_sub2.method4337().aSceneObjectPosition_2599);
						int i_14_;
						int i_15_;
						if (-1073741824 == (i_11_ & ~0x3fffffff)) {
							int i_16_ = i_11_ & 0xfffffff;
							int i_17_ = i_16_ >> 14;
							int i_18_ = i_16_ & 0x3fff;
							i_14_ = ((int) sceneObjectPosition.x - (256 + 512 * (i_17_ - (worldTile.x * -1760580017))));
							i_15_ = ((int) sceneObjectPosition.z - (256 + ((i_18_ - 283514611 * worldTile.y) * 512)));
						} else if ((i_11_ & 0x8000) != 0) {
							int i_19_ = i_11_ & 0x7fff;
							Player class365_sub1_sub1_sub2_sub2 = (GameClient.players[i_19_]);
							if (null != class365_sub1_sub1_sub2_sub2) {
								SceneObjectPosition sceneObjectPosition_20_ = (class365_sub1_sub1_sub2_sub2.method4337().aSceneObjectPosition_2599);
								i_14_ = ((int) sceneObjectPosition.x - (int) sceneObjectPosition_20_.x);
								i_15_ = ((int) sceneObjectPosition.z - (int) sceneObjectPosition_20_.z);
							} else {
								class365_sub1_sub1_sub2.method4417(i_10_, -1, (byte) 16);
								continue;
							}
						} else {
							LinkableObject linkableObject = ((LinkableObject) GameClient.npcs.get((long) i_11_));
							if (null != linkableObject) {
								NPC class365_sub1_sub1_sub2_sub1 = ((NPC) linkableObject.anObject7366);
								SceneObjectPosition sceneObjectPosition_21_ = (class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599);
								i_14_ = ((int) sceneObjectPosition.x - (int) sceneObjectPosition_21_.x);
								i_15_ = ((int) sceneObjectPosition.z - (int) sceneObjectPosition_21_.z);
							} else {
								class365_sub1_sub1_sub2.method4417(i_10_, -1, (byte) 65);
								continue;
							}
						}
						if (i_14_ != 0 || 0 != i_15_)
							class365_sub1_sub1_sub2.method4417(i_10_, (int) (Math.atan2((double) i_14_, (double) i_15_) * 2607.5945876176133) & 0x3fff, (byte) 21);
					}
				}
				if (bool) {
					class365_sub1_sub1_sub2.anIntArray10092 = null;
					class365_sub1_sub1_sub2.turnQueue = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.hw(").append(')').toString());
		}
	}

	static final void method1271(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			class105.anInt1286 = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]) * 2145953887;
			class105.anInt1159 = (1215865909 * (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]));
			int i_22_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]);
			if (i_22_ < 0)
				i_22_ = 0;
			else if (i_22_ > 5)
				i_22_ = 5;
			int i_23_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 3]);
			if (i_23_ < 0)
				i_23_ = 0;
			else if (i_23_ > 5)
				i_23_ = 5;
			class105.aByte1146 = (byte) i_22_;
			class105.aByte1147 = (byte) i_23_;
			LocalizedString.markComponentForRedraw(class105, -1806072234);
			Animator.method5845(RSInterface, class105, -1959938301);
			if (0 == class105.type * -1215239439)
				Class65.method761(RSInterface, class105, false, 112223880);
			if (class105.component * -1309843523 == -1 && !RSInterface.aBoolean1403)
				Class288.method2729(class105.interfacehash * -440872681, 1058352947);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.cy(").append(')').toString());
		}
	}

	public static void method1272(int i) {
		try {
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aClass422_Sub17_7564, 2, 1364189431);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aClass422_Sub17_7565, 2, 1428932926);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aClass422_Sub2_7547, 1, -398332874);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.groundBlendingPreference, 1, 401268670);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aGraphicsAutoSetup_7569, 1, -225463890);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.flickeringPreference, 1, -1836206886);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.characterShadowPreference, 1, 370627212);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.texturePreference, 1, -408534755);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.sceneryShadowPreference, 2, 902985868);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.lightingPreference, 1, -598361107);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.waterDetailPreference, 2, -1383392801);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.fogPreference, 1, -906948807);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.antialiasPreference, 0, -33681458);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aAntialiasPreference_7550, 0, 1421186288);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.particlePreference, 2, 540542372);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aMapSizePreference_7558, -160182505 * Class115.aClass115_1383.anInt1387, -1761179616);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.bloomPreference, 0, -224292435);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aClass422_Sub19_7567, 1, -1095753213);
			Class490.method6170(1113089752);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aScreenSizePreference_7566, 0, -255450456);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aGraphicsPresetPreference_7576, 4, -1503000193);
			Class359.method4294(1109876610);
			GameClient.map.method2640((byte) 54).forceUpdate(286817156);
			GameClient.aBoolean8676 = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.d(").append(')').toString());
		}
	}

	static final void method1273(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class356.method4270(class105, RSInterface, class403, 377927410);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("es.lq(").append(')').toString());
		}
	}
}
