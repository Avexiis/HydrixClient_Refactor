/* Class407 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class407 {
	public static int anInt5275 = 125000;
	public static int anInt5276 = 1500;

	Class407() throws Throwable {
		throw new Error();
	}

	static int method4964(int i) {
		try {
			int i_0_;
			if (1126040225 * GameShell.maximumMemory >= 96) {
				int i_1_ = Class390.method4871((byte) 12);
				if (i_1_ <= 101) {
					Class116.method1272(228176307);
					i_0_ = 4;
				} else if (i_1_ <= 503) {
					Class302_Sub3.method3722((short) 23256);
					i_0_ = 3;
				} else if (i_1_ <= 1003) {
					Class320.method3910(-342704858);
					i_0_ = 2;
				} else {
					Class69.method788(true, -81404804);
					i_0_ = 1;
				}
			} else {
				Class69.method788(true, -2081784265);
				i_0_ = 1;
			}
			if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-1442149692) != 0) {
				GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570, 0, -912094662);
				ClanSettings.method4578(0, false, 622850291);
			} else
				GraphicsAutoSetup.clientPreferences.method3539(GraphicsAutoSetup.clientPreferences.graphicsPreference, true, -1651026599);
			Class3.writePreferences();
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qx.p(").append(')').toString());
		}
	}
}
