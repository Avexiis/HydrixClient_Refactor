/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14 {
	static int anInt168;
	static Class89[] aClass89Array169;
	static int anInt170;
	static Class139 aClass139_171;
	static int anInt172;
	static int anInt173;
	static int anInt174;
	static int anInt175;
	static Class505 aClass505_176;
	static Class133 aClass133_177;

	Class14() throws Throwable {
		throw new Error();
	}

	public static void method341(int i, int[] is, int i_0_) {
		try {
			if (i != -1 && Class378.method4671(i, is, -2060750983)) {
				IComponentDefinition[] class105s = SpotAnimTypeList.aRSInterfaceArray4165[i].aClass105Array1405;
				SpotAnimation.method611(class105s, -1178956884);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ao.p(").append(')').toString());
		}
	}

	static final void method342(ClientScript2 class403, int i) {
		try {
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.cursorPreference, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) != 0 ? 1 : 0, -261887884);
			Class3.writePreferences();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ao.air(").append(')').toString());
		}
	}

	static final void method343(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_1_, (byte) -45);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_1_ >> 16];
			Class79.method851(class105, RSInterface, class403, -1849275031);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ao.ek(").append(')').toString());
		}
	}

	public static void method344(int i) {
		try {
			Class323_Sub1.method3955(-1, 255, 328240529);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ao.o(").append(')').toString());
		}
	}

	static final void method345(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (i_2_ < 0 || i_2_ > 5)
				i_2_ = 2;
			ClanSettings.method4578(i_2_, false, 622850291);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ao.aic(").append(')').toString());
		}
	}

	static final void method346(byte i) {
		try {
			for (Class298_Sub37_Sub2 class298_sub37_sub2 = ((Class298_Sub37_Sub2) GameClient.projectiles.method5939(1766612795)); null != class298_sub37_sub2; class298_sub37_sub2 = ((Class298_Sub37_Sub2) GameClient.projectiles.method5944(49146))) {
				Class365_Sub1_Sub1_Sub1 class365_sub1_sub1_sub1 = (((Class298_Sub37_Sub2) class298_sub37_sub2).aClass365_Sub1_Sub1_Sub1_9577);
				if (443738891 * GameClient.anInt8884 > class365_sub1_sub1_sub1.anInt10049 * -1349988959) {
					class298_sub37_sub2.unlink(-1460969981);
					class365_sub1_sub1_sub1.method4411(686828159);
				} else if (GameClient.anInt8884 * 443738891 >= (class365_sub1_sub1_sub1.anInt10044 * 1113390887)) {
					class365_sub1_sub1_sub1.method4406(-36689971);
					if (1894383945 * class365_sub1_sub1_sub1.anInt10058 > 0) {
						if (1596783995 * GameClient.cutsceneStage == 0) {
							Entity class365_sub1_sub1_sub2 = Class87.entities[(class365_sub1_sub1_sub1.anInt10058 * 1894383945) - 1].method1015(1231902873);
							if (null != class365_sub1_sub1_sub2) {
								SceneObjectPosition sceneObjectPosition = (class365_sub1_sub1_sub2.method4337().aSceneObjectPosition_2599);
								if ((int) sceneObjectPosition.x >= 0 && ((int) sceneObjectPosition.x < GameClient.map.upperX(-1942094391) * 512) && (int) sceneObjectPosition.z >= 0 && ((int) sceneObjectPosition.z < GameClient.map.upperY(-1804151587) * 512))
									class365_sub1_sub1_sub1.method4405((int) sceneObjectPosition.x, (int) sceneObjectPosition.z, ((Class356.method4271((int) sceneObjectPosition.x, (int) sceneObjectPosition.z, class365_sub1_sub1_sub2.plane, -1503815167)) - (2134079017 * (class365_sub1_sub1_sub1.anInt10045))), 443738891 * GameClient.anInt8884, 1121215352);
							}
						} else {
							LinkableObject linkableObject = ((LinkableObject) (GameClient.npcs.get((long) ((1894383945 * (class365_sub1_sub1_sub1.anInt10058)) - 1))));
							if (linkableObject != null) {
								NPC class365_sub1_sub1_sub2_sub1 = ((NPC) linkableObject.anObject7366);
								SceneObjectPosition sceneObjectPosition = (class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599);
								if ((int) sceneObjectPosition.x >= 0 && ((int) sceneObjectPosition.x < GameClient.map.upperX(-1876273086) * 512) && (int) sceneObjectPosition.z >= 0 && ((int) sceneObjectPosition.z < GameClient.map.upperY(-203309822) * 512))
									class365_sub1_sub1_sub1.method4405((int) sceneObjectPosition.x, (int) sceneObjectPosition.z, ((Class356.method4271((int) sceneObjectPosition.x, (int) sceneObjectPosition.z, class365_sub1_sub1_sub1.plane, -1366613250)) - (class365_sub1_sub1_sub1.anInt10045 * 2134079017)), GameClient.anInt8884 * 443738891, 2031199219);
							}
						}
					}
					if (1894383945 * class365_sub1_sub1_sub1.anInt10058 < 0) {
						int i_3_ = (-(class365_sub1_sub1_sub1.anInt10058 * 1894383945) - 1);
						Player player;
						if (i_3_ == -442628795 * GameClient.playerIndex)
							player = Class287.myPlayer;
						else
							player = (GameClient.players[i_3_]);
						if (null != player) {
							SceneObjectPosition sceneObjectPosition = (player.method4337().aSceneObjectPosition_2599);
							if ((int) sceneObjectPosition.x >= 0 && ((int) sceneObjectPosition.x < GameClient.map.upperX(-1981087344) * 512) && (int) sceneObjectPosition.z >= 0 && ((int) sceneObjectPosition.z < GameClient.map.upperY(-1284142631) * 512))
								class365_sub1_sub1_sub1.method4405((int) sceneObjectPosition.x, (int) sceneObjectPosition.z, ((Class356.method4271((int) sceneObjectPosition.x, (int) sceneObjectPosition.z, class365_sub1_sub1_sub1.plane, -1135065402)) - (class365_sub1_sub1_sub1.anInt10045 * 2134079017)), 443738891 * GameClient.anInt8884, 1831333850);
						}
					}
					class365_sub1_sub1_sub1.method4407(GameClient.anInt8961 * 614680345, (byte) 63);
					GameClient.map.method2675(-1611682495).method4022(class365_sub1_sub1_sub1, true, (byte) 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ao.ie(").append(')').toString());
		}
	}
}
