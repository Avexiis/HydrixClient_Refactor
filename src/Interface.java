/* Class298_Sub51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Interface extends Node {
	public int clipped;
	public int interfaceId;

	public boolean method3573(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("acs.a(").append(')').toString());
		}
	}

	public Interface(int interfaceId, int cliped) {
		this.interfaceId = interfaceId * 84132523;
		this.clipped = -1287090225 * cliped;
	}

	static final void method3574(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) -86);
			if (null == class105.aString1228)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class105.aString1228;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("acs.sw(").append(')').toString());
		}
	}

	public static void method3575(byte i) {
		try {
			Class87.aShort792 = GameClient.aShort8934;
			Class315.aShort3306 = GameClient.aShort8935;
			Class51.aShort504 = GameClient.aShort8839;
			Class396.aShort5193 = GameClient.aShort8743;
			Class87.aBoolean802 = true;
			if (Class87.anInt801 * 57998513 != 0 && 0 != 1705830085 * Class87.anInt800) {
				GameClient.aShort8839 = (short) 334;
				GameClient.aShort8743 = (short) 334;
				GameClient.aShort8935 = GameClient.aShort8934 = (short) (Class87.anInt801 * -369532416 / (1705830085 * Class87.anInt800));
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("acs.p(").append(')').toString());
		}
	}

	public static int[] method3576(int i, int i_2_) {
		try {
			int[] is = new int[3];
			FlickeringPreference.method5658(GameContext.method5574(i, 1691290576));
			is[0] = Class490.aCalendar6073.get(5);
			is[1] = Class490.aCalendar6073.get(2);
			is[2] = Class490.aCalendar6073.get(1);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("acs.u(").append(')').toString());
		}
	}
}
