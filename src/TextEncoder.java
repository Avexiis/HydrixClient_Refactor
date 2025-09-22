/* TextEncoder - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TextEncoder {
	public static TextEncoder aTextEncoder_714;
	static TextEncoder aTextEncoder_715;
	static TextEncoder aTextEncoder_716;
	public static TextEncoder aTextEncoder_717;
	public static TextEncoder aTextEncoder_718;
	public static TextEncoder aTextEncoder_719;
	static TextEncoder aTextEncoder_720 = new TextEncoder(2, 1);
	public static TextEncoder aTextEncoder_721;
	static TextEncoder aTextEncoder_722 = new TextEncoder(5, 2);
	public int anInt723;
	public int anInt724;

	static {
		aTextEncoder_716 = new TextEncoder(8, 4);
		aTextEncoder_717 = new TextEncoder(1, 1);
		aTextEncoder_718 = new TextEncoder(6, 2);
		aTextEncoder_719 = new TextEncoder(7, 3);
		aTextEncoder_715 = new TextEncoder(0, 4);
		aTextEncoder_714 = new TextEncoder(4, 2);
		aTextEncoder_721 = new TextEncoder(3, 4);
	}

	TextEncoder(int i, int i_0_) {
		anInt723 = i * 115261893;
		anInt724 = -2085880873 * i_0_;
	}

	static final void method839(ClientScript2 class403, int i) {
		try {
			String string;
			if (Class287.myPlayer != null && null != (Class287.myPlayer.displayName))
				string = Class287.myPlayer.getDisplayName(false, (byte) -122);
			else
				string = "";
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dc.acq(" + ')');
		}
	}

	public static byte[] encodeText(CharSequence charsequence, int i) {
		try {
			int i_1_ = charsequence.length();
			byte[] is = new byte[i_1_];
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
				char c = charsequence.charAt(i_2_);
				if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
					is[i_2_] = (byte) c;
				else if ('\u20ac' == c) is[i_2_] = (byte) -128;
				else if ('\u201a' == c) is[i_2_] = (byte) -126;
				else if ('\u0192' == c) is[i_2_] = (byte) -125;
				else if ('\u201e' == c) is[i_2_] = (byte) -124;
				else if ('\u2026' == c) is[i_2_] = (byte) -123;
				else if ('\u2020' == c) is[i_2_] = (byte) -122;
				else if ('\u2021' == c) is[i_2_] = (byte) -121;
				else if ('\u02c6' == c) is[i_2_] = (byte) -120;
				else if ('\u2030' == c) is[i_2_] = (byte) -119;
				else if ('\u0160' == c) is[i_2_] = (byte) -118;
				else if ('\u2039' == c) is[i_2_] = (byte) -117;
				else if ('\u0152' == c) is[i_2_] = (byte) -116;
				else if ('\u017d' == c) is[i_2_] = (byte) -114;
				else if ('\u2018' == c) is[i_2_] = (byte) -111;
				else if ('\u2019' == c) is[i_2_] = (byte) -110;
				else if ('\u201c' == c) is[i_2_] = (byte) -109;
				else if ('\u201d' == c) is[i_2_] = (byte) -108;
				else if ('\u2022' == c) is[i_2_] = (byte) -107;
				else if ('\u2013' == c) is[i_2_] = (byte) -106;
				else if ('\u2014' == c) is[i_2_] = (byte) -105;
				else if ('\u02dc' == c) is[i_2_] = (byte) -104;
				else if ('\u2122' == c) is[i_2_] = (byte) -103;
				else if ('\u0161' == c) is[i_2_] = (byte) -102;
				else if ('\u203a' == c) is[i_2_] = (byte) -101;
				else if ('\u0153' == c) is[i_2_] = (byte) -100;
				else if ('\u017e' == c) is[i_2_] = (byte) -98;
				else if ('\u0178' == c) is[i_2_] = (byte) -97;
				else is[i_2_] = (byte) 63;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dc.i(" + ')');
		}
	}

	public static boolean method841(int i, int i_3_, byte i_4_) {
		try {
			if (!ContextMenu.menuOpen)
				return false;
			int i_5_ = i >> 16;
			int i_6_ = i & 0xffff;
			if (SpotAnimTypeList.aRSInterfaceArray4165[i_5_] == null || null == (SpotAnimTypeList.aRSInterfaceArray4165[i_5_].aClass105Array1405[i_6_]))
				return false;
			IComponentDefinition class105 = SpotAnimTypeList.aRSInterfaceArray4165[i_5_].aClass105Array1405[i_6_];
			if (i_3_ != -1 || class105.type * -1215239439 != 0) {
				for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) ContextMenu.aLinkedNodeList_5480.method5939(1766612795));
					 class298_sub37_sub15 != null;
					 class298_sub37_sub15 = ((Class298_Sub37_Sub15) ContextMenu.aLinkedNodeList_5480.method5944(49146))) {
					if (-887503319 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9658 == i_3_
							&& (-440872681 * class105.interfacehash == (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9663) * -502720623)
							&& (946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 58
							|| (946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 1007)
							|| (946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 25)
							|| 57 == (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 * 946432351)
							|| (946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 30)))
						return true;
				}
			} else {
				for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) ContextMenu.aLinkedNodeList_5480.method5939(1766612795));
					 class298_sub37_sub15 != null;
					 class298_sub37_sub15 = ((Class298_Sub37_Sub15) ContextMenu.aLinkedNodeList_5480.method5944(49146))) {
					if (58 == 946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662
							|| 1007 == 946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662
							|| 946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 25
							|| 946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 57
							|| 30 == (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662) * 946432351) {
						for (IComponentDefinition class105_7_ = Class50.getIComponentDefinitions((((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9663) * -502720623, (byte) -39);
							 null != class105_7_;
							 class105_7_ = Class523.method6331((SpotAnimTypeList.aRSInterfaceArray4165[(((class105_7_.interfacehash) * -440872681) >> 16)]), class105_7_, -1653818376)) {
							if (-440872681 * class105_7_.interfacehash == -440872681 * class105.interfacehash)
								return true;
						}
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dc.ah(" + ')');
		}
	}

	static void method842(int i, short i_8_) {
		try {
			Class82_Sub14.anInt6875 = i * -2076584633;
			Class301_Sub1.anInt7632 = 433609607;
			Class301_Sub1.anInt7627 = 789877945;
			Class225.method2103(65536);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dc.cj(" + ')');
		}
	}
}
