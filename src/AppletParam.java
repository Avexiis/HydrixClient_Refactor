/* AppletParam - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AppletParam {
	static AppletParam aAppletParam_2363;
	static AppletParam aAppletParam_2364;
	static AppletParam aAppletParam_2365;
	static AppletParam aAppletParam_2366;
	static AppletParam aAppletParam_2367;
	static AppletParam aAppletParam_2368;
	static AppletParam aAppletParam_2369;
	static AppletParam aAppletParam_2370;
	static AppletParam aAppletParam_2371;
	static AppletParam aAppletParam_2372;
	static AppletParam aAppletParam_2373;
	static AppletParam aAppletParam_2374;
	static AppletParam aAppletParam_2375;
	static AppletParam aAppletParam_2376;
	static AppletParam aAppletParam_2377;
	public static AppletParam aAppletParam_2378;
	static AppletParam aAppletParam_2379;
	static AppletParam aAppletParam_2380;
	static AppletParam aAppletParam_2381;
	public static AppletParam aAppletParam_2382;
	static AppletParam aAppletParam_2383;
	static AppletParam aAppletParam_2384;
	static AppletParam aAppletParam_2385;
	static AppletParam aAppletParam_2386;
	static AppletParam aAppletParam_2387;
	static AppletParam aAppletParam_2388;
	static AppletParam aAppletParam_2389;
	static AppletParam aAppletParam_2390;
	static AppletParam aAppletParam_2391;
	static AppletParam aAppletParam_2392;
	static AppletParam aAppletParam_2393;
	static AppletParam aAppletParam_2394 = new AppletParam("11", "11");
	public String aString2395;

	AppletParam(String string, String string_0_) {
		aString2395 = string_0_;
	}

	static {
		aAppletParam_2364 = new AppletParam("13", "13");
		aAppletParam_2365 = new AppletParam("6", "6");
		aAppletParam_2381 = new AppletParam("26", "26");
		aAppletParam_2367 = new AppletParam("18", "18");
		aAppletParam_2368 = new AppletParam("21", "21");
		aAppletParam_2376 = new AppletParam("9", "9");
		aAppletParam_2370 = new AppletParam("28", "28");
		aAppletParam_2371 = new AppletParam("4", "4");
		aAppletParam_2372 = new AppletParam("20", "20");
		aAppletParam_2373 = new AppletParam("27", "27");
		aAppletParam_2374 = new AppletParam("1", "1");
		aAppletParam_2392 = new AppletParam("22", "22");
		aAppletParam_2387 = new AppletParam("7", "7");
		aAppletParam_2380 = new AppletParam("15", "15");
		aAppletParam_2375 = new AppletParam("31", "31");
		aAppletParam_2379 = new AppletParam("12", "12");
		aAppletParam_2363 = new AppletParam("30", "30");
		aAppletParam_2378 = new AppletParam("14", "14");
		aAppletParam_2382 = new AppletParam("8", "8");
		aAppletParam_2383 = new AppletParam("23", "23");
		aAppletParam_2384 = new AppletParam("29", "29");
		aAppletParam_2385 = new AppletParam("32", "32");
		aAppletParam_2386 = new AppletParam("2", "2");
		aAppletParam_2369 = new AppletParam("16", "16");
		aAppletParam_2366 = new AppletParam("24", "24");
		aAppletParam_2389 = new AppletParam("33", "33");
		aAppletParam_2390 = new AppletParam("17", "17");
		aAppletParam_2391 = new AppletParam("25", "25");
		aAppletParam_2377 = new AppletParam("3", "3");
		aAppletParam_2393 = new AppletParam("10", "10");
		aAppletParam_2388 = new AppletParam("5", "5");
	}

	public static void method1938(SeqType class391, int i, Class365_Sub1 class365_sub1, int i_1_) {
		try {
			if (-991384187 * Class300.anInt3213 < 50 && (class391 != null && null != class391.sounds && i < class391.sounds.length && class391.sounds[i] != null)) {
				int i_2_ = class391.sounds[i][0];
				int i_3_ = i_2_ >> 8;
				int i_4_ = i_2_ >> 5 & 0x7;
				int i_5_ = i_2_ & 0x1f;
				if (class391.sounds[i].length > 1) {
					int i_6_ = (int) (Math.random() * (double) (class391.sounds[i]).length);
					if (i_6_ > 0)
						i_3_ = class391.sounds[i][i_6_];
				}
				int i_7_ = 256;
				if (null != class391.anIntArray4183 && null != class391.anIntArray4190)
					i_7_ = ((int) (Math.random() * (double) (class391.anIntArray4190[i] - class391.anIntArray4183[i])) + class391.anIntArray4183[i]);
				int i_8_ = (class391.anIntArray4188 == null ? 255 : class391.anIntArray4188[i]);
				if (i_5_ == 0) {
					if (Class287.myPlayer == class365_sub1) {
						if (class391.aBoolean4173)
							Class320.method3913(i_3_, i_4_, 0, i_8_, false, i_7_, 1619018556);
						else
							Class239.method2210(i_3_, i_4_, 0, i_8_, i_7_, 1846790975);
					}
				} else if (GraphicsAutoSetup.clientPreferences.aVolumePreference_7582.method5726(-2147180332) != 0) {
					SceneObjectPosition sceneObjectPosition = class365_sub1.method4337().aSceneObjectPosition_2599;
					int i_9_ = (int) sceneObjectPosition.x - 256 >> 9;
					int i_10_ = (int) sceneObjectPosition.z - 256 >> 9;
					int i_11_ = ((Class287.myPlayer == class365_sub1) ? 0 : (i_10_ << 8) + ((i_9_ << 16) + (class365_sub1.plane << 24)) + i_5_);
					Class300.aClass297Array3214[(Class300.anInt3213 += -598588595) * -991384187 - 1] = new Class297((class391.aBoolean4173 ? (byte) 2 : (byte) 1), i_3_, i_4_, 0, i_8_, i_11_, i_7_, class365_sub1);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("iu.r(").append(')').toString());
		}
	}

	static void method1939(int i) {
		try {
			Class360.password = "";
			Class360.username = "";
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("iu.s(").append(')').toString());
		}
	}

	static final void method1940(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_12_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_13_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_12_ & -1 - (1 << i_13_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("iu.yi(").append(')').toString());
		}
	}

	public static Class336 setExtraRoutefinderData(int toX, int toY, int sizeX, int sizeY, int routeType) {
		try {
			Class315.aClass336_Sub5_3304.toX = toX * -760677635;
			Class315.aClass336_Sub5_3304.toY = toY * 167105303;
			Class315.aClass336_Sub5_3304.sizeX = sizeX * -1544157451;
			Class315.aClass336_Sub5_3304.sizeY = -1468199503 * sizeY;
			((Class336_Sub5) Class315.aClass336_Sub5_3304).routeType = -1073204575 * routeType;
			return Class315.aClass336_Sub5_3304;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("iu.p(").append(')').toString());
		}
	}
}
