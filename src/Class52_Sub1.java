/* Class52_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class52_Sub1 extends Class52 {
	protected static int anInt6814 = 4;

	public abstract boolean method557();

	public abstract void method558(Interface8_Impl1_Impl2 interface8_impl1_impl2);

	public abstract boolean method559();

	public abstract boolean method560();

	public abstract void method561(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1);

	public abstract void method562(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1);

	Class52_Sub1() {
		/* empty */
	}

	public abstract void method563(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1);

	public abstract void method564(Interface8_Impl1_Impl2 interface8_impl1_impl2);

	public abstract boolean method565();

	public static void method566(byte i) {
		try {
			if (SpotAnimTypeList.method4865((byte) 1) != Class292.aClass292_3162) {
				try {
					String string = EnumType.mainApplet.getParameter(AppletParam.aAppletParam_2382.aString2395);
					int i_0_ = ((int) (TimeUtils.getTime((byte) 1) / 86400000L) - 11745);
					String string_1_ = new StringBuilder().append("usrdob=").append(i_0_).append("; version=1; path=/; domain=").append(string).toString();
					Class466.method6020(EnumType.mainApplet, new StringBuilder().append("document.cookie=\"").append(string_1_).append("\"").toString(), -1921482054);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("we.ni(").append(')').toString());
		}
	}

	public static WorldMapArea method567(int i) {
		try {
			if (null == Class301_Sub1.aLinkedNodeList_3236 || Class301_Sub1.aClass446_7634 == null)
				return null;
			for (WorldMapArea worldMapArea = (WorldMapArea) Class301_Sub1.aClass446_7634.next(); worldMapArea != null; worldMapArea = (WorldMapArea) Class301_Sub1.aClass446_7634.next()) {
				WorldMapLabel worldMapLabel = Class301_Sub1.aWorldMapLabelList_3251.method4116(((worldMapArea.mapAreaId) * -530122905), -616779677);
				if (worldMapLabel != null && worldMapLabel.aBoolean3816 && worldMapLabel.method4237(Class301_Sub1.anInterface23_3223, 1789313805))
					return worldMapArea;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("we.ch(").append(')').toString());
		}
	}
}
