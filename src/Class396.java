/* Class396 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class396 {
	static short aShort5193;
	volatile String aString5194;
	public volatile int anInt5195 = -842879005;
	static boolean aBoolean5196;

	Class396(String string) {
		((Class396) this).aString5194 = string;
	}

	static void method4908(String string, int i) {
		try {
			GameClient.aString8927 = string;
			if (SpotAnimTypeList.method4865((byte) -104) != Class292.aClass292_3162) {
				try {
					String string_0_ = EnumType.mainApplet.getParameter(AppletParam.aAppletParam_2378.aString2395);
					String string_1_ = EnumType.mainApplet.getParameter(AppletParam.aAppletParam_2382.aString2395);
					String string_2_ = new StringBuilder().append(string_0_).append("settings=").append(string).append("; version=1; path=/; domain=").append(string_1_).toString();
					if (string.length() == 0)
						string_2_ = new StringBuilder().append(string_2_).append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
					else
						string_2_ = new StringBuilder().append(string_2_).append("; Expires=").append(Class304.method3742(TimeUtils.getTime((byte) 1) + 94608000000L)).append("; Max-Age=").append(94608000L).toString();
					Class466.method6020(EnumType.mainApplet, new StringBuilder().append("document.cookie=\"").append(string_2_).append("\"").toString(), -1926451476);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qk.nf(").append(')').toString());
		}
	}

	static final void method4909(ClientScript2 class403, int i) {
		try {
			if (null != VarClientString.aClass162_6216) {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
				((ClientScript2) class403).aClass162_5252 = VarClientString.aClass162_6216;
			} else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qk.wk(").append(')').toString());
		}
	}

	public static final boolean method4910(String string, String string_3_, String string_4_, String string_5_, int i) {
		try {
			if (string == null || null == string_4_)
				return false;
			if (string.startsWith("#") || string_4_.startsWith("#"))
				return string.equals(string_4_);
			return string_3_.equals(string_5_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qk.a(").append(')').toString());
		}
	}
}
