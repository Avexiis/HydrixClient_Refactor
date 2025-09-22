/* RemoveRoofPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class RemoveRoofPreference extends IntegerPreferenceField {
	public static int anInt8367 = 1;
	public static int anInt8368 = 0;
	public static GameFont CONSOLE_SECONDARY_FONT;

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

	public RemoveRoofPreference(GamePreferences gamePreferences) {
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

	public RemoveRoofPreference(int i, GamePreferences gamePreferences) {
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
			int i_2_ = GameFont.method6265(-1206667424);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class11.anInt156 = GraphicsSetup.clientPreferences.graphicsPreference.getValue(-460463412) * 1970440745) * -1111444967;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_2_;
			GameClient.map.method2667(1422757720);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adc.amy(" + ')');
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
			int DATE = calendar.get(Calendar.DATE);
			int MONTH = calendar.get(Calendar.MONTH) + 1;
			int YEAR = calendar.get(Calendar.YEAR);
			int HOUR = calendar.get(Calendar.HOUR_OF_DAY);
			int MINUTE = calendar.get(Calendar.MINUTE);
			return Integer.toString(
					DATE / 10) + DATE % 10 + "/" + MONTH / 10 + MONTH % 10 + "/" + YEAR % 100 / 10 + YEAR % 10 + " " + HOUR / 10 + HOUR % 10 + ":" + MINUTE / 10 + MINUTE % 10;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adc.b(" + ')');
		}
	}
}
