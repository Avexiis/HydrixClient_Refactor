/* ModelPart_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.OpenGL;

public class ModelPart_Sub2 extends ModelPart {
	static boolean aBoolean7817;
	static int anInt7818 = 7;
	static int anInt7819 = 1;
	Interface2 anInterface2_7820;
	static int anInt7821 = 4;
	static int anInt7822 = 8;
	static int anInt7823 = 16;
	Class_ra_Sub2 aClass_ra_Sub2_7824;
	Class85[] aClass85Array7825;
	int anInt7826;
	byte aByte7827;
	short aShort7828;
	short[] aShortArray7829;
	short[] aShortArray7830;
	Class32 aClass32_7831;
	int anInt7832;
	int anInt7833;
	int[] vertices_x;
	int[] vertices_y;
	int[] vertices_z;
	int[][] verticesByLabel;
	short[] aShortArray7838;
	int anInt7839;
	boolean aBoolean7840 = false;
	short[] aShortArray7841;
	short[] aShortArray7842;
	boolean aBoolean7843;
	Class67 aClass67_7844;
	float[] aFloatArray7845;
	float[] aFloatArray7846;
	int anInt7847;
	static int[] anIntArray7848;
	short[] aShortArray7849;
	byte[] aByteArray7850;
	short[] aShortArray7851;
	short[] aShortArray7852;
	short[] aShortArray7853;
	int[] anIntArray7854;
	int[][] anIntArrayArray7855;
	short[] aShortArray7856;
	MagnetConfig[] aMagnetConfigArray7857;
	Class32 aClass32_7858;
	int[] anIntArray7859;
	Class32 aClass32_7860;
	short[] aShortArray7861;
	boolean aBoolean7862 = false;
	int anInt7863;
	boolean aBoolean7864;
	int anInt7865;
	static int origin_y;
	static int[] anIntArray7867;
	short aShort7868;
	short aShort7869;
	short aShort7870;
	short aShort7871;
	short aShort7872;
	Interface1 anInterface1_7873;
	short aShort7874;
	Class36[] aClass36Array7875;
	short aShort7876;
	int anInt7877;
	static int anInt7878 = 2;
	Class41 aClass41_7879;
	Class54[] aClass54Array7880;
	static int anInt7881 = 4;
	int[][] anIntArrayArray7882;
	static long[] aLongArray7883;
	static float[] aFloatArray7884 = new float[2];
	int anInt7885;
	static int[] anIntArray7886;
	byte[] aByteArray7887;
	static int origin_x;
	Class32 aClass32_7889;
	static int origin_z;
	int anInt7891;

	@Override
	public void pa(int i, int i_0_, Ground ground, Ground ground_1_, int i_2_, int i_3_, int i_4_) {
		if (!aBoolean7843) {
			method4831();
		}
		int i_5_ = i_2_ + aShort7870;
		int i_6_ = i_2_ + aShort7871;
		int i_7_ = i_4_ + aShort7872;
		int i_8_ = i_4_ + aShort7876;
		if (i != 1 && i != 2 && i != 3 && i != 5 || i_5_ >= 0 && i_6_ + ground.anInt6288 * -1212653763 >> ground.anInt6289 * -2137349879 < ground.anInt6287 * -506105871 && i_7_ >= 0 && i_8_ + ground.anInt6288 * -1212653763 >> ground.anInt6289 * -2137349879 < ground.anInt6286 * -1148794921) {
			if (i == 4 || i == 5) {
				if (ground_1_ == null || i_5_ < 0 || i_6_ + ground_1_.anInt6288 * -1212653763 >> ground_1_.anInt6289 * -2137349879 >= ground_1_.anInt6287 * -506105871 || i_7_ < 0 || i_8_ + ground_1_.anInt6288 * -1212653763 >> ground_1_.anInt6289 * -2137349879 >= ground_1_.anInt6286 * -1148794921) {
					return;
				}
			} else {
				i_5_ >>= ground.anInt6289 * -2137349879;
				i_6_ = i_6_ + ground.anInt6288 * -1212653763 - 1 >> ground.anInt6289 * -2137349879;
				i_7_ >>= ground.anInt6289 * -2137349879;
				i_8_ = i_8_ + ground.anInt6288 * -1212653763 - 1 >> ground.anInt6289 * -2137349879;
				if (ground.method6341(i_5_, i_7_, (byte) -6) == i_3_ && ground.method6341(i_6_, i_7_, (byte) -91) == i_3_ && ground.method6341(i_5_, i_8_, (byte) -30) == i_3_ && ground.method6341(i_6_, i_8_, (byte) -65) == i_3_) {
					return;
				}
			}
			if (i == 1) {
				for (int i_9_ = 0; i_9_ < anInt7833; i_9_++) {
					vertices_y[i_9_] = vertices_y[i_9_] + ground.method6340(vertices_x[i_9_] + i_2_, vertices_z[i_9_] + i_4_, -1779061199) - i_3_;
				}
			} else if (i == 2) {
				int i_10_ = aShort7868;
				if (i_10_ == 0) {
					return;
				}
				for (int i_11_ = 0; i_11_ < anInt7833; i_11_++) {
					int i_12_ = (vertices_y[i_11_] << 16) / i_10_;
					if (i_12_ < i_0_) {
						vertices_y[i_11_] = vertices_y[i_11_] + (ground.method6340(vertices_x[i_11_] + i_2_, vertices_z[i_11_] + i_4_, -1741700419) - i_3_) * (i_0_ - i_12_) / i_0_;
					}
				}
			} else if (i == 3) {
				int i_13_ = (i_0_ & 0xff) * 4;
				int i_14_ = (i_0_ >> 8 & 0xff) * 4;
				int i_15_ = (i_0_ >> 16 & 0xff) << 6;
				int i_16_ = (i_0_ >> 24 & 0xff) << 6;
				if (i_2_ - (i_13_ >> 1) < 0 || i_2_ + (i_13_ >> 1) + ground.anInt6288 * -1212653763 >= ground.anInt6287 * -506105871 << ground.anInt6289 * -2137349879 || i_4_ - (i_14_ >> 1) < 0 || i_4_ + (i_14_ >> 1) + ground.anInt6288 * -1212653763 >= ground.anInt6286 * -1148794921 << ground.anInt6289 * -2137349879) {
					return;
				}
				method4732(ground, i_2_, i_3_, i_4_, i_13_, i_14_, i_15_, i_16_);
			} else if (i == 4) {
				int i_17_ = aShort7874 - aShort7868;
				for (int i_18_ = 0; i_18_ < anInt7833; i_18_++) {
					vertices_y[i_18_] = vertices_y[i_18_] + ground_1_.method6340(vertices_x[i_18_] + i_2_, vertices_z[i_18_] + i_4_, -1374072813) - i_3_ + i_17_;
				}
			} else if (i == 5) {
				int i_19_ = aShort7874 - aShort7868;
				for (int i_20_ = 0; i_20_ < anInt7833; i_20_++) {
					int i_21_ = vertices_x[i_20_] + i_2_;
					int i_22_ = vertices_z[i_20_] + i_4_;
					int i_23_ = ground.method6340(i_21_, i_22_, -1873469750);
					int i_24_ = ground_1_.method6340(i_21_, i_22_, -1430938498);
					int i_25_ = i_23_ - i_24_ - i_0_;
					vertices_y[i_20_] = ((vertices_y[i_20_] << 8) / i_19_ * i_25_ >> 8) - (i_3_ - i_23_);
				}
			}
			if (aClass32_7831 != null) {
				aClass32_7831.anInterface1_397 = null;
			}
			aBoolean7843 = false;
		}
	}

	@Override
	public int AA() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7872;
	}

	@Override
	public void method4779(ModelPart modelPart, int i, int i_26_, int i_27_, boolean bool) {
		ModelPart_Sub2 class387_sub2_28_ = (ModelPart_Sub2) modelPart;
		if (anInt7847 != 0 && class387_sub2_28_.anInt7847 != 0) {
			int i_29_ = class387_sub2_28_.anInt7833;
			int[] is = class387_sub2_28_.vertices_x;
			int[] is_30_ = class387_sub2_28_.vertices_y;
			int[] is_31_ = class387_sub2_28_.vertices_z;
			short[] is_32_ = class387_sub2_28_.aShortArray7829;
			short[] is_33_ = class387_sub2_28_.aShortArray7841;
			short[] is_34_ = class387_sub2_28_.aShortArray7842;
			byte[] is_35_ = class387_sub2_28_.aByteArray7887;
			short[] is_36_;
			short[] is_37_;
			short[] is_38_;
			byte[] is_39_;
			if (aClass67_7844 != null) {
				is_36_ = aClass67_7844.aShortArray669;
				is_37_ = aClass67_7844.aShortArray668;
				is_38_ = aClass67_7844.aShortArray667;
				is_39_ = aClass67_7844.aByteArray670;
			} else {
				is_36_ = null;
				is_37_ = null;
				is_38_ = null;
				is_39_ = null;
			}
			short[] is_40_;
			short[] is_41_;
			short[] is_42_;
			byte[] is_43_;
			if (class387_sub2_28_.aClass67_7844 != null) {
				is_40_ = class387_sub2_28_.aClass67_7844.aShortArray669;
				is_41_ = class387_sub2_28_.aClass67_7844.aShortArray668;
				is_42_ = class387_sub2_28_.aClass67_7844.aShortArray667;
				is_43_ = class387_sub2_28_.aClass67_7844.aByteArray670;
			} else {
				is_40_ = null;
				is_41_ = null;
				is_42_ = null;
				is_43_ = null;
			}
			int[] is_44_ = class387_sub2_28_.anIntArray7854;
			short[] is_45_ = class387_sub2_28_.aShortArray7830;
			if (!class387_sub2_28_.aBoolean7843) {
				class387_sub2_28_.method4831();
			}
			int i_46_ = class387_sub2_28_.aShort7868;
			int i_47_ = class387_sub2_28_.aShort7874;
			int i_48_ = class387_sub2_28_.aShort7870;
			int i_49_ = class387_sub2_28_.aShort7871;
			int i_50_ = class387_sub2_28_.aShort7872;
			int i_51_ = class387_sub2_28_.aShort7876;
			for (int i_52_ = 0; i_52_ < anInt7833; i_52_++) {
				int i_53_ = vertices_y[i_52_] - i_26_;
				if (i_53_ >= i_46_ && i_53_ <= i_47_) {
					int i_54_ = vertices_x[i_52_] - i;
					if (i_54_ >= i_48_ && i_54_ <= i_49_) {
						int i_55_ = vertices_z[i_52_] - i_27_;
						if (i_55_ >= i_50_ && i_55_ <= i_51_) {
							int i_56_ = -1;
							int i_57_ = anIntArray7854[i_52_];
							int i_58_ = anIntArray7854[i_52_ + 1];
							for (int i_59_ = i_57_; i_59_ < i_58_; i_59_++) {
								i_56_ = aShortArray7830[i_59_] - 1;
								if (i_56_ == -1 || aByteArray7887[i_56_] != 0) {
									break;
								}
							}
							if (i_56_ != -1) {
								for (int i_60_ = 0; i_60_ < i_29_; i_60_++) {
									if (i_54_ == is[i_60_] && i_55_ == is_31_[i_60_] && i_53_ == is_30_[i_60_]) {
										int i_61_ = -1;
										i_57_ = is_44_[i_60_];
										i_58_ = is_44_[i_60_ + 1];
										for (int i_62_ = i_57_; i_62_ < i_58_; i_62_++) {
											i_61_ = is_45_[i_62_] - 1;
											if (i_61_ == -1 || is_35_[i_61_] != 0) {
												break;
											}
										}
										if (i_61_ != -1) {
											if (is_36_ == null) {
												aClass67_7844 = new Class67();
												is_36_ = aClass67_7844.aShortArray669 = Class378.method4670(aShortArray7829, (byte) -2);
												is_37_ = aClass67_7844.aShortArray668 = Class378.method4670(aShortArray7841, (byte) -56);
												is_38_ = aClass67_7844.aShortArray667 = Class378.method4670(aShortArray7842, (byte) -66);
												is_39_ = aClass67_7844.aByteArray670 = Class409.method4978(aByteArray7887, 1194497584);
											}
											if (is_40_ == null) {
												Class67 class67 = class387_sub2_28_.aClass67_7844 = new Class67();
												is_40_ = class67.aShortArray669 = Class378.method4670(is_32_, (byte) -122);
												is_41_ = class67.aShortArray668 = Class378.method4670(is_33_, (byte) -108);
												is_42_ = class67.aShortArray667 = Class378.method4670(is_34_, (byte) -74);
												is_43_ = class67.aByteArray670 = Class409.method4978(is_35_, 1194497584);
											}
											short i_63_ = aShortArray7829[i_56_];
											short i_64_ = aShortArray7841[i_56_];
											short i_65_ = aShortArray7842[i_56_];
											byte i_66_ = aByteArray7887[i_56_];
											i_57_ = is_44_[i_60_];
											i_58_ = is_44_[i_60_ + 1];
											for (int i_67_ = i_57_; i_67_ < i_58_; i_67_++) {
												int i_68_ = is_45_[i_67_] - 1;
												if (i_68_ == -1) {
													break;
												}
												if (is_43_[i_68_] != 0) {
													is_40_[i_68_] += i_63_;
													is_41_[i_68_] += i_64_;
													is_42_[i_68_] += i_65_;
													is_43_[i_68_] += i_66_;
												}
											}
											i_63_ = is_32_[i_61_];
											i_64_ = is_33_[i_61_];
											i_65_ = is_34_[i_61_];
											i_66_ = is_35_[i_61_];
											i_57_ = anIntArray7854[i_52_];
											i_58_ = anIntArray7854[i_52_ + 1];
											for (int i_69_ = i_57_; i_69_ < i_58_; i_69_++) {
												int i_70_ = aShortArray7830[i_69_] - 1;
												if (i_70_ == -1) {
													break;
												}
												if (is_39_[i_70_] != 0) {
													is_36_[i_70_] += i_63_;
													is_37_[i_70_] += i_64_;
													is_38_[i_70_] += i_65_;
													is_39_[i_70_] += i_66_;
												}
											}
											if (aClass32_7889 == null && aClass32_7858 != null) {
												aClass32_7858.anInterface1_397 = null;
											}
											if (aClass32_7889 != null) {
												aClass32_7889.anInterface1_397 = null;
											}
											if (class387_sub2_28_.aClass32_7889 == null && class387_sub2_28_.aClass32_7858 != null) {
												class387_sub2_28_.aClass32_7858.anInterface1_397 = null;
											}
											if (class387_sub2_28_.aClass32_7889 != null) {
												class387_sub2_28_.aClass32_7889.anInterface1_397 = null;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static byte[] method4817(byte[] is, int i) {
		byte[] is_71_ = new byte[i];
		System.arraycopy(is, 0, is_71_, 0, i);
		return is_71_;
	}

	@Override
	public Class_na ct(Class_na class_na) {
		if (anInt7839 == 0) {
			return null;
		}
		if (!aBoolean7843) {
			method4831();
		}
		int i;
		int i_72_;
		if (aClass_ra_Sub2_7824.anInt8066 > 0) {
			i = aShort7870 - (aShort7874 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_72_ = aShort7871 - (aShort7868 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		} else {
			i = aShort7870 - (aShort7868 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_72_ = aShort7871 - (aShort7874 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		}
		int i_73_;
		int i_74_;
		if (aClass_ra_Sub2_7824.anInt8026 > 0) {
			i_73_ = aShort7872 - (aShort7874 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_74_ = aShort7876 - (aShort7868 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		} else {
			i_73_ = aShort7872 - (aShort7868 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_74_ = aShort7876 - (aShort7874 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		}
		int i_75_ = i_72_ - i + 1;
		int i_76_ = i_74_ - i_73_ + 1;
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_77_;
		if (class_na_sub1 != null && class_na_sub1.method3481(i_75_, i_76_)) {
			class_na_sub1_77_ = class_na_sub1;
			class_na_sub1_77_.method3482();
		} else {
			class_na_sub1_77_ = new Class_na_Sub1(aClass_ra_Sub2_7824, i_75_, i_76_);
		}
		class_na_sub1_77_.method3485(i, i_73_, i_72_, i_74_);
		method4822(class_na_sub1_77_);
		return class_na_sub1_77_;
	}

	static float[] method4818(float[] fs, int i) {
		float[] fs_78_ = new float[i];
		System.arraycopy(fs, 0, fs_78_, 0, i);
		return fs_78_;
	}

	@Override
	public int m() {
		return anInt7863;
	}

	@Override
	public void KA(int i) {
		anInt7863 = i;
		if (aClass67_7844 != null && (anInt7863 & 0x10000) == 0) {
			aShortArray7829 = aClass67_7844.aShortArray669;
			aShortArray7841 = aClass67_7844.aShortArray668;
			aShortArray7842 = aClass67_7844.aShortArray667;
			aByteArray7887 = aClass67_7844.aByteArray670;
			aClass67_7844 = null;
		}
		aBoolean7864 = true;
		method4820();
	}

	@Override
	public MagnetConfig[] method4775() {
		return aMagnetConfigArray7857;
	}

	ModelPart method4819(ModelPart_Sub2 class387_sub2_79_, ModelPart_Sub2 class387_sub2_80_, int i, boolean bool, boolean bool_81_) {
		class387_sub2_79_.aByte7827 = (byte) 0;
		class387_sub2_79_.anInt7863 = i;
		class387_sub2_79_.anInt7826 = anInt7826;
		class387_sub2_79_.aShort7828 = aShort7828;
		class387_sub2_79_.aShort7869 = aShort7869;
		class387_sub2_79_.anInt7832 = anInt7832;
		class387_sub2_79_.anInt7833 = anInt7833;
		class387_sub2_79_.anInt7839 = anInt7839;
		class387_sub2_79_.anInt7847 = anInt7847;
		class387_sub2_79_.anInt7885 = anInt7885;
		class387_sub2_79_.anInt7877 = anInt7877;
		if ((i & 0x100) != 0) {
			class387_sub2_79_.aBoolean7840 = true;
		} else {
			class387_sub2_79_.aBoolean7840 = aBoolean7840;
		}
		class387_sub2_79_.aBoolean7862 = aBoolean7862;
		boolean bool_82_ = Class38.method443(i, anInt7826);
		boolean bool_83_ = Class38.method444(i, anInt7826);
		boolean bool_84_ = Class38.method445(i, anInt7826);
		boolean bool_85_ = bool_82_ | bool_83_ | bool_84_;
		if (bool_85_) {
			if (bool_82_) {
				if (class387_sub2_80_.vertices_x == null || class387_sub2_80_.vertices_x.length < anInt7832) {
					class387_sub2_79_.vertices_x = class387_sub2_80_.vertices_x = new int[anInt7832];
				} else {
					class387_sub2_79_.vertices_x = class387_sub2_80_.vertices_x;
				}
			} else {
				class387_sub2_79_.vertices_x = vertices_x;
			}
			if (bool_83_) {
				if (class387_sub2_80_.vertices_y == null || class387_sub2_80_.vertices_y.length < anInt7832) {
					class387_sub2_79_.vertices_y = class387_sub2_80_.vertices_y = new int[anInt7832];
				} else {
					class387_sub2_79_.vertices_y = class387_sub2_80_.vertices_y;
				}
			} else {
				class387_sub2_79_.vertices_y = vertices_y;
			}
			if (bool_84_) {
				if (class387_sub2_80_.vertices_z == null || class387_sub2_80_.vertices_z.length < anInt7832) {
					class387_sub2_79_.vertices_z = class387_sub2_80_.vertices_z = new int[anInt7832];
				} else {
					class387_sub2_79_.vertices_z = class387_sub2_80_.vertices_z;
				}
			} else {
				class387_sub2_79_.vertices_z = vertices_z;
			}
			for (int i_86_ = 0; i_86_ < anInt7832; i_86_++) {
				if (bool_82_) {
					class387_sub2_79_.vertices_x[i_86_] = vertices_x[i_86_];
				}
				if (bool_83_) {
					class387_sub2_79_.vertices_y[i_86_] = vertices_y[i_86_];
				}
				if (bool_84_) {
					class387_sub2_79_.vertices_z[i_86_] = vertices_z[i_86_];
				}
			}
		} else {
			class387_sub2_79_.vertices_x = vertices_x;
			class387_sub2_79_.vertices_y = vertices_y;
			class387_sub2_79_.vertices_z = vertices_z;
		}
		if (Class38.method457(i, anInt7826)) {
			if (bool) {
				class387_sub2_79_.aByte7827 |= 0x1;
			}
			class387_sub2_79_.aClass32_7831 = class387_sub2_80_.aClass32_7831;
			class387_sub2_79_.aClass32_7831.aByte398 = aClass32_7831.aByte398;
			class387_sub2_79_.aClass32_7831.anInterface1_397 = aClass32_7831.anInterface1_397;
		} else if (Class38.method471(i, anInt7826)) {
			class387_sub2_79_.aClass32_7831 = aClass32_7831;
		} else {
			class387_sub2_79_.aClass32_7831 = null;
		}
		if (Class38.method448(i, anInt7826)) {
			if (class387_sub2_80_.aShortArray7849 == null || class387_sub2_80_.aShortArray7849.length < anInt7847) {
				class387_sub2_79_.aShortArray7849 = class387_sub2_80_.aShortArray7849 = new short[anInt7847];
			} else {
				class387_sub2_79_.aShortArray7849 = class387_sub2_80_.aShortArray7849;
			}
			for (int i_87_ = 0; i_87_ < anInt7847; i_87_++) {
				class387_sub2_79_.aShortArray7849[i_87_] = aShortArray7849[i_87_];
			}
		} else {
			class387_sub2_79_.aShortArray7849 = aShortArray7849;
		}
		if (Class38.method467(i, anInt7826)) {
			if (class387_sub2_80_.aByteArray7850 == null || class387_sub2_80_.aByteArray7850.length < anInt7847) {
				class387_sub2_79_.aByteArray7850 = class387_sub2_80_.aByteArray7850 = new byte[anInt7847];
			} else {
				class387_sub2_79_.aByteArray7850 = class387_sub2_80_.aByteArray7850;
			}
			for (int i_88_ = 0; i_88_ < anInt7847; i_88_++) {
				class387_sub2_79_.aByteArray7850[i_88_] = aByteArray7850[i_88_];
			}
		} else {
			class387_sub2_79_.aByteArray7850 = aByteArray7850;
		}
		if (Class38.method470(i, anInt7826)) {
			if (bool) {
				class387_sub2_79_.aByte7827 |= 0x2;
			}
			class387_sub2_79_.aClass32_7858 = class387_sub2_80_.aClass32_7858;
			class387_sub2_79_.aClass32_7858.aByte398 = aClass32_7858.aByte398;
			class387_sub2_79_.aClass32_7858.anInterface1_397 = aClass32_7858.anInterface1_397;
		} else if (Class38.method458(i, anInt7826)) {
			class387_sub2_79_.aClass32_7858 = aClass32_7858;
		} else {
			class387_sub2_79_.aClass32_7858 = null;
		}
		if (Class38.method474(i, anInt7826)) {
			if (class387_sub2_80_.aShortArray7829 == null || class387_sub2_80_.aShortArray7829.length < anInt7839) {
				int i_89_ = anInt7839;
				class387_sub2_79_.aShortArray7829 = class387_sub2_80_.aShortArray7829 = new short[i_89_];
				class387_sub2_79_.aShortArray7841 = class387_sub2_80_.aShortArray7841 = new short[i_89_];
				class387_sub2_79_.aShortArray7842 = class387_sub2_80_.aShortArray7842 = new short[i_89_];
			} else {
				class387_sub2_79_.aShortArray7829 = class387_sub2_80_.aShortArray7829;
				class387_sub2_79_.aShortArray7841 = class387_sub2_80_.aShortArray7841;
				class387_sub2_79_.aShortArray7842 = class387_sub2_80_.aShortArray7842;
			}
			if (aClass67_7844 != null) {
				if (class387_sub2_80_.aClass67_7844 == null) {
					class387_sub2_80_.aClass67_7844 = new Class67();
				}
				Class67 class67 = class387_sub2_79_.aClass67_7844 = class387_sub2_80_.aClass67_7844;
				if (class67.aShortArray669 == null || class67.aShortArray669.length < anInt7839) {
					int i_90_ = anInt7839;
					class67.aShortArray669 = new short[i_90_];
					class67.aShortArray668 = new short[i_90_];
					class67.aShortArray667 = new short[i_90_];
					class67.aByteArray670 = new byte[i_90_];
				}
				for (int i_91_ = 0; i_91_ < anInt7839; i_91_++) {
					class387_sub2_79_.aShortArray7829[i_91_] = aShortArray7829[i_91_];
					class387_sub2_79_.aShortArray7841[i_91_] = aShortArray7841[i_91_];
					class387_sub2_79_.aShortArray7842[i_91_] = aShortArray7842[i_91_];
					class67.aShortArray669[i_91_] = aClass67_7844.aShortArray669[i_91_];
					class67.aShortArray668[i_91_] = aClass67_7844.aShortArray668[i_91_];
					class67.aShortArray667[i_91_] = aClass67_7844.aShortArray667[i_91_];
					class67.aByteArray670[i_91_] = aClass67_7844.aByteArray670[i_91_];
				}
			} else {
				for (int i_92_ = 0; i_92_ < anInt7839; i_92_++) {
					class387_sub2_79_.aShortArray7829[i_92_] = aShortArray7829[i_92_];
					class387_sub2_79_.aShortArray7841[i_92_] = aShortArray7841[i_92_];
					class387_sub2_79_.aShortArray7842[i_92_] = aShortArray7842[i_92_];
				}
			}
			class387_sub2_79_.aByteArray7887 = aByteArray7887;
		} else {
			class387_sub2_79_.aClass67_7844 = aClass67_7844;
			class387_sub2_79_.aShortArray7829 = aShortArray7829;
			class387_sub2_79_.aShortArray7841 = aShortArray7841;
			class387_sub2_79_.aShortArray7842 = aShortArray7842;
			class387_sub2_79_.aByteArray7887 = aByteArray7887;
		}
		if (Class38.method464(i, anInt7826)) {
			if (bool) {
				class387_sub2_79_.aByte7827 |= 0x4;
			}
			class387_sub2_79_.aClass32_7889 = class387_sub2_80_.aClass32_7889;
			class387_sub2_79_.aClass32_7889.aByte398 = aClass32_7889.aByte398;
			class387_sub2_79_.aClass32_7889.anInterface1_397 = aClass32_7889.anInterface1_397;
		} else if (Class38.method475(i, anInt7826)) {
			class387_sub2_79_.aClass32_7889 = aClass32_7889;
		} else {
			class387_sub2_79_.aClass32_7889 = null;
		}
		if (Class38.method450(i, anInt7826)) {
			if (class387_sub2_80_.aFloatArray7845 == null || class387_sub2_80_.aFloatArray7845.length < anInt7847) {
				int i_93_ = anInt7839;
				class387_sub2_79_.aFloatArray7845 = class387_sub2_80_.aFloatArray7845 = new float[i_93_];
				class387_sub2_79_.aFloatArray7846 = class387_sub2_80_.aFloatArray7846 = new float[i_93_];
			} else {
				class387_sub2_79_.aFloatArray7845 = class387_sub2_80_.aFloatArray7845;
				class387_sub2_79_.aFloatArray7846 = class387_sub2_80_.aFloatArray7846;
			}
			for (int i_94_ = 0; i_94_ < anInt7839; i_94_++) {
				class387_sub2_79_.aFloatArray7845[i_94_] = aFloatArray7845[i_94_];
				class387_sub2_79_.aFloatArray7846[i_94_] = aFloatArray7846[i_94_];
			}
		} else {
			class387_sub2_79_.aFloatArray7845 = aFloatArray7845;
			class387_sub2_79_.aFloatArray7846 = aFloatArray7846;
		}
		if (Class38.method476(i, anInt7826)) {
			if (bool) {
				class387_sub2_79_.aByte7827 |= 0x8;
			}
			class387_sub2_79_.aClass32_7860 = class387_sub2_80_.aClass32_7860;
			class387_sub2_79_.aClass32_7860.aByte398 = aClass32_7860.aByte398;
			class387_sub2_79_.aClass32_7860.anInterface1_397 = aClass32_7860.anInterface1_397;
		} else if (Class38.method455(i, anInt7826)) {
			class387_sub2_79_.aClass32_7860 = aClass32_7860;
		} else {
			class387_sub2_79_.aClass32_7860 = null;
		}
		if (Class38.method468(i, anInt7826)) {
			if (class387_sub2_80_.aShortArray7851 == null || class387_sub2_80_.aShortArray7851.length < anInt7847) {
				int i_95_ = anInt7847;
				class387_sub2_79_.aShortArray7851 = class387_sub2_80_.aShortArray7851 = new short[i_95_];
				class387_sub2_79_.aShortArray7852 = class387_sub2_80_.aShortArray7852 = new short[i_95_];
				class387_sub2_79_.aShortArray7853 = class387_sub2_80_.aShortArray7853 = new short[i_95_];
			} else {
				class387_sub2_79_.aShortArray7851 = class387_sub2_80_.aShortArray7851;
				class387_sub2_79_.aShortArray7852 = class387_sub2_80_.aShortArray7852;
				class387_sub2_79_.aShortArray7853 = class387_sub2_80_.aShortArray7853;
			}
			for (int i_96_ = 0; i_96_ < anInt7847; i_96_++) {
				class387_sub2_79_.aShortArray7851[i_96_] = aShortArray7851[i_96_];
				class387_sub2_79_.aShortArray7852[i_96_] = aShortArray7852[i_96_];
				class387_sub2_79_.aShortArray7853[i_96_] = aShortArray7853[i_96_];
			}
		} else {
			class387_sub2_79_.aShortArray7851 = aShortArray7851;
			class387_sub2_79_.aShortArray7852 = aShortArray7852;
			class387_sub2_79_.aShortArray7853 = aShortArray7853;
		}
		if (Class38.method447(i, anInt7826)) {
			if (bool) {
				class387_sub2_79_.aByte7827 |= 0x10;
			}
			class387_sub2_79_.aClass41_7879 = class387_sub2_80_.aClass41_7879;
			class387_sub2_79_.aClass41_7879.anInterface2_441 = aClass41_7879.anInterface2_441;
		} else if (Class38.method456(i, anInt7826)) {
			class387_sub2_79_.aClass41_7879 = aClass41_7879;
		} else {
			class387_sub2_79_.aClass41_7879 = null;
		}
		if (Class38.method451(i, anInt7826)) {
			if (class387_sub2_80_.aShortArray7861 == null || class387_sub2_80_.aShortArray7861.length < anInt7847) {
				int i_97_ = anInt7847;
				class387_sub2_79_.aShortArray7861 = class387_sub2_80_.aShortArray7861 = new short[i_97_];
			} else {
				class387_sub2_79_.aShortArray7861 = class387_sub2_80_.aShortArray7861;
			}
			for (int i_98_ = 0; i_98_ < anInt7847; i_98_++) {
				class387_sub2_79_.aShortArray7861[i_98_] = aShortArray7861[i_98_];
			}
		} else {
			class387_sub2_79_.aShortArray7861 = aShortArray7861;
		}
		if (Class38.method452(i, anInt7826)) {
			if (class387_sub2_80_.aClass36Array7875 == null || class387_sub2_80_.aClass36Array7875.length < anInt7877) {
				int i_99_ = anInt7877;
				class387_sub2_79_.aClass36Array7875 = class387_sub2_80_.aClass36Array7875 = new Class36[i_99_];
				for (int i_100_ = 0; i_100_ < anInt7877; i_100_++) {
					class387_sub2_79_.aClass36Array7875[i_100_] = aClass36Array7875[i_100_].method442();
				}
			} else {
				class387_sub2_79_.aClass36Array7875 = class387_sub2_80_.aClass36Array7875;
				for (int i_101_ = 0; i_101_ < anInt7877; i_101_++) {
					class387_sub2_79_.aClass36Array7875[i_101_].method441(aClass36Array7875[i_101_]);
				}
			}
		} else {
			class387_sub2_79_.aClass36Array7875 = aClass36Array7875;
		}
		class387_sub2_79_.aClass54Array7880 = aClass54Array7880;
		if (aBoolean7843) {
			class387_sub2_79_.anInt7865 = anInt7865;
			class387_sub2_79_.anInt7891 = anInt7891;
			class387_sub2_79_.aShort7870 = aShort7870;
			class387_sub2_79_.aShort7871 = aShort7871;
			class387_sub2_79_.aShort7868 = aShort7868;
			class387_sub2_79_.aShort7874 = aShort7874;
			class387_sub2_79_.aShort7872 = aShort7872;
			class387_sub2_79_.aShort7876 = aShort7876;
			class387_sub2_79_.aBoolean7843 = true;
		} else {
			class387_sub2_79_.aBoolean7843 = false;
		}
		class387_sub2_79_.verticesByLabel = verticesByLabel;
		class387_sub2_79_.anIntArrayArray7855 = anIntArrayArray7855;
		class387_sub2_79_.anIntArrayArray7882 = anIntArrayArray7882;
		class387_sub2_79_.aShortArray7830 = aShortArray7830;
		class387_sub2_79_.anIntArray7854 = anIntArray7854;
		class387_sub2_79_.aShortArray7838 = aShortArray7838;
		class387_sub2_79_.aShortArray7856 = aShortArray7856;
		class387_sub2_79_.anIntArray7859 = anIntArray7859;
		class387_sub2_79_.aClass85Array7825 = aClass85Array7825;
		class387_sub2_79_.aMagnetConfigArray7857 = aMagnetConfigArray7857;
		return class387_sub2_79_;
	}

	void method4820() {
		if (aBoolean7864) {
			aBoolean7864 = false;
			if (aClass85Array7825 == null && aMagnetConfigArray7857 == null && aClass54Array7880 == null && !Class38.method446(anInt7863, anInt7826)) {
				boolean bool = false;
				boolean bool_102_ = false;
				boolean bool_103_ = false;
				if (vertices_x != null && !Class38.method469(anInt7863, anInt7826)) {
					if (aClass32_7831 == null || aClass32_7831.anInterface1_397 != null) {
						if (!aBoolean7843) {
							method4831();
						}
						bool = true;
					} else {
						aBoolean7864 = true;
					}
				}
				if (vertices_y != null && !Class38.method460(anInt7863, anInt7826)) {
					if (aClass32_7831 == null || aClass32_7831.anInterface1_397 != null) {
						if (!aBoolean7843) {
							method4831();
						}
						bool_102_ = true;
					} else {
						aBoolean7864 = true;
					}
				}
				if (vertices_z != null && !Class38.method473(anInt7863, anInt7826)) {
					if (aClass32_7831 == null || aClass32_7831.anInterface1_397 != null) {
						if (!aBoolean7843) {
							method4831();
						}
						bool_103_ = true;
					} else {
						aBoolean7864 = true;
					}
				}
				if (bool) {
					vertices_x = null;
				}
				if (bool_102_) {
					vertices_y = null;
				}
				if (bool_103_) {
					vertices_z = null;
				}
			}
			if (aShortArray7830 != null && vertices_x == null && vertices_y == null && vertices_z == null) {
				aShortArray7830 = null;
				anIntArray7854 = null;
			}
			if (aByteArray7887 != null && !Class38.method461(anInt7863, anInt7826)) {
				if (aClass32_7889 != null) {
					if (aClass32_7889.anInterface1_397 != null) {
						aShortArray7842 = null;
						aShortArray7841 = null;
						aShortArray7829 = null;
						aByteArray7887 = null;
					} else {
						aBoolean7864 = true;
					}
				} else if (aClass32_7858 == null || aClass32_7858.anInterface1_397 != null) {
					aShortArray7842 = null;
					aShortArray7841 = null;
					aShortArray7829 = null;
					aByteArray7887 = null;
				} else {
					aBoolean7864 = true;
				}
			}
			if (aShortArray7849 != null && !Class38.method472(anInt7863, anInt7826)) {
				if (aClass32_7858 == null || aClass32_7858.anInterface1_397 != null) {
					aShortArray7849 = null;
				} else {
					aBoolean7864 = true;
				}
			}
			if (aByteArray7850 != null && !Class38.method453(anInt7863, anInt7826)) {
				if (aClass32_7858 == null || aClass32_7858.anInterface1_397 != null) {
					aByteArray7850 = null;
				} else {
					aBoolean7864 = true;
				}
			}
			if (aFloatArray7845 != null && !Class38.method462(anInt7863, anInt7826)) {
				if (aClass32_7860 == null || aClass32_7860.anInterface1_397 != null) {
					aFloatArray7846 = null;
					aFloatArray7845 = null;
				} else {
					aBoolean7864 = true;
				}
			}
			if (aShortArray7861 != null && !Class38.method466(anInt7863, anInt7826)) {
				if (aClass32_7858 == null || aClass32_7858.anInterface1_397 != null) {
					aShortArray7861 = null;
				} else {
					aBoolean7864 = true;
				}
			}
			if (aShortArray7851 != null && !Class38.method449(anInt7863, anInt7826)) {
				if ((aClass41_7879 == null || aClass41_7879.anInterface2_441 != null) && (aClass32_7858 == null || aClass32_7858.anInterface1_397 != null)) {
					aShortArray7853 = null;
					aShortArray7852 = null;
					aShortArray7851 = null;
				} else {
					aBoolean7864 = true;
				}
			}
			if (anIntArrayArray7855 != null && !Class38.method463(anInt7863, anInt7826)) {
				anIntArrayArray7855 = null;
				aShortArray7856 = null;
			}
			if (verticesByLabel != null && !Class38.method459(anInt7863, anInt7826)) {
				verticesByLabel = null;
				aShortArray7838 = null;
			}
			if (anIntArrayArray7882 != null && !Class38.method465(anInt7863, anInt7826)) {
				anIntArrayArray7882 = null;
			}
			if (anIntArray7859 != null && (anInt7863 & 0x800) == 0 && (anInt7863 & 0x40000) == 0) {
				anIntArray7859 = null;
			}
		}
	}

	@Override
	public byte[] ah() {
		return aByteArray7850;
	}

	@Override
	public void S(int i) {
		int i_104_ = Class220.SINE[i];
		int i_105_ = Class220.COSINE[i];
		for (int i_106_ = 0; i_106_ < anInt7833; i_106_++) {
			int i_107_ = vertices_z[i_106_] * i_104_ + vertices_x[i_106_] * i_105_ >> 14;
			vertices_z[i_106_] = vertices_z[i_106_] * i_105_ - vertices_x[i_106_] * i_104_ >> 14;
			vertices_x[i_106_] = i_107_;
		}
		for (int i_108_ = 0; i_108_ < anInt7839; i_108_++) {
			int i_109_ = aShortArray7842[i_108_] * i_104_ + aShortArray7829[i_108_] * i_105_ >> 14;
			aShortArray7842[i_108_] = (short) (aShortArray7842[i_108_] * i_105_ - aShortArray7829[i_108_] * i_104_ >> 14);
			aShortArray7829[i_108_] = (short) i_109_;
		}
		if (aClass32_7889 == null && aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
		if (aClass32_7889 != null) {
			aClass32_7889.anInterface1_397 = null;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void method4739(Matrix43f class222, Class302_Sub1 class302_sub1, int i) {
		if ((i & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (anInt7839 != 0) {
			Class233 class233 = aClass_ra_Sub2_7824.aClass233_8041;
			Class233 class233_110_ = aClass_ra_Sub2_7824.aClass233_8104;
			Class233 class233_111_ = aClass_ra_Sub2_7824.aClass233_8184;
			class233_110_.method2145(class222);
			class233_111_.method2142(class233_110_);
			class233_111_.method2144(aClass_ra_Sub2_7824.aClass233_8069);
			if (!aBoolean7843) {
				method4831();
			}
			float[] fs = aClass_ra_Sub2_7824.aFloatArray8094;
			class233_110_.method2149(0.0F, aShort7868, 0.0F, fs);
			float f = fs[0];
			float f_112_ = fs[1];
			float f_113_ = fs[2];
			class233_110_.method2149(0.0F, aShort7874, 0.0F, fs);
			float f_114_ = fs[0];
			float f_115_ = fs[1];
			float f_116_ = fs[2];
			for (int i_117_ = 0; i_117_ < 6; i_117_++) {
				float[] fs_118_ = aClass_ra_Sub2_7824.aFloatArrayArray8077[i_117_];
				float f_119_ = fs_118_[0] * f + fs_118_[1] * f_112_ + fs_118_[2] * f_113_ + fs_118_[3] + anInt7891;
				float f_120_ = fs_118_[0] * f_114_ + fs_118_[1] * f_115_ + fs_118_[2] * f_116_ + fs_118_[3] + anInt7891;
				if (f_119_ < 0.0F && f_120_ < 0.0F) {
					return;
				}
			}
			if (class302_sub1 != null) {
				boolean bool = false;
				boolean bool_121_ = true;
				int i_122_ = aShort7870 + aShort7871 >> 1;
				int i_123_ = aShort7872 + aShort7876 >> 1;
				int i_124_ = i_122_;
				short i_125_ = aShort7868;
				int i_126_ = i_123_;
				float f_127_ = class233_111_.aFloatArray2594[0] * i_124_ + class233_111_.aFloatArray2594[4] * i_125_ + class233_111_.aFloatArray2594[8] * i_126_ + class233_111_.aFloatArray2594[12];
				float f_128_ = class233_111_.aFloatArray2594[1] * i_124_ + class233_111_.aFloatArray2594[5] * i_125_ + class233_111_.aFloatArray2594[9] * i_126_ + class233_111_.aFloatArray2594[13];
				float f_129_ = class233_111_.aFloatArray2594[2] * i_124_ + class233_111_.aFloatArray2594[6] * i_125_ + class233_111_.aFloatArray2594[10] * i_126_ + class233_111_.aFloatArray2594[14];
				float f_130_ = class233_111_.aFloatArray2594[3] * i_124_ + class233_111_.aFloatArray2594[7] * i_125_ + class233_111_.aFloatArray2594[11] * i_126_ + class233_111_.aFloatArray2594[15];
				if (f_129_ >= -f_130_) {
					class302_sub1.anInt7641 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_127_ / f_130_);
					class302_sub1.anInt7642 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_128_ / f_130_);
				} else {
					bool = true;
				}
				i_124_ = i_122_;
				i_125_ = aShort7874;
				i_126_ = i_123_;
				float f_131_ = class233_111_.aFloatArray2594[0] * i_124_ + class233_111_.aFloatArray2594[4] * i_125_ + class233_111_.aFloatArray2594[8] * i_126_ + class233_111_.aFloatArray2594[12];
				float f_132_ = class233_111_.aFloatArray2594[1] * i_124_ + class233_111_.aFloatArray2594[5] * i_125_ + class233_111_.aFloatArray2594[9] * i_126_ + class233_111_.aFloatArray2594[13];
				float f_133_ = class233_111_.aFloatArray2594[2] * i_124_ + class233_111_.aFloatArray2594[6] * i_125_ + class233_111_.aFloatArray2594[10] * i_126_ + class233_111_.aFloatArray2594[14];
				float f_134_ = class233_111_.aFloatArray2594[3] * i_124_ + class233_111_.aFloatArray2594[7] * i_125_ + class233_111_.aFloatArray2594[11] * i_126_ + class233_111_.aFloatArray2594[15];
				if (f_133_ >= -f_134_) {
					class302_sub1.anInt7643 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_131_ / f_134_);
					class302_sub1.anInt7640 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_132_ / f_134_);
				} else {
					bool = true;
				}
				if (bool) {
					if (f_129_ < -f_130_ && f_133_ < -f_134_) {
						bool_121_ = false;
					} else if (f_129_ < -f_130_) {
						float f_135_ = (f_129_ + f_130_) / (f_133_ + f_134_) - 1.0F;
						float f_136_ = f_127_ + f_135_ * (f_131_ - f_127_);
						float f_137_ = f_128_ + f_135_ * (f_132_ - f_128_);
						float f_138_ = f_130_ + f_135_ * (f_134_ - f_130_);
						class302_sub1.anInt7641 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_136_ / f_138_);
						class302_sub1.anInt7642 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_137_ / f_138_);
					} else if (f_133_ < -f_134_) {
						float f_139_ = (f_133_ + f_134_) / (f_129_ + f_130_) - 1.0F;
						float f_140_ = f_131_ + f_139_ * (f_127_ - f_131_);
						float f_141_ = f_132_ + f_139_ * (f_128_ - f_132_);
						float f_142_ = f_134_ + f_139_ * (f_130_ - f_134_);
						class302_sub1.anInt7643 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_140_ / f_142_);
						class302_sub1.anInt7640 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_141_ / f_142_);
					}
				}
				if (bool_121_) {
					if (f_129_ / f_130_ > f_133_ / f_134_) {
						float f_143_ = f_127_ + class233.aFloatArray2594[0] * anInt7891 + class233.aFloatArray2594[12];
						float f_144_ = f_130_ + class233.aFloatArray2594[3] * anInt7891 + class233.aFloatArray2594[15];
						class302_sub1.anInt7645 = (int) (aClass_ra_Sub2_7824.aFloat8095 - class302_sub1.anInt7641 + aClass_ra_Sub2_7824.aFloat8096 * f_143_ / f_144_);
					} else {
						float f_145_ = f_131_ + class233.aFloatArray2594[0] * anInt7891 + class233.aFloatArray2594[12];
						float f_146_ = f_134_ + class233.aFloatArray2594[3] * anInt7891 + class233.aFloatArray2594[15];
						class302_sub1.anInt7645 = (int) (aClass_ra_Sub2_7824.aFloat8095 - class302_sub1.anInt7643 + aClass_ra_Sub2_7824.aFloat8096 * f_145_ / f_146_);
					}
					class302_sub1.aBoolean7644 = true;
				}
			}
			aClass_ra_Sub2_7824.method5252();
			aClass_ra_Sub2_7824.method5283(class233_110_);
			method4823();
			aClass_ra_Sub2_7824.method5287();
			class233_110_.method2144(aClass_ra_Sub2_7824.aClass233_8110);
			method4824(class233_110_);
			if ((i & 0x2) != 0) {
				OpenGL.glPolygonMode(1028, 6914);
			}
		}
	}

	@Override
	public void EA(int i) {
		int i_147_ = Class220.SINE[i];
		int i_148_ = Class220.COSINE[i];
		for (int i_149_ = 0; i_149_ < anInt7833; i_149_++) {
			int i_150_ = vertices_y[i_149_] * i_147_ + vertices_x[i_149_] * i_148_ >> 14;
			vertices_y[i_149_] = vertices_y[i_149_] * i_148_ - vertices_x[i_149_] * i_147_ >> 14;
			vertices_x[i_149_] = i_150_;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void au(int i) {
		anInt7863 = i;
		if (aClass67_7844 != null && (anInt7863 & 0x10000) == 0) {
			aShortArray7829 = aClass67_7844.aShortArray669;
			aShortArray7841 = aClass67_7844.aShortArray668;
			aShortArray7842 = aClass67_7844.aShortArray667;
			aByteArray7887 = aClass67_7844.aByteArray670;
			aClass67_7844 = null;
		}
		aBoolean7864 = true;
		method4820();
	}

	@Override
	void cw(int i, int i_151_, int i_152_, int i_153_) {
		if (i == 0) {
			int i_154_ = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_155_ = 0; i_155_ < anInt7833; i_155_++) {
				origin_x += vertices_x[i_155_];
				origin_y += vertices_y[i_155_];
				origin_z += vertices_z[i_155_];
				i_154_++;
			}
			if (i_154_ > 0) {
				origin_x = origin_x / i_154_ + i_151_;
				origin_y = origin_y / i_154_ + i_152_;
				origin_z = origin_z / i_154_ + i_153_;
			} else {
				origin_x = i_151_;
				origin_y = i_152_;
				origin_z = i_153_;
			}
		} else if (i == 1) {
			for (int i_156_ = 0; i_156_ < anInt7833; i_156_++) {
				vertices_x[i_156_] += i_151_;
				vertices_y[i_156_] += i_152_;
				vertices_z[i_156_] += i_153_;
			}
		} else if (i == 2) {
			for (int i_157_ = 0; i_157_ < anInt7833; i_157_++) {
				vertices_x[i_157_] -= origin_x;
				vertices_y[i_157_] -= origin_y;
				vertices_z[i_157_] -= origin_z;
				if (i_153_ != 0) {
					int i_158_ = Class220.SINE[i_153_];
					int i_159_ = Class220.COSINE[i_153_];
					int i_160_ = vertices_y[i_157_] * i_158_ + vertices_x[i_157_] * i_159_ + 16383 >> 14;
					vertices_y[i_157_] = vertices_y[i_157_] * i_159_ - vertices_x[i_157_] * i_158_ + 16383 >> 14;
					vertices_x[i_157_] = i_160_;
				}
				if (i_151_ != 0) {
					int i_161_ = Class220.SINE[i_151_];
					int i_162_ = Class220.COSINE[i_151_];
					int i_163_ = vertices_y[i_157_] * i_162_ - vertices_z[i_157_] * i_161_ + 16383 >> 14;
					vertices_z[i_157_] = vertices_y[i_157_] * i_161_ + vertices_z[i_157_] * i_162_ + 16383 >> 14;
					vertices_y[i_157_] = i_163_;
				}
				if (i_152_ != 0) {
					int i_164_ = Class220.SINE[i_152_];
					int i_165_ = Class220.COSINE[i_152_];
					int i_166_ = vertices_z[i_157_] * i_164_ + vertices_x[i_157_] * i_165_ + 16383 >> 14;
					vertices_z[i_157_] = vertices_z[i_157_] * i_165_ - vertices_x[i_157_] * i_164_ + 16383 >> 14;
					vertices_x[i_157_] = i_166_;
				}
				vertices_x[i_157_] += origin_x;
				vertices_y[i_157_] += origin_y;
				vertices_z[i_157_] += origin_z;
			}
		} else if (i == 3) {
			for (int i_167_ = 0; i_167_ < anInt7833; i_167_++) {
				vertices_x[i_167_] -= origin_x;
				vertices_y[i_167_] -= origin_y;
				vertices_z[i_167_] -= origin_z;
				vertices_x[i_167_] = vertices_x[i_167_] * i_151_ / 128;
				vertices_y[i_167_] = vertices_y[i_167_] * i_152_ / 128;
				vertices_z[i_167_] = vertices_z[i_167_] * i_153_ / 128;
				vertices_x[i_167_] += origin_x;
				vertices_y[i_167_] += origin_y;
				vertices_z[i_167_] += origin_z;
			}
		} else if (i == 5) {
			for (int i_168_ = 0; i_168_ < anInt7847; i_168_++) {
				int i_169_ = (aByteArray7850[i_168_] & 0xff) + i_151_ * 8;
				if (i_169_ < 0) {
					i_169_ = 0;
				} else if (i_169_ > 255) {
					i_169_ = 255;
				}
				aByteArray7850[i_168_] = (byte) i_169_;
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
			if (aClass54Array7880 != null) {
				for (int i_170_ = 0; i_170_ < anInt7877; i_170_++) {
					Class54 class54 = aClass54Array7880[i_170_];
					Class36 class36 = aClass36Array7875[i_170_];
					class36.anInt424 = class36.anInt424 & 0xffffff | 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
				}
			}
		} else if (i == 7) {
			for (int i_171_ = 0; i_171_ < anInt7847; i_171_++) {
				int i_172_ = aShortArray7849[i_171_] & 0xffff;
				int i_173_ = i_172_ >> 10 & 0x3f;
				int i_174_ = i_172_ >> 7 & 0x7;
				int i_175_ = i_172_ & 0x7f;
				i_173_ = i_173_ + i_151_ & 0x3f;
				i_174_ += i_152_ / 4;
				if (i_174_ < 0) {
					i_174_ = 0;
				} else if (i_174_ > 7) {
					i_174_ = 7;
				}
				i_175_ += i_153_;
				if (i_175_ < 0) {
					i_175_ = 0;
				} else if (i_175_ > 127) {
					i_175_ = 127;
				}
				aShortArray7849[i_171_] = (short) (i_173_ << 10 | i_174_ << 7 | i_175_);
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
			if (aClass54Array7880 != null) {
				for (int i_176_ = 0; i_176_ < anInt7877; i_176_++) {
					Class54 class54 = aClass54Array7880[i_176_];
					Class36 class36 = aClass36Array7875[i_176_];
					class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
				}
			}
		} else if (i == 8) {
			for (int i_177_ = 0; i_177_ < anInt7877; i_177_++) {
				Class36 class36 = aClass36Array7875[i_177_];
				class36.anInt422 += i_151_;
				class36.anInt419 += i_152_;
			}
		} else if (i == 10) {
			for (int i_178_ = 0; i_178_ < anInt7877; i_178_++) {
				Class36 class36 = aClass36Array7875[i_178_];
				class36.anInt420 = class36.anInt420 * i_151_ >> 7;
				class36.anInt421 = class36.anInt421 * i_152_ >> 7;
			}
		} else if (i == 9) {
			for (int i_179_ = 0; i_179_ < anInt7877; i_179_++) {
				Class36 class36 = aClass36Array7875[i_179_];
				class36.anInt423 = class36.anInt423 + i_151_ & 0x3fff;
			}
		}
	}

	@Override
	void br() {
		for (int i = 0; i < anInt7832; i++) {
			vertices_x[i] = vertices_x[i] + 7 >> 4;
			vertices_y[i] = vertices_y[i] + 7 >> 4;
			vertices_z[i] = vertices_z[i] + 7 >> 4;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void PA(int i, int i_180_, int i_181_, int i_182_) {
		for (int i_183_ = 0; i_183_ < anInt7847; i_183_++) {
			int i_184_ = aShortArray7849[i_183_] & 0xffff;
			int i_185_ = i_184_ >> 10 & 0x3f;
			int i_186_ = i_184_ >> 7 & 0x7;
			int i_187_ = i_184_ & 0x7f;
			if (i != -1) {
				i_185_ += (i - i_185_) * i_182_ >> 7;
			}
			if (i_180_ != -1) {
				i_186_ += (i_180_ - i_186_) * i_182_ >> 7;
			}
			if (i_181_ != -1) {
				i_187_ += (i_181_ - i_187_) * i_182_ >> 7;
			}
			aShortArray7849[i_183_] = (short) (i_185_ << 10 | i_186_ << 7 | i_187_);
		}
		if (aClass54Array7880 != null) {
			for (int i_188_ = 0; i_188_ < anInt7877; i_188_++) {
				Class54 class54 = aClass54Array7880[i_188_];
				Class36 class36 = aClass36Array7875[i_188_];
				class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
			}
		}
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public int N() {
		if (!aBoolean7843) {
			method4831();
		}
		return anInt7891;
	}

	@Override
	public void ac(int i) {
		anInt7863 = i;
		if (aClass67_7844 != null && (anInt7863 & 0x10000) == 0) {
			aShortArray7829 = aClass67_7844.aShortArray669;
			aShortArray7841 = aClass67_7844.aShortArray668;
			aShortArray7842 = aClass67_7844.aShortArray667;
			aByteArray7887 = aClass67_7844.aByteArray670;
			aClass67_7844 = null;
		}
		aBoolean7864 = true;
		method4820();
	}

	@Override
	public int RA() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7870;
	}

	@Override
	public int ya() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7871;
	}

	@Override
	public int YA() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7868;
	}

	@Override
	public int o() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7874;
	}

	@Override
	public void wa() {
		for (int i = 0; i < anInt7833; i++) {
			vertices_z[i] = -vertices_z[i];
		}
		for (int i = 0; i < anInt7839; i++) {
			aShortArray7842[i] = (short) -aShortArray7842[i];
		}
		for (int i = 0; i < anInt7847; i++) {
			short i_189_ = aShortArray7851[i];
			aShortArray7851[i] = aShortArray7853[i];
			aShortArray7853[i] = i_189_;
		}
		if (aClass32_7889 == null && aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
		if (aClass32_7889 != null) {
			aClass32_7889.anInterface1_397 = null;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		if (aClass41_7879 != null) {
			aClass41_7879.anInterface2_441 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public int ha() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7876;
	}

	@Override
	public void method4745(ModelPart modelPart, int i, int i_190_, int i_191_, boolean bool) {
		ModelPart_Sub2 class387_sub2_192_ = (ModelPart_Sub2) modelPart;
		if (anInt7847 != 0 && class387_sub2_192_.anInt7847 != 0) {
			int i_193_ = class387_sub2_192_.anInt7833;
			int[] is = class387_sub2_192_.vertices_x;
			int[] is_194_ = class387_sub2_192_.vertices_y;
			int[] is_195_ = class387_sub2_192_.vertices_z;
			short[] is_196_ = class387_sub2_192_.aShortArray7829;
			short[] is_197_ = class387_sub2_192_.aShortArray7841;
			short[] is_198_ = class387_sub2_192_.aShortArray7842;
			byte[] is_199_ = class387_sub2_192_.aByteArray7887;
			short[] is_200_;
			short[] is_201_;
			short[] is_202_;
			byte[] is_203_;
			if (aClass67_7844 != null) {
				is_200_ = aClass67_7844.aShortArray669;
				is_201_ = aClass67_7844.aShortArray668;
				is_202_ = aClass67_7844.aShortArray667;
				is_203_ = aClass67_7844.aByteArray670;
			} else {
				is_200_ = null;
				is_201_ = null;
				is_202_ = null;
				is_203_ = null;
			}
			short[] is_204_;
			short[] is_205_;
			short[] is_206_;
			byte[] is_207_;
			if (class387_sub2_192_.aClass67_7844 != null) {
				is_204_ = class387_sub2_192_.aClass67_7844.aShortArray669;
				is_205_ = class387_sub2_192_.aClass67_7844.aShortArray668;
				is_206_ = class387_sub2_192_.aClass67_7844.aShortArray667;
				is_207_ = class387_sub2_192_.aClass67_7844.aByteArray670;
			} else {
				is_204_ = null;
				is_205_ = null;
				is_206_ = null;
				is_207_ = null;
			}
			int[] is_208_ = class387_sub2_192_.anIntArray7854;
			short[] is_209_ = class387_sub2_192_.aShortArray7830;
			if (!class387_sub2_192_.aBoolean7843) {
				class387_sub2_192_.method4831();
			}
			int i_210_ = class387_sub2_192_.aShort7868;
			int i_211_ = class387_sub2_192_.aShort7874;
			int i_212_ = class387_sub2_192_.aShort7870;
			int i_213_ = class387_sub2_192_.aShort7871;
			int i_214_ = class387_sub2_192_.aShort7872;
			int i_215_ = class387_sub2_192_.aShort7876;
			for (int i_216_ = 0; i_216_ < anInt7833; i_216_++) {
				int i_217_ = vertices_y[i_216_] - i_190_;
				if (i_217_ >= i_210_ && i_217_ <= i_211_) {
					int i_218_ = vertices_x[i_216_] - i;
					if (i_218_ >= i_212_ && i_218_ <= i_213_) {
						int i_219_ = vertices_z[i_216_] - i_191_;
						if (i_219_ >= i_214_ && i_219_ <= i_215_) {
							int i_220_ = -1;
							int i_221_ = anIntArray7854[i_216_];
							int i_222_ = anIntArray7854[i_216_ + 1];
							for (int i_223_ = i_221_; i_223_ < i_222_; i_223_++) {
								i_220_ = aShortArray7830[i_223_] - 1;
								if (i_220_ == -1 || aByteArray7887[i_220_] != 0) {
									break;
								}
							}
							if (i_220_ != -1) {
								for (int i_224_ = 0; i_224_ < i_193_; i_224_++) {
									if (i_218_ == is[i_224_] && i_219_ == is_195_[i_224_] && i_217_ == is_194_[i_224_]) {
										int i_225_ = -1;
										i_221_ = is_208_[i_224_];
										i_222_ = is_208_[i_224_ + 1];
										for (int i_226_ = i_221_; i_226_ < i_222_; i_226_++) {
											i_225_ = is_209_[i_226_] - 1;
											if (i_225_ == -1 || is_199_[i_225_] != 0) {
												break;
											}
										}
										if (i_225_ != -1) {
											if (is_200_ == null) {
												aClass67_7844 = new Class67();
												is_200_ = aClass67_7844.aShortArray669 = Class378.method4670(aShortArray7829, (byte) -19);
												is_201_ = aClass67_7844.aShortArray668 = Class378.method4670(aShortArray7841, (byte) -121);
												is_202_ = aClass67_7844.aShortArray667 = Class378.method4670(aShortArray7842, (byte) -76);
												is_203_ = aClass67_7844.aByteArray670 = Class409.method4978(aByteArray7887, 1194497584);
											}
											if (is_204_ == null) {
												Class67 class67 = class387_sub2_192_.aClass67_7844 = new Class67();
												is_204_ = class67.aShortArray669 = Class378.method4670(is_196_, (byte) -74);
												is_205_ = class67.aShortArray668 = Class378.method4670(is_197_, (byte) -6);
												is_206_ = class67.aShortArray667 = Class378.method4670(is_198_, (byte) -5);
												is_207_ = class67.aByteArray670 = Class409.method4978(is_199_, 1194497584);
											}
											short i_227_ = aShortArray7829[i_220_];
											short i_228_ = aShortArray7841[i_220_];
											short i_229_ = aShortArray7842[i_220_];
											byte i_230_ = aByteArray7887[i_220_];
											i_221_ = is_208_[i_224_];
											i_222_ = is_208_[i_224_ + 1];
											for (int i_231_ = i_221_; i_231_ < i_222_; i_231_++) {
												int i_232_ = is_209_[i_231_] - 1;
												if (i_232_ == -1) {
													break;
												}
												if (is_207_[i_232_] != 0) {
													is_204_[i_232_] += i_227_;
													is_205_[i_232_] += i_228_;
													is_206_[i_232_] += i_229_;
													is_207_[i_232_] += i_230_;
												}
											}
											i_227_ = is_196_[i_225_];
											i_228_ = is_197_[i_225_];
											i_229_ = is_198_[i_225_];
											i_230_ = is_199_[i_225_];
											i_221_ = anIntArray7854[i_216_];
											i_222_ = anIntArray7854[i_216_ + 1];
											for (int i_233_ = i_221_; i_233_ < i_222_; i_233_++) {
												int i_234_ = aShortArray7830[i_233_] - 1;
												if (i_234_ == -1) {
													break;
												}
												if (is_203_[i_234_] != 0) {
													is_200_[i_234_] += i_227_;
													is_201_[i_234_] += i_228_;
													is_202_[i_234_] += i_229_;
													is_203_[i_234_] += i_230_;
												}
											}
											if (aClass32_7889 == null && aClass32_7858 != null) {
												aClass32_7858.anInterface1_397 = null;
											}
											if (aClass32_7889 != null) {
												aClass32_7889.anInterface1_397 = null;
											}
											if (class387_sub2_192_.aClass32_7889 == null && class387_sub2_192_.aClass32_7858 != null) {
												class387_sub2_192_.aClass32_7858.anInterface1_397 = null;
											}
											if (class387_sub2_192_.aClass32_7889 != null) {
												class387_sub2_192_.aClass32_7889.anInterface1_397 = null;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void p(int i) {
		aShort7828 = (short) i;
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public void Q(int i) {
		aShort7869 = (short) i;
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
		if (aClass32_7889 != null) {
			aClass32_7889.anInterface1_397 = null;
		}
	}

	@Override
	public int c() {
		return aShort7828;
	}

	@Override
	public int Z() {
		return aShort7869;
	}

	@Override
	public void method4784() {
		if (anInt7839 > 0 && anInt7885 > 0) {
			method4825(false);
			if ((aByte7827 & 0x10) == 0 && aClass41_7879.anInterface2_441 == null) {
				method4830(false);
			}
			method4820();
		}
	}

	@Override
	public void animate_transform_osrs(int type, int[] labels, int x, int y, int z) {
		int numLabels = labels.length;
		if (type == 0) {
			x <<= 4;
			y <<= 4;
			z <<= 4;
			int i_7 = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_8 = 0; i_8 < numLabels; i_8++) {
				int i_9 = labels[i_8];
				if (i_9 < verticesByLabel.length) {
					int[] ints_10 = verticesByLabel[i_9];
					for (int i_12 : ints_10) {
						origin_x += vertices_x[i_12];
						origin_y += vertices_y[i_12];
						origin_z += vertices_z[i_12];
						i_7++;
					}
				}
			}
			if (i_7 > 0) {
				origin_x = x + origin_x / i_7;
				origin_y = y + origin_y / i_7;
				origin_z = z + origin_z / i_7;
			} else {
				origin_x = x;
				origin_y = y;
				origin_z = z;
			}
		} else {
			if (type == 1) {
				x <<= 4;
				y <<= 4;
				z <<= 4;
				for (int i_7 = 0; i_7 < numLabels; i_7++) {
					int i_8 = labels[i_7];
					if (i_8 < verticesByLabel.length) {
						int[] ints_13 = verticesByLabel[i_8];
						for (int element : ints_13) {
							int i_11 = element;
							vertices_x[i_11] += x;
							vertices_y[i_11] += y;
							vertices_z[i_11] += z;
						}
					}
				}

			} else if (type == 2) {
				final int[] sinTable = Class220.SINE;
				final int[] cosTable = Class220.COSINE;
				for (int i_7 = 0; i_7 < numLabels; i_7++) {
					int i_8 = labels[i_7];
					if (i_8 < verticesByLabel.length) {
						int[] ints_13 = verticesByLabel[i_8];
						for (int element : ints_13) {
							int i_11 = element;
							vertices_x[i_11] -= origin_x;
							vertices_y[i_11] -= origin_y;
							vertices_z[i_11] -= origin_z;
							int i_12 = (x & 0xff) * 64;
							int i_15 = (y & 0xff) * 64;
							int i_16 = (z & 0xff) * 64;
							int i_17;
							int i_18;
							int i_19;
							if (i_16 != 0) {
								i_17 = sinTable[i_16];
								i_18 = cosTable[i_16];
								i_19 = i_17 * vertices_y[i_11] + i_18 * vertices_x[i_11] + 16383 >> 14;
								vertices_y[i_11] = i_18 * vertices_y[i_11] - i_17 * vertices_x[i_11] + 16383 >> 14;
								vertices_x[i_11] = i_19;
							}

							if (i_12 != 0) {
								i_17 = sinTable[i_12];
								i_18 = cosTable[i_12];
								i_19 = i_18 * vertices_y[i_11] - i_17 * vertices_z[i_11] + 16383 >> 14;
								vertices_z[i_11] = i_17 * vertices_y[i_11] + i_18 * vertices_z[i_11] + 16383 >> 14;
								vertices_y[i_11] = i_19;
							}

							if (i_15 != 0) {
								i_17 = sinTable[i_15];
								i_18 = cosTable[i_15];
								i_19 = i_17 * vertices_z[i_11] + i_18 * vertices_x[i_11] + 16383 >> 14;
								vertices_z[i_11] = i_18 * vertices_z[i_11] - i_17 * vertices_x[i_11] + 16383 >> 14;
								vertices_x[i_11] = i_19;
							}

							vertices_x[i_11] += origin_x;
							vertices_y[i_11] += origin_y;
							vertices_z[i_11] += origin_z;
						}
					}
				}
			} else if (type == 3) {
				for (int i_7 = 0; i_7 < numLabels; i_7++) {
					int i_8 = labels[i_7];
					if (i_8 < verticesByLabel.length) {
						int[] ints_13 = verticesByLabel[i_8];
						for (int element : ints_13) {
							int i_11 = element;
							vertices_x[i_11] -= origin_x;
							vertices_y[i_11] -= origin_y;
							vertices_z[i_11] -= origin_z;
							vertices_x[i_11] = x * vertices_x[i_11] / 128;
							vertices_y[i_11] = y * vertices_y[i_11] / 128;
							vertices_z[i_11] = z * vertices_z[i_11] / 128;
							vertices_x[i_11] += origin_x;
							vertices_y[i_11] += origin_y;
							vertices_z[i_11] += origin_z;
						}
					}
				}

			} else if (type == 5) {
				if (anIntArrayArray7855 != null) {
					for (int i_337_ = 0; i_337_ < numLabels; i_337_++) {
						int i_338_ = labels[i_337_];
						if (i_338_ < anIntArrayArray7855.length) {
							int[] is_339_ = anIntArrayArray7855[i_338_];
							for (int element : is_339_) {
								int i_341_ = element;
								int i_342_ = (aByteArray7850[i_341_] & 0xff) + x * 8;
								if (i_342_ < 0) {
									i_342_ = 0;
								} else if (i_342_ > 255) {
									i_342_ = 255;
								}
								aByteArray7850[i_341_] = (byte) i_342_;
							}
							if (is_339_.length > 0 && aClass32_7858 != null) {
								aClass32_7858.anInterface1_397 = null;
							}
						}
					}
					if (aClass54Array7880 != null) {
						for (int i_343_ = 0; i_343_ < anInt7877; i_343_++) {
							Class54 class54 = aClass54Array7880[i_343_];
							Class36 class36 = aClass36Array7875[i_343_];
							class36.anInt424 = class36.anInt424 & 0xffffff
									| 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
						}
					}
				}
			}
		}
	}

	@Override
	boolean ea() {
		if (verticesByLabel == null) {
			return false;
		}
		for (int i = 0; i < anInt7832; i++) {
			vertices_x[i] <<= 4;
			vertices_y[i] <<= 4;
			vertices_z[i] <<= 4;
		}
		origin_x = 0;
		origin_y = 0;
		origin_z = 0;
		return true;
	}

	@Override
	public void method4742(byte i, byte[] is) {
		if (is == null) {
			for (int i_235_ = 0; i_235_ < anInt7847; i_235_++) {
				aByteArray7850[i_235_] = i;
			}
		} else {
			for (int i_236_ = 0; i_236_ < anInt7847; i_236_++) {
				int i_237_ = 255 - (255 - (is[i_236_] & 0xff)) * (255 - (i & 0xff)) / 255;
				aByteArray7850[i_236_] = (byte) i_237_;
			}
		}
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public boolean method4743() {
		if (aShortArray7861 == null) {
			return true;
		}
		for (short element : aShortArray7861) {
			if (element != -1 && !aClass_ra_Sub2_7824.anInterface_ma5299.method170(element, (short) 29809)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean i() {
		return aBoolean7840;
	}

	@Override
	public boolean u() {
		return aBoolean7862;
	}

	@Override
	public ModelPart method4750(byte i, int i_238_, boolean bool) {
		boolean bool_239_ = false;
		ModelPart_Sub2 class387_sub2_240_;
		ModelPart_Sub2 class387_sub2_241_;
		if (i > 0 && i <= 7) {
			class387_sub2_241_ = aClass_ra_Sub2_7824.aClass387_Sub2Array8084[i - 1];
			class387_sub2_240_ = aClass_ra_Sub2_7824.aClass387_Sub2Array8189[i - 1];
			bool_239_ = true;
		} else {
			class387_sub2_240_ = class387_sub2_241_ = new ModelPart_Sub2(aClass_ra_Sub2_7824);
		}
		return method4819(class387_sub2_240_, class387_sub2_241_, i_238_, bool_239_, bool);
	}

	@Override
	void method4734() {
		/* empty */
	}

	@Override
	public void method4762(Matrix43f class222, int i, boolean bool) {
		if (aShortArray7838 != null) {
			Matrix43f class222_242_ = class222;
			if (bool) {
				class222_242_ = aClass_ra_Sub2_7824.aClass222_8103;
				class222_242_.method2074(class222);
			}
			float[] fs = new float[3];
			for (int i_243_ = 0; i_243_ < anInt7833; i_243_++) {
				if ((i & aShortArray7838[i_243_]) != 0) {
					class222_242_.method2077(vertices_x[i_243_], vertices_y[i_243_], vertices_z[i_243_], fs);
					vertices_x[i_243_] = (int) fs[0];
					vertices_y[i_243_] = (int) fs[1];
					vertices_z[i_243_] = (int) fs[2];
				}
			}
		}
	}

	@Override
	public int ca() {
		if (!aBoolean7843) {
			method4831();
		}
		return anInt7891;
	}

	@Override
	void w(int i, int i_244_, int i_245_, int i_246_) {
		if (i == 0) {
			int i_247_ = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_248_ = 0; i_248_ < anInt7833; i_248_++) {
				origin_x += vertices_x[i_248_];
				origin_y += vertices_y[i_248_];
				origin_z += vertices_z[i_248_];
				i_247_++;
			}
			if (i_247_ > 0) {
				origin_x = origin_x / i_247_ + i_244_;
				origin_y = origin_y / i_247_ + i_245_;
				origin_z = origin_z / i_247_ + i_246_;
			} else {
				origin_x = i_244_;
				origin_y = i_245_;
				origin_z = i_246_;
			}
		} else if (i == 1) {
			for (int i_249_ = 0; i_249_ < anInt7833; i_249_++) {
				vertices_x[i_249_] += i_244_;
				vertices_y[i_249_] += i_245_;
				vertices_z[i_249_] += i_246_;
			}
		} else if (i == 2) {
			for (int i_250_ = 0; i_250_ < anInt7833; i_250_++) {
				vertices_x[i_250_] -= origin_x;
				vertices_y[i_250_] -= origin_y;
				vertices_z[i_250_] -= origin_z;
				if (i_246_ != 0) {
					int i_251_ = Class220.SINE[i_246_];
					int i_252_ = Class220.COSINE[i_246_];
					int i_253_ = vertices_y[i_250_] * i_251_ + vertices_x[i_250_] * i_252_ + 16383 >> 14;
					vertices_y[i_250_] = vertices_y[i_250_] * i_252_ - vertices_x[i_250_] * i_251_ + 16383 >> 14;
					vertices_x[i_250_] = i_253_;
				}
				if (i_244_ != 0) {
					int i_254_ = Class220.SINE[i_244_];
					int i_255_ = Class220.COSINE[i_244_];
					int i_256_ = vertices_y[i_250_] * i_255_ - vertices_z[i_250_] * i_254_ + 16383 >> 14;
					vertices_z[i_250_] = vertices_y[i_250_] * i_254_ + vertices_z[i_250_] * i_255_ + 16383 >> 14;
					vertices_y[i_250_] = i_256_;
				}
				if (i_245_ != 0) {
					int i_257_ = Class220.SINE[i_245_];
					int i_258_ = Class220.COSINE[i_245_];
					int i_259_ = vertices_z[i_250_] * i_257_ + vertices_x[i_250_] * i_258_ + 16383 >> 14;
					vertices_z[i_250_] = vertices_z[i_250_] * i_258_ - vertices_x[i_250_] * i_257_ + 16383 >> 14;
					vertices_x[i_250_] = i_259_;
				}
				vertices_x[i_250_] += origin_x;
				vertices_y[i_250_] += origin_y;
				vertices_z[i_250_] += origin_z;
			}
		} else if (i == 3) {
			for (int i_260_ = 0; i_260_ < anInt7833; i_260_++) {
				vertices_x[i_260_] -= origin_x;
				vertices_y[i_260_] -= origin_y;
				vertices_z[i_260_] -= origin_z;
				vertices_x[i_260_] = vertices_x[i_260_] * i_244_ / 128;
				vertices_y[i_260_] = vertices_y[i_260_] * i_245_ / 128;
				vertices_z[i_260_] = vertices_z[i_260_] * i_246_ / 128;
				vertices_x[i_260_] += origin_x;
				vertices_y[i_260_] += origin_y;
				vertices_z[i_260_] += origin_z;
			}
		} else if (i == 5) {
			for (int i_261_ = 0; i_261_ < anInt7847; i_261_++) {
				int i_262_ = (aByteArray7850[i_261_] & 0xff) + i_244_ * 8;
				if (i_262_ < 0) {
					i_262_ = 0;
				} else if (i_262_ > 255) {
					i_262_ = 255;
				}
				aByteArray7850[i_261_] = (byte) i_262_;
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
			if (aClass54Array7880 != null) {
				for (int i_263_ = 0; i_263_ < anInt7877; i_263_++) {
					Class54 class54 = aClass54Array7880[i_263_];
					Class36 class36 = aClass36Array7875[i_263_];
					class36.anInt424 = class36.anInt424 & 0xffffff | 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
				}
			}
		} else if (i == 7) {
			for (int i_264_ = 0; i_264_ < anInt7847; i_264_++) {
				int i_265_ = aShortArray7849[i_264_] & 0xffff;
				int i_266_ = i_265_ >> 10 & 0x3f;
				int i_267_ = i_265_ >> 7 & 0x7;
				int i_268_ = i_265_ & 0x7f;
				i_266_ = i_266_ + i_244_ & 0x3f;
				i_267_ += i_245_ / 4;
				if (i_267_ < 0) {
					i_267_ = 0;
				} else if (i_267_ > 7) {
					i_267_ = 7;
				}
				i_268_ += i_246_;
				if (i_268_ < 0) {
					i_268_ = 0;
				} else if (i_268_ > 127) {
					i_268_ = 127;
				}
				aShortArray7849[i_264_] = (short) (i_266_ << 10 | i_267_ << 7 | i_268_);
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
			if (aClass54Array7880 != null) {
				for (int i_269_ = 0; i_269_ < anInt7877; i_269_++) {
					Class54 class54 = aClass54Array7880[i_269_];
					Class36 class36 = aClass36Array7875[i_269_];
					class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
				}
			}
		} else if (i == 8) {
			for (int i_270_ = 0; i_270_ < anInt7877; i_270_++) {
				Class36 class36 = aClass36Array7875[i_270_];
				class36.anInt422 += i_244_;
				class36.anInt419 += i_245_;
			}
		} else if (i == 10) {
			for (int i_271_ = 0; i_271_ < anInt7877; i_271_++) {
				Class36 class36 = aClass36Array7875[i_271_];
				class36.anInt420 = class36.anInt420 * i_244_ >> 7;
				class36.anInt421 = class36.anInt421 * i_245_ >> 7;
			}
		} else if (i == 9) {
			for (int i_272_ = 0; i_272_ < anInt7877; i_272_++) {
				Class36 class36 = aClass36Array7875[i_272_];
				class36.anInt423 = class36.anInt423 + i_244_ & 0x3fff;
			}
		}
	}

	@Override
	void method4738(int i, int[] is, int i_273_, int i_274_, int i_275_, int i_276_, boolean bool) {
		int i_277_ = is.length;
		if (i == 0) {
			i_273_ <<= 4;
			i_274_ <<= 4;
			i_275_ <<= 4;
			int i_278_ = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_279_ = 0; i_279_ < i_277_; i_279_++) {
				int i_280_ = is[i_279_];
				if (i_280_ < verticesByLabel.length) {
					int[] is_281_ = verticesByLabel[i_280_];
					for (int i_283_ : is_281_) {
						origin_x += vertices_x[i_283_];
						origin_y += vertices_y[i_283_];
						origin_z += vertices_z[i_283_];
						i_278_++;
					}
				}
			}
			if (i_278_ > 0) {
				origin_x = origin_x / i_278_ + i_273_;
				origin_y = origin_y / i_278_ + i_274_;
				origin_z = origin_z / i_278_ + i_275_;
			} else {
				origin_x = i_273_;
				origin_y = i_274_;
				origin_z = i_275_;
			}
		} else if (i == 1) {
			i_273_ <<= 4;
			i_274_ <<= 4;
			i_275_ <<= 4;
			for (int i_284_ = 0; i_284_ < i_277_; i_284_++) {
				int i_285_ = is[i_284_];
				if (i_285_ < verticesByLabel.length) {
					int[] is_286_ = verticesByLabel[i_285_];
					for (int element : is_286_) {
						int i_288_ = element;
						vertices_x[i_288_] += i_273_;
						vertices_y[i_288_] += i_274_;
						vertices_z[i_288_] += i_275_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_289_ = 0; i_289_ < i_277_; i_289_++) {
				int i_290_ = is[i_289_];
				if (i_290_ < verticesByLabel.length) {
					int[] is_291_ = verticesByLabel[i_290_];
					if ((i_276_ & 0x1) == 0) {
						for (int element : is_291_) {
							int i_293_ = element;
							vertices_x[i_293_] -= origin_x;
							vertices_y[i_293_] -= origin_y;
							vertices_z[i_293_] -= origin_z;
							if (i_275_ != 0) {
								int i_294_ = Class220.SINE[i_275_];
								int i_295_ = Class220.COSINE[i_275_];
								int i_296_ = vertices_y[i_293_] * i_294_ + vertices_x[i_293_] * i_295_ + 16383 >> 14;
								vertices_y[i_293_] = vertices_y[i_293_] * i_295_ - vertices_x[i_293_] * i_294_ + 16383 >> 14;
								vertices_x[i_293_] = i_296_;
							}
							if (i_273_ != 0) {
								int i_297_ = Class220.SINE[i_273_];
								int i_298_ = Class220.COSINE[i_273_];
								int i_299_ = vertices_y[i_293_] * i_298_ - vertices_z[i_293_] * i_297_ + 16383 >> 14;
								vertices_z[i_293_] = vertices_y[i_293_] * i_297_ + vertices_z[i_293_] * i_298_ + 16383 >> 14;
								vertices_y[i_293_] = i_299_;
							}
							if (i_274_ != 0) {
								int i_300_ = Class220.SINE[i_274_];
								int i_301_ = Class220.COSINE[i_274_];
								int i_302_ = vertices_z[i_293_] * i_300_ + vertices_x[i_293_] * i_301_ + 16383 >> 14;
								vertices_z[i_293_] = vertices_z[i_293_] * i_301_ - vertices_x[i_293_] * i_300_ + 16383 >> 14;
								vertices_x[i_293_] = i_302_;
							}
							vertices_x[i_293_] += origin_x;
							vertices_y[i_293_] += origin_y;
							vertices_z[i_293_] += origin_z;
						}
					} else {
						for (int element : is_291_) {
							int i_304_ = element;
							vertices_x[i_304_] -= origin_x;
							vertices_y[i_304_] -= origin_y;
							vertices_z[i_304_] -= origin_z;
							if (i_273_ != 0) {
								int i_305_ = Class220.SINE[i_273_];
								int i_306_ = Class220.COSINE[i_273_];
								int i_307_ = vertices_y[i_304_] * i_306_ - vertices_z[i_304_] * i_305_ + 16383 >> 14;
								vertices_z[i_304_] = vertices_y[i_304_] * i_305_ + vertices_z[i_304_] * i_306_ + 16383 >> 14;
								vertices_y[i_304_] = i_307_;
							}
							if (i_275_ != 0) {
								int i_308_ = Class220.SINE[i_275_];
								int i_309_ = Class220.COSINE[i_275_];
								int i_310_ = vertices_y[i_304_] * i_308_ + vertices_x[i_304_] * i_309_ + 16383 >> 14;
								vertices_y[i_304_] = vertices_y[i_304_] * i_309_ - vertices_x[i_304_] * i_308_ + 16383 >> 14;
								vertices_x[i_304_] = i_310_;
							}
							if (i_274_ != 0) {
								int i_311_ = Class220.SINE[i_274_];
								int i_312_ = Class220.COSINE[i_274_];
								int i_313_ = vertices_z[i_304_] * i_311_ + vertices_x[i_304_] * i_312_ + 16383 >> 14;
								vertices_z[i_304_] = vertices_z[i_304_] * i_312_ - vertices_x[i_304_] * i_311_ + 16383 >> 14;
								vertices_x[i_304_] = i_313_;
							}
							vertices_x[i_304_] += origin_x;
							vertices_y[i_304_] += origin_y;
							vertices_z[i_304_] += origin_z;
						}
					}
				}
			}
			if (bool) {
				for (int i_314_ = 0; i_314_ < i_277_; i_314_++) {
					int i_315_ = is[i_314_];
					if (i_315_ < verticesByLabel.length) {
						int[] is_316_ = verticesByLabel[i_315_];
						for (int i_318_ : is_316_) {
							int i_319_ = anIntArray7854[i_318_];
							int i_320_ = anIntArray7854[i_318_ + 1];
							for (int i_321_ = i_319_; i_321_ < i_320_; i_321_++) {
								int i_322_ = aShortArray7830[i_321_] - 1;
								if (i_322_ == -1) {
									break;
								}
								if (i_275_ != 0) {
									int i_323_ = Class220.SINE[i_275_];
									int i_324_ = Class220.COSINE[i_275_];
									int i_325_ = aShortArray7841[i_322_] * i_323_ + aShortArray7829[i_322_] * i_324_ + 16383 >> 14;
									aShortArray7841[i_322_] = (short) (aShortArray7841[i_322_] * i_324_ - aShortArray7829[i_322_] * i_323_ + 16383 >> 14);
									aShortArray7829[i_322_] = (short) i_325_;
								}
								if (i_273_ != 0) {
									int i_326_ = Class220.SINE[i_273_];
									int i_327_ = Class220.COSINE[i_273_];
									int i_328_ = aShortArray7841[i_322_] * i_327_ - aShortArray7842[i_322_] * i_326_ + 16383 >> 14;
									aShortArray7842[i_322_] = (short) (aShortArray7841[i_322_] * i_326_ + aShortArray7842[i_322_] * i_327_ + 16383 >> 14);
									aShortArray7841[i_322_] = (short) i_328_;
								}
								if (i_274_ != 0) {
									int i_329_ = Class220.SINE[i_274_];
									int i_330_ = Class220.COSINE[i_274_];
									int i_331_ = aShortArray7842[i_322_] * i_329_ + aShortArray7829[i_322_] * i_330_ + 16383 >> 14;
									aShortArray7842[i_322_] = (short) (aShortArray7842[i_322_] * i_330_ - aShortArray7829[i_322_] * i_329_ + 16383 >> 14);
									aShortArray7829[i_322_] = (short) i_331_;
								}
							}
						}
					}
				}
				if (aClass32_7889 == null && aClass32_7858 != null) {
					aClass32_7858.anInterface1_397 = null;
				}
				if (aClass32_7889 != null) {
					aClass32_7889.anInterface1_397 = null;
				}
			}
		} else if (i == 3) {
			for (int i_332_ = 0; i_332_ < i_277_; i_332_++) {
				int i_333_ = is[i_332_];
				if (i_333_ < verticesByLabel.length) {
					int[] is_334_ = verticesByLabel[i_333_];
					for (int element : is_334_) {
						int i_336_ = element;
						vertices_x[i_336_] -= origin_x;
						vertices_y[i_336_] -= origin_y;
						vertices_z[i_336_] -= origin_z;
						vertices_x[i_336_] = vertices_x[i_336_] * i_273_ >> 7;
						vertices_y[i_336_] = vertices_y[i_336_] * i_274_ >> 7;
						vertices_z[i_336_] = vertices_z[i_336_] * i_275_ >> 7;
						vertices_x[i_336_] += origin_x;
						vertices_y[i_336_] += origin_y;
						vertices_z[i_336_] += origin_z;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray7855 != null) {
				for (int i_337_ = 0; i_337_ < i_277_; i_337_++) {
					int i_338_ = is[i_337_];
					if (i_338_ < anIntArrayArray7855.length) {
						int[] is_339_ = anIntArrayArray7855[i_338_];
						for (int element : is_339_) {
							int i_341_ = element;
							int i_342_ = (aByteArray7850[i_341_] & 0xff) + i_273_ * 8;
							if (i_342_ < 0) {
								i_342_ = 0;
							} else if (i_342_ > 255) {
								i_342_ = 255;
							}
							aByteArray7850[i_341_] = (byte) i_342_;
						}
						if (is_339_.length > 0 && aClass32_7858 != null) {
							aClass32_7858.anInterface1_397 = null;
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_343_ = 0; i_343_ < anInt7877; i_343_++) {
						Class54 class54 = aClass54Array7880[i_343_];
						Class36 class36 = aClass36Array7875[i_343_];
						class36.anInt424 = class36.anInt424 & 0xffffff | 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray7855 != null) {
				for (int i_344_ = 0; i_344_ < i_277_; i_344_++) {
					int i_345_ = is[i_344_];
					if (i_345_ < anIntArrayArray7855.length) {
						int[] is_346_ = anIntArrayArray7855[i_345_];
						for (int element : is_346_) {
							int i_348_ = element;
							int i_349_ = aShortArray7849[i_348_] & 0xffff;
							int i_350_ = i_349_ >> 10 & 0x3f;
							int i_351_ = i_349_ >> 7 & 0x7;
							int i_352_ = i_349_ & 0x7f;
							i_350_ = i_350_ + i_273_ & 0x3f;
							i_351_ += i_274_ / 4;
							if (i_351_ < 0) {
								i_351_ = 0;
							} else if (i_351_ > 7) {
								i_351_ = 7;
							}
							i_352_ += i_275_;
							if (i_352_ < 0) {
								i_352_ = 0;
							} else if (i_352_ > 127) {
								i_352_ = 127;
							}
							aShortArray7849[i_348_] = (short) (i_350_ << 10 | i_351_ << 7 | i_352_);
						}
						if (is_346_.length > 0 && aClass32_7858 != null) {
							aClass32_7858.anInterface1_397 = null;
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_353_ = 0; i_353_ < anInt7877; i_353_++) {
						Class54 class54 = aClass54Array7880[i_353_];
						Class36 class36 = aClass36Array7875[i_353_];
						class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray7882 != null) {
				for (int i_354_ = 0; i_354_ < i_277_; i_354_++) {
					int i_355_ = is[i_354_];
					if (i_355_ < anIntArrayArray7882.length) {
						int[] is_356_ = anIntArrayArray7882[i_355_];
						for (int element : is_356_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt422 += i_273_;
							class36.anInt419 += i_274_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray7882 != null) {
				for (int i_358_ = 0; i_358_ < i_277_; i_358_++) {
					int i_359_ = is[i_358_];
					if (i_359_ < anIntArrayArray7882.length) {
						int[] is_360_ = anIntArrayArray7882[i_359_];
						for (int element : is_360_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt420 = class36.anInt420 * i_273_ >> 7;
							class36.anInt421 = class36.anInt421 * i_274_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray7882 != null) {
				for (int i_362_ = 0; i_362_ < i_277_; i_362_++) {
					int i_363_ = is[i_362_];
					if (i_363_ < anIntArrayArray7882.length) {
						int[] is_364_ = anIntArrayArray7882[i_363_];
						for (int element : is_364_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt423 = class36.anInt423 + i_273_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	@Override
	void ka() {
		for (int i = 0; i < anInt7832; i++) {
			vertices_x[i] = vertices_x[i] + 7 >> 4;
			vertices_y[i] = vertices_y[i] + 7 >> 4;
			vertices_z[i] = vertices_z[i] + 7 >> 4;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void f(int i) {
		int i_366_ = Class220.SINE[i];
		int i_367_ = Class220.COSINE[i];
		for (int i_368_ = 0; i_368_ < anInt7833; i_368_++) {
			int i_369_ = vertices_z[i_368_] * i_366_ + vertices_x[i_368_] * i_367_ >> 14;
			vertices_z[i_368_] = vertices_z[i_368_] * i_367_ - vertices_x[i_368_] * i_366_ >> 14;
			vertices_x[i_368_] = i_369_;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public MagnetConfig[] method4728() {
		return aMagnetConfigArray7857;
	}

	@Override
	public void bw(int i, int i_370_, int i_371_) {
		for (int i_372_ = 0; i_372_ < anInt7833; i_372_++) {
			if (i != 0) {
				vertices_x[i_372_] += i;
			}
			if (i_370_ != 0) {
				vertices_y[i_372_] += i_370_;
			}
			if (i_371_ != 0) {
				vertices_z[i_372_] += i_371_;
			}
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void bu(int i, int i_373_, int i_374_) {
		for (int i_375_ = 0; i_375_ < anInt7833; i_375_++) {
			if (i != 0) {
				vertices_x[i_375_] += i;
			}
			if (i_373_ != 0) {
				vertices_y[i_375_] += i_373_;
			}
			if (i_374_ != 0) {
				vertices_z[i_375_] += i_374_;
			}
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public boolean method4787(int i, int i_376_, Matrix43f class222, boolean bool, int i_377_) {
		Class233 class233 = aClass_ra_Sub2_7824.aClass233_8104;
		class233.method2145(class222);
		class233.method2144(aClass_ra_Sub2_7824.aClass233_8069);
		boolean bool_378_ = false;
		int i_379_ = 2147483647;
		int i_380_ = -2147483648;
		int i_381_ = 2147483647;
		int i_382_ = -2147483648;
		if (!aBoolean7843) {
			method4831();
		}
		int i_383_ = aShort7871 - aShort7870 >> 1;
		int i_384_ = aShort7874 - aShort7868 >> 1;
		int i_385_ = aShort7876 - aShort7872 >> 1;
		int i_386_ = aShort7870 + i_383_;
		int i_387_ = aShort7868 + i_384_;
		int i_388_ = aShort7872 + i_385_;
		int i_389_ = i_386_ - (i_383_ << i_377_);
		int i_390_ = i_387_ - (i_384_ << i_377_);
		int i_391_ = i_388_ - (i_385_ << i_377_);
		int i_392_ = i_386_ + (i_383_ << i_377_);
		int i_393_ = i_387_ + (i_384_ << i_377_);
		int i_394_ = i_388_ + (i_385_ << i_377_);
		anIntArray7867[0] = i_389_;
		anIntArray7886[0] = i_390_;
		anIntArray7848[0] = i_391_;
		anIntArray7867[1] = i_392_;
		anIntArray7886[1] = i_390_;
		anIntArray7848[1] = i_391_;
		anIntArray7867[2] = i_389_;
		anIntArray7886[2] = i_393_;
		anIntArray7848[2] = i_391_;
		anIntArray7867[3] = i_392_;
		anIntArray7886[3] = i_393_;
		anIntArray7848[3] = i_391_;
		anIntArray7867[4] = i_389_;
		anIntArray7886[4] = i_390_;
		anIntArray7848[4] = i_394_;
		anIntArray7867[5] = i_392_;
		anIntArray7886[5] = i_390_;
		anIntArray7848[5] = i_394_;
		anIntArray7867[6] = i_389_;
		anIntArray7886[6] = i_393_;
		anIntArray7848[6] = i_394_;
		anIntArray7867[7] = i_392_;
		anIntArray7886[7] = i_393_;
		anIntArray7848[7] = i_394_;
		for (int i_395_ = 0; i_395_ < 8; i_395_++) {
			int i_396_ = anIntArray7867[i_395_];
			int i_397_ = anIntArray7886[i_395_];
			int i_398_ = anIntArray7848[i_395_];
			float f = class233.aFloatArray2594[2] * i_396_ + class233.aFloatArray2594[6] * i_397_ + class233.aFloatArray2594[10] * i_398_ + class233.aFloatArray2594[14];
			float f_399_ = class233.aFloatArray2594[3] * i_396_ + class233.aFloatArray2594[7] * i_397_ + class233.aFloatArray2594[11] * i_398_ + class233.aFloatArray2594[15];
			if (f >= -f_399_) {
				float f_400_ = class233.aFloatArray2594[0] * i_396_ + class233.aFloatArray2594[4] * i_397_ + class233.aFloatArray2594[8] * i_398_ + class233.aFloatArray2594[12];
				float f_401_ = class233.aFloatArray2594[1] * i_396_ + class233.aFloatArray2594[5] * i_397_ + class233.aFloatArray2594[9] * i_398_ + class233.aFloatArray2594[13];
				int i_402_ = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_400_ / f_399_);
				int i_403_ = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_401_ / f_399_);
				if (i_402_ < i_379_) {
					i_379_ = i_402_;
				}
				if (i_402_ > i_380_) {
					i_380_ = i_402_;
				}
				if (i_403_ < i_381_) {
					i_381_ = i_403_;
				}
				if (i_403_ > i_382_) {
					i_382_ = i_403_;
				}
				bool_378_ = true;
			}
		}
		if (bool_378_ && i > i_379_ && i < i_380_ && i_376_ > i_381_ && i_376_ < i_382_) {
			if (bool) {
				return true;
			}
			if (aClass_ra_Sub2_7824.anIntArray8198.length < anInt7839) {
				aClass_ra_Sub2_7824.anIntArray8198 = new int[anInt7839];
				aClass_ra_Sub2_7824.anIntArray8199 = new int[anInt7839];
			}
			int[] is = aClass_ra_Sub2_7824.anIntArray8198;
			int[] is_404_ = aClass_ra_Sub2_7824.anIntArray8199;
			for (int i_405_ = 0; i_405_ < anInt7833; i_405_++) {
				int i_406_ = vertices_x[i_405_];
				int i_407_ = vertices_y[i_405_];
				int i_408_ = vertices_z[i_405_];
				float f = class233.aFloatArray2594[2] * i_406_ + class233.aFloatArray2594[6] * i_407_ + class233.aFloatArray2594[10] * i_408_ + class233.aFloatArray2594[14];
				float f_409_ = class233.aFloatArray2594[3] * i_406_ + class233.aFloatArray2594[7] * i_407_ + class233.aFloatArray2594[11] * i_408_ + class233.aFloatArray2594[15];
				if (f >= -f_409_) {
					float f_410_ = class233.aFloatArray2594[0] * i_406_ + class233.aFloatArray2594[4] * i_407_ + class233.aFloatArray2594[8] * i_408_ + class233.aFloatArray2594[12];
					float f_411_ = class233.aFloatArray2594[1] * i_406_ + class233.aFloatArray2594[5] * i_407_ + class233.aFloatArray2594[9] * i_408_ + class233.aFloatArray2594[13];
					int i_412_ = anIntArray7854[i_405_];
					int i_413_ = anIntArray7854[i_405_ + 1];
					for (int i_414_ = i_412_; i_414_ < i_413_; i_414_++) {
						int i_415_ = aShortArray7830[i_414_] - 1;
						if (i_415_ == -1) {
							break;
						}
						is[i_415_] = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_410_ / f_409_);
						is_404_[i_415_] = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_411_ / f_409_);
					}
				} else {
					int i_416_ = anIntArray7854[i_405_];
					int i_417_ = anIntArray7854[i_405_ + 1];
					for (int i_418_ = i_416_; i_418_ < i_417_; i_418_++) {
						int i_419_ = aShortArray7830[i_418_] - 1;
						if (i_419_ == -1) {
							break;
						}
						is[aShortArray7830[i_418_] - 1] = -999999;
					}
				}
			}
			for (int i_420_ = 0; i_420_ < anInt7847; i_420_++) {
				if (is[aShortArray7851[i_420_]] != -999999 && is[aShortArray7852[i_420_]] != -999999 && is[aShortArray7853[i_420_]] != -999999 && method4821(i, i_376_, is_404_[aShortArray7851[i_420_]], is_404_[aShortArray7852[i_420_]], is_404_[aShortArray7853[i_420_]], is[aShortArray7851[i_420_]], is[aShortArray7852[i_420_]], is[aShortArray7853[i_420_]])) {
					return true;
				}
			}
		}
		return false;
	}

	boolean method4821(int i, int i_421_, int i_422_, int i_423_, int i_424_, int i_425_, int i_426_, int i_427_) {
		if (i_421_ < i_422_ && i_421_ < i_423_ && i_421_ < i_424_) {
			return false;
		}
		if (i_421_ > i_422_ && i_421_ > i_423_ && i_421_ > i_424_) {
			return false;
		}
		if (i < i_425_ && i < i_426_ && i < i_427_) {
			return false;
		}
		if (i > i_425_ && i > i_426_ && i > i_427_) {
			return false;
		}
		return true;
	}

	@Override
	public Class_na ga(Class_na class_na) {
		if (anInt7839 == 0) {
			return null;
		}
		if (!aBoolean7843) {
			method4831();
		}
		int i;
		int i_428_;
		if (aClass_ra_Sub2_7824.anInt8066 > 0) {
			i = aShort7870 - (aShort7874 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_428_ = aShort7871 - (aShort7868 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		} else {
			i = aShort7870 - (aShort7868 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_428_ = aShort7871 - (aShort7874 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		}
		int i_429_;
		int i_430_;
		if (aClass_ra_Sub2_7824.anInt8026 > 0) {
			i_429_ = aShort7872 - (aShort7874 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_430_ = aShort7876 - (aShort7868 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		} else {
			i_429_ = aShort7872 - (aShort7868 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_430_ = aShort7876 - (aShort7874 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		}
		int i_431_ = i_428_ - i + 1;
		int i_432_ = i_430_ - i_429_ + 1;
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_433_;
		if (class_na_sub1 != null && class_na_sub1.method3481(i_431_, i_432_)) {
			class_na_sub1_433_ = class_na_sub1;
			class_na_sub1_433_.method3482();
		} else {
			class_na_sub1_433_ = new Class_na_Sub1(aClass_ra_Sub2_7824, i_431_, i_432_);
		}
		class_na_sub1_433_.method3485(i, i_429_, i_428_, i_430_);
		method4822(class_na_sub1_433_);
		return class_na_sub1_433_;
	}

	void method4822(Class_na_Sub1 class_na_sub1) {
		if (aClass_ra_Sub2_7824.anIntArray8198.length < anInt7839) {
			aClass_ra_Sub2_7824.anIntArray8198 = new int[anInt7839];
			aClass_ra_Sub2_7824.anIntArray8199 = new int[anInt7839];
		}
		int[] is = aClass_ra_Sub2_7824.anIntArray8198;
		int[] is_434_ = aClass_ra_Sub2_7824.anIntArray8199;
		for (int i = 0; i < anInt7833; i++) {
			int i_435_ = (vertices_x[i] - (vertices_y[i] * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064) - class_na_sub1.anInt10012;
			int i_436_ = (vertices_z[i] - (vertices_y[i] * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064) - class_na_sub1.anInt10016;
			int i_437_ = anIntArray7854[i];
			int i_438_ = anIntArray7854[i + 1];
			for (int i_439_ = i_437_; i_439_ < i_438_; i_439_++) {
				int i_440_ = (aShortArray7830[i_439_] & 0xffff) - 1;
				if (i_440_ == -1) {
					break;
				}
				is[i_440_] = i_435_;
				is_434_[i_440_] = i_436_;
			}
		}
		for (int i = 0; i < anInt7885; i++) {
			if (aByteArray7850 == null || aByteArray7850[i] <= 128) {
				int i_441_ = aShortArray7851[i] & 0xffff;
				int i_442_ = aShortArray7852[i] & 0xffff;
				int i_443_ = aShortArray7853[i] & 0xffff;
				int i_444_ = is[i_441_];
				int i_445_ = is[i_442_];
				int i_446_ = is[i_443_];
				int i_447_ = is_434_[i_441_];
				int i_448_ = is_434_[i_442_];
				int i_449_ = is_434_[i_443_];
				if ((i_444_ - i_445_) * (i_448_ - i_449_) - (i_448_ - i_447_) * (i_446_ - i_445_) > 0) {
					class_na_sub1.method3483(i_447_, i_448_, i_449_, i_444_, i_445_, i_446_);
				}
			}
		}
	}

	@Override
	public Class_na cc(Class_na class_na) {
		if (anInt7839 == 0) {
			return null;
		}
		if (!aBoolean7843) {
			method4831();
		}
		int i;
		int i_450_;
		if (aClass_ra_Sub2_7824.anInt8066 > 0) {
			i = aShort7870 - (aShort7874 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_450_ = aShort7871 - (aShort7868 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		} else {
			i = aShort7870 - (aShort7868 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_450_ = aShort7871 - (aShort7874 * aClass_ra_Sub2_7824.anInt8066 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		}
		int i_451_;
		int i_452_;
		if (aClass_ra_Sub2_7824.anInt8026 > 0) {
			i_451_ = aShort7872 - (aShort7874 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_452_ = aShort7876 - (aShort7868 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		} else {
			i_451_ = aShort7872 - (aShort7868 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
			i_452_ = aShort7876 - (aShort7874 * aClass_ra_Sub2_7824.anInt8026 >> 8) >> aClass_ra_Sub2_7824.anInt8064;
		}
		int i_453_ = i_450_ - i + 1;
		int i_454_ = i_452_ - i_451_ + 1;
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_455_;
		if (class_na_sub1 != null && class_na_sub1.method3481(i_453_, i_454_)) {
			class_na_sub1_455_ = class_na_sub1;
			class_na_sub1_455_.method3482();
		} else {
			class_na_sub1_455_ = new Class_na_Sub1(aClass_ra_Sub2_7824, i_453_, i_454_);
		}
		class_na_sub1_455_.method3485(i, i_451_, i_450_, i_452_);
		method4822(class_na_sub1_455_);
		return class_na_sub1_455_;
	}

	void method4823() {
		if (anInt7885 != 0) {
			if (aByte7827 != 0) {
				method4825(true);
			}
			method4825(false);
			if (aClass41_7879 != null) {
				if (aClass41_7879.anInterface2_441 == null) {
					method4830((aByte7827 & 0x10) != 0);
				}
				if (aClass41_7879.anInterface2_441 != null) {
					aClass_ra_Sub2_7824.method5262(aClass32_7889 != null);
					aClass_ra_Sub2_7824.method5248(aClass32_7831, aClass32_7889, aClass32_7858, aClass32_7860);
					int i = anIntArray7859.length - 1;
					for (int i_456_ = 0; i_456_ < i; i_456_++) {
						int i_457_ = anIntArray7859[i_456_];
						int i_458_ = anIntArray7859[i_456_ + 1];
						int i_459_ = aShortArray7861[i_457_] & 0xffff;
						if (i_459_ == 65535) {
							i_459_ = -1;
						}
						aClass_ra_Sub2_7824.method5253(i_459_, aClass32_7889 != null);
						aClass_ra_Sub2_7824.method5254(aClass41_7879.anInterface2_441, 4, i_457_ * 3, (i_458_ - i_457_) * 3);
					}
				}
			}
			method4820();
		}
	}

	void method4824(Class233 class233) {
		if (aClass54Array7880 != null) {
			Class233 class233_460_ = aClass_ra_Sub2_7824.aClass233_8030;
			aClass_ra_Sub2_7824.method5236();
			aClass_ra_Sub2_7824.RA(!aBoolean7840);
			aClass_ra_Sub2_7824.method5262(false);
			aClass_ra_Sub2_7824.method5248(aClass_ra_Sub2_7824.aClass32_8092, null, null, aClass_ra_Sub2_7824.aClass32_8193);
			for (int i = 0; i < anInt7877; i++) {
				Class54 class54 = aClass54Array7880[i];
				Class36 class36 = aClass36Array7875[i];
				if (!class54.aBoolean554 || !aClass_ra_Sub2_7824.method5054()) {
					float f = (vertices_x[class54.anInt555] + vertices_x[class54.anInt547] + vertices_x[class54.anInt548]) * 0.3333333F;
					float f_461_ = (vertices_y[class54.anInt555] + vertices_y[class54.anInt547] + vertices_y[class54.anInt548]) * 0.3333333F;
					float f_462_ = (vertices_z[class54.anInt555] + vertices_z[class54.anInt547] + vertices_z[class54.anInt548]) * 0.3333333F;
					float f_463_ = class233.aFloatArray2594[0] * f + class233.aFloatArray2594[4] * f_461_ + class233.aFloatArray2594[8] * f_462_ + class233.aFloatArray2594[12];
					float f_464_ = class233.aFloatArray2594[1] * f + class233.aFloatArray2594[5] * f_461_ + class233.aFloatArray2594[9] * f_462_ + class233.aFloatArray2594[13];
					float f_465_ = class233.aFloatArray2594[2] * f + class233.aFloatArray2594[6] * f_461_ + class233.aFloatArray2594[10] * f_462_ + class233.aFloatArray2594[14];
					float f_466_ = (float) (1.0 / Math.sqrt(f_463_ * f_463_ + f_464_ * f_464_ + f_465_ * f_465_)) * class54.anInt546;
					class233_460_.method2164(class36.anInt423, class36.anInt420 * class54.aShort550 >> 7, class36.anInt421 * class54.aShort551 >> 7, f_463_ + class36.anInt422 - f_463_ * f_466_, f_464_ + class36.anInt419 - f_464_ * f_466_, f_465_ - f_465_ * f_466_);
					aClass_ra_Sub2_7824.method5233(class233_460_);
					int i_467_ = class36.anInt424;
					OpenGL.glColor4ub((byte) (i_467_ >> 16), (byte) (i_467_ >> 8), (byte) i_467_, (byte) (i_467_ >> 24));
					aClass_ra_Sub2_7824.method5275(class54.aShort552);
					aClass_ra_Sub2_7824.method5266(class54.aByte553);
					aClass_ra_Sub2_7824.method5285(7, 0, 4);
				}
			}
			aClass_ra_Sub2_7824.RA(true);
			aClass_ra_Sub2_7824.method5287();
		}
	}

	@Override
	void method4733() {
		/* empty */
	}

	void method4825(boolean bool) {
		boolean bool_468_ = aClass32_7858 != null && aClass32_7858.anInterface1_397 == null;
		boolean bool_469_ = aClass32_7889 != null && aClass32_7889.anInterface1_397 == null;
		boolean bool_470_ = aClass32_7831 != null && aClass32_7831.anInterface1_397 == null;
		boolean bool_471_ = aClass32_7860 != null && aClass32_7860.anInterface1_397 == null;
		if (bool) {
			bool_468_ = bool_468_ & (aByte7827 & 0x2) != 0;
			bool_469_ = bool_469_ & (aByte7827 & 0x4) != 0;
			bool_470_ = bool_470_ & (aByte7827 & 0x1) != 0;
			bool_471_ = bool_471_ & (aByte7827 & 0x8) != 0;
		}
		byte i = 0;
		byte i_472_ = 0;
		byte i_473_ = 0;
		byte i_474_ = 0;
		byte i_475_ = 0;
		if (bool_470_) {
			i_472_ = i;
			i += 12;
		}
		if (bool_468_) {
			i_473_ = i;
			i += 4;
		}
		if (bool_469_) {
			i_474_ = i;
			i += 12;
		}
		if (bool_471_) {
			i_475_ = i;
			i += 8;
		}
		if (i != 0) {
			if (aClass_ra_Sub2_7824.aClass298_Sub53_Sub1_8197.payload.length < anInt7839 * i) {
				aClass_ra_Sub2_7824.aClass298_Sub53_Sub1_8197 = new RsFloatBuffer((anInt7839 + 100) * i);
			} else {
				aClass_ra_Sub2_7824.aClass298_Sub53_Sub1_8197.pos = 0;
			}
			RsFloatBuffer class298_sub53_sub1 = aClass_ra_Sub2_7824.aClass298_Sub53_Sub1_8197;
			if (bool_470_) {
				if (aClass_ra_Sub2_7824.aBoolean8143) {
					for (int i_476_ = 0; i_476_ < anInt7833; i_476_++) {
						int i_477_ = Stream.floatToRawIntBits(vertices_x[i_476_]);
						int i_478_ = Stream.floatToRawIntBits(vertices_y[i_476_]);
						int i_479_ = Stream.floatToRawIntBits(vertices_z[i_476_]);
						int i_480_ = anIntArray7854[i_476_];
						int i_481_ = anIntArray7854[i_476_ + 1];
						for (int i_482_ = i_480_; i_482_ < i_481_; i_482_++) {
							int i_483_ = aShortArray7830[i_482_] - 1;
							if (i_483_ == -1) {
								break;
							}
							class298_sub53_sub1.pos = i_483_ * i * 116413311;
							class298_sub53_sub1.writeInt(i_477_, 506762841);
							class298_sub53_sub1.writeInt(i_478_, 715809399);
							class298_sub53_sub1.writeInt(i_479_, 958087482);
						}
					}
				} else {
					for (int i_484_ = 0; i_484_ < anInt7833; i_484_++) {
						int i_485_ = Stream.floatToRawIntBits(vertices_x[i_484_]);
						int i_486_ = Stream.floatToRawIntBits(vertices_y[i_484_]);
						int i_487_ = Stream.floatToRawIntBits(vertices_z[i_484_]);
						int i_488_ = anIntArray7854[i_484_];
						int i_489_ = anIntArray7854[i_484_ + 1];
						for (int i_490_ = i_488_; i_490_ < i_489_; i_490_++) {
							int i_491_ = (aShortArray7830[i_490_] & 0xffff) - 1;
							if (i_491_ == -1) {
								break;
							}
							class298_sub53_sub1.pos = i_491_ * i * 116413311;
							class298_sub53_sub1.writeLEInt(i_485_, 1851348262);
							class298_sub53_sub1.writeLEInt(i_486_, 1495558444);
							class298_sub53_sub1.writeLEInt(i_487_, -1524571339);
						}
					}
				}
			}
			if (bool_468_) {
				if (aClass32_7889 == null) {
					short[] is;
					short[] is_492_;
					short[] is_493_;
					byte[] is_494_;
					if (aClass67_7844 != null) {
						is = aClass67_7844.aShortArray669;
						is_492_ = aClass67_7844.aShortArray668;
						is_493_ = aClass67_7844.aShortArray667;
						is_494_ = aClass67_7844.aByteArray670;
					} else {
						is = aShortArray7829;
						is_492_ = aShortArray7841;
						is_493_ = aShortArray7842;
						is_494_ = aByteArray7887;
					}
					float f = aClass_ra_Sub2_7824.aFloatArray8124[0];
					float f_495_ = aClass_ra_Sub2_7824.aFloatArray8124[1];
					float f_496_ = aClass_ra_Sub2_7824.aFloatArray8124[2];
					float f_497_ = aClass_ra_Sub2_7824.aFloat8130;
					float f_498_ = aClass_ra_Sub2_7824.aFloat8131 * 768.0F / aShort7869;
					float f_499_ = aClass_ra_Sub2_7824.aFloat8132 * 768.0F / aShort7869;
					for (int i_500_ = 0; i_500_ < anInt7847; i_500_++) {
						int i_501_ = method4826(aShortArray7849[i_500_], aShortArray7861[i_500_], aShort7828, aByteArray7850[i_500_]);
						float f_502_ = (i_501_ >>> 24) * aClass_ra_Sub2_7824.aFloat8125;
						float f_503_ = (i_501_ >> 16 & 0xff) * aClass_ra_Sub2_7824.aFloat8128;
						float f_504_ = (i_501_ >> 8 & 0xff) * aClass_ra_Sub2_7824.aFloat8191;
						int i_505_ = aShortArray7851[i_500_];
						short i_506_ = is_494_[i_505_];
						float f_507_;
						if (i_506_ == 0) {
							f_507_ = (f * is[i_505_] + f_495_ * is_492_[i_505_] + f_496_ * is_493_[i_505_]) * 0.0026041667F;
						} else {
							f_507_ = (f * is[i_505_] + f_495_ * is_492_[i_505_] + f_496_ * is_493_[i_505_]) / (i_506_ * 256);
						}
						float f_508_ = f_497_ + f_507_ * (f_507_ < 0.0F ? f_499_ : f_498_);
						int i_509_ = (int) (f_502_ * f_508_);
						if (i_509_ < 0) {
							i_509_ = 0;
						} else if (i_509_ > 255) {
							i_509_ = 255;
						}
						int i_510_ = (int) (f_503_ * f_508_);
						if (i_510_ < 0) {
							i_510_ = 0;
						} else if (i_510_ > 255) {
							i_510_ = 255;
						}
						int i_511_ = (int) (f_504_ * f_508_);
						if (i_511_ < 0) {
							i_511_ = 0;
						} else if (i_511_ > 255) {
							i_511_ = 255;
						}
						class298_sub53_sub1.pos = (i_473_ + i_505_ * i) * 116413311;
						class298_sub53_sub1.writeByte(i_509_);
						class298_sub53_sub1.writeByte(i_510_);
						class298_sub53_sub1.writeByte(i_511_);
						class298_sub53_sub1.writeByte(255 - (aByteArray7850[i_500_] & 0xff));
						i_505_ = aShortArray7852[i_500_];
						i_506_ = is_494_[i_505_];
						if (i_506_ == 0) {
							f_507_ = (f * is[i_505_] + f_495_ * is_492_[i_505_] + f_496_ * is_493_[i_505_]) * 0.0026041667F;
						} else {
							f_507_ = (f * is[i_505_] + f_495_ * is_492_[i_505_] + f_496_ * is_493_[i_505_]) / (i_506_ * 256);
						}
						f_508_ = f_497_ + f_507_ * (f_507_ < 0.0F ? f_499_ : f_498_);
						i_509_ = (int) (f_502_ * f_508_);
						if (i_509_ < 0) {
							i_509_ = 0;
						} else if (i_509_ > 255) {
							i_509_ = 255;
						}
						i_510_ = (int) (f_503_ * f_508_);
						if (i_510_ < 0) {
							i_510_ = 0;
						} else if (i_510_ > 255) {
							i_510_ = 255;
						}
						i_511_ = (int) (f_504_ * f_508_);
						if (i_511_ < 0) {
							i_511_ = 0;
						} else if (i_511_ > 255) {
							i_511_ = 255;
						}
						class298_sub53_sub1.pos = (i_473_ + i_505_ * i) * 116413311;
						class298_sub53_sub1.writeByte(i_509_);
						class298_sub53_sub1.writeByte(i_510_);
						class298_sub53_sub1.writeByte(i_511_);
						class298_sub53_sub1.writeByte(255 - (aByteArray7850[i_500_] & 0xff));
						i_505_ = aShortArray7853[i_500_];
						i_506_ = is_494_[i_505_];
						if (i_506_ == 0) {
							f_507_ = (f * is[i_505_] + f_495_ * is_492_[i_505_] + f_496_ * is_493_[i_505_]) * 0.0026041667F;
						} else {
							f_507_ = (f * is[i_505_] + f_495_ * is_492_[i_505_] + f_496_ * is_493_[i_505_]) / (i_506_ * 256);
						}
						f_508_ = f_497_ + f_507_ * (f_507_ < 0.0F ? f_499_ : f_498_);
						i_509_ = (int) (f_502_ * f_508_);
						if (i_509_ < 0) {
							i_509_ = 0;
						} else if (i_509_ > 255) {
							i_509_ = 255;
						}
						i_510_ = (int) (f_503_ * f_508_);
						if (i_510_ < 0) {
							i_510_ = 0;
						} else if (i_510_ > 255) {
							i_510_ = 255;
						}
						i_511_ = (int) (f_504_ * f_508_);
						if (i_511_ < 0) {
							i_511_ = 0;
						} else if (i_511_ > 255) {
							i_511_ = 255;
						}
						class298_sub53_sub1.pos = (i_473_ + i_505_ * i) * 116413311;
						class298_sub53_sub1.writeByte(i_509_);
						class298_sub53_sub1.writeByte(i_510_);
						class298_sub53_sub1.writeByte(i_511_);
						class298_sub53_sub1.writeByte(255 - (aByteArray7850[i_500_] & 0xff));
					}
				} else {
					for (int i_512_ = 0; i_512_ < anInt7847; i_512_++) {
						int i_513_ = method4826(aShortArray7849[i_512_], aShortArray7861[i_512_], aShort7828, aByteArray7850[i_512_]);
						class298_sub53_sub1.pos = (i_473_ + (aShortArray7851[i_512_] & 0xffff) * i) * 116413311;
						class298_sub53_sub1.writeInt(i_513_, -2055604033);
						class298_sub53_sub1.pos = (i_473_ + (aShortArray7852[i_512_] & 0xffff) * i) * 116413311;
						class298_sub53_sub1.writeInt(i_513_, -1511620106);
						class298_sub53_sub1.pos = (i_473_ + (aShortArray7853[i_512_] & 0xffff) * i) * 116413311;
						class298_sub53_sub1.writeInt(i_513_, -1974134781);
					}
				}
			}
			if (bool_469_) {
				short[] is;
				short[] is_514_;
				short[] is_515_;
				byte[] is_516_;
				if (aClass67_7844 != null) {
					is = aClass67_7844.aShortArray669;
					is_514_ = aClass67_7844.aShortArray668;
					is_515_ = aClass67_7844.aShortArray667;
					is_516_ = aClass67_7844.aByteArray670;
				} else {
					is = aShortArray7829;
					is_514_ = aShortArray7841;
					is_515_ = aShortArray7842;
					is_516_ = aByteArray7887;
				}
				float f = 3.0F / aShort7869;
				float f_517_ = 3.0F / (aShort7869 + aShort7869 / 2);
				class298_sub53_sub1.pos = i_474_ * 116413311;
				if (aClass_ra_Sub2_7824.aBoolean8143) {
					for (int i_518_ = 0; i_518_ < anInt7839; i_518_++) {
						int i_519_ = is_516_[i_518_] & 0xff;
						if (i_519_ == 0) {
							class298_sub53_sub1.method3658(is[i_518_] * f_517_);
							class298_sub53_sub1.method3658(is_514_[i_518_] * f_517_);
							class298_sub53_sub1.method3658(is_515_[i_518_] * f_517_);
						} else {
							float f_520_ = f / i_519_;
							class298_sub53_sub1.method3658(is[i_518_] * f_520_);
							class298_sub53_sub1.method3658(is_514_[i_518_] * f_520_);
							class298_sub53_sub1.method3658(is_515_[i_518_] * f_520_);
						}
						class298_sub53_sub1.pos += (i - 12) * 116413311;
					}
				} else {
					for (int i_521_ = 0; i_521_ < anInt7839; i_521_++) {
						int i_522_ = is_516_[i_521_] & 0xff;
						if (i_522_ == 0) {
							class298_sub53_sub1.method3659(is[i_521_] * f_517_);
							class298_sub53_sub1.method3659(is_514_[i_521_] * f_517_);
							class298_sub53_sub1.method3659(is_515_[i_521_] * f_517_);
						} else {
							float f_523_ = f / i_522_;
							class298_sub53_sub1.method3659(is[i_521_] * f_523_);
							class298_sub53_sub1.method3659(is_514_[i_521_] * f_523_);
							class298_sub53_sub1.method3659(is_515_[i_521_] * f_523_);
						}
						class298_sub53_sub1.pos += (i - 12) * 116413311;
					}
				}
			}
			if (bool_471_) {
				class298_sub53_sub1.pos = i_475_ * 116413311;
				if (aClass_ra_Sub2_7824.aBoolean8143) {
					for (int i_524_ = 0; i_524_ < anInt7839; i_524_++) {
						class298_sub53_sub1.method3658(aFloatArray7845[i_524_]);
						class298_sub53_sub1.method3658(aFloatArray7846[i_524_]);
						class298_sub53_sub1.pos += (i - 8) * 116413311;
					}
				} else {
					for (int i_525_ = 0; i_525_ < anInt7839; i_525_++) {
						class298_sub53_sub1.method3659(aFloatArray7845[i_525_]);
						class298_sub53_sub1.method3659(aFloatArray7846[i_525_]);
						class298_sub53_sub1.pos += (i - 8) * 116413311;
					}
				}
			}
			class298_sub53_sub1.pos = i * anInt7839 * 116413311;
			Interface1 interface1;
			if (bool) {
				if (anInterface1_7873 == null) {
					anInterface1_7873 = aClass_ra_Sub2_7824.method5244(i, class298_sub53_sub1.payload, class298_sub53_sub1.pos * 385051775, true);
				} else {
					anInterface1_7873.method8(i, class298_sub53_sub1.payload, class298_sub53_sub1.pos * 385051775);
				}
				interface1 = anInterface1_7873;
				aByte7827 = (byte) 0;
			} else {
				interface1 = aClass_ra_Sub2_7824.method5244(i, class298_sub53_sub1.payload, class298_sub53_sub1.pos * 385051775, false);
				aBoolean7864 = true;
			}
			if (bool_470_) {
				aClass32_7831.anInterface1_397 = interface1;
				aClass32_7831.aByte398 = i_472_;
			}
			if (bool_471_) {
				aClass32_7860.anInterface1_397 = interface1;
				aClass32_7860.aByte398 = i_475_;
			}
			if (bool_468_) {
				aClass32_7858.anInterface1_397 = interface1;
				aClass32_7858.aByte398 = i_473_;
			}
			if (bool_469_) {
				aClass32_7889.anInterface1_397 = interface1;
				aClass32_7889.aByte398 = i_474_;
			}
		}
	}

	int method4826(int i, short i_526_, int i_527_, byte i_528_) {
		int i_529_ = JAGLib.anIntArray3165[method4827(i, i_527_)];
		if (i_526_ != -1) {
			MaterialRaw materialRaw = aClass_ra_Sub2_7824.anInterface_ma5299.method174(i_526_ & 0xffff, 633788173);
			int i_530_ = materialRaw.aByte533 & 0xff;
			if (i_530_ != 0) {
				int i_531_;
				if (i_527_ < 0) {
					i_531_ = 0;
				} else if (i_527_ > 127) {
					i_531_ = 16777215;
				} else {
					i_531_ = 131586 * i_527_;
				}
				if (i_530_ == 256) {
					i_529_ = i_531_;
				} else {
					int i_532_ = i_530_;
					int i_533_ = 256 - i_530_;
					i_529_ = ((i_531_ & 0xff00ff) * i_532_ + (i_529_ & 0xff00ff) * i_533_ & ~0xff00ff) + ((i_531_ & 0xff00) * i_532_ + (i_529_ & 0xff00) * i_533_ & 0xff0000) >> 8;
				}
			}
			int i_534_ = materialRaw.aByte534 & 0xff;
			if (i_534_ != 0) {
				i_534_ += 256;
				int i_535_ = ((i_529_ & 0xff0000) >> 16) * i_534_;
				if (i_535_ > 65535) {
					i_535_ = 65535;
				}
				int i_536_ = ((i_529_ & 0xff00) >> 8) * i_534_;
				if (i_536_ > 65535) {
					i_536_ = 65535;
				}
				int i_537_ = (i_529_ & 0xff) * i_534_;
				if (i_537_ > 65535) {
					i_537_ = 65535;
				}
				i_529_ = (i_535_ << 8 & 0xff0000) + (i_536_ & 0xff00) + (i_537_ >> 8);
			}
		}
		return i_529_ << 8 | 255 - (i_528_ & 0xff);
	}

	static final int method4827(int i, int i_538_) {
		i_538_ = i_538_ * (i & 0x7f) >> 7;
		if (i_538_ < 2) {
			i_538_ = 2;
		} else if (i_538_ > 126) {
			i_538_ = 126;
		}
		return (i & 0xff80) + i_538_;
	}

	static {
		anIntArray7867 = new int[8];
		anIntArray7886 = new int[8];
		anIntArray7848 = new int[8];
	}

	@Override
	void method4761(int i, int[] is, int i_539_, int i_540_, int i_541_, int i_542_, boolean bool) {
		int i_543_ = is.length;
		if (i == 0) {
			i_539_ <<= 4;
			i_540_ <<= 4;
			i_541_ <<= 4;
			int i_544_ = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_545_ = 0; i_545_ < i_543_; i_545_++) {
				int i_546_ = is[i_545_];
				if (i_546_ < verticesByLabel.length) {
					int[] is_547_ = verticesByLabel[i_546_];
					for (int i_549_ : is_547_) {
						origin_x += vertices_x[i_549_];
						origin_y += vertices_y[i_549_];
						origin_z += vertices_z[i_549_];
						i_544_++;
					}
				}
			}
			if (i_544_ > 0) {
				origin_x = origin_x / i_544_ + i_539_;
				origin_y = origin_y / i_544_ + i_540_;
				origin_z = origin_z / i_544_ + i_541_;
			} else {
				origin_x = i_539_;
				origin_y = i_540_;
				origin_z = i_541_;
			}
		} else if (i == 1) {
			i_539_ <<= 4;
			i_540_ <<= 4;
			i_541_ <<= 4;
			for (int i_550_ = 0; i_550_ < i_543_; i_550_++) {
				int i_551_ = is[i_550_];
				if (i_551_ < verticesByLabel.length) {
					int[] is_552_ = verticesByLabel[i_551_];
					for (int element : is_552_) {
						int i_554_ = element;
						vertices_x[i_554_] += i_539_;
						vertices_y[i_554_] += i_540_;
						vertices_z[i_554_] += i_541_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_555_ = 0; i_555_ < i_543_; i_555_++) {
				int i_556_ = is[i_555_];
				if (i_556_ < verticesByLabel.length) {
					int[] is_557_ = verticesByLabel[i_556_];
					if ((i_542_ & 0x1) == 0) {
						for (int element : is_557_) {
							int i_559_ = element;
							vertices_x[i_559_] -= origin_x;
							vertices_y[i_559_] -= origin_y;
							vertices_z[i_559_] -= origin_z;
							if (i_541_ != 0) {
								int i_560_ = Class220.SINE[i_541_];
								int i_561_ = Class220.COSINE[i_541_];
								int i_562_ = vertices_y[i_559_] * i_560_ + vertices_x[i_559_] * i_561_ + 16383 >> 14;
								vertices_y[i_559_] = vertices_y[i_559_] * i_561_ - vertices_x[i_559_] * i_560_ + 16383 >> 14;
								vertices_x[i_559_] = i_562_;
							}
							if (i_539_ != 0) {
								int i_563_ = Class220.SINE[i_539_];
								int i_564_ = Class220.COSINE[i_539_];
								int i_565_ = vertices_y[i_559_] * i_564_ - vertices_z[i_559_] * i_563_ + 16383 >> 14;
								vertices_z[i_559_] = vertices_y[i_559_] * i_563_ + vertices_z[i_559_] * i_564_ + 16383 >> 14;
								vertices_y[i_559_] = i_565_;
							}
							if (i_540_ != 0) {
								int i_566_ = Class220.SINE[i_540_];
								int i_567_ = Class220.COSINE[i_540_];
								int i_568_ = vertices_z[i_559_] * i_566_ + vertices_x[i_559_] * i_567_ + 16383 >> 14;
								vertices_z[i_559_] = vertices_z[i_559_] * i_567_ - vertices_x[i_559_] * i_566_ + 16383 >> 14;
								vertices_x[i_559_] = i_568_;
							}
							vertices_x[i_559_] += origin_x;
							vertices_y[i_559_] += origin_y;
							vertices_z[i_559_] += origin_z;
						}
					} else {
						for (int element : is_557_) {
							int i_570_ = element;
							vertices_x[i_570_] -= origin_x;
							vertices_y[i_570_] -= origin_y;
							vertices_z[i_570_] -= origin_z;
							if (i_539_ != 0) {
								int i_571_ = Class220.SINE[i_539_];
								int i_572_ = Class220.COSINE[i_539_];
								int i_573_ = vertices_y[i_570_] * i_572_ - vertices_z[i_570_] * i_571_ + 16383 >> 14;
								vertices_z[i_570_] = vertices_y[i_570_] * i_571_ + vertices_z[i_570_] * i_572_ + 16383 >> 14;
								vertices_y[i_570_] = i_573_;
							}
							if (i_541_ != 0) {
								int i_574_ = Class220.SINE[i_541_];
								int i_575_ = Class220.COSINE[i_541_];
								int i_576_ = vertices_y[i_570_] * i_574_ + vertices_x[i_570_] * i_575_ + 16383 >> 14;
								vertices_y[i_570_] = vertices_y[i_570_] * i_575_ - vertices_x[i_570_] * i_574_ + 16383 >> 14;
								vertices_x[i_570_] = i_576_;
							}
							if (i_540_ != 0) {
								int i_577_ = Class220.SINE[i_540_];
								int i_578_ = Class220.COSINE[i_540_];
								int i_579_ = vertices_z[i_570_] * i_577_ + vertices_x[i_570_] * i_578_ + 16383 >> 14;
								vertices_z[i_570_] = vertices_z[i_570_] * i_578_ - vertices_x[i_570_] * i_577_ + 16383 >> 14;
								vertices_x[i_570_] = i_579_;
							}
							vertices_x[i_570_] += origin_x;
							vertices_y[i_570_] += origin_y;
							vertices_z[i_570_] += origin_z;
						}
					}
				}
			}
			if (bool) {
				for (int i_580_ = 0; i_580_ < i_543_; i_580_++) {
					int i_581_ = is[i_580_];
					if (i_581_ < verticesByLabel.length) {
						int[] is_582_ = verticesByLabel[i_581_];
						for (int i_584_ : is_582_) {
							int i_585_ = anIntArray7854[i_584_];
							int i_586_ = anIntArray7854[i_584_ + 1];
							for (int i_587_ = i_585_; i_587_ < i_586_; i_587_++) {
								int i_588_ = aShortArray7830[i_587_] - 1;
								if (i_588_ == -1) {
									break;
								}
								if (i_541_ != 0) {
									int i_589_ = Class220.SINE[i_541_];
									int i_590_ = Class220.COSINE[i_541_];
									int i_591_ = aShortArray7841[i_588_] * i_589_ + aShortArray7829[i_588_] * i_590_ + 16383 >> 14;
									aShortArray7841[i_588_] = (short) (aShortArray7841[i_588_] * i_590_ - aShortArray7829[i_588_] * i_589_ + 16383 >> 14);
									aShortArray7829[i_588_] = (short) i_591_;
								}
								if (i_539_ != 0) {
									int i_592_ = Class220.SINE[i_539_];
									int i_593_ = Class220.COSINE[i_539_];
									int i_594_ = aShortArray7841[i_588_] * i_593_ - aShortArray7842[i_588_] * i_592_ + 16383 >> 14;
									aShortArray7842[i_588_] = (short) (aShortArray7841[i_588_] * i_592_ + aShortArray7842[i_588_] * i_593_ + 16383 >> 14);
									aShortArray7841[i_588_] = (short) i_594_;
								}
								if (i_540_ != 0) {
									int i_595_ = Class220.SINE[i_540_];
									int i_596_ = Class220.COSINE[i_540_];
									int i_597_ = aShortArray7842[i_588_] * i_595_ + aShortArray7829[i_588_] * i_596_ + 16383 >> 14;
									aShortArray7842[i_588_] = (short) (aShortArray7842[i_588_] * i_596_ - aShortArray7829[i_588_] * i_595_ + 16383 >> 14);
									aShortArray7829[i_588_] = (short) i_597_;
								}
							}
						}
					}
				}
				if (aClass32_7889 == null && aClass32_7858 != null) {
					aClass32_7858.anInterface1_397 = null;
				}
				if (aClass32_7889 != null) {
					aClass32_7889.anInterface1_397 = null;
				}
			}
		} else if (i == 3) {
			for (int i_598_ = 0; i_598_ < i_543_; i_598_++) {
				int i_599_ = is[i_598_];
				if (i_599_ < verticesByLabel.length) {
					int[] is_600_ = verticesByLabel[i_599_];
					for (int element : is_600_) {
						int i_602_ = element;
						vertices_x[i_602_] -= origin_x;
						vertices_y[i_602_] -= origin_y;
						vertices_z[i_602_] -= origin_z;
						vertices_x[i_602_] = vertices_x[i_602_] * i_539_ >> 7;
						vertices_y[i_602_] = vertices_y[i_602_] * i_540_ >> 7;
						vertices_z[i_602_] = vertices_z[i_602_] * i_541_ >> 7;
						vertices_x[i_602_] += origin_x;
						vertices_y[i_602_] += origin_y;
						vertices_z[i_602_] += origin_z;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray7855 != null) {
				for (int i_603_ = 0; i_603_ < i_543_; i_603_++) {
					int i_604_ = is[i_603_];
					if (i_604_ < anIntArrayArray7855.length) {
						int[] is_605_ = anIntArrayArray7855[i_604_];
						for (int element : is_605_) {
							int i_607_ = element;
							int i_608_ = (aByteArray7850[i_607_] & 0xff) + i_539_ * 8;
							if (i_608_ < 0) {
								i_608_ = 0;
							} else if (i_608_ > 255) {
								i_608_ = 255;
							}
							aByteArray7850[i_607_] = (byte) i_608_;
						}
						if (is_605_.length > 0 && aClass32_7858 != null) {
							aClass32_7858.anInterface1_397 = null;
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_609_ = 0; i_609_ < anInt7877; i_609_++) {
						Class54 class54 = aClass54Array7880[i_609_];
						Class36 class36 = aClass36Array7875[i_609_];
						class36.anInt424 = class36.anInt424 & 0xffffff | 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray7855 != null) {
				for (int i_610_ = 0; i_610_ < i_543_; i_610_++) {
					int i_611_ = is[i_610_];
					if (i_611_ < anIntArrayArray7855.length) {
						int[] is_612_ = anIntArrayArray7855[i_611_];
						for (int element : is_612_) {
							int i_614_ = element;
							int i_615_ = aShortArray7849[i_614_] & 0xffff;
							int i_616_ = i_615_ >> 10 & 0x3f;
							int i_617_ = i_615_ >> 7 & 0x7;
							int i_618_ = i_615_ & 0x7f;
							i_616_ = i_616_ + i_539_ & 0x3f;
							i_617_ += i_540_ / 4;
							if (i_617_ < 0) {
								i_617_ = 0;
							} else if (i_617_ > 7) {
								i_617_ = 7;
							}
							i_618_ += i_541_;
							if (i_618_ < 0) {
								i_618_ = 0;
							} else if (i_618_ > 127) {
								i_618_ = 127;
							}
							aShortArray7849[i_614_] = (short) (i_616_ << 10 | i_617_ << 7 | i_618_);
						}
						if (is_612_.length > 0 && aClass32_7858 != null) {
							aClass32_7858.anInterface1_397 = null;
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_619_ = 0; i_619_ < anInt7877; i_619_++) {
						Class54 class54 = aClass54Array7880[i_619_];
						Class36 class36 = aClass36Array7875[i_619_];
						class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray7882 != null) {
				for (int i_620_ = 0; i_620_ < i_543_; i_620_++) {
					int i_621_ = is[i_620_];
					if (i_621_ < anIntArrayArray7882.length) {
						int[] is_622_ = anIntArrayArray7882[i_621_];
						for (int element : is_622_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt422 += i_539_;
							class36.anInt419 += i_540_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray7882 != null) {
				for (int i_624_ = 0; i_624_ < i_543_; i_624_++) {
					int i_625_ = is[i_624_];
					if (i_625_ < anIntArrayArray7882.length) {
						int[] is_626_ = anIntArrayArray7882[i_625_];
						for (int element : is_626_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt420 = class36.anInt420 * i_539_ >> 7;
							class36.anInt421 = class36.anInt421 * i_540_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray7882 != null) {
				for (int i_628_ = 0; i_628_ < i_543_; i_628_++) {
					int i_629_ = is[i_628_];
					if (i_629_ < anIntArrayArray7882.length) {
						int[] is_630_ = anIntArrayArray7882[i_629_];
						for (int element : is_630_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt423 = class36.anInt423 + i_539_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	@Override
	public void method4747(ModelPart modelPart, int i, int i_632_, int i_633_, boolean bool) {
		ModelPart_Sub2 class387_sub2_634_ = (ModelPart_Sub2) modelPart;
		if (anInt7847 != 0 && class387_sub2_634_.anInt7847 != 0) {
			int i_635_ = class387_sub2_634_.anInt7833;
			int[] is = class387_sub2_634_.vertices_x;
			int[] is_636_ = class387_sub2_634_.vertices_y;
			int[] is_637_ = class387_sub2_634_.vertices_z;
			short[] is_638_ = class387_sub2_634_.aShortArray7829;
			short[] is_639_ = class387_sub2_634_.aShortArray7841;
			short[] is_640_ = class387_sub2_634_.aShortArray7842;
			byte[] is_641_ = class387_sub2_634_.aByteArray7887;
			short[] is_642_;
			short[] is_643_;
			short[] is_644_;
			byte[] is_645_;
			if (aClass67_7844 != null) {
				is_642_ = aClass67_7844.aShortArray669;
				is_643_ = aClass67_7844.aShortArray668;
				is_644_ = aClass67_7844.aShortArray667;
				is_645_ = aClass67_7844.aByteArray670;
			} else {
				is_642_ = null;
				is_643_ = null;
				is_644_ = null;
				is_645_ = null;
			}
			short[] is_646_;
			short[] is_647_;
			short[] is_648_;
			byte[] is_649_;
			if (class387_sub2_634_.aClass67_7844 != null) {
				is_646_ = class387_sub2_634_.aClass67_7844.aShortArray669;
				is_647_ = class387_sub2_634_.aClass67_7844.aShortArray668;
				is_648_ = class387_sub2_634_.aClass67_7844.aShortArray667;
				is_649_ = class387_sub2_634_.aClass67_7844.aByteArray670;
			} else {
				is_646_ = null;
				is_647_ = null;
				is_648_ = null;
				is_649_ = null;
			}
			int[] is_650_ = class387_sub2_634_.anIntArray7854;
			short[] is_651_ = class387_sub2_634_.aShortArray7830;
			if (!class387_sub2_634_.aBoolean7843) {
				class387_sub2_634_.method4831();
			}
			int i_652_ = class387_sub2_634_.aShort7868;
			int i_653_ = class387_sub2_634_.aShort7874;
			int i_654_ = class387_sub2_634_.aShort7870;
			int i_655_ = class387_sub2_634_.aShort7871;
			int i_656_ = class387_sub2_634_.aShort7872;
			int i_657_ = class387_sub2_634_.aShort7876;
			for (int i_658_ = 0; i_658_ < anInt7833; i_658_++) {
				int i_659_ = vertices_y[i_658_] - i_632_;
				if (i_659_ >= i_652_ && i_659_ <= i_653_) {
					int i_660_ = vertices_x[i_658_] - i;
					if (i_660_ >= i_654_ && i_660_ <= i_655_) {
						int i_661_ = vertices_z[i_658_] - i_633_;
						if (i_661_ >= i_656_ && i_661_ <= i_657_) {
							int i_662_ = -1;
							int i_663_ = anIntArray7854[i_658_];
							int i_664_ = anIntArray7854[i_658_ + 1];
							for (int i_665_ = i_663_; i_665_ < i_664_; i_665_++) {
								i_662_ = aShortArray7830[i_665_] - 1;
								if (i_662_ == -1 || aByteArray7887[i_662_] != 0) {
									break;
								}
							}
							if (i_662_ != -1) {
								for (int i_666_ = 0; i_666_ < i_635_; i_666_++) {
									if (i_660_ == is[i_666_] && i_661_ == is_637_[i_666_] && i_659_ == is_636_[i_666_]) {
										int i_667_ = -1;
										i_663_ = is_650_[i_666_];
										i_664_ = is_650_[i_666_ + 1];
										for (int i_668_ = i_663_; i_668_ < i_664_; i_668_++) {
											i_667_ = is_651_[i_668_] - 1;
											if (i_667_ == -1 || is_641_[i_667_] != 0) {
												break;
											}
										}
										if (i_667_ != -1) {
											if (is_642_ == null) {
												aClass67_7844 = new Class67();
												is_642_ = aClass67_7844.aShortArray669 = Class378.method4670(aShortArray7829, (byte) -55);
												is_643_ = aClass67_7844.aShortArray668 = Class378.method4670(aShortArray7841, (byte) -75);
												is_644_ = aClass67_7844.aShortArray667 = Class378.method4670(aShortArray7842, (byte) -112);
												is_645_ = aClass67_7844.aByteArray670 = Class409.method4978(aByteArray7887, 1194497584);
											}
											if (is_646_ == null) {
												Class67 class67 = class387_sub2_634_.aClass67_7844 = new Class67();
												is_646_ = class67.aShortArray669 = Class378.method4670(is_638_, (byte) -66);
												is_647_ = class67.aShortArray668 = Class378.method4670(is_639_, (byte) -1);
												is_648_ = class67.aShortArray667 = Class378.method4670(is_640_, (byte) -78);
												is_649_ = class67.aByteArray670 = Class409.method4978(is_641_, 1194497584);
											}
											short i_669_ = aShortArray7829[i_662_];
											short i_670_ = aShortArray7841[i_662_];
											short i_671_ = aShortArray7842[i_662_];
											byte i_672_ = aByteArray7887[i_662_];
											i_663_ = is_650_[i_666_];
											i_664_ = is_650_[i_666_ + 1];
											for (int i_673_ = i_663_; i_673_ < i_664_; i_673_++) {
												int i_674_ = is_651_[i_673_] - 1;
												if (i_674_ == -1) {
													break;
												}
												if (is_649_[i_674_] != 0) {
													is_646_[i_674_] += i_669_;
													is_647_[i_674_] += i_670_;
													is_648_[i_674_] += i_671_;
													is_649_[i_674_] += i_672_;
												}
											}
											i_669_ = is_638_[i_667_];
											i_670_ = is_639_[i_667_];
											i_671_ = is_640_[i_667_];
											i_672_ = is_641_[i_667_];
											i_663_ = anIntArray7854[i_658_];
											i_664_ = anIntArray7854[i_658_ + 1];
											for (int i_675_ = i_663_; i_675_ < i_664_; i_675_++) {
												int i_676_ = aShortArray7830[i_675_] - 1;
												if (i_676_ == -1) {
													break;
												}
												if (is_645_[i_676_] != 0) {
													is_642_[i_676_] += i_669_;
													is_643_[i_676_] += i_670_;
													is_644_[i_676_] += i_671_;
													is_645_[i_676_] += i_672_;
												}
											}
											if (aClass32_7889 == null && aClass32_7858 != null) {
												aClass32_7858.anInterface1_397 = null;
											}
											if (aClass32_7889 != null) {
												aClass32_7889.anInterface1_397 = null;
											}
											if (class387_sub2_634_.aClass32_7889 == null && class387_sub2_634_.aClass32_7858 != null) {
												class387_sub2_634_.aClass32_7858.anInterface1_397 = null;
											}
											if (class387_sub2_634_.aClass32_7889 != null) {
												class387_sub2_634_.aClass32_7889.anInterface1_397 = null;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	public ModelPart method4748(byte i, int i_677_, boolean bool) {
		boolean bool_678_ = false;
		ModelPart_Sub2 class387_sub2_679_;
		ModelPart_Sub2 class387_sub2_680_;
		if (i > 0 && i <= 7) {
			class387_sub2_680_ = aClass_ra_Sub2_7824.aClass387_Sub2Array8084[i - 1];
			class387_sub2_679_ = aClass_ra_Sub2_7824.aClass387_Sub2Array8189[i - 1];
			bool_678_ = true;
		} else {
			class387_sub2_679_ = class387_sub2_680_ = new ModelPart_Sub2(aClass_ra_Sub2_7824);
		}
		return method4819(class387_sub2_679_, class387_sub2_680_, i_677_, bool_678_, bool);
	}

	@Override
	public ModelPart method4770(byte i, int i_681_, boolean bool) {
		boolean bool_682_ = false;
		ModelPart_Sub2 class387_sub2_683_;
		ModelPart_Sub2 class387_sub2_684_;
		if (i > 0 && i <= 7) {
			class387_sub2_684_ = aClass_ra_Sub2_7824.aClass387_Sub2Array8084[i - 1];
			class387_sub2_683_ = aClass_ra_Sub2_7824.aClass387_Sub2Array8189[i - 1];
			bool_682_ = true;
		} else {
			class387_sub2_683_ = class387_sub2_684_ = new ModelPart_Sub2(aClass_ra_Sub2_7824);
		}
		return method4819(class387_sub2_683_, class387_sub2_684_, i_681_, bool_682_, bool);
	}

	@Override
	public ModelPart method4749(byte i, int i_685_, boolean bool) {
		boolean bool_686_ = false;
		ModelPart_Sub2 class387_sub2_687_;
		ModelPart_Sub2 class387_sub2_688_;
		if (i > 0 && i <= 7) {
			class387_sub2_688_ = aClass_ra_Sub2_7824.aClass387_Sub2Array8084[i - 1];
			class387_sub2_687_ = aClass_ra_Sub2_7824.aClass387_Sub2Array8189[i - 1];
			bool_686_ = true;
		} else {
			class387_sub2_687_ = class387_sub2_688_ = new ModelPart_Sub2(aClass_ra_Sub2_7824);
		}
		return method4819(class387_sub2_687_, class387_sub2_688_, i_685_, bool_686_, bool);
	}

	@Override
	public void method4786(Matrix43f class222) {
		Class233 class233 = aClass_ra_Sub2_7824.aClass233_8104;
		class233.method2145(class222);
		if (aClass85Array7825 != null) {
			for (Class85 class85 : aClass85Array7825) {
				Class85 class85_689_ = class85;
				if (class85.aClass85_776 != null) {
					class85_689_ = class85.aClass85_776;
				}
				class85_689_.anInt777 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[4] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[8] * vertices_z[class85.anInt773 * -710317103])) * -1879868075;
				class85_689_.anInt783 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[5] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[9] * vertices_z[class85.anInt773 * -710317103])) * -2041556771;
				class85_689_.anInt779 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[6] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[10] * vertices_z[class85.anInt773 * -710317103])) * -1434499227;
				class85_689_.anInt772 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[4] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[8] * vertices_z[class85.anInt774 * 1705862021])) * 1070341177;
				class85_689_.anInt781 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[5] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[9] * vertices_z[class85.anInt774 * 1705862021])) * 1802851857;
				class85_689_.anInt782 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[6] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[10] * vertices_z[class85.anInt774 * 1705862021])) * 103846281;
				class85_689_.anInt771 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[4] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[8] * vertices_z[class85.anInt775 * 1636170731])) * -2103324039;
				class85_689_.anInt784 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[5] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[9] * vertices_z[class85.anInt775 * 1636170731])) * -526039059;
				class85_689_.anInt785 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[6] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[10] * vertices_z[class85.anInt775 * 1636170731])) * 491030489;
			}
		}
		if (aMagnetConfigArray7857 != null) {
			for (MagnetConfig element : aMagnetConfigArray7857) {
				MagnetConfig magnetConfig = element;
				MagnetConfig magnetConfig_690_ = magnetConfig;
				if (magnetConfig.aMagnetConfig_672 != null) {
					magnetConfig_690_ = magnetConfig.aMagnetConfig_672;
				}
				if (magnetConfig.aClass233_677 != null) {
					magnetConfig.aClass233_677.method2142(class233);
				} else {
					magnetConfig.aClass233_677 = new Class233(class233);
				}
				magnetConfig_690_.anInt671 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[4] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[8] * vertices_z[magnetConfig.anInt674 * -180596249])) * -1436341053;
				magnetConfig_690_.anInt675 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[5] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[9] * vertices_z[magnetConfig.anInt674 * -180596249])) * 449866009;
				magnetConfig_690_.anInt676 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[6] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[10] * vertices_z[magnetConfig.anInt674 * -180596249])) * 1336328763;
			}
		}
	}

	@Override
	public int an() {
		return anInt7863;
	}

	@Override
	public void ar(int i) {
		anInt7863 = i;
		if (aClass67_7844 != null && (anInt7863 & 0x10000) == 0) {
			aShortArray7829 = aClass67_7844.aShortArray669;
			aShortArray7841 = aClass67_7844.aShortArray668;
			aShortArray7842 = aClass67_7844.aShortArray667;
			aByteArray7887 = aClass67_7844.aByteArray670;
			aClass67_7844 = null;
		}
		aBoolean7864 = true;
		method4820();
	}

	@Override
	public void bx(int i) {
		int i_691_ = Class220.SINE[i];
		int i_692_ = Class220.COSINE[i];
		for (int i_693_ = 0; i_693_ < anInt7833; i_693_++) {
			int i_694_ = vertices_z[i_693_] * i_691_ + vertices_x[i_693_] * i_692_ >> 14;
			vertices_z[i_693_] = vertices_z[i_693_] * i_692_ - vertices_x[i_693_] * i_691_ >> 14;
			vertices_x[i_693_] = i_694_;
		}
		for (int i_695_ = 0; i_695_ < anInt7839; i_695_++) {
			int i_696_ = aShortArray7842[i_695_] * i_691_ + aShortArray7829[i_695_] * i_692_ >> 14;
			aShortArray7842[i_695_] = (short) (aShortArray7842[i_695_] * i_692_ - aShortArray7829[i_695_] * i_691_ >> 14);
			aShortArray7829[i_695_] = (short) i_696_;
		}
		if (aClass32_7889 == null && aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
		if (aClass32_7889 != null) {
			aClass32_7889.anInterface1_397 = null;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void method4764() {
		if (anInt7839 > 0 && anInt7885 > 0) {
			method4825(false);
			if ((aByte7827 & 0x10) == 0 && aClass41_7879.anInterface2_441 == null) {
				method4830(false);
			}
			method4820();
		}
	}

	@Override
	public void df(short i, short i_697_) {
		Interface_ma interface_ma = aClass_ra_Sub2_7824.anInterface_ma5299;
		for (int i_698_ = 0; i_698_ < anInt7847; i_698_++) {
			if (aShortArray7861[i_698_] == i) {
				aShortArray7861[i_698_] = i_697_;
			}
		}
		byte i_699_ = 0;
		byte i_700_ = 0;
		if (i != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i & 0xffff, 1221717482);
			i_699_ = materialRaw.aByte533;
			i_700_ = materialRaw.aByte534;
		}
		byte i_701_ = 0;
		byte i_702_ = 0;
		if (i_697_ != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i_697_ & 0xffff, 251711891);
			i_701_ = materialRaw.aByte533;
			i_702_ = materialRaw.aByte534;
			if (materialRaw.aByte535 != 0 || materialRaw.aByte509 != 0) {
				aBoolean7862 = true;
			}
		}
		if (i_699_ != i_701_ | i_700_ != i_702_) {
			if (aClass54Array7880 != null) {
				for (int i_703_ = 0; i_703_ < anInt7877; i_703_++) {
					Class54 class54 = aClass54Array7880[i_703_];
					Class36 class36 = aClass36Array7875[i_703_];
					class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
				}
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
		}
	}

	short method4828(Model class64, int i, long l, int i_704_, int i_705_, int i_706_, int i_707_, float f, float f_708_) {
		int i_709_ = anIntArray7854[i];
		int i_710_ = anIntArray7854[i + 1];
		int i_711_ = 0;
		for (int i_712_ = i_709_; i_712_ < i_710_; i_712_++) {
			short i_713_ = aShortArray7830[i_712_];
			if (i_713_ == 0) {
				i_711_ = i_712_;
				break;
			}
			if (aLongArray7883[i_712_] == l) {
				return (short) (i_713_ - 1);
			}
		}
		aShortArray7830[i_711_] = (short) (anInt7839 + 1);
		aLongArray7883[i_711_] = l;
		aShortArray7829[anInt7839] = (short) i_704_;
		aShortArray7841[anInt7839] = (short) i_705_;
		aShortArray7842[anInt7839] = (short) i_706_;
		aByteArray7887[anInt7839] = (byte) i_707_;
		aFloatArray7845[anInt7839] = f;
		aFloatArray7846[anInt7839] = f_708_;
		return (short) anInt7839++;
	}

	@Override
	public void by(int i) {
		int i_714_ = Class220.SINE[i];
		int i_715_ = Class220.COSINE[i];
		for (int i_716_ = 0; i_716_ < anInt7833; i_716_++) {
			int i_717_ = vertices_z[i_716_] * i_714_ + vertices_x[i_716_] * i_715_ >> 14;
			vertices_z[i_716_] = vertices_z[i_716_] * i_715_ - vertices_x[i_716_] * i_714_ >> 14;
			vertices_x[i_716_] = i_717_;
		}
		for (int i_718_ = 0; i_718_ < anInt7839; i_718_++) {
			int i_719_ = aShortArray7842[i_718_] * i_714_ + aShortArray7829[i_718_] * i_715_ >> 14;
			aShortArray7842[i_718_] = (short) (aShortArray7842[i_718_] * i_715_ - aShortArray7829[i_718_] * i_714_ >> 14);
			aShortArray7829[i_718_] = (short) i_719_;
		}
		if (aClass32_7889 == null && aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
		if (aClass32_7889 != null) {
			aClass32_7889.anInterface1_397 = null;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void bm(int i) {
		int i_720_ = Class220.SINE[i];
		int i_721_ = Class220.COSINE[i];
		for (int i_722_ = 0; i_722_ < anInt7833; i_722_++) {
			int i_723_ = vertices_z[i_722_] * i_720_ + vertices_x[i_722_] * i_721_ >> 14;
			vertices_z[i_722_] = vertices_z[i_722_] * i_721_ - vertices_x[i_722_] * i_720_ >> 14;
			vertices_x[i_722_] = i_723_;
		}
		for (int i_724_ = 0; i_724_ < anInt7839; i_724_++) {
			int i_725_ = aShortArray7842[i_724_] * i_720_ + aShortArray7829[i_724_] * i_721_ >> 14;
			aShortArray7842[i_724_] = (short) (aShortArray7842[i_724_] * i_721_ - aShortArray7829[i_724_] * i_720_ >> 14);
			aShortArray7829[i_724_] = (short) i_725_;
		}
		if (aClass32_7889 == null && aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
		if (aClass32_7889 != null) {
			aClass32_7889.anInterface1_397 = null;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	void co(int i, int[] is, int i_726_, int i_727_, int i_728_, boolean bool, int i_729_, int[] is_730_) {
		int i_731_ = is.length;
		if (i == 0) {
			i_726_ <<= 4;
			i_727_ <<= 4;
			i_728_ <<= 4;
			int i_732_ = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_733_ = 0; i_733_ < i_731_; i_733_++) {
				int i_734_ = is[i_733_];
				if (i_734_ < verticesByLabel.length) {
					int[] is_735_ = verticesByLabel[i_734_];
					for (int i_737_ : is_735_) {
						if (aShortArray7838 == null || (i_729_ & aShortArray7838[i_737_]) != 0) {
							origin_x += vertices_x[i_737_];
							origin_y += vertices_y[i_737_];
							origin_z += vertices_z[i_737_];
							i_732_++;
						}
					}
				}
			}
			if (i_732_ > 0) {
				origin_x = origin_x / i_732_ + i_726_;
				origin_y = origin_y / i_732_ + i_727_;
				origin_z = origin_z / i_732_ + i_728_;
				aBoolean7817 = true;
			} else {
				origin_x = i_726_;
				origin_y = i_727_;
				origin_z = i_728_;
			}
		} else if (i == 1) {
			if (is_730_ != null) {
				int i_738_ = is_730_[0] * i_726_ + is_730_[1] * i_727_ + is_730_[2] * i_728_ + 8192 >> 14;
				int i_739_ = is_730_[3] * i_726_ + is_730_[4] * i_727_ + is_730_[5] * i_728_ + 8192 >> 14;
				int i_740_ = is_730_[6] * i_726_ + is_730_[7] * i_727_ + is_730_[8] * i_728_ + 8192 >> 14;
				i_726_ = i_738_;
				i_727_ = i_739_;
				i_728_ = i_740_;
			}
			i_726_ <<= 4;
			i_727_ <<= 4;
			i_728_ <<= 4;
			for (int i_741_ = 0; i_741_ < i_731_; i_741_++) {
				int i_742_ = is[i_741_];
				if (i_742_ < verticesByLabel.length) {
					int[] is_743_ = verticesByLabel[i_742_];
					for (int element : is_743_) {
						int i_745_ = element;
						if (aShortArray7838 == null || (i_729_ & aShortArray7838[i_745_]) != 0) {
							vertices_x[i_745_] += i_726_;
							vertices_y[i_745_] += i_727_;
							vertices_z[i_745_] += i_728_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_730_ != null) {
				int i_746_ = is_730_[9] << 4;
				int i_747_ = is_730_[10] << 4;
				int i_748_ = is_730_[11] << 4;
				int i_749_ = is_730_[12] << 4;
				int i_750_ = is_730_[13] << 4;
				int i_751_ = is_730_[14] << 4;
				if (aBoolean7817) {
					int i_752_ = is_730_[0] * origin_x + is_730_[3] * origin_y + is_730_[6] * origin_z + 8192 >> 14;
					int i_753_ = is_730_[1] * origin_x + is_730_[4] * origin_y + is_730_[7] * origin_z + 8192 >> 14;
					int i_754_ = is_730_[2] * origin_x + is_730_[5] * origin_y + is_730_[8] * origin_z + 8192 >> 14;
					i_752_ += i_749_;
					i_753_ += i_750_;
					i_754_ += i_751_;
					origin_x = i_752_;
					origin_y = i_753_;
					origin_z = i_754_;
					aBoolean7817 = false;
				}
				int[] is_755_ = new int[9];
				int i_756_ = Class220.COSINE[i_726_];
				int i_757_ = Class220.SINE[i_726_];
				int i_758_ = Class220.COSINE[i_727_];
				int i_759_ = Class220.SINE[i_727_];
				int i_760_ = Class220.COSINE[i_728_];
				int i_761_ = Class220.SINE[i_728_];
				int i_762_ = i_757_ * i_760_ + 8192 >> 14;
				int i_763_ = i_757_ * i_761_ + 8192 >> 14;
				is_755_[0] = i_758_ * i_760_ + i_759_ * i_763_ + 8192 >> 14;
				is_755_[1] = -i_758_ * i_761_ + i_759_ * i_762_ + 8192 >> 14;
				is_755_[2] = i_759_ * i_756_ + 8192 >> 14;
				is_755_[3] = i_756_ * i_761_ + 8192 >> 14;
				is_755_[4] = i_756_ * i_760_ + 8192 >> 14;
				is_755_[5] = -i_757_;
				is_755_[6] = -i_759_ * i_760_ + i_758_ * i_763_ + 8192 >> 14;
				is_755_[7] = i_759_ * i_761_ + i_758_ * i_762_ + 8192 >> 14;
				is_755_[8] = i_758_ * i_756_ + 8192 >> 14;
				int i_764_ = is_755_[0] * -origin_x + is_755_[1] * -origin_y + is_755_[2] * -origin_z + 8192 >> 14;
				int i_765_ = is_755_[3] * -origin_x + is_755_[4] * -origin_y + is_755_[5] * -origin_z + 8192 >> 14;
				int i_766_ = is_755_[6] * -origin_x + is_755_[7] * -origin_y + is_755_[8] * -origin_z + 8192 >> 14;
				int i_767_ = i_764_ + origin_x;
				int i_768_ = i_765_ + origin_y;
				int i_769_ = i_766_ + origin_z;
				int[] is_770_ = new int[9];
				for (int i_771_ = 0; i_771_ < 3; i_771_++) {
					for (int i_772_ = 0; i_772_ < 3; i_772_++) {
						int i_773_ = 0;
						for (int i_774_ = 0; i_774_ < 3; i_774_++) {
							i_773_ += is_755_[i_771_ * 3 + i_774_] * is_730_[i_772_ * 3 + i_774_];
						}
						is_770_[i_771_ * 3 + i_772_] = i_773_ + 8192 >> 14;
					}
				}
				int i_775_ = is_755_[0] * i_749_ + is_755_[1] * i_750_ + is_755_[2] * i_751_ + 8192 >> 14;
				int i_776_ = is_755_[3] * i_749_ + is_755_[4] * i_750_ + is_755_[5] * i_751_ + 8192 >> 14;
				int i_777_ = is_755_[6] * i_749_ + is_755_[7] * i_750_ + is_755_[8] * i_751_ + 8192 >> 14;
				i_775_ += i_767_;
				i_776_ += i_768_;
				i_777_ += i_769_;
				int[] is_778_ = new int[9];
				for (int i_779_ = 0; i_779_ < 3; i_779_++) {
					for (int i_780_ = 0; i_780_ < 3; i_780_++) {
						int i_781_ = 0;
						for (int i_782_ = 0; i_782_ < 3; i_782_++) {
							i_781_ += is_730_[i_779_ * 3 + i_782_] * is_770_[i_780_ + i_782_ * 3];
						}
						is_778_[i_779_ * 3 + i_780_] = i_781_ + 8192 >> 14;
					}
				}
				int i_783_ = is_730_[0] * i_775_ + is_730_[1] * i_776_ + is_730_[2] * i_777_ + 8192 >> 14;
				int i_784_ = is_730_[3] * i_775_ + is_730_[4] * i_776_ + is_730_[5] * i_777_ + 8192 >> 14;
				int i_785_ = is_730_[6] * i_775_ + is_730_[7] * i_776_ + is_730_[8] * i_777_ + 8192 >> 14;
				i_783_ += i_746_;
				i_784_ += i_747_;
				i_785_ += i_748_;
				for (int i_786_ = 0; i_786_ < i_731_; i_786_++) {
					int i_787_ = is[i_786_];
					if (i_787_ < verticesByLabel.length) {
						int[] is_788_ = verticesByLabel[i_787_];
						for (int element : is_788_) {
							int i_790_ = element;
							if (aShortArray7838 == null || (i_729_ & aShortArray7838[i_790_]) != 0) {
								int i_791_ = is_778_[0] * vertices_x[i_790_] + is_778_[1] * vertices_y[i_790_] + is_778_[2] * vertices_z[i_790_] + 8192 >> 14;
								int i_792_ = is_778_[3] * vertices_x[i_790_] + is_778_[4] * vertices_y[i_790_] + is_778_[5] * vertices_z[i_790_] + 8192 >> 14;
								int i_793_ = is_778_[6] * vertices_x[i_790_] + is_778_[7] * vertices_y[i_790_] + is_778_[8] * vertices_z[i_790_] + 8192 >> 14;
								i_791_ += i_783_;
								i_792_ += i_784_;
								i_793_ += i_785_;
								vertices_x[i_790_] = i_791_;
								vertices_y[i_790_] = i_792_;
								vertices_z[i_790_] = i_793_;
							}
						}
					}
				}
			} else {
				for (int i_794_ = 0; i_794_ < i_731_; i_794_++) {
					int i_795_ = is[i_794_];
					if (i_795_ < verticesByLabel.length) {
						int[] is_796_ = verticesByLabel[i_795_];
						for (int element : is_796_) {
							int i_798_ = element;
							if (aShortArray7838 == null || (i_729_ & aShortArray7838[i_798_]) != 0) {
								vertices_x[i_798_] -= origin_x;
								vertices_y[i_798_] -= origin_y;
								vertices_z[i_798_] -= origin_z;
								if (i_728_ != 0) {
									int i_799_ = Class220.SINE[i_728_];
									int i_800_ = Class220.COSINE[i_728_];
									int i_801_ = vertices_y[i_798_] * i_799_ + vertices_x[i_798_] * i_800_ + 16383 >> 14;
									vertices_y[i_798_] = vertices_y[i_798_] * i_800_ - vertices_x[i_798_] * i_799_ + 16383 >> 14;
									vertices_x[i_798_] = i_801_;
								}
								if (i_726_ != 0) {
									int i_802_ = Class220.SINE[i_726_];
									int i_803_ = Class220.COSINE[i_726_];
									int i_804_ = vertices_y[i_798_] * i_803_ - vertices_z[i_798_] * i_802_ + 16383 >> 14;
									vertices_z[i_798_] = vertices_y[i_798_] * i_802_ + vertices_z[i_798_] * i_803_ + 16383 >> 14;
									vertices_y[i_798_] = i_804_;
								}
								if (i_727_ != 0) {
									int i_805_ = Class220.SINE[i_727_];
									int i_806_ = Class220.COSINE[i_727_];
									int i_807_ = vertices_z[i_798_] * i_805_ + vertices_x[i_798_] * i_806_ + 16383 >> 14;
									vertices_z[i_798_] = vertices_z[i_798_] * i_806_ - vertices_x[i_798_] * i_805_ + 16383 >> 14;
									vertices_x[i_798_] = i_807_;
								}
								vertices_x[i_798_] += origin_x;
								vertices_y[i_798_] += origin_y;
								vertices_z[i_798_] += origin_z;
							}
						}
					}
				}
				if (bool) {
					for (int i_808_ = 0; i_808_ < i_731_; i_808_++) {
						int i_809_ = is[i_808_];
						if (i_809_ < verticesByLabel.length) {
							int[] is_810_ = verticesByLabel[i_809_];
							for (int i_812_ : is_810_) {
								if (aShortArray7838 == null || (i_729_ & aShortArray7838[i_812_]) != 0) {
									int i_813_ = anIntArray7854[i_812_];
									int i_814_ = anIntArray7854[i_812_ + 1];
									for (int i_815_ = i_813_; i_815_ < i_814_; i_815_++) {
										int i_816_ = aShortArray7830[i_815_] - 1;
										if (i_816_ == -1) {
											break;
										}
										if (i_728_ != 0) {
											int i_817_ = Class220.SINE[i_728_];
											int i_818_ = Class220.COSINE[i_728_];
											int i_819_ = aShortArray7841[i_816_] * i_817_ + aShortArray7829[i_816_] * i_818_ + 16383 >> 14;
											aShortArray7841[i_816_] = (short) (aShortArray7841[i_816_] * i_818_ - aShortArray7829[i_816_] * i_817_ + 16383 >> 14);
											aShortArray7829[i_816_] = (short) i_819_;
										}
										if (i_726_ != 0) {
											int i_820_ = Class220.SINE[i_726_];
											int i_821_ = Class220.COSINE[i_726_];
											int i_822_ = aShortArray7841[i_816_] * i_821_ - aShortArray7842[i_816_] * i_820_ + 16383 >> 14;
											aShortArray7842[i_816_] = (short) (aShortArray7841[i_816_] * i_820_ + aShortArray7842[i_816_] * i_821_ + 16383 >> 14);
											aShortArray7841[i_816_] = (short) i_822_;
										}
										if (i_727_ != 0) {
											int i_823_ = Class220.SINE[i_727_];
											int i_824_ = Class220.COSINE[i_727_];
											int i_825_ = aShortArray7842[i_816_] * i_823_ + aShortArray7829[i_816_] * i_824_ + 16383 >> 14;
											aShortArray7842[i_816_] = (short) (aShortArray7842[i_816_] * i_824_ - aShortArray7829[i_816_] * i_823_ + 16383 >> 14);
											aShortArray7829[i_816_] = (short) i_825_;
										}
									}
								}
							}
						}
					}
					if (aClass32_7889 == null && aClass32_7858 != null) {
						aClass32_7858.anInterface1_397 = null;
					}
					if (aClass32_7889 != null) {
						aClass32_7889.anInterface1_397 = null;
					}
				}
			}
		} else if (i == 3) {
			if (is_730_ != null) {
				int i_826_ = is_730_[9] << 4;
				int i_827_ = is_730_[10] << 4;
				int i_828_ = is_730_[11] << 4;
				int i_829_ = is_730_[12] << 4;
				int i_830_ = is_730_[13] << 4;
				int i_831_ = is_730_[14] << 4;
				if (aBoolean7817) {
					int i_832_ = is_730_[0] * origin_x + is_730_[3] * origin_y + is_730_[6] * origin_z + 8192 >> 14;
					int i_833_ = is_730_[1] * origin_x + is_730_[4] * origin_y + is_730_[7] * origin_z + 8192 >> 14;
					int i_834_ = is_730_[2] * origin_x + is_730_[5] * origin_y + is_730_[8] * origin_z + 8192 >> 14;
					i_832_ += i_829_;
					i_833_ += i_830_;
					i_834_ += i_831_;
					origin_x = i_832_;
					origin_y = i_833_;
					origin_z = i_834_;
					aBoolean7817 = false;
				}
				int i_835_ = i_726_ << 15 >> 7;
				int i_836_ = i_727_ << 15 >> 7;
				int i_837_ = i_728_ << 15 >> 7;
				int i_838_ = i_835_ * -origin_x + 8192 >> 14;
				int i_839_ = i_836_ * -origin_y + 8192 >> 14;
				int i_840_ = i_837_ * -origin_z + 8192 >> 14;
				int i_841_ = i_838_ + origin_x;
				int i_842_ = i_839_ + origin_y;
				int i_843_ = i_840_ + origin_z;
				int[] is_844_ = new int[9];
				is_844_[0] = i_835_ * is_730_[0] + 8192 >> 14;
				is_844_[1] = i_835_ * is_730_[3] + 8192 >> 14;
				is_844_[2] = i_835_ * is_730_[6] + 8192 >> 14;
				is_844_[3] = i_836_ * is_730_[1] + 8192 >> 14;
				is_844_[4] = i_836_ * is_730_[4] + 8192 >> 14;
				is_844_[5] = i_836_ * is_730_[7] + 8192 >> 14;
				is_844_[6] = i_837_ * is_730_[2] + 8192 >> 14;
				is_844_[7] = i_837_ * is_730_[5] + 8192 >> 14;
				is_844_[8] = i_837_ * is_730_[8] + 8192 >> 14;
				int i_845_ = i_835_ * i_829_ + 8192 >> 14;
				int i_846_ = i_836_ * i_830_ + 8192 >> 14;
				int i_847_ = i_837_ * i_831_ + 8192 >> 14;
				i_845_ += i_841_;
				i_846_ += i_842_;
				i_847_ += i_843_;
				int[] is_848_ = new int[9];
				for (int i_849_ = 0; i_849_ < 3; i_849_++) {
					for (int i_850_ = 0; i_850_ < 3; i_850_++) {
						int i_851_ = 0;
						for (int i_852_ = 0; i_852_ < 3; i_852_++) {
							i_851_ += is_730_[i_849_ * 3 + i_852_] * is_844_[i_850_ + i_852_ * 3];
						}
						is_848_[i_849_ * 3 + i_850_] = i_851_ + 8192 >> 14;
					}
				}
				int i_853_ = is_730_[0] * i_845_ + is_730_[1] * i_846_ + is_730_[2] * i_847_ + 8192 >> 14;
				int i_854_ = is_730_[3] * i_845_ + is_730_[4] * i_846_ + is_730_[5] * i_847_ + 8192 >> 14;
				int i_855_ = is_730_[6] * i_845_ + is_730_[7] * i_846_ + is_730_[8] * i_847_ + 8192 >> 14;
				i_853_ += i_826_;
				i_854_ += i_827_;
				i_855_ += i_828_;
				for (int i_856_ = 0; i_856_ < i_731_; i_856_++) {
					int i_857_ = is[i_856_];
					if (i_857_ < verticesByLabel.length) {
						int[] is_858_ = verticesByLabel[i_857_];
						for (int element : is_858_) {
							int i_860_ = element;
							if (aShortArray7838 == null || (i_729_ & aShortArray7838[i_860_]) != 0) {
								int i_861_ = is_848_[0] * vertices_x[i_860_] + is_848_[1] * vertices_y[i_860_] + is_848_[2] * vertices_z[i_860_] + 8192 >> 14;
								int i_862_ = is_848_[3] * vertices_x[i_860_] + is_848_[4] * vertices_y[i_860_] + is_848_[5] * vertices_z[i_860_] + 8192 >> 14;
								int i_863_ = is_848_[6] * vertices_x[i_860_] + is_848_[7] * vertices_y[i_860_] + is_848_[8] * vertices_z[i_860_] + 8192 >> 14;
								i_861_ += i_853_;
								i_862_ += i_854_;
								i_863_ += i_855_;
								vertices_x[i_860_] = i_861_;
								vertices_y[i_860_] = i_862_;
								vertices_z[i_860_] = i_863_;
							}
						}
					}
				}
			} else {
				for (int i_864_ = 0; i_864_ < i_731_; i_864_++) {
					int i_865_ = is[i_864_];
					if (i_865_ < verticesByLabel.length) {
						int[] is_866_ = verticesByLabel[i_865_];
						for (int element : is_866_) {
							int i_868_ = element;
							if (aShortArray7838 == null || (i_729_ & aShortArray7838[i_868_]) != 0) {
								vertices_x[i_868_] -= origin_x;
								vertices_y[i_868_] -= origin_y;
								vertices_z[i_868_] -= origin_z;
								vertices_x[i_868_] = vertices_x[i_868_] * i_726_ >> 7;
								vertices_y[i_868_] = vertices_y[i_868_] * i_727_ >> 7;
								vertices_z[i_868_] = vertices_z[i_868_] * i_728_ >> 7;
								vertices_x[i_868_] += origin_x;
								vertices_y[i_868_] += origin_y;
								vertices_z[i_868_] += origin_z;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray7855 != null) {
				for (int i_869_ = 0; i_869_ < i_731_; i_869_++) {
					int i_870_ = is[i_869_];
					if (i_870_ < anIntArrayArray7855.length) {
						int[] is_871_ = anIntArrayArray7855[i_870_];
						for (int element : is_871_) {
							int i_873_ = element;
							if (aShortArray7856 == null || (i_729_ & aShortArray7856[i_873_]) != 0) {
								int i_874_ = (aByteArray7850[i_873_] & 0xff) + i_726_ * 8;
								if (i_874_ < 0) {
									i_874_ = 0;
								} else if (i_874_ > 255) {
									i_874_ = 255;
								}
								aByteArray7850[i_873_] = (byte) i_874_;
								if (aClass32_7858 != null) {
									aClass32_7858.anInterface1_397 = null;
								}
							}
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_875_ = 0; i_875_ < anInt7877; i_875_++) {
						Class54 class54 = aClass54Array7880[i_875_];
						Class36 class36 = aClass36Array7875[i_875_];
						class36.anInt424 = class36.anInt424 & 0xffffff | 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray7855 != null) {
				for (int i_876_ = 0; i_876_ < i_731_; i_876_++) {
					int i_877_ = is[i_876_];
					if (i_877_ < anIntArrayArray7855.length) {
						int[] is_878_ = anIntArrayArray7855[i_877_];
						for (int element : is_878_) {
							int i_880_ = element;
							if (aShortArray7856 == null || (i_729_ & aShortArray7856[i_880_]) != 0) {
								int i_881_ = aShortArray7849[i_880_] & 0xffff;
								int i_882_ = i_881_ >> 10 & 0x3f;
								int i_883_ = i_881_ >> 7 & 0x7;
								int i_884_ = i_881_ & 0x7f;
								i_882_ = i_882_ + i_726_ & 0x3f;
								i_883_ += i_727_ / 4;
								if (i_883_ < 0) {
									i_883_ = 0;
								} else if (i_883_ > 7) {
									i_883_ = 7;
								}
								i_884_ += i_728_;
								if (i_884_ < 0) {
									i_884_ = 0;
								} else if (i_884_ > 127) {
									i_884_ = 127;
								}
								aShortArray7849[i_880_] = (short) (i_882_ << 10 | i_883_ << 7 | i_884_);
								if (aClass32_7858 != null) {
									aClass32_7858.anInterface1_397 = null;
								}
							}
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_885_ = 0; i_885_ < anInt7877; i_885_++) {
						Class54 class54 = aClass54Array7880[i_885_];
						Class36 class36 = aClass36Array7875[i_885_];
						class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray7882 != null) {
				for (int i_886_ = 0; i_886_ < i_731_; i_886_++) {
					int i_887_ = is[i_886_];
					if (i_887_ < anIntArrayArray7882.length) {
						int[] is_888_ = anIntArrayArray7882[i_887_];
						for (int element : is_888_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt422 += i_726_;
							class36.anInt419 += i_727_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray7882 != null) {
				for (int i_890_ = 0; i_890_ < i_731_; i_890_++) {
					int i_891_ = is[i_890_];
					if (i_891_ < anIntArrayArray7882.length) {
						int[] is_892_ = anIntArrayArray7882[i_891_];
						for (int element : is_892_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt420 = class36.anInt420 * i_726_ >> 7;
							class36.anInt421 = class36.anInt421 * i_727_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray7882 != null) {
				for (int i_894_ = 0; i_894_ < i_731_; i_894_++) {
					int i_895_ = is[i_894_];
					if (i_895_ < anIntArrayArray7882.length) {
						int[] is_896_ = anIntArrayArray7882[i_895_];
						for (int element : is_896_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt423 = class36.anInt423 + i_726_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	@Override
	public void bk(int i, int i_898_, int i_899_) {
		for (int i_900_ = 0; i_900_ < anInt7833; i_900_++) {
			if (i != 0) {
				vertices_x[i_900_] += i;
			}
			if (i_898_ != 0) {
				vertices_y[i_900_] += i_898_;
			}
			if (i_899_ != 0) {
				vertices_z[i_900_] += i_899_;
			}
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void bo(int i) {
		int i_901_ = Class220.SINE[i];
		int i_902_ = Class220.COSINE[i];
		for (int i_903_ = 0; i_903_ < anInt7833; i_903_++) {
			int i_904_ = vertices_y[i_903_] * i_902_ - vertices_z[i_903_] * i_901_ >> 14;
			vertices_z[i_903_] = vertices_y[i_903_] * i_901_ + vertices_z[i_903_] * i_902_ >> 14;
			vertices_y[i_903_] = i_904_;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void bb(int i) {
		int i_905_ = Class220.SINE[i];
		int i_906_ = Class220.COSINE[i];
		for (int i_907_ = 0; i_907_ < anInt7833; i_907_++) {
			int i_908_ = vertices_y[i_907_] * i_905_ + vertices_x[i_907_] * i_906_ >> 14;
			vertices_y[i_907_] = vertices_y[i_907_] * i_906_ - vertices_x[i_907_] * i_905_ >> 14;
			vertices_x[i_907_] = i_908_;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void bl(int i, int i_909_, int i_910_) {
		for (int i_911_ = 0; i_911_ < anInt7833; i_911_++) {
			if (i != 0) {
				vertices_x[i_911_] += i;
			}
			if (i_909_ != 0) {
				vertices_y[i_911_] += i_909_;
			}
			if (i_910_ != 0) {
				vertices_z[i_911_] += i_910_;
			}
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void method4740(Matrix43f class222, Class302_Sub1 class302_sub1, int i) {
		if ((i & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (anInt7839 != 0) {
			Class233 class233 = aClass_ra_Sub2_7824.aClass233_8041;
			Class233 class233_912_ = aClass_ra_Sub2_7824.aClass233_8104;
			Class233 class233_913_ = aClass_ra_Sub2_7824.aClass233_8184;
			class233_912_.method2145(class222);
			class233_913_.method2142(class233_912_);
			class233_913_.method2144(aClass_ra_Sub2_7824.aClass233_8069);
			if (!aBoolean7843) {
				method4831();
			}
			float[] fs = aClass_ra_Sub2_7824.aFloatArray8094;
			class233_912_.method2149(0.0F, aShort7868, 0.0F, fs);
			float f = fs[0];
			float f_914_ = fs[1];
			float f_915_ = fs[2];
			class233_912_.method2149(0.0F, aShort7874, 0.0F, fs);
			float f_916_ = fs[0];
			float f_917_ = fs[1];
			float f_918_ = fs[2];
			for (int i_919_ = 0; i_919_ < 6; i_919_++) {
				float[] fs_920_ = aClass_ra_Sub2_7824.aFloatArrayArray8077[i_919_];
				float f_921_ = fs_920_[0] * f + fs_920_[1] * f_914_ + fs_920_[2] * f_915_ + fs_920_[3] + anInt7891;
				float f_922_ = fs_920_[0] * f_916_ + fs_920_[1] * f_917_ + fs_920_[2] * f_918_ + fs_920_[3] + anInt7891;
				if (f_921_ < 0.0F && f_922_ < 0.0F) {
					return;
				}
			}
			if (class302_sub1 != null) {
				boolean bool = false;
				boolean bool_923_ = true;
				int i_924_ = aShort7870 + aShort7871 >> 1;
				int i_925_ = aShort7872 + aShort7876 >> 1;
				int i_926_ = i_924_;
				short i_927_ = aShort7868;
				int i_928_ = i_925_;
				float f_929_ = class233_913_.aFloatArray2594[0] * i_926_ + class233_913_.aFloatArray2594[4] * i_927_ + class233_913_.aFloatArray2594[8] * i_928_ + class233_913_.aFloatArray2594[12];
				float f_930_ = class233_913_.aFloatArray2594[1] * i_926_ + class233_913_.aFloatArray2594[5] * i_927_ + class233_913_.aFloatArray2594[9] * i_928_ + class233_913_.aFloatArray2594[13];
				float f_931_ = class233_913_.aFloatArray2594[2] * i_926_ + class233_913_.aFloatArray2594[6] * i_927_ + class233_913_.aFloatArray2594[10] * i_928_ + class233_913_.aFloatArray2594[14];
				float f_932_ = class233_913_.aFloatArray2594[3] * i_926_ + class233_913_.aFloatArray2594[7] * i_927_ + class233_913_.aFloatArray2594[11] * i_928_ + class233_913_.aFloatArray2594[15];
				if (f_931_ >= -f_932_) {
					class302_sub1.anInt7641 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_929_ / f_932_);
					class302_sub1.anInt7642 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_930_ / f_932_);
				} else {
					bool = true;
				}
				i_926_ = i_924_;
				i_927_ = aShort7874;
				i_928_ = i_925_;
				float f_933_ = class233_913_.aFloatArray2594[0] * i_926_ + class233_913_.aFloatArray2594[4] * i_927_ + class233_913_.aFloatArray2594[8] * i_928_ + class233_913_.aFloatArray2594[12];
				float f_934_ = class233_913_.aFloatArray2594[1] * i_926_ + class233_913_.aFloatArray2594[5] * i_927_ + class233_913_.aFloatArray2594[9] * i_928_ + class233_913_.aFloatArray2594[13];
				float f_935_ = class233_913_.aFloatArray2594[2] * i_926_ + class233_913_.aFloatArray2594[6] * i_927_ + class233_913_.aFloatArray2594[10] * i_928_ + class233_913_.aFloatArray2594[14];
				float f_936_ = class233_913_.aFloatArray2594[3] * i_926_ + class233_913_.aFloatArray2594[7] * i_927_ + class233_913_.aFloatArray2594[11] * i_928_ + class233_913_.aFloatArray2594[15];
				if (f_935_ >= -f_936_) {
					class302_sub1.anInt7643 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_933_ / f_936_);
					class302_sub1.anInt7640 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_934_ / f_936_);
				} else {
					bool = true;
				}
				if (bool) {
					if (f_931_ < -f_932_ && f_935_ < -f_936_) {
						bool_923_ = false;
					} else if (f_931_ < -f_932_) {
						float f_937_ = (f_931_ + f_932_) / (f_935_ + f_936_) - 1.0F;
						float f_938_ = f_929_ + f_937_ * (f_933_ - f_929_);
						float f_939_ = f_930_ + f_937_ * (f_934_ - f_930_);
						float f_940_ = f_932_ + f_937_ * (f_936_ - f_932_);
						class302_sub1.anInt7641 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_938_ / f_940_);
						class302_sub1.anInt7642 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_939_ / f_940_);
					} else if (f_935_ < -f_936_) {
						float f_941_ = (f_935_ + f_936_) / (f_931_ + f_932_) - 1.0F;
						float f_942_ = f_933_ + f_941_ * (f_929_ - f_933_);
						float f_943_ = f_934_ + f_941_ * (f_930_ - f_934_);
						float f_944_ = f_936_ + f_941_ * (f_932_ - f_936_);
						class302_sub1.anInt7643 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_942_ / f_944_);
						class302_sub1.anInt7640 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_943_ / f_944_);
					}
				}
				if (bool_923_) {
					if (f_931_ / f_932_ > f_935_ / f_936_) {
						float f_945_ = f_929_ + class233.aFloatArray2594[0] * anInt7891 + class233.aFloatArray2594[12];
						float f_946_ = f_932_ + class233.aFloatArray2594[3] * anInt7891 + class233.aFloatArray2594[15];
						class302_sub1.anInt7645 = (int) (aClass_ra_Sub2_7824.aFloat8095 - class302_sub1.anInt7641 + aClass_ra_Sub2_7824.aFloat8096 * f_945_ / f_946_);
					} else {
						float f_947_ = f_933_ + class233.aFloatArray2594[0] * anInt7891 + class233.aFloatArray2594[12];
						float f_948_ = f_936_ + class233.aFloatArray2594[3] * anInt7891 + class233.aFloatArray2594[15];
						class302_sub1.anInt7645 = (int) (aClass_ra_Sub2_7824.aFloat8095 - class302_sub1.anInt7643 + aClass_ra_Sub2_7824.aFloat8096 * f_947_ / f_948_);
					}
					class302_sub1.aBoolean7644 = true;
				}
			}
			aClass_ra_Sub2_7824.method5252();
			aClass_ra_Sub2_7824.method5283(class233_912_);
			method4823();
			aClass_ra_Sub2_7824.method5287();
			class233_912_.method2144(aClass_ra_Sub2_7824.aClass233_8110);
			method4824(class233_912_);
			if ((i & 0x2) != 0) {
				OpenGL.glPolygonMode(1028, 6914);
			}
		}
	}

	@Override
	public boolean method4788() {
		if (aShortArray7861 == null) {
			return true;
		}
		for (short element : aShortArray7861) {
			if (element != -1 && !aClass_ra_Sub2_7824.anInterface_ma5299.method170(element, (short) 27068)) {
				return false;
			}
		}
		return true;
	}

	@Override
	void cd() {
		for (int i = 0; i < anInt7832; i++) {
			vertices_x[i] = vertices_x[i] + 7 >> 4;
			vertices_y[i] = vertices_y[i] + 7 >> 4;
			vertices_z[i] = vertices_z[i] + 7 >> 4;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void bq(int i, int i_949_, int i_950_) {
		for (int i_951_ = 0; i_951_ < anInt7833; i_951_++) {
			if (i != 128) {
				vertices_x[i_951_] = vertices_x[i_951_] * i >> 7;
			}
			if (i_949_ != 128) {
				vertices_y[i_951_] = vertices_y[i_951_] * i_949_ >> 7;
			}
			if (i_950_ != 128) {
				vertices_z[i_951_] = vertices_z[i_951_] * i_950_ >> 7;
			}
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void bg(int i, int i_952_, Ground ground, Ground ground_953_, int i_954_, int i_955_, int i_956_) {
		if (!aBoolean7843) {
			method4831();
		}
		int i_957_ = i_954_ + aShort7870;
		int i_958_ = i_954_ + aShort7871;
		int i_959_ = i_956_ + aShort7872;
		int i_960_ = i_956_ + aShort7876;
		if (i != 1 && i != 2 && i != 3 && i != 5 || i_957_ >= 0 && i_958_ + ground.anInt6288 * -1212653763 >> ground.anInt6289 * -2137349879 < ground.anInt6287 * -506105871 && i_959_ >= 0 && i_960_ + ground.anInt6288 * -1212653763 >> ground.anInt6289 * -2137349879 < ground.anInt6286 * -1148794921) {
			if (i == 4 || i == 5) {
				if (ground_953_ == null || i_957_ < 0 || i_958_ + ground_953_.anInt6288 * -1212653763 >> ground_953_.anInt6289 * -2137349879 >= ground_953_.anInt6287 * -506105871 || i_959_ < 0 || i_960_ + ground_953_.anInt6288 * -1212653763 >> ground_953_.anInt6289 * -2137349879 >= ground_953_.anInt6286 * -1148794921) {
					return;
				}
			} else {
				i_957_ >>= ground.anInt6289 * -2137349879;
				i_958_ = i_958_ + ground.anInt6288 * -1212653763 - 1 >> ground.anInt6289 * -2137349879;
				i_959_ >>= ground.anInt6289 * -2137349879;
				i_960_ = i_960_ + ground.anInt6288 * -1212653763 - 1 >> ground.anInt6289 * -2137349879;
				if (ground.method6341(i_957_, i_959_, (byte) -6) == i_955_ && ground.method6341(i_958_, i_959_, (byte) -60) == i_955_ && ground.method6341(i_957_, i_960_, (byte) -57) == i_955_ && ground.method6341(i_958_, i_960_, (byte) -30) == i_955_) {
					return;
				}
			}
			if (i == 1) {
				for (int i_961_ = 0; i_961_ < anInt7833; i_961_++) {
					vertices_y[i_961_] = vertices_y[i_961_] + ground.method6340(vertices_x[i_961_] + i_954_, vertices_z[i_961_] + i_956_, -1638557088) - i_955_;
				}
			} else if (i == 2) {
				int i_962_ = aShort7868;
				if (i_962_ == 0) {
					return;
				}
				for (int i_963_ = 0; i_963_ < anInt7833; i_963_++) {
					int i_964_ = (vertices_y[i_963_] << 16) / i_962_;
					if (i_964_ < i_952_) {
						vertices_y[i_963_] = vertices_y[i_963_] + (ground.method6340(vertices_x[i_963_] + i_954_, vertices_z[i_963_] + i_956_, -1342639356) - i_955_) * (i_952_ - i_964_) / i_952_;
					}
				}
			} else if (i == 3) {
				int i_965_ = (i_952_ & 0xff) * 4;
				int i_966_ = (i_952_ >> 8 & 0xff) * 4;
				int i_967_ = (i_952_ >> 16 & 0xff) << 6;
				int i_968_ = (i_952_ >> 24 & 0xff) << 6;
				if (i_954_ - (i_965_ >> 1) < 0 || i_954_ + (i_965_ >> 1) + ground.anInt6288 * -1212653763 >= ground.anInt6287 * -506105871 << ground.anInt6289 * -2137349879 || i_956_ - (i_966_ >> 1) < 0 || i_956_ + (i_966_ >> 1) + ground.anInt6288 * -1212653763 >= ground.anInt6286 * -1148794921 << ground.anInt6289 * -2137349879) {
					return;
				}
				method4732(ground, i_954_, i_955_, i_956_, i_965_, i_966_, i_967_, i_968_);
			} else if (i == 4) {
				int i_969_ = aShort7874 - aShort7868;
				for (int i_970_ = 0; i_970_ < anInt7833; i_970_++) {
					vertices_y[i_970_] = vertices_y[i_970_] + ground_953_.method6340(vertices_x[i_970_] + i_954_, vertices_z[i_970_] + i_956_, -1704762228) - i_955_ + i_969_;
				}
			} else if (i == 5) {
				int i_971_ = aShort7874 - aShort7868;
				for (int i_972_ = 0; i_972_ < anInt7833; i_972_++) {
					int i_973_ = vertices_x[i_972_] + i_954_;
					int i_974_ = vertices_z[i_972_] + i_956_;
					int i_975_ = ground.method6340(i_973_, i_974_, -1603182188);
					int i_976_ = ground_953_.method6340(i_973_, i_974_, -1284433720);
					int i_977_ = i_975_ - i_976_ - i_952_;
					vertices_y[i_972_] = ((vertices_y[i_972_] << 8) / i_971_ * i_977_ >> 8) - (i_955_ - i_975_);
				}
			}
			if (aClass32_7831 != null) {
				aClass32_7831.anInterface1_397 = null;
			}
			aBoolean7843 = false;
		}
	}

	@Override
	public void ia(int i, int i_978_, int i_979_) {
		for (int i_980_ = 0; i_980_ < anInt7833; i_980_++) {
			if (i != 0) {
				vertices_x[i_980_] += i;
			}
			if (i_978_ != 0) {
				vertices_y[i_980_] += i_978_;
			}
			if (i_979_ != 0) {
				vertices_z[i_980_] += i_979_;
			}
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public void bp(int i, int i_981_, Ground ground, Ground ground_982_, int i_983_, int i_984_, int i_985_) {
		if (!aBoolean7843) {
			method4831();
		}
		int i_986_ = i_983_ + aShort7870;
		int i_987_ = i_983_ + aShort7871;
		int i_988_ = i_985_ + aShort7872;
		int i_989_ = i_985_ + aShort7876;
		if (i != 1 && i != 2 && i != 3 && i != 5 || i_986_ >= 0 && i_987_ + ground.anInt6288 * -1212653763 >> ground.anInt6289 * -2137349879 < ground.anInt6287 * -506105871 && i_988_ >= 0 && i_989_ + ground.anInt6288 * -1212653763 >> ground.anInt6289 * -2137349879 < ground.anInt6286 * -1148794921) {
			if (i == 4 || i == 5) {
				if (ground_982_ == null || i_986_ < 0 || i_987_ + ground_982_.anInt6288 * -1212653763 >> ground_982_.anInt6289 * -2137349879 >= ground_982_.anInt6287 * -506105871 || i_988_ < 0 || i_989_ + ground_982_.anInt6288 * -1212653763 >> ground_982_.anInt6289 * -2137349879 >= ground_982_.anInt6286 * -1148794921) {
					return;
				}
			} else {
				i_986_ >>= ground.anInt6289 * -2137349879;
				i_987_ = i_987_ + ground.anInt6288 * -1212653763 - 1 >> ground.anInt6289 * -2137349879;
				i_988_ >>= ground.anInt6289 * -2137349879;
				i_989_ = i_989_ + ground.anInt6288 * -1212653763 - 1 >> ground.anInt6289 * -2137349879;
				if (ground.method6341(i_986_, i_988_, (byte) -55) == i_984_ && ground.method6341(i_987_, i_988_, (byte) -79) == i_984_ && ground.method6341(i_986_, i_989_, (byte) -75) == i_984_ && ground.method6341(i_987_, i_989_, (byte) -56) == i_984_) {
					return;
				}
			}
			if (i == 1) {
				for (int i_990_ = 0; i_990_ < anInt7833; i_990_++) {
					vertices_y[i_990_] = vertices_y[i_990_] + ground.method6340(vertices_x[i_990_] + i_983_, vertices_z[i_990_] + i_985_, -1476448694) - i_984_;
				}
			} else if (i == 2) {
				int i_991_ = aShort7868;
				if (i_991_ == 0) {
					return;
				}
				for (int i_992_ = 0; i_992_ < anInt7833; i_992_++) {
					int i_993_ = (vertices_y[i_992_] << 16) / i_991_;
					if (i_993_ < i_981_) {
						vertices_y[i_992_] = vertices_y[i_992_] + (ground.method6340(vertices_x[i_992_] + i_983_, vertices_z[i_992_] + i_985_, -1876492928) - i_984_) * (i_981_ - i_993_) / i_981_;
					}
				}
			} else if (i == 3) {
				int i_994_ = (i_981_ & 0xff) * 4;
				int i_995_ = (i_981_ >> 8 & 0xff) * 4;
				int i_996_ = (i_981_ >> 16 & 0xff) << 6;
				int i_997_ = (i_981_ >> 24 & 0xff) << 6;
				if (i_983_ - (i_994_ >> 1) < 0 || i_983_ + (i_994_ >> 1) + ground.anInt6288 * -1212653763 >= ground.anInt6287 * -506105871 << ground.anInt6289 * -2137349879 || i_985_ - (i_995_ >> 1) < 0 || i_985_ + (i_995_ >> 1) + ground.anInt6288 * -1212653763 >= ground.anInt6286 * -1148794921 << ground.anInt6289 * -2137349879) {
					return;
				}
				method4732(ground, i_983_, i_984_, i_985_, i_994_, i_995_, i_996_, i_997_);
			} else if (i == 4) {
				int i_998_ = aShort7874 - aShort7868;
				for (int i_999_ = 0; i_999_ < anInt7833; i_999_++) {
					vertices_y[i_999_] = vertices_y[i_999_] + ground_982_.method6340(vertices_x[i_999_] + i_983_, vertices_z[i_999_] + i_985_, -1422344049) - i_984_ + i_998_;
				}
			} else if (i == 5) {
				int i_1000_ = aShort7874 - aShort7868;
				for (int i_1001_ = 0; i_1001_ < anInt7833; i_1001_++) {
					int i_1002_ = vertices_x[i_1001_] + i_983_;
					int i_1003_ = vertices_z[i_1001_] + i_985_;
					int i_1004_ = ground.method6340(i_1002_, i_1003_, -1308409500);
					int i_1005_ = ground_982_.method6340(i_1002_, i_1003_, -2040639881);
					int i_1006_ = i_1004_ - i_1005_ - i_981_;
					vertices_y[i_1001_] = ((vertices_y[i_1001_] << 8) / i_1000_ * i_1006_ >> 8) - (i_984_ - i_1004_);
				}
			}
			if (aClass32_7831 != null) {
				aClass32_7831.anInterface1_397 = null;
			}
			aBoolean7843 = false;
		}
	}

	@Override
	void method4754() {
		/* empty */
	}

	@Override
	void method4757() {
		/* empty */
	}

	@Override
	void method4756() {
		/* empty */
	}

	@Override
	void method4758() {
		/* empty */
	}

	@Override
	boolean bt() {
		if (verticesByLabel == null) {
			return false;
		}
		for (int i = 0; i < anInt7832; i++) {
			vertices_x[i] <<= 4;
			vertices_y[i] <<= 4;
			vertices_z[i] <<= 4;
		}
		origin_x = 0;
		origin_y = 0;
		origin_z = 0;
		return true;
	}

	@Override
	boolean bj() {
		if (verticesByLabel == null) {
			return false;
		}
		for (int i = 0; i < anInt7832; i++) {
			vertices_x[i] <<= 4;
			vertices_y[i] <<= 4;
			vertices_z[i] <<= 4;
		}
		origin_x = 0;
		origin_y = 0;
		origin_z = 0;
		return true;
	}

	@Override
	public void bf(int i) {
		int i_1007_ = Class220.SINE[i];
		int i_1008_ = Class220.COSINE[i];
		for (int i_1009_ = 0; i_1009_ < anInt7833; i_1009_++) {
			int i_1010_ = vertices_z[i_1009_] * i_1007_ + vertices_x[i_1009_] * i_1008_ >> 14;
			vertices_z[i_1009_] = vertices_z[i_1009_] * i_1008_ - vertices_x[i_1009_] * i_1007_ >> 14;
			vertices_x[i_1009_] = i_1010_;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	void bz() {
		for (int i = 0; i < anInt7832; i++) {
			vertices_x[i] = vertices_x[i] + 7 >> 4;
			vertices_y[i] = vertices_y[i] + 7 >> 4;
			vertices_z[i] = vertices_z[i] + 7 >> 4;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public boolean ex() {
		return aBoolean7862;
	}

	@Override
	void method4760(int i, int[] is, int i_1011_, int i_1012_, int i_1013_, int i_1014_, boolean bool) {
		int i_1015_ = is.length;
		if (i == 0) {
			i_1011_ <<= 4;
			i_1012_ <<= 4;
			i_1013_ <<= 4;
			int i_1016_ = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_1017_ = 0; i_1017_ < i_1015_; i_1017_++) {
				int i_1018_ = is[i_1017_];
				if (i_1018_ < verticesByLabel.length) {
					int[] is_1019_ = verticesByLabel[i_1018_];
					for (int i_1021_ : is_1019_) {
						origin_x += vertices_x[i_1021_];
						origin_y += vertices_y[i_1021_];
						origin_z += vertices_z[i_1021_];
						i_1016_++;
					}
				}
			}
			if (i_1016_ > 0) {
				origin_x = origin_x / i_1016_ + i_1011_;
				origin_y = origin_y / i_1016_ + i_1012_;
				origin_z = origin_z / i_1016_ + i_1013_;
			} else {
				origin_x = i_1011_;
				origin_y = i_1012_;
				origin_z = i_1013_;
			}
		} else if (i == 1) {
			i_1011_ <<= 4;
			i_1012_ <<= 4;
			i_1013_ <<= 4;
			for (int i_1022_ = 0; i_1022_ < i_1015_; i_1022_++) {
				int i_1023_ = is[i_1022_];
				if (i_1023_ < verticesByLabel.length) {
					int[] is_1024_ = verticesByLabel[i_1023_];
					for (int element : is_1024_) {
						int i_1026_ = element;
						vertices_x[i_1026_] += i_1011_;
						vertices_y[i_1026_] += i_1012_;
						vertices_z[i_1026_] += i_1013_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1027_ = 0; i_1027_ < i_1015_; i_1027_++) {
				int i_1028_ = is[i_1027_];
				if (i_1028_ < verticesByLabel.length) {
					int[] is_1029_ = verticesByLabel[i_1028_];
					if ((i_1014_ & 0x1) == 0) {
						for (int element : is_1029_) {
							int i_1031_ = element;
							vertices_x[i_1031_] -= origin_x;
							vertices_y[i_1031_] -= origin_y;
							vertices_z[i_1031_] -= origin_z;
							if (i_1013_ != 0) {
								int i_1032_ = Class220.SINE[i_1013_];
								int i_1033_ = Class220.COSINE[i_1013_];
								int i_1034_ = vertices_y[i_1031_] * i_1032_ + vertices_x[i_1031_] * i_1033_ + 16383 >> 14;
								vertices_y[i_1031_] = vertices_y[i_1031_] * i_1033_ - vertices_x[i_1031_] * i_1032_ + 16383 >> 14;
								vertices_x[i_1031_] = i_1034_;
							}
							if (i_1011_ != 0) {
								int i_1035_ = Class220.SINE[i_1011_];
								int i_1036_ = Class220.COSINE[i_1011_];
								int i_1037_ = vertices_y[i_1031_] * i_1036_ - vertices_z[i_1031_] * i_1035_ + 16383 >> 14;
								vertices_z[i_1031_] = vertices_y[i_1031_] * i_1035_ + vertices_z[i_1031_] * i_1036_ + 16383 >> 14;
								vertices_y[i_1031_] = i_1037_;
							}
							if (i_1012_ != 0) {
								int i_1038_ = Class220.SINE[i_1012_];
								int i_1039_ = Class220.COSINE[i_1012_];
								int i_1040_ = vertices_z[i_1031_] * i_1038_ + vertices_x[i_1031_] * i_1039_ + 16383 >> 14;
								vertices_z[i_1031_] = vertices_z[i_1031_] * i_1039_ - vertices_x[i_1031_] * i_1038_ + 16383 >> 14;
								vertices_x[i_1031_] = i_1040_;
							}
							vertices_x[i_1031_] += origin_x;
							vertices_y[i_1031_] += origin_y;
							vertices_z[i_1031_] += origin_z;
						}
					} else {
						for (int element : is_1029_) {
							int i_1042_ = element;
							vertices_x[i_1042_] -= origin_x;
							vertices_y[i_1042_] -= origin_y;
							vertices_z[i_1042_] -= origin_z;
							if (i_1011_ != 0) {
								int i_1043_ = Class220.SINE[i_1011_];
								int i_1044_ = Class220.COSINE[i_1011_];
								int i_1045_ = vertices_y[i_1042_] * i_1044_ - vertices_z[i_1042_] * i_1043_ + 16383 >> 14;
								vertices_z[i_1042_] = vertices_y[i_1042_] * i_1043_ + vertices_z[i_1042_] * i_1044_ + 16383 >> 14;
								vertices_y[i_1042_] = i_1045_;
							}
							if (i_1013_ != 0) {
								int i_1046_ = Class220.SINE[i_1013_];
								int i_1047_ = Class220.COSINE[i_1013_];
								int i_1048_ = vertices_y[i_1042_] * i_1046_ + vertices_x[i_1042_] * i_1047_ + 16383 >> 14;
								vertices_y[i_1042_] = vertices_y[i_1042_] * i_1047_ - vertices_x[i_1042_] * i_1046_ + 16383 >> 14;
								vertices_x[i_1042_] = i_1048_;
							}
							if (i_1012_ != 0) {
								int i_1049_ = Class220.SINE[i_1012_];
								int i_1050_ = Class220.COSINE[i_1012_];
								int i_1051_ = vertices_z[i_1042_] * i_1049_ + vertices_x[i_1042_] * i_1050_ + 16383 >> 14;
								vertices_z[i_1042_] = vertices_z[i_1042_] * i_1050_ - vertices_x[i_1042_] * i_1049_ + 16383 >> 14;
								vertices_x[i_1042_] = i_1051_;
							}
							vertices_x[i_1042_] += origin_x;
							vertices_y[i_1042_] += origin_y;
							vertices_z[i_1042_] += origin_z;
						}
					}
				}
			}
			if (bool) {
				for (int i_1052_ = 0; i_1052_ < i_1015_; i_1052_++) {
					int i_1053_ = is[i_1052_];
					if (i_1053_ < verticesByLabel.length) {
						int[] is_1054_ = verticesByLabel[i_1053_];
						for (int i_1056_ : is_1054_) {
							int i_1057_ = anIntArray7854[i_1056_];
							int i_1058_ = anIntArray7854[i_1056_ + 1];
							for (int i_1059_ = i_1057_; i_1059_ < i_1058_; i_1059_++) {
								int i_1060_ = aShortArray7830[i_1059_] - 1;
								if (i_1060_ == -1) {
									break;
								}
								if (i_1013_ != 0) {
									int i_1061_ = Class220.SINE[i_1013_];
									int i_1062_ = Class220.COSINE[i_1013_];
									int i_1063_ = aShortArray7841[i_1060_] * i_1061_ + aShortArray7829[i_1060_] * i_1062_ + 16383 >> 14;
									aShortArray7841[i_1060_] = (short) (aShortArray7841[i_1060_] * i_1062_ - aShortArray7829[i_1060_] * i_1061_ + 16383 >> 14);
									aShortArray7829[i_1060_] = (short) i_1063_;
								}
								if (i_1011_ != 0) {
									int i_1064_ = Class220.SINE[i_1011_];
									int i_1065_ = Class220.COSINE[i_1011_];
									int i_1066_ = aShortArray7841[i_1060_] * i_1065_ - aShortArray7842[i_1060_] * i_1064_ + 16383 >> 14;
									aShortArray7842[i_1060_] = (short) (aShortArray7841[i_1060_] * i_1064_ + aShortArray7842[i_1060_] * i_1065_ + 16383 >> 14);
									aShortArray7841[i_1060_] = (short) i_1066_;
								}
								if (i_1012_ != 0) {
									int i_1067_ = Class220.SINE[i_1012_];
									int i_1068_ = Class220.COSINE[i_1012_];
									int i_1069_ = aShortArray7842[i_1060_] * i_1067_ + aShortArray7829[i_1060_] * i_1068_ + 16383 >> 14;
									aShortArray7842[i_1060_] = (short) (aShortArray7842[i_1060_] * i_1068_ - aShortArray7829[i_1060_] * i_1067_ + 16383 >> 14);
									aShortArray7829[i_1060_] = (short) i_1069_;
								}
							}
						}
					}
				}
				if (aClass32_7889 == null && aClass32_7858 != null) {
					aClass32_7858.anInterface1_397 = null;
				}
				if (aClass32_7889 != null) {
					aClass32_7889.anInterface1_397 = null;
				}
			}
		} else if (i == 3) {
			for (int i_1070_ = 0; i_1070_ < i_1015_; i_1070_++) {
				int i_1071_ = is[i_1070_];
				if (i_1071_ < verticesByLabel.length) {
					int[] is_1072_ = verticesByLabel[i_1071_];
					for (int element : is_1072_) {
						int i_1074_ = element;
						vertices_x[i_1074_] -= origin_x;
						vertices_y[i_1074_] -= origin_y;
						vertices_z[i_1074_] -= origin_z;
						vertices_x[i_1074_] = vertices_x[i_1074_] * i_1011_ >> 7;
						vertices_y[i_1074_] = vertices_y[i_1074_] * i_1012_ >> 7;
						vertices_z[i_1074_] = vertices_z[i_1074_] * i_1013_ >> 7;
						vertices_x[i_1074_] += origin_x;
						vertices_y[i_1074_] += origin_y;
						vertices_z[i_1074_] += origin_z;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray7855 != null) {
				for (int i_1075_ = 0; i_1075_ < i_1015_; i_1075_++) {
					int i_1076_ = is[i_1075_];
					if (i_1076_ < anIntArrayArray7855.length) {
						int[] is_1077_ = anIntArrayArray7855[i_1076_];
						for (int element : is_1077_) {
							int i_1079_ = element;
							int i_1080_ = (aByteArray7850[i_1079_] & 0xff) + i_1011_ * 8;
							if (i_1080_ < 0) {
								i_1080_ = 0;
							} else if (i_1080_ > 255) {
								i_1080_ = 255;
							}
							aByteArray7850[i_1079_] = (byte) i_1080_;
						}
						if (is_1077_.length > 0 && aClass32_7858 != null) {
							aClass32_7858.anInterface1_397 = null;
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_1081_ = 0; i_1081_ < anInt7877; i_1081_++) {
						Class54 class54 = aClass54Array7880[i_1081_];
						Class36 class36 = aClass36Array7875[i_1081_];
						class36.anInt424 = class36.anInt424 & 0xffffff | 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray7855 != null) {
				for (int i_1082_ = 0; i_1082_ < i_1015_; i_1082_++) {
					int i_1083_ = is[i_1082_];
					if (i_1083_ < anIntArrayArray7855.length) {
						int[] is_1084_ = anIntArrayArray7855[i_1083_];
						for (int element : is_1084_) {
							int i_1086_ = element;
							int i_1087_ = aShortArray7849[i_1086_] & 0xffff;
							int i_1088_ = i_1087_ >> 10 & 0x3f;
							int i_1089_ = i_1087_ >> 7 & 0x7;
							int i_1090_ = i_1087_ & 0x7f;
							i_1088_ = i_1088_ + i_1011_ & 0x3f;
							i_1089_ += i_1012_ / 4;
							if (i_1089_ < 0) {
								i_1089_ = 0;
							} else if (i_1089_ > 7) {
								i_1089_ = 7;
							}
							i_1090_ += i_1013_;
							if (i_1090_ < 0) {
								i_1090_ = 0;
							} else if (i_1090_ > 127) {
								i_1090_ = 127;
							}
							aShortArray7849[i_1086_] = (short) (i_1088_ << 10 | i_1089_ << 7 | i_1090_);
						}
						if (is_1084_.length > 0 && aClass32_7858 != null) {
							aClass32_7858.anInterface1_397 = null;
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_1091_ = 0; i_1091_ < anInt7877; i_1091_++) {
						Class54 class54 = aClass54Array7880[i_1091_];
						Class36 class36 = aClass36Array7875[i_1091_];
						class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray7882 != null) {
				for (int i_1092_ = 0; i_1092_ < i_1015_; i_1092_++) {
					int i_1093_ = is[i_1092_];
					if (i_1093_ < anIntArrayArray7882.length) {
						int[] is_1094_ = anIntArrayArray7882[i_1093_];
						for (int element : is_1094_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt422 += i_1011_;
							class36.anInt419 += i_1012_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray7882 != null) {
				for (int i_1096_ = 0; i_1096_ < i_1015_; i_1096_++) {
					int i_1097_ = is[i_1096_];
					if (i_1097_ < anIntArrayArray7882.length) {
						int[] is_1098_ = anIntArrayArray7882[i_1097_];
						for (int element : is_1098_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt420 = class36.anInt420 * i_1011_ >> 7;
							class36.anInt421 = class36.anInt421 * i_1012_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray7882 != null) {
				for (int i_1100_ = 0; i_1100_ < i_1015_; i_1100_++) {
					int i_1101_ = is[i_1100_];
					if (i_1101_ < anIntArrayArray7882.length) {
						int[] is_1102_ = anIntArrayArray7882[i_1101_];
						for (int element : is_1102_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt423 = class36.anInt423 + i_1011_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	@Override
	void cl(int i, int[] is, int i_1104_, int i_1105_, int i_1106_, boolean bool, int i_1107_, int[] is_1108_) {
		int i_1109_ = is.length;
		if (i == 0) {
			i_1104_ <<= 4;
			i_1105_ <<= 4;
			i_1106_ <<= 4;
			int i_1110_ = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_1111_ = 0; i_1111_ < i_1109_; i_1111_++) {
				int i_1112_ = is[i_1111_];
				if (i_1112_ < verticesByLabel.length) {
					int[] is_1113_ = verticesByLabel[i_1112_];
					for (int i_1115_ : is_1113_) {
						if (aShortArray7838 == null || (i_1107_ & aShortArray7838[i_1115_]) != 0) {
							origin_x += vertices_x[i_1115_];
							origin_y += vertices_y[i_1115_];
							origin_z += vertices_z[i_1115_];
							i_1110_++;
						}
					}
				}
			}
			if (i_1110_ > 0) {
				origin_x = origin_x / i_1110_ + i_1104_;
				origin_y = origin_y / i_1110_ + i_1105_;
				origin_z = origin_z / i_1110_ + i_1106_;
				aBoolean7817 = true;
			} else {
				origin_x = i_1104_;
				origin_y = i_1105_;
				origin_z = i_1106_;
			}
		} else if (i == 1) {
			if (is_1108_ != null) {
				int i_1116_ = is_1108_[0] * i_1104_ + is_1108_[1] * i_1105_ + is_1108_[2] * i_1106_ + 8192 >> 14;
				int i_1117_ = is_1108_[3] * i_1104_ + is_1108_[4] * i_1105_ + is_1108_[5] * i_1106_ + 8192 >> 14;
				int i_1118_ = is_1108_[6] * i_1104_ + is_1108_[7] * i_1105_ + is_1108_[8] * i_1106_ + 8192 >> 14;
				i_1104_ = i_1116_;
				i_1105_ = i_1117_;
				i_1106_ = i_1118_;
			}
			i_1104_ <<= 4;
			i_1105_ <<= 4;
			i_1106_ <<= 4;
			for (int i_1119_ = 0; i_1119_ < i_1109_; i_1119_++) {
				int i_1120_ = is[i_1119_];
				if (i_1120_ < verticesByLabel.length) {
					int[] is_1121_ = verticesByLabel[i_1120_];
					for (int element : is_1121_) {
						int i_1123_ = element;
						if (aShortArray7838 == null || (i_1107_ & aShortArray7838[i_1123_]) != 0) {
							vertices_x[i_1123_] += i_1104_;
							vertices_y[i_1123_] += i_1105_;
							vertices_z[i_1123_] += i_1106_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1108_ != null) {
				int i_1124_ = is_1108_[9] << 4;
				int i_1125_ = is_1108_[10] << 4;
				int i_1126_ = is_1108_[11] << 4;
				int i_1127_ = is_1108_[12] << 4;
				int i_1128_ = is_1108_[13] << 4;
				int i_1129_ = is_1108_[14] << 4;
				if (aBoolean7817) {
					int i_1130_ = is_1108_[0] * origin_x + is_1108_[3] * origin_y + is_1108_[6] * origin_z + 8192 >> 14;
					int i_1131_ = is_1108_[1] * origin_x + is_1108_[4] * origin_y + is_1108_[7] * origin_z + 8192 >> 14;
					int i_1132_ = is_1108_[2] * origin_x + is_1108_[5] * origin_y + is_1108_[8] * origin_z + 8192 >> 14;
					i_1130_ += i_1127_;
					i_1131_ += i_1128_;
					i_1132_ += i_1129_;
					origin_x = i_1130_;
					origin_y = i_1131_;
					origin_z = i_1132_;
					aBoolean7817 = false;
				}
				int[] is_1133_ = new int[9];
				int i_1134_ = Class220.COSINE[i_1104_];
				int i_1135_ = Class220.SINE[i_1104_];
				int i_1136_ = Class220.COSINE[i_1105_];
				int i_1137_ = Class220.SINE[i_1105_];
				int i_1138_ = Class220.COSINE[i_1106_];
				int i_1139_ = Class220.SINE[i_1106_];
				int i_1140_ = i_1135_ * i_1138_ + 8192 >> 14;
				int i_1141_ = i_1135_ * i_1139_ + 8192 >> 14;
				is_1133_[0] = i_1136_ * i_1138_ + i_1137_ * i_1141_ + 8192 >> 14;
				is_1133_[1] = -i_1136_ * i_1139_ + i_1137_ * i_1140_ + 8192 >> 14;
				is_1133_[2] = i_1137_ * i_1134_ + 8192 >> 14;
				is_1133_[3] = i_1134_ * i_1139_ + 8192 >> 14;
				is_1133_[4] = i_1134_ * i_1138_ + 8192 >> 14;
				is_1133_[5] = -i_1135_;
				is_1133_[6] = -i_1137_ * i_1138_ + i_1136_ * i_1141_ + 8192 >> 14;
				is_1133_[7] = i_1137_ * i_1139_ + i_1136_ * i_1140_ + 8192 >> 14;
				is_1133_[8] = i_1136_ * i_1134_ + 8192 >> 14;
				int i_1142_ = is_1133_[0] * -origin_x + is_1133_[1] * -origin_y + is_1133_[2] * -origin_z + 8192 >> 14;
				int i_1143_ = is_1133_[3] * -origin_x + is_1133_[4] * -origin_y + is_1133_[5] * -origin_z + 8192 >> 14;
				int i_1144_ = is_1133_[6] * -origin_x + is_1133_[7] * -origin_y + is_1133_[8] * -origin_z + 8192 >> 14;
				int i_1145_ = i_1142_ + origin_x;
				int i_1146_ = i_1143_ + origin_y;
				int i_1147_ = i_1144_ + origin_z;
				int[] is_1148_ = new int[9];
				for (int i_1149_ = 0; i_1149_ < 3; i_1149_++) {
					for (int i_1150_ = 0; i_1150_ < 3; i_1150_++) {
						int i_1151_ = 0;
						for (int i_1152_ = 0; i_1152_ < 3; i_1152_++) {
							i_1151_ += is_1133_[i_1149_ * 3 + i_1152_] * is_1108_[i_1150_ * 3 + i_1152_];
						}
						is_1148_[i_1149_ * 3 + i_1150_] = i_1151_ + 8192 >> 14;
					}
				}
				int i_1153_ = is_1133_[0] * i_1127_ + is_1133_[1] * i_1128_ + is_1133_[2] * i_1129_ + 8192 >> 14;
				int i_1154_ = is_1133_[3] * i_1127_ + is_1133_[4] * i_1128_ + is_1133_[5] * i_1129_ + 8192 >> 14;
				int i_1155_ = is_1133_[6] * i_1127_ + is_1133_[7] * i_1128_ + is_1133_[8] * i_1129_ + 8192 >> 14;
				i_1153_ += i_1145_;
				i_1154_ += i_1146_;
				i_1155_ += i_1147_;
				int[] is_1156_ = new int[9];
				for (int i_1157_ = 0; i_1157_ < 3; i_1157_++) {
					for (int i_1158_ = 0; i_1158_ < 3; i_1158_++) {
						int i_1159_ = 0;
						for (int i_1160_ = 0; i_1160_ < 3; i_1160_++) {
							i_1159_ += is_1108_[i_1157_ * 3 + i_1160_] * is_1148_[i_1158_ + i_1160_ * 3];
						}
						is_1156_[i_1157_ * 3 + i_1158_] = i_1159_ + 8192 >> 14;
					}
				}
				int i_1161_ = is_1108_[0] * i_1153_ + is_1108_[1] * i_1154_ + is_1108_[2] * i_1155_ + 8192 >> 14;
				int i_1162_ = is_1108_[3] * i_1153_ + is_1108_[4] * i_1154_ + is_1108_[5] * i_1155_ + 8192 >> 14;
				int i_1163_ = is_1108_[6] * i_1153_ + is_1108_[7] * i_1154_ + is_1108_[8] * i_1155_ + 8192 >> 14;
				i_1161_ += i_1124_;
				i_1162_ += i_1125_;
				i_1163_ += i_1126_;
				for (int i_1164_ = 0; i_1164_ < i_1109_; i_1164_++) {
					int i_1165_ = is[i_1164_];
					if (i_1165_ < verticesByLabel.length) {
						int[] is_1166_ = verticesByLabel[i_1165_];
						for (int element : is_1166_) {
							int i_1168_ = element;
							if (aShortArray7838 == null || (i_1107_ & aShortArray7838[i_1168_]) != 0) {
								int i_1169_ = is_1156_[0] * vertices_x[i_1168_] + is_1156_[1] * vertices_y[i_1168_] + is_1156_[2] * vertices_z[i_1168_] + 8192 >> 14;
								int i_1170_ = is_1156_[3] * vertices_x[i_1168_] + is_1156_[4] * vertices_y[i_1168_] + is_1156_[5] * vertices_z[i_1168_] + 8192 >> 14;
								int i_1171_ = is_1156_[6] * vertices_x[i_1168_] + is_1156_[7] * vertices_y[i_1168_] + is_1156_[8] * vertices_z[i_1168_] + 8192 >> 14;
								i_1169_ += i_1161_;
								i_1170_ += i_1162_;
								i_1171_ += i_1163_;
								vertices_x[i_1168_] = i_1169_;
								vertices_y[i_1168_] = i_1170_;
								vertices_z[i_1168_] = i_1171_;
							}
						}
					}
				}
			} else {
				for (int i_1172_ = 0; i_1172_ < i_1109_; i_1172_++) {
					int i_1173_ = is[i_1172_];
					if (i_1173_ < verticesByLabel.length) {
						int[] is_1174_ = verticesByLabel[i_1173_];
						for (int element : is_1174_) {
							int i_1176_ = element;
							if (aShortArray7838 == null || (i_1107_ & aShortArray7838[i_1176_]) != 0) {
								vertices_x[i_1176_] -= origin_x;
								vertices_y[i_1176_] -= origin_y;
								vertices_z[i_1176_] -= origin_z;
								if (i_1106_ != 0) {
									int i_1177_ = Class220.SINE[i_1106_];
									int i_1178_ = Class220.COSINE[i_1106_];
									int i_1179_ = vertices_y[i_1176_] * i_1177_ + vertices_x[i_1176_] * i_1178_ + 16383 >> 14;
									vertices_y[i_1176_] = vertices_y[i_1176_] * i_1178_ - vertices_x[i_1176_] * i_1177_ + 16383 >> 14;
									vertices_x[i_1176_] = i_1179_;
								}
								if (i_1104_ != 0) {
									int i_1180_ = Class220.SINE[i_1104_];
									int i_1181_ = Class220.COSINE[i_1104_];
									int i_1182_ = vertices_y[i_1176_] * i_1181_ - vertices_z[i_1176_] * i_1180_ + 16383 >> 14;
									vertices_z[i_1176_] = vertices_y[i_1176_] * i_1180_ + vertices_z[i_1176_] * i_1181_ + 16383 >> 14;
									vertices_y[i_1176_] = i_1182_;
								}
								if (i_1105_ != 0) {
									int i_1183_ = Class220.SINE[i_1105_];
									int i_1184_ = Class220.COSINE[i_1105_];
									int i_1185_ = vertices_z[i_1176_] * i_1183_ + vertices_x[i_1176_] * i_1184_ + 16383 >> 14;
									vertices_z[i_1176_] = vertices_z[i_1176_] * i_1184_ - vertices_x[i_1176_] * i_1183_ + 16383 >> 14;
									vertices_x[i_1176_] = i_1185_;
								}
								vertices_x[i_1176_] += origin_x;
								vertices_y[i_1176_] += origin_y;
								vertices_z[i_1176_] += origin_z;
							}
						}
					}
				}
				if (bool) {
					for (int i_1186_ = 0; i_1186_ < i_1109_; i_1186_++) {
						int i_1187_ = is[i_1186_];
						if (i_1187_ < verticesByLabel.length) {
							int[] is_1188_ = verticesByLabel[i_1187_];
							for (int i_1190_ : is_1188_) {
								if (aShortArray7838 == null || (i_1107_ & aShortArray7838[i_1190_]) != 0) {
									int i_1191_ = anIntArray7854[i_1190_];
									int i_1192_ = anIntArray7854[i_1190_ + 1];
									for (int i_1193_ = i_1191_; i_1193_ < i_1192_; i_1193_++) {
										int i_1194_ = aShortArray7830[i_1193_] - 1;
										if (i_1194_ == -1) {
											break;
										}
										if (i_1106_ != 0) {
											int i_1195_ = Class220.SINE[i_1106_];
											int i_1196_ = Class220.COSINE[i_1106_];
											int i_1197_ = aShortArray7841[i_1194_] * i_1195_ + aShortArray7829[i_1194_] * i_1196_ + 16383 >> 14;
											aShortArray7841[i_1194_] = (short) (aShortArray7841[i_1194_] * i_1196_ - aShortArray7829[i_1194_] * i_1195_ + 16383 >> 14);
											aShortArray7829[i_1194_] = (short) i_1197_;
										}
										if (i_1104_ != 0) {
											int i_1198_ = Class220.SINE[i_1104_];
											int i_1199_ = Class220.COSINE[i_1104_];
											int i_1200_ = aShortArray7841[i_1194_] * i_1199_ - aShortArray7842[i_1194_] * i_1198_ + 16383 >> 14;
											aShortArray7842[i_1194_] = (short) (aShortArray7841[i_1194_] * i_1198_ + aShortArray7842[i_1194_] * i_1199_ + 16383 >> 14);
											aShortArray7841[i_1194_] = (short) i_1200_;
										}
										if (i_1105_ != 0) {
											int i_1201_ = Class220.SINE[i_1105_];
											int i_1202_ = Class220.COSINE[i_1105_];
											int i_1203_ = aShortArray7842[i_1194_] * i_1201_ + aShortArray7829[i_1194_] * i_1202_ + 16383 >> 14;
											aShortArray7842[i_1194_] = (short) (aShortArray7842[i_1194_] * i_1202_ - aShortArray7829[i_1194_] * i_1201_ + 16383 >> 14);
											aShortArray7829[i_1194_] = (short) i_1203_;
										}
									}
								}
							}
						}
					}
					if (aClass32_7889 == null && aClass32_7858 != null) {
						aClass32_7858.anInterface1_397 = null;
					}
					if (aClass32_7889 != null) {
						aClass32_7889.anInterface1_397 = null;
					}
				}
			}
		} else if (i == 3) {
			if (is_1108_ != null) {
				int i_1204_ = is_1108_[9] << 4;
				int i_1205_ = is_1108_[10] << 4;
				int i_1206_ = is_1108_[11] << 4;
				int i_1207_ = is_1108_[12] << 4;
				int i_1208_ = is_1108_[13] << 4;
				int i_1209_ = is_1108_[14] << 4;
				if (aBoolean7817) {
					int i_1210_ = is_1108_[0] * origin_x + is_1108_[3] * origin_y + is_1108_[6] * origin_z + 8192 >> 14;
					int i_1211_ = is_1108_[1] * origin_x + is_1108_[4] * origin_y + is_1108_[7] * origin_z + 8192 >> 14;
					int i_1212_ = is_1108_[2] * origin_x + is_1108_[5] * origin_y + is_1108_[8] * origin_z + 8192 >> 14;
					i_1210_ += i_1207_;
					i_1211_ += i_1208_;
					i_1212_ += i_1209_;
					origin_x = i_1210_;
					origin_y = i_1211_;
					origin_z = i_1212_;
					aBoolean7817 = false;
				}
				int i_1213_ = i_1104_ << 15 >> 7;
				int i_1214_ = i_1105_ << 15 >> 7;
				int i_1215_ = i_1106_ << 15 >> 7;
				int i_1216_ = i_1213_ * -origin_x + 8192 >> 14;
				int i_1217_ = i_1214_ * -origin_y + 8192 >> 14;
				int i_1218_ = i_1215_ * -origin_z + 8192 >> 14;
				int i_1219_ = i_1216_ + origin_x;
				int i_1220_ = i_1217_ + origin_y;
				int i_1221_ = i_1218_ + origin_z;
				int[] is_1222_ = new int[9];
				is_1222_[0] = i_1213_ * is_1108_[0] + 8192 >> 14;
				is_1222_[1] = i_1213_ * is_1108_[3] + 8192 >> 14;
				is_1222_[2] = i_1213_ * is_1108_[6] + 8192 >> 14;
				is_1222_[3] = i_1214_ * is_1108_[1] + 8192 >> 14;
				is_1222_[4] = i_1214_ * is_1108_[4] + 8192 >> 14;
				is_1222_[5] = i_1214_ * is_1108_[7] + 8192 >> 14;
				is_1222_[6] = i_1215_ * is_1108_[2] + 8192 >> 14;
				is_1222_[7] = i_1215_ * is_1108_[5] + 8192 >> 14;
				is_1222_[8] = i_1215_ * is_1108_[8] + 8192 >> 14;
				int i_1223_ = i_1213_ * i_1207_ + 8192 >> 14;
				int i_1224_ = i_1214_ * i_1208_ + 8192 >> 14;
				int i_1225_ = i_1215_ * i_1209_ + 8192 >> 14;
				i_1223_ += i_1219_;
				i_1224_ += i_1220_;
				i_1225_ += i_1221_;
				int[] is_1226_ = new int[9];
				for (int i_1227_ = 0; i_1227_ < 3; i_1227_++) {
					for (int i_1228_ = 0; i_1228_ < 3; i_1228_++) {
						int i_1229_ = 0;
						for (int i_1230_ = 0; i_1230_ < 3; i_1230_++) {
							i_1229_ += is_1108_[i_1227_ * 3 + i_1230_] * is_1222_[i_1228_ + i_1230_ * 3];
						}
						is_1226_[i_1227_ * 3 + i_1228_] = i_1229_ + 8192 >> 14;
					}
				}
				int i_1231_ = is_1108_[0] * i_1223_ + is_1108_[1] * i_1224_ + is_1108_[2] * i_1225_ + 8192 >> 14;
				int i_1232_ = is_1108_[3] * i_1223_ + is_1108_[4] * i_1224_ + is_1108_[5] * i_1225_ + 8192 >> 14;
				int i_1233_ = is_1108_[6] * i_1223_ + is_1108_[7] * i_1224_ + is_1108_[8] * i_1225_ + 8192 >> 14;
				i_1231_ += i_1204_;
				i_1232_ += i_1205_;
				i_1233_ += i_1206_;
				for (int i_1234_ = 0; i_1234_ < i_1109_; i_1234_++) {
					int i_1235_ = is[i_1234_];
					if (i_1235_ < verticesByLabel.length) {
						int[] is_1236_ = verticesByLabel[i_1235_];
						for (int element : is_1236_) {
							int i_1238_ = element;
							if (aShortArray7838 == null || (i_1107_ & aShortArray7838[i_1238_]) != 0) {
								int i_1239_ = is_1226_[0] * vertices_x[i_1238_] + is_1226_[1] * vertices_y[i_1238_] + is_1226_[2] * vertices_z[i_1238_] + 8192 >> 14;
								int i_1240_ = is_1226_[3] * vertices_x[i_1238_] + is_1226_[4] * vertices_y[i_1238_] + is_1226_[5] * vertices_z[i_1238_] + 8192 >> 14;
								int i_1241_ = is_1226_[6] * vertices_x[i_1238_] + is_1226_[7] * vertices_y[i_1238_] + is_1226_[8] * vertices_z[i_1238_] + 8192 >> 14;
								i_1239_ += i_1231_;
								i_1240_ += i_1232_;
								i_1241_ += i_1233_;
								vertices_x[i_1238_] = i_1239_;
								vertices_y[i_1238_] = i_1240_;
								vertices_z[i_1238_] = i_1241_;
							}
						}
					}
				}
			} else {
				for (int i_1242_ = 0; i_1242_ < i_1109_; i_1242_++) {
					int i_1243_ = is[i_1242_];
					if (i_1243_ < verticesByLabel.length) {
						int[] is_1244_ = verticesByLabel[i_1243_];
						for (int element : is_1244_) {
							int i_1246_ = element;
							if (aShortArray7838 == null || (i_1107_ & aShortArray7838[i_1246_]) != 0) {
								vertices_x[i_1246_] -= origin_x;
								vertices_y[i_1246_] -= origin_y;
								vertices_z[i_1246_] -= origin_z;
								vertices_x[i_1246_] = vertices_x[i_1246_] * i_1104_ >> 7;
								vertices_y[i_1246_] = vertices_y[i_1246_] * i_1105_ >> 7;
								vertices_z[i_1246_] = vertices_z[i_1246_] * i_1106_ >> 7;
								vertices_x[i_1246_] += origin_x;
								vertices_y[i_1246_] += origin_y;
								vertices_z[i_1246_] += origin_z;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray7855 != null) {
				for (int i_1247_ = 0; i_1247_ < i_1109_; i_1247_++) {
					int i_1248_ = is[i_1247_];
					if (i_1248_ < anIntArrayArray7855.length) {
						int[] is_1249_ = anIntArrayArray7855[i_1248_];
						for (int element : is_1249_) {
							int i_1251_ = element;
							if (aShortArray7856 == null || (i_1107_ & aShortArray7856[i_1251_]) != 0) {
								int i_1252_ = (aByteArray7850[i_1251_] & 0xff) + i_1104_ * 8;
								if (i_1252_ < 0) {
									i_1252_ = 0;
								} else if (i_1252_ > 255) {
									i_1252_ = 255;
								}
								aByteArray7850[i_1251_] = (byte) i_1252_;
								if (aClass32_7858 != null) {
									aClass32_7858.anInterface1_397 = null;
								}
							}
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_1253_ = 0; i_1253_ < anInt7877; i_1253_++) {
						Class54 class54 = aClass54Array7880[i_1253_];
						Class36 class36 = aClass36Array7875[i_1253_];
						class36.anInt424 = class36.anInt424 & 0xffffff | 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray7855 != null) {
				for (int i_1254_ = 0; i_1254_ < i_1109_; i_1254_++) {
					int i_1255_ = is[i_1254_];
					if (i_1255_ < anIntArrayArray7855.length) {
						int[] is_1256_ = anIntArrayArray7855[i_1255_];
						for (int element : is_1256_) {
							int i_1258_ = element;
							if (aShortArray7856 == null || (i_1107_ & aShortArray7856[i_1258_]) != 0) {
								int i_1259_ = aShortArray7849[i_1258_] & 0xffff;
								int i_1260_ = i_1259_ >> 10 & 0x3f;
								int i_1261_ = i_1259_ >> 7 & 0x7;
								int i_1262_ = i_1259_ & 0x7f;
								i_1260_ = i_1260_ + i_1104_ & 0x3f;
								i_1261_ += i_1105_ / 4;
								if (i_1261_ < 0) {
									i_1261_ = 0;
								} else if (i_1261_ > 7) {
									i_1261_ = 7;
								}
								i_1262_ += i_1106_;
								if (i_1262_ < 0) {
									i_1262_ = 0;
								} else if (i_1262_ > 127) {
									i_1262_ = 127;
								}
								aShortArray7849[i_1258_] = (short) (i_1260_ << 10 | i_1261_ << 7 | i_1262_);
								if (aClass32_7858 != null) {
									aClass32_7858.anInterface1_397 = null;
								}
							}
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_1263_ = 0; i_1263_ < anInt7877; i_1263_++) {
						Class54 class54 = aClass54Array7880[i_1263_];
						Class36 class36 = aClass36Array7875[i_1263_];
						class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray7882 != null) {
				for (int i_1264_ = 0; i_1264_ < i_1109_; i_1264_++) {
					int i_1265_ = is[i_1264_];
					if (i_1265_ < anIntArrayArray7882.length) {
						int[] is_1266_ = anIntArrayArray7882[i_1265_];
						for (int element : is_1266_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt422 += i_1104_;
							class36.anInt419 += i_1105_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray7882 != null) {
				for (int i_1268_ = 0; i_1268_ < i_1109_; i_1268_++) {
					int i_1269_ = is[i_1268_];
					if (i_1269_ < anIntArrayArray7882.length) {
						int[] is_1270_ = anIntArrayArray7882[i_1269_];
						for (int element : is_1270_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt420 = class36.anInt420 * i_1104_ >> 7;
							class36.anInt421 = class36.anInt421 * i_1105_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray7882 != null) {
				for (int i_1272_ = 0; i_1272_ < i_1109_; i_1272_++) {
					int i_1273_ = is[i_1272_];
					if (i_1273_ < anIntArrayArray7882.length) {
						int[] is_1274_ = anIntArrayArray7882[i_1273_];
						for (int element : is_1274_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt423 = class36.anInt423 + i_1104_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	@Override
	void cj(int i, int[] is, int i_1276_, int i_1277_, int i_1278_, boolean bool, int i_1279_, int[] is_1280_) {
		int i_1281_ = is.length;
		if (i == 0) {
			i_1276_ <<= 4;
			i_1277_ <<= 4;
			i_1278_ <<= 4;
			int i_1282_ = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_1283_ = 0; i_1283_ < i_1281_; i_1283_++) {
				int i_1284_ = is[i_1283_];
				if (i_1284_ < verticesByLabel.length) {
					int[] is_1285_ = verticesByLabel[i_1284_];
					for (int i_1287_ : is_1285_) {
						if (aShortArray7838 == null || (i_1279_ & aShortArray7838[i_1287_]) != 0) {
							origin_x += vertices_x[i_1287_];
							origin_y += vertices_y[i_1287_];
							origin_z += vertices_z[i_1287_];
							i_1282_++;
						}
					}
				}
			}
			if (i_1282_ > 0) {
				origin_x = origin_x / i_1282_ + i_1276_;
				origin_y = origin_y / i_1282_ + i_1277_;
				origin_z = origin_z / i_1282_ + i_1278_;
				aBoolean7817 = true;
			} else {
				origin_x = i_1276_;
				origin_y = i_1277_;
				origin_z = i_1278_;
			}
		} else if (i == 1) {
			if (is_1280_ != null) {
				int i_1288_ = is_1280_[0] * i_1276_ + is_1280_[1] * i_1277_ + is_1280_[2] * i_1278_ + 8192 >> 14;
				int i_1289_ = is_1280_[3] * i_1276_ + is_1280_[4] * i_1277_ + is_1280_[5] * i_1278_ + 8192 >> 14;
				int i_1290_ = is_1280_[6] * i_1276_ + is_1280_[7] * i_1277_ + is_1280_[8] * i_1278_ + 8192 >> 14;
				i_1276_ = i_1288_;
				i_1277_ = i_1289_;
				i_1278_ = i_1290_;
			}
			i_1276_ <<= 4;
			i_1277_ <<= 4;
			i_1278_ <<= 4;
			for (int i_1291_ = 0; i_1291_ < i_1281_; i_1291_++) {
				int i_1292_ = is[i_1291_];
				if (i_1292_ < verticesByLabel.length) {
					int[] is_1293_ = verticesByLabel[i_1292_];
					for (int element : is_1293_) {
						int i_1295_ = element;
						if (aShortArray7838 == null || (i_1279_ & aShortArray7838[i_1295_]) != 0) {
							vertices_x[i_1295_] += i_1276_;
							vertices_y[i_1295_] += i_1277_;
							vertices_z[i_1295_] += i_1278_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1280_ != null) {
				int i_1296_ = is_1280_[9] << 4;
				int i_1297_ = is_1280_[10] << 4;
				int i_1298_ = is_1280_[11] << 4;
				int i_1299_ = is_1280_[12] << 4;
				int i_1300_ = is_1280_[13] << 4;
				int i_1301_ = is_1280_[14] << 4;
				if (aBoolean7817) {
					int i_1302_ = is_1280_[0] * origin_x + is_1280_[3] * origin_y + is_1280_[6] * origin_z + 8192 >> 14;
					int i_1303_ = is_1280_[1] * origin_x + is_1280_[4] * origin_y + is_1280_[7] * origin_z + 8192 >> 14;
					int i_1304_ = is_1280_[2] * origin_x + is_1280_[5] * origin_y + is_1280_[8] * origin_z + 8192 >> 14;
					i_1302_ += i_1299_;
					i_1303_ += i_1300_;
					i_1304_ += i_1301_;
					origin_x = i_1302_;
					origin_y = i_1303_;
					origin_z = i_1304_;
					aBoolean7817 = false;
				}
				int[] is_1305_ = new int[9];
				int i_1306_ = Class220.COSINE[i_1276_];
				int i_1307_ = Class220.SINE[i_1276_];
				int i_1308_ = Class220.COSINE[i_1277_];
				int i_1309_ = Class220.SINE[i_1277_];
				int i_1310_ = Class220.COSINE[i_1278_];
				int i_1311_ = Class220.SINE[i_1278_];
				int i_1312_ = i_1307_ * i_1310_ + 8192 >> 14;
				int i_1313_ = i_1307_ * i_1311_ + 8192 >> 14;
				is_1305_[0] = i_1308_ * i_1310_ + i_1309_ * i_1313_ + 8192 >> 14;
				is_1305_[1] = -i_1308_ * i_1311_ + i_1309_ * i_1312_ + 8192 >> 14;
				is_1305_[2] = i_1309_ * i_1306_ + 8192 >> 14;
				is_1305_[3] = i_1306_ * i_1311_ + 8192 >> 14;
				is_1305_[4] = i_1306_ * i_1310_ + 8192 >> 14;
				is_1305_[5] = -i_1307_;
				is_1305_[6] = -i_1309_ * i_1310_ + i_1308_ * i_1313_ + 8192 >> 14;
				is_1305_[7] = i_1309_ * i_1311_ + i_1308_ * i_1312_ + 8192 >> 14;
				is_1305_[8] = i_1308_ * i_1306_ + 8192 >> 14;
				int i_1314_ = is_1305_[0] * -origin_x + is_1305_[1] * -origin_y + is_1305_[2] * -origin_z + 8192 >> 14;
				int i_1315_ = is_1305_[3] * -origin_x + is_1305_[4] * -origin_y + is_1305_[5] * -origin_z + 8192 >> 14;
				int i_1316_ = is_1305_[6] * -origin_x + is_1305_[7] * -origin_y + is_1305_[8] * -origin_z + 8192 >> 14;
				int i_1317_ = i_1314_ + origin_x;
				int i_1318_ = i_1315_ + origin_y;
				int i_1319_ = i_1316_ + origin_z;
				int[] is_1320_ = new int[9];
				for (int i_1321_ = 0; i_1321_ < 3; i_1321_++) {
					for (int i_1322_ = 0; i_1322_ < 3; i_1322_++) {
						int i_1323_ = 0;
						for (int i_1324_ = 0; i_1324_ < 3; i_1324_++) {
							i_1323_ += is_1305_[i_1321_ * 3 + i_1324_] * is_1280_[i_1322_ * 3 + i_1324_];
						}
						is_1320_[i_1321_ * 3 + i_1322_] = i_1323_ + 8192 >> 14;
					}
				}
				int i_1325_ = is_1305_[0] * i_1299_ + is_1305_[1] * i_1300_ + is_1305_[2] * i_1301_ + 8192 >> 14;
				int i_1326_ = is_1305_[3] * i_1299_ + is_1305_[4] * i_1300_ + is_1305_[5] * i_1301_ + 8192 >> 14;
				int i_1327_ = is_1305_[6] * i_1299_ + is_1305_[7] * i_1300_ + is_1305_[8] * i_1301_ + 8192 >> 14;
				i_1325_ += i_1317_;
				i_1326_ += i_1318_;
				i_1327_ += i_1319_;
				int[] is_1328_ = new int[9];
				for (int i_1329_ = 0; i_1329_ < 3; i_1329_++) {
					for (int i_1330_ = 0; i_1330_ < 3; i_1330_++) {
						int i_1331_ = 0;
						for (int i_1332_ = 0; i_1332_ < 3; i_1332_++) {
							i_1331_ += is_1280_[i_1329_ * 3 + i_1332_] * is_1320_[i_1330_ + i_1332_ * 3];
						}
						is_1328_[i_1329_ * 3 + i_1330_] = i_1331_ + 8192 >> 14;
					}
				}
				int i_1333_ = is_1280_[0] * i_1325_ + is_1280_[1] * i_1326_ + is_1280_[2] * i_1327_ + 8192 >> 14;
				int i_1334_ = is_1280_[3] * i_1325_ + is_1280_[4] * i_1326_ + is_1280_[5] * i_1327_ + 8192 >> 14;
				int i_1335_ = is_1280_[6] * i_1325_ + is_1280_[7] * i_1326_ + is_1280_[8] * i_1327_ + 8192 >> 14;
				i_1333_ += i_1296_;
				i_1334_ += i_1297_;
				i_1335_ += i_1298_;
				for (int i_1336_ = 0; i_1336_ < i_1281_; i_1336_++) {
					int i_1337_ = is[i_1336_];
					if (i_1337_ < verticesByLabel.length) {
						int[] is_1338_ = verticesByLabel[i_1337_];
						for (int element : is_1338_) {
							int i_1340_ = element;
							if (aShortArray7838 == null || (i_1279_ & aShortArray7838[i_1340_]) != 0) {
								int i_1341_ = is_1328_[0] * vertices_x[i_1340_] + is_1328_[1] * vertices_y[i_1340_] + is_1328_[2] * vertices_z[i_1340_] + 8192 >> 14;
								int i_1342_ = is_1328_[3] * vertices_x[i_1340_] + is_1328_[4] * vertices_y[i_1340_] + is_1328_[5] * vertices_z[i_1340_] + 8192 >> 14;
								int i_1343_ = is_1328_[6] * vertices_x[i_1340_] + is_1328_[7] * vertices_y[i_1340_] + is_1328_[8] * vertices_z[i_1340_] + 8192 >> 14;
								i_1341_ += i_1333_;
								i_1342_ += i_1334_;
								i_1343_ += i_1335_;
								vertices_x[i_1340_] = i_1341_;
								vertices_y[i_1340_] = i_1342_;
								vertices_z[i_1340_] = i_1343_;
							}
						}
					}
				}
			} else {
				for (int i_1344_ = 0; i_1344_ < i_1281_; i_1344_++) {
					int i_1345_ = is[i_1344_];
					if (i_1345_ < verticesByLabel.length) {
						int[] is_1346_ = verticesByLabel[i_1345_];
						for (int element : is_1346_) {
							int i_1348_ = element;
							if (aShortArray7838 == null || (i_1279_ & aShortArray7838[i_1348_]) != 0) {
								vertices_x[i_1348_] -= origin_x;
								vertices_y[i_1348_] -= origin_y;
								vertices_z[i_1348_] -= origin_z;
								if (i_1278_ != 0) {
									int i_1349_ = Class220.SINE[i_1278_];
									int i_1350_ = Class220.COSINE[i_1278_];
									int i_1351_ = vertices_y[i_1348_] * i_1349_ + vertices_x[i_1348_] * i_1350_ + 16383 >> 14;
									vertices_y[i_1348_] = vertices_y[i_1348_] * i_1350_ - vertices_x[i_1348_] * i_1349_ + 16383 >> 14;
									vertices_x[i_1348_] = i_1351_;
								}
								if (i_1276_ != 0) {
									int i_1352_ = Class220.SINE[i_1276_];
									int i_1353_ = Class220.COSINE[i_1276_];
									int i_1354_ = vertices_y[i_1348_] * i_1353_ - vertices_z[i_1348_] * i_1352_ + 16383 >> 14;
									vertices_z[i_1348_] = vertices_y[i_1348_] * i_1352_ + vertices_z[i_1348_] * i_1353_ + 16383 >> 14;
									vertices_y[i_1348_] = i_1354_;
								}
								if (i_1277_ != 0) {
									int i_1355_ = Class220.SINE[i_1277_];
									int i_1356_ = Class220.COSINE[i_1277_];
									int i_1357_ = vertices_z[i_1348_] * i_1355_ + vertices_x[i_1348_] * i_1356_ + 16383 >> 14;
									vertices_z[i_1348_] = vertices_z[i_1348_] * i_1356_ - vertices_x[i_1348_] * i_1355_ + 16383 >> 14;
									vertices_x[i_1348_] = i_1357_;
								}
								vertices_x[i_1348_] += origin_x;
								vertices_y[i_1348_] += origin_y;
								vertices_z[i_1348_] += origin_z;
							}
						}
					}
				}
				if (bool) {
					for (int i_1358_ = 0; i_1358_ < i_1281_; i_1358_++) {
						int i_1359_ = is[i_1358_];
						if (i_1359_ < verticesByLabel.length) {
							int[] is_1360_ = verticesByLabel[i_1359_];
							for (int i_1362_ : is_1360_) {
								if (aShortArray7838 == null || (i_1279_ & aShortArray7838[i_1362_]) != 0) {
									int i_1363_ = anIntArray7854[i_1362_];
									int i_1364_ = anIntArray7854[i_1362_ + 1];
									for (int i_1365_ = i_1363_; i_1365_ < i_1364_; i_1365_++) {
										int i_1366_ = aShortArray7830[i_1365_] - 1;
										if (i_1366_ == -1) {
											break;
										}
										if (i_1278_ != 0) {
											int i_1367_ = Class220.SINE[i_1278_];
											int i_1368_ = Class220.COSINE[i_1278_];
											int i_1369_ = aShortArray7841[i_1366_] * i_1367_ + aShortArray7829[i_1366_] * i_1368_ + 16383 >> 14;
											aShortArray7841[i_1366_] = (short) (aShortArray7841[i_1366_] * i_1368_ - aShortArray7829[i_1366_] * i_1367_ + 16383 >> 14);
											aShortArray7829[i_1366_] = (short) i_1369_;
										}
										if (i_1276_ != 0) {
											int i_1370_ = Class220.SINE[i_1276_];
											int i_1371_ = Class220.COSINE[i_1276_];
											int i_1372_ = aShortArray7841[i_1366_] * i_1371_ - aShortArray7842[i_1366_] * i_1370_ + 16383 >> 14;
											aShortArray7842[i_1366_] = (short) (aShortArray7841[i_1366_] * i_1370_ + aShortArray7842[i_1366_] * i_1371_ + 16383 >> 14);
											aShortArray7841[i_1366_] = (short) i_1372_;
										}
										if (i_1277_ != 0) {
											int i_1373_ = Class220.SINE[i_1277_];
											int i_1374_ = Class220.COSINE[i_1277_];
											int i_1375_ = aShortArray7842[i_1366_] * i_1373_ + aShortArray7829[i_1366_] * i_1374_ + 16383 >> 14;
											aShortArray7842[i_1366_] = (short) (aShortArray7842[i_1366_] * i_1374_ - aShortArray7829[i_1366_] * i_1373_ + 16383 >> 14);
											aShortArray7829[i_1366_] = (short) i_1375_;
										}
									}
								}
							}
						}
					}
					if (aClass32_7889 == null && aClass32_7858 != null) {
						aClass32_7858.anInterface1_397 = null;
					}
					if (aClass32_7889 != null) {
						aClass32_7889.anInterface1_397 = null;
					}
				}
			}
		} else if (i == 3) {
			if (is_1280_ != null) {
				int i_1376_ = is_1280_[9] << 4;
				int i_1377_ = is_1280_[10] << 4;
				int i_1378_ = is_1280_[11] << 4;
				int i_1379_ = is_1280_[12] << 4;
				int i_1380_ = is_1280_[13] << 4;
				int i_1381_ = is_1280_[14] << 4;
				if (aBoolean7817) {
					int i_1382_ = is_1280_[0] * origin_x + is_1280_[3] * origin_y + is_1280_[6] * origin_z + 8192 >> 14;
					int i_1383_ = is_1280_[1] * origin_x + is_1280_[4] * origin_y + is_1280_[7] * origin_z + 8192 >> 14;
					int i_1384_ = is_1280_[2] * origin_x + is_1280_[5] * origin_y + is_1280_[8] * origin_z + 8192 >> 14;
					i_1382_ += i_1379_;
					i_1383_ += i_1380_;
					i_1384_ += i_1381_;
					origin_x = i_1382_;
					origin_y = i_1383_;
					origin_z = i_1384_;
					aBoolean7817 = false;
				}
				int i_1385_ = i_1276_ << 15 >> 7;
				int i_1386_ = i_1277_ << 15 >> 7;
				int i_1387_ = i_1278_ << 15 >> 7;
				int i_1388_ = i_1385_ * -origin_x + 8192 >> 14;
				int i_1389_ = i_1386_ * -origin_y + 8192 >> 14;
				int i_1390_ = i_1387_ * -origin_z + 8192 >> 14;
				int i_1391_ = i_1388_ + origin_x;
				int i_1392_ = i_1389_ + origin_y;
				int i_1393_ = i_1390_ + origin_z;
				int[] is_1394_ = new int[9];
				is_1394_[0] = i_1385_ * is_1280_[0] + 8192 >> 14;
				is_1394_[1] = i_1385_ * is_1280_[3] + 8192 >> 14;
				is_1394_[2] = i_1385_ * is_1280_[6] + 8192 >> 14;
				is_1394_[3] = i_1386_ * is_1280_[1] + 8192 >> 14;
				is_1394_[4] = i_1386_ * is_1280_[4] + 8192 >> 14;
				is_1394_[5] = i_1386_ * is_1280_[7] + 8192 >> 14;
				is_1394_[6] = i_1387_ * is_1280_[2] + 8192 >> 14;
				is_1394_[7] = i_1387_ * is_1280_[5] + 8192 >> 14;
				is_1394_[8] = i_1387_ * is_1280_[8] + 8192 >> 14;
				int i_1395_ = i_1385_ * i_1379_ + 8192 >> 14;
				int i_1396_ = i_1386_ * i_1380_ + 8192 >> 14;
				int i_1397_ = i_1387_ * i_1381_ + 8192 >> 14;
				i_1395_ += i_1391_;
				i_1396_ += i_1392_;
				i_1397_ += i_1393_;
				int[] is_1398_ = new int[9];
				for (int i_1399_ = 0; i_1399_ < 3; i_1399_++) {
					for (int i_1400_ = 0; i_1400_ < 3; i_1400_++) {
						int i_1401_ = 0;
						for (int i_1402_ = 0; i_1402_ < 3; i_1402_++) {
							i_1401_ += is_1280_[i_1399_ * 3 + i_1402_] * is_1394_[i_1400_ + i_1402_ * 3];
						}
						is_1398_[i_1399_ * 3 + i_1400_] = i_1401_ + 8192 >> 14;
					}
				}
				int i_1403_ = is_1280_[0] * i_1395_ + is_1280_[1] * i_1396_ + is_1280_[2] * i_1397_ + 8192 >> 14;
				int i_1404_ = is_1280_[3] * i_1395_ + is_1280_[4] * i_1396_ + is_1280_[5] * i_1397_ + 8192 >> 14;
				int i_1405_ = is_1280_[6] * i_1395_ + is_1280_[7] * i_1396_ + is_1280_[8] * i_1397_ + 8192 >> 14;
				i_1403_ += i_1376_;
				i_1404_ += i_1377_;
				i_1405_ += i_1378_;
				for (int i_1406_ = 0; i_1406_ < i_1281_; i_1406_++) {
					int i_1407_ = is[i_1406_];
					if (i_1407_ < verticesByLabel.length) {
						int[] is_1408_ = verticesByLabel[i_1407_];
						for (int element : is_1408_) {
							int i_1410_ = element;
							if (aShortArray7838 == null || (i_1279_ & aShortArray7838[i_1410_]) != 0) {
								int i_1411_ = is_1398_[0] * vertices_x[i_1410_] + is_1398_[1] * vertices_y[i_1410_] + is_1398_[2] * vertices_z[i_1410_] + 8192 >> 14;
								int i_1412_ = is_1398_[3] * vertices_x[i_1410_] + is_1398_[4] * vertices_y[i_1410_] + is_1398_[5] * vertices_z[i_1410_] + 8192 >> 14;
								int i_1413_ = is_1398_[6] * vertices_x[i_1410_] + is_1398_[7] * vertices_y[i_1410_] + is_1398_[8] * vertices_z[i_1410_] + 8192 >> 14;
								i_1411_ += i_1403_;
								i_1412_ += i_1404_;
								i_1413_ += i_1405_;
								vertices_x[i_1410_] = i_1411_;
								vertices_y[i_1410_] = i_1412_;
								vertices_z[i_1410_] = i_1413_;
							}
						}
					}
				}
			} else {
				for (int i_1414_ = 0; i_1414_ < i_1281_; i_1414_++) {
					int i_1415_ = is[i_1414_];
					if (i_1415_ < verticesByLabel.length) {
						int[] is_1416_ = verticesByLabel[i_1415_];
						for (int element : is_1416_) {
							int i_1418_ = element;
							if (aShortArray7838 == null || (i_1279_ & aShortArray7838[i_1418_]) != 0) {
								vertices_x[i_1418_] -= origin_x;
								vertices_y[i_1418_] -= origin_y;
								vertices_z[i_1418_] -= origin_z;
								vertices_x[i_1418_] = vertices_x[i_1418_] * i_1276_ >> 7;
								vertices_y[i_1418_] = vertices_y[i_1418_] * i_1277_ >> 7;
								vertices_z[i_1418_] = vertices_z[i_1418_] * i_1278_ >> 7;
								vertices_x[i_1418_] += origin_x;
								vertices_y[i_1418_] += origin_y;
								vertices_z[i_1418_] += origin_z;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray7855 != null) {
				for (int i_1419_ = 0; i_1419_ < i_1281_; i_1419_++) {
					int i_1420_ = is[i_1419_];
					if (i_1420_ < anIntArrayArray7855.length) {
						int[] is_1421_ = anIntArrayArray7855[i_1420_];
						for (int element : is_1421_) {
							int i_1423_ = element;
							if (aShortArray7856 == null || (i_1279_ & aShortArray7856[i_1423_]) != 0) {
								int i_1424_ = (aByteArray7850[i_1423_] & 0xff) + i_1276_ * 8;
								if (i_1424_ < 0) {
									i_1424_ = 0;
								} else if (i_1424_ > 255) {
									i_1424_ = 255;
								}
								aByteArray7850[i_1423_] = (byte) i_1424_;
								if (aClass32_7858 != null) {
									aClass32_7858.anInterface1_397 = null;
								}
							}
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_1425_ = 0; i_1425_ < anInt7877; i_1425_++) {
						Class54 class54 = aClass54Array7880[i_1425_];
						Class36 class36 = aClass36Array7875[i_1425_];
						class36.anInt424 = class36.anInt424 & 0xffffff | 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray7855 != null) {
				for (int i_1426_ = 0; i_1426_ < i_1281_; i_1426_++) {
					int i_1427_ = is[i_1426_];
					if (i_1427_ < anIntArrayArray7855.length) {
						int[] is_1428_ = anIntArrayArray7855[i_1427_];
						for (int element : is_1428_) {
							int i_1430_ = element;
							if (aShortArray7856 == null || (i_1279_ & aShortArray7856[i_1430_]) != 0) {
								int i_1431_ = aShortArray7849[i_1430_] & 0xffff;
								int i_1432_ = i_1431_ >> 10 & 0x3f;
								int i_1433_ = i_1431_ >> 7 & 0x7;
								int i_1434_ = i_1431_ & 0x7f;
								i_1432_ = i_1432_ + i_1276_ & 0x3f;
								i_1433_ += i_1277_ / 4;
								if (i_1433_ < 0) {
									i_1433_ = 0;
								} else if (i_1433_ > 7) {
									i_1433_ = 7;
								}
								i_1434_ += i_1278_;
								if (i_1434_ < 0) {
									i_1434_ = 0;
								} else if (i_1434_ > 127) {
									i_1434_ = 127;
								}
								aShortArray7849[i_1430_] = (short) (i_1432_ << 10 | i_1433_ << 7 | i_1434_);
								if (aClass32_7858 != null) {
									aClass32_7858.anInterface1_397 = null;
								}
							}
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_1435_ = 0; i_1435_ < anInt7877; i_1435_++) {
						Class54 class54 = aClass54Array7880[i_1435_];
						Class36 class36 = aClass36Array7875[i_1435_];
						class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray7882 != null) {
				for (int i_1436_ = 0; i_1436_ < i_1281_; i_1436_++) {
					int i_1437_ = is[i_1436_];
					if (i_1437_ < anIntArrayArray7882.length) {
						int[] is_1438_ = anIntArrayArray7882[i_1437_];
						for (int element : is_1438_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt422 += i_1276_;
							class36.anInt419 += i_1277_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray7882 != null) {
				for (int i_1440_ = 0; i_1440_ < i_1281_; i_1440_++) {
					int i_1441_ = is[i_1440_];
					if (i_1441_ < anIntArrayArray7882.length) {
						int[] is_1442_ = anIntArrayArray7882[i_1441_];
						for (int element : is_1442_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt420 = class36.anInt420 * i_1276_ >> 7;
							class36.anInt421 = class36.anInt421 * i_1277_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray7882 != null) {
				for (int i_1444_ = 0; i_1444_ < i_1281_; i_1444_++) {
					int i_1445_ = is[i_1444_];
					if (i_1445_ < anIntArrayArray7882.length) {
						int[] is_1446_ = anIntArrayArray7882[i_1445_];
						for (int element : is_1446_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt423 = class36.anInt423 + i_1276_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	@Override
	public void method4783(Matrix43f class222) {
		Class233 class233 = aClass_ra_Sub2_7824.aClass233_8104;
		class233.method2145(class222);
		if (aClass85Array7825 != null) {
			for (Class85 class85 : aClass85Array7825) {
				Class85 class85_1448_ = class85;
				if (class85.aClass85_776 != null) {
					class85_1448_ = class85.aClass85_776;
				}
				class85_1448_.anInt777 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[4] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[8] * vertices_z[class85.anInt773 * -710317103])) * -1879868075;
				class85_1448_.anInt783 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[5] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[9] * vertices_z[class85.anInt773 * -710317103])) * -2041556771;
				class85_1448_.anInt779 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[6] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[10] * vertices_z[class85.anInt773 * -710317103])) * -1434499227;
				class85_1448_.anInt772 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[4] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[8] * vertices_z[class85.anInt774 * 1705862021])) * 1070341177;
				class85_1448_.anInt781 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[5] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[9] * vertices_z[class85.anInt774 * 1705862021])) * 1802851857;
				class85_1448_.anInt782 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[6] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[10] * vertices_z[class85.anInt774 * 1705862021])) * 103846281;
				class85_1448_.anInt771 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[4] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[8] * vertices_z[class85.anInt775 * 1636170731])) * -2103324039;
				class85_1448_.anInt784 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[5] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[9] * vertices_z[class85.anInt775 * 1636170731])) * -526039059;
				class85_1448_.anInt785 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[6] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[10] * vertices_z[class85.anInt775 * 1636170731])) * 491030489;
			}
		}
		if (aMagnetConfigArray7857 != null) {
			for (MagnetConfig element : aMagnetConfigArray7857) {
				MagnetConfig magnetConfig = element;
				MagnetConfig magnetConfig_1449_ = magnetConfig;
				if (magnetConfig.aMagnetConfig_672 != null) {
					magnetConfig_1449_ = magnetConfig.aMagnetConfig_672;
				}
				if (magnetConfig.aClass233_677 != null) {
					magnetConfig.aClass233_677.method2142(class233);
				} else {
					magnetConfig.aClass233_677 = new Class233(class233);
				}
				magnetConfig_1449_.anInt671 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[4] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[8] * vertices_z[magnetConfig.anInt674 * -180596249])) * -1436341053;
				magnetConfig_1449_.anInt675 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[5] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[9] * vertices_z[magnetConfig.anInt674 * -180596249])) * 449866009;
				magnetConfig_1449_.anInt676 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[6] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[10] * vertices_z[magnetConfig.anInt674 * -180596249])) * 1336328763;
			}
		}
	}

	@Override
	public ModelPart method4755(byte i, int i_1450_, boolean bool) {
		boolean bool_1451_ = false;
		ModelPart_Sub2 class387_sub2_1452_;
		ModelPart_Sub2 class387_sub2_1453_;
		if (i > 0 && i <= 7) {
			class387_sub2_1453_ = aClass_ra_Sub2_7824.aClass387_Sub2Array8084[i - 1];
			class387_sub2_1452_ = aClass_ra_Sub2_7824.aClass387_Sub2Array8189[i - 1];
			bool_1451_ = true;
		} else {
			class387_sub2_1452_ = class387_sub2_1453_ = new ModelPart_Sub2(aClass_ra_Sub2_7824);
		}
		return method4819(class387_sub2_1452_, class387_sub2_1453_, i_1450_, bool_1451_, bool);
	}

	@Override
	void cv(int i, int i_1454_, int i_1455_, int i_1456_) {
		if (i == 0) {
			int i_1457_ = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_1458_ = 0; i_1458_ < anInt7833; i_1458_++) {
				origin_x += vertices_x[i_1458_];
				origin_y += vertices_y[i_1458_];
				origin_z += vertices_z[i_1458_];
				i_1457_++;
			}
			if (i_1457_ > 0) {
				origin_x = origin_x / i_1457_ + i_1454_;
				origin_y = origin_y / i_1457_ + i_1455_;
				origin_z = origin_z / i_1457_ + i_1456_;
			} else {
				origin_x = i_1454_;
				origin_y = i_1455_;
				origin_z = i_1456_;
			}
		} else if (i == 1) {
			for (int i_1459_ = 0; i_1459_ < anInt7833; i_1459_++) {
				vertices_x[i_1459_] += i_1454_;
				vertices_y[i_1459_] += i_1455_;
				vertices_z[i_1459_] += i_1456_;
			}
		} else if (i == 2) {
			for (int i_1460_ = 0; i_1460_ < anInt7833; i_1460_++) {
				vertices_x[i_1460_] -= origin_x;
				vertices_y[i_1460_] -= origin_y;
				vertices_z[i_1460_] -= origin_z;
				if (i_1456_ != 0) {
					int i_1461_ = Class220.SINE[i_1456_];
					int i_1462_ = Class220.COSINE[i_1456_];
					int i_1463_ = vertices_y[i_1460_] * i_1461_ + vertices_x[i_1460_] * i_1462_ + 16383 >> 14;
					vertices_y[i_1460_] = vertices_y[i_1460_] * i_1462_ - vertices_x[i_1460_] * i_1461_ + 16383 >> 14;
					vertices_x[i_1460_] = i_1463_;
				}
				if (i_1454_ != 0) {
					int i_1464_ = Class220.SINE[i_1454_];
					int i_1465_ = Class220.COSINE[i_1454_];
					int i_1466_ = vertices_y[i_1460_] * i_1465_ - vertices_z[i_1460_] * i_1464_ + 16383 >> 14;
					vertices_z[i_1460_] = vertices_y[i_1460_] * i_1464_ + vertices_z[i_1460_] * i_1465_ + 16383 >> 14;
					vertices_y[i_1460_] = i_1466_;
				}
				if (i_1455_ != 0) {
					int i_1467_ = Class220.SINE[i_1455_];
					int i_1468_ = Class220.COSINE[i_1455_];
					int i_1469_ = vertices_z[i_1460_] * i_1467_ + vertices_x[i_1460_] * i_1468_ + 16383 >> 14;
					vertices_z[i_1460_] = vertices_z[i_1460_] * i_1468_ - vertices_x[i_1460_] * i_1467_ + 16383 >> 14;
					vertices_x[i_1460_] = i_1469_;
				}
				vertices_x[i_1460_] += origin_x;
				vertices_y[i_1460_] += origin_y;
				vertices_z[i_1460_] += origin_z;
			}
		} else if (i == 3) {
			for (int i_1470_ = 0; i_1470_ < anInt7833; i_1470_++) {
				vertices_x[i_1470_] -= origin_x;
				vertices_y[i_1470_] -= origin_y;
				vertices_z[i_1470_] -= origin_z;
				vertices_x[i_1470_] = vertices_x[i_1470_] * i_1454_ / 128;
				vertices_y[i_1470_] = vertices_y[i_1470_] * i_1455_ / 128;
				vertices_z[i_1470_] = vertices_z[i_1470_] * i_1456_ / 128;
				vertices_x[i_1470_] += origin_x;
				vertices_y[i_1470_] += origin_y;
				vertices_z[i_1470_] += origin_z;
			}
		} else if (i == 5) {
			for (int i_1471_ = 0; i_1471_ < anInt7847; i_1471_++) {
				int i_1472_ = (aByteArray7850[i_1471_] & 0xff) + i_1454_ * 8;
				if (i_1472_ < 0) {
					i_1472_ = 0;
				} else if (i_1472_ > 255) {
					i_1472_ = 255;
				}
				aByteArray7850[i_1471_] = (byte) i_1472_;
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
			if (aClass54Array7880 != null) {
				for (int i_1473_ = 0; i_1473_ < anInt7877; i_1473_++) {
					Class54 class54 = aClass54Array7880[i_1473_];
					Class36 class36 = aClass36Array7875[i_1473_];
					class36.anInt424 = class36.anInt424 & 0xffffff | 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
				}
			}
		} else if (i == 7) {
			for (int i_1474_ = 0; i_1474_ < anInt7847; i_1474_++) {
				int i_1475_ = aShortArray7849[i_1474_] & 0xffff;
				int i_1476_ = i_1475_ >> 10 & 0x3f;
				int i_1477_ = i_1475_ >> 7 & 0x7;
				int i_1478_ = i_1475_ & 0x7f;
				i_1476_ = i_1476_ + i_1454_ & 0x3f;
				i_1477_ += i_1455_ / 4;
				if (i_1477_ < 0) {
					i_1477_ = 0;
				} else if (i_1477_ > 7) {
					i_1477_ = 7;
				}
				i_1478_ += i_1456_;
				if (i_1478_ < 0) {
					i_1478_ = 0;
				} else if (i_1478_ > 127) {
					i_1478_ = 127;
				}
				aShortArray7849[i_1474_] = (short) (i_1476_ << 10 | i_1477_ << 7 | i_1478_);
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
			if (aClass54Array7880 != null) {
				for (int i_1479_ = 0; i_1479_ < anInt7877; i_1479_++) {
					Class54 class54 = aClass54Array7880[i_1479_];
					Class36 class36 = aClass36Array7875[i_1479_];
					class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
				}
			}
		} else if (i == 8) {
			for (int i_1480_ = 0; i_1480_ < anInt7877; i_1480_++) {
				Class36 class36 = aClass36Array7875[i_1480_];
				class36.anInt422 += i_1454_;
				class36.anInt419 += i_1455_;
			}
		} else if (i == 10) {
			for (int i_1481_ = 0; i_1481_ < anInt7877; i_1481_++) {
				Class36 class36 = aClass36Array7875[i_1481_];
				class36.anInt420 = class36.anInt420 * i_1454_ >> 7;
				class36.anInt421 = class36.anInt421 * i_1455_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1482_ = 0; i_1482_ < anInt7877; i_1482_++) {
				Class36 class36 = aClass36Array7875[i_1482_];
				class36.anInt423 = class36.anInt423 + i_1454_ & 0x3fff;
			}
		}
	}

	@Override
	public void method4776(Matrix43f class222, int i, boolean bool) {
		if (aShortArray7838 != null) {
			Matrix43f class222_1483_ = class222;
			if (bool) {
				class222_1483_ = aClass_ra_Sub2_7824.aClass222_8103;
				class222_1483_.method2074(class222);
			}
			float[] fs = new float[3];
			for (int i_1484_ = 0; i_1484_ < anInt7833; i_1484_++) {
				if ((i & aShortArray7838[i_1484_]) != 0) {
					class222_1483_.method2077(vertices_x[i_1484_], vertices_y[i_1484_], vertices_z[i_1484_], fs);
					vertices_x[i_1484_] = (int) fs[0];
					vertices_y[i_1484_] = (int) fs[1];
					vertices_z[i_1484_] = (int) fs[2];
				}
			}
		}
	}

	static short[] method4829(short[] is, int i) {
		short[] is_1485_ = new short[i];
		System.arraycopy(is, 0, is_1485_, 0, i);
		return is_1485_;
	}

	@Override
	public void method4759(Matrix43f class222, Class302_Sub1 class302_sub1, int i) {
		if ((i & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (anInt7839 != 0) {
			Class233 class233 = aClass_ra_Sub2_7824.aClass233_8041;
			Class233 class233_1486_ = aClass_ra_Sub2_7824.aClass233_8104;
			Class233 class233_1487_ = aClass_ra_Sub2_7824.aClass233_8184;
			class233_1486_.method2145(class222);
			class233_1487_.method2142(class233_1486_);
			class233_1487_.method2144(aClass_ra_Sub2_7824.aClass233_8069);
			if (!aBoolean7843) {
				method4831();
			}
			float[] fs = aClass_ra_Sub2_7824.aFloatArray8094;
			class233_1486_.method2149(0.0F, aShort7868, 0.0F, fs);
			float f = fs[0];
			float f_1488_ = fs[1];
			float f_1489_ = fs[2];
			class233_1486_.method2149(0.0F, aShort7874, 0.0F, fs);
			float f_1490_ = fs[0];
			float f_1491_ = fs[1];
			float f_1492_ = fs[2];
			for (int i_1493_ = 0; i_1493_ < 6; i_1493_++) {
				float[] fs_1494_ = aClass_ra_Sub2_7824.aFloatArrayArray8077[i_1493_];
				float f_1495_ = fs_1494_[0] * f + fs_1494_[1] * f_1488_ + fs_1494_[2] * f_1489_ + fs_1494_[3] + anInt7891;
				float f_1496_ = fs_1494_[0] * f_1490_ + fs_1494_[1] * f_1491_ + fs_1494_[2] * f_1492_ + fs_1494_[3] + anInt7891;
				if (f_1495_ < 0.0F && f_1496_ < 0.0F) {
					return;
				}
			}
			if (class302_sub1 != null) {
				boolean bool = false;
				boolean bool_1497_ = true;
				int i_1498_ = aShort7870 + aShort7871 >> 1;
				int i_1499_ = aShort7872 + aShort7876 >> 1;
				int i_1500_ = i_1498_;
				short i_1501_ = aShort7868;
				int i_1502_ = i_1499_;
				float f_1503_ = class233_1487_.aFloatArray2594[0] * i_1500_ + class233_1487_.aFloatArray2594[4] * i_1501_ + class233_1487_.aFloatArray2594[8] * i_1502_ + class233_1487_.aFloatArray2594[12];
				float f_1504_ = class233_1487_.aFloatArray2594[1] * i_1500_ + class233_1487_.aFloatArray2594[5] * i_1501_ + class233_1487_.aFloatArray2594[9] * i_1502_ + class233_1487_.aFloatArray2594[13];
				float f_1505_ = class233_1487_.aFloatArray2594[2] * i_1500_ + class233_1487_.aFloatArray2594[6] * i_1501_ + class233_1487_.aFloatArray2594[10] * i_1502_ + class233_1487_.aFloatArray2594[14];
				float f_1506_ = class233_1487_.aFloatArray2594[3] * i_1500_ + class233_1487_.aFloatArray2594[7] * i_1501_ + class233_1487_.aFloatArray2594[11] * i_1502_ + class233_1487_.aFloatArray2594[15];
				if (f_1505_ >= -f_1506_) {
					class302_sub1.anInt7641 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_1503_ / f_1506_);
					class302_sub1.anInt7642 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_1504_ / f_1506_);
				} else {
					bool = true;
				}
				i_1500_ = i_1498_;
				i_1501_ = aShort7874;
				i_1502_ = i_1499_;
				float f_1507_ = class233_1487_.aFloatArray2594[0] * i_1500_ + class233_1487_.aFloatArray2594[4] * i_1501_ + class233_1487_.aFloatArray2594[8] * i_1502_ + class233_1487_.aFloatArray2594[12];
				float f_1508_ = class233_1487_.aFloatArray2594[1] * i_1500_ + class233_1487_.aFloatArray2594[5] * i_1501_ + class233_1487_.aFloatArray2594[9] * i_1502_ + class233_1487_.aFloatArray2594[13];
				float f_1509_ = class233_1487_.aFloatArray2594[2] * i_1500_ + class233_1487_.aFloatArray2594[6] * i_1501_ + class233_1487_.aFloatArray2594[10] * i_1502_ + class233_1487_.aFloatArray2594[14];
				float f_1510_ = class233_1487_.aFloatArray2594[3] * i_1500_ + class233_1487_.aFloatArray2594[7] * i_1501_ + class233_1487_.aFloatArray2594[11] * i_1502_ + class233_1487_.aFloatArray2594[15];
				if (f_1509_ >= -f_1510_) {
					class302_sub1.anInt7643 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_1507_ / f_1510_);
					class302_sub1.anInt7640 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_1508_ / f_1510_);
				} else {
					bool = true;
				}
				if (bool) {
					if (f_1505_ < -f_1506_ && f_1509_ < -f_1510_) {
						bool_1497_ = false;
					} else if (f_1505_ < -f_1506_) {
						float f_1511_ = (f_1505_ + f_1506_) / (f_1509_ + f_1510_) - 1.0F;
						float f_1512_ = f_1503_ + f_1511_ * (f_1507_ - f_1503_);
						float f_1513_ = f_1504_ + f_1511_ * (f_1508_ - f_1504_);
						float f_1514_ = f_1506_ + f_1511_ * (f_1510_ - f_1506_);
						class302_sub1.anInt7641 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_1512_ / f_1514_);
						class302_sub1.anInt7642 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_1513_ / f_1514_);
					} else if (f_1509_ < -f_1510_) {
						float f_1515_ = (f_1509_ + f_1510_) / (f_1505_ + f_1506_) - 1.0F;
						float f_1516_ = f_1507_ + f_1515_ * (f_1503_ - f_1507_);
						float f_1517_ = f_1508_ + f_1515_ * (f_1504_ - f_1508_);
						float f_1518_ = f_1510_ + f_1515_ * (f_1506_ - f_1510_);
						class302_sub1.anInt7643 = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_1516_ / f_1518_);
						class302_sub1.anInt7640 = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_1517_ / f_1518_);
					}
				}
				if (bool_1497_) {
					if (f_1505_ / f_1506_ > f_1509_ / f_1510_) {
						float f_1519_ = f_1503_ + class233.aFloatArray2594[0] * anInt7891 + class233.aFloatArray2594[12];
						float f_1520_ = f_1506_ + class233.aFloatArray2594[3] * anInt7891 + class233.aFloatArray2594[15];
						class302_sub1.anInt7645 = (int) (aClass_ra_Sub2_7824.aFloat8095 - class302_sub1.anInt7641 + aClass_ra_Sub2_7824.aFloat8096 * f_1519_ / f_1520_);
					} else {
						float f_1521_ = f_1507_ + class233.aFloatArray2594[0] * anInt7891 + class233.aFloatArray2594[12];
						float f_1522_ = f_1510_ + class233.aFloatArray2594[3] * anInt7891 + class233.aFloatArray2594[15];
						class302_sub1.anInt7645 = (int) (aClass_ra_Sub2_7824.aFloat8095 - class302_sub1.anInt7643 + aClass_ra_Sub2_7824.aFloat8096 * f_1521_ / f_1522_);
					}
					class302_sub1.aBoolean7644 = true;
				}
			}
			aClass_ra_Sub2_7824.method5252();
			aClass_ra_Sub2_7824.method5283(class233_1486_);
			method4823();
			aClass_ra_Sub2_7824.method5287();
			class233_1486_.method2144(aClass_ra_Sub2_7824.aClass233_8110);
			method4824(class233_1486_);
			if ((i & 0x2) != 0) {
				OpenGL.glPolygonMode(1028, 6914);
			}
		}
	}

	@Override
	public boolean method4763(int i, int i_1523_, Matrix43f class222, boolean bool, int i_1524_) {
		Class233 class233 = aClass_ra_Sub2_7824.aClass233_8104;
		class233.method2145(class222);
		class233.method2144(aClass_ra_Sub2_7824.aClass233_8069);
		boolean bool_1525_ = false;
		int i_1526_ = 2147483647;
		int i_1527_ = -2147483648;
		int i_1528_ = 2147483647;
		int i_1529_ = -2147483648;
		if (!aBoolean7843) {
			method4831();
		}
		int i_1530_ = aShort7871 - aShort7870 >> 1;
		int i_1531_ = aShort7874 - aShort7868 >> 1;
		int i_1532_ = aShort7876 - aShort7872 >> 1;
		int i_1533_ = aShort7870 + i_1530_;
		int i_1534_ = aShort7868 + i_1531_;
		int i_1535_ = aShort7872 + i_1532_;
		int i_1536_ = i_1533_ - (i_1530_ << i_1524_);
		int i_1537_ = i_1534_ - (i_1531_ << i_1524_);
		int i_1538_ = i_1535_ - (i_1532_ << i_1524_);
		int i_1539_ = i_1533_ + (i_1530_ << i_1524_);
		int i_1540_ = i_1534_ + (i_1531_ << i_1524_);
		int i_1541_ = i_1535_ + (i_1532_ << i_1524_);
		anIntArray7867[0] = i_1536_;
		anIntArray7886[0] = i_1537_;
		anIntArray7848[0] = i_1538_;
		anIntArray7867[1] = i_1539_;
		anIntArray7886[1] = i_1537_;
		anIntArray7848[1] = i_1538_;
		anIntArray7867[2] = i_1536_;
		anIntArray7886[2] = i_1540_;
		anIntArray7848[2] = i_1538_;
		anIntArray7867[3] = i_1539_;
		anIntArray7886[3] = i_1540_;
		anIntArray7848[3] = i_1538_;
		anIntArray7867[4] = i_1536_;
		anIntArray7886[4] = i_1537_;
		anIntArray7848[4] = i_1541_;
		anIntArray7867[5] = i_1539_;
		anIntArray7886[5] = i_1537_;
		anIntArray7848[5] = i_1541_;
		anIntArray7867[6] = i_1536_;
		anIntArray7886[6] = i_1540_;
		anIntArray7848[6] = i_1541_;
		anIntArray7867[7] = i_1539_;
		anIntArray7886[7] = i_1540_;
		anIntArray7848[7] = i_1541_;
		for (int i_1542_ = 0; i_1542_ < 8; i_1542_++) {
			int i_1543_ = anIntArray7867[i_1542_];
			int i_1544_ = anIntArray7886[i_1542_];
			int i_1545_ = anIntArray7848[i_1542_];
			float f = class233.aFloatArray2594[2] * i_1543_ + class233.aFloatArray2594[6] * i_1544_ + class233.aFloatArray2594[10] * i_1545_ + class233.aFloatArray2594[14];
			float f_1546_ = class233.aFloatArray2594[3] * i_1543_ + class233.aFloatArray2594[7] * i_1544_ + class233.aFloatArray2594[11] * i_1545_ + class233.aFloatArray2594[15];
			if (f >= -f_1546_) {
				float f_1547_ = class233.aFloatArray2594[0] * i_1543_ + class233.aFloatArray2594[4] * i_1544_ + class233.aFloatArray2594[8] * i_1545_ + class233.aFloatArray2594[12];
				float f_1548_ = class233.aFloatArray2594[1] * i_1543_ + class233.aFloatArray2594[5] * i_1544_ + class233.aFloatArray2594[9] * i_1545_ + class233.aFloatArray2594[13];
				int i_1549_ = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_1547_ / f_1546_);
				int i_1550_ = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_1548_ / f_1546_);
				if (i_1549_ < i_1526_) {
					i_1526_ = i_1549_;
				}
				if (i_1549_ > i_1527_) {
					i_1527_ = i_1549_;
				}
				if (i_1550_ < i_1528_) {
					i_1528_ = i_1550_;
				}
				if (i_1550_ > i_1529_) {
					i_1529_ = i_1550_;
				}
				bool_1525_ = true;
			}
		}
		if (bool_1525_ && i > i_1526_ && i < i_1527_ && i_1523_ > i_1528_ && i_1523_ < i_1529_) {
			if (bool) {
				return true;
			}
			if (aClass_ra_Sub2_7824.anIntArray8198.length < anInt7839) {
				aClass_ra_Sub2_7824.anIntArray8198 = new int[anInt7839];
				aClass_ra_Sub2_7824.anIntArray8199 = new int[anInt7839];
			}
			int[] is = aClass_ra_Sub2_7824.anIntArray8198;
			int[] is_1551_ = aClass_ra_Sub2_7824.anIntArray8199;
			for (int i_1552_ = 0; i_1552_ < anInt7833; i_1552_++) {
				int i_1553_ = vertices_x[i_1552_];
				int i_1554_ = vertices_y[i_1552_];
				int i_1555_ = vertices_z[i_1552_];
				float f = class233.aFloatArray2594[2] * i_1553_ + class233.aFloatArray2594[6] * i_1554_ + class233.aFloatArray2594[10] * i_1555_ + class233.aFloatArray2594[14];
				float f_1556_ = class233.aFloatArray2594[3] * i_1553_ + class233.aFloatArray2594[7] * i_1554_ + class233.aFloatArray2594[11] * i_1555_ + class233.aFloatArray2594[15];
				if (f >= -f_1556_) {
					float f_1557_ = class233.aFloatArray2594[0] * i_1553_ + class233.aFloatArray2594[4] * i_1554_ + class233.aFloatArray2594[8] * i_1555_ + class233.aFloatArray2594[12];
					float f_1558_ = class233.aFloatArray2594[1] * i_1553_ + class233.aFloatArray2594[5] * i_1554_ + class233.aFloatArray2594[9] * i_1555_ + class233.aFloatArray2594[13];
					int i_1559_ = anIntArray7854[i_1552_];
					int i_1560_ = anIntArray7854[i_1552_ + 1];
					for (int i_1561_ = i_1559_; i_1561_ < i_1560_; i_1561_++) {
						int i_1562_ = aShortArray7830[i_1561_] - 1;
						if (i_1562_ == -1) {
							break;
						}
						is[i_1562_] = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_1557_ / f_1556_);
						is_1551_[i_1562_] = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_1558_ / f_1556_);
					}
				} else {
					int i_1563_ = anIntArray7854[i_1552_];
					int i_1564_ = anIntArray7854[i_1552_ + 1];
					for (int i_1565_ = i_1563_; i_1565_ < i_1564_; i_1565_++) {
						int i_1566_ = aShortArray7830[i_1565_] - 1;
						if (i_1566_ == -1) {
							break;
						}
						is[aShortArray7830[i_1565_] - 1] = -999999;
					}
				}
			}
			for (int i_1567_ = 0; i_1567_ < anInt7847; i_1567_++) {
				if (is[aShortArray7851[i_1567_]] != -999999 && is[aShortArray7852[i_1567_]] != -999999 && is[aShortArray7853[i_1567_]] != -999999 && method4821(i, i_1523_, is_1551_[aShortArray7851[i_1567_]], is_1551_[aShortArray7852[i_1567_]], is_1551_[aShortArray7853[i_1567_]], is[aShortArray7851[i_1567_]], is[aShortArray7852[i_1567_]], is[aShortArray7853[i_1567_]])) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean method4746(int i, int i_1568_, Matrix43f class222, boolean bool, int i_1569_) {
		Class233 class233 = aClass_ra_Sub2_7824.aClass233_8104;
		class233.method2145(class222);
		class233.method2144(aClass_ra_Sub2_7824.aClass233_8069);
		boolean bool_1570_ = false;
		int i_1571_ = 2147483647;
		int i_1572_ = -2147483648;
		int i_1573_ = 2147483647;
		int i_1574_ = -2147483648;
		if (!aBoolean7843) {
			method4831();
		}
		int i_1575_ = aShort7871 - aShort7870 >> 1;
		int i_1576_ = aShort7874 - aShort7868 >> 1;
		int i_1577_ = aShort7876 - aShort7872 >> 1;
		int i_1578_ = aShort7870 + i_1575_;
		int i_1579_ = aShort7868 + i_1576_;
		int i_1580_ = aShort7872 + i_1577_;
		int i_1581_ = i_1578_ - (i_1575_ << i_1569_);
		int i_1582_ = i_1579_ - (i_1576_ << i_1569_);
		int i_1583_ = i_1580_ - (i_1577_ << i_1569_);
		int i_1584_ = i_1578_ + (i_1575_ << i_1569_);
		int i_1585_ = i_1579_ + (i_1576_ << i_1569_);
		int i_1586_ = i_1580_ + (i_1577_ << i_1569_);
		anIntArray7867[0] = i_1581_;
		anIntArray7886[0] = i_1582_;
		anIntArray7848[0] = i_1583_;
		anIntArray7867[1] = i_1584_;
		anIntArray7886[1] = i_1582_;
		anIntArray7848[1] = i_1583_;
		anIntArray7867[2] = i_1581_;
		anIntArray7886[2] = i_1585_;
		anIntArray7848[2] = i_1583_;
		anIntArray7867[3] = i_1584_;
		anIntArray7886[3] = i_1585_;
		anIntArray7848[3] = i_1583_;
		anIntArray7867[4] = i_1581_;
		anIntArray7886[4] = i_1582_;
		anIntArray7848[4] = i_1586_;
		anIntArray7867[5] = i_1584_;
		anIntArray7886[5] = i_1582_;
		anIntArray7848[5] = i_1586_;
		anIntArray7867[6] = i_1581_;
		anIntArray7886[6] = i_1585_;
		anIntArray7848[6] = i_1586_;
		anIntArray7867[7] = i_1584_;
		anIntArray7886[7] = i_1585_;
		anIntArray7848[7] = i_1586_;
		for (int i_1587_ = 0; i_1587_ < 8; i_1587_++) {
			int i_1588_ = anIntArray7867[i_1587_];
			int i_1589_ = anIntArray7886[i_1587_];
			int i_1590_ = anIntArray7848[i_1587_];
			float f = class233.aFloatArray2594[2] * i_1588_ + class233.aFloatArray2594[6] * i_1589_ + class233.aFloatArray2594[10] * i_1590_ + class233.aFloatArray2594[14];
			float f_1591_ = class233.aFloatArray2594[3] * i_1588_ + class233.aFloatArray2594[7] * i_1589_ + class233.aFloatArray2594[11] * i_1590_ + class233.aFloatArray2594[15];
			if (f >= -f_1591_) {
				float f_1592_ = class233.aFloatArray2594[0] * i_1588_ + class233.aFloatArray2594[4] * i_1589_ + class233.aFloatArray2594[8] * i_1590_ + class233.aFloatArray2594[12];
				float f_1593_ = class233.aFloatArray2594[1] * i_1588_ + class233.aFloatArray2594[5] * i_1589_ + class233.aFloatArray2594[9] * i_1590_ + class233.aFloatArray2594[13];
				int i_1594_ = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_1592_ / f_1591_);
				int i_1595_ = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_1593_ / f_1591_);
				if (i_1594_ < i_1571_) {
					i_1571_ = i_1594_;
				}
				if (i_1594_ > i_1572_) {
					i_1572_ = i_1594_;
				}
				if (i_1595_ < i_1573_) {
					i_1573_ = i_1595_;
				}
				if (i_1595_ > i_1574_) {
					i_1574_ = i_1595_;
				}
				bool_1570_ = true;
			}
		}
		if (bool_1570_ && i > i_1571_ && i < i_1572_ && i_1568_ > i_1573_ && i_1568_ < i_1574_) {
			if (bool) {
				return true;
			}
			if (aClass_ra_Sub2_7824.anIntArray8198.length < anInt7839) {
				aClass_ra_Sub2_7824.anIntArray8198 = new int[anInt7839];
				aClass_ra_Sub2_7824.anIntArray8199 = new int[anInt7839];
			}
			int[] is = aClass_ra_Sub2_7824.anIntArray8198;
			int[] is_1596_ = aClass_ra_Sub2_7824.anIntArray8199;
			for (int i_1597_ = 0; i_1597_ < anInt7833; i_1597_++) {
				int i_1598_ = vertices_x[i_1597_];
				int i_1599_ = vertices_y[i_1597_];
				int i_1600_ = vertices_z[i_1597_];
				float f = class233.aFloatArray2594[2] * i_1598_ + class233.aFloatArray2594[6] * i_1599_ + class233.aFloatArray2594[10] * i_1600_ + class233.aFloatArray2594[14];
				float f_1601_ = class233.aFloatArray2594[3] * i_1598_ + class233.aFloatArray2594[7] * i_1599_ + class233.aFloatArray2594[11] * i_1600_ + class233.aFloatArray2594[15];
				if (f >= -f_1601_) {
					float f_1602_ = class233.aFloatArray2594[0] * i_1598_ + class233.aFloatArray2594[4] * i_1599_ + class233.aFloatArray2594[8] * i_1600_ + class233.aFloatArray2594[12];
					float f_1603_ = class233.aFloatArray2594[1] * i_1598_ + class233.aFloatArray2594[5] * i_1599_ + class233.aFloatArray2594[9] * i_1600_ + class233.aFloatArray2594[13];
					int i_1604_ = anIntArray7854[i_1597_];
					int i_1605_ = anIntArray7854[i_1597_ + 1];
					for (int i_1606_ = i_1604_; i_1606_ < i_1605_; i_1606_++) {
						int i_1607_ = aShortArray7830[i_1606_] - 1;
						if (i_1607_ == -1) {
							break;
						}
						is[i_1607_] = (int) (aClass_ra_Sub2_7824.aFloat8095 + aClass_ra_Sub2_7824.aFloat8096 * f_1602_ / f_1601_);
						is_1596_[i_1607_] = (int) (aClass_ra_Sub2_7824.aFloat8097 + aClass_ra_Sub2_7824.aFloat8098 * f_1603_ / f_1601_);
					}
				} else {
					int i_1608_ = anIntArray7854[i_1597_];
					int i_1609_ = anIntArray7854[i_1597_ + 1];
					for (int i_1610_ = i_1608_; i_1610_ < i_1609_; i_1610_++) {
						int i_1611_ = aShortArray7830[i_1610_] - 1;
						if (i_1611_ == -1) {
							break;
						}
						is[aShortArray7830[i_1610_] - 1] = -999999;
					}
				}
			}
			for (int i_1612_ = 0; i_1612_ < anInt7847; i_1612_++) {
				if (is[aShortArray7851[i_1612_]] != -999999 && is[aShortArray7852[i_1612_]] != -999999 && is[aShortArray7853[i_1612_]] != -999999 && method4821(i, i_1568_, is_1596_[aShortArray7851[i_1612_]], is_1596_[aShortArray7852[i_1612_]], is_1596_[aShortArray7853[i_1612_]], is[aShortArray7851[i_1612_]], is[aShortArray7852[i_1612_]], is[aShortArray7853[i_1612_]])) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void method4752() {
		if (anInt7839 > 0 && anInt7885 > 0) {
			method4825(false);
			if ((aByte7827 & 0x10) == 0 && aClass41_7879.anInterface2_441 == null) {
				method4830(false);
			}
			method4820();
		}
	}

	ModelPart_Sub2(Class_ra_Sub2 class_ra_sub2) {
		anInt7832 = 0;
		anInt7833 = 0;
		anInt7839 = 0;
		anInt7847 = 0;
		anInt7885 = 0;
		aBoolean7864 = true;
		aBoolean7843 = false;
		aClass_ra_Sub2_7824 = class_ra_sub2;
		aClass32_7831 = new Class32(null, 5126, 3, 0);
		aClass32_7860 = new Class32(null, 5126, 2, 0);
		aClass32_7889 = new Class32(null, 5126, 3, 0);
		aClass32_7858 = new Class32(null, 5121, 4, 0);
		aClass41_7879 = new Class41();
	}

	@Override
	public void W(short i, short i_1613_) {
		Interface_ma interface_ma = aClass_ra_Sub2_7824.anInterface_ma5299;
		for (int i_1614_ = 0; i_1614_ < anInt7847; i_1614_++) {
			if (aShortArray7861[i_1614_] == i) {
				aShortArray7861[i_1614_] = i_1613_;
			}
		}
		byte i_1615_ = 0;
		byte i_1616_ = 0;
		if (i != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i & 0xffff, 1939464338);
			i_1615_ = materialRaw.aByte533;
			i_1616_ = materialRaw.aByte534;
		}
		byte i_1617_ = 0;
		byte i_1618_ = 0;
		if (i_1613_ != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i_1613_ & 0xffff, 1644683236);
			i_1617_ = materialRaw.aByte533;
			i_1618_ = materialRaw.aByte534;
			if (materialRaw.aByte535 != 0 || materialRaw.aByte509 != 0) {
				aBoolean7862 = true;
			}
		}
		if (i_1615_ != i_1617_ | i_1616_ != i_1618_) {
			if (aClass54Array7880 != null) {
				for (int i_1619_ = 0; i_1619_ < anInt7877; i_1619_++) {
					Class54 class54 = aClass54Array7880[i_1619_];
					Class36 class36 = aClass36Array7875[i_1619_];
					class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
				}
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
		}
	}

	@Override
	public int ci() {
		if (!aBoolean7843) {
			method4831();
		}
		return anInt7865;
	}

	@Override
	public int ce() {
		if (!aBoolean7843) {
			method4831();
		}
		return anInt7865;
	}

	@Override
	public int cb() {
		if (!aBoolean7843) {
			method4831();
		}
		return anInt7865;
	}

	@Override
	public int cr() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7870;
	}

	@Override
	public int n() {
		if (!aBoolean7843) {
			method4831();
		}
		return anInt7865;
	}

	@Override
	public int cp() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7871;
	}

	@Override
	public int cq() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7871;
	}

	@Override
	public int cf() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7871;
	}

	@Override
	public int dh() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7868;
	}

	@Override
	public int dg() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7872;
	}

	@Override
	public int dl() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7872;
	}

	@Override
	public void di(short i, short i_1620_) {
		Interface_ma interface_ma = aClass_ra_Sub2_7824.anInterface_ma5299;
		for (int i_1621_ = 0; i_1621_ < anInt7847; i_1621_++) {
			if (aShortArray7861[i_1621_] == i) {
				aShortArray7861[i_1621_] = i_1620_;
			}
		}
		byte i_1622_ = 0;
		byte i_1623_ = 0;
		if (i != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i & 0xffff, 662782540);
			i_1622_ = materialRaw.aByte533;
			i_1623_ = materialRaw.aByte534;
		}
		byte i_1624_ = 0;
		byte i_1625_ = 0;
		if (i_1620_ != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i_1620_ & 0xffff, 1169544377);
			i_1624_ = materialRaw.aByte533;
			i_1625_ = materialRaw.aByte534;
			if (materialRaw.aByte535 != 0 || materialRaw.aByte509 != 0) {
				aBoolean7862 = true;
			}
		}
		if (i_1622_ != i_1624_ | i_1623_ != i_1625_) {
			if (aClass54Array7880 != null) {
				for (int i_1626_ = 0; i_1626_ < anInt7877; i_1626_++) {
					Class54 class54 = aClass54Array7880[i_1626_];
					Class36 class36 = aClass36Array7875[i_1626_];
					class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
				}
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
		}
	}

	@Override
	public int ds() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7876;
	}

	@Override
	public void dz(short i, short i_1627_) {
		Interface_ma interface_ma = aClass_ra_Sub2_7824.anInterface_ma5299;
		for (int i_1628_ = 0; i_1628_ < anInt7847; i_1628_++) {
			if (aShortArray7861[i_1628_] == i) {
				aShortArray7861[i_1628_] = i_1627_;
			}
		}
		byte i_1629_ = 0;
		byte i_1630_ = 0;
		if (i != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i & 0xffff, 1911162584);
			i_1629_ = materialRaw.aByte533;
			i_1630_ = materialRaw.aByte534;
		}
		byte i_1631_ = 0;
		byte i_1632_ = 0;
		if (i_1627_ != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i_1627_ & 0xffff, 1186986879);
			i_1631_ = materialRaw.aByte533;
			i_1632_ = materialRaw.aByte534;
			if (materialRaw.aByte535 != 0 || materialRaw.aByte509 != 0) {
				aBoolean7862 = true;
			}
		}
		if (i_1629_ != i_1631_ | i_1630_ != i_1632_) {
			if (aClass54Array7880 != null) {
				for (int i_1633_ = 0; i_1633_ < anInt7877; i_1633_++) {
					Class54 class54 = aClass54Array7880[i_1633_];
					Class36 class36 = aClass36Array7875[i_1633_];
					class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
				}
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
		}
	}

	@Override
	public void dd(int i) {
		aShort7828 = (short) i;
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public void dc(int i) {
		aShort7869 = (short) i;
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
		if (aClass32_7889 != null) {
			aClass32_7889.anInterface1_397 = null;
		}
	}

	@Override
	public int dk() {
		return aShort7828;
	}

	@Override
	void e(int i, int[] is, int i_1634_, int i_1635_, int i_1636_, boolean bool, int i_1637_, int[] is_1638_) {
		int i_1639_ = is.length;
		if (i == 0) {
			i_1634_ <<= 4;
			i_1635_ <<= 4;
			i_1636_ <<= 4;
			int i_1640_ = 0;
			origin_x = 0;
			origin_y = 0;
			origin_z = 0;
			for (int i_1641_ = 0; i_1641_ < i_1639_; i_1641_++) {
				int i_1642_ = is[i_1641_];
				if (i_1642_ < verticesByLabel.length) {
					int[] is_1643_ = verticesByLabel[i_1642_];
					for (int i_1645_ : is_1643_) {
						if (aShortArray7838 == null || (i_1637_ & aShortArray7838[i_1645_]) != 0) {
							origin_x += vertices_x[i_1645_];
							origin_y += vertices_y[i_1645_];
							origin_z += vertices_z[i_1645_];
							i_1640_++;
						}
					}
				}
			}
			if (i_1640_ > 0) {
				origin_x = origin_x / i_1640_ + i_1634_;
				origin_y = origin_y / i_1640_ + i_1635_;
				origin_z = origin_z / i_1640_ + i_1636_;
				aBoolean7817 = true;
			} else {
				origin_x = i_1634_;
				origin_y = i_1635_;
				origin_z = i_1636_;
			}
		} else if (i == 1) {
			if (is_1638_ != null) {
				int i_1646_ = is_1638_[0] * i_1634_ + is_1638_[1] * i_1635_ + is_1638_[2] * i_1636_ + 8192 >> 14;
				int i_1647_ = is_1638_[3] * i_1634_ + is_1638_[4] * i_1635_ + is_1638_[5] * i_1636_ + 8192 >> 14;
				int i_1648_ = is_1638_[6] * i_1634_ + is_1638_[7] * i_1635_ + is_1638_[8] * i_1636_ + 8192 >> 14;
				i_1634_ = i_1646_;
				i_1635_ = i_1647_;
				i_1636_ = i_1648_;
			}
			i_1634_ <<= 4;
			i_1635_ <<= 4;
			i_1636_ <<= 4;
			for (int i_1649_ = 0; i_1649_ < i_1639_; i_1649_++) {
				int i_1650_ = is[i_1649_];
				if (i_1650_ < verticesByLabel.length) {
					int[] is_1651_ = verticesByLabel[i_1650_];
					for (int element : is_1651_) {
						int i_1653_ = element;
						if (aShortArray7838 == null || (i_1637_ & aShortArray7838[i_1653_]) != 0) {
							vertices_x[i_1653_] += i_1634_;
							vertices_y[i_1653_] += i_1635_;
							vertices_z[i_1653_] += i_1636_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1638_ != null) {
				int i_1654_ = is_1638_[9] << 4;
				int i_1655_ = is_1638_[10] << 4;
				int i_1656_ = is_1638_[11] << 4;
				int i_1657_ = is_1638_[12] << 4;
				int i_1658_ = is_1638_[13] << 4;
				int i_1659_ = is_1638_[14] << 4;
				if (aBoolean7817) {
					int i_1660_ = is_1638_[0] * origin_x + is_1638_[3] * origin_y + is_1638_[6] * origin_z + 8192 >> 14;
					int i_1661_ = is_1638_[1] * origin_x + is_1638_[4] * origin_y + is_1638_[7] * origin_z + 8192 >> 14;
					int i_1662_ = is_1638_[2] * origin_x + is_1638_[5] * origin_y + is_1638_[8] * origin_z + 8192 >> 14;
					i_1660_ += i_1657_;
					i_1661_ += i_1658_;
					i_1662_ += i_1659_;
					origin_x = i_1660_;
					origin_y = i_1661_;
					origin_z = i_1662_;
					aBoolean7817 = false;
				}
				int[] is_1663_ = new int[9];
				int i_1664_ = Class220.COSINE[i_1634_];
				int i_1665_ = Class220.SINE[i_1634_];
				int i_1666_ = Class220.COSINE[i_1635_];
				int i_1667_ = Class220.SINE[i_1635_];
				int i_1668_ = Class220.COSINE[i_1636_];
				int i_1669_ = Class220.SINE[i_1636_];
				int i_1670_ = i_1665_ * i_1668_ + 8192 >> 14;
				int i_1671_ = i_1665_ * i_1669_ + 8192 >> 14;
				is_1663_[0] = i_1666_ * i_1668_ + i_1667_ * i_1671_ + 8192 >> 14;
				is_1663_[1] = -i_1666_ * i_1669_ + i_1667_ * i_1670_ + 8192 >> 14;
				is_1663_[2] = i_1667_ * i_1664_ + 8192 >> 14;
				is_1663_[3] = i_1664_ * i_1669_ + 8192 >> 14;
				is_1663_[4] = i_1664_ * i_1668_ + 8192 >> 14;
				is_1663_[5] = -i_1665_;
				is_1663_[6] = -i_1667_ * i_1668_ + i_1666_ * i_1671_ + 8192 >> 14;
				is_1663_[7] = i_1667_ * i_1669_ + i_1666_ * i_1670_ + 8192 >> 14;
				is_1663_[8] = i_1666_ * i_1664_ + 8192 >> 14;
				int i_1672_ = is_1663_[0] * -origin_x + is_1663_[1] * -origin_y + is_1663_[2] * -origin_z + 8192 >> 14;
				int i_1673_ = is_1663_[3] * -origin_x + is_1663_[4] * -origin_y + is_1663_[5] * -origin_z + 8192 >> 14;
				int i_1674_ = is_1663_[6] * -origin_x + is_1663_[7] * -origin_y + is_1663_[8] * -origin_z + 8192 >> 14;
				int i_1675_ = i_1672_ + origin_x;
				int i_1676_ = i_1673_ + origin_y;
				int i_1677_ = i_1674_ + origin_z;
				int[] is_1678_ = new int[9];
				for (int i_1679_ = 0; i_1679_ < 3; i_1679_++) {
					for (int i_1680_ = 0; i_1680_ < 3; i_1680_++) {
						int i_1681_ = 0;
						for (int i_1682_ = 0; i_1682_ < 3; i_1682_++) {
							i_1681_ += is_1663_[i_1679_ * 3 + i_1682_] * is_1638_[i_1680_ * 3 + i_1682_];
						}
						is_1678_[i_1679_ * 3 + i_1680_] = i_1681_ + 8192 >> 14;
					}
				}
				int i_1683_ = is_1663_[0] * i_1657_ + is_1663_[1] * i_1658_ + is_1663_[2] * i_1659_ + 8192 >> 14;
				int i_1684_ = is_1663_[3] * i_1657_ + is_1663_[4] * i_1658_ + is_1663_[5] * i_1659_ + 8192 >> 14;
				int i_1685_ = is_1663_[6] * i_1657_ + is_1663_[7] * i_1658_ + is_1663_[8] * i_1659_ + 8192 >> 14;
				i_1683_ += i_1675_;
				i_1684_ += i_1676_;
				i_1685_ += i_1677_;
				int[] is_1686_ = new int[9];
				for (int i_1687_ = 0; i_1687_ < 3; i_1687_++) {
					for (int i_1688_ = 0; i_1688_ < 3; i_1688_++) {
						int i_1689_ = 0;
						for (int i_1690_ = 0; i_1690_ < 3; i_1690_++) {
							i_1689_ += is_1638_[i_1687_ * 3 + i_1690_] * is_1678_[i_1688_ + i_1690_ * 3];
						}
						is_1686_[i_1687_ * 3 + i_1688_] = i_1689_ + 8192 >> 14;
					}
				}
				int i_1691_ = is_1638_[0] * i_1683_ + is_1638_[1] * i_1684_ + is_1638_[2] * i_1685_ + 8192 >> 14;
				int i_1692_ = is_1638_[3] * i_1683_ + is_1638_[4] * i_1684_ + is_1638_[5] * i_1685_ + 8192 >> 14;
				int i_1693_ = is_1638_[6] * i_1683_ + is_1638_[7] * i_1684_ + is_1638_[8] * i_1685_ + 8192 >> 14;
				i_1691_ += i_1654_;
				i_1692_ += i_1655_;
				i_1693_ += i_1656_;
				for (int i_1694_ = 0; i_1694_ < i_1639_; i_1694_++) {
					int i_1695_ = is[i_1694_];
					if (i_1695_ < verticesByLabel.length) {
						int[] is_1696_ = verticesByLabel[i_1695_];
						for (int element : is_1696_) {
							int i_1698_ = element;
							if (aShortArray7838 == null || (i_1637_ & aShortArray7838[i_1698_]) != 0) {
								int i_1699_ = is_1686_[0] * vertices_x[i_1698_] + is_1686_[1] * vertices_y[i_1698_] + is_1686_[2] * vertices_z[i_1698_] + 8192 >> 14;
								int i_1700_ = is_1686_[3] * vertices_x[i_1698_] + is_1686_[4] * vertices_y[i_1698_] + is_1686_[5] * vertices_z[i_1698_] + 8192 >> 14;
								int i_1701_ = is_1686_[6] * vertices_x[i_1698_] + is_1686_[7] * vertices_y[i_1698_] + is_1686_[8] * vertices_z[i_1698_] + 8192 >> 14;
								i_1699_ += i_1691_;
								i_1700_ += i_1692_;
								i_1701_ += i_1693_;
								vertices_x[i_1698_] = i_1699_;
								vertices_y[i_1698_] = i_1700_;
								vertices_z[i_1698_] = i_1701_;
							}
						}
					}
				}
			} else {
				for (int i_1702_ = 0; i_1702_ < i_1639_; i_1702_++) {
					int i_1703_ = is[i_1702_];
					if (i_1703_ < verticesByLabel.length) {
						int[] is_1704_ = verticesByLabel[i_1703_];
						for (int element : is_1704_) {
							int i_1706_ = element;
							if (aShortArray7838 == null || (i_1637_ & aShortArray7838[i_1706_]) != 0) {
								vertices_x[i_1706_] -= origin_x;
								vertices_y[i_1706_] -= origin_y;
								vertices_z[i_1706_] -= origin_z;
								if (i_1636_ != 0) {
									int i_1707_ = Class220.SINE[i_1636_];
									int i_1708_ = Class220.COSINE[i_1636_];
									int i_1709_ = vertices_y[i_1706_] * i_1707_ + vertices_x[i_1706_] * i_1708_ + 16383 >> 14;
									vertices_y[i_1706_] = vertices_y[i_1706_] * i_1708_ - vertices_x[i_1706_] * i_1707_ + 16383 >> 14;
									vertices_x[i_1706_] = i_1709_;
								}
								if (i_1634_ != 0) {
									int i_1710_ = Class220.SINE[i_1634_];
									int i_1711_ = Class220.COSINE[i_1634_];
									int i_1712_ = vertices_y[i_1706_] * i_1711_ - vertices_z[i_1706_] * i_1710_ + 16383 >> 14;
									vertices_z[i_1706_] = vertices_y[i_1706_] * i_1710_ + vertices_z[i_1706_] * i_1711_ + 16383 >> 14;
									vertices_y[i_1706_] = i_1712_;
								}
								if (i_1635_ != 0) {
									int i_1713_ = Class220.SINE[i_1635_];
									int i_1714_ = Class220.COSINE[i_1635_];
									int i_1715_ = vertices_z[i_1706_] * i_1713_ + vertices_x[i_1706_] * i_1714_ + 16383 >> 14;
									vertices_z[i_1706_] = vertices_z[i_1706_] * i_1714_ - vertices_x[i_1706_] * i_1713_ + 16383 >> 14;
									vertices_x[i_1706_] = i_1715_;
								}
								vertices_x[i_1706_] += origin_x;
								vertices_y[i_1706_] += origin_y;
								vertices_z[i_1706_] += origin_z;
							}
						}
					}
				}
				if (bool) {
					for (int i_1716_ = 0; i_1716_ < i_1639_; i_1716_++) {
						int i_1717_ = is[i_1716_];
						if (i_1717_ < verticesByLabel.length) {
							int[] is_1718_ = verticesByLabel[i_1717_];
							for (int i_1720_ : is_1718_) {
								if (aShortArray7838 == null || (i_1637_ & aShortArray7838[i_1720_]) != 0) {
									int i_1721_ = anIntArray7854[i_1720_];
									int i_1722_ = anIntArray7854[i_1720_ + 1];
									for (int i_1723_ = i_1721_; i_1723_ < i_1722_; i_1723_++) {
										int i_1724_ = aShortArray7830[i_1723_] - 1;
										if (i_1724_ == -1) {
											break;
										}
										if (i_1636_ != 0) {
											int i_1725_ = Class220.SINE[i_1636_];
											int i_1726_ = Class220.COSINE[i_1636_];
											int i_1727_ = aShortArray7841[i_1724_] * i_1725_ + aShortArray7829[i_1724_] * i_1726_ + 16383 >> 14;
											aShortArray7841[i_1724_] = (short) (aShortArray7841[i_1724_] * i_1726_ - aShortArray7829[i_1724_] * i_1725_ + 16383 >> 14);
											aShortArray7829[i_1724_] = (short) i_1727_;
										}
										if (i_1634_ != 0) {
											int i_1728_ = Class220.SINE[i_1634_];
											int i_1729_ = Class220.COSINE[i_1634_];
											int i_1730_ = aShortArray7841[i_1724_] * i_1729_ - aShortArray7842[i_1724_] * i_1728_ + 16383 >> 14;
											aShortArray7842[i_1724_] = (short) (aShortArray7841[i_1724_] * i_1728_ + aShortArray7842[i_1724_] * i_1729_ + 16383 >> 14);
											aShortArray7841[i_1724_] = (short) i_1730_;
										}
										if (i_1635_ != 0) {
											int i_1731_ = Class220.SINE[i_1635_];
											int i_1732_ = Class220.COSINE[i_1635_];
											int i_1733_ = aShortArray7842[i_1724_] * i_1731_ + aShortArray7829[i_1724_] * i_1732_ + 16383 >> 14;
											aShortArray7842[i_1724_] = (short) (aShortArray7842[i_1724_] * i_1732_ - aShortArray7829[i_1724_] * i_1731_ + 16383 >> 14);
											aShortArray7829[i_1724_] = (short) i_1733_;
										}
									}
								}
							}
						}
					}
					if (aClass32_7889 == null && aClass32_7858 != null) {
						aClass32_7858.anInterface1_397 = null;
					}
					if (aClass32_7889 != null) {
						aClass32_7889.anInterface1_397 = null;
					}
				}
			}
		} else if (i == 3) {
			if (is_1638_ != null) {
				int i_1734_ = is_1638_[9] << 4;
				int i_1735_ = is_1638_[10] << 4;
				int i_1736_ = is_1638_[11] << 4;
				int i_1737_ = is_1638_[12] << 4;
				int i_1738_ = is_1638_[13] << 4;
				int i_1739_ = is_1638_[14] << 4;
				if (aBoolean7817) {
					int i_1740_ = is_1638_[0] * origin_x + is_1638_[3] * origin_y + is_1638_[6] * origin_z + 8192 >> 14;
					int i_1741_ = is_1638_[1] * origin_x + is_1638_[4] * origin_y + is_1638_[7] * origin_z + 8192 >> 14;
					int i_1742_ = is_1638_[2] * origin_x + is_1638_[5] * origin_y + is_1638_[8] * origin_z + 8192 >> 14;
					i_1740_ += i_1737_;
					i_1741_ += i_1738_;
					i_1742_ += i_1739_;
					origin_x = i_1740_;
					origin_y = i_1741_;
					origin_z = i_1742_;
					aBoolean7817 = false;
				}
				int i_1743_ = i_1634_ << 15 >> 7;
				int i_1744_ = i_1635_ << 15 >> 7;
				int i_1745_ = i_1636_ << 15 >> 7;
				int i_1746_ = i_1743_ * -origin_x + 8192 >> 14;
				int i_1747_ = i_1744_ * -origin_y + 8192 >> 14;
				int i_1748_ = i_1745_ * -origin_z + 8192 >> 14;
				int i_1749_ = i_1746_ + origin_x;
				int i_1750_ = i_1747_ + origin_y;
				int i_1751_ = i_1748_ + origin_z;
				int[] is_1752_ = new int[9];
				is_1752_[0] = i_1743_ * is_1638_[0] + 8192 >> 14;
				is_1752_[1] = i_1743_ * is_1638_[3] + 8192 >> 14;
				is_1752_[2] = i_1743_ * is_1638_[6] + 8192 >> 14;
				is_1752_[3] = i_1744_ * is_1638_[1] + 8192 >> 14;
				is_1752_[4] = i_1744_ * is_1638_[4] + 8192 >> 14;
				is_1752_[5] = i_1744_ * is_1638_[7] + 8192 >> 14;
				is_1752_[6] = i_1745_ * is_1638_[2] + 8192 >> 14;
				is_1752_[7] = i_1745_ * is_1638_[5] + 8192 >> 14;
				is_1752_[8] = i_1745_ * is_1638_[8] + 8192 >> 14;
				int i_1753_ = i_1743_ * i_1737_ + 8192 >> 14;
				int i_1754_ = i_1744_ * i_1738_ + 8192 >> 14;
				int i_1755_ = i_1745_ * i_1739_ + 8192 >> 14;
				i_1753_ += i_1749_;
				i_1754_ += i_1750_;
				i_1755_ += i_1751_;
				int[] is_1756_ = new int[9];
				for (int i_1757_ = 0; i_1757_ < 3; i_1757_++) {
					for (int i_1758_ = 0; i_1758_ < 3; i_1758_++) {
						int i_1759_ = 0;
						for (int i_1760_ = 0; i_1760_ < 3; i_1760_++) {
							i_1759_ += is_1638_[i_1757_ * 3 + i_1760_] * is_1752_[i_1758_ + i_1760_ * 3];
						}
						is_1756_[i_1757_ * 3 + i_1758_] = i_1759_ + 8192 >> 14;
					}
				}
				int i_1761_ = is_1638_[0] * i_1753_ + is_1638_[1] * i_1754_ + is_1638_[2] * i_1755_ + 8192 >> 14;
				int i_1762_ = is_1638_[3] * i_1753_ + is_1638_[4] * i_1754_ + is_1638_[5] * i_1755_ + 8192 >> 14;
				int i_1763_ = is_1638_[6] * i_1753_ + is_1638_[7] * i_1754_ + is_1638_[8] * i_1755_ + 8192 >> 14;
				i_1761_ += i_1734_;
				i_1762_ += i_1735_;
				i_1763_ += i_1736_;
				for (int i_1764_ = 0; i_1764_ < i_1639_; i_1764_++) {
					int i_1765_ = is[i_1764_];
					if (i_1765_ < verticesByLabel.length) {
						int[] is_1766_ = verticesByLabel[i_1765_];
						for (int element : is_1766_) {
							int i_1768_ = element;
							if (aShortArray7838 == null || (i_1637_ & aShortArray7838[i_1768_]) != 0) {
								int i_1769_ = is_1756_[0] * vertices_x[i_1768_] + is_1756_[1] * vertices_y[i_1768_] + is_1756_[2] * vertices_z[i_1768_] + 8192 >> 14;
								int i_1770_ = is_1756_[3] * vertices_x[i_1768_] + is_1756_[4] * vertices_y[i_1768_] + is_1756_[5] * vertices_z[i_1768_] + 8192 >> 14;
								int i_1771_ = is_1756_[6] * vertices_x[i_1768_] + is_1756_[7] * vertices_y[i_1768_] + is_1756_[8] * vertices_z[i_1768_] + 8192 >> 14;
								i_1769_ += i_1761_;
								i_1770_ += i_1762_;
								i_1771_ += i_1763_;
								vertices_x[i_1768_] = i_1769_;
								vertices_y[i_1768_] = i_1770_;
								vertices_z[i_1768_] = i_1771_;
							}
						}
					}
				}
			} else {
				for (int i_1772_ = 0; i_1772_ < i_1639_; i_1772_++) {
					int i_1773_ = is[i_1772_];
					if (i_1773_ < verticesByLabel.length) {
						int[] is_1774_ = verticesByLabel[i_1773_];
						for (int element : is_1774_) {
							int i_1776_ = element;
							if (aShortArray7838 == null || (i_1637_ & aShortArray7838[i_1776_]) != 0) {
								vertices_x[i_1776_] -= origin_x;
								vertices_y[i_1776_] -= origin_y;
								vertices_z[i_1776_] -= origin_z;
								vertices_x[i_1776_] = vertices_x[i_1776_] * i_1634_ >> 7;
								vertices_y[i_1776_] = vertices_y[i_1776_] * i_1635_ >> 7;
								vertices_z[i_1776_] = vertices_z[i_1776_] * i_1636_ >> 7;
								vertices_x[i_1776_] += origin_x;
								vertices_y[i_1776_] += origin_y;
								vertices_z[i_1776_] += origin_z;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray7855 != null) {
				for (int i_1777_ = 0; i_1777_ < i_1639_; i_1777_++) {
					int i_1778_ = is[i_1777_];
					if (i_1778_ < anIntArrayArray7855.length) {
						int[] is_1779_ = anIntArrayArray7855[i_1778_];
						for (int element : is_1779_) {
							int i_1781_ = element;
							if (aShortArray7856 == null || (i_1637_ & aShortArray7856[i_1781_]) != 0) {
								int i_1782_ = (aByteArray7850[i_1781_] & 0xff) + i_1634_ * 8;
								if (i_1782_ < 0) {
									i_1782_ = 0;
								} else if (i_1782_ > 255) {
									i_1782_ = 255;
								}
								aByteArray7850[i_1781_] = (byte) i_1782_;
								if (aClass32_7858 != null) {
									aClass32_7858.anInterface1_397 = null;
								}
							}
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_1783_ = 0; i_1783_ < anInt7877; i_1783_++) {
						Class54 class54 = aClass54Array7880[i_1783_];
						Class36 class36 = aClass36Array7875[i_1783_];
						class36.anInt424 = class36.anInt424 & 0xffffff | 255 - (aByteArray7850[class54.anInt549] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray7855 != null) {
				for (int i_1784_ = 0; i_1784_ < i_1639_; i_1784_++) {
					int i_1785_ = is[i_1784_];
					if (i_1785_ < anIntArrayArray7855.length) {
						int[] is_1786_ = anIntArrayArray7855[i_1785_];
						for (int element : is_1786_) {
							int i_1788_ = element;
							if (aShortArray7856 == null || (i_1637_ & aShortArray7856[i_1788_]) != 0) {
								int i_1789_ = aShortArray7849[i_1788_] & 0xffff;
								int i_1790_ = i_1789_ >> 10 & 0x3f;
								int i_1791_ = i_1789_ >> 7 & 0x7;
								int i_1792_ = i_1789_ & 0x7f;
								i_1790_ = i_1790_ + i_1634_ & 0x3f;
								i_1791_ += i_1635_ / 4;
								if (i_1791_ < 0) {
									i_1791_ = 0;
								} else if (i_1791_ > 7) {
									i_1791_ = 7;
								}
								i_1792_ += i_1636_;
								if (i_1792_ < 0) {
									i_1792_ = 0;
								} else if (i_1792_ > 127) {
									i_1792_ = 127;
								}
								aShortArray7849[i_1788_] = (short) (i_1790_ << 10 | i_1791_ << 7 | i_1792_);
								if (aClass32_7858 != null) {
									aClass32_7858.anInterface1_397 = null;
								}
							}
						}
					}
				}
				if (aClass54Array7880 != null) {
					for (int i_1793_ = 0; i_1793_ < anInt7877; i_1793_++) {
						Class54 class54 = aClass54Array7880[i_1793_];
						Class36 class36 = aClass36Array7875[i_1793_];
						class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray7882 != null) {
				for (int i_1794_ = 0; i_1794_ < i_1639_; i_1794_++) {
					int i_1795_ = is[i_1794_];
					if (i_1795_ < anIntArrayArray7882.length) {
						int[] is_1796_ = anIntArrayArray7882[i_1795_];
						for (int element : is_1796_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt422 += i_1634_;
							class36.anInt419 += i_1635_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray7882 != null) {
				for (int i_1798_ = 0; i_1798_ < i_1639_; i_1798_++) {
					int i_1799_ = is[i_1798_];
					if (i_1799_ < anIntArrayArray7882.length) {
						int[] is_1800_ = anIntArrayArray7882[i_1799_];
						for (int element : is_1800_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt420 = class36.anInt420 * i_1634_ >> 7;
							class36.anInt421 = class36.anInt421 * i_1635_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray7882 != null) {
				for (int i_1802_ = 0; i_1802_ < i_1639_; i_1802_++) {
					int i_1803_ = is[i_1802_];
					if (i_1803_ < anIntArrayArray7882.length) {
						int[] is_1804_ = anIntArrayArray7882[i_1803_];
						for (int element : is_1804_) {
							Class36 class36 = aClass36Array7875[element];
							class36.anInt423 = class36.anInt423 + i_1634_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	@Override
	public int dn() {
		return aShort7869;
	}

	@Override
	public byte[] method_do() {
		return aByteArray7850;
	}

	@Override
	public void method4768(byte i, byte[] is) {
		if (is == null) {
			for (int i_1806_ = 0; i_1806_ < anInt7847; i_1806_++) {
				aByteArray7850[i_1806_] = i;
			}
		} else {
			for (int i_1807_ = 0; i_1807_ < anInt7847; i_1807_++) {
				int i_1808_ = 255 - (255 - (is[i_1807_] & 0xff)) * (255 - (i & 0xff)) / 255;
				aByteArray7850[i_1807_] = (byte) i_1808_;
			}
		}
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public void method4769(byte i, byte[] is) {
		if (is == null) {
			for (int i_1809_ = 0; i_1809_ < anInt7847; i_1809_++) {
				aByteArray7850[i_1809_] = i;
			}
		} else {
			for (int i_1810_ = 0; i_1810_ < anInt7847; i_1810_++) {
				int i_1811_ = 255 - (255 - (is[i_1810_] & 0xff)) * (255 - (i & 0xff)) / 255;
				aByteArray7850[i_1810_] = (byte) i_1811_;
			}
		}
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public void X(short i, short i_1812_) {
		for (int i_1813_ = 0; i_1813_ < anInt7847; i_1813_++) {
			if (aShortArray7849[i_1813_] == i) {
				aShortArray7849[i_1813_] = i_1812_;
			}
		}
		if (aClass54Array7880 != null) {
			for (int i_1814_ = 0; i_1814_ < anInt7877; i_1814_++) {
				Class54 class54 = aClass54Array7880[i_1814_];
				Class36 class36 = aClass36Array7875[i_1814_];
				class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
			}
		}
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public void dv(short i, short i_1815_) {
		Interface_ma interface_ma = aClass_ra_Sub2_7824.anInterface_ma5299;
		for (int i_1816_ = 0; i_1816_ < anInt7847; i_1816_++) {
			if (aShortArray7861[i_1816_] == i) {
				aShortArray7861[i_1816_] = i_1815_;
			}
		}
		byte i_1817_ = 0;
		byte i_1818_ = 0;
		if (i != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i & 0xffff, 1611040248);
			i_1817_ = materialRaw.aByte533;
			i_1818_ = materialRaw.aByte534;
		}
		byte i_1819_ = 0;
		byte i_1820_ = 0;
		if (i_1815_ != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i_1815_ & 0xffff, 890784923);
			i_1819_ = materialRaw.aByte533;
			i_1820_ = materialRaw.aByte534;
			if (materialRaw.aByte535 != 0 || materialRaw.aByte509 != 0) {
				aBoolean7862 = true;
			}
		}
		if (i_1817_ != i_1819_ | i_1818_ != i_1820_) {
			if (aClass54Array7880 != null) {
				for (int i_1821_ = 0; i_1821_ < anInt7877; i_1821_++) {
					Class54 class54 = aClass54Array7880[i_1821_];
					Class36 class36 = aClass36Array7875[i_1821_];
					class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
				}
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
		}
	}

	@Override
	public Class85[] method4771() {
		return aClass85Array7825;
	}

	@Override
	public void bc(int i) {
		int i_1822_ = Class220.SINE[i];
		int i_1823_ = Class220.COSINE[i];
		for (int i_1824_ = 0; i_1824_ < anInt7833; i_1824_++) {
			int i_1825_ = vertices_z[i_1824_] * i_1822_ + vertices_x[i_1824_] * i_1823_ >> 14;
			vertices_z[i_1824_] = vertices_z[i_1824_] * i_1823_ - vertices_x[i_1824_] * i_1822_ >> 14;
			vertices_x[i_1824_] = i_1825_;
		}
		for (int i_1826_ = 0; i_1826_ < anInt7839; i_1826_++) {
			int i_1827_ = aShortArray7842[i_1826_] * i_1822_ + aShortArray7829[i_1826_] * i_1823_ >> 14;
			aShortArray7842[i_1826_] = (short) (aShortArray7842[i_1826_] * i_1823_ - aShortArray7829[i_1826_] * i_1822_ >> 14);
			aShortArray7829[i_1826_] = (short) i_1827_;
		}
		if (aClass32_7889 == null && aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
		if (aClass32_7889 != null) {
			aClass32_7889.anInterface1_397 = null;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	void method4830(boolean bool) {
		if (aClass_ra_Sub2_7824.aClass298_Sub53_Sub1_8197.payload.length < anInt7885 * 6) {
			aClass_ra_Sub2_7824.aClass298_Sub53_Sub1_8197 = new RsFloatBuffer((anInt7885 + 100) * 6);
		} else {
			aClass_ra_Sub2_7824.aClass298_Sub53_Sub1_8197.pos = 0;
		}
		RsFloatBuffer class298_sub53_sub1 = aClass_ra_Sub2_7824.aClass298_Sub53_Sub1_8197;
		if (aClass_ra_Sub2_7824.aBoolean8143) {
			for (int i = 0; i < anInt7885; i++) {
				class298_sub53_sub1.writeShort(aShortArray7851[i], 16711935);
				class298_sub53_sub1.writeShort(aShortArray7852[i], 16711935);
				class298_sub53_sub1.writeShort(aShortArray7853[i], 16711935);
			}
		} else {
			for (int i = 0; i < anInt7885; i++) {
				class298_sub53_sub1.method3587(aShortArray7851[i], 1368367793);
				class298_sub53_sub1.method3587(aShortArray7852[i], 1368367793);
				class298_sub53_sub1.method3587(aShortArray7853[i], 1368367793);
			}
		}
		if (class298_sub53_sub1.pos * 385051775 != 0) {
			if (bool) {
				if (anInterface2_7820 == null) {
					anInterface2_7820 = aClass_ra_Sub2_7824.method5284(5123, class298_sub53_sub1.payload, class298_sub53_sub1.pos * 385051775, true);
				} else {
					anInterface2_7820.method19(5123, class298_sub53_sub1.payload, class298_sub53_sub1.pos * 385051775);
				}
				aClass41_7879.anInterface2_441 = anInterface2_7820;
			} else {
				aClass41_7879.anInterface2_441 = aClass_ra_Sub2_7824.method5284(5123, class298_sub53_sub1.payload, class298_sub53_sub1.pos * 385051775, false);
			}
			if (!bool) {
				aBoolean7864 = true;
			}
		}
	}

	@Override
	public void dt(int i, int i_1828_, int i_1829_, int i_1830_) {
		for (int i_1831_ = 0; i_1831_ < anInt7847; i_1831_++) {
			int i_1832_ = aShortArray7849[i_1831_] & 0xffff;
			int i_1833_ = i_1832_ >> 10 & 0x3f;
			int i_1834_ = i_1832_ >> 7 & 0x7;
			int i_1835_ = i_1832_ & 0x7f;
			if (i != -1) {
				i_1833_ += (i - i_1833_) * i_1830_ >> 7;
			}
			if (i_1828_ != -1) {
				i_1834_ += (i_1828_ - i_1834_) * i_1830_ >> 7;
			}
			if (i_1829_ != -1) {
				i_1835_ += (i_1829_ - i_1835_) * i_1830_ >> 7;
			}
			aShortArray7849[i_1831_] = (short) (i_1833_ << 10 | i_1834_ << 7 | i_1835_);
		}
		if (aClass54Array7880 != null) {
			for (int i_1836_ = 0; i_1836_ < anInt7877; i_1836_++) {
				Class54 class54 = aClass54Array7880[i_1836_];
				Class36 class36 = aClass36Array7875[i_1836_];
				class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
			}
		}
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public void dj(int i, int i_1837_, int i_1838_, int i_1839_) {
		for (int i_1840_ = 0; i_1840_ < anInt7847; i_1840_++) {
			int i_1841_ = aShortArray7849[i_1840_] & 0xffff;
			int i_1842_ = i_1841_ >> 10 & 0x3f;
			int i_1843_ = i_1841_ >> 7 & 0x7;
			int i_1844_ = i_1841_ & 0x7f;
			if (i != -1) {
				i_1842_ += (i - i_1842_) * i_1839_ >> 7;
			}
			if (i_1837_ != -1) {
				i_1843_ += (i_1837_ - i_1843_) * i_1839_ >> 7;
			}
			if (i_1838_ != -1) {
				i_1844_ += (i_1838_ - i_1844_) * i_1839_ >> 7;
			}
			aShortArray7849[i_1840_] = (short) (i_1842_ << 10 | i_1843_ << 7 | i_1844_);
		}
		if (aClass54Array7880 != null) {
			for (int i_1845_ = 0; i_1845_ < anInt7877; i_1845_++) {
				Class54 class54 = aClass54Array7880[i_1845_];
				Class36 class36 = aClass36Array7875[i_1845_];
				class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
			}
		}
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public void dr(int i, int i_1846_, int i_1847_, int i_1848_) {
		for (int i_1849_ = 0; i_1849_ < anInt7847; i_1849_++) {
			int i_1850_ = aShortArray7849[i_1849_] & 0xffff;
			int i_1851_ = i_1850_ >> 10 & 0x3f;
			int i_1852_ = i_1850_ >> 7 & 0x7;
			int i_1853_ = i_1850_ & 0x7f;
			if (i != -1) {
				i_1851_ += (i - i_1851_) * i_1848_ >> 7;
			}
			if (i_1846_ != -1) {
				i_1852_ += (i_1846_ - i_1852_) * i_1848_ >> 7;
			}
			if (i_1847_ != -1) {
				i_1853_ += (i_1847_ - i_1853_) * i_1848_ >> 7;
			}
			aShortArray7849[i_1849_] = (short) (i_1851_ << 10 | i_1852_ << 7 | i_1853_);
		}
		if (aClass54Array7880 != null) {
			for (int i_1854_ = 0; i_1854_ < anInt7877; i_1854_++) {
				Class54 class54 = aClass54Array7880[i_1854_];
				Class36 class36 = aClass36Array7875[i_1854_];
				class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
			}
		}
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	void method4831() {
		int i = 32767;
		int i_1855_ = 32767;
		int i_1856_ = 32767;
		int i_1857_ = -32768;
		int i_1858_ = -32768;
		int i_1859_ = -32768;
		int i_1860_ = 0;
		int i_1861_ = 0;
		for (int i_1862_ = 0; i_1862_ < anInt7833; i_1862_++) {
			int i_1863_ = vertices_x[i_1862_];
			int i_1864_ = vertices_y[i_1862_];
			int i_1865_ = vertices_z[i_1862_];
			if (i_1863_ < i) {
				i = i_1863_;
			}
			if (i_1863_ > i_1857_) {
				i_1857_ = i_1863_;
			}
			if (i_1864_ < i_1855_) {
				i_1855_ = i_1864_;
			}
			if (i_1864_ > i_1858_) {
				i_1858_ = i_1864_;
			}
			if (i_1865_ < i_1856_) {
				i_1856_ = i_1865_;
			}
			if (i_1865_ > i_1859_) {
				i_1859_ = i_1865_;
			}
			int i_1866_ = i_1863_ * i_1863_ + i_1865_ * i_1865_;
			if (i_1866_ > i_1860_) {
				i_1860_ = i_1866_;
			}
			i_1866_ = i_1863_ * i_1863_ + i_1865_ * i_1865_ + i_1864_ * i_1864_;
			if (i_1866_ > i_1861_) {
				i_1861_ = i_1866_;
			}
		}
		aShort7870 = (short) i;
		aShort7871 = (short) i_1857_;
		aShort7868 = (short) i_1855_;
		aShort7874 = (short) i_1858_;
		aShort7872 = (short) i_1856_;
		aShort7876 = (short) i_1859_;
		anInt7891 = (int) (Math.sqrt(i_1860_) + 0.99);
		anInt7865 = (int) (Math.sqrt(i_1861_) + 0.99);
		aBoolean7843 = true;
	}

	@Override
	public Class85[] method4772() {
		return aClass85Array7825;
	}

	@Override
	public MagnetConfig[] method4773() {
		return aMagnetConfigArray7857;
	}

	@Override
	public MagnetConfig[] method4774() {
		return aMagnetConfigArray7857;
	}

	@Override
	public MagnetConfig[] method4753() {
		return aMagnetConfigArray7857;
	}

	@Override
	public Class85[] method4781() {
		return aClass85Array7825;
	}

	@Override
	public void t(int i) {
		int i_1867_ = Class220.SINE[i];
		int i_1868_ = Class220.COSINE[i];
		for (int i_1869_ = 0; i_1869_ < anInt7833; i_1869_++) {
			int i_1870_ = vertices_y[i_1869_] * i_1868_ - vertices_z[i_1869_] * i_1867_ >> 14;
			vertices_z[i_1869_] = vertices_y[i_1869_] * i_1867_ + vertices_z[i_1869_] * i_1868_ >> 14;
			vertices_y[i_1869_] = i_1870_;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public boolean method4777() {
		if (aShortArray7861 == null) {
			return true;
		}
		for (short element : aShortArray7861) {
			if (element != -1 && !aClass_ra_Sub2_7824.anInterface_ma5299.method170(element, (short) 17109)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int dp() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7876;
	}

	@Override
	public boolean ev() {
		return aBoolean7840;
	}

	@Override
	public boolean eg() {
		return aBoolean7862;
	}

	@Override
	public int cu() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7870;
	}

	@Override
	public boolean ek() {
		return aBoolean7862;
	}

	@Override
	public void du(short i, short i_1871_) {
		Interface_ma interface_ma = aClass_ra_Sub2_7824.anInterface_ma5299;
		for (int i_1872_ = 0; i_1872_ < anInt7847; i_1872_++) {
			if (aShortArray7861[i_1872_] == i) {
				aShortArray7861[i_1872_] = i_1871_;
			}
		}
		byte i_1873_ = 0;
		byte i_1874_ = 0;
		if (i != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i & 0xffff, 1088578683);
			i_1873_ = materialRaw.aByte533;
			i_1874_ = materialRaw.aByte534;
		}
		byte i_1875_ = 0;
		byte i_1876_ = 0;
		if (i_1871_ != -1) {
			MaterialRaw materialRaw = interface_ma.method174(i_1871_ & 0xffff, 822348317);
			i_1875_ = materialRaw.aByte533;
			i_1876_ = materialRaw.aByte534;
			if (materialRaw.aByte535 != 0 || materialRaw.aByte509 != 0) {
				aBoolean7862 = true;
			}
		}
		if (i_1873_ != i_1875_ | i_1874_ != i_1876_) {
			if (aClass54Array7880 != null) {
				for (int i_1877_ = 0; i_1877_ < anInt7877; i_1877_++) {
					Class54 class54 = aClass54Array7880[i_1877_];
					Class36 class36 = aClass36Array7875[i_1877_];
					class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
				}
			}
			if (aClass32_7858 != null) {
				aClass32_7858.anInterface1_397 = null;
			}
		}
	}

	@Override
	void cm() {
		for (int i = 0; i < anInt7832; i++) {
			vertices_x[i] = vertices_x[i] + 7 >> 4;
			vertices_y[i] = vertices_y[i] + 7 >> 4;
			vertices_z[i] = vertices_z[i] + 7 >> 4;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public int db() {
		return aShort7828;
	}

	@Override
	public void dx(int i) {
		aShort7869 = (short) i;
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
		if (aClass32_7889 != null) {
			aClass32_7889.anInterface1_397 = null;
		}
	}

	@Override
	public void em() {
		for (int i = 0; i < anInt7833; i++) {
			vertices_z[i] = -vertices_z[i];
		}
		for (int i = 0; i < anInt7839; i++) {
			aShortArray7842[i] = (short) -aShortArray7842[i];
		}
		for (int i = 0; i < anInt7847; i++) {
			short i_1878_ = aShortArray7851[i];
			aShortArray7851[i] = aShortArray7853[i];
			aShortArray7853[i] = i_1878_;
		}
		if (aClass32_7889 == null && aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
		if (aClass32_7889 != null) {
			aClass32_7889.anInterface1_397 = null;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		if (aClass41_7879 != null) {
			aClass41_7879.anInterface2_441 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public int ec() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7874;
	}

	@Override
	public void eb(short i, short i_1879_) {
		for (int i_1880_ = 0; i_1880_ < anInt7847; i_1880_++) {
			if (aShortArray7849[i_1880_] == i) {
				aShortArray7849[i_1880_] = i_1879_;
			}
		}
		if (aClass54Array7880 != null) {
			for (int i_1881_ = 0; i_1881_ < anInt7877; i_1881_++) {
				Class54 class54 = aClass54Array7880[i_1881_];
				Class36 class36 = aClass36Array7875[i_1881_];
				class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
			}
		}
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public void ey(short i, short i_1882_) {
		for (int i_1883_ = 0; i_1883_ < anInt7847; i_1883_++) {
			if (aShortArray7849[i_1883_] == i) {
				aShortArray7849[i_1883_] = i_1882_;
			}
		}
		if (aClass54Array7880 != null) {
			for (int i_1884_ = 0; i_1884_ < anInt7877; i_1884_++) {
				Class54 class54 = aClass54Array7880[i_1884_];
				Class36 class36 = aClass36Array7875[i_1884_];
				class36.anInt424 = class36.anInt424 & ~0xffffff | JAGLib.anIntArray3165[aShortArray7849[class54.anInt549] & 0xffff] & 0xffffff;
			}
		}
		if (aClass32_7858 != null) {
			aClass32_7858.anInterface1_397 = null;
		}
	}

	@Override
	public void method4751(Matrix43f class222) {
		Class233 class233 = aClass_ra_Sub2_7824.aClass233_8104;
		class233.method2145(class222);
		if (aClass85Array7825 != null) {
			for (Class85 class85 : aClass85Array7825) {
				Class85 class85_1885_ = class85;
				if (class85.aClass85_776 != null) {
					class85_1885_ = class85.aClass85_776;
				}
				class85_1885_.anInt777 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[4] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[8] * vertices_z[class85.anInt773 * -710317103])) * -1879868075;
				class85_1885_.anInt783 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[5] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[9] * vertices_z[class85.anInt773 * -710317103])) * -2041556771;
				class85_1885_.anInt779 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[6] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[10] * vertices_z[class85.anInt773 * -710317103])) * -1434499227;
				class85_1885_.anInt772 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[4] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[8] * vertices_z[class85.anInt774 * 1705862021])) * 1070341177;
				class85_1885_.anInt781 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[5] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[9] * vertices_z[class85.anInt774 * 1705862021])) * 1802851857;
				class85_1885_.anInt782 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[6] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[10] * vertices_z[class85.anInt774 * 1705862021])) * 103846281;
				class85_1885_.anInt771 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[4] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[8] * vertices_z[class85.anInt775 * 1636170731])) * -2103324039;
				class85_1885_.anInt784 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[5] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[9] * vertices_z[class85.anInt775 * 1636170731])) * -526039059;
				class85_1885_.anInt785 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[6] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[10] * vertices_z[class85.anInt775 * 1636170731])) * 491030489;
			}
		}
		if (aMagnetConfigArray7857 != null) {
			for (MagnetConfig element : aMagnetConfigArray7857) {
				MagnetConfig magnetConfig = element;
				MagnetConfig magnetConfig_1886_ = magnetConfig;
				if (magnetConfig.aMagnetConfig_672 != null) {
					magnetConfig_1886_ = magnetConfig.aMagnetConfig_672;
				}
				if (magnetConfig.aClass233_677 != null) {
					magnetConfig.aClass233_677.method2142(class233);
				} else {
					magnetConfig.aClass233_677 = new Class233(class233);
				}
				magnetConfig_1886_.anInt671 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[4] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[8] * vertices_z[magnetConfig.anInt674 * -180596249])) * -1436341053;
				magnetConfig_1886_.anInt675 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[5] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[9] * vertices_z[magnetConfig.anInt674 * -180596249])) * 449866009;
				magnetConfig_1886_.anInt676 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[6] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[10] * vertices_z[magnetConfig.anInt674 * -180596249])) * 1336328763;
			}
		}
	}

	@Override
	public void method4782(Matrix43f class222) {
		Class233 class233 = aClass_ra_Sub2_7824.aClass233_8104;
		class233.method2145(class222);
		if (aClass85Array7825 != null) {
			for (Class85 class85 : aClass85Array7825) {
				Class85 class85_1887_ = class85;
				if (class85.aClass85_776 != null) {
					class85_1887_ = class85.aClass85_776;
				}
				class85_1887_.anInt777 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[4] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[8] * vertices_z[class85.anInt773 * -710317103])) * -1879868075;
				class85_1887_.anInt783 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[5] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[9] * vertices_z[class85.anInt773 * -710317103])) * -2041556771;
				class85_1887_.anInt779 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt773 * -710317103] + class233.aFloatArray2594[6] * vertices_y[class85.anInt773 * -710317103] + class233.aFloatArray2594[10] * vertices_z[class85.anInt773 * -710317103])) * -1434499227;
				class85_1887_.anInt772 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[4] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[8] * vertices_z[class85.anInt774 * 1705862021])) * 1070341177;
				class85_1887_.anInt781 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[5] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[9] * vertices_z[class85.anInt774 * 1705862021])) * 1802851857;
				class85_1887_.anInt782 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt774 * 1705862021] + class233.aFloatArray2594[6] * vertices_y[class85.anInt774 * 1705862021] + class233.aFloatArray2594[10] * vertices_z[class85.anInt774 * 1705862021])) * 103846281;
				class85_1887_.anInt771 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[4] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[8] * vertices_z[class85.anInt775 * 1636170731])) * -2103324039;
				class85_1887_.anInt784 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[5] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[9] * vertices_z[class85.anInt775 * 1636170731])) * -526039059;
				class85_1887_.anInt785 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[class85.anInt775 * 1636170731] + class233.aFloatArray2594[6] * vertices_y[class85.anInt775 * 1636170731] + class233.aFloatArray2594[10] * vertices_z[class85.anInt775 * 1636170731])) * 491030489;
			}
		}
		if (aMagnetConfigArray7857 != null) {
			for (MagnetConfig element : aMagnetConfigArray7857) {
				MagnetConfig magnetConfig = element;
				MagnetConfig magnetConfig_1888_ = magnetConfig;
				if (magnetConfig.aMagnetConfig_672 != null) {
					magnetConfig_1888_ = magnetConfig.aMagnetConfig_672;
				}
				if (magnetConfig.aClass233_677 != null) {
					magnetConfig.aClass233_677.method2142(class233);
				} else {
					magnetConfig.aClass233_677 = new Class233(class233);
				}
				magnetConfig_1888_.anInt671 = (int) (class233.aFloatArray2594[12] + (class233.aFloatArray2594[0] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[4] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[8] * vertices_z[magnetConfig.anInt674 * -180596249])) * -1436341053;
				magnetConfig_1888_.anInt675 = (int) (class233.aFloatArray2594[13] + (class233.aFloatArray2594[1] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[5] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[9] * vertices_z[magnetConfig.anInt674 * -180596249])) * 449866009;
				magnetConfig_1888_.anInt676 = (int) (class233.aFloatArray2594[14] + (class233.aFloatArray2594[2] * vertices_x[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[6] * vertices_y[magnetConfig.anInt674 * -180596249] + class233.aFloatArray2594[10] * vertices_z[magnetConfig.anInt674 * -180596249])) * 1336328763;
			}
		}
	}

	@Override
	public void be(int i) {
		int i_1889_ = Class220.SINE[i];
		int i_1890_ = Class220.COSINE[i];
		for (int i_1891_ = 0; i_1891_ < anInt7833; i_1891_++) {
			int i_1892_ = vertices_z[i_1891_] * i_1889_ + vertices_x[i_1891_] * i_1890_ >> 14;
			vertices_z[i_1891_] = vertices_z[i_1891_] * i_1890_ - vertices_x[i_1891_] * i_1889_ >> 14;
			vertices_x[i_1891_] = i_1892_;
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public boolean method4778() {
		if (aShortArray7861 == null) {
			return true;
		}
		for (short element : aShortArray7861) {
			if (element != -1 && !aClass_ra_Sub2_7824.anInterface_ma5299.method170(element, (short) 19267)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void oa(int i, int i_1893_, int i_1894_) {
		for (int i_1895_ = 0; i_1895_ < anInt7833; i_1895_++) {
			if (i != 128) {
				vertices_x[i_1895_] = vertices_x[i_1895_] * i >> 7;
			}
			if (i_1893_ != 128) {
				vertices_y[i_1895_] = vertices_y[i_1895_] * i_1893_ >> 7;
			}
			if (i_1894_ != 128) {
				vertices_z[i_1895_] = vertices_z[i_1895_] * i_1894_ >> 7;
			}
		}
		if (aClass32_7831 != null) {
			aClass32_7831.anInterface1_397 = null;
		}
		aBoolean7843 = false;
	}

	@Override
	public int dq() {
		if (!aBoolean7843) {
			method4831();
		}
		return aShort7876;
	}

	@Override
	public void method4741(Matrix43f class222, int i, boolean bool) {
		if (aShortArray7838 != null) {
			Matrix43f class222_1896_ = class222;
			if (bool) {
				class222_1896_ = aClass_ra_Sub2_7824.aClass222_8103;
				class222_1896_.method2074(class222);
			}
			float[] fs = new float[3];
			for (int i_1897_ = 0; i_1897_ < anInt7833; i_1897_++) {
				if ((i & aShortArray7838[i_1897_]) != 0) {
					class222_1896_.method2077(vertices_x[i_1897_], vertices_y[i_1897_], vertices_z[i_1897_], fs);
					vertices_x[i_1897_] = (int) fs[0];
					vertices_y[i_1897_] = (int) fs[1];
					vertices_z[i_1897_] = (int) fs[2];
				}
			}
		}
	}

	ModelPart_Sub2(Class_ra_Sub2 class_ra_sub2, Model class64, int i, int i_1898_, int i_1899_, int i_1900_) {
		anInt7832 = 0;
		anInt7833 = 0;
		anInt7839 = 0;
		anInt7847 = 0;
		anInt7885 = 0;
		aBoolean7864 = true;
		aBoolean7843 = false;
		aClass_ra_Sub2_7824 = class_ra_sub2;
		anInt7863 = i;
		anInt7826 = i_1900_;
		if (Class38.method471(i, i_1900_)) {
			aClass32_7831 = new Class32(null, 5126, 3, 0);
		}
		if (Class38.method455(i, i_1900_)) {
			aClass32_7860 = new Class32(null, 5126, 2, 0);
		}
		if (Class38.method475(i, i_1900_)) {
			aClass32_7889 = new Class32(null, 5126, 3, 0);
		}
		if (Class38.method458(i, i_1900_)) {
			aClass32_7858 = new Class32(null, 5121, 4, 0);
		}
		if (Class38.method456(i, i_1900_)) {
			aClass41_7879 = new Class41();
		}
		Interface_ma interface_ma = class_ra_sub2.anInterface_ma5299;
		int[] is = new int[class64.numFaces];
		anIntArray7854 = new int[class64.highestFaceIndex + 1];
		for (int i_1901_ = 0; i_1901_ < class64.numFaces; i_1901_++) {
			if (class64.facesType == null || class64.facesType[i_1901_] != 2) {
				if (class64.facesMaterial != null && class64.facesMaterial[i_1901_] != -1) {
					MaterialRaw materialRaw = interface_ma.method174(class64.facesMaterial[i_1901_] & 0xffff, 320662822);
					if (((anInt7826 & 0x40) == 0 || !materialRaw.aBoolean524) && materialRaw.aBoolean538) {
						continue;
					}
				}
				is[anInt7847++] = i_1901_;
				anIntArray7854[class64.facesA[i_1901_]]++;
				anIntArray7854[class64.facesB[i_1901_]]++;
				anIntArray7854[class64.facesC[i_1901_]]++;
			}
		}
		anInt7885 = anInt7847;
		long[] ls = new long[anInt7847];
		boolean bool = (anInt7863 & 0x100) != 0;
		for (int i_1902_ = 0; i_1902_ < anInt7847; i_1902_++) {
			int i_1903_ = is[i_1902_];
			MaterialRaw materialRaw = null;
			int i_1904_ = 0;
			int i_1905_ = 0;
			int i_1906_ = 0;
			int i_1907_ = 0;
			if (class64.aVertexNormalArray649 != null) {
				boolean bool_1908_ = false;
				for (VertexNormal vertexNormal : class64.aVertexNormalArray649) {
					if (i_1903_ == vertexNormal.face * 1512514121) {
						Class173 class173 = Node.method2844(vertexNormal.type * 1834782277, -380514966);
						if (class173.aBoolean1757) {
							bool_1908_ = true;
						}
						if (class173.anInt1751 * 39181267 != -1) {
							MaterialRaw materialRaw_1910_ = interface_ma.method174(class173.anInt1751 * 39181267, 1849419988);
							if (materialRaw_1910_.anInt528 * -2138060883 == 2) {
								aBoolean7840 = true;
							}
						}
					}
				}
				if (bool_1908_) {
					ls[i_1902_] = 9223372036854775807L;
					anInt7885--;
					continue;
				}
			}
			int i_1911_ = -1;
			if (class64.facesMaterial != null) {
				i_1911_ = class64.facesMaterial[i_1903_];
				if (i_1911_ != -1) {
					materialRaw = interface_ma.method174(i_1911_ & 0xffff, 437303062);
					if ((anInt7826 & 0x40) == 0 || !materialRaw.aBoolean524) {
						i_1906_ = materialRaw.aByte529;
						i_1907_ = materialRaw.aByte536;
						if (materialRaw.aByte535 != 0 || materialRaw.aByte509 != 0) {
							aBoolean7862 = true;
						}
					} else {
						i_1911_ = -1;
						materialRaw = null;
					}
				}
			}
			boolean bool_1912_ = class64.facesAlpha != null && class64.facesAlpha[i_1903_] != 0 || materialRaw != null && materialRaw.anInt528 * -2138060883 != 0;
			if ((bool || bool_1912_) && class64.facesPriority != null) {
				i_1904_ += class64.facesPriority[i_1903_] << 17;
			}
			if (bool_1912_) {
				i_1904_ += 65536;
			}
			i_1904_ += (i_1906_ & 0xff) << 8;
			i_1904_ += i_1907_ & 0xff;
			i_1905_ += (i_1911_ & 0xffff) << 16;
			i_1905_ += i_1902_ & 0xffff;
			ls[i_1902_] = ((long) i_1904_ << 32) + i_1905_;
			aBoolean7840 |= bool_1912_;
			ModelPart_Sub2 class387_sub2_1913_ = this;
			class387_sub2_1913_.aBoolean7862 = class387_sub2_1913_.aBoolean7862 | (materialRaw != null && (materialRaw.aByte535 != 0 || materialRaw.aByte509 != 0));
		}
		Skybox.method2598(ls, is, (byte) 2);
		anInt7832 = class64.numVertices;
		anInt7833 = class64.highestFaceIndex;
		vertices_x = class64.verticesX;
		vertices_y = class64.verticesY;
		vertices_z = class64.verticesZ;
		aShortArray7838 = class64.vertexDuplicates;
		Vertex[] vertices = new Vertex[anInt7833];
		aClass85Array7825 = class64.aClass85Array647;
		aMagnetConfigArray7857 = class64.aMagnetConfigArray613;
		if (class64.aVertexNormalArray649 != null) {
			anInt7877 = class64.aVertexNormalArray649.length;
			aClass54Array7880 = new Class54[anInt7877];
			aClass36Array7875 = new Class36[anInt7877];
			for (int i_1914_ = 0; i_1914_ < anInt7877; i_1914_++) {
				VertexNormal vertexNormal = class64.aVertexNormalArray649[i_1914_];
				Class173 class173 = Node.method2844(vertexNormal.type * 1834782277, 1758863728);
				int i_1915_ = -1;
				for (int i_1916_ = 0; i_1916_ < anInt7847; i_1916_++) {
					if (is[i_1916_] == vertexNormal.face * 1512514121) {
						i_1915_ = i_1916_;
						break;
					}
				}
				int i_1917_ = JAGLib.anIntArray3165[class64.facesColour[vertexNormal.face * 1512514121] & 0xffff] & 0xffffff;
				i_1917_ = i_1917_ | 255 - (class64.facesAlpha != null ? class64.facesAlpha[vertexNormal.face * 1512514121] : 0) << 24;
				aClass54Array7880[i_1914_] = new Class54(i_1915_, class64.facesA[vertexNormal.face * 1512514121], class64.facesB[vertexNormal.face * 1512514121], class64.facesC[vertexNormal.face * 1512514121], class173.anInt1755 * 1951943953, class173.anInt1753 * 893949695, class173.anInt1751 * 39181267, class173.anInt1752 * -310074719, class173.anInt1754 * 1092922159, class173.aBoolean1757, class173.aBoolean1748, vertexNormal.magnitude * 2010148771);
				aClass36Array7875[i_1914_] = new Class36(i_1917_);
			}
		}
		int i_1918_ = anInt7847 * 3;
		aShortArray7829 = new short[i_1918_];
		aShortArray7841 = new short[i_1918_];
		aShortArray7842 = new short[i_1918_];
		aByteArray7887 = new byte[i_1918_];
		aFloatArray7845 = new float[i_1918_];
		aFloatArray7846 = new float[i_1918_];
		aShortArray7849 = new short[anInt7847];
		aByteArray7850 = new byte[anInt7847];
		aShortArray7851 = new short[anInt7847];
		aShortArray7852 = new short[anInt7847];
		aShortArray7853 = new short[anInt7847];
		aShortArray7861 = new short[anInt7847];
		if (class64.submeshes_lookup != null) {
			aShortArray7856 = new short[anInt7847];
		}
		aShort7828 = (short) i_1898_;
		aShort7869 = (short) i_1899_;
		aShortArray7830 = new short[i_1918_];
		aLongArray7883 = new long[i_1918_];
		int i_1919_ = 0;
		for (int i_1920_ = 0; i_1920_ < class64.highestFaceIndex; i_1920_++) {
			int i_1921_ = anIntArray7854[i_1920_];
			anIntArray7854[i_1920_] = i_1919_;
			i_1919_ += i_1921_;
			vertices[i_1920_] = new Vertex();
		}
		anIntArray7854[class64.highestFaceIndex] = i_1919_;
		Class76 class76 = method4785(class64, is, anInt7847);
		Class37[] class37s = new Class37[class64.numFaces];
		for (int i_1922_ = 0; i_1922_ < class64.numFaces; i_1922_++) {
			short i_1923_ = class64.facesA[i_1922_];
			short i_1924_ = class64.facesB[i_1922_];
			short i_1925_ = class64.facesC[i_1922_];
			int i_1926_ = vertices_x[i_1924_] - vertices_x[i_1923_];
			int i_1927_ = vertices_y[i_1924_] - vertices_y[i_1923_];
			int i_1928_ = vertices_z[i_1924_] - vertices_z[i_1923_];
			int i_1929_ = vertices_x[i_1925_] - vertices_x[i_1923_];
			int i_1930_ = vertices_y[i_1925_] - vertices_y[i_1923_];
			int i_1931_ = vertices_z[i_1925_] - vertices_z[i_1923_];
			int i_1932_ = i_1927_ * i_1931_ - i_1930_ * i_1928_;
			int i_1933_ = i_1928_ * i_1929_ - i_1931_ * i_1926_;
			int i_1934_;
			for (i_1934_ = i_1926_ * i_1930_ - i_1929_ * i_1927_; i_1932_ > 8192 || i_1933_ > 8192 || i_1934_ > 8192 || i_1932_ < -8192 || i_1933_ < -8192 || i_1934_ < -8192; i_1934_ >>= 1) {
				i_1932_ >>= 1;
				i_1933_ >>= 1;
			}
			int i_1935_ = (int) Math.sqrt(i_1932_ * i_1932_ + i_1933_ * i_1933_ + i_1934_ * i_1934_);
			if (i_1935_ <= 0) {
				i_1935_ = 1;
			}
			i_1932_ = i_1932_ * 256 / i_1935_;
			i_1933_ = i_1933_ * 256 / i_1935_;
			i_1934_ = i_1934_ * 256 / i_1935_;
			byte i_1936_ = class64.facesType == null ? (byte) 0 : class64.facesType[i_1922_];
			if (i_1936_ == 0) {
				Vertex vertex = vertices[i_1923_];
				vertex.anInt464 += i_1932_;
				vertex.anInt463 += i_1933_;
				vertex.anInt465 += i_1934_;
				vertex.anInt466++;
				vertex = vertices[i_1924_];
				vertex.anInt464 += i_1932_;
				vertex.anInt463 += i_1933_;
				vertex.anInt465 += i_1934_;
				vertex.anInt466++;
				vertex = vertices[i_1925_];
				vertex.anInt464 += i_1932_;
				vertex.anInt463 += i_1933_;
				vertex.anInt465 += i_1934_;
				vertex.anInt466++;
			} else if (i_1936_ == 1) {
				Class37 class37 = class37s[i_1922_] = new Class37();
				class37.anInt426 = i_1932_;
				class37.anInt425 = i_1933_;
				class37.anInt427 = i_1934_;
			}
		}
		for (int i_1937_ = 0; i_1937_ < anInt7847; i_1937_++) {
			int i_1938_ = is[i_1937_];
			int i_1939_ = class64.facesColour[i_1938_] & 0xffff;
			int i_1940_;
			if (class64.facesTexture == null) {
				i_1940_ = -1;
			} else {
				i_1940_ = class64.facesTexture[i_1938_];
			}
			int i_1941_;
			if (class64.facesAlpha == null) {
				i_1941_ = 0;
			} else {
				i_1941_ = class64.facesAlpha[i_1938_] & 0xff;
			}
			short i_1942_ = class64.facesMaterial == null ? (short) -1 : class64.facesMaterial[i_1938_];
			if (i_1942_ != -1 && (anInt7826 & 0x40) != 0) {
				MaterialRaw materialRaw = interface_ma.method174(i_1942_ & 0xffff, 1573425391);
				if (materialRaw.aBoolean524) {
					i_1942_ = (short) -1;
				}
			}
			float f = 0.0F;
			float f_1943_ = 0.0F;
			float f_1944_ = 0.0F;
			float f_1945_ = 0.0F;
			float f_1946_ = 0.0F;
			float f_1947_ = 0.0F;
			int i_1948_ = 0;
			int i_1949_ = 0;
			int i_1950_ = 0;
			if (i_1942_ != -1) {
				if (i_1940_ == -1) {
					f = 0.0F;
					f_1943_ = 1.0F;
					f_1944_ = 1.0F;
					f_1945_ = 1.0F;
					i_1948_ = 1;
					f_1946_ = 0.0F;
					f_1947_ = 0.0F;
					i_1949_ = 2;
				} else {
					i_1940_ &= 0xff;
					byte i_1951_ = class64.texturesMappingType[i_1940_];
					if (i_1951_ == 0) {
						short i_1952_ = class64.facesA[i_1938_];
						short i_1953_ = class64.facesB[i_1938_];
						short i_1954_ = class64.facesC[i_1938_];
						short i_1955_ = class64.texturesMappingP[i_1940_];
						short i_1956_ = class64.texturesMappingM[i_1940_];
						short i_1957_ = class64.texturesMappingN[i_1940_];
						float f_1958_ = class64.verticesX[i_1955_];
						float f_1959_ = class64.verticesY[i_1955_];
						float f_1960_ = class64.verticesZ[i_1955_];
						float f_1961_ = class64.verticesX[i_1956_] - f_1958_;
						float f_1962_ = class64.verticesY[i_1956_] - f_1959_;
						float f_1963_ = class64.verticesZ[i_1956_] - f_1960_;
						float f_1964_ = class64.verticesX[i_1957_] - f_1958_;
						float f_1965_ = class64.verticesY[i_1957_] - f_1959_;
						float f_1966_ = class64.verticesZ[i_1957_] - f_1960_;
						float f_1967_ = class64.verticesX[i_1952_] - f_1958_;
						float f_1968_ = class64.verticesY[i_1952_] - f_1959_;
						float f_1969_ = class64.verticesZ[i_1952_] - f_1960_;
						float f_1970_ = class64.verticesX[i_1953_] - f_1958_;
						float f_1971_ = class64.verticesY[i_1953_] - f_1959_;
						float f_1972_ = class64.verticesZ[i_1953_] - f_1960_;
						float f_1973_ = class64.verticesX[i_1954_] - f_1958_;
						float f_1974_ = class64.verticesY[i_1954_] - f_1959_;
						float f_1975_ = class64.verticesZ[i_1954_] - f_1960_;
						float f_1976_ = f_1962_ * f_1966_ - f_1963_ * f_1965_;
						float f_1977_ = f_1963_ * f_1964_ - f_1961_ * f_1966_;
						float f_1978_ = f_1961_ * f_1965_ - f_1962_ * f_1964_;
						float f_1979_ = f_1965_ * f_1978_ - f_1966_ * f_1977_;
						float f_1980_ = f_1966_ * f_1976_ - f_1964_ * f_1978_;
						float f_1981_ = f_1964_ * f_1977_ - f_1965_ * f_1976_;
						float f_1982_ = 1.0F / (f_1979_ * f_1961_ + f_1980_ * f_1962_ + f_1981_ * f_1963_);
						f = (f_1979_ * f_1967_ + f_1980_ * f_1968_ + f_1981_ * f_1969_) * f_1982_;
						f_1944_ = (f_1979_ * f_1970_ + f_1980_ * f_1971_ + f_1981_ * f_1972_) * f_1982_;
						f_1946_ = (f_1979_ * f_1973_ + f_1980_ * f_1974_ + f_1981_ * f_1975_) * f_1982_;
						f_1979_ = f_1962_ * f_1978_ - f_1963_ * f_1977_;
						f_1980_ = f_1963_ * f_1976_ - f_1961_ * f_1978_;
						f_1981_ = f_1961_ * f_1977_ - f_1962_ * f_1976_;
						f_1982_ = 1.0F / (f_1979_ * f_1964_ + f_1980_ * f_1965_ + f_1981_ * f_1966_);
						f_1943_ = (f_1979_ * f_1967_ + f_1980_ * f_1968_ + f_1981_ * f_1969_) * f_1982_;
						f_1945_ = (f_1979_ * f_1970_ + f_1980_ * f_1971_ + f_1981_ * f_1972_) * f_1982_;
						f_1947_ = (f_1979_ * f_1973_ + f_1980_ * f_1974_ + f_1981_ * f_1975_) * f_1982_;
					} else {
						short i_1983_ = class64.facesA[i_1938_];
						short i_1984_ = class64.facesB[i_1938_];
						short i_1985_ = class64.facesC[i_1938_];
						int i_1986_ = class76.anIntArray713[i_1940_];
						int i_1987_ = class76.anIntArray710[i_1940_];
						int i_1988_ = class76.anIntArray709[i_1940_];
						float[] fs = class76.aFloatArrayArray711[i_1940_];
						byte i_1989_ = class64.textureDirection[i_1940_];
						float f_1990_ = class64.textureSpeed[i_1940_] / 256.0F;
						if (i_1951_ == 1) {
							float f_1991_ = class64.textureScaleZ[i_1940_] / 1024.0F;
							method4744(class64.verticesX[i_1983_], class64.verticesY[i_1983_], class64.verticesZ[i_1983_], i_1986_, i_1987_, i_1988_, fs, f_1991_, i_1989_, f_1990_, aFloatArray7884);
							f = aFloatArray7884[0];
							f_1943_ = aFloatArray7884[1];
							method4744(class64.verticesX[i_1984_], class64.verticesY[i_1984_], class64.verticesZ[i_1984_], i_1986_, i_1987_, i_1988_, fs, f_1991_, i_1989_, f_1990_, aFloatArray7884);
							f_1944_ = aFloatArray7884[0];
							f_1945_ = aFloatArray7884[1];
							method4744(class64.verticesX[i_1985_], class64.verticesY[i_1985_], class64.verticesZ[i_1985_], i_1986_, i_1987_, i_1988_, fs, f_1991_, i_1989_, f_1990_, aFloatArray7884);
							f_1946_ = aFloatArray7884[0];
							f_1947_ = aFloatArray7884[1];
							float f_1992_ = f_1991_ / 2.0F;
							if ((i_1989_ & 0x1) == 0) {
								if (f_1944_ - f > f_1992_) {
									f_1944_ -= f_1991_;
									i_1948_ = 1;
								} else if (f - f_1944_ > f_1992_) {
									f_1944_ += f_1991_;
									i_1948_ = 2;
								}
								if (f_1946_ - f > f_1992_) {
									f_1946_ -= f_1991_;
									i_1949_ = 1;
								} else if (f - f_1946_ > f_1992_) {
									f_1946_ += f_1991_;
									i_1949_ = 2;
								}
							} else {
								if (f_1945_ - f_1943_ > f_1992_) {
									f_1945_ -= f_1991_;
									i_1948_ = 1;
								} else if (f_1943_ - f_1945_ > f_1992_) {
									f_1945_ += f_1991_;
									i_1948_ = 2;
								}
								if (f_1947_ - f_1943_ > f_1992_) {
									f_1947_ -= f_1991_;
									i_1949_ = 1;
								} else if (f_1943_ - f_1947_ > f_1992_) {
									f_1947_ += f_1991_;
									i_1949_ = 2;
								}
							}
						} else if (i_1951_ == 2) {
							float f_1993_ = class64.textureTransU[i_1940_] / 256.0F;
							float f_1994_ = class64.textureTransV[i_1940_] / 256.0F;
							int i_1995_ = class64.verticesX[i_1984_] - class64.verticesX[i_1983_];
							int i_1996_ = class64.verticesY[i_1984_] - class64.verticesY[i_1983_];
							int i_1997_ = class64.verticesZ[i_1984_] - class64.verticesZ[i_1983_];
							int i_1998_ = class64.verticesX[i_1985_] - class64.verticesX[i_1983_];
							int i_1999_ = class64.verticesY[i_1985_] - class64.verticesY[i_1983_];
							int i_2000_ = class64.verticesZ[i_1985_] - class64.verticesZ[i_1983_];
							int i_2001_ = i_1996_ * i_2000_ - i_1999_ * i_1997_;
							int i_2002_ = i_1997_ * i_1998_ - i_2000_ * i_1995_;
							int i_2003_ = i_1995_ * i_1999_ - i_1998_ * i_1996_;
							float f_2004_ = 64.0F / class64.textureScaleX[i_1940_];
							float f_2005_ = 64.0F / class64.textureScaleY[i_1940_];
							float f_2006_ = 64.0F / class64.textureScaleZ[i_1940_];
							float f_2007_ = (i_2001_ * fs[0] + i_2002_ * fs[1] + i_2003_ * fs[2]) / f_2004_;
							float f_2008_ = (i_2001_ * fs[3] + i_2002_ * fs[4] + i_2003_ * fs[5]) / f_2005_;
							float f_2009_ = (i_2001_ * fs[6] + i_2002_ * fs[7] + i_2003_ * fs[8]) / f_2006_;
							i_1950_ = method4729(f_2007_, f_2008_, f_2009_);
							method4730(class64.verticesX[i_1983_], class64.verticesY[i_1983_], class64.verticesZ[i_1983_], i_1986_, i_1987_, i_1988_, i_1950_, fs, i_1989_, f_1990_, f_1993_, f_1994_, aFloatArray7884);
							f = aFloatArray7884[0];
							f_1943_ = aFloatArray7884[1];
							method4730(class64.verticesX[i_1984_], class64.verticesY[i_1984_], class64.verticesZ[i_1984_], i_1986_, i_1987_, i_1988_, i_1950_, fs, i_1989_, f_1990_, f_1993_, f_1994_, aFloatArray7884);
							f_1944_ = aFloatArray7884[0];
							f_1945_ = aFloatArray7884[1];
							method4730(class64.verticesX[i_1985_], class64.verticesY[i_1985_], class64.verticesZ[i_1985_], i_1986_, i_1987_, i_1988_, i_1950_, fs, i_1989_, f_1990_, f_1993_, f_1994_, aFloatArray7884);
							f_1946_ = aFloatArray7884[0];
							f_1947_ = aFloatArray7884[1];
						} else if (i_1951_ == 3) {
							method4780(class64.verticesX[i_1983_], class64.verticesY[i_1983_], class64.verticesZ[i_1983_], i_1986_, i_1987_, i_1988_, fs, i_1989_, f_1990_, aFloatArray7884);
							f = aFloatArray7884[0];
							f_1943_ = aFloatArray7884[1];
							method4780(class64.verticesX[i_1984_], class64.verticesY[i_1984_], class64.verticesZ[i_1984_], i_1986_, i_1987_, i_1988_, fs, i_1989_, f_1990_, aFloatArray7884);
							f_1944_ = aFloatArray7884[0];
							f_1945_ = aFloatArray7884[1];
							method4780(class64.verticesX[i_1985_], class64.verticesY[i_1985_], class64.verticesZ[i_1985_], i_1986_, i_1987_, i_1988_, fs, i_1989_, f_1990_, aFloatArray7884);
							f_1946_ = aFloatArray7884[0];
							f_1947_ = aFloatArray7884[1];
							if ((i_1989_ & 0x1) == 0) {
								if (f_1944_ - f > 0.5F) {
									f_1944_--;
									i_1948_ = 1;
								} else if (f - f_1944_ > 0.5F) {
									f_1944_++;
									i_1948_ = 2;
								}
								if (f_1946_ - f > 0.5F) {
									f_1946_--;
									i_1949_ = 1;
								} else if (f - f_1946_ > 0.5F) {
									f_1946_++;
									i_1949_ = 2;
								}
							} else {
								if (f_1945_ - f_1943_ > 0.5F) {
									f_1945_--;
									i_1948_ = 1;
								} else if (f_1943_ - f_1945_ > 0.5F) {
									f_1945_++;
									i_1948_ = 2;
								}
								if (f_1947_ - f_1943_ > 0.5F) {
									f_1947_--;
									i_1949_ = 1;
								} else if (f_1943_ - f_1947_ > 0.5F) {
									f_1947_++;
									i_1949_ = 2;
								}
							}
						}
					}
				}
			}
			byte i_2010_;
			if (class64.facesType == null) {
				i_2010_ = (byte) 0;
			} else {
				i_2010_ = class64.facesType[i_1938_];
			}
			if (i_2010_ == 0) {
				long l = (i_1940_ << 2) + ((long) (i_1950_ << 24) + (long) (i_1939_ << 8) + i_1941_ << 32);
				short i_2011_ = class64.facesA[i_1938_];
				short i_2012_ = class64.facesB[i_1938_];
				short i_2013_ = class64.facesC[i_1938_];
				Vertex vertex = vertices[i_2011_];
				aShortArray7851[i_1937_] = method4828(class64, i_2011_, l, vertex.anInt464, vertex.anInt463, vertex.anInt465, vertex.anInt466, f, f_1943_);
				vertex = vertices[i_2012_];
				aShortArray7852[i_1937_] = method4828(class64, i_2012_, l + i_1948_, vertex.anInt464, vertex.anInt463, vertex.anInt465, vertex.anInt466, f_1944_, f_1945_);
				vertex = vertices[i_2013_];
				aShortArray7853[i_1937_] = method4828(class64, i_2013_, l + i_1949_, vertex.anInt464, vertex.anInt463, vertex.anInt465, vertex.anInt466, f_1946_, f_1947_);
			} else if (i_2010_ == 1) {
				Class37 class37 = class37s[i_1938_];
				long l = (i_1940_ << 2) + (class37.anInt426 > 0 ? 1024 : 2048) + (class37.anInt425 + 256 << 12) + (class37.anInt427 + 256 << 22) + ((long) (i_1950_ << 24) + (long) (i_1939_ << 8) + i_1941_ << 32);
				aShortArray7851[i_1937_] = method4828(class64, class64.facesA[i_1938_], l, class37.anInt426, class37.anInt425, class37.anInt427, 0, f, f_1943_);
				aShortArray7852[i_1937_] = method4828(class64, class64.facesB[i_1938_], l + i_1948_, class37.anInt426, class37.anInt425, class37.anInt427, 0, f_1944_, f_1945_);
				aShortArray7853[i_1937_] = method4828(class64, class64.facesC[i_1938_], l + i_1949_, class37.anInt426, class37.anInt425, class37.anInt427, 0, f_1946_, f_1947_);
			}
			if (class64.facesAlpha != null) {
				aByteArray7850[i_1937_] = class64.facesAlpha[i_1938_];
			}
			if (class64.submeshes_lookup != null) {
				aShortArray7856[i_1937_] = class64.submeshes_lookup[i_1938_];
			}
			aShortArray7849[i_1937_] = class64.facesColour[i_1938_];
			aShortArray7861[i_1937_] = i_1942_;
		}
		int i_2014_ = 0;
		short i_2015_ = -10000;
		for (int i_2016_ = 0; i_2016_ < anInt7885; i_2016_++) {
			short i_2017_ = aShortArray7861[i_2016_];
			if (i_2017_ != i_2015_) {
				i_2014_++;
				i_2015_ = i_2017_;
			}
		}
		anIntArray7859 = new int[i_2014_ + 1];
		i_2014_ = 0;
		i_2015_ = (short) -10000;
		for (int i_2018_ = 0; i_2018_ < anInt7885; i_2018_++) {
			short i_2019_ = aShortArray7861[i_2018_];
			if (i_2019_ != i_2015_) {
				anIntArray7859[i_2014_++] = i_2018_;
				i_2015_ = i_2019_;
			}
		}
		anIntArray7859[i_2014_] = anInt7885;
		aLongArray7883 = null;
		aShortArray7829 = method4829(aShortArray7829, anInt7839);
		aShortArray7841 = method4829(aShortArray7841, anInt7839);
		aShortArray7842 = method4829(aShortArray7842, anInt7839);
		aByteArray7887 = method4817(aByteArray7887, anInt7839);
		aFloatArray7845 = method4818(aFloatArray7845, anInt7839);
		aFloatArray7846 = method4818(aFloatArray7846, anInt7839);
		if (class64.verticesSkin != null && Class38.method459(i, anInt7826)) {
			verticesByLabel = class64.method749(false);
		}
		if (class64.aVertexNormalArray649 != null && Class38.method465(i, anInt7826)) {
			anIntArrayArray7882 = class64.method759();
		}
		if (class64.facesSkin != null && Class38.method463(i, anInt7826)) {
			int i_2020_ = 0;
			int[] is_2021_ = new int[256];
			for (int i_2022_ = 0; i_2022_ < anInt7847; i_2022_++) {
				int i_2023_ = class64.facesSkin[is[i_2022_]];
				if (i_2023_ >= 0) {
					is_2021_[i_2023_]++;
					if (i_2023_ > i_2020_) {
						i_2020_ = i_2023_;
					}
				}
			}
			anIntArrayArray7855 = new int[i_2020_ + 1][];
			for (int i_2024_ = 0; i_2024_ <= i_2020_; i_2024_++) {
				anIntArrayArray7855[i_2024_] = new int[is_2021_[i_2024_]];
				is_2021_[i_2024_] = 0;
			}
			for (int i_2025_ = 0; i_2025_ < anInt7847; i_2025_++) {
				int i_2026_ = class64.facesSkin[is[i_2025_]];
				if (i_2026_ >= 0) {
					anIntArrayArray7855[i_2026_][is_2021_[i_2026_]++] = i_2025_;
				}
			}
		}
	}

	@Override
	public void bs(int i, int i_2027_, Ground ground, Ground ground_2028_, int i_2029_, int i_2030_, int i_2031_) {
		if (!aBoolean7843) {
			method4831();
		}
		int i_2032_ = i_2029_ + aShort7870;
		int i_2033_ = i_2029_ + aShort7871;
		int i_2034_ = i_2031_ + aShort7872;
		int i_2035_ = i_2031_ + aShort7876;
		if (i != 1 && i != 2 && i != 3 && i != 5 || i_2032_ >= 0 && i_2033_ + ground.anInt6288 * -1212653763 >> ground.anInt6289 * -2137349879 < ground.anInt6287 * -506105871 && i_2034_ >= 0 && i_2035_ + ground.anInt6288 * -1212653763 >> ground.anInt6289 * -2137349879 < ground.anInt6286 * -1148794921) {
			if (i == 4 || i == 5) {
				if (ground_2028_ == null || i_2032_ < 0 || i_2033_ + ground_2028_.anInt6288 * -1212653763 >> ground_2028_.anInt6289 * -2137349879 >= ground_2028_.anInt6287 * -506105871 || i_2034_ < 0 || i_2035_ + ground_2028_.anInt6288 * -1212653763 >> ground_2028_.anInt6289 * -2137349879 >= ground_2028_.anInt6286 * -1148794921) {
					return;
				}
			} else {
				i_2032_ >>= ground.anInt6289 * -2137349879;
				i_2033_ = i_2033_ + ground.anInt6288 * -1212653763 - 1 >> ground.anInt6289 * -2137349879;
				i_2034_ >>= ground.anInt6289 * -2137349879;
				i_2035_ = i_2035_ + ground.anInt6288 * -1212653763 - 1 >> ground.anInt6289 * -2137349879;
				if (ground.method6341(i_2032_, i_2034_, (byte) -97) == i_2030_ && ground.method6341(i_2033_, i_2034_, (byte) -65) == i_2030_ && ground.method6341(i_2032_, i_2035_, (byte) -120) == i_2030_ && ground.method6341(i_2033_, i_2035_, (byte) -81) == i_2030_) {
					return;
				}
			}
			if (i == 1) {
				for (int i_2036_ = 0; i_2036_ < anInt7833; i_2036_++) {
					vertices_y[i_2036_] = vertices_y[i_2036_] + ground.method6340(vertices_x[i_2036_] + i_2029_, vertices_z[i_2036_] + i_2031_, -2002103279) - i_2030_;
				}
			} else if (i == 2) {
				int i_2037_ = aShort7868;
				if (i_2037_ == 0) {
					return;
				}
				for (int i_2038_ = 0; i_2038_ < anInt7833; i_2038_++) {
					int i_2039_ = (vertices_y[i_2038_] << 16) / i_2037_;
					if (i_2039_ < i_2027_) {
						vertices_y[i_2038_] = vertices_y[i_2038_] + (ground.method6340(vertices_x[i_2038_] + i_2029_, vertices_z[i_2038_] + i_2031_, -1796390951) - i_2030_) * (i_2027_ - i_2039_) / i_2027_;
					}
				}
			} else if (i == 3) {
				int i_2040_ = (i_2027_ & 0xff) * 4;
				int i_2041_ = (i_2027_ >> 8 & 0xff) * 4;
				int i_2042_ = (i_2027_ >> 16 & 0xff) << 6;
				int i_2043_ = (i_2027_ >> 24 & 0xff) << 6;
				if (i_2029_ - (i_2040_ >> 1) < 0 || i_2029_ + (i_2040_ >> 1) + ground.anInt6288 * -1212653763 >= ground.anInt6287 * -506105871 << ground.anInt6289 * -2137349879 || i_2031_ - (i_2041_ >> 1) < 0 || i_2031_ + (i_2041_ >> 1) + ground.anInt6288 * -1212653763 >= ground.anInt6286 * -1148794921 << ground.anInt6289 * -2137349879) {
					return;
				}
				method4732(ground, i_2029_, i_2030_, i_2031_, i_2040_, i_2041_, i_2042_, i_2043_);
			} else if (i == 4) {
				int i_2044_ = aShort7874 - aShort7868;
				for (int i_2045_ = 0; i_2045_ < anInt7833; i_2045_++) {
					vertices_y[i_2045_] = vertices_y[i_2045_] + ground_2028_.method6340(vertices_x[i_2045_] + i_2029_, vertices_z[i_2045_] + i_2031_, -1417639500) - i_2030_ + i_2044_;
				}
			} else if (i == 5) {
				int i_2046_ = aShort7874 - aShort7868;
				for (int i_2047_ = 0; i_2047_ < anInt7833; i_2047_++) {
					int i_2048_ = vertices_x[i_2047_] + i_2029_;
					int i_2049_ = vertices_z[i_2047_] + i_2031_;
					int i_2050_ = ground.method6340(i_2048_, i_2049_, -1535574432);
					int i_2051_ = ground_2028_.method6340(i_2048_, i_2049_, -1556941468);
					int i_2052_ = i_2050_ - i_2051_ - i_2027_;
					vertices_y[i_2047_] = ((vertices_y[i_2047_] << 8) / i_2046_ * i_2052_ >> 8) - (i_2030_ - i_2050_);
				}
			}
			if (aClass32_7831 != null) {
				aClass32_7831.anInterface1_397 = null;
			}
			aBoolean7843 = false;
		}
	}
}
