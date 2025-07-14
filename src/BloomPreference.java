/* BloomPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class BloomPreference extends IntegerPreferenceField {
	public static int anInt8379 = 0;
	public static int anInt8380 = 1;

	public int method5616(int i) {
		if (!Class261.method2465(aGamePreferences_5346.graphicsPreference.getValue(-1527509133), 1803758115))
			return 3;
		return 1;
	}

	public BloomPreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public void method5645(int i) {
		try {
			if (aGamePreferences_5346.graphicsPreference.method5679(16711680) && !Class261.method2465(aGamePreferences_5346.graphicsPreference.getValue(-1054090568), 983030205))
				anInt5350 = 0;
			if (-1598873795 * anInt5350 < 0 || -1598873795 * anInt5350 > 1)
				anInt5350 = method5611(-1511169015) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adg.s(").append(')').toString());
		}
	}

	int method5615() {
		return 0;
	}

	public boolean method5646(byte i) {
		try {
			if (!Class261.method2465(aGamePreferences_5346.graphicsPreference.getValue(-1114693806), -2071251167))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adg.z(").append(')').toString());
		}
	}

	public int method5612(int i, int i_0_) {
		try {
			if (!Class261.method2465(aGamePreferences_5346.graphicsPreference.getValue(-1991828037), 1148080190))
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adg.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adg.p(").append(')').toString());
		}
	}

	public int method5647(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adg.y(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adg.a(").append(')').toString());
		}
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	public BloomPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}
}
