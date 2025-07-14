/* WaterDetailPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class WaterDetailPreference extends IntegerPreferenceField {
	static int anInt8376 = 1;
	public static int anInt8377 = 2;
	public static int anInt8378 = 0;

	public WaterDetailPreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public void method5640(int i) {
		try {
			if (-1598873795 * anInt5350 < 0 && anInt5350 * -1598873795 > 2)
				anInt5350 = method5611(1892526868) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adf.s(" + ')');
		}
	}

	public boolean method5641(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adf.z(" + ')');
		}
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	void method5614(int i, int i_0_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adf.p(" + ')');
		}
	}

	public int getValue(int i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adf.y(" + ')');
		}
	}

	public WaterDetailPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	public int method5616(int i) {
		if (i == 0 || aGamePreferences_5346.groundBlendingPreference.method5724(2001855764) == 1)
			return 1;
		return 2;
	}

	int method5615() {
		return 1;
	}

	public int method5612(int i, int i_1_) {
		try {
			if (i == 0 || aGamePreferences_5346.groundBlendingPreference.method5724(544778968) == 1)
				return 1;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adf.f(" + ')');
		}
	}

	int method5611(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adf.a(" + ')');
		}
	}

	static void method5643(IComponentDefinition class105, int i) {
		try {
			if (GameClient.aBoolean8835) {
				if (class105.anObjectArray1247 != null) {
					IComponentDefinition class105_2_ = Class140.method1558(Class379.anInt4099 * 1262526353, 392084321 * GameClient.anInt8836, -156511736);
					if (class105_2_ != null) {
						ScriptContext scriptContext = new ScriptContext();
						scriptContext.source = class105;
						scriptContext.aClass105_7529 = class105_2_;
						scriptContext.arguments = class105.anObjectArray1247;
						ClientBuild.execute(scriptContext, (byte) -24);
					}
				}
				Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.ITEM_ON_ITEM, GameClient.gameConnection.aClass449_330, (byte) 35);
				class298_sub36.buffer.writeShort(-1232467723 * class105.zds3, 16711935);
				class298_sub36.buffer.writeShortLE128(class105.component * -1309843523);
				class298_sub36.buffer.writeInt(Class379.anInt4099 * 1262526353, -935068496);
				class298_sub36.buffer.writeInt(-440872681 * class105.interfacehash, -1060289644);
				class298_sub36.buffer.writeShort(392084321 * GameClient.anInt8836, 16711935);
				class298_sub36.buffer.writeShortLE128(GameClient.c92 * 1408085039);
				GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -64);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adf.kx(" + ')');
		}
	}

	static final void method5644(int i) {
		try {
			for (int i_3_ = Class128.aClass148_6331.method1607(true, -2004625733); i_3_ != -1; i_3_ = Class128.aClass148_6331.method1607(false, -1890624062)) {
				Class477.method6094(i_3_, (byte) -94);
				GameClient.anIntArray8874[((GameClient.anInt8783 += -1763975993) * -1667357449) - 1 & 0x1f] = i_3_;
			}
			for (Class298_Sub37_Sub12 class298_sub37_sub12 = Class97_Sub1.method1045((byte) 12); class298_sub37_sub12 != null; class298_sub37_sub12 = Class97_Sub1.method1045((byte) 12)) {
				int i_4_ = class298_sub37_sub12.method3446(766012260);
				long l = class298_sub37_sub12.method3447(-391880689);
				if (1 == i_4_) {
					Class374.anIntArray4078[(int) l] = 479598359 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610;
					GameClient.aBoolean8736 |= Class254.aBooleanArray2790[(int) l];
					GameClient.anIntArray8876[((GameClient.anInt8877 += 163718667) * 116700579) - 1 & 0x1f] = (int) l;
				} else if (2 == i_4_) {
					ClientScriptsExecutor.aStringArray4126[(int) l] = (((Class298_Sub37_Sub12) class298_sub37_sub12).aString9611);
					GameClient.anIntArray8787[((GameClient.anInt8879 += -646054651) * -466597939) - 1 & 0x1f] = (int) l;
				} else if (i_4_ == 3) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) -62);
					if (!((Class298_Sub37_Sub12) class298_sub37_sub12).aString9611.equals(class105.aString1212)) {
						class105.aString1212 = (((Class298_Sub37_Sub12) class298_sub37_sub12).aString9611);
						LocalizedString.markComponentForRedraw(class105, 753227077);
					}
				} else if (i_4_ == 22) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) -82);
					if (class105.aBoolean1246 != (1 == 479598359 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610)) {
						class105.aBoolean1246 = 1 == (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 479598359;
						LocalizedString.markComponentForRedraw(class105, 130202608);
					}
				} else if (4 == i_4_) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) -20);
					int i_5_ = ((((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 479598359);
					int i_6_ = ((((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608) * -1447843633);
					int i_7_ = -1074324071 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9609;
					if (class105.anInt1184 * 1548853569 != i_5_ || i_6_ != class105.anInt1151 * 572201537 || i_7_ != 1148770405 * class105.anInt1140) {
						class105.anInt1184 = i_5_ * -1530138943;
						class105.anInt1151 = i_6_ * -1825442367;
						class105.anInt1140 = 908204397 * i_7_;
						class105.aClass498_1307 = null;
						LocalizedString.markComponentForRedraw(class105, 422949042);
					}
				} else if (5 == i_4_) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) 56);
					if (class105.anInt1290 * 1347982601 != (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 479598359) {
						if (479598359 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 != -1) {
							if (null == class105.aAnimator_1152)
								class105.aAnimator_1152 = new Animator_Sub1();
							class105.aAnimator_1152.method5821((((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 479598359, -1984687950);
						} else
							class105.aAnimator_1152 = null;
						class105.anInt1290 = (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 1256289055;
						LocalizedString.markComponentForRedraw(class105, -2102110719);
					}
				} else if (6 == i_4_) {
					int i_8_ = ((((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 479598359);
					int i_9_ = i_8_ >> 10 & 0x1f;
					int i_10_ = i_8_ >> 5 & 0x1f;
					int i_11_ = i_8_ & 0x1f;
					int i_12_ = (i_10_ << 11) + (i_9_ << 19) + (i_11_ << 3);
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) -37);
					if (i_12_ != class105.anInt1170 * 1045422783) {
						class105.anInt1170 = -695431873 * i_12_;
						LocalizedString.markComponentForRedraw(class105, -37482416);
					}
				} else if (i_4_ == 7) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) -71);
					boolean bool = 1 == 479598359 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610;
					if (bool != class105.hidden) {
						class105.hidden = bool;
						LocalizedString.markComponentForRedraw(class105, -1924243832);
					}
				} else if (i_4_ == 8) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) 54);
					if ((479598359 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 != class105.anInt1190 * 7329457) || ((((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608) * -1447843633 != class105.anInt1262 * -1086526073) || (-1074324071 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9609 != class105.tempZoomDistance * -261021353)) {
						class105.anInt1190 = (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * -161133497;
						class105.anInt1262 = (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608) * 752254073;
						class105.tempZoomDistance = (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9609) * 1673638543;
						if (-1232467723 * class105.zds3 != -1) {
							if (-692202853 * class105.anInt1221 > 0)
								class105.tempZoomDistance = (class105.tempZoomDistance * 237251296 / (-692202853 * class105.anInt1221) * -1066050969);
							else if (class105.anInt1253 * 1769572195 > 0)
								class105.tempZoomDistance = (class105.tempZoomDistance * 237251296 / (class105.anInt1253 * 1769572195) * -1066050969);
						}
						LocalizedString.markComponentForRedraw(class105, -1617809711);
					}
				} else if (i_4_ == 9) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) 49);
					if (((((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 479598359 != class105.zds3 * -1232467723) || (-1447843633 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608 != -66163287 * class105.anInt1281)) {
						class105.zds3 = (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 1795180635;
						class105.anInt1281 = (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608) * 1181892023;
						LocalizedString.markComponentForRedraw(class105, 748648909);
					}
				} else if (i_4_ == 10) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) 88);
					if ((-407676483 * class105.anInt1297 != (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 479598359) || ((((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608) * -1447843633 != -1523987341 * class105.anInt1248) || (1004185785 * class105.anInt1192 != -1074324071 * (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9609))) {
						class105.anInt1297 = 1482071907 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610;
						class105.anInt1248 = -2128996555 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608;
						class105.anInt1192 = 698346465 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9609;
						LocalizedString.markComponentForRedraw(class105, -875934873);
					}
				} else if (11 == i_4_) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) 37);
					class105.aByte1146 = (byte) 0;
					class105.anInt1143 = ((class105.anInt1286 = 1890691465 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * -1672688609);
					class105.aByte1147 = (byte) 0;
					class105.anInt1155 = (class105.anInt1159 = (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608) * -1822519589) * 705123139;
					LocalizedString.markComponentForRedraw(class105, -429816482);
				} else if (i_4_ == 12) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) 43);
					int i_13_ = 479598359 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610;
					if (null != class105 && 0 == class105.type * -1215239439) {
						if (i_13_ > (class105.anInt1169 * 2053897963 - 457937409 * class105.height))
							i_13_ = (class105.anInt1169 * 2053897963 - 457937409 * class105.height);
						if (i_13_ < 0)
							i_13_ = 0;
						if (class105.anInt1167 * -1424956747 != i_13_) {
							class105.anInt1167 = -1915192419 * i_13_;
							LocalizedString.markComponentForRedraw(class105, -1007823726);
						}
					}
				} else if (i_4_ == 14) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) 63);
					class105.anInt1175 = 947110461 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610;
				} else if (15 == i_4_) {
					Class3.aBoolean63 = true;
					Class3.anInt62 = (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 20118889;
					Class3.anInt54 = (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608) * 1038073637;
				} else if (i_4_ == 16) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) -2);
					class105.anInt1210 = 861383641 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610;
				} else if (i_4_ == 20) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) -1);
					class105.aBoolean1211 = 1 == (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 479598359;
				} else if (21 == i_4_) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) -52);
					class105.clickMask = 1 == 479598359 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610;
				} else if (i_4_ == 17) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) 62);
					class105.anInt1289 = -696165999 * ((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610;
				} else if (i_4_ == 18) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) 3);
					int i_14_ = (int) (l >> 32);
					class105.method1126(i_14_, (short) (479598359 * (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610)), (short) (-1447843633 * (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608)), -1799363747);
				} else if (19 == i_4_) {
					IComponentDefinition class105 = Class50.getIComponentDefinitions((int) l, (byte) -87);
					int i_15_ = (int) (l >> 32);
					class105.method1120(i_15_, (short) ((((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610) * 479598359), (short) (-1447843633 * (((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608)), 571287910);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "adf.gh(" + ')');
		}
	}
}
