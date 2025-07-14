/* VarPlayerTypeList - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarPlayerTypeList {
	Js5 aClass243_2338;
	public int varpSize;
	CachingHashMap aClass348_2340 = new CachingHashMap(64);
	static long aLong2341;

	public VarPlayerType method1914(int i, int i_0_) {
		try {
			VarPlayerType varPlayerType;
			synchronized (((VarPlayerTypeList) this).aClass348_2340) {
				varPlayerType = (VarPlayerType) ((VarPlayerTypeList) this).aClass348_2340.get((long) i);
			}
			if (null != varPlayerType)
				return varPlayerType;
			byte[] is;
			synchronized (((VarPlayerTypeList) this).aClass243_2338) {
				is = (((VarPlayerTypeList) this).aClass243_2338.getFileFromArchive(-1006924897 * Js5ConfigGroup.aClass120_1421.anInt1460, i, (byte) -4));
			}
			varPlayerType = new VarPlayerType();
			if (null != is)
				varPlayerType.method1927(new Packet(is), 27685189);
			synchronized (((VarPlayerTypeList) this).aClass348_2340) {
				((VarPlayerTypeList) this).aClass348_2340.put(varPlayerType, (long) i);
			}
			return varPlayerType;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("iq.a(").append(')').toString());
		}
	}

	public void method1915(int i) {
		try {
			synchronized (((VarPlayerTypeList) this).aClass348_2340) {
				((VarPlayerTypeList) this).aClass348_2340.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("iq.f(").append(')').toString());
		}
	}

	public void method1916(int i, byte i_1_) {
		try {
			synchronized (((VarPlayerTypeList) this).aClass348_2340) {
				((VarPlayerTypeList) this).aClass348_2340.method4186(i, -355539463);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("iq.b(").append(')').toString());
		}
	}

	public void method1917(byte i) {
		try {
			synchronized (((VarPlayerTypeList) this).aClass348_2340) {
				((VarPlayerTypeList) this).aClass348_2340.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("iq.p(").append(')').toString());
		}
	}

	public VarPlayerTypeList(GameContext gameContext, Language language, Js5 class243) {
		((VarPlayerTypeList) this).aClass243_2338 = class243;
		if (null != ((VarPlayerTypeList) this).aClass243_2338)
			varpSize = (((VarPlayerTypeList) this).aClass243_2338.method2316(Js5ConfigGroup.aClass120_1421.anInt1460 * -1006924897, 487068051)) * 1946957321;
		else
			varpSize = 0;
	}

	static void method1918(Class335 class335, byte i) {
		try {
			class335.aClass365_Sub1_3616 = null;
			synchronized (Class335.aStack3619) {
				if (Class335.aStack3619.size() < 200)
					Class335.aStack3619.push(class335);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("iq.f(").append(')').toString());
		}
	}
}
