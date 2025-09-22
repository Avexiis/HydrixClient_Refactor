/* Class82_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub5 extends Class82 {
	String aString6834;
	int anInt6835;
	int anInt6836;
	int anInt6837;

	public void method868() {
		Class87.entities[796511923 * ((Class82_Sub5) this).anInt6836].method1015(1745967363).method4430(((Class82_Sub5) this).aString6834, 1847855163 * ((Class82_Sub5) this).anInt6835, 0, -1158638155 * ((Class82_Sub5) this).anInt6837, (byte) -93);
	}

	public void method866(int i) {
		try {
			Class87.entities[796511923 * ((Class82_Sub5) this).anInt6836].method1015(1923584032).method4430(((Class82_Sub5) this).aString6834, 1847855163 * ((Class82_Sub5) this).anInt6835, 0, -1158638155 * ((Class82_Sub5) this).anInt6837, (byte) -32);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("xj.f(").append(')').toString());
		}
	}

	Class82_Sub5(Packet class298_sub53) {
		super(class298_sub53);
		((Class82_Sub5) this).anInt6836 = class298_sub53.readUnsignedShort() * -1921544069;
		((Class82_Sub5) this).aString6834 = class298_sub53.getString();
		((Class82_Sub5) this).anInt6835 = class298_sub53.readUnsignedInt() * -170815245;
		((Class82_Sub5) this).anInt6837 = class298_sub53.readUnsignedShort() * 2118217885;
	}

	public void method869() {
		Class87.entities[796511923 * ((Class82_Sub5) this).anInt6836].method1015(946944575).method4430(((Class82_Sub5) this).aString6834, 1847855163 * ((Class82_Sub5) this).anInt6835, 0, -1158638155 * ((Class82_Sub5) this).anInt6837, (byte) -33);
	}

	public static int method882(int i, boolean bool, byte i_0_) {
		try {
			if (bool)
				return 0;
			Class298_Sub9 class298_sub9 = DevConsole.method2437(i, bool, 547680225);
			if (null == class298_sub9)
				return ((Class300.aClass518_3217.method6311(i, 211542342).anInt9604) * 1317156085);
			int i_1_ = 0;
			for (int i_2_ = 0; i_2_ < ((Class298_Sub9) class298_sub9).anIntArray7226.length; i_2_++) {
				if (-1 == ((Class298_Sub9) class298_sub9).anIntArray7226[i_2_])
					i_1_++;
			}
			i_1_ += ((Class300.aClass518_3217.method6311(i, 138660103).anInt9604 * 1317156085) - ((Class298_Sub9) class298_sub9).anIntArray7226.length);
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("xj.i(").append(')').toString());
		}
	}

	public static final int method883(byte i) {
		try {
			return (int) (1000000000L / (GameShell.aLong6484 * -4639622049358970979L));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("xj.l(").append(')').toString());
		}
	}
}
