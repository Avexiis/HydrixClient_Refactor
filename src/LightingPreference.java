/* LightingPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class LightingPreference extends IntegerPreferenceField {
	public static int anInt8401 = 1;
	public static int anInt8402 = 0;

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ads.a(").append(')').toString());
		}
	}

	public LightingPreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public void method5683(int i) {
		try {
			if (-1598873795 * anInt5350 != 1 && anInt5350 * -1598873795 != 0)
				anInt5350 = method5611(-325765278) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ads.s(").append(')').toString());
		}
	}

	int method5616(int i) {
		return 1;
	}

	int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ads.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ads.p(").append(')').toString());
		}
	}

	public LightingPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	int method5615() {
		return 1;
	}

	public int getValue(int i) {
		try {
			return anInt5350 * -1598873795;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ads.z(").append(')').toString());
		}
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}
}
