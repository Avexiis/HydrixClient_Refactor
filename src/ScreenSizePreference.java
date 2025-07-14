/* ScreenSizePreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ScreenSizePreference extends IntegerPreferenceField {
	public static int anInt8386 = 1;
	public static int anInt8387 = 2;
	public static int anInt8388 = 0;

	public int method5616(int i) {
		return 1;
	}

	int method5615() {
		if (aGamePreferences_5346.graphicsPreference.method5679(16711680) && SpotAnimation.method616(aGamePreferences_5346.graphicsPreference.getValue(-694656664), 1335402682))
			return 1;
		return 0;
	}

	public void method5652(short i) {
		try {
			if (anInt5350 * -1598873795 < 0 || anInt5350 * -1598873795 > 2)
				anInt5350 = method5611(1979725599) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adj.s(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			if (aGamePreferences_5346.graphicsPreference.method5679(16711680) && SpotAnimation.method616(aGamePreferences_5346.graphicsPreference.getValue(-745966272), 855449683))
				return 1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adj.a(").append(')').toString());
		}
	}

	public boolean method5653(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adj.z(").append(')').toString());
		}
	}

	public int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adj.f(").append(')').toString());
		}
	}

	public ScreenSizePreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adj.p(").append(')').toString());
		}
	}

	public int method5654(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adj.y(").append(')').toString());
		}
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	public ScreenSizePreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}
}
