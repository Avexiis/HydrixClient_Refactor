/* Class298_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub7 extends Node {
	public int anInt7212;
	public int anInt7213;
	public int anInt7214;
	public int anInt7215;
	public int anInt7216;
	public int anInt7217;
	public int anInt7218;
	public int anInt7219;
	public int anInt7220;

	Class298_Sub7(Packet class298_sub53) {
		int i = class298_sub53.readUnsignedInt();
		anInt7214 = (i >>> 28) * 227078415;
		anInt7218 = -1209133463 * (i >>> 14 & 0x3fff);
		anInt7212 = (i & 0x3fff) * -1854987659;
		anInt7219 = class298_sub53.readUnsignedByte() * -1854609097;
		anInt7213 = class298_sub53.readUnsignedByte() * -1880600721;
		anInt7215 = class298_sub53.readUnsignedByte() * -1093975085;
		anInt7216 = class298_sub53.readUnsignedByte() * 1165274655;
		anInt7217 = class298_sub53.readUnsignedByte() * 2032904299;
		anInt7220 = class298_sub53.readUnsignedByte() * -1262403157;
	}

	public static MapDetails method2864(int i) {
		try {
			return Class301_Sub1.currentWorldMapArea;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aak.cl(").append(')').toString());
		}
	}

	static final void method2865(ClientScript2 class403, int i) {
		try {
			IComponentDefinition class105 = Class50.getIComponentDefinitions((((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), (byte) 45);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1232467723 * class105.zds3;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aak.rz(").append(')').toString());
		}
	}

	static final void method2866(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class102 class102 = Class298_Sub40_Sub13.method3517(i_0_, 1475903999);
			int i_1_ = -1;
			if (class102 != null)
				i_1_ = class102.anInt1093 * -246265729;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aak.act(").append(')').toString());
		}
	}
}
