/* CompressionType - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CompressionType extends IntegerPreferenceField {
	int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeb.f(").append(')').toString());
		}
	}

	public CompressionType(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public void method5699(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeb.s(").append(')').toString());
		}
	}

	int method5616(int i) {
		return 1;
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeb.p(").append(')').toString());
		}
	}

	public int method5700(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeb.z(").append(')').toString());
		}
	}

	int method5615() {
		return 0;
	}

	public CompressionType(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	int method5611(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeb.a(").append(')').toString());
		}
	}

	public static Interface21 method5701(Interface21[] interface21s, int i, byte i_2_) {
		try {
			Interface21[] interface21s_3_ = interface21s;
			for (int i_4_ = 0; i_4_ < interface21s_3_.length; i_4_++) {
				Interface21 interface21 = interface21s_3_[i_4_];
				if (i == interface21.method242(694163818))
					return interface21;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeb.a(").append(')').toString());
		}
	}
}
