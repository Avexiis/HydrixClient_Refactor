/* Class423 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.Socket;

public class Class423 {
	static Class431 aClass431_5352;
	static int anInt5353 = 4096;
	static HashTable aClass437_5354 = new HashTable(4);
	static Socket aSocket5355;
	public static Class57 aClass57_5356;

	static {
		aClass431_5352 = new Class431();
	}

	Class423() throws Throwable {
		throw new Error();
	}

	public static void method5733(boolean bool, int i) {
		try {
			if (bool && Class301_Sub1.currentWorldMapArea != null)
				Class229.anInt6459 = (704948247 * Class301_Sub1.currentWorldMapArea.anInt9643);
			else
				Class229.anInt6459 = -678712477;
			Class301_Sub1.currentWorldMapArea = null;
			DiskFile.aLinkedNodeList_5986 = null;
			Class301_Sub1.anInt7624 = 0;
			Huffman.aClass105_1373 = null;
			Class301_Sub1.method3691();
			Class301_Sub1.aLinkedNodeList_3236.method5943((byte) 1);
			Class301_Sub1.mapAreaKeys = null;
			Class274.aClass57_6539 = null;
			Class301_Sub1.anInt7632 = 433609607;
			Class301_Sub1.anInt7627 = 789877945;
			Class381.aClass4_4119 = null;
			Class255.aClass4_2795 = null;
			Class52.aClass4_508 = null;
			Class414.aClass4_5326 = null;
			Class355.aClass4_6525 = null;
			Class400.aClass4_5224 = null;
			Class152.aClass4_1594 = null;
			Class241.aClass4_2707 = null;
			if (null != Class301_Sub1.aWorldMapLabelList_3251) {
				Class301_Sub1.aWorldMapLabelList_3251.method4118(46936435);
				Class301_Sub1.aWorldMapLabelList_3251.method4119(128, 64, 41639270);
			}
			if (Class301_Sub1.mapIconTypeList != null)
				Class301_Sub1.mapIconTypeList.method6160(64, 64, -1144646938);
			if (null != Class301_Sub1.objectTypeList)
				Class301_Sub1.objectTypeList.method5792(256, (byte) 50);
			Class472.configLoader.method3825(64, (byte) 42);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rn.bs(").append(')').toString());
		}
	}

	static boolean method5734(int i) {
		try {
			return Class8.aBoolean108;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rn.k(").append(')').toString());
		}
	}
}
