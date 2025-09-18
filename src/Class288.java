/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class288 implements Runnable {
	volatile boolean aBoolean3102;
	volatile boolean aBoolean3103;
	volatile Class284[] aClass284Array3104 = new Class284[2];

	Class288() {
		((Class288) this).aBoolean3103 = false;
		((Class288) this).aBoolean3102 = false;
	}

	static final void method2724(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -16);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Class270.method2536(class105, RSInterface, class403, 1489338850);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ly.cf(").append(')').toString());
		}
	}

	static final void method2725(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class225.method2101(class105, RSInterface, class403, -1329146498);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ly.eh(").append(')').toString());
		}
	}

	static final void method2726(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) -42);
			Class491.method6177(class105, class403, 59297703);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ly.qy(").append(')').toString());
		}
	}

	static final void method2727(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1372893999 * LoginData.anInt3871;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ly.ahs(").append(')').toString());
		}
	}

	static final void method2728(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (!string.equals(class105.aString1212)) {
				class105.aString1212 = string;
				LocalizedString.markComponentForRedraw(class105, 1811665074);
			}
			if (-1 == class105.component * -1309843523 && !RSInterface.aBoolean1403)
				TileText.method3731(-440872681 * class105.interfacehash, (byte) -31);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ly.ec(").append(')').toString());
		}
	}

	public static void method2729(int i, int i_2_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(11, (long) i);
			class298_sub37_sub12.method3445(-2016878849);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ly.y(").append(')').toString());
		}
	}
}
