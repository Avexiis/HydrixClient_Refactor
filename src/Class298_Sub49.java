/* Class298_Sub49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub49 extends Node {
	boolean aBoolean7588;
	int anInt7589;
	int anInt7590;
	Class308_Sub1 aClass308_Sub1_7591;
	boolean aBoolean7592;
	boolean aBoolean7593;
	boolean aBoolean7594;

	Class298_Sub49(int i, Class308_Sub1 class308_sub1, int i_0_, boolean bool) {
		((Class298_Sub49) this).anInt7589 = 1383566731 * i;
		((Class298_Sub49) this).aClass308_Sub1_7591 = class308_sub1;
		((Class298_Sub49) this).anInt7590 = i_0_ * -1251695789;
		((Class298_Sub49) this).aBoolean7588 = bool;
	}

	static final void method3545(ClientScript2 class403, byte i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) 49);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_1_ >> 16];
			Class321.method3925(class105, RSInterface, class403, (byte) -38);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("acq.it(").append(')').toString());
		}
	}
}
