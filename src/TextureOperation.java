/* TextureOperation - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class TextureOperation extends Node {
	TextureOperation[] aTextureOperationArray7371;
	protected static int anInt7372 = 4096;
	protected static int anInt7373 = 8192;
	protected static int anInt7374 = 2048;
	protected static int anInt7375 = 1024;
	protected static int anInt7376 = 4095;
	protected static int anInt7377 = -4096;
	public static float aFloat7378 = 4096.0F;
	protected static int anInt7379 = 12;
	protected Class239 aClass239_7380;
	int anInt7381;
	protected boolean aBoolean7382;
	static int anInt7383 = 255;
	protected Class257 aClass257_7384;

	void method3128(int i) {
		try {
			if (aBoolean7382) {
				aClass257_7384.method2447(-2047791344);
				aClass257_7384 = null;
			} else {
				aClass239_7380.method2203(1128240518);
				aClass239_7380 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.f(").append(')').toString());
		}
	}

	final int[] method3129(int i, int i_0_, int i_1_) {
		try {
			if (!((TextureOperation) this).aTextureOperationArray7371[i].aBoolean7382)
				return (((TextureOperation) this).aTextureOperationArray7371[i].method3132(i_0_, (byte) -85)[0]);
			return ((TextureOperation) this).aTextureOperationArray7371[i].method3131(i_0_, 891860141);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.b(").append(')').toString());
		}
	}

	void method3130(int i, int i_2_, int i_3_) {
		try {
			int i_4_ = (255 == ((TextureOperation) this).anInt7381 * -1006569959 ? i_2_ : ((TextureOperation) this).anInt7381 * -1006569959);
			if (aBoolean7382)
				aClass257_7384 = new Class257(i_4_, i_2_, i);
			else
				aClass239_7380 = new Class239(i_4_, i_2_, i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.a(").append(')').toString());
		}
	}

	int[] method3131(int i, int i_5_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.i(").append(')').toString());
		}
	}

	int[][] method3132(int i, byte i_6_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.k(").append(')').toString());
		}
	}

	void method3133(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.x(").append(')').toString());
		}
	}

	final int[][] method3134(int i, int i_7_, byte i_8_) {
		try {
			if (((TextureOperation) this).aTextureOperationArray7371[i].aBoolean7382) {
				int[] is = ((TextureOperation) this).aTextureOperationArray7371[i].method3131(i_7_, 1101139178);
				int[][] is_9_ = new int[3][];
				is_9_[0] = is;
				is_9_[1] = is;
				is_9_[2] = is;
				return is_9_;
			}
			return ((TextureOperation) this).aTextureOperationArray7371[i].method3132(i_7_, (byte) -94);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.p(").append(')').toString());
		}
	}

	TextureOperation(int i, boolean bool) {
		aBoolean7382 = bool;
		((TextureOperation) this).aTextureOperationArray7371 = new TextureOperation[i];
	}

	int method3135(short i) {
		try {
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.q(").append(')').toString());
		}
	}

	int method3136(byte i) {
		try {
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.n(").append(')').toString());
		}
	}

	void method3137(int i, Packet class298_sub53, byte i_10_) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.r(").append(')').toString());
		}
	}

	static void method3138(int i, int i_11_, byte i_12_) {
		try {
			ContextMenu.anInt5489 = i * -305664667;
			ContextMenu.anInt5490 = i_11_ * 67681267;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("abq.ad(").append(')').toString());
		}
	}
}
