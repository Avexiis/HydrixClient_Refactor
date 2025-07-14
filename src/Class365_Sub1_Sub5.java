/* Class365_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class365_Sub1_Sub5 extends Class365_Sub1 {
	public static int anInt9805 = 2;
	public static int anInt9806 = 1;
	public static int anInt9807 = 4;
	static int[] anIntArray9808 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	public static int anInt9809 = 16;
	public static int anInt9810 = 32;
	public static int anInt9811 = 64;
	public static int anInt9812 = 128;
	public static int anInt9813 = 8;
	public short aShort9814;

	boolean method4395() {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (((SceneGraph) aSceneGraph_7722).aBooleanArrayArray3563[(583010427 * ((SceneGraph) aSceneGraph_7722).anInt3538 + (((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504) - -804213305 * ((SceneGraph) aSceneGraph_7722).anInt3553))][(((SceneGraph) aSceneGraph_7722).anInt3538 * 583010427 + (((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504) - ((SceneGraph) aSceneGraph_7722).anInt3513 * 465603579))]);
	}

	int method4354(Class298_Sub10[] class298_sub10s, int i) {
		try {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			int i_0_ = ((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504);
			int i_1_ = ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504);
			int i_2_ = 0;
			if (((SceneGraph) aSceneGraph_7722).anInt3553 * -804213305 == i_0_)
				i_2_++;
			else if (-804213305 * ((SceneGraph) aSceneGraph_7722).anInt3553 < i_0_)
				i_2_ += 2;
			if (465603579 * ((SceneGraph) aSceneGraph_7722).anInt3513 == i_1_)
				i_2_ += 3;
			else if (465603579 * ((SceneGraph) aSceneGraph_7722).anInt3513 > i_1_)
				i_2_ += 6;
			int i_3_ = anIntArray9808[i_2_];
			if (0 != (aShort9814 & i_3_))
				return method4392(i_0_, i_1_, class298_sub10s, 1946245102);
			if (1 == aShort9814 && i_0_ > 0)
				return method4392(i_0_ - 1, i_1_, class298_sub10s, 2007434084);
			if (4 == aShort9814 && i_0_ <= 1988988347 * aSceneGraph_7722.anInt3514)
				return method4392(i_0_ + 1, i_1_, class298_sub10s, 1817424902);
			if (aShort9814 == 8 && i_1_ > 0)
				return method4392(i_0_, i_1_ - 1, class298_sub10s, 1898230573);
			if (2 == aShort9814 && i_1_ <= aSceneGraph_7722.anInt3549 * 1340714547)
				return method4392(i_0_, i_1_ + 1, class298_sub10s, 1978874084);
			if (16 == aShort9814 && i_0_ > 0 && i_1_ <= 1340714547 * aSceneGraph_7722.anInt3549)
				return method4392(i_0_ - 1, 1 + i_1_, class298_sub10s, 1964784017);
			if (32 == aShort9814 && i_0_ <= aSceneGraph_7722.anInt3514 * 1988988347 && i_1_ <= aSceneGraph_7722.anInt3549 * 1340714547)
				return method4392(i_0_ + 1, i_1_ + 1, class298_sub10s, 2147063245);
			if (aShort9814 == 128 && i_0_ > 0 && i_1_ > 0)
				return method4392(i_0_ - 1, i_1_ - 1, class298_sub10s, 1999662511);
			if (aShort9814 == 64 && i_0_ <= aSceneGraph_7722.anInt3514 * 1988988347 && i_1_ > 0)
				return method4392(i_0_ + 1, i_1_ - 1, class298_sub10s, 1956258872);
			throw new RuntimeException("");
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ajz.dg(").append(')').toString());
		}
	}

	boolean method4364(GraphicsToolkit class_ra, byte i) {
		try {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			return (aSceneGraph_7722.aClass333_3512.method4072(this, aByte7724, ((int) sceneObjectPosition.x >> aSceneGraph_7722.anInt3504 * -1688804109), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504)));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ajz.dl(").append(')').toString());
		}
	}

	boolean method4360(int i) {
		try {
			SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
			return (((SceneGraph) aSceneGraph_7722).aBooleanArrayArray3563[(583010427 * ((SceneGraph) aSceneGraph_7722).anInt3538 + (((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504) - (-804213305 * ((SceneGraph) aSceneGraph_7722).anInt3553)))][(((SceneGraph) aSceneGraph_7722).anInt3538 * 583010427 + (((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504) - (((SceneGraph) aSceneGraph_7722).anInt3513 * 465603579)))]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ajz.dq(").append(')').toString());
		}
	}

	int method4390(Class298_Sub10[] class298_sub10s) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		int i = ((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504);
		int i_4_ = ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504);
		int i_5_ = 0;
		if (((SceneGraph) aSceneGraph_7722).anInt3553 * -804213305 == i)
			i_5_++;
		else if (-804213305 * ((SceneGraph) aSceneGraph_7722).anInt3553 < i)
			i_5_ += 2;
		if (465603579 * ((SceneGraph) aSceneGraph_7722).anInt3513 == i_4_)
			i_5_ += 3;
		else if (465603579 * ((SceneGraph) aSceneGraph_7722).anInt3513 > i_4_)
			i_5_ += 6;
		int i_6_ = anIntArray9808[i_5_];
		if (0 != (aShort9814 & i_6_))
			return method4392(i, i_4_, class298_sub10s, 1959908119);
		if (1 == aShort9814 && i > 0)
			return method4392(i - 1, i_4_, class298_sub10s, 1844921124);
		if (4 == aShort9814 && i <= 1988988347 * aSceneGraph_7722.anInt3514)
			return method4392(i + 1, i_4_, class298_sub10s, 1983881528);
		if (aShort9814 == 8 && i_4_ > 0)
			return method4392(i, i_4_ - 1, class298_sub10s, 1778158049);
		if (2 == aShort9814 && i_4_ <= aSceneGraph_7722.anInt3549 * 1340714547)
			return method4392(i, i_4_ + 1, class298_sub10s, 2009547165);
		if (16 == aShort9814 && i > 0 && i_4_ <= 1340714547 * aSceneGraph_7722.anInt3549)
			return method4392(i - 1, 1 + i_4_, class298_sub10s, 2048116357);
		if (32 == aShort9814 && i <= aSceneGraph_7722.anInt3514 * 1988988347 && i_4_ <= aSceneGraph_7722.anInt3549 * 1340714547)
			return method4392(i + 1, i_4_ + 1, class298_sub10s, 1874630351);
		if (aShort9814 == 128 && i > 0 && i_4_ > 0)
			return method4392(i - 1, i_4_ - 1, class298_sub10s, 1974289845);
		if (aShort9814 == 64 && i <= aSceneGraph_7722.anInt3514 * 1988988347 && i_4_ > 0)
			return method4392(i + 1, i_4_ - 1, class298_sub10s, 1884839671);
		throw new RuntimeException("");
	}

	boolean method4391(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (aSceneGraph_7722.aClass333_3512.method4072(this, aByte7724, ((int) sceneObjectPosition.x >> aSceneGraph_7722.anInt3504 * -1688804109), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504)));
	}

	boolean method4396() {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (((SceneGraph) aSceneGraph_7722).aBooleanArrayArray3563[(583010427 * ((SceneGraph) aSceneGraph_7722).anInt3538 + (((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504) - -804213305 * ((SceneGraph) aSceneGraph_7722).anInt3553))][(((SceneGraph) aSceneGraph_7722).anInt3538 * 583010427 + (((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504) - ((SceneGraph) aSceneGraph_7722).anInt3513 * 465603579))]);
	}

	boolean method4393(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (aSceneGraph_7722.aClass333_3512.method4072(this, aByte7724, ((int) sceneObjectPosition.x >> aSceneGraph_7722.anInt3504 * -1688804109), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504)));
	}

	boolean method4359(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (aSceneGraph_7722.aClass333_3512.method4072(this, aByte7724, ((int) sceneObjectPosition.x >> aSceneGraph_7722.anInt3504 * -1688804109), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504)));
	}

	Class365_Sub1_Sub5(SceneGraph sceneGraph, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		super(sceneGraph);
		plane = (byte) i_9_;
		aByte7724 = (byte) i_10_;
		aShort9814 = (short) i_11_;
		method4340(new SceneObjectPosition((float) i, (float) i_7_, (float) i_8_));
	}

	boolean method4389(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (aSceneGraph_7722.aClass333_3512.method4072(this, aByte7724, ((int) sceneObjectPosition.x >> aSceneGraph_7722.anInt3504 * -1688804109), ((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504)));
	}

	boolean method4397() {
		SceneObjectPosition sceneObjectPosition = method4337().aSceneObjectPosition_2599;
		return (((SceneGraph) aSceneGraph_7722).aBooleanArrayArray3563[(583010427 * ((SceneGraph) aSceneGraph_7722).anInt3538 + (((int) sceneObjectPosition.x >> -1688804109 * aSceneGraph_7722.anInt3504) - -804213305 * ((SceneGraph) aSceneGraph_7722).anInt3553))][(((SceneGraph) aSceneGraph_7722).anInt3538 * 583010427 + (((int) sceneObjectPosition.z >> -1688804109 * aSceneGraph_7722.anInt3504) - ((SceneGraph) aSceneGraph_7722).anInt3513 * 465603579))]);
	}

	static final void method4522(ClientScript2 class403, int i) {
		try {
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			MapDetails mapDetails = WorldMap.method3705(i_12_);
			if (null == mapDetails) {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			} else {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (-1973484731 * mapDetails.anInt9644 >> 14 & 0x3fff);
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = mapDetails.anInt9644 * -1973484731 & 0x3fff;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ajz.adm(").append(')').toString());
		}
	}
}
