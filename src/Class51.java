/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class51 {
	static short aShort504;
	public static Js5 aClass243_505;
	public static Class475 aClass475_506;

	Class51() throws Throwable {
		throw new Error();
	}

	static final void method539(ClientScript2 class403, byte i) {
		try {
			Class86.method967((((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), 255, 50, 36344261);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ca.ss(").append(')').toString());
		}
	}

	static final void method540(ClientScript2 class403, short i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class298_Sub38.method3502(string, i_0_, 1245128483);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ca.vr(").append(')').toString());
		}
	}

	
	static final void decodeLswp(RsBitsBuffer class298_sub53_sub2, int i) {
		try {
			class298_sub53_sub2.initBitAccess(1910675333);
			int myPlayerIndex = GameClient.playerIndex * -442628795;
			Player player = (Class287.myPlayer = GameClient.players[myPlayerIndex] = (new Player(GameClient.map.method2675(-1611682495))));
			player.entityIndex = myPlayerIndex * 1714292119;
			int i_2_ = class298_sub53_sub2.readBits(30);
			byte i_3_ = (byte) (i_2_ >> 28);
			int i_4_ = i_2_ >> 14 & 0x3fff;
			int i_5_ = i_2_ & 0x3fff;
			WorldTile worldTile = GameClient.map.getRegionStart(681479919);
			player.scenePositionXQueue[0] = i_4_ - -1760580017 * worldTile.x;
			player.scenePositionYQueue[0] = i_5_ - worldTile.y * 283514611;
			player.method4341((float) ((player.scenePositionXQueue[0] << 9) + (player.getSize() << 8)), (player.method4343().aSceneObjectPosition_2599.y), (float) ((player.scenePositionYQueue[0] << 9) + (player.getSize() << 8)));
			Class99.anInt952 = (player.plane = player.aByte7724 = i_3_) * -85701805;
			if (GameClient.map.method2654(1740552362).method2320(player.scenePositionXQueue[0], player.scenePositionYQueue[0], -14939637))
				player.aByte7724++;
			if (Class10.aClass298_Sub53Array133[myPlayerIndex] != null)
				player.sendAppearence(Class10.aClass298_Sub53Array133[myPlayerIndex], (byte) 3);
			Class10.anInt129 = 0;
			Class10.anIntArray135[(Class10.anInt129 += -656365301) * 1168366243 - 1] = myPlayerIndex;
			Class10.aByteArray131[myPlayerIndex] = (byte) 0;
			Class10.anInt130 = 0;
			for (int i_6_ = 1; i_6_ < 2048; i_6_++) {
				if (myPlayerIndex == i_6_) {
					if (i == 987294394) {
						/* empty */
					}
				} else {
					int regionHash = class298_sub53_sub2.readBits(18);
					int i_8_ = regionHash >> 16;
					int i_9_ = regionHash >> 8 & 0xff;
					int i_10_ = regionHash & 0xff;
					Class410 class410 = Class10.aClass410Array138[i_6_] = new Class410();
					((Class410) class410).anInt5288 = ((i_9_ << 14) + (i_8_ << 28) + i_10_) * 1896571807;
					((Class410) class410).anInt5286 = 0;
					((Class410) class410).anInt5285 = -1908419961;
					((Class410) class410).aBoolean5287 = false;
					((Class410) class410).aBoolean5289 = false;
					Class10.anIntArray134[(Class10.anInt130 += 854162319) * 1430471535 - 1] = i_6_;
					Class10.aByteArray131[i_6_] = (byte) 0;
				}
			}
			class298_sub53_sub2.finishBitAccess((byte) 109);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ca.a(").append(')').toString());
		}
	}

	static final void method542(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.aAntialiasPreference_7550.getValue(-254007730);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ca.ajh(").append(')').toString());
		}
	}

	public static boolean method543(CharSequence charsequence, int i) {
		try {
			return ClientScriptsExecutor.method4692(charsequence, 10, true, -1628070489);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ca.b(").append(')').toString());
		}
	}
}
