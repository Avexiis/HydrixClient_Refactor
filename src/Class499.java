/* Class499 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class499 {
	CachingHashMap aClass348_6111 = new CachingHashMap(64);
	Js5 aClass243_6112;
	public static Js5 aClass243_6113;

	public Class499(GameContext gameContext, Language language, Js5 class243) {
		((Class499) this).aClass243_6112 = class243;
		((Class499) this).aClass243_6112.method2316((Js5ConfigGroup.aClass120_1436.anInt1460) * -1006924897, 236791533);
	}

	public void method6212(byte i) {
		try {
			synchronized (((Class499) this).aClass348_6111) {
				((Class499) this).aClass348_6111.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uq.f(").append(')').toString());
		}
	}

	public void method6213(int i) {
		try {
			synchronized (((Class499) this).aClass348_6111) {
				((Class499) this).aClass348_6111.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uq.p(").append(')').toString());
		}
	}

	public Class493 method6214(int i, int i_0_) {
		try {
			Class493 class493;
			synchronized (((Class499) this).aClass348_6111) {
				class493 = (Class493) ((Class499) this).aClass348_6111.get((long) i);
			}
			if (class493 != null)
				return class493;
			byte[] is;
			synchronized (((Class499) this).aClass243_6112) {
				is = (((Class499) this).aClass243_6112.getFileFromArchive(-1006924897 * Js5ConfigGroup.aClass120_1436.anInt1460, i, (byte) -70));
			}
			class493 = new Class493();
			if (null != is)
				class493.method6186(new Packet(is), -420636240);
			synchronized (((Class499) this).aClass348_6111) {
				((Class499) this).aClass348_6111.put(class493, (long) i);
			}
			return class493;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uq.a(").append(')').toString());
		}
	}

	public void method6215(int i, int i_1_) {
		try {
			synchronized (((Class499) this).aClass348_6111) {
				((Class499) this).aClass348_6111.method4186(i, -862651401);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uq.b(").append(')').toString());
		}
	}

	static GameContext[] method6216(byte i) {
		try {
			return (new GameContext[] { GameContext.aGameContext_5318, GameContext.aGameContext_5320, GameContext.stellar_dawn, GameContext.aGameContext_5319, GameContext.aGameContext_5321});
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uq.a(").append(')').toString());
		}
	}

	static final void method6217(ClientScript2 class403, int i) {
		try {
			Class319.method3903((byte) 11);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uq.wg(").append(')').toString());
		}
	}

	static final void method6218(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -1825255771) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1264 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.hasScripts = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uq.lu(").append(')').toString());
		}
	}
}
