/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class237 implements Interface24 {
	Js5 aClass243_6665;
	String aString6666;
	static int anInt6667;
	public static Class499 aClass499_6668;

	public Class463 method261() {
		return Class463.aClass463_5684;
	}

	public int method256(int i) {
		try {
			if (((Class237) this).aClass243_6665.method2313(((Class237) this).aString6666, 1689280899))
				return 100;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jz.a(").append(')').toString());
		}
	}

	public Class463 method260(int i) {
		try {
			return Class463.aClass463_5684;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jz.f(").append(')').toString());
		}
	}

	public int method258() {
		if (((Class237) this).aClass243_6665.method2313(((Class237) this).aString6666, 1689280899))
			return 100;
		return 0;
	}

	Class237(Js5 class243, String string) {
		((Class237) this).aClass243_6665 = class243;
		((Class237) this).aString6666 = string;
	}

	public Class463 method257() {
		return Class463.aClass463_5684;
	}

	public Class463 method259() {
		return Class463.aClass463_5684;
	}

	public static MapKeys method2192(Js5 class243, String string, boolean bool, int i) {
		try {
			int i_0_ = class243.getArchiveIdByName(string, -912375473);
			if (-1 == i_0_)
				return new MapKeys(0);
			int[] is = class243.getFileIds(i_0_, -2131857689);
			MapKeys mapKeys = new MapKeys(is.length);
			int i_1_ = 0;
			int i_2_ = 0;
			while (i_1_ < mapKeys.anInt3169 * -1407078377) {
				Packet class298_sub53 = new Packet(class243.getFileFromArchive(i_0_, is[i_2_++], (byte) -34));
				int i_3_ = class298_sub53.readUnsignedInt();
				int i_4_ = class298_sub53.readUnsignedShort();
				int i_5_ = class298_sub53.readUnsignedByte();
				if (bool || i_5_ != 1) {
					mapKeys.anIntArray3168[i_1_] = i_3_;
					mapKeys.anIntArray3170[i_1_] = i_4_;
					i_1_++;
				} else
					mapKeys.anInt3169 -= 526813095;
			}
			return mapKeys;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jz.a(").append(')').toString());
		}
	}

	static final void method2193(ClientScript2 class403, int i) {
		try {
			WorldMapArea worldMapArea = Class52_Sub1.method567(-1558918044);
			if (worldMapArea == null) {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
			} else {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = worldMapArea.mapAreaId * -530122905;
				int i_6_ = (worldMapArea.anInt7605 * -1740053407 << 28 | (WorldMap.mapX + 2122110429 * worldMapArea.x) << 14 | (WorldMap.mapY + worldMapArea.y * -372920341));
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = i_6_;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jz.adg(").append(')').toString());
		}
	}

	static final void method2194(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GameClient.aBoolean8811 && !GameClient.aBoolean8812 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jz.amz(").append(')').toString());
		}
	}

	static Class359 method2195(Packet class298_sub53, byte i) {
		try {
			int i_7_ = class298_sub53.readUnsignedByte();
			int i_8_ = class298_sub53.readUnsignedByte();
			return new Class359(i_7_, i_8_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jz.p(").append(')').toString());
		}
	}

	public static void method2196(int i) {
		try {
			Class523.method6332(2037731231);
			Class390.method4876(22050, GraphicsAutoSetup.clientPreferences.aClass422_Sub22_7586.method5706((byte) 39) == 1, 2, 1903660565);
			Class300.aClass284_3212 = Class75.method834(Class52_Sub2_Sub1.aCanvas9079, 0, 22050, -1188056324);
			MagnetConfig.method777(true, Class8.method318(null, -1296770048), 1539003934);
			Class3.aClass284_68 = Class75.method834(Class52_Sub2_Sub1.aCanvas9079, 1, 2048, -1833287234);
			Class3.aClass284_68.method2679(Class285.aClass298_Sub19_Sub4_3083, 2098926435);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jz.b(").append(')').toString());
		}
	}

	public static void method2197(int i, byte i_9_) {
		try {
			IComponentDefinition.aClass348_1135.method4186(i, -450593639);
			IComponentDefinition.aClass348_1138.method4186(i, -631173514);
			IComponentDefinition.aClass348_1136.method4186(i, -826447089);
			IComponentDefinition.aClass348_1296.method4186(i, -1629354763);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jz.e(").append(')').toString());
		}
	}

	static void method2198(int i, int i_10_, int i_11_, int i_12_, short i_13_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(19, (long) i_10_ << 32 | (long) i);
			class298_sub37_sub12.method3449((byte) 2);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = 1274450087 * i_11_;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608 = 293101103 * i_12_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jz.bd(").append(')').toString());
		}
	}
}
