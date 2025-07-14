/* WorldMapArea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class WorldMapArea extends Node {
	public int anInt7605;
	public int anInt7606;
	public int x;
	public int mapAreaId = 745065385;
	public int anInt7609;
	public int y;
	public boolean aBoolean7611 = false;

	WorldMapArea(int i) {
		mapAreaId = -745065385 * i;
	}

	public static void method3581(int i, byte i_0_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(6, (long) i);
			class298_sub37_sub12.method3445(-1029136882);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("act.r(").append(')').toString());
		}
	}

	public static void method3582(int i, int i_1_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(21, (long) i);
			class298_sub37_sub12.method3445(-1940930920);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("act.aa(").append(')').toString());
		}
	}

	static final void method3583(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class82_Sub2.method878(i_2_, i_3_, false, -880312954);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("act.tl(").append(')').toString());
		}
	}
}
