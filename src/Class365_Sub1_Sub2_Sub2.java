/* Class365_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365_Sub1_Sub2_Sub2 extends Class365_Sub1_Sub2 implements Interface3 {
	boolean aBoolean9912;
	ModelPart aModelPart_9913;
	Class_na aClass_na9914;
	int anInt9915;
	boolean aBoolean9916;
	byte aByte9917;
	ObjectTypeList aClass433_9918;
	boolean aBoolean9919;
	Class334 aClass334_9920;
	boolean aBoolean9921;

	@Override
	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			if (aClass334_9920 == null) {
				aClass334_9920 = Class472.method6063((int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, method4501(class_ra, 0, (byte) 68), 2029931481);
			}
			return aClass334_9920;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.bc(").append(')').toString());
		}
	}

	@Override
	boolean method4369() {
		if (null != aModelPart_9913) {
			return aModelPart_9913.i();
		}
		return false;
	}

	@Override
	public int method4361(int i) {
		try {
			return null != aModelPart_9913 ? aModelPart_9913.YA() : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.bm(").append(')').toString());
		}
	}

	ModelPart method4501(GraphicsToolkit class_ra, int i, byte i_0_) {
		try {
			if (aModelPart_9913 != null && class_ra.method5017(aModelPart_9913.m(), i) == 0) {
				return aModelPart_9913;
			}
			Class454 class454 = method4502(class_ra, i, false, -1886813239);
			if (null != class454) {
				return (ModelPart) class454.anObject5645;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.by(").append(')').toString());
		}
	}

	Class454 method4502(GraphicsToolkit class_ra, int i, boolean bool, int i_1_) {
		LocType class432 = aClass433_9918.list(2049836463 * anInt9915);
		Ground ground;
		Ground ground_2_;
		if (aBoolean9916) {
			ground = aSceneGraph_7722.aGroundArray3521[aByte7724];
			ground_2_ = aSceneGraph_7722.aGroundArray3519[0];
		} else {
			ground = aSceneGraph_7722.aGroundArray3519[aByte7724];
			if (aByte7724 < 3) {
				ground_2_ = aSceneGraph_7722.aGroundArray3519[aByte7724 + 1];
			} else {
				ground_2_ = null;
			}
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return class432.method5785(class_ra, i, Class424.aClass424_6610.anInt6613 * -1976050083, aByte9917, ground, ground_2_, (int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, bool, null, -474476261);
	}

	@Override
	boolean method4351() {
		if (null != aModelPart_9913) {
			return aModelPart_9913.i();
		}
		return false;
	}

	@Override
	public int method38() {
		return aByte9917;
	}

	@Override
	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.bb(").append(')').toString());
		}
	}

	@Override
	boolean method4350(GraphicsToolkit class_ra, int i, int i_3_, byte i_4_) {
		try {
			ModelPart modelPart = method4501(class_ra, 131072, (byte) 22);
			if (null != modelPart) {
				Matrix43f class222 = method4347();
				return modelPart.method4787(i, i_3_, class222, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.bu(").append(')').toString());
		}
	}

	@Override
	boolean method4366(int i) {
		try {
			return aBoolean9912;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.bw(").append(')').toString());
		}
	}

	@Override
	void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_5_, int i_6_, boolean bool, int i_7_) {
		try {
			if (class365_sub1 instanceof Class365_Sub1_Sub2_Sub2) {
				Class365_Sub1_Sub2_Sub2 class365_sub1_sub2_sub2_8_ = (Class365_Sub1_Sub2_Sub2) class365_sub1;
				if (aModelPart_9913 != null && null != class365_sub1_sub2_sub2_8_.aModelPart_9913) {
					aModelPart_9913.method4745(class365_sub1_sub2_sub2_8_.aModelPart_9913, i, i_5_, i_6_, bool);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.bk(").append(')').toString());
		}
	}

	@Override
	void method4398(byte i) {
		try {
			aBoolean9912 = false;
			if (aModelPart_9913 != null) {
				aModelPart_9913.KA(aModelPart_9913.m() & ~0x10000);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.bq(").append(')').toString());
		}
	}

	@Override
	boolean method4382() {
		if (null != aModelPart_9913) {
			return aModelPart_9913.i();
		}
		return false;
	}

	@Override
	public int method29(int i) {
		try {
			return Class424.aClass424_6610.anInt6613 * -1976050083;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.f(").append(')').toString());
		}
	}

	@Override
	public int method30(short i) {
		try {
			return aByte9917;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.b(").append(')').toString());
		}
	}

	@Override
	public void method31(byte i) {
		try {
			if (aModelPart_9913 != null) {
				aModelPart_9913.method4784();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.p(").append(')').toString());
		}
	}

	@Override
	public boolean method39(int i) {
		try {
			return aBoolean9921;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.i(").append(')').toString());
		}
	}

	@Override
	boolean method4383() {
		if (null != aModelPart_9913) {
			return aModelPart_9913.i();
		}
		return false;
	}

	@Override
	public void method37(GraphicsToolkit class_ra, int i) {
		Class_na class_na;
		if (aClass_na9914 == null && aBoolean9921) {
			Class454 class454 = method4502(class_ra, 262144, true, -1850458180);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = aClass_na9914;
			aClass_na9914 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (class_na != null) {
			aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 174451452);
		}
	}

	@Override
	public int method45() {
		return anInt9915 * 2049836463;
	}

	@Override
	public int method4380() {
		return null != aModelPart_9913 ? aModelPart_9913.YA() : 0;
	}

	@Override
	public int method35() {
		return Class424.aClass424_6610.anInt6613 * -1976050083;
	}

	@Override
	public int method42() {
		return aByte9917;
	}

	@Override
	boolean method4384() {
		return aBoolean9912;
	}

	@Override
	public void method34() {
		if (aModelPart_9913 != null) {
			aModelPart_9913.method4784();
		}
	}

	@Override
	public boolean method41() {
		return aBoolean9921;
	}

	@Override
	public void method28(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (aClass_na9914 == null && aBoolean9921) {
			Class454 class454 = method4502(class_ra, 262144, true, -1804274121);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = aClass_na9914;
			aClass_na9914 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (null != class_na) {
			aSceneGraph_7722.method4055(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, -1115505976);
		}
	}

	@Override
	public void method43(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (aClass_na9914 == null && aBoolean9921) {
			Class454 class454 = method4502(class_ra, 262144, true, -2127866030);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = aClass_na9914;
			aClass_na9914 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (class_na != null) {
			aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 1644514804);
		}
	}

	@Override
	public void method40(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (aClass_na9914 == null && aBoolean9921) {
			Class454 class454 = method4502(class_ra, 262144, true, -2044645596);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = aClass_na9914;
			aClass_na9914 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (class_na != null) {
			aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 710992193);
		}
	}

	public Class365_Sub1_Sub2_Sub2(SceneGraph sceneGraph, GraphicsToolkit class_ra, ObjectTypeList class433, LocType class432, int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_, boolean bool_14_) {
		super(sceneGraph, i_10_, i_11_, i_12_, i, i_9_, class432.anInt5418 * -228547261);
		aClass433_9918 = class433;
		anInt9915 = 646380829 * class432.id;
		aBoolean9916 = bool;
		aByte9917 = (byte) i_13_;
		aBoolean9919 = class432.anInt5382 * 1532834983 != 0 && !bool;
		aBoolean9912 = bool_14_;
		aBoolean9921 = class_ra.method5082() && class432.aBoolean5433 && !aBoolean9916 && GraphicsSetup.clientPreferences.sceneryShadowPreference.getValue(-1930969884) != 0;
		int i_15_ = 2048;
		if (aBoolean9912) {
			i_15_ |= 0x10000;
		}
		if (class432.aBoolean5441) {
			i_15_ |= 0x80000;
		}
		Class454 class454 = method4502(class_ra, i_15_, aBoolean9921, -2037171144);
		if (class454 != null) {
			aModelPart_9913 = (ModelPart) class454.anObject5645;
			aClass_na9914 = (Class_na) class454.anObject5646;
			if (aBoolean9912 || class432.aBoolean5441) {
				aModelPart_9913 = aModelPart_9913.method4755((byte) 0, i_15_, false);
				if (class432.aBoolean5441) {
					Class287 class287 = GameClient.map.method2632(-1945230052);
					aModelPart_9913.PA(1599271859 * class287.anInt3096, class287.anInt3097 * 1630923113, -1560648831 * class287.anInt3098, -57569897 * class287.anInt3099);
				}
			}
		}
		method4362(1, -105360757);
	}

	@Override
	boolean method4365() {
		if (null != aModelPart_9913) {
			return !aModelPart_9913.u();
		}
		return true;
	}

	@Override
	boolean method4374() {
		if (null != aModelPart_9913) {
			return !aModelPart_9913.u();
		}
		return true;
	}

	@Override
	public Class334 method4367(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (aClass334_9920 == null) {
			aClass334_9920 = Class472.method6063((int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, method4501(class_ra, 0, (byte) 71), 1982463178);
		}
		return aClass334_9920;
	}

	@Override
	public Class334 method4368(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (aClass334_9920 == null) {
			aClass334_9920 = Class472.method6063((int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, method4501(class_ra, 0, (byte) 44), 2033804861);
		}
		return aClass334_9920;
	}

	@Override
	public int method36() {
		return Class424.aClass424_6610.anInt6613 * -1976050083;
	}

	@Override
	void method4371(GraphicsToolkit class_ra) {
		/* empty */
	}

	@Override
	void method4373(GraphicsToolkit class_ra) {
		/* empty */
	}

	@Override
	boolean method4372(GraphicsToolkit class_ra, int i, int i_16_) {
		ModelPart modelPart = method4501(class_ra, 131072, (byte) 43);
		if (null != modelPart) {
			Matrix43f class222 = method4347();
			return modelPart.method4787(i, i_16_, class222, false, 0);
		}
		return false;
	}

	@Override
	boolean method4385(GraphicsToolkit class_ra, int i, int i_17_) {
		ModelPart modelPart = method4501(class_ra, 131072, (byte) 125);
		if (null != modelPart) {
			Matrix43f class222 = method4347();
			return modelPart.method4787(i, i_17_, class222, false, 0);
		}
		return false;
	}

	@Override
	boolean method4352(GraphicsToolkit class_ra, int i, int i_18_) {
		ModelPart modelPart = method4501(class_ra, 131072, (byte) 126);
		if (null != modelPart) {
			Matrix43f class222 = method4347();
			return modelPart.method4787(i, i_18_, class222, false, 0);
		}
		return false;
	}

	@Override
	void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_19_, int i_20_, boolean bool) {
		if (class365_sub1 instanceof Class365_Sub1_Sub2_Sub2) {
			Class365_Sub1_Sub2_Sub2 class365_sub1_sub2_sub2_21_ = (Class365_Sub1_Sub2_Sub2) class365_sub1;
			if (aModelPart_9913 != null && null != class365_sub1_sub2_sub2_21_.aModelPart_9913) {
				aModelPart_9913.method4745(class365_sub1_sub2_sub2_21_.aModelPart_9913, i, i_19_, i_20_, bool);
			}
		}
	}

	@Override
	Class335 method4370(GraphicsToolkit class_ra) {
		if (aModelPart_9913 == null) {
			return null;
		}
		Matrix43f class222 = method4347();
		Class335 class335 = Class73.method818(aBoolean9919, 1241916364);
		aModelPart_9913.method4739(class222, aClass302_Sub1Array7726[0], 0);
		return class335;
	}

	@Override
	void method4377() {
		aBoolean9912 = false;
		if (aModelPart_9913 != null) {
			aModelPart_9913.KA(aModelPart_9913.m() & ~0x10000);
		}
	}

	@Override
	void method4378() {
		aBoolean9912 = false;
		if (aModelPart_9913 != null) {
			aModelPart_9913.KA(aModelPart_9913.m() & ~0x10000);
		}
	}

	@Override
	public int method4379() {
		return null != aModelPart_9913 ? aModelPart_9913.YA() : 0;
	}

	@Override
	public void method44(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (aClass_na9914 == null && aBoolean9921) {
			Class454 class454 = method4502(class_ra, 262144, true, -1967364085);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = aClass_na9914;
			aClass_na9914 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (class_na != null) {
			aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 193928700);
		}
	}

	@Override
	public int method4381() {
		return null != aModelPart_9913 ? aModelPart_9913.YA() : 0;
	}

	@Override
	Class335 method4394(GraphicsToolkit class_ra, int i) {
		if (aModelPart_9913 == null) {
			return null;
		}
		Matrix43f positionMatrix = method4347();
		Matrix43f translatedMatrix = new Matrix43f(positionMatrix);
		if (anInt9915 * 2049836463 >= OSRSData.LOCS_OFFSET) {
			/**
			 * Level of OSRS ground decoration
			 */
			translatedMatrix.method2064(0f, -2, 0f);
		}
		Class335 class335 = Class73.method818(aBoolean9919, 2139686110);
		aModelPart_9913.method4739(translatedMatrix, aClass302_Sub1Array7726[0], 0);
		return class335;
	}

	@Override
	public void method33(GraphicsToolkit class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (aClass_na9914 == null && aBoolean9921) {
				Class454 class454 = method4502(class_ra, 262144, true, -2121821591);
				class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
			} else {
				class_na = aClass_na9914;
				aClass_na9914 = null;
			}
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			if (null != class_na) {
				aSceneGraph_7722.method4055(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, -412237236);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.k(").append(')').toString());
		}
	}

	@Override
	boolean method4349() {
		if (null != aModelPart_9913) {
			return aModelPart_9913.i();
		}
		return false;
	}

	@Override
	void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_22_, int i_23_, boolean bool) {
		if (class365_sub1 instanceof Class365_Sub1_Sub2_Sub2) {
			Class365_Sub1_Sub2_Sub2 class365_sub1_sub2_sub2_24_ = (Class365_Sub1_Sub2_Sub2) class365_sub1;
			if (aModelPart_9913 != null && null != class365_sub1_sub2_sub2_24_.aModelPart_9913) {
				aModelPart_9913.method4745(class365_sub1_sub2_sub2_24_.aModelPart_9913, i, i_22_, i_23_, bool);
			}
		}
	}

	@Override
	public int method32(byte i) {
		return anInt9915 * 2049836463;
	}

	@Override
	boolean method4353() {
		if (null != aModelPart_9913) {
			return !aModelPart_9913.u();
		}
		return true;
	}

	@Override
	boolean method4400() {
		return aBoolean9912;
	}

	@Override
	boolean method4386() {
		return aBoolean9912;
	}

	@Override
	boolean method4387() {
		return aBoolean9912;
	}

	@Override
	boolean method4376(short i) {
		try {
			if (null != aModelPart_9913) {
				return aModelPart_9913.i();
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.be(").append(')').toString());
		}
	}

	@Override
	boolean method4399(byte i) {
		try {
			if (null != aModelPart_9913) {
				return !aModelPart_9913.u();
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.bf(").append(')').toString());
		}
	}

	static final void method4503(ClientScript2 class403, int i) {
		try {
			int i_25_ = class403.integerstack[class403.integerPos * 1883543357];
			int i_26_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			if (i_26_ < 0 || i_26_ >= class403.anIntArray5236[i_25_]) {
				throw new RuntimeException();
			}
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = class403.anIntArrayArray5238[i_25_][i_26_];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wo.au(").append(')').toString());
		}
	}
}
