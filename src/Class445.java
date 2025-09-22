/* Class445 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class445 {
	Js5 aClass243_5609;
	CachingHashMap aClass348_5610 = new CachingHashMap(64);

	public void method5891(int i) {
		try {
			synchronized (((Class445) this).aClass348_5610) {
				((Class445) this).aClass348_5610.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "sj.p(" + ')');
		}
	}

	public Class485 method5892(int i, int i_0_) {
		try {
			Class485 class485;
			synchronized (((Class445) this).aClass348_5610) {
				class485 = (Class485) ((Class445) this).aClass348_5610.get((long) i);
			}
			if (null != class485)
				return class485;
			byte[] is = ((Class445) this).aClass243_5609.getFileFromArchive(((Js5ConfigGroup.aClass120_1411.anInt1460) * -1006924897), i, (byte) -50);
			class485 = new Class485();
			if (null != is)
				class485.method6143(new Packet(is), 905111826);
			synchronized (((Class445) this).aClass348_5610) {
				((Class445) this).aClass348_5610.put(class485, (long) i);
			}
			return class485;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "sj.a(" + ')');
		}
	}

	public void method5893(int i) {
		try {
			synchronized (((Class445) this).aClass348_5610) {
				((Class445) this).aClass348_5610.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "sj.f(" + ')');
		}
	}

	public void method5894(int i, byte i_1_) {
		try {
			synchronized (((Class445) this).aClass348_5610) {
				((Class445) this).aClass348_5610.method4186(i, 187343477);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "sj.b(" + ')');
		}
	}

	public Class445(GameContext gameContext, Language language, Js5 class243) {
		((Class445) this).aClass243_5609 = class243;
		if (null != ((Class445) this).aClass243_5609)
			((Class445) this).aClass243_5609.method2316(Js5ConfigGroup.aClass120_1411.anInt1460 * -1006924897, 1281975621);
	}

	static void consoleUI(GraphicsToolkit toolkit, byte i) {
		try {
			toolkit.r(0, 0, -2110394505 * Class462.canvasWidth, 350);
			toolkit.drawFilledBox(0, 0, -2110394505 * Class462.canvasWidth, 350, DevConsoleState.anInt98 * 256666041 << 24 | Settings.CONSOLE_COLOR, 1);
			int i_2_ = 350 / (376067837 * DevConsoleState.secondaryLineHeight);
			if (DevConsoleState.lineCount * -2035787443 > 0) {
				int i_3_ = 346 - 376067837 * DevConsoleState.secondaryLineHeight - 4;
				int i_4_ = i_3_ * i_2_ / (i_2_ + -2035787443 * DevConsoleState.lineCount - 1);
				int four = 4; //stupid shit lmao
				if (-2035787443 * DevConsoleState.lineCount > 1)
					four += ((-2035787443 * DevConsoleState.lineCount - 1 - DevConsoleState.scrollOffset * -1731316011) * (i_3_ - i_4_) / (DevConsoleState.lineCount * -2035787443 - 1));
				toolkit.drawFilledBox(Class462.canvasWidth * -2110394505 - 16, four, 12, i_4_, DevConsoleState.anInt98 * 256666041 << 24 | Settings.CONSOLE_SCROLLBAR_COLOR, 2);
				for (int i_6_ = -1731316011 * DevConsoleState.scrollOffset; (i_6_ < -1731316011 * DevConsoleState.scrollOffset + i_2_ && i_6_ < -2035787443 * DevConsoleState.lineCount); i_6_++) {
					String[] strings = SceneObject.splitText((DevConsoleState.lines[i_6_]), '\010', 846052986);
					int i_7_ = ((-2110394505 * Class462.canvasWidth - 8 - 16) / strings.length);
					for (int i_8_ = 0; i_8_ < strings.length; i_8_++) {
						int i_9_ = 8 + i_7_ * i_8_;
						toolkit.r(i_9_, 0, i_9_ + i_7_ - 8, 350);
						Class343.aClass264_3673.method2488(Class117.method1276(strings[i_8_], (byte) 76), i_9_, (350 - DevConsoleState.primaryLineHeight * 1194411673 - 2 - (-1883958527 * RemoveRoofPreference.CONSOLE_SECONDARY_FONT.descent) - (376067837 * DevConsoleState.secondaryLineHeight * (i_6_ - DevConsoleState.scrollOffset * -1731316011))), -1, -16777216, 2087345638);
					}
				}
			}
			ScriptContext.aClass264_7534.method2474(Settings.CONSOLE_RIGHT_TEXT, -2110394505 * Class462.canvasWidth - 25, 330, -1, -16777216, (byte) -63);
			toolkit.r(0, 0, Class462.canvasWidth * -2110394505, 350);
			toolkit.method4990(0, 350 - DevConsoleState.primaryLineHeight * 1194411673, Class462.canvasWidth * -2110394505, -1, -2042566638);
			Class101.aClass264_1084.method2488(Settings.CONSOLE_CARET + Class117.method1276(DevConsoleState.aString101, (byte) -1), 10, (350 - GroundSpotAnimUpdate.CONSOLE_PRIMARY_FONT.descent * -1883958527 - 1), -1, -16777216, -10016873);
			if (SceneryShadowPreference.aBoolean8385) {
				int i_10_ = -1;
				if (443738891 * GameClient.anInt8884 % 30 > 15)
					i_10_ = 16777215;
				toolkit.method5035((10 + (GroundSpotAnimUpdate.CONSOLE_PRIMARY_FONT.method6264(Settings.CONSOLE_CARET + Class117.method1276(DevConsoleState.aString101, (byte) 58).substring(0, DevConsoleState.anInt99 * -1182747927), -949897299))), 350 - -1883958527 * (GroundSpotAnimUpdate.CONSOLE_PRIMARY_FONT.descent) - 11, 12, i_10_, (short) 26562);
			}
			toolkit.L();
			Class98_Sub2.method1061(-1132401323);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "sj.s(" + ')');
		}
	}

	static final void method5896(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			GameMap.method2677(class105, RSInterface, class403, (byte) 32);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "sj.mo(" + ')');
		}
	}

	public static boolean method5897(Js5 class243, Js5 class243_11_, Js5 class243_12_, Class298_Sub19_Sub1 class298_sub19_sub1, Class284 class284, byte i) {
		try {
			Class79.aClass243_747 = class243;
			Class79.aClass243_735 = class243_11_;
			Class79.aClass243_736 = class243_12_;
			Class79.aClass298_Sub19_Sub1_737 = class298_sub19_sub1;
			Class79.aClass284_738 = class284;
			Class298_Sub10.anIntArray7229 = new int[16];
			for (int i_13_ = 0; i_13_ < 16; i_13_++)
				Class298_Sub10.anIntArray7229[i_13_] = 255;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "sj.a(" + ')');
		}
	}
}
