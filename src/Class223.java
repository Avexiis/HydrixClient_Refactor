/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class223 implements Interface24 {
	Js5 aClass243_6664;

	public Class463 method261() {
		return Class463.aClass463_5687;
	}

	public int method256(int i) {
		try {
			if (((Class223) this).aClass243_6664.method2292(380717281))
				return 100;
			return ((Class223) this).aClass243_6664.method2293((byte) 4);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jl.a(").append(')').toString());
		}
	}

	public Class463 method260(int i) {
		try {
			return Class463.aClass463_5687;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jl.f(").append(')').toString());
		}
	}

	public int method258() {
		if (((Class223) this).aClass243_6664.method2292(380717281))
			return 100;
		return ((Class223) this).aClass243_6664.method2293((byte) 4);
	}

	Class223(Js5 class243) {
		((Class223) this).aClass243_6664 = class243;
	}

	public Class463 method257() {
		return Class463.aClass463_5687;
	}

	public Class463 method259() {
		return Class463.aClass463_5687;
	}

	static final void method2078(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -35);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_0_ >> 16];
			Class82_Sub14.method912(class105, RSInterface, class403, 2138455691);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jl.ia(").append(')').toString());
		}
	}

	static final void method2079(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) 14);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_1_ >> 16];
			Class465.method6018(class105, RSInterface, class403, 1442704062);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jl.lw(").append(')').toString());
		}
	}

	static final void method2080(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			Class320.method3913((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]), (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]), (((ClientScript2) class403).anIntArray5244[2 + ((ClientScript2) class403).anInt5239 * 681479919]), (((ClientScript2) class403).anIntArray5244[3 + ((ClientScript2) class403).anInt5239 * 681479919]), false, 256, 1465436328);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jl.ty(").append(')').toString());
		}
	}

	static Class57 method2081(byte[] is, int i) {
		try {
			if (null == is)
				throw new RuntimeException("");
			Class57 class57;
			for (;;) {
				try {
					Image image = Toolkit.getDefaultToolkit().createImage(is);
					MediaTracker mediatracker = new MediaTracker(EnumType.mainApplet);
					mediatracker.addImage(image, 0);
					mediatracker.waitForAll();
					int i_2_ = image.getWidth(EnumType.mainApplet);
					int i_3_ = image.getHeight(EnumType.mainApplet);
					if (mediatracker.isErrorAny() || i_2_ < 0 || i_3_ < 0)
						throw new RuntimeException("");
					int[] is_4_ = new int[i_3_ * i_2_];
					PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_2_, i_3_, is_4_, 0, i_2_);
					pixelgrabber.grabPixels();
					class57 = OverlayType.activeToolkit.method5031(is_4_, 0, i_2_, i_2_, i_3_, 708696378);
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jl.i(").append(')').toString());
		}
	}

	public static final void method2082(boolean bool, int i) {
		try {
			if (!bool) {
				Class504.aClass375_6196.method4648((byte) 90);
				Class151.aClass451_6358.method5929(-176522889);
				Class212.aIdentityKitTypeList_2433.method1580((byte) -92);
				GameClient.map.method2641(1825433072).method5793(1390466939);
				Class15.aClass507_224.method6272(-862794511);
				Class298_Sub32_Sub14.aClass477_9400.method6088((short) 23106);
				Class501.aClass395_6122.method4901(-726986844);
				Class158_Sub1.aSpotAnimTypeList_8568.method4858(-2092821995);
				Class472.configLoader.method3823(755423550);
				Class440.aVarPlayerTypeList_5582.method1915(-134753684);
				SceneryShadowPreference.aClass445_8384.method5893(1929779125);
				Class82_Sub16.aClass427_6886.method5745((byte) 104);
				Class99.aVarClanTypeList_951.method6305(-1223470139);
				Class299.aClanSettings_3199.method4574((byte) 63);
				Class94.aClass349_913.method4199(-1850735168);
				Js5ConfigGroup.aMapIconTypeList_1463.method6161((byte) 115);
				Class363.aWorldMapLabelList_3931.method4118(478354698);
				Class92.aClass504_905.method6250(-1692960093);
				VarBitType.aClass317_3472.method3846((byte) -6);
				Class138_Sub1.aClass131_7010.method1466((short) 26025);
				Class237.aClass499_6668.method6212((byte) 10);
				Class_na.aClass491_9686.method6171((byte) 37);
				Class500.aClass347_6117.method4177((short) 16742);
				Class251.method2402((byte) -99);
				Class8.method319(1407497429);
				Class497.aClass197_6105.method1880(575838917);
				Js5ConfigGroup.method1309((byte) -57);
				if (Class242.aReferenceTable_2708 != ReferenceTable.aReferenceTable_6557) {
					for (int i_5_ = 0; i_5_ < Class98.aByteArrayArray949.length; i_5_++)
						Class98.aByteArrayArray949[i_5_] = null;
					GameClient.anInt8677 = 0;
				}
				GameClient.map.method2640((byte) 31).resetCaches((byte) 24);
				ReferenceTable.method4934((byte) -90);
				Class482.method6119(-1075754274);
				Class330.method4005(-1407310804);
				Class143.method1578((byte) -26);
				Class388.aClass348_4153.method4187();
				GameClient.aClass348_8780.method4187();
				GameClient.aClass348_8898.method4187();
				GameClient.aClass348_8697.method4187();
				ContextMenu.aClass348_5500.method4187();
			}
			Class355.method4262(1675886592);
			Class513.method6293(-707841245);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jl.gx(").append(')').toString());
		}
	}

	static final void method2083(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class12.method337(class105, RSInterface, class403, (byte) 24);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jl.du(").append(')').toString());
		}
	}

	static final void method2084(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			for (TileText tileText = ((TileText) GameClient.tileMessages.method5868(-16777216)); null != tileText; tileText = (TileText) GameClient.tileMessages.method5872(1278684124)) {
				if (GameClient.anInt8884 * 443738891 >= 591467947 * ((TileText) tileText).delay)
					tileText.method3714(1699061251);
				else {
					Class139.method1549((((TileText) tileText).plane * 1759796085), 256 + ((((TileText) tileText).offsetX * 1495033107) << 9), 256 + ((-1852462101 * ((TileText) tileText).offsetY) << 9), 587842750 * ((TileText) tileText).height, -549885479);
					Class101.aClass264_1084.method2490(((TileText) tileText).message, (int) ((float) i + GameClient.aFloatArray8891[0]), (int) (GameClient.aFloatArray8891[1] + (float) i_6_), ~0xffffff | 1160845051 * ((TileText) tileText).color, 0, 8619684);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jl.ji(").append(')').toString());
		}
	}

	public static void method2085(String[] strings, short[] is, int i) {
		try {
			VertexNormal.method946(strings, is, 0, strings.length - 1, 2094440127);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("jl.a(").append(')').toString());
		}
	}
}
