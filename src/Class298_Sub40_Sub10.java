/* Class298_Sub40_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub10 extends Class298_Sub40 {
	int anInt9718;
	int anInt9719;
	int anInt9720;
	int anInt9721;
	Class160 aClass160_9722;

	void method3509(Packet class298_sub53) {
		((Class298_Sub40_Sub10) this).anInt9721 = class298_sub53.readUnsignedShort() * 703557345;
		((Class298_Sub40_Sub10) this).anInt9719 = class298_sub53.readUnsignedInt() * -2070878551;
		((Class298_Sub40_Sub10) this).anInt9718 = class298_sub53.readUnsignedByte() * 1472973945;
		((Class298_Sub40_Sub10) this).anInt9720 = class298_sub53.readUnsignedByte() * -2026849051;
	}

	void method3508(Packet class298_sub53, int i) {
		try {
			((Class298_Sub40_Sub10) this).anInt9721 = class298_sub53.readUnsignedShort() * 703557345;
			((Class298_Sub40_Sub10) this).anInt9719 = class298_sub53.readUnsignedInt() * -2070878551;
			((Class298_Sub40_Sub10) this).anInt9718 = class298_sub53.readUnsignedByte() * 1472973945;
			((Class298_Sub40_Sub10) this).anInt9720 = class298_sub53.readUnsignedByte() * -2026849051;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("agp.a(").append(')').toString());
		}
	}

	void method3510(Class162 class162, byte i) {
		try {
			class162.method1767(((Class298_Sub40_Sub10) this).anInt9721 * 1553093921, 1564286361 * ((Class298_Sub40_Sub10) this).anInt9719, -549921335 * ((Class298_Sub40_Sub10) this).anInt9718, -815095571 * ((Class298_Sub40_Sub10) this).anInt9720, 1468096534);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("agp.f(").append(')').toString());
		}
	}

	void method3511(Class162 class162) {
		class162.method1767(((Class298_Sub40_Sub10) this).anInt9721 * 1553093921, 1564286361 * ((Class298_Sub40_Sub10) this).anInt9719, -549921335 * ((Class298_Sub40_Sub10) this).anInt9718, -815095571 * ((Class298_Sub40_Sub10) this).anInt9720, 1036720965);
	}

	void method3512(Packet class298_sub53) {
		((Class298_Sub40_Sub10) this).anInt9721 = class298_sub53.readUnsignedShort() * 703557345;
		((Class298_Sub40_Sub10) this).anInt9719 = class298_sub53.readUnsignedInt() * -2070878551;
		((Class298_Sub40_Sub10) this).anInt9718 = class298_sub53.readUnsignedByte() * 1472973945;
		((Class298_Sub40_Sub10) this).anInt9720 = class298_sub53.readUnsignedByte() * -2026849051;
	}

	Class298_Sub40_Sub10(Class160 class160) {
		super();
		((Class298_Sub40_Sub10) this).anInt9721 = -703557345;
	}

	static final void method3515(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			boolean bool = 1 == (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aToolkitPreference_7570, i_0_, -1223609921);
			if (!bool)
				GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aGraphicsPresetPreference_7576, 0, 335720109);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("agp.aiz(").append(')').toString());
		}
	}
}
