/* WorldTile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class WorldTile {
	public int x;
	public int y;
	public int plane;
	public static Js5 js5_models;

	public WorldTile(int i, int i_0_, int i_1_) {
		plane = i * 1306643131;
		x = i_0_ * 2061281455;
		y = 1901982267 * i_1_;
	}

	public WorldTile(int i) {
		if (-1 == i)
			plane = -1306643131;
		else {
			plane = (i >> 28 & 0x3) * 1306643131;
			x = (i >> 14 & 0x3fff) * 2061281455;
			y = (i & 0x3fff) * 1901982267;
		}
	}

	public String toString() {
		try {
			return plane * 1008331379 + "," + (-1760580017 * x >> 6) + "," + (283514611 * y >> 6) + "," + (-1760580017 * x & 0x3f) + "," + (283514611 * y & 0x3f);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "of.toString(" + ')');
		}
	}

	public WorldTile() {
		plane = -1306643131;
	}

	static final void method4137(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) -13);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -749038817 * class105.anInt1155;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "of.qq(" + ')');
		}
	}

	static final void method4138(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_3_, (byte) -35);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.transparency * -1993792969;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "of.rl(" + ')');
		}
	}

	static final void method4139(ClientScript2 class403, int i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (GameClient.anInt8942 * 1131012101 == 2 && i_4_ < GameClient.anInt8941 * -1054937867)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = GameClient.aBooleanArray8950[i_4_] ? 1 : 0;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "of.we(" + ')');
		}
	}

	static final void method4140(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_5_ >> 14 & 0x3fff;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "of.tj(" + ')');
		}
	}

	static final void method4141(Entity class365_sub1_sub1_sub2, boolean bool, int i) {
		try {
			BASType class350 = class365_sub1_sub1_sub2.getDefinition(1203863612);
			if (2050671733 * class365_sub1_sub1_sub2.moveQueueSize == 0) {
				class365_sub1_sub1_sub2.anInt10124 = 0;
				SceneGraph.anInt3565 = MovementType.aMovementType_6543.type * -2059464589;
				Class431.anInt6504 = 0;
			} else {
				if (class365_sub1_sub1_sub2.projectileAnimator.method5819((byte) -91) && !class365_sub1_sub1_sub2.projectileAnimator.method5826(-65534)) {
					SeqType class391 = class365_sub1_sub1_sub2.projectileAnimator.method5820(295193907);
					if (class365_sub1_sub1_sub2.anInt10125 * 1888275831 > 0 && 62820525 * class391.anInt4182 == 0) {
						class365_sub1_sub1_sub2.anInt10124 += -248378059;
						SceneGraph.anInt3565 = MovementType.aMovementType_6543.type * -2059464589;
						Class431.anInt6504 = 0;
						return;
					}
					if (1888275831 * class365_sub1_sub1_sub2.anInt10125 <= 0 && 0 == class391.anInt4189 * -882531177) {
						class365_sub1_sub1_sub2.anInt10124 += -248378059;
						SceneGraph.anInt3565 = -2059464589 * MovementType.aMovementType_6543.type;
						Class431.anInt6504 = 0;
						return;
					}
				}
				for (int i_6_ = 0; i_6_ < class365_sub1_sub1_sub2.currentGraphics.length; i_6_++) {
					if ((class365_sub1_sub1_sub2.currentGraphics[i_6_].id) * -967533709 != -1 && class365_sub1_sub1_sub2.currentGraphics[i_6_].aAnimator_569.method5826(-65534)) {
						Class398 class398 = (Class158_Sub1.aSpotAnimTypeList_8568.method4857((class365_sub1_sub1_sub2.currentGraphics[i_6_].id) * -967533709, -1879864965));
						if (class398.aBoolean5215 && class398.anInt5205 * 1505778629 != -1) {
							SeqType class391 = (Class501.aClass395_6122.method4903(1505778629 * class398.anInt5205, (byte) -112));
							if ((class365_sub1_sub1_sub2.anInt10125 * 1888275831) > 0 && class391.anInt4182 * 62820525 == 0) {
								class365_sub1_sub1_sub2.anInt10124 += -248378059;
								SceneGraph.anInt3565 = (-2059464589 * MovementType.aMovementType_6543.type);
								Class431.anInt6504 = 0;
								return;
							}
							if ((class365_sub1_sub1_sub2.anInt10125 * 1888275831) <= 0 && 0 == class391.anInt4189 * -882531177) {
								class365_sub1_sub1_sub2.anInt10124 += -248378059;
								SceneGraph.anInt3565 = (MovementType.aMovementType_6543.type * -2059464589);
								Class431.anInt6504 = 0;
								return;
							}
						}
					}
				}
				SceneObjectPosition sceneObjectPosition = SceneObjectPosition.method2005(class365_sub1_sub1_sub2.method4337().aSceneObjectPosition_2599);
				int i_7_ = (int) sceneObjectPosition.x;
				int i_8_ = (int) sceneObjectPosition.z;
				int i_9_ = (((class365_sub1_sub1_sub2.scenePositionXQueue[class365_sub1_sub1_sub2.moveQueueSize * 2050671733 - 1]) * 512) + class365_sub1_sub1_sub2.getSize() * 256);
				int i_10_ = (((class365_sub1_sub1_sub2.scenePositionYQueue[class365_sub1_sub1_sub2.moveQueueSize * 2050671733 - 1]) * 512) + class365_sub1_sub1_sub2.getSize() * 256);
				if (i_7_ < i_9_) {
					if (i_8_ < i_10_)
						class365_sub1_sub1_sub2.method4414(10240, (byte) 1);
					else if (i_8_ > i_10_)
						class365_sub1_sub1_sub2.method4414(14336, (byte) 1);
					else
						class365_sub1_sub1_sub2.method4414(12288, (byte) 1);
				} else if (i_7_ > i_9_) {
					if (i_8_ < i_10_)
						class365_sub1_sub1_sub2.method4414(6144, (byte) 1);
					else if (i_8_ > i_10_)
						class365_sub1_sub1_sub2.method4414(2048, (byte) 1);
					else
						class365_sub1_sub1_sub2.method4414(4096, (byte) 1);
				} else if (i_8_ < i_10_)
					class365_sub1_sub1_sub2.method4414(8192, (byte) 1);
				else if (i_8_ > i_10_)
					class365_sub1_sub1_sub2.method4414(0, (byte) 1);
				int i_11_ = (class365_sub1_sub1_sub2.moveDir[2050671733 * class365_sub1_sub1_sub2.moveQueueSize - 1]);
				if (!bool && (i_9_ - i_7_ > 1024 || i_9_ - i_7_ < -1024 || i_10_ - i_8_ > 1024 || i_10_ - i_8_ < -1024)) {
					class365_sub1_sub1_sub2.method4341((float) i_9_, sceneObjectPosition.y, (float) i_10_);
					class365_sub1_sub1_sub2.method4415(class365_sub1_sub1_sub2.heading * 2145248039, false, 688514105);
					class365_sub1_sub1_sub2.moveQueueSize -= -1013322787;
					if (1888275831 * class365_sub1_sub1_sub2.anInt10125 > 0)
						class365_sub1_sub1_sub2.anInt10125 -= -1479140281;
					SceneGraph.anInt3565 = -2059464589 * MovementType.aMovementType_6543.type;
					Class431.anInt6504 = 0;
					sceneObjectPosition.method2006();
				} else {
					int i_12_ = 16;
					boolean bool_13_ = true;
					if (class365_sub1_sub1_sub2 instanceof NPC)
						bool_13_ = (((NPC) class365_sub1_sub1_sub2).definition.aBoolean6164);
					if (bool_13_) {
						int i_14_ = (2145248039 * class365_sub1_sub1_sub2.heading - (class365_sub1_sub1_sub2.primaryAnim.anInt4144) * 259411823);
						if (0 != i_14_ && (class365_sub1_sub1_sub2.anInt10090 * 1433412323 == -1) && 0 != (class365_sub1_sub1_sub2.anInt10115 * 907865649))
							i_12_ = 8;
						if (!bool && (2050671733 * class365_sub1_sub1_sub2.moveQueueSize > 2))
							i_12_ = 24;
						if (!bool && (class365_sub1_sub1_sub2.moveQueueSize * 2050671733 > 3))
							i_12_ = 32;
					} else {
						if (!bool && (class365_sub1_sub1_sub2.moveQueueSize * 2050671733 > 1))
							i_12_ = 24;
						if (!bool && (2050671733 * class365_sub1_sub1_sub2.moveQueueSize > 2))
							i_12_ = 32;
					}
					if (-1531994851 * class365_sub1_sub1_sub2.anInt10124 > 0 && (2050671733 * class365_sub1_sub1_sub2.moveQueueSize > 1)) {
						i_12_ = 32;
						class365_sub1_sub1_sub2.anInt10124 -= -248378059;
					}
					if (i_11_ == MovementType.aMovementType_6541.type)
						i_12_ <<= 1;
					else if (i_11_ == MovementType.aMovementType_6545.type)
						i_12_ >>= 1;
					if (-1 != 1830307505 * class350.anInt3752) {
						i_12_ <<= 9;
						if (class365_sub1_sub1_sub2.moveQueueSize * 2050671733 == 1) {
							int i_15_ = (class365_sub1_sub1_sub2.anInt10126 * -1520103925 * (-1520103925 * class365_sub1_sub1_sub2.anInt10126));
							int i_16_ = (((int) sceneObjectPosition.x > i_9_ ? (int) sceneObjectPosition.x - i_9_ : i_9_ - (int) sceneObjectPosition.x) << 9);
							int i_17_ = (((int) sceneObjectPosition.z > i_10_ ? (int) sceneObjectPosition.z - i_10_ : i_10_ - (int) sceneObjectPosition.z) << 9);
							int i_18_ = i_16_ > i_17_ ? i_16_ : i_17_;
							int i_19_ = -634352286 * class350.anInt3752 * i_18_;
							if (i_15_ > i_19_) {
								Entity class365_sub1_sub1_sub2_20_;
								(class365_sub1_sub1_sub2_20_ = class365_sub1_sub1_sub2).anInt10126 = (-1520103925 * class365_sub1_sub1_sub2_20_.anInt10126 / 2 * 121933219);
							} else if (i_15_ / 2 > i_18_) {
								class365_sub1_sub1_sub2.anInt10126 -= class350.anInt3752 * 1936228275;
								if ((-1520103925 * class365_sub1_sub1_sub2.anInt10126) < 0)
									class365_sub1_sub1_sub2.anInt10126 = 0;
							} else if ((class365_sub1_sub1_sub2.anInt10126 * -1520103925) < i_12_) {
								class365_sub1_sub1_sub2.anInt10126 += 1936228275 * class350.anInt3752;
								if ((class365_sub1_sub1_sub2.anInt10126 * -1520103925) > i_12_)
									class365_sub1_sub1_sub2.anInt10126 = 121933219 * i_12_;
							}
						} else if ((-1520103925 * class365_sub1_sub1_sub2.anInt10126) < i_12_) {
							class365_sub1_sub1_sub2.anInt10126 += class350.anInt3752 * 1936228275;
							if ((class365_sub1_sub1_sub2.anInt10126 * -1520103925) > i_12_)
								class365_sub1_sub1_sub2.anInt10126 = i_12_ * 121933219;
						} else if ((class365_sub1_sub1_sub2.anInt10126 * -1520103925) > 0) {
							class365_sub1_sub1_sub2.anInt10126 -= 1936228275 * class350.anInt3752;
							if ((class365_sub1_sub1_sub2.anInt10126 * -1520103925) < 0)
								class365_sub1_sub1_sub2.anInt10126 = 0;
						}
						i_12_ = (-1520103925 * class365_sub1_sub1_sub2.anInt10126 >> 9);
						if (i_12_ < 1)
							i_12_ = 1;
					}
					Class431.anInt6504 = 0;
					if (i_9_ != i_7_ || i_10_ != i_8_) {
						if (i_7_ < i_9_) {
							sceneObjectPosition.x += (float) i_12_;
							Class431.anInt6504 = 1633205647 * (Class431.anInt6504 * 236175727 | 0x4);
							if (sceneObjectPosition.x > (float) i_9_)
								sceneObjectPosition.x = (float) i_9_;
						} else if (i_7_ > i_9_) {
							sceneObjectPosition.x -= (float) i_12_;
							Class431.anInt6504 = ((Class431.anInt6504 * 236175727 | 0x8) * 1633205647);
							if (sceneObjectPosition.x < (float) i_9_)
								sceneObjectPosition.x = (float) i_9_;
						}
						if (i_8_ < i_10_) {
							sceneObjectPosition.z += (float) i_12_;
							Class431.anInt6504 = 1633205647 * (236175727 * Class431.anInt6504 | 0x1);
							if (sceneObjectPosition.z > (float) i_10_)
								sceneObjectPosition.z = (float) i_10_;
						} else if (i_8_ > i_10_) {
							sceneObjectPosition.z -= (float) i_12_;
							Class431.anInt6504 = 1633205647 * (Class431.anInt6504 * 236175727 | 0x2);
							if (sceneObjectPosition.z < (float) i_10_)
								sceneObjectPosition.z = (float) i_10_;
						}
						class365_sub1_sub1_sub2.method4340(sceneObjectPosition);
						if (i_12_ >= 32)
							SceneGraph.anInt3565 = (MovementType.aMovementType_6541.type * -2059464589);
						else
							SceneGraph.anInt3565 = -2059464589 * i_11_;
					} else
						SceneGraph.anInt3565 = MovementType.aMovementType_6543.type * -2059464589;
					if ((int) sceneObjectPosition.x == i_9_ && (int) sceneObjectPosition.z == i_10_) {
						class365_sub1_sub1_sub2.moveQueueSize -= -1013322787;
						if (1888275831 * class365_sub1_sub1_sub2.anInt10125 > 0)
							class365_sub1_sub1_sub2.anInt10125 -= -1479140281;
					}
					sceneObjectPosition.method2006();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "of.hy(" + ')');
		}
	}

	static void method4142(int i, int i_21_, IComponentDefinition class105, int i_22_) {
		try {
			int i_23_ = class105.width * -2093041337 + i;
			int i_24_ = 15 + i_21_;
			if (GameClient.showingFPS) {
				int i_25_ = -256;
				if (914379507 * GameClient.anInt6467 < 20)
					i_25_ = -65536;
				Class343.aClass264_3673.method2474("Fps:" + 914379507 * GameClient.anInt6467, i_23_, i_24_, i_25_, -1, (byte) -7);
				i_24_ += 15;
				Runtime runtime = Runtime.getRuntime();
				long l = runtime.totalMemory() / 1024L;
				long l_26_ = l - runtime.freeMemory() / 1024L;
				int i_27_ = -256;
				if (l_26_ > 262144L)
					i_27_ = -65536;
				Class343.aClass264_3673.method2474("Mem:" + l_26_ + "/" + l + "k", i_23_, i_24_, i_27_, -1, (byte) -69);
				i_24_ += 15;
				long l_28_ = ((Class25) GameClient.gameConnection).aClass124_340.method1384(1026179047);
				String string = "N/A";
				if (-1L != l_28_) {
					string = l_28_ + "ms";
					if (l_28_ > 500L)
						string = Class285.method2709(16711680, -2018696638) + string + Class285.method2709(16776960, -1609373980);
				}
				Class343.aClass264_3673.method2474("Game: In:" + -1705791507 * ((Class25) GameClient.gameConnection).anInt343 + "drawFilledBox/s " + "Out:" + ((Class25) GameClient.gameConnection).anInt327 * 1114720205 + "drawFilledBox/s " + "Ping:" + string, i_23_, i_24_, -256, -1, (byte) -47);
				i_24_ += 15;
				long l_29_ = ((Class25) GameClient.aClass25_8693).aClass124_340.method1384(529918549);
				String string_30_ = "N/A";
				if (l_29_ != -1L) {
					string_30_ = l_29_ + "ms";
					if (l_29_ > 500L)
						string_30_ = Class285.method2709(16711680, -2004094405) + string_30_ + Class285.method2709(16776960, -1875733087);
				}
				Class343.aClass264_3673.method2474("Lobby: In:" + ((Class25) GameClient.aClass25_8693).anInt343 * -1705791507 + "drawFilledBox/s " + "Out:" + 1114720205 * ((Class25) GameClient.aClass25_8693).anInt327 + "drawFilledBox/s " + "Ping:" + string_30_, i_23_, i_24_, -256, -1, (byte) -30);
				i_24_ += 15;
				int i_31_ = OverlayType.activeToolkit.za() / 1024;
				Class343.aClass264_3673.method2474("Offheap:" + i_31_ + "k", i_23_, i_24_, (i_31_ > 65536 ? -65536 : -256), -1, (byte) -50);
				i_24_ += 15;
				int i_32_ = 0;
				int i_33_ = 0;
				int i_34_ = 0;
				for (int i_35_ = 0; i_35_ < OverlayType.aChecksumTableEntryArray4072.length; i_35_++) {
					if (OverlayType.aChecksumTableEntryArray4072[i_35_] == null) {
						if (i_22_ == -1583970959)
							return;
					} else {
						i_32_ += OverlayType.aChecksumTableEntryArray4072[i_35_].method2279(-2104328128);
						i_33_ += OverlayType.aChecksumTableEntryArray4072[i_35_].method2274((byte) 1);
						i_34_ += OverlayType.aChecksumTableEntryArray4072[i_35_].method2275(-856500842);
					}
				}
				int i_36_ = i_34_ * 100 / i_32_;
				int i_37_ = 10000 * i_33_ / i_32_;
				String string_38_ = "Cache:" + Class300.method3685((long) i_37_, 2, true, Language.aLanguage_6624, (short) -6940) + "% (" + i_36_ + "%)";
				ScriptContext.aClass264_7534.method2474(string_38_, i_23_, i_24_, -256, -1, (byte) -26);
				i_24_ += 12;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "of.km(" + ')');
		}
	}

	static void method4143(Js5 class243, int i, int i_39_, int i_40_, boolean bool, long l, int i_41_, int i_42_) {
		try {
			Class79.anInt734 = -1262101671;
			Class79.aClass243_744 = class243;
			Class79.anInt745 = i * -407545223;
			Class79.anInt746 = i_39_ * -956029523;
			Class79.aClass298_Sub19_Sub1_748 = null;
			Class79.anInt739 = -2102749749 * i_40_;
			DevConsoleState.aBoolean114 = bool;
			Class298_Sub24_Sub1.anInt9276 = 1446879088;
			Class515.aLong6233 = l * 7092526387081397629L;
			ReferenceTable.anInt6559 = -420794947 * i_41_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "of.i(" + ')');
		}
	}

	public static void method4144(int i, int i_43_, int i_44_, int i_45_, short i_46_) {
		try {
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aLinkedNodeList_7421.method5939(1766612795)); class298_sub41 != null; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aLinkedNodeList_7421.method5944(49146)))
				Class461.method5989(class298_sub41, i, i_43_, i_44_, i_45_, -409300106);
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aLinkedNodeList_7455.method5939(1766612795)); null != class298_sub41; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aLinkedNodeList_7455.method5944(49146))) {
				int i_47_ = 1;
				BASType class350 = ((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.getDefinition(-1185806146);
				int i_48_ = ((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.spotAnimAnimator.method5823(1961619021);
				if (-1 == i_48_ || (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.outlineDirty))
					i_47_ = 0;
				else if (230243963 * class350.anInt3721 == i_48_ || class350.anInt3749 * 491753731 == i_48_ || -783166629 * class350.anInt3724 == i_48_ || i_48_ == class350.anInt3746 * -2054940183)
					i_47_ = 2;
				else if (328817727 * class350.anInt3755 == i_48_ || -1238642279 * class350.anInt3722 == i_48_ || class350.anInt3728 * 124010991 == i_48_ || -907666203 * class350.anInt3727 == i_48_)
					i_47_ = 3;
				if (i_47_ != (974385733 * ((Class298_Sub41) class298_sub41).anInt7439)) {
					int i_49_ = (Class125.method1398((((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433), 2092032929));
					NPCType class503 = (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.definition);
					if (class503.anIntArray6188 != null)
						class503 = class503.method6240(Class128.aClass148_6331, 2075279963);
					if (null == class503 || -1 == i_49_) {
						((Class298_Sub41) class298_sub41).anInt7443 = -502744039;
						((Class298_Sub41) class298_sub41).aBoolean7444 = false;
						((Class298_Sub41) class298_sub41).anInt7439 = i_47_ * 636899469;
					} else if (i_49_ != 391847895 * ((Class298_Sub41) class298_sub41).anInt7443 || (((Class298_Sub41) class298_sub41).aBoolean7444) != class503.aBoolean6180) {
						boolean bool = false;
						if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447) != null) {
							((Class298_Sub41) class298_sub41).anInt7449 -= 584623616;
							if ((43235291 * ((Class298_Sub41) class298_sub41).anInt7449) <= 0) {
								Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
								((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
								bool = true;
							}
						} else
							bool = true;
						if (bool) {
							((Class298_Sub41) class298_sub41).anInt7449 = -1283486135 * class503.anInt6179;
							((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7446 = null;
							((Class298_Sub41) class298_sub41).aClass298_Sub23_7445 = null;
							((Class298_Sub41) class298_sub41).anInt7443 = 502744039 * i_49_;
							((Class298_Sub41) class298_sub41).aBoolean7444 = class503.aBoolean6180;
							((Class298_Sub41) class298_sub41).anInt7439 = 636899469 * i_47_;
						}
					} else {
						((Class298_Sub41) class298_sub41).anInt7439 = 636899469 * i_47_;
						((Class298_Sub41) class298_sub41).anInt7449 = class503.anInt6179 * -1283486135;
					}
				}
				SceneObjectPosition sceneObjectPosition = (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.method4337().aSceneObjectPosition_2599);
				((Class298_Sub41) class298_sub41).anInt7425 = -7217919 * (int) sceneObjectPosition.x;
				((Class298_Sub41) class298_sub41).anInt7427 = ((int) sceneObjectPosition.x + (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.getSize() << 8)) * 305826635;
				((Class298_Sub41) class298_sub41).anInt7423 = 584186023 * (int) sceneObjectPosition.z;
				((Class298_Sub41) class298_sub41).anInt7428 = ((int) sceneObjectPosition.z + (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.getSize() << 8)) * -1647445571;
				((Class298_Sub41) class298_sub41).anInt7424 = ((((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433.plane) * 2135210127);
				Class461.method5989(class298_sub41, i, i_43_, i_44_, i_45_, -409300106);
			}
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass437_7440.method5816(2005558160)); class298_sub41 != null; class298_sub41 = (Class298_Sub41) Class298_Sub41.aClass437_7440.method5815((byte) -39)) {
				int i_50_ = 1;
				BASType class350 = ((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.getDefinition(1149258153);
				int i_51_ = ((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.spotAnimAnimator.method5823(1924378402);
				if (-1 == i_51_ || (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.outlineDirty))
					i_50_ = 0;
				else if (i_51_ == 230243963 * class350.anInt3721 || i_51_ == 491753731 * class350.anInt3749 || i_51_ == class350.anInt3724 * -783166629 || i_51_ == -2054940183 * class350.anInt3746)
					i_50_ = 2;
				else if (class350.anInt3755 * 328817727 == i_51_ || i_51_ == -1238642279 * class350.anInt3722 || 124010991 * class350.anInt3728 == i_51_ || i_51_ == class350.anInt3727 * -907666203)
					i_50_ = 3;
				if (i_50_ != (((Class298_Sub41) class298_sub41).anInt7439 * 974385733)) {
					int i_52_ = (FloTypeList.method4652((((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434), 2117239368));
					if (i_52_ != (((Class298_Sub41) class298_sub41).anInt7443 * 391847895) || (((Class298_Sub41) class298_sub41).aBoolean7444 != (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.isMale))) {
						boolean bool = false;
						if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447) != null) {
							((Class298_Sub41) class298_sub41).anInt7449 -= 584623616;
							if ((43235291 * ((Class298_Sub41) class298_sub41).anInt7449) <= 0) {
								Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
								((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
								bool = true;
							}
						} else
							bool = true;
						if (bool) {
							((Class298_Sub41) class298_sub41).anInt7449 = (-1138033583 * (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.turnRightAnimation));
							((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7446 = null;
							((Class298_Sub41) class298_sub41).aClass298_Sub23_7445 = null;
							((Class298_Sub41) class298_sub41).anInt7443 = i_52_ * 502744039;
							((Class298_Sub41) class298_sub41).aBoolean7444 = (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.isMale);
							((Class298_Sub41) class298_sub41).anInt7439 = i_50_ * 636899469;
						}
					} else {
						((Class298_Sub41) class298_sub41).anInt7449 = (-1138033583 * (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.turnRightAnimation));
						((Class298_Sub41) class298_sub41).anInt7439 = i_50_ * 636899469;
					}
				}
				SceneObjectPosition sceneObjectPosition = (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.method4337().aSceneObjectPosition_2599);
				((Class298_Sub41) class298_sub41).anInt7425 = -7217919 * (int) sceneObjectPosition.x;
				((Class298_Sub41) class298_sub41).anInt7427 = ((int) sceneObjectPosition.x + (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.getSize() << 8)) * 305826635;
				((Class298_Sub41) class298_sub41).anInt7423 = 584186023 * (int) sceneObjectPosition.z;
				((Class298_Sub41) class298_sub41).anInt7428 = ((int) sceneObjectPosition.z + (((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.getSize() << 8)) * -1647445571;
				((Class298_Sub41) class298_sub41).anInt7424 = ((((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434.plane) * 2135210127);
				Class461.method5989(class298_sub41, i, i_43_, i_44_, i_45_, -409300106);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "of.q(" + ')');
		}
	}

	static final void method4145(ClientScript2 class403, int i) {
		try {
			int i_53_ = (((ClientScript2) class403).integerstack[1883543357 * ((ClientScript2) class403).integerPos]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((Player) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242).hitSplatQueue.method798(i_53_, 1440952834);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "of.ak(" + ')');
		}
	}
}
