/* Class422_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class422_Sub19 extends IntegerPreferenceField {
	public static int anInt8410 = 0;
	public static int anInt8411 = 1;

	public Class422_Sub19(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public int getValue(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adz.y(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adz.a(").append(')').toString());
		}
	}

	public boolean method5696(int i) {
		try {
			if (!Class261.method2465(aGamePreferences_5346.graphicsPreference.getValue(-1041215781), 87726328))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adz.z(").append(')').toString());
		}
	}

	public void method5697(short i) {
		try {
			if (-1598873795 * anInt5350 < 0 || anInt5350 * -1598873795 > 1)
				anInt5350 = method5611(-1919358116) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adz.s(").append(')').toString());
		}
	}

	public int method5612(int i, int i_0_) {
		try {
			if (!Class261.method2465(aGamePreferences_5346.graphicsPreference.getValue(-1171194348), -1627100778))
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adz.f(").append(')').toString());
		}
	}

	int method5615() {
		return 1;
	}

	public int method5616(int i) {
		if (!Class261.method2465(aGamePreferences_5346.graphicsPreference.getValue(-1196546983), 218742823))
			return 3;
		return 1;
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adz.p(").append(')').toString());
		}
	}

	public Class422_Sub19(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	static final void method5698(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			overheadString.method730(class105, RSInterface, class403, 424095579);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adz.gg(").append(')').toString());
		}
	}
}
