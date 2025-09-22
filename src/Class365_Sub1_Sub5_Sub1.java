/* Class365_Sub1_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class365_Sub1_Sub5_Sub1 extends Class365_Sub1_Sub5 implements Interface3 {
	static int[] anIntArray9890 = { 1, 2, 4, 8 };
	static int[] anIntArray9891 = { 16, 32, 64, 128 };
	boolean aBoolean9892;
	ModelPart aModelPart_9893;
	Class_na aClass_na9894;
	Class334 aClass334_9895;
	int anInt9896;
	byte aByte9897;
	ObjectTypeList aClass433_9898;
	byte aByte9899;
	boolean aBoolean9900;
	boolean aBoolean9901;
	boolean aBoolean9902;

	boolean method4384() {
		return ((Class365_Sub1_Sub5_Sub1) this).aBoolean9892;
	}

	boolean method4399(byte i) {
		try {
			if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
				return !((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bf(").append(')').toString());
		}
	}

	boolean method4376(short i) {
		try {
			if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
				return ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.be(").append(')').toString());
		}
	}

	public int method4361(int i) {
		try {
			return (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null ? ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bm(").append(')').toString());
		}
	}

	ModelPart method4523(GraphicsToolkit class_ra, int i, int i_0_) {
		try {
			if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 && class_ra.method5017(((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.m(), i) == 0)
				return ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893;
			Class454 class454 = method4524(class_ra, i, false, (byte) -90);
			if (null != class454)
				return (ModelPart) class454.anObject5645;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bl(").append(')').toString());
		}
	}

	Class454 method4524(GraphicsToolkit class_ra, int i, boolean bool, byte i_1_) {
		try {
			LocType class432 = (((Class365_Sub1_Sub5_Sub1) this).aClass433_9898.list(1940788231 * ((Class365_Sub1_Sub5_Sub1) this).anInt9896));
			Ground ground;
			Ground ground_2_;
			if (((Class365_Sub1_Sub5_Sub1) this).aBoolean9901) {
				ground = aSceneGraph_7722.aGroundArray3521[aByte7724];
				ground_2_ = aSceneGraph_7722.aGroundArray3519[0];
			} else {
				ground = aSceneGraph_7722.aGroundArray3519[aByte7724];
				if (aByte7724 < 3)
					ground_2_ = aSceneGraph_7722.aGroundArray3519[aByte7724 + 1];
				else
					ground_2_ = null;
			}
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			return (class432.method5785(class_ra, i, ((Class365_Sub1_Sub5_Sub1) this).aByte9899, ((Class365_Sub1_Sub5_Sub1) this).aByte9897, ground, ground_2_, (int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, bool, null, 566759128));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.br(").append(')').toString());
		}
	}

	public boolean method39(int i) {
		try {
			return ((Class365_Sub1_Sub5_Sub1) this).aBoolean9902;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.i(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 == null)
				return null;
			Matrix43f class222 = method4347();
			Class335 class335 = Class73.method818((((Class365_Sub1_Sub5_Sub1) this).aBoolean9900), 1739349745);
			((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4739(class222, aClass302_Sub1Array7726[0], 0);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bo(").append(')').toString());
		}
	}

	boolean method4382() {
		if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
			return ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.i();
		return false;
	}

	boolean method4366(int i) {
		try {
			return ((Class365_Sub1_Sub5_Sub1) this).aBoolean9892;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bw(").append(')').toString());
		}
	}

	void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_3_, int i_4_, boolean bool, int i_5_) {
		try {
			if (class365_sub1 instanceof Class365_Sub1_Sub5_Sub1) {
				Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1_6_ = (Class365_Sub1_Sub5_Sub1) class365_sub1;
				if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null && (((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1_6_).aModelPart_9893) != null)
					((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4745(((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1_6_).aModelPart_9893, i, i_3_, i_4_, bool);
			} else if (class365_sub1 instanceof Class365_Sub1_Sub1_Sub6) {
				Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6 = (Class365_Sub1_Sub1_Sub6) class365_sub1;
				if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null && (((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6).aModelPart_9879) != null)
					((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4745((((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6).aModelPart_9879), i, i_3_, i_4_, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bk(").append(')').toString());
		}
	}

	void method4398(byte i) {
		try {
			((Class365_Sub1_Sub5_Sub1) this).aBoolean9892 = false;
			if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null)
				((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.KA(((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.m() & ~0x10000);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bq(").append(')').toString());
		}
	}

	public int method35() {
		return ((Class365_Sub1_Sub5_Sub1) this).aByte9899;
	}

	public int method29(int i) {
		try {
			return ((Class365_Sub1_Sub5_Sub1) this).aByte9899;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.f(").append(')').toString());
		}
	}

	public int method30(short i) {
		try {
			return ((Class365_Sub1_Sub5_Sub1) this).aByte9897;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.b(").append(')').toString());
		}
	}

	boolean method4351() {
		if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
			return ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.i();
		return false;
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 == null)
			return null;
		Matrix43f class222 = method4347();
		Class335 class335 = Class73.method818(((Class365_Sub1_Sub5_Sub1) this).aBoolean9900, 1174280404);
		((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4739(class222, aClass302_Sub1Array7726[0], 0);
		return class335;
	}

	boolean method4383() {
		if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
			return ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.i();
		return false;
	}

	void method4377() {
		((Class365_Sub1_Sub5_Sub1) this).aBoolean9892 = false;
		if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null)
			((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.KA(((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.m() & ~0x10000);
	}

	public int method45() {
		return 1940788231 * ((Class365_Sub1_Sub5_Sub1) this).anInt9896;
	}

	public int method36() {
		return ((Class365_Sub1_Sub5_Sub1) this).aByte9899;
	}

	public void method40(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 && ((Class365_Sub1_Sub5_Sub1) this).aBoolean9902) {
			Class454 class454 = method4524(class_ra, 262144, true, (byte) -75);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894;
			((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (null != class_na)
			aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 1555439691);
	}

	public int method42() {
		return ((Class365_Sub1_Sub5_Sub1) this).aByte9897;
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_7_, byte i_8_) {
		try {
			ModelPart modelPart = method4523(class_ra, 131072, -546231639);
			if (modelPart != null) {
				Matrix43f class222 = method4347();
				return modelPart.method4787(i, i_7_, class222, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bu(").append(')').toString());
		}
	}

	public void method34() {
		if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
			((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4784();
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (null == ((Class365_Sub1_Sub5_Sub1) this).aClass334_9895)
			((Class365_Sub1_Sub5_Sub1) this).aClass334_9895 = Class472.method6063((int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, method4523(class_ra, 0, -541574626), 2030586614);
		return ((Class365_Sub1_Sub5_Sub1) this).aClass334_9895;
	}

	public void method28(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 && ((Class365_Sub1_Sub5_Sub1) this).aBoolean9902) {
			Class454 class454 = method4524(class_ra, 262144, true, (byte) -35);
			class_na = (Class_na) (null != class454 ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894;
			((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (null != class_na)
			aSceneGraph_7722.method4055(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 932138106);
	}

	public int method32(byte i) {
		try {
			return 1940788231 * ((Class365_Sub1_Sub5_Sub1) this).anInt9896;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.a(").append(')').toString());
		}
	}

	public void method44(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 && ((Class365_Sub1_Sub5_Sub1) this).aBoolean9902) {
			Class454 class454 = method4524(class_ra, 262144, true, (byte) -118);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894;
			((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (null != class_na)
			aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 1480402841);
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (null == ((Class365_Sub1_Sub5_Sub1) this).aClass334_9895)
			((Class365_Sub1_Sub5_Sub1) this).aClass334_9895 = Class472.method6063((int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, method4523(class_ra, 0, -2141517966), 2144329713);
		return ((Class365_Sub1_Sub5_Sub1) this).aClass334_9895;
	}

	boolean method4353() {
		if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
			return !((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.u();
		return true;
	}

	public Class365_Sub1_Sub5_Sub1(SceneGraph sceneGraph, GraphicsToolkit class_ra, ObjectTypeList class433, LocType class432, int i, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, int i_13_, int i_14_, boolean bool_15_) {
		super(sceneGraph, i_10_, i_11_, i_12_, i, i_9_, VertexNormal.method952(i_13_, i_14_, 800544861));
		((Class365_Sub1_Sub5_Sub1) this).aClass433_9898 = class433;
		((Class365_Sub1_Sub5_Sub1) this).anInt9896 = class432.id * 584655573;
		((Class365_Sub1_Sub5_Sub1) this).aBoolean9901 = bool;
		((Class365_Sub1_Sub5_Sub1) this).aByte9899 = (byte) i_13_;
		((Class365_Sub1_Sub5_Sub1) this).aByte9897 = (byte) i_14_;
		((Class365_Sub1_Sub5_Sub1) this).aBoolean9900 = 0 != 1532834983 * class432.anInt5382 && !bool;
		((Class365_Sub1_Sub5_Sub1) this).aBoolean9892 = bool_15_;
		((Class365_Sub1_Sub5_Sub1) this).aBoolean9902 = (class_ra.method5082() && class432.aBoolean5433 && !((Class365_Sub1_Sub5_Sub1) this).aBoolean9901 && GraphicsSetup.clientPreferences.sceneryShadowPreference.getValue(57385915) != 0);
		int i_16_ = 2048;
		if (((Class365_Sub1_Sub5_Sub1) this).aBoolean9892)
			i_16_ |= 0x10000;
		if (class432.aBoolean5441)
			i_16_ |= 0x80000;
		Class454 class454 = method4524(class_ra, i_16_, ((Class365_Sub1_Sub5_Sub1) this).aBoolean9902, (byte) -72);
		if (class454 != null) {
			((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 = (ModelPart) class454.anObject5645;
			((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 = (Class_na) class454.anObject5646;
			if (((Class365_Sub1_Sub5_Sub1) this).aBoolean9892 || class432.aBoolean5441) {
				((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 = ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4755((byte) 0, i_16_, false);
				if (class432.aBoolean5441) {
					Class287 class287 = GameClient.map.method2632(-2131923625);
					((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.PA(class287.anInt3096 * 1599271859, 1630923113 * class287.anInt3097, class287.anInt3098 * -1560648831, class287.anInt3099 * -57569897);
				}
			}
		}
		method4362(1, -1008898449);
	}

	boolean method4374() {
		if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
			return !((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.u();
		return true;
	}

	public void method37(GraphicsToolkit class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 && ((Class365_Sub1_Sub5_Sub1) this).aBoolean9902) {
				Class454 class454 = method4524(class_ra, 262144, true, (byte) -99);
				class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
			} else {
				class_na = ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894;
				((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 = null;
			}
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			if (null != class_na)
				aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 580390895);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.d(").append(')').toString());
		}
	}

	boolean method4365() {
		if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
			return !((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.u();
		return true;
	}

	void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_17_, int i_18_, boolean bool) {
		if (class365_sub1 instanceof Class365_Sub1_Sub5_Sub1) {
			Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1_19_ = (Class365_Sub1_Sub5_Sub1) class365_sub1;
			if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null && (((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1_19_).aModelPart_9893) != null)
				((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4745((((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1_19_).aModelPart_9893), i, i_17_, i_18_, bool);
		} else if (class365_sub1 instanceof Class365_Sub1_Sub1_Sub6) {
			Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6 = (Class365_Sub1_Sub1_Sub6) class365_sub1;
			if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null && (((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6).aModelPart_9879) != null)
				((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4745((((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6).aModelPart_9879), i, i_17_, i_18_, bool);
		}
	}

	void method4371(GraphicsToolkit class_ra) {
		/* empty */
	}

	void method4373(GraphicsToolkit class_ra) {
		/* empty */
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_20_) {
		ModelPart modelPart = method4523(class_ra, 131072, -1405605049);
		if (modelPart != null) {
			Matrix43f class222 = method4347();
			return modelPart.method4787(i, i_20_, class222, false, 0);
		}
		return false;
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_21_) {
		ModelPart modelPart = method4523(class_ra, 131072, -189727936);
		if (modelPart != null) {
			Matrix43f class222 = method4347();
			return modelPart.method4787(i, i_21_, class222, false, 0);
		}
		return false;
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_22_) {
		ModelPart modelPart = method4523(class_ra, 131072, -673650245);
		if (modelPart != null) {
			Matrix43f class222 = method4347();
			return modelPart.method4787(i, i_22_, class222, false, 0);
		}
		return false;
	}

	void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_23_, int i_24_, boolean bool) {
		if (class365_sub1 instanceof Class365_Sub1_Sub5_Sub1) {
			Class365_Sub1_Sub5_Sub1 class365_sub1_sub5_sub1_25_ = (Class365_Sub1_Sub5_Sub1) class365_sub1;
			if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null && (((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1_25_).aModelPart_9893) != null)
				((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4745((((Class365_Sub1_Sub5_Sub1) class365_sub1_sub5_sub1_25_).aModelPart_9893), i, i_23_, i_24_, bool);
		} else if (class365_sub1 instanceof Class365_Sub1_Sub1_Sub6) {
			Class365_Sub1_Sub1_Sub6 class365_sub1_sub1_sub6 = (Class365_Sub1_Sub1_Sub6) class365_sub1;
			if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null && (((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6).aModelPart_9879) != null)
				((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4745((((Class365_Sub1_Sub1_Sub6) class365_sub1_sub1_sub6).aModelPart_9879), i, i_23_, i_24_, bool);
		}
	}

	public void method33(GraphicsToolkit class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 && ((Class365_Sub1_Sub5_Sub1) this).aBoolean9902) {
				Class454 class454 = method4524(class_ra, 262144, true, (byte) 2);
				class_na = (Class_na) (null != class454 ? class454.anObject5646 : null);
			} else {
				class_na = ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894;
				((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 = null;
			}
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			if (null != class_na)
				aSceneGraph_7722.method4055(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 2001227588);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.k(").append(')').toString());
		}
	}

	boolean method4387() {
		return ((Class365_Sub1_Sub5_Sub1) this).aBoolean9892;
	}

	void method4378() {
		((Class365_Sub1_Sub5_Sub1) this).aBoolean9892 = false;
		if (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null)
			((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.KA(((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.m() & ~0x10000);
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			if (null == ((Class365_Sub1_Sub5_Sub1) this).aClass334_9895)
				((Class365_Sub1_Sub5_Sub1) this).aClass334_9895 = Class472.method6063((int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, method4523(class_ra, 0, -187426704), 2051250714);
			return ((Class365_Sub1_Sub5_Sub1) this).aClass334_9895;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bc(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bb(").append(')').toString());
		}
	}

	public int method4381() {
		return (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null ? ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.YA() : 0);
	}

	boolean method4369() {
		if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
			return ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.i();
		return false;
	}

	boolean method4400() {
		return ((Class365_Sub1_Sub5_Sub1) this).aBoolean9892;
	}

	boolean method4349() {
		if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
			return ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.i();
		return false;
	}

	public void method43(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 && ((Class365_Sub1_Sub5_Sub1) this).aBoolean9902) {
			Class454 class454 = method4524(class_ra, 262144, true, (byte) -118);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub5_Sub1) this).aClass_na9894;
			((Class365_Sub1_Sub5_Sub1) this).aClass_na9894 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (null != class_na)
			aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 310306064);
	}

	public boolean method41() {
		return ((Class365_Sub1_Sub5_Sub1) this).aBoolean9902;
	}

	public void method31(byte i) {
		try {
			if (null != ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893)
				((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.method4784();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.p(").append(')').toString());
		}
	}

	public int method4380() {
		return (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null ? ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.YA() : 0);
	}

	boolean method4386() {
		return ((Class365_Sub1_Sub5_Sub1) this).aBoolean9892;
	}

	public int method38() {
		return ((Class365_Sub1_Sub5_Sub1) this).aByte9897;
	}

	public int method4379() {
		return (((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893 != null ? ((Class365_Sub1_Sub5_Sub1) this).aModelPart_9893.YA() : 0);
	}

	public static boolean method4525(boolean bool, int i) {
		try {
			boolean bool_26_ = OverlayType.activeToolkit.method5054();
			if (bool != bool_26_) {
				if (bool) {
					if (!OverlayType.activeToolkit.method5052())
						bool = false;
				} else
					OverlayType.activeToolkit.method5053();
				if (bool != bool_26_) {
					GraphicsSetup.clientPreferences.method3540((GraphicsSetup.clientPreferences.bloomPreference), bool ? 1 : 0, -1863602535);
					Class3.writePreferences();
					return true;
				}
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.gg(").append(')').toString());
		}
	}

	static final void method4526(ClientScript2 class403, int i) {
		try {
			int i_27_ = (((ClientScript2) class403).integerstack[((ClientScript2) class403).integerPos * 1883543357]);
			String string = (String) Class313.anObjectArray3298[i_27_];
			if (string == null)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.bp(").append(')').toString());
		}
	}

	static final void method4527(ClientScript2 class403, int i) {
		try {
			int i_28_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			WorldMapLabel worldMapLabel = Class363.aWorldMapLabelList_3931.method4116(i_28_, -1520948528);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = worldMapLabel.anInt3783 * 1023000389;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.amx(").append(')').toString());
		}
	}

	static void method4528(File file, byte i) {
		try {
			Class304.aFile3265 = file;
			if (!Class304.aFile3265.exists())
				throw new RuntimeException("");
			Class304.aBoolean3266 = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.a(").append(')').toString());
		}
	}

	static void method4529(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		try {
			Class82_Sub22.method940(DevConsoleInit.anIntArrayArray4047[i_30_++], i, i_29_, i_32_, 718097597);
			Class82_Sub22.method940(DevConsoleInit.anIntArrayArray4047[i_31_--], i, i_29_, i_32_, 1200953445);
			for (int i_34_ = i_30_; i_34_ <= i_31_; i_34_++) {
				int[] is = DevConsoleInit.anIntArrayArray4047[i_34_];
				is[i] = is[i_29_] = i_32_;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wg.v(").append(')').toString());
		}
	}
}
