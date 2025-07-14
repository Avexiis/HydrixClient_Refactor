/* SafemodePreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SafemodePreference extends IntegerPreferenceField {
	public static int anInt8431 = 1;
	public static int anInt8432 = 0;

	public SafemodePreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public SafemodePreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aep.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aep.p(").append(')').toString());
		}
	}

	public int getValue(byte i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aep.z(").append(')').toString());
		}
	}

	int method5615() {
		return 0;
	}

	int method5616(int i) {
		return 1;
	}

	int method5611(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aep.a(").append(')').toString());
		}
	}

	public void method5721(byte i) {
		try {
			if (1 != -1598873795 * anInt5350 && anInt5350 * -1598873795 != 0)
				anInt5350 = method5611(181111129) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aep.s(").append(')').toString());
		}
	}

	static final void method5722(IComponentDefinition class105, ClientScript2 class403, int i) {
		try {
			if (-300634099 * ((ClientScript2) class403).anInt5254 >= 10)
				throw new RuntimeException();
			if (class105.anObjectArray1164 != null) {
				ScriptContext scriptContext = new ScriptContext();
				scriptContext.source = class105;
				scriptContext.arguments = class105.anObjectArray1164;
				((ScriptContext) scriptContext).anInt7524 = (1954090355 * ((ClientScript2) class403).anInt5254 + -171453569);
				GameClient.aLinkedNodeList_8893.addlast(scriptContext, -201281014);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aep.qv(").append(')').toString());
		}
	}
}
