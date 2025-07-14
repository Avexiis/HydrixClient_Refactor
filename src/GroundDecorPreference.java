/* GroundDecorPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GroundDecorPreference extends IntegerPreferenceField {
	static int anInt8391 = 2;
	static int anInt8392 = 0;

	public GroundDecorPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	public void method5659(int i) {
		try {
			if (anInt5350 * -1598873795 < 0 || -1598873795 * anInt5350 > 2)
				anInt5350 = method5611(-857466843) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adl.s(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adl.a(").append(')').toString());
		}
	}

	public boolean method5660(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adl.z(").append(')').toString());
		}
	}

	public int method5661(byte i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adl.y(").append(')').toString());
		}
	}

	public int method5612(int i, int i_0_) {
		try {
			if (i == 2)
				return 2;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adl.f(").append(')').toString());
		}
	}

	public GroundDecorPreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	int method5615() {
		return 0;
	}

	public int method5616(int i) {
		if (i == 2)
			return 2;
		return 1;
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adl.p(").append(')').toString());
		}
	}

	static void method5662(GraphicsToolkit class_ra, int i, int i_2_, IComponentDefinition class105, Class_ta class_ta, int i_3_, int i_4_, int i_5_) {
		try {
			for (int i_6_ = 0; i_6_ < GameClient.npcCount * -1230451913; i_6_++) {
				LinkableObject linkableObject = ((LinkableObject) GameClient.npcs.get((long) GameClient.npcIndicies[i_6_]));
				if (linkableObject != null) {
					NPC class365_sub1_sub1_sub2_sub1 = ((NPC) linkableObject.anObject7366);
					if (class365_sub1_sub1_sub2_sub1.method4457(1140952765) && ((Class287.myPlayer.plane) == class365_sub1_sub1_sub2_sub1.plane)) {
						NPCType class503 = class365_sub1_sub1_sub2_sub1.definition;
						if (null != class503 && class503.anIntArray6188 != null)
							class503 = class503.method6240(Class128.aClass148_6331, 1665436225);
						if (null != class503 && class503.visibleOnMap && class503.aBoolean6163) {
							SceneObjectPosition sceneObjectPosition = (class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599);
							int i_7_ = (int) sceneObjectPosition.x / 128 - i / 128;
							int i_8_ = (int) sceneObjectPosition.z / 128 - i_2_ / 128;
							if (-1 != -1362115471 * class503.anInt6186)
								Class248.method2389(class_ra, class_ta, class105, i_3_, i_4_, i_7_, i_8_, (-1362115471 * class503.anInt6186), (byte) 0);
							else
								FluType.method5883(class105, class_ta, i_3_, i_4_, i_7_, i_8_, (SubIncommingPacket.aClass57Array2349[1]), (byte) -17);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adl.q(").append(')').toString());
		}
	}

	public static Class57 method5663(Js5 class243, int i, byte i_9_) {
		try {
			Class57 class57 = (Class57) Class229.aClass348_6452.get((long) i);
			if (null == class57) {
				if (Class230.aBoolean2567)
					class57 = (OverlayType.activeToolkit.method5125(Class89.method979(class243, i), true));
				else
					class57 = Class223.method2081(class243.method2294(i, (byte) 15), -161656424);
				Class229.aClass348_6452.put(class57, (long) i);
			}
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adl.f(").append(')').toString());
		}
	}

	static final void method5664(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -2000354906) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1277 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.hasScripts = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adl.na(").append(')').toString());
		}
	}
}
