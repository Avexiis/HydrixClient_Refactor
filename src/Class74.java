/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class74 {
	static int anInt690;
	static int anInt691;
	static int anInt692;
	static int anInt693;
	static int anInt694;
	static Class505 aClass505_695;
	static int anInt696;
	static int anInt697;
	static int anInt698;
	static Class57[] aClass57Array699;
	public static Class57 aClass57_700;

	Class74() throws Throwable {
		throw new Error();
	}

	public static int method823(int i) {
		try {
			return Class288_Sub1.aClass219_7147.method2033(1397176668);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("d.p(").append(')').toString());
		}
	}

	static void method824(byte[] is, int i) {
		try {
			Packet class298_sub53 = new Packet(is);
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i == -1819630218)
						throw new IllegalStateException();
					break;
				}
				if (1 == i_0_) {
					int[] is_1_ = AtmosphereManager.INITIAL_COLORS = new int[6];
					is_1_[0] = class298_sub53.readUnsignedShort();
					is_1_[1] = class298_sub53.readUnsignedShort();
					is_1_[2] = class298_sub53.readUnsignedShort();
					is_1_[3] = class298_sub53.readUnsignedShort();
					is_1_[4] = class298_sub53.readUnsignedShort();
					is_1_[5] = class298_sub53.readUnsignedShort();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("d.u(").append(')').toString());
		}
	}

	static Class320[] method825(int i) {
		try {
			return (new Class320[] { Class320.aClass320_6548, Class320.aClass320_6547 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("d.a(").append(')').toString());
		}
	}

	static final void method826(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class301_Sub1.method3712(class105, RSInterface, class403, (byte) 5);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("d.dy(").append(')').toString());
		}
	}

	static final void method827(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.characterShadowPreference.method5692((byte) 0) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("d.anu(").append(')').toString());
		}
	}

	static final void method828(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.fogPreference.method5632((byte) -40) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("d.ang(").append(')').toString());
		}
	}

	static final void method829(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class201.method1902((byte) 89);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("d.ajt(").append(')').toString());
		}
	}

	public static void method830(int i, int i_2_, int i_3_, boolean bool, int i_4_) {
		try {
			if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-1456138007) != 0) {
				Class301_Sub1.anInt7626 = GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-993679742) * 485258093;
				ClanSettings.method4578(0, true, 622850291);
			} else
				Class423.method5733(false, 1336561252);
			Class301_Sub1.anInt7629 = -1801430445 * i_2_;
			Class301_Sub1.anInt7623 = i_3_ * -1505298155;
			Class301_Sub1.aBoolean7631 = bool;
			Class301_Sub1.method3692(i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("d.cd(").append(')').toString());
		}
	}

	static void method831(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			float f = ((float) Class301_Sub1.worldMapHeight / (float) Class301_Sub1.worldMapWidth);
			int i_9_ = i_6_;
			int i_10_ = i_7_;
			if (f < 1.0F)
				i_10_ = (int) (f * (float) i_6_);
			else
				i_9_ = (int) ((float) i_7_ / f);
			i -= (i_6_ - i_9_) / 2;
			i_5_ -= (i_7_ - i_10_) / 2;
			Class82_Sub14.anInt6875 = -2076584633 * (Class301_Sub1.worldMapWidth * i / i_9_);
			VarClanSettings.anInt4090 = -435591305 * (Class301_Sub1.worldMapHeight - Class301_Sub1.worldMapHeight * i_5_ / i_10_);
			Class301_Sub1.anInt7632 = 433609607;
			Class301_Sub1.anInt7627 = 789877945;
			Class225.method2103(65536);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("d.cv(").append(')').toString());
		}
	}

	static void method832(int i, int i_11_, IComponentDefinition class105, Class117 class117, int i_12_, int i_13_, int i_14_) {
		try {
			HintIcon[] hintIcons = GameClient.hintIcons;
			for (int i_15_ = 0; i_15_ < hintIcons.length; i_15_++) {
				HintIcon hintIcon = hintIcons[i_15_];
				if (hintIcon != null && 0 != hintIcon.anInt266 * 958933333 && GameClient.anInt8884 * 443738891 % 20 < 10) {
					if (1 == 958933333 * hintIcon.anInt266) {
						LinkableObject linkableObject = ((LinkableObject) (GameClient.npcs.get((long) (-841622081 * hintIcon.anInt256))));
						if (null != linkableObject) {
							NPC class365_sub1_sub1_sub2_sub1 = ((NPC) linkableObject.anObject7366);
							SceneObjectPosition sceneObjectPosition = (class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599);
							int i_16_ = (int) sceneObjectPosition.x / 128 - i / 128;
							int i_17_ = ((int) sceneObjectPosition.z / 128 - i_11_ / 128);
							Class397.method4914(class105, class117, i_12_, i_13_, i_16_, i_17_, -92466201 * ((HintIcon) hintIcon).anInt258, 360000L);
						}
					}
					if (hintIcon.anInt266 * 958933333 == 2) {
						int i_18_ = hintIcon.anInt260 * -1338192389 / 128 - i / 128;
						int i_19_ = (hintIcon.anInt261 * 1018128075 / 128 - i_11_ / 128);
						long l = (long) (hintIcon.anInt257 * 2140036693 << 7);
						l *= l;
						Class397.method4914(class105, class117, i_12_, i_13_, i_18_, i_19_, (((HintIcon) hintIcon).anInt258 * -92466201), l);
					}
					if (10 == 958933333 * hintIcon.anInt266 && -841622081 * hintIcon.anInt256 >= 0 && (hintIcon.anInt256 * -841622081 < (GameClient.players).length)) {
						Player class365_sub1_sub1_sub2_sub2 = (GameClient.players[-841622081 * hintIcon.anInt256]);
						if (null != class365_sub1_sub1_sub2_sub2) {
							SceneObjectPosition sceneObjectPosition = (class365_sub1_sub1_sub2_sub2.method4337().aSceneObjectPosition_2599);
							int i_20_ = (int) sceneObjectPosition.x / 128 - i / 128;
							int i_21_ = ((int) sceneObjectPosition.z / 128 - i_11_ / 128);
							Class397.method4914(class105, class117, i_12_, i_13_, i_20_, i_21_, (((HintIcon) hintIcon).anInt258 * -92466201), 360000L);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("d.s(").append(')').toString());
		}
	}
}
