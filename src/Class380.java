/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class380 {
	static Class380 aClass380_4100;
	static Class380 aClass380_4101;
	public static Class380 aClass380_4102;
	public static Class380 aClass380_4103 = new Class380(1);
	static Class380 aClass380_4104;
	static Class380 aClass380_4105;
	static Class380 aClass380_4106;
	static Class380 aClass380_4107;
	public int anInt4108;

	static {
		aClass380_4101 = new Class380(2);
		aClass380_4104 = new Class380(3);
		aClass380_4102 = new Class380(4);
		aClass380_4107 = new Class380(5);
		aClass380_4105 = new Class380(6);
		aClass380_4106 = new Class380(7);
		aClass380_4100 = new Class380(8);
	}

	Class380(int i) {
		anInt4108 = 471184109 * i;
	}

	static final void method4676(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_0_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_1_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			Class298_Sub37_Sub8 class298_sub37_sub8 = GraphicsToolkit.aClass256_5315.method2441(i_0_, 7133861);
			int i_2_ = class298_sub37_sub8.anIntArray9599[i_1_];
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pu.acv(").append(')').toString());
		}
	}

	static final void method4677(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-706712654);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pu.ajb(").append(')').toString());
		}
	}

	public static void method4678(int i) {
		try {
			if (AnimationController.aClass471_4146.worldId * 1606920449 != -1)
				Class372.method4589((AnimationController.aClass471_4146.worldId * 1606920449), AnimationController.aClass471_4146.address, 955770805);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pu.b(").append(')').toString());
		}
	}

	static void method4679(IComponentDefinition class105, IComponentDefinition class105_3_, int i) {
		try {
			Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.SWITCH_INTERFACE_ITEM_PACKET, GameClient.gameConnection.aClass449_330, (byte) 44);
			class298_sub36.buffer.writeShortLE128(class105_3_.zds3 * -1232467723);
			class298_sub36.buffer.writeIntV1(class105.interfacehash * -440872681, (byte) -22);
			class298_sub36.buffer.writeInt(class105_3_.interfacehash * -440872681, -855626208);
			class298_sub36.buffer.writeShort(-1309843523 * class105.component, 16711935);
			class298_sub36.buffer.writeShortLE128(class105_3_.component * -1309843523);
			class298_sub36.buffer.writeShortLE(class105.zds3 * -1232467723, 1472780126);
			GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -67);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pu.kq(").append(')').toString());
		}
	}

	static final void method4680(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.sceneryShadowPreference.method5648(1496111936) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pu.ane(").append(')').toString());
		}
	}

	static final void method4681(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -393614280) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1137 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.hasScripts = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pu.lh(").append(')').toString());
		}
	}

	static String method4682(IComponentDefinition class105, int i, byte i_4_) {
		try {
			if (!GameClient.method2801(class105).method3498(i, (byte) -47) && class105.anObjectArray1264 == null)
				return null;
			if (null == class105.aStringArray1195 || class105.aStringArray1195.length <= i || null == class105.aStringArray1195[i] || class105.aStringArray1195[i].trim().length() == 0) {
				if (GameClient.aBoolean8846)
					return new StringBuilder().append("Hidden-").append(i).toString();
				return null;
			}
			return class105.aStringArray1195[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pu.bq(").append(')').toString());
		}
	}
}
