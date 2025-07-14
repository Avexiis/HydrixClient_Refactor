/* Class298_Sub45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub45 extends Node {
	MagnetDefinitions aMagnetDefinitions_7514;
	float aFloat7515;
	int anInt7516;
	int anInt7517;
	MagnetConfig aMagnetConfig_7518;
	int anInt7519;
	float aFloat7520;
	static float[] aFloatArray7521 = new float[3];
	static Class298_Sub37_Sub15 aClass298_Sub37_Sub15_7522;

	void method3532(int i) {
		try {
			((Class298_Sub45) this).anInt7516 = 2086576921 * ((Class298_Sub45) this).aMagnetConfig_7518.anInt671;
			((Class298_Sub45) this).anInt7517 = ((Class298_Sub45) this).aMagnetConfig_7518.anInt675 * 587912369;
			((Class298_Sub45) this).anInt7519 = ((Class298_Sub45) this).aMagnetConfig_7518.anInt676 * -247287593;
			if (((Class298_Sub45) this).aMagnetConfig_7518.aClass233_677 != null)
				((Class298_Sub45) this).aMagnetConfig_7518.aClass233_677.method2167((float) (1776313545 * (((Class298_Sub45) this).aMagnetDefinitions_7514.anInt1933)), (float) (-739294135 * (((Class298_Sub45) this).aMagnetDefinitions_7514.anInt1934)), (float) (((Class298_Sub45) this).aMagnetDefinitions_7514.anInt1935 * -1849369705), aFloatArray7521);
			((Class298_Sub45) this).aFloat7515 = aFloatArray7521[0];
			((Class298_Sub45) this).aFloat7520 = aFloatArray7521[2];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("acf.a(").append(')').toString());
		}
	}

	Class298_Sub45(MagnetConfig magnetConfig, ClickableGeometry clickableGeometry) {
		((Class298_Sub45) this).aMagnetConfig_7518 = magnetConfig;
		((Class298_Sub45) this).aMagnetDefinitions_7514 = ((Class298_Sub45) this).aMagnetConfig_7518.method775((byte) 3);
		method3532(-1046035099);
	}

	static final void method3533(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, byte i) {
		try {
			class105.transparency = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) * 728904583;
			LocalizedString.markComponentForRedraw(class105, 1196529132);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("acf.dx(").append(')').toString());
		}
	}
}
