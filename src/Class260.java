/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class260 {
	static int anInt2812 = 1;
	static int anInt2813 = 4;
	static int anInt2814 = 0;
	static int anInt2815 = 3;
	static int anInt2816 = 2;
	static int anInt2817 = 6;
	static int anInt2818 = 7;
	public static Js5 aClass243_2819;
	public static int anInt2820;

	Class260() throws Throwable {
		throw new Error();
	}

	static final void method2458(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -1);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Js5.method2317(class105, RSInterface, class403, 1204631441);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kw.ni(").append(')').toString());
		}
	}

	static final void method2459(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class343_Sub1 class343_sub1 = Class226.method2105(i_1_, (byte) -81);
			if (null != class343_sub1) {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -877023375 * class343_sub1.anInt3670;
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class343_sub1.aString7719;
				Class353 class353 = class343_sub1.method4163(-1575528470);
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = class353.anInt3820 * 1675394033;
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class353.aString3819;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = class343_sub1.anInt3666 * -945794709;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 512449113 * class343_sub1.anInt7720;
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class343_sub1.aString7718;
			} else {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kw.alq(").append(')').toString());
		}
	}

	static final void method2460(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsSetup.clientPreferences.aMapSizePreference_7558.method5666(-391880689) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kw.anw(").append(')').toString());
		}
	}

	static final void method2461(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			short i_3_ = (short) (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			short i_4_ = (short) (((ClientScript2) class403).anIntArray5244[2 + 681479919 * ((ClientScript2) class403).anInt5239]);
			if (i_2_ >= 0 && i_2_ < 5) {
				class105.method1120(i_2_, i_3_, i_4_, -1261920411);
				LocalizedString.markComponentForRedraw(class105, 1064187264);
				if (class105.component * -1309843523 == -1 && !RSInterface.aBoolean1403)
					Class85.method958(-440872681 * class105.interfacehash, i_2_, (byte) 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kw.gy(").append(')').toString());
		}
	}
}
