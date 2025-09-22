/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class3 {
	public static int anInt54;
	static boolean aBoolean55;
	static int anInt56;
	static int anInt57;
	static int[] anIntArray58;
	static int[] anIntArray59;
	static int[] anIntArray60;
	static LinkedNodeList aLinkedNodeList_61;
	public static int anInt62;
	static boolean aBoolean63;
	static boolean aBoolean64 = false;
	static boolean aBoolean65;
	static int anInt66 = 48;
	static int anInt67;
	static Class284 aClass284_68;

	static {
		aBoolean55 = false;
		anInt57 = 955770805;
		anInt67 = 0;
		anIntArray58 = new int[1003];
		anIntArray59 = new int[1004];
		anIntArray60 = new int[1005];
		aLinkedNodeList_61 = new LinkedNodeList();
		anInt62 = 1129029761;
		anInt54 = 1835291189;
		aBoolean63 = true;
		aBoolean65 = false;
		anInt56 = 0;
	}

	Class3() throws Throwable {
		throw new Error();
	}

	public static void writePreferences() {
		try { //saves to json now
			ClientPrefs prefs = GamePreferencesJsonBridge.fromGamePreferences(GraphicsSetup.clientPreferences);
			PrefsIO.save(prefs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	static final void method301(ClientScript2 class403, byte i) {
		try {
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.texturePreference, class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919] == 1 ? 1 : 0, -223155318);
			writePreferences();
			Class359.method4294(1660250591);
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ad.aim(").append(')').toString());
		}
	}

	static final int method302(Class513 class513, int i) {
		try {
			if (class513 == null) {
				return 12;
			}
			switch (-1062992263 * class513.anInt6638) {
			case 3:
				return 20;
			default:
				return 12;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ad.a(").append(')').toString());
		}
	}

	static final void method303(ClientScript2 class403, int i) {
		try {
			String string = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
			if (string.startsWith(Class247.method2368(0, -278777595)) || string.startsWith(Class247.method2368(1, -278777595))) {
				string = string.substring(7);
			}
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = VarClientTypeList.method6192(string, -1912416826) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ad.vj(").append(')').toString());
		}
	}
}
