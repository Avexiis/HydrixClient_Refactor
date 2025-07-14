/* Class408 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class408 {
	public static int anInt5277 = 1;
	public static int anInt5278 = 3;
	public static int anInt5279 = 2;
	public static int anInt5280 = 4;

	Class408() throws Throwable {
		throw new Error();
	}

	static ClientBuild[] method4965(byte i) {
		try {
			return (new ClientBuild[] { ClientBuild.aClientBuild_5605, ClientBuild.aClientBuild_5604, ClientBuild.aClientBuild_5602, ClientBuild.aClientBuild_5606, ClientBuild.aClientBuild_5603});
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qy.a(").append(')').toString());
		}
	}

	public static int method4966(long l) {
		try {
			return (int) (l / 86400000L) - 11745;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qy.i(").append(')').toString());
		}
	}

	static Class147[] method4967(byte i) {
		try {
			return (new Class147[] { Class147.aClass147_1579, Class147.aClass147_1578, Class147.aClass147_1577 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qy.a(").append(')').toString());
		}
	}

	static final void method4968(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) 79);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Class82_Sub19.method925(class105, RSInterface, class403, -535116520);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qy.fi(").append(')').toString());
		}
	}

	static final void method4969(ClientScript2 class403, int i) {
		try {
			Class25 class25 = Language.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.FRIEND_CHAT_QUICK_CHAT_MESSAGE, class25.aClass449_330, (byte) 51);
			class298_sub36.buffer.writeByte(0);
			int i_1_ = (class298_sub36.buffer.pos * 385051775);
			class298_sub36.buffer.writeByte(0);
			class298_sub36.buffer.writeShort(((ClientScript2) class403).aClass177_5243.anInt1787 * -2034569943, 16711935);
			((ClientScript2) class403).aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(class298_sub36.buffer, ((ClientScript2) class403).aClass177_5243.anIntArray1789, 1127792065);
			class298_sub36.buffer.method3649((385051775 * class298_sub36.buffer.pos) - i_1_, (byte) -111);
			class25.writeOutboundPacket(class298_sub36, (byte) -47);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qy.acg(").append(')').toString());
		}
	}
}
