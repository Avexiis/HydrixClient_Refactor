/* GraphicsAutoSetup - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GraphicsAutoSetup extends IntegerPreferenceField {
	public static int anInt8422 = 1;
	public static int anInt8423 = 0;
	static int anInt8424 = 2;
	public static GamePreferences clientPreferences;

	public GraphicsAutoSetup(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	int method5616(int i) {
		return 1;
	}

	public void method5715(byte i) {
		try {
			if (aGamePreferences_5346.method3541((byte) -104) == GameContext.stellar_dawn)
				anInt5350 = -522297302;
			if (anInt5350 * -1598873795 < 0 || anInt5350 * -1598873795 > 2)
				anInt5350 = method5611(1503163375) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ael.s(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ael.a(").append(')').toString());
		}
	}

	int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ael.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ael.p(").append(')').toString());
		}
	}

	int method5615() {
		return 1;
	}

	public GraphicsAutoSetup(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	public int method5716(byte i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ael.z(").append(')').toString());
		}
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}
}
