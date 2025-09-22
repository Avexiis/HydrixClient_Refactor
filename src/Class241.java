/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class241 {
	public static IPAddress lobbyAddress;
	static int anInt2706;
	static Class4 aClass4_2707;

	Class241() throws Throwable {
		throw new Error();
	}

	static final void method2247(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			class105.aBoolean1199 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1;
			LocalizedString.markComponentForRedraw(class105, 242919800);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kc.et(").append(')').toString());
		}
	}

	static final void method2248(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_0_ = 10;
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			Class127.method1423(class105, i_0_, i_1_, i_2_, class403, -781902989);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kc.ki(").append(')').toString());
		}
	}
}
