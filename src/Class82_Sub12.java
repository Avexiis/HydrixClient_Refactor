/* Class82_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub12 extends Class82 {
	int anInt6862;
	int anInt6863;
	static EnvironmentMap defaultEnvironment;
	int anInt6865;
	int anInt6866;
	int anInt6867;

	public void method866(int i) {
		try {
			Class87.entities[((Class82_Sub12) this).anInt6862 * -2006974637].method1018(((Class82_Sub12) this).anInt6863 * -101561809, 381156897 * ((Class82_Sub12) this).anInt6867, ((Class82_Sub12) this).anInt6865 * -371026667, ((Class82_Sub12) this).anInt6866 * -1672595375, -1330038095);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("xy.f(").append(')').toString());
		}
	}

	public void method869() {
		Class87.entities[((Class82_Sub12) this).anInt6862 * -2006974637].method1018(((Class82_Sub12) this).anInt6863 * -101561809, 381156897 * ((Class82_Sub12) this).anInt6867, ((Class82_Sub12) this).anInt6865 * -371026667, ((Class82_Sub12) this).anInt6866 * -1672595375, -755082394);
	}

	Class82_Sub12(Packet class298_sub53) {
		super(class298_sub53);
		((Class82_Sub12) this).anInt6862 = class298_sub53.readUnsignedShort() * 1766759643;
		int i = class298_sub53.readUnsignedInt();
		((Class82_Sub12) this).anInt6863 = 1505574095 * (i >>> 16);
		((Class82_Sub12) this).anInt6867 = 1475544545 * (i & 0xffff);
		((Class82_Sub12) this).anInt6865 = class298_sub53.readUnsignedByte() * 472584765;
		((Class82_Sub12) this).anInt6866 = class298_sub53.gSmart1or2s() * -1870262095;
	}

	public void method868() {
		Class87.entities[((Class82_Sub12) this).anInt6862 * -2006974637].method1018(((Class82_Sub12) this).anInt6863 * -101561809, 381156897 * ((Class82_Sub12) this).anInt6867, ((Class82_Sub12) this).anInt6865 * -371026667, ((Class82_Sub12) this).anInt6866 * -1672595375, -2023756610);
	}

	public static void method909(String string, int i) {
		try {
			if (GameClient.aBoolean8835 && (-112110875 * Node.anInt3192 & 0x18) != 0) {
				boolean bool = false;
				int i_0_ = 1168366243 * Class10.anInt129;
				int[] is = Class10.anIntArray135;
				for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
					Player player = (GameClient.players[is[i_1_]]);
					if (player.username != null && player.username.equalsIgnoreCase(string) && (((player == Class287.myPlayer) && 0 != (Node.anInt3192 * -112110875 & 0x10)) || 0 != (-112110875 * Node.anInt3192 & 0x8))) {
						Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.INTERFACE_ON_PLAYER, (GameClient.gameConnection.aClass449_330), (byte) 25);
						class298_sub36.buffer.writeShort(GameClient.c92 * 1408085039, 16711935);
						class298_sub36.buffer.writeShort(is[i_1_], 16711935);
						class298_sub36.buffer.writeIntV2(1262526353 * Class379.anInt4099);
						class298_sub36.buffer.writeShortLE128(GameClient.anInt8836 * 392084321);
						class298_sub36.buffer.write128Byte(0, (byte) 1);
						GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -11);
						int i_2_ = player.getSize();
						Class82_Sub21.method938(player.scenePositionXQueue[0], player.scenePositionYQueue[0], true, Class325.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), i_2_, i_2_, 0, (byte) -117), -263181253);
						bool = true;
						break;
					}
				}
				if (!bool)
					Class264.method2492(4, new StringBuilder().append(LocalizedString.MESSAGE_UNABLE_TO_FIND_PREFIX.getText(Class321.ACTIVE_LANGUAGE, -875414210)).append(string).toString(), (byte) -81);
				if (GameClient.aBoolean8835)
					IdentityKitTypeList.method1587((byte) 4);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("xy.kf(").append(')').toString());
		}
	}
}
