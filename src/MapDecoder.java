/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class MapDecoder {
	static int anInt2616 = 16;
	UnderlayTypeList aClass451_2617;
	int[] anIntArray2618;
	protected SceneGraph aSceneGraph_2619;
	static int anInt2620 = 1;
	public int anInt2621 = 0;
	public boolean sceneryShadows = false;
	int[] anIntArray2623;
	public boolean groundBlending;
	public boolean aBoolean2625;
	public int planesHeight;
	protected int anInt2627;
	protected int anInt2628;
	public boolean isUnderwater;
	static int anInt2630 = 512;
	public byte[][][] aByteArrayArrayArray2631;
	protected boolean aBoolean2632;
	static int anInt2633 = 64;
	static int[][] anIntArrayArray2634;
	protected TileFlags tile_flags;
	short[][][] overlays;
	protected byte[][][] aByteArrayArrayArray2637;
	static int[][] anIntArrayArray2638;
	int[] anIntArray2639;
	int[] anIntArray2640;
	int[] anIntArray2641;
	int[] anIntArray2642;
	static int anInt2643 = 0;
	static int anInt2644 = 1;
	static int anInt2645 = 2;
	static int anInt2646 = 3;
	int[] anIntArray2647;
	static int anInt2648 = 2;
	static int[][] anIntArrayArray2649;
	static int anInt2650 = 8;
	FloTypeList aClass375_2651;
	static int anInt2652 = 32;
	public int[][][] heights;
	static int anInt2654 = 128;
	static int anInt2655 = 256;
	static int[] anIntArray2656;
	static int anInt2657 = 4;
	static int[] anIntArray2658;
	static int[] anIntArray2659;
	static int[] anIntArray2660;
	static int[] anIntArray2661;
	static int[][] anIntArrayArray2662;
	static int[] anIntArray2663;
	static int[] anIntArray2664;
	static boolean[][] aBooleanArrayArray2665;
	static boolean[][] aBooleanArrayArray2666;
	static int anInt2667 = 0;
	byte[][][] rotations;
	int[] anIntArray2669;
	short[][][] underlays;
	static int[][] anIntArrayArray2671;
	static int[][] anIntArrayArray2672;
	static int[][] anIntArrayArray2673;
	static int[][] anIntArrayArray2674;
	static boolean[][] aBooleanArrayArray2675;
	boolean aBoolean2676;
	boolean aBoolean2677;
	static int[][] anIntArrayArray2678;
	static int[][] anIntArrayArray2679;
	int[] anIntArray2680;
	int[] anIntArray2681;
	int[] anIntArray2682;
	int[] anIntArray2683;
	int[] anIntArray2684;
	int anInt2685;
	int[] anIntArray2686;
	int anInt2687;
	int anInt2688;
	int anInt2689;
	static int[][] anIntArrayArray2690;
	static int[] anIntArray2691 = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	int anInt2692;
	int anInt2693;
	boolean aBoolean2694;
	static boolean[][] aBooleanArrayArray2695;
	boolean aBoolean2696;
	public boolean highDetailWater = false;
	byte[][][] shapes;
	int numFloFaces;
	int[] anIntArray2700;
	int numFluFaces;
	int[] anIntArray2702;
	int anInt2703;
	static int anInt2704;

	public final void method2211(int i, int[][] is, int i_0_) {
		try {
			int[][] is_1_ = heights[i];
			for (int i_2_ = 0; i_2_ < anInt2627 * -954368823 + 1; i_2_++) {
				for (int i_3_ = 0; i_3_ < 1 + anInt2628 * 181474463; i_3_++) {
					is_1_[i_2_][i_3_] += is[i_2_][i_3_];
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.u(" + ')');
		}
	}

	public void method2212(int i) {
		try {
			aBoolean2632 = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.a(" + ')');
		}
	}

	public final void calculateMapHeightPlanes(int y, int x, int minY, int minX, byte i_7_) {
		try {
			for (int plane = 0; plane < planesHeight * 1551623871; plane++) {
				calculateMapHeights(plane, y, x, minY, minX);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.b(" + ')');
		}
	}

	public final void calculateMapHeights(int plane, int sizeY, int sizeX, int minY, int minX) {
		try {
			for (int x = sizeX; x < minX + sizeX; x++) {
				for (int y = sizeY; y < minY + sizeY; y++) {
					if (y >= 0 && y < anInt2627 * -954368823 && x >= 0 && x < anInt2628 * 181474463) {
						heights[plane][y][x] = plane > 0 ? heights[plane - 1][y][x] - 960 : 0;
					}
				}
			}
			if (sizeY > 0 && sizeY < anInt2627 * -954368823) {
				for (int x = 1 + sizeX; x < sizeX + minX; x++) {
					if (x >= 0 && x < 181474463 * anInt2628) {
						heights[plane][sizeY][x] = heights[plane][sizeY - 1][x];
					}
				}
			}
			if (sizeX > 0 && sizeX < 181474463 * anInt2628) {
				for (int y = 1 + sizeY; y < minY + sizeY; y++) {
					if (y >= 0 && y < -954368823 * anInt2627) {
						heights[plane][y][sizeX] = heights[plane][y][sizeX - 1];
					}
				}
			}
			if (sizeY >= 0 && sizeX >= 0 && sizeY < anInt2627 * -954368823 && sizeX < anInt2628 * 181474463) {
				if (plane == 0) {
					if (sizeY > 0 && heights[plane][sizeY - 1][sizeX] != 0) {
						heights[plane][sizeY][sizeX] = heights[plane][sizeY - 1][sizeX];
					} else if (sizeX > 0 && 0 != heights[plane][sizeY][sizeX - 1]) {
						heights[plane][sizeY][sizeX] = heights[plane][sizeY][sizeX - 1];
					} else if (sizeY > 0 && sizeX > 0 && 0 != heights[plane][sizeY - 1][sizeX - 1]) {
						heights[plane][sizeY][sizeX] = heights[plane][sizeY - 1][sizeX - 1];
					}
				} else if (sizeY > 0 && heights[plane][sizeY - 1][sizeX] != heights[plane - 1][sizeY - 1][sizeX]) {
					heights[plane][sizeY][sizeX] = heights[plane][sizeY - 1][sizeX];
				} else if (sizeX > 0 && heights[plane][sizeY][sizeX - 1] != heights[plane - 1][sizeY][sizeX - 1]) {
					heights[plane][sizeY][sizeX] = heights[plane][sizeY][sizeX - 1];
				} else if (sizeY > 0 && sizeX > 0 && heights[plane][sizeY - 1][sizeX - 1] != heights[plane - 1][sizeY - 1][sizeX - 1]) {
					heights[plane][sizeY][sizeX] = heights[plane][sizeY - 1][sizeX - 1];
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.p(" + ')');
		}
	}

	public final void method2215(Packet buffer, int xOffset, int yOffset, int i_19_, int i_20_, Region[] regions, boolean osrs) {
		if (!isUnderwater) {
			for (int plane = 0; plane < 4; plane++) {
				Region region = regions[plane];
				for (int tileX = 0; tileX < 64; tileX++) {
					for (int tileY = 0; tileY < 64; tileY++) {
						int x = xOffset + tileX;
						int y = tileY + yOffset;
						if (x >= 0 && x < -954368823 * anInt2627 && y >= 0 && y < anInt2628 * 181474463) {
							region.removeClip(x, y, -1001372278);
						}
					}
				}
			}
		}
		int worldX = xOffset + i_19_;
		int worldY = i_20_ + yOffset;
		for (int plane = 0; plane < planesHeight * 1551623871; plane++) {
			for (int tileX = 0; tileX < 64; tileX++) {
				for (int tileY = 0; tileY < 64; tileY++) {
					deserialize_tile(buffer, plane, tileX + xOffset, yOffset + tileY, 0, 0, tileX + worldX, worldY + tileY, 0, false, osrs);
				}
			}
		}
	}

	public final void deserialize_region(Packet buffer, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, Region[] regions, boolean osrs) {
		try {
			int i_39_ = (i_35_ & 0x7) * 8;
			int i_40_ = 8 * (i_36_ & 0x7);
			if (!isUnderwater) {
				Region region = regions[i];
				for (int chunkX = 0; chunkX < 8; chunkX++) {
					for (int chunkY = 0; chunkY < 8; chunkY++) {
						int i_43_ = i_32_ + Class402.method4941(chunkX & 0x7, chunkY & 0x7, i_37_, -1280307862);
						int i_44_ = i_33_ + Class472.method6064(chunkX & 0x7, chunkY & 0x7, i_37_, (byte) -111);
						if (i_43_ > 0 && i_43_ < anInt2627 * -954368823 - 1 && i_44_ > 0 && i_44_ < 181474463 * anInt2628 - 1) {
							region.removeClip(i_43_, i_44_, -1032370407);
						}
					}
				}
			}
			int i_45_ = (i_35_ & ~0x7) << 3;
			int i_46_ = (i_36_ & ~0x7) << 3;
			int i_47_ = 0;
			int i_48_ = 0;
			if (1 == i_37_) {
				i_48_ = 1;
			} else if (2 == i_37_) {
				i_47_ = 1;
				i_48_ = 1;
			} else if (i_37_ == 3) {
				i_47_ = 1;
			}
			for (int plane = 0; plane < 1551623871 * planesHeight; plane++) {
				for (int x = 0; x < 64; x++) {
					for (int y = 0; y < 64; y++) {
						if (plane == i_34_ && x >= i_39_ && x <= i_39_ + 8 && y >= i_40_ && y <= i_40_ + 8) {
							int i_52_;
							int i_53_;
							if (x == 8 + i_39_ || 8 + i_40_ == y) {
								if (0 == i_37_) {
									i_52_ = i_32_ + x - i_39_;
									i_53_ = i_33_ + y - i_40_;
								} else if (1 == i_37_) {
									i_52_ = i_32_ + y - i_40_;
									i_53_ = i_33_ + 8 - (x - i_39_);
								} else if (2 == i_37_) {
									i_52_ = i_32_ + 8 - (x - i_39_);
									i_53_ = 8 + i_33_ - (y - i_40_);
								} else {
									i_52_ = 8 + i_32_ - (y - i_40_);
									i_53_ = i_33_ + x - i_39_;
								}
								deserialize_tile(buffer, i, i_52_, i_53_, 0, 0, i_45_ + x, y + i_46_, 0, true, osrs);
							} else {
								i_52_ = i_32_ + Class402.method4941(x & 0x7, y & 0x7, i_37_, -1280307862);
								i_53_ = i_33_ + Class472.method6064(x & 0x7, y & 0x7, i_37_, (byte) -33);
								deserialize_tile(buffer, i, i_52_, i_53_, i_47_, i_48_, x + i_45_, y + i_46_, i_37_, false, osrs);
							}
							if (63 == x || 63 == y) {
								int i_54_ = 1;
								if (x == 63 && y == 63) {
									i_54_ = 3;
								}
								for (int i_55_ = 0; i_55_ < i_54_; i_55_++) {
									int i_56_ = x;
									int i_57_ = y;
									if (0 == i_55_) {
										i_56_ = x == 63 ? 64 : x;
										i_57_ = 63 == y ? 64 : y;
									} else if (1 == i_55_) {
										i_56_ = 64;
									} else if (2 == i_55_) {
										i_57_ = 64;
									}
									int i_58_;
									int i_59_;
									if (i_37_ == 0) {
										i_58_ = i_32_ + i_56_ - i_39_;
										i_59_ = i_33_ + i_57_ - i_40_;
									} else if (i_37_ == 1) {
										i_58_ = i_57_ - i_40_ + i_32_;
										i_59_ = 8 + i_33_ - (i_56_ - i_39_);
									} else if (2 == i_37_) {
										i_58_ = i_32_ + 8 - (i_56_ - i_39_);
										i_59_ = i_33_ + 8 - (i_57_ - i_40_);
									} else {
										i_58_ = i_32_ + 8 - (i_57_ - i_40_);
										i_59_ = i_33_ + i_56_ - i_39_;
									}
									if (i_58_ >= 0 && i_58_ < anInt2627 * -954368823 && i_59_ >= 0 && i_59_ < 181474463 * anInt2628) {
										heights[i][i_58_][i_59_] = heights[i][i_52_ + i_47_][i_53_ + i_48_];
									}
								}
							}
						} else {
							deserialize_tile(buffer, 0, -1, -1, 0, 0, 0, 0, 0, false, osrs);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.k(" + ')');
		}
	}

	public void method2217(int i) {
		try {
			anIntArray2669 = null;
			anIntArray2639 = null;
			anIntArray2640 = null;
			anIntArray2641 = null;
			anIntArray2642 = null;
			aBoolean2632 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.f(" + ')');
		}
	}

	public void method2218(GraphicsToolkit toolkit, int[][][] height_map, Region[] regions, byte i) {
		try {
			if (!isUnderwater) {
				for (int plane = 0; plane < 4; plane++) {
					for (int x = 0; x < anInt2627 * -954368823; x++) {
						for (int y = 0; y < anInt2628 * 181474463; y++) {
							if (0 != (tile_flags.flags[plane][x][y] & 0x1)) {
								int height = plane;
								if (0 != (tile_flags.flags[1][x][y] & 0x2)) {
									height--;
								}
								if (height >= 0) {
									regions[height].addClip(x, y, (byte) 4);
								}
							}
						}
					}
				}
			}
			for (int plane = 0; plane < 1551623871 * planesHeight; plane++) {
				int i_65_ = 0;
				int i_66_ = 0;
				if (!isUnderwater) {
					if (sceneryShadows) {
						i_66_ |= 0x8;
					}
					if (highDetailWater) {
						i_65_ |= 0x2;
					}
					if (917702315 * anInt2621 != 0) {
						i_65_ |= 0x1;
						i_66_ |= 0x10;
					}
				}
				if (highDetailWater) {
					i_66_ |= 0x7;
				}
				if (!aBoolean2625) {
					i_66_ |= 0x20;
				}
				int[][] is_67_ = null != height_map && plane < height_map.length ? height_map[plane] : heights[plane];
				aSceneGraph_2619.method4056(plane, toolkit.method5040(anInt2627 * -954368823, 181474463 * anInt2628, heights[plane], is_67_, 512, i_65_, i_66_), (byte) 32);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.x(" + ')');
		}
	}

	public final void method2219(GraphicsToolkit class_ra, Ground ground, Ground ground_68_, byte i) {
		try {
			int[][] is = new int[anInt2627 * -954368823][181474463 * anInt2628];
			if (null == anIntArray2669 || anIntArray2669.length != 181474463 * anInt2628) {
				anIntArray2669 = new int[181474463 * anInt2628];
				anIntArray2639 = new int[anInt2628 * 181474463];
				anIntArray2640 = new int[181474463 * anInt2628];
				anIntArray2641 = new int[anInt2628 * 181474463];
				anIntArray2642 = new int[181474463 * anInt2628];
			}
			for (int i_69_ = 0; i_69_ < 1551623871 * planesHeight; i_69_++) {
				for (int i_70_ = 0; i_70_ < anInt2628 * 181474463; i_70_++) {
					anIntArray2669[i_70_] = 0;
					anIntArray2639[i_70_] = 0;
					anIntArray2640[i_70_] = 0;
					anIntArray2641[i_70_] = 0;
					anIntArray2642[i_70_] = 0;
				}
				for (int i_71_ = -5; i_71_ < anInt2627 * -954368823; i_71_++) {
					for (int i_72_ = 0; i_72_ < anInt2628 * 181474463; i_72_++) {
						int i_73_ = 5 + i_71_;
						if (i_73_ < anInt2627 * -954368823) {
							int i_74_ = underlays[i_69_][i_73_][i_72_] & 0xffff;
							if (i_74_ > 0) {
								FluType class443 = aClass451_2617.getUnderlay(i_74_ - 1, (byte) -1);
								anIntArray2669[i_72_] += class443.anInt5598 * 838046775;
								anIntArray2639[i_72_] += -620399085 * class443.saturation;
								anIntArray2640[i_72_] += 656695887 * class443.lightness;
								anIntArray2641[i_72_] += class443.hueMultiplier * -813159285;
								anIntArray2642[i_72_]++;
							}
						}
						int i_75_ = i_71_ - 5;
						if (i_75_ >= 0) {
							int i_76_ = underlays[i_69_][i_75_][i_72_] & 0xffff;
							if (i_76_ > 0) {
								FluType class443 = aClass451_2617.getUnderlay(i_76_ - 1, (byte) -1);
								anIntArray2669[i_72_] -= class443.anInt5598 * 838046775;
								anIntArray2639[i_72_] -= -620399085 * class443.saturation;
								anIntArray2640[i_72_] -= class443.lightness * 656695887;
								anIntArray2641[i_72_] -= class443.hueMultiplier * -813159285;
								anIntArray2642[i_72_]--;
							}
						}
					}
					if (i_71_ >= 0) {
						int i_77_ = 0;
						int i_78_ = 0;
						int i_79_ = 0;
						int i_80_ = 0;
						int i_81_ = 0;
						for (int i_82_ = -5; i_82_ < 181474463 * anInt2628; i_82_++) {
							int i_83_ = 5 + i_82_;
							if (i_83_ < 181474463 * anInt2628) {
								i_77_ += anIntArray2669[i_83_];
								i_78_ += anIntArray2639[i_83_];
								i_79_ += anIntArray2640[i_83_];
								i_80_ += anIntArray2641[i_83_];
								i_81_ += anIntArray2642[i_83_];
							}
							int i_84_ = i_82_ - 5;
							if (i_84_ >= 0) {
								i_77_ -= anIntArray2669[i_84_];
								i_78_ -= anIntArray2639[i_84_];
								i_79_ -= anIntArray2640[i_84_];
								i_80_ -= anIntArray2641[i_84_];
								i_81_ -= anIntArray2642[i_84_];
							}
							if (i_82_ >= 0 && i_80_ > 0 && i_81_ > 0) {
								is[i_71_][i_82_] = ReferenceTable.composeColor(256 * i_77_ / i_80_, i_78_ / i_81_, i_79_ / i_81_, -1708993857);
							}
						}
					}
				}
				if (groundBlending) {
					method2221(class_ra, aSceneGraph_2619.aGroundArray3517[i_69_], i_69_, is, 0 == i_69_ ? ground : null, i_69_ == 0 ? ground_68_ : null, (byte) 114);
				} else {
					method2220(class_ra, aSceneGraph_2619.aGroundArray3517[i_69_], i_69_, is, 0 == i_69_ ? ground : null, 0 == i_69_ ? ground_68_ : null, (byte) -8);
				}
				underlays[i_69_] = null;
				overlays[i_69_] = null;
				shapes[i_69_] = null;
				rotations[i_69_] = null;
			}
			if (!isUnderwater) {
				if (917702315 * anInt2621 != 0) {
					aSceneGraph_2619.method4024((byte) -114);
				}
				if (highDetailWater) {
					aSceneGraph_2619.method4049((byte) -116);
				}
			}
			for (int i_85_ = 0; i_85_ < 1551623871 * planesHeight; i_85_++) {
				aSceneGraph_2619.aGroundArray3517[i_85_].SA();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.r(" + ')');
		}
	}

	void method2220(GraphicsToolkit class_ra, Ground ground, int i, int[][] heights, Ground ground_86_, Ground ground_87_, byte i_88_) {
		try {
			for (int i_89_ = 0; i_89_ < -954368823 * anInt2627; i_89_++) {
				for (int i_90_ = 0; i_90_ < anInt2628 * 181474463; i_90_++) {
					byte shape = shapes[i][i_89_][i_90_];
					byte rotation = rotations[i][i_89_][i_90_];
					int floid = overlays[i][i_89_][i_90_] & 0xffff;
					int fluid = underlays[i][i_89_][i_90_] & 0xffff;
					OverlayType flo = floid != 0 ? aClass375_2651.getOverlayDefinition(floid - 1, -165601895) : null;
					FluType flu = fluid != 0 ? aClass451_2617.getUnderlay(fluid - 1, (byte) -1) : null;
					if (shape == 0 && null == flo) {
						shape = (byte) 12;
					}
					OverlayType class373_95_ = flo;
					if (flo != null && flo.color * -45966925 == -1 && -1 == flo.minimapColor * 1728947183) {
						class373_95_ = flo;
						flo = null;
					}
					if (flo == null && flu == null) {
						if (i_88_ == 0) {
							throw new IllegalStateException();
						}
					} else {
						numFluFaces = 989325699 * anIntArray2658[shape];
						numFloFaces = anIntArray2691[shape] * -786924081;
						int numFaces = (flo != null ? 1500080431 * numFloFaces : 0) + (flu != null ? -299537109 * numFluFaces : 0);
						int i_97_ = 0;
						anInt2688 = 0;
						anInt2703 = (flo != null ? 324071475 * flo.anInt4057 : -1) * -365069805;
						int i_98_ = null != flu ? flu.anInt5594 * 2012295231 : -1;
						int[] is_99_ = new int[numFaces];
						int[] is_100_ = new int[numFaces];
						int[] is_101_ = new int[numFaces];
						int[] is_102_ = new int[numFaces];
						int[] is_103_ = new int[numFaces];
						int[] is_104_ = new int[numFaces];
						int[] is_105_ = null != flo && 1728947183 * flo.minimapColor != -1 ? new int[numFaces] : null;
						if (flo != null) {
							for (int i_106_ = 0; i_106_ < 1500080431 * numFloFaces; i_106_++) {
								// flos
								is_99_[i_97_] = anIntArrayArray2638[shape][anInt2688 * -875169383];
								is_100_[i_97_] = anIntArrayArray2690[shape][anInt2688 * -875169383];
								is_101_[i_97_] = anIntArrayArray2634[shape][anInt2688 * -875169383];
								is_103_[i_97_] = anInt2703 * 1659854875;
								is_104_[i_97_] = -1551409901 * flo.anInt4060;
								is_102_[i_97_] = -45966925 * flo.color;
								if (is_105_ != null) {
									is_105_[i_97_] = flo.minimapColor * 1728947183;
								}
								i_97_++;
								anInt2688 += -1319613783;
							}
							if (!isUnderwater && 0 == i) {
								aSceneGraph_2619.method4019(i_89_, i_90_, 1987637503 * flo.anInt4064, 1104862312 * flo.anInt4066, 2077360047 * flo.anInt4054, flo.anInt4067 * -986621081, flo.anInt4068 * 171987805, -589660893 * flo.anInt4069, (byte) 26);
							}
						} else {
							anInt2688 += 640026119 * numFloFaces;
						}
						if (flu != null) {
							for (int i_107_ = 0; i_107_ < numFluFaces * -299537109; i_107_++) {
								is_99_[i_97_] = anIntArrayArray2638[shape][anInt2688 * -875169383];
								is_100_[i_97_] = anIntArrayArray2690[shape][anInt2688 * -875169383];
								is_101_[i_97_] = anIntArrayArray2634[shape][anInt2688 * -875169383];
								is_103_[i_97_] = i_98_;
								is_104_[i_97_] = -1106852061 * flu.anInt5597;
								is_102_[i_97_] = heights[i_89_][i_90_];
								if (null != is_105_) {
									is_105_[i_97_] = is_102_[i_97_];
								}
								i_97_++;
								anInt2688 += -1319613783;
							}
						}
						int i_108_ = anIntArray2663.length;
						int[] x_positions = new int[i_108_];
						int[] z_positions = new int[i_108_];
						int[] is_111_ = null != ground_87_ ? new int[i_108_] : null;
						int[] y_positions = ground_87_ != null || null != ground_86_ ? new int[i_108_] : null;
						for (int i_113_ = 0; i_113_ < i_108_; i_113_++) {
							int i_114_ = anIntArray2663[i_113_];
							int i_115_ = anIntArray2664[i_113_];
							if (0 == rotation) {
								x_positions[i_113_] = i_114_;
								z_positions[i_113_] = i_115_;
							} else if (rotation == 1) {
								int i_116_ = i_114_;
								x_positions[i_113_] = i_115_;
								z_positions[i_113_] = 512 - i_116_;
							} else if (rotation == 2) {
								x_positions[i_113_] = 512 - i_114_;
								z_positions[i_113_] = 512 - i_115_;
							} else if (3 == rotation) {
								int i_117_ = i_114_;
								x_positions[i_113_] = 512 - i_115_;
								z_positions[i_113_] = i_117_;
							}
							// if (floid != -1 && i_113_ < 500080431 * numFloFaces) {
							// if (y_positions != null) {
							// y_positions[i_113_] += 5;
							// }
							// if (y_positions != null) {
							// is_111_[i_113_] += 5;
							// }
							// }
							if (is_111_ != null && aBooleanArrayArray2665[shape][i_113_]) {
								int i_118_ = (i_89_ << 9) + x_positions[i_113_];
								int i_119_ = (i_90_ << 9) + z_positions[i_113_];
								is_111_[i_113_] += ground_87_.method6340(i_118_, i_119_, -1630287818) - ground.method6340(i_118_, i_119_, -1985119630);
							}
							if (y_positions != null) {
								if (null != ground_87_ && !aBooleanArrayArray2665[shape][i_113_]) {
									int i_120_ = x_positions[i_113_] + (i_89_ << 9);
									int i_121_ = (i_90_ << 9) + z_positions[i_113_];
									y_positions[i_113_] += ground.method6340(i_120_, i_121_, -2021974678) - ground_87_.method6340(i_120_, i_121_, -1548103444);
								} else if (null != ground_86_ && !aBooleanArrayArray2666[shape][i_113_]) {
									int i_122_ = x_positions[i_113_] + (i_89_ << 9);
									int i_123_ = z_positions[i_113_] + (i_90_ << 9);
									y_positions[i_113_] += ground_86_.method6340(i_122_, i_123_, -1771548697) - ground.method6340(i_122_, i_123_, -1288158581);
								}
							}
						}
						int i_124_ = ground.method6341(i_89_, i_90_, (byte) -95);
						int i_125_ = ground.method6341(1 + i_89_, i_90_, (byte) -111);
						int i_126_ = ground.method6341(1 + i_89_, i_90_ + 1, (byte) -31);
						int i_127_ = ground.method6341(i_89_, 1 + i_90_, (byte) -5);
						boolean bool = tile_flags.method2320(i_89_, i_90_, 471001785);
						if (bool && i > 1 || !bool && i > 0) {
							boolean bool_128_ = true;
							if (flu != null && !flu.aBoolean5596) {
								bool_128_ = false;
							} else if (0 == fluid && 0 != shape) {
								bool_128_ = false;
							} else if (floid > 0 && class373_95_ != null && !class373_95_.aBoolean4062) {
								bool_128_ = false;
							}
							if (bool_128_ && i_125_ == i_124_ && i_124_ == i_126_ && i_127_ == i_124_) {
								aByteArrayArrayArray2637[i][i_89_][i_90_] |= 0x4;
							}
						}
						Class78 class78 = new Class78();
						if (isUnderwater) {
							class78.anInt726 = aSceneGraph_2619.method4015(i_89_, i_90_, (byte) 76) * 614121861;
							class78.anInt725 = aSceneGraph_2619.method4014(i_89_, i_90_, (byte) 47) * -885436027;
							class78.anInt727 = aSceneGraph_2619.method4016(i_89_, i_90_, (byte) -105) * 399458545;
							class78.anInt729 = aSceneGraph_2619.method4017(i_89_, i_90_, (byte) 90) * 1507836083;
							class78.anInt730 = aSceneGraph_2619.method4060(i_89_, i_90_, -374977085) * -1927451111;
							class78.anInt732 = aSceneGraph_2619.method4018(i_89_, i_90_, -1965414520) * -875460563;
						}
						ground.method6336(i_89_, i_90_, x_positions, is_111_, z_positions, y_positions, is_99_, is_100_, is_101_, is_102_, is_105_, is_103_, is_104_, class78, false);
						aSceneGraph_2619.method4013(i, i_89_, i_90_, -239048224);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kb.q(").append(')').toString());
		}
	}

	void method2221(GraphicsToolkit class_ra, Ground ground, int i, int[][] is, Ground ground_129_, Ground ground_130_, byte i_131_) {
		try {
			byte[][] _shapes = shapes[i];
			byte[][] is_133_ = rotations[i];
			short[][] _underlays = underlays[i];
			short[][] _overlays = overlays[i];
			boolean[] bools = new boolean[4];
			for (int i_136_ = 0; i_136_ < -954368823 * anInt2627; i_136_++) {
				int i_137_ = i_136_ < anInt2627 * -954368823 - 1 ? 1 + i_136_ : i_136_;
				for (int i_138_ = 0; i_138_ < anInt2628 * 181474463; i_138_++) {
					int i_139_ = i_138_ < 181474463 * anInt2628 - 1 ? i_138_ + 1 : i_138_;
					anInt2687 = _shapes[i_136_][i_138_] * 1375153633;
					anInt2688 = -1319613783 * is_133_[i_136_][i_138_];
					int i_140_ = _overlays[i_136_][i_138_] & 0xffff;
					int i_141_ = _underlays[i_136_][i_138_] & 0xffff;
					if (i_140_ == 0 && 0 == i_141_) {
						if (i_131_ <= -1) {
							return;
						}
					} else {
						OverlayType class373 = 0 != i_140_ ? aClass375_2651.getOverlayDefinition(i_140_ - 1, -165601895) : null;
						FluType class443 = i_141_ != 0 ? aClass451_2617.getUnderlay(i_141_ - 1, (byte) -1) : null;
						if (-1377184223 * anInt2687 == 0 && class373 == null) {
							anInt2687 = -678025588;
						}
						aBoolean2694 = false;
						aBoolean2676 = false;
						boolean[] bools_142_ = bools;
						boolean[] bools_143_ = bools;
						boolean[] bools_144_ = bools;
						bools[3] = false;
						bools_144_[2] = false;
						bools_143_[1] = false;
						bools_142_[0] = false;
						OverlayType class373_145_ = class373;
						if (null != class373) {
							if (class373.color * -45966925 == -1 && class373.minimapColor * 1728947183 == -1) {
								class373_145_ = class373;
								class373 = null;
							} else if (null != class443 && -1377184223 * anInt2687 != 0) {
								aBoolean2676 = class373.aBoolean4063;
							}
						}
						anInt2688 = method2222(i_141_, i_136_, i_138_, i_137_, i_139_, ground, _underlays, -1666801922) * -1319613783;
						for (int i_146_ = 0; i_146_ < 13; i_146_++) {
							anIntArray2647[i_146_] = -1;
							anIntArray2686[i_146_] = 1;
						}
						method2223(class_ra, class373, class443, i_136_, i_138_, _shapes, is_133_, _overlays, bools, (short) 803);
						aBoolean2696 = !aBoolean2676 && !bools[0] && !bools[2] && !bools[1] && !bools[3];
						method2224(class373, class443, (byte) 4);
						int i_147_ = -299537109 * numFluFaces + 1500080431 * numFloFaces;
						if (i_147_ <= 0) {
							aSceneGraph_2619.method4013(i, i_136_, i_138_, 1960447518);
						} else {
							if (bools[0]) {
								i_147_++;
							}
							if (bools[2]) {
								i_147_++;
							}
							if (bools[1]) {
								i_147_++;
							}
							if (bools[3]) {
								i_147_++;
							}
							anInt2689 = 0;
							anInt2685 = 0;
							int i_148_ = 3 * i_147_;
							int[] is_149_ = aBoolean2677 ? new int[i_148_] : null;
							int[] is_150_ = new int[i_148_];
							int[] is_151_ = new int[i_148_];
							int[] is_152_ = new int[i_148_];
							int[] is_153_ = new int[i_148_];
							int[] is_154_ = new int[i_148_];
							int[] is_155_ = ground_130_ != null ? new int[i_148_] : null;
							int[] is_156_ = null != ground_130_ || ground_129_ != null ? new int[i_148_] : null;
							method2225(class_ra, i, i_136_, i_138_, class373, bools, is_149_, is_150_, is_151_, is_152_, is_153_, is_154_, is_155_, is_156_, ground, ground_130_, ground_129_, (byte) -84);
							int i_157_ = _underlays[i_136_][i_139_] & 0xffff;
							int i_158_ = _underlays[i_137_][i_139_] & 0xffff;
							int i_159_ = _underlays[i_137_][i_138_] & 0xffff;
							method2226(class_ra, i, i_136_, i_138_, i_137_, i_139_, class443, i_141_, i_157_, i_158_, i_159_, bools, is_149_, is_150_, is_151_, is_152_, is_153_, is_154_, is_155_, is_156_, is, ground, ground_130_, ground_129_, (short) 9391);
							method2229(ground, class443, class373_145_, i, i_136_, i_138_, i_137_, i_139_, i_141_, i_140_, 1222931725);
							Class78 class78 = new Class78();
							if (isUnderwater) {
								class78.anInt726 = aSceneGraph_2619.method4015(i_136_, i_138_, (byte) 60) * 614121861;
								class78.anInt725 = aSceneGraph_2619.method4014(i_136_, i_138_, (byte) 89) * -885436027;
								class78.anInt727 = aSceneGraph_2619.method4016(i_136_, i_138_, (byte) -43) * 399458545;
								class78.anInt729 = aSceneGraph_2619.method4017(i_136_, i_138_, (byte) 2) * 1507836083;
								class78.anInt730 = aSceneGraph_2619.method4060(i_136_, i_138_, -37055227) * -1927451111;
								class78.anInt732 = aSceneGraph_2619.method4018(i_136_, i_138_, -1965414520) * -875460563;
							}
							ground.method6335(i_136_, i_138_, is_150_, is_155_, is_151_, is_156_, is_152_, is_149_, is_153_, is_154_, class78, aBoolean2694);
							aSceneGraph_2619.method4013(i, i_136_, i_138_, 200248008);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.n(" + ')');
		}
	}

	int method2222(int i, int i_160_, int i_161_, int i_162_, int i_163_, Ground ground, short[][] is, int i_164_) {
		try {
			if ((0 == anInt2687 * -1377184223 || 12 == anInt2687 * -1377184223) && i_160_ > 0 && i_161_ > 0 && i_160_ < anInt2627 * -954368823 && i_161_ < anInt2628 * 181474463) {
				int i_165_ = 0;
				int i_166_ = 0;
				int i_167_ = 0;
				int i_168_ = 0;
				i_165_ = i_165_ + (i == is[i_160_ - 1][i_161_ - 1] ? 1 : -1);
				i_166_ = i_166_ + (is[i_162_][i_161_ - 1] == i ? 1 : -1);
				i_167_ = i_167_ + (i == is[i_162_][i_163_] ? 1 : -1);
				i_168_ = i_168_ + (i == is[i_160_ - 1][i_163_] ? 1 : -1);
				if (is[i_160_][i_161_ - 1] == i) {
					i_165_++;
					i_166_++;
				} else {
					i_165_--;
					i_166_--;
				}
				if (i == is[i_162_][i_161_]) {
					i_166_++;
					i_167_++;
				} else {
					i_166_--;
					i_167_--;
				}
				if (i == is[i_160_][i_163_]) {
					i_167_++;
					i_168_++;
				} else {
					i_167_--;
					i_168_--;
				}
				if (is[i_160_ - 1][i_161_] == i) {
					i_168_++;
					i_165_++;
				} else {
					i_168_--;
					i_165_--;
				}
				int i_169_ = i_165_ - i_167_;
				if (i_169_ < 0) {
					i_169_ = -i_169_;
				}
				int i_170_ = i_166_ - i_168_;
				if (i_170_ < 0) {
					i_170_ = -i_170_;
				}
				if (i_169_ == i_170_) {
					i_169_ = ground.method6341(i_160_, i_161_, (byte) -74) - ground.method6341(i_162_, i_163_, (byte) -114);
					if (i_169_ < 0) {
						i_169_ = -i_169_;
					}
					i_170_ = ground.method6341(i_162_, i_161_, (byte) -76) - ground.method6341(i_160_, i_163_, (byte) -82);
					if (i_170_ < 0) {
						i_170_ = -i_170_;
					}
				}
				return i_169_ < i_170_ ? 1 : 0;
			}
			return -875169383 * anInt2688;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.s(" + ')');
		}
	}

	void method2223(GraphicsToolkit class_ra, OverlayType class373, FluType class443, int i, int i_171_, byte[][] is, byte[][] is_172_, short[][] is_173_, boolean[] bools, short i_174_) {
		try {
			boolean[] bools_175_ = class373 != null && class373.aBoolean4063 ? aBooleanArrayArray2675[-1377184223 * anInt2687] : aBooleanArrayArray2695[anInt2687 * -1377184223];
			method2227(class_ra, class373, class443, i, i_171_, -954368823 * anInt2627, 181474463 * anInt2628, is_173_, is, is_172_, bools, -2064335777);
			aBoolean2677 = null != class373 && -45966925 * class373.color != 1728947183 * class373.minimapColor;
			if (!aBoolean2677) {
				for (int i_176_ = 0; i_176_ < 8; i_176_++) {
					if (anIntArray2647[i_176_] >= 0 && anIntArray2682[i_176_] != anIntArray2681[i_176_]) {
						aBoolean2677 = true;
						break;
					}
				}
			}
			if (!bools_175_[1 + anInt2688 * -875169383 & 0x3]) {
				boolean[] bools_177_ = bools;
				int i_178_ = 1;
				bools_177_[i_178_] = bools_177_[i_178_] | (anIntArray2686[2] & anIntArray2686[4]) == 0;
			}
			if (!bools_175_[3 + anInt2688 * -875169383 & 0x3]) {
				boolean[] bools_179_ = bools;
				int i_180_ = 3;
				bools_179_[i_180_] = bools_179_[i_180_] | (anIntArray2686[6] & anIntArray2686[0]) == 0;
			}
			if (!bools_175_[0 + -875169383 * anInt2688 & 0x3]) {
				boolean[] bools_181_ = bools;
				int i_182_ = 0;
				bools_181_[i_182_] = bools_181_[i_182_] | 0 == (anIntArray2686[0] & anIntArray2686[2]);
			}
			if (!bools_175_[anInt2688 * -875169383 + 2 & 0x3]) {
				boolean[] bools_183_ = bools;
				int i_184_ = 2;
				bools_183_[i_184_] = bools_183_[i_184_] | (anIntArray2686[4] & anIntArray2686[6]) == 0;
			}
			if (!aBoolean2676 && (anInt2687 * -1377184223 == 0 || -1377184223 * anInt2687 == 12)) {
				if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
					boolean[] bools_185_ = bools;
					bools[3] = false;
					bools_185_[0] = false;
					anInt2687 = 1375153633 * (0 == anInt2687 * -1377184223 ? 13 : 14);
					anInt2688 = 0;
				} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
					boolean[] bools_186_ = bools;
					bools[1] = false;
					bools_186_[0] = false;
					anInt2687 = 1375153633 * (0 == -1377184223 * anInt2687 ? 13 : 14);
					anInt2688 = 336125947;
				} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
					boolean[] bools_187_ = bools;
					bools[2] = false;
					bools_187_[1] = false;
					anInt2687 = (0 == anInt2687 * -1377184223 ? 13 : 14) * 1375153633;
					anInt2688 = 1655739730;
				} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
					boolean[] bools_188_ = bools;
					bools[3] = false;
					bools_188_[2] = false;
					anInt2687 = (-1377184223 * anInt2687 == 0 ? 13 : 14) * 1375153633;
					anInt2688 = -1319613783;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.z(" + ')');
		}
	}

	void method2224(OverlayType class373, FluType class443, byte i) {
		try {
			if (aBoolean2696) {
				anIntArray2700 = anIntArrayArray2638[-1377184223 * anInt2687];
				anIntArray2623 = anIntArrayArray2690[-1377184223 * anInt2687];
				anIntArray2702 = anIntArrayArray2634[anInt2687 * -1377184223];
				numFloFaces = (class373 != null ? anIntArray2691[anInt2687 * -1377184223] : 0) * -786924081;
				numFluFaces = 989325699 * (class443 != null ? anIntArray2658[anInt2687 * -1377184223] : 0);
			} else if (aBoolean2676) {
				anIntArray2700 = anIntArrayArray2649[anInt2687 * -1377184223];
				anIntArray2623 = anIntArrayArray2678[-1377184223 * anInt2687];
				anIntArray2702 = anIntArrayArray2679[anInt2687 * -1377184223];
				numFloFaces = -786924081 * (class373 != null ? anIntArray2661[anInt2687 * -1377184223] : 0);
				numFluFaces = (null != class443 ? anIntArray2656[-1377184223 * anInt2687] : 0) * 989325699;
				anIntArray2618 = anIntArrayArray2662[anInt2687 * -1377184223];
			} else {
				anIntArray2700 = anIntArrayArray2672[anInt2687 * -1377184223];
				anIntArray2623 = anIntArrayArray2673[anInt2687 * -1377184223];
				anIntArray2702 = anIntArrayArray2674[-1377184223 * anInt2687];
				numFloFaces = -786924081 * (class373 != null ? anIntArray2659[-1377184223 * anInt2687] : 0);
				numFluFaces = 989325699 * (class443 != null ? anIntArray2660[anInt2687 * -1377184223] : 0);
				anIntArray2618 = anIntArrayArray2671[-1377184223 * anInt2687];
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.y(" + ')');
		}
	}

	void method2225(GraphicsToolkit class_ra, int i, int i_189_, int i_190_, OverlayType class373, boolean[] bools, int[] is, int[] is_191_, int[] is_192_, int[] is_193_, int[] is_194_, int[] is_195_, int[] is_196_, int[] is_197_, Ground ground, Ground ground_198_, Ground ground_199_, byte i_200_) {
		try {
			anInt2693 = -1010428415;
			anInt2703 = 365069805;
			anInt2692 = 1240828160;
			if (class373 != null) {
				anInt2693 = class373.color * 269878349;
				anInt2703 = -610197047 * class373.anInt4057;
				anInt2692 = class373.anInt4060 * -1360069077;
				int i_201_ = Class82_Sub9.method901(class_ra, class373, (byte) 16);
				for (int i_202_ = 0; i_202_ < numFloFaces * 1500080431; i_202_++) {
					boolean bool = false;
					int i_203_;
					if (bools[0 - anInt2688 * -875169383 & 0x3] && anIntArray2618[0] == -740850409 * anInt2689) {
						anIntArray2680[0] = anIntArray2700[anInt2689 * -740850409];
						anIntArray2680[1] = 1;
						anIntArray2680[2] = anIntArray2702[anInt2689 * -740850409];
						anIntArray2680[3] = 1;
						anIntArray2680[4] = anIntArray2623[-740850409 * anInt2689];
						anIntArray2680[5] = anIntArray2702[-740850409 * anInt2689];
						i_203_ = 6;
					} else if (bools[2 - -875169383 * anInt2688 & 0x3] && -740850409 * anInt2689 == anIntArray2618[2]) {
						anIntArray2680[0] = anIntArray2700[anInt2689 * -740850409];
						anIntArray2680[1] = 5;
						anIntArray2680[2] = anIntArray2702[anInt2689 * -740850409];
						anIntArray2680[3] = 5;
						anIntArray2680[4] = anIntArray2623[anInt2689 * -740850409];
						anIntArray2680[5] = anIntArray2702[anInt2689 * -740850409];
						i_203_ = 6;
					} else if (bools[1 - -875169383 * anInt2688 & 0x3] && anIntArray2618[1] == anInt2689 * -740850409) {
						anIntArray2680[0] = anIntArray2700[anInt2689 * -740850409];
						anIntArray2680[1] = 3;
						anIntArray2680[2] = anIntArray2702[anInt2689 * -740850409];
						anIntArray2680[3] = 3;
						anIntArray2680[4] = anIntArray2623[-740850409 * anInt2689];
						anIntArray2680[5] = anIntArray2702[-740850409 * anInt2689];
						i_203_ = 6;
					} else if (bools[3 - anInt2688 * -875169383 & 0x3] && -740850409 * anInt2689 == anIntArray2618[3]) {
						anIntArray2680[0] = anIntArray2700[anInt2689 * -740850409];
						anIntArray2680[1] = 7;
						anIntArray2680[2] = anIntArray2702[-740850409 * anInt2689];
						anIntArray2680[3] = 7;
						anIntArray2680[4] = anIntArray2623[anInt2689 * -740850409];
						anIntArray2680[5] = anIntArray2702[-740850409 * anInt2689];
						i_203_ = 6;
					} else {
						anIntArray2680[0] = anIntArray2700[-740850409 * anInt2689];
						anIntArray2680[1] = anIntArray2623[-740850409 * anInt2689];
						anIntArray2680[2] = anIntArray2702[-740850409 * anInt2689];
						i_203_ = 3;
					}
					for (int i_204_ = 0; i_204_ < i_203_; i_204_++) {
						int i_205_ = anIntArray2680[i_204_];
						int i_206_ = i_205_ - -1750338766 * anInt2688 & 0x7;
						int i_207_ = anIntArray2663[i_205_];
						int i_208_ = anIntArray2664[i_205_];
						int i_209_;
						int i_210_;
						if (1 == anInt2688 * -875169383) {
							i_209_ = i_208_;
							i_210_ = 512 - i_207_;
						} else if (anInt2688 * -875169383 == 2) {
							i_209_ = 512 - i_207_;
							i_210_ = 512 - i_208_;
						} else if (3 == anInt2688 * -875169383) {
							i_209_ = 512 - i_208_;
							i_210_ = i_207_;
						} else {
							i_209_ = i_207_;
							i_210_ = i_208_;
						}
						is_191_[-1679056507 * anInt2685] = i_209_;
						is_192_[-1679056507 * anInt2685] = i_210_;
						if (is_196_ != null && aBooleanArrayArray2665[anInt2687 * -1377184223][i_205_]) {
							int i_211_ = (i_189_ << 9) + i_209_;
							int i_212_ = (i_190_ << 9) + i_210_;
							is_196_[anInt2685 * -1679056507] = ground_198_.method6340(i_211_, i_212_, -2146471706) - ground.method6340(i_211_, i_212_, -1684141409);
						}
						if (null != is_197_) {
							if (ground_198_ != null && !aBooleanArrayArray2665[anInt2687 * -1377184223][i_205_]) {
								int i_213_ = (i_189_ << 9) + i_209_;
								int i_214_ = (i_190_ << 9) + i_210_;
								is_197_[-1679056507 * anInt2685] = ground.method6340(i_213_, i_214_, -1369260401) - ground_198_.method6340(i_213_, i_214_, -1894367139);
							} else if (ground_199_ != null && !aBooleanArrayArray2666[-1377184223 * anInt2687][i_205_]) {
								int i_215_ = (i_189_ << 9) + i_209_;
								int i_216_ = i_210_ + (i_190_ << 9);
								is_197_[-1679056507 * anInt2685] = ground_199_.method6340(i_215_, i_216_, -1817561670) - ground.method6340(i_215_, i_216_, -1384792854);
							}
						}
						if (i_205_ < 8 && anIntArray2647[i_206_] > 2109091647 * class373.anInt4055) {
							if (is != null) {
								is[anInt2685 * -1679056507] = anIntArray2682[i_206_];
							}
							is_195_[-1679056507 * anInt2685] = anIntArray2684[i_206_];
							is_194_[-1679056507 * anInt2685] = anIntArray2683[i_206_];
							is_193_[anInt2685 * -1679056507] = anIntArray2681[i_206_];
						} else {
							if (null != is) {
								is[anInt2685 * -1679056507] = i_201_;
							}
							is_194_[anInt2685 * -1679056507] = 324071475 * class373.anInt4057;
							is_195_[-1679056507 * anInt2685] = -1551409901 * class373.anInt4060;
							is_193_[anInt2685 * -1679056507] = 1373771263 * anInt2693;
						}
						anInt2685 += 107294541;
					}
					anInt2689 += 844235431;
				}
				if (!isUnderwater && 0 == i) {
					aSceneGraph_2619.method4019(i_189_, i_190_, 1987637503 * class373.anInt4064, 1104862312 * class373.anInt4066, class373.anInt4054 * 2077360047, -986621081 * class373.anInt4067, 171987805 * class373.anInt4068, -589660893 * class373.anInt4069, (byte) -43);
				}
				if (anInt2687 * -1377184223 != 12 && -45966925 * class373.color != -1 && class373.aBoolean4061) {
					aBoolean2694 = true;
				}
			} else if (aBoolean2696) {
				anInt2689 += 844235431 * anIntArray2691[anInt2687 * -1377184223];
			} else if (aBoolean2676) {
				anInt2689 += 844235431 * anIntArray2661[anInt2687 * -1377184223];
			} else {
				anInt2689 += 844235431 * anIntArray2659[anInt2687 * -1377184223];
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.t(" + ')');
		}
	}

	void method2226(GraphicsToolkit class_ra, int i, int i_217_, int i_218_, int i_219_, int i_220_, FluType class443, int i_221_, int i_222_, int i_223_, int i_224_, boolean[] bools, int[] is, int[] is_225_, int[] is_226_, int[] is_227_, int[] is_228_, int[] is_229_, int[] is_230_, int[] is_231_, int[][] is_232_, Ground ground, Ground ground_233_, Ground ground_234_, short i_235_) {
		try {
			if (null != class443) {
				if (0 == i_222_) {
					i_222_ = i_221_;
				}
				if (i_223_ == 0) {
					i_223_ = i_221_;
				}
				if (i_224_ == 0) {
					i_224_ = i_221_;
				}
				FluType class443_236_ = aClass451_2617.getUnderlay(i_221_ - 1, (byte) -1);
				FluType class443_237_ = aClass451_2617.getUnderlay(i_222_ - 1, (byte) -1);
				FluType class443_238_ = aClass451_2617.getUnderlay(i_223_ - 1, (byte) -1);
				FluType class443_239_ = aClass451_2617.getUnderlay(i_224_ - 1, (byte) -1);
				for (int i_240_ = 0; i_240_ < numFluFaces * -299537109; i_240_++) {
					boolean bool = false;
					int i_241_;
					if (bools[0 - -875169383 * anInt2688 & 0x3] && -740850409 * anInt2689 == anIntArray2618[0]) {
						anIntArray2680[0] = anIntArray2700[-740850409 * anInt2689];
						anIntArray2680[1] = 1;
						anIntArray2680[2] = anIntArray2702[-740850409 * anInt2689];
						anIntArray2680[3] = 1;
						anIntArray2680[4] = anIntArray2623[anInt2689 * -740850409];
						anIntArray2680[5] = anIntArray2702[-740850409 * anInt2689];
						i_241_ = 6;
					} else if (bools[2 - anInt2688 * -875169383 & 0x3] && -740850409 * anInt2689 == anIntArray2618[2]) {
						anIntArray2680[0] = anIntArray2700[-740850409 * anInt2689];
						anIntArray2680[1] = 5;
						anIntArray2680[2] = anIntArray2702[anInt2689 * -740850409];
						anIntArray2680[3] = 5;
						anIntArray2680[4] = anIntArray2623[anInt2689 * -740850409];
						anIntArray2680[5] = anIntArray2702[anInt2689 * -740850409];
						i_241_ = 6;
					} else if (bools[1 - -875169383 * anInt2688 & 0x3] && -740850409 * anInt2689 == anIntArray2618[1]) {
						anIntArray2680[0] = anIntArray2700[-740850409 * anInt2689];
						anIntArray2680[1] = 3;
						anIntArray2680[2] = anIntArray2702[-740850409 * anInt2689];
						anIntArray2680[3] = 3;
						anIntArray2680[4] = anIntArray2623[anInt2689 * -740850409];
						anIntArray2680[5] = anIntArray2702[anInt2689 * -740850409];
						i_241_ = 6;
					} else if (bools[3 - anInt2688 * -875169383 & 0x3] && anIntArray2618[3] == anInt2689 * -740850409) {
						anIntArray2680[0] = anIntArray2700[anInt2689 * -740850409];
						anIntArray2680[1] = 7;
						anIntArray2680[2] = anIntArray2702[anInt2689 * -740850409];
						anIntArray2680[3] = 7;
						anIntArray2680[4] = anIntArray2623[anInt2689 * -740850409];
						anIntArray2680[5] = anIntArray2702[-740850409 * anInt2689];
						i_241_ = 6;
					} else {
						anIntArray2680[0] = anIntArray2700[-740850409 * anInt2689];
						anIntArray2680[1] = anIntArray2623[anInt2689 * -740850409];
						anIntArray2680[2] = anIntArray2702[-740850409 * anInt2689];
						i_241_ = 3;
					}
					for (int i_242_ = 0; i_242_ < i_241_; i_242_++) {
						int i_243_ = anIntArray2680[i_242_];
						int i_244_ = i_243_ - anInt2688 * -1750338766 & 0x7;
						int i_245_ = anIntArray2663[i_243_];
						int i_246_ = anIntArray2664[i_243_];
						int i_247_;
						int i_248_;
						if (-875169383 * anInt2688 == 1) {
							i_247_ = i_246_;
							i_248_ = 512 - i_245_;
						} else if (2 == anInt2688 * -875169383) {
							i_247_ = 512 - i_245_;
							i_248_ = 512 - i_246_;
						} else if (3 == anInt2688 * -875169383) {
							i_247_ = 512 - i_246_;
							i_248_ = i_245_;
						} else {
							i_247_ = i_245_;
							i_248_ = i_246_;
						}
						is_225_[anInt2685 * -1679056507] = i_247_;
						is_226_[-1679056507 * anInt2685] = i_248_;
						if (null != is_230_ && aBooleanArrayArray2665[anInt2687 * -1377184223][i_243_]) {
							int i_249_ = (i_217_ << 9) + i_247_;
							int i_250_ = (i_218_ << 9) + i_248_;
							is_230_[anInt2685 * -1679056507] = ground_233_.method6340(i_249_, i_250_, -1800590512) - ground.method6340(i_249_, i_250_, -1832971430);
						}
						if (is_231_ != null) {
							if (null != ground_233_ && !aBooleanArrayArray2665[anInt2687 * -1377184223][i_243_]) {
								int i_251_ = (i_217_ << 9) + i_247_;
								int i_252_ = (i_218_ << 9) + i_248_;
								is_231_[-1679056507 * anInt2685] = ground.method6340(i_251_, i_252_, -1905933409) - ground_233_.method6340(i_251_, i_252_, -2129052823);
							} else if (null != ground_234_ && !aBooleanArrayArray2666[-1377184223 * anInt2687][i_243_]) {
								int i_253_ = i_247_ + (i_217_ << 9);
								int i_254_ = i_248_ + (i_218_ << 9);
								is_231_[anInt2685 * -1679056507] = ground_234_.method6340(i_253_, i_254_, -1961049561) - ground.method6340(i_253_, i_254_, -1669884522);
							}
						}
						if (i_243_ < 8 && anIntArray2647[i_244_] >= 0) {
							if (null != is) {
								is[-1679056507 * anInt2685] = anIntArray2682[i_244_];
							}
							is_229_[anInt2685 * -1679056507] = anIntArray2684[i_244_];
							is_228_[-1679056507 * anInt2685] = anIntArray2683[i_244_];
							is_227_[anInt2685 * -1679056507] = anIntArray2681[i_244_];
						} else {
							if (aBoolean2676 && aBooleanArrayArray2665[anInt2687 * -1377184223][i_243_]) {
								is_228_[-1679056507 * anInt2685] = 1659854875 * anInt2703;
								is_229_[anInt2685 * -1679056507] = -2108878663 * anInt2692;
								is_227_[anInt2685 * -1679056507] = anInt2693 * 1373771263;
							} else if (0 == i_247_ && i_248_ == 0) {
								is_227_[anInt2685 * -1679056507] = is_232_[i_217_][i_218_];
								is_228_[-1679056507 * anInt2685] = class443_236_.anInt5594 * 2012295231;
								is_229_[-1679056507 * anInt2685] = class443_236_.anInt5597 * -1106852061;
							} else if (0 == i_247_ && i_248_ == 512) {
								is_227_[anInt2685 * -1679056507] = is_232_[i_217_][i_220_];
								is_228_[anInt2685 * -1679056507] = 2012295231 * class443_237_.anInt5594;
								is_229_[anInt2685 * -1679056507] = -1106852061 * class443_237_.anInt5597;
							} else if (i_247_ == 512 && 512 == i_248_) {
								is_227_[anInt2685 * -1679056507] = is_232_[i_219_][i_220_];
								is_228_[anInt2685 * -1679056507] = class443_238_.anInt5594 * 2012295231;
								is_229_[-1679056507 * anInt2685] = class443_238_.anInt5597 * -1106852061;
							} else if (512 == i_247_ && 0 == i_248_) {
								is_227_[-1679056507 * anInt2685] = is_232_[i_219_][i_218_];
								is_228_[-1679056507 * anInt2685] = 2012295231 * class443_239_.anInt5594;
								is_229_[anInt2685 * -1679056507] = class443_239_.anInt5597 * -1106852061;
							} else {
								if (i_247_ < 256) {
									if (i_248_ < 256) {
										is_228_[-1679056507 * anInt2685] = class443_236_.anInt5594 * 2012295231;
										is_229_[-1679056507 * anInt2685] = class443_236_.anInt5597 * -1106852061;
									} else {
										is_228_[anInt2685 * -1679056507] = 2012295231 * class443_237_.anInt5594;
										is_229_[anInt2685 * -1679056507] = class443_237_.anInt5597 * -1106852061;
									}
								} else if (i_248_ < 256) {
									is_228_[anInt2685 * -1679056507] = class443_239_.anInt5594 * 2012295231;
									is_229_[-1679056507 * anInt2685] = class443_239_.anInt5597 * -1106852061;
								} else {
									is_228_[anInt2685 * -1679056507] = class443_238_.anInt5594 * 2012295231;
									is_229_[-1679056507 * anInt2685] = class443_238_.anInt5597 * -1106852061;
								}
								int i_255_ = Class98_Sub4.method1069(is_232_[i_217_][i_218_], is_232_[i_219_][i_218_], i_247_ << 7 >> 9, -1452826652);
								int i_256_ = Class98_Sub4.method1069(is_232_[i_217_][i_220_], is_232_[i_219_][i_220_], i_247_ << 7 >> 9, -1452826652);
								is_227_[-1679056507 * anInt2685] = Class98_Sub4.method1069(i_255_, i_256_, i_248_ << 7 >> 9, -1452826652);
							}
							if (is != null) {
								is[-1679056507 * anInt2685] = is_227_[-1679056507 * anInt2685];
							}
						}
						anInt2685 += 107294541;
					}
					anInt2689 += 844235431;
				}
				if (-1377184223 * anInt2687 != 0 && class443.aBoolean5599) {
					aBoolean2694 = true;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.h(" + ')');
		}
	}

	final void method2227(GraphicsToolkit class_ra, OverlayType class373, FluType class443, int i, int i_257_, int i_258_, int i_259_, short[][] is, byte[][] is_260_, byte[][] is_261_, boolean[] bools, int i_262_) {
		try {
			boolean[] bools_263_ = null != class373 && class373.aBoolean4063 ? aBooleanArrayArray2675[-1377184223 * anInt2687] : aBooleanArrayArray2695[-1377184223 * anInt2687];
			if (i_257_ > 0) {
				if (i > 0) {
					int i_264_ = is[i - 1][i_257_ - 1] & 0xffff;
					if (i_264_ > 0) {
						OverlayType class373_265_ = aClass375_2651.getOverlayDefinition(i_264_ - 1, -165601895);
						if (-1 != -45966925 * class373_265_.color && class373_265_.aBoolean4063) {
							byte i_266_ = is_260_[i - 1][i_257_ - 1];
							int i_267_ = 2 * is_261_[i - 1][i_257_ - 1] + 4 & 0x7;
							int i_268_ = Class82_Sub9.method901(class_ra, class373_265_, (byte) 16);
							if (aBooleanArrayArray2665[i_266_][i_267_]) {
								anIntArray2681[0] = class373_265_.color * -45966925;
								anIntArray2682[0] = i_268_;
								anIntArray2683[0] = class373_265_.anInt4057 * 324071475;
								anIntArray2684[0] = -1551409901 * class373_265_.anInt4060;
								anIntArray2647[0] = 2109091647 * class373_265_.anInt4055;
								anIntArray2686[0] = 256;
							}
						}
					}
				}
				if (i < i_258_ - 1) {
					int i_269_ = is[1 + i][i_257_ - 1] & 0xffff;
					if (i_269_ > 0) {
						OverlayType class373_270_ = aClass375_2651.getOverlayDefinition(i_269_ - 1, -165601895);
						if (-1 != class373_270_.color * -45966925 && class373_270_.aBoolean4063) {
							byte i_271_ = is_260_[1 + i][i_257_ - 1];
							int i_272_ = 6 + is_261_[i + 1][i_257_ - 1] * 2 & 0x7;
							int i_273_ = Class82_Sub9.method901(class_ra, class373_270_, (byte) 16);
							if (aBooleanArrayArray2665[i_271_][i_272_]) {
								anIntArray2681[2] = class373_270_.color * -45966925;
								anIntArray2682[2] = i_273_;
								anIntArray2683[2] = class373_270_.anInt4057 * 324071475;
								anIntArray2684[2] = class373_270_.anInt4060 * -1551409901;
								anIntArray2647[2] = class373_270_.anInt4055 * 2109091647;
								anIntArray2686[2] = 512;
							}
						}
					}
				}
			}
			if (i_257_ < i_259_ - 1) {
				if (i > 0) {
					int i_274_ = is[i - 1][i_257_ + 1] & 0xffff;
					if (i_274_ > 0) {
						OverlayType class373_275_ = aClass375_2651.getOverlayDefinition(i_274_ - 1, -165601895);
						if (class373_275_.color * -45966925 != -1 && class373_275_.aBoolean4063) {
							byte i_276_ = is_260_[i - 1][i_257_ + 1];
							int i_277_ = 2 + is_261_[i - 1][1 + i_257_] * 2 & 0x7;
							int i_278_ = Class82_Sub9.method901(class_ra, class373_275_, (byte) 16);
							if (aBooleanArrayArray2665[i_276_][i_277_]) {
								anIntArray2681[6] = -45966925 * class373_275_.color;
								anIntArray2682[6] = i_278_;
								anIntArray2683[6] = class373_275_.anInt4057 * 324071475;
								anIntArray2684[6] = -1551409901 * class373_275_.anInt4060;
								anIntArray2647[6] = 2109091647 * class373_275_.anInt4055;
								anIntArray2686[6] = 64;
							}
						}
					}
				}
				if (i < i_258_ - 1) {
					int i_279_ = is[i + 1][i_257_ + 1] & 0xffff;
					if (i_279_ > 0) {
						OverlayType class373_280_ = aClass375_2651.getOverlayDefinition(i_279_ - 1, -165601895);
						if (class373_280_.color * -45966925 != -1 && class373_280_.aBoolean4063) {
							byte i_281_ = is_260_[1 + i][i_257_ + 1];
							int i_282_ = 0 + is_261_[1 + i][i_257_ + 1] * 2 & 0x7;
							int i_283_ = Class82_Sub9.method901(class_ra, class373_280_, (byte) 16);
							if (aBooleanArrayArray2665[i_281_][i_282_]) {
								anIntArray2681[4] = -45966925 * class373_280_.color;
								anIntArray2682[4] = i_283_;
								anIntArray2683[4] = 324071475 * class373_280_.anInt4057;
								anIntArray2684[4] = class373_280_.anInt4060 * -1551409901;
								anIntArray2647[4] = 2109091647 * class373_280_.anInt4055;
								anIntArray2686[4] = 128;
							}
						}
					}
				}
			}
			if (i_257_ > 0) {
				int i_284_ = is[i][i_257_ - 1] & 0xffff;
				if (i_284_ > 0) {
					OverlayType class373_285_ = aClass375_2651.getOverlayDefinition(i_284_ - 1, -165601895);
					if (-1 != class373_285_.color * -45966925) {
						byte i_286_ = is_260_[i][i_257_ - 1];
						int i_287_ = is_261_[i][i_257_ - 1];
						if (class373_285_.aBoolean4063) {
							int i_288_ = 2;
							int i_289_ = 4 + i_287_ * 2;
							int i_290_ = Class82_Sub9.method901(class_ra, class373_285_, (byte) 16);
							for (int i_291_ = 0; i_291_ < 3; i_291_++) {
								i_289_ &= 0x7;
								i_288_ &= 0x7;
								if (aBooleanArrayArray2665[i_286_][i_289_] && anIntArray2647[i_288_] <= 2109091647 * class373_285_.anInt4055) {
									anIntArray2681[i_288_] = -45966925 * class373_285_.color;
									anIntArray2682[i_288_] = i_290_;
									anIntArray2683[i_288_] = class373_285_.anInt4057 * 324071475;
									anIntArray2684[i_288_] = -1551409901 * class373_285_.anInt4060;
									if (anIntArray2647[i_288_] == class373_285_.anInt4055 * 2109091647) {
										anIntArray2686[i_288_] |= 0x20;
									} else {
										anIntArray2686[i_288_] = 32;
									}
									anIntArray2647[i_288_] = 2109091647 * class373_285_.anInt4055;
								}
								i_289_++;
								i_288_--;
							}
							if (!bools_263_[anInt2688 * -875169383 + 0 & 0x3]) {
								bools[0] = aBooleanArrayArray2675[i_286_][i_287_ + 2 & 0x3];
							}
						} else if (!bools_263_[anInt2688 * -875169383 + 0 & 0x3]) {
							bools[0] = aBooleanArrayArray2695[i_286_][2 + i_287_ & 0x3];
						}
					}
				}
			}
			if (i_257_ < i_259_ - 1) {
				int i_292_ = is[i][i_257_ + 1] & 0xffff;
				if (i_292_ > 0) {
					OverlayType class373_293_ = aClass375_2651.getOverlayDefinition(i_292_ - 1, -165601895);
					if (class373_293_.color * -45966925 != -1) {
						byte i_294_ = is_260_[i][1 + i_257_];
						int i_295_ = is_261_[i][1 + i_257_];
						if (class373_293_.aBoolean4063) {
							int i_296_ = 4;
							int i_297_ = 2 * i_295_ + 2;
							int i_298_ = Class82_Sub9.method901(class_ra, class373_293_, (byte) 16);
							for (int i_299_ = 0; i_299_ < 3; i_299_++) {
								i_297_ &= 0x7;
								i_296_ &= 0x7;
								if (aBooleanArrayArray2665[i_294_][i_297_] && anIntArray2647[i_296_] <= 2109091647 * class373_293_.anInt4055) {
									anIntArray2681[i_296_] = class373_293_.color * -45966925;
									anIntArray2682[i_296_] = i_298_;
									anIntArray2683[i_296_] = class373_293_.anInt4057 * 324071475;
									anIntArray2684[i_296_] = class373_293_.anInt4060 * -1551409901;
									if (2109091647 * class373_293_.anInt4055 == anIntArray2647[i_296_]) {
										anIntArray2686[i_296_] |= 0x10;
									} else {
										anIntArray2686[i_296_] = 16;
									}
									anIntArray2647[i_296_] = class373_293_.anInt4055 * 2109091647;
								}
								i_297_--;
								i_296_++;
							}
							if (!bools_263_[-875169383 * anInt2688 + 2 & 0x3]) {
								bools[2] = aBooleanArrayArray2675[i_294_][0 + i_295_ & 0x3];
							}
						} else if (!bools_263_[2 + anInt2688 * -875169383 & 0x3]) {
							bools[2] = aBooleanArrayArray2695[i_294_][0 + i_295_ & 0x3];
						}
					}
				}
			}
			if (i > 0) {
				int i_300_ = is[i - 1][i_257_] & 0xffff;
				if (i_300_ > 0) {
					OverlayType class373_301_ = aClass375_2651.getOverlayDefinition(i_300_ - 1, -165601895);
					if (-1 != -45966925 * class373_301_.color) {
						byte i_302_ = is_260_[i - 1][i_257_];
						int i_303_ = is_261_[i - 1][i_257_];
						if (class373_301_.aBoolean4063) {
							int i_304_ = 6;
							int i_305_ = 2 * i_303_ + 4;
							int i_306_ = Class82_Sub9.method901(class_ra, class373_301_, (byte) 16);
							for (int i_307_ = 0; i_307_ < 3; i_307_++) {
								i_305_ &= 0x7;
								i_304_ &= 0x7;
								if (aBooleanArrayArray2665[i_302_][i_305_] && anIntArray2647[i_304_] <= 2109091647 * class373_301_.anInt4055) {
									anIntArray2681[i_304_] = class373_301_.color * -45966925;
									anIntArray2682[i_304_] = i_306_;
									anIntArray2683[i_304_] = 324071475 * class373_301_.anInt4057;
									anIntArray2684[i_304_] = class373_301_.anInt4060 * -1551409901;
									if (anIntArray2647[i_304_] == class373_301_.anInt4055 * 2109091647) {
										anIntArray2686[i_304_] |= 0x8;
									} else {
										anIntArray2686[i_304_] = 8;
									}
									anIntArray2647[i_304_] = class373_301_.anInt4055 * 2109091647;
								}
								i_305_--;
								i_304_++;
							}
							if (!bools_263_[-875169383 * anInt2688 + 3 & 0x3]) {
								bools[3] = aBooleanArrayArray2675[i_302_][i_303_ + 1 & 0x3];
							}
						} else if (!bools_263_[anInt2688 * -875169383 + 3 & 0x3]) {
							bools[3] = aBooleanArrayArray2695[i_302_][1 + i_303_ & 0x3];
						}
					}
				}
			}
			if (i < i_258_ - 1) {
				int i_308_ = is[1 + i][i_257_] & 0xffff;
				if (i_308_ > 0) {
					OverlayType class373_309_ = aClass375_2651.getOverlayDefinition(i_308_ - 1, -165601895);
					if (-1 != class373_309_.color * -45966925) {
						byte i_310_ = is_260_[i + 1][i_257_];
						int i_311_ = is_261_[i + 1][i_257_];
						if (class373_309_.aBoolean4063) {
							int i_312_ = 4;
							int i_313_ = 6 + 2 * i_311_;
							int i_314_ = Class82_Sub9.method901(class_ra, class373_309_, (byte) 16);
							for (int i_315_ = 0; i_315_ < 3; i_315_++) {
								i_313_ &= 0x7;
								i_312_ &= 0x7;
								if (aBooleanArrayArray2665[i_310_][i_313_] && anIntArray2647[i_312_] <= class373_309_.anInt4055 * 2109091647) {
									anIntArray2681[i_312_] = -45966925 * class373_309_.color;
									anIntArray2682[i_312_] = i_314_;
									anIntArray2683[i_312_] = 324071475 * class373_309_.anInt4057;
									anIntArray2684[i_312_] = class373_309_.anInt4060 * -1551409901;
									if (anIntArray2647[i_312_] == class373_309_.anInt4055 * 2109091647) {
										anIntArray2686[i_312_] |= 0x4;
									} else {
										anIntArray2686[i_312_] = 4;
									}
									anIntArray2647[i_312_] = 2109091647 * class373_309_.anInt4055;
								}
								i_313_++;
								i_312_--;
							}
							if (!bools_263_[-875169383 * anInt2688 + 1 & 0x3]) {
								bools[1] = aBooleanArrayArray2675[i_310_][i_311_ + 3 & 0x3];
							}
						} else if (!bools_263_[1 + anInt2688 * -875169383 & 0x3]) {
							bools[1] = aBooleanArrayArray2695[i_310_][3 + i_311_ & 0x3];
						}
					}
				}
			}
			if (null != class373 && class373.aBoolean4063) {
				int i_316_ = Class82_Sub9.method901(class_ra, class373, (byte) 16);
				for (int i_317_ = 0; i_317_ < 8; i_317_++) {
					int i_318_ = i_317_ - -1750338766 * anInt2688 & 0x7;
					if (aBooleanArrayArray2665[-1377184223 * anInt2687][i_317_] && anIntArray2647[i_318_] <= class373.anInt4055 * 2109091647) {
						anIntArray2681[i_318_] = -45966925 * class373.color;
						anIntArray2682[i_318_] = i_316_;
						anIntArray2683[i_318_] = 324071475 * class373.anInt4057;
						anIntArray2684[i_318_] = class373.anInt4060 * -1551409901;
						if (2109091647 * class373.anInt4055 == anIntArray2647[i_318_]) {
							anIntArray2686[i_318_] |= 0x2;
						} else {
							anIntArray2686[i_318_] = 2;
						}
						anIntArray2647[i_318_] = class373.anInt4055 * 2109091647;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.g(" + ')');
		}
	}

	static {
		anIntArray2658 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
		anIntArray2659 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray2660 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
		anIntArray2661 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray2656 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
		anIntArray2663 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
		anIntArray2664 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
		aBooleanArrayArray2665 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false },
				{ false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } };
		aBooleanArrayArray2666 = new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false }, { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true },
				{ true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true } };
		anIntArrayArray2638 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		anIntArrayArray2690 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
		anIntArrayArray2634 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
		aBooleanArrayArray2695 = new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false } };
		anIntArrayArray2671 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		anIntArrayArray2672 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
		anIntArrayArray2673 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
		anIntArrayArray2674 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
		aBooleanArrayArray2675 = new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, { false, false, false, false }, { false, true, false, true }, { false, false, false, false } };
		anIntArrayArray2662 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
		anIntArrayArray2649 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
		anIntArrayArray2678 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArrayArray2679 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	}

	public final void deserialize_tile(Packet buffer, int plane, int x, int y, int localX, int localY, int baseX, int baseY, int rotation, boolean hideUnderlay, boolean osrs) {
		try {
			if (rotation == 1) {
				localY = 1;
			} else if (2 == rotation) {
				localX = 1;
				localY = 1;
			} else if (3 == rotation) {
				localX = 1;
			}
			if (x >= 0 && x < -954368823 * anInt2627 && y >= 0 && y < 181474463 * anInt2628) {
				if (!isUnderwater && !hideUnderlay) {
					tile_flags.flags[plane][x][y] = (byte) 0;
				}
				for (;;) {
					int opcode = buffer.readUnsignedByte();
					if (0 == opcode) {
						if (isUnderwater) {
							heights[0][x + localX][y + localY] = 0;
						} else if (0 == plane) {
							heights[0][localX + x][localY + y] = -Class412.method5581(baseX + 932731, baseY + 556238, (byte) -40) * 8 << 2;
						} else {
							heights[plane][localX + x][y + localY] = heights[plane - 1][localX + x][y + localY] - 960;
						}
						break;
					}
					if (1 == opcode) {
						int i_328_ = buffer.readUnsignedByte();
						if (!isUnderwater) {
							if (i_328_ == 1) {
								i_328_ = 0;
							}
							if (0 == plane) {
								heights[0][localX + x][localY + y] = -i_328_ * 8 << 2;
							} else {
								heights[plane][localX + x][localY + y] = heights[plane - 1][localX + x][localY + y] - (i_328_ * 8 << 2);
							}
						} else {
							heights[0][localX + x][y + localY] = 8 * i_328_ << 2;
						}
						break;
					}
					if (opcode <= 49) {
						if (hideUnderlay)
							buffer.readUnsignedByte();
						else {
							overlays[plane][x][y] = (short) (buffer.readByte() & 0xff);
							if (osrs)
								overlays[plane][x][y] += (OSRSData.OVERLAYS_OFFSET);
							shapes[plane][x][y] = (byte) ((opcode - 2) / 4);
							rotations[plane][x][y] = (byte) (opcode - 2 + rotation & 0x3);
						}
					} else if (opcode <= 81) {
						if (!isUnderwater && !hideUnderlay)
							tile_flags.flags[plane][x][y] = (byte) (opcode - 49);
					} else if (!hideUnderlay) {
						underlays[plane][x][y] = (short) (((opcode - 81) & 0xff));
						if (osrs)
							underlays[plane][x][y] += (OSRSData.UNDERLAYS_OFFSET);
					}
				}
			} else {
				for (;;) {
					int i_329_ = buffer.readUnsignedByte();
					if (i_329_ == 0) {
						// NOOP
						break;
					}
					if (i_329_ == 1) {
						buffer.readUnsignedByte();
						break;
					}
					if (i_329_ <= 49) {
						buffer.readUnsignedByte();
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.d(" + ')');
		}
	}

	void method2229(Ground ground, FluType class443, OverlayType class373, int i, int i_330_, int i_331_, int i_332_, int i_333_, int i_334_, int i_335_, int i_336_) {
		try {
			int i_337_ = ground.method6341(i_330_, i_331_, (byte) -41);
			int i_338_ = ground.method6341(i_332_, i_331_, (byte) -89);
			int i_339_ = ground.method6341(i_332_, i_333_, (byte) -120);
			int i_340_ = ground.method6341(i_330_, i_333_, (byte) -113);
			boolean bool = tile_flags.method2320(i_330_, i_331_, 1693212331);
			if (bool && i > 1 || !bool && i > 0) {
				boolean bool_341_ = true;
				if (class443 != null && !class443.aBoolean5596) {
					bool_341_ = false;
				} else if (0 == i_334_ && 0 != -1377184223 * anInt2687) {
					bool_341_ = false;
				} else if (i_335_ > 0 && null != class373 && !class373.aBoolean4062) {
					bool_341_ = false;
				}
				if (bool_341_ && i_338_ == i_337_ && i_337_ == i_339_ && i_337_ == i_340_) {
					aByteArrayArrayArray2637[i][i_330_][i_331_] |= 0x4;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kb.v(" + ')');
		}
	}

	MapDecoder(SceneGraph sceneGraph, int i, int i_342_, int i_343_, boolean bool, FloTypeList class375, UnderlayTypeList class451, TileFlags tileFlags) {
		groundBlending = false;
		aBoolean2625 = false;
		anIntArray2680 = new int[6];
		anIntArray2681 = new int[13];
		anIntArray2682 = new int[13];
		anIntArray2683 = new int[13];
		anIntArray2684 = new int[13];
		anIntArray2647 = new int[13];
		anIntArray2686 = new int[13];
		anInt2689 = 0;
		anInt2685 = 0;
		anIntArray2618 = null;
		aSceneGraph_2619 = sceneGraph;
		planesHeight = 142248255 * i;
		anInt2627 = i_342_ * 325279097;
		anInt2628 = i_343_ * 2072446815;
		isUnderwater = bool;
		aClass375_2651 = class375;
		aClass451_2617 = class451;
		tile_flags = tileFlags;
		underlays = new short[planesHeight * 1551623871][anInt2627 * -954368823][181474463 * anInt2628];
		overlays = new short[1551623871 * planesHeight][-954368823 * anInt2627][181474463 * anInt2628];
		shapes = new byte[1551623871 * planesHeight][-954368823 * anInt2627][anInt2628 * 181474463];
		rotations = new byte[planesHeight * 1551623871][-954368823 * anInt2627][181474463 * anInt2628];
		heights = new int[planesHeight * 1551623871][anInt2627 * -954368823 + 1][181474463 * anInt2628 + 1];
		aByteArrayArrayArray2637 = new byte[1551623871 * planesHeight][1 + -954368823 * anInt2627][181474463 * anInt2628 + 1];
	}

	static final void method2230(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			class105.aString1230 = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kb.jh(").append(')').toString());
		}
	}

	public static void method2231(SeqTypeList class395, int i) {
		try {
			Class298_Sub2.aClass395_7165 = class395;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kb.a(").append(')').toString());
		}
	}

	static final void method2232(int i, int i_344_, int i_345_, int i_346_, int i_347_, int i_348_, byte i_349_) {
		try {
			int i_350_ = 1168366243 * Class10.anInt129;
			int[] is = Class10.anIntArray135;
			GameClient.anInt8905 = 0;
			int i_351_;
			if (GameClient.cutsceneStage * 1596783995 == 0) {
				i_351_ = Class87.entities.length;
			} else {
				i_351_ = i_350_ + GameClient.npcCount * -1230451913;
			}
			for (int i_352_ = 0; i_352_ < i_351_; i_352_++) {
				NPCType class503 = null;
				Entity class365_sub1_sub1_sub2;
				if (0 == 1596783995 * GameClient.cutsceneStage) {
					Class94 class94 = Class87.entities[i_352_];
					if (!class94.aBoolean912) {
						if (i_349_ == 0) {
							/* empty */
						}
						continue;
					}
					class365_sub1_sub1_sub2 = class94.method1015(-198688273);
					if (class365_sub1_sub1_sub2.lastUpdateTick * -1706825291 != -1953789277 * GameClient.anInt8777) {
						if (i_349_ != 0) {
							continue;
						}
						return;
					}
					if (class94.anInt909 * 1762367763 >= 0) {
						class503 = ((NPC) class365_sub1_sub1_sub2).definition;
						if (class503.anIntArray6188 != null) {
							class503 = class503.method6240(Class128.aClass148_6331, 1805717140);
							if (class503 == null) {
								if (i_349_ != 0) {
									continue;
								}
								return;
							}
						}
					}
				} else {
					if (i_352_ < i_350_) {
						class365_sub1_sub1_sub2 = GameClient.players[is[i_352_]];
					} else {
						class365_sub1_sub1_sub2 = (Entity) ((LinkableObject) GameClient.npcs.get(GameClient.npcIndicies[i_352_ - i_350_])).anObject7366;
						class503 = ((NPC) class365_sub1_sub1_sub2).definition;
						if (null != class503.anIntArray6188) {
							class503 = class503.method6240(Class128.aClass148_6331, 1690174676);
							if (null == class503) {
								if (i_349_ == 0) {
									throw new IllegalStateException();
								}
								continue;
							}
						}
					}
					if (class365_sub1_sub1_sub2.anInt10071 * 648883167 < 0) {
						if (i_349_ == 0) {
							/* empty */
						}
						continue;
					}
					if (-1706825291 * class365_sub1_sub1_sub2.lastUpdateTick != -1953789277 * GameClient.anInt8777 && class365_sub1_sub1_sub2.plane != Class287.myPlayer.plane) {
						if (i_349_ == 0) {
							/* empty */
						}
						continue;
					}
				}
				Class255.method2440(class365_sub1_sub1_sub2, class365_sub1_sub1_sub2.method4363((byte) -83), -1841539170);
				if (GameClient.aFloatArray8891[0] < 0.0F) {
					if (i_349_ == 0) {
						/* empty */
					}
				} else {
					if (class365_sub1_sub1_sub2.method4429((byte) -114)) {
						overheadString overheadString = class365_sub1_sub1_sub2.method4437(-593782084);
						if (overheadString != null && -559111197 * GameClient.anInt8905 < 547709851 * GameClient.anInt8644) {
							GameClient.anIntArray8909[GameClient.anInt8905 * -559111197] = Class82_Sub19_Sub1.aClass505_9111.method6264(overheadString.method721((byte) 1), -1350600471) / 2;
							GameClient.anIntArray8907[-559111197 * GameClient.anInt8905] = (int) GameClient.aFloatArray8891[0];
							GameClient.anIntArray8908[GameClient.anInt8905 * -559111197] = (int) GameClient.aFloatArray8891[1];
							GameClient.aOverheadStringArray8657[-559111197 * GameClient.anInt8905] = overheadString;
							GameClient.anInt8905 += -392578613;
						}
					}
					int i_353_ = (int) (GameClient.aFloatArray8891[1] + i_344_);
					if (!class365_sub1_sub1_sub2.aBoolean10123 && -1472450313 * class365_sub1_sub1_sub2.anInt10116 > 443738891 * GameClient.anInt8884) {
						int i_354_ = -1;
						int i_355_ = 1;
						if (null == class503) {
							Player class365_sub1_sub1_sub2_sub2 = GameClient.players[is[i_352_]];
							i_354_ = class365_sub1_sub1_sub2.getDefinition(379142264).anInt3738 * 2108452425;
							if (class365_sub1_sub1_sub2_sub2.isClickable) {
								i_355_ = 2;
							}
						} else {
							i_354_ = -1362808149 * class503.anInt6167;
							if (-1 == i_354_) {
								i_354_ = class365_sub1_sub1_sub2.getDefinition(-1076416255).anInt3738 * 2108452425;
							}
						}
						Class57[] class57s = Class160.aClass57Array1646;
						if (i_354_ != -1) {
							Class57[] class57s_356_ = (Class57[]) GameClient.aClass348_8780.get(i_354_);
							if (null == class57s_356_) {
								Class89[] class89s = Class89.method993(Class158.aClass243_6364, i_354_, 0);
								if (class89s != null) {
									class57s_356_ = new Class57[class89s.length];
									for (int i_357_ = 0; i_357_ < class89s.length; i_357_++) {
										class57s_356_[i_357_] = OverlayType.activeToolkit.method5125(class89s[i_357_], true);
									}
									GameClient.aClass348_8780.put(class57s_356_, i_354_);
								}
							}
							if (null != class57s_356_ && class57s_356_.length >= 2) {
								class57s = class57s_356_;
							}
						}
						if (i_355_ >= class57s.length) {
							i_355_ = 1;
						}
						Class57 class57 = class57s[0];
						Class57 class57_358_ = class57s[i_355_];
						i_353_ -= Math.max(Class82_Sub19_Sub1.aClass505_9111.anInt6202 * 1110385787, class57.method625());
						int i_359_ = (int) (GameClient.aFloatArray8891[0] + i - (class57.method623() >> 1));
						int i_360_ = class57.method623() * class365_sub1_sub1_sub2.anInt10063 * -766383861 / 255;
						int i_361_ = class57.method625();
						if (-766383861 * class365_sub1_sub1_sub2.anInt10063 > 0 && i_360_ < 2) {
							i_360_ = 2;
						}
						class57.method645(i_359_, i_353_);
						OverlayType.activeToolkit.o(i_359_, i_353_, i_359_ + i_360_, i_353_ + i_361_);
						class57_358_.method645(i_359_, i_353_);
						OverlayType.activeToolkit.r(i, i_344_, i_345_ + i, i_346_ + i_344_);
					} else {
						i_353_ -= Math.max(1110385787 * Class82_Sub19_Sub1.aClass505_9111.anInt6202, Class160.aClass57Array1646[0].method625());
					}
					i_353_ -= 2;
					if (!class365_sub1_sub1_sub2.aBoolean10123) {
						if (-424347101 * class365_sub1_sub1_sub2.anInt10086 > 443738891 * GameClient.anInt8884) {
							Class57 class57 = ReferenceTable.aClass57Array6561[class365_sub1_sub1_sub2.hasOverheadString ? 2 : 0];
							Class57 class57_362_ = ReferenceTable.aClass57Array6561[class365_sub1_sub1_sub2.hasOverheadString ? 3 : 1];
							int i_363_ = -1;
							if (class365_sub1_sub1_sub2 instanceof NPC) {
								i_363_ = class503.anInt6184 * -1088584623;
								if (-1 == i_363_) {
									i_363_ = class365_sub1_sub1_sub2.getDefinition(1682687181).anInt3754 * -2139195165;
								}
							} else {
								i_363_ = class365_sub1_sub1_sub2.getDefinition(-387842167).anInt3754 * -2139195165;
							}
							if (-1 != i_363_) {
								Class57[] class57s = (Class57[]) GameClient.aClass348_8898.get(i_363_);
								if (class57s == null) {
									Class89[] class89s = Class89.method993(Class158.aClass243_6364, i_363_, 0);
									if (class89s != null) {
										class57s = new Class57[class89s.length];
										for (int i_364_ = 0; i_364_ < class89s.length; i_364_++) {
											class57s[i_364_] = OverlayType.activeToolkit.method5125(class89s[i_364_], true);
										}
										GameClient.aClass348_8898.put(class57s, i_363_);
									}
								}
								if (class57s != null && class57s.length == 4) {
									class57 = class57s[class365_sub1_sub1_sub2.hasOverheadString ? 2 : 0];
									class57_362_ = class57s[class365_sub1_sub1_sub2.hasOverheadString ? 3 : 1];
								}
							}
							int i_365_ = class365_sub1_sub1_sub2.anInt10086 * -424347101 - GameClient.anInt8884 * 443738891;
							int i_366_;
							if (i_365_ <= -1547810795 * class365_sub1_sub1_sub2.anInt10088) {
								i_366_ = class57.method623();
							} else {
								i_365_ -= -1547810795 * class365_sub1_sub1_sub2.anInt10088;
								int i_367_ = class365_sub1_sub1_sub2.anInt10096 * 293281353 == 0 ? 0 : (class365_sub1_sub1_sub2.anInt10087 * 878490761 - i_365_) / (class365_sub1_sub1_sub2.anInt10096 * 293281353) * 293281353 * class365_sub1_sub1_sub2.anInt10096;
								i_366_ = class57.method623() * i_367_ / (class365_sub1_sub1_sub2.anInt10087 * 878490761);
							}
							int i_368_ = class57.method625();
							i_353_ -= i_368_;
							int i_369_ = (int) (GameClient.aFloatArray8891[0] + i - (class57.method623() >> 1));
							class57.method645(i_369_, i_353_);
							OverlayType.activeToolkit.o(i_369_, i_353_, i_366_ + i_369_, i_368_ + i_353_);
							class57_362_.method645(i_369_, i_353_);
							OverlayType.activeToolkit.r(i, i_344_, i_345_ + i, i_346_ + i_344_);
							i_353_ -= 2;
						}
						if (class503 == null) {
							Player class365_sub1_sub1_sub2_sub2 = (Player) class365_sub1_sub1_sub2;
							if (-1 != class365_sub1_sub1_sub2_sub2.skillLevel * -1126079563) {
								Class57 class57 = Class416.aClass57Array5334[class365_sub1_sub1_sub2_sub2.skillLevel * -1126079563];
								i_353_ -= class57.method625();
								class57.method645((int) (i + GameClient.aFloatArray8891[0] - 12.0F), i_353_);
								i_353_ -= 2;
							}
							if (-1 != class365_sub1_sub1_sub2_sub2.combatLevel * -2031128911) {
								Class57 class57 = IntegerPreferenceField.aClass57Array5351[-2031128911 * class365_sub1_sub1_sub2_sub2.combatLevel];
								i_353_ -= class57.method625();
								class57.method645((int) (GameClient.aFloatArray8891[0] + i - 12.0F), i_353_);
								i_353_ -= 2;
							}
						} else if (-986687803 * class503.anInt6185 >= 0 && -986687803 * class503.anInt6185 < IntegerPreferenceField.aClass57Array5351.length) {
							Class57 class57 = IntegerPreferenceField.aClass57Array5351[class503.anInt6185 * -986687803];
							i_353_ -= class57.method625();
							class57.method645((int) (i + GameClient.aFloatArray8891[0] - (class57.method623() >> 1)), i_353_);
							i_353_ -= 2;
						}
					}
					if (class365_sub1_sub1_sub2 instanceof Player) {
						if (i_352_ >= 0) {
							int i_370_ = 0;
							HintIcon[] hintIcons = GameClient.hintIcons;
							for (HintIcon hintIcon : hintIcons) {
								if (hintIcon != null && 10 == hintIcon.anInt266 * 958933333 && is[i_352_] == -841622081 * hintIcon.anInt256) {
									Class57 class57 = Class128_Sub2.aClass57Array8560[hintIcon.anInt258 * -92466201];
									if (class57.method625() > i_370_) {
										i_370_ = class57.method625();
									}
									class57.method645((int) (GameClient.aFloatArray8891[0] + i - 12.0F), i_353_ - class57.method625());
								}
							}
							if (i_370_ > 0) {
								i_353_ -= 2 + i_370_;
							}
						}
					} else {
						int i_372_ = 0;
						HintIcon[] hintIcons = GameClient.hintIcons;
						for (HintIcon hintIcon : hintIcons) {
							if (null != hintIcon && hintIcon.anInt266 * 958933333 == 1 && hintIcon.anInt256 * -841622081 == GameClient.npcIndicies[i_352_ - i_350_]) {
								Class57 class57 = Class128_Sub2.aClass57Array8560[-92466201 * hintIcon.anInt258];
								if (class57.method625() > i_372_) {
									i_372_ = class57.method625();
								}
								boolean bool;
								if (hintIcon.anInt265 * -519856529 == 0) {
									bool = true;
								} else {
									int i_374_ = Class82_Sub5.method883((byte) 6) * 1000 / (-519856529 * hintIcon.anInt265) / 2;
									bool = 443738891 * GameClient.anInt8884 % (2 * i_374_) < i_374_;
								}
								if (bool) {
									class57.method645((int) (i + GameClient.aFloatArray8891[0] - 12.0F), i_353_ - class57.method625());
								}
							}
						}
						if (i_372_ > 0) {
							i_353_ -= i_372_ + 2;
						}
					}
					int i_375_ = 0;
					for (/**/; i_375_ < HashTable.aClass371_5520.anInt4032 * -942466371; i_375_++) {
						int i_376_ = class365_sub1_sub1_sub2.graphicExpiry[i_375_];
						int i_377_ = class365_sub1_sub1_sub2.anIntArray10102[i_375_];
						HitType hitType = null;
						int i_378_ = 0;
						if (i_377_ >= 0) {
							if (i_376_ <= GameClient.anInt8884 * 443738891) {
								if (i_349_ == 0) {
									throw new IllegalStateException();
								}
								continue;
							}
							hitType = Class500.aClass347_6117.method4176(class365_sub1_sub1_sub2.anIntArray10102[i_375_], -1682094753);
							i_378_ = -169339039 * hitType.anInt3854;
						} else if (i_376_ < 0) {
							if (i_349_ != 0) {
								continue;
							}
							return;
						}
						int i_379_ = class365_sub1_sub1_sub2.anIntArray10127[i_375_];
						HitType hitType_380_ = null;
						if (i_379_ >= 0) {
							hitType_380_ = Class500.aClass347_6117.method4176(i_379_, -1682094753);
						}
						if (i_376_ - i_378_ > 443738891 * GameClient.anInt8884) {
							if (i_349_ == 0) {
								throw new IllegalStateException();
							}
						} else {
							int i_381_ = class365_sub1_sub1_sub2.graphicLayer[i_375_];
							if (i_381_ >= 0) {
								class365_sub1_sub1_sub2.anInt10063 = 1207474851 * i_381_;
								class365_sub1_sub1_sub2.anInt10116 = GameClient.anInt8884 * -1044781683 + -362436300;
								class365_sub1_sub1_sub2.graphicLayer[i_375_] = -1;
							}
							if (null == hitType) {
								class365_sub1_sub1_sub2.graphicExpiry[i_375_] = -1;
							} else {
								int i_382_ = class365_sub1_sub1_sub2.method4363((byte) 64) / 2;
								Class255.method2440(class365_sub1_sub1_sub2, i_382_, -1043067647);
								if (GameClient.aFloatArray8891[0] > -1.0F) {
									GameClient.aFloatArray8891[0] += HashTable.aClass371_5520.anIntArray4033[i_375_];
									GameClient.aFloatArray8891[1] += HashTable.aClass371_5520.anIntArray4034[i_375_];
									Object object = null;
									Object object_383_ = null;
									Object object_384_ = null;
									Object object_385_ = null;
									int i_386_ = 0;
									int i_387_ = 0;
									int i_388_ = 0;
									int i_389_ = 0;
									int i_390_ = 0;
									int i_391_ = 0;
									int i_392_ = 0;
									int i_393_ = 0;
									Class57 class57 = null;
									Class57 class57_394_ = null;
									Class57 class57_395_ = null;
									Class57 class57_396_ = null;
									int i_397_ = 0;
									int i_398_ = 0;
									int i_399_ = 0;
									int i_400_ = 0;
									int i_401_ = 0;
									int i_402_ = 0;
									int i_403_ = 0;
									int i_404_ = 0;
									int i_405_ = 0;
									Class57 class57_406_ = hitType.method4280(OverlayType.activeToolkit, (short) -23793);
									if (class57_406_ != null) {
										i_386_ = class57_406_.method623();
										int i_407_ = class57_406_.method625();
										if (i_407_ > i_405_) {
											i_405_ = i_407_;
										}
										class57_406_.method622(GameClient.anIntArray8977);
										i_390_ = GameClient.anIntArray8977[0];
									}
									Class57 class57_408_ = hitType.method4284(OverlayType.activeToolkit, 406396727);
									if (class57_408_ != null) {
										i_387_ = class57_408_.method623();
										int i_409_ = class57_408_.method625();
										if (i_409_ > i_405_) {
											i_405_ = i_409_;
										}
										class57_408_.method622(GameClient.anIntArray8977);
										i_391_ = GameClient.anIntArray8977[0];
									}
									Class57 class57_410_ = hitType.method4281(OverlayType.activeToolkit, (byte) 26);
									if (null != class57_410_) {
										i_388_ = class57_410_.method623();
										int i_411_ = class57_410_.method625();
										if (i_411_ > i_405_) {
											i_405_ = i_411_;
										}
										class57_410_.method622(GameClient.anIntArray8977);
										i_392_ = GameClient.anIntArray8977[0];
									}
									Class57 class57_412_ = hitType.method4282(OverlayType.activeToolkit, (byte) 0);
									if (class57_412_ != null) {
										i_389_ = class57_412_.method623();
										int i_413_ = class57_412_.method625();
										if (i_413_ > i_405_) {
											i_405_ = i_413_;
										}
										class57_412_.method622(GameClient.anIntArray8977);
										i_393_ = GameClient.anIntArray8977[0];
									}
									if (hitType_380_ != null) {
										class57 = hitType_380_.method4280(OverlayType.activeToolkit, (short) 4674);
										if (null != class57) {
											i_397_ = class57.method623();
											int i_414_ = class57.method625();
											if (i_414_ > i_405_) {
												i_405_ = i_414_;
											}
											class57.method622(GameClient.anIntArray8977);
											i_401_ = GameClient.anIntArray8977[0];
										}
										class57_394_ = hitType_380_.method4284(OverlayType.activeToolkit, 1200116626);
										if (null != class57_394_) {
											i_398_ = class57_394_.method623();
											int i_415_ = class57_394_.method625();
											if (i_415_ > i_405_) {
												i_405_ = i_415_;
											}
											class57_394_.method622(GameClient.anIntArray8977);
											i_402_ = GameClient.anIntArray8977[0];
										}
										class57_395_ = hitType_380_.method4281(OverlayType.activeToolkit, (byte) 83);
										if (null != class57_395_) {
											i_399_ = class57_395_.method623();
											int i_416_ = class57_395_.method625();
											if (i_416_ > i_405_) {
												i_405_ = i_416_;
											}
											class57_395_.method622(GameClient.anIntArray8977);
											i_403_ = GameClient.anIntArray8977[0];
										}
										class57_396_ = hitType_380_.method4282(OverlayType.activeToolkit, (byte) 0);
										if (class57_396_ != null) {
											i_400_ = class57_396_.method623();
											int i_417_ = class57_396_.method625();
											if (i_417_ > i_405_) {
												i_405_ = i_417_;
											}
											class57_396_.method622(GameClient.anIntArray8977);
											i_404_ = GameClient.anIntArray8977[0];
										}
									}
									Class264 class264 = ScriptContext.aClass264_7534;
									Class264 class264_418_ = ScriptContext.aClass264_7534;
									Class505 class505 = Class74.aClass505_695;
									Class505 class505_419_ = Class74.aClass505_695;
									int i_420_ = -160359777 * hitType.anInt3864;
									if (i_420_ >= 0) {
										Class264 class264_421_ = (Class264) Class497.aClass197_6105.method1883(GameClient.anInterface10_8700, i_420_, true, true, -2063324548);
										Class505 class505_422_ = Class497.aClass197_6105.method1879(GameClient.anInterface10_8700, i_420_, -665127508);
										if (class264_421_ != null && class505_422_ != null) {
											class264 = class264_421_;
											class505 = class505_422_;
										}
									}
									if (hitType_380_ != null) {
										i_420_ = hitType_380_.anInt3864 * -160359777;
										if (i_420_ >= 0) {
											Class264 class264_423_ = (Class264) Class497.aClass197_6105.method1883(GameClient.anInterface10_8700, i_420_, true, true, -2063324548);
											Class505 class505_424_ = Class497.aClass197_6105.method1879(GameClient.anInterface10_8700, i_420_, -1834913337);
											if (class264_423_ != null && null != class505_424_) {
												class264_418_ = class264_423_;
												class505_419_ = class505_424_;
											}
										}
									}
									Object object_425_ = null;
									String string = null;
									boolean bool = false;
									int i_426_ = 0;
									String string_427_ = hitType.method4279(class365_sub1_sub1_sub2.graphicEndTime[i_375_], -794452403);
									int i_428_ = class505.method6264(string_427_, 1512962528);
									if (hitType_380_ != null) {
										string = hitType_380_.method4279(class365_sub1_sub1_sub2.graphicFlags[i_375_], -794452403);
										i_426_ = class505_419_.method6264(string, -1394241866);
									}
									int i_429_ = 0;
									int i_430_ = 0;
									if (i_387_ > 0) {
										i_429_ = 1 + i_428_ / i_387_;
									}
									if (hitType_380_ != null && i_398_ > 0) {
										i_430_ = i_426_ / i_398_ + 1;
									}
									int i_431_ = 0;
									int i_432_ = i_431_;
									if (i_386_ > 0) {
										i_431_ += i_386_;
									}
									i_431_ += 2;
									int i_433_ = i_431_;
									if (i_388_ > 0) {
										i_431_ += i_388_;
									}
									int i_434_ = i_431_;
									int i_435_ = i_431_;
									if (i_387_ > 0) {
										int i_436_ = i_387_ * i_429_;
										i_431_ += i_436_;
										i_435_ += (i_436_ - i_428_) / 2;
									} else {
										i_431_ += i_428_;
									}
									int i_437_ = i_431_;
									if (i_389_ > 0) {
										i_431_ += i_389_;
									}
									int i_438_ = 0;
									int i_439_ = 0;
									int i_440_ = 0;
									int i_441_ = 0;
									int i_442_ = 0;
									if (null != hitType_380_) {
										i_431_ += 2;
										i_438_ = i_431_;
										if (i_397_ > 0) {
											i_431_ += i_397_;
										}
										i_431_ += 2;
										i_439_ = i_431_;
										if (i_399_ > 0) {
											i_431_ += i_399_;
										}
										i_440_ = i_431_;
										i_442_ = i_431_;
										if (i_398_ > 0) {
											int i_443_ = i_398_ * i_430_;
											i_431_ += i_443_;
											i_442_ += (i_443_ - i_426_) / 2;
										} else {
											i_431_ += i_426_;
										}
										i_441_ = i_431_;
										if (i_400_ > 0) {
											i_431_ += i_400_;
										}
									}
									int i_444_ = class365_sub1_sub1_sub2.graphicExpiry[i_375_] - GameClient.anInt8884 * 443738891;
									int i_445_ = hitType.anInt3859 * 584392085 - hitType.anInt3859 * 584392085 * i_444_ / (-169339039 * hitType.anInt3854);
									int i_446_ = -(hitType.anInt3852 * 639965299) + i_444_ * 639965299 * hitType.anInt3852 / (hitType.anInt3854 * -169339039);
									int i_447_ = (int) (i_445_ + (GameClient.aFloatArray8891[0] + i - (i_431_ >> 1)));
									int i_448_ = (int) (i_344_ + GameClient.aFloatArray8891[1] - 12.0F + i_446_);
									int i_449_ = i_448_;
									int i_450_ = i_448_ + i_405_;
									int i_451_ = -176522889 * hitType.anInt3862 + i_448_ + 15;
									int i_452_ = i_451_ - class505.anInt6202 * 1110385787;
									int i_453_ = i_451_ + class505.anInt6197 * -1883958527;
									if (i_452_ < i_449_) {
										i_449_ = i_452_;
									}
									if (i_453_ > i_450_) {
										i_450_ = i_453_;
									}
									int i_454_ = 0;
									if (hitType_380_ != null) {
										i_454_ = hitType_380_.anInt3862 * -176522889 + i_448_ + 15;
										int i_455_ = i_454_ - class505_419_.anInt6202 * 1110385787;
										int i_456_ = i_454_ + -1883958527 * class505_419_.anInt6197;
										if (i_455_ < i_449_) {
											i_449_ = i_455_;
										}
										if (i_456_ > i_450_) {
											i_450_ = i_456_;
										}
									}
									int i_457_ = 255;
									if (hitType.anInt3861 * 1445195441 >= 0) {
										i_457_ = (i_444_ << 8) / (-169339039 * hitType.anInt3854 - 1445195441 * hitType.anInt3861);
									}
									if (i_457_ >= 0 && i_457_ < 255) {
										int i_458_ = i_457_ << 24;
										int i_459_ = i_458_ | 0xffffff;
										if (class57_406_ != null) {
											class57_406_.method631(i_432_ + i_447_ - i_390_, i_448_, 0, i_459_, 1);
										}
										if (class57_410_ != null) {
											class57_410_.method631(i_433_ + i_447_ - i_392_, i_448_, 0, i_459_, 1);
										}
										if (class57_408_ != null) {
											for (int i_460_ = 0; i_460_ < i_429_; i_460_++) {
												class57_408_.method631(i_434_ + i_447_ - i_391_ + i_387_ * i_460_, i_448_, 0, i_459_, 1);
											}
										}
										if (null != class57_412_) {
											class57_412_.method631(i_437_ + i_447_ - i_393_, i_448_, 0, i_459_, 1);
										}
										class264.method2488(string_427_, i_435_ + i_447_, i_451_, 1473512559 * hitType.anInt3853 | i_458_, 0, -60400188);
										if (hitType_380_ != null) {
											if (class57 != null) {
												class57.method631(i_447_ + i_438_ - i_401_, i_448_, 0, i_459_, 1);
											}
											if (null != class57_395_) {
												class57_395_.method631(i_447_ + i_439_ - i_403_, i_448_, 0, i_459_, 1);
											}
											if (class57_394_ != null) {
												for (int i_461_ = 0; i_461_ < i_430_; i_461_++) {
													class57_394_.method631(i_461_ * i_398_ + i_440_ + i_447_ - i_402_, i_448_, 0, i_459_, 1);
												}
											}
											if (null != class57_396_) {
												class57_396_.method631(i_447_ + i_441_ - i_404_, i_448_, 0, i_459_, 1);
											}
											class264_418_.method2488(string, i_447_ + i_442_, i_454_, hitType_380_.anInt3853 * 1473512559 | i_458_, 0, -540018673);
										}
									} else {
										if (class57_406_ != null) {
											class57_406_.method645(i_447_ + i_432_ - i_390_, i_448_);
										}
										if (class57_410_ != null) {
											class57_410_.method645(i_433_ + i_447_ - i_392_, i_448_);
										}
										if (class57_408_ != null) {
											for (int i_462_ = 0; i_462_ < i_429_; i_462_++) {
												class57_408_.method645(i_387_ * i_462_ + i_447_ + i_434_ - i_391_, i_448_);
											}
										}
										if (class57_412_ != null) {
											class57_412_.method645(i_437_ + i_447_ - i_393_, i_448_);
										}
										class264.method2488(string_427_, i_435_ + i_447_, i_451_, hitType.anInt3853 * 1473512559 | ~0xffffff, 0, -45982797);
										if (hitType_380_ != null) {
											if (class57 != null) {
												class57.method645(i_438_ + i_447_ - i_401_, i_448_);
											}
											if (class57_395_ != null) {
												class57_395_.method645(i_447_ + i_439_ - i_403_, i_448_);
											}
											if (null != class57_394_) {
												for (int i_463_ = 0; i_463_ < i_430_; i_463_++) {
													class57_394_.method645(i_440_ + i_447_ - i_402_ + i_463_ * i_398_, i_448_);
												}
											}
											if (null != class57_396_) {
												class57_396_.method645(i_441_ + i_447_ - i_404_, i_448_);
											}
											class264_418_.method2488(string, i_442_ + i_447_, i_454_, hitType_380_.anInt3853 * 1473512559 | ~0xffffff, 0, -751332562);
										}
									}
								}
							}
						}
					}
				}
			}
			for (int i_464_ = 0; i_464_ < 1306491689 * GameClient.anInt8659; i_464_++) {
				int i_465_ = GameClient.anIntArray8851[i_464_];
				Entity class365_sub1_sub1_sub2;
				if (i_465_ < 2048) {
					class365_sub1_sub1_sub2 = GameClient.players[i_465_];
				} else {
					class365_sub1_sub1_sub2 = (Entity) ((LinkableObject) GameClient.npcs.get(i_465_ - 2048)).anObject7366;
				}
				int i_466_ = GameClient.anIntArray8779[i_464_];
				Entity class365_sub1_sub1_sub2_467_;
				if (i_466_ < 2048) {
					class365_sub1_sub1_sub2_467_ = GameClient.players[i_466_];
				} else {
					class365_sub1_sub1_sub2_467_ = (Entity) ((LinkableObject) GameClient.npcs.get(i_466_ - 2048)).anObject7366;
				}
				TimeUtils.method1320(class365_sub1_sub1_sub2, class365_sub1_sub1_sub2_467_, (class365_sub1_sub1_sub2.anInt10069 -= 512067143) * -152681609, i, i_344_, i_345_, i_346_, i_347_, i_348_, 1553464017);
			}
			int i_468_ = 1110385787 * Class82_Sub19_Sub1.aClass505_9111.anInt6202 + -1883958527 * Class82_Sub19_Sub1.aClass505_9111.anInt6197 + 2;
			for (int i_469_ = 0; i_469_ < GameClient.anInt8905 * -559111197; i_469_++) {
				int i_470_ = GameClient.anIntArray8907[i_469_];
				int i_471_ = GameClient.anIntArray8908[i_469_];
				int i_472_ = GameClient.anIntArray8909[i_469_];
				boolean bool = true;
				while (bool) {
					bool = false;
					for (int i_473_ = 0; i_473_ < i_469_; i_473_++) {
						if (2 + i_471_ > GameClient.anIntArray8908[i_473_] - i_468_ && i_471_ - i_468_ < GameClient.anIntArray8908[i_473_] + 2 && i_470_ - i_472_ < GameClient.anIntArray8909[i_473_] + GameClient.anIntArray8907[i_473_] && i_470_ + i_472_ > GameClient.anIntArray8907[i_473_] - GameClient.anIntArray8909[i_473_] && GameClient.anIntArray8908[i_473_] - i_468_ < i_471_) {
							i_471_ = GameClient.anIntArray8908[i_473_] - i_468_;
							bool = true;
						}
					}
				}
				GameClient.anIntArray8908[i_469_] = i_471_;
				String string = GameClient.aOverheadStringArray8657[i_469_].method721((byte) 1);
				if (0 == GameClient.anInt8842 * 1805045055) {
					int i_474_ = 16776960;
					int i_475_ = GameClient.aOverheadStringArray8657[i_469_].method720(642226389);
					if (i_475_ < 6) {
						i_474_ = GameClient.anIntArray8911[i_475_];
					}
					if (i_475_ == 6) {
						i_474_ = GameClient.anInt8777 * -1953789277 % 20 < 10 ? 16711680 : 16776960;
					}
					if (i_475_ == 7) {
						i_474_ = -1953789277 * GameClient.anInt8777 % 20 < 10 ? 255 : 65535;
					}
					if (8 == i_475_) {
						i_474_ = -1953789277 * GameClient.anInt8777 % 20 < 10 ? 45056 : 8454016;
					}
					if (i_475_ == 9) {
						int i_476_ = 150 - GameClient.aOverheadStringArray8657[i_469_].method722(-1720960633) * 150 / GameClient.aOverheadStringArray8657[i_469_].method723((short) -1217);
						if (i_476_ < 50) {
							i_474_ = i_476_ * 1280 + 16711680;
						} else if (i_476_ < 100) {
							i_474_ = 16776960 - 327680 * (i_476_ - 50);
						} else if (i_476_ < 150) {
							i_474_ = (i_476_ - 100) * 5 + 65280;
						}
					}
					if (10 == i_475_) {
						int i_477_ = 150 - GameClient.aOverheadStringArray8657[i_469_].method722(-1972553140) * 150 / GameClient.aOverheadStringArray8657[i_469_].method723((short) -25631);
						if (i_477_ < 50) {
							i_474_ = 5 * i_477_ + 16711680;
						} else if (i_477_ < 100) {
							i_474_ = 16711935 - (i_477_ - 50) * 327680;
						} else if (i_477_ < 150) {
							i_474_ = 255 + 327680 * (i_477_ - 100) - (i_477_ - 100) * 5;
						}
					}
					if (i_475_ == 11) {
						int i_478_ = 150 - GameClient.aOverheadStringArray8657[i_469_].method722(-1730083195) * 150 / GameClient.aOverheadStringArray8657[i_469_].method723((short) -3693);
						if (i_478_ < 50) {
							i_474_ = 16777215 - 327685 * i_478_;
						} else if (i_478_ < 100) {
							i_474_ = 327685 * (i_478_ - 50) + 65280;
						} else if (i_478_ < 150) {
							i_474_ = 16777215 - 327680 * (i_478_ - 100);
						}
					}
					int i_479_ = i_474_ | ~0xffffff;
					int i_480_ = GameClient.aOverheadStringArray8657[i_469_].method719(833746281);
					if (0 == i_480_) {
						Class101.aClass264_1084.method2490(string, i + i_470_, i_471_ + i_344_, i_479_, -16777216, 1321352583);
					}
					if (1 == i_480_) {
						Class101.aClass264_1084.method2477(string, i + i_470_, i_471_ + i_344_, i_479_, -16777216, -1953789277 * GameClient.anInt8777, -239335762);
					}
					if (2 == i_480_) {
						Class101.aClass264_1084.method2478(string, i_470_ + i, i_471_ + i_344_, i_479_, -16777216, GameClient.anInt8777 * -1953789277, (byte) -50);
					}
					if (i_480_ == 3) {
						int i_481_ = 150 - GameClient.aOverheadStringArray8657[i_469_].method722(-2037980380) * 150 / GameClient.aOverheadStringArray8657[i_469_].method723((short) 107);
						Class101.aClass264_1084.method2479(string, i_470_ + i, i_471_ + i_344_, i_479_, -16777216, GameClient.anInt8777 * -1953789277, i_481_, (byte) 120);
					}
					if (i_480_ == 4) {
						int i_482_ = 150 - GameClient.aOverheadStringArray8657[i_469_].method722(-1700086542) * 150 / GameClient.aOverheadStringArray8657[i_469_].method723((short) -15372);
						int i_483_ = i_482_ * (Class82_Sub19_Sub1.aClass505_9111.method6264(string, 2139584778) + 100) / 150;
						OverlayType.activeToolkit.o(i_470_ + i - 50, i_344_, i + i_470_ + 50, i_344_ + i_346_);
						Class101.aClass264_1084.method2488(string, 50 + i_470_ + i - i_483_, i_344_ + i_471_, i_479_, -16777216, 766607406);
						OverlayType.activeToolkit.r(i, i_344_, i + i_345_, i_346_ + i_344_);
					}
					if (i_480_ == 5) {
						int i_484_ = 150 - GameClient.aOverheadStringArray8657[i_469_].method722(-2069698200) * 150 / GameClient.aOverheadStringArray8657[i_469_].method723((short) -28873);
						int i_485_ = 0;
						if (i_484_ < 25) {
							i_485_ = i_484_ - 25;
						} else if (i_484_ > 125) {
							i_485_ = i_484_ - 125;
						}
						int i_486_ = Class82_Sub19_Sub1.aClass505_9111.anInt6202 * 1110385787 + -1883958527 * Class82_Sub19_Sub1.aClass505_9111.anInt6197;
						OverlayType.activeToolkit.o(i, i_344_ + i_471_ - i_486_ - 1, i_345_ + i, i_471_ + i_344_ + 5);
						Class101.aClass264_1084.method2490(string, i + i_470_, i_485_ + i_344_ + i_471_, i_479_, -16777216, -773482636);
						OverlayType.activeToolkit.r(i, i_344_, i_345_ + i, i_344_ + i_346_);
					}
				} else {
					Class101.aClass264_1084.method2490(string, i_470_ + i, i_344_ + i_471_, -256, -16777216, 1698336532);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kb.jm(").append(')').toString());
		}
	}

	public static int method2233(int i, int i_487_, int i_488_, short i_489_) {
		try {
			i_488_ &= 0x3;
			if (0 == i_488_) {
				return i_487_;
			}
			if (i_488_ == 1) {
				return 4095 - i;
			}
			if (i_488_ == 2) {
				return 4095 - i_487_;
			}
			return i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("kb.p(").append(')').toString());
		}
	}
}