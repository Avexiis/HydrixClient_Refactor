/* Class365_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365_Sub1_Sub3_Sub2 extends Class365_Sub1_Sub3 implements Interface3 {
	Class334 aClass334_9922;
	ObjectTypeList aClass433_9923;
	Class_na aClass_na9924;
	ModelPart aModelPart_9925;
	int anInt9926;
	byte aByte9927;
	byte aByte9928;
	boolean aBoolean9929;
	boolean aBoolean9930;
	boolean aBoolean9931;
	static String aString9932;
	static Class329 aClass329_9933;

	boolean method4365() {
		if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
			return !((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.u();
		return true;
	}

	boolean method4399(byte i) {
		try {
			if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
				return !((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.bf(").append(')').toString());
		}
	}

	boolean method4376(short i) {
		try {
			if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
				return ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.be(").append(')').toString());
		}
	}

	public int method4361(int i) {
		try {
			return (((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925 != null ? ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.bm(").append(')').toString());
		}
	}

	ModelPart method4510(GraphicsToolkit class_ra, int i, int i_0_) {
		try {
			if (((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925 != null && class_ra.method5017(((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.m(), i) == 0)
				return ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925;
			Class454 class454 = method4511(class_ra, i, false, -1045378786);
			if (class454 != null)
				return (ModelPart) class454.anObject5645;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.by(").append(')').toString());
		}
	}

	public void method37(GraphicsToolkit class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 == null && ((Class365_Sub1_Sub3_Sub2) this).aBoolean9931) {
				Class454 class454 = method4511(class_ra, 262144, true, -1658395754);
				class_na = (Class_na) (null != class454 ? class454.anObject5646 : null);
			} else {
				class_na = ((Class365_Sub1_Sub3_Sub2) this).aClass_na9924;
				((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 = null;
			}
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			if (class_na != null)
				aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 1462465403);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.d(").append(')').toString());
		}
	}

	public int method4379() {
		return (((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925 != null ? ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.YA() : 0);
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			if (((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925 == null)
				return null;
			Matrix43f class222 = class_ra.method5178();
			class222.method2070(method4347());
			class222.method2064((float) aShort9802, 0.0F, (float) aShort9803);
			Class335 class335 = Class73.method818((((Class365_Sub1_Sub3_Sub2) this).aBoolean9930), 1295089573);
			((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.method4739(class222, aClass302_Sub1Array7726[0], 0);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.bo(").append(')').toString());
		}
	}

	public int method30(short i) {
		try {
			return ((Class365_Sub1_Sub3_Sub2) this).aByte9928;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.b(").append(')').toString());
		}
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_1_, byte i_2_) {
		try {
			ModelPart modelPart = method4510(class_ra, 131072, 1991691041);
			if (modelPart != null) {
				Matrix43f class222 = method4347();
				return modelPart.method4787(i, i_1_, class222, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.bu(").append(')').toString());
		}
	}

	public int method32(byte i) {
		try {
			return 2016845759 * ((Class365_Sub1_Sub3_Sub2) this).anInt9926;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.a(").append(')').toString());
		}
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (((Class365_Sub1_Sub3_Sub2) this).aClass334_9922 == null)
			((Class365_Sub1_Sub3_Sub2) this).aClass334_9922 = Class472.method6063((int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, method4510(class_ra, 0, 2120690814), 2092013456);
		return ((Class365_Sub1_Sub3_Sub2) this).aClass334_9922;
	}

	boolean method4374() {
		if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
			return !((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.u();
		return true;
	}

	public void method31(byte i) {
		try {
			if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
				((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.method4784();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.p(").append(')').toString());
		}
	}

	public boolean method39(int i) {
		try {
			return ((Class365_Sub1_Sub3_Sub2) this).aBoolean9931;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.i(").append(')').toString());
		}
	}

	public void method33(GraphicsToolkit class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == ((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 && ((Class365_Sub1_Sub3_Sub2) this).aBoolean9931) {
				Class454 class454 = method4511(class_ra, 262144, true, 443427270);
				class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
			} else {
				class_na = ((Class365_Sub1_Sub3_Sub2) this).aClass_na9924;
				((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 = null;
			}
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			if (null != class_na)
				aSceneGraph_7722.method4055(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, -1121841328);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.k(").append(')').toString());
		}
	}

	public int method29(int i) {
		try {
			return ((Class365_Sub1_Sub3_Sub2) this).aByte9927;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.f(").append(')').toString());
		}
	}

	public void method43(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 == null && ((Class365_Sub1_Sub3_Sub2) this).aBoolean9931) {
			Class454 class454 = method4511(class_ra, 262144, true, -1081449109);
			class_na = (Class_na) (null != class454 ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub3_Sub2) this).aClass_na9924;
			((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (class_na != null)
			aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 206431233);
	}

	public int method36() {
		return ((Class365_Sub1_Sub3_Sub2) this).aByte9927;
	}

	public int method35() {
		return ((Class365_Sub1_Sub3_Sub2) this).aByte9927;
	}

	public int method42() {
		return ((Class365_Sub1_Sub3_Sub2) this).aByte9928;
	}

	public int method38() {
		return ((Class365_Sub1_Sub3_Sub2) this).aByte9928;
	}

	public void method34() {
		if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
			((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.method4784();
	}

	public boolean method41() {
		return ((Class365_Sub1_Sub3_Sub2) this).aBoolean9931;
	}

	public void method28(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 && ((Class365_Sub1_Sub3_Sub2) this).aBoolean9931) {
			Class454 class454 = method4511(class_ra, 262144, true, 1299260710);
			class_na = (Class_na) (class454 != null ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub3_Sub2) this).aClass_na9924;
			((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (null != class_na)
			aSceneGraph_7722.method4055(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 2128182901);
	}

	public Class365_Sub1_Sub3_Sub2(SceneGraph sceneGraph, GraphicsToolkit class_ra, ObjectTypeList class433, LocType class432, int i, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_, int i_8_, int i_9_, int i_10_) {
		super(sceneGraph, i_4_, i_5_, i_6_, i, i_3_, i_7_, i_8_);
		((Class365_Sub1_Sub3_Sub2) this).aClass433_9923 = class433;
		((Class365_Sub1_Sub3_Sub2) this).anInt9926 = class432.id * 1469074669;
		((Class365_Sub1_Sub3_Sub2) this).aBoolean9929 = bool;
		((Class365_Sub1_Sub3_Sub2) this).aByte9928 = (byte) i_10_;
		((Class365_Sub1_Sub3_Sub2) this).aByte9927 = (byte) i_9_;
		((Class365_Sub1_Sub3_Sub2) this).aBoolean9930 = 0 != class432.anInt5382 * 1532834983 && !bool;
		((Class365_Sub1_Sub3_Sub2) this).aBoolean9931 = (class_ra.method5082() && class432.aBoolean5433 && !((Class365_Sub1_Sub3_Sub2) this).aBoolean9929 && GraphicsAutoSetup.clientPreferences.sceneryShadowPreference.getValue(-208809184) != 0);
		int i_11_ = 2048;
		if (class432.aBoolean5441)
			i_11_ |= 0x80000;
		Class454 class454 = method4511(class_ra, i_11_, ((Class365_Sub1_Sub3_Sub2) this).aBoolean9931, -772904584);
		if (null != class454) {
			((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925 = (ModelPart) class454.anObject5645;
			((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 = (Class_na) class454.anObject5646;
			if (class432.aBoolean5441) {
				((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925 = ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.method4755((byte) 0, i_11_, false);
				if (class432.aBoolean5441) {
					Class287 class287 = GameClient.map.method2632(-2114342399);
					((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.PA(1599271859 * class287.anInt3096, class287.anInt3097 * 1630923113, -1560648831 * class287.anInt3098, -57569897 * class287.anInt3099);
				}
			}
		}
		method4362(1, -1063190052);
	}

	public void method44(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 == null && ((Class365_Sub1_Sub3_Sub2) this).aBoolean9931) {
			Class454 class454 = method4511(class_ra, 262144, true, 833087212);
			class_na = (Class_na) (null != class454 ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub3_Sub2) this).aClass_na9924;
			((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (class_na != null)
			aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 1342747444);
	}

	public int method45() {
		return 2016845759 * ((Class365_Sub1_Sub3_Sub2) this).anInt9926;
	}

	boolean method4353() {
		if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
			return !((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.u();
		return true;
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			if (((Class365_Sub1_Sub3_Sub2) this).aClass334_9922 == null)
				((Class365_Sub1_Sub3_Sub2) this).aClass334_9922 = Class472.method6063((int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, method4510(class_ra, 0, 1964135899), 2090651504);
			return ((Class365_Sub1_Sub3_Sub2) this).aClass334_9922;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.bc(").append(')').toString());
		}
	}

	boolean method4369() {
		if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
			return ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.i();
		return false;
	}

	public void method40(GraphicsToolkit class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 == null && ((Class365_Sub1_Sub3_Sub2) this).aBoolean9931) {
			Class454 class454 = method4511(class_ra, 262144, true, 258900059);
			class_na = (Class_na) (null != class454 ? class454.anObject5646 : null);
		} else {
			class_na = ((Class365_Sub1_Sub3_Sub2) this).aClass_na9924;
			((Class365_Sub1_Sub3_Sub2) this).aClass_na9924 = null;
		}
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (class_na != null)
			aSceneGraph_7722.method4047(class_na, aByte7724, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, 510453328);
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		if (((Class365_Sub1_Sub3_Sub2) this).aClass334_9922 == null)
			((Class365_Sub1_Sub3_Sub2) this).aClass334_9922 = Class472.method6063((int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, method4510(class_ra, 0, 1878583731), 1989490846);
		return ((Class365_Sub1_Sub3_Sub2) this).aClass334_9922;
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		if (((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925 == null)
			return null;
		Matrix43f class222 = class_ra.method5178();
		class222.method2070(method4347());
		class222.method2064((float) aShort9802, 0.0F, (float) aShort9803);
		Class335 class335 = Class73.method818(((Class365_Sub1_Sub3_Sub2) this).aBoolean9930, 1438144079);
		((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.method4739(class222, aClass302_Sub1Array7726[0], 0);
		return class335;
	}

	void method4371(GraphicsToolkit class_ra) {
		/* empty */
	}

	void method4373(GraphicsToolkit class_ra) {
		/* empty */
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_12_) {
		ModelPart modelPart = method4510(class_ra, 131072, 1910114060);
		if (modelPart != null) {
			Matrix43f class222 = method4347();
			return modelPart.method4787(i, i_12_, class222, false, 0);
		}
		return false;
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_13_) {
		ModelPart modelPart = method4510(class_ra, 131072, 2092256266);
		if (modelPart != null) {
			Matrix43f class222 = method4347();
			return modelPart.method4787(i, i_13_, class222, false, 0);
		}
		return false;
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_14_) {
		ModelPart modelPart = method4510(class_ra, 131072, 2046392588);
		if (modelPart != null) {
			Matrix43f class222 = method4347();
			return modelPart.method4787(i, i_14_, class222, false, 0);
		}
		return false;
	}

	public int method4380() {
		return (((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925 != null ? ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.YA() : 0);
	}

	Class454 method4511(GraphicsToolkit class_ra, int i, boolean bool, int i_15_) {
		try {
			LocType class432 = (((Class365_Sub1_Sub3_Sub2) this).aClass433_9923.list(2016845759 * ((Class365_Sub1_Sub3_Sub2) this).anInt9926));
			Ground ground;
			Ground ground_16_;
			if (((Class365_Sub1_Sub3_Sub2) this).aBoolean9929) {
				ground = aSceneGraph_7722.aGroundArray3521[aByte7724];
				ground_16_ = aSceneGraph_7722.aGroundArray3519[0];
			} else {
				ground = aSceneGraph_7722.aGroundArray3519[aByte7724];
				if (aByte7724 < 3)
					ground_16_ = aSceneGraph_7722.aGroundArray3519[aByte7724 + 1];
				else
					ground_16_ = null;
			}
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			return (class432.method5785(class_ra, i, ((Class365_Sub1_Sub3_Sub2) this).aByte9927, ((Class365_Sub1_Sub3_Sub2) this).aByte9928, ground, ground_16_, (int) sceneObjectPosition.x, (int) sceneObjectPosition.y, (int) sceneObjectPosition.z, bool, null, -911505460));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.bl(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.bb(").append(')').toString());
		}
	}

	boolean method4349() {
		if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
			return ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.i();
		return false;
	}

	boolean method4383() {
		if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
			return ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.i();
		return false;
	}

	boolean method4351() {
		if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
			return ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.i();
		return false;
	}

	boolean method4382() {
		if (null != ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925)
			return ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.i();
		return false;
	}

	public int method4381() {
		return (((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925 != null ? ((Class365_Sub1_Sub3_Sub2) this).aModelPart_9925.YA() : 0);
	}

	public static void method4512(int i) {
		try {
			Class423.aClass57_5356 = null;
			Class74.aClass57_700 = null;
			Class313.aClass57_3299 = null;
			Class501.aClass57_6123 = null;
			Class82_Sub8.aClass57_6855 = null;
			Class486.aClass57_6062 = null;
			Class367.aClass57_4001 = null;
			OverlayType.aClass57_4070 = null;
			Class65.aClass264_664 = null;
			Class211.aClass505_2420 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.ak(").append(')').toString());
		}
	}

	public static int[] method4513(int i, int i_17_, int i_18_, int i_19_, int i_20_, float f, boolean bool, int i_21_) {
		try {
			int[] is = new int[i];
			Class298_Sub32_Sub34 class298_sub32_sub34 = new Class298_Sub32_Sub34();
			((Class298_Sub32_Sub34) class298_sub32_sub34).anInt9543 = -1333197873 * i_17_;
			((Class298_Sub32_Sub34) class298_sub32_sub34).aBoolean9548 = bool;
			((Class298_Sub32_Sub34) class298_sub32_sub34).anInt9546 = 1143174821 * i_18_;
			((Class298_Sub32_Sub34) class298_sub32_sub34).anInt9545 = 2124139087 * i_19_;
			((Class298_Sub32_Sub34) class298_sub32_sub34).anInt9547 = -1820512295 * i_20_;
			((Class298_Sub32_Sub34) class298_sub32_sub34).anInt9544 = 52875281 * (int) (4096.0F * f);
			class298_sub32_sub34.method3133(-369839691);
			Class250.method2397(i, 1, (byte) 24);
			class298_sub32_sub34.method3356(0, is, -2040071008);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.bf(").append(')').toString());
		}
	}

	static void method4514(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		try {
			int i_28_ = i_26_ + i_23_;
			int i_29_ = i_24_ - i_26_;
			for (int i_30_ = i_23_; i_30_ < i_28_; i_30_++)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_30_]), i, i_22_, i_25_, 1081395615);
			for (int i_31_ = i_24_; i_31_ > i_29_; i_31_--)
				Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_31_]), i, i_22_, i_25_, -1329971917);
			int i_32_ = i + i_26_;
			int i_33_ = i_22_ - i_26_;
			for (int i_34_ = i_28_; i_34_ <= i_29_; i_34_++) {
				int[] is = Class372_Sub3.anIntArrayArray4047[i_34_];
				Class82_Sub22.method940(is, i, i_32_, i_25_, -1691383948);
				Class82_Sub22.method940(is, i_33_, i_22_, i_25_, -1133427569);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.y(").append(')').toString());
		}
	}

	static void method4515(int i, byte i_35_) {
		try {
			Class419.anInt5341 = -249626013 * i;
			synchronized (Class462.aClass348_5682) {
				Class462.aClass348_5682.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wq.f(").append(')').toString());
		}
	}
}
