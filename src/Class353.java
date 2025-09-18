/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class353 {
	public String aString3819;
	public int anInt3820;

	Class353() {
		/* empty */
	}

	static final void method4249(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -11);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Class128.method1436(class105, RSInterface, class403, -61919931);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("os.ho(").append(')').toString());
		}
	}

	static final void method4250(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = LoginData.anInt3909 * -576042023;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("os.aha(").append(')').toString());
		}
	}

	static void method4251(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), 245040087).aString4025);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("os.a(").append(')').toString());
		}
	}

	static int method4252(int i, int i_1_) {
		try {
			int i_2_;
			if (i > 12010) {
				Class116.method1272(976671472);
				i_2_ = 4;
			} else if (i > 5033) {
				Class302_Sub3.method3722((short) 16862);
				i_2_ = 3;
			} else if (i > 2018) {
				Class320.method3910(-476807021);
				i_2_ = 2;
			} else {
				Class69.method788(true, -930644451);
				i_2_ = 1;
			}
			if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-1158457222) != 2) {
				GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570, 2, 1051550423);
				ClanSettings.method4578(2, false, 622850291);
			} else
				GraphicsAutoSetup.clientPreferences.method3539(GraphicsAutoSetup.clientPreferences.graphicsPreference, true, -1871094786);
			Class3.writePreferences();
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("os.i(").append(')').toString());
		}
	}
}
