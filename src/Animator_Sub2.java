/* Class438_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Animator_Sub2 extends Animator {
	Class365_Sub1 aClass365_Sub1_8440;

	void method5848(SeqType class391, int i) {
		AppletParam.method1938(class391, i, ((Animator_Sub2) this).aClass365_Sub1_8440, -463239640);
	}

	void method5837(SeqType class391, int i, byte i_0_) {
		try {
			AppletParam.method1938(class391, i, ((Animator_Sub2) this).aClass365_Sub1_8440, -1175411035);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aew.l(").append(')').toString());
		}
	}

	Animator_Sub2(Class365_Sub1 class365_sub1, boolean bool) {
		super(bool);
		((Animator_Sub2) this).aClass365_Sub1_8440 = class365_sub1;
	}

	static boolean method5849(Interface3 interface3, byte i) {
		try {
			LocType class432 = GameClient.map.method2641(1998541007).list(interface3.method32((byte) 21));
			if (-1 == -1204256389 * class432.anInt5400)
				return true;
			Class496 class496 = Js5ConfigGroup.aMapIconTypeList_1463.method6159((class432.anInt5400 * -1204256389), -2130110173);
			if (-1 == 1690480405 * class496.anInt6097)
				return true;
			return class496.method6197((byte) 7);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aew.d(").append(')').toString());
		}
	}
}
