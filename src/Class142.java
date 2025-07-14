/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class142 {
	String aString1552;
	String aString1553;
	String aString1554;

	Class142(String string, String string_0_, String string_1_) {
		((Class142) this).aString1553 = string;
		((Class142) this).aString1554 = string_0_;
		((Class142) this).aString1552 = string_1_;
	}

	static void method1568(boolean bool, int i) {
		try {
			if (Class8.aString101.length() != 0) {
				Class255.sendDevConsoleMsg(new StringBuilder().append("--> ").append(Class8.aString101).toString(), 1401138202);
				Class419.method5605(Class8.aString101, false, bool, 1788237828);
				Class8.anInt105 = 0;
				if (!bool) {
					Class8.anInt99 = 0;
					Class8.aString101 = "";
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ft.q(").append(')').toString());
		}
	}

	static final void method1569(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			OutgoingPacket.method1893(class105, RSInterface, class403, (byte) -4);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ft.jf(").append(')').toString());
		}
	}

	static final void method1570(int i, int i_2_, int i_3_, int i_4_, boolean bool, int i_5_) {
		try {
			if (GameClient.map.method2675(-1611682495) == null)
				OverlayType.activeToolkit.method5015(i, i_2_, i_3_, i_4_, -16777216, (byte) 7);
			else {
				SceneObjectPosition sceneObjectPosition = (Class287.myPlayer.method4337().aSceneObjectPosition_2599);
				boolean bool_6_ = false;
				if (3 != 1596783995 * GameClient.cutsceneStage) {
					if (!GameClient.aBoolean8725)
						bool_6_ = true;
				} else if ((int) sceneObjectPosition.x < 0 || ((int) sceneObjectPosition.x >= GameClient.map.upperX(-2116251282) * 512) || (int) sceneObjectPosition.z < 0 || ((int) sceneObjectPosition.z >= (GameClient.map.upperY(978326552) * 512)))
					bool_6_ = true;
				if (bool_6_)
					OverlayType.activeToolkit.method5015(i, i_2_, i_3_, i_4_, -16777216, (byte) 7);
				else {
					GameClient.anInt8777 += 859732235;
					if (null != Class287.myPlayer && ((int) sceneObjectPosition.x - (Class287.myPlayer.getSize() - 1) * 256) >> 9 == Class3.anInt62 * 2076926079 && (((int) sceneObjectPosition.z - (Class287.myPlayer.getSize() - 1) * 256) >> 9 == -376303645 * Class3.anInt54)) {
						Class3.anInt62 = 1129029761;
						Class3.anInt54 = 1835291189;
						Class319.method3904(-1897244526);
					}
					Class80.method855((byte) 35);
					if (!bool)
						Class14.method346((byte) -26);
					Class298_Sub36.method3401(i, i_2_, i_3_, i_4_, true, 646093136);
					i = GameClient.anInt8936 * -1868355265;
					i_2_ = GameClient.anInt8747 * -689948187;
					i_3_ = GameClient.anInt8664 * -505673857;
					i_4_ = 1387083365 * GameClient.anInt8939;
					TextureOperation.method3138(i, i_2_, (byte) -46);
					if (ObjectDeque.anInt7164 * -863531439 == 4) {
						int i_7_ = (int) GameClient.aFloat8757;
						if (-523207831 * GameClient.anInt8764 >> 8 > i_7_)
							i_7_ = GameClient.anInt8764 * -523207831 >> 8;
						if (GameClient.aBooleanArray8684[4] && GameClient.anIntArray8925[4] + 128 > i_7_)
							i_7_ = 128 + GameClient.anIntArray8925[4];
						int i_8_ = ((-1419578297 * GameClient.anInt8744 + (int) GameClient.aFloat8949) & 0x3fff);
						Class482.method6121(1103750049 * Class75.anInt708, Class356.method4271((int) sceneObjectPosition.x, (int) sceneObjectPosition.z, Class99.anInt952 * 1855729883, -1979916029) - 200, Class106.anInt1309 * 1346160791, i_7_, i_8_, (i_7_ >> 3) * 3 + 600 << 2, i_4_, -1059521295);
					} else if (2 == -863531439 * ObjectDeque.anInt7164) {
						int i_9_ = (int) GameClient.aFloat8757;
						if (-523207831 * GameClient.anInt8764 >> 8 > i_9_)
							i_9_ = -523207831 * GameClient.anInt8764 >> 8;
						if (GameClient.aBooleanArray8684[4] && 128 + GameClient.anIntArray8925[4] > i_9_)
							i_9_ = 128 + GameClient.anIntArray8925[4];
						int i_10_ = (int) GameClient.aFloat8949 & 0x3fff;
						Class482.method6121(Class75.anInt708 * 1103750049, Class356.method4271((-2080858977 * GameClient.anInt8753), 1818837461 * GameClient.anInt8755, 1855729883 * Class99.anInt952, -898849874) - 200, Class106.anInt1309 * 1346160791, i_9_, i_10_, 3 * (i_9_ >> 3) + 600 << 2, i_4_, -1059521295);
					} else if (5 == -863531439 * ObjectDeque.anInt7164)
						Class50.method535(i_4_, (byte) 0);
					int i_11_ = Class367.anInt4000 * -1740717447;
					int i_12_ = Class110.anInt6403 * 1449634147;
					int i_13_ = -299812095 * Class146.anInt1575;
					int i_14_ = GameClient.anInt8756 * -104436553;
					int i_15_ = Class135.anInt6384 * -1847894591;
					for (int i_16_ = 0; i_16_ < 5; i_16_++) {
						if (GameClient.aBooleanArray8684[i_16_]) {
							int i_17_ = (int) ((Math.random() * (double) (2 * (GameClient.anIntArray8860[i_16_]) + 1)) - (double) (GameClient.anIntArray8860[i_16_]) + ((Math.sin((double) (GameClient.anIntArray8790[i_16_]) * ((double) (GameClient.anIntArray8926[i_16_]) / 100.0))) * (double) (GameClient.anIntArray8925[i_16_])));
							if (i_16_ == 0)
								Class367.anInt4000 += (i_17_ << 2) * 547882953;
							if (i_16_ == 1)
								Class110.anInt6403 += 1078403147 * (i_17_ << 2);
							if (2 == i_16_)
								Class146.anInt1575 += 309839105 * (i_17_ << 2);
							if (i_16_ == 3)
								Class135.anInt6384 = (i_17_ + Class135.anInt6384 * -1847894591 & 0x3fff) * -1587695039;
							if (4 == i_16_) {
								GameClient.anInt8756 += -648269561 * i_17_;
								if (GameClient.anInt8756 * -104436553 < 1024)
									GameClient.anInt8756 = 1891900416;
								else if (-104436553 * GameClient.anInt8756 > 3072)
									GameClient.anInt8756 = 1380733952;
							}
						}
					}
					if (-1740717447 * Class367.anInt4000 < 0)
						Class367.anInt4000 = 0;
					if (Class367.anInt4000 * -1740717447 > ((GameClient.map.method2675(-1611682495).anInt3514) * 1988988347 << 9) - 1)
						Class367.anInt4000 = (((GameClient.map.method2675(-1611682495).anInt3514) * 1988988347 << 9) - 1) * 547882953;
					if (-299812095 * Class146.anInt1575 < 0)
						Class146.anInt1575 = 0;
					if (-299812095 * Class146.anInt1575 > ((GameClient.map.method2675(-1611682495).anInt3549) * 1340714547 << 9) - 1)
						Class146.anInt1575 = (((GameClient.map.method2675(-1611682495).anInt3549) * 1340714547 << 9) - 1) * 309839105;
					GraphicsPresetPreference.method5710(332559800);
					OverlayType.activeToolkit.method5187(i, i_2_, i_3_, i_4_);
					OverlayType.activeToolkit.r(i, i_2_, i + i_3_, i_2_ + i_4_);
					Atmosphere atmosphere = GameClient.map.method2640((byte) 15).getCurrentAtmosphere((byte) -16);
					int i_18_ = atmosphere.getFogColor(-461488593);
					GameClient.aClass222_8871.method2062((float) -(Class367.anInt4000 * -1740717447), (float) -(1449634147 * Class110.anInt6403), (float) -(Class146.anInt1575 * -299812095));
					GameClient.aClass222_8871.method2071(0.0F, -1.0F, 0.0F, Class220.method2049(-(Class135.anInt6384 * -1847894591) & 0x3fff));
					GameClient.aClass222_8871.method2071(-1.0F, 0.0F, 0.0F, Class220.method2049(-(GameClient.anInt8756 * -104436553) & 0x3fff));
					GameClient.aClass222_8871.method2071(0.0F, 0.0F, -1.0F, Class220.method2049(-(-1466297851 * Class229.anInt6458) & 0x3fff));
					OverlayType.activeToolkit.method5043(GameClient.aClass222_8871);
					Class82_Sub7.method889(GameClient.aClass233_8658, true, (float) (i_3_ / 2), (float) (i_4_ / 2), (float) (-2134375937 * GameClient.anInt8940 << 1), (float) (-2134375937 * GameClient.anInt8940 << 1), i_3_, i_4_, 1807453020);
					OverlayType.activeToolkit.method5182(GameClient.aClass233_8658);
					if (atmosphere.getSkybox((byte) -25) != null) {
						OverlayType.activeToolkit.IA(1.0F);
						OverlayType.activeToolkit.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
						atmosphere.getSkybox((byte) -99).method2591(OverlayType.activeToolkit, Class163.anInt1685 * -1285178091 << 3, i, i_2_, i_3_, i_4_, GameClient.anInt8756 * -104436553, Class135.anInt6384 * -1847894591, Class229.anInt6458 * -1466297851, i_18_, true, false, (byte) -49);
					} else
						OverlayType.activeToolkit.ba(3, i_18_);
					Class298_Sub40_Sub13.method3518(GameClient.aClass222_8871, GameClient.aClass233_8658, i_3_, i_4_, -1854574289);
					GameClient.map.method2640((byte) -11).updateAtmosphereScene(GameClient.map, -1036263435);
					byte i_19_ = (GraphicsAutoSetup.clientPreferences.aClass422_Sub17_7565.method5689(-2013953489) == 2 ? (byte) (-1953789277 * GameClient.anInt8777) : (byte) 1);
					GameClient.map.method2675(-1611682495).method4040(GameClient.anInt8884 * 443738891, Class367.anInt4000 * -1740717447, 1449634147 * Class110.anInt6403, Class146.anInt1575 * -299812095, GameClient.map.method2642(1646760373), GameClient.anIntArray8793, GameClient.anIntArray8670, GameClient.anIntArray8795, GameClient.anIntArray8641, GameClient.anIntArray8797, 1 + (Class287.myPlayer.plane), i_19_, (int) sceneObjectPosition.x >> 9, (int) sceneObjectPosition.z >> 9, GraphicsAutoSetup.clientPreferences.flickeringPreference.method5655(2137164627) == 0, true, 0, true);
					GameClient.anInt8723 += -2109562397;
					Class247.method2365(170542119);
					if (0 == -1233866115 * GameClient.anInt8752) {
						Class223.method2084(i, i_2_, i_3_, i_4_, 256, 256, -16777216);
						MapDecoder.method2232(i, i_2_, i_3_, i_4_, 256, 256, (byte) 46);
						Class492.method6182(i, i_2_, i_3_, i_4_, 256, 256, 996259282);
						Class251.method2406(i, i_2_, i_3_, i_4_, 373406666);
					}
					GameClient.map.method2675(-1611682495).method4010(843420871);
					GameClient.aBoolean8917 = false;
					Class367.anInt4000 = i_11_ * 547882953;
					Class110.anInt6403 = i_12_ * 1078403147;
					Class146.anInt1575 = 309839105 * i_13_;
					GameClient.anInt8756 = -648269561 * i_14_;
					Class135.anInt6384 = -1587695039 * i_15_;
					if (GameClient.aBoolean8663 && Class248.aClass247_2752.method2348(1533564172) == 0)
						GameClient.aBoolean8663 = false;
					if (GameClient.aBoolean8663) {
						OverlayType.activeToolkit.method5015(i, i_2_, i_3_, i_4_, -16777216, (byte) 7);
						Class139.method1548((LocalizedString.MESSAGE_LOADING_PLEASE_WAIT.getText(Class321.ACTIVE_LANGUAGE, -875414210)), false, OverlayType.activeToolkit, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) 34);
					}
					Class82_Sub7.method889(GameClient.aClass233_8658, false, (float) (i_3_ / 2 + i), (float) (i_4_ / 2 + i_2_), (float) (-2134375937 * GameClient.anInt8940 << 1), (float) (-2134375937 * GameClient.anInt8940 << 1), i_3_, i_4_, -725589740);
					OverlayType.activeToolkit.method5182(GameClient.aClass233_8658);
					Class252.method2410(GameClient.aClass233_8658, -760797041);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ft.in(").append(')').toString());
		}
	}

	static Class505 method1571(int i) {
		try {
			Class505 class505;
			if (ContextMenu.aBoolean5496) {
				if (null != Class65.aClass264_664 && Class211.aClass505_2420 != null)
					class505 = Class211.aClass505_2420;
				else
					class505 = Class82_Sub19_Sub1.aClass505_9111;
			} else
				class505 = Class82_Sub19_Sub1.aClass505_9111;
			ContextMenu.anInt5467 = (1791243901 * class505.anInt6197 + 2030544143 * class505.anInt6202);
			return class505;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ft.n(").append(')').toString());
		}
	}
}
