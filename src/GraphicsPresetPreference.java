/* GraphicsPresetPreference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GraphicsPresetPreference extends IntegerPreferenceField {
	public static int anInt8417 = 1;
	public static int anInt8418 = 3;
	public static int anInt8419 = 4;
	public static int anInt8420 = 0;
	public static int anInt8421 = 2;

	int method5612(int i, int i_0_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeg.f(").append(')').toString());
		}
	}

	public GraphicsPresetPreference(int i, GamePreferences gamePreferences) {
		super(i, gamePreferences);
	}

	public void method5708(int i) {
		try {
			if (-1598873795 * anInt5350 < 0 || -1598873795 * anInt5350 > 4)
				anInt5350 = method5611(843701468) * 1886334997;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeg.s(").append(')').toString());
		}
	}

	int method5611(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeg.a(").append(')').toString());
		}
	}

	void method5610(int i) {
		anInt5350 = 1886334997 * i;
	}

	int method5615() {
		return 0;
	}

	public int method5709(int i) {
		try {
			return anInt5350 * -1598873795;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeg.z(").append(')').toString());
		}
	}

	public GraphicsPresetPreference(GamePreferences gamePreferences) {
		super(gamePreferences);
	}

	void method5614(int i, int i_1_) {
		try {
			anInt5350 = 1886334997 * i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeg.p(").append(')').toString());
		}
	}

	int method5616(int i) {
		return 1;
	}

	static final void method5710(int i) {
		try {
			if (GraphicsAutoSetup.clientPreferences.aClass422_Sub17_7565.method5689(-2013953489) == 2) {
				byte[][][] is = GameClient.map.method2642(899241973);
				byte i_2_ = (byte) (-1953789277 * GameClient.anInt8777 - 4 & 0xff);
				int i_3_ = (-1953789277 * GameClient.anInt8777 % GameClient.map.upperX(-2129604944));
				for (int i_4_ = 0; i_4_ < 4; i_4_++) {
					for (int i_5_ = 0; i_5_ < GameClient.map.upperY(-605085367); i_5_++)
						is[i_4_][i_3_][i_5_] = i_2_;
				}
				if (Class99.anInt952 * 1855729883 != 3) {
					for (int i_6_ = 0; i_6_ < 2; i_6_++) {
						GameClient.anIntArray8793[i_6_] = -1000000;
						GameClient.anIntArray8670[i_6_] = 1000000;
						GameClient.anIntArray8795[i_6_] = 0;
						GameClient.anIntArray8797[i_6_] = 1000000;
						GameClient.anIntArray8641[i_6_] = 0;
					}
					SceneObjectPosition sceneObjectPosition = (Class287.myPlayer.method4337().aSceneObjectPosition_2599);
					int i_7_ = (int) sceneObjectPosition.x;
					int i_8_ = (int) sceneObjectPosition.z;
					TileFlags tileFlags = GameClient.map.method2654(688600578);
					SceneGraph sceneGraph = GameClient.map.method2675(-1611682495);
					while_15_: do {
						if (ObjectDeque.anInt7164 * -863531439 == 4 || Class100.anInt1081 * 1329981847 != -1) {
							if (-863531439 * ObjectDeque.anInt7164 != 4) {
								i_7_ = 1329981847 * Class100.anInt1081;
								i_8_ = Class418.anInt5339 * -1106950801;
							}
							if (((tileFlags.flags[1855729883 * Class99.anInt952][i_7_ >> 9][i_8_ >> 9]) & 0x4) != 0)
								Class143.method1577(sceneGraph.aClass326ArrayArrayArray3516, 0, i_7_ >> 9, i_8_ >> 9, false, -777988087);
							else if (GameClient.anInt8756 * -104436553 < 2560) {
								int i_9_ = -1740717447 * Class367.anInt4000 >> 9;
								int i_10_ = Class146.anInt1575 * -299812095 >> 9;
								int i_11_ = i_7_ >> 9;
								int i_12_ = i_8_ >> 9;
								int i_13_;
								if (i_11_ > i_9_)
									i_13_ = i_11_ - i_9_;
								else
									i_13_ = i_9_ - i_11_;
								int i_14_;
								if (i_12_ > i_10_)
									i_14_ = i_12_ - i_10_;
								else
									i_14_ = i_10_ - i_12_;
								if (0 == i_13_ && 0 == i_14_ || i_13_ <= -GameClient.map.upperX(-1952640446) || i_13_ >= GameClient.map.upperX(-2135239698) || i_14_ <= -GameClient.map.upperY(115807107) || i_14_ >= GameClient.map.upperY(-1212701794)) {
									WorldTile worldTile = GameClient.map.getRegionStart(681479919);
									IPAddress.method6062(new StringBuilder().append(i_9_).append(Class26.COMMA).append(i_10_).append(" ").append(i_11_).append(Class26.COMMA).append(i_12_).append(" ").append(worldTile.x * -1760580017).append(Class26.COMMA).append(worldTile.y * 283514611).toString(), new RuntimeException(), (short) -16769);
									break;
								}
								if (i_13_ > i_14_) {
									int i_15_ = i_14_ * 65536 / i_13_;
									int i_16_ = 32768;
									for (;;) {
										if (i_11_ == i_9_)
											break while_15_;
										if (i_9_ < i_11_)
											i_9_++;
										else if (i_9_ > i_11_)
											i_9_--;
										if (((tileFlags.flags[1855729883 * Class99.anInt952][i_9_][i_10_]) & 0x4) != 0) {
											Class143.method1577((sceneGraph.aClass326ArrayArrayArray3516), 1, i_9_, i_10_, false, -777988087);
											break while_15_;
										}
										i_16_ += i_15_;
										if (i_16_ >= 65536) {
											i_16_ -= 65536;
											if (i_10_ < i_12_)
												i_10_++;
											else if (i_10_ > i_12_)
												i_10_--;
											if (0 != ((tileFlags.flags[(1855729883 * Class99.anInt952)][i_9_][i_10_]) & 0x4))
												break;
										}
									}
									Class143.method1577(sceneGraph.aClass326ArrayArrayArray3516, 1, i_9_, i_10_, false, -777988087);
								} else {
									int i_17_ = 65536 * i_13_ / i_14_;
									int i_18_ = 32768;
									for (;;) {
										if (i_10_ == i_12_)
											break while_15_;
										if (i_10_ < i_12_)
											i_10_++;
										else if (i_10_ > i_12_)
											i_10_--;
										if (0 != ((tileFlags.flags[(Class99.anInt952 * 1855729883)][i_9_][i_10_]) & 0x4)) {
											Class143.method1577((sceneGraph.aClass326ArrayArrayArray3516), 1, i_9_, i_10_, false, -777988087);
											break while_15_;
										}
										i_18_ += i_17_;
										if (i_18_ >= 65536) {
											i_18_ -= 65536;
											if (i_9_ < i_11_)
												i_9_++;
											else if (i_9_ > i_11_)
												i_9_--;
											if (((tileFlags.flags[(1855729883 * Class99.anInt952)][i_9_][i_10_]) & 0x4) != 0)
												break;
										}
									}
									Class143.method1577(sceneGraph.aClass326ArrayArrayArray3516, 1, i_9_, i_10_, false, -777988087);
								}
							}
						} else {
							int i_19_ = (Class356.method4271(Class367.anInt4000 * -1740717447, Class146.anInt1575 * -299812095, Class99.anInt952 * 1855729883, -1780642340));
							if (i_19_ - Class110.anInt6403 * 1449634147 < 3200 && ((tileFlags.flags[Class99.anInt952 * 1855729883][Class367.anInt4000 * -1740717447 >> 9][-299812095 * Class146.anInt1575 >> 9]) & 0x4) != 0)
								Class143.method1577(sceneGraph.aClass326ArrayArrayArray3516, 1, Class367.anInt4000 * -1740717447 >> 9, -299812095 * Class146.anInt1575 >> 9, false, -777988087);
						}
					} while (false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeg.io(").append(')').toString());
		}
	}

	public static void method5711(String string, short i) {
		try {
			ChecksumTableEntry.method2282(0, 0, "", "", "", string, -1848058692);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aeg.f(").append(')').toString());
		}
	}
}
