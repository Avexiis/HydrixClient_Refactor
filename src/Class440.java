/* Class440 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class440 {
	Node[] aNodeArray5576;
	int anInt5577;
	long aLong5578;
	Node aNode_5579;
	Node aNode_5580;
	int anInt5581 = 0;
	public static VarPlayerTypeList aVarPlayerTypeList_5582;

	public Node method5852(long l) {
		try {
			((Class440) this).aLong5578 = l * 236245195989619781L;
			Node node = (((Class440) this).aNodeArray5576[(int) (l & (long) (1721892305 * ((Class440) this).anInt5577 - 1))]);
			for (((Class440) this).aNode_5580 = node.aNode_3187; node != ((Class440) this).aNode_5580; ((Class440) this).aNode_5580 = ((Class440) this).aNode_5580.aNode_3187) {
				if ((((Class440) this).aNode_5580.aLong3188 * 7051297995265073167L) == l) {
					Node node_0_ = ((Class440) this).aNode_5580;
					((Class440) this).aNode_5580 = ((Class440) this).aNode_5580.aNode_3187;
					return node_0_;
				}
			}
			((Class440) this).aNode_5580 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.a(").append(')').toString());
		}
	}

	public Node method5853(int i) {
		try {
			if (((Class440) this).aNode_5580 == null)
				return null;
			for (Node node = (((Class440) this).aNodeArray5576[(int) ((((Class440) this).aLong5578 * 4770221757987511949L) & (long) ((1721892305 * ((Class440) this).anInt5577) - 1))]); node != ((Class440) this).aNode_5580; ((Class440) this).aNode_5580 = ((Class440) this).aNode_5580.aNode_3187) {
				if ((((Class440) this).aNode_5580.aLong3188 * 7051297995265073167L) == 4770221757987511949L * ((Class440) this).aLong5578) {
					Node node_1_ = ((Class440) this).aNode_5580;
					((Class440) this).aNode_5580 = ((Class440) this).aNode_5580.aNode_3187;
					return node_1_;
				}
			}
			((Class440) this).aNode_5580 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.f(").append(')').toString());
		}
	}

	public int method5854(Node[] nodes, int i) {
		try {
			int i_2_ = 0;
			for (int i_3_ = 0; i_3_ < 1721892305 * ((Class440) this).anInt5577; i_3_++) {
				Node node = ((Class440) this).aNodeArray5576[i_3_];
				for (Node node_4_ = node.aNode_3187; node_4_ != node; node_4_ = node_4_.aNode_3187)
					nodes[i_2_++] = node_4_;
			}
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.b(").append(')').toString());
		}
	}

	public int method5855(int i) {
		try {
			int i_5_ = 0;
			for (int i_6_ = 0; i_6_ < 1721892305 * ((Class440) this).anInt5577; i_6_++) {
				Node node = ((Class440) this).aNodeArray5576[i_6_];
				for (Node node_7_ = node.aNode_3187; node_7_ != node; node_7_ = node_7_.aNode_3187)
					i_5_++;
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.p(").append(')').toString());
		}
	}

	public Node method5856(int i) {
		try {
			((Class440) this).anInt5581 = 0;
			return method5857((byte) -79);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.k(").append(')').toString());
		}
	}

	public Node method5857(byte i) {
		try {
			if (1311298783 * ((Class440) this).anInt5581 > 0 && (((Class440) this).aNode_5579 != (((Class440) this).aNodeArray5576[((Class440) this).anInt5581 * 1311298783 - 1]))) {
				Node node = ((Class440) this).aNode_5579;
				((Class440) this).aNode_5579 = node.aNode_3187;
				return node;
			}
			while_103_: do {
				Node node;
				do {
					if (1311298783 * ((Class440) this).anInt5581 >= 1721892305 * ((Class440) this).anInt5577)
						break while_103_;
					node = (((Class440) this).aNodeArray5576[((((Class440) this).anInt5581 += 489154335) * 1311298783) - 1].aNode_3187);
				} while ((((Class440) this).aNodeArray5576[((Class440) this).anInt5581 * 1311298783 - 1]) == node);
				((Class440) this).aNode_5579 = node.aNode_3187;
				return node;
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.d(").append(')').toString());
		}
	}

	public Class440(int i) {
		((Class440) this).anInt5577 = -249857231 * i;
		((Class440) this).aNodeArray5576 = new Node[i];
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			Node node = ((Class440) this).aNodeArray5576[i_8_] = new Node();
			node.aNode_3187 = node;
			node.aNode_3189 = node;
		}
	}

	public void method5858(Node node, long l) {
		try {
			if (null != node.aNode_3189)
				node.unlink(-1460969981);
			Node node_9_ = (((Class440) this).aNodeArray5576[(int) (l & (long) (((Class440) this).anInt5577 * 1721892305 - 1))]);
			node.aNode_3189 = node_9_.aNode_3189;
			node.aNode_3187 = node_9_;
			node.aNode_3189.aNode_3187 = node;
			node.aNode_3187.aNode_3189 = node;
			node.aLong3188 = l * 4191220306876042991L;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.i(").append(')').toString());
		}
	}

	static final void method5859(ClientScript2 class403, byte i) {
		try {
			int i_10_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class102 class102 = Class298_Sub40_Sub13.method3517(i_10_, 689328854);
			String string = "";
			if (null != class102 && null != class102.aString1090)
				string = class102.aString1090;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.ach(").append(')').toString());
		}
	}

	public static void method5860(Interface22 interface22, byte i) {
		try {
			if (IcmpService_Sub1.anIcmpService_Sub1_8551 == null)
				throw new IllegalStateException("");
			((IcmpService_Sub1) IcmpService_Sub1.anIcmpService_Sub1_8551).aList8552.add(interface22);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.i(").append(')').toString());
		}
	}

	public static Class428[] method5861(int i) {
		try {
			return (new Class428[] { Class428.aClass428_6618, Class428.aClass428_6619, Class428.aClass428_6620, Class428.aClass428_6617, Class428.aClass428_6616, Class428.aClass428_6621 });
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.a(").append(')').toString());
		}
	}

	public static void method5862(int i, int i_11_, int i_12_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(18, (long) i_11_ << 32 | (long) i);
			class298_sub37_sub12.method3445(-777100649);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("se.ao(").append(')').toString());
		}
	}
}
