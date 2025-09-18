/* Class298_Sub51_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub51_Sub1 extends Interface {
	int anInt9776;

	public boolean method3577() {
		Player player = (GameClient.players[-517743867 * ((Class298_Sub51_Sub1) this).anInt9776]);
		if (player != null) {
			overheadString.method729(Class502.aClass502_6719, -1617025021 * interfaceId, -1, player, (-517743867 * ((Class298_Sub51_Sub1) this).anInt9776), (byte) -119);
			return true;
		}
		return false;
	}

	public boolean method3573(int i) {
		try {
			Player player = (GameClient.players[-517743867 * ((Class298_Sub51_Sub1) this).anInt9776]);
			if (player != null) {
				overheadString.method729(Class502.aClass502_6719, -1617025021 * interfaceId, -1, player, (-517743867 * ((Class298_Sub51_Sub1) this).anInt9776), (byte) -83);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aje.a(").append(')').toString());
		}
	}

	public Class298_Sub51_Sub1(int interfaceId, int clipped, int index) {
		super(interfaceId, clipped);
		((Class298_Sub51_Sub1) this).anInt9776 = 1449638349 * index;
	}
}
