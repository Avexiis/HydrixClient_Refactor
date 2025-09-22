/* TileText - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TileText extends Class302 {
	int color;
	int offsetX;
	int plane;
	int height;
	int delay;
	int offsetY;
	String message;
	static int anInt7658;

	TileText() {
		/* empty */
	}

	static final void method3729(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			GameFont gameFont = Class322.method3931(Class173.aClass243_1758, i_0_, 0, (byte) 11);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = gameFont.method6254(string, Class130_Sub2.aClass57Array6959, 1319235613);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "aav.aap(" + ')');
		}
	}

	static final void method3730(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class173.aByte1759;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "aav.wf(" + ')');
		}
	}

	public static void method3731(int i, byte i_1_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(3, (long) i);
			class298_sub37_sub12.method3445(-813557087);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "aav.k(" + ')');
		}
	}
}
