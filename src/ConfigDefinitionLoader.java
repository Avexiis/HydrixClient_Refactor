/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ConfigDefinitionLoader {
	
	Js5 index22;
	CachingHashMap cache = new CachingHashMap(64);

	public void method3823(int i) {
		try {
			synchronized (cache) {
				cache.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nb.f(").append(')').toString());
		}
	}

	public void method3824(int i) {
		try {
			synchronized (cache) {
				cache.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nb.p(").append(')').toString());
		}
	}

	public void method3825(int i, byte i_0_) {
		try {
			synchronized (cache) {
				cache.method4187();
				cache = new CachingHashMap(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nb.i(").append(')').toString());
		}
	}

	public void method3826(int i, byte i_1_) {
		try {
			synchronized (cache) {
				cache.method4186(i, 204865938);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nb.b(").append(')').toString());
		}
	}

	public ConfigDefinitionLoader(GameContext gameContext, Language language, Js5 class243) {
		index22 = class243;
		if (index22 != null) {
			int i = index22.method2296(2088108840) - 1;
			Js5ConfigGroup.aClass120_1406.method1306((short) 7909);
			index22.method2316(i, 967571472);
		}
	}

	public VarBitType getConfigDefinitions(int fileId, int i_2_) {
		try {
			VarBitType definition;
			synchronized (cache) {
				definition = (VarBitType) cache.get(fileId);
			}
			if (null != definition) {
				return definition;
			}
			byte[] data;
			synchronized (index22) {
				data = (index22.getFileFromArchive(Js5ConfigGroup.aClass120_1406.method1307(fileId, -1343831720), Js5ConfigGroup.aClass120_1406.method1305(fileId, 39933071), (byte) 14));
			}
			definition = new VarBitType();
			if (data != null) {
				definition.parseBuffer(new Packet(data), 16711680);
			}
			synchronized (cache) {
				cache.put(definition, fileId);
			}
			return definition;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nb.a(").append(')').toString());
		}
	}

	static final void method3828(ClientScript2 class403, byte i) {
		try {
			class403.anInt5245 -= -1365138610;
			if ((class403.aLongArray5251[1685767703 * class403.anInt5245]) <= (class403.aLongArray5251[class403.anInt5245 * 1685767703 + 1])) {
				class403.integerPos += (286750741 * (class403.integerstack[class403.integerPos * 1883543357]));
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nb.bl(").append(')').toString());
		}
	}

	static final void method3829(ClientScript2 class403, short i) {
		try {
			int i_3_ = (class403.anIntArray5244[((class403.anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_3_, (byte) -48);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_3_ >> 16];
			RSInterface.method1298(class105, RSInterface, class403, (byte) 39);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nb.ib(").append(')').toString());
		}
	}

	static final void method3830(ClientScript2 class403, int i) {
		try {
			Class25 class25 = Language.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.FRIEND_CHAT_QUICK_CHAT_MESSAGE, class25.aClass449_330, (byte) 109);
			class298_sub36.buffer.writeByte(0);
			int i_4_ = (class298_sub36.buffer.pos * 385051775);
			class298_sub36.buffer.writeByte(1);
			class298_sub36.buffer.writeShort(-2034569943 * class403.aClass177_5243.anInt1787, 16711935);
			class403.aClass177_5243.aClass298_Sub37_Sub14_1788.method3464(class298_sub36.buffer, class403.aClass177_5243.anIntArray1789, 373327263);
			class298_sub36.buffer.method3649((class298_sub36.buffer.pos * 385051775) - i_4_, (byte) -102);
			class25.writeOutboundPacket(class298_sub36, (byte) -38);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nb.ack(").append(')').toString());
		}
	}

	static int method3831(CharSequence charsequence, char c, int i) {
		try {
			int i_5_ = 0;
			int i_6_ = charsequence.length();
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				if (charsequence.charAt(i_7_) == c) {
					i_5_++;
				}
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nb.a(").append(')').toString());
		}
	}

	static final void method3832(ClientScript2 class403, int i) {
		try {
			int i_8_ = (class403.anIntArray5244[((class403.anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_8_, (byte) -74);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_8_ >> 16];
			Class365_Sub1_Sub3_Sub1.method4509(class105, RSInterface, class403, (byte) -34);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nb.ka(").append(')').toString());
		}
	}
}
