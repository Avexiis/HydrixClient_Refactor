/* Class298_Sub40_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub13 extends Class298_Sub40 {
	int anInt9730;
	int anInt9731;
	Class160 aClass160_9732;

	void method3508(Packet class298_sub53, int i) {
		try {
			((Class298_Sub40_Sub13) this).anInt9731 = class298_sub53.readUnsignedInt() * -1426634659;
			((Class298_Sub40_Sub13) this).anInt9730 = class298_sub53.readUnsignedInt() * 771945371;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("agz.a(").append(')').toString());
		}
	}

	void method3509(Packet class298_sub53) {
		((Class298_Sub40_Sub13) this).anInt9731 = class298_sub53.readUnsignedInt() * -1426634659;
		((Class298_Sub40_Sub13) this).anInt9730 = class298_sub53.readUnsignedInt() * 771945371;
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1761((-814822411 * ((Class298_Sub40_Sub13) this).anInt9731), (((Class298_Sub40_Sub13) this).anInt9730 * 1839676051), (byte) 26);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("agz.f(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.method1761((-814822411 * ((Class298_Sub40_Sub13) this).anInt9731), (((Class298_Sub40_Sub13) this).anInt9730 * 1839676051), (byte) 66);
	}

	void method3512(Packet class298_sub53) {
		((Class298_Sub40_Sub13) this).anInt9731 = class298_sub53.readUnsignedInt() * -1426634659;
		((Class298_Sub40_Sub13) this).anInt9730 = class298_sub53.readUnsignedInt() * 771945371;
	}

	Class298_Sub40_Sub13(Class160 class160) {
		super();
		((Class298_Sub40_Sub13) this).aClass160_9732 = class160;

	}

	public static Class102 method3517(int i, int i_0_) {
		try {
			if (i < 0 || i >= 100)
				return null;
			return Class107.aClass102Array1312[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("agz.k(").append(')').toString());
		}
	}

	static void method3518(Matrix43f class222, Class233 class233, int i, int i_1_, int i_2_) {
		try {
			if (null == ContextMenu.aClass233_5493)
				ContextMenu.aClass233_5493 = new Class233(class233);
			else
				ContextMenu.aClass233_5493.method2142(class233);
			ContextMenu.aClass222_5495.method2070(class222);
			ContextMenu.anInt5491 = i * 2082905543;
			ContextMenu.anInt5492 = -130447475 * i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("agz.aw(").append(')').toString());
		}
	}
}
