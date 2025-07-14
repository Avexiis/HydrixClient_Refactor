/* VarClientString - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarClientString {
	public int files_count;
	Js5 aClass243_6215;
	public static Class162 aClass162_6216;

	public VarClientString(GameContext gameContext, Language language, Js5 js5) {
		new CachingHashMap(64);
		aClass243_6215 = js5;
		files_count = aClass243_6215.method2316(-1006924897 * Js5ConfigGroup.aClass120_1420.anInt1460, -2127064505) * 809853823;
	}

	static final void method6278(ClientScript2 class403, int i) {
		try {
			class403.anInt5239 -= -1175642067;
			int i_0_ = class403.anIntArray5244[681479919 * class403.anInt5239];
			int i_1_ = class403.anIntArray5244[1 + class403.anInt5239 * 681479919];
			int i_2_ = class403.anIntArray5244[2 + class403.anInt5239 * 681479919];
			Class359.method4291(class403.aClass365_Sub1_Sub1_Sub2_5242.overheadText, i_0_ & 0xffff, i_1_, i_2_,
					class403.aBoolean5261, class403, 2022077336);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "uz.aoo(" + ')');
		}
	}

	static final void method6279(boolean bool, int i) {
		try {
			RsBitsBuffer stream = GameClient.gameConnection.aClass298_Sub53_Sub2_333;
			for (;;) {
				if (stream.method3660(-866602563 * GameClient.gameConnection.anInt336, (byte) -70) < 15) {
					if (i != 596994841) {
						break;
					}
					return;
				}
				int i_3_ = stream.readBits(15);
				if (32767 == i_3_) {
					if (i == 596994841) {
						/* empty */
					}
					break;
				}
				boolean bool_4_ = false;
				LinkableObject linkableObject = (LinkableObject) GameClient.npcs.get(i_3_);
				if (linkableObject == null) {
					NPC class365_sub1_sub1_sub2_sub1 = new NPC(GameClient.map.method2675(-1611682495));
					class365_sub1_sub1_sub2_sub1.entityIndex = 1714292119 * i_3_;
					linkableObject = new LinkableObject(class365_sub1_sub1_sub2_sub1);
					GameClient.npcs.method5817(linkableObject, i_3_);
					GameClient.aLinkableObjectArray8816[(GameClient.anInt8772 += -118843751) * 1962237353 - 1] = linkableObject;
					bool_4_ = true;
				}
				NPC class365_sub1_sub1_sub2_sub1 = (NPC) linkableObject.anObject7366;
				GameClient.npcIndicies[(GameClient.npcCount += -409937273) * -1230451913 - 1] = i_3_;
				class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * GameClient.anInt8707;
				if (null != class365_sub1_sub1_sub2_sub1.definition
						&& class365_sub1_sub1_sub2_sub1.definition.method6242((byte) 88)) {
					TileFlags.method2330(class365_sub1_sub1_sub2_sub1, (byte) 40);
				}
				int i_5_ = stream.readBits(3) + 4 << 11 & 0x3fff;
				int i_6_;
				if (bool) {
					i_6_ = stream.readBits(8);
					if (i_6_ > 127) {
						i_6_ -= 256;
					}
				} else {
					i_6_ = stream.readBits(5);
					if (i_6_ > 15) {
						i_6_ -= 32;
					}
				}
				class365_sub1_sub1_sub2_sub1
						.method4464(Class15.aClass507_224.method6269(stream.readBits(16), 229452067), 1407104224);
				int i_7_;
				if (bool) {
					i_7_ = stream.readBits(8);
					if (i_7_ > 127) {
						i_7_ -= 256;
					}
				} else {
					i_7_ = stream.readBits(5);
					if (i_7_ > 15) {
						i_7_ -= 32;
					}
				}
				int i_8_ = stream.readBits(2);
				int i_9_ = stream.readBits(1);
				if (i_9_ == 1) {
					GameClient.anIntArray8706[(GameClient.anInt8808 += -386992021) * -976358333 - 1] = i_3_;
				}
				int i_10_ = stream.readBits(1);
				class365_sub1_sub1_sub2_sub1.updateSize(-2095128707 * class365_sub1_sub1_sub2_sub1.definition.size,
						-1253182390);
				class365_sub1_sub1_sub2_sub1.anInt10115 = -1186616623
						* (-1927065533 * class365_sub1_sub1_sub2_sub1.definition.anInt6181 << 3);
				if (bool_4_) {
					class365_sub1_sub1_sub2_sub1.method4415(i_5_, true, -2079607043);
				}
				class365_sub1_sub1_sub2_sub1.method4456(i_8_, i_7_ + Class287.myPlayer.scenePositionXQueue[0],
						i_6_ + Class287.myPlayer.scenePositionYQueue[0], 1 == i_10_,
						class365_sub1_sub1_sub2_sub1.getSize(), (byte) 58);
				if (class365_sub1_sub1_sub2_sub1.definition.method6242((byte) -9)) {
					SeqType.method4884(class365_sub1_sub1_sub2_sub1.plane,
							class365_sub1_sub1_sub2_sub1.scenePositionXQueue[0],
							class365_sub1_sub1_sub2_sub1.scenePositionYQueue[0], 0, null, class365_sub1_sub1_sub2_sub1,
							null, (byte) -66);
				}
			}
			stream.finishBitAccess((byte) 38);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "uz.jo(" + ')');
		}
	}

	static final void method6280(ClientScript2 class403, int i) {
		try {
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class495
					.method6195((byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "uz.acr(" + ')');
		}
	}

	public static void method6281(int i, int i_11_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(20, i);
			class298_sub37_sub12.method3445(-1607796466);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "uz.ax(" + ')');
		}
	}

	static void method6282(int i, boolean bool, int i_12_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(22, i);
			class298_sub37_sub12.method3449((byte) 61);
			class298_sub37_sub12.anInt9610 = (bool ? 1 : 0) * 1274450087;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "uz.ai(" + ')');
		}
	}
}
