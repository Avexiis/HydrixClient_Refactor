/* Class500 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class500 {
	Js5 index2;
	int anInt6115;
	Class298_Sub37_Sub7[] aClass298_Sub37_Sub7Array6116;
	public static Class347 aClass347_6117;

	public Class500(GameContext gameContext, Language language, Js5 class243, boolean bool) {
		index2 = class243;
		anInt6115 = (index2.method2316((-1006924897 * (Js5ConfigGroup.aClass120_1431.anInt1460)), -1837337583) * 1005943745);
		if (bool) {
			aClass298_Sub37_Sub7Array6116 = (new Class298_Sub37_Sub7[anInt6115 * 589337665]);
			for (int i = 0; i < anInt6115 * 589337665; i++) {
				byte[] is;
				synchronized (index2) {
					is = (index2.getFileFromArchive(-1006924897 * Js5ConfigGroup.aClass120_1431.anInt1460, i, (byte) -117));
				}
				Class298_Sub37_Sub7 class298_sub37_sub7 = new Class298_Sub37_Sub7();
				if (null != is) {
					class298_sub37_sub7.method3424(new Packet(is), -2124220647);
				}
				aClass298_Sub37_Sub7Array6116[i] = class298_sub37_sub7;
			}
		}
	}

	public Class298_Sub37_Sub7 method6219(int i, int i_0_) {
		try {
			if (i < 0) {
				return new Class298_Sub37_Sub7();
			}
			return aClass298_Sub37_Sub7Array6116[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ur.a(").append(')').toString());
		}
	}

	static Class298_Sub36 method6220(byte i) {
		try {
			if (0 == Class298_Sub36.anInt7400 * -848307417) {
				return new Class298_Sub36();
			}
			return (Class298_Sub36.aClass298_Sub36Array7402[(Class298_Sub36.anInt7400 -= 265413783) * -848307417]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ur.a(").append(')').toString());
		}
	}

	static void method6221(RsBitsBuffer class298_sub53_sub2, int i, int i_1_) {
		try {
			WorldTile worldTile = GameClient.map.getRegionStart(681479919);
			boolean bool = class298_sub53_sub2.readBits(1) == 1;
			if (bool) {
				Class10.anIntArray140[(Class10.anInt139 += 867608709) * -1281683379 - 1] = i;
			}
			int i_2_ = class298_sub53_sub2.readBits(2);
			Player player = GameClient.players[i];
			if (0 == i_2_) {
				if (bool) {
					player.isTeleporting = false;
				} else {
					if (-442628795 * GameClient.playerIndex == i) {
						throw new RuntimeException();
					}
					Class410 class410 = Class10.aClass410Array138[i] = new Class410();
					class410.anInt5288 = (1896571807 * (((player.scenePositionYQueue[0] + worldTile.y * 283514611) >> 6) + ((player.plane << 28) + ((-1760580017 * worldTile.x + (player.scenePositionXQueue[0])) >> 6 << 14))));
					if (-1 != (player.chatIcon * 1208589843)) {
						class410.anInt5286 = (player.chatIcon * 1714576017);
					} else {
						class410.anInt5286 = player.primaryAnim.method4719((byte) 0) * 481306955;
					}
					class410.anInt5285 = player.anInt10090 * 1969382475;
					class410.aBoolean5287 = player.isClickable;
					class410.aBoolean5289 = player.isInCombat;
					if (player.turnLeftAnimation * 780357347 > 0) {
						Class_v.method3670(player, (byte) -66);
					}
					GameClient.players[i] = null;
					if (class298_sub53_sub2.readBits(1) != 0) {
						Class501.method6229(class298_sub53_sub2, i, 2107350837);
					}
				}
			} else if (i_2_ == 1) {
				int i_3_ = class298_sub53_sub2.readBits(3);
				int i_4_ = player.scenePositionXQueue[0];
				int i_5_ = player.scenePositionYQueue[0];
				if (i_3_ == 0) {
					i_4_--;
					i_5_--;
				} else if (i_3_ == 1) {
					i_5_--;
				} else if (2 == i_3_) {
					i_4_++;
					i_5_--;
				} else if (i_3_ == 3) {
					i_4_--;
				} else if (4 == i_3_) {
					i_4_++;
				} else if (5 == i_3_) {
					i_4_--;
					i_5_++;
				} else if (6 == i_3_) {
					i_5_++;
				} else if (7 == i_3_) {
					i_4_++;
					i_5_++;
				}
				if (bool) {
					player.teleportX = i_4_ * -586951847;
					player.teleportY = i_5_ * -682750645;
					player.isTeleporting = true;
				} else {
					player.resetPosition(i_4_, i_5_, (Class10.playersMovementTypes[i]), -2105155066);
				}
			} else if (2 == i_2_) {
				int i_6_ = class298_sub53_sub2.readBits(4);
				int i_7_ = player.scenePositionXQueue[0];
				int i_8_ = player.scenePositionYQueue[0];
				if (0 == i_6_) {
					i_7_ -= 2;
					i_8_ -= 2;
				} else if (1 == i_6_) {
					i_7_--;
					i_8_ -= 2;
				} else if (2 == i_6_) {
					i_8_ -= 2;
				} else if (3 == i_6_) {
					i_7_++;
					i_8_ -= 2;
				} else if (i_6_ == 4) {
					i_7_ += 2;
					i_8_ -= 2;
				} else if (5 == i_6_) {
					i_7_ -= 2;
					i_8_--;
				} else if (6 == i_6_) {
					i_7_ += 2;
					i_8_--;
				} else if (i_6_ == 7) {
					i_7_ -= 2;
				} else if (8 == i_6_) {
					i_7_ += 2;
				} else if (i_6_ == 9) {
					i_7_ -= 2;
					i_8_++;
				} else if (i_6_ == 10) {
					i_7_ += 2;
					i_8_++;
				} else if (11 == i_6_) {
					i_7_ -= 2;
					i_8_ += 2;
				} else if (12 == i_6_) {
					i_7_--;
					i_8_ += 2;
				} else if (i_6_ == 13) {
					i_8_ += 2;
				} else if (14 == i_6_) {
					i_7_++;
					i_8_ += 2;
				} else if (i_6_ == 15) {
					i_7_ += 2;
					i_8_ += 2;
				}
				if (bool) {
					player.teleportX = i_7_ * -586951847;
					player.teleportY = i_8_ * -682750645;
					player.isTeleporting = true;
				} else {
					player.resetPosition(i_7_, i_8_, (Class10.playersMovementTypes[i]), -2092850777);
				}
			} else {
				int i_9_ = class298_sub53_sub2.readBits(1);
				if (0 == i_9_) {
					int i_10_ = class298_sub53_sub2.readBits(12);
					int i_11_ = i_10_ >> 10;
					int i_12_ = i_10_ >> 5 & 0x1f;
					if (i_12_ > 15) {
						i_12_ -= 32;
					}
					int i_13_ = i_10_ & 0x1f;
					if (i_13_ > 15) {
						i_13_ -= 32;
					}
					int i_14_ = (player.scenePositionXQueue[0] + i_12_);
					int i_15_ = (player.scenePositionYQueue[0] + i_13_);
					if (bool) {
						player.teleportX = -586951847 * i_14_;
						player.teleportY = i_15_ * -682750645;
						player.isTeleporting = true;
					} else {
						player.resetPosition(i_14_, i_15_, (Class10.playersMovementTypes[i]), -2123912900);
					}
					player.plane = player.aByte7724 = (byte) ((player.plane + i_11_) & 0x3);
					if (GameClient.map.method2654(-232228879).method2320(i_14_, i_15_, 1039567132)) {
						player.aByte7724++;
					}
					if (-442628795 * GameClient.playerIndex == i && (Class99.anInt952 * 1855729883 != player.plane)) {
						Class99.anInt952 = (-85701805 * player.plane);
					}
				} else {
					int i_16_ = class298_sub53_sub2.readBits(30);
					int i_17_ = i_16_ >> 28;
					int i_18_ = i_16_ >> 14 & 0x3fff;
					int i_19_ = i_16_ & 0x3fff;
					int i_20_ = ((i_18_ + (-1760580017 * worldTile.x + (player.scenePositionXQueue[0])) & 0x3fff) - worldTile.x * -1760580017);
					int i_21_ = ((i_19_ + (worldTile.y * 283514611 + (player.scenePositionYQueue[0])) & 0x3fff) - worldTile.y * 283514611);
					if (bool) {
						player.teleportX = -586951847 * i_20_;
						player.teleportY = -682750645 * i_21_;
						player.isTeleporting = true;
					} else {
						player.resetPosition(i_20_, i_21_, (Class10.playersMovementTypes[i]), -2073670245);
					}
					player.plane = player.aByte7724 = (byte) ((i_17_ + player.plane) & 0x3);
					if (GameClient.map.method2654(934483887).method2320(i_20_, i_21_, 624472586)) {
						player.aByte7724++;
					}
					if (i == GameClient.playerIndex * -442628795) {
						Class99.anInt952 = (-85701805 * player.plane);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ur.i(").append(')').toString());
		}
	}
}
