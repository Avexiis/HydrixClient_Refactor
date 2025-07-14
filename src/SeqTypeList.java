/* Class395 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SeqTypeList {
	Js5 aClass243_5189;
	public static int anInt5190;
	CachingHashMap aClass348_5191;
	CachingHashMap aClass348_5192 = new CachingHashMap(64);

	public AnimFrameset method4900(int i, int i_0_) {
		try {
			AnimFrameset class298_sub37_sub4;
			synchronized (aClass348_5191) {
				class298_sub37_sub4 = (AnimFrameset) aClass348_5191.get(i);
				if (null == class298_sub37_sub4) {
					class298_sub37_sub4 = new AnimFrameset(i);
					aClass348_5191.put(class298_sub37_sub4, i);
				}
				if (!class298_sub37_sub4.isReady()) {
					AnimFrameset class298_sub37_sub4_1_ = null;
					return class298_sub37_sub4_1_;
				}
			}
			return class298_sub37_sub4;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qj.f(").append(')').toString());
		}
	}

	public void method4901(int i) {
		try {
			synchronized (aClass348_5192) {
				aClass348_5192.method4187();
			}
			synchronized (aClass348_5191) {
				aClass348_5191.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qj.b(").append(')').toString());
		}
	}

	public void method4902(int i) {
		try {
			synchronized (aClass348_5192) {
				aClass348_5192.method4189();
			}
			synchronized (aClass348_5191) {
				aClass348_5191.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qj.i(").append(')').toString());
		}
	}

	public SeqTypeList(GameContext gameContext, Language language, Js5 class243, Js5 class243_2_, Js5 class243_3_) {
		aClass348_5191 = new CachingHashMap(100);
		aClass243_5189 = class243;
		if (null != aClass243_5189) {
			int i = aClass243_5189.method2296(1196471561) - 1;
			Js5ConfigGroup.aClass120_1409.method1306((short) 21776);
			aClass243_5189.method2316(i, -1829120689);
		}
		Class_ta_Sub2.method6006(class243_2_, class243_3_, 2, (byte) 2);
	}

	public SeqType method4903(int id, byte i_4_) {
		try {
			SeqType seq;
			synchronized (aClass348_5192) {
				seq = (SeqType) aClass348_5192.get(id);
			}
			if (null != seq) {
				return seq;
			}
			byte[] is;
			synchronized (aClass243_5189) {
				is = aClass243_5189.getFileFromArchive(Js5ConfigGroup.aClass120_1409.method1307(id, 180156567), Js5ConfigGroup.aClass120_1409.method1305(id, -1217474734), (byte) -6);
			}
			seq = new SeqType();
			seq.osrs = id >= OSRSData.SEQUENCES_OFFSET;
			seq.anInt4171 = id * -523719415;
			seq.aClass395_4170 = this;
			if (is != null) {
				if (seq.osrs) {
					seq.decodeOSRS(new Packet(is));
				} else {
					seq.decode(new Packet(is));
				}
			}
			seq.method4879((byte) -46);
			synchronized (aClass348_5192) {
				aClass348_5192.put(seq, id);
			}
			return seq;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qj.a(").append(')').toString());
		}
	}

	public void method4904(int i, byte i_5_) {
		try {
			synchronized (aClass348_5192) {
				aClass348_5192.method4186(i, -208985286);
			}
			synchronized (aClass348_5191) {
				aClass348_5191.method4186(i, -1704294236);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qj.p(").append(')').toString());
		}
	}

	static final void method4905(ClientScript2 class403, int i) {
		try {
			class403.anInt5239 -= -783761378;
			int i_6_ = class403.anIntArray5244[class403.anInt5239 * 681479919];
			int i_7_ = class403.anIntArray5244[1 + 681479919 * class403.anInt5239];
			Class497 class497 = Class92.aClass504_905.method6251(i_7_, -1755093541);
			if (class497.method6206(1883696427)) {
				class403.anObjectArray5240[(class403.anInt5241 += 969361751) * -203050393 - 1] = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_6_).method6041(i_7_, class497.aString6101, (short) 26472);
			} else {
				class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_6_).method6037(i_7_, class497.anInt6100 * -388931549, -2143571113);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qj.aat(").append(')').toString());
		}
	}

	static final void method4906(ClientScript2 class403, int i) {
		try {
			class403.anInt5239 -= -1175642067;
			int i_8_ = class403.anIntArray5244[class403.anInt5239 * 681479919];
			int i_9_ = class403.anIntArray5244[1 + class403.anInt5239 * 681479919];
			int i_10_ = class403.anIntArray5244[class403.anInt5239 * 681479919 + 2];
			Class301_Sub1.method3713(10, i_8_ << 16 | i_9_, i_10_, "", -1433549098);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qj.alu(").append(')').toString());
		}
	}

	static boolean method4907(int i, byte i_11_) {
		try {
			if (i == 3 || 4 == i || 5 == i || 6 == i || i == 1001 || 1002 == i) {
				return true;
			}
			if (2 == i) {
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("qj.bu(").append(')').toString());
		}
	}
}
