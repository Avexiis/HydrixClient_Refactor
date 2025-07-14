/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class356 {
	public static int anInt3827 = 48;
	public static int anInt3828 = -3;
	public static int anInt3829 = -4;
	public static int anInt3830 = 3;
	public static int anInt3831 = 1;
	public static int anInt3832 = 7;
	public static int anInt3833 = -2;
	public static int anInt3834 = 6;
	public static int anInt3835 = 2;
	public static int anInt3836 = 35;
	public static int anInt3837 = 15;
	public static int anInt3838 = 21;
	public static int anInt3839 = 45;
	public static int anInt3840 = 29;
	public static int anInt3841 = 23;
	public static int anInt3842 = 42;
	public static int anInt3843 = -5;
	public static int anInt3844 = 9;

	Class356() throws Throwable {
		throw new Error();
	}

	static final void method4266(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) 2);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Class241.method2248(class105, RSInterface, class403, -16777216);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ow.kf(").append(')').toString());
		}
	}

	static final void method4267(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class288.method2728(class105, RSInterface, class403, 896700904);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ow.ey(").append(')').toString());
		}
	}

	public static int method4268(int i) {
		try {
			if (588194557 * Js5Archive.anInt1367 == -1) {
				Js5Archive[] class111s = Class125.method1399((byte) -111);
				for (int i_1_ = 0; i_1_ < class111s.length; i_1_++) {
					Js5Archive class111 = class111s[i_1_];
					if (((Js5Archive) class111).anInt1366 * -1047699439 > 588194557 * Js5Archive.anInt1367)
						Js5Archive.anInt1367 = 510332837 * ((Js5Archive) class111).anInt1366;
				}
				Js5Archive.anInt1367 += -1700689323;
			}
			return 588194557 * Js5Archive.anInt1367;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ow.b(").append(')').toString());
		}
	}

	static final void method4269(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			int i_2_ = -1;
			int i_3_ = -1;
			Class117 class117 = class105.method1116(OverlayType.activeToolkit, 193353438);
			if (class117 != null) {
				i_2_ = class117.anInt1393 * 1633695381;
				i_3_ = class117.anInt1394 * -60174999;
			}
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_2_;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ow.py(").append(')').toString());
		}
	}

	static final void method4270(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			int[] is = Class298_Sub6.method2863(string, class403, -1668247696);
			if (null != is)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1177 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.configScript = is;
			class105.hasScripts = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ow.lm(").append(')').toString());
		}
	}

	public static final int method4271(int i, int i_4_, int i_5_, int i_6_) {
		try {
			if (GameClient.map.method2675(-1611682495) == null)
				return 0;
			int i_7_ = i >> 9;
			int i_8_ = i_4_ >> 9;
			if (i_7_ < 0 || i_8_ < 0 || i_7_ > GameClient.map.upperX(-1956967905) - 1 || i_8_ > GameClient.map.upperY(1920772834) - 1)
				return 0;
			int i_9_ = i_5_;
			if (i_9_ < 3 && ((GameClient.map.method2654(2001279106).flags[1][i_7_][i_8_]) & 0x2) != 0)
				i_9_++;
			return GameClient.map.method2675(-1611682495).aGroundArray3517[i_9_].method6340(i, i_4_, -1909964281);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ow.jx(").append(')').toString());
		}
	}

	static final void method4272(ClientScript2 class403, int i) {
		try {
			int i_10_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_10_, (byte) 0);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1248 * -1523987341;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ow.rg(").append(')').toString());
		}
	}

	static final void method4273(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GameClient.aBoolean8643 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ow.uk(").append(')').toString());
		}
	}
}
