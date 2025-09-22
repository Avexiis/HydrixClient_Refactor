/* CharacterShadowPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CharacterShadowPreference extends IntegerPreferenceField {
	public static int anInt8408 = 0;
	public static int anInt8409 = 1;

	int method5615() {
		return 1;
	}

	public CharacterShadowPreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public void method5691(int i) {
		try {
			if (1 != anInt5350 * -1598873795 && 0 != -1598873795 * anInt5350)
				anInt5350 = method5611(-1354082069) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ady.s(").append(')').toString());
		}
	}

	public boolean method5692(byte i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ady.z(").append(')').toString());
		}
	}

	public int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ady.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ady.p(").append(')').toString());
		}
	}

	public int method5693(int i) {
		try {
			return anInt5350 * -1598873795;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ady.y(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ady.a(").append(')').toString());
		}
	}

	public int method5616(int i) {
		return 1;
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	public CharacterShadowPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	public static void method5694(String string, int i) {
		try {
			DevConsoleState.aString101 = string;
			DevConsoleState.anInt99 = DevConsoleState.aString101.length() * 1914783065;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ady.r(").append(')').toString());
		}
	}
}
