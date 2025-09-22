/* ObjectDeque - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class ObjectDeque extends Node {
	int anInt7148;
	int anInt7149;
	public int anInt7150;
	int anInt7151;
	public static LinkedNodeList aLinkedNodeList_7152 = new LinkedNodeList();
	int anInt7153;
	int anInt7154;
	public int anInt7155;
	int anInt7156;
	int anInt7157;
	Class435 aClass435_7158;
	boolean aBoolean7159 = true;
	boolean aBoolean7160 = false;
	int anInt7161;
	public static LinkedNodeList aLinkedNodeList_7162 = new LinkedNodeList();
	static long aLong7163 = 2843605614692854059L;
	public static int anInt7164;

	ObjectDeque() {
		/* empty */
	}

	public static int method2845(int i, int i_0_, boolean bool, boolean bool_1_, int i_2_) {
		try {
			Class298_Sub9 class298_sub9 = DevConsole.method2437(i, bool_1_, 1819104649);
			if (class298_sub9 == null)
				return 0;
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < ((Class298_Sub9) class298_sub9).anIntArray7226.length; i_4_++) {
				if (((Class298_Sub9) class298_sub9).anIntArray7226[i_4_] >= 0 && (((Class298_Sub9) class298_sub9).anIntArray7226[i_4_] < (-888767613 * Class298_Sub32_Sub14.aClass477_9400.itemDefinitionsLength))) {
					ItemDefinitions class468 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions((((Class298_Sub9) class298_sub9).anIntArray7226[i_4_])));
					int i_5_ = class468.method6037(i_0_, (Class92.aClass504_905.method6251(i_0_, 1149077752).anInt6100) * -388931549, -2139054269);
					if (bool)
						i_3_ += (((Class298_Sub9) class298_sub9).anIntArray7227[i_4_]) * i_5_;
					else
						i_3_ += i_5_;
				}
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aab.p(").append(')').toString());
		}
	}

	static void method2846(int i, int i_6_, byte i_7_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(5, (long) i);
			class298_sub37_sub12.method3449((byte) 35);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = i_6_ * 1274450087;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aab.az(").append(')').toString());
		}
	}
}
