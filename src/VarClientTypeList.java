/* VarClientTypeList - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarClientTypeList {
	CachingHashMap aClass348_6089 = new CachingHashMap(64);
	public int files_count;
	Js5 aClass243_6091;
	static int anInt6092;

	public VarClientTypeList(GameContext gameContext, Language language, Js5 class243) {
		((VarClientTypeList) this).aClass243_6091 = class243;
		files_count = (((VarClientTypeList) this).aClass243_6091.method2316((-1006924897 * (Js5ConfigGroup.aClass120_1424.anInt1460)), -1214131434) * 1832969825);
	}

	public VarClientType method6191(int i, byte i_0_) {
		try {
			VarClientType varClientType;
			synchronized (((VarClientTypeList) this).aClass348_6089) {
				varClientType = (VarClientType) ((VarClientTypeList) this).aClass348_6089.get((long) i);
			}
			if (varClientType != null)
				return varClientType;
			byte[] is;
			synchronized (((VarClientTypeList) this).aClass243_6091) {
				is = (((VarClientTypeList) this).aClass243_6091.getFileFromArchive(Js5ConfigGroup.aClass120_1424.anInt1460 * -1006924897, i, (byte) -73));
			}
			varClientType = new VarClientType();
			if (is != null)
				varClientType.method6067(new Packet(is), 1327711716);
			synchronized (((VarClientTypeList) this).aClass348_6089) {
				((VarClientTypeList) this).aClass348_6089.put(varClientType, (long) i);
			}
			return varClientType;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uj.a(").append(')').toString());
		}
	}

	public static boolean method6192(String string, int i) {
		try {
			if (string == null)
				return false;
			for (int i_1_ = 0; i_1_ < GameClient.anInt8941 * -1054937867; i_1_++) {
				if (string.equalsIgnoreCase(GameClient.aStringArray8704[i_1_]))
					return true;
			}
			if (string.equalsIgnoreCase(Class287.myPlayer.username))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uj.md(").append(')').toString());
		}
	}

	static void method6193(int i, int i_2_, int i_3_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(16, (long) i);
			class298_sub37_sub12.method3449((byte) 109);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = 1274450087 * i_2_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uj.an(").append(')').toString());
		}
	}
}
