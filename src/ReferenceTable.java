/* ReferenceTable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ReferenceTable implements Interface21 {
	int anInt6551;
	public static ReferenceTable aReferenceTable_6552 = new ReferenceTable("LOCAL", "", 4);
	public static ReferenceTable aReferenceTable_6553;
	public static ReferenceTable aReferenceTable_6554;
	public static ReferenceTable aReferenceTable_6555;
	static ReferenceTable aReferenceTable_6556;
	public static ReferenceTable aReferenceTable_6557;
	String aString6558;
	static int anInt6559;
	public static ReferenceTable aReferenceTable_6560 = new ReferenceTable("WTWIP", "", 3);
	static Class57[] aClass57Array6561;
	static int anInt6562;

	ReferenceTable(String string, String string_0_, int i) {
		((ReferenceTable) this).aString6558 = string;
		((ReferenceTable) this).anInt6551 = i * 143252701;
	}

	public static boolean method4932(ReferenceTable referenceTable, int i) {
		try {
			return (aReferenceTable_6555 == referenceTable || referenceTable == aReferenceTable_6554 || aReferenceTable_6560 == referenceTable || aReferenceTable_6553 == referenceTable || aReferenceTable_6556 == referenceTable);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qq.b(").append(')').toString());
		}
	}

	public int method242(int i) {
		try {
			return ((ReferenceTable) this).anInt6551 * -504243339;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qq.f(").append(')').toString());
		}
	}

	static {
		aReferenceTable_6553 = new ReferenceTable("WTI", "", 5);
		aReferenceTable_6554 = new ReferenceTable("WTQA", "", 2);
		aReferenceTable_6555 = new ReferenceTable("WTRC", "", 1);
		aReferenceTable_6556 = new ReferenceTable("INTBETA", "", 6);
		aReferenceTable_6557 = new ReferenceTable("LIVE", "", 0);
		method4936(-2140357445);
	}

	public int method243() {
		return ((ReferenceTable) this).anInt6551 * -504243339;
	}

	public static final int method4933(int i, int i_1_, int i_2_, int i_3_) {
		try {
			if (i_2_ > 243)
				i_1_ >>= 4;
				else if (i_2_ > 217)
					i_1_ >>= 3;
					else if (i_2_ > 192)
						i_1_ >>= 2;
						else if (i_2_ > 179)
							i_1_ >>= 1;
							return (i_2_ >> 1) + (((i & 0xff) >> 2 << 10) + (i_1_ >> 5 << 7));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qq.s(").append(')').toString());
		}
	}

	public int method244() {
		return ((ReferenceTable) this).anInt6551 * -504243339;
	}

	static void method4934(byte i) {
		try {
			HintIcon.aClass348_264.method4187();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qq.b(").append(')').toString());
		}
	}

	static final void method4935(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			if ((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]) >= (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]))
				((ClientScript2) class403).integerPos += ((((ClientScript2) class403).integerstack[((ClientScript2) class403).integerPos * 1883543357]) * 286750741);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qq.al(").append(')').toString());
		}
	}

	public static ReferenceTable[] method4936(int i) {
		try {
			return (new ReferenceTable[] {aReferenceTable_6556, aReferenceTable_6552, aReferenceTable_6553, aReferenceTable_6557, aReferenceTable_6555, aReferenceTable_6560, aReferenceTable_6554});
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qq.a(").append(')').toString());
		}
	}

	public static Class464 method4937(ItemDefinitions class468, Packet class298_sub53, byte i) {
		try {
			Class464 class464 = new Class464(class468);
			int i_4_ = class298_sub53.readUnsignedByte();
			boolean bool = (i_4_ & 0x1) != 0;
			boolean bool_5_ = (i_4_ & 0x2) != 0;
			boolean bool_6_ = (i_4_ & 0x4) != 0;
			boolean bool_7_ = 0 != (i_4_ & 0x8);
			if (bool) {
				class464.anIntArray5694[0] = class298_sub53.readBigSmart();
				class464.anIntArray5695[0] = class298_sub53.readBigSmart();
				if (-1 != 34210967 * ((ItemDefinitions) class468).anInt5737 || -1 != -1284247975 * ((ItemDefinitions) class468).anInt5746) {
					class464.anIntArray5694[1] = class298_sub53.readBigSmart();
					class464.anIntArray5695[1] = class298_sub53.readBigSmart();
				}
				if (((ItemDefinitions) class468).anInt5759 * 1313278521 != -1 || -1767718263 * ((ItemDefinitions) class468).anInt5741 != -1) {
					class464.anIntArray5694[2] = class298_sub53.readBigSmart();
					class464.anIntArray5695[2] = class298_sub53.readBigSmart();
				}
			}
			if (bool_5_) {
				class464.anIntArray5690[0] = class298_sub53.readBigSmart();
				class464.anIntArray5697[0] = class298_sub53.readBigSmart();
				if (86274879 * ((ItemDefinitions) class468).anInt5749 != -1 || ((ItemDefinitions) class468).anInt5764 * 1578724433 != -1) {
					class464.anIntArray5690[1] = class298_sub53.readBigSmart();
					class464.anIntArray5697[1] = class298_sub53.readBigSmart();
				}
			}
			if (bool_6_) {
				int i_8_ = class298_sub53.readUnsignedShort();
				int[] is = new int[4];
				is[0] = i_8_ & 0xf;
				is[1] = i_8_ >> 4 & 0xf;
							is[2] = i_8_ >> 8 & 0xf;
							is[3] = i_8_ >> 12 & 0xf;
							for (int i_9_ = 0; i_9_ < 4; i_9_++) {
								if (is[i_9_] != 15)
									class464.aShortArray5698[is[i_9_]] = (short) class298_sub53.readUnsignedShort();
							}
			}
			if (bool_7_) {
				int i_10_ = class298_sub53.readUnsignedByte();
				int[] is = new int[2];
				is[0] = i_10_ & 0xf;
				is[1] = i_10_ >> 4 & 0xf;
							for (int i_11_ = 0; i_11_ < 2; i_11_++) {
								if (15 != is[i_11_])
									class464.aShortArray5699[is[i_11_]] = (short) class298_sub53.readUnsignedShort();
							}
			}
			return class464;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qq.a(").append(')').toString());
		}
	}

	static void method4938(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, byte i_18_) {
		try {
			int i_19_ = Class463.method6012(i_13_, 1155384281 * Class372_Sub3.anInt4049, -1062447355 * Class372_Sub3.anInt4050, -1212608691);
			int i_20_ = Class463.method6012(i_14_, Class372_Sub3.anInt4049 * 1155384281, Class372_Sub3.anInt4050 * -1062447355, -1212608691);
			int i_21_ = Class463.method6012(i, Class372_Sub3.anInt4051 * -1424479739, 1135094847 * Class372_Sub3.anInt4048, -1212608691);
			int i_22_ = Class463.method6012(i_12_, -1424479739 * Class372_Sub3.anInt4051, Class372_Sub3.anInt4048 * 1135094847, -1212608691);
			int i_23_ = Class463.method6012(i_13_ + i_17_, 1155384281 * Class372_Sub3.anInt4049, Class372_Sub3.anInt4050 * -1062447355, -1212608691);
			int i_24_ = Class463.method6012(i_14_ - i_17_, Class372_Sub3.anInt4049 * 1155384281, -1062447355 * Class372_Sub3.anInt4050, -1212608691);
			for (int i_25_ = i_19_; i_25_ < i_23_; i_25_++)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_25_]), i_21_, i_22_, i_16_, -1884573988);
			for (int i_26_ = i_20_; i_26_ > i_24_; i_26_--)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_26_]), i_21_, i_22_, i_16_, 712014890);
			int i_27_ = Class463.method6012(i + i_17_, -1424479739 * Class372_Sub3.anInt4051, Class372_Sub3.anInt4048 * 1135094847, -1212608691);
			int i_28_ = Class463.method6012(i_12_ - i_17_, Class372_Sub3.anInt4051 * -1424479739, Class372_Sub3.anInt4048 * 1135094847, -1212608691);
			for (int i_29_ = i_23_; i_29_ <= i_24_; i_29_++) {
				int[] is = Class372_Sub3.anIntArrayArray4047[i_29_];
				Class82_Sub22.method940(is, i_21_, i_27_, i_16_, -665045806);
				Class82_Sub22.method940(is, i_27_, i_28_, i_15_, -1572233497);
				Class82_Sub22.method940(is, i_28_, i_22_, i_16_, -2046400935);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qq.q(").append(')').toString());
		}
	}

	static void method4939(Class298_Sub37_Sub15 class298_sub37_sub15, int i, int i_30_, short i_31_) {
		try {
			if (null != class298_sub37_sub15 && (ContextMenu.aLinkedNodeList_5480.aNode_5643 != class298_sub37_sub15)) {
				int dstX = (-887503319 * (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9658));
				int dstY = (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9663 * -502720623);
				int i_34_ = (946432351 * (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662));
				int walktype = (int) ((((Class298_Sub37_Sub15) class298_sub37_sub15).aLong9661) * 2236412381003659263L);
				long l = (2236412381003659263L * (((Class298_Sub37_Sub15) class298_sub37_sub15).aLong9661));
				if (i_34_ >= 2000)
					i_34_ -= 2000;
				WorldTile worldTile = GameClient.map.getRegionStart(681479919);
				if (23 == i_34_) {
					if (1806357379 * GameClient.playerRights > 0 && Class434.method5802(1267311211))
						DiskFile.method6083((Class287.myPlayer.plane), dstX + -1760580017 * worldTile.x, dstY + worldTile.y * 283514611, 2043472934);
					else {
						Skybox.sendWalkPacket(walktype, BASType.method4214(dstX, dstY, (short) 808));
						if (walktype == 0) {
							GameClient.anInt8784 = i * 143636043;
							GameClient.anInt8785 = i_30_ * 381532777;
							GameClient.anInt8748 = 277162405;
							GameClient.anInt8786 = 0;
						}
						Class82_Sub21.method938(dstX, dstY, true, BASType.method4214(dstX, dstY, (short) 808), -1776617382);

					}
				}
				OutgoingPacket class198 = null;
				if (i_34_ == 18)
					class198 = OutgoingPacket.aClass198_2002;
				else if (i_34_ == 19)
					class198 = OutgoingPacket.aClass198_2050;
				else if (i_34_ == 20)
					class198 = OutgoingPacket.ITEM_TAKE_PACKET;
				else if (21 == i_34_)
					class198 = OutgoingPacket.aClass198_2055;
				else if (22 == i_34_)
					class198 = OutgoingPacket.aClass198_2038;
				else if (1004 == i_34_)
					class198 = OutgoingPacket.ITEM_ON_FLOOR_EXAMINE;
				if (class198 != null) {
					if (class198 != OutgoingPacket.ITEM_ON_FLOOR_EXAMINE)
						Skybox.sendWalkPacket(MovementType.method2619(dstX, dstY, 1, 1, 1978833308));
					GameClient.anInt8784 = i * 143636043;
					GameClient.anInt8785 = i_30_ * 381532777;
					GameClient.anInt8748 = 554324810;
					GameClient.anInt8786 = 0;
					Class298_Sub36 class298_sub36 = Class18.method359(class198, GameClient.gameConnection.aClass449_330, (byte) 23);
					class298_sub36.buffer.writeShort(283514611 * worldTile.y + dstY, 16711935);
					class298_sub36.buffer.writeShortLE(dstX + -1760580017 * worldTile.x, 1653379787);
					class298_sub36.buffer.writeShort(walktype, 16711935);
					class298_sub36.buffer.write128Byte(Class151.method1644(984220338) ? 1 : 0, (byte) 1);
					GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -56);
					FloTypeList.method4654(dstX, dstY, (byte) -67);
				}
				if (59 == i_34_) {
					GameClient.anInt8784 = 143636043 * i;
					GameClient.anInt8785 = 381532777 * i_30_;
					GameClient.anInt8748 = 277162405;
					GameClient.anInt8786 = 0;
					Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2087, GameClient.gameConnection.aClass449_330, (byte) 6);
					class298_sub36.buffer.writeInt(1262526353 * Class379.anInt4099, 969641873);
					class298_sub36.buffer.writeShort(392084321 * GameClient.anInt8836, 16711935);
					class298_sub36.buffer.writeShort(worldTile.y * 283514611 + dstY, 16711935);
					class298_sub36.buffer.writeShort128(GameClient.c92 * 1408085039);
					class298_sub36.buffer.writeShortLE(worldTile.x * -1760580017 + dstX, 1993411127);
					GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -125);
					Class82_Sub21.method938(dstX, dstY, true, BASType.method4214(dstX, dstY, (short) 808), -1460658515);
				}
				if (Loader.isShifting && dstY == 44498944) {// TODO DROP_ITEM
					i_34_ = 57;
					walktype = 8;
					IComponentDefinition class105 = Class140.method1558(dstY, dstX, -156511736);
					if (class105 != null) {
						Class25 class25 = Language.method5760((short) 512);
						if (class25 != null) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.DROP_ITEM_PACKET, class25.aClass449_330, (byte) 74);
							Class125.method1396(class298_sub36, dstY, dstX, (class105.zds3 * -1232467723), 1834394135);
							class25.writeOutboundPacket(class298_sub36, (byte) -56);
						}
					}
					i_34_ = -1;
					walktype = -1;
				}
				if (i_34_ == 57 || i_34_ == 1007)
					Class301_Sub1.method3713(walktype, dstY, dstX, (((Class298_Sub37_Sub15) class298_sub37_sub15).aString9657), 400950689);
				if (1008 == i_34_ || 1009 == i_34_ || i_34_ == 1010 || 1011 == i_34_ || i_34_ == 1012)
					Class463.method6014(i_34_, walktype, dstX, 1889973846);
				if (2 == i_34_) {

					int i_3_ = (int) l >> 14 & 0x1f;
					int i_4_ = (int) l >> 20 & 0x3;
					int i_5_ = (int) (l >>> 32) & 0x7fffffff;
					Class424 class424 = ((Class424) CompressionType.method5701(Class336_Sub6.method4108(114624527), i_3_, (byte) 2));
					Class336 class336;
					if (Class424.aClass424_6611 == class424 || Class424.aClass424_6604 == class424 || Class424.aClass424_6610 == class424) {
						LocType class432 = GameClient.map.method2641(-1208362615).list(i_5_);
						int i_6_;
						int i_7_;
						if (0 == i_4_ || i_4_ == 2) {
							i_6_ = -1125834887 * class432.sizeX;
							i_7_ = -565161399 * class432.sizeY;
						} else {
							i_6_ = -565161399 * class432.sizeY;
							i_7_ = class432.sizeX * -1125834887;
						}
						if (i_4_ == 0) {
							/* empty */
						}
						class336 = Class336_Sub5.method4105(dstX, dstY, i_6_, i_7_, Class424.aClass424_6614, 0, 1300552038);
					} else if (Class82_Sub9.method900(-1976050083 * class424.anInt6613, (byte) 28))
						class336 = Class336_Sub5.method4105(dstX, dstY, 0, 0, class424, i_4_, 740164949);
					else
						class336 = Class194.method1867(dstX, dstY, 0, 0, class424, i_4_, (byte) -22);
					Skybox.sendWalkPacket(class336);
					GameClient.anInt8784 = 143636043 * i;
					GameClient.anInt8785 = i_30_ * 381532777;
					GameClient.anInt8748 = 554324810;
					GameClient.anInt8786 = 0;
					Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.INTERFACE_ON_OBJECT, GameClient.gameConnection.aClass449_330, (byte) 52);
					class298_sub36.buffer.write128Byte(Class151.method1644(-427290804) ? 1 : 0, (byte) 1);
					class298_sub36.buffer.writeShortLE128(GameClient.c92 * 1408085039);
					class298_sub36.buffer.writeShortLE128(283514611 * worldTile.y + dstY);
					class298_sub36.buffer.writeIntV2((int) (l >>> 32) & 0x7fffffff);
					class298_sub36.buffer.writeInt(1262526353 * Class379.anInt4099, 671195475);
					class298_sub36.buffer.writeShortLE(GameClient.anInt8836 * 392084321, 462918069);
					class298_sub36.buffer.writeShort128(dstX + -1760580017 * worldTile.x);
					GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -39);
					Class93.method1013(dstX, dstY, l);
				}
				if (i_34_ == 30 && GameClient.aClass105_8652 == null) {
					Class117.method1280(dstY, dstX, 1723723267);
					GameClient.aClass105_8652 = Class140.method1558(dstY, dstX, -156511736);
					LocalizedString.markComponentForRedraw(GameClient.aClass105_8652, 194587581);
				}
				OutgoingPacket class198_36_ = null;
				if (i_34_ == 44)
					class198_36_ = OutgoingPacket.ATTACK_PLAYER_PACKET;
				else if (i_34_ == 45)
					class198_36_ = OutgoingPacket.aClass198_2039;
				else if (i_34_ == 46)
					class198_36_ = OutgoingPacket.aClass198_2064;
				else if (i_34_ == 47)
					class198_36_ = OutgoingPacket.aClass198_2010;
				else if (48 == i_34_)
					class198_36_ = OutgoingPacket.aClass198_2070;
				else if (i_34_ == 49)
					class198_36_ = OutgoingPacket.aClass198_2042;
				else if (50 == i_34_)
					class198_36_ = OutgoingPacket.aClass198_2056;
				else if (51 == i_34_)
					class198_36_ = OutgoingPacket.aClass198_2078;
				else if (i_34_ == 52)
					class198_36_ = OutgoingPacket.aClass198_2049;
				else if (i_34_ == 53)
					class198_36_ = OutgoingPacket.aClass198_2000;
				if (class198_36_ != null) {
					Player player = GameClient.players[walktype];
					if (null != player) {
						Skybox.sendWalkPacket(Class325.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0, (byte) 13));
						GameClient.anInt8784 = i * 143636043;
						GameClient.anInt8785 = 381532777 * i_30_;
						GameClient.anInt8748 = 554324810;
						GameClient.anInt8786 = 0;
						Class298_Sub36 class298_sub36 = Class18.method359(class198_36_, (GameClient.gameConnection.aClass449_330), (byte) 74);
						class298_sub36.buffer.writeByte(Class151.method1644(1625676244) ? 1 : 0);
						class298_sub36.buffer.writeShortLE128(walktype);
						GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -105);
						Class82_Sub21.method938(player.scenePositionXQueue[0], player.scenePositionYQueue[0], true, Class325.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0, (byte) 13), 278987907);
					}
				}
				if (i_34_ == 16) {
					GameClient.anInt8784 = 143636043 * i;
					GameClient.anInt8785 = 381532777 * i_30_;
					GameClient.anInt8748 = 554324810;
					GameClient.anInt8786 = 0;
					Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.INTERFACE_ON_PLAYER, GameClient.gameConnection.aClass449_330, (byte) 82);
					class298_sub36.buffer.writeShort(1408085039 * GameClient.c92, 16711935);
					class298_sub36.buffer.writeShort((Class287.myPlayer.entityIndex) * 1888274983, 16711935);
					class298_sub36.buffer.writeIntV2(Class379.anInt4099 * 1262526353);
					class298_sub36.buffer.writeShortLE128(GameClient.anInt8836 * 392084321);
					class298_sub36.buffer.write128Byte(Class151.method1644(-1804963392) ? 1 : 0, (byte) 1);
					GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -113);
				}
				if (i_34_ == 17) {
					GameClient.anInt8784 = 143636043 * i;
					GameClient.anInt8785 = i_30_ * 381532777;
					GameClient.anInt8748 = 554324810;
					GameClient.anInt8786 = 0;
					Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2062, GameClient.gameConnection.aClass449_330, (byte) 15);
					class298_sub36.buffer.method3617(Class151.method1644(1934855379) ? 1 : 0, 1961724405);
					class298_sub36.buffer.writeShortLE128(1408085039 * GameClient.c92);
					class298_sub36.buffer.writeShortLE128(dstX + worldTile.x * -1760580017);
					class298_sub36.buffer.writeShort128(283514611 * worldTile.y + dstY);
					class298_sub36.buffer.writeIntLE(1262526353 * Class379.anInt4099, (byte) 1);
					class298_sub36.buffer.writeShort128(GameClient.anInt8836 * 392084321);
					class298_sub36.buffer.writeShortLE128(walktype);
					GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -59);
					FloTypeList.method4654(dstX, dstY, (byte) -97);
				}
				if (58 == i_34_) {
					IComponentDefinition class105 = Class140.method1558(dstY, dstX, -156511736);
					if (class105 != null)
						WaterDetailPreference.method5643(class105, 1371871585);
				}
				OutgoingPacket class198_37_ = null;
				if (9 == i_34_)
					class198_37_ = OutgoingPacket.aClass198_2024;
				else if (i_34_ == 10)
					class198_37_ = OutgoingPacket.ATTACK_NPC_PACKET;
				else if (11 == i_34_)
					class198_37_ = OutgoingPacket.aClass198_2094;
				else if (12 == i_34_)
					class198_37_ = OutgoingPacket.aClass198_2031;
				else if (i_34_ == 13)
					class198_37_ = OutgoingPacket.aClass198_2077;
				else if (i_34_ == 1003)
					class198_37_ = OutgoingPacket.NPC_EXAMINE_PACKET;
				if (null != class198_37_) {
					LinkableObject linkableObject = ((LinkableObject) GameClient.npcs.get((long) walktype));
					if (null != linkableObject) {
						NPC npc = ((NPC) linkableObject.anObject7366);
						if (class198_37_ != OutgoingPacket.NPC_EXAMINE_PACKET) {
							Skybox.sendWalkPacket(Class325.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0, (byte) -51));
						}
						GameClient.anInt8784 = 143636043 * i;
						GameClient.anInt8785 = i_30_ * 381532777;
						GameClient.anInt8748 = 554324810;
						GameClient.anInt8786 = 0;
						Class298_Sub36 class298_sub36 = Class18.method359(class198_37_, (GameClient.gameConnection.aClass449_330), (byte) 15);
						class298_sub36.buffer.writeShort128(walktype);
						class298_sub36.buffer.write128Byte(Class151.method1644(1824393579) ? 1 : 0, (byte) 1);
						GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -120);
						Class82_Sub21.method938(npc.scenePositionXQueue[0], npc.scenePositionYQueue[0], true, Class325.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0, (byte) -51), -1636676956);
					}
				}
				OutgoingPacket packet = null;
				if (3 == i_34_)
					packet = OutgoingPacket.aClass198_2019;
				else if (4 == i_34_)
					packet = OutgoingPacket.aClass198_2052;
				else if (5 == i_34_)
					packet = OutgoingPacket.aClass198_2033;
				else if (6 == i_34_)
					packet = OutgoingPacket.aClass198_2016;
				else if (1001 == i_34_)
					packet = OutgoingPacket.aClass198_2012;
				else if (1002 == i_34_)
					packet = OutgoingPacket.EXAMINE_OBJECT_PACKET;
				if (packet != null) {
					GameClient.anInt8784 = 143636043 * i;
					GameClient.anInt8785 = i_30_ * 381532777;
					GameClient.anInt8748 = 554324810;
					GameClient.anInt8786 = 0;

					if (OutgoingPacket.EXAMINE_OBJECT_PACKET != packet) {
						int i_3_ = (int) l >> 14 & 0x1f;
						int i_4_ = (int) l >> 20 & 0x3;
						int i_5_ = (int) (l >>> 32) & 0x7fffffff;
						Class424 class424 = ((Class424) CompressionType.method5701(Class336_Sub6.method4108(114624527), i_3_, (byte) 2));
						Class336 class336;
						if (Class424.aClass424_6611 == class424 || Class424.aClass424_6604 == class424 || Class424.aClass424_6610 == class424) {
							LocType class432 = GameClient.map.method2641(-1208362615).list(i_5_);
							int i_6_;
							int i_7_;
							if (0 == i_4_ || i_4_ == 2) {
								i_6_ = -1125834887 * class432.sizeX;
								i_7_ = -565161399 * class432.sizeY;
							} else {
								i_6_ = -565161399 * class432.sizeY;
								i_7_ = class432.sizeX * -1125834887;
							}
							if (i_4_ == 0) {
								/* empty */
							}
							class336 = Class336_Sub5.method4105(dstX, dstY, i_6_, i_7_, Class424.aClass424_6614, 0, 1300552038);
						} else if (Class82_Sub9.method900(-1976050083 * class424.anInt6613, (byte) 28))
							class336 = Class336_Sub5.method4105(dstX, dstY, 0, 0, class424, i_4_, 740164949);
						else
							class336 = Class194.method1867(dstX, dstY, 0, 0, class424, i_4_, (byte) -22);
						Skybox.sendWalkPacket(class336);
					}
					Class298_Sub36 class298_sub36 = Class18.method359(packet, GameClient.gameConnection.aClass449_330, (byte) 94);
					class298_sub36.buffer.writeByte128(Class151.method1644(1030396767) ? 1 : 0, 1999137832);
					class298_sub36.buffer.writeIntLE((int) (l >>> 32) & 0x7fffffff, (byte) 1);
					class298_sub36.buffer.writeShortLE(dstX + worldTile.x * -1760580017, 1077977138);
					class298_sub36.buffer.writeShortLE128(worldTile.y * 283514611 + dstY);
					GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -13);
					Class93.method1013(dstX, dstY, l);
				}
				if (8 == i_34_) {
					LinkableObject linkableObject = ((LinkableObject) GameClient.npcs.get((long) walktype));
					if (linkableObject != null) {
						NPC npc = ((NPC) linkableObject.anObject7366);
						Skybox.sendWalkPacket(Class325.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0, (byte) -81));
						GameClient.anInt8784 = 143636043 * i;
						GameClient.anInt8785 = i_30_ * 381532777;
						GameClient.anInt8748 = 554324810;
						GameClient.anInt8786 = 0;
						Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.INTERFACE_ON_NPC, (GameClient.gameConnection.aClass449_330), (byte) 103);
						class298_sub36.buffer.writeByte(Class151.method1644(-510062351) ? 1 : 0);
						class298_sub36.buffer.writeInt(1262526353 * Class379.anInt4099, -828026807);
						class298_sub36.buffer.writeShortLE(walktype, 1218473206);
						class298_sub36.buffer.writeShortLE128(GameClient.anInt8836 * 392084321);
						class298_sub36.buffer.writeShortLE(1408085039 * GameClient.c92, 249731045);
						GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -11);
						Class82_Sub21.method938(npc.scenePositionXQueue[0], npc.scenePositionYQueue[0], true, Class325.method3963((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), npc.getSize(), npc.getSize(), 0, (byte) -81), 420897053);
					}
				}
				if (25 == i_34_) {
					IComponentDefinition class105 = Class140.method1558(dstY, dstX, -156511736);
					if (class105 != null) {
						IdentityKitTypeList.method1587((byte) 4);
						Class298_Sub38 class298Sub38 = GameClient.method2801(class105);
						Class147.method1600(class105, class298Sub38.method3497((byte) -122), (class298Sub38.anInt7410 * -1133219011), 1387537939);
						GameClient.aString8838 = Class88.method977(class105, -447348156);
						if (null == GameClient.aString8838)
							GameClient.aString8838 = "Null";
						GameClient.aString8754 = new StringBuilder().append(class105.aString1228).append(Class285.method2709(16777215, -1652576288)).toString();
					}
				} else {
					if (15 == i_34_) {
						Player player = (GameClient.players[walktype]);
						if (null != player) {
							Skybox.sendWalkPacket(Class325.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0, (byte) -81));
							GameClient.anInt8784 = i * 143636043;
							GameClient.anInt8785 = i_30_ * 381532777;
							GameClient.anInt8748 = 554324810;
							GameClient.anInt8786 = 0;
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.INTERFACE_ON_PLAYER, (GameClient.gameConnection.aClass449_330), (byte) 92);
							class298_sub36.buffer.writeShort(GameClient.c92 * 1408085039, 16711935);
							class298_sub36.buffer.writeShort(walktype, 16711935);
							class298_sub36.buffer.writeIntV2(Class379.anInt4099 * 1262526353);
							class298_sub36.buffer.writeShortLE128(392084321 * GameClient.anInt8836);
							class298_sub36.buffer.write128Byte(Class151.method1644(1486448273) ? 1 : 0, (byte) 1);
							GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -120);
							Class82_Sub21.method938((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), true, (Class325.method3963((player.scenePositionXQueue[0]), (player.scenePositionYQueue[0]), player.getSize(), player.getSize(), 0, (byte) -81)), -1518106468);
						}
					}
					if (i_34_ == 60) {
						if (GameClient.playerRights * 1806357379 > 0 && Class434.method5802(838408640))
							DiskFile.method6083((Class287.myPlayer.plane), worldTile.x * -1760580017 + dstX, 283514611 * worldTile.y + dstY, 1886787992);
						else {
							GameClient.anInt8784 = i * 143636043;
							GameClient.anInt8785 = 381532777 * i_30_;
							GameClient.anInt8748 = 277162405;
							GameClient.anInt8786 = 0;
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2082, (GameClient.gameConnection.aClass449_330), (byte) 98);
							class298_sub36.buffer.writeShort(worldTile.y * 283514611 + dstY, 16711935);
							class298_sub36.buffer.writeShort128(-1760580017 * worldTile.x + dstX);
							GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -43);
						}
					}
					if (GameClient.aBoolean8835)
						IdentityKitTypeList.method1587((byte) 4);
					if (null != Class236.aClass105_2606 && 0 == -2018194505 * GameClient.anInt8788)
						LocalizedString.markComponentForRedraw(Class236.aClass105_2606, 1534658392);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qq.bs(").append(')').toString());
		}
	}

	static final void method4940(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1372893999 * LoginData.anInt3871;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qq.aho(").append(')').toString());
		}
	}
}
