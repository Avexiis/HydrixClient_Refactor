/* ToolkitPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ToolkitPreference extends IntegerPreferenceField {
	public boolean aBoolean8398;
	boolean aBoolean8399 = true;
	public static int anInt8400;

	void method5610(int i) {
		aBoolean8398 = false;
		anInt5350 = i * 1886334997;
	}

	public ToolkitPreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
		aBoolean8398 = false;
	}

	int method5611(int i) {
		try {
			aBoolean8398 = true;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adq.a(" + ')');
		}
	}

	public int getValue(int i) {
		try {
			return anInt5350 * -1598873795;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adq.y(" + ')');
		}
	}

	public int method5612(int i, int i_0_) {
		try {
			if (i == 3 && !Class85.method955(399394159).method263("jagdx", 953164074))
				return 3;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adq.f(" + ')');
		}
	}

	void method5614(int i, int i_1_) {
		try {
			aBoolean8398 = false;
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adq.p(" + ')');
		}
	}

	public void method5678(byte i) {
		try {
			if (anInt5350 * -1598873795 < 0 || -1598873795 * anInt5350 > 5)
				anInt5350 = method5611(1207214365) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adq.s(" + ')');
		}
	}

	boolean method5679(int i) {
		try {
			return ((ToolkitPreference) this).aBoolean8399;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adq.t(" + ')');
		}
	}

	public void method5680(boolean bool, int i) {
		try {
			((ToolkitPreference) this).aBoolean8399 = bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adq.h(" + ')');
		}
	}

	public int method5616(int i) {
		if (i == 3 && !Class85.method955(-91945670).method263("jagdx", 323040100))
			return 3;
		return 2;
	}

	public ToolkitPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
		aBoolean8398 = false;
	}

	int method5615() {
		aBoolean8398 = true;
		return 2;
	}

	public boolean method5681(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adq.z(" + ')');
		}
	}

	public static void method5682(int i, int i_2_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(12, (long) i);
			class298_sub37_sub12.method3445(-1192057817);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adq.j(" + ')');
		}
	}
}
