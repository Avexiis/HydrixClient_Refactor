/* WindowModePreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class WindowModePreference extends IntegerPreferenceField {
	public static int anInt8393 = 2;
	public static int anInt8394 = 1;
	public static int anInt8395 = 3;

	int method5616(int i) {
		return 1;
	}

	int method5611(int i) {
		try {
			return (aGamePreferences_5346.method3543(-1069375007).method5593(900768224) ? 3 : 2);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adn.a(" + ')');
		}
	}

	public WindowModePreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	void method5614(int i, int i_0_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adn.p(" + ')');
		}
	}

	int method5612(int i, int i_1_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adn.f(" + ')');
		}
	}

	public int getWindowMode(byte i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adn.z(" + ')');
		}
	}

	int method5615() {
		return (aGamePreferences_5346.method3543(-427215761).method5593(1101125726) ? 3 : 2);
	}

	public void method5670(int i) {
		try {
			if (anInt5350 * -1598873795 < 1 || -1598873795 * anInt5350 > 3)
				anInt5350 = method5611(691543956) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adn.s(" + ')');
		}
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	public WindowModePreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	static final void method5671(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Character.toLowerCase((char) i_2_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adn.aav(" + ')');
		}
	}

	static final void method5672(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class69.method793(i_3_, string, 16711680);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adn.sx(" + ')');
		}
	}
}
