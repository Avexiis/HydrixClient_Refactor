/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class147 {
	static Class147 aClass147_1577;
	static Class147 aClass147_1578;
	static Class147 aClass147_1579 = new Class147(0, 4 + Loader.EXTRA_DRAW_DISTANCE); //render distance
	int anInt1580;
	public int anInt1581;

	static {
		aClass147_1578 = new Class147(1, 5);
		aClass147_1577 = new Class147(2, 6);
	}

	Class147(int i, int i_0_) {
		((Class147) this).anInt1580 = i * -869034129;
		anInt1581 = -1628605819 * i_0_;
	}

	public static void method1600(IComponentDefinition class105, int i, int i_1_, int i_2_) {
		try {
			if (null != class105) {
				if (null != class105.anObjectArray1249) {
					ScriptContext scriptContext = new ScriptContext();
					scriptContext.source = class105;
					scriptContext.arguments = class105.anObjectArray1249;
					ClientBuild.execute(scriptContext, (byte) -26);
				}
				GameClient.aBoolean8835 = true;
				Class379.anInt4099 = class105.interfacehash * 1167811111;
				GameClient.anInt8836 = class105.component * -298861091;
				Node.anInt3192 = 1282349805 * i;
				Class132.anInt1508 = i_1_ * 1881265567;
				GameClient.c92 = 746397723 * class105.zds3;
				MapDecoder.anInt2704 = 1745504609 * class105.anInt1179;
				GameClient.anInt8937 = -472067203 * class105.anInt1163;
				LocalizedString.markComponentForRedraw(class105, -284512508);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fy.kc(").append(')').toString());
		}
	}

	static void method1601(byte i) {
		try {
			if (GameClient.aByteArray8843 != null)
				Js5ConfigGroup.method1311(-1491321338);
			else if (2084404473 * LoginData.anInt3873 != -1)
				Class124.method1386((byte) -89);
			else
				Class497.method6208(LoginData.username, LoginData.password, 712466234);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fy.f(").append(')').toString());
		}
	}
}
