/* VolumePreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VolumePreference extends IntegerPreferenceField {
	static int anInt8435 = 127;
	static int anInt8436 = 0;

	public VolumePreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public VolumePreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	int method5611(int i) {
		try {
			return 127;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aer.a(").append(')').toString());
		}
	}

	int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aer.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aer.p(").append(')').toString());
		}
	}

	public int method5726(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aer.z(").append(')').toString());
		}
	}

	int method5615() {
		return 127;
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	public void method5727(byte i) {
		try {
			if (anInt5350 * -1598873795 < 0 && anInt5350 * -1598873795 > 127)
				anInt5350 = method5611(-1091362223) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aer.s(").append(')').toString());
		}
	}

	int method5616(int i) {
		return 1;
	}

	static boolean method5728(WorldMapLabel worldMapLabel, int i) {
		try {
			if (worldMapLabel == null)
				return false;
			if (!worldMapLabel.aBoolean3810)
				return false;
			if (!worldMapLabel.method4237(Class301_Sub1.anInterface23_3223, 655699987))
				return false;
			if (Class301_Sub1.aClass437_7636.get((long) (-1262065485 * worldMapLabel.anInt3784)) != null)
				return false;
			if (Class301_Sub1.aClass437_7637.get((long) (worldMapLabel.anInt3817 * -804513353)) != null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aer.bn(").append(')').toString());
		}
	}

	public static boolean method5729(byte i, short i_2_) {
		try {
			int i_3_ = i & 0xff;
			if (i_3_ == 0)
				return false;
			if (i_3_ >= 128 && i_3_ < 160 && '\0' == ConsoleCommands.aCharArray5340[i_3_ - 128])
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aer.b(").append(')').toString());
		}
	}
}
