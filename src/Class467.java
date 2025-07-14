public final class Class467 {
	Class467() throws Throwable {
		throw new Error();
	}

	static final void method6023(int i) {
		try {
			RsBitsBuffer class298_sub53_sub2 = GameClient.gameConnection.aClass298_Sub53_Sub2_333;
			class298_sub53_sub2.initBitAccess(1157167964);
			int i_0_ = class298_sub53_sub2.readBits(8);
			if (i_0_ < GameClient.npcCount * -1230451913) {
				for (int i_1_ = i_0_; i_1_ < -1230451913 * GameClient.npcCount; i_1_++) {
					GameClient.anIntArray8709[(GameClient.anInt8708 = GameClient.anInt8708 + 107511579) * -1508392173
							- 1] = GameClient.npcIndicies[i_1_];
				}
			}
			if (i_0_ > GameClient.npcCount * -1230451913) {
				throw new RuntimeException();
			}
			GameClient.npcCount = 0;
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
				int i_3_ = GameClient.npcIndicies[i_2_];
				NPC class365_sub1_sub1_sub2_sub1 = (NPC) ((LinkableObject) GameClient.npcs
						.get(i_3_)).anObject7366;
				int i_4_ = class298_sub53_sub2.readBits(1);
				if (i_4_ == 0) {
					GameClient.npcIndicies[(GameClient.npcCount = GameClient.npcCount + -409937273) * -1230451913 - 1] = i_3_;
					class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * GameClient.anInt8707;
				} else {
					int i_5_ = class298_sub53_sub2.readBits(2);
					if (i_5_ == 0) {
						GameClient.npcIndicies[(GameClient.npcCount = GameClient.npcCount + -409937273) * -1230451913
								- 1] = i_3_;
						class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * GameClient.anInt8707;
						GameClient.anIntArray8706[(GameClient.anInt8808 = GameClient.anInt8808 + -386992021) * -976358333
								- 1] = i_3_;
					} else if (1 == i_5_) {
						GameClient.npcIndicies[(GameClient.npcCount = GameClient.npcCount + -409937273) * -1230451913
								- 1] = i_3_;
						class365_sub1_sub1_sub2_sub1.anInt10075 = GameClient.anInt8707 * -3704423;
						Class274 class274 = (Class274) CompressionType.method5701(Class299.method3680(-2130206915),
								class298_sub53_sub2.readBits(3), (byte) 2);
						class365_sub1_sub1_sub2_sub1.method4455(class274, MovementType.TYPE_1.type,
								Short.MAX_VALUE);
						int i_6_ = class298_sub53_sub2.readBits(1);
						if (1 == i_6_) {
							GameClient.anIntArray8706[(GameClient.anInt8808 = GameClient.anInt8808 + -386992021) * -976358333
									- 1] = i_3_;
						}
					} else if (i_5_ == 2) {
						GameClient.npcIndicies[(GameClient.npcCount = GameClient.npcCount + -409937273) * -1230451913
								- 1] = i_3_;
						class365_sub1_sub1_sub2_sub1.anInt10075 = -3704423 * GameClient.anInt8707;
						if (class298_sub53_sub2.readBits(1) == 1) {
							Class274 class274 = (Class274) CompressionType.method5701(Class299.method3680(-2113999549),
									class298_sub53_sub2.readBits(3), (byte) 2);
							class365_sub1_sub1_sub2_sub1.method4455(class274, MovementType.aMovementType_6541.type,
									Short.MAX_VALUE);
							Class274 class274_7_ = (Class274) CompressionType.method5701(
									Class299.method3680(-1890825389), class298_sub53_sub2.readBits(3), (byte) 2);
							class365_sub1_sub1_sub2_sub1.method4455(class274_7_, MovementType.aMovementType_6541.type,
									Short.MAX_VALUE);
						} else {
							Class274 class274 = (Class274) CompressionType.method5701(Class299.method3680(-2012553016),
									class298_sub53_sub2.readBits(3), (byte) 2);
							class365_sub1_sub1_sub2_sub1.method4455(class274, MovementType.aMovementType_6545.type,
									Short.MAX_VALUE);
						}
						int i_8_ = class298_sub53_sub2.readBits(1);
						if (1 == i_8_) {
							GameClient.anIntArray8706[(GameClient.anInt8808 = GameClient.anInt8808 + -386992021) * -976358333
									- 1] = i_3_;
						}
					} else if (i_5_ == 3) {
						GameClient.anIntArray8709[(GameClient.anInt8708 = GameClient.anInt8708 + 107511579) * -1508392173
								- 1] = i_3_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "tg.jn(" + ')');
		}
	}

	static final void method6024(ClientScript2 class403, int i) {
		try {
			int i_9_ = class403.integerstack[1883543357 * class403.integerPos];
			ClientScript class298_sub37_sub17 = Class216.getClientScript(i_9_, (byte) 1);
			if (class298_sub37_sub17 == null) {
				throw new RuntimeException();
			}
			int[] is = new int[class298_sub37_sub17.anInt9679 * -1516159487];
			Object[] objects = new Object[1787035509 * class298_sub37_sub17.anInt9680];
			long[] ls = new long[class298_sub37_sub17.anInt9681 * 1679522843];
			for (int i_10_ = 0; i_10_ < class298_sub37_sub17.anInt9682 * -1249619929; i_10_++) {
				is[i_10_] = class403.anIntArray5244[681479919 * class403.anInt5239
						- -1249619929 * class298_sub37_sub17.anInt9682 + i_10_];
			}
			for (int i_11_ = 0; i_11_ < 2027436935 * class298_sub37_sub17.anInt9674; i_11_++) {
				objects[i_11_] = class403.anObjectArray5240[i_11_ + -203050393 * class403.anInt5241
						- 2027436935 * class298_sub37_sub17.anInt9674];
			}
			for (int i_12_ = 0; i_12_ < class298_sub37_sub17.anInt9684 * -1520504699; i_12_++) {
				ls[i_12_] = class403.aLongArray5251[i_12_ + 1685767703 * class403.anInt5245
						- class298_sub37_sub17.anInt9684 * -1520504699];
			}
			class403.anInt5239 -= -238333367 * class298_sub37_sub17.anInt9682;
			class403.anInt5241 -= 258390497 * class298_sub37_sub17.anInt9674;
			class403.anInt5245 -= class298_sub37_sub17.anInt9684 * 1071348675;
			Class402 class402 = new Class402();
			class402.aClass298_Sub37_Sub17_5229 = class403.aClass298_Sub37_Sub17_5260;
			class402.anInt5226 = -985206291 * class403.integerPos;
			class402.anIntArray5228 = class403.anIntArray5248;
			class402.anObjectArray5231 = class403.anObjectArray5234;
			class402.aLongArray5230 = class403.aLongArray5235;
			if (class403.anInt5250 * -932179775 >= class403.aClass402Array5249.length) {
				throw new RuntimeException();
			}
			class403.aClass402Array5249[(class403.anInt5250 += 373063489) * -932179775 - 1] = class402;
			class403.aClass298_Sub37_Sub17_5260 = class298_sub37_sub17;
			class403.aClass394Array5258 = class403.aClass298_Sub37_Sub17_5260.aClass394Array9675;
			class403.integerstack = class403.aClass298_Sub37_Sub17_5260.anIntArray9676;
			class403.integerPos = -286750741;
			class403.anIntArray5248 = is;
			class403.anObjectArray5234 = objects;
			class403.aLongArray5235 = ls;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "tg.ay(" + ')');
		}
	}
}
