/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125 {
	public int anInt1481;
	public int anInt1482;
	public int anInt1483;
	public int anInt1484;
	public int anInt1485;
	public boolean aBoolean1486;
	public int anInt1487;
	public int anInt1488;
	public int anInt1489;
	public int anInt1490 = -233713448;
	public int anInt1491;

	void method1390(Packet class298_sub53, byte i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i < 1)
						break;
					break;
				}
				method1391(class298_sub53, i_0_, (short) 6892);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.a(").append(')').toString());
		}
	}

	void method1391(Packet class298_sub53, int i, short i_1_) {
		try {
			if (1 == i)
				anInt1490 = class298_sub53.readUnsignedShort() * -1639826917;
			else if (2 == i)
				aBoolean1486 = true;
			else if (3 == i) {
				anInt1483 = class298_sub53.readShort(1536042537) * -652822843;
				anInt1489 = class298_sub53.readShort(1731816677) * -369949453;
				anInt1481 = class298_sub53.readShort(2113073635) * 586212811;
			} else if (4 == i)
				anInt1491 = class298_sub53.readUnsignedByte() * 1941395261;
			else if (5 == i)
				anInt1488 = class298_sub53.readBigSmart() * 372664533;
			else if (i == 6)
				anInt1487 = class298_sub53.g3() * -1508681825;
			else if (i == 7) {
				anInt1485 = class298_sub53.readShort(2027099715) * -1789510425;
				anInt1484 = class298_sub53.readShort(1934566489) * 695060321;
				anInt1482 = class298_sub53.readShort(2047169490) * -1953778617;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.f(").append(')').toString());
		}
	}

	Class125() {
		anInt1487 = -118708127;
	}

	static final void method1392(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class82_Sub2.method878(i_2_, i_3_, true, -880312954);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.tq(").append(')').toString());
		}
	}

	static final void method1393(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_5_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class74.method830(i_4_, i_5_ >> 14 & 0x3fff, i_5_ & 0x3fff, false, 1608871018);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.aen(").append(')').toString());
		}
	}

	static final void method1394(ClientScript2 class403, int i) {
		try {
			NPC class365_sub1_sub1_sub2_sub1 = ((NPC) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242);
			String string = class365_sub1_sub1_sub2_sub1.aString10186;
			NPCType class503 = class365_sub1_sub1_sub2_sub1.definition;
			if (null != class503.anIntArray6188) {
				class503 = class503.method6240(Class128.aClass148_6331, 1606413785);
				if (class503 == null)
					string = "";
				else
					string = class503.name;
			}
			if (string == null)
				string = "";
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.aoq(").append(')').toString());
		}
	}

	static void method1395(int i, boolean bool, int i_6_) {
		try {
			if (bool) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2036, GameClient.gameConnection.aClass449_330, (byte) 105);
				class298_sub36.buffer.writeShort(i, 16711935);
				GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -34);
			} else
				Class126.method1405(Class502.aClass502_6722, i, -1, -1830852893);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.p(").append(')').toString());
		}
	}

	static void method1396(Class298_Sub36 class298_sub36, int i, int i_7_, int i_8_, int i_9_) {
		try {
			class298_sub36.buffer.writeIntV2(i);
			class298_sub36.buffer.writeShort128(i_8_);
			class298_sub36.buffer.writeShortLE128(i_7_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.ka(").append(')').toString());
		}
	}

	static final void method1397(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -255285486) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1275 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.hasScripts = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.nv(").append(')').toString());
		}
	}

	static int method1398(NPC class365_sub1_sub1_sub2_sub1, int i) {
		try {
			NPCType class503 = class365_sub1_sub1_sub2_sub1.definition;
			if (class503.anIntArray6188 != null) {
				class503 = class503.method6240(Class128.aClass148_6331, 1880791850);
				if (class503 == null)
					return -1;
			}
			int i_10_ = 1105496999 * class503.anInt6169;
			BASType class350 = class365_sub1_sub1_sub2_sub1.getDefinition(1451181541);
			int i_11_ = class365_sub1_sub1_sub2_sub1.spotAnimAnimator.method5823(1966806311);
			if (i_11_ == -1 || class365_sub1_sub1_sub2_sub1.outlineDirty)
				i_10_ = class503.anInt6151 * 1945943361;
			else if (class350.anInt3721 * 230243963 == i_11_ || i_11_ == class350.anInt3749 * 491753731 || class350.anInt3724 * -783166629 == i_11_ || i_11_ == class350.anInt3746 * -2054940183)
				i_10_ = class503.anInt6176 * -1390399277;
			else if (class350.anInt3755 * 328817727 == i_11_ || i_11_ == class350.anInt3722 * -1238642279 || i_11_ == 124010991 * class350.anInt3728 || -907666203 * class350.anInt3727 == i_11_)
				i_10_ = -904091095 * class503.anInt6174;
			return i_10_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.x(").append(')').toString());
		}
	}

	static Js5Archive[] method1399(byte i) {
		try {
			return (new Js5Archive[] { Js5Archive.aClass111_1346, Js5Archive.aClass111_1363, Js5Archive.aClass111_1329, Js5Archive.indicator_worldMap, Js5Archive.aClass111_1360, Js5Archive.aClass111_1335, Js5Archive.aClass111_1357, Js5Archive.aClass111_1347, Js5Archive.aClass111_1356, Js5Archive.aClass111_1343, Js5Archive.aClass111_1344, Js5Archive.aClass111_1351, Js5Archive.aClass111_1348, Js5Archive.aClass111_1333, Js5Archive.aClass111_1362, Js5Archive.aClass111_1358, Js5Archive.aClass111_1336, Js5Archive.aClass111_1352, Js5Archive.aClass111_1355, Js5Archive.aClass111_1365, Js5Archive.aClass111_1332, Js5Archive.aClass111_1334, Js5Archive.aClass111_1359, Js5Archive.aClass111_1349, Js5Archive.aClass111_1361, Js5Archive.aClass111_1350, Js5Archive.aClass111_1337, Js5Archive.aClass111_1339, Js5Archive.aClass111_1330, Js5Archive.aClass111_1345, Js5Archive.aClass111_1341, Js5Archive.aClass111_1354, Js5Archive.aClass111_1342, Js5Archive.aClass111_1331, Js5Archive.aClass111_1353, Js5Archive.aClass111_1338, Js5Archive.aClass111_1340 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.a(").append(')').toString());
		}
	}

	static final void method1400(int i, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, int i_16_) {
		try {
			if (!bool && (i_12_ < 512 || i_13_ < 512 || i_12_ > (GameClient.map.upperX(-2030738775) - 2) * 512 || i_13_ > (GameClient.map.upperY(346597058) - 2) * 512)) {
				float[] fs = GameClient.aFloatArray8891;
				GameClient.aFloatArray8891[1] = -1.0F;
				fs[0] = -1.0F;
			} else {
				int i_17_ = (Class356.method4271(i_12_, i_13_, i, -1332954611) - i_15_);
				GameClient.aClass222_8871.method2070(OverlayType.activeToolkit.method5044());
				GameClient.aClass222_8871.method2064((float) i_14_, 0.0F, 0.0F);
				OverlayType.activeToolkit.method5043(GameClient.aClass222_8871);
				if (bool)
					OverlayType.activeToolkit.method5060((float) i_12_, (float) i_17_, (float) i_13_, GameClient.aFloatArray8891);
				else
					OverlayType.activeToolkit.method5059((float) i_12_, (float) i_17_, (float) i_13_, GameClient.aFloatArray8891);
				GameClient.aClass222_8871.method2064((float) -i_14_, 0.0F, 0.0F);
				OverlayType.activeToolkit.method5043(GameClient.aClass222_8871);
				GameClient.aFloatArray8891[0] -= (float) (GameClient.anInt8936 * -1868355265);
				GameClient.aFloatArray8891[1] -= (float) (-689948187 * GameClient.anInt8747);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.jk(").append(')').toString());
		}
	}

	static int method1401(byte i) {
		try {
			if (GraphicsAutoSetup.clientPreferences.safemodePreference.getValue((byte) -102) == 0) {
				for (int i_18_ = 0; i_18_ < GameClient.anInt8894 * 1351936279; i_18_++) {
					if (GameClient.anInterface16Array8710[i_18_].method217((byte) -58) == 's' || GameClient.anInterface16Array8710[i_18_].method217((byte) -73) == 'S') {
						GraphicsAutoSetup.clientPreferences.method3540((GraphicsAutoSetup.clientPreferences.safemodePreference), 1, -669556569);
						GameClient.aBoolean8647 = true;
						break;
					}
				}
			}
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2538) {
				if (Class203.aClass225_2337 == null)
					Class203.aClass225_2337 = new Class225(Class248.aClass247_2752, Class365_Sub1_Sub3.aClass255_9804, Class50.aBigInteger502, Class50.aBigInteger501);
				if (!Class203.aClass225_2337.method2094(2031500180))
					return 0;
				Wall.method4533(0, null, true, (short) 256);
				Class230.aBoolean2567 = !Class78.method844((byte) 3);
				TimeUtils.aClass243_1466 = Class372.loadIndex((Class230.aBoolean2567 ? Js5Archive.aClass111_1363 : Js5Archive.aClass111_1361), false, 1, true, 1414942231);
				Class230.aClass243_2564 = Class372.loadIndex(Js5Archive.aClass111_1362, false, 1, true, 1414942231);
				Class173.aClass243_1758 = Class372.loadIndex(Js5Archive.aClass111_1342, false, 1, true, 1414942231);
			}
			if (Class227.aClass227_2531 == Class82_Sub6.aClass227_6843) {
				boolean bool = Class230.aClass243_2564.method2292(380717281);
				int i_19_ = OverlayType.aChecksumTableEntryArray4072[Js5Archive.aClass111_1362.method1233(1981547205)].method2270(1121322968);
				i_19_ = i_19_ + OverlayType.aChecksumTableEntryArray4072[(Class230.aBoolean2567 ? Js5Archive.aClass111_1363.method1233(-1014323373) : Js5Archive.aClass111_1361.method1233(-1736042893))].method2270(1121322968);
				i_19_ += OverlayType.aChecksumTableEntryArray4072[Js5Archive.aClass111_1342.method1233(-202973063)].method2270(1121322968);
				i_19_ = i_19_ + (bool ? 100 : Class230.aClass243_2564.method2293((byte) 4));
				if (i_19_ != 400)
					return i_19_ / 4;
				AnimationController.anInt4145 = (TimeUtils.aClass243_1466.method2285((byte) -31) * -1650604707);
				Class118.anInt1401 = (Class230.aClass243_2564.method2285((byte) -108) * 1003249155);
				Class70.method806(TimeUtils.aClass243_1466, (byte) 13);
				int i_20_ = GraphicsAutoSetup.clientPreferences.aCompressionType_7578.method5700(-463949651);
				Class420.aClass515_5344 = new Class515(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class230.aClass243_2564);
				Class510[] class510s = Class420.aClass515_5344.method6294(i_20_, -957350299);
				if (class510s.length == 0)
					class510s = Class420.aClass515_5344.method6294(0, -2070003816);
				Class143 class143 = new Class143(TimeUtils.aClass243_1466, Class173.aClass243_1758);
				if (class510s.length > 0) {
					Class230.anInterface12Array2562 = new Interface12[class510s.length];
					for (int i_21_ = 0; i_21_ < Class230.anInterface12Array2562.length; i_21_++)
						Class230.anInterface12Array2562[i_21_] = new Class229((Class420.aClass515_5344.method6295((-872036857 * class510s[i_21_].anInt6220), (byte) 89)), (722190409 * class510s[i_21_].anInt6218), (class510s[i_21_].anInt6219 * -1852131045), class143);
				}
			}
			if (Class227.aClass227_2532 == Class82_Sub6.aClass227_6843)
				Class497.aClass197_6105 = new Class197(TimeUtils.aClass243_1466, Class173.aClass243_1758, Class510.method6287(-1719059338));
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2533) {
				int i_22_ = Class497.aClass197_6105.method1877(2082019062);
				int i_23_ = Class497.aClass197_6105.method1878(1886749638);
				if (i_22_ < i_23_)
					return 100 * i_22_ / i_23_;
			}
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2534) {
				if (Class230.anInterface12Array2562 != null && Class230.anInterface12Array2562.length > 0) {
					if (Class230.anInterface12Array2562[0].method159((byte) 54) < 100)
						return 0;
					if (Class230.anInterface12Array2562.length > 1 && Class420.aClass515_5344.method6296((byte) -52) && Class230.anInterface12Array2562[1].method159((byte) 126) < 100)
						return 0;
				}
				Class497.aClass197_6105.method1882(GameClient.anInterface10_8700, (byte) 3);
				Class426.method5744(OverlayType.activeToolkit, -1001154805);
				Class439.method5851(11, -22830656);
			}
			if (Class227.aClass227_2535 == Class82_Sub6.aClass227_6843) {
				Class158.aClass243_6364 = Class372.loadIndex(Js5Archive.aClass111_1330, false, 1, false, 1414942231);
				Class491.aClass243_6080 = Class372.loadIndex(Js5Archive.aClass111_1339, false, 1, false, 1414942231);
				Class497.aClass243_6103 = Class372.loadIndex(Js5Archive.aClass111_1341, false, 1, false, 1414942231);
				Class284_Sub1.configsJs5 = Class372.loadIndex(Js5Archive.aClass111_1331, false, 1, true, 1414942231);
				Class160.aClass243_1647 = Class372.loadIndex(Js5Archive.aClass111_1332, false, 1, true, 1414942231);
				Class52.aClass243_507 = Class372.loadIndex(Js5Archive.aClass111_1359, false, 1, false, 1414942231);
				Class65.aClass243_665 = Class372.loadIndex(Js5Archive.aClass111_1334, true, 1, false, 1414942231);
				Class374_Sub1.aClass243_7731 = Class372.loadIndex(Js5Archive.aClass111_1335, true, 1, false, 1414942231);
				WorldTile.js5_models = Class372.loadIndex(Js5Archive.aClass111_1353, false, 1, false, 1414942231);
				Class127.aClass243_6377 = Class372.loadIndex(Js5Archive.aClass111_1338, false, 1, true, 1414942231);
				TimeUtils.js5_huffman = Class372.loadIndex(Js5Archive.aClass111_1336, false, 1, false, 1414942231);
				Class463.aClass243_5688 = Class372.loadIndex(Js5Archive.aClass111_1340, false, 1, false, 1414942231);
				Class377.aClass243_4092 = Class372.loadIndex(Js5Archive.aClass111_1351, false, 1, true, 1414942231);
				Class439.aClass243_5575 = Class372.loadIndex(Js5Archive.aClass111_1343, false, 1, false, 1414942231);
				Class114.aClass243_1381 = Class372.loadIndex(Js5Archive.aClass111_1344, false, 1, false, 1414942231);
				Class354.aClass243_3826 = Class372.loadIndex(Js5Archive.aClass111_1333, false, 1, true, 1414942231);
				Class521.aClass243_6281 = Class372.loadIndex(Js5Archive.aClass111_1346, false, 1, true, 1414942231);
				Class133.aClass243_1512 = Class372.loadIndex(Js5Archive.aClass111_1347, false, 1, true, 1414942231);
				Class92.aClass243_904 = Class372.loadIndex(Js5Archive.aClass111_1360, false, 1, true, 1414942231);
				Class260.aClass243_2819 = Class372.loadIndex(Js5Archive.aClass111_1348, false, 1, true, 1414942231);
				Class23.aClass243_326 = Class372.loadIndex(Js5Archive.aClass111_1350, false, 1, true, 1414942231);
				Class499.aClass243_6113 = Class372.loadIndex(Js5Archive.aClass111_1349, false, 1, true, 1414942231);
				Class_v.index_23_worldMap = Class372.loadIndex(Js5Archive.indicator_worldMap, true, 1, false, 1414942231);
				Class497.aClass243_6104 = Class372.loadIndex(Js5Archive.aClass111_1329, false, 1, true, 1414942231);
				Class266.aClass243_2855 = Class372.loadIndex(Js5Archive.aClass111_1354, false, 1, true, 1414942231);
				UnderlayTypeList.aClass243_5641 = Class372.loadIndex(Js5Archive.aClass111_1355, true, 1, true, 1414942231);
				Class51.aClass243_505 = Class372.loadIndex(Js5Archive.aClass111_1356, false, 1, true, 1414942231);
				Class399.aClass243_5219 = Class372.loadIndex(Js5Archive.aClass111_1357, true, 1, true, 1414942231);
				Skybox.aClass243_2965 = Class372.loadIndex(Js5Archive.aClass111_1345, false, 1, true, 1414942231);
				Class399.aClass243_5220 = Class372.loadIndex(Js5Archive.aClass111_1337, true, 1, false, 1414942231);
				Class97.aClass243_945 = Class372.loadIndex(Js5Archive.aClass111_1358, true, 1, false, 1414942231);
				Class82_Sub6.aClass243_6844 = Class372.loadIndex(Js5Archive.aClass111_1352, true, 1, true, 1414942231);
				VarClanTypeList.js5_index36 = Class372.loadIndex(Js5Archive.aClass111_1365, true, 2, false, 1414942231);
			}
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2536) {
				int i_24_ = 0;
				for (int i_25_ = 0; i_25_ < OverlayType.aChecksumTableEntryArray4072.length; i_25_++) {
					if (null != OverlayType.aChecksumTableEntryArray4072[i_25_])
						i_24_ += (OverlayType.aChecksumTableEntryArray4072[i_25_].method2270(1121322968) * Class230.anIntArray2568[i_25_] / 100);
				}
				if (i_24_ != 100) {
					if (Class230.anInt2565 * -1347166103 < 0)
						Class230.anInt2565 = 1430761433 * i_24_;
					return (100 * (i_24_ - Class230.anInt2565 * -1347166103) / (100 - Class230.anInt2565 * -1347166103));
				}
				Class379.method4673(Class158.aClass243_6364, 819988020);
				Class497.aClass197_6105 = new Class197(Class158.aClass243_6364, Class173.aClass243_1758, Class510.method6287(-1719059338));
			}
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2539) {
				byte[] is = Class399.aClass243_5219.method2294((-363169051 * (Class380.aClass380_4102.anInt4108)), (byte) 101);
				if (is == null)
					return 0;
				TileFlags.method2327(is, -1441857995);
				Class110.method1223(-1016382228);
				Class439.method5851(7, 907142690);
			}
			if (Class227.aClass227_2541 == Class82_Sub6.aClass227_6843) {
				VertexNormal.jagexLibraryManager = new JagexLibraryManager(Class97.aClass243_945);
				Class362.method4310(VertexNormal.jagexLibraryManager, (byte) 8);
			}
			if (Class227.aClass227_2530 == Class82_Sub6.aClass227_6843) {
				int i_26_ = Class354.method4259(-1857525316);
				if (i_26_ < 100)
					return i_26_;
				Class74.method824((Class399.aClass243_5219.method2294((Class380.aClass380_4103.anInt4108 * -363169051), (byte) 90)), 745625463);
				HashTable.aClass371_5520 = new Class371(Class399.aClass243_5219);
				Class366.aShortArrayArray3970 = HashTable.aClass371_5520.aShortArrayArray4039;
				Class22.aShortArrayArrayArray278 = HashTable.aClass371_5520.aShortArrayArrayArray4044;
				if (-1 != 1352949337 * HashTable.aClass371_5520.anInt4045 && -1 != 133542095 * HashTable.aClass371_5520.anInt4046) {
					GameClient.anInt8794 = -2081728285 * HashTable.aClass371_5520.anInt4045;
					GameClient.anInt8803 = HashTable.aClass371_5520.anInt4046 * 437692501;
				}
				Class82_Sub18.aClass405_6892 = new Class405(Class399.aClass243_5219);
				IdentityKitTypeList.aClass381_1563 = new Class381(Class399.aClass243_5219);
				HashTable.aClass377_5519 = new Class377(Class399.aClass243_5219);
			}
			if (Class227.aClass227_2537 == Class82_Sub6.aClass227_6843) {
				if (-1919698893 * HashTable.aClass371_5520.anInt4035 != -1 && !WorldTile.js5_models.method2290((-1919698893 * (HashTable.aClass371_5520.anInt4035)), 0, -1803759646))
					return 99;
				Class253.anInterface_ma2785 = new Class249(UnderlayTypeList.aClass243_5641, Class127.aClass243_6377, Class158.aClass243_6364);
				Class92.aClass504_905 = new Class504(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class94.aClass349_913 = new Class349(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5, Class82_Sub18.aClass405_6892);
				Class_na.aClass491_9686 = new Class491(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5, Class158.aClass243_6364);
				Class51.aClass475_506 = new Class475(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class521.aClass243_6281);
				Class504.aClass375_6196 = new FloTypeList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class151.aClass451_6358 = new UnderlayTypeList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class500.aClass347_6117 = new Class347(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5, Class158.aClass243_6364);
				Class212.aIdentityKitTypeList_2433 = new IdentityKitTypeList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5, WorldTile.js5_models);
				Class300.aClass518_3217 = new Class518(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class237.aClass499_6668 = new Class499(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class463.aClass433_5689 = new ObjectTypeList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, true, Class354.aClass243_3826, WorldTile.js5_models);
				GameClient.map.method2645(Class463.aClass433_5689, -18361497);
				overheadString.aClass248_612.method2379(new ObjectTypeList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, true, Class354.aClass243_3826, WorldTile.js5_models), 681479919);
				Class363.aWorldMapLabelList_3931 = new WorldMapLabelList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5, Class158.aClass243_6364);
				Js5ConfigGroup.aClass487_1463 = new Class487(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5, Class158.aClass243_6364);
				Class15.aClass507_224 = new Class507(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, true, Class133.aClass243_1512, WorldTile.js5_models);
				Class298_Sub32_Sub14.aClass477_9400 = new Class477(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, true, Class92.aClass504_905, Class92.aClass243_904, WorldTile.js5_models);
				Class316.aClass362_3318 = new Class362(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5, true);
				Class501.aClass395_6122 = new SeqTypeList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class260.aClass243_2819, Class491.aClass243_6080, Class497.aClass243_6103);
				VarBitType.aClass317_3472 = new Class317(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class138_Sub1.aClass131_7010 = new Class131(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class158_Sub1.aSpotAnimTypeList_8568 = new SpotAnimTypeList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class23.aClass243_326, WorldTile.js5_models);
				Class477.aClass500_6001 = new Class500(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5, true);
				Class412.aVarClientString_6574 = new VarClientString(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class320.aVarClientTypeList_6550 = new VarClientTypeList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class472.configLoader = new ConfigDefinitionLoader(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class499.aClass243_6113);
				Class440.aVarPlayerTypeList_5582 = new VarPlayerTypeList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				SceneryShadowPreference.aClass445_8384 = new Class445(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class82_Sub16.aClass427_6886 = new Class427(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class99.aVarClanTypeList_951 = new VarClanTypeList(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class299.aClanSettings_3199 = new ClanSettings(GameClient.aGameContext_8944, Class321.ACTIVE_LANGUAGE, Class284_Sub1.configsJs5);
				Class298_Sub24.method3080(Class160.aClass243_1647, WorldTile.js5_models, Class158.aClass243_6364, Class173.aClass243_1758, 995134055);
				Class_ta.method5997(Skybox.aClass243_2965, (byte) 9);
				GraphicsToolkit.aClass256_5315 = new Class256(Class321.ACTIVE_LANGUAGE, Class497.aClass243_6104, Class266.aClass243_2855);
				Class447.aClass469_5618 = new Class469(Class321.ACTIVE_LANGUAGE, Class497.aClass243_6104, Class266.aClass243_2855, new Class180());
				Class165.method1783(-980237906);
				Class128.aClass148_6331 = new Class148();
				Class359.method4294(1884668010);
				MapDecoder.method2231(Class501.aClass395_6122, 638864948);
				Class493.method6188(Class51.aClass243_505, -1530430191);
				overheadString.method727(WorldTile.js5_models, Class253.anInterface_ma2785, 2043056803);
				Huffman huffman = new Huffman(TimeUtils.js5_huffman.method2301("huffman", "", 1988047685));
				Class336_Sub6.method4107(huffman, -1778895275);
				GameShell.aClass309_6492 = LoginData.method4302(-1239681225);
				Class12.aClass298_Sub44_9946 = new Class298_Sub44(true);
			}
			if (Class227.aClass227_2540 == Class82_Sub6.aClass227_6843) {
				int i_27_ = (Class298_Sub32_Sub30.method3334(Class158.aClass243_6364, (byte) 34) + Class497.aClass197_6105.method1875(true, -249350940));
				int i_28_ = (Class273.method2565((short) 7611) + Class497.aClass197_6105.method1878(2124717791));
				if (i_27_ < i_28_)
					return i_27_ * 100 / i_28_;
			}
			if (Class227.aClass227_2542 == Class82_Sub6.aClass227_6843)
				WorldMap.method3690(Class_v.index_23_worldMap, Class504.aClass375_6196, Class151.aClass451_6358, GameClient.map.method2641(-1404290651), Class363.aWorldMapLabelList_3931, Js5ConfigGroup.aClass487_1463, Class128.aClass148_6331);
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2554) {
				Class374.anIntArray4078 = new int[-2088092255 * Class320.aVarClientTypeList_6550.files_count];
				Class254.aBooleanArray2790 = (new boolean[Class320.aVarClientTypeList_6550.files_count * -2088092255]);
				ClientScriptsExecutor.aStringArray4126 = (new String[1127111807 * Class412.aVarClientString_6574.files_count]);
				for (int i_29_ = 0; i_29_ < Class320.aVarClientTypeList_6550.files_count * -2088092255; i_29_++) {
					if ((Class320.aVarClientTypeList_6550.method6191(i_29_, (byte) -12).anInt5969) * 1043657149 == 0) {
						Class254.aBooleanArray2790[i_29_] = true;
						GameClient.anInt8890 += 1273319593;
					}
					Class374.anIntArray4078[i_29_] = -1;
				}
				SubIncommingPacket.readVarcs(915865311);
				Class65.aClass243_665.method2298(false, true, -176172929);
				Class374_Sub1.aClass243_7731.method2298(true, true, -158717020);
				Class158.aClass243_6364.method2298(true, true, -1968339968);
				Class173.aClass243_1758.method2298(true, true, -1788343139);
				TimeUtils.js5_huffman.method2298(true, true, -629544722);
				GameClient.aBoolean8672 = true;
			}
			if (Class227.aClass227_2544 == Class82_Sub6.aClass227_6843) {
				if (!Class378.method4671((HashTable.aClass371_5520.anInt4042 * 747461259), null, -2054647884))
					return 0;
				boolean bool = true;
				for (int i_30_ = 0; i_30_ < (SpotAnimTypeList.aRSInterfaceArray4165[747461259 * HashTable.aClass371_5520.anInt4042].aClass105Array1405).length; i_30_++) {
					IComponentDefinition class105 = (SpotAnimTypeList.aRSInterfaceArray4165[HashTable.aClass371_5520.anInt4042 * 747461259].aClass105Array1405[i_30_]);
					if (-1215239439 * class105.type == 5 && -1 != class105.anInt1175 * 1411971043 && !(Class158.aClass243_6364.method2290(1411971043 * class105.anInt1175, 0, -1154476799)))
						bool = false;
				}
				if (!bool)
					return 0;
			}
			if (Class227.aClass227_2545 == Class82_Sub6.aClass227_6843)
				Class501.method6227(true, -1028404543);
			if (Class227.aClass227_2546 == Class82_Sub6.aClass227_6843) {
				Class288_Sub1.aClass219_7147.method2042((byte) 25);
				try {
					Class459.aThread5674.join();
				} catch (InterruptedException interruptedexception) {
					return 0;
				}
				Class288_Sub1.aClass219_7147 = null;
				Class459.aThread5674 = null;
				TimeUtils.aClass243_1466 = null;
				Class230.aClass243_2564 = null;
				Class420.aClass515_5344 = null;
				Class230.anInterface12Array2562 = null;
				Class507.method6276(1677071566);
				GameClient.aBoolean8646 = GraphicsAutoSetup.clientPreferences.safemodePreference.getValue((byte) -47) == 1;
				GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.safemodePreference, 1, 807460534);
				if (GameClient.aBoolean8646)
					GraphicsAutoSetup.clientPreferences.method3540((GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570), 0, -91524334);
				else if ((GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570.aBoolean8398) && (399637415 * Class12.aClass298_Sub44_9946.cpuClockSpeed < 512) && (399637415 * Class12.aClass298_Sub44_9946.cpuClockSpeed != 0))
					GraphicsAutoSetup.clientPreferences.method3540((GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570), 0, -1214226075);
				Class3.writePreferences();
				if (GameClient.aBoolean8646)
					ClanSettings.method4578(0, false, 622850291);
				else
					ClanSettings.method4578(GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570.getValue(-1847672596), false, 622850291);
				Class357.method4276(GraphicsAutoSetup.clientPreferences.aClass422_Sub12_7543.method5669((byte) 12), -1, -1, false, -107949513);
				Class497.aClass197_6105.method1882(GameClient.anInterface10_8700, (byte) 3);
				Class426.method5744(OverlayType.activeToolkit, -1188868944);
				ErrorContext.method4173(OverlayType.activeToolkit, Class158.aClass243_6364, 498152714);
				Class_ta_Sub2.method6001(Class130_Sub2.aClass57Array6959, -1481526948);
			}
			return Class522.method6324(205846067);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.d(").append(')').toString());
		}
	}

	static final int method1402(int i, int i_31_) {
		try {
			int i_32_ = i & 0x3f;
			int i_33_ = i >> 6 & 0x3;
			if (i_32_ == 18) {
				if (i_33_ == 0)
					return 1;
				if (1 == i_33_)
					return 2;
				if (2 == i_33_)
					return 4;
				if (3 == i_33_)
					return 8;
			} else if (i_32_ == 19 || 21 == i_32_) {
				if (0 == i_33_)
					return 16;
				if (1 == i_33_)
					return 32;
				if (i_33_ == 2)
					return 64;
				if (3 == i_33_)
					return 128;
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fb.ib(").append(')').toString());
		}
	}
}
