/* VarClanTypeList - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.io.IOException;

public class VarClanTypeList {
	CachingHashMap aClass348_6267 = new CachingHashMap(64);
	public int anInt6268;
	Js5 aClass243_6269;
	public static Js5 js5_index36;

	public void method6304(int i, int i_0_) {
		try {
			synchronized (((VarClanTypeList) this).aClass348_6267) {
				((VarClanTypeList) this).aClass348_6267.method4186(i, -583338746);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "vt.b(" + ')');
		}
	}

	public void method6305(int i) {
		try {
			synchronized (((VarClanTypeList) this).aClass348_6267) {
				((VarClanTypeList) this).aClass348_6267.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "vt.f(" + ')');
		}
	}

	public void method6306(byte i) {
		try {
			synchronized (((VarClanTypeList) this).aClass348_6267) {
				((VarClanTypeList) this).aClass348_6267.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "vt.p(" + ')');
		}
	}

	public VarClanType method6307(int i, int i_1_) {
		try {
			VarClanType varClanType;
			synchronized (((VarClanTypeList) this).aClass348_6267) {
				varClanType = (VarClanType) ((VarClanTypeList) this).aClass348_6267.get((long) i);
			}
			if (varClanType != null)
				return varClanType;
			byte[] is;
			synchronized (((VarClanTypeList) this).aClass243_6269) {
				is = (((VarClanTypeList) this).aClass243_6269.getFileFromArchive(Js5ConfigGroup.aClass120_1452.anInt1460 * -1006924897, i, (byte) -91));
			}
			varClanType = new VarClanType();
			if (is != null)
				varClanType.method6321(new Packet(is), -1099657695);
			synchronized (((VarClanTypeList) this).aClass348_6267) {
				((VarClanTypeList) this).aClass348_6267.put(varClanType, (long) i);
			}
			return varClanType;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "vt.a(" + ')');
		}
	}

	public VarClanTypeList(GameContext gameContext, Language language, Js5 class243) {
		((VarClanTypeList) this).aClass243_6269 = class243;
		if (((VarClanTypeList) this).aClass243_6269 != null)
			anInt6268 = (((VarClanTypeList) this).aClass243_6269.method2316(-1006924897 * Js5ConfigGroup.aClass120_1452.anInt1460, 650803238)) * 2084802537;
		else
			anInt6268 = 0;
	}

	static void method6308(GraphicsToolkit class_ra, int i) {
		try {
			if (Class522.aLinkedNodeList_6283.method5948(1828905535) != 0) {
				if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-627187888) == 0) {
					for (Class298_Sub14 class298_sub14 = (Class298_Sub14) Class522.aLinkedNodeList_6283.method5939(1766612795); null != class298_sub14; class298_sub14 = ((Class298_Sub14) Class522.aLinkedNodeList_6283.method5944(49146))) {
						Class298_Sub32_Sub14.aClass477_9400.method6086(class_ra, class_ra, (-1979936541 * ((Class298_Sub14) class298_sub14).anInt7264), (((Class298_Sub14) class298_sub14).anInt7261 * -751580615), (1613862267 * ((Class298_Sub14) class298_sub14).anInt7263), (((Class298_Sub14) class298_sub14).anInt7260 * -944151257), false, false, (-1216336855 * ((Class298_Sub14) class298_sub14).anInt7262), ScriptContext.aClass264_7534, (((Class298_Sub14) class298_sub14).aBoolean7265 ? (Class287.myPlayer.appearance) : null), 1788760477);
						class298_sub14.unlink(-1460969981);
					}
					LoginData.method4301(-1387034810);
				} else {
					if (null == Class522.aClass_ra6285) {
						Canvas canvas = new Canvas();
						canvas.setSize(36, 32);
						Class522.aClass_ra6285 = Class523.method6334(0, canvas, Class253.anInterface_ma2785, Class82_Sub6.aClass243_6844, 0, -753690122);
						Class522.aClass264_6284 = (Class522.aClass_ra6285.method5092(Class322.method3931(Class173.aClass243_1758, (399302739 * Class74.anInt691), 0, (byte) 78), Class89.method993(Class158.aClass243_6364, Class74.anInt691 * 399302739, 0), true));
					}
					for (Class298_Sub14 class298_sub14 = (Class298_Sub14) Class522.aLinkedNodeList_6283.method5939(1766612795); null != class298_sub14; class298_sub14 = ((Class298_Sub14) Class522.aLinkedNodeList_6283.method5944(49146))) {
						Class298_Sub32_Sub14.aClass477_9400.method6086(Class522.aClass_ra6285, class_ra, (((Class298_Sub14) class298_sub14).anInt7264 * -1979936541), (((Class298_Sub14) class298_sub14).anInt7261 * -751580615), (((Class298_Sub14) class298_sub14).anInt7263 * 1613862267), (((Class298_Sub14) class298_sub14).anInt7260 * -944151257), false, false, (-1216336855 * ((Class298_Sub14) class298_sub14).anInt7262), Class522.aClass264_6284, (((Class298_Sub14) class298_sub14).aBoolean7265 ? (Class287.myPlayer.appearance) : null), 1451736551);
						class298_sub14.unlink(-1460969981);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "vt.f(" + ')');
		}
	}

	static final void method6309(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class497 class497 = Class92.aClass504_905.method6251(i_3_, 1417186539);
			if (class497.method6206(1883696427))
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = Class15.aClass507_224.method6269(i_2_, 745591351).method6245(i_3_, class497.aString6101, 1273707892);
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (Class15.aClass507_224.method6269(i_2_, 1830480683).method6239(i_3_, -388931549 * class497.anInt6100, (byte) 106));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "vt.abu(" + ')');
		}
	}

	public static void method6310(boolean bool, int i) {
		try {
			Class247.method2365(2092159420);
			if (Class435.method5804(GameClient.anInt8752 * -1233866115, (byte) -21)) {
				Class25[] class25s = GameClient.aClass25Array8679;
				for (int i_4_ = 0; i_4_ < class25s.length; i_4_++) {
					Class25 class25 = class25s[i_4_];
					class25.anInt339 += 1797987493;
					if (class25.anInt339 * 2033675053 < 50 && !bool)
						return;
					class25.anInt339 = 0;
					if (!class25.aBoolean347 && class25.method387(537308016) != null) {
						Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.PING_PACKET, class25.aClass449_330, (byte) 20);
						class25.writeOutboundPacket(class298_sub36, (byte) -114);
						try {
							class25.method386(-1411124831);
						} catch (IOException ioexception) {
							class25.aBoolean347 = true;
						}
					}
				}
				Class247.method2365(1802810094);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "vt.a(" + ')');
		}
	}
}
