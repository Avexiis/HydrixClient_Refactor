/* Class446 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class446 implements Iterator {
	LinkedNodeList aLinkedNodeList_5611;
	Node aNode_5612;
	Node aNode_5613 = null;
	static int anInt5614;

	public void method5898(LinkedNodeList linkedNodeList, int i) {
		try {
			((Class446) this).aLinkedNodeList_5611 = linkedNodeList;
			((Class446) this).aNode_5612 = (((Class446) this).aLinkedNodeList_5611.aNode_5643.aNode_3187);
			((Class446) this).aNode_5613 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sk.d(").append(')').toString());
		}
	}

	void method5899(int i) {
		try {
			((Class446) this).aNode_5612 = (((Class446) this).aLinkedNodeList_5611.aNode_5643.aNode_3187);
			((Class446) this).aNode_5613 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sk.u(").append(')').toString());
		}
	}

	public Node method5900(int i) {
		try {
			method5899(1114782715);
			return (Node) next();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sk.x(").append(')').toString());
		}
	}

	public boolean hasNext() {
		try {
			return (((Class446) this).aNode_5612 != ((Class446) this).aLinkedNodeList_5611.aNode_5643);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sk.hasNext(").append(')').toString());
		}
	}

	public void remove() {
		try {
			if (null == ((Class446) this).aNode_5613)
				throw new IllegalStateException();
			((Class446) this).aNode_5613.unlink(-1460969981);
			((Class446) this).aNode_5613 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sk.remove(").append(')').toString());
		}
	}

	public Class446(LinkedNodeList linkedNodeList) {
		((Class446) this).aLinkedNodeList_5611 = linkedNodeList;
		((Class446) this).aNode_5612 = ((Class446) this).aLinkedNodeList_5611.aNode_5643.aNode_3187;
		((Class446) this).aNode_5613 = null;
	}

	public Object next() {
		try {
			Node node = ((Class446) this).aNode_5612;
			if (((Class446) this).aLinkedNodeList_5611.aNode_5643 == node) {
				node = null;
				((Class446) this).aNode_5612 = null;
			} else
				((Class446) this).aNode_5612 = node.aNode_3187;
			((Class446) this).aNode_5613 = node;
			return node;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sk.next(").append(')').toString());
		}
	}

	static final void method5901(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (Class452.aBoolean5642) {
				Class456[] class456s = Class271.method2545((byte) 18);
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 28445523 * class456s[i_0_].anInt5663;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 262154323 * class456s[i_0_].anInt5665;
			} else {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sk.aek(").append(')').toString());
		}
	}

	static final void method5902(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class374.anIntArray4078[(((ClientScript2) class403).integerstack[1883543357 * ((ClientScript2) class403).integerPos])]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sk.aq(").append(')').toString());
		}
	}
}
