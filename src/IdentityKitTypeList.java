/* IdentityKitTypeList - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IdentityKitTypeList {
	Js5 aClass243_1559;
	Js5 aClass243_1560;
	CachingHashMap aClass348_1561 = new CachingHashMap(64);
	static Class57 aClass57_1562;
	public static Class381 aClass381_1563;

	public Class132 method1579(int i, int i_0_) {
		try {
			Class132 class132;
			synchronized (((IdentityKitTypeList) this).aClass348_1561) {
				class132 = (Class132) ((IdentityKitTypeList) this).aClass348_1561.get((long) i);
			}
			if (class132 != null)
				return class132;
			byte[] is;
			synchronized (((IdentityKitTypeList) this).aClass243_1559) {
				is = (((IdentityKitTypeList) this).aClass243_1559.getFileFromArchive(Js5ConfigGroup.aClass120_1425.anInt1460 * -1006924897, i, (byte) -128));
			}
			class132 = new Class132();
			((Class132) class132).aIdentityKitTypeList_1500 = this;
			if (is != null)
				class132.method1472(new Packet(is), 1546025245);
			synchronized (((IdentityKitTypeList) this).aClass348_1561) {
				((IdentityKitTypeList) this).aClass348_1561.put(class132, (long) i);
			}
			return class132;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fv.a(").append(')').toString());
		}
	}

	public void method1580(byte i) {
		try {
			synchronized (((IdentityKitTypeList) this).aClass348_1561) {
				((IdentityKitTypeList) this).aClass348_1561.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fv.f(").append(')').toString());
		}
	}

	public void method1581(int i) {
		try {
			synchronized (((IdentityKitTypeList) this).aClass348_1561) {
				((IdentityKitTypeList) this).aClass348_1561.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fv.p(").append(')').toString());
		}
	}

	public void method1582(int i, int i_1_) {
		try {
			synchronized (((IdentityKitTypeList) this).aClass348_1561) {
				((IdentityKitTypeList) this).aClass348_1561.method4186(i, -1045157545);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fv.b(").append(')').toString());
		}
	}

	public IdentityKitTypeList(GameContext gameContext, Language language, Js5 class243, Js5 class243_2_) {
		((IdentityKitTypeList) this).aClass243_1559 = class243;
		((IdentityKitTypeList) this).aClass243_1560 = class243_2_;
		((IdentityKitTypeList) this).aClass243_1559.method2316((-1006924897 * (Js5ConfigGroup.aClass120_1425.anInt1460)), -2109974583);
	}

	static final void method1583(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class377.method4665(class105, RSInterface, class403, (short) 14954);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fv.fz(").append(')').toString());
		}
	}

	static final void method1584(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).aClass162_5252.anInt1670 * 873199607;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fv.xc(").append(')').toString());
		}
	}

	static final void method1585(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsSetup.clientPreferences.aGroundDecorPreference_7548.method5612(i_3_, 1352882135);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fv.aog(").append(')').toString());
		}
	}

	static final void method1586(ClientScript2 class403, int i) {
		try {
			NPC class365_sub1_sub1_sub2_sub1 = ((NPC) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242);
			NPCType class503 = class365_sub1_sub1_sub2_sub1.definition;
			if (class503.anIntArray6188 != null)
				class503 = class503.method6240(Class128.aClass148_6331, 1999627505);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class503 != null ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fv.apl(").append(')').toString());
		}
	}

	public static void method1587(byte i) {
		try {
			if (GameClient.aBoolean8835) {
				IComponentDefinition class105 = Class140.method1558(Class379.anInt4099 * 1262526353, 392084321 * GameClient.anInt8836, -156511736);
				if (null != class105 && class105.anObjectArray1120 != null) {
					ScriptContext scriptContext = new ScriptContext();
					scriptContext.source = class105;
					scriptContext.arguments = class105.anObjectArray1120;
					ClientBuild.execute(scriptContext, (byte) 77);
				}
				GameClient.anInt8937 = 280458557;
				GameClient.c92 = -398138063;
				GameClient.aBoolean8835 = false;
				if (class105 != null)
					LocalizedString.markComponentForRedraw(class105, -1858273017);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fv.kb(").append(')').toString());
		}
	}

	static final void method1588(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_4_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			if (Class287.myPlayer.appearance != null)
				Class287.myPlayer.appearance.method4541(i_4_, i_5_, Class298_Sub32_Sub14.aClass477_9400, (byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fv.cv(").append(')').toString());
		}
	}
}
