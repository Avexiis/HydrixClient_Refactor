/* Class301_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class301_Sub1 extends WorldMap {
	static int anInt7623;
	public static int anInt7624;
	public static int anInt7625;
	static int anInt7626 = -485258093;
	static int anInt7627;
	static boolean aBoolean7628;
	static int anInt7629;
	static int anInt7630;
	static boolean aBoolean7631;
	static int anInt7632;
	static int anInt7633;
	static Class446 aClass446_7634;
	public static boolean aBoolean7635;
	public static HashTable aClass437_7636;
	public static HashTable aClass437_7637;
	static String[] aStringArray7638;
	static int anInt7639;

	Class301_Sub1() throws Throwable {
		throw new Error();
	}

	static {
		anInt7624 = 0;
		anInt7632 = 433609607;
		anInt7627 = 789877945;
		aBoolean7628 = false;
		anInt7629 = 1801430445;
		anInt7623 = 1505298155;
		aBoolean7631 = false;
		aStringArray7638 = new String[5];
		anInt7633 = -2138103821;
		anInt7630 = -1998014133;
		aBoolean7635 = false;
		aClass437_7636 = new HashTable(8);
		aClass437_7637 = new HashTable(8);
		aClass446_7634 = new Class446(new LinkedNodeList());
	}

	static final void method3712(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, byte i) {
		try {
			class105.anInt1184 = -1530138943;
			class105.anInt1151 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) * -1825442367;
			LocalizedString.markComponentForRedraw(class105, 648135865);
			if (class105.component * -1309843523 == -1 && !RSInterface.aBoolean1403)
				IntegerPreferenceField.method5623(class105.interfacehash * -440872681, 1575385059);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("acu.dr(").append(')').toString());
		}
	}

	public static void method3713(int i, int i_0_, int i_1_, String string, int i_2_) {
		try {
			IComponentDefinition class105 = Class140.method1558(i_0_, i_1_, -156511736);
			if (class105 != null) {
				if (class105.anObjectArray1264 != null) {
					ScriptContext scriptContext = new ScriptContext();
					scriptContext.source = class105;
					scriptContext.anInt7528 = 1654612087 * i;
					scriptContext.aString7523 = string;
					scriptContext.arguments = class105.anObjectArray1264;
					ClientBuild.execute(scriptContext, (byte) -29);
				}
				if (GameClient.method2801(class105).method3498(i - 1, (byte) -25)) {
					Class25 class25 = Language.method5760((short) 512);
					if (-1233866115 * GameClient.anInt8752 == 14 || 0 == GameClient.anInt8752 * -1233866115) {
						if (i == 1) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.ACTION_BUTTON1_PACKET, class25.aClass449_330, (byte) 40);
							Class125.method1396(class298_sub36, i_0_, i_1_, (-1232467723 * class105.zds3), -1695827903);
							class25.writeOutboundPacket(class298_sub36, (byte) -4);
						}
						if (i == 2) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.ACTION_BUTTON2_PACKET, class25.aClass449_330, (byte) 73);
							Class125.method1396(class298_sub36, i_0_, i_1_, (class105.zds3 * -1232467723), 1169430348);
							class25.writeOutboundPacket(class298_sub36, (byte) -80);
						}
						if (i == 3) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2054, class25.aClass449_330, (byte) 78);
							Class125.method1396(class298_sub36, i_0_, i_1_, (class105.zds3 * -1232467723), -1266676543);
							class25.writeOutboundPacket(class298_sub36, (byte) -9);
						}
						if (4 == i) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2048, class25.aClass449_330, (byte) 31);
							Class125.method1396(class298_sub36, i_0_, i_1_, (-1232467723 * class105.zds3), -603023247);
							class25.writeOutboundPacket(class298_sub36, (byte) -119);
						}
						if (5 == i) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_1993, class25.aClass449_330, (byte) 30);
							Class125.method1396(class298_sub36, i_0_, i_1_, (class105.zds3 * -1232467723), -120093158);
							class25.writeOutboundPacket(class298_sub36, (byte) -43);
						}
						if (i == 6) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2020, class25.aClass449_330, (byte) 65);
							Class125.method1396(class298_sub36, i_0_, i_1_, (-1232467723 * class105.zds3), -206334631);
							class25.writeOutboundPacket(class298_sub36, (byte) -32);
						}
						if (i == 7) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2083, class25.aClass449_330, (byte) 62);
							Class125.method1396(class298_sub36, i_0_, i_1_, (class105.zds3 * -1232467723), 1351893071);
							class25.writeOutboundPacket(class298_sub36, (byte) -81);
						}
						if (i == 8) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_1999, class25.aClass449_330, (byte) 74);
							Class125.method1396(class298_sub36, i_0_, i_1_, (class105.zds3 * -1232467723), 1834394135);
							class25.writeOutboundPacket(class298_sub36, (byte) -56);
						}
						if (9 == i) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2089, class25.aClass449_330, (byte) 124);
							Class125.method1396(class298_sub36, i_0_, i_1_, (-1232467723 * class105.zds3), -1435192522);
							class25.writeOutboundPacket(class298_sub36, (byte) -66);
						}
						if (i == 10) {
							Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2025, class25.aClass449_330, (byte) 83);
							Class125.method1396(class298_sub36, i_0_, i_1_, (-1232467723 * class105.zds3), -87863525);
							class25.writeOutboundPacket(class298_sub36, (byte) -62);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("acu.kp(").append(')').toString());
		}
	}
}
