/* Class288_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class288_Sub1 extends Class288 implements Runnable {
	public static Class219 aClass219_7147;

	public void run() {
		try {
			((Class288_Sub1) this).aBoolean3102 = true;
			do {
				try {
					try {
						while (!((Class288_Sub1) this).aBoolean3103) {
							for (int i = 0; i < 2; i++) {
								Class284 class284 = (((Class288_Sub1) this).aClass284Array3104[i]);
								if (class284 != null)
									class284.method2680(425339976);
							}
							IPAddress.method6060(10L);
							Class492.method6185(null, -1086923830);
						}
					} catch (Exception exception) {
						IPAddress.method6062(null, exception, (short) -24181);
						((Class288_Sub1) this).aBoolean3102 = false;
						break;
					}
					((Class288_Sub1) this).aBoolean3102 = false;
				} catch (RuntimeException object) {
					((Class288_Sub1) this).aBoolean3102 = false;
					throw object;
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("vn.run(").append(')').toString());
		}
	}

	Class288_Sub1() {
		/* empty */
	}

	static void method2730(int i) {
		try {
			if (Class525.aClass486_6298 != null) {
				try {
					int i_0_;
					if (0 == -1868526275 * Class525.anInt6297)
						i_0_ = 250;
					else
						i_0_ = 2000;
					Class525.anInt6295 += -1475309103;
					if (Class525.anInt6295 * -1864800463 > i_0_)
						Class366.method4547(261104990);
					if (Class525.aClass486_6298 == Class486.aClass486_6060) {
						GameClient.aClass25_8693.method389((Class264_Sub4.method2515(Class241.aClass471_2705.method6056(295506052), 15000, -649048480)), Class241.aClass471_2705.address, (byte) 0);
						GameClient.aClass25_8693.method383((short) 8191);
						Class298_Sub36 class298_sub36 = Class82_Sub6.method885(-1410195138);
						class298_sub36.buffer.writeByte(-1813470547 * Class211.aClass211_2415.anInt2418);
						class298_sub36.buffer.writeShort(0, 16711935);
						int i_1_ = ((class298_sub36.buffer.pos) * 385051775);
						class298_sub36.buffer.writeShort(718, 16711935);
						class298_sub36.buffer.writeShort(1, 16711935);
						Class361.anIntArray3913 = Class256.method2446(class298_sub36, -201782073);
						int i_2_ = ((class298_sub36.buffer.pos) * 385051775);
						class298_sub36.buffer.writeString(GameClient.aString8655, 2134259589);
						class298_sub36.buffer.writeShort(GameClient.anInt8665 * -1154804873, 16711935);
						class298_sub36.buffer.writeLong(GameClient.aLong8645 * -5648129435911399733L);
						class298_sub36.buffer.writeByte(Class321.ACTIVE_LANGUAGE.method242(694163818));
						class298_sub36.buffer.writeByte(GameClient.aGameContext_8944.gameType * -937307905);
						Class10.method322((class298_sub36.buffer), (byte) 1);
						String string = GameClient.aString8648;
						class298_sub36.buffer.writeByte(null == string ? 0 : 1);
						if (null != string)
							class298_sub36.buffer.writeString(string, 2125451920);
						Class12.aClass298_Sub44_9946.writeMachineInformation(class298_sub36.buffer, -1943858301);
						class298_sub36.buffer.pos += 814893177;
						class298_sub36.buffer.method3611(Class361.anIntArray3913, i_2_, 385051775 * (class298_sub36.buffer.pos), -2001901156);
						class298_sub36.buffer.method3593((class298_sub36.buffer.pos) * 385051775 - i_1_, 1585504133);
						GameClient.aClass25_8693.writeOutboundPacket(class298_sub36, (byte) -37);
						GameClient.aClass25_8693.method386(-1810127022);
						Class525.aClass486_6298 = Class486.aClass486_6061;
					}
					if (Class486.aClass486_6061 == Class525.aClass486_6298) {
						if (GameClient.aClass25_8693.method387(537308016).isAvailable(1, (byte) -109)) {
							GameClient.aClass25_8693.method387(537308016).readBytes((((Class25) GameClient.aClass25_8693).aClass298_Sub53_Sub2_333.payload), 0, 1, (byte) -97);
							Class525.aClass412_6299 = ((Class412) (CompressionType.method5701(Class400.method4928((short) 4505), (((Class25) GameClient.aClass25_8693).aClass298_Sub53_Sub2_333.payload[0]) & 0xff, (byte) 2)));
							if (Class525.aClass412_6299 == Class412.aClass412_6569) {
								GameClient.aClass25_8693.aClass449_330 = new IsaacCipher(Class361.anIntArray3913);
								int[] is = new int[4];
								for (int i_3_ = 0; i_3_ < 4; i_3_++)
									is[i_3_] = 50 + Class361.anIntArray3913[i_3_];
								((Class25) GameClient.aClass25_8693).aClass449_334 = new IsaacCipher(is);
								new IsaacCipher(is);
								((Class25) GameClient.aClass25_8693).aClass298_Sub53_Sub2_333.method3665((((Class25) GameClient.aClass25_8693).aClass449_334), (byte) 81);
								Class439.method5851(8, 1887293413);
								GameClient.aClass25_8693.method383((short) 8191);
								((Class25) GameClient.aClass25_8693).aClass298_Sub53_Sub2_333.pos = 0;
								((Class25) GameClient.aClass25_8693).aClass202_344 = null;
								((Class25) GameClient.aClass25_8693).aClass202_345 = null;
								((Class25) GameClient.aClass25_8693).aClass202_348 = null;
								((Class25) GameClient.aClass25_8693).anInt338 = 0;
							} else
								GameClient.aClass25_8693.method384((byte) 83);
							((Class25) GameClient.aClass25_8693).INCOMMING_PACKET = null;
							Class525.aClass486_6298 = null;
						}
					}
				} catch (IOException ioexception) {
					Class366.method4547(-1990066446);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("vn.n(").append(')').toString());
		}
	}
}
