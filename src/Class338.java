/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class338 {
	static int anInt3628 = -1;//TODO
	static int anInt3629 = 2;
	public static int anInt3630;
	static boolean aBoolean3631 = false;
	static int anInt3632 = 1;//TODO

	Class338() throws Throwable {
		throw new Error();
	}

	static final void method4113(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Interface class298_sub51 = ((Interface) GameClient.aClass437_8841.get((long) i_0_));
			if (null != class298_sub51)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oc.rx(").append(')').toString());
		}
	}

	public static byte[] method4114(Object object, boolean bool, int i) {
		try {
			if (object == null)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				if (bool)
					return Arrays.copyOf(is, is.length);
				return is;
			}
			if (object instanceof ByteBuffer) {
				ByteBuffer bytebuffer = (ByteBuffer) object;
				byte[] is = new byte[bytebuffer.capacity()];
				bytebuffer.position(0);
				bytebuffer.get(is);
				return is;
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oc.f(").append(')').toString());
		}
	}

	public static RSInterface method4115(int widgetId, int[] is, RSInterface RSInterface, boolean bool, byte i_1_) {
		try {
			if (!Class270.aClass243_2894.method2291(widgetId, 2091513640))
				return null;
			int i_2_ = Class270.aClass243_2894.method2316(widgetId, -1254954272);
			IComponentDefinition[] class105s;
			if (i_2_ == 0)
				class105s = new IComponentDefinition[0];
			else if (null == RSInterface)
				class105s = new IComponentDefinition[i_2_];
			else
				class105s = RSInterface.aClass105Array1405;
			if (RSInterface == null)
				RSInterface = new RSInterface(bool, class105s);
			else {
				RSInterface.aClass105Array1405 = class105s;
				RSInterface.aBoolean1403 = bool;
			}
			for (int cId = 0; cId < i_2_; cId++) {
				if (RSInterface.aClass105Array1405[cId] == null) {
					byte[] is_4_ = Class270.aClass243_2894.method2289(widgetId, cId, is, -1925510913);
					if (null != is_4_) {
						IComponentDefinition class105 = (RSInterface.aClass105Array1405[cId] = new IComponentDefinition());
						class105.interHash = (cId + (widgetId << 16));
						class105.interfacehash = (cId + (widgetId << 16)) * 533296807;
						class105.method1110(new Packet(is_4_), 1142190823);
					}
				}
			}
			return RSInterface;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("oc.k(").append(')').toString());
		}
	}
}
