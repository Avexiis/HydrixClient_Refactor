/* SpotAnimTypeList - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SpotAnimTypeList {
	Js5 aClass243_4159;
	Js5 aClass243_4160;
	CachingHashMap aClass348_4161 = new CachingHashMap(64);
	CachingHashMap aClass348_4162 = new CachingHashMap(60);
	int anInt4163;
	protected static Class457 aClass457_4164;
	public static RSInterface[] aRSInterfaceArray4165;
	static int anInt4166;

	public void method4856(int i) {
		try {
			synchronized (((SpotAnimTypeList) this).aClass348_4161) {
				((SpotAnimTypeList) this).aClass348_4161.method4189();
			}
			synchronized (((SpotAnimTypeList) this).aClass348_4162) {
				((SpotAnimTypeList) this).aClass348_4162.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qc.i(").append(')').toString());
		}
	}

	public Class398 method4857(int i, int i_0_) {
		try {
			Class398 class398;
			synchronized (((SpotAnimTypeList) this).aClass348_4161) {
				class398 = (Class398) ((SpotAnimTypeList) this).aClass348_4161.get((long) i);
			}
			if (class398 != null)
				return class398;
			byte[] is;
			synchronized (((SpotAnimTypeList) this).aClass243_4159) {
				is = (((SpotAnimTypeList) this).aClass243_4159.getFileFromArchive(Js5ConfigGroup.aClass120_1449.method1307(i, -880627246), Js5ConfigGroup.aClass120_1449.method1305(i, -2138953670), (byte) -76));
			}
			class398 = new Class398();
			((Class398) class398).aSpotAnimTypeList_5210 = this;
			((Class398) class398).anInt5202 = i * 1757755963;
			if (is != null)
				class398.method4915(new Packet(is), (byte) -38);
			synchronized (((SpotAnimTypeList) this).aClass348_4161) {
				((SpotAnimTypeList) this).aClass348_4161.put(class398, (long) i);
			}
			return class398;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qc.a(").append(')').toString());
		}
	}

	public void method4858(int i) {
		try {
			synchronized (((SpotAnimTypeList) this).aClass348_4161) {
				((SpotAnimTypeList) this).aClass348_4161.method4187();
			}
			synchronized (((SpotAnimTypeList) this).aClass348_4162) {
				((SpotAnimTypeList) this).aClass348_4162.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qc.b(").append(')').toString());
		}
	}

	public void method4859(int i, int i_1_) {
		try {
			synchronized (((SpotAnimTypeList) this).aClass348_4161) {
				((SpotAnimTypeList) this).aClass348_4161.method4186(i, -465863614);
			}
			synchronized (((SpotAnimTypeList) this).aClass348_4162) {
				((SpotAnimTypeList) this).aClass348_4162.method4186(i, -1017728103);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qc.p(").append(')').toString());
		}
	}

	public void method4860(int i, int i_2_) {
		try {
			((SpotAnimTypeList) this).anInt4163 = i * -1451688935;
			synchronized (((SpotAnimTypeList) this).aClass348_4162) {
				((SpotAnimTypeList) this).aClass348_4162.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qc.f(").append(')').toString());
		}
	}

	public SpotAnimTypeList(GameContext gameContext, Language language, Js5 class243, Js5 class243_3_) {
		((SpotAnimTypeList) this).aClass243_4159 = class243;
		((SpotAnimTypeList) this).aClass243_4160 = class243_3_;
		int i = ((SpotAnimTypeList) this).aClass243_4159.method2296(1921321046) - 1;
		Js5ConfigGroup.aClass120_1449.method1306((short) 3745);
		((SpotAnimTypeList) this).aClass243_4159.method2316(i, -1103317672);
	}

	static final void method4861(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class158.method1699(class105, RSInterface, class403, (byte) -85);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qc.ly(").append(')').toString());
		}
	}

	static final void method4862(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			class105.disableHover = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qc.cr(").append(')').toString());
		}
	}

	static final void method4863(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsSetup.clientPreferences.aMapSizePreference_7558.method5667(-369768513);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qc.ajk(").append(')').toString());
		}
	}

	static final void method4864(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_5_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (GraphicsToolkit.aClass256_5315.method2441(i_4_, 2021332528).aCharArray9597[i_5_]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qc.acp(").append(')').toString());
		}
	}

	public static Class292 method4865(byte i) {
		try {
			return GameShell.aClass292_6466;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qc.as(").append(')').toString());
		}
	}
}
