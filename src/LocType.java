import java.util.Arrays;

/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class LocType {
	byte aByte5363;
	public int anInt5364;
	public int id;
	public int[] anIntArray5366;
	public short[] aShortArray5367;
	public String name = "null";
	short[] aShortArray5369;
	public int[] anIntArray5370;
	byte[] aByteArray5371;
	short[] aShortArray5372;
	public short[] aShortArray5373;
	public int[][] models;
	byte aByte5375;
	public int anInt5376;
	byte aByte5377 = 0;
	int[] anIntArray5378;
	int anInt5379;
	public int anInt5380;
	public boolean aBoolean5381;
	public int anInt5382;
	public int sizeY;
	int anInt5384;
	public boolean aBoolean5385;
	public int sizeX = -2144855351;
	public int anInt5387;
	public int anInt5388;
	public boolean aBoolean5389;
	int[] anIntArray5390;
	public int anInt5391;
	int anInt5392;
	int anInt5393;
	public String[] aStringArray5394;
	public boolean aBoolean5395;
	int anInt5396;
	public int anInt5397;
	public int anInt5398;
	public int anInt5399;
	public int anInt5400;
	public boolean aBoolean5401;
	public int anInt5402;
	ObjectTypeList aClass433_5403;
	public boolean aBoolean5404;
	public boolean aBoolean5405;
	int anInt5406;
	int anInt5407;
	public int anInt5408;
	public int anInt5409;
	public boolean aBoolean5410;
	int anInt5411;
	int anInt5412;
	int anInt5413;
	int anInt5414;
	byte aByte5415;
	public boolean aBoolean5416;
	byte aByte5417;
	public int anInt5418;
	int anInt5419;
	int anInt5420;
	int anInt5421;
	public int anInt5422;
	public static short[] aShortArray5423 = new short[256];
	public boolean aBoolean5424;
	public int anInt5425;
	public boolean aBoolean5426;
	public int anInt5427;
	public int anInt5428;
	public int[] anIntArray5429;
	public byte[] shapes;
	public boolean aBoolean5431;
	public boolean aBoolean5432;
	public boolean aBoolean5433;
	public boolean aBoolean5434;
	HashTable aClass437_5435;
	public int anInt5436;
	public int anInt5437;
	public int anInt5438;
	public int anInt5439;
	public boolean aBoolean5440;
	public boolean aBoolean5441;
	private byte[] unknownArray3;
	private byte[] unknownArray4;
	private int[] aj;
	static int anInt5442 = 127007;

	public void decode(Packet buffer) {
		for (;;) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0) {
				break;
			}
			decode(buffer, opcode);
		}
	}

	private void decode(Packet buffer, int opcode) {
			if (1 == opcode) {
				int i_1_ = buffer.readUnsignedByte();
				shapes = new byte[i_1_];
				models = new int[i_1_][];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					shapes[i_2_] = buffer.readByte();
					int i_3_ = buffer.readUnsignedByte();
					models[i_2_] = new int[i_3_];
					for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
						models[i_2_][i_4_] = buffer.readBigSmart();
						if ((id * 1181652947) >= OSRSData.LOCS_OFFSET) {
							models[i_2_][i_4_] += OSRSData.LOCS_OFFSET;
						}
					}
				}
			} else if (opcode == 2) {
				name = buffer.getString();
			} else if (14 == opcode) {
				sizeX = buffer.readUnsignedByte() * -2144855351;
			} else if (opcode == 15) {
				sizeY = buffer.readUnsignedByte() * 44056569;
			} else if (opcode == 17) {
				anInt5380 = 0;
				aBoolean5424 = false;
			} else if (opcode == 18) {
				aBoolean5424 = false;
			} else if (19 == opcode) {
				anInt5382 = buffer.readUnsignedByte() * 455422743;
			} else if (21 == opcode) {
				aByte5363 = (byte) 1;
			} else if (opcode == 22) {
				aBoolean5385 = true;
			} else if (opcode == 23) {
				anInt5376 = -580315545;
			} else if (24 == opcode) {
				int i_5_ = buffer.readBigSmart();

				if ((id * 1181652947) >= OSRSData.LOCS_OFFSET) {
					i_5_ += OSRSData.SEQUENCES_OFFSET;
				}

				if (i_5_ != -1) {
					anIntArray5378 = new int[] { i_5_ };
				}
			} else if (opcode == 27) {
				anInt5380 = 268680417;
			} else if (28 == opcode) {
				anInt5391 = (buffer.readUnsignedByte() << 2) * 803995289;
			} else if (opcode == 29) {
				anInt5392 = buffer.readByte() * -62240291;
			} else if (39 == opcode) {
				anInt5393 = buffer.readByte() * -1530589831;
			} else if (opcode >= 30 && opcode < 35) {
				aStringArray5394[opcode - 30] = buffer.getString();
			} else if (opcode == 40) {
				int i_6_ = buffer.readUnsignedByte();
				aShortArray5369 = new short[i_6_];
				aShortArray5367 = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					aShortArray5369[i_7_] = (short) buffer.readUnsignedShort();
					aShortArray5367[i_7_] = (short) buffer.readUnsignedShort();
				}
			} else if (opcode == 41) {
				int i_8_ = buffer.readUnsignedByte();
				aShortArray5372 = new short[i_8_];
				aShortArray5373 = new short[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					aShortArray5372[i_9_] = (short) buffer.readUnsignedShort();
					aShortArray5373[i_9_] = (short) buffer.readUnsignedShort();
				}
			} else if (opcode == 42) {
				int i_10_ = buffer.readUnsignedByte();
				aByteArray5371 = new byte[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
					aByteArray5371[i_11_] = buffer.readByte();
				}
			} else if (44 == opcode) {
				int i_86_ = (short) buffer.readUnsignedShort();
				int i_87_ = 0;
				for (int i_88_ = i_86_; i_88_ > 0; i_88_ >>= 1) {
					i_87_++;
				}
				unknownArray3 = new byte[i_87_];
				byte i_89_ = 0;
				for (int i_90_ = 0; i_90_ < i_87_; i_90_++) {
					if ((i_86_ & 1 << i_90_) > 0) {
						unknownArray3[i_90_] = i_89_;
						i_89_++;
					} else {
						unknownArray3[i_90_] = (byte) -1;
					}
				}
			} else if (opcode == 45) {
				int i_91_ = (short) buffer.readUnsignedShort();
				int i_92_ = 0;
				for (int i_93_ = i_91_; i_93_ > 0; i_93_ >>= 1) {
					i_92_++;
				}
				unknownArray4 = new byte[i_92_];
				byte i_94_ = 0;
				for (int i_95_ = 0; i_95_ < i_92_; i_95_++) {
					if ((i_91_ & 1 << i_95_) > 0) {
						unknownArray4[i_95_] = i_94_;
						i_94_++;
					} else {
						unknownArray4[i_95_] = (byte) -1;
					}
				}
			} else if (opcode == 62) {
				aBoolean5404 = true;
			} else if (64 == opcode) {
				aBoolean5405 = false;
			} else if (65 == opcode) {
				anInt5406 = buffer.readUnsignedShort() * 929519655;
			} else if (66 == opcode) {
				anInt5407 = buffer.readUnsignedShort() * -1076239419;
			} else if (opcode == 67) {
				anInt5414 = buffer.readUnsignedShort() * 1192395179;
			} else if (opcode == 69) {
				buffer.readUnsignedByte();
			} else if (opcode == 70) {
				anInt5379 = (buffer.readShort(1954619354) << 2) * 804752437;
			} else if (opcode == 71) {
				anInt5396 = (buffer.readShort(1981333343) << 2) * -830213317;
			} else if (opcode == 72) {
				anInt5411 = (buffer.readShort(2079097901) << 2) * 1957563615;
			} else if (opcode == 73) {
				aBoolean5410 = true;
			} else if (opcode == 74) {
				aBoolean5416 = true;
			} else if (opcode == 75) {
				anInt5409 = buffer.readUnsignedByte() * 1763780945;
			} else if (77 == opcode || 92 == opcode) {
				anInt5420 = buffer.readUnsignedShort() * -1228374415;
				if (65535 == 1064010385 * anInt5420) {
					anInt5420 = 1228374415;
				}
				anInt5421 = buffer.readUnsignedShort() * -2115564225;
				if (65535 == -1128963393 * anInt5421) {
					anInt5421 = 2115564225;
				}
				int i_12_ = -1;
				if (92 == opcode) {
					i_12_ = buffer.readBigSmart();
					if ((id * 1181652947) >= OSRSData.LOCS_OFFSET) {
						i_12_ += OSRSData.LOCS_OFFSET;
					}
				}
				int i_13_ = buffer.readUnsignedByte();
				anIntArray5366 = new int[2 + i_13_];
				for (int i_14_ = 0; i_14_ <= i_13_; i_14_++) {
					anIntArray5366[i_14_] = buffer.readBigSmart();
					if ((id * 1181652947) >= OSRSData.LOCS_OFFSET) {
						anIntArray5366[i_14_] += OSRSData.LOCS_OFFSET;
					}
				}
				anIntArray5366[i_13_ + 1] = i_12_;
			} else if (opcode == 78) {
				anInt5422 = buffer.readUnsignedShort() * -349046175;
				anInt5408 = buffer.readUnsignedByte() * -634552289;
			} else if (opcode == 79) {
				anInt5427 = buffer.readUnsignedShort() * 1882310759;
				anInt5428 = buffer.readUnsignedShort() * 1376401661;
				anInt5408 = buffer.readUnsignedByte() * -634552289;
				int i_15_ = buffer.readUnsignedByte();
				anIntArray5429 = new int[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
					anIntArray5429[i_16_] = buffer.readUnsignedShort();
				}
			} else if (81 == opcode) {
				aByte5363 = (byte) 2;
				anInt5384 = buffer.readUnsignedByte() * -1868938496;
			} else if (opcode == 82) {
				aBoolean5432 = true;
			} else if (88 == opcode) {
				aBoolean5433 = false;
			} else if (opcode == 89) {
				aBoolean5431 = false;
			} else if (91 == opcode) {
				aBoolean5434 = true;
			} else if (opcode == 93) {
				aByte5363 = (byte) 3;
				anInt5384 = buffer.readUnsignedShort() * -242181565;
			} else if (opcode == 94) {
				aByte5363 = (byte) 4;
			} else if (95 == opcode) {
				aByte5363 = (byte) 5;
				anInt5384 = buffer.readShort(2013201622) * -242181565;
			} else if (97 == opcode) {
				aBoolean5401 = true;
			} else if (98 == opcode) {
				aBoolean5381 = true;
			} else if (99 == opcode) {
				anInt5397 = buffer.readUnsignedByte() * 2064530465;
				anInt5436 = buffer.readUnsignedShort() * -1320066331;
			} else if (100 == opcode) {
				anInt5398 = buffer.readUnsignedByte() * 1406097311;
				anInt5364 = buffer.readUnsignedShort() * 474865427;
			} else if (101 == opcode) {
				anInt5402 = buffer.readUnsignedByte() * 1747447869;
			} else if (opcode == 102) {
				anInt5400 = buffer.readUnsignedShort() * 475870643;
			} else if (103 == opcode) {
				anInt5376 = 0;
			} else if (104 == opcode) {
				anInt5425 = buffer.readUnsignedByte() * 1861040235;
			} else if (opcode == 105) {
				aBoolean5440 = true;
			} else if (106 == opcode) {
				int i_17_ = buffer.readUnsignedByte();
				int i_18_ = 0;
				anIntArray5378 = new int[i_17_];
				anIntArray5390 = new int[i_17_];
				for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
					anIntArray5378[i_19_] = buffer.readBigSmart();
					i_18_ += anIntArray5390[i_19_] = buffer.readUnsignedByte();
				}
				for (int i_20_ = 0; i_20_ < i_17_; i_20_++) {
					anIntArray5390[i_20_] = 65535 * anIntArray5390[i_20_] / i_18_;
				}
			} else if (opcode == 107) {
				anInt5399 = buffer.readUnsignedShort() * -779127471;
			} else if (opcode >= 150 && opcode < 155) {
				aStringArray5394[opcode - 150] = buffer.getString();
				if (!aClass433_5403.aBoolean5445) {
					aStringArray5394[opcode - 150] = null;
				}
			} else if (160 == opcode) {
				int i_21_ = buffer.readUnsignedByte();
				anIntArray5370 = new int[i_21_];
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
					anIntArray5370[i_22_] = buffer.readUnsignedShort();
				}
			} else if (opcode == 162) {
				aByte5363 = (byte) 3;
				anInt5384 = buffer.readUnsignedInt() * -242181565;
			} else if (opcode == 163) {
				aByte5417 = buffer.readByte();
				aByte5375 = buffer.readByte();
				aByte5415 = buffer.readByte();
				aByte5377 = buffer.readByte();
			} else if (opcode == 164) {
				anInt5412 = buffer.readShort(2119621102) * -1121469985;
			} else if (165 == opcode) {
				anInt5413 = buffer.readShort(1762145274) * 1097094883;
			} else if (166 == opcode) {
				anInt5419 = buffer.readShort(1892618723) * -870210675;
			} else if (opcode == 167) {
				anInt5418 = buffer.readUnsignedShort() * 597954411;
			} else if (168 == opcode) {
				aBoolean5426 = true;
			} else if (169 == opcode) {
				aBoolean5395 = true;
			} else if (170 == opcode) {
				anInt5387 = buffer.readUnsignedSmart() * -1277797453;
			} else if (171 == opcode) {
				anInt5388 = buffer.readUnsignedSmart() * 883280249;
			} else if (opcode == 173) {
				anInt5438 = buffer.readUnsignedShort() * 1097791615;
				anInt5439 = buffer.readUnsignedShort() * -127624289;
			} else if (opcode == 177) {
				aBoolean5389 = true;
			} else if (178 == opcode) {
				anInt5437 = buffer.readUnsignedByte() * -1122029857;
			} else if (opcode == 189) {
				aBoolean5441 = true;
			} else if (opcode >= 190 && opcode < 196) {
				if (aj == null) {
					aj = new int[6];
					Arrays.fill(aj, -1);
				}
				aj[opcode - 190] = buffer.readUnsignedShort();
			} else if (opcode == 249) {
				int i_23_ = buffer.readUnsignedByte();
				if (aClass437_5435 == null) {
					int i_24_ = Class416.method5590(i_23_, (byte) 16);
					aClass437_5435 = new HashTable(i_24_);
				}
				for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
					boolean bool = buffer.readUnsignedByte() == 1;
					int i_26_ = buffer.g3();
					Node node;
					if (bool) {
						node = new LinkableObject(buffer.getString());
					} else {
						node = new Class298_Sub35(buffer.readUnsignedInt());
					}
					aClass437_5435.method5817(node, i_26_);
				}
			} else {
				throw new RuntimeException("Unhandled opcode=" + opcode);
			}
	}

	public void decodeOSRS(Packet buffer) { 
		while (true) {
			int pos = buffer.pos * 385051775;
			if (pos >= buffer.payload.length) {
			//	System.out.println("END: Read past payload. pos=" + pos + " len=" + payload.payload.length);
				break;
			}
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0) break;
			decodeOSRS(buffer, opcode);
		}
	}
	
	private void decodeOSRS(Packet buffer, int opcode) {
	//	System.out.println("Decoding opcode " + opcode + " at pos " + (payload.pos * 385051775));
		if (opcode == 1) {
			int num_shapes = buffer.readUnsignedByte();
			shapes = new byte[num_shapes];
			models = new int[num_shapes][];
			for (int shape_index = 0; shape_index < num_shapes; shape_index++) {
				models[shape_index] = new int[] { buffer.readUnsignedShort() + OSRSData.MODELS_OFFSET };
				shapes[shape_index] = buffer.readByte();
			}
		} else if (opcode == 2) {
			name = buffer.getString();
		} else if (opcode == 3) {
			buffer.getString(); // description, ignore
		} else if (opcode == 5) {
			shapes = new byte[] { 10 };
			int num_models = buffer.readUnsignedByte();
			models = new int[1][num_models];
			for (int index = 0; index < num_models; index++) {
				models[0][index] = buffer.readUnsignedShort() + OSRSData.MODELS_OFFSET;
			}
		} else if (opcode == 14) {
			sizeX = buffer.readUnsignedByte() * -2144855351;
		} else if (opcode == 15) {
			sizeY = buffer.readUnsignedByte() * 44056569;
		} else if (opcode == 17) {
			anInt5380 = 0;
			aBoolean5424 = false;
		} else if (opcode == 18) {
			aBoolean5424 = false;
		} else if (opcode == 19) {
			anInt5382 = buffer.readUnsignedByte() * 455422743;
		} else if (opcode == 21) {
			aByte5363 = (byte) 1;
		} else if (opcode == 22) {
			aBoolean5385 = true;
		} else if (opcode == 23) {
			anInt5376 = -325083707;
		} else if (opcode == 24) {
			int i_5_ = buffer.readUnsignedShort();
			if (i_5_ == 65535) {
				i_5_ = -1;
			} else {
				i_5_ += OSRSData.SEQUENCES_OFFSET;
				anIntArray5378 = new int[] { i_5_ };
			}
		} else if (opcode == 27) {
			anInt5380 = 1137740721;
		} else if (opcode == 28) {
			anInt5391 = (buffer.readUnsignedByte() << 2) * 803995289;
		} else if (opcode == 29) {
			anInt5392 = buffer.readByte() * -62240291;
		} else if (opcode >= 30 && opcode < 35) {
			if (aStringArray5394 == null) aStringArray5394 = new String[5]; // funny antileech yall had eh? labeling it "prevent null" while causing one. This value is 5! Not 10!
			aStringArray5394[opcode - 30] = buffer.getString();
			if (aStringArray5394[opcode - 30].equalsIgnoreCase("Hidden")) {
				aStringArray5394[opcode - 30] = null;
			}
		} else if (opcode == 39) {
			anInt5393 = buffer.readByte() * -1530589831;
		} else if (opcode == 40) {
			int i_6_ = buffer.readUnsignedByte();
			aShortArray5369 = new short[i_6_];
			aShortArray5367 = new short[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				aShortArray5369[i_7_] = (short) buffer.readUnsignedShort();
				aShortArray5367[i_7_] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 41) {
			int i_8_ = buffer.readUnsignedByte();
			aShortArray5372 = new short[i_8_];
			aShortArray5373 = new short[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				aShortArray5372[i_9_] = (short) buffer.readUnsignedShort();
				aShortArray5373[i_9_] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 42) {
			int i_10_ = buffer.readUnsignedByte();
			aByteArray5371 = new byte[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				aByteArray5371[i_11_] = buffer.readByte();
			}
		} else if (opcode == 60) {
			buffer.readUnsignedShort(); // ignore
		} else if (opcode == 62) {
			aBoolean5404 = true;
		} else if (64 == opcode) {
			aBoolean5405 = false;
		} else if (65 == opcode) {
			anInt5406 = buffer.readUnsignedShort() * 929519655;
		} else if (66 == opcode) {
			anInt5407 = buffer.readUnsignedShort() * -1076239419;
		} else if (opcode == 67) {
			anInt5414 = buffer.readUnsignedShort() * 1192395179;
		} else if (opcode == 68) {
			buffer.readUnsignedShort(); // ignore
		} else if (opcode == 69) {
			buffer.readUnsignedByte(); // ignore
		} else if (opcode >= 70 && opcode <= 72) {
			buffer.readUnsignedShort(); // ignore
		} else if (opcode == 73) {
			aBoolean5410 = true;
		} else if (opcode == 74) {
			aBoolean5416 = true;
		} else if (opcode == 75) {
			anInt5409 = buffer.readUnsignedByte() * 1763780945;
		} else if (77 == opcode || 92 == opcode) {
			anInt5420 = buffer.readUnsignedShort() * -1228374415;
			if (65535 == 1064010385 * anInt5420) {
				anInt5420 = 1228374415;
			}
			anInt5421 = buffer.readUnsignedShort() * -2115564225;
			if (65535 == -1128963393 * anInt5421) {
				anInt5421 = 2115564225;
			}
			int i_12_ = -1;
			if (92 == opcode) {
				i_12_ = buffer.readUnsignedShort();
				if (i_12_ == 65535) {
					i_12_ = -1;
				} else {
					i_12_ += OSRSData.LOCS_OFFSET;
				}
			}
			int i_13_ = buffer.readUnsignedByte();
			anIntArray5366 = new int[2 + i_13_];
			for (int i_14_ = 0; i_14_ <= i_13_; i_14_++) {
				anIntArray5366[i_14_] = buffer.readUnsignedShort();
				if (anIntArray5366[i_14_] == 65535) {
					anIntArray5366[i_14_] = -1;
				} else {
					anIntArray5366[i_14_] += OSRSData.LOCS_OFFSET;
				}
			}
			anIntArray5366[i_13_ + 1] = i_12_;
		} else if (opcode == 78) {
			anInt5422 = buffer.readUnsignedShort() * -349046175;
			anInt5408 = buffer.readUnsignedByte() * -634552289;
		} else if (opcode == 79) {
			anInt5427 = buffer.readUnsignedShort() * 1882310759;
			anInt5428 = buffer.readUnsignedShort() * 1376401661;
			anInt5408 = buffer.readUnsignedByte() * -634552289;
			int i_15_ = buffer.readUnsignedByte();
			anIntArray5429 = new int[i_15_];
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
				anIntArray5429[i_16_] = buffer.readUnsignedShort();
			}
		} else if (81 == opcode) {
			aByte5363 = (byte) 2;
			anInt5384 = buffer.readUnsignedByte() * -1868938496;
		} else if (opcode == 82) {
			aBoolean5432 = true;
		} else if (opcode == 249) {
			int i_23_ = buffer.readUnsignedByte();
			if (aClass437_5435 == null) {
				int i_24_ = Class416.method5590(i_23_, (byte) 16);
				aClass437_5435 = new HashTable(i_24_);
			}
			for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
				boolean bool = buffer.readUnsignedByte() == 1;
				int i_26_ = buffer.g3();
				Node node;
				if (bool) {
					node = new LinkableObject(buffer.getString());
				} else {
					node = new Class298_Sub35(buffer.readUnsignedInt());
				}
				aClass437_5435.method5817(node, i_26_);
			}
		} else if (opcode == 3) {
			buffer.getString(); // description, ignore
		} else if (opcode == 60) {
			buffer.readUnsignedShort(); // ignore minimap icon
		}
		// --- ADD SKIP FOR UNKNOWN OPCODES ---
		else {
		//none
		}
	}

	public String method5770(int i, String string, int i_27_) {
		try {
			if (aClass437_5435 == null) {
				return string;
			}
			LinkableObject linkableObject = (LinkableObject) aClass437_5435.get(i);
			if (linkableObject == null) {
				return string;
			}
			return (String) linkableObject.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.q(").append(')').toString());
		}
	}

	public final boolean method5771(int i, byte i_28_) {
		try {
			if (models == null) {
				return true;
			}
			boolean bool = true;
			synchronized (aClass433_5403.aClass243_5447) {
				for (int i_29_ = 0; i_29_ < shapes.length; i_29_++) {
					if (shapes[i_29_] == i) {
						for (int i_30_ = 0; i_30_ < models[i_29_].length; i_30_++) {
							if (!aClass433_5403.aClass243_5447.method2290(models[i_29_][i_30_], 0, -1404450418)) {
								bool = false;
							}
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.p(").append(')').toString());
		}
	}

	public final boolean method5772(int i) {
		try {
			if (models == null) {
				return true;
			}
			boolean bool = true;
			synchronized (aClass433_5403.aClass243_5447) {
				for (int[] modelId : models) {
					for (int element : modelId) {
						bool &= aClass433_5403.aClass243_5447.method2290(element, 0, -1427920512);
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.i(").append(')').toString());
		}
	}

	public boolean method5773(int i, int i_33_) {
		try {
			if (anIntArray5378 != null && -1 != i) {
				for (int element : anIntArray5378) {
					if (element == i) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.h(").append(')').toString());
		}
	}

	public final synchronized ModelPart method5774(GraphicsToolkit class_ra, int i, int i_35_, int i_36_, Ground ground, Ground ground_37_, int i_38_, int i_39_, int i_40_, Animator animator, Class435 class435, byte i_41_) {
		try {
			if (Class355.method4261(i_35_, 1883717056)) {
				i_35_ = Class424.aClass424_6596.anInt6613 * -1976050083;
			}
			long l = i_36_ + (i_35_ << 3) + (1181652947 * id << 10);
			int i_42_ = i;
			l |= class_ra.anInt5298 * 580915349 << 29;
			if (null != class435) {
				l |= class435.aLong5460 * 2595045048596347611L << 32;
			}
			if (animator != null) {
				i |= animator.method5829(-1790708337);
			}
			if (aByte5363 == 3) {
				i |= 0x7;
			} else {
				if (aByte5363 != 0 || 0 != 52797131 * anInt5413) {
					i |= 0x2;
				}
				if (945504799 * anInt5412 != 0) {
					i |= 0x1;
				}
				if (0 != anInt5419 * 1782732613) {
					i |= 0x4;
				}
			}
			if (Class424.aClass424_6611.anInt6613 * -1976050083 == i_35_ && i_36_ > 3) {
				i |= 0x5;
			}
			ModelPart modelPart;
			synchronized (aClass433_5403.aClass348_5451) {
				modelPart = (ModelPart) aClass433_5403.aClass348_5451.get(l);
			}
			if (modelPart == null || class_ra.method5017(modelPart.m(), i) != 0) {
				if (modelPart != null) {
					i = class_ra.method5004(i, modelPart.m());
				}
				modelPart = method5775(class_ra, i, i_35_, i_36_, class435, 1981902641);
				if (null == modelPart) {
					return null;
				}
				synchronized (aClass433_5403.aClass348_5451) {
					aClass433_5403.aClass348_5451.put(modelPart, l);
				}
			}
			boolean bool = false;
			if (animator != null) {
				modelPart = modelPart.method4755((byte) 1, i, true);
				bool = true;
				animator.method5839(modelPart, i_36_ & 0x3, 1865606525);
			}
			if (i_35_ == -1976050083 * Class424.aClass424_6611.anInt6613 && i_36_ > 3) {
				if (!bool) {
					modelPart = modelPart.method4755((byte) 3, i, true);
					bool = true;
				}
				modelPart.f(2048);
			}
			if (aByte5363 != 0) {
				if (!bool) {
					modelPart = modelPart.method4755((byte) 3, i, true);
					bool = true;
				}
				modelPart.pa(aByte5363, 1762198123 * anInt5384, ground, ground_37_, i_38_, i_39_, i_40_);
			}
			if (945504799 * anInt5412 != 0 || 0 != anInt5413 * 52797131 || 0 != 1782732613 * anInt5419) {
				if (!bool) {
					modelPart = modelPart.method4755((byte) 3, i, true);
					bool = true;
				}
				modelPart.ia(945504799 * anInt5412, anInt5413 * 52797131, 1782732613 * anInt5419);
			}
			if (bool) {
				modelPart.KA(i_42_);
			}
			return modelPart;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.d(").append(')').toString());
		}
	}

	ModelPart method5775(GraphicsToolkit class_ra, int i, int i_43_, int i_44_, Class435 class435, int i_45_) {
		try {
			int i_46_ = anInt5392 * -1536403851 + 64;
			int i_47_ = -2019557395 * anInt5393 + 850;
			int i_48_ = i;
			boolean bool = aBoolean5404 || i_43_ == Class424.aClass424_6593.anInt6613 * -1976050083 && i_44_ > 3;
			if (bool) {
				i |= 0x10;
			}
			if (i_44_ == 0) {
				if (-166422633 * anInt5406 != 128 || anInt5379 * -1514641891 != 0) {
					i |= 0x1;
				}
				if (128 != anInt5414 * -895192829 || 0 != 2145431327 * anInt5411) {
					i |= 0x4;
				}
			} else {
				i |= 0xd;
			}
			if (128 != 668312333 * anInt5407 || anInt5396 * 1536191987 != 0) {
				i |= 0x2;
			}
			if (null != aShortArray5369) {
				i |= 0x4000;
			}
			if (aShortArray5372 != null) {
				i |= 0x8000;
			}
			if (aByte5377 != 0) {
				i |= 0x80000;
			}
			ModelPart modelPart = null;
			if (null != shapes) {
				int i_49_ = -1;
				for (int i_50_ = 0; i_50_ < shapes.length; i_50_++) {
					if (i_43_ == shapes[i_50_]) {
						i_49_ = i_50_;
						break;
					}
				}
				if (i_49_ == -1) {
					return null;
				}
				int[] is = class435 != null && class435.anIntArray5463 != null ? class435.anIntArray5463 : models[i_49_];
				int i_51_ = is.length;
				if (i_51_ > 0) {
					long l = 580915349 * class_ra.anInt5298;
					for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
						l = is[i_52_] + 67783L * l;
					}
					synchronized (aClass433_5403.aClass348_5450) {
						modelPart = (ModelPart) aClass433_5403.aClass348_5450.get(l);
					}
					if (null != modelPart) {
						if (i_46_ != modelPart.c()) {
							i |= 0x1000;
						}
						if (i_47_ != modelPart.Z()) {
							i |= 0x2000;
						}
					}
					if (null == modelPart || class_ra.method5017(modelPart.m(), i) != 0) {
						int i_53_ = i | 0x1f01f;
						if (modelPart != null) {
							i_53_ = class_ra.method5004(i_53_, modelPart.m());
						}
						Model class64 = null;
						synchronized (aClass433_5403.aClass64Array5443) {
							for (int i_54_ = 0; i_54_ < i_51_; i_54_++) {
								synchronized (aClass433_5403.aClass243_5447) {
									class64 = Model.method751(aClass433_5403.aClass243_5447, is[i_54_], 0);
								}
								if (null == class64) {
									ModelPart modelPart_55_ = null;
									return modelPart_55_;
								}
								if (class64.version < 13) {
									class64.method755(2);
								}
								if (i_51_ > 1) {
									aClass433_5403.aClass64Array5443[i_54_] = class64;
								}
							}
							if (i_51_ > 1) {
								class64 = new Model(aClass433_5403.aClass64Array5443, i_51_);
							}
						}
						modelPart = class_ra.method5037(class64, i_53_, aClass433_5403.anInt5453 * -914670477, i_46_, i_47_);
						synchronized (aClass433_5403.aClass348_5450) {
							aClass433_5403.aClass348_5450.put(modelPart, l);
						}
					}
				}
			}
			if (null == modelPart) {
				return null;
			}
			ModelPart modelPart_56_ = modelPart.method4755((byte) 0, i, true);
			if (i_46_ != modelPart.c()) {
				modelPart_56_.p(i_46_);
			}
			if (i_47_ != modelPart.Z()) {
				modelPart_56_.Q(i_47_);
			}
			if (bool) {
				modelPart_56_.wa();
			}
			if (i_43_ == Class424.aClass424_6596.anInt6613 * -1976050083 && i_44_ > 3) {
				modelPart_56_.S(2048);
				modelPart_56_.ia(180, 0, -180);
			}
			i_44_ &= 0x3;
			if (1 == i_44_) {
				modelPart_56_.S(4096);
			} else if (2 == i_44_) {
				modelPart_56_.S(8192);
			} else if (i_44_ == 3) {
				modelPart_56_.S(12288);
			}
			if (null != aShortArray5369) {
				short[] is;
				if (class435 != null && class435.aShortArray5462 != null) {
					is = class435.aShortArray5462;
				} else {
					is = aShortArray5367;
				}
				for (int i_57_ = 0; i_57_ < aShortArray5369.length; i_57_++) {
					if (aByteArray5371 != null && i_57_ < aByteArray5371.length) {
						modelPart_56_.X(aShortArray5369[i_57_], aShortArray5423[aByteArray5371[i_57_] & 0xff]);
					} else {
						modelPart_56_.X(aShortArray5369[i_57_], is[i_57_]);
					}
				}
			}
			if (null != aShortArray5372) {
				short[] is;
				if (null != class435 && null != class435.aShortArray5461) {
					is = class435.aShortArray5461;
				} else {
					is = aShortArray5373;
				}
				for (int i_58_ = 0; i_58_ < aShortArray5372.length; i_58_++) {
					modelPart_56_.W(aShortArray5372[i_58_], is[i_58_]);
				}
			}
			if (0 != aByte5377) {
				modelPart_56_.PA(aByte5417, aByte5375, aByte5415, aByte5377 & 0xff);
			}
			if (-166422633 * anInt5406 != 128 || 668312333 * anInt5407 != 128 || 128 != -895192829 * anInt5414) {
				modelPart_56_.oa(anInt5406 * -166422633, anInt5407 * 668312333, anInt5414 * -895192829);
			}
			if (0 != anInt5379 * -1514641891 || 0 != 1536191987 * anInt5396 || 0 != anInt5411 * 2145431327) {
				modelPart_56_.ia(-1514641891 * anInt5379, anInt5396 * 1536191987, anInt5411 * 2145431327);
			}
			modelPart_56_.KA(i_48_);
			return modelPart_56_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.u(").append(')').toString());
		}
	}

	public int method5776(int i, int i_59_, byte i_60_) {
		try {
			if (null == aClass437_5435) {
				return i_59_;
			}
			Class298_Sub35 class298_sub35 = (Class298_Sub35) aClass437_5435.get(i);
			if (null == class298_sub35) {
				return i_59_;
			}
			return -774922497 * class298_sub35.anInt7394;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.r(").append(')').toString());
		}
	}

	public final LocType method5777(Interface23 interface23, int i) {
		try {
			int i_61_ = -1;
			if (anInt5420 * 1064010385 != -1) {
				i_61_ = interface23.method250(anInt5420 * 1064010385, (byte) 36);
			} else if (-1128963393 * anInt5421 != -1) {
				i_61_ = interface23.method252(anInt5421 * -1128963393, (byte) 99);
			}
			if (i_61_ < 0 || i_61_ >= anIntArray5366.length - 1 || -1 == anIntArray5366[i_61_]) {
				int i_62_ = anIntArray5366[anIntArray5366.length - 1];
				if (-1 != i_62_) {
					return aClass433_5403.list(i_62_);
				}
				return null;
			}
			return aClass433_5403.list(anIntArray5366[i_61_]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.x(").append(')').toString());
		}
	}

	void postDecode() {
		try {
			if (1532834983 * anInt5382 == -1) {
				anInt5382 = 0;
				if (null != shapes && 1 == shapes.length && shapes[0] == Class424.aClass424_6611.anInt6613 * -1976050083) {
					anInt5382 = 455422743;
				}
				for (int i_63_ = 0; i_63_ < 5; i_63_++) {
					if (null != aStringArray5394[i_63_]) {
						anInt5382 = 455422743;
						break;
					}
				}
			}
			if (512737201 * anInt5409 == -1) {
				anInt5409 = 1763780945 * (anInt5380 * -2144543407 != 0 ? 1 : 0);
			}
			if (method5779(934270378) || aBoolean5381 || null != anIntArray5366) {
				aBoolean5389 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.b(").append(')').toString());
		}
	}

	public boolean method5779(int i) {
		try {
			return anIntArray5378 != null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.s(").append(')').toString());
		}
	}

	public boolean method5780(int i) {
		try {
			return anIntArray5378 != null && anIntArray5378.length > 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.z(").append(')').toString());
		}
	}

	public int method5781(byte i) {
		try {
			if (null != anIntArray5378) {
				if (anIntArray5378.length > 1) {
					int i_64_ = (int) (Math.random() * 65535.0);
					for (int i_65_ = 0; i_65_ < anIntArray5378.length; i_65_++) {
						if (i_64_ <= anIntArray5390[i_65_]) {
							return anIntArray5378[i_65_];
						}
						i_64_ -= anIntArray5390[i_65_];
					}
				} else {
					return anIntArray5378[0];
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.y(").append(')').toString());
		}
	}

	public int[] method5782(int i) {
		try {
			return anIntArray5378;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.t(").append(')').toString());
		}
	}

	LocType() {
		sizeY = 44056569;
		anInt5380 = -2019485854;
		aBoolean5424 = true;
		anInt5382 = -455422743;
		aByte5363 = (byte) 0;
		anInt5384 = 242181565;
		aBoolean5385 = false;
		anInt5376 = 325083707;
		anInt5387 = 1675091776;
		anInt5388 = 0;
		anIntArray5378 = null;
		anIntArray5390 = null;
		anInt5391 = -83909056;
		anInt5392 = 0;
		anInt5393 = 0;
		anInt5436 = 1320066331;
		anInt5364 = -474865427;
		anInt5397 = -2064530465;
		anInt5398 = -1406097311;
		anInt5399 = 779127471;
		anInt5400 = -475870643;
		aBoolean5401 = false;
		anInt5402 = 0;
		aBoolean5440 = false;
		aBoolean5404 = false;
		aBoolean5405 = true;
		anInt5406 = -1280568448;
		anInt5407 = -319692160;
		anInt5414 = -1992239744;
		anInt5379 = 0;
		anInt5396 = 0;
		anInt5411 = 0;
		anInt5412 = 0;
		anInt5413 = 0;
		anInt5419 = 0;
		aBoolean5410 = false;
		aBoolean5416 = false;
		anInt5409 = -1763780945;
		anInt5418 = 0;
		anInt5420 = 1228374415;
		anInt5421 = 2115564225;
		anInt5422 = 349046175;
		anInt5408 = 0;
		anInt5437 = 0;
		anInt5425 = 2118857365;
		aBoolean5426 = false;
		anInt5427 = 0;
		anInt5428 = 0;
		aBoolean5395 = false;
		aBoolean5431 = true;
		aBoolean5432 = false;
		aBoolean5433 = true;
		aBoolean5434 = false;
		aBoolean5381 = false;
		anInt5438 = 1861779200;
		anInt5439 = 1687920384;
		aBoolean5389 = false;
		aBoolean5441 = false;
	}

	public boolean method5784(int i) {
		try {
			if (null == anIntArray5366) {
				return anInt5422 * 393750945 != -1 || anIntArray5429 != null;
			}
			for (int element : anIntArray5366) {
				if (element != -1) {
					LocType class432_68_ = aClass433_5403.list(element);
					if (-1 != 393750945 * class432_68_.anInt5422 || null != class432_68_.anIntArray5429) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.n(").append(')').toString());
		}
	}

	public final synchronized Class454 method5785(GraphicsToolkit class_ra, int i, int i_69_, int i_70_, Ground ground, Ground ground_71_, int i_72_, int i_73_, int i_74_, boolean bool, Class435 class435, int i_75_) {
		try {
			if (Class355.method4261(i_69_, -1998635010)) {
				i_69_ = Class424.aClass424_6596.anInt6613 * -1976050083;
			}
			long l = (1181652947 * id << 10) + (i_69_ << 3) + i_70_;
			l |= class_ra.anInt5298 * 580915349 << 29;
			if (class435 != null) {
				l |= 2595045048596347611L * class435.aLong5460 << 32;
			}
			int i_76_ = i;
			if (3 == aByte5363) {
				i_76_ |= 0x7;
			} else {
				if (0 != aByte5363 || 52797131 * anInt5413 != 0) {
					i_76_ |= 0x2;
				}
				if (945504799 * anInt5412 != 0) {
					i_76_ |= 0x1;
				}
				if (1782732613 * anInt5419 != 0) {
					i_76_ |= 0x4;
				}
			}
			if (bool) {
				i_76_ |= 0x40000;
			}
			Class454 class454;
			synchronized (aClass433_5403.aClass348_5452) {
				class454 = (Class454) aClass433_5403.aClass348_5452.get(l);
			}
			ModelPart modelPart = (ModelPart) (class454 != null ? class454.anObject5645 : null);
			Class_na class_na = null;
			do {
				if (modelPart == null || class_ra.method5017(modelPart.m(), i_76_) != 0) {
					if (null != modelPart) {
						i_76_ = class_ra.method5004(i_76_, modelPart.m());
					}
					int i_77_ = i_76_;
					if (i_69_ == Class424.aClass424_6611.anInt6613 * -1976050083 && i_70_ > 3) {
						i_77_ |= 0x5;
					}
					modelPart = method5775(class_ra, i_77_, i_69_, i_70_, class435, 1553510063);
					if (modelPart == null) {
						return null;
					}
					if (i_69_ == Class424.aClass424_6611.anInt6613 * -1976050083 && i_70_ > 3) {
						modelPart.f(2048);
					}
					if (bool) {
						class_na = modelPart.ga(null);
					}
					modelPart.KA(i_76_);
					class454 = new Class454(modelPart, class_na);
					synchronized (aClass433_5403.aClass348_5452) {
						aClass433_5403.aClass348_5452.put(class454, l);
						break;
					}
				}
				class_na = (Class_na) class454.anObject5646;
				if (bool && class_na == null) {
					class_na = (Class_na) (class454.anObject5646 = modelPart.ga(null));
				}
			} while (false);
			boolean bool_78_ = aByte5363 != 0 && (null != ground || ground_71_ != null);
			boolean bool_79_ = anInt5412 * 945504799 != 0 || anInt5413 * 52797131 != 0 || 0 != anInt5419 * 1782732613;
			if (bool_78_ || bool_79_) {
				modelPart = modelPart.method4755((byte) 0, i_76_, true);
				// if (bool_78_) { OLD METHOD BEFORE TRYING BLACK SCREEN FIX
				// try {
				// modelPart.pa(aByte5363, 1762198123 * anInt5384, ground, ground_71_, i_72_,
				// i_73_, i_74_);
				// throw new Exception();
				// } catch (Exception ex) {
				// }
				if (bool_78_) {
					try {
						modelPart.pa(((LocType) this).aByte5363, 1762198123 * ((LocType) this).anInt5384, ground, ground_71_, i_72_, i_73_, i_74_);
						throw new Exception();
					}
					catch (Exception ex) {
					}
				}
				if (bool_79_) {
					modelPart.ia(anInt5412 * 945504799, 52797131 * anInt5413, anInt5419 * 1782732613);
				}
				modelPart.KA(i);
			} else {
				modelPart = modelPart.method4755((byte) 0, i, true);
			}
			aClass433_5403.aClass454_5456.anObject5645 = modelPart;
			aClass433_5403.aClass454_5456.anObject5646 = class_na;
			return aClass433_5403.aClass454_5456;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.k(").append(')').toString());
		}
	}

	public static Interface19 method5786(Packet class298_sub53, byte i) {
		try {
			Class337 class337 = GameShell.method2789(class298_sub53.readUnsignedByte(), (byte) -73);
			if (Class337.aClass337_3627 == class337) {
				return Class238.method2201(class298_sub53, -1749563274);
			}
			if (class337 == Class337.aClass337_3625) {
				return Class237.method2195(class298_sub53, (byte) 1);
			}
			if (class337 == Class337.aClass337_3624) {
				return SceneryShadowPreference.method5651(class298_sub53, (byte) -67);
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.a(").append(')').toString());
		}
	}

	static final void method5787(ClientScript2 class403, int i) {
		try {
			if (null != GameClient.aByteArray8843) {
				class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = 1;
			} else {
				class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.ahp(").append(')').toString());
		}
	}

	public static boolean method5788(char c, short i) {
		try {
			return c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.y(").append(')').toString());
		}
	}

	static void method5789(int i) {
		try {
			JagexLibraryManager.method3751((byte) 127);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rw.aa(").append(')').toString());
		}
	}
}
