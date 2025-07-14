/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320 implements Interface21 {
	public static Class320 aClass320_6547;
	static Class320 aClass320_6548 = new Class320(0);
	int anInt6549;
	public static VarClientTypeList aVarClientTypeList_6550;

	Class320(int i) {
		((Class320) this).anInt6549 = -1849427999 * i;
	}

	public int method243() {
		return 2012122145 * ((Class320) this).anInt6549;
	}

	static {
		aClass320_6547 = new Class320(1);
	}

	public int method242(int i) {
		try {
			return 2012122145 * ((Class320) this).anInt6549;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ni.f(").append(')').toString());
		}
	}

	public int method244() {
		return 2012122145 * ((Class320) this).anInt6549;
	}

	public static void method3910(int i) {
		try {
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aClass422_Sub17_7564, 1, -278860705);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aClass422_Sub17_7565, 1, -1879075078);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aClass422_Sub2_7547, 1, -144967877);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.groundBlendingPreference, 1, 3979787);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aGraphicsAutoSetup_7569, 0, -1267983813);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.flickeringPreference, 0, -479296878);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.characterShadowPreference, 0, 32404629);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.sceneryShadowPreference, 0, -1166259594);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.texturePreference, 0, 221140911);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.lightingPreference, 0, 609592986);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.waterDetailPreference, 0, -1791107075);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.fogPreference, 0, -240658138);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.antialiasPreference, 0, 737950253);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aAntialiasPreference_7550, 0, -1008071138);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.particlePreference, 0, -1232122850);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aMapSizePreference_7558, -160182505 * Class115.aClass115_1383.anInt1387, 466531848);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.bloomPreference, 0, -1276228451);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aClass422_Sub19_7567, 0, -23282776);
			Class490.method6170(1113089752);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aScreenSizePreference_7566, 2, 1293702073);
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aGraphicsPresetPreference_7576, 2, 359344447);
			Class359.method4294(123459893);
			GameClient.map.method2640((byte) -42).forceUpdate(-1416696139);
			GameClient.aBoolean8676 = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ni.x(").append(')').toString());
		}
	}

	static final void method3911(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -83);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Class257.method2451(class105, RSInterface, class403, 505360650);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ni.ov(").append(')').toString());
		}
	}

	static final void method3912(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.fogPreference.method5612(i_1_, 1352882135);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ni.aoy(").append(')').toString());
		}
	}

	public static Class297 method3913(int i, int i_2_, int i_3_, int i_4_, boolean bool, int i_5_, int i_6_) {
		try {
			if ((bool ? GraphicsAutoSetup.clientPreferences.aVolumePreference_7583.method5726(-2146212397) : GraphicsAutoSetup.clientPreferences.aVolumePreference_7553.method5726(-2145707047)) != 0 && i_2_ != 0 && -991384187 * Class300.anInt3213 < 50 && i != -1) {
				Class297 class297 = new Class297(bool ? (byte) 3 : (byte) 2, i, i_2_, i_3_, i_4_, 0, i_5_, null);
				Class300.aClass297Array3214[(Class300.anInt3213 += -598588595) * -991384187 - 1] = class297;
				return class297;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ni.z(").append(')').toString());
		}
	}

	static Class516[] method3914(byte i) {
		try {
			return (new Class516[] { Class516.aClass516_6259, Class516.aClass516_6239, Class516.aClass516_6265, Class516.aClass516_6243, Class516.aClass516_6246, Class516.aClass516_6240, Class516.aClass516_6248, Class516.aClass516_6258, Class516.aClass516_6253, Class516.aClass516_6245, Class516.aClass516_6257, Class516.aClass516_6251, Class516.aClass516_6247, Class516.aClass516_6263, Class516.aClass516_6260, Class516.aClass516_6256, Class516.aClass516_6249, Class516.aClass516_6242, Class516.aClass516_6255, Class516.aClass516_6234, Class516.aClass516_6254, Class516.aClass516_6238, Class516.aClass516_6244, Class516.aClass516_6250, Class516.aClass516_6264, Class516.aClass516_6252, Class516.aClass516_6236, Class516.aClass516_6237, Class516.aClass516_6262, Class516.aClass516_6261, Class516.aClass516_6241 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ni.a(").append(')').toString());
		}
	}
}
