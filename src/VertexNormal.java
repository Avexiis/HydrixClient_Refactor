/* VertexNormal - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VertexNormal {
	public int priority;
	public int face;
	public int type;
	public int magnitude;
	public static JagexLibraryManager jagexLibraryManager;

	VertexNormal method945(int i, int i_0_) {
		try {
			return new VertexNormal(1834782277 * type, i, -1606786303 * priority, magnitude * 2010148771);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dk.a(" + ')');
		}
	}

	VertexNormal(int i, int i_1_, int i_2_, int i_3_) {
		type = 1558926477 * i;
		face = i_1_ * 2005037049;
		priority = i_2_ * 655269121;
		magnitude = -1163183093 * i_3_;
	}

	static void method946(String[] strings, short[] is, int i, int i_4_, int i_5_) {
		try {
			if (i < i_4_) {
				int i_6_ = (i_4_ + i) / 2;
				int i_7_ = i;
				String string = strings[i_6_];
				strings[i_6_] = strings[i_4_];
				strings[i_4_] = string;
				short i_8_ = is[i_6_];
				is[i_6_] = is[i_4_];
				is[i_4_] = i_8_;
				for (int i_9_ = i; i_9_ < i_4_; i_9_++) {
					if (null == string || (null != strings[i_9_] && strings[i_9_].compareTo(string) < (i_9_ & 0x1))) {
						String string_10_ = strings[i_9_];
						strings[i_9_] = strings[i_7_];
						strings[i_7_] = string_10_;
						short i_11_ = is[i_9_];
						is[i_9_] = is[i_7_];
						is[i_7_++] = i_11_;
					}
				}
				strings[i_4_] = strings[i_7_];
				strings[i_7_] = string;
				is[i_4_] = is[i_7_];
				is[i_7_] = i_8_;
				method946(strings, is, i, i_7_ - 1, 2073959826);
				method946(strings, is, i_7_ + 1, i_4_, 2006941575);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dk.f(" + ')');
		}
	}

	static final void method947(ClientScript2 class403, int i) {
		try {
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_12_, (byte) 26);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_12_ >> 16];
			GameMap.method2677(class105, RSInterface, class403, (byte) -11);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dk.mw(" + ')');
		}
	}

	static final void method948(ClientScript2 class403, int i) {
		try {
			int i_13_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.COLOR_ID_PACKET, GameClient.gameConnection.aClass449_330, (byte) 54);
			class298_sub36.buffer.writeShort(i_13_, 16711935);
			GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -99);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dk.sd(" + ')');
		}
	}

	static final void method949(ClientScript2 class403, int i) {
		try {
			int i_14_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class124.method1385(i_14_, (byte) 2);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dk.ahg(" + ')');
		}
	}

	static final void method950(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1210 * 1508815983;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dk.pp(" + ')');
		}
	}

	static final void method951(ClientScript2 class403, int i) {
		try {
			IComponentDefinition class105 = (((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242.overheadText.method1297((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), (short) 13294));
			class105.aClass105Array1292 = null;
			class105.aClass105Array1293 = null;
			LocalizedString.markComponentForRedraw(class105, -1361442228);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dk.apv(" + ')');
		}
	}

	static int method952(int i, int i_15_, int i_16_) {
		try {
			if (-1976050083 * Class424.aClass424_6592.anInt6613 == i || i == -1976050083 * Class424.aClass424_6594.anInt6613)
				return Class365_Sub1_Sub5_Sub1.anIntArray9891[i_15_ & 0x3];
			return Class365_Sub1_Sub5_Sub1.anIntArray9890[i_15_ & 0x3];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "dk.by(" + ')');
		}
	}
}
