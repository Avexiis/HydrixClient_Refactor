/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.List;

public class Class344 {
	static int anInt3675;
	static Class302_Sub3_Sub1_Sub1[] aClass302_Sub3_Sub1_Sub1Array3676;
	static int anInt3677;
	static int anInt3678 = 0;
	static ClickableGeometry[] aClickableGeometryArray3679;
	static int anInt3680;
	static int anInt3681;
	static int anInt3682;
	static List aList3683;
	static HashTable aClass437_3684;
	static int anInt3685;
	static int anInt3686 = 0;
	public static String aString3687;
	public static int anInt3688;

	static {
		anInt3680 = 0;
		anInt3681 = 0;
		anInt3682 = 0;
		anInt3677 = 0;
		aClass437_3684 = new HashTable(8);
		anInt3685 = 0;
		anInt3675 = 1483930890;
	}

	Class344() throws Throwable {
		throw new Error();
	}

	static final void method4164(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) 9);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			SpotAnimTypeList.method4862(class105, RSInterface, class403, -2144331170);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oi.cu(").append(')').toString());
		}
	}

	public static void method4165(int i, int i_1_, int i_2_, int i_3_) {
		try {
			i <<= 3;
			i_1_ <<= 3;
			i_2_ <<= 3;
			GameClient.aFloat8757 = (float) i;
			GameClient.aFloat8949 = (float) i_1_;
			if (ObjectDeque.anInt7164 * -863531439 == 3) {
				GameClient.anInt8756 = -648269561 * i;
				Class135.anInt6384 = -1587695039 * i_1_;
				Class229.anInt6458 = -851711283 * i_2_;
			}
			Class91.method1002((byte) 63);
			GameClient.aBoolean8763 = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oi.hh(").append(')').toString());
		}
	}
}
