/* Class298_Sub40_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub4 extends Class298_Sub40 {
	Class160 aClass160_9697;
	String aString9698;

	void method3508(Packet class298_sub53, int i) {
		try {
			((Class298_Sub40_Sub4) this).aString9698 = class298_sub53.getString();
			class298_sub53.readUnsignedInt();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("agc.a(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.aString1654 = ((Class298_Sub40_Sub4) this).aString9698;
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.aString1654 = ((Class298_Sub40_Sub4) this).aString9698;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("agc.f(").append(')').toString());
		}
	}

	Class298_Sub40_Sub4(Class160 class160) {
		super();
		((Class298_Sub40_Sub4) this).aClass160_9697 = class160;
	}

	void method3512(Packet class298_sub53) {
		((Class298_Sub40_Sub4) this).aString9698 = class298_sub53.getString();
		class298_sub53.readUnsignedInt();
	}

	void method3509(Packet class298_sub53) {
		((Class298_Sub40_Sub4) this).aString9698 = class298_sub53.getString();
		class298_sub53.readUnsignedInt();
	}
}
