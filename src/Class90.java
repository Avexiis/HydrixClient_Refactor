/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class90 {
	Class90() throws Throwable {
		throw new Error();
	}

	static final void method995(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -18);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1175 * 1411971043;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dr.ru(").append(')').toString());
		}
	}

	static final void method996(ClientScript2 class403, int i) {
		try {
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aClass422_Sub22_7586, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) == 1 ? 1 : 0, 869927846);
			Class237.method2196(-1216722495);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dr.aig(").append(')').toString());
		}
	}

	static final void method997(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (GameClient.anInt8752 * -1233866115 != 14 || Class315.method3837((byte) -13))
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = Class372.method4589(i_1_, string, 955770805) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dr.als(").append(')').toString());
		}
	}
}
