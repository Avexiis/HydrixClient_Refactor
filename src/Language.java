/* Language - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Locale;

public class Language implements Interface21 {
	public static Language aLanguage_6624 = new Language("EN", "en", "English", ReferenceTable.aReferenceTable_6557, 0, "GB");
	public static Language aLanguage_6625 = new Language("DE", "de", "German", ReferenceTable.aReferenceTable_6557, 1, "DE");
	public static Language aLanguage_6626 = new Language("FR", "fr", "French", ReferenceTable.aReferenceTable_6557, 2, "FR");
	public static Language aLanguage_6627 = new Language("PT", "pt", "Portuguese", ReferenceTable.aReferenceTable_6557, 3, "BR");
	static Language aLanguage_6628 = new Language("NL", "nl", "Dutch", ReferenceTable.aReferenceTable_6560, 4, "NL");
	String aString6629;
	int anInt6630;
	public static int anInt6631 = 6;
	public static Language aLanguage_6632 = new Language("ES", "es", "Spanish", ReferenceTable.aReferenceTable_6560, 5, "ES");
	String aString6633;
	Locale aLocale6634;
	static Language[] aLanguageArray6635;

	static {
		Language[] languages = method5756(13792257);
		aLanguageArray6635 = new Language[languages.length];
		Language[] languageS_0_ = languages;
		for (int i = 0; i < languageS_0_.length; i++) {
			Language language = languageS_0_[i];
			if ((aLanguageArray6635[-1719637847 * ((Language) language).anInt6630]) != null)
				throw new IllegalStateException();
			aLanguageArray6635[-1719637847 * ((Language) language).anInt6630] = language;
		}
	}

	public String method5753(int i) {
		try {
			return ((Language) this).aString6629;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.b(").append(')').toString());
		}
	}

	public static Language getLanguage(int i, int i_1_) {
		try {
			if (i < 0 || i >= aLanguageArray6635.length)
				return null;
			return aLanguageArray6635[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.d(").append(')').toString());
		}
	}

	Language(String string, String string_2_, String string_3_, ReferenceTable referenceTable, int i, String string_4_) {
		((Language) this).aString6633 = string;
		((Language) this).aString6629 = string_2_;
		((Language) this).anInt6630 = -501302375 * i;
		Locale locale = null;
		if (null != string_4_)
			locale = new Locale(method5753(287861187), string_4_);
		if (null != locale)
			((Language) this).aLocale6634 = locale;
		else
			((Language) this).aLocale6634 = new Locale(method5753(218016567));
	}

	public String toString() {
		try {
			return method5753(-527740170).toLowerCase(Locale.ENGLISH);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.toString(").append(')').toString());
		}
	}

	public Locale method5755(int i) {
		try {
			return ((Language) this).aLocale6634;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.p(").append(')').toString());
		}
	}

	public int method242(int i) {
		try {
			return ((Language) this).anInt6630 * -1719637847;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.f(").append(')').toString());
		}
	}

	public int method244() {
		return ((Language) this).anInt6630 * -1719637847;
	}

	public static Language[] method5756(int i) {
		try {
			return (new Language[] {aLanguage_6632, aLanguage_6626, aLanguage_6628, aLanguage_6625, aLanguage_6624, aLanguage_6627});
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.a(").append(')').toString());
		}
	}

	static final void method5757(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.aClass422_Sub2_7547.method5628((byte) 103) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.ans(").append(')').toString());
		}
	}

	static final void method5758(IComponentDefinition class105, ClientScript2 class403, int i) {
		try {
			if (GameClient.method2801(class105).method3492((byte) -12) && null == GameClient.aClass105_8652) {
				Class117.method1280(class105.interfacehash * -440872681, class105.component * -1309843523, 1723723267);
				GameClient.aClass105_8652 = Class140.method1558(-440872681 * class105.interfacehash, class105.component * -1309843523, -156511736);
				LocalizedString.markComponentForRedraw(GameClient.aClass105_8652, 1608408687);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.cl(").append(')').toString());
		}
	}

	public int method243() {
		return ((Language) this).anInt6630 * -1719637847;
	}

	static final void method5759(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_6_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_5_ - i_6_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.yp(").append(')').toString());
		}
	}

	public static Class25 method5760(short i) {
		try {
			if (Class299.method3682(-1233866115 * GameClient.anInt8752, 1765230881))
				return GameClient.aClass25_8693;
			return GameClient.gameConnection;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.fc(").append(')').toString());
		}
	}

	static final void method5761(GraphicsToolkit class_ra, Interface_ma interface_ma, byte i) {
		try {
			if (null != Class301_Sub1.currentWorldMapArea) {
				TimeUtils.getTime((byte) 1);
				TimeUtils.getTime((byte) 1);
				if (Class301_Sub1.anInt7624 * -1289394455 < 10) {
					if (!Class301_Sub1.worldMapIndex.method2312(Class301_Sub1.currentWorldMapArea.fileName, -2140139718)) {
						Class301_Sub1.anInt7624 = (Class_v.index_23_worldMap.method2305((Class301_Sub1.currentWorldMapArea.fileName), -1210672889)) / 10 * 1078186329;
						return;
					}
					Class318.method3873(16711935);
					Class301_Sub1.anInt7624 = -2103038598;
				}
				if (10 == Class301_Sub1.anInt7624 * -1289394455) {
					Class301_Sub1.mapX = (Class301_Sub1.currentWorldMapArea.anInt9650 * 1364716801) >> 6 << 6;
					Class301_Sub1.mapY = (1345239131 * (Class301_Sub1.currentWorldMapArea.anInt9649) >> 6 << 6);
					Class301_Sub1.worldMapWidth = ((Class301_Sub1.currentWorldMapArea.anInt9647 * -2052483955) >> 6 << 6) - Class301_Sub1.mapX + 64;
					Class301_Sub1.worldMapHeight = 64 + (((Class301_Sub1.currentWorldMapArea.anInt9646) * 929385381 >> 6 << 6) - Class301_Sub1.mapY);
					int[] is = new int[3];
					int i_7_ = -1;
					int i_8_ = -1;
					SceneObjectPosition sceneObjectPosition = (Class287.myPlayer.method4337().aSceneObjectPosition_2599);
					WorldTile worldTile = GameClient.map.getRegionStart(681479919);
					if (Class301_Sub1.currentWorldMapArea.method3453(Class287.myPlayer.plane, (((int) sceneObjectPosition.x >> 9) + -1760580017 * worldTile.x), (283514611 * worldTile.y + ((int) sceneObjectPosition.z >> 9)), is, 46106083)) {
						i_7_ = is[1] - Class301_Sub1.mapX;
						i_8_ = is[2] - Class301_Sub1.mapY;
					}
					if (!Class301_Sub1.aBoolean7631 && i_7_ >= 0 && i_7_ < Class301_Sub1.worldMapWidth && i_8_ >= 0 && i_8_ < Class301_Sub1.worldMapHeight) {
						i_7_ += (int) (Math.random() * 10.0) - 5;
						i_8_ += (int) (Math.random() * 10.0) - 5;
						Class82_Sub14.anInt6875 = i_7_ * -2076584633;
						VarClanSettings.anInt4090 = -435591305 * i_8_;
					} else if (1646852571 * Class301_Sub1.anInt7629 != -1 && -1 != Class301_Sub1.anInt7623 * 679054909) {
						Class301_Sub1.currentWorldMapArea.method3452(1646852571 * Class301_Sub1.anInt7629, Class301_Sub1.anInt7623 * 679054909, is, -1594439812);
						if (null != is) {
							Class82_Sub14.anInt6875 = -2076584633 * (is[1] - Class301_Sub1.mapX);
							VarClanSettings.anInt4090 = ((is[2] - Class301_Sub1.mapY) * -435591305);
						}
						Class301_Sub1.anInt7623 = 1505298155;
						Class301_Sub1.anInt7629 = 1801430445;
						Class301_Sub1.aBoolean7631 = false;
					} else {
						Class301_Sub1.currentWorldMapArea.method3452((Class301_Sub1.currentWorldMapArea.anInt9644) * -1973484731 >> 14 & 0x3fff, -1973484731 * (Class301_Sub1.currentWorldMapArea.anInt9644) & 0x3fff, is, -1810513482);
						Class82_Sub14.anInt6875 = (is[1] - Class301_Sub1.mapX) * -2076584633;
						VarClanSettings.anInt4090 = (is[2] - Class301_Sub1.mapY) * -435591305;
					}
					if ((1110271707 * Class301_Sub1.currentWorldMapArea.anInt9645) == 37) {
						Class301_Sub1.aFloat3233 = 3.0F;
						Class301_Sub1.aFloat3234 = 3.0F;
					} else if ((Class301_Sub1.currentWorldMapArea.anInt9645) * 1110271707 == 50) {
						Class301_Sub1.aFloat3233 = 4.0F;
						Class301_Sub1.aFloat3234 = 4.0F;
					} else if ((Class301_Sub1.currentWorldMapArea.anInt9645) * 1110271707 == 75) {
						Class301_Sub1.aFloat3233 = 6.0F;
						Class301_Sub1.aFloat3234 = 6.0F;
					} else if (1110271707 * (Class301_Sub1.currentWorldMapArea.anInt9645) == 100) {
						Class301_Sub1.aFloat3233 = 8.0F;
						Class301_Sub1.aFloat3234 = 8.0F;
					} else if (1110271707 * (Class301_Sub1.currentWorldMapArea.anInt9645) == 200) {
						Class301_Sub1.aFloat3233 = 16.0F;
						Class301_Sub1.aFloat3234 = 16.0F;
					} else {
						Class301_Sub1.aFloat3233 = 8.0F;
						Class301_Sub1.aFloat3234 = 8.0F;
					}
					Class301_Sub1.anInt3254 = (int) Class301_Sub1.aFloat3233 >> 1;
					Class301_Sub1.aByteArrayArrayArray3229 = IcmpService_Sub1.method6381(Class301_Sub1.anInt3254, 51229796);
					Class225.method2103(65536);
					Class301_Sub1.method3706();
					DiskFile.aLinkedNodeList_5986 = new LinkedNodeList();
					Class301_Sub1.anInt3227 += (int) (Math.random() * 5.0) - 2;
					if (Class301_Sub1.anInt3227 < -8)
						Class301_Sub1.anInt3227 = -8;
					if (Class301_Sub1.anInt3227 > 8)
						Class301_Sub1.anInt3227 = 8;
					Class301_Sub1.anInt3228 += (int) (Math.random() * 5.0) - 2;
					if (Class301_Sub1.anInt3228 < -16)
						Class301_Sub1.anInt3228 = -16;
					if (Class301_Sub1.anInt3228 > 16)
						Class301_Sub1.anInt3228 = 16;
					Class301_Sub1.method3707(interface_ma, (Class301_Sub1.anInt3227 >> 2 << 10), Class301_Sub1.anInt3228 >> 1);
					Class301_Sub1.aWorldMapLabelList_3251.method4119(1024, 256, 303697513);
					Class301_Sub1.mapIconTypeList.method6160(256, 256, -1144646938);
					Class301_Sub1.objectTypeList.method5792(4096, (byte) 82);
					Class472.configLoader.method3825(256, (byte) 85);
					Class301_Sub1.anInt7624 = 88890100;
				} else if (20 == Class301_Sub1.anInt7624 * -1289394455) {
					VarClanTypeList.method6310(true, 1135939269);
					Class301_Sub1.method3699(class_ra, Class301_Sub1.anInt3227, Class301_Sub1.anInt3228);
					Class301_Sub1.anInt7624 = 266670300;
					VarClanTypeList.method6310(true, -167716120);
					Huffman.method1247(1781088902);
				} else if (60 == -1289394455 * Class301_Sub1.anInt7624) {
					if (Class301_Sub1.worldMapIndex.method2295(new StringBuilder().append(Class301_Sub1.currentWorldMapArea.fileName).append("_staticelements").toString(), -400372089)) {
						if (!Class301_Sub1.worldMapIndex.method2312(new StringBuilder().append(Class301_Sub1.currentWorldMapArea.fileName).append("_staticelements").toString(), -2145213052))
							return;
						Class301_Sub1.mapAreaKeys = (Class237.method2192(Class301_Sub1.worldMapIndex, new StringBuilder().append(Class301_Sub1.currentWorldMapArea.fileName).append("_staticelements").toString(), GameClient.isMemberWorld, 565671699));
					} else
						Class301_Sub1.mapAreaKeys = new MapKeys(0);
					Class301_Sub1.method3697();
					Class301_Sub1.anInt7624 = -1836368298;
					VarClanTypeList.method6310(true, -425949519);
					Huffman.method1247(1992969478);
				} else if (70 == -1289394455 * Class301_Sub1.anInt7624) {
					Class381.aClass4_4119 = new Class4(class_ra, 11, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = 1398190689;
					VarClanTypeList.method6310(true, 2032737613);
					Huffman.method1247(1735117784);
				} else if (Class301_Sub1.anInt7624 * -1289394455 == 73) {
					Class255.aClass4_2795 = new Class4(class_ra, 12, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = 337782380;
					VarClanTypeList.method6310(true, -1803108343);
					Huffman.method1247(1554661852);
				} else if (76 == Class301_Sub1.anInt7624 * -1289394455) {
					Class52.aClass4_508 = new Class4(class_ra, 14, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = -722625929;
					VarClanTypeList.method6310(true, 116445632);
					Huffman.method1247(2075393869);
				} else if (79 == -1289394455 * Class301_Sub1.anInt7624) {
					Class414.aClass4_5326 = new Class4(class_ra, 17, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = -1783034238;
					VarClanTypeList.method6310(true, 325987584);
					Huffman.method1247(1544627507);
				} else if (Class301_Sub1.anInt7624 * -1289394455 == 82) {
					Class355.aClass4_6525 = new Class4(class_ra, 19, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = 1451524749;
					VarClanTypeList.method6310(true, -828062204);
					Huffman.method1247(1642218574);
				} else if (Class301_Sub1.anInt7624 * -1289394455 == 85) {
					Class400.aClass4_5224 = new Class4(class_ra, 22, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = 391116440;
					VarClanTypeList.method6310(true, -315961699);
					Huffman.method1247(1825490798);
				} else if (88 == -1289394455 * Class301_Sub1.anInt7624) {
					Class152.aClass4_1594 = new Class4(class_ra, 26, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = -669291869;
					VarClanTypeList.method6310(true, 1357229880);
					Huffman.method1247(1747834568);
				} else {
					Class241.aClass4_2707 = new Class4(class_ra, 30, true, Class52_Sub2_Sub1.aCanvas9079);
					Class301_Sub1.anInt7624 = 444450500;
					VarClanTypeList.method6310(true, 1961372940);
					Huffman.method1247(1885514262);
					System.gc();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rt.bq(").append(')').toString());
		}
	}
}
