/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class208 {
	public static int anInt2360 = 32768;
	public static int anInt2361 = 15;
	public static int anInt2362 = 15;

	Class208() throws Throwable {
		throw new Error();
	}

	static void method1936(int i) {
		try {
			if (null != Class298_Sub37_Sub10.aClass95_9602 && !Class298_Sub37_Sub10.aClass95_9602.method1029((byte) 47) && Class298_Sub37_Sub10.aClass95_9602.method1030((byte) 1)) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2004, GameClient.gameConnection.aClass449_330, (byte) 88);
				class298_sub36.buffer.writeInt(Class298_Sub37_Sub10.aClass95_9602.anInt921 * 1941368041, 938750212);
				GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -4);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("it.aa(").append(')').toString());
		}
	}

	static final void method1937(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Node.anInt3190 * -1691245391;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("it.aml(").append(')').toString());
		}
	}
}
