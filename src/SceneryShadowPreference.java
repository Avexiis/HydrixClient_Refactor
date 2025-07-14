/* SceneryShadowPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SceneryShadowPreference extends IntegerPreferenceField {
	public static int anInt8381 = 2;
	public static int anInt8382 = 0;
	public static int anInt8383 = 1;
	public static Class445 aClass445_8384;
	public static boolean aBoolean8385;

	public SceneryShadowPreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public int method5612(int i, int i_0_) {
		try {
			if (aGamePreferences_5346.texturePreference.getValue(1970105760) == 0)
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adh.f(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adh.a(").append(')').toString());
		}
	}

	public boolean method5648(int i) {
		try {
			if (aGamePreferences_5346.texturePreference.getValue(1897479169) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adh.z(").append(')').toString());
		}
	}

	public void method5649(int i) {
		try {
			if (aGamePreferences_5346.texturePreference.getValue(1884189410) == 0)
				anInt5350 = 0;
			if (-1598873795 * anInt5350 < 0 || -1598873795 * anInt5350 > 2)
				anInt5350 = method5611(1169939305) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adh.s(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adh.p(").append(')').toString());
		}
	}

	public SceneryShadowPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	int method5615() {
		return 2;
	}

	public int method5616(int i) {
		if (aGamePreferences_5346.texturePreference.getValue(2020883280) == 0)
			return 3;
		return 1;
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	public int getValue(int i) {
		try {
			return anInt5350 * -1598873795;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adh.y(").append(')').toString());
		}
	}

	public static Class355 method5651(Packet class298_sub53, byte i) {
		try {
			int i_2_ = class298_sub53.readUnsignedByte();
			int[] is = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				is[i_3_] = class298_sub53.readUnsignedByte();
			return new Class355(is);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adh.p(").append(')').toString());
		}
	}
}
