/* Class128_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class128_Sub1 extends Class128 {
	public int anInt8553;
	public int anInt8554;
	public static Packet aClass298_Sub53_8555;
	static int anInt8556;
	static int anInt8557;

	public Class146 method49(int i) {
		try {
			return Class146.aClass146_1566;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("zp.f(").append(')').toString());
		}
	}

	Class128_Sub1(Class139 class139, Class133 class133, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		super(class139, class133, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		anInt8554 = i_7_ * -1922246779;
		anInt8553 = i_8_ * 957497283;
	}

	public Class146 method51() {
		return Class146.aClass146_1566;
	}

	public Class146 method50() {
		return Class146.aClass146_1566;
	}

	static int method1439(int i, int i_9_, int i_10_) {
		try {
			int i_11_;
			if (i_9_ > 20074) {
				Class116.method1272(774098447);
				i_11_ = 4;
			} else if (i_9_ > 10033) {
				Class302_Sub3.method3722((short) 24043);
				i_11_ = 3;
			} else if (i_9_ > 5030) {
				Class320.method3910(-793746149);
				i_11_ = 2;
			} else {
				Class69.method788(true, -1704666042);
				i_11_ = 1;
			}
			if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-1134958501) != i) {
				GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570, i, -1879623145);
				ClanSettings.method4578(i, false, 622850291);
			} else
				GraphicsAutoSetup.clientPreferences.method3539(GraphicsAutoSetup.clientPreferences.graphicsPreference, true, -2138702215);
			Class3.writePreferences();
			return i_11_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("zp.k(").append(')').toString());
		}
	}

	public static String method1440(int i, boolean bool, byte i_12_) {
		try {
			if (!bool || i < 0)
				return Integer.toString(i);
			return Class321.method3923(i, 10, bool, 1472954804);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("zp.u(").append(')').toString());
		}
	}
}
