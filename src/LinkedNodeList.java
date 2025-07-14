/* LinkedNodeList - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collection;
import java.util.Iterator;

public class LinkedNodeList implements Iterable, Collection {
	public Node aNode_5643 = new Node();
	Node aNode_5644;

	public void addlast(Node node, int i) {
		try {
			if (null != node.aNode_3189)
				node.unlink(-1460969981);
			node.aNode_3189 = aNode_5643.aNode_3189;
			node.aNode_3187 = aNode_5643;
			node.aNode_3189.aNode_3187 = node;
			node.aNode_3187.aNode_3189 = node;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.f(").append(')').toString());
		}
	}

	public Node method5936(int i) {
		try {
			Node node = aNode_5643.aNode_3187;
			if (node == aNode_5643)
				return null;
			node.unlink(-1460969981);
			return node;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.p(").append(')').toString());
		}
	}

	void method5937(LinkedNodeList linkedNodeList_0_, Node node, byte i) {
		try {
			Node node_1_ = aNode_5643.aNode_3189;
			aNode_5643.aNode_3189 = node.aNode_3189;
			node.aNode_3189.aNode_3187 = aNode_5643;
			if (aNode_5643 != node) {
				node.aNode_3189 = linkedNodeList_0_.aNode_5643.aNode_3189;
				node.aNode_3189.aNode_3187 = node;
				node_1_.aNode_3187 = linkedNodeList_0_.aNode_5643;
				linkedNodeList_0_.aNode_5643.aNode_3189 = node_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.i(").append(')').toString());
		}
	}

	public void method5938(LinkedNodeList linkedNodeList_2_, int i) {
		try {
			if (aNode_5643 != aNode_5643.aNode_3187)
				method5937(linkedNodeList_2_, aNode_5643.aNode_3187, (byte) -5);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.k(").append(')').toString());
		}
	}

	public Node method5939(int i) {
		try {
			return method5945(null, 65280);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.d(").append(')').toString());
		}
	}

	Node method5940(Node node, byte i) {
		try {
			Node node_3_;
			if (null == node)
				node_3_ = aNode_5643.aNode_3189;
			else
				node_3_ = node;
			if (aNode_5643 == node_3_) {
				((LinkedNodeList) this).aNode_5644 = null;
				return null;
			}
			((LinkedNodeList) this).aNode_5644 = node_3_.aNode_3189;
			return node_3_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.r(").append(')').toString());
		}
	}

	Node[] method5941(byte i) {
		try {
			Node[] nodes = new Node[method5948(1828905535)];
			int i_4_ = 0;
			for (Node node = aNode_5643.aNode_3187; node != aNode_5643; node = node.aNode_3187)
				nodes[i_4_++] = node;
			return nodes;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.y(").append(')').toString());
		}
	}

	public Iterator iterator() {
		try {
			return new Class446(this);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.iterator(").append(')').toString());
		}
	}

	public boolean isEmpty() {
		try {
			return method5946(1085448128);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.isEmpty(").append(')').toString());
		}
	}

	public boolean contains(Object object) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.contains(").append(')').toString());
		}
	}

	public Object[] toArray() {
		try {
			return method5941((byte) 7);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.toArray(").append(')').toString());
		}
	}

	public Node method5942(int i) {
		try {
			return method5940(null, (byte) 4);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.x(").append(')').toString());
		}
	}

	public boolean remove(Object object) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.remove(").append(')').toString());
		}
	}

	public boolean containsAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.containsAll(").append(')').toString());
		}
	}

	public boolean addAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.addAll(").append(')').toString());
		}
	}

	public boolean removeAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.removeAll(").append(')').toString());
		}
	}

	public boolean retainAll(Collection collection) {
		try {
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.retainAll(").append(')').toString());
		}
	}

	public void clear() {
		try {
			method5943((byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.clear(").append(')').toString());
		}
	}

	public boolean add(Object object) {
		try {
			return method5949((Node) object, (byte) -121);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.add(").append(')').toString());
		}
	}

	public boolean equals(Object object) {
		try {
			return super.equals(object);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.equals(").append(')').toString());
		}
	}

	public int hashCode() {
		try {
			return super.hashCode();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.hashCode(").append(')').toString());
		}
	}

	public void method5943(byte i) {
		try {
			while (aNode_5643.aNode_3187 != aNode_5643)
				aNode_5643.aNode_3187.unlink(-1460969981);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.a(").append(')').toString());
		}
	}

	public Object[] toArray(Object[] objects) {
		try {
			int i = 0;
			for (Node node = aNode_5643.aNode_3187; aNode_5643 != node; node = node.aNode_3187)
				objects[i++] = node;
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.toArray(").append(')').toString());
		}
	}

	public Node method5944(int i) {
		try {
			Node node = ((LinkedNodeList) this).aNode_5644;
			if (aNode_5643 == node) {
				((LinkedNodeList) this).aNode_5644 = null;
				return null;
			}
			((LinkedNodeList) this).aNode_5644 = node.aNode_3187;
			return node;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.q(").append(')').toString());
		}
	}

	Node method5945(Node node, int i) {
		try {
			Node node_5_;
			if (node == null)
				node_5_ = aNode_5643.aNode_3187;
			else
				node_5_ = node;
			if (aNode_5643 == node_5_) {
				((LinkedNodeList) this).aNode_5644 = null;
				return null;
			}
			((LinkedNodeList) this).aNode_5644 = node_5_.aNode_3187;
			return node_5_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.u(").append(')').toString());
		}
	}

	public LinkedNodeList() {
		aNode_5643.aNode_3187 = aNode_5643;
		aNode_5643.aNode_3189 = aNode_5643;
	}

	public int size() {
		try {
			return method5948(1828905535);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.size(").append(')').toString());
		}
	}

	public boolean method5946(int i) {
		try {
			return aNode_5643 == aNode_5643.aNode_3187;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.z(").append(')').toString());
		}
	}

	public Node method5947(int i) {
		try {
			Node node = ((LinkedNodeList) this).aNode_5644;
			if (node == aNode_5643) {
				((LinkedNodeList) this).aNode_5644 = null;
				return null;
			}
			((LinkedNodeList) this).aNode_5644 = node.aNode_3189;
			return node;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.n(").append(')').toString());
		}
	}

	public int method5948(int i) {
		try {
			int i_6_ = 0;
			for (Node node = aNode_5643.aNode_3187; aNode_5643 != node; node = node.aNode_3187)
				i_6_++;
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.s(").append(')').toString());
		}
	}

	boolean method5949(Node node, byte i) {
		try {
			addlast(node, 289942482);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.t(").append(')').toString());
		}
	}

	static final void method5950(ClientScript2 class403, byte i) {
		try {
			if (GameClient.anInt8932 * -1333485389 >= 5 && -1333485389 * GameClient.anInt8932 <= 9)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.ur(").append(')').toString());
		}
	}

	public static void method5951(int i, int i_7_, int i_8_, LocType class432, int i_9_) {
		try {
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aLinkedNodeList_7421.method5939(1766612795)); null != class298_sub41; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aLinkedNodeList_7421.method5944(49146))) {
				if (i == (-1926928785 * ((Class298_Sub41) class298_sub41).anInt7424) && (((Class298_Sub41) class298_sub41).anInt7425 * -1808325887) == i_7_ << 9 && (((Class298_Sub41) class298_sub41).anInt7423 * 757346071 == i_8_ << 9) && (class432.id * 1181652947 == (((Class298_Sub41) class298_sub41).aClass432_7435.id) * 1181652947)) {
					if (null != (((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447)) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
					}
					if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426) != null) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426 = null;
					}
					class298_sub41.unlink(-1460969981);
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.i(").append(')').toString());
		}
	}

	static final void method5952(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class371.method4582(class105, RSInterface, class403, -638652080);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sr.lc(").append(')').toString());
		}
	}
}
