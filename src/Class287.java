/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class287 {
	public int anInt3096;
	public int anInt3097;
	public int anInt3098;
	public int anInt3099;
	static Js5 aClass243_3100;
	public static Player myPlayer;

	Class287(int i, int i_0_, int i_1_, int i_2_) {
		anInt3096 = i * -236522629;
		anInt3097 = i_0_ * -831965479;
		anInt3098 = i_1_ * 1993464961;
		anInt3099 = -359546329 * i_2_;
	}

	Class287() {
		anInt3096 = (32 + (int) (Math.random() * 4.0)) * -236522629;
		anInt3097 = (3 + (int) (Math.random() * 2.0)) * -831965479;
		anInt3098 = (16 + (int) (Math.random() * 3.0)) * 1993464961;
		if (GraphicsAutoSetup.clientPreferences.texturePreference.getValue(2133264539) == 1)
			anInt3099 = (int) (Math.random() * 6.0) * -359546329;
		else
			anInt3099 = (int) (Math.random() * 12.0) * -359546329;
	}

	public static boolean method2720(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			if (i >= i_8_ + i_6_ || i_6_ >= i + i_4_)
				return false;
			if (i_3_ >= i_7_ + i_9_ || i_7_ >= i_5_ + i_3_)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lx.t(").append(')').toString());
		}
	}

	static final void method2721(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1914527151 * Class298_Sub41.anInt7456;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lx.amv(").append(')').toString());
		}
	}

	public static boolean method2722(String string, int i) {
		try {
			if (string == null)
				return false;
			for (int i_11_ = 0; i_11_ < -548972447 * GameClient.anInt8952; i_11_++) {
				if (string.equalsIgnoreCase(GameClient.aStringArray8954[i_11_]))
					return true;
				if (string.equalsIgnoreCase(GameClient.aStringArray8773[i_11_]))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lx.mc(").append(')').toString());
		}
	}

	static final void method2723(ClientScript2 class403, int i) {
		try {
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GameClient.aClass251Array8920[i_12_].anInt2770 * 1869840307;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("lx.yd(").append(')').toString());
		}
	}
}
