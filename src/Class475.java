/* Class475 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475 {
	Js5 aClass243_5981;
	CachingHashMap aClass348_5982 = new CachingHashMap(128);

	public Class475(GameContext gameContext, Language language, Js5 class243) {
		((Class475) this).aClass243_5981 = class243;
		if (null != ((Class475) this).aClass243_5981) {
			int i = ((Class475) this).aClass243_5981.method2296(1572683796) - 1;
			Js5ConfigGroup.aClass120_1413.method1306((short) 19923);
			((Class475) this).aClass243_5981.method2316(i, 146505674);
		}
	}

	public EnumType getClientScriptMap(int id, int i_0_) {
		try {
			EnumType class483;
			synchronized (((Class475) this).aClass348_5982) {
				class483 = (EnumType) ((Class475) this).aClass348_5982.get((long) id);
			}
			if (null != class483)
				return class483;
			byte[] is = (((Class475) this).aClass243_5981.getFileFromArchive(Js5ConfigGroup.aClass120_1413.method1307(id, -1240874866), Js5ConfigGroup.aClass120_1413.method1305(id, -2003896976), (byte) -65));
			class483 = new EnumType();
			if (null != is)
				class483.method6123(new Packet(is), 592135620);
			// System.out.println("id: "+id);
			synchronized (((Class475) this).aClass348_5982) {
				((Class475) this).aClass348_5982.put(class483, (long) id);
			}
			return class483;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("to.a(").append(')').toString());
		}
	}

	public static final void method6075(short i) {
		try {
			int i_1_ = GraphicsAutoSetup.clientPreferences.aClass422_Sub17_7565.method5689(-2013953489);
			if (i_1_ == 0) {
				GameClient.map.method2643(null, 1496940593);
				Class136_Sub1.method1502(0, (byte) 0);
			} else if (i_1_ == 1) {
				Class231.method2132((byte) 0, 1452497701);
				Class136_Sub1.method1502(512, (byte) 0);
				if (GameClient.map.method2675(-1611682495) != null)
					Class379.method4674(-1148794921);
			} else {
				Class231.method2132((byte) (GameClient.anInt8777 * -1953789277 - 4 & 0xff), 1394791892);
				Class136_Sub1.method1502(2, (byte) 0);
			}
			GameClient.anInt8792 = Class99.anInt952 * 832032973;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("to.it(").append(')').toString());
		}
	}

	static final void method6076(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			int i_4_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]);
			Class301_Sub1.method3713(3, i_2_ << 16 | i_3_, i_4_, "", 226105576);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("to.alf(").append(')').toString());
		}
	}
}
