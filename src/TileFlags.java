/* TileFlags - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TileFlags {
	public static int anInt2725 = 8;
	public static int anInt2726 = 4;
	static int anInt2727 = 2;
	public static int anInt2728 = 2;
	static int anInt2729 = 1;
	static int anInt2730 = 16;
	public byte[][][] flags;

	public void method2319(int i) {
		try {
			for (int plane = 0; plane < flags.length; plane++) {
				for (int x = 0; x < flags[0].length; x++) {
					for (int y = 0; y < flags[0][0].length; y++)
						flags[plane][x][y] = (byte) 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.a(" + ')');
		}
	}

	public boolean method2320(int x, int y, int i_4_) {
		try {
			if (x < 0 || y < 0 || x >= flags[1].length || y >= flags[1][x].length)
				return false;
			if ((flags[1][x][y] & 0x2) != 0)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.f(" + ')');
		}
	}

	public boolean method2321(int i, int plane, int x, int y, byte i_8_) {
		try {
			if (0 != (flags[0][x][y] & 0x2))
				return true;
			if (0 != (flags[plane][x][y] & 0x10))
				return false;
			if (method2322(plane, x, y, 739061165) == i)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.b(" + ')');
		}
	}

	public TileFlags(int plane, int x, int y) {
		flags = new byte[plane][x][y];
	}

	int method2322(int plane, int x, int y, int i_13_) {
		try {
			if ((flags[plane][x][y] & 0x8) != 0)
				return 0;
			if (plane > 0 && (flags[1][x][y] & 0x2) != 0)
				return plane - 1;
			return plane;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.p(" + ')');
		}
	}

	static final void method2323(IComponentDefinition class105, RSInterface rsInterface, ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			class105.anInt1193 = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]) * 437213185;
			class105.anInt1194 = (1266800241 * (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]));
			LocalizedString.markComponentForRedraw(class105, -147880968);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.fq(" + ')');
		}
	}

	static final void method2324(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -391880689;
			int i_14_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			Interface class298_sub51 = ((Interface) GameClient.aClass437_8841.get((long) i_14_));
			if (null != class298_sub51 && 3 == 27137839 * class298_sub51.clipped)
				Class173.method1821(class298_sub51, true, true, -113822480);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.sh(" + ')');
		}
	}

	static final void method2325(ClientScript2 class403, byte i) {
		try {
			int i_15_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class118.method1293(i_15_ >> 14 & 0x3fff, i_15_ & 0x3fff, -548972447);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.aeb(" + ')');
		}
	}

	public static void method2326(int i) {
		try {
			Atmosphere.shutdownIcmpService(1590487126);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.f(" + ')');
		}
	}

	static void method2327(byte[] is, int i) {
		try {
			Packet class298_sub53 = new Packet(is);
			for (;;) {
				int i_16_ = class298_sub53.readUnsignedByte();
				if (i_16_ == 0) {
					if (i == -475561782)
						throw new IllegalStateException();
					break;
				}
				if (1 == i_16_) {
					int i_17_ = class298_sub53.readUnsignedShort();
					if (Class300.anInt3210 * 782166935 == -1)
						Class300.anInt3210 = i_17_ * 154813479;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.x(" + ')');
		}
	}

	public static int method2328(CharSequence charsequence, int i) {
		try {
			int i_18_ = charsequence.length();
			int i_19_ = 0;
			for (int i_20_ = 0; i_20_ < i_18_; i_20_++)
				i_19_ = ((i_19_ << 5) - i_19_ + Class124.method1387(charsequence.charAt(i_20_), 1088430238));
			return i_19_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.r(" + ')');
		}
	}

	static final void method2329(ClientScript2 class403, int i) {
		try {
			if ((((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1)
				((ClientScript2) class403).integerPos += ((((ClientScript2) class403).integerstack[1883543357 * ((ClientScript2) class403).integerPos]) * 286750741);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.bw(" + ')');
		}
	}

	public static void method2330(NPC class365_sub1_sub1_sub2_sub1, byte i) {
		try {
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aLinkedNodeList_7455.method5939(1766612795)); null != class298_sub41; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aLinkedNodeList_7455.method5944(49146))) {
				if (class365_sub1_sub1_sub2_sub1 == (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433)) {
					if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447) != null) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
					}
					class298_sub41.unlink(-1460969981);
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kf.k(" + ')');
		}
	}
}
