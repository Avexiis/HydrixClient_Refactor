/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class359 implements Interface19 {
	int anInt6526;
	int anInt6527;

	Class359(int i, int i_0_) {
		((Class359) this).anInt6526 = -1416816271 * i;
		((Class359) this).anInt6527 = i_0_ * 1741492491;
	}

	public boolean method239(Class298_Sub50 class298_sub50, Interface16[] interface16s, int i, Class323 class323, int i_1_) {
		try {
			for (int i_2_ = 0; i_2_ < i && i_2_ < interface16s.length; i_2_++) {
				Interface16 interface16 = interface16s[i_2_];
				if (interface16 == null) {
					if (i_1_ >= 2145953887)
						throw new IllegalStateException();
				} else if ((interface16.method218((byte) -42) == 843745169 * ((Class359) this).anInt6526) && (interface16.method220((byte) 0) == ((Class359) this).anInt6527 * -1785843037))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oz.a(").append(')').toString());
		}
	}

	public boolean method238(Class298_Sub50 class298_sub50, Interface16[] interface16s, int i, Class323 class323) {
		for (int i_3_ = 0; i_3_ < i && i_3_ < interface16s.length; i_3_++) {
			Interface16 interface16 = interface16s[i_3_];
			if (interface16 != null && (interface16.method218((byte) -70) == 843745169 * ((Class359) this).anInt6526) && (interface16.method220((byte) 0) == ((Class359) this).anInt6527 * -1785843037))
				return true;
		}
		return false;
	}

	public boolean method237(Class298_Sub50 class298_sub50, Interface16[] interface16s, int i, Class323 class323) {
		for (int i_4_ = 0; i_4_ < i && i_4_ < interface16s.length; i_4_++) {
			Interface16 interface16 = interface16s[i_4_];
			if (interface16 != null && (interface16.method218((byte) -60) == 843745169 * ((Class359) this).anInt6526) && (interface16.method220((byte) 0) == ((Class359) this).anInt6527 * -1785843037))
				return true;
		}
		return false;
	}

	static void method4291(RSInterface RSInterface, int i, int i_5_, int i_6_, boolean bool, ClientScript2 class403, int i_7_) {
		try {
			if (i_5_ == 0)
				throw new RuntimeException();
			IComponentDefinition class105 = RSInterface.aClass105Array1405[i];
			if (null == class105.aClass105Array1292) {
				class105.aClass105Array1292 = new IComponentDefinition[i_6_ + 1];
				class105.aClass105Array1293 = class105.aClass105Array1292;
			}
			if (class105.aClass105Array1292.length <= i_6_) {
				if (class105.aClass105Array1293 == class105.aClass105Array1292) {
					IComponentDefinition[] class105s = new IComponentDefinition[1 + i_6_];
					for (int i_8_ = 0; i_8_ < class105.aClass105Array1292.length; i_8_++)
						class105s[i_8_] = class105.aClass105Array1292[i_8_];
					class105.aClass105Array1292 = class105.aClass105Array1293 = class105s;
				} else {
					IComponentDefinition[] class105s = new IComponentDefinition[1 + i_6_];
					IComponentDefinition[] class105s_9_ = new IComponentDefinition[1 + i_6_];
					for (int i_10_ = 0; i_10_ < class105.aClass105Array1292.length; i_10_++) {
						class105s[i_10_] = class105.aClass105Array1292[i_10_];
						class105s_9_[i_10_] = class105.aClass105Array1293[i_10_];
					}
					class105.aClass105Array1292 = class105s;
					class105.aClass105Array1293 = class105s_9_;
				}
			}
			if (i_6_ > 0 && null == class105.aClass105Array1292[i_6_ - 1])
				throw new RuntimeException(new StringBuilder().append("").append(i_6_ - 1).toString());
			IComponentDefinition class105_11_ = new IComponentDefinition();
			class105_11_.type = i_5_ * -800405999;
			class105_11_.parentId = (class105_11_.interfacehash = 1 * class105.interfacehash) * -293252211;
			class105_11_.component = i_6_ * -263105643;
			class105.aClass105Array1292[i_6_] = class105_11_;
			if (class105.aClass105Array1293 != class105.aClass105Array1292)
				class105.aClass105Array1293[i_6_] = class105_11_;
			Class390 class390;
			if (bool)
				class390 = ((ClientScript2) class403).aClass390_5247;
			else
				class390 = ((ClientScript2) class403).aClass390_5246;
			((Class390) class390).aRSInterface_4167 = RSInterface;
			((Class390) class390).aClass105_4168 = class105_11_;
			LocalizedString.markComponentForRedraw(class105, 6185968);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oz.z(").append(')').toString());
		}
	}

	static final void method4292(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -883564772) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1270 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.hasScripts = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oz.nh(").append(')').toString());
		}
	}

	static final void method4293(ClientScript2 class403, byte i) {
		try {
			Class79.method850((((ClientScript2) class403).aClass365_Sub1_Sub4_Sub1_5253), (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), (byte) 14);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) GameClient.aFloatArray8891[0];
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) GameClient.aFloatArray8891[1];
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) GameClient.aFloatArray8891[2];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oz.apa(").append(')').toString());
		}
	}

	public static void method4294(int i) {
		try {
			int i_12_ = 0;
			if (GraphicsAutoSetup.clientPreferences.lightingPreference.getValue(-1994790043) == 1) {
				i_12_ |= 0x1;
				i_12_ |= 0x10;
				i_12_ |= 0x20;
				i_12_ |= 0x2;
				i_12_ |= 0x4;
			}
			if (GraphicsAutoSetup.clientPreferences.texturePreference.getValue(1870666602) == 0)
				i_12_ |= 0x40;
			Class369.method4572(i_12_, -1404267888);
			GameClient.map.method2641(2004012946).method5791(i_12_, -1760580017);
			overheadString.aClass248_612.method2384((short) 206).method2641(-1884844132).method5791(i_12_, -1760580017);
			Class298_Sub32_Sub14.aClass477_9400.method6087(i_12_, 828561369);
			Class15.aClass507_224.method6271(i_12_, 1252678892);
			Class158_Sub1.aSpotAnimTypeList_8568.method4860(i_12_, -142554696);
			Class372.method4594(i_12_, (short) 8448);
			Class82.method872(i_12_, (byte) -68);
			Class365_Sub1_Sub3_Sub2.method4515(i_12_, (byte) -5);
			Class518.method6312(i_12_, (byte) 65);
			Class216.method2002(i_12_, -1700152432);
			GameClient.map.method2667(1301460504);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oz.gw(").append(')').toString());
		}
	}

	public static void method4295(int i, byte i_13_) {
		try {
			Class301_Sub1.anInt7633 = 2138103821 * i;
			Class301_Sub1.anInt7630 = -1998014133;
			Class137_Sub1.anInt6991 = -189172599;
			Class88.anInt810 = -338630500;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oz.cz(").append(')').toString());
		}
	}

	static final void method4296(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (14 != -1233866115 * GameClient.anInt8752 || Class315.method3837((byte) 23))
				GameClient.aByte8959 = (byte) -5;
			else if (string.length() > 20)
				GameClient.aByte8959 = (byte) -4;
			else {
				GameClient.aByte8959 = (byte) -1;
				Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2028, GameClient.aClass25_8693.aClass449_330, (byte) 66);
				class298_sub36.buffer.writeByte(0);
				int i_14_ = (385051775 * class298_sub36.buffer.pos);
				class298_sub36.buffer.writeString(string, 2125577708);
				class298_sub36.buffer.method3649((class298_sub36.buffer.pos * 385051775) - i_14_, (byte) -53);
				GameClient.aClass25_8693.writeOutboundPacket(class298_sub36, (byte) -40);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oz.abg(").append(')').toString());
		}
	}
}
