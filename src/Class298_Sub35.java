/* Class298_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub35 extends Node {
	public int anInt7394;
	public static long aLong7395;

	public Class298_Sub35(int i) {
		anInt7394 = -898670337 * i;
	}

	static final void method3399(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) 29);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Class298_Sub32_Sub34.method3364(class105, RSInterface, class403, -364145193);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abt.nt(").append(')').toString());
		}
	}
}
