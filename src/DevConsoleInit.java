/* DevConsoleInit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Arrays;

public class DevConsoleInit extends Class372 {
	static boolean aBoolean7730;

	DevConsoleInit() throws Throwable {
		throw new Error();
	}

	static void initConsoleState() {
		try {
			DevConsoleState.primaryLineHeight = (
					-445162670 + (-123784141 * GroundSpotAnimUpdate.CONSOLE_PRIMARY_FONT.ascent + (GroundSpotAnimUpdate.CONSOLE_PRIMARY_FONT.descent * -1877198679))
			);
			DevConsoleState.secondaryLineHeight = (
					524676266 + (RemoveRoofPreference.CONSOLE_SECONDARY_FONT.ascent * 294342359 + 1292125525 * RemoveRoofPreference.CONSOLE_SECONDARY_FONT.descent)
			);
			DevConsoleState.lines = new String[500];
			Arrays.fill(DevConsoleState.lines, "");
			DevConsole.sendDevConsoleMsg(LocalizedString.MESSAGE_WELCOME_CONSOLE_ALT.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adx.b(" + ')');
		}
	}

	static final void method4600(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -560594807 * Class388.anInt4152;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adx.amp(" + ')');
		}
	}

	static final void method4601(ClientScript2 class403, short i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class298_Sub45.method3533(class105, RSInterface, class403, (byte) 36);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adx.dk(" + ')');
		}
	}

	static final void method4602(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			class105.anInt1184 = -295449533;
			class105.anInt1151 = 1825442367;
			if (-1309843523 * class105.component == -1 && !RSInterface.aBoolean1403)
				IntegerPreferenceField.method5623(-440872681 * class105.interfacehash, 1454915163);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adx.hq(" + ')');
		}
	}
}
