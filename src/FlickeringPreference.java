/* FlickeringPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class FlickeringPreference extends IntegerPreferenceField {
	public static int anInt8389 = 1;
	public static int anInt8390 = 0;

	int method5616(int i) {
		return 1;
	}

	public FlickeringPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adk.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adk.p(").append(')').toString());
		}
	}

	public int method5655(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adk.z(").append(')').toString());
		}
	}

	int method5615() {
		return 1;
	}

	public void method5656(int i) {
		try {
			if (1 != -1598873795 * anInt5350 && -1598873795 * anInt5350 != 0)
				anInt5350 = method5611(763127121) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adk.s(").append(')').toString());
		}
	}

	public FlickeringPreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adk.a(").append(')').toString());
		}
	}

	static final void method5657(ClientScript2 class403, int i) {
		try {
			Class317.method3853(1630934312);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adk.agb(").append(')').toString());
		}
	}

	static void method5658(long l) {
		try {
			Class490.aCalendar6073.setTime(new Date(l));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adk.d(").append(')').toString());
		}
	}
}
