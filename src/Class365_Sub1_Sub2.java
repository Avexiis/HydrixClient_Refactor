/* Class365_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class365_Sub1_Sub2 extends Class365_Sub1 {
	public short aShort9801;

	int method4390(Class298_Sub10[] class298_sub10s) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return method4392(((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504), class298_sub10s, 1790349170);
	}

	int method4354(Class298_Sub10[] class298_sub10s, int i) {
		try {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			return method4392(((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504), class298_sub10s, 2146815027);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ajh.dg(").append(')').toString());
		}
	}

	boolean method4364(GraphicsToolkit class_ra, byte i) {
		try {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			return (aSceneGraph_7722.aClass333_3512.method4071(aByte7724, ((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504)));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ajh.dl(").append(')').toString());
		}
	}

	boolean method4360(int i) {
		try {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			return (((SceneGraph) aSceneGraph_7722).aBooleanArrayArray3563[(((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504) - ((SceneGraph) aSceneGraph_7722).anInt3553 * -804213305 + ((SceneGraph) aSceneGraph_7722).anInt3538 * 583010427)][(583010427 * ((SceneGraph) aSceneGraph_7722).anInt3538 + (((int) sceneObjectPosition.z >> aSceneGraph_7722.anInt3504 * -1688804109) - (465603579 * ((SceneGraph) aSceneGraph_7722).anInt3513)))]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ajh.dq(").append(')').toString());
		}
	}

	boolean method4396() {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (((SceneGraph) aSceneGraph_7722).aBooleanArrayArray3563[(((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504) - ((SceneGraph) aSceneGraph_7722).anInt3553 * -804213305 + ((SceneGraph) aSceneGraph_7722).anInt3538 * 583010427)][(583010427 * ((SceneGraph) aSceneGraph_7722).anInt3538 + (((int) sceneObjectPosition.z >> aSceneGraph_7722.anInt3504 * -1688804109) - 465603579 * ((SceneGraph) aSceneGraph_7722).anInt3513))]);
	}

	boolean method4391(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (aSceneGraph_7722.aClass333_3512.method4071(aByte7724, ((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504)));
	}

	boolean method4359(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (aSceneGraph_7722.aClass333_3512.method4071(aByte7724, ((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504)));
	}

	boolean method4393(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (aSceneGraph_7722.aClass333_3512.method4071(aByte7724, ((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504)));
	}

	boolean method4389(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (aSceneGraph_7722.aClass333_3512.method4071(aByte7724, ((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504)));
	}

	boolean method4395() {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (((SceneGraph) aSceneGraph_7722).aBooleanArrayArray3563[(((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504) - ((SceneGraph) aSceneGraph_7722).anInt3553 * -804213305 + ((SceneGraph) aSceneGraph_7722).anInt3538 * 583010427)][(583010427 * ((SceneGraph) aSceneGraph_7722).anInt3538 + (((int) sceneObjectPosition.z >> aSceneGraph_7722.anInt3504 * -1688804109) - 465603579 * ((SceneGraph) aSceneGraph_7722).anInt3513))]);
	}

	Class365_Sub1_Sub2(SceneGraph sceneGraph, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		super(sceneGraph);
		plane = (byte) i_2_;
		aByte7724 = (byte) i_3_;
		aShort9801 = (short) i_4_;
		method4340(new SceneObjectPosition((float) i, (float) i_0_, (float) i_1_));
	}

	boolean method4397() {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (((SceneGraph) aSceneGraph_7722).aBooleanArrayArray3563[(((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504) - ((SceneGraph) aSceneGraph_7722).anInt3553 * -804213305 + ((SceneGraph) aSceneGraph_7722).anInt3538 * 583010427)][(583010427 * ((SceneGraph) aSceneGraph_7722).anInt3538 + (((int) sceneObjectPosition.z >> aSceneGraph_7722.anInt3504 * -1688804109) - 465603579 * ((SceneGraph) aSceneGraph_7722).anInt3513))]);
	}
}
