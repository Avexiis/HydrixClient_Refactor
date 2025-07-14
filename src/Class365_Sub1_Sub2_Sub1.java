/* Class365_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365_Sub1_Sub2_Sub1 extends Class365_Sub1_Sub2 implements Interface3 {
	boolean aBoolean9907 = true;
	boolean aBoolean9908;
	Class334 aClass334_9909;
	public Class60 aClass60_9910;
	static long aLong9911;

	final void method4378() {
		throw new IllegalStateException();
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_0_, byte i_1_) {
		try {
			ModelPart modelPart = aClass60_9910.method700(class_ra, 131072, false, false, (byte) -17);
			if (modelPart == null)
				return false;
			return modelPart.method4787(i, i_0_, method4347(), false, 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.bu(").append(')').toString());
		}
	}

	boolean method4376(short i) {
		try {
			return ((Class365_Sub1_Sub2_Sub1) this).aBoolean9907;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.be(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			return ((Class365_Sub1_Sub2_Sub1) this).aClass334_9909;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.bc(").append(')').toString());
		}
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_2_) {
		ModelPart modelPart = aClass60_9910.method700(class_ra, 131072, false, false, (byte) -18);
		if (modelPart == null)
			return false;
		return modelPart.method4787(i, i_2_, method4347(), false, 0);
	}

	public int method4363(byte i) {
		try {
			return aClass60_9910.method699(2132571778);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.bx(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			ModelPart modelPart = aClass60_9910.method700(class_ra, 2048, false, true, (byte) 42);
			if (null == modelPart)
				return null;
			Matrix43f class222 = method4347();
			Class235 class235 = method4337();
			Class335 class335 = Class73.method818((((Class365_Sub1_Sub2_Sub1) this).aBoolean9908), 1432921779);
			int i_3_ = (int) class235.aSceneObjectPosition_2599.x >> 9;
			int i_4_ = (int) class235.aSceneObjectPosition_2599.z >> 9;
			aClass60_9910.method701(class_ra, modelPart, class222, i_3_, i_3_, i_4_, i_4_, true, 244174707);
			modelPart.method4739(class222, aClass302_Sub1Array7726[0], 0);
			if (null != ((Class60) aClass60_9910).aClickableGeometry_602) {
				Class69 class69 = ((Class60) aClass60_9910).aClickableGeometry_602.method4229();
				class_ra.method5042(class69);
			}
			((Class365_Sub1_Sub2_Sub1) this).aBoolean9907 = (modelPart.i() || null != ((Class60) aClass60_9910).aClickableGeometry_602);
			if (null == ((Class365_Sub1_Sub2_Sub1) this).aClass334_9909)
				((Class365_Sub1_Sub2_Sub1) this).aClass334_9909 = Class472.method6063((int) (class235.aSceneObjectPosition_2599.x), (int) (class235.aSceneObjectPosition_2599.y), (int) (class235.aSceneObjectPosition_2599.z), modelPart, 2034122433);
			else
				Class264_Sub2.method2507(((Class365_Sub1_Sub2_Sub1) this).aClass334_9909, (int) class235.aSceneObjectPosition_2599.x, (int) class235.aSceneObjectPosition_2599.y, (int) class235.aSceneObjectPosition_2599.z, modelPart, (byte) 83);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.bo(").append(')').toString());
		}
	}

	public Class365_Sub1_Sub2_Sub1(SceneGraph sceneGraph, GraphicsToolkit class_ra, ObjectTypeList class433, LocType class432, int i, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_, int i_10_) {
		super(sceneGraph, i_6_, i_7_, i_8_, i, i_5_, -228547261 * class432.anInt5418);
		aClass60_9910 = new Class60(class_ra, class433, class432, Class424.aClass424_6610.anInt6613 * -1976050083, i_9_, i, i_5_, this, bool, i_10_);
		((Class365_Sub1_Sub2_Sub1) this).aBoolean9908 = class432.anInt5382 * 1532834983 != 0 && !bool;
		method4362(1, 397760713);
	}

	public void method40(GraphicsToolkit class_ra) {
		aClass60_9910.method707(class_ra, -475225909);
	}

	final boolean method4366(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.bw(").append(')').toString());
		}
	}

	final void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_11_, int i_12_, boolean bool, int i_13_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.bk(").append(')').toString());
		}
	}

	final void method4398(byte i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.bq(").append(')').toString());
		}
	}

	public int method32(byte i) {
		try {
			return 1686561661 * ((Class60) aClass60_9910).anInt601;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.a(").append(')').toString());
		}
	}

	public int method29(int i) {
		try {
			return -1598457753 * ((Class60) aClass60_9910).anInt589;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.f(").append(')').toString());
		}
	}

	public int method30(short i) {
		try {
			return 748228569 * ((Class60) aClass60_9910).anInt590;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.b(").append(')').toString());
		}
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_14_) {
		ModelPart modelPart = aClass60_9910.method700(class_ra, 131072, false, false, (byte) -51);
		if (modelPart == null)
			return false;
		return modelPart.method4787(i, i_14_, method4347(), false, 0);
	}

	boolean method4399(byte i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.bf(").append(')').toString());
		}
	}

	final void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_15_, int i_16_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method4495(Class435 class435, byte i) {
		try {
			aClass60_9910.method698(class435, -748656560);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.by(").append(')').toString());
		}
	}

	public void method37(GraphicsToolkit class_ra, int i) {
		try {
			aClass60_9910.method707(class_ra, -475225909);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.d(").append(')').toString());
		}
	}

	public int method36() {
		return -1598457753 * ((Class60) aClass60_9910).anInt589;
	}

	public int method35() {
		return -1598457753 * ((Class60) aClass60_9910).anInt589;
	}

	public int method42() {
		return 748228569 * ((Class60) aClass60_9910).anInt590;
	}

	public int method38() {
		return 748228569 * ((Class60) aClass60_9910).anInt590;
	}

	public void method34() {
		/* empty */
	}

	public boolean method41() {
		return aClass60_9910.method706(16957801);
	}

	public void method28(GraphicsToolkit class_ra) {
		aClass60_9910.method702(class_ra, -1400920433);
	}

	public void method43(GraphicsToolkit class_ra) {
		aClass60_9910.method707(class_ra, -475225909);
	}

	void method4373(GraphicsToolkit class_ra) {
		ModelPart modelPart = aClass60_9910.method700(class_ra, 262144, true, true, (byte) 5);
		if (null != modelPart) {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			int i = (int) sceneObjectPosition.x >> 9;
			int i_17_ = (int) sceneObjectPosition.z >> 9;
			aClass60_9910.method701(class_ra, modelPart, method4347(), i, i, i_17_, i_17_, false, 264840409);
		}
	}

	public int method4361(int i) {
		try {
			return aClass60_9910.method705(-2145027593);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.bm(").append(')').toString());
		}
	}

	public int method45() {
		return 1686561661 * ((Class60) aClass60_9910).anInt601;
	}

	boolean method4365() {
		return false;
	}

	boolean method4374() {
		return false;
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		return ((Class365_Sub1_Sub2_Sub1) this).aClass334_9909;
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		return ((Class365_Sub1_Sub2_Sub1) this).aClass334_9909;
	}

	public int method4496() {
		return aClass60_9910.method699(2084300626);
	}

	public void method33(GraphicsToolkit class_ra, int i) {
		try {
			aClass60_9910.method702(class_ra, 1192057266);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.k(").append(')').toString());
		}
	}

	public void method44(GraphicsToolkit class_ra) {
		aClass60_9910.method707(class_ra, -475225909);
	}

	void method4371(GraphicsToolkit class_ra) {
		ModelPart modelPart = aClass60_9910.method700(class_ra, 262144, true, true, (byte) -9);
		if (null != modelPart) {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			int i = (int) sceneObjectPosition.x >> 9;
			int i_18_ = (int) sceneObjectPosition.z >> 9;
			aClass60_9910.method701(class_ra, modelPart, method4347(), i, i, i_18_, i_18_, false, 1404836454);
		}
	}

	public int method4380() {
		return aClass60_9910.method705(1657985578);
	}

	final boolean method4387() {
		return false;
	}

	public int method4381() {
		return aClass60_9910.method705(-1816306113);
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_19_) {
		ModelPart modelPart = aClass60_9910.method700(class_ra, 131072, false, false, (byte) -102);
		if (modelPart == null)
			return false;
		return modelPart.method4787(i, i_19_, method4347(), false, 0);
	}

	final void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_20_, int i_21_, boolean bool) {
		throw new IllegalStateException();
	}

	public boolean method39(int i) {
		try {
			return aClass60_9910.method706(260525653);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.i(").append(')').toString());
		}
	}

	final void method4377() {
		throw new IllegalStateException();
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			ModelPart modelPart = aClass60_9910.method700(class_ra, 262144, true, true, (byte) -16);
			if (null != modelPart) {
				SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
				int i_22_ = (int) sceneObjectPosition.x >> 9;
				int i_23_ = (int) sceneObjectPosition.z >> 9;
				aClass60_9910.method701(class_ra, modelPart, method4347(), i_22_, i_22_, i_23_, i_23_, false, 1937927561);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.bb(").append(')').toString());
		}
	}

	public int method4379() {
		return aClass60_9910.method705(1926384337);
	}

	final boolean method4386() {
		return false;
	}

	boolean method4369() {
		return ((Class365_Sub1_Sub2_Sub1) this).aBoolean9907;
	}

	boolean method4382() {
		return ((Class365_Sub1_Sub2_Sub1) this).aBoolean9907;
	}

	boolean method4349() {
		return ((Class365_Sub1_Sub2_Sub1) this).aBoolean9907;
	}

	boolean method4383() {
		return ((Class365_Sub1_Sub2_Sub1) this).aBoolean9907;
	}

	boolean method4351() {
		return ((Class365_Sub1_Sub2_Sub1) this).aBoolean9907;
	}

	final boolean method4384() {
		return false;
	}

	boolean method4353() {
		return false;
	}

	public void method31(byte i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.p(").append(')').toString());
		}
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		ModelPart modelPart = aClass60_9910.method700(class_ra, 2048, false, true, (byte) -3);
		if (null == modelPart)
			return null;
		Matrix43f class222 = method4347();
		Class235 class235 = method4337();
		Class335 class335 = Class73.method818(((Class365_Sub1_Sub2_Sub1) this).aBoolean9908, 1939994642);
		int i = (int) class235.aSceneObjectPosition_2599.x >> 9;
		int i_24_ = (int) class235.aSceneObjectPosition_2599.z >> 9;
		aClass60_9910.method701(class_ra, modelPart, class222, i, i, i_24_, i_24_, true, 1228885360);
		modelPart.method4739(class222, aClass302_Sub1Array7726[0], 0);
		if (null != ((Class60) aClass60_9910).aClickableGeometry_602) {
			Class69 class69 = ((Class60) aClass60_9910).aClickableGeometry_602.method4229();
			class_ra.method5042(class69);
		}
		((Class365_Sub1_Sub2_Sub1) this).aBoolean9907 = modelPart.i() || null != ((Class60) aClass60_9910).aClickableGeometry_602;
		if (null == ((Class365_Sub1_Sub2_Sub1) this).aClass334_9909)
			((Class365_Sub1_Sub2_Sub1) this).aClass334_9909 = Class472.method6063((int) class235.aSceneObjectPosition_2599.x, (int) class235.aSceneObjectPosition_2599.y, (int) class235.aSceneObjectPosition_2599.z, modelPart, 1982662132);
		else
			Class264_Sub2.method2507((((Class365_Sub1_Sub2_Sub1) this).aClass334_9909), (int) class235.aSceneObjectPosition_2599.x, (int) class235.aSceneObjectPosition_2599.y, (int) class235.aSceneObjectPosition_2599.z, modelPart, (byte) 26);
		return class335;
	}

	public int method4497() {
		return aClass60_9910.method699(2101198661);
	}

	final boolean method4400() {
		return false;
	}

	static final void method4498(ClientScript2 class403, byte i) {
		try {
			Class25 class25 = Language.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.FRIEND_CHAT_QUICK_CHAT_MESSAGE, class25.aClass449_330, (byte) 18);
			class298_sub36.buffer.writeByte(0);
			int i_25_ = (class298_sub36.buffer.pos * 385051775);
			class298_sub36.buffer.writeByte(2);
			class298_sub36.buffer.writeShort(((ClientScript2) class403).aClass177_5243.anInt1787 * -2034569943, 16711935);
			((ClientScript2) class403).aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(class298_sub36.buffer, ((ClientScript2) class403).aClass177_5243.anIntArray1789, 1820223429);
			class298_sub36.buffer.method3649(385051775 * (class298_sub36.buffer.pos) - i_25_, (byte) -61);
			class25.writeOutboundPacket(class298_sub36, (byte) -22);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.adk(").append(')').toString());
		}
	}

	public static void method4499(byte i) {
		try {
			Class439.method5851(17, 1188643494);
			Class173.method1826(-1182326447);
			System.gc();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.lx(").append(')').toString());
		}
	}

	static final void method4500(ClientScript2 class403, short i) {
		try {
			int i_26_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int[] is = Interface.method3576(i_26_, 1679514983);
			Class425.method5741(is, 0, ((ClientScript2) class403).anIntArray5244, 681479919 * ((ClientScript2) class403).anInt5239, 3);
			((ClientScript2) class403).anInt5239 += -1175642067;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("wm.akm(").append(')').toString());
		}
	}
}
