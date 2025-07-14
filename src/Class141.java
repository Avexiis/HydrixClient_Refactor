/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class141 implements Interface6 {
	Class145 aClass145_6389;

	public boolean method52(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fs.b(").append(')').toString());
		}
	}

	Class141(Class145 class145) {
		((Class141) this).aClass145_6389 = class145;
	}

	public void method53(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fs.a(").append(')').toString());
		}
	}

	public void method58(boolean bool, byte i) {
		try {
			if (bool)
				OverlayType.activeToolkit.drawFilledBox(0, 0, Class462.canvasWidth * -2110394505, -1111710645 * Class298_Sub40_Sub9.anInt9716, 1751631615 * ((Class141) this).aClass145_6389.anInt6344, 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fs.f(").append(')').toString());
		}
	}

	public void method55() {
		/* empty */
	}

	public void method56(boolean bool) {
		if (bool)
			OverlayType.activeToolkit.drawFilledBox(0, 0, Class462.canvasWidth * -2110394505, (-1111710645 * Class298_Sub40_Sub9.anInt9716), 1751631615 * (((Class141) this).aClass145_6389.anInt6344), 0);
	}

	public boolean method57() {
		return true;
	}

	public boolean method54() {
		return true;
	}

	public boolean method59() {
		return true;
	}

	static void method1561(int i) {
		try {
			if (null != Class300.aClass303_3202) {
				SceneObjectPosition sceneObjectPosition = (SceneObjectPosition.method2005(Class287.myPlayer.method4337().aSceneObjectPosition_2599));
				WorldTile worldTile = GameClient.map.getRegionStart(681479919);
				sceneObjectPosition.x += (float) (worldTile.x * -1760580017 << 9);
				sceneObjectPosition.z += (float) (worldTile.y * 283514611 << 9);
				sceneObjectPosition.method2010((float) (((Class303) Class300.aClass303_3202).anInt3264 * -1640118043), sceneObjectPosition.y, (float) (((Class303) Class300.aClass303_3202).anInt3261 * 827958915));
				float f = sceneObjectPosition.method2012();
				sceneObjectPosition.method2006();
				float f_0_ = 0.0F;
				if (f < (float) (-1052008745 * (((Class303) Class300.aClass303_3202).anInt3262)))
					f_0_ = 1.0F;
				else if (f > (float) (22325987 * (((Class303) Class300.aClass303_3202).anInt3263)))
					f_0_ = 0.0F;
				else {
					f -= (float) (-1052008745 * (((Class303) Class300.aClass303_3202).anInt3262));
					f_0_ = 1.0F - f / (float) ((((Class303) Class300.aClass303_3202).anInt3260) * 356734275);
				}
				IComponentDefinition.method1136((int) (256.0F * f_0_), 497351807);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fs.h(").append(')').toString());
		}
	}

	public static GraphicsToolkit method1562(Canvas canvas, Interface_ma interface_ma, int i, int i_1_, byte i_2_) {
		try {
			return new Class_ra_Sub1(canvas, interface_ma, i, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fs.a(").append(')').toString());
		}
	}

	static final void method1563(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class260.method2461(class105, RSInterface, class403, (short) 11583);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fs.gh(").append(')').toString());
		}
	}

	static final void method1564(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class21.method365(class105, RSInterface, false, 0, class403, 317795036);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fs.hg(").append(')').toString());
		}
	}

	static final void method1565(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class241.method2248(class105, RSInterface, class403, -16777216);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fs.kc(").append(')').toString());
		}
	}

	static final void method1566(ClientScript2 class403, int i) {
		try {
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.characterShadowPreference, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) == 1 ? 1 : 0, -1896213464);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fs.ait(").append(')').toString());
		}
	}

	static void method1567(int i) {
		try {
			if (Class242.aReferenceTable_2708 != ReferenceTable.aReferenceTable_6552)
				Class212.aClass212_2431.method1952(-1042470924);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("fs.np(").append(')').toString());
		}
	}
}
