/* ContextMenu - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ContextMenu {
	static CachingHashMap aClass348_5464;
	static int anInt5465 = 410;
	static Class298_Sub37_Sub15 aClass298_Sub37_Sub15_5466;
	static int anInt5467 = -372312112;
	static int anInt5468 = 0;
	static int anInt5469 = 31;
	static HashTable aClass437_5470;
	static boolean aBoolean5471;
	static Class298_Sub37_Sub5 aClass298_Sub37_Sub5_5472;
	static int anInt5473 = 0;
	static int anInt5474 = 1;
	static float[] aFloatArray5475;
	static int anInt5476;
	static Class298_Sub37_Sub15 aClass298_Sub37_Sub15_5477;
	public static boolean menuOpen = false;
	public static int anInt5479;
	static LinkedNodeList aLinkedNodeList_5480;
	static int anInt5481 = 521;
	static Class461 aClass461_5482;
	static int anInt5483 = 3;
	public static int anInt5484;
	static int anInt5485 = 31;
	static IComponentDefinition aClass105_5486;
	static int anInt5487;
	static int anInt5488 = 2;
	static int anInt5489;
	static int anInt5490;
	static int anInt5491;
	static int anInt5492;
	static Class233 aClass233_5493;
	static Class233 aClass233_5494;
	static Matrix43f aClass222_5495;
	public static boolean aBoolean5496;
	static int anInt5497 = 2;
	static int anInt5498;
	public static int anInt5499;
	static CachingHashMap aClass348_5500;
	static Class57[] aClass57Array5501;
	static int anInt5502;
	static int anInt5503 = 8;
	static int anInt5504 = 1;
	static LinkedNodeList aLinkedNodeList_5505;
	public static int actionCount;
	static int anInt5507 = 4;
	static int anInt5508 = 5;
	static int anInt5509 = 6;
	static int anInt5510 = 7;
	static LinkedNodeList aLinkedNodeList_5511;

	static {
		aBoolean5471 = false;
		aClass298_Sub37_Sub5_5472 = null;
		anInt5476 = 0;
		actionCount = 0;
		anInt5479 = 0;
		aLinkedNodeList_5480 = new LinkedNodeList();
		aClass437_5470 = new HashTable(16);
		aClass461_5482 = new Class461();
		aLinkedNodeList_5511 = new LinkedNodeList();
		aLinkedNodeList_5505 = new LinkedNodeList();
		aClass348_5464 = new CachingHashMap(30);
		aClass105_5486 = null;
		anInt5487 = 1021462033;
		anInt5502 = 1325119769;
		anInt5489 = 305664667;
		anInt5490 = -67681267;
		anInt5491 = 0;
		anInt5492 = 0;
		aClass233_5493 = null;
		aClass233_5494 = new Class233();
		aClass222_5495 = new Matrix43f();
		aBoolean5496 = false;
		anInt5498 = 0;
		anInt5499 = -985311877;
		aClass348_5500 = new CachingHashMap(8);
		aFloatArray5475 = new float[4];
	}

	ContextMenu() throws Throwable {
		throw new Error();
	}

	static final void method5805(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			String string = (String) (class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -1382665661) != null) {
				string = string.substring(0, string.length() - 1);
			}
			class105.anObjectArray1249 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.hasScripts = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("s.mk(").append(')').toString());
		}
	}

	static final void method5806(ClientScript2 class403, byte i) {
		try {
			class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = (class403.aClass298_Sub25_5237.method3097((String) (class403.anObjectArray5240[((class403.anInt5241 -= 969361751) * -203050393)]), (byte) -7));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("s.yv(").append(')').toString());
		}
	}

	static final void method5807(ClientScript2 script, int i) {
		try {
			int i_0_ = script.anIntArray5244[((script.anInt5239 -= -391880689) * 681479919)];
			if (i_0_ > 255 || i_0_ < 0) {
				i_0_ = 0;
			}
			if (i_0_ != GraphicsAutoSetup.clientPreferences.aCompressionType_7578.method5700(-1514807660)) {
				GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aCompressionType_7578, i_0_, -1997480653);
				Class3.writePreferences();
				GameClient.aBoolean8666 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("s.ajv(").append(')').toString());
		}
	}

	static String method5808(Packet class298_sub53, int i, int i_1_) {
		try {
			String string;
			try {
				int i_2_ = class298_sub53.readUnsignedSmart();
				if (i_2_ > i) {
					i_2_ = i;
				}
				byte[] is = new byte[i_2_];
				class298_sub53.pos += (Class106.aHuffman_1308.method1245(class298_sub53.payload, class298_sub53.pos * 385051775, is, 0, i_2_, 200493148)) * 116413311;
				String string_3_ = Class52.method556(is, 0, i_2_, -295341968);
				string = string_3_;
			} catch (Exception exception) {
				return "Cabbage";
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("s.p(").append(')').toString());
		}
	}

	static final void method5809(ClientScript2 class403, byte i) {
		try {
			class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = GameClient.aBoolean8807 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("s.uw(").append(')').toString());
		}
	}

	public static int method5810(int i) {
		try {
			return 1465562869 * AnimationController.anInt4145;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("s.z(").append(')').toString());
		}
	}
}
