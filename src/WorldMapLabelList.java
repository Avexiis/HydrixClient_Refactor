/* WorldMapLabelList - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class WorldMapLabelList {
	CachingHashMap aClass348_3633 = new CachingHashMap(128);
	Js5 aClass243_3634;
	CachingHashMap aClass348_3635 = new CachingHashMap(64);
	public static int anInt3636 = 64;
	public static int anInt3637 = 128;
	Js5 aClass243_3638;

	public WorldMapLabel method4116(int i, int i_0_) {
		try {
			WorldMapLabel worldMapLabel;
			synchronized (((WorldMapLabelList) this).aClass348_3633) {
				worldMapLabel = (WorldMapLabel) ((WorldMapLabelList) this).aClass348_3633.get((long) i);
			}
			if (null != worldMapLabel)
				return worldMapLabel;
			byte[] is;
			synchronized (((WorldMapLabelList) this).aClass243_3634) {
				is = (((WorldMapLabelList) this).aClass243_3634.getFileFromArchive(-1006924897 * Js5ConfigGroup.aClass120_1441.anInt1460, i, (byte) -50));
			}
			worldMapLabel = new WorldMapLabel();
			worldMapLabel.anInt3784 = i * -1314224517;
			((WorldMapLabel) worldMapLabel).aWorldMapLabelList_3776 = this;
			if (null != is)
				worldMapLabel.method4234(new Packet(is), 677294156);
			worldMapLabel.method4236(-2028802869);
			synchronized (((WorldMapLabelList) this).aClass348_3633) {
				((WorldMapLabelList) this).aClass348_3633.put(worldMapLabel, (long) i);
			}
			return worldMapLabel;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.a(").append(')').toString());
		}
	}

	public void method4117(int i, byte i_1_) {
		try {
			synchronized (((WorldMapLabelList) this).aClass348_3633) {
				((WorldMapLabelList) this).aClass348_3633.method4186(i, -346772344);
			}
			synchronized (((WorldMapLabelList) this).aClass348_3635) {
				((WorldMapLabelList) this).aClass348_3635.method4186(i, -549143520);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.p(").append(')').toString());
		}
	}

	public void method4118(int i) {
		try {
			synchronized (((WorldMapLabelList) this).aClass348_3633) {
				((WorldMapLabelList) this).aClass348_3633.method4187();
			}
			synchronized (((WorldMapLabelList) this).aClass348_3635) {
				((WorldMapLabelList) this).aClass348_3635.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.b(").append(')').toString());
		}
	}

	public void method4119(int i, int i_2_, int i_3_) {
		try {
			((WorldMapLabelList) this).aClass348_3633 = new CachingHashMap(i);
			((WorldMapLabelList) this).aClass348_3635 = new CachingHashMap(i_2_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.f(").append(')').toString());
		}
	}

	public void method4120(int i) {
		try {
			synchronized (((WorldMapLabelList) this).aClass348_3633) {
				((WorldMapLabelList) this).aClass348_3633.method4189();
			}
			synchronized (((WorldMapLabelList) this).aClass348_3635) {
				((WorldMapLabelList) this).aClass348_3635.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.i(").append(')').toString());
		}
	}

	public WorldMapLabelList(GameContext gameContext, Language language, Js5 class243, Js5 class243_4_) {
		((WorldMapLabelList) this).aClass243_3634 = class243;
		((WorldMapLabelList) this).aClass243_3638 = class243_4_;
		((WorldMapLabelList) this).aClass243_3634.method2316((-1006924897 * (Js5ConfigGroup.aClass120_1441.anInt1460)), -1187243048);
	}

	static final void method4121(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_5_, (byte) 40);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_5_ >> 16];
			Class225.method2102(class105, RSInterface, class403, (short) -26204);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.jb(").append(')').toString());
		}
	}

	static final void method4122(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class261.method2463(class105, RSInterface, class403, (byte) -60);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.ls(").append(')').toString());
		}
	}

	static final void method4123(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class165.recorder.getMouseY((byte) -67);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.ux(").append(')').toString());
		}
	}

	static final void method4124(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class82_Sub14.anInt6875 * 1196508279 + WorldMap.mapX;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1882038855 * VarClanSettings.anInt4090 + WorldMap.mapY;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.adq(").append(')').toString());
		}
	}

	static void method4125(Packet class298_sub53, int i) {
		try {
			for (;;) {
				int i_6_ = class298_sub53.readUnsignedByte();
				switch (i_6_) {
				case 255:
					return;
				case 0:
					Class87.anInt800 = class298_sub53.readUnsignedShort() * 1746642957;
					Class87.anInt801 = class298_sub53.readUnsignedShort() * -196096943;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.f(").append(')').toString());
		}
	}

	static final void method4126(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).aClass177_5243 = new Class177();
			((ClientScript2) class403).aClass177_5243.anInt1787 = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) * -1496580327;
			((ClientScript2) class403).aClass177_5243.aClass298_Sub37_Sub14_1788 = Class447.aClass469_5618.method6045((-2034569943 * (((ClientScript2) class403).aClass177_5243.anInt1787)), (short) -31803);
			((ClientScript2) class403).aClass177_5243.anIntArray1789 = new int[((ClientScript2) class403).aClass177_5243.aClass298_Sub37_Sub14_1788.method3461((short) -407)];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("od.ace(").append(')').toString());
		}
	}
}
