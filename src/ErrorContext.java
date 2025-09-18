/* ErrorContext - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ErrorContext {
	public static int anInt3689 = 1024;
	public static int anInt3690 = 9;
	public static int anInt3691 = 7;
	public static int anInt3692 = 512;
	public static int anInt3693 = 511;
	public static int anInt3694 = 8;
	public static int anInt3695 = 256;
	public static int anInt3696 = 2;
	public static int anInt3697 = 128;

	static {
		Math.sqrt(131072.0);
	}

	ErrorContext() throws Throwable {
		throw new Error();
	}

	static final void method4170(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.texturePreference.method5686(-550588042) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw info(runtimeexception, new StringBuilder().append("ol.anh(").append(')').toString());
		}
	}

	static void method4171(int i, int i_0_, IComponentDefinition class105, Class_ta class_ta, int i_1_, int i_2_, int i_3_) {
		try {
			int i_4_ = Class10.anInt129 * 1168366243;
			int[] is = Class10.anIntArray135;
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				Player player = GameClient.players[is[i_5_]];
				if (null != player && player.method4477(526198823) && !player.hidden && (player != Class287.myPlayer) && (player.plane == (Class287.myPlayer.plane))) {
					SceneObjectPosition sceneObjectPosition = (player.method4337().aSceneObjectPosition_2599);
					int i_6_ = (int) sceneObjectPosition.x / 128 - i / 128;
					int i_7_ = (int) sceneObjectPosition.z / 128 - i_0_ / 128;
					boolean bool = false;
					for (int i_8_ = 0; i_8_ < GameClient.anInt8941 * -1054937867; i_8_++) {
						if (player.username.equals(GameClient.aStringArray8704[i_8_]) && GameClient.anIntArray8946[i_8_] != 0) {
							bool = true;
							break;
						}
					}
					boolean bool_9_ = false;
					for (int i_10_ = 0; i_10_ < -1801543887 * Class489.anInt6071; i_10_++) {
						if (player.username.equals(Class82_Sub6.aClass7Array6846[i_10_].aString93)) {
							bool_9_ = true;
							break;
						}
					}
					boolean bool_11_ = false;
					if (0 != -1473655357 * (Class287.myPlayer.teamId) && 0 != (-1473655357 * player.teamId) && ((player.teamId * -1473655357) == (Class287.myPlayer.teamId) * -1473655357))
						bool_11_ = true;
					if (player.isClickable)
						FluType.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[6], (byte) 52);
					else if (bool_11_)
						FluType.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[4], (byte) -19);
					else if (player.isInCombat)
						FluType.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[7], (byte) -81);
					else if (bool)
						FluType.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[3], (byte) 25);
					else if (bool_9_)
						FluType.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[5], (byte) -50);
					else
						FluType.method5883(class105, class_ta, i_1_, i_2_, i_6_, i_7_, SubIncommingPacket.aClass57Array2349[2], (byte) -40);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw info(runtimeexception, new StringBuilder().append("ol.n(").append(')').toString());
		}
	}

	public static void method4172(String string, boolean bool, boolean bool_12_, boolean bool_13_, boolean bool_14_, byte i) {
		try {
			Class273.method2559(string, bool, bool_12_, "openjs", bool_13_, bool_14_, -1892115895);
		} catch (RuntimeException runtimeexception) {
			throw info(runtimeexception, new StringBuilder().append("ol.a(").append(')').toString());
		}
	}

	public static void method4173(GraphicsToolkit class_ra, Js5 class243, int i) {
		try {
			Class89[] class89s = Class89.method993(class243, Class74.anInt692 * -1217066055, 0);
			Class160.aClass57Array1646 = new Class57[class89s.length];
			for (int i_15_ = 0; i_15_ < class89s.length; i_15_++)
				Class160.aClass57Array1646[i_15_] = class_ra.method5125(class89s[i_15_], true);
			class89s = Class89.method993(class243, -355151363 * Class74.anInt694, 0);
			ReferenceTable.aClass57Array6561 = new Class57[class89s.length];
			for (int i_16_ = 0; i_16_ < class89s.length; i_16_++)
				ReferenceTable.aClass57Array6561[i_16_] = class_ra.method5125(class89s[i_16_], true);
			class89s = Class89.method993(class243, 1838189665 * Class143.anInt1558, 0);
			Class416.aClass57Array5334 = new Class57[class89s.length];
			for (int i_17_ = 0; i_17_ < class89s.length; i_17_++)
				Class416.aClass57Array5334[i_17_] = class_ra.method5125(class89s[i_17_], true);
			class89s = Class89.method993(class243, Class400.anInt5223 * 1862609057, 0);
			IntegerPreferenceField.aClass57Array5351 = new Class57[class89s.length];
			for (int i_18_ = 0; i_18_ < class89s.length; i_18_++)
				IntegerPreferenceField.aClass57Array5351[i_18_] = class_ra.method5125(class89s[i_18_], true);
			class89s = Class89.method993(class243, -81301735 * Class74.anInt693, 0);
			Class128_Sub2.aClass57Array8560 = new Class57[class89s.length];
			for (int i_19_ = 0; i_19_ < class89s.length; i_19_++)
				Class128_Sub2.aClass57Array8560[i_19_] = class_ra.method5125(class89s[i_19_], true);
			class89s = Class89.method993(class243, Class74.anInt696 * -2088314757, 0);
			Class74.aClass57Array699 = new Class57[class89s.length];
			for (int i_20_ = 0; i_20_ < class89s.length; i_20_++)
				Class74.aClass57Array699[i_20_] = class_ra.method5125(class89s[i_20_], true);
			class89s = Class89.method993(class243, Class298_Sub36.anInt7398 * -1199789537, 0);
			Class234.aClass57Array2598 = new Class57[class89s.length];
			int i_21_ = 25;
			for (int i_22_ = 0; i_22_ < class89s.length; i_22_++) {
				class89s[i_22_].method991(-i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0));
				Class234.aClass57Array2598[i_22_] = class_ra.method5125(class89s[i_22_], true);
			}
			class89s = Class89.method993(class243, Class82_Sub6.anInt6842 * -2107184677, 0);
			Class82_Sub11.aClass57Array6861 = new Class57[class89s.length];
			for (int i_23_ = 0; i_23_ < class89s.length; i_23_++)
				Class82_Sub11.aClass57Array6861[i_23_] = class_ra.method5125(class89s[i_23_], true);
			class89s = Class89.method993(class243, VarClientTypeList.anInt6092 * -1624054445, 0);
			SubIncommingPacket.aClass57Array2349 = new Class57[class89s.length];
			i_21_ = 12;
			for (int i_24_ = 0; i_24_ < class89s.length; i_24_++) {
				class89s[i_24_].method991(-i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0));
				SubIncommingPacket.aClass57Array2349[i_24_] = class_ra.method5125(class89s[i_24_], true);
			}
			class89s = Class89.method993(class243, Class74.anInt697 * 1200791325, 0);
			Class130_Sub2.aClass57Array6959 = new Class57[class89s.length];
			i_21_ = 12;
			for (int i_25_ = 0; i_25_ < class89s.length; i_25_++) {
				class89s[i_25_].method991(-i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0));
				Class130_Sub2.aClass57Array6959[i_25_] = class_ra.method5125(class89s[i_25_], true);
			}
			IdentityKitTypeList.aClass57_1562 = class_ra.method5125(Class89.method987(class243, (Class237.anInt6667 * 1359711467), 0), true);
			SpotAnimation.aClass57_573 = class_ra.method5125(Class89.method987(class243, ((Class128_Sub1.anInt8557) * -1848350339), 0), true);
			class89s = Class89.method993(class243, Class298_Sub24_Sub1.anInt9281 * -328242359, 0);
			Class250.aClass57Array2766 = new Class57[class89s.length];
			for (int i_26_ = 0; i_26_ < class89s.length; i_26_++)
				Class250.aClass57Array2766[i_26_] = class_ra.method5125(class89s[i_26_], true);
		} catch (RuntimeException runtimeexception) {
			throw info(runtimeexception, new StringBuilder().append("ol.d(").append(')').toString());
		}
	}

	static String method4174(Class298_Sub37_Sub5 class298_sub37_sub5, byte i) {
		try {
			return new StringBuilder().append(((Class298_Sub37_Sub5) class298_sub37_sub5).aString9585).append(Class285.method2709(16777215, -1514789129)).append(" >").toString();
		} catch (RuntimeException runtimeexception) {
			throw info(runtimeexception, new StringBuilder().append("ol.be(").append(')').toString());
		}
	}

	public static RuntimeException_Sub2 info(Throwable throwable, String string) {
		RuntimeException_Sub2 runtimeexception_sub2;
		if (throwable instanceof RuntimeException_Sub2) {
			runtimeexception_sub2 = (RuntimeException_Sub2) throwable;
			StringBuilder stringbuilder = new StringBuilder();
			RuntimeException_Sub2 runtimeexception_sub2_27_ = runtimeexception_sub2;
			((RuntimeException_Sub2) runtimeexception_sub2_27_).aString6308 = stringbuilder.append(((RuntimeException_Sub2) runtimeexception_sub2_27_).aString6308).append(' ').append(string).toString();
		} else
			runtimeexception_sub2 = new RuntimeException_Sub2(throwable, string);
		return runtimeexception_sub2;
	}
}
