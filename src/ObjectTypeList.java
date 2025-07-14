/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjectTypeList {
	Model[] aClass64Array5443;
	Language aLanguage_5444;
	boolean aBoolean5445;
	Js5 aClass243_5446;
	Js5 aClass243_5447;
	public static int anInt5448 = 256;
	CachingHashMap aClass348_5449 = new CachingHashMap(256);
	CachingHashMap aClass348_5450 = new CachingHashMap(500);
	CachingHashMap aClass348_5451;
	CachingHashMap aClass348_5452 = new CachingHashMap(30);
	int anInt5453;
	String[] aStringArray5454;
	GameContext aGameContext_5455;
	Class454 aClass454_5456;

	public void method5790(boolean bool, int i) {
		try {
			if (aBoolean5445 != bool) {
				aBoolean5445 = bool;
				method5793(1159892995);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rx.f(").append(')').toString());
		}
	}

	public void method5791(int i, int i_0_) {
		try {
			anInt5453 = -570701637 * i;
			synchronized (aClass348_5450) {
				aClass348_5450.method4187();
			}
			synchronized (aClass348_5452) {
				aClass348_5452.method4187();
			}
			synchronized (aClass348_5451) {
				aClass348_5451.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rx.b(").append(')').toString());
		}
	}

	public void method5792(int i, byte i_1_) {
		try {
			aClass348_5449 = new CachingHashMap(i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rx.p(").append(')').toString());
		}
	}

	public void method5793(int i) {
		try {
			synchronized (aClass348_5449) {
				aClass348_5449.method4187();
			}
			synchronized (aClass348_5450) {
				aClass348_5450.method4187();
			}
			synchronized (aClass348_5452) {
				aClass348_5452.method4187();
			}
			synchronized (aClass348_5451) {
				aClass348_5451.method4187();
			}
			aClass64Array5443 = new Model[4];
			aClass454_5456 = new Class454(null, null);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rx.i(").append(')').toString());
		}
	}

	public void method5794(int i, byte i_2_) {
		try {
			synchronized (aClass348_5449) {
				aClass348_5449.method4186(i, -798729587);
			}
			synchronized (aClass348_5450) {
				aClass348_5450.method4186(i, -1754602717);
			}
			synchronized (aClass348_5452) {
				aClass348_5452.method4186(i, 466618917);
			}
			synchronized (aClass348_5451) {
				aClass348_5451.method4186(i, -855180536);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rx.k(").append(')').toString());
		}
	}

	public void method5795(int i) {
		try {
			synchronized (aClass348_5449) {
				aClass348_5449.method4189();
			}
			synchronized (aClass348_5450) {
				aClass348_5450.method4189();
			}
			synchronized (aClass348_5452) {
				aClass348_5452.method4189();
			}
			synchronized (aClass348_5451) {
				aClass348_5451.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rx.d(").append(')').toString());
		}
	}

	public ObjectTypeList(GameContext gameContext, Language language, boolean bool, Js5 class243, Js5 class243_3_) {
		aClass348_5451 = new CachingHashMap(50);
		aClass64Array5443 = new Model[4];
		aClass454_5456 = new Class454(null, null);
		aGameContext_5455 = gameContext;
		aLanguage_5444 = language;
		aBoolean5445 = bool;
		aClass243_5446 = class243;
		aClass243_5447 = class243_3_;
		if (null != aClass243_5446) {
			int i = aClass243_5446.method2296(1680210708) - 1;
			Js5ConfigGroup.aClass120_1443.method1306((short) 23751);
			aClass243_5446.method2316(i, -1017296855);
		}
		if (aGameContext_5455 == GameContext.aGameContext_5320) {
			aStringArray5454 = new String[] { null, null, null, null, null, LocalizedString.BUTTON_EXAMINE.getText(aLanguage_5444, -875414210) };
		} else {
			aStringArray5454 = new String[] { null, null, null, null, null, null };
		}
	}

	public LocType list(int id) {
		LocType type;
		synchronized (aClass348_5449) {
			type = (LocType) aClass348_5449.get(id);
		}
		if (type != null) {
			return type;
		}
		byte[] data;
		synchronized (aClass243_5446) {
			data = aClass243_5446.getFileFromArchive(Js5ConfigGroup.aClass120_1443.method1307(id, -1875026798), Js5ConfigGroup.aClass120_1443.method1305(id, -1955117131), (byte) -69);
		}
		type = new LocType();
		type.id = id * -950871973;
		type.aClass433_5403 = this;
		type.aStringArray5394 = aStringArray5454.clone();
		if (null != data) {
			if (id >= OSRSData.LOCS_OFFSET) {
				type.decodeOSRS(new Packet(data));
			} else {
				type.decode(new Packet(data));
			}
		}
		type.postDecode();
		if (type.aBoolean5416) {
			type.anInt5380 = 0;
			type.aBoolean5424 = false;
		}
		if (!aBoolean5445 && type.aBoolean5434) {
			type.aStringArray5394 = null;
			type.anIntArray5370 = null;
		}
		synchronized (aClass348_5449) {
			aClass348_5449.put(type, id);
		}
		return type;
	}

	static final void method5797(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			int i_9_ = 0;
			int i_10_ = i_6_;
			int i_11_ = -i_6_;
			int i_12_ = -1;
			Class82_Sub22.method940(Class372_Sub1.anIntArrayArray4047[i_5_], i - i_6_, i + i_6_, i_7_, 198591816);
			while (i_10_ > i_9_) {
				i_12_ += 2;
				i_11_ += i_12_;
				i_9_++;
				if (i_11_ >= 0) {
					i_10_--;
					i_11_ -= i_10_ << 1;
					int[] is = Class372_Sub1.anIntArrayArray4047[i_10_ + i_5_];
					int[] is_13_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_10_];
					int i_14_ = i_9_ + i;
					int i_15_ = i - i_9_;
					Class82_Sub22.method940(is, i_15_, i_14_, i_7_, 1681024850);
					Class82_Sub22.method940(is_13_, i_15_, i_14_, i_7_, -1116732446);
				}
				int i_16_ = i_10_ + i;
				int i_17_ = i - i_10_;
				int[] is = Class372_Sub1.anIntArrayArray4047[i_5_ + i_9_];
				int[] is_18_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_9_];
				Class82_Sub22.method940(is, i_17_, i_16_, i_7_, -143852292);
				Class82_Sub22.method940(is_18_, i_17_, i_16_, i_7_, 358013733);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rx.s(").append(')').toString());
		}
	}

	static final void method5798(ClientScript2 class403, short i) {
		try {
			int i_19_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_19_, (byte) -1);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_19_ >> 16];
			Class298_Sub45.method3533(class105, RSInterface, class403, (byte) -45);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rx.dc(").append(')').toString());
		}
	}

	static Class100[] method5799(int i) {
		try {
			return new Class100[] { Class100.aClass100_975, Class100.aClass100_954, Class100.aClass100_1076, Class100.aClass100_956, Class100.aClass100_957, Class100.aClass100_958, Class100.aClass100_959, Class100.aClass100_1033, Class100.aClass100_961, Class100.aClass100_1042, Class100.aClass100_1028, Class100.aClass100_964, Class100.aClass100_1069, Class100.aClass100_966, Class100.aClass100_984, Class100.aClass100_968, Class100.aClass100_969, Class100.aClass100_970, Class100.aClass100_971, Class100.aClass100_994, Class100.aClass100_1058, Class100.aClass100_967, Class100.aClass100_1073, Class100.aClass100_976, Class100.aClass100_977, Class100.aClass100_1049, Class100.aClass100_995, Class100.aClass100_1001, Class100.aClass100_973, Class100.aClass100_960, Class100.aClass100_983,
					Class100.aClass100_1031, Class100.aClass100_985, Class100.aClass100_986, Class100.aClass100_987, Class100.aClass100_988, Class100.aClass100_989, Class100.aClass100_990, Class100.aClass100_991, Class100.aClass100_992, Class100.aClass100_1051, Class100.aClass100_963, Class100.aClass100_1078, Class100.aClass100_996, Class100.aClass100_997, Class100.aClass100_998, Class100.aClass100_999, Class100.aClass100_1000, Class100.aClass100_965, Class100.aClass100_1002, Class100.aClass100_1003, Class100.aClass100_1004, Class100.aClass100_1005, Class100.aClass100_1050, Class100.aClass100_1007, Class100.aClass100_1008, Class100.aClass100_1009, Class100.aClass100_1010, Class100.aClass100_1040, Class100.aClass100_1012, Class100.aClass100_1013, Class100.aClass100_1014,
					Class100.aClass100_1015, Class100.aClass100_981, Class100.aClass100_1018, Class100.aClass100_1025, Class100.aClass100_1019, Class100.aClass100_1020, Class100.aClass100_1021, Class100.aClass100_1022, Class100.aClass100_1023, Class100.aClass100_1024, Class100.aClass100_1041, Class100.aClass100_1026, Class100.aClass100_1027, Class100.aClass100_978, Class100.aClass100_1029, Class100.aClass100_953, Class100.aClass100_1075, Class100.aClass100_1032, Class100.aClass100_980, Class100.aClass100_1034, Class100.aClass100_1039, Class100.aClass100_1036, Class100.aClass100_1037, Class100.aClass100_1030, Class100.aClass100_1064, Class100.aClass100_1035, Class100.aClass100_1061, Class100.aClass100_1006, Class100.aClass100_1043, Class100.aClass100_1044, Class100.aClass100_1038,
					Class100.aClass100_1046, Class100.aClass100_955, Class100.aClass100_1048, Class100.aClass100_1077, Class100.aClass100_974, Class100.aClass100_962, Class100.aClass100_1052, Class100.aClass100_993, Class100.aClass100_1054, Class100.aClass100_1016, Class100.aClass100_1056, Class100.aClass100_1057, Class100.aClass100_972, Class100.aClass100_1059, Class100.aClass100_1060, Class100.aClass100_1047, Class100.aClass100_1062, Class100.aClass100_1063, Class100.aClass100_1045, Class100.aClass100_1065, Class100.aClass100_1066, Class100.aClass100_1067, Class100.aClass100_1068, Class100.aClass100_1055, Class100.aClass100_1070, Class100.aClass100_1071, Class100.aClass100_982, Class100.aClass100_1053, Class100.aClass100_1074, Class100.aClass100_979, Class100.aClass100_1017,
					Class100.aClass100_1011 };
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rx.a(").append(')').toString());
		}
	}
}
