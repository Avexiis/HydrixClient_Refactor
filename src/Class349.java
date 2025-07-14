/* Class349 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class349 {
	CachingHashMap aClass348_3706 = new CachingHashMap(64);
	Class405 aClass405_3707;
	public static BASType aClass350_3708 = new BASType();
	Js5 aClass243_3709;

	public void method4199(int i) {
		try {
			synchronized (aClass348_3706) {
				aClass348_3706.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oo.f(").append(')').toString());
		}
	}

	public void method4200(int i, byte i_0_) {
		try {
			synchronized (aClass348_3706) {
				aClass348_3706.method4186(i, 88605032);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oo.b(").append(')').toString());
		}
	}

	public void method4201(byte i) {
		try {
			synchronized (aClass348_3706) {
				aClass348_3706.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oo.p(").append(')').toString());
		}
	}

	public BASType method4202(int i, byte i_1_) {
		try {
			BASType class350;
			synchronized (aClass348_3706) {
				class350 = (BASType) aClass348_3706.get(i);
			}
			if (class350 != null) {
				return class350;
			}
			byte[] is;
			synchronized (aClass243_3709) {
				is = aClass243_3709.getFileFromArchive(-1006924897 * Js5ConfigGroup.aClass120_1437.anInt1460, i, (byte) -42);
			}
			class350 = new BASType();
			class350.osrs = i >= OSRSData.BAS_OFFSET;
			class350.aClass349_3725 = this;
			if (null != is) {
				class350.method4211(new Packet(is), 162499609);
			}
			synchronized (aClass348_3706) {
				aClass348_3706.put(class350, i);
			}
			return class350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oo.a(").append(')').toString());
		}
	}

	public Class349(GameContext gameContext, Language language, Js5 class243, Class405 class405) {
		aClass243_3709 = class243;
		aClass243_3709.method2316(-1006924897 * Js5ConfigGroup.aClass120_1437.anInt1460, -994427694);
		aClass405_3707 = class405;
	}

	static final void method4203(ClientScript2 class403, byte i) {
		try {
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919
					- 1] = class403.aClass298_Sub25_5237.anInt7356 * 649879491;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oo.xp(").append(')').toString());
		}
	}

	static final void method4204(ClientScript2 class403, byte i) {
		try {
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aVolumePreference_7583,
					class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919], 951880368);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oo.aiy(").append(')').toString());
		}
	}

	static final void method4205(ClientScript2 class403, short i) {
		try {
			class403.anInt5239 -= -783761378;
			int i_2_ = class403.anIntArray5244[681479919 * class403.anInt5239];
			int i_3_ = class403.anIntArray5244[1 + class403.anInt5239 * 681479919];
			if (Class452.aBoolean5642) {
				Class357.method4276(3, i_2_, i_3_, false, -1076746695);
				class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919
						- 1] = null != Class231.aFrame2589 ? 1 : 0;
			} else {
				class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oo.aed(").append(')').toString());
		}
	}
}
