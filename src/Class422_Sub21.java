/* Class422_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class422_Sub21 extends IntegerPreferenceField {
	static int anInt8412 = 0;
	public static int anInt8413 = 1;
	static Class318 aClass318_8414;

	int method5612(int i, int i_0_) {
		try {
			if (0 == i)
				return 1;
			if (aGamePreferences_5346.method3543(418090537).method5592(-1812955720) < 2)
				return 3;
			int i_1_ = aGamePreferences_5346.aToolkitPreference_7570.getValue(-1873124082);
			if (3 != i_1_ && i_1_ != 5)
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aee.f(").append(')').toString());
		}
	}

	public Class422_Sub21(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	int method5611(int i) {
		try {
			int i_2_ = aGamePreferences_5346.aToolkitPreference_7570.getValue(-526925738);
			if (3 != i_2_ && i_2_ != 5)
				return 0;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aee.a(").append(')').toString());
		}
	}

	public void method5702(int i) {
		try {
			int i_3_ = aGamePreferences_5346.aToolkitPreference_7570.getValue(-1349986924);
			if (i_3_ != 3 && i_3_ != 5)
				anInt5350 = 0;
			if (aGamePreferences_5346.method3543(-1562535742).method5592(1164174081) < 2)
				anInt5350 = 0;
			if (anInt5350 * -1598873795 != 0 && 1 != anInt5350 * -1598873795)
				anInt5350 = method5611(-1276944402) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aee.s(").append(')').toString());
		}
	}

	void method5614(int i, int i_4_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aee.p(").append(')').toString());
		}
	}

	public Class422_Sub21(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	int method5615() {
		int i = aGamePreferences_5346.aToolkitPreference_7570.getValue(-1256017211);
		if (3 != i && i != 5)
			return 0;
		return 0;
	}

	public int getValue(byte i) {
		try {
			return anInt5350 * -1598873795;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aee.z(").append(')').toString());
		}
	}

	int method5616(int i) {
		if (0 == i)
			return 1;
		if (aGamePreferences_5346.method3543(-1624549559).method5592(-1749418703) < 2)
			return 3;
		int i_5_ = aGamePreferences_5346.aToolkitPreference_7570.getValue(-521872520);
		if (3 != i_5_ && i_5_ != 5)
			return 3;
		return 1;
	}

	static final void method5704(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.flickeringPreference.method5655(1918406179) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aee.ajj(").append(')').toString());
		}
	}

	static final void method5705(ClientScript2 class403, short i) {
		try {
			Class79.method850(((Class365_Sub1) ((ClientScript2) class403).anInterface3_5233), (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), (byte) 14);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) GameClient.aFloatArray8891[0];
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) GameClient.aFloatArray8891[1];
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) GameClient.aFloatArray8891[2];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aee.apu(").append(')').toString());
		}
	}
}
