/* Class298_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimBase extends Node {
	public static int anInt7266 = 3;
	public static int anInt7267 = 1;
	boolean osrs;
	int numTransforms;
	public static int anInt7269 = 0;
	public static int anInt7270 = 5;
	static int anInt7271 = 6;
	public static int anInt7272 = 7;
	public static int anInt7273 = 8;
	public static int anInt7274 = 9;
	boolean[] shadowed;
	int anInt7276;
	public static int anInt7277 = 10;
	int[] transforms;
	int[][] labels;
	int[] settings;
	public static int anInt7281 = 2;

	AnimBase(int i, byte[] data, boolean osrs) {
		this.osrs = osrs;
		if (osrs) {
			//System.out.println("Base OSRS: " + i);
		}
		anInt7276 = 1362718155 * i;
		Packet packet = new Packet(data);
		numTransforms = packet.readUnsignedByte() * -1914825713;
		transforms = new int[92429039 * numTransforms];
		labels = new int[92429039 * numTransforms][];
		shadowed = new boolean[numTransforms * 92429039];
		settings = new int[92429039 * numTransforms];
		for (int i_0_ = 0; i_0_ < 92429039 * numTransforms; i_0_++) {
			transforms[i_0_] = packet.readUnsignedByte();
			if (transforms[i_0_] == 6) {
				transforms[i_0_] = 2;
			}
		}
		if (!osrs) {
			for (int i_1_ = 0; i_1_ < numTransforms * 92429039; i_1_++) {
				shadowed[i_1_] = packet.readUnsignedByte() == 1;
			}
			for (int i_2_ = 0; i_2_ < numTransforms * 92429039; i_2_++) {
				settings[i_2_] = packet.readUnsignedShort();
			}
		}
		for (int i_3_ = 0; i_3_ < numTransforms * 92429039; i_3_++) {
			labels[i_3_] = new int[packet.readUnsignedByte()];
		}
		for (int i_4_ = 0; i_4_ < numTransforms * 92429039; i_4_++) {
			for (int i_5_ = 0; i_5_ < labels[i_4_].length; i_5_++) {
				labels[i_4_][i_5_] = packet.readUnsignedByte();
			}
		}
	}

	static final void method2909(ClientScript2 class403, int i) {
		try {
			int i_6_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = GameClient.aBooleanArray8957[i_6_]
					? 1
					: 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "aax.wu(" + ')');
		}
	}
}
