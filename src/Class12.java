/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12 implements Interface8_Impl1_Impl2 {
	int anInt9943;
	int anInt9944;
	float[] aFloatArray9945;
	public static Class298_Sub44 aClass298_Sub44_9946;

	public void b() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.b(").append(')').toString());
		}
	}

	public int f() {
		try {
			return 1671547161 * ((Class12) this).anInt9944;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.f(").append(')').toString());
		}
	}

	public int a() {
		try {
			return ((Class12) this).anInt9943 * 1026825677;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.a(").append(')').toString());
		}
	}

	public int i() {
		return ((Class12) this).anInt9943 * 1026825677;
	}

	public int p() {
		return ((Class12) this).anInt9943 * 1026825677;
	}

	public void u() {
		/* empty */
	}

	public int k() {
		return 1671547161 * ((Class12) this).anInt9944;
	}

	public void d() {
		/* empty */
	}

	Class12(int i, int i_0_) {
		((Class12) this).anInt9943 = i * -1635379451;
		((Class12) this).anInt9944 = i_0_ * 2106032937;
		((Class12) this).aFloatArray9945 = new float[(((Class12) this).anInt9944 * 1671547161 * (1026825677 * ((Class12) this).anInt9943))];
	}

	public void x() {
		/* empty */
	}

	static void method332(GraphicsToolkit class_ra, int i, int i_1_, IComponentDefinition class105, int i_2_) {
		try {
			int i_3_ = 63;
			int i_4_ = 7;
			for (int i_5_ = 63; i_5_ >= 0; i_5_--) {
				int i_6_ = (i_5_ & 0x3f) << 10 | (i_4_ & 0x7) << 7 | i_3_ & 0x7f;
				Class374_Sub1.method4640(false, true, -162450455);
				int i_7_ = JAGLib.anIntArray3165[i_6_];
				Class216.method2000(false, true, (short) 10143);
				class_ra.drawFilledBox(i, ((63 - i_5_) * (class105.height * 457937409) >> 6) + i_1_, -2093041337 * class105.width, 1 + (class105.height * 457937409 >> 6), i_7_, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.a(").append(')').toString());
		}
	}

	static final void method333(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class239.method2209(class105, class403, (byte) 24);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.qz(").append(')').toString());
		}
	}

	static final void method334(ClientScript2 class403, int i) {
		try {
			Class25 class25 = Language.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.FRIEND_CHAT_QUICK_CHAT_MESSAGE, class25.aClass449_330, (byte) 21);
			class298_sub36.buffer.writeByte(0);
			int i_8_ = (class298_sub36.buffer.pos * 385051775);
			class298_sub36.buffer.writeByte(3);
			class298_sub36.buffer.writeShort(((ClientScript2) class403).aClass177_5243.anInt1787 * -2034569943, 16711935);
			((ClientScript2) class403).aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(class298_sub36.buffer, ((ClientScript2) class403).aClass177_5243.anIntArray1789, 1205733536);
			class298_sub36.buffer.method3649((class298_sub36.buffer.pos * 385051775) - i_8_, (byte) -42);
			class25.writeOutboundPacket(class298_sub36, (byte) -84);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.adu(").append(')').toString());
		}
	}

	static final void method335(ClientScript2 class403, int i) {
		try {
			String string = null;
			if (null != Class251.aClass524_2773)
				string = Class251.aClass524_2773.method6376(-161430345);
			if (string == null)
				string = "";
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.amr(").append(')').toString());
		}
	}

	static final void method336(ClientScript2 class403, int i) {
		try {
			Class302_Sub3.method3722((short) 31086);
			GameClient.map.method2667(1321707085);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.amb(").append(')').toString());
		}
	}

	static final void method337(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, byte i) {
		try {
			int i_9_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (i_9_ != 1411971043 * class105.anInt1175) {
				class105.anInt1175 = 1986266571 * i_9_;
				LocalizedString.markComponentForRedraw(class105, -668406254);
			}
			if (class105.component * -1309843523 == -1 && !RSInterface.aBoolean1403)
				Class325.method3966(-440872681 * class105.interfacehash, 1038434674);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.da(").append(')').toString());
		}
	}

	public static final void method338(String string, boolean bool, short i) {
		try {
			if (null != string) {
				if (GameClient.anInt8952 * -548972447 >= 100)
					Class264.method2492(4, (LocalizedString.MESSAGE_IGNORE_LIST_FULL.getText(Class321.ACTIVE_LANGUAGE, -875414210)), (byte) -66);
				else {
					String string_10_ = Class173.method1824(string, 150647374);
					if (null != string_10_) {
						for (int i_11_ = 0; i_11_ < -548972447 * GameClient.anInt8952; i_11_++) {
							String string_12_ = Class173.method1824((GameClient.aStringArray8859[i_11_]), 1138876802);
							if (null != string_12_ && string_12_.equals(string_10_)) {
								Class264.method2492(4, new StringBuilder().append(string).append(LocalizedString.MESSAGE_ALREADY_ON_IGNORE_LIST_SUFFIX.getText((Class321.ACTIVE_LANGUAGE), -875414210)).toString(), (byte) -117);
								return;
							}
							if (GameClient.aStringArray8955[i_11_] != null) {
								String string_13_ = Class173.method1824((GameClient.aStringArray8955[i_11_]), 1588040861);
								if (string_13_ != null && string_13_.equals(string_10_)) {
									Class264.method2492(4, new StringBuilder().append(string).append(LocalizedString.MESSAGE_ALREADY_ON_IGNORE_LIST_SUFFIX.getText(Class321.ACTIVE_LANGUAGE, -875414210)).toString(), (byte) -12);
									return;
								}
							}
						}
						for (int i_14_ = 0; i_14_ < GameClient.anInt8941 * -1054937867; i_14_++) {
							String string_15_ = Class173.method1824((GameClient.aStringArray8704[i_14_]), -916859931);
							if (string_15_ != null && string_15_.equals(string_10_)) {
								Class264.method2492(4, new StringBuilder().append(LocalizedString.MESSAGE_PLEASE_REMOVE_PREFIX_ALT.getText(Class321.ACTIVE_LANGUAGE, -875414210)).append(string).append(LocalizedString.MESSAGE_REMOVE_FROM_FRIENDS_LIST_SUFFIX.getText(Class321.ACTIVE_LANGUAGE, -875414210)).toString(), (byte) -7);
								return;
							}
							if (null != GameClient.aStringArray8945[i_14_]) {
								String string_16_ = Class173.method1824((GameClient.aStringArray8945[i_14_]), 671636487);
								if (string_16_ != null && string_16_.equals(string_10_)) {
									Class264.method2492(4, new StringBuilder().append(LocalizedString.MESSAGE_PLEASE_REMOVE_PREFIX_ALT.getText(Class321.ACTIVE_LANGUAGE, -875414210)).append(string).append(LocalizedString.MESSAGE_REMOVE_FROM_FRIENDS_LIST_SUFFIX.getText(Class321.ACTIVE_LANGUAGE, -875414210)).toString(), (byte) -26);
									return;
								}
							}
						}
						if (Class173.method1824((Class287.myPlayer.username), 675816100).equals(string_10_))
							Class264.method2492(4, (LocalizedString.MESSAGE_CANT_ADD_YOURSELF_IGNORE_LIST.getText(Class321.ACTIVE_LANGUAGE, -875414210)), (byte) -86);
						else {
							Class25 class25 = Language.method5760((short) 512);
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.ADD_IGNORE_PACKET, class25.aClass449_330, (byte) 110);
							class298_sub36.buffer.writeByte(Class58.method693(string, 1022662846) + 1);
							class298_sub36.buffer.writeString(string, 2142299789);
							class298_sub36.buffer.writeByte(bool ? 1 : 0);
							class25.writeOutboundPacket(class298_sub36, (byte) -1);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.mt(").append(')').toString());
		}
	}

	static final void method339(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class472.method6065(class105, RSInterface, class403, -653692022);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.nz(").append(')').toString());
		}
	}

	static final void method340(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GameClient.aBoolean8835 ? 1 : 0;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = GameClient.aString8754 == null ? "" : GameClient.aString8754;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = GameClient.aString8838 == null ? "" : GameClient.aString8838;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("am.vt(").append(')').toString());
		}
	}
}
