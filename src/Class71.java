/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class71 {
	static boolean aBoolean684;
	static int anInt685 = 0;
	static LinkedNodeList aLinkedNodeList_686;

	static synchronized void method809(Interface25 interface25, short i) {
		try {
			if (!aBoolean684) {
				if (830010277 * anInt685 > 0) {
					LinkableObject linkableObject = new LinkableObject(interface25);
					aLinkedNodeList_686.addlast(linkableObject, -259769992);
				} else
					interface25.ma(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("cw.a(").append(')').toString());
		}
	}

	static synchronized void method810(byte i) {
		try {
			for (;;) {
				LinkableObject linkableObject = (LinkableObject) aLinkedNodeList_686.method5936(2119725533);
				if (null == linkableObject) {
					if (i != 3) {
						/* empty */
					}
					break;
				}
				((Interface25) linkableObject.anObject7366).ma(true);
				linkableObject.unlink(-1460969981);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("cw.f(").append(')').toString());
		}
	}

	static synchronized void method811(int i) {
		try {
			anInt685 += 1452325933;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("cw.b(").append(')').toString());
		}
	}

	static synchronized void method812(int i) {
		try {
			anInt685 -= 1452325933;
			if (0 == 830010277 * anInt685)
				method810((byte) 3);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("cw.p(").append(')').toString());
		}
	}

	public static synchronized void method813(boolean bool, int i) {
		try {
			aBoolean684 = bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("cw.i(").append(')').toString());
		}
	}

	static {
		aBoolean684 = false;
		aLinkedNodeList_686 = new LinkedNodeList();
	}

	Class71() throws Throwable {
		throw new Error();
	}
}
