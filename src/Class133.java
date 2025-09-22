/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133 {
	static Class133 aClass133_1509;
	static Class133 aClass133_1510 = new Class133();
	static Class133 aClass133_1511 = new Class133();
	public static Js5 aClass243_1512;

	public int method1482(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = (Class298_Sub40_Sub9.anInt9716 * -1111710645 > i_0_ ? -1111710645 * Class298_Sub40_Sub9.anInt9716 : i_0_);
			if (this == aClass133_1510)
				return 0;
			if (aClass133_1509 == this)
				return i_2_ - i;
			if (aClass133_1511 == this)
				return (i_2_ - i) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fj.f(").append(')').toString());
		}
	}

	Class133() {
		/* empty */
	}

	static {
		aClass133_1509 = new Class133();
	}

	static final void method1483(ClientScript2 class403, int i) {
		try {
			NPC class365_sub1_sub1_sub2_sub1 = ((NPC) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242);
			boolean bool = false;
			NPCType class503 = class365_sub1_sub1_sub2_sub1.definition;
			if (class503.anIntArray6188 != null)
				class503 = class503.method6240(Class128.aClass148_6331, 1885989341);
			if (null != class503)
				bool = class503.aBoolean6163;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fj.apz(").append(')').toString());
		}
	}

	static final void method1484(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			DevConsoleInit.method4602(class105, RSInterface, class403, 1567634168);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fj.hr(").append(')').toString());
		}
	}

	static final void method1485(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class128.method1436(class105, RSInterface, class403, -588058138);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fj.hz(").append(')').toString());
		}
	}

	static final void method1486(ClientScript2 class403, byte i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_4_ = i_3_ >> 14 & 0x3fff;
			int i_5_ = i_3_ & 0x3fff;
			WorldTile worldTile = GameClient.map.getRegionStart(681479919);
			i_4_ -= -1760580017 * worldTile.x;
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ >= GameClient.map.upperX(-1870653657))
				i_4_ = GameClient.map.upperX(-2106000427);
			i_5_ -= worldTile.y * 283514611;
			if (i_5_ < 0)
				i_5_ = 0;
			else if (i_5_ >= GameClient.map.upperY(787275205))
				i_5_ = GameClient.map.upperY(11403406);
			GameClient.anInt8753 = 672497503 * ((i_4_ << 9) + 256);
			GameClient.anInt8755 = 957476733 * ((i_5_ << 9) + 256);
			ObjectDeque.anInt7164 = -1469516446;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fj.agl(").append(')').toString());
		}
	}
}
