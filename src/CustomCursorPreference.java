/* CustomCursorPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class CustomCursorPreference extends IntegerPreferenceField {
	static Class89 aClass89_8437;
	public static int anInt8438 = 0;
	public static int anInt8439 = 1;

	int method5616(int i) {
		return 1;
	}

	public CustomCursorPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aez.a(").append(')').toString());
		}
	}

	int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aez.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aez.p(").append(')').toString());
		}
	}

	public int method5730(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aez.z(").append(')').toString());
		}
	}

	int method5615() {
		return 1;
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	public void method5731(int i) {
		try {
			if (anInt5350 * -1598873795 != 1 && -1598873795 * anInt5350 != 0)
				anInt5350 = method5611(129601204) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aez.s(").append(')').toString());
		}
	}

	public CustomCursorPreference(int i, GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	static final void method5732(int i) {
		try {
			Iterator iterator = GameClient.animatedObjects.iterator();
			while (iterator.hasNext()) {
				Class298_Sub37_Sub3 class298_sub37_sub3 = (Class298_Sub37_Sub3) iterator.next();
				Class365_Sub1_Sub1_Sub3 class365_sub1_sub1_sub3 = (((Class298_Sub37_Sub3) class298_sub37_sub3).aClass365_Sub1_Sub1_Sub3_9578);
				class365_sub1_sub1_sub3.method4483(1, -748759469);
				if (class365_sub1_sub1_sub3.method4484(1662190190)) {
					class298_sub37_sub3.unlink(-1460969981);
					class365_sub1_sub1_sub3.method4480((byte) 54);
				} else if ((GameClient.map.method2675(-1611682495) != null) && class365_sub1_sub1_sub3.method4481((byte) -116))
					GameClient.map.method2675(-1611682495).method4022(class365_sub1_sub1_sub3, true, (byte) 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aez.ik(").append(')').toString());
		}
	}
}
