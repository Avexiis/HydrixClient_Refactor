/* Class372_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class372_Sub2 extends Class372 {
	static int anInt7728 = 4096;
	static int anInt7729 = 12;

	Class372_Sub2() throws Throwable {
		throw new Error();
	}

	static final void method4598(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			GameClient.aShort8839 = (short) (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			if (GameClient.aShort8839 <= 0)
				GameClient.aShort8839 = (short) 1;
			GameClient.aShort8743 = (short) (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			if (GameClient.aShort8743 <= 0)
				GameClient.aShort8743 = (short) 32767;
			else if (GameClient.aShort8743 < GameClient.aShort8839)
				GameClient.aShort8743 = GameClient.aShort8839;
			GameClient.aShort8934 = (short) (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]);
			if (GameClient.aShort8934 <= 0)
				GameClient.aShort8934 = (short) 1;
			GameClient.aShort8935 = (short) (((ClientScript2) class403).anIntArray5244[3 + 681479919 * ((ClientScript2) class403).anInt5239]);
			if (GameClient.aShort8935 <= 0)
				GameClient.aShort8935 = (short) 32767;
			else if (GameClient.aShort8935 < GameClient.aShort8934)
				GameClient.aShort8935 = GameClient.aShort8934;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("adr.aki(").append(')').toString());
		}
	}
}
