/* Class422_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class422_Sub24 extends IntegerPreferenceField {
	public Class422_Sub24(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	int method5616(int i) {
		return 1;
	}

	public void method5712(byte i) {
		try {
			if ((-1598873795 * anInt5350 < ((Class147) Class147.aClass147_1579).anInt1580 * -999577713) || (-1598873795 * anInt5350 > (-999577713 * ((Class147) Class147.aClass147_1577).anInt1580)))
				anInt5350 = method5611(-231178603) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aei.s(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return ((Class147) Class147.aClass147_1579).anInt1580 * -999577713;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aei.a(").append(')').toString());
		}
	}

	int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aei.f(").append(')').toString());
		}
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = i * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aei.p(").append(')').toString());
		}
	}

	public Class422_Sub24(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	int method5615() {
		return ((Class147) Class147.aClass147_1579).anInt1580 * -999577713;
	}

	void method5610(int i) {
		anInt5350 = i * 1886334997;
	}

	public int method5713(byte i) {
		try {
			return -1598873795 * anInt5350;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aei.z(").append(')').toString());
		}
	}

	public static final void method5714(IComponentDefinition[] class105s, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, byte i_9_) {
		try {
			OverlayType.activeToolkit.r(i_2_, i_3_, i_4_, i_5_);
			for (int i_10_ = 0; i_10_ < class105s.length; i_10_++) {
				IComponentDefinition class105 = class105s[i_10_];
				if (class105 == null) {
					if (i_9_ != 0)
						throw new IllegalStateException();
				} else {
					if (1573706803 * class105.parentId != i) {
						if (-1412584499 != i)
							continue;
						if (GameClient.aClass105_8850 != class105) {
							if (i_9_ != 0) {
								/* empty */
							}
							continue;
						}
					}
					int i_11_;
					if (-1 == i_8_) {
						GameClient.aRectangleArray8902[GameClient.anInt8686 * -112139815].setBounds(i_6_ + 1354508417 * class105.anInt1143, i_7_ + class105.anInt1155 * -749038817, class105.width * -2093041337, 457937409 * class105.height);
						i_11_ = ((GameClient.anInt8686 += 1339395689) * -112139815 - 1);
					} else
						i_11_ = i_8_;
					class105.anInt1303 = 1339690151 * i_11_;
					class105.anInt1133 = 488606259 * GameClient.anInt8884;
					if (GameClient.method2802(class105)) {
						if (i_9_ != 0)
							break;
					} else {
						if (class105.contentType * 907611645 != 0)
							Class486.method6154(class105, (byte) -27);
						int i_12_ = i_6_ + class105.anInt1143 * 1354508417;
						int i_13_ = -749038817 * class105.anInt1155 + i_7_;
						int i_14_ = -1993792969 * class105.transparency;
						if (GameClient.aBoolean8846 && ((GameClient.method2801(class105).anInt7416 * -1266165749) != 0 || class105.type * -1215239439 == 0) && i_14_ > 127)
							i_14_ = 127;
						if (GameClient.aClass105_8850 == class105) {
							if (-1412584499 != i && ((-2087469725 * class105.anInt1236 == IComponentDefinition.anInt1206 * 1432814379) || (IComponentDefinition.anInt1266 * 270446479 == class105.anInt1236 * -2087469725) || GameClient.method2801(class105).method3496(-1937782298))) {
								Class83.aClass105Array764 = class105s;
								Class216.anInt6660 = -643239899 * i_6_;
								HashTable.anInt5518 = -882808615 * i_7_;
								continue;
							}
							if (GameClient.aBoolean8863 && GameClient.aBoolean8855) {
								int i_15_ = Class165.recorder.getMouseX((byte) -44);
								int i_16_ = Class165.recorder.getMouseY((byte) -54);
								i_15_ -= -98735103 * GameClient.anInt8734;
								i_16_ -= GameClient.anInt8853 * -938469429;
								if (i_15_ < -343518257 * GameClient.anInt8856)
									i_15_ = -343518257 * GameClient.anInt8856;
								if (-2093041337 * class105.width + i_15_ > (GameClient.anInt8856 * -343518257 + GameClient.anInt8858 * -1221279965))
									i_15_ = (GameClient.anInt8858 * -1221279965 + -343518257 * GameClient.anInt8856 - class105.width * -2093041337);
								if (i_16_ < GameClient.anInt8800 * 1325631359)
									i_16_ = GameClient.anInt8800 * 1325631359;
								if (i_16_ + class105.height * 457937409 > (-609231901 * GameClient.anInt8966 + 1325631359 * GameClient.anInt8800))
									i_16_ = (GameClient.anInt8966 * -609231901 + GameClient.anInt8800 * 1325631359 - 457937409 * class105.height);
								if (GameClient.method2801(class105).method3496(-2131954525))
									Class227.method2112(i_15_, i_16_, (-2093041337 * class105.width), (457937409 * class105.height), (byte) 2);
								i_12_ = i_15_;
								i_13_ = i_16_;
							}
							if (-2087469725 * class105.anInt1236 == IComponentDefinition.anInt1266 * 270446479)
								i_14_ = 128;
						}
						int i_17_;
						int i_18_;
						int i_19_;
						int i_20_;
						if (class105.type * -1215239439 == 2) {
							i_17_ = i_2_;
							i_18_ = i_3_;
							i_19_ = i_4_;
							i_20_ = i_5_;
						} else {
							int i_21_ = i_12_ + -2093041337 * class105.width;
							int i_22_ = i_13_ + class105.height * 457937409;
							if (class105.type * -1215239439 == 9) {
								i_21_++;
								i_22_++;
							}
							i_17_ = i_12_ > i_2_ ? i_12_ : i_2_;
							i_18_ = i_13_ > i_3_ ? i_13_ : i_3_;
							i_19_ = i_21_ < i_4_ ? i_21_ : i_4_;
							i_20_ = i_22_ < i_5_ ? i_22_ : i_5_;
						}
						if (i_17_ < i_19_) {
							if (i_18_ >= i_20_) {
								if (i_9_ != 0)
									break;
							} else {
								if (0 != 907611645 * class105.contentType) {
									if ((907611645 * class105.contentType == -451364727 * IComponentDefinition.anInt1269) || (907611645 * class105.contentType == (IComponentDefinition.anInt1123 * -1997023283))) {
										Class142.method1570(i_12_, i_13_, class105.width * -2093041337, 457937409 * class105.height, (IComponentDefinition.anInt1123 * -1997023283 == (class105.contentType * 907611645)), -1462418855);
										Class182.method1846(i_11_, i_17_, i_18_, i_19_, i_20_, i_12_, i_13_, 220744183);
										OverlayType.activeToolkit.method5011();
										OverlayType.activeToolkit.r(i_2_, i_3_, i_4_, i_5_);
										GameClient.aBooleanArray8900[i_11_] = true;
										continue;
									}
									if ((IComponentDefinition.anInt1265 * 310968271 == 907611645 * class105.contentType) && (GameClient.cutsceneStage * 1596783995 == 3)) {
										if ((class105.method1116(OverlayType.activeToolkit, 824113013)) == null) {
											if (i_9_ != 0) {
												/* empty */
											}
										} else {
											Class247.method2365(-804120200);
											GraphicsToolkit.method5195(OverlayType.activeToolkit, class105, i_12_, i_13_, (byte) -75);
											OverlayType.activeToolkit.r(i_2_, i_3_, i_4_, i_5_);
										}
										continue;
									}
									if (907611645 * class105.contentType == 79652011 * IComponentDefinition.anInt1131) {
										Class12.method332((OverlayType.activeToolkit), i_12_, i_13_, class105, 546414546);
										continue;
									}
									if (IComponentDefinition.anInt1132 * 2021142197 == 907611645 * class105.contentType) {
										Class455.method5958(OverlayType.activeToolkit, i_12_, i_13_, class105, (1045422783 * class105.anInt1170 % 64), 273010603);
										continue;
									}
									if (907611645 * class105.contentType == 80230169 * IComponentDefinition.anInt1125) {
										if ((class105.method1116(OverlayType.activeToolkit, 424684480)) == null) {
											if (i_9_ != 0)
												break;
										} else {
											Class367.method4551(class105, i_12_, i_13_, 65534);
											OverlayType.activeToolkit.r(i_2_, i_3_, i_4_, i_5_);
										}
										continue;
									}
									if (IComponentDefinition.anInt1126 * 826979979 == class105.contentType * 907611645) {
										Class469.method6047(OverlayType.activeToolkit, Class253.anInterface_ma2785, i_12_, i_13_, -2093041337 * class105.width, 457937409 * class105.height, -1251589182);
										GameClient.aBooleanArray8900[i_11_] = true;
										OverlayType.activeToolkit.r(i_2_, i_3_, i_4_, i_5_);
										continue;
									}
									if (-283863983 * IComponentDefinition.anInt1127 == class105.contentType * 907611645) {
										Class16.method353(OverlayType.activeToolkit, i_12_, i_13_, -2093041337 * class105.width, class105.height * 457937409, 1970711857);
										GameClient.aBooleanArray8900[i_11_] = true;
										OverlayType.activeToolkit.r(i_2_, i_3_, i_4_, i_5_);
										continue;
									}
									if (class105.contentType * 907611645 == -327267317 * IComponentDefinition.anInt1128) {
										if (GameClient.showingFPS || GameClient.aBoolean8668) {
											WorldTile.method4142(i_12_, i_13_, class105, -1647202011);
											GameClient.aBooleanArray8900[i_11_] = true;
										}
										continue;
									}
								}
								if (-1215239439 * class105.type == 0) {
									if ((907611645 * class105.contentType == -1354439347 * IComponentDefinition.anInt1130) && OverlayType.activeToolkit.method5054())
										OverlayType.activeToolkit.method5056(i_12_, i_13_, class105.width * -2093041337, 457937409 * class105.height);
									method5714(class105s, class105.interfacehash * -440872681, i_17_, i_18_, i_19_, i_20_, i_12_ - (684246511 * class105.anInt1166), i_13_ - (-1424956747 * class105.anInt1167), i_11_, bool, (byte) 0);
									if (class105.aClass105Array1293 != null)
										method5714(class105.aClass105Array1293, (-440872681 * class105.interfacehash), i_17_, i_18_, i_19_, i_20_, i_12_ - (class105.anInt1166 * 684246511), (i_13_ - (-1424956747 * class105.anInt1167)), i_11_, bool, (byte) 0);
									Interface class298_sub51 = ((Interface) (GameClient.aClass437_8841.get((long) (class105.interfacehash * -440872681))));
									if (null != class298_sub51)
										Class448.method5912((-1617025021 * (class298_sub51.interfaceId)), i_17_, i_18_, i_19_, i_20_, i_12_, i_13_, i_11_, 421170136);
									if (IComponentDefinition.anInt1130 * -1354439347 == class105.contentType * 907611645) {
										if (OverlayType.activeToolkit.method5054())
											OverlayType.activeToolkit.method5112();
										if (0 == 1596783995 * GameClient.cutsceneStage) {
											int i_23_ = (-876396183 * GameClient.anInt8681);
											int i_24_ = GameClient.anInt8731 * 549822343;
											int i_25_ = 127441797 * GameClient.anInt8732;
											int i_26_ = (GameClient.anInt8720 * -1276156339);
											if (443738891 * GameClient.anInt8884 < (-230034171 * GameClient.anInt8737)) {
												float f = ((float) (((GameClient.anInt8884) * 443738891) - (1757243277 * (GameClient.anInt8728))) * 1.0F / (float) (((GameClient.anInt8737) * -230034171) - ((GameClient.anInt8728) * 1757243277)));
												i_23_ = (int) (((1.0F - f) * (float) ((Class256.anInt2801) * -503104833)) + ((float) ((GameClient.anInt8681) * -876396183) * f));
												i_24_ = (int) (((float) ((GameClient.anInt8731) * 549822343) * f) + ((1.0F - f) * (float) (2068723003 * Class108.anInt1321)));
												i_25_ = (int) (((1.0F - f) * (float) ((Class474.anInt5980) * 2047797063)) + ((float) (127441797 * (GameClient.anInt8732)) * f));
												i_26_ = (int) (((1.0F - f) * (float) (669602755 * (Class115.anInt1389))) + ((float) (-1276156339 * (GameClient.anInt8720)) * f));
											}
											if (i_23_ > 0)
												OverlayType.activeToolkit.method5015(i_17_, i_18_, i_19_ - i_17_, i_20_ - i_18_, (i_23_ << 24 | i_24_ << 16 | i_25_ << 8 | i_26_), (byte) 7);
										}
									}
									OverlayType.activeToolkit.r(i_2_, i_3_, i_4_, i_5_);
								}
								if (!GameClient.aBooleanArray8901[i_11_] && GameClient.anInt8956 * 2067224717 <= 1) {
									if (i_9_ != 0)
										throw new IllegalStateException();
								} else if (class105.type * -1215239439 == 3) {
									if (0 == i_14_) {
										if (class105.aBoolean1171)
											OverlayType.activeToolkit.drawFilledBox(i_12_, i_13_, (-2093041337 * class105.width), (class105.height * 457937409), (class105.anInt1170 * 1045422783), 0);
										else
											OverlayType.activeToolkit.method5019(i_12_, i_13_, (class105.width * -2093041337), (class105.height * 457937409), (1045422783 * class105.anInt1170), 0);
									} else if (class105.aBoolean1171)
										OverlayType.activeToolkit.drawFilledBox(i_12_, i_13_, class105.width * -2093041337, 457937409 * class105.height, (255 - (i_14_ & 0xff) << 24 | ((1045422783 * class105.anInt1170) & 0xffffff)), 1);
									else
										OverlayType.activeToolkit.method5019(i_12_, i_13_, -2093041337 * class105.width, 457937409 * class105.height, (255 - (i_14_ & 0xff) << 24 | (class105.anInt1170 * 1045422783) & 0xffffff), 1);
								} else if (4 == (-1215239439 * class105.type)) {
									Class264 class264 = (class105.method1112(Class497.aClass197_6105, GameClient.anInterface10_8700, 1828077661));
									if (class264 == null) {
										if (IComponentDefinition.aBoolean1139)
											LocalizedString.markComponentForRedraw(class105, -1885159145);
									} else {
										int i_27_ = class105.anInt1170 * 1045422783;
										String string = class105.aString1212;
										if (-1232467723 * class105.zds3 != -1) {
											ItemDefinitions class468 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions((-1232467723 * class105.zds3)));
											string = class468.itemName;
											if (string == null)
												string = "null";
											if (((789409129 * class468.anInt5704) == 1 || 1 != (-66163287 * (class105.anInt1281))) && (-1 != (-66163287 * class105.anInt1281)))
												string = new StringBuilder().append(Class285.method2709(16748608, -1499496225)).append(string).append(Class26.aString356).append(" x").append(Class441.method5866((class105.anInt1281 * -66163287), 1886400109)).toString();
										}
										if (-1 != (-324971993 * class105.anInt1289)) {
											string = (Js5ConfigGroup.method1308((-324971993 * class105.anInt1289), (byte) -48));
											if (null == string)
												string = "";
										}
										if (class105 == GameClient.aClass105_8652) {
											string = (LocalizedString.MESSAGE_PLEASE_WAIT.getText(Class321.ACTIVE_LANGUAGE, -875414210));
											i_27_ = (1045422783 * class105.anInt1170);
										}
										if (GameClient.aBoolean8849)
											OverlayType.activeToolkit.o(i_12_, i_13_, i_12_ + (class105.width * -2093041337), (class105.height * 457937409) + i_13_);
										if (class105.aBoolean1246)
											class264.method2485(string, i_12_, i_13_, (class105.width * -2093041337), (class105.height * 457937409), (255 - (i_14_ & 0xff) << 24 | i_27_), (class105.aBoolean1216 ? 255 - (i_14_ & 0xff) << 24 : -1), (class105.anInt1214 * 872550387), (-1594110459 * class105.anInt1124), GameClient.aRandom8702, (Class368.anInt4005 * 1401020893), GameClient.anIntArray8899, (Class130_Sub2.aClass57Array6959), null, -1153250817);
										else
											class264.method2476(string, i_12_, i_13_, (class105.width * -2093041337), (457937409 * class105.height), (255 - (i_14_ & 0xff) << 24 | i_27_), (class105.aBoolean1216 ? 255 - (i_14_ & 0xff) << 24 : -1), (872550387 * class105.anInt1214), (class105.anInt1124 * -1594110459), (class105.anInt1191 * 418216501), (536848259 * class105.anInt1217), (Class130_Sub2.aClass57Array6959), null, null, 0, 0, -1416794725);
										if (GameClient.aBoolean8849)
											OverlayType.activeToolkit.r(i_2_, i_3_, i_4_, i_5_);
									}
								} else if (-1215239439 * class105.type == 5) {
									if (class105.anInt1283 * 925824753 >= 0)
										class105.method1121(VarBitType.aClass317_3472, Class138_Sub1.aClass131_7010, 1661859058).method2590(OverlayType.activeToolkit, 0, i_12_, i_13_, -2093041337 * class105.width, 457937409 * class105.height, (452780643 * class105.anInt1241 << 3), (class105.anInt1252 * -1889859235 << 3), 0, 0, -45056444);
									else {
										Class57 class57;
										if (-1232467723 * class105.zds3 != -1) {
											Class366 class366 = (class105.aBoolean1213 ? (Class287.myPlayer.appearance) : null);
											class57 = (Class298_Sub32_Sub14.aClass477_9400.method6085(OverlayType.activeToolkit, (class105.zds3 * -1232467723), (class105.anInt1281 * -66163287), (class105.anInt1178 * 547522005), (~0xffffff | (-2065110161 * class105.anInt1251)), (2097772641 * class105.anInt1201), class366, 467134725));
										} else if (-1 != (-324971993 * class105.anInt1289))
											class57 = (Class23.method376(OverlayType.activeToolkit, (-324971993 * class105.anInt1289), (byte) 39));
										else
											class57 = (class105.method1128(OverlayType.activeToolkit, -989509351));
										if (class57 != null) {
											int i_28_ = class57.method271();
											int i_29_ = class57.method626();
											int i_30_ = (255 - (i_14_ & 0xff) << 24 | (0 != (class105.anInt1170 * 1045422783) ? ((1045422783 * class105.anInt1170) & 0xffffff) : 16777215));
											if (class105.repeat) {
												OverlayType.activeToolkit.o(i_12_, i_13_, (i_12_ + (class105.width * -2093041337)), i_13_ + (457937409 * (class105.height)));
												if ((class105.anInt1306 * 840270937) != 0) {
													int i_31_ = (((class105.width * -2093041337) + (i_28_ - 1)) / i_28_);
													int i_32_ = (((class105.height * 457937409) + (i_29_ - 1)) / i_29_);
													for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
														for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
															if (0 != (1045422783 * (class105.anInt1170)))
																class57.method638(((float) (i_12_ + i_33_ * i_28_) + ((float) i_28_ / 2.0F)), (((float) i_29_ / 2.0F) + (float) (i_29_ * i_34_ + i_13_)), 4096, ((class105.anInt1306) * 840270937), 0, i_30_, 1);
															else
																class57.method673(((float) (i_12_ + i_28_ * i_33_) + ((float) i_28_ / 2.0F)), (((float) i_29_ / 2.0F) + (float) (i_13_ + i_29_ * i_34_)), 4096, (840270937 * (class105.anInt1306)));
														}
													}
												} else if (((1045422783 * (class105.anInt1170)) != 0) || i_14_ != 0)
													class57.method662(i_12_, i_13_, (-2093041337 * (class105.width)), (class105.height * 457937409), 0, i_30_, 1);
												else
													class57.method636(i_12_, i_13_, (-2093041337 * (class105.width)), (class105.height * 457937409));
												OverlayType.activeToolkit.r(i_2_, i_3_, i_4_, i_5_);
											} else if (((1045422783 * class105.anInt1170) != 0) || 0 != i_14_) {
												if (0 != (840270937 * class105.anInt1306))
													class57.method638((((float) ((class105.width) * -2093041337) / 2.0F) + (float) i_12_), ((float) i_13_ + ((float) ((class105.height) * 457937409) / 2.0F)), (-342593536 * class105.width / i_28_), (class105.anInt1306 * 840270937), 0, i_30_, 1);
												else if ((i_28_ != (-2093041337 * (class105.width))) || (((class105.height) * 457937409) != i_29_))
													class57.method634(i_12_, i_13_, (-2093041337 * (class105.width)), (457937409 * (class105.height)), 0, i_30_, 1);
												else
													class57.method631(i_12_, i_13_, 0, i_30_, 1);
											} else if ((class105.anInt1306 * 840270937) != 0)
												class57.method673(((float) ((class105.width) * -2093041337) / 2.0F) + (float) i_12_, ((float) (457937409 * (class105.height)) / 2.0F) + (float) i_13_, (class105.width * -342593536 / i_28_), (840270937 * class105.anInt1306));
											else if ((class105.width * -2093041337) != i_28_ || (i_29_ != (457937409 * (class105.height))))
												class57.method633(i_12_, i_13_, (-2093041337 * class105.width), (class105.height * 457937409));
											else
												class57.method645(i_12_, i_13_);
										} else if (IComponentDefinition.aBoolean1139)
											LocalizedString.markComponentForRedraw(class105, 1189683117);
									}
								} else if (6 == (class105.type * -1215239439)) {
									GameClient.map.method2640((byte) -16).renderFrameAtmosphere((byte) -24);
									ModelPart modelPart = null;
									int i_35_ = 2048;
									if (class105.anInt1197 * 1054312299 != 0)
										i_35_ |= 0x80000;
									int i_36_ = 0;
									if (class105.zds3 * -1232467723 != -1) {
										ItemDefinitions class468 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions((class105.zds3 * -1232467723)));
										if (class468 != null) {
											class468 = (class468.method6030((class105.anInt1281 * -66163287), 1491142573));
											modelPart = (class468.method6029(OverlayType.activeToolkit, i_35_, 1, (class105.aBoolean1213 ? (Class287.myPlayer.appearance) : null), class105.aAnimator_1152, 0, 0, 0, 0, 1717387975));
											if (modelPart != null)
												i_36_ = -modelPart.YA() >> 1;
											else
												LocalizedString.markComponentForRedraw(class105, -1878363651);
										}
									} else if (3 == (1548853569 * class105.anInt1184)) {
										int i_37_ = class105.anInt1151 * 572201537;
										if (i_37_ >= 0 && i_37_ < 2048) {
											Player class365_sub1_sub1_sub2_sub2 = (GameClient.players[i_37_]);
											if ((null != class365_sub1_sub1_sub2_sub2) && (((-442628795 * GameClient.playerIndex) == i_37_) || ((Class525.method6379((class365_sub1_sub1_sub2_sub2.username), (byte) 125)) == (1148770405 * (class105.anInt1140))))) {
												modelPart = (class105.method1124(OverlayType.activeToolkit, i_35_, Class94.aClass349_913, (Class212.aIdentityKitTypeList_2433), Class15.aClass507_224, (Class298_Sub32_Sub14.aClass477_9400), (Class501.aClass395_6122), (Class128.aClass148_6331), (class105.aAnimator_1152), (class365_sub1_sub1_sub2_sub2.appearance), -297118329));
												if (null == modelPart && IComponentDefinition.aBoolean1139)
													LocalizedString.markComponentForRedraw(class105, 398619747);
											}
										}
									} else if (class105.anInt1184 * 1548853569 == 5) {
										int i_38_ = 572201537 * class105.anInt1151;
										if (i_38_ >= 0 && i_38_ < 2048) {
											Player class365_sub1_sub1_sub2_sub2 = (GameClient.players[i_38_]);
											if ((class365_sub1_sub1_sub2_sub2 != null) && (i_38_ == (GameClient.playerIndex * -442628795) || ((Class525.method6379((class365_sub1_sub1_sub2_sub2.username), (byte) 127)) == (class105.anInt1140 * 1148770405))))
												modelPart = (class365_sub1_sub1_sub2_sub2.appearance.method4545(OverlayType.activeToolkit, i_35_, Class94.aClass349_913, (Class212.aIdentityKitTypeList_2433), Class15.aClass507_224, (Class298_Sub32_Sub14.aClass477_9400), (Class501.aClass395_6122), (Class128.aClass148_6331), (class105.aAnimator_1152), null, null, null, 0, true, (Class82_Sub18.aClass405_6892), -933937677));
										}
									} else if (8 == (class105.anInt1184 * 1548853569) || (class105.anInt1184 * 1548853569) == 9) {
										Class298_Sub9 class298_sub9 = (Class255.method2437(572201537 * class105.anInt1151, false, 2023314319));
										if (null != class298_sub9)
											modelPart = (class298_sub9.method2891(OverlayType.activeToolkit, i_35_, class105.aAnimator_1152, (1148770405 * class105.anInt1140), 9 == (class105.anInt1184 * 1548853569), (class105.aBoolean1213 ? (Class287.myPlayer.appearance) : null), (byte) 1));
									} else if (null == class105.aAnimator_1152 || !(class105.aAnimator_1152.method5819((byte) -99))) {
										modelPart = (class105.method1124(OverlayType.activeToolkit, i_35_, Class94.aClass349_913, Class212.aIdentityKitTypeList_2433, Class15.aClass507_224, (Class298_Sub32_Sub14.aClass477_9400), Class501.aClass395_6122, Class128.aClass148_6331, null, (Class287.myPlayer.appearance), -347094263));
										if (null == modelPart && IComponentDefinition.aBoolean1139)
											LocalizedString.markComponentForRedraw(class105, -91896348);
									} else {
										modelPart = (class105.method1124(OverlayType.activeToolkit, i_35_, Class94.aClass349_913, Class212.aIdentityKitTypeList_2433, Class15.aClass507_224, (Class298_Sub32_Sub14.aClass477_9400), Class501.aClass395_6122, Class128.aClass148_6331, class105.aAnimator_1152, (Class287.myPlayer.appearance), -1902556053));
										if (null == modelPart && IComponentDefinition.aBoolean1139)
											LocalizedString.markComponentForRedraw(class105, 302421220);
									}
									if (null != modelPart) {
										if (1054312299 * class105.anInt1197 != 0)
											modelPart.PA((class105.anInt1278 * -2138135813), (class105.anInt1207 * 118945837), (class105.anInt1208 * -288544823), (class105.anInt1197 * 1054312299));
										int i_39_;
										if (class105.anInt1221 * -692202853 > 0)
											i_39_ = (((-2093041337 * class105.width) << 9) / (-692202853 * class105.anInt1221));
										else
											i_39_ = 512;
										int i_40_;
										if (class105.anInt1198 * 302318939 > 0)
											i_40_ = (((457937409 * class105.height) << 9) / (class105.anInt1198 * 302318939));
										else
											i_40_ = 512;
										int i_41_ = (i_12_ + (-2093041337 * class105.width / 2));
										int i_42_ = i_13_ + (class105.height * 457937409 / 2);
										if (!class105.aBoolean1187) {
											i_41_ += i_39_ * (class105.anInt1193 * 1412474881) >> 9;
											i_42_ += (i_40_ * (-1674106223 * (class105.anInt1194)) >> 9);
										}
										GameClient.aClass222_8871.method2055();
										OverlayType.activeToolkit.method5043(GameClient.aClass222_8871);
										Class233 class233 = OverlayType.activeToolkit.method5036();
										int i_43_ = GameClient.map.method2634((byte) -21);
										int i_44_ = GameClient.map.method2635(-176106849);
										if (class105.aBoolean1199) {
											if (class105.aBoolean1187)
												class233.method2153((float) i_41_, (float) i_42_, (float) i_39_, (float) i_40_, (float) i_43_, (float) i_44_, (float) ((Class462.canvasWidth) * -2110394505), (float) (-1111710645 * (Class298_Sub40_Sub9.anInt9716)), (float) ((class105.tempZoomDistance) * -261021353));
											else
												class233.method2153((float) i_41_, (float) i_42_, (float) i_39_, (float) i_40_, (float) i_43_, (float) i_44_, (float) ((Class462.canvasWidth) * -2110394505), (float) ((Class298_Sub40_Sub9.anInt9716) * -1111710645), (float) (((class105.tempZoomDistance) * -261021353) << 2));
										} else
											class233.method2152((float) i_41_, (float) i_42_, (float) i_39_, (float) i_40_, (float) i_43_, (float) i_44_, (float) (-2110394505 * (Class462.canvasWidth)), (float) (-1111710645 * (Class298_Sub40_Sub9.anInt9716)));
										OverlayType.activeToolkit.method5182(class233);
										OverlayType.activeToolkit.ba(2, 0);
										if (class105.aBoolean1186)
											OverlayType.activeToolkit.RA(false);
										if (class105.aBoolean1187) {
											GameClient.aClass222_8968.method2059(1.0F, 0.0F, 0.0F, (Class220.method2049(class105.anInt1190 * 7329457)));
											GameClient.aClass222_8968.method2071(0.0F, 1.0F, 0.0F, (Class220.method2049(-1086526073 * class105.anInt1262)));
											GameClient.aClass222_8968.method2071(0.0F, 0.0F, 1.0F, (Class220.method2049(1004185785 * class105.anInt1192)));
											GameClient.aClass222_8968.method2064((float) (class105.anInt1193 * 1412474881), (float) (class105.anInt1194 * -1674106223), (float) (-1491626287 * (class105.anInt1282)));
										} else {
											int i_45_ = (((Class220.SINE[((7329457 * class105.anInt1190) << 3)]) * ((-261021353 * class105.tempZoomDistance) << 2)) >> 14);
											int i_46_ = (((Class220.COSINE[(class105.anInt1190 * 7329457) << 3]) * ((class105.tempZoomDistance * -261021353) << 2)) >> 14);
											GameClient.aClass222_8968.method2059(0.0F, 0.0F, 1.0F, (Class220.method2049(-(class105.anInt1192 * 1004185785) << 3)));
											GameClient.aClass222_8968.method2071(0.0F, 1.0F, 0.0F, (Class220.method2049((-1086526073 * class105.anInt1262) << 3)));
											GameClient.aClass222_8968.method2064((float) ((class105.anInt1297 * -407676483) << 2), (float) (i_36_ + (i_45_ + ((-1523987341 * (class105.anInt1248)) << 2))), (float) (i_46_ + (((class105.anInt1248) * -1523987341) << 2)));
											GameClient.aClass222_8968.method2071(1.0F, 0.0F, 0.0F, (Class220.method2049(class105.anInt1190 * 7329457 << 3)));
										}
										class105.method1114(OverlayType.activeToolkit, modelPart, GameClient.aClass222_8968, 443738891 * GameClient.anInt8884, 1739448532);
										if (GameClient.aBoolean8849)
											OverlayType.activeToolkit.o(i_12_, i_13_, (i_12_ + (-2093041337 * class105.width)), i_13_ + (class105.height * 457937409));
										modelPart.method4739((GameClient.aClass222_8968), null, 1);
										if (!class105.aBoolean1199 && class105.aClickableGeometry_1218 != null)
											OverlayType.activeToolkit.method5042(class105.aClickableGeometry_1218.method4226());
										if (GameClient.aBoolean8849)
											OverlayType.activeToolkit.r(i_2_, i_3_, i_4_, i_5_);
										if (class105.aBoolean1186)
											OverlayType.activeToolkit.RA(true);
									}
								} else if (class105.type * -1215239439 == 9) {
									int i_47_;
									int i_48_;
									int i_49_;
									int i_50_;
									if (class105.aBoolean1174) {
										i_47_ = i_12_;
										i_48_ = i_13_ + (457937409 * class105.height);
										i_49_ = (class105.width * -2093041337 + i_12_);
										i_50_ = i_13_;
									} else {
										i_47_ = i_12_;
										i_48_ = i_13_;
										i_49_ = (-2093041337 * class105.width + i_12_);
										i_50_ = i_13_ + (457937409 * class105.height);
									}
									if (1 == -1753054445 * class105.anInt1173)
										OverlayType.activeToolkit.method5091(i_47_, i_48_, i_49_, i_50_, class105.anInt1170 * 1045422783, 0);
									else
										OverlayType.activeToolkit.method4999(i_47_, i_48_, i_49_, i_50_, class105.anInt1170 * 1045422783, class105.anInt1173 * -1753054445, 0);
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aei.kk(").append(')').toString());
		}
	}
}
