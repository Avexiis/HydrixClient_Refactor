/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;
import java.util.Stack;

public class Class335 {
	public Class365_Sub1 aClass365_Sub1_3616;
	boolean aBoolean3617;
	Class324 aClass324_3618;
	static Stack aStack3619 = new Stack();

	public boolean method4084(GraphicsToolkit class_ra, int i, int i_0_, int i_1_) {
		try {
			int i_2_ = aClass365_Sub1_3616.method4356((byte) 34);
			if (null != aClass365_Sub1_3616.aClass302_Sub1Array7726) {
				for (int i_3_ = 0; i_3_ < aClass365_Sub1_3616.aClass302_Sub1Array7726.length; i_3_++) {
					aClass365_Sub1_3616.aClass302_Sub1Array7726[i_3_].anInt7645 <<= i_2_;
					if ((aClass365_Sub1_3616.aClass302_Sub1Array7726[i_3_].method3719((1152678761 * (((Class324) ((Class335) this).aClass324_3618).anInt3447)) + i, (1804353071 * (((Class324) ((Class335) this).aClass324_3618).anInt3445)) + i_0_)) && aClass365_Sub1_3616.method4350(class_ra, i, i_0_, (byte) 1)) {
						aClass365_Sub1_3616.aClass302_Sub1Array7726[i_3_].anInt7645 >>= i_2_;
						return true;
					}
					aClass365_Sub1_3616.aClass302_Sub1Array7726[i_3_].anInt7645 >>= i_2_;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ny.p(").append(')').toString());
		}
	}

	Class335() {
		/* empty */
	}

	static final void method4085(ClientScript2 class403, short i) {
		try {
			Class106.method1137(1451563513);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ny.agj(").append(')').toString());
		}
	}

	static void method4086(int i) {
		try {
			if (OverlayType.activeToolkit.method5051()) {
				OverlayType.activeToolkit.method5002(Class52_Sub2_Sub1.aCanvas9079, 1231237984);
				Class267.method2528(600492820);
				Dimension dimension = Class52_Sub2_Sub1.aCanvas9079.getSize();
				OverlayType.activeToolkit.method5163((Class52_Sub2_Sub1.aCanvas9079), dimension.width, dimension.height, 900330778);
				OverlayType.activeToolkit.method5003(Class52_Sub2_Sub1.aCanvas9079, (byte) -92);
			} else
				ClanSettings.method4578(GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-644336063), false, 622850291);
			Class360.method4301(-103765582);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ny.fx(").append(')').toString());
		}
	}

	static final void method4087(ClientScript2 class403, int i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Character.toUpperCase((char) i_4_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ny.aan(").append(')').toString());
		}
	}

	static final void method4088(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class298_Sub37_Sub8 class298_sub37_sub8 = GraphicsToolkit.aClass256_5315.method2441(i_5_, -1382788353);
			if (class298_sub37_sub8.anIntArray9599 == null)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = class298_sub37_sub8.anIntArray9599.length;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ny.acj(").append(')').toString());
		}
	}
}
