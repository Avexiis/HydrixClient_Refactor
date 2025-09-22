/* DevConsoleState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class DevConsoleState {
	static int anInt98;
	static int anInt99;
	static int anInt100 = 350;
	static String aString101;
	static int lineCount = 0;
	static int scrollOffset = 0;
	static int anInt104;
	static int anInt105;
	static int primaryLineHeight;
	static String[] lines;
	static boolean aBoolean108;
	static String[] aStringArray109;
	static int secondaryLineHeight;
	static String SYMBOL_SEQUENCE = "\\/.:, _-+[]~@";
	static String SUCCESS = "Success";
	static String FAILURE = "Failure";
	static boolean aBoolean114;

	static {
		aString101 = "";
		anInt105 = 0;
		anInt99 = 0;
		anInt98 = 0;
		aBoolean108 = false;
		anInt104 = 1428832631;
	}

	DevConsoleState() throws Throwable {
		throw new Error();
	}

	static String method315(Class298_Sub37_Sub15 class298_sub37_sub15, int i) {
		try {
			if ((((Class298_Sub37_Sub15) class298_sub37_sub15).aString9669 == null) || ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9669.length() == 0) {
				if (null != (((Class298_Sub37_Sub15) class298_sub37_sub15).aString9657) && ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9657.length() > 0)
					return ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9667 + LocalizedString.LABEL_SEPARATOR_SPACE_COLON_SPACE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210) + ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9657;
				return (((Class298_Sub37_Sub15) class298_sub37_sub15).aString9667);
			}
			if ((null != ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9657) && ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9657.length() > 0)
				return ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9667 + LocalizedString.LABEL_SEPARATOR_SPACE_COLON_SPACE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210) + ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9657 + LocalizedString.LABEL_SEPARATOR_SPACE_COLON_SPACE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210) + ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9669;
			return ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9667 + LocalizedString.LABEL_SEPARATOR_SPACE_COLON_SPACE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210) + ((Class298_Sub37_Sub15) class298_sub37_sub15).aString9669;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "ai.bf(" + ')');
		}
	}

	static final void method316(ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class439.method5850(string, 1986272342);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "ai.vh(" + ')');
		}
	}

	static final void method317(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = ((ClientScript2) class403).aClass298_Sub25_5237.aString7358;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "ai.xj(" + ')');
		}
	}

	static Class298_Sub19_Sub1 method318(Class298_Sub19_Sub1 class298_sub19_sub1, int i) {
		try {
			Class298_Sub19_Sub1 class298_sub19_sub1_0_ = (null == class298_sub19_sub1 ? new Class298_Sub19_Sub1() : new Class298_Sub19_Sub1(class298_sub19_sub1));
			class298_sub19_sub1_0_.method2962(9, 128, 346222187);
			return class298_sub19_sub1_0_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "ai.f(" + ')');
		}
	}

	public static void method319(int i) {
		try {
			IComponentDefinition.aClass348_1135.method4187();
			IComponentDefinition.aClass348_1138.method4187();
			IComponentDefinition.aClass348_1136.method4187();
			IComponentDefinition.aClass348_1296.method4187();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "ai.g(" + ')');
		}
	}

	static final void method320(ClientScript2 class403, int i) {
		try {
			OverheadString overheadString = ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242.method4437(658355638);
			if (null == overheadString)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = overheadString.method721((byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "ai.aok(" + ')');
		}
	}

	static final void method321(int i, int[] keys, int i_1_) {
		try {
			if (Class378.method4671(i, keys, -1347754722)) {
				IComponentDefinition[] class105s = SpotAnimTypeList.aRSInterfaceArray4165[i].aClass105Array1405;
				for (int i_2_ = 0; i_2_ < class105s.length; i_2_++) {
					IComponentDefinition class105 = class105s[i_2_];
					if (class105 != null && class105.aAnimator_1152 != null)
						class105.aAnimator_1152.method5834(-341211018);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "ai.lu(" + ')');
		}
	}
}
