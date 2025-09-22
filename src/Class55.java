/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55 {
	public int anInt556;
	public static Class55 aClass55_557;
	public static Class55 aClass55_558;
	public static Class55 aClass55_559;
	public static Class55 aClass55_560 = new Class55(5, 3);
	public static Class55 aClass55_561;
	static Class55 aClass55_562;
	static Class55 aClass55_563;
	public static Class55 aClass55_564;
	public static Class55 aClass55_565;
	public int anInt566;
	public static Class55 aClass55_567;

	static {
		aClass55_557 = new Class55(9, 4);
		aClass55_567 = new Class55(7, 1);
		aClass55_559 = new Class55(1, 1);
		aClass55_565 = new Class55(3, 2);
		aClass55_561 = new Class55(2, 1);
		aClass55_562 = new Class55(6, 3);
		aClass55_563 = new Class55(4, 4);
		aClass55_564 = new Class55(8, 1);
		aClass55_558 = new Class55(0, 1);
	}

	Class55(int i, int i_0_) {
		anInt566 = i * -57892181;
		anInt556 = i_0_ * -1192469397;
	}

	static final void method603(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			AnimationController.method4725(Class287.myPlayer, (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 * 681479919)]), (((ClientScript2) class403).anIntArray5244[(681479919 * ((ClientScript2) class403).anInt5239 + 1)]), -16777216);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ce.sm(").append(')').toString());
		}
	}

	static final void method604(ClientScript2 class403, byte i) {
		try {
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aGraphicsSetup_7569, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), -2054835114);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ce.aie(").append(')').toString());
		}
	}

	static final void method605(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class359.method4292(class105, RSInterface, class403, (byte) -16);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ce.no(").append(')').toString());
		}
	}

	static void method606(String[] strings, int i) {
		try {
			if (strings.length > 1) {
				for (int i_1_ = 0; i_1_ < strings.length; i_1_++) {
					if (strings[i_1_].startsWith("pause")) {
						int i_2_ = 5;
						try {
							i_2_ = Integer.parseInt(strings[i_1_].substring(6));
						} catch (Exception exception) {
							/* empty */
						}
						DevConsole.sendDevConsoleMsg(new StringBuilder().append("Pausing for ").append(i_2_).append(" seconds...").toString());
						DevConsoleState.aStringArray109 = strings;
						DevConsoleState.anInt104 = -1428832631 * (i_1_ + 1);
						Class146.aLong1576 = (TimeUtils.getTime((byte) 1) + (long) (i_2_ * 1000)) * 6717445677357895093L;
						break;
					}
					DevConsoleState.aString101 = strings[i_1_];
					Class142.method1568(false, 1496417723);
				}
			} else {
				DevConsoleState.aString101 = new StringBuilder().append(DevConsoleState.aString101).append(strings[0]).toString();
				DevConsoleState.anInt99 += strings[0].length() * 1914783065;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ce.d(").append(')').toString());
		}
	}

	static void method607(int i) {
		try {
			if (-1217082313 * DevConsoleState.anInt105 > 0) {
				int i_3_ = 0;
				for (int i_4_ = 0; i_4_ < DevConsoleState.lines.length; i_4_++) {
					if (DevConsoleState.lines[i_4_].indexOf("--> ") != -1 && ++i_3_ == DevConsoleState.anInt105 * -1217082313) {
						DevConsoleState.aString101 = (DevConsoleState.lines[i_4_].substring(DevConsoleState.lines[i_4_].indexOf('>') + 2));
						break;
					}
				}
			} else
				DevConsoleState.aString101 = "";
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ce.x(").append(')').toString());
		}
	}
}
