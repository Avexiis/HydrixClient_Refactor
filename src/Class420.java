/* Class420 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class420 {
	static char[] aCharArray5342 = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	static long[] aLongArray5343 = new long[12];
	static Class515 aClass515_5344;
	static int anInt5345;

	Class420() throws Throwable {
		throw new Error();
	}

	static {
		for (int i = 0; i < aLongArray5343.length; i++)
			aLongArray5343[i] = (long) Math.pow(37.0, (double) i);
	}

	public static void method5606(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			ObjectDeque objectDeque = null;
			for (ObjectDeque objectDeque_7_ = ((ObjectDeque) ObjectDeque.aLinkedNodeList_7152.method5939(1766612795)); objectDeque_7_ != null; objectDeque_7_ = ((ObjectDeque) ObjectDeque.aLinkedNodeList_7152.method5944(49146))) {
				if ((2108312995 * ((ObjectDeque) objectDeque_7_).anInt7151 == i) && 634196087 * objectDeque_7_.anInt7150 == i_0_ && -2146829167 * objectDeque_7_.anInt7155 == i_1_ && i_2_ == -431456739 * (((ObjectDeque) objectDeque_7_).anInt7157)) {
					objectDeque = objectDeque_7_;
					break;
				}
			}
			if (objectDeque == null) {
				objectDeque = new ObjectDeque();
				((ObjectDeque) objectDeque).anInt7151 = i * -196260341;
				((ObjectDeque) objectDeque).anInt7157 = i_2_ * 1088435253;
				objectDeque.anInt7150 = 656787783 * i_0_;
				objectDeque.anInt7155 = i_1_ * 284247153;
				if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < GameClient.map.upperX(-1908372692) && i_1_ < GameClient.map.upperY(629047644))
					Class117.method1285(objectDeque, -162957807);
				ObjectDeque.aLinkedNodeList_7152.addlast(objectDeque, 1633204361);
			}
			((ObjectDeque) objectDeque).anInt7156 = 240885009 * i_3_;
			((ObjectDeque) objectDeque).anInt7153 = i_4_ * 998055383;
			((ObjectDeque) objectDeque).anInt7149 = 1034640391 * i_5_;
			((ObjectDeque) objectDeque).aBoolean7159 = true;
			((ObjectDeque) objectDeque).aBoolean7160 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rk.a(").append(')').toString());
		}
	}

	static final void method5607(ClientScript2 class403, int i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GameClient.aClass251Array8920[i_8_].anInt2769 * 1383593425;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rk.yf(").append(')').toString());
		}
	}

	public static final void method5608(int i) {
		try {
			for (ObjectDeque objectDeque = ((ObjectDeque) ObjectDeque.aLinkedNodeList_7152.method5939(1766612795)); objectDeque != null; objectDeque = (ObjectDeque) ObjectDeque.aLinkedNodeList_7152.method5944(49146)) {
				if (!((ObjectDeque) objectDeque).aBoolean7160) {
					((ObjectDeque) objectDeque).aBoolean7159 = true;
					if (634196087 * objectDeque.anInt7150 >= 0 && objectDeque.anInt7155 * -2146829167 >= 0 && (634196087 * objectDeque.anInt7150 < GameClient.map.upperX(-1871526843)) && (objectDeque.anInt7155 * -2146829167 < GameClient.map.upperY(-1895886966)))
						Class117.method1285(objectDeque, 147943234);
				} else
					objectDeque.unlink(-1460969981);
			}
			for (ObjectDeque objectDeque = ((ObjectDeque) ObjectDeque.aLinkedNodeList_7162.method5939(1766612795)); null != objectDeque; objectDeque = (ObjectDeque) ObjectDeque.aLinkedNodeList_7162.method5944(49146)) {
				if (!((ObjectDeque) objectDeque).aBoolean7160)
					((ObjectDeque) objectDeque).aBoolean7159 = true;
				else
					objectDeque.unlink(-1460969981);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rk.b(").append(')').toString());
		}
	}
}
