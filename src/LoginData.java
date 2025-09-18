/* LoginData - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class LoginData {
	public static int anInt3866;
	static int anInt3868;
	static boolean aBoolean3870 = false;
	public static int anInt3871;
	static int anInt3873;
	static long aLong3874;
	static boolean aBoolean3886 = false;
	public static int anInt3888;
	static int[] anIntArray3889;
	public static int anInt3892;
	public static int anInt3894;
	static int anInt3896;
	static String username;
	static String password;
	static int anInt3900;
	static int loginConfigsSize;
	static int anInt3904;
	static Class25 aClass25_3905;
	public static int anInt3906;
	public static int anInt3908;
	public static int anInt3909;
	public static int anInt3910;
	static long aLong3911;
	static boolean aBoolean3912;

	static {
		anInt3873 = -2035975497;
		aLong3874 = 2742373017286080113L;
		anInt3896 = -395862839;
		aLong3911 = 0L;
		username = "";
		password = "";
		anInt3900 = 0;
		anInt3904 = 0;
		anInt3892 = -946395782;
		anInt3871 = -988354658;
		anInt3894 = -1908115170;
		anInt3906 = 930150939;
		anInt3888 = 599892555;
		anInt3908 = 0;
		anInt3909 = -1719895145;
		anInt3910 = -1200969765;
		anInt3866 = 0;
		aBoolean3912 = false;
	}

	LoginData() throws Throwable {
		throw new Error();
	}

	static final void method4297(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_0_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_1_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			Class390 class390;
			if (((ClientScript2) class403).aBoolean5261)
				class390 = ((ClientScript2) class403).aClass390_5247;
			else
				class390 = ((ClientScript2) class403).aClass390_5246;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (i_1_ != -1 && class390.method4867(i_0_, i_1_, -574024132) ? 1 : 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "p.br(" + ')');
		}
	}

	static final void method4298(ClientScript2 class403, byte i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) 52);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_2_ >> 16];
			Class21.method365(class105, RSInterface, false, 2, class403, -1533080700);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "p.hl(" + ')');
		}
	}

	static final void method4299(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class298_Sub39.method3507(class105, RSInterface, class403, -2106555824);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "p.mc(" + ')');
		}
	}

	static void method4300(int i) {
		try {
			synchronized (ClientScriptsExecutor.aQueue4124) {
				Point point;
				if (Class52_Sub2_Sub1.aCanvas9079.isShowing())
					point = Class52_Sub2_Sub1.aCanvas9079.getLocationOnScreen();
				else
					point = null;
				for (;;) {
					Class298_Sub50_Sub2 class298_sub50_sub2 = (Class298_Sub50_Sub2) ClientScriptsExecutor.aQueue4124.poll();
					if (class298_sub50_sub2 == null) {
						break;
					}
					if (point == null || !Class52_Sub2_Sub1.aCanvas9079.isShowing() || !SceneryShadowPreference.aBoolean8385)
						class298_sub50_sub2.method3550(-1850885996);
					else {
						class298_sub50_sub2.method3571(point, 1682820280);
						if (class298_sub50_sub2.method3570(725072729)) {
							if (i >= 1930198567) {
								/* empty */
							}
						} else if ((class298_sub50_sub2.method3547((byte) 16) < -2110394505 * Class462.canvasWidth) && (class298_sub50_sub2.method3560(-1530423246) < (-1111710645 * Class298_Sub40_Sub9.anInt9716)) && class298_sub50_sub2.method3547((byte) 15) >= 0) {
							if (class298_sub50_sub2.method3560(-1205687296) < 0) {
								if (i >= 1930198567) {
									/* empty */
								}
							} else {
								int i_3_ = class298_sub50_sub2.method3546(-1372966703);
								if (class298_sub50_sub2.method3546(-1372966703) == -1)
									ClientScriptsExecutor.aClass374_Sub2_4121.method4620(class298_sub50_sub2, 2114184639);
								else if (Class128.method1437(i_3_, 763111254))
									ClientScriptsExecutor.aClass374_Sub2_4121.method4642(class298_sub50_sub2, (byte) 13);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "p.i(" + ')');
		}
	}

	public static void method4301(int i) {
		try {
			for (int i_4_ = 0; i_4_ < 113; i_4_++)
				GameClient.aBooleanArray8900[i_4_] = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "p.lq(" + ')');
		}
	}

	public static Class309 method4302(int i) {
		try {
			Class309_Sub2 class309_sub2;
			try {
				class309_sub2 = new Class309_Sub2();
			} catch (Throwable throwable) {
				return new Class309_Sub1();
			}
			return class309_sub2;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "p.a(" + ')');
		}
	}
}
