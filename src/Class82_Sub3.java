/* Class82_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub3 extends Class82 {
	int anInt6823;
	int anInt6824;
	static IComponentDefinition aClass105_6825;

	Class82_Sub3(Packet class298_sub53) {
		super(class298_sub53);
		((Class82_Sub3) this).anInt6824 = class298_sub53.readUnsignedShort() * -40183047;
		((Class82_Sub3) this).anInt6823 = class298_sub53.gSmart2or4n() * -1186011313;
	}

	public void method866(int i) {
		try {
			Class86 class86 = (Class87.aClass86Array798[((Class82_Sub3) this).anInt6824 * -878655671]);
			LocalizedString.handleSceneObjectAction(-637425735 * ((Class86) class86).anInt788, ((Class86) class86).anInt789 * -123379955, ((Class86) class86).anInt790 * 1400706617, (((Class86) class86).aClass424_787.anInt6615 * -6749525), (((Class86) class86).aClass424_787.anInt6613 * -1976050083), 1067426701 * ((Class86) class86).anInt791, ((Class82_Sub3) this).anInt6823 * 1204408239, 55517890);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("xd.f(").append(')').toString());
		}
	}

	boolean method879() {
		SeqType class391 = Class501.aClass395_6122.method4903((((Class82_Sub3) this).anInt6823) * 1204408239, (byte) -25);
		return class391.method4880(509501216);
	}

	boolean method870(int i) {
		try {
			SeqType class391 = Class501.aClass395_6122.method4903((((Class82_Sub3) this).anInt6823) * 1204408239, (byte) -37);
			return class391.method4880(706659093);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("xd.p(").append(')').toString());
		}
	}

	public void method869() {
		Class86 class86 = (Class87.aClass86Array798[((Class82_Sub3) this).anInt6824 * -878655671]);
		LocalizedString.handleSceneObjectAction(-637425735 * ((Class86) class86).anInt788, ((Class86) class86).anInt789 * -123379955, ((Class86) class86).anInt790 * 1400706617, (((Class86) class86).aClass424_787.anInt6615 * -6749525), (((Class86) class86).aClass424_787.anInt6613 * -1976050083), 1067426701 * ((Class86) class86).anInt791, ((Class82_Sub3) this).anInt6823 * 1204408239, -944775974);
	}

	public void method868() {
		Class86 class86 = (Class87.aClass86Array798[((Class82_Sub3) this).anInt6824 * -878655671]);
		LocalizedString.handleSceneObjectAction(-637425735 * ((Class86) class86).anInt788, ((Class86) class86).anInt789 * -123379955, ((Class86) class86).anInt790 * 1400706617, (((Class86) class86).aClass424_787.anInt6615 * -6749525), (((Class86) class86).aClass424_787.anInt6613 * -1976050083), 1067426701 * ((Class86) class86).anInt791, ((Class82_Sub3) this).anInt6823 * 1204408239, -1580583180);
	}

	static final void method880(ClientScript2 class403, int i) {
		try {
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aVolumePreference_7582, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), -2055385599);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("xd.aid(").append(')').toString());
		}
	}

	static long method881(byte i) {
		try {
			return GameShell.aClass309_6492.method3794(-489985044);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("xd.aa(").append(')').toString());
		}
	}
}
