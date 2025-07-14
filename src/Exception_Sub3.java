/* Exception_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub3 extends Exception {

	Exception_Sub3(Class109 class109, int i, int i_0_) {
		super();
	}

	public static RSInterface method275(int i, byte i_1_) {
		try {
			return SpotAnimTypeList.aRSInterfaceArray4165[i >> 16];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aev.b(").append(')').toString());
		}
	}
}
