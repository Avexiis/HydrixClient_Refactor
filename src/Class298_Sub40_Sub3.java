/* Class298_Sub40_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub3 extends Class298_Sub40 {
	String aString9694;
	int anInt9695;
	Class160 aClass160_9696;

	void method3508(Packet class298_sub53, int i) {
		try {
			((Class298_Sub40_Sub3) this).anInt9695 = class298_sub53.readUnsignedInt() * 1400658899;
			((Class298_Sub40_Sub3) this).aString9694 = class298_sub53.gstr();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aga.a(").append(')').toString());
		}
	}

	void method3512(Packet class298_sub53) {
		((Class298_Sub40_Sub3) this).anInt9695 = class298_sub53.readUnsignedInt() * 1400658899;
		((Class298_Sub40_Sub3) this).aString9694 = class298_sub53.gstr();
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1760((((Class298_Sub40_Sub3) this).anInt9695 * -419842981), ((Class298_Sub40_Sub3) this).aString9694, (byte) 24);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aga.f(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.method1760((((Class298_Sub40_Sub3) this).anInt9695 * -419842981), ((Class298_Sub40_Sub3) this).aString9694, (byte) 24);
	}

	Class298_Sub40_Sub3(Class160 class160) {
		super();
		((Class298_Sub40_Sub3) this).aClass160_9696 = class160;
	}

	void method3509(Packet class298_sub53) {
		((Class298_Sub40_Sub3) this).anInt9695 = class298_sub53.readUnsignedInt() * 1400658899;
		((Class298_Sub40_Sub3) this).aString9694 = class298_sub53.gstr();
	}
}
