import java.util.Arrays;

/* NPCDefinitions - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPCType {
	public boolean renderPriority;
	Class507 aClass507_6125;
	public int id;
	public String name = "null";
	public int anInt6128;
	public int[] modelIds;
	public int[] chatHeads;
	public int[] anIntArray6131;
	public int basid;
	short[] originalModelColors;
	public short[] modifiedModelColors;
	byte[] aByteArray6135;
	short[] originalTextureColors;
	int anInt6137;
	byte aByte6138;
	byte aByte6139;
	public int anInt6140;
	byte aByte6141;
	public String[] options;
	public int anInt6143;
	public int anInt6144;
	public int anInt6145;
	public int anInt6146;
	public int anInt6147;
	public boolean visibleOnMap;
	public int combatLevel;
	int npcHeight;
	public int anInt6151;
	public byte aByte6152;
	public short aShort6153;
	public short[] modifiedTextureColors;
	public boolean aBoolean6155;
	int anInt6156;
	byte aByte6157;
	public byte aByte6158;
	HashTable aClass437_6159;
	int npcWidth;
	public int anInt6161;
	int anInt6162;
	public boolean aBoolean6163;
	public boolean aBoolean6164;
	public boolean aBoolean6165;
	int[][] parts_translations;
	public int anInt6167;
	public byte aByte6168;
	public int anInt6169;
	public byte walkMask;
	int anInt6171;
	public static int anInt6172 = 2;
	public boolean aBoolean6173;
	public int anInt6174;
	public int anInt6175;
	public int anInt6176;
	public static int anInt6177 = 1;
	public int anInt6178;
	public int anInt6179;
	public boolean aBoolean6180;
	public int anInt6181;
	public static short[] aShortArray6182 = new short[256];
	public Class274 aClass274_6183;
	public int anInt6184;
	public int anInt6185;
	public int anInt6186;
	public int size = -1690840619;
	public int[] anIntArray6188;
	public int anInt6189;
	public int anInt6190;
	public short aShort6191;
	public int anInt6192;
	public boolean aBoolean6193;
	private byte[] aByteArray12930;
	private byte[] aByteArray1293;
	private int[] anIntArray2930;
    public static boolean displayFullNPC;
    public static boolean needModelRefresh;

	public void decode(Packet buffer) {
		for (;;) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0) {
				break;
			}
			decode(buffer, opcode);
		}
	}

	public void decodeOSRS(Packet buffer) {
		for (;;) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0) {
				break;
			}
			decodeOSRS(buffer, opcode);
		}
	}

	public void decodeOSRS(Packet buffer, int opcode) {
		if (opcode == 1) {
			int i_54_ = buffer.readUnsignedByte();
			modelIds = new int[i_54_];
			for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
				modelIds[i_55_] = buffer.readUnsignedShort() + OSRSData.MODELS_OFFSET;
			}
		} else if (opcode == 2) {
			name = buffer.getString();
		} else if (opcode == 12) {
			size = buffer.readUnsignedByte() * -1690840619;
		} else if (opcode >= 30 && opcode < 35) {
			options[opcode - 30] = buffer.getString();
			if (options[opcode - 30].equalsIgnoreCase("Hidden")) {
				options[opcode - 30] = null;
			}
		} else if (opcode == 40) {
			int i_56_ = buffer.readUnsignedByte();
			originalModelColors = new short[i_56_];
			modifiedModelColors = new short[i_56_];
			for (int i_57_ = 0; i_57_ < i_56_; i_57_++) {
				originalModelColors[i_57_] = (short) buffer.readUnsignedShort();
				modifiedModelColors[i_57_] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 41) {
			int i_58_ = buffer.readUnsignedByte();
			originalTextureColors = new short[i_58_];
			modifiedTextureColors = new short[i_58_];
			for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
				originalTextureColors[i_59_] = (short) buffer.readUnsignedShort();
				modifiedTextureColors[i_59_] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 60) {
			int i_62_ = buffer.readUnsignedByte();
			chatHeads = new int[i_62_];
			for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
				chatHeads[i_63_] = buffer.readUnsignedShort() + OSRSData.MODELS_OFFSET;
			}
		} else if (opcode == 93) {
			visibleOnMap = false;
		} else if (opcode == 95) {
			combatLevel = buffer.readUnsignedShort() * 954057527;
		} else if (opcode == 97) {
			npcHeight = buffer.readUnsignedShort() * -1227975681;
		} else if (98 == opcode) {
			npcWidth = buffer.readUnsignedShort() * 745310987;
		} else if (opcode == 99) {
			renderPriority = true;
		} else if (opcode == 100) {
			anInt6137 = buffer.readByte() * 2012631201;
		} else if (101 == opcode) {
			anInt6156 = buffer.readByte() * 1653976405;
		} else if (opcode == 102) {
			anInt6185 = buffer.readUnsignedShort() * 945207309;
		} else if (opcode == 103) {
			anInt6181 = buffer.readUnsignedShort() * -1075872661;
		} else if (opcode == 106 || 118 == opcode) {
			anInt6171 = buffer.readUnsignedShort() * -70774261;
			if (677538211 * anInt6171 == 65535) {
				anInt6171 = 70774261;
			}
			anInt6162 = buffer.readUnsignedShort() * -1169422749;
			if (anInt6162 * -1248679093 == 65535) {
				anInt6162 = 1169422749;
			}
			int i_64_ = -1;
			if (opcode == 118) {
				i_64_ = buffer.readUnsignedShort();
				if (i_64_ == 65535) {
					i_64_ = -1;
				}
			}
			int i_65_ = buffer.readUnsignedByte();
			anIntArray6188 = new int[2 + i_65_];
			for (int i_66_ = 0; i_66_ <= i_65_; i_66_++) {
				anIntArray6188[i_66_] = buffer.readUnsignedShort();
				if (65535 == anIntArray6188[i_66_]) {
					anIntArray6188[i_66_] = -1;
				}
			}
			anIntArray6188[i_65_ + 1] = i_64_;
		} else if (opcode == 107) {
			aBoolean6163 = false;
		} else if (opcode == 109) {
			aBoolean6164 = false;
		} else if (111 == opcode) {
			aBoolean6165 = false;
		} else if (opcode == 113) {
			aShort6191 = (short) buffer.readUnsignedShort();
			aShort6153 = (short) buffer.readUnsignedShort();
		} else if (127 == opcode) {
			int id = buffer.readUnsignedShort();
			basid = id * -799129853;
		} else if (249 == opcode) {
			int i_72_ = buffer.readUnsignedByte();
			if (aClass437_6159 == null) {
				int i_73_ = Class416.method5590(i_72_, (byte) 16);
				aClass437_6159 = new HashTable(i_73_);
			}
			for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
				boolean bool = buffer.readUnsignedByte() == 1;
				int i_75_ = buffer.g3();
				Node node;
				if (bool) {
					node = new LinkableObject(buffer.getString());
				} else {
					node = new Class298_Sub35(buffer.readUnsignedInt());
				}
				aClass437_6159.method5817(node, i_75_);
			}
		} else {
			throw new RuntimeException("Unhandled opcode: " + opcode);
		}
	}

	public final ModelPart method6236(GraphicsToolkit class_ra, int i, Class349 class349, Interface23 interface23,
									  Animator animator, Animator animator_1_, Animator[] animators, int[] is, int i_2_, Class498 class498,
									  int i_3_, boolean bool, int i_4_) {
		try {
			if (null != anIntArray6188) {
				NPCType class503_5_ = method6240(interface23, 1886245346);
				if (null == class503_5_) {
					return null;
				}
				return class503_5_.method6236(class_ra, i, class349, interface23, animator, animator_1_, animators, is,
						i_2_, class498, i_3_, bool, -679459424);
			}
			int i_6_ = i;
			if (-1282053981 * npcWidth != 128) {
				i_6_ |= 0x2;
			}
			if (128 != -2086573057 * npcHeight) {
				i_6_ |= 0x5;
			}
			boolean bool_7_ = false;
			int i_8_ = null != animators ? animators.length : 0;
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				if (animators[i_9_] != null) {
					i_6_ |= animators[i_9_].method5829(-1790708337);
					bool_7_ = true;
				}
			}
			if (null != animator) {
				i_6_ |= animator.method5829(-1790708337);
				bool_7_ = true;
			}
			if (null != animator_1_) {
				i_6_ |= animator_1_.method5829(-1790708337);
				bool_7_ = true;
			}
			long l = id * -407713023 | 580915349 * class_ra.anInt5298 << 16;
			if (null != class498) {
				l |= class498.aLong6110 * -8495627389615588201L << 24;
			}
			ModelPart modelPart;
			synchronized (aClass507_6125.aClass348_6204) {
				modelPart = (ModelPart) aClass507_6125.aClass348_6204.get(l);
			}
			BASType class350 = null;
			if (!bool && i_3_ != -1) {
				class350 = class349.method4202(i_3_, (byte) 59);
			} else if (-1 != 525312939 * basid) {
				class350 = class349.method4202(basid * 525312939, (byte) 89);
			}
			if (modelPart == null || (modelPart.m() & i_6_) != i_6_) {
				if (null != modelPart) {
					i_6_ |= modelPart.m();
				}
				int i_10_ = i_6_;
				if (originalModelColors != null) {
					i_10_ |= 0x4000;
				}
				if (originalTextureColors != null) {
					i_10_ |= 0x8000;
				}
				if (aByte6141 != 0) {
					i_10_ |= 0x80000;
				}
				int[] is_11_ = null != class498 && class498.models != null ? class498.models : modelIds;
				boolean bool_12_ = false;
				synchronized (aClass507_6125.aClass243_6208) {
					for (int element : is_11_) {
						if (element == -1) {
							if (i_4_ != -679459424) {
								throw new IllegalStateException();
							}
						} else if (!aClass507_6125.aClass243_6208.method2290(element, 0, -1819291215)) {
							bool_12_ = true;
						}
					}
				}
				if (bool_12_) {
					return null;
				}
				Model[] class64s = new Model[is_11_.length];
				for (int i_14_ = 0; i_14_ < is_11_.length; i_14_++) {
					if (is_11_[i_14_] == -1) {
						if (i_4_ != -679459424) {
							throw new IllegalStateException();
						}
					} else {
						synchronized (aClass507_6125.aClass243_6208) {
							class64s[i_14_] = Model.method751(aClass507_6125.aClass243_6208, is_11_[i_14_], 0);
						}
						if (class64s[i_14_] != null) {
							if (class64s[i_14_].version < 13) {
								class64s[i_14_].method755(2);
							}
							if (parts_translations != null && parts_translations[i_14_] != null) {
								class64s[i_14_].method753(parts_translations[i_14_][0],
										parts_translations[i_14_][1], parts_translations[i_14_][2]);
							}
						}
					}
				}
				if (null != class350 && null != class350.anIntArrayArray3710) {
					for (int i_15_ = 0; i_15_ < class350.anIntArrayArray3710.length; i_15_++) {
						if (i_15_ < class64s.length) {
							if (null == class64s[i_15_]) {
								if (i_4_ != -679459424) {
									throw new IllegalStateException();
								}
							} else {
								int i_16_ = 0;
								int i_17_ = 0;
								int i_18_ = 0;
								int i_19_ = 0;
								int i_20_ = 0;
								int i_21_ = 0;
								if (null != class350.anIntArrayArray3710[i_15_]) {
									i_16_ = class350.anIntArrayArray3710[i_15_][0];
									i_17_ = class350.anIntArrayArray3710[i_15_][1];
									i_18_ = class350.anIntArrayArray3710[i_15_][2];
									i_19_ = class350.anIntArrayArray3710[i_15_][3] << 3;
									i_20_ = class350.anIntArrayArray3710[i_15_][4] << 3;
									i_21_ = class350.anIntArrayArray3710[i_15_][5] << 3;
								}
								if (0 != i_19_ || 0 != i_20_ || 0 != i_21_) {
									class64s[i_15_].method754(i_19_, i_20_, i_21_);
								}
								if (0 != i_16_ || i_17_ != 0 || i_18_ != 0) {
									class64s[i_15_].method753(i_16_, i_17_, i_18_);
								}
							}
						}
					}
				}
				Model class64;
				if (1 == class64s.length) {
					class64 = class64s[0];
				} else {
					class64 = new Model(class64s, class64s.length);
				}
				modelPart = class_ra.method5037(class64, i_10_, 299909243 * aClass507_6125.anInt6210,
						-335572127 * anInt6137 + 64, 850 + -1208973327 * anInt6156);
				if (null != originalModelColors) {
					short[] is_22_;
					if (class498 != null && null != class498.aShortArray6109) {
						is_22_ = class498.aShortArray6109;
					} else {
						is_22_ = modifiedModelColors;
					}
					for (int i_23_ = 0; i_23_ < originalModelColors.length; i_23_++) {
						if (null != aByteArray6135 && i_23_ < aByteArray6135.length) {
							modelPart.X(originalModelColors[i_23_],
									aShortArray6182[aByteArray6135[i_23_] & 0xff]);
						} else {
							modelPart.X(originalModelColors[i_23_], is_22_[i_23_]);
						}
					}
				}
				if (null != originalTextureColors) {
					short[] is_24_;
					if (class498 != null && null != class498.aShortArray6107) {
						is_24_ = class498.aShortArray6107;
					} else {
						is_24_ = modifiedTextureColors;
					}
					for (int i_25_ = 0; i_25_ < originalTextureColors.length; i_25_++) {
						modelPart.W(originalTextureColors[i_25_], is_24_[i_25_]);
					}
				}
				if (0 != aByte6141) {
					modelPart.PA(aByte6138, aByte6139, aByte6157, aByte6141 & 0xff);
				}
				modelPart.KA(i_6_);
				synchronized (aClass507_6125.aClass348_6204) {
					aClass507_6125.aClass348_6204.put(modelPart, l);
				}
			}
			ModelPart modelPart_26_ = modelPart.method4755((byte) 4, i_6_, true);
			boolean bool_27_ = false;
			if (is != null) {
				for (int i_28_ = 0; i_28_ < 12; i_28_++) {
					if (-1 != is[i_28_]) {
						bool_27_ = true;
					}
				}
			}
			if (!bool_7_ && !bool_27_) {
				return modelPart_26_;
			}
			Matrix43f[] class222s = null;
			if (null != class350) {
				class222s = class350.method4207((byte) 22);
			}
			if (bool_27_ && null != class222s) {
				for (int i_29_ = 0; i_29_ < 12; i_29_++) {
					if (class222s[i_29_] != null) {
						modelPart_26_.method4741(class222s[i_29_], 1 << i_29_, true);
					}
				}
			}
			int i_30_ = 0;
			int i_31_ = 1;
			while (i_30_ < i_8_) {
				if (animators[i_30_] == null) {
					if (i_4_ != -679459424) {
						/* empty */
					}
				} else {
					animators[i_30_].method5830(modelPart_26_, 0, i_31_, (byte) 125);
				}
				i_30_++;
				i_31_ <<= 1;
			}
			if (bool_27_) {
				for (i_30_ = 0; i_30_ < 12; i_30_++) {
					if (-1 == is[i_30_]) {
						if (i_4_ != -679459424) {
							/* empty */
						}
					} else {
						i_31_ = is[i_30_] - i_2_;
						i_31_ &= 0x3fff;
						Matrix43f class222 = new Matrix43f();
						class222.method2059(0.0F, 1.0F, 0.0F, Class220.method2049(i_31_));
						modelPart_26_.method4741(class222, 1 << i_30_, false);
					}
				}
			}
			if (bool_27_ && class222s != null) {
				for (i_30_ = 0; i_30_ < 12; i_30_++) {
					if (class222s[i_30_] != null) {
						modelPart_26_.method4741(class222s[i_30_], 1 << i_30_, false);
					}
				}
			}
			if (null != animator && animator_1_ != null) {
				Class400.method4929(modelPart_26_, animator, animator_1_, -1827693647);
			} else if (animator != null) {
				animator.method5839(modelPart_26_, 0, 339112441);
			} else if (null != animator_1_) {
				animator_1_.method5839(modelPart_26_, 0, -1538889562);
			}
			if (-2086573057 * npcHeight != 128 || 128 != -1282053981 * npcWidth) {
				modelPart_26_.oa(npcHeight * -2086573057, npcWidth * -1282053981, npcHeight * -2086573057);
			}
			modelPart_26_.KA(i);
			return modelPart_26_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.i(").append(')').toString());
		}
	}

	public final ModelPart method6237(GraphicsToolkit class_ra, int i, Interface23 interface23, Animator animator,
									  Class498 class498, int i_32_) {
		try {
			if (anIntArray6188 != null) {
				NPCType class503_33_ = method6240(interface23, 1912809157);
				if (null == class503_33_) {
					return null;
				}
				return class503_33_.method6237(class_ra, i, interface23, animator, class498, -1500196036);
			}
			if (chatHeads == null && (null == class498 || null == class498.models)) {
				return null;
			}
			int i_34_ = i;
			if (animator != null) {
				i_34_ |= animator.method5829(-1790708337);
			}
			long l = id * -407713023 | 580915349 * class_ra.anInt5298 << 16;
			if (null != class498) {
				l |= -8495627389615588201L * class498.aLong6110 << 24;
			}
			ModelPart modelPart;
			synchronized (aClass507_6125.aClass348_6211) {
				modelPart = (ModelPart) aClass507_6125.aClass348_6211.get(l);
			}
			if ((NPCType.needModelRefresh) ||null == modelPart || (modelPart.m() & i_34_) != i_34_) {
				if (null != modelPart) {
					i_34_ |= modelPart.m();
					NPCType.needModelRefresh = false;
				}
				int i_35_ = i_34_;
				if (null != originalModelColors) {
					i_35_ |= 0x4000;
				}
				if (null != originalTextureColors) {
					i_35_ |= 0x8000;
				}
				if (aByte6141 != 0) {
					i_35_ |= 0x80000;
				}
				int[] modelsToDisplay = (class498 != null && null != class498.models ? class498.models : chatHeads);
				int[] modelsCopy = Arrays.copyOf(modelsToDisplay, modelsToDisplay.length);
				if (NPCType.displayFullNPC) {
				    if ((modelIds != null && modelIds.length > 0)) {
					modelsToDisplay = new int[this.modelIds.length];
					for (int ii = 0; ii < modelIds.length; ii++) {
					    modelsToDisplay[ii] = modelIds[ii];
					}
				    }
				} else
				    modelsToDisplay = Arrays.copyOf(modelsCopy, modelsCopy.length);
				boolean bool = false;
				synchronized (aClass507_6125.aClass243_6208) {
					for (int element : modelsToDisplay) {
						if (!aClass507_6125.aClass243_6208.method2290(element, 0, -602703169)) {
							bool = true;
						}
					}
				}
				if (bool) {
					return null;
				}
				Model[] class64s = new Model[modelsToDisplay.length];
				synchronized (aClass507_6125.aClass243_6208) {
					for (int i_37_ = 0; i_37_ < modelsToDisplay.length; i_37_++) {
						class64s[i_37_] = Model.method751(aClass507_6125.aClass243_6208, modelsToDisplay[i_37_], 0);
					}
				}
				for (int i_38_ = 0; i_38_ < modelsToDisplay.length; i_38_++) {
					if (null != class64s[i_38_] && class64s[i_38_].version < 13) {
						class64s[i_38_].method755(2);
					}
				}
				Model class64;
				if (class64s.length == 1) {
					class64 = class64s[0];
				} else {
					class64 = new Model(class64s, class64s.length);
				}
				modelPart = class_ra.method5037(class64, i_35_, aClass507_6125.anInt6210 * 299909243, 64, 768);
				if (originalModelColors != null) {
					short[] is_39_;
					if (null != class498 && class498.aShortArray6109 != null) {
						is_39_ = class498.aShortArray6109;
					} else {
						is_39_ = modifiedModelColors;
					}
					for (int i_40_ = 0; i_40_ < originalModelColors.length; i_40_++) {
						if (null != aByteArray6135 && i_40_ < aByteArray6135.length) {
							modelPart.X(originalModelColors[i_40_],
									aShortArray6182[aByteArray6135[i_40_] & 0xff]);
						} else {
							modelPart.X(originalModelColors[i_40_], is_39_[i_40_]);
						}
					}
				}
				if (originalTextureColors != null) {
					short[] is_41_;
					if (class498 != null && class498.aShortArray6107 != null) {
						is_41_ = class498.aShortArray6107;
					} else {
						is_41_ = modifiedTextureColors;
					}
					for (int i_42_ = 0; i_42_ < originalTextureColors.length; i_42_++) {
						modelPart.W(originalTextureColors[i_42_], is_41_[i_42_]);
					}
				}
				if (aByte6141 != 0) {
					modelPart.PA(aByte6138, aByte6139, aByte6157, aByte6141 & 0xff);
				}
				modelPart.KA(i_34_);
				synchronized (aClass507_6125.aClass348_6211) {
					aClass507_6125.aClass348_6211.put(modelPart, l);
				}
			}
			if (animator != null) {
				modelPart = modelPart.method4755((byte) 1, i_34_, true);
				animator.method5839(modelPart, 0, -731129719);
			}
			modelPart.KA(i);
			return modelPart;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.k(").append(')').toString());
		}
	}

	public final boolean method6238(int i) {
		try {
			if (modelIds == null) {
				return true;
			}
			boolean bool = true;
			int[] is = modelIds;
			for (int i_44_ : is) {
				if (!aClass507_6125.aClass243_6208.method2290(i_44_, 0, -463050298)) {
					bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.d(").append(')').toString());
		}
	}

	public int method6239(int i, int i_45_, byte i_46_) {
		try {
			if (aClass437_6159 == null) {
				return i_45_;
			}
			Class298_Sub35 class298_sub35 = (Class298_Sub35) aClass437_6159.get(i);
			if (class298_sub35 == null) {
				return i_45_;
			}
			return class298_sub35.anInt7394 * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.u(").append(')').toString());
		}
	}

	public final NPCType method6240(Interface23 interface23, int i) {
		try {
			int i_47_ = -1;
			if (anInt6171 * 677538211 != -1) {
				i_47_ = interface23.method250(677538211 * anInt6171, (byte) 122);
			} else if (anInt6162 * -1248679093 != -1) {
				i_47_ = interface23.method252(anInt6162 * -1248679093, (byte) 49);
			}
			if (i_47_ < 0 || i_47_ >= anIntArray6188.length - 1 || -1 == anIntArray6188[i_47_]) {
				int i_48_ = anIntArray6188[anIntArray6188.length - 1];
				if (i_48_ != -1) {
					return aClass507_6125.method6269(i_48_, 749174826);
				}
				return null;
			}
			return aClass507_6125.method6269(anIntArray6188[i_47_], 541835254);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.r(").append(')').toString());
		}
	}

	NPCType() {
		basid = 799129853;
		aByte6141 = (byte) 0;
		anInt6128 = -1197123063;
		anInt6144 = -1226765471;
		anInt6145 = 625322989;
		anInt6146 = -1361323597;
		anInt6147 = -1737724111;
		visibleOnMap = true;
		combatLevel = -954057527;
		npcHeight = 1732902784;
		npcWidth = 910525824;
		renderPriority = false;
		aBoolean6155 = false;
		aBoolean6173 = false;
		anInt6137 = 0;
		anInt6156 = 0;
		anInt6185 = -945207309;
		anInt6178 = 537547649;
		anInt6181 = -68186784;
		anInt6171 = 70774261;
		anInt6162 = 1169422749;
		aBoolean6163 = true;
		aBoolean6164 = true;
		aBoolean6165 = true;
		aShort6191 = (short) 0;
		aShort6153 = (short) 0;
		aByte6168 = (byte) -96;
		aByte6152 = (byte) -16;
		walkMask = (byte) 0;
		anInt6151 = 273231167;
		anInt6174 = 1377267175;
		anInt6169 = 1213502441;
		anInt6176 = 363354277;
		anInt6140 = 0;
		anInt6175 = 0;
		anInt6179 = -1876875963;
		anInt6167 = -1506883587;
		anInt6143 = -1816293685;
		anInt6184 = -198329521;
		aClass274_6183 = Class274.aClass274_6530;
		anInt6186 = -1432059025;
		aByte6158 = (byte) -1;
		anInt6189 = 133354337;
		anInt6190 = -986694912;
		anInt6161 = 1143914752;
		anInt6192 = 0;
		aBoolean6193 = true;
	}

	public boolean method6241(Interface23 interface23, int i) {
		try {
			if (null == anIntArray6188) {
				return true;
			}
			int i_49_ = -1;
			if (-1 != anInt6171 * 677538211) {
				i_49_ = interface23.method250(677538211 * anInt6171, (byte) 4);
			} else if (-1248679093 * anInt6162 != -1) {
				i_49_ = interface23.method252(-1248679093 * anInt6162, (byte) 94);
			}
			if (i_49_ < 0 || i_49_ >= anIntArray6188.length - 1 || anIntArray6188[i_49_] == -1) {
				int i_50_ = anIntArray6188[anIntArray6188.length - 1];
				if (-1 != i_50_) {
					return true;
				}
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.q(").append(')').toString());
		}
	}

	public boolean method6242(byte i) {
		try {
			if (anIntArray6188 == null) {
				return -1 != anInt6151 * 1945943361 || -1 != 1105496999 * anInt6169 || -1390399277 * anInt6176 != -1;
			}
			for (int element : anIntArray6188) {
				if (-1 != element) {
					NPCType class503_52_ = aClass507_6125.method6269(element, -1960092896);
					if (1945943361 * class503_52_.anInt6151 != -1 || -1 != class503_52_.anInt6169 * 1105496999
							|| class503_52_.anInt6176 * -1390399277 != -1) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.n(").append(')').toString());
		}
	}

	void method6243(int i) {
		try {
			if (null == modelIds) {
				modelIds = new int[0];
			}
			if (aByte6158 == -1) {
				if (aClass507_6125.aGameContext_6205 == GameContext.aGameContext_5320) {
					aByte6158 = (byte) 1;
				} else {
					aByte6158 = (byte) 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.b(").append(')').toString());
		}
	}

	public void decode(Packet buffer, int opcode) {
		try {
			if (opcode == 1) {
				int i_54_ = buffer.readUnsignedByte();
				modelIds = new int[i_54_];
				for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
					modelIds[i_55_] = buffer.readBigSmart();
				}
			} else if (opcode == 2) {
				name = buffer.getString();
			} else if (12 == opcode) {
				size = buffer.readUnsignedByte() * -1690840619;
			} else if (opcode >= 30 && opcode < 35) {
				options[opcode - 30] = buffer.getString();
			} else if (opcode == 40) {
				int i_56_ = buffer.readUnsignedByte();
				originalModelColors = new short[i_56_];
				modifiedModelColors = new short[i_56_];
				for (int i_57_ = 0; i_57_ < i_56_; i_57_++) {
					originalModelColors[i_57_] = (short) buffer.readUnsignedShort();
					modifiedModelColors[i_57_] = (short) buffer.readUnsignedShort();
				}
			} else if (opcode == 41) {
				int i_58_ = buffer.readUnsignedByte();
				originalTextureColors = new short[i_58_];
				modifiedTextureColors = new short[i_58_];
				for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
					originalTextureColors[i_59_] = (short) buffer.readUnsignedShort();
					modifiedTextureColors[i_59_] = (short) buffer.readUnsignedShort();
				}
			} else if (opcode == 42) {
				int i_60_ = buffer.readUnsignedByte();
				aByteArray6135 = new byte[i_60_];
				for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
					aByteArray6135[i_61_] = buffer.readByte();
				}
			} else if (opcode == 44) {
				int i_24_ = (short) buffer.readUnsignedShort();
				int i_25_ = 0;
				for (int i_26_ = i_24_; i_26_ > 0; i_26_ >>= 1) {
					i_25_++;
				}
				aByteArray12930 = new byte[i_25_];
				byte i_27_ = 0;
				for (int i_28_ = 0; i_28_ < i_25_; i_28_++) {
					if ((i_24_ & 1 << i_28_) > 0) {
						aByteArray12930[i_28_] = i_27_;
						i_27_++;
					} else {
						aByteArray12930[i_28_] = (byte) -1;
					}
				}
			} else if (45 == opcode) {
				int i_29_ = (short) buffer.readUnsignedShort();
				int i_30_ = 0;
				for (int i_31_ = i_29_; i_31_ > 0; i_31_ >>= 1) {
					i_30_++;
				}
				aByteArray1293 = new byte[i_30_];
				byte i_32_ = 0;
				for (int i_33_ = 0; i_33_ < i_30_; i_33_++) {
					if ((i_29_ & 1 << i_33_) > 0) {
						aByteArray1293[i_33_] = i_32_;
						i_32_++;
					} else {
						aByteArray1293[i_33_] = (byte) -1;
					}
				}
			} else if (opcode == 60) {
				int i_62_ = buffer.readUnsignedByte();
				chatHeads = new int[i_62_];
				for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
					chatHeads[i_63_] = buffer.readBigSmart();
				}
			} else if (opcode == 93) {
				visibleOnMap = false;
			} else if (opcode == 95) {
				combatLevel = buffer.readUnsignedShort() * 954057527;
			} else if (opcode == 97) {
				npcHeight = buffer.readUnsignedShort() * -1227975681;
			} else if (98 == opcode) {
				npcWidth = buffer.readUnsignedShort() * 745310987;
			} else if (opcode == 99) {
				renderPriority = true;
			} else if (opcode == 100) {
				anInt6137 = buffer.readByte() * 2012631201;
			} else if (101 == opcode) {
				anInt6156 = buffer.readByte() * 1653976405;
			} else if (opcode == 102) {
				anInt6185 = buffer.readUnsignedShort() * 945207309;
			} else if (103 == opcode) {
				anInt6181 = buffer.readUnsignedShort() * -1075872661;
			} else if (opcode == 106 || 118 == opcode) {
				anInt6171 = buffer.readUnsignedShort() * -70774261;
				if (677538211 * anInt6171 == 65535) {
					anInt6171 = 70774261;
				}
				anInt6162 = buffer.readUnsignedShort() * -1169422749;
				if (anInt6162 * -1248679093 == 65535) {
					anInt6162 = 1169422749;
				}
				int i_64_ = -1;
				if (opcode == 118) {
					i_64_ = buffer.readUnsignedShort();
					if (i_64_ == 65535) {
						i_64_ = -1;
					}
				}
				int i_65_ = buffer.readUnsignedByte();
				anIntArray6188 = new int[2 + i_65_];
				for (int i_66_ = 0; i_66_ <= i_65_; i_66_++) {
					anIntArray6188[i_66_] = buffer.readUnsignedShort();
					if (65535 == anIntArray6188[i_66_]) {
						anIntArray6188[i_66_] = -1;
					}
				}
				anIntArray6188[i_65_ + 1] = i_64_;
			} else if (opcode == 107) {
				aBoolean6163 = false;
			} else if (opcode == 109) {
				aBoolean6164 = false;
			} else if (111 == opcode) {
				aBoolean6165 = false;
			} else if (opcode == 113) {
				aShort6191 = (short) buffer.readUnsignedShort();
				aShort6153 = (short) buffer.readUnsignedShort();
			} else if (114 == opcode) {
				aByte6168 = buffer.readByte();
				aByte6152 = buffer.readByte();
			} else if (119 == opcode) {
				walkMask = buffer.readByte();
			} else if (opcode == 121) {
				parts_translations = new int[modelIds.length][];
				int i_67_ = buffer.readUnsignedByte();
				for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
					int i_69_ = buffer.readUnsignedByte();
					int[] is = parts_translations[i_69_] = new int[3];
					is[0] = buffer.readByte();
					is[1] = buffer.readByte();
					is[2] = buffer.readByte();
				}
			} else if (opcode == 122) {
				anInt6167 = buffer.readBigSmart() * 1506883587;
			} else if (opcode == 123) {
				anInt6143 = buffer.readUnsignedShort() * 1816293685;
			} else if (opcode == 125) {
				aClass274_6183 = (Class274) CompressionType.method5701(Class299.method3680(-1901608125), buffer.readByte(),
						(byte) 2);
			} else if (127 == opcode) {
				basid = buffer.readUnsignedShort() * -799129853;
			} else if (128 == opcode) {
				CompressionType.method5701(Class522.method6325((byte) -83), buffer.readUnsignedByte(), (byte) 2);
			} else if (opcode == 134) {
				anInt6151 = buffer.readUnsignedShort() * -273231167;
				if (65535 == anInt6151 * 1945943361) {
					anInt6151 = 273231167;
				}
				anInt6174 = buffer.readUnsignedShort() * -1377267175;
				if (65535 == anInt6174 * -904091095) {
					anInt6174 = 1377267175;
				}
				anInt6169 = buffer.readUnsignedShort() * -1213502441;
				if (65535 == 1105496999 * anInt6169) {
					anInt6169 = 1213502441;
				}
				anInt6176 = buffer.readUnsignedShort() * -363354277;
				if (anInt6176 * -1390399277 == 65535) {
					anInt6176 = 363354277;
				}
				anInt6140 = buffer.readUnsignedByte() * 203494719;
			} else if (opcode == 135 || 136 == opcode) {
				anInt6145 = buffer.readUnsignedByte() * -625322989;
				anInt6128 = buffer.readUnsignedShort() * 1197123063;
			} else if (opcode == 137) {
				anInt6147 = buffer.readUnsignedShort() * 1737724111;
			} else if (opcode == 138) {
				anInt6178 = buffer.readBigSmart() * -537547649;
			} else if (opcode == 140) {
				anInt6179 = buffer.readUnsignedByte() * -462121541;
			} else if (opcode == 141) {
				aBoolean6173 = true;
			} else if (opcode == 142) {
				anInt6186 = buffer.readUnsignedShort() * 1432059025;
			} else if (143 == opcode) {
				aBoolean6155 = true;
			} else if (opcode >= 150 && opcode < 155) {
				options[opcode - 150] = buffer.getString();
				if (!aClass507_6125.aBoolean6209) {
					options[opcode - 150] = null;
				}
			} else if (opcode == 155) {
				aByte6138 = buffer.readByte();
				aByte6139 = buffer.readByte();
				aByte6157 = buffer.readByte();
				aByte6141 = buffer.readByte();
			} else if (158 == opcode) {
				aByte6158 = (byte) 1;
			} else if (opcode == 159) {
				aByte6158 = (byte) 0;
			} else if (opcode == 160) {
				int i_70_ = buffer.readUnsignedByte();
				anIntArray6131 = new int[i_70_];
				for (int i_71_ = 0; i_71_ < i_70_; i_71_++) {
					anIntArray6131[i_71_] = buffer.readUnsignedShort();
				}
			} else if (opcode == 162) {
				aBoolean6180 = true;
			} else if (opcode == 163) {
				anInt6189 = buffer.readUnsignedByte() * -133354337;
			} else if (164 == opcode) {
				anInt6190 = buffer.readUnsignedShort() * -138072005;
				anInt6161 = buffer.readUnsignedShort() * 1615081153;
			} else if (165 == opcode) {
				anInt6192 = buffer.readUnsignedByte() * -1027847229;
			} else if (168 == opcode) {
				anInt6175 = buffer.readUnsignedByte() * -2143657709;
			} else if (opcode == 169) {
				aBoolean6193 = false;
			} else if (opcode >= 170 && opcode < 176) {
				if (null == anIntArray2930) {
					anIntArray2930 = new int[6];
					Arrays.fill(anIntArray2930, -1);
				}
				int i_44_ = (short) buffer.readUnsignedShort();
				if (i_44_ == 65535) {
					i_44_ = -1;
				}
				anIntArray2930[opcode - 170] = i_44_;
			} else if (249 == opcode) {
				int i_72_ = buffer.readUnsignedByte();
				if (aClass437_6159 == null) {
					int i_73_ = Class416.method5590(i_72_, (byte) 16);
					aClass437_6159 = new HashTable(i_73_);
				}
				for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
					boolean bool = buffer.readUnsignedByte() == 1;
					int i_75_ = buffer.g3();
					Node node;
					if (bool) {
						node = new LinkableObject(buffer.getString());
					} else {
						node = new Class298_Sub35(buffer.readUnsignedInt());
					}
					aClass437_6159.method5817(node, i_75_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.f(").append(')').toString());
		}
	}

	public String method6245(int i, String string, int i_76_) {
		try {
			if (null == aClass437_6159) {
				return string;
			}
			LinkableObject linkableObject = (LinkableObject) aClass437_6159.get(i);
			if (null == linkableObject) {
				return string;
			}
			return (String) linkableObject.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.x(").append(')').toString());
		}
	}

	public final ModelPart method6246(GraphicsToolkit class_ra, int i, Class349 class349, Interface23 interface23,
									  Animator animator, Animator animator_77_, Animator[] animators, int[] is, int i_78_, Class498 class498,
									  int i_79_) {
		try {
			return method6236(class_ra, i, class349, interface23, animator, animator_77_, animators, is, i_78_,
					class498, basid * 525312939, true, -679459424);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.p(").append(')').toString());
		}
	}

	public static Class128 method6247(Packet class298_sub53, int i) {
		try {
			Class128 class128 = SpotAnimation.method608(class298_sub53, -2098410603);
			int i_80_ = class298_sub53.readUnsignedInt();
			int i_81_ = class298_sub53.readUnsignedInt();
			return new Class128_Sub2(class128.aClass139_6322, class128.aClass133_6323, class128.anInt6327 * -39975161,
					1886882435 * class128.anInt6325, class128.anInt6326 * -944287579, -1387457793 * class128.anInt6330,
					-684094775 * class128.anInt6328, 955568089 * class128.anInt6329, class128.anInt6324 * 782326281,
					i_80_, i_81_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uu.i(").append(')').toString());
		}
	}
}
