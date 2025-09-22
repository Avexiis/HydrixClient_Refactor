/* Class302_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class302_Sub3 extends Class302 {
	public Class302_Sub3 aClass302_Sub3_7649;
	public Class302_Sub3 aClass302_Sub3_7650;

	public void method3721(int i) {
		try {
			if (null != aClass302_Sub3_7649) {
				aClass302_Sub3_7649.aClass302_Sub3_7650 = aClass302_Sub3_7650;
				aClass302_Sub3_7650.aClass302_Sub3_7649 = aClass302_Sub3_7649;
				aClass302_Sub3_7650 = null;
				aClass302_Sub3_7649 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aap.b(").append(')').toString());
		}
	}

	public static void method3722(short i) {
		try {
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aClass422_Sub17_7564, 2, 933731200);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aClass422_Sub17_7565, 2, 15061497);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aRemoveRoofPreference_7547, 1, -996473537);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.groundBlendingPreference, 1, -1713418665);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aGraphicsSetup_7569, 1, -779153916);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.flickeringPreference, 1, 408587278);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.characterShadowPreference, 1, -771369154);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.texturePreference, 1, -652941935);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.sceneryShadowPreference, 1, -1471206550);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.lightingPreference, 1, 383050729);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.waterDetailPreference, 0, -742030026);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.fogPreference, 1, -361136273);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.antialiasPreference, 0, -802724940);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aAntialiasPreference_7550, 0, -1875981876);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.particlePreference, 1, 1215494852);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aMapSizePreference_7558, Class115.aClass115_1383.anInt1387 * -160182505, -342617786);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.bloomPreference, 0, -952954318);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aClass422_Sub19_7567, 1, 571491634);
			Class490.method6170(1113089752);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aScreenSizePreference_7566, 1, -2045258023);
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aGraphicsPresetPreference_7576, 3, -496921634);
			Class359.method4294(-32585668);
			GameClient.map.method2640((byte) 54).forceUpdate(-1309443074);
			GameClient.aBoolean8676 = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aap.u(").append(')').toString());
		}
	}

	static final void method3723(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) 8);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Class214.method1989(class105, RSInterface, class403, (byte) 121);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aap.ks(").append(')').toString());
		}
	}
}
