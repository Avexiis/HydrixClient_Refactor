/* TexturePreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TexturePreference extends IntegerPreferenceField {
	public static int anInt8403 = 1;
	public static int anInt8404 = 0;

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	public TexturePreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public void method5685(int i) {
		try {
			if (aGamePreferences_5346.method3541((byte) -46) != GameContext.aGameContext_5320)
				anInt5350 = 1886334997;
			if (0 != anInt5350 * -1598873795 && 1 != -1598873795 * anInt5350)
				anInt5350 = method5611(-914102280) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adu.s(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adu.a(").append(')').toString());
		}
	}

	public boolean method5686(int i) {
		try {
			if (aGamePreferences_5346.method3541((byte) -12) == GameContext.aGameContext_5320)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adu.z(").append(')').toString());
		}
	}

	void method5614(int i, int i_0_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adu.p(").append(')').toString());
		}
	}

	public int getValue(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adu.y(").append(')').toString());
		}
	}

	public TexturePreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	public int method5616(int i) {
		if (aGamePreferences_5346.method3541((byte) -17) == GameContext.aGameContext_5320) {
			if (i == 0 || aGamePreferences_5346.groundBlendingPreference.method5724(586082274) == 1)
				return 1;
			return 2;
		}
		return 3;
	}

	public int method5612(int i, int i_1_) {
		try {
			if (aGamePreferences_5346.method3541((byte) -43) == GameContext.aGameContext_5320) {
				if (i == 0 || aGamePreferences_5346.groundBlendingPreference.method5724(162446685) == 1)
					return 1;
				return 2;
			}
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adu.f(").append(')').toString());
		}
	}

	int method5615() {
		return 1;
	}
}
