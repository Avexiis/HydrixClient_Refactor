/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SeqType {
	public int[] delays;
	SeqTypeList aClass395_4170;
	public int anInt4171;
	public int[] frames;
	public boolean aBoolean4173;
	public int[] iframes;
	public int anInt4175 = 490274841;
	public boolean aBoolean4176;
	public boolean[] interleaveOrder;
	public int anInt4178 = 1084755117;
	public int mainhandObj = 556718803;
	public int offhandObj = -1297220983;
	public int anInt4181 = -1164419115;
	public int anInt4182 = 1486793947;
	public int[] anIntArray4183;
	public int anInt4184;
	public boolean aBoolean4185;
	public static boolean aBoolean4186 = false;
	public int[][] sounds;
	public int[] anIntArray4188;
	public int anInt4189 = 1424483545;
	public int[] anIntArray4190;
	HashTable aClass437_4191;
	public boolean osrs;

	public String method4877(int i, String string, int i_0_) {
		try {
			if (aClass437_4191 == null) {
				return string;
			}
			LinkableObject linkableObject = (LinkableObject) aClass437_4191.get(i);
			if (linkableObject == null) {
				return string;
			}
			return (String) linkableObject.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qe.k(").append(')').toString());
		}
	}

	private void decode(Packet buffer, int opcode) {
		if (1 == opcode) {
			int i_2_ = buffer.readUnsignedShort();
			delays = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				delays[i_3_] = buffer.readUnsignedShort();
			}
			frames = new int[i_2_];
			for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
				frames[i_4_] = buffer.readUnsignedShort();
			}
			for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
				frames[i_5_] = (buffer.readUnsignedShort() << 16) + frames[i_5_];
			}
		} else if (2 == opcode) {
			anInt4175 = buffer.readUnsignedShort() * -490274841;
		} else if (opcode == 3) {
			interleaveOrder = new boolean[256];
			int i_6_ = buffer.readUnsignedByte();
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				interleaveOrder[buffer.readUnsignedByte()] = true;
			}
		} else if (5 == opcode) {
			anInt4178 = buffer.readUnsignedByte() * -1501035895;
		} else if (6 == opcode) {
			mainhandObj = buffer.readUnsignedShort() * -556718803;
		} else if (opcode == 7) {
			offhandObj = buffer.readUnsignedShort() * 1297220983;
		} else if (opcode == 8) {
			anInt4181 = buffer.readUnsignedByte() * 248539239;
		} else if (opcode == 9) {
			anInt4182 = buffer.readUnsignedByte() * -1486793947;
		} else if (10 == opcode) {
			anInt4189 = buffer.readUnsignedByte() * -1424483545;
		} else if (opcode == 11) {
			anInt4184 = buffer.readUnsignedByte() * 1436650873;
		} else if (opcode == 12) {
			int i_8_ = buffer.readUnsignedByte();
			iframes = new int[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				iframes[i_9_] = buffer.readUnsignedShort();
			}
			for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
				iframes[i_10_] = (buffer.readUnsignedShort() << 16) + iframes[i_10_];
			}
		} else if (13 == opcode) {
			int i_11_ = buffer.readUnsignedShort();
			sounds = new int[i_11_][];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				int i_13_ = buffer.readUnsignedByte();
				if (i_13_ > 0) {
					sounds[i_12_] = new int[i_13_];
					sounds[i_12_][0] = buffer.g3();
					for (int i_14_ = 1; i_14_ < i_13_; i_14_++) {
						sounds[i_12_][i_14_] = buffer.readUnsignedShort();
					}
				}
			}
		} else if (14 == opcode) {
			aBoolean4185 = true;
		} else if (opcode == 15) {
			aBoolean4176 = true;
		} else if (16 == opcode) {
			// NOOP
		} else if (18 == opcode) {
			aBoolean4173 = true;
		} else if (19 == opcode) {
			if (null == anIntArray4188) {
				anIntArray4188 = new int[sounds.length];
				for (int i_15_ = 0; i_15_ < sounds.length; i_15_++) {
					anIntArray4188[i_15_] = 255;
				}
			}
			anIntArray4188[buffer.readUnsignedByte()] = buffer.readUnsignedByte();
		} else if (20 == opcode) {
			if (null == anIntArray4183 || anIntArray4190 == null) {
				anIntArray4183 = new int[sounds.length];
				anIntArray4190 = new int[sounds.length];
				for (int i_16_ = 0; i_16_ < sounds.length; i_16_++) {
					anIntArray4183[i_16_] = 256;
					anIntArray4190[i_16_] = 256;
				}
			}
			int i_17_ = buffer.readUnsignedByte();
			anIntArray4183[i_17_] = buffer.readUnsignedShort();
			anIntArray4190[i_17_] = buffer.readUnsignedShort();
		} else if (opcode == 249) {
			int i_18_ = buffer.readUnsignedByte();
			if (aClass437_4191 == null) {
				int i_19_ = Class416.method5590(i_18_, (byte) 16);
				aClass437_4191 = new HashTable(i_19_);
			}
			for (int i_20_ = 0; i_20_ < i_18_; i_20_++) {
				boolean bool = buffer.readUnsignedByte() == 1;
				int i_21_ = buffer.g3();
				Node node;
				if (bool) {
					node = new LinkableObject(buffer.gstr());
				} else {
					node = new Class298_Sub35(buffer.readUnsignedInt());
				}
				aClass437_4191.method5817(node, i_21_);
			}
		}
	}

	public void decodeOSRS(Packet buffer) {
		aBoolean4176 = true;
		for (;;) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0) {
				break;
			}
			decodeOSRS(buffer, opcode);
		}
	}

	public void decodeOSRS(Packet buffer, int opcode) {
		if (1 == opcode) {
			int i_2_ = buffer.readUnsignedShort();
			delays = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				delays[i_3_] = buffer.readUnsignedShort();
			}
			frames = new int[i_2_];
			for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
				frames[i_4_] = buffer.readUnsignedShort();
			}
			for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
				frames[i_5_] = ((0x8000 | buffer.readUnsignedShort()) << 16) + frames[i_5_];
			}
		} else if (2 == opcode) {
			anInt4175 = buffer.readUnsignedShort() * -490274841;
		} else if (opcode == 3) {
			interleaveOrder = new boolean[256];
			int i_6_ = buffer.readUnsignedByte();
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				interleaveOrder[buffer.readUnsignedByte()] = true;
			}
		} else if (opcode == 4) {
			// IGNORED
		} else if (5 == opcode) {
			anInt4178 = buffer.readUnsignedByte() * -1501035895;
		} else if (6 == opcode) {
			mainhandObj = buffer.readUnsignedShort() * -556718803;
		} else if (opcode == 7) {
			offhandObj = buffer.readUnsignedShort() * 1297220983;
		} else if (opcode == 8) {
			anInt4181 = buffer.readUnsignedByte() * 248539239;
		} else if (opcode == 9) {
			anInt4182 = buffer.readUnsignedByte() * -1486793947;
		} else if (10 == opcode) {
			anInt4189 = buffer.readUnsignedByte() * -1424483545;
		} else if (opcode == 11) {
			anInt4184 = buffer.readUnsignedByte() * 1436650873;
		} else if (opcode == 12) {
			int i_8_ = buffer.readUnsignedByte();
			iframes = new int[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				iframes[i_9_] = buffer.readUnsignedShort();
			}
			for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
				iframes[i_10_] = ((0x8000 | buffer.readUnsignedShort()) << 16) + iframes[i_10_];
			}
		} else if (13 == opcode) {
			sounds = new int[buffer.readUnsignedByte()][];
			for (int i_12_ = 0; i_12_ < sounds.length; i_12_++) {
				sounds[i_12_] = new int[] { buffer.read24BitInteger((byte) 0) };
			}
		}
	}

	void method4879(byte i) {
		try {
			if (62820525 * anInt4182 == -1) {
				if (interleaveOrder != null) {
					anInt4182 = 1321379402;
				} else {
					anInt4182 = 0;
				}
			}
			if (-1 == -882531177 * anInt4189) {
				if (interleaveOrder != null) {
					anInt4189 = 1446000206;
				} else {
					anInt4189 = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qe.b(").append(')').toString());
		}
	}

	public boolean method4880(int i) {
		try {
			if (null == frames) {
				return true;
			}
			boolean bool = true;
			int[] is = frames;
			for (int i_23_ : is) {
				if (aClass395_4170.method4900(i_23_ >> 16 & 0xffff, -1720040211) == null) {
					bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qe.p(").append(')').toString());
		}
	}

	public int method4881(int i, int i_24_, int i_25_) {
		try {
			if (aClass437_4191 == null) {
				return i_24_;
			}
			Class298_Sub35 class298_sub35 = (Class298_Sub35) aClass437_4191.get(i);
			if (null == class298_sub35) {
				return i_24_;
			}
			return class298_sub35.anInt7394 * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qe.i(").append(')').toString());
		}
	}

	SeqType() {
		anInt4184 = -1421665550;
		aBoolean4185 = false;
		aBoolean4176 = false;
		aBoolean4173 = false;
	}

	public void decode(Packet buffer) {
		for (;;) {
			int i_26_ = buffer.readUnsignedByte();
			if (i_26_ == 0) {
				break;
			}
			decode(buffer, i_26_);
		}
	}

	static final void method4883(ClientScript2 class403, int i) {
		try {
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = GameClient.aShort8923;
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = GameClient.aShort8931;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qe.akz(").append(')').toString());
		}
	}

	public static void method4884(int i, int i_27_, int i_28_, int i_29_, LocType class432,
			NPC class365_sub1_sub1_sub2_sub1, Player class365_sub1_sub1_sub2_sub2, byte i_30_) {
		try {
			Class298_Sub41 class298_sub41 = new Class298_Sub41();
			class298_sub41.anInt7424 = 2135210127 * i;
			class298_sub41.anInt7425 = -7217919 * (i_27_ << 9);
			class298_sub41.anInt7423 = (i_28_ << 9) * 584186023;
			if (class432 != null) {
				class298_sub41.aClass432_7435 = class432;
				int i_31_ = class432.sizeX * -1125834887;
				int i_32_ = class432.sizeY * -565161399;
				if (i_29_ == 1 || i_29_ == 3) {
					i_31_ = class432.sizeY * -565161399;
					i_32_ = class432.sizeX * -1125834887;
				}
				class298_sub41.anInt7427 = 305826635 * (i_27_ + i_31_ << 9);
				class298_sub41.anInt7428 = -1647445571 * (i_28_ + i_32_ << 9);
				class298_sub41.anInt7443 = 128561991 * class432.anInt5422;
				class298_sub41.aBoolean7444 = class432.aBoolean5426;
				class298_sub41.anInt7430 = 1644605369 * (-161350689 * class432.anInt5408 << 9);
				class298_sub41.anInt7449 = class432.anInt5425 * -1807698503;
				class298_sub41.anInt7450 = class432.anInt5427 * 763489431;
				class298_sub41.anInt7422 = class432.anInt5428 * 1972784599;
				class298_sub41.anIntArray7432 = class432.anIntArray5429;
				class298_sub41.aBoolean7451 = class432.aBoolean5395;
				class298_sub41.anInt7452 = -1937096719 * class432.anInt5439;
				class298_sub41.anInt7441 = 1100795 * class432.anInt5438;
				class298_sub41.anInt7429 = 406226903 * (-282587873 * class432.anInt5437 << 9);
				if (null != class432.anIntArray5366) {
					class298_sub41.aBoolean7437 = true;
					class298_sub41.method3519(-2011876770);
				}
				if (null != class298_sub41.anIntArray7432) {
					class298_sub41.anInt7454 = (-15898815 * class298_sub41.anInt7450 + (int) (Math.random()
							* (-1398300237 * class298_sub41.anInt7422 - -15898815 * class298_sub41.anInt7450)))
							* 950219665;
				}
				Class298_Sub41.aLinkedNodeList_7421.addlast(class298_sub41, 2135348486);
			} else if (class365_sub1_sub1_sub2_sub1 != null) {
				class298_sub41.aClass365_Sub1_Sub1_Sub2_Sub1_7433 = class365_sub1_sub1_sub2_sub1;
				NPCType class503 = class365_sub1_sub1_sub2_sub1.definition;
				if (null != class503.anIntArray6188) {
					class298_sub41.aBoolean7437 = true;
					class503 = class503.method6240(Class128.aClass148_6331, 1825815932);
				}
				if (class503 != null) {
					class298_sub41.anInt7427 = 305826635 * (class503.size * -2095128707 + i_27_ << 9);
					class298_sub41.anInt7428 = -1647445571 * (i_28_ + -2095128707 * class503.size << 9);
					class298_sub41.anInt7443 = Class125.method1398(class365_sub1_sub1_sub2_sub1, 2096811251)
							* 502744039;
					class298_sub41.aBoolean7444 = class503.aBoolean6180;
					class298_sub41.anInt7430 = (class503.anInt6140 * 1525111487 << 9) * 1644605369;
					class298_sub41.anInt7449 = -1283486135 * class503.anInt6179;
					class298_sub41.anInt7452 = 1142643823 * class503.anInt6161;
					class298_sub41.anInt7441 = 1682293055 * class503.anInt6190;
					class298_sub41.anInt7429 = (-1422618341 * class503.anInt6175 << 9) * 406226903;
				}
				Class298_Sub41.aLinkedNodeList_7455.addlast(class298_sub41, 387904128);
			} else if (null != class365_sub1_sub1_sub2_sub2) {
				class298_sub41.aClass365_Sub1_Sub1_Sub2_Sub2_7434 = class365_sub1_sub1_sub2_sub2;
				class298_sub41.anInt7427 = (i_27_ + class365_sub1_sub1_sub2_sub2.getSize() << 9) * 305826635;
				class298_sub41.anInt7428 = (i_28_ + class365_sub1_sub1_sub2_sub2.getSize() << 9) * -1647445571;
				class298_sub41.anInt7443 = FloTypeList.method4652(class365_sub1_sub1_sub2_sub2, 2035612836) * 502744039;
				class298_sub41.aBoolean7444 = class365_sub1_sub1_sub2_sub2.isMale;
				class298_sub41.anInt7430 = (780357347 * class365_sub1_sub1_sub2_sub2.turnLeftAnimation << 9) * 1644605369;
				class298_sub41.anInt7449 = -1138033583 * class365_sub1_sub1_sub2_sub2.turnRightAnimation;
				class298_sub41.anInt7452 = -1197363456;
				class298_sub41.anInt7441 = -900102912;
				class298_sub41.anInt7429 = 0;
				Class298_Sub41.aClass437_7440.method5817(class298_sub41,
						class365_sub1_sub1_sub2_sub2.entityIndex * 1888274983);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qe.p(").append(')').toString());
		}
	}

	static final void method4885(ClientScript2 class403, byte i) {
		try {
			int i_33_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_33_, (byte) 95);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_33_ >> 16];
			Class260.method2461(class105, RSInterface, class403, (short) 28140);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qe.gu(").append(')').toString());
		}
	}

	static Entity method4886(int i, int i_34_, int i_35_, byte i_36_) {
		try {
			Class326 class326 = GameClient.map
					.method2675(-1611682495).aClass326ArrayArrayArray3516[i][i_34_][i_35_];
			if (class326 == null) {
				return null;
			}
			Entity class365_sub1_sub1_sub2 = null;
			int i_37_ = -1;
			for (Class322 class322 = class326.aClass322_3456; class322 != null; class322 = class322.aClass322_3360) {
				Class365_Sub1_Sub1 class365_sub1_sub1 = class322.aClass365_Sub1_Sub1_3359;
				if (class365_sub1_sub1 instanceof Entity) {
					Entity class365_sub1_sub1_sub2_38_ = (Entity) class365_sub1_sub1;
					int i_39_ = (class365_sub1_sub1_sub2_38_.getSize() - 1) * 256 + 252;
					SceneObjectPosition sceneObjectPosition = class365_sub1_sub1_sub2_38_.method4337().aSceneObjectPosition_2599;
					int i_40_ = (int) sceneObjectPosition.x - i_39_ >> 9;
					int i_41_ = (int) sceneObjectPosition.z - i_39_ >> 9;
					int i_42_ = i_39_ + (int) sceneObjectPosition.x >> 9;
					int i_43_ = i_39_ + (int) sceneObjectPosition.z >> 9;
					if (i_40_ <= i_34_ && i_41_ <= i_35_ && i_42_ >= i_34_ && i_43_ >= i_35_) {
						int i_44_ = (1 + i_42_ - i_34_) * (i_43_ + 1 - i_35_);
						if (i_44_ > i_37_) {
							class365_sub1_sub1_sub2 = class365_sub1_sub1_sub2_38_;
							i_37_ = i_44_;
						}
					}
				}
			}
			return class365_sub1_sub1_sub2;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qe.id(").append(')').toString());
		}
	}

	static final void method4887(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, byte i) {
		try {
			class105.aBoolean1171 = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919] == 1;
			LocalizedString.markComponentForRedraw(class105, 2128713505);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qe.ds(").append(')').toString());
		}
	}

	static int method4888(int i, int i_45_, int i_46_) {
		try {
			double d = Math.log(i_45_) / Math.log(2.0);
			double d_47_ = Math.log(i) / Math.log(2.0);
			double d_48_ = Math.random() * (d - d_47_) + d_47_;
			return (int) (Math.pow(2.0, d_48_) + 0.5);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qe.m(").append(')').toString());
		}
	}
}
