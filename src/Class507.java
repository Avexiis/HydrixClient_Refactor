/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class507 {
	CachingHashMap aClass348_6204;
	GameContext aGameContext_6205;
	CachingHashMap aClass348_6206 = new CachingHashMap(64);
	Js5 aClass243_6207;
	Js5 aClass243_6208;
	boolean aBoolean6209;
	int anInt6210;
	CachingHashMap aClass348_6211;
	Language aLanguage_6212;
	String[] aStringArray6213;

	public NPCType method6269(int i, int i_0_) {
		NPCType class503;
		synchronized (aClass348_6206) {
			class503 = (NPCType) aClass348_6206.get(i);
		}
		if (null != class503) {
			return class503;
		}
		byte[] data;
		synchronized (aClass243_6207) {
			data = aClass243_6207.getFileFromArchive(Js5ConfigGroup.aClass120_1410.method1307(i, -790155853),
					Js5ConfigGroup.aClass120_1410.method1305(i, -576275965), (byte) -76);
		}
		class503 = new NPCType();
		class503.id = -1840892671 * i;
		class503.aClass507_6125 = this;
		class503.options = aStringArray6213.clone();
		if (data != null) {
			if (i >= OSRSData.NPCS_OFFSET) {
				class503.decodeOSRS(new Packet(data));
			} else {
				class503.decode(new Packet(data));
			}
		}
		class503.method6243(1323410423);
		synchronized (aClass348_6206) {
			aClass348_6206.put(class503, i);
		}
		return class503;
	}

	public void method6270(boolean bool, byte i) {
		try {
			if (aBoolean6209 != bool) {
				aBoolean6209 = bool;
				method6272(-1071306617);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uy.f(").append(')').toString());
		}
	}

	public void method6271(int i, int i_1_) {
		try {
			anInt6210 = i * -1576689997;
			synchronized (aClass348_6204) {
				aClass348_6204.method4187();
			}
			synchronized (aClass348_6211) {
				aClass348_6211.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uy.b(").append(')').toString());
		}
	}

	public void method6272(int i) {
		try {
			synchronized (aClass348_6206) {
				aClass348_6206.method4187();
			}
			synchronized (aClass348_6204) {
				aClass348_6204.method4187();
			}
			synchronized (aClass348_6211) {
				aClass348_6211.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uy.p(").append(')').toString());
		}
	}

	public void method6273(byte i) {
		try {
			synchronized (aClass348_6204) {
				aClass348_6204.method4187();
			}
			synchronized (aClass348_6211) {
				aClass348_6211.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uy.i(").append(')').toString());
		}
	}

	public void method6274(int i) {
		try {
			synchronized (aClass348_6206) {
				aClass348_6206.method4189();
			}
			synchronized (aClass348_6204) {
				aClass348_6204.method4189();
			}
			synchronized (aClass348_6211) {
				aClass348_6211.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uy.d(").append(')').toString());
		}
	}

	public void method6275(int i, int i_2_) {
		try {
			synchronized (aClass348_6206) {
				aClass348_6206.method4186(i, 612752798);
			}
			synchronized (aClass348_6204) {
				aClass348_6204.method4186(i, -709168280);
			}
			synchronized (aClass348_6211) {
				aClass348_6211.method4186(i, -1808092959);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uy.k(").append(')').toString());
		}
	}

	public Class507(GameContext gameContext, Language language, boolean bool, Js5 class243, Js5 class243_3_) {
		aClass348_6204 = new CachingHashMap(50);
		aClass348_6211 = new CachingHashMap(5);
		aGameContext_6205 = gameContext;
		aLanguage_6212 = language;
		aBoolean6209 = bool;
		aClass243_6207 = class243;
		aClass243_6208 = class243_3_;
		if (aClass243_6207 != null) {
			int i = aClass243_6207.method2296(2037724352) - 1;
			Js5ConfigGroup.aClass120_1410.method1306((short) 12429);
			aClass243_6207.method2316(i, 678420951);
		}
		if (GameContext.aGameContext_5320 == aGameContext_6205) {
			aStringArray6213 = new String[] { null, null, null, null, null,
					LocalizedString.BUTTON_EXAMINE.getText(aLanguage_6212, -875414210) };
		} else {
			aStringArray6213 = new String[] { null, null, null, null, null, null };
		}
	}

	static void method6276(int i) {
		try {
			Class229.aClass348_6452.method4187();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uy.a(").append(')').toString());
		}
	}

	static final void method6277(ClientScript2 class403, int i) {
		try {
			int i_4_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_4_, (byte) -51);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_4_ >> 16];
			Class79.method849(class105, RSInterface, class403, 1226850164);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uy.jp(").append(')').toString());
		}
	}
}
