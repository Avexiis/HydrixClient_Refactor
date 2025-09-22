/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class221 implements Interface24 {
	String aString6661;
	boolean aBoolean6662;
	static int anInt6663;

	public int method256(int i) {
		try {
			if (((Class221) this).aBoolean6662)
				return 100;
			int i_0_ = VertexNormal.jagexLibraryManager.method3744(((Class221) this).aString6661, 637615919);
			if (i_0_ >= 0 && i_0_ <= 100)
				return i_0_;
			((Class221) this).aBoolean6662 = true;
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jh.a(").append(')').toString());
		}
	}

	public Class463 method260(int i) {
		try {
			return Class463.aClass463_5685;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jh.f(").append(')').toString());
		}
	}

	public Class463 method261() {
		return Class463.aClass463_5685;
	}

	public int method258() {
		if (((Class221) this).aBoolean6662)
			return 100;
		int i = VertexNormal.jagexLibraryManager.method3744(((Class221) this).aString6661, 963304472);
		if (i >= 0 && i <= 100)
			return i;
		((Class221) this).aBoolean6662 = true;
		return 100;
	}

	public Class463 method259() {
		return Class463.aClass463_5685;
	}

	public Class463 method257() {
		return Class463.aClass463_5685;
	}

	Class221(String string) {
		((Class221) this).aString6661 = string;
	}

	boolean method2050(int i) {
		try {
			return ((Class221) this).aBoolean6662;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jh.d(").append(')').toString());
		}
	}

	static final void method2051(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (GameClient.playerRights * 1806357379 != 0 || ((!GameClient.aBoolean8811 || GameClient.aBoolean8812) && !GameClient.aBoolean8802)) {
				String string_1_ = string.toLowerCase();
				int i_2_ = 0;
				if (string_1_.startsWith(LocalizedString.COLOR_YELLOW.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 0;
					string = string.substring(LocalizedString.COLOR_YELLOW.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.COLOR_RED.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 1;
					string = string.substring(LocalizedString.COLOR_RED.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.COLOR_GREEN.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 2;
					string = string.substring(LocalizedString.COLOR_GREEN.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.COLOR_CYAN.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 3;
					string = string.substring(LocalizedString.COLOR_CYAN.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.EFFECT_PURPLE.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 4;
					string = string.substring(LocalizedString.EFFECT_PURPLE.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.COLOR_WHITE.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 5;
					string = string.substring(LocalizedString.COLOR_WHITE.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.EFFECT_FLASH1.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 6;
					string = string.substring(LocalizedString.EFFECT_FLASH1.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.MESSAGE_REPORT_UNKNOWN.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 7;
					string = string.substring(LocalizedString.MESSAGE_REPORT_UNKNOWN.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.EFFECT_FLASH3.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 8;
					string = string.substring(LocalizedString.EFFECT_FLASH3.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.EFFECT_GLOW1.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 9;
					string = string.substring(LocalizedString.EFFECT_GLOW1.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.EFFECT_GLOW2.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 10;
					string = string.substring(LocalizedString.EFFECT_GLOW2.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.EFFECT_GLOW3.getText(Language.aLanguage_6624, -875414210))) {
					i_2_ = 11;
					string = string.substring(LocalizedString.EFFECT_GLOW3.getText(Language.aLanguage_6624, -875414210).length());
				} else if (DynamicLight.ACTIVE_LANGUAGE != Language.aLanguage_6624) {
					if (string_1_.startsWith(LocalizedString.COLOR_YELLOW.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 0;
						string = string.substring(LocalizedString.COLOR_YELLOW.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.COLOR_RED.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 1;
						string = string.substring(LocalizedString.COLOR_RED.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.COLOR_GREEN.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 2;
						string = string.substring(LocalizedString.COLOR_GREEN.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.COLOR_CYAN.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 3;
						string = string.substring(LocalizedString.COLOR_CYAN.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.EFFECT_PURPLE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 4;
						string = string.substring(LocalizedString.EFFECT_PURPLE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.COLOR_WHITE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 5;
						string = string.substring(LocalizedString.COLOR_WHITE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.EFFECT_FLASH1.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 6;
						string = string.substring(LocalizedString.EFFECT_FLASH1.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.MESSAGE_REPORT_UNKNOWN.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 7;
						string = string.substring(LocalizedString.MESSAGE_REPORT_UNKNOWN.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.EFFECT_FLASH3.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 8;
						string = string.substring(LocalizedString.EFFECT_FLASH3.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.EFFECT_GLOW1.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 9;
						string = string.substring(LocalizedString.EFFECT_GLOW1.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.EFFECT_GLOW2.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 10;
						string = string.substring(LocalizedString.EFFECT_GLOW2.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.EFFECT_GLOW3.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_2_ = 11;
						string = string.substring(LocalizedString.EFFECT_GLOW3.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					}
				}
				string_1_ = string.toLowerCase();
				int i_3_ = 0;
				if (string_1_.startsWith(LocalizedString.EFFECT_WAVE.getText(Language.aLanguage_6624, -875414210))) {
					i_3_ = 1;
					string = string.substring(LocalizedString.EFFECT_WAVE.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.EFFECT_WAVE2.getText(Language.aLanguage_6624, -875414210))) {
					i_3_ = 2;
					string = string.substring(LocalizedString.EFFECT_WAVE2.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.EFFECT_SHAKE.getText(Language.aLanguage_6624, -875414210))) {
					i_3_ = 3;
					string = string.substring(LocalizedString.EFFECT_SHAKE.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.EFFECT_SCROLL.getText(Language.aLanguage_6624, -875414210))) {
					i_3_ = 4;
					string = string.substring(LocalizedString.EFFECT_SCROLL.getText(Language.aLanguage_6624, -875414210).length());
				} else if (string_1_.startsWith(LocalizedString.EFFECT_SLIDE.getText(Language.aLanguage_6624, -875414210))) {
					i_3_ = 5;
					string = string.substring(LocalizedString.EFFECT_SLIDE.getText(Language.aLanguage_6624, -875414210).length());
				} else if (Language.aLanguage_6624 != DynamicLight.ACTIVE_LANGUAGE) {
					if (string_1_.startsWith(LocalizedString.EFFECT_WAVE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_3_ = 1;
						string = string.substring(LocalizedString.EFFECT_WAVE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.EFFECT_WAVE2.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_3_ = 2;
						string = string.substring(LocalizedString.EFFECT_WAVE2.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.EFFECT_SHAKE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_3_ = 3;
						string = string.substring(LocalizedString.EFFECT_SHAKE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.EFFECT_SCROLL.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_3_ = 4;
						string = string.substring(LocalizedString.EFFECT_SCROLL.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					} else if (string_1_.startsWith(LocalizedString.EFFECT_SLIDE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210))) {
						i_3_ = 5;
						string = string.substring(LocalizedString.EFFECT_SLIDE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210).length());
					}
				}
				Class25 class25 = Language.method5760((short) 512);
				Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.CHAT_PACKET, class25.aClass449_330, (byte) 107);
				class298_sub36.buffer.writeByte(0);
				int i_4_ = (385051775 * class298_sub36.buffer.pos);
				class298_sub36.buffer.writeByte(i_2_);
				class298_sub36.buffer.writeByte(i_3_);
				Class23.method379(class298_sub36.buffer, string, 1526854691);
				class298_sub36.buffer.method3649((class298_sub36.buffer.pos * 385051775) - i_4_, (byte) -57);
				class25.writeOutboundPacket(class298_sub36, (byte) -12);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jh.abt(").append(')').toString());
		}
	}

	public static Class145 method2052(Packet class298_sub53, int i) {
		try {
			int i_5_ = class298_sub53.readUnsignedInt();
			return new Class145(i_5_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jh.a(").append(')').toString());
		}
	}

	public static void method2053(int i) {
		try {
			if (Class93.method1014(-81173133))
				Class440.method5860(new Class382(), (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jh.a(").append(')').toString());
		}
	}
}
