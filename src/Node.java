/* Node - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node {
	public Node aNode_3187;
	public long aLong3188;
	public Node aNode_3189;
	public static int anInt3190;
	static int anInt3191;
	static int anInt3192;

	public void unlink(int i) {
		try {
			if (aNode_3189 != null) {
				aNode_3189.aNode_3187 = aNode_3187;
				aNode_3187.aNode_3189 = aNode_3189;
				aNode_3187 = null;
				aNode_3189 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mk.t(").append(')').toString());
		}
	}

	public boolean method2840(int i) {
		try {
			if (null == aNode_3189)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mk.h(").append(')').toString());
		}
	}

	static final void method2841(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			Class298_Sub37_Sub10 class298_sub37_sub10 = (Class300.aClass518_3217.method6311((((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]), 894186762));
			int i_0_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			int i_1_ = -1;
			for (int i_2_ = 0; i_2_ < -408056823 * class298_sub37_sub10.anInt9605; i_2_++) {
				if (i_0_ == class298_sub37_sub10.anIntArray9601[i_2_]) {
					i_1_ = class298_sub37_sub10.anIntArray9603[i_2_];
					break;
				}
			}
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mk.tu(").append(')').toString());
		}
	}

	static final void method2842(ClientScript2 class403, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mk.alz(").append(')').toString());
		}
	}

	static final void method2843(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.aGraphicsAutoSetup_7569.method5716((byte) 23);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mk.ajm(").append(')').toString());
		}
	}

	public static Class173 method2844(int i, int i_3_) {
		try {
			Class173 class173 = (Class173) Class173.aClass348_1749.get((long) i);
			if (class173 != null)
				return class173;
			byte[] is = Class173.aClass243_1756.getFileFromArchive(0, i, (byte) -64);
			class173 = new Class173();
			if (null != is)
				class173.method1817(new Packet(is), i, (byte) -27);
			Class173.aClass348_1749.put(class173, (long) i);
			return class173;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("mk.f(").append(')').toString());
		}
	}
}
