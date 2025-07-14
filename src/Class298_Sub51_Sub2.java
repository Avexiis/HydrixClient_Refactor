/* Class298_Sub51_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub51_Sub2 extends Interface {
	int anInt9777;

	public boolean method3578() {
		LinkableObject linkableObject = ((LinkableObject) (GameClient.npcs.get((long) (119655585 * ((Class298_Sub51_Sub2) this).anInt9777))));
		if (linkableObject != null) {
			overheadString.method729(Class502.aClass502_6728, -1617025021 * interfaceId, -1, ((Entity) linkableObject.anObject7366), (((Class298_Sub51_Sub2) this).anInt9777 * 119655585), (byte) -46);
			return true;
		}
		return false;
	}

	public Class298_Sub51_Sub2(int interfaceId, int cliped, int npcIndex) {
		super(interfaceId, cliped);
		((Class298_Sub51_Sub2) this).anInt9777 = npcIndex * -378595487;
	}

	public boolean method3573(int i) {
		try {
			LinkableObject linkableObject = ((LinkableObject) (GameClient.npcs.get((long) (119655585 * ((Class298_Sub51_Sub2) this).anInt9777))));
			if (linkableObject != null) {
				overheadString.method729(Class502.aClass502_6728, -1617025021 * interfaceId, -1, ((Entity) linkableObject.anObject7366), (((Class298_Sub51_Sub2) this).anInt9777 * 119655585), (byte) -1);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ajj.a(").append(')').toString());
		}
	}
}
