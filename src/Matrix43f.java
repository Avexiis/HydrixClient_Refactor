/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Matrix43f {
	float aFloat2492;
	float aFloat2493;
	float aFloat2494;
	float aFloat2495;
	float aFloat2496;
	float aFloat2497;
	float aFloat2498;
	float aFloat2499;
	float aFloat2500;
	float aFloat2501;
	float aFloat2502;
	float aFloat2503;
	public static Matrix43f aClass222_2504 = new Matrix43f();

	public Matrix43f(Matrix43f class222_0_) {
		method2070(class222_0_);
	}

	public void method2054(Class235 class235) {
		method2072(class235.aClass218_2600);
		method2063(class235.aSceneObjectPosition_2599);
	}

	public void method2055() {
		aFloat2493 = 0.0F;
		aFloat2503 = 0.0F;
		aFloat2492 = 0.0F;
		aFloat2500 = 0.0F;
		aFloat2499 = 0.0F;
		aFloat2498 = 0.0F;
		aFloat2496 = 0.0F;
		aFloat2495 = 0.0F;
		aFloat2502 = 0.0F;
		aFloat2501 = 1.0F;
		aFloat2497 = 1.0F;
		aFloat2494 = 1.0F;
	}

	public void method2056(int i, int i_1_, int i_2_, float f, float f_3_, float f_4_) {
		if (i != 0) {
			float f_5_ = Class215.aFloatArray2450[i & 0x3fff];
			float f_6_ = Class215.aFloatArray2449[i & 0x3fff];
			aFloat2501 = 1.0F;
			aFloat2500 = 0.0F;
			aFloat2499 = 0.0F;
			aFloat2498 = 0.0F;
			aFloat2495 = 0.0F;
			aFloat2494 = 2.0F * f_5_ * i_1_;
			aFloat2497 = 2.0F * f_5_ * i_2_;
			aFloat2502 = 2.0F * f_6_ * i_1_;
			aFloat2496 = -2.0F * f_6_ * i_2_;
			aFloat2492 = 2 * i_1_ * (0.5F * f_6_ - 0.5F * f_5_) + f;
			aFloat2503 = 2 * i_2_ * (-0.5F * f_6_ - 0.5F * f_5_) + f_3_;
			aFloat2493 = f_4_;
		} else {
			aFloat2500 = 0.0F;
			aFloat2499 = 0.0F;
			aFloat2498 = 0.0F;
			aFloat2496 = 0.0F;
			aFloat2495 = 0.0F;
			aFloat2502 = 0.0F;
			aFloat2494 = 2 * i_1_;
			aFloat2497 = 2 * i_2_;
			aFloat2501 = 1.0F;
			aFloat2492 = f - i_1_;
			aFloat2503 = f_3_ - i_2_;
			aFloat2493 = f_4_;
		}
	}

	public void method2057(float f, float f_7_, float f_8_, float f_9_, float f_10_, float f_11_, float f_12_, float f_13_, float f_14_) {
		aFloat2494 = f;
		aFloat2496 = f_9_;
		aFloat2499 = f_12_;
		aFloat2492 = 0.0F;
		aFloat2502 = f_7_;
		aFloat2497 = f_10_;
		aFloat2500 = f_13_;
		aFloat2503 = 0.0F;
		aFloat2495 = f_8_;
		aFloat2498 = f_11_;
		aFloat2501 = f_14_;
		aFloat2493 = 0.0F;
	}

	public void method2058() {
		float f = aFloat2492;
		float f_15_ = aFloat2503;
		float f_16_ = aFloat2496;
		aFloat2496 = aFloat2502;
		aFloat2502 = f_16_;
		float f_17_ = aFloat2499;
		aFloat2499 = aFloat2495;
		aFloat2495 = f_17_;
		float f_18_ = aFloat2500;
		aFloat2500 = aFloat2498;
		aFloat2498 = f_18_;
		aFloat2492 = -(f * aFloat2494 + f_15_ * aFloat2496 + aFloat2493 * aFloat2499);
		aFloat2503 = -(f * aFloat2502 + f_15_ * aFloat2497 + aFloat2493 * aFloat2500);
		aFloat2493 = -(f * aFloat2495 + f_15_ * aFloat2498 + aFloat2493 * aFloat2501);
	}

	public void method2059(float f, float f_19_, float f_20_, float f_21_) {
		float f_22_ = (float) Math.cos(f_21_);
		float f_23_ = (float) Math.sin(f_21_);
		aFloat2494 = f_22_ + f * f * (1.0F - f_22_);
		aFloat2502 = f_20_ * f_23_ + f_19_ * f * (1.0F - f_22_);
		aFloat2495 = -f_19_ * f_23_ + f_20_ * f * (1.0F - f_22_);
		aFloat2496 = -f_20_ * f_23_ + f * f_19_ * (1.0F - f_22_);
		aFloat2497 = f_22_ + f_19_ * f_19_ * (1.0F - f_22_);
		aFloat2498 = f * f_23_ + f_20_ * f_19_ * (1.0F - f_22_);
		aFloat2499 = f_19_ * f_23_ + f * f_20_ * (1.0F - f_22_);
		aFloat2500 = -f * f_23_ + f_19_ * f_20_ * (1.0F - f_22_);
		aFloat2501 = f_22_ + f_20_ * f_20_ * (1.0F - f_22_);
		aFloat2493 = 0.0F;
		aFloat2503 = 0.0F;
		aFloat2492 = 0.0F;
	}

	public Matrix43f() {
		method2055();
	}

	void method2060(float f, float f_24_, float f_25_, float f_26_) {
		float f_27_ = f * f;
		float f_28_ = f * f_24_;
		float f_29_ = f * f_25_;
		float f_30_ = f * f_26_;
		float f_31_ = f_24_ * f_24_;
		float f_32_ = f_24_ * f_25_;
		float f_33_ = f_24_ * f_26_;
		float f_34_ = f_25_ * f_25_;
		float f_35_ = f_25_ * f_26_;
		aFloat2494 = 1.0F - 2.0F * (f_31_ + f_34_);
		aFloat2496 = 2.0F * (f_28_ - f_35_);
		aFloat2499 = 2.0F * (f_29_ + f_33_);
		aFloat2502 = 2.0F * (f_28_ + f_35_);
		aFloat2497 = 1.0F - 2.0F * (f_27_ + f_34_);
		aFloat2500 = 2.0F * (f_32_ - f_30_);
		aFloat2495 = 2.0F * (f_29_ - f_33_);
		aFloat2498 = 2.0F * (f_32_ + f_30_);
		aFloat2501 = 1.0F - 2.0F * (f_27_ + f_31_);
		aFloat2493 = 0.0F;
		aFloat2503 = 0.0F;
		aFloat2492 = 0.0F;
	}

	public void method2061(float f, float f_36_, float f_37_) {
		aFloat2494 *= f;
		aFloat2496 *= f;
		aFloat2499 *= f;
		aFloat2492 *= f;
		aFloat2502 *= f_36_;
		aFloat2497 *= f_36_;
		aFloat2500 *= f_36_;
		aFloat2503 *= f_36_;
		aFloat2495 *= f_37_;
		aFloat2498 *= f_37_;
		aFloat2501 *= f_37_;
		aFloat2493 *= f_37_;
	}

	public void method2062(float f, float f_38_, float f_39_) {
		aFloat2500 = 0.0F;
		aFloat2499 = 0.0F;
		aFloat2498 = 0.0F;
		aFloat2496 = 0.0F;
		aFloat2495 = 0.0F;
		aFloat2502 = 0.0F;
		aFloat2501 = 1.0F;
		aFloat2497 = 1.0F;
		aFloat2494 = 1.0F;
		aFloat2492 = f;
		aFloat2503 = f_38_;
		aFloat2493 = f_39_;
	}

	void method2063(SceneObjectPosition sceneObjectPosition) {
		method2064(sceneObjectPosition.x, sceneObjectPosition.y, sceneObjectPosition.z);
	}

	public void method2064(float f, float f_40_, float f_41_) {
		aFloat2492 += f;
		aFloat2503 += f_40_;
		aFloat2493 += f_41_;
	}

	public void method2065(float f, float f_42_, float f_43_) {
		aFloat2494 = f;
		aFloat2496 = 0.0F;
		aFloat2499 = 0.0F;
		aFloat2492 = 0.0F;
		aFloat2502 = 0.0F;
		aFloat2497 = f_42_;
		aFloat2500 = 0.0F;
		aFloat2503 = 0.0F;
		aFloat2495 = 0.0F;
		aFloat2498 = 0.0F;
		aFloat2501 = f_43_;
		aFloat2493 = 0.0F;
	}

	public void method2066(float f, float f_44_, float f_45_, float[] fs) {
		f -= aFloat2492;
		f_44_ -= aFloat2503;
		f_45_ -= aFloat2493;
		fs[0] = (int) (aFloat2494 * f + aFloat2502 * f_44_ + aFloat2495 * f_45_);
		fs[1] = (int) (aFloat2496 * f + aFloat2497 * f_44_ + aFloat2498 * f_45_);
		fs[2] = (int) (aFloat2499 * f + aFloat2500 * f_44_ + aFloat2501 * f_45_);
	}

	public float[] method2067(float[] fs) {
		fs[0] = aFloat2492;
		fs[1] = aFloat2503;
		fs[2] = aFloat2493;
		return fs;
	}

	public void method2068(Matrix43f class222_46_, Matrix43f class222_47_) {
		aFloat2494 = class222_46_.aFloat2494 * class222_47_.aFloat2494 + class222_46_.aFloat2502 * class222_47_.aFloat2496 + class222_46_.aFloat2495 * class222_47_.aFloat2499;
		aFloat2502 = class222_46_.aFloat2494 * class222_47_.aFloat2502 + class222_46_.aFloat2502 * class222_47_.aFloat2497 + class222_46_.aFloat2495 * class222_47_.aFloat2500;
		aFloat2495 = class222_46_.aFloat2494 * class222_47_.aFloat2495 + class222_46_.aFloat2502 * class222_47_.aFloat2498 + class222_46_.aFloat2495 * class222_47_.aFloat2501;
		aFloat2496 = class222_46_.aFloat2496 * class222_47_.aFloat2494 + class222_46_.aFloat2497 * class222_47_.aFloat2496 + class222_46_.aFloat2498 * class222_47_.aFloat2499;
		aFloat2497 = class222_46_.aFloat2496 * class222_47_.aFloat2502 + class222_46_.aFloat2497 * class222_47_.aFloat2497 + class222_46_.aFloat2498 * class222_47_.aFloat2500;
		aFloat2498 = class222_46_.aFloat2496 * class222_47_.aFloat2495 + class222_46_.aFloat2497 * class222_47_.aFloat2498 + class222_46_.aFloat2498 * class222_47_.aFloat2501;
		aFloat2499 = class222_46_.aFloat2499 * class222_47_.aFloat2494 + class222_46_.aFloat2500 * class222_47_.aFloat2496 + class222_46_.aFloat2501 * class222_47_.aFloat2499;
		aFloat2500 = class222_46_.aFloat2499 * class222_47_.aFloat2502 + class222_46_.aFloat2500 * class222_47_.aFloat2497 + class222_46_.aFloat2501 * class222_47_.aFloat2500;
		aFloat2501 = class222_46_.aFloat2499 * class222_47_.aFloat2495 + class222_46_.aFloat2500 * class222_47_.aFloat2498 + class222_46_.aFloat2501 * class222_47_.aFloat2501;
		aFloat2492 = class222_46_.aFloat2492 * class222_47_.aFloat2494 + class222_46_.aFloat2503 * class222_47_.aFloat2496 + class222_46_.aFloat2493 * class222_47_.aFloat2499 + class222_47_.aFloat2492;
		aFloat2503 = class222_46_.aFloat2492 * class222_47_.aFloat2502 + class222_46_.aFloat2503 * class222_47_.aFloat2497 + class222_46_.aFloat2493 * class222_47_.aFloat2500 + class222_47_.aFloat2503;
		aFloat2493 = class222_46_.aFloat2492 * class222_47_.aFloat2495 + class222_46_.aFloat2503 * class222_47_.aFloat2498 + class222_46_.aFloat2493 * class222_47_.aFloat2501 + class222_47_.aFloat2493;
	}

	public void method2069(float[] fs) {
		float f = fs[0] - aFloat2492;
		float f_48_ = fs[1] - aFloat2503;
		float f_49_ = fs[2] - aFloat2493;
		fs[0] = (int) (aFloat2494 * f + aFloat2502 * f_48_ + aFloat2495 * f_49_);
		fs[1] = (int) (aFloat2496 * f + aFloat2497 * f_48_ + aFloat2498 * f_49_);
		fs[2] = (int) (aFloat2499 * f + aFloat2500 * f_48_ + aFloat2501 * f_49_);
	}

	public void method2070(Matrix43f class222_50_) {
		aFloat2494 = class222_50_.aFloat2494;
		aFloat2496 = class222_50_.aFloat2496;
		aFloat2499 = class222_50_.aFloat2499;
		aFloat2492 = class222_50_.aFloat2492;
		aFloat2502 = class222_50_.aFloat2502;
		aFloat2497 = class222_50_.aFloat2497;
		aFloat2500 = class222_50_.aFloat2500;
		aFloat2503 = class222_50_.aFloat2503;
		aFloat2495 = class222_50_.aFloat2495;
		aFloat2498 = class222_50_.aFloat2498;
		aFloat2501 = class222_50_.aFloat2501;
		aFloat2493 = class222_50_.aFloat2493;
	}

	public void method2071(float f, float f_51_, float f_52_, float f_53_) {
		float f_54_ = (float) Math.cos(f_53_);
		float f_55_ = (float) Math.sin(f_53_);
		float f_56_ = f_54_ + f * f * (1.0F - f_54_);
		float f_57_ = f_52_ * f_55_ + f_51_ * f * (1.0F - f_54_);
		float f_58_ = -f_51_ * f_55_ + f_52_ * f * (1.0F - f_54_);
		float f_59_ = -f_52_ * f_55_ + f * f_51_ * (1.0F - f_54_);
		float f_60_ = f_54_ + f_51_ * f_51_ * (1.0F - f_54_);
		float f_61_ = f * f_55_ + f_52_ * f_51_ * (1.0F - f_54_);
		float f_62_ = f_51_ * f_55_ + f * f_52_ * (1.0F - f_54_);
		float f_63_ = -f * f_55_ + f_51_ * f_52_ * (1.0F - f_54_);
		float f_64_ = f_54_ + f_52_ * f_52_ * (1.0F - f_54_);
		float f_65_ = aFloat2494;
		float f_66_ = aFloat2502;
		float f_67_ = aFloat2496;
		float f_68_ = aFloat2497;
		float f_69_ = aFloat2499;
		float f_70_ = aFloat2500;
		float f_71_ = aFloat2492;
		float f_72_ = aFloat2503;
		aFloat2494 = f_65_ * f_56_ + f_66_ * f_59_ + aFloat2495 * f_62_;
		aFloat2502 = f_65_ * f_57_ + f_66_ * f_60_ + aFloat2495 * f_63_;
		aFloat2495 = f_65_ * f_58_ + f_66_ * f_61_ + aFloat2495 * f_64_;
		aFloat2496 = f_67_ * f_56_ + f_68_ * f_59_ + aFloat2498 * f_62_;
		aFloat2497 = f_67_ * f_57_ + f_68_ * f_60_ + aFloat2498 * f_63_;
		aFloat2498 = f_67_ * f_58_ + f_68_ * f_61_ + aFloat2498 * f_64_;
		aFloat2499 = f_69_ * f_56_ + f_70_ * f_59_ + aFloat2501 * f_62_;
		aFloat2500 = f_69_ * f_57_ + f_70_ * f_60_ + aFloat2501 * f_63_;
		aFloat2501 = f_69_ * f_58_ + f_70_ * f_61_ + aFloat2501 * f_64_;
		aFloat2492 = f_71_ * f_56_ + f_72_ * f_59_ + aFloat2493 * f_62_;
		aFloat2503 = f_71_ * f_57_ + f_72_ * f_60_ + aFloat2493 * f_63_;
		aFloat2493 = f_71_ * f_58_ + f_72_ * f_61_ + aFloat2493 * f_64_;
	}

	void method2072(Class218 class218) {
		method2060(class218.aFloat2461, class218.aFloat2458, class218.aFloat2462, class218.aFloat2463);
	}

	public void method2073(Matrix43f class222_73_) {
		float f = aFloat2494;
		float f_74_ = aFloat2502;
		float f_75_ = aFloat2496;
		float f_76_ = aFloat2497;
		float f_77_ = aFloat2499;
		float f_78_ = aFloat2500;
		float f_79_ = aFloat2492;
		float f_80_ = aFloat2503;
		float f_81_ = aFloat2495;
		float f_82_ = aFloat2498;
		float f_83_ = aFloat2501;
		float f_84_ = aFloat2493;
		aFloat2494 = f * class222_73_.aFloat2494 + f_74_ * class222_73_.aFloat2496 + f_81_ * class222_73_.aFloat2499;
		aFloat2502 = f * class222_73_.aFloat2502 + f_74_ * class222_73_.aFloat2497 + f_81_ * class222_73_.aFloat2500;
		aFloat2495 = f * class222_73_.aFloat2495 + f_74_ * class222_73_.aFloat2498 + f_81_ * class222_73_.aFloat2501;
		aFloat2496 = f_75_ * class222_73_.aFloat2494 + f_76_ * class222_73_.aFloat2496 + f_82_ * class222_73_.aFloat2499;
		aFloat2497 = f_75_ * class222_73_.aFloat2502 + f_76_ * class222_73_.aFloat2497 + f_82_ * class222_73_.aFloat2500;
		aFloat2498 = f_75_ * class222_73_.aFloat2495 + f_76_ * class222_73_.aFloat2498 + f_82_ * class222_73_.aFloat2501;
		aFloat2499 = f_77_ * class222_73_.aFloat2494 + f_78_ * class222_73_.aFloat2496 + f_83_ * class222_73_.aFloat2499;
		aFloat2500 = f_77_ * class222_73_.aFloat2502 + f_78_ * class222_73_.aFloat2497 + f_83_ * class222_73_.aFloat2500;
		aFloat2501 = f_77_ * class222_73_.aFloat2495 + f_78_ * class222_73_.aFloat2498 + f_83_ * class222_73_.aFloat2501;
		aFloat2492 = f_79_ * class222_73_.aFloat2494 + f_80_ * class222_73_.aFloat2496 + f_84_ * class222_73_.aFloat2499 + class222_73_.aFloat2492;
		aFloat2503 = f_79_ * class222_73_.aFloat2502 + f_80_ * class222_73_.aFloat2497 + f_84_ * class222_73_.aFloat2500 + class222_73_.aFloat2503;
		aFloat2493 = f_79_ * class222_73_.aFloat2495 + f_80_ * class222_73_.aFloat2498 + f_84_ * class222_73_.aFloat2501 + class222_73_.aFloat2493;
	}

	public void method2074(Matrix43f class222_85_) {
		if (class222_85_ == this) {
			method2058();
		} else {
			aFloat2494 = class222_85_.aFloat2494;
			aFloat2496 = class222_85_.aFloat2502;
			aFloat2499 = class222_85_.aFloat2495;
			aFloat2502 = class222_85_.aFloat2496;
			aFloat2497 = class222_85_.aFloat2497;
			aFloat2500 = class222_85_.aFloat2498;
			aFloat2495 = class222_85_.aFloat2499;
			aFloat2498 = class222_85_.aFloat2500;
			aFloat2501 = class222_85_.aFloat2501;
			aFloat2492 = -(class222_85_.aFloat2492 * aFloat2494 + class222_85_.aFloat2503 * aFloat2496 + class222_85_.aFloat2493 * aFloat2499);
			aFloat2503 = -(class222_85_.aFloat2492 * aFloat2502 + class222_85_.aFloat2503 * aFloat2497 + class222_85_.aFloat2493 * aFloat2500);
			aFloat2493 = -(class222_85_.aFloat2492 * aFloat2495 + class222_85_.aFloat2503 * aFloat2498 + class222_85_.aFloat2493 * aFloat2501);
		}
	}

	public void method2075(float[] fs) {
		float f = fs[0];
		float f_86_ = fs[1];
		float f_87_ = fs[2];
		fs[0] = aFloat2494 * f + aFloat2502 * f_86_ + aFloat2495 * f_87_;
		fs[1] = aFloat2496 * f + aFloat2497 * f_86_ + aFloat2498 * f_87_;
		fs[2] = aFloat2499 * f + aFloat2500 * f_86_ + aFloat2501 * f_87_;
	}

	public void method2076(Class235 class235) {
		float f = class235.aClass218_2600.aFloat2463 * class235.aClass218_2600.aFloat2463;
		float f_88_ = class235.aClass218_2600.aFloat2463 * class235.aClass218_2600.aFloat2461;
		float f_89_ = class235.aClass218_2600.aFloat2463 * class235.aClass218_2600.aFloat2458;
		float f_90_ = class235.aClass218_2600.aFloat2463 * class235.aClass218_2600.aFloat2462;
		float f_91_ = class235.aClass218_2600.aFloat2461 * class235.aClass218_2600.aFloat2461;
		float f_92_ = class235.aClass218_2600.aFloat2461 * class235.aClass218_2600.aFloat2458;
		float f_93_ = class235.aClass218_2600.aFloat2461 * class235.aClass218_2600.aFloat2462;
		float f_94_ = class235.aClass218_2600.aFloat2458 * class235.aClass218_2600.aFloat2458;
		float f_95_ = class235.aClass218_2600.aFloat2458 * class235.aClass218_2600.aFloat2462;
		float f_96_ = class235.aClass218_2600.aFloat2462 * class235.aClass218_2600.aFloat2462;
		aFloat2494 = f_91_ + f - f_96_ - f_94_;
		aFloat2502 = f_92_ + f_90_ + f_92_ + f_90_;
		aFloat2495 = f_93_ - f_89_ - f_89_ + f_93_;
		aFloat2496 = f_92_ - f_90_ - f_90_ + f_92_;
		aFloat2497 = f_94_ + f - f_91_ - f_96_;
		aFloat2498 = f_95_ + f_88_ + f_95_ + f_88_;
		aFloat2499 = f_93_ + f_89_ + f_93_ + f_89_;
		aFloat2500 = f_95_ - f_88_ - f_88_ + f_95_;
		aFloat2501 = f_96_ + f - f_94_ - f_91_;
		aFloat2492 = class235.aSceneObjectPosition_2599.x;
		aFloat2503 = class235.aSceneObjectPosition_2599.y;
		aFloat2493 = class235.aSceneObjectPosition_2599.z;
	}

	public void method2077(float f, float f_97_, float f_98_, float[] fs) {
		fs[0] = aFloat2494 * f + aFloat2496 * f_97_ + aFloat2499 * f_98_ + aFloat2492;
		fs[1] = aFloat2502 * f + aFloat2497 * f_97_ + aFloat2500 * f_98_ + aFloat2503;
		fs[2] = aFloat2495 * f + aFloat2498 * f_97_ + aFloat2501 * f_98_ + aFloat2493;
	}
}
