/* GroundBlendingPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GroundBlendingPreference extends IntegerPreferenceField {
	public static int anInt8433 = 1;
	public static int anInt8434 = 0;

	public int method5612(int i, int i_0_) {
		try {
			if (aGamePreferences_5346.method3541((byte) -56) == GameContext.aGameContext_5320) {
				if (0 == i) {
					if (aGamePreferences_5346.fogPreference.method5633(1268692572) == 1)
						return 2;
					if (aGamePreferences_5346.texturePreference.getValue(2092806883) == 1)
						return 2;
					if (aGamePreferences_5346.waterDetailPreference.getValue(1056672135) > 0)
						return 2;
				}
				return 1;
			}
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeq.f(").append(')').toString());
		}
	}

	public void method5723(int i) {
		try {
			if (aGamePreferences_5346.method3541((byte) -100) != GameContext.aGameContext_5320)
				anInt5350 = 1886334997;
			if (anInt5350 * -1598873795 != 0 && 1 != anInt5350 * -1598873795)
				anInt5350 = method5611(-2130948136) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeq.s(").append(')').toString());
		}
	}

	int method5615() {
		return 1;
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeq.p(").append(')').toString());
		}
	}

	public GroundBlendingPreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	public int method5724(int i) {
		try {
			return anInt5350 * -1598873795;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeq.y(").append(')').toString());
		}
	}

	public GroundBlendingPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	public int method5616(int i) {
		if (aGamePreferences_5346.method3541((byte) -125) == GameContext.aGameContext_5320) {
			if (0 == i) {
				if (aGamePreferences_5346.fogPreference.method5633(252992424) == 1)
					return 2;
				if (aGamePreferences_5346.texturePreference.getValue(1884202670) == 1)
					return 2;
				if (aGamePreferences_5346.waterDetailPreference.getValue(-1401768386) > 0)
					return 2;
			}
			return 1;
		}
		return 3;
	}

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeq.a(").append(')').toString());
		}
	}

	public boolean method5725(byte i) {
		try {
			if (aGamePreferences_5346.method3541((byte) -64) == GameContext.aGameContext_5320)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeq.z(").append(')').toString());
		}
	}
}
