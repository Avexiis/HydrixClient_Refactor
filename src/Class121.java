
/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class121 implements Interface4 {
	static int[] anIntArray6321;

	@Override
	public long method48(String string) {
		return Class368.method4554(string, (byte) 51);
	}

	@Override
	public long method47(String string, byte i) {
		try {
			return Class368.method4554(string, (byte) 51);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ex.a(").append(')').toString());
		}
	}

	@Override
	public long method46(String string) {
		return Class368.method4554(string, (byte) 104);
	}

	static final void method1314(ClientScript2 class403, byte i) {
		try {
			int i_0_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -40);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Class363.method4314(class105, RSInterface, class403, 280747696);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ex.ip(").append(')').toString());
		}
	}

	static GamePreferences readPreferences(int i) {
		DiskFile class476 = null;
		GamePreferences gamePreferences = new GamePreferences(GameClient.aGameContext_8944, 0);
		try {
			class476 = Class86.getPreferenceFile("", GameClient.aGameContext_8944.aString5317, false);
			byte[] is = new byte[(int) class476.method6080(-423906976)];
			int i_1_;
			for (int i_2_ = 0; i_2_ < is.length; i_2_ += i_1_) {
				i_1_ = class476.method6081(is, i_2_, is.length - i_2_, (short) 4730);
				if (-1 == i_1_) {
					throw new IOException();
				}
			}
			gamePreferences = new GamePreferences(new Packet(is), GameClient.aGameContext_8944, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (null != class476) {
				class476.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gamePreferences;
	}

	static final void method1316(ClientScript2 class403, int i) {
		try {
			Class390 class390 = class403.aBoolean5261 ? class403.aClass390_5247 : class403.aClass390_5246;
			IComponentDefinition class105 = class390.aClass105_4168;
			RSInterface RSInterface = class390.aRSInterface_4167;
			Class247.method2363(class105, RSInterface, class403, 1246330568);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ex.fd(").append(')').toString());
		}
	}
}
