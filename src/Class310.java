/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class310 implements Interface17 {
	Class365_Sub1_Sub1_Sub4 aClass365_Sub1_Sub1_Sub4_6511;
	static int anInt6512;

	public boolean method228(Class365_Sub1_Sub1 class365_sub1_sub1) {
		return (((Class310) this).aClass365_Sub1_Sub1_Sub4_6511 == class365_sub1_sub1);
	}

	Class310(Class365_Sub1_Sub1_Sub4 class365_sub1_sub1_sub4) {
		((Class310) this).aClass365_Sub1_Sub1_Sub4_6511 = class365_sub1_sub1_sub4;
	}

	public boolean method229(Class365_Sub1_Sub1 class365_sub1_sub1, int i) {
		try {
			return (((Class310) this).aClass365_Sub1_Sub1_Sub4_6511 == class365_sub1_sub1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mw.a(").append(')').toString());
		}
	}

	public boolean method230(Class365_Sub1_Sub1 class365_sub1_sub1) {
		return (((Class310) this).aClass365_Sub1_Sub1_Sub4_6511 == class365_sub1_sub1);
	}

	static int method3809(Class343_Sub1 class343_sub1, Class343_Sub1 class343_sub1_0_, int i, boolean bool, int i_1_, boolean bool_2_, int i_3_) {
		try {
			int i_4_ = VarPlayerType.method1931(class343_sub1, class343_sub1_0_, i, bool, -1657159001);
			if (i_4_ != 0) {
				if (bool)
					return -i_4_;
				return i_4_;
			}
			if (-1 == i_1_)
				return 0;
			int i_5_ = VarPlayerType.method1931(class343_sub1, class343_sub1_0_, i_1_, bool_2_, -552551191);
			if (bool_2_)
				return -i_5_;
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mw.r(").append(')').toString());
		}
	}

	static void method3810(GraphicsToolkit class_ra, int i) {
		try {
			int i_6_ = -10660793;
			Class323.method3948(class_ra, -1347746885 * Class88.anInt806, TileText.anInt7658 * 1089948687, Class134.anInt6343 * 608683427, Class448.anInt5619 * 1396607435, i_6_, -16777216, (byte) 123);
			Class101.aClass264_1084.method2488(LocalizedString.BUTTON_CHOOSE_OPTION.getText(Class321.ACTIVE_LANGUAGE, -875414210), -1347746885 * Class88.anInt806 + 3, 1089948687 * TileText.anInt7658 + 14, i_6_, -1, 1583712486);
			int i_7_ = Class165.recorder.getMouseX((byte) -10);
			int i_8_ = Class165.recorder.getMouseY((byte) 38);
			if (!ContextMenu.aBoolean5471) {
				int i_9_ = 0;
				for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) ContextMenu.aLinkedNodeList_5480.method5939(1766612795)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) ContextMenu.aLinkedNodeList_5480.method5944(49146))) {
					int i_10_ = (31 + 1089948687 * TileText.anInt7658 + (-411680299 * ContextMenu.anInt5467 * (-278777595 * ContextMenu.actionCount - 1 - i_9_)));
					GraphicsToolkit.method5192(i_7_, i_8_, -1347746885 * Class88.anInt806, 1089948687 * TileText.anInt7658, 608683427 * Class134.anInt6343, 1396607435 * Class448.anInt5619, i_10_, class298_sub37_sub15, Class101.aClass264_1084, Class82_Sub19_Sub1.aClass505_9111, -1, -256, 247690373);
					i_9_++;
				}
			} else {
				int i_11_ = 0;
				for (Class298_Sub37_Sub5 class298_sub37_sub5 = ((Class298_Sub37_Sub5) ContextMenu.aClass461_5482.method5984(198728515)); null != class298_sub37_sub5; class298_sub37_sub5 = ((Class298_Sub37_Sub5) ContextMenu.aClass461_5482.method5985(30142288))) {
					int i_12_ = (TileText.anInt7658 * 1089948687 + 31 + i_11_ * (-411680299 * ContextMenu.anInt5467));
					if (1 == (((Class298_Sub37_Sub5) class298_sub37_sub5).anInt9583) * -628325139)
						GraphicsToolkit.method5192(i_7_, i_8_, -1347746885 * Class88.anInt806, TileText.anInt7658 * 1089948687, 608683427 * Class134.anInt6343, Class448.anInt5619 * 1396607435, i_12_, ((Class298_Sub37_Sub15) (((Class298_Sub37_Sub5) class298_sub37_sub5).aClass461_9584.aClass298_Sub37_5679.aClass298_Sub37_7405)), Class101.aClass264_1084, Class82_Sub19_Sub1.aClass505_9111, -1, -256, 1821923505);
					else
						EnvironmentMap.method763(i_7_, i_8_, Class88.anInt806 * -1347746885, 1089948687 * TileText.anInt7658, Class134.anInt6343 * 608683427, Class448.anInt5619 * 1396607435, i_12_, class298_sub37_sub5, Class101.aClass264_1084, Class82_Sub19_Sub1.aClass505_9111, -1, -256, (byte) -19);
					i_11_++;
				}
				if (null != ContextMenu.aClass298_Sub37_Sub5_5472) {
					Class323.method3948(class_ra, Class461.anInt5681 * 805710735, -1370784315 * Class501.anInt6119, 2054409059 * Class420.anInt5345, -1855216229 * SpotAnimTypeList.anInt4166, i_6_, -16777216, (byte) 111);
					Class101.aClass264_1084.method2488(((Class298_Sub37_Sub5) ContextMenu.aClass298_Sub37_Sub5_5472).aString9585, 805710735 * Class461.anInt5681 + 3, -1370784315 * Class501.anInt6119 + 14, i_6_, -1, -2064340267);
					i_11_ = 0;
					for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) ContextMenu.aClass298_Sub37_Sub5_5472).aClass461_9584.method5984(-783790871)); null != class298_sub37_sub15; class298_sub37_sub15 = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) ContextMenu.aClass298_Sub37_Sub5_5472).aClass461_9584.method5985(505275870))) {
						int i_13_ = (i_11_ * (-411680299 * ContextMenu.anInt5467) + (Class501.anInt6119 * -1370784315 + 31));
						GraphicsToolkit.method5192(i_7_, i_8_, 805710735 * Class461.anInt5681, -1370784315 * Class501.anInt6119, 2054409059 * Class420.anInt5345, SpotAnimTypeList.anInt4166 * -1855216229, i_13_, class298_sub37_sub15, Class101.aClass264_1084, Class82_Sub19_Sub1.aClass505_9111, -1, -256, 916241136);
						i_11_++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mw.ar(").append(')').toString());
		}
	}
}
