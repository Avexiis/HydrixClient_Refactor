/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class60 {
	ModelPart aModelPart_584;
	ObjectTypeList aClass433_585;
	int anInt586;
	Class365_Sub1 aClass365_Sub1_587;
	byte aByte588;
	int anInt589;
	int anInt590;
	boolean aBoolean591 = false;
	boolean aBoolean592;
	Animator aAnimator_593;
	int anInt594;
	int anInt595 = -1646192771;
	boolean[] aBooleanArray596;
	Class435 aClass435_597;
	boolean aBoolean598;
	Class_na aClass_na599;
	boolean aBoolean600;
	int anInt601;
	ClickableGeometry aClickableGeometry_602;
	byte aByte603;

	public void method697(int i, int i_0_) {
		try {
			((Class60) this).aBoolean592 = true;
			method704(false, i, 1, -933534749);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.a(").append(')').toString());
		}
	}

	void method698(Class435 class435, int i) {
		try {
			((Class60) this).aClass435_597 = class435;
			((Class60) this).aModelPart_584 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.b(").append(')').toString());
		}
	}

	int method699(int i) {
		try {
			return -method705(-46753485);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.p(").append(')').toString());
		}
	}

	final ModelPart method700(GraphicsToolkit class_ra, int i, boolean bool, boolean bool_1_, byte i_2_) {
		try {
			LocType class432 = (((Class60) this).aClass433_585.list(1686561661 * ((Class60) this).anInt601));
			if (class432.anIntArray5366 != null)
				class432 = class432.method5777((0 == 1596783995 * GameClient.cutsceneStage ? (Interface23) (Class87.anInterface23_796) : Class128.aClass148_6331), 1333630702);
			if (class432 == null) {
				method707(class_ra, -475225909);
				((Class60) this).anInt595 = -1646192771;
				return null;
			}
			if (!((Class60) this).aBoolean592 && (-72440277 * ((Class60) this).anInt595 != class432.id * 1181652947)) {
				method704(true, -1, 0, 2114520079);
				((Class60) this).aBoolean600 = false;
				((Class60) this).aModelPart_584 = null;
			}
			method703(((Class60) this).aClass365_Sub1_587, 1121645041);
			if (bool_1_)
				bool_1_ = bool_1_ & (((Class60) this).aBoolean598 & !((Class60) this).aBoolean600 & GraphicsSetup.clientPreferences.sceneryShadowPreference.getValue(-896655100) != 0);
			if (bool && !bool_1_) {
				((Class60) this).anInt595 = -722933511 * class432.id;
				return null;
			}
			SceneObjectPosition sceneObjectPosition = (((Class60) this).aClass365_Sub1_587.method4337().aSceneObjectPosition_2599);
			SceneGraph sceneGraph = GameClient.map.method2675(-1611682495);
			if (bool_1_) {
				sceneGraph.method4047(((Class60) this).aClass_na599, ((Class60) this).aByte588, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, ((Class60) this).aBooleanArray596, 528677416);
				((Class60) this).aBoolean600 = false;
			}
			Ground ground = sceneGraph.aGroundArray3517[((Class60) this).aByte588];
			Ground ground_3_;
			if (((Class60) this).aBoolean591)
				ground_3_ = sceneGraph.aGroundArray3519[0];
			else
				ground_3_ = (((Class60) this).aByte588 < 3 ? (sceneGraph.aGroundArray3517[1 + ((Class60) this).aByte588]) : null);
			ModelPart modelPart = null;
			if (((Class60) this).aAnimator_593.method5819((byte) -82)) {
				if (bool_1_)
					i |= 0x40000;
				modelPart = (class432.method5774(class_ra, i, (11 != ((Class60) this).anInt589 * -1598457753 ? -1598457753 * ((Class60) this).anInt589 : 10), (11 == -1598457753 * ((Class60) this).anInt589 ? 4 + ((Class60) this).anInt590 * 748228569 : 748228569 * ((Class60) this).anInt590), ground, ground_3_, (int) sceneObjectPosition.x, ground.method6340((int) sceneObjectPosition.x, (int) sceneObjectPosition.z, -1408801129), (int) sceneObjectPosition.z, ((Class60) this).aAnimator_593, ((Class60) this).aClass435_597, (byte) 18));
				if (null != modelPart) {
					if (bool_1_) {
						if (null == ((Class60) this).aBooleanArray596)
							((Class60) this).aBooleanArray596 = new boolean[4];
						((Class60) this).aClass_na599 = modelPart.ga(((Class60) this).aClass_na599);
						sceneGraph.method4055(((Class60) this).aClass_na599, ((Class60) this).aByte588, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, ((Class60) this).aBooleanArray596, -1719073428);
						((Class60) this).aBoolean600 = true;
					}
					((Class60) this).anInt586 = modelPart.YA() * -1931353415;
					modelPart.n();
				} else {
					((Class60) this).aBooleanArray596 = null;
					((Class60) this).aClass_na599 = null;
					((Class60) this).anInt586 = 0;
				}
				((Class60) this).aModelPart_584 = null;
			} else if (((Class60) this).aModelPart_584 == null || (((Class60) this).aModelPart_584.m() & i) != i || (-72440277 * ((Class60) this).anInt595 != 1181652947 * class432.id)) {
				if (((Class60) this).aModelPart_584 != null)
					i |= ((Class60) this).aModelPart_584.m();
				Class454 class454 = (class432.method5785(class_ra, i, (((Class60) this).anInt589 * -1598457753 != 11 ? -1598457753 * ((Class60) this).anInt589 : 10), (11 == ((Class60) this).anInt589 * -1598457753 ? 748228569 * ((Class60) this).anInt590 + 4 : 748228569 * ((Class60) this).anInt590), ground, ground_3_, (int) sceneObjectPosition.x, ground.method6340((int) sceneObjectPosition.x, (int) sceneObjectPosition.z, -1367024792), (int) sceneObjectPosition.z, bool_1_, ((Class60) this).aClass435_597, -105046202));
				if (class454 != null) {
					((Class60) this).aModelPart_584 = modelPart = (ModelPart) class454.anObject5645;
					if (bool_1_) {
						((Class60) this).aClass_na599 = (Class_na) class454.anObject5646;
						((Class60) this).aBooleanArray596 = null;
						sceneGraph.method4055(((Class60) this).aClass_na599, ((Class60) this).aByte588, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, null, -1920595487);
						((Class60) this).aBoolean600 = true;
					}
					((Class60) this).anInt586 = modelPart.YA() * -1931353415;
					modelPart.n();
				} else {
					((Class60) this).aBooleanArray596 = null;
					((Class60) this).aClass_na599 = null;
					((Class60) this).aModelPart_584 = null;
					((Class60) this).anInt586 = 0;
				}
			} else
				modelPart = ((Class60) this).aModelPart_584;
			((Class60) this).anInt595 = class432.id * -722933511;
			return modelPart;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.i(").append(')').toString());
		}
	}

	void method701(GraphicsToolkit class_ra, ModelPart modelPart, Matrix43f class222, int i, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_) {
		try {
			Class85[] class85s = modelPart.method4781();
			MagnetConfig[] magnetConfigs = modelPart.method4728();
			if ((((Class60) this).aClickableGeometry_602 == null || ((Class60) this).aClickableGeometry_602.aBoolean3772) && (null != class85s || magnetConfigs != null)) {
				LocType class432 = (((Class60) this).aClass433_585.list(1686561661 * ((Class60) this).anInt601));
				if (class432.anIntArray5366 != null)
					class432 = (class432.method5777((GameClient.cutsceneStage * 1596783995 == 0 ? (Interface23) Class87.anInterface23_796 : Class128.aClass148_6331), 1897177328));
				if (null != class432)
					((Class60) this).aClickableGeometry_602 = ClickableGeometry.method4232(GameClient.anInt8884 * 443738891, true);
			}
			if (null != ((Class60) this).aClickableGeometry_602) {
				modelPart.method4786(class222);
				if (bool)
					((Class60) this).aClickableGeometry_602.method4231(class_ra, (long) (GameClient.anInt8884 * 443738891), class85s, magnetConfigs, false);
				else
					((Class60) this).aClickableGeometry_602.method4233((long) (443738891 * GameClient.anInt8884));
				((Class60) this).aClickableGeometry_602.method4227((((Class60) this).aByte603), i, i_4_, i_5_, i_6_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.k(").append(')').toString());
		}
	}

	void method702(GraphicsToolkit class_ra, int i) {
		try {
			method700(class_ra, 262144, true, true, (byte) 2);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.u(").append(')').toString());
		}
	}

	Class60(GraphicsToolkit class_ra, ObjectTypeList class433, LocType class432, int i, int i_8_, int i_9_, int i_10_, Class365_Sub1 class365_sub1, boolean bool, int i_11_) {
		((Class60) this).anInt586 = 0;
		((Class60) this).aBoolean592 = false;
		((Class60) this).aBoolean600 = false;
		((Class60) this).aClass433_585 = class433;
		((Class60) this).anInt601 = -2096584305 * class432.id;
		((Class60) this).anInt589 = -1523702953 * i;
		((Class60) this).anInt590 = i_8_ * -1809022871;
		((Class60) this).aClass365_Sub1_587 = class365_sub1;
		((Class60) this).aBoolean592 = -1 != i_11_;
		((Class60) this).aByte603 = (byte) i_9_;
		((Class60) this).aByte588 = (byte) i_10_;
		((Class60) this).aBoolean591 = bool;
		((Class60) this).aBoolean598 = (class_ra.method5082() && class432.aBoolean5433 && !((Class60) this).aBoolean591);
		((Class60) this).aAnimator_593 = new Animator_Sub2(class365_sub1, false);
		method704(false, i_11_, 1, 126217673);
	}

	void method703(Class365_Sub1 class365_sub1, int i) {
		try {
			if (((Class60) this).aAnimator_593.method5819((byte) -77)) {
				if (((Class60) this).aAnimator_593.method5822((GameClient.anInt8884 * 443738891 - -735091231 * ((Class60) this).anInt594), 1976097000)) {
					if (GraphicsSetup.clientPreferences.sceneryShadowPreference.getValue(-184271029) == 2)
						((Class60) this).aBoolean600 = false;
					if (((Class60) this).aAnimator_593.method5832(-1768742219)) {
						((Class60) this).aAnimator_593.method5821(-1, -1793536388);
						((Class60) this).aBoolean592 = false;
						method704(false, -1, 0, 66091574);
					}
				}
			} else
				method704(false, -1, 0, 2063242000);
			((Class60) this).anInt594 = -803072405 * GameClient.anInt8884;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.r(").append(')').toString());
		}
	}

	void method704(boolean bool, int i, int i_12_, int i_13_) {
		try {
			int i_14_ = i;
			boolean bool_15_ = false;
			if (i_14_ == -1) {
				LocType class432 = (((Class60) this).aClass433_585.list(((Class60) this).anInt601 * 1686561661));
				LocType class432_16_ = class432;
				if (class432.anIntArray5366 != null)
					class432 = (class432.method5777((1596783995 * GameClient.cutsceneStage == 0 ? (Interface23) Class87.anInterface23_796 : Class128.aClass148_6331), 1802349433));
				if (class432 == null)
					return;
				if (class432 == class432_16_)
					class432_16_ = null;
				if (class432.method5779(934270378)) {
					if (bool && ((Class60) this).aAnimator_593.method5819((byte) -5) && class432.method5773(((Class60) this).aAnimator_593.method5823(2076230166), 1402053046))
						return;
					if (1181652947 * class432.id != -72440277 * ((Class60) this).anInt595)
						bool_15_ = class432.aBoolean5431;
					i_14_ = class432.method5781((byte) 14);
					if (class432.method5780(-1966445745))
						i_12_ = 0;
					else
						i_12_ = 1;
				} else if (null != class432_16_ && class432_16_.method5779(934270378)) {
					if (bool && ((Class60) this).aAnimator_593.method5819((byte) -12) && class432_16_.method5773(((Class60) this).aAnimator_593.method5823(1572334487), 1867786247))
						return;
					if (((Class60) this).anInt595 * -72440277 != 1181652947 * class432.id)
						bool_15_ = class432_16_.aBoolean5431;
					i_14_ = class432_16_.method5781((byte) 14);
					if (class432_16_.method5780(-1966445745))
						i_12_ = 0;
					else
						i_12_ = 1;
				}
			}
			if (i_14_ == -1)
				((Class60) this).aAnimator_593.method5843(-1, false, 79187064);
			else {
				((Class60) this).aAnimator_593.method5824(i_14_, 0, i_12_, bool_15_, (byte) 0);
				((Class60) this).anInt594 = GameClient.anInt8884 * -803072405;
				((Class60) this).aBoolean600 = false;
				((Class60) this).aModelPart_584 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.q(").append(')').toString());
		}
	}

	int method705(int i) {
		try {
			return -60718199 * ((Class60) this).anInt586;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.f(").append(')').toString());
		}
	}

	boolean method706(int i) {
		try {
			return ((Class60) this).aBoolean598;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.d(").append(')').toString());
		}
	}

	void method707(GraphicsToolkit class_ra, int i) {
		try {
			if (null != ((Class60) this).aClass_na599) {
				SceneObjectPosition sceneObjectPosition = (((Class60) this).aClass365_Sub1_587.method4337().aSceneObjectPosition_2599);
				GameClient.map.method2675(-1611682495).method4047(((Class60) this).aClass_na599, ((Class60) this).aByte588, (int) sceneObjectPosition.x, (int) sceneObjectPosition.z, ((Class60) this).aBooleanArray596, 677085165);
				((Class60) this).aBooleanArray596 = null;
				((Class60) this).aClass_na599 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.x(").append(')').toString());
		}
	}

	static final void method708(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_17_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_18_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			if (i_18_ == -1)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = GraphicsToolkit.aClass256_5315.method2441(i_17_, 2082342727).method3431((char) i_18_, 166344309);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.acw(").append(')').toString());
		}
	}

	public static void method709(Class502 class502, int i, int i_19_, Interface3 interface3, int i_20_) {
		try {
			ClientScript2 class403 = Class211.method1950(407967339);
			((ClientScript2) class403).anInterface3_5233 = interface3;
			SubIncommingPacket.method1925(class502, i, i_19_, class403, 536465062);
			((ClientScript2) class403).anInterface3_5233 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.u(").append(')').toString());
		}
	}

	public static void method710(boolean bool, int i) {
		try {
			if (null == Class288_Sub1.aClass219_7147)
				GraphicsToolkit.method5191(-1748236923);
			if (bool)
				Class288_Sub1.aClass219_7147.method2037((byte) -102);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.b(").append(')').toString());
		}
	}

	static final void method711(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Js5Archive.method1235(class105, class403, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.qo(").append(')').toString());
		}
	}

	static final void method712(ClientScript2 class403, short i) {
		try {
			int i_21_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_21_).anInt5720) * 1764050979;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.aby(").append(')').toString());
		}
	}

	static final void method713(ClientScript2 class403, byte i) {
		try {
			if (GameClient.aString8804 != null)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1801543887 * Class489.anInt6071;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.wx(").append(')').toString());
		}
	}

	static final void method714(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_22_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			short i_23_ = (short) (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			short i_24_ = (short) (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]);
			if (i_22_ >= 0 && i_22_ < 5) {
				class105.method1126(i_22_, i_23_, i_24_, -162772929);
				LocalizedString.markComponentForRedraw(class105, -882757286);
				if (class105.component * -1309843523 == -1 && !RSInterface.aBoolean1403)
					Class440.method5862(class105.interfacehash * -440872681, i_22_, 227307662);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ck.gv(").append(')').toString());
		}
	}
}
