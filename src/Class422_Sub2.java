/* Class422_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class Class422_Sub2 extends IntegerPreferenceField {
	public static int anInt8367 = 1;
	public static int anInt8368 = 0;
	public static Class505 aClass505_8369;

	public void method5627(int i) {
		try {
			if (aGamePreferences_5346.method3541((byte) -7) != GameContext.aGameContext_5320)
				anInt5350 = 1886334997;
			if (0 != -1598873795 * anInt5350 && 1 != anInt5350 * -1598873795)
				anInt5350 = method5611(-993111338) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adc.s(").append(')').toString());
		}
	}

	public Class422_Sub2(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	public int method5616(int i) {
		if (aGamePreferences_5346.method3541((byte) -16) == GameContext.aGameContext_5320)
			return 1;
		return 3;
	}

	public boolean method5628(byte i) {
		try {
			if (aGamePreferences_5346.method3541((byte) -10) == GameContext.aGameContext_5320)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adc.z(").append(')').toString());
		}
	}

	public int method5612(int i, int i_0_) {
		try {
			if (aGamePreferences_5346.method3541((byte) -75) == GameContext.aGameContext_5320)
				return 1;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adc.f(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adc.a(").append(')').toString());
		}
	}

	public Class422_Sub2(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	int method5615() {
		return 1;
	}

	public int method5629(int i) {
		try {
			return anInt5350 * -1598873795;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adc.y(").append(')').toString());
		}
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adc.p(").append(')').toString());
		}
	}

	static final void method5630(ClientScript2 class403, int i) {
		try {
			int i_2_ = Class505.method6265(-1206667424);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class11.anInt156 = GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-460463412) * 1970440745) * -1111444967;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_2_;
			GameClient.map.method2667(1422757720);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adc.amy(").append(')').toString());
		}
	}

	static String method5631(long l, int i, boolean bool, byte i_3_) {
		try {
			Calendar calendar;
			if (bool) {
				Class300.method3686(l);
				calendar = Class490.aCalendar6075;
			} else {
				FlickeringPreference.method5658(l);
				calendar = Class490.aCalendar6073;
			}
			int i_4_ = calendar.get(5);
			int i_5_ = calendar.get(2) + 1;
			int i_6_ = calendar.get(1);
			int i_7_ = calendar.get(11);
			int i_8_ = calendar.get(12);
			return new StringBuilder().append(Integer.toString(i_4_ / 10)).append(i_4_ % 10).append("/").append(i_5_ / 10).append(i_5_ % 10).append("/").append(i_6_ % 100 / 10).append(i_6_ % 10).append(" ").append(i_7_ / 10).append(i_7_ % 10).append(":").append(i_8_ / 10).append(i_8_ % 10).toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adc.b(").append(')').toString());
		}
	}
}
