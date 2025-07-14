/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.util.Date;
import java.util.Hashtable;

public class Class304 {
	static File aFile3265;
	static boolean aBoolean3266 = false;
	static Hashtable aHashtable3267 = new Hashtable(16);

	Class304() throws Throwable {
		throw new Error();
	}

	static final void method3738(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) 40);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Class484.method6142(class105, RSInterface, class403, -721593745);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mq.ee(").append(')').toString());
		}
	}

	static final void method3739(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) 99);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_1_ >> 16];
			Class21.method365(class105, RSInterface, true, 0, class403, 1313790889);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mq.hj(").append(')').toString());
		}
	}

	public static int method3740(int i, int i_2_, int i_3_) {
		try {
			int i_4_ = i >>> 31;
			return (i + i_4_) / i_2_ - i_4_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mq.x(").append(')').toString());
		}
	}

	public static Class128 method3741(Packet class298_sub53, int i) {
		try {
			Class128 class128 = SpotAnimation.method608(class298_sub53, -2147461076);
			int i_5_ = class298_sub53.readUnsignedInt();
			int i_6_ = class298_sub53.readUnsignedInt();
			int i_7_ = class298_sub53.gSmart2or4n();
			return new Class128_Sub1(class128.aClass139_6322, class128.aClass133_6323, class128.anInt6327 * -39975161, class128.anInt6325 * 1886882435, class128.anInt6326 * -944287579, class128.anInt6330 * -1387457793, -684094775 * class128.anInt6328, 955568089 * class128.anInt6329, class128.anInt6324 * 782326281, i_5_, i_6_, i_7_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mq.i(").append(')').toString());
		}
	}

	static String method3742(long l) {
		try {
			return Class92.method1003(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz", -1799547908);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mq.no(").append(')').toString());
		}
	}
}
