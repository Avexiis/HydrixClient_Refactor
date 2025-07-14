/* Class82_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub21 extends Class82 {
	int anInt6901;

	Class82_Sub21(Packet class298_sub53) {
		super(class298_sub53);
		((Class82_Sub21) this).anInt6901 = class298_sub53.readUnsignedShort() * 855211779;
	}

	public void method866(int i) {
		try {
			Class87.aClass86Array798[((Class82_Sub21) this).anInt6901 * 297690027].method959((byte) 12);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("yt.f(").append(')').toString());
		}
	}

	public void method868() {
		Class87.aClass86Array798[((Class82_Sub21) this).anInt6901 * 297690027].method959((byte) 12);
	}

	public void method869() {
		Class87.aClass86Array798[((Class82_Sub21) this).anInt6901 * 297690027].method959((byte) 12);
	}

	static final void method936(Class365_Sub1 class365_sub1, int i, boolean bool, int i_0_) {
		try {
			int i_1_;
			int i_2_;
			if (class365_sub1 instanceof Class365_Sub1_Sub1 && class365_sub1 instanceof Interface3) {
				Class365_Sub1_Sub1 class365_sub1_sub1 = (Class365_Sub1_Sub1) class365_sub1;
				int i_3_ = ((class365_sub1_sub1.aShort9796 - class365_sub1_sub1.aShort9798 + 1) << 9);
				int i_4_ = (1 + (class365_sub1_sub1.aShort9797 - class365_sub1_sub1.aShort9795) << 9);
				i_1_ = (class365_sub1_sub1.aShort9798 << 9) + i_3_ / 2;
				i_2_ = i_4_ / 2 + (class365_sub1_sub1.aShort9795 << 9);
			} else {
				SceneObjectPosition sceneObjectPosition = class365_sub1.method4337().aSceneObjectPosition_2599;
				i_1_ = (int) sceneObjectPosition.x;
				i_2_ = (int) sceneObjectPosition.z;
			}
			Class125.method1400(class365_sub1.plane, i_1_, i_2_, 0, i, bool, 1992555297);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("yt.jg(").append(')').toString());
		}
	}

	static final void method937(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_5_, (byte) 76);
			Class284.method2694(class105, class403, -767212097);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("yt.qe(").append(')').toString());
		}
	}

	static final boolean method938(int i, int i_6_, boolean bool, Class336 class336, int i_7_) {
		try {
			int i_8_ = (Class287.myPlayer.scenePositionXQueue[0]);
			int i_9_ = (Class287.myPlayer.scenePositionYQueue[0]);
			if (i_8_ < 0 || i_8_ >= GameClient.map.upperX(-2029828730) || i_9_ < 0 || i_9_ >= GameClient.map.upperY(911412275))
				return false;
			if (i < 0 || i >= GameClient.map.upperX(-2140756422) || i_6_ < 0 || i_6_ >= GameClient.map.upperY(1432313507))
				return false;
			int i_10_ = (Class298_Sub37.calculateRoute(i_8_, i_9_, Class287.myPlayer.getSize(), class336, (GameClient.map.getSceneClipDataPlane(Class287.myPlayer.plane)), bool, GameClient.calculatedScenePositionXs, GameClient.calculatedScenePositionYs));
			if (i_10_ < 1)
				return false;
			Class3.anInt62 = GameClient.calculatedScenePositionXs[i_10_ - 1] * -1129029761;
			Class3.anInt54 = -1835291189 * GameClient.calculatedScenePositionYs[i_10_ - 1];
			Class3.aBoolean63 = false;
			Class319.method3904(-2054792212);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("yt.jz(").append(')').toString());
		}
	}
}
