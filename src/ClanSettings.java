/* ClanSettings - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClanSettings {
	CachingHashMap aClass348_4029 = new CachingHashMap(64);
	Js5 aClass243_4030;

	public void method4573(int i, int i_0_) {
		try {
			synchronized (((ClanSettings) this).aClass348_4029) {
				((ClanSettings) this).aClass348_4029.method4186(i, -1076736355);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pj.b(").append(')').toString());
		}
	}

	public void method4574(byte i) {
		try {
			synchronized (((ClanSettings) this).aClass348_4029) {
				((ClanSettings) this).aClass348_4029.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pj.f(").append(')').toString());
		}
	}

	public void method4575(int i) {
		try {
			synchronized (((ClanSettings) this).aClass348_4029) {
				((ClanSettings) this).aClass348_4029.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pj.p(").append(')').toString());
		}
	}

	public VarClanSettings method4576(int i, int i_1_) {
		try {
			VarClanSettings varClanSettings;
			synchronized (((ClanSettings) this).aClass348_4029) {
				varClanSettings = (VarClanSettings) ((ClanSettings) this).aClass348_4029.get((long) i);
			}
			if (null != varClanSettings)
				return varClanSettings;
			byte[] is;
			synchronized (((ClanSettings) this).aClass243_4030) {
				is = (((ClanSettings) this).aClass243_4030.getFileFromArchive(Js5ConfigGroup.aClass120_1414.anInt1460 * -1006924897, i, (byte) -90));
			}
			varClanSettings = new VarClanSettings();
			if (is != null)
				varClanSettings.decode(new Packet(is), 1705012994);
			synchronized (((ClanSettings) this).aClass348_4029) {
				((ClanSettings) this).aClass348_4029.put(varClanSettings, (long) i);
			}
			return varClanSettings;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pj.a(").append(')').toString());
		}
	}

	public ClanSettings(GameContext gameContext, Language language, Js5 class243) {
		((ClanSettings) this).aClass243_4030 = class243;
		if (null != ((ClanSettings) this).aClass243_4030)
			((ClanSettings) this).aClass243_4030.method2316(-1006924897 * Js5ConfigGroup.aClass120_1414.anInt1460, -279300149);
	}

	public static boolean method4577(byte i) {
		try {
			Class298_Sub47 class298_sub47 = ((Class298_Sub47) Class478.aLinkedNodeList_6002.method5939(1766612795));
			if (class298_sub47 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pj.f(").append(')').toString());
		}
	}

	public static void method4578(int i, boolean bool, int i_2_) {
		try {
			Class371.method4584(i, LocalizedString.MESSAGE_LOADING_PLEASE_WAIT.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210), bool, (byte) 31);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pj.fw(").append(')').toString());
		}
	}

	static void method4579(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class435 class435, byte i_8_) {
		try {
			ObjectDeque objectDeque = null;
			for (ObjectDeque objectDeque_9_ = ((ObjectDeque) ObjectDeque.aLinkedNodeList_7162.method5939(1766612795)); objectDeque_9_ != null; objectDeque_9_ = ((ObjectDeque) ObjectDeque.aLinkedNodeList_7162.method5944(49146))) {
				if (i == (2108312995 * ((ObjectDeque) objectDeque_9_).anInt7151) && i_3_ == 634196087 * objectDeque_9_.anInt7150 && i_4_ == objectDeque_9_.anInt7155 * -2146829167 && -431456739 * (((ObjectDeque) objectDeque_9_).anInt7157) == i_5_) {
					objectDeque = objectDeque_9_;
					break;
				}
			}
			if (null == objectDeque) {
				objectDeque = new ObjectDeque();
				((ObjectDeque) objectDeque).anInt7151 = i * -196260341;
				((ObjectDeque) objectDeque).anInt7157 = i_5_ * 1088435253;
				objectDeque.anInt7150 = i_3_ * 656787783;
				objectDeque.anInt7155 = 284247153 * i_4_;
				ObjectDeque.aLinkedNodeList_7162.addlast(objectDeque, 1693481470);
			}
			((ObjectDeque) objectDeque).anInt7156 = i_6_ * 240885009;
			((ObjectDeque) objectDeque).anInt7153 = i_7_ * 998055383;
			((ObjectDeque) objectDeque).aClass435_7158 = class435;
			((ObjectDeque) objectDeque).aBoolean7159 = true;
			((ObjectDeque) objectDeque).aBoolean7160 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pj.f(").append(')').toString());
		}
	}
}
