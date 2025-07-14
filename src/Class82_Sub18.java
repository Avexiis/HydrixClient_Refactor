/* Class82_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub18 extends Class82 {
	int anInt6890;
	int anInt6891;
	public static Class405 aClass405_6892;

	public void method869() {
		Class136.method1495(((Class82_Sub18) this).anInt6890 * 115033111, 0, ((Class82_Sub18) this).anInt6891 * -1734052405, -649427988);
	}

	public void method866(int i) {
		try {
			Class136.method1495(((Class82_Sub18) this).anInt6890 * 115033111, 0, ((Class82_Sub18) this).anInt6891 * -1734052405, -649427988);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("yl.f(").append(')').toString());
		}
	}

	public void method868() {
		Class136.method1495(((Class82_Sub18) this).anInt6890 * 115033111, 0, ((Class82_Sub18) this).anInt6891 * -1734052405, -649427988);
	}

	Class82_Sub18(Packet class298_sub53) {
		super(class298_sub53);
		((Class82_Sub18) this).anInt6890 = class298_sub53.readUnsignedShort() * 2089431975;
		((Class82_Sub18) this).anInt6891 = class298_sub53.readUnsignedByte() * 779683811;
	}

	public static final void method922(byte i) {
		try {
			if (!GameClient.aBoolean8762) {
				GameClient.aFloat8759 += (24.0F - GameClient.aFloat8759) / 2.0F;
				GameClient.aBoolean8763 = true;
				GameClient.aBoolean8762 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("yl.hc(").append(')').toString());
		}
	}

	static final void method923(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GameClient.aBoolean8638 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("yl.afb(").append(')').toString());
		}
	}
}
