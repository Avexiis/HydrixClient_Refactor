/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class497 {
	char aChar6099;
	public int anInt6100;
	public String aString6101;
	public boolean aBoolean6102 = true;
	public static Js5 aClass243_6103;
	public static Js5 aClass243_6104;
	public static Class197 aClass197_6105;
	protected static Class484[] aClass484Array6106;

	void method6204(Packet class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i != -1070488617) {
						/* empty */
					}
					break;
				}
				method6205(class298_sub53, i_0_, -1263021902);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("um.a(").append(')').toString());
		}
	}

	void method6205(Packet class298_sub53, int i, int i_1_) {
		try {
			if (1 == i)
				((Class497) this).aChar6099 = Class493.method6190(class298_sub53.readByte(), 1872893689);
			else if (2 == i)
				anInt6100 = class298_sub53.readUnsignedInt() * -954052725;
			else if (i == 4)
				aBoolean6102 = false;
			else if (i == 5)
				aString6101 = class298_sub53.getString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("um.f(").append(')').toString());
		}
	}

	Class497() {
		/* empty */
	}

	public boolean method6206(int i) {
		try {
			return ((Class497) this).aChar6099 == 's';
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("um.b(").append(')').toString());
		}
	}

	static final void method6207(ClientScript2 class403, int i) {
		try {
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aClass422_Sub26_7577, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), -1529967366);
			Class3.writePreferences();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("um.aiv(").append(')').toString());
		}
	}

	static void method6208(String string, String string_2_, int i) {
		try {
			LoginData.anInt3868 = Loader.LOBBY_ENABLED ? -1058684408 : 471358088;
			LoginData.aClass25_3905 = Loader.LOBBY_ENABLED ? GameClient.aClass25_8693 : GameClient.gameConnection;
			LoginPacket.method5981(false, false, string, string_2_, -1L);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("um.z(").append(')').toString());
		}
	}
}
