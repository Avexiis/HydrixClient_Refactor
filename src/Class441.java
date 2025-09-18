/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class441 {
	AnimFrameset aClass298_Sub37_Sub4_5583;
	int anInt5584;
	boolean aBoolean5585 = false;
	int anInt5586;
	AnimFrameset aClass298_Sub37_Sub4_5587;
	int anInt5588;
	static int anInt5589;
	static boolean[] aBooleanArray5590;

	final boolean method5863(SeqTypeList class395, SeqType class391, int i, int i_0_, int[] is, byte i_1_) {
		try {
			if (!aBoolean5585) {
				if (i >= is.length) {
					return false;
				}
				anInt5584 = -1850168697 * is[i];
				aClass298_Sub37_Sub4_5583 = class395.method4900(anInt5584 * 806878007 >> 16 & 0xffff,
						-2028006412);
				anInt5584 = (anInt5584 * 806878007 & 0xffff) * -1850168697;
				if (aClass298_Sub37_Sub4_5583 != null) {
					if (class391.aBoolean4176 && i_0_ != -1 && i_0_ < is.length) {
						anInt5586 = is[i_0_] * -1477634565;
						aClass298_Sub37_Sub4_5587 = class395.method4900(anInt5586 * -643912397 >> 16, -1623469578);
						anInt5586 = (anInt5586 * -643912397 & 0xffff) * -1477634565;
					}
					if (class391.aBoolean4185) {
						anInt5588 = (anInt5588 * -1050600049 | 0x200) * 1673486703;
					}
					if (aClass298_Sub37_Sub4_5583.method3413(anInt5584 * 806878007, (byte) -4)) {
						anInt5588 = 1673486703 * (-1050600049 * anInt5588 | 0x80);
					}
					if (aClass298_Sub37_Sub4_5583.method3415(806878007 * anInt5584, -460356399)) {
						anInt5588 = 1673486703 * (-1050600049 * anInt5588 | 0x100);
					}
					if (aClass298_Sub37_Sub4_5583.method3414(anInt5584 * 806878007, (byte) -54)) {
						anInt5588 = 1673486703 * (anInt5588 * -1050600049 | 0x400);
					}
					if (aClass298_Sub37_Sub4_5587 != null) {
						if (aClass298_Sub37_Sub4_5587.method3413(-643912397 * anInt5586, (byte) 9)) {
							anInt5588 = 1673486703 * (-1050600049 * anInt5588 | 0x80);
						}
						if (aClass298_Sub37_Sub4_5587.method3415(anInt5586 * -643912397, -460356399)) {
							anInt5588 = 1673486703 * (anInt5588 * -1050600049 | 0x100);
						}
						if (aClass298_Sub37_Sub4_5587.method3414(-643912397 * anInt5586, (byte) 7)) {
							anInt5588 = 1673486703 * (-1050600049 * anInt5588 | 0x400);
						}
					}
					anInt5588 = (anInt5588 * -1050600049 | 0x20) * 1673486703;
					aBoolean5585 = true;
					return true;
				}
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sf.a(").append(')').toString());
		}
	}

	final void method5864(int i) {
		try {
			aBoolean5585 = false;
			anInt5588 = 0;
			aClass298_Sub37_Sub4_5587 = null;
			aClass298_Sub37_Sub4_5583 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sf.f(").append(')').toString());
		}
	}

	Class441() {
		/* empty */
	}

	static final void method5865(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			String string = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
			if (Class298_Sub6.method2863(string, class403, -1912889290) != null) {
				string = string.substring(0, string.length() - 1);
			}
			class105.anObjectArray1243 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.hasScripts = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sf.ku(").append(')').toString());
		}
	}

	static final String method5866(int i, int i_2_) {
		try {
			String string = Integer.toString(i);
			for (int i_3_ = string.length() - 3; i_3_ > 0; i_3_ -= 3) {
				string = new StringBuilder().append(string.substring(0, i_3_)).append(Symbol.COMMA).append(string.substring(i_3_)).toString();
			}
			if (string.length() > 9) {
				return new StringBuilder().append(" ").append(Class285.method2709(65408, -2039864554)).append(string.substring(0, string.length() - 8)).append(LocalizedString.LABEL_SHORT_M.getText(Class321.ACTIVE_LANGUAGE, -875414210)).append(" (").append(string).append(")").append(Symbol.CLOSE_COL_TAG).toString();
			}
			if (string.length() > 6) {
				return new StringBuilder().append(" ").append(Class285.method2709(16777215, -1284566910)).append(string.substring(0, string.length() - 4)).append(LocalizedString.LABEL_SHORT_K.getText(Class321.ACTIVE_LANGUAGE, -875414210)).append(" (").append(string).append(")").append(Symbol.CLOSE_COL_TAG).toString();
			}
			return new StringBuilder().append(" ").append(Class285.method2709(16776960, -1902529284)).append(string).append(Symbol.CLOSE_COL_TAG).toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sf.kn(").append(')').toString());
		}
	}

	static final void method5867(ClientScript2 class403, byte i) {
		try {
			int i_4_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			WorldMapLabel worldMapLabel = Class363.aWorldMapLabelList_3931.method4116(i_4_, -1551283008);
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = 715019623 * worldMapLabel.anInt3785;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sf.amw(").append(')').toString());
		}
	}
}
