/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.List;

public abstract class Class98 {
	int anInt946;
	int anInt947;
	int anInt948;
	public static byte[][] aByteArrayArray949;
	static int anInt950;

	Class98(int i, int i_0_, int i_1_) {
		((Class98) this).anInt948 = i * -1209403731;
		((Class98) this).anInt947 = -2125519021 * i_0_;
		((Class98) this).anInt946 = -1733764677 * i_1_;
	}

	abstract void method1046(int i, int i_2_);

	abstract void method1047(int i, int i_3_, byte i_4_);

	abstract void method1048(int i, int i_5_, byte i_6_);

	abstract void method1049(int i, int i_7_);

	abstract void method1050(int i, int i_8_);

	abstract void method1051(int i, int i_9_);

	abstract void method1052(int i, int i_10_);

	abstract void method1053(int i, int i_11_);

	abstract void method1054(int i, int i_12_, byte i_13_);

	static void method1055(GraphicsToolkit class_ra, int i, int i_14_, int i_15_) {
		try {
			if (i >= 0 && i_14_ >= 0 && null != ContextMenu.aClass233_5493) {
				WorldTile worldTile = GameClient.map.getRegionStart(681479919);
				Class233 class233 = class_ra.method5036();
				class_ra.method5182(ContextMenu.aClass233_5493);
				class_ra.method5043(ContextMenu.aClass222_5495);
				class_ra.r(ContextMenu.anInt5489 * -156795795, -2074651333 * ContextMenu.anInt5490, (-156795795 * ContextMenu.anInt5489 + 2125992951 * ContextMenu.anInt5491), (ContextMenu.anInt5490 * -2074651333 + ContextMenu.anInt5492 * 971707205));
				class_ra.method5187(ContextMenu.anInt5489 * -156795795, -2074651333 * ContextMenu.anInt5490, 2125992951 * ContextMenu.anInt5491, 971707205 * ContextMenu.anInt5492);
				class233.method2145(ContextMenu.aClass222_5495);
				class233.method2144(ContextMenu.aClass233_5493);
				class233.method2146();
				int i_16_ = i - ContextMenu.anInt5489 * -156795795;
				int i_17_ = i_14_ - ContextMenu.anInt5490 * -2074651333;
				if (GameClient.map.method2675(-1611682495) != null && (!GameClient.aBoolean8835 || (-112110875 * Node.anInt3192 & 0x40) != 0)) {
					int i_18_ = -1;
					int i_19_ = -1;
					float f = ((float) i_16_ * 2.0F / (float) (ContextMenu.anInt5491 * 2125992951) - 1.0F);
					float f_20_ = ((2.0F * (float) i_17_ / (float) (971707205 * ContextMenu.anInt5492)) - 1.0F);
					class233.method2149(f, f_20_, -1.0F, ContextMenu.aFloatArray5475);
					float f_21_ = (ContextMenu.aFloatArray5475[0] / ContextMenu.aFloatArray5475[3]);
					float f_22_ = (ContextMenu.aFloatArray5475[1] / ContextMenu.aFloatArray5475[3]);
					float f_23_ = (ContextMenu.aFloatArray5475[2] / ContextMenu.aFloatArray5475[3]);
					class233.method2149(f, f_20_, 1.0F, ContextMenu.aFloatArray5475);
					float f_24_ = (ContextMenu.aFloatArray5475[0] / ContextMenu.aFloatArray5475[3]);
					float f_25_ = (ContextMenu.aFloatArray5475[1] / ContextMenu.aFloatArray5475[3]);
					float f_26_ = (ContextMenu.aFloatArray5475[2] / ContextMenu.aFloatArray5475[3]);
					float f_27_ = Js5ConfigGroup.method1312(f_21_, f_22_, f_23_, f_24_, f_25_, f_26_, 4, 1869450178);
					if (f_27_ > 0.0F) {
						float f_28_ = f_24_ - f_21_;
						float f_29_ = f_26_ - f_23_;
						int i_30_ = (int) (f_21_ + f_27_ * f_28_);
						int i_31_ = (int) (f_29_ * f_27_ + f_23_);
						i_18_ = i_30_ + (Class287.myPlayer.getSize() - 1 << 8) >> 9;
						i_19_ = i_31_ + (Class287.myPlayer.getSize() - 1 << 8) >> 9;
						int i_32_ = (Class287.myPlayer.plane);
						if (i_32_ < 3 && ((GameClient.map.method2654(-86337284).flags[1][i_30_ >> 9][i_31_ >> 9]) & 0x2) != 0)
							i_32_++;
					}
					if (-1 != i_18_ && -1 != i_19_) {
						if (GameClient.aBoolean8835 && (-112110875 * Node.anInt3192 & 0x40) != 0) {
							IComponentDefinition class105 = Class140.method1558((Class379.anInt4099 * 1262526353), (392084321 * GameClient.anInt8836), -156511736);
							if (class105 != null)
								Class234.method2174(GameClient.aString8838, new StringBuilder().append(" ").append(Symbol.RIGHT_ARROW).append(" ").toString(), MapDecoder.anInt2704 * 697885143, 59, -1, 0L, i_18_, i_19_, true, false, (long) (i_18_ << 32 | i_19_), true, -1555484950);
							else
								IdentityKitTypeList.method1587((byte) 4);
						} else {
							if (Class396.aBoolean5196)
								Class234.method2174((LocalizedString.ACTION_FACE_HERE.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210)), "", -1, 60, -1, 0L, i_18_, i_19_, true, false, (long) (i_18_ << 32 | i_19_), true, -1698149123);
							Class234.method2174(Class82_Sub6.aString6845, "", GameClient.anInt8822 * -1471730241, 23, -1, 0L, i_18_, i_19_, true, false, (long) (i_18_ << 32 | i_19_), true, -1114825452);
						}
					}
				}
				Class324 class324 = (GameClient.map.method2675(-1611682495).aClass324_3528);
				int i_33_ = i;
				int i_34_ = i_14_;
				List list = class324.aList3448;
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Class335 class335 = (Class335) iterator.next();
					if (!GameClient.aBoolean8674 && ((Class287.myPlayer.plane) != class335.aClass365_Sub1_3616.plane)) {
						if (i_15_ == 202437353) {
							/* empty */
						}
					} else if (!class335.method4084(class_ra, i_33_, i_34_, 1628119840)) {
						if (i_15_ == 202437353)
							break;
					} else {
						boolean bool = false;
						boolean bool_35_ = false;
						int i_36_;
						int i_37_;
						if (class335.aClass365_Sub1_3616 instanceof Class365_Sub1_Sub1) {
							i_36_ = ((Class365_Sub1_Sub1) class335.aClass365_Sub1_3616).aShort9798;
							i_37_ = ((Class365_Sub1_Sub1) class335.aClass365_Sub1_3616).aShort9795;
						} else {
							SceneObjectPosition sceneObjectPosition = (class335.aClass365_Sub1_3616.method4337().aSceneObjectPosition_2599);
							i_36_ = (int) sceneObjectPosition.x >> 9;
							i_37_ = (int) sceneObjectPosition.z >> 9;
						}
						if (class335.aClass365_Sub1_3616 instanceof Player) {
							Player player = ((Player) class335.aClass365_Sub1_3616);
							int i_38_ = player.getSize();
							SceneObjectPosition sceneObjectPosition = (player.method4337().aSceneObjectPosition_2599);
							if ((0 == (i_38_ & 0x1) && 0 == ((int) sceneObjectPosition.x & 0x1ff) && ((int) sceneObjectPosition.z & 0x1ff) == 0) || ((i_38_ & 0x1) == 1 && (((int) sceneObjectPosition.x & 0x1ff) == 256) && 256 == ((int) sceneObjectPosition.z & 0x1ff))) {
								int i_39_ = ((int) sceneObjectPosition.x - (player.getSize() - 1 << 8));
								int i_40_ = ((int) sceneObjectPosition.z - (player.getSize() - 1 << 8));
								for (int i_41_ = 0; i_41_ < -1230451913 * GameClient.npcCount; i_41_++) {
									LinkableObject linkableObject = ((LinkableObject) (GameClient.npcs.get((long) GameClient.npcIndicies[i_41_])));
									if (null == linkableObject) {
										if (i_15_ == 202437353) {
											/* empty */
										}
									} else {
										NPC class365_sub1_sub1_sub2_sub1 = ((NPC) linkableObject.anObject7366);
										if (443738891 * GameClient.anInt8884 != (class365_sub1_sub1_sub2_sub1.anInt10070) * 335731285) {
											if (!class365_sub1_sub1_sub2_sub1.aBoolean10123) {
												if (i_15_ == 202437353) {
													/* empty */
												}
											} else {
												SceneObjectPosition sceneObjectPosition_42_ = (class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599);
												int i_43_ = ((int) (sceneObjectPosition_42_.x) - (((class365_sub1_sub1_sub2_sub1.definition.size) * -2095128707) - 1 << 8));
												int i_44_ = ((int) (sceneObjectPosition_42_.z) - ((-2095128707 * (class365_sub1_sub1_sub2_sub1.definition.size)) - 1 << 8));
												if (i_43_ >= i_39_ && (((class365_sub1_sub1_sub2_sub1.definition.size) * -2095128707) <= ((player.getSize()) - (i_43_ - i_39_ >> 9))) && i_44_ >= i_40_ && (((class365_sub1_sub1_sub2_sub1.definition.size) * -2095128707) <= ((player.getSize()) - (i_44_ - i_40_ >> 9)))) {
													Class140.method1555(class365_sub1_sub1_sub2_sub1, ((Class287.myPlayer.plane) != (class335.aClass365_Sub1_3616.plane)), (byte) -10);
													class365_sub1_sub1_sub2_sub1.anInt10070 = (-339947553 * GameClient.anInt8884);
												}
											}
										}
									}
								}
								int i_45_ = 1168366243 * Class10.anInt129;
								int[] is = Class10.anIntArray135;
								for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
									Player p = (GameClient.players[is[i_46_]]);
									if ((null != p) && (443738891 * GameClient.anInt8884 != (335731285 * (p.anInt10070))) && (player != p)) {
										if (!p.aBoolean10123) {
											if (i_15_ == 202437353)
												return;
										} else {
											SceneObjectPosition sceneObjectPosition_48_ = (p.method4337().aSceneObjectPosition_2599);
											int i_49_ = ((int) (sceneObjectPosition_48_.x) - ((p.getSize()) - 1 << 8));
											int i_50_ = ((int) (sceneObjectPosition_48_.z) - ((p.getSize()) - 1 << 8));
											if (i_49_ >= i_39_ && (p.getSize() <= ((player.getSize()) - (i_49_ - i_39_ >> 9))) && i_50_ >= i_40_ && (p.getSize() <= ((player.getSize()) - (i_50_ - i_40_ >> 9)))) {
												Class298_Sub47.method3535(p, ((Class287.myPlayer.plane) != (class335.aClass365_Sub1_3616.plane)), 875975417);
												p.anInt10070 = (GameClient.anInt8884 * -339947553);
											}
										}
									}
								}
							}
							if (443738891 * GameClient.anInt8884 == 335731285 * (player.anInt10070)) {
								if (i_15_ == 202437353) {
									/* empty */
								}
								continue;
							}
							Class298_Sub47.method3535(player, ((Class287.myPlayer.plane) != class335.aClass365_Sub1_3616.plane), -554283505);
							player.anInt10070 = -339947553 * GameClient.anInt8884;
						}
						if (class335.aClass365_Sub1_3616 instanceof NPC) {
							NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class335.aClass365_Sub1_3616);
							if (null != (class365_sub1_sub1_sub2_sub1.definition)) {
								SceneObjectPosition sceneObjectPosition = (class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599);
								if ((0 == ((-2095128707 * (class365_sub1_sub1_sub2_sub1.definition.size)) & 0x1) && 0 == ((int) sceneObjectPosition.x & 0x1ff) && (((int) sceneObjectPosition.z & 0x1ff) == 0)) || (((-2095128707 * (class365_sub1_sub1_sub2_sub1.definition.size)) & 0x1) == 1 && (((int) sceneObjectPosition.x & 0x1ff) == 256) && (((int) sceneObjectPosition.z & 0x1ff) == 256))) {
									int i_51_ = ((int) sceneObjectPosition.x - (((-2095128707 * (class365_sub1_sub1_sub2_sub1.definition.size)) - 1) << 8));
									int i_52_ = ((int) sceneObjectPosition.z - (((class365_sub1_sub1_sub2_sub1.definition.size) * -2095128707) - 1 << 8));
									for (int i_53_ = 0; (i_53_ < GameClient.npcCount * -1230451913); i_53_++) {
										LinkableObject linkableObject = ((LinkableObject) (GameClient.npcs.get((long) GameClient.npcIndicies[i_53_])));
										if (linkableObject == null) {
											if (i_15_ == 202437353) {
												/* empty */
											}
										} else {
											NPC class365_sub1_sub1_sub2_sub1_54_ = ((NPC) (linkableObject.anObject7366));
											if (((335731285 * (class365_sub1_sub1_sub2_sub1_54_.anInt10070)) != (GameClient.anInt8884 * 443738891)) && (class365_sub1_sub1_sub2_sub1_54_ != class365_sub1_sub1_sub2_sub1)) {
												if (!class365_sub1_sub1_sub2_sub1_54_.aBoolean10123) {
													if (i_15_ == 202437353)
														throw new IllegalStateException();
												} else {
													SceneObjectPosition sceneObjectPosition_55_ = (class365_sub1_sub1_sub2_sub1_54_.method4337().aSceneObjectPosition_2599);
													int i_56_ = ((int) (sceneObjectPosition_55_.x) - (((class365_sub1_sub1_sub2_sub1_54_.definition.size) * -2095128707) - 1 << 8));
													int i_57_ = ((int) (sceneObjectPosition_55_.z) - (((-2095128707 * (class365_sub1_sub1_sub2_sub1_54_.definition.size)) - 1) << 8));
													if (i_56_ >= i_51_ && ((-2095128707 * (class365_sub1_sub1_sub2_sub1_54_.definition.size)) <= (((class365_sub1_sub1_sub2_sub1.definition.size) * -2095128707) - ((i_56_ - i_51_) >> 9))) && i_57_ >= i_52_ && ((-2095128707 * (class365_sub1_sub1_sub2_sub1_54_.definition.size)) <= ((-2095128707 * (class365_sub1_sub1_sub2_sub1.definition.size)) - ((i_57_ - i_52_) >> 9)))) {
														Class140.method1555(class365_sub1_sub1_sub2_sub1_54_, ((class335.aClass365_Sub1_3616.plane) != (Class287.myPlayer.plane)), (byte) -62);
														class365_sub1_sub1_sub2_sub1_54_.anInt10070 = (-339947553 * (GameClient.anInt8884));
													}
												}
											}
										}
									}
									int i_58_ = 1168366243 * Class10.anInt129;
									int[] is = Class10.anIntArray135;
									for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
										Player player = (GameClient.players[is[i_59_]]);
										if ((null != player) && ((335731285 * (player.anInt10070)) != (GameClient.anInt8884 * 443738891))) {
											if (!player.aBoolean10123) {
												if (i_15_ == 202437353)
													return;
											} else {
												SceneObjectPosition sceneObjectPosition_60_ = (player.method4337().aSceneObjectPosition_2599);
												int i_61_ = ((int) (sceneObjectPosition_60_.x) - ((player.getSize()) - 1 << 8));
												int i_62_ = ((int) (sceneObjectPosition_60_.z) - ((player.getSize()) - 1 << 8));
												if (i_61_ >= i_51_ && ((player.getSize()) <= (((class365_sub1_sub1_sub2_sub1.definition.size) * -2095128707) - (i_61_ - i_51_ >> 9))) && i_62_ >= i_52_ && ((player.getSize()) <= ((-2095128707 * (class365_sub1_sub1_sub2_sub1.definition.size)) - (i_62_ - i_52_ >> 9)))) {
													Class298_Sub47.method3535(player, ((class335.aClass365_Sub1_3616.plane) != (Class287.myPlayer.plane)), 1713781703);
													player.anInt10070 = (-339947553 * GameClient.anInt8884);
												}
											}
										}
									}
								}
								if ((class365_sub1_sub1_sub2_sub1.anInt10070 * 335731285) == 443738891 * GameClient.anInt8884) {
									if (i_15_ == 202437353)
										throw new IllegalStateException();
									continue;
								}
								Class140.method1555(class365_sub1_sub1_sub2_sub1, ((Class287.myPlayer.plane) != (class335.aClass365_Sub1_3616.plane)), (byte) -73);
								class365_sub1_sub1_sub2_sub1.anInt10070 = GameClient.anInt8884 * -339947553;
							}
						}
						if (class335.aClass365_Sub1_3616 instanceof Class365_Sub1_Sub4_Sub1) {
							int i_63_ = -1760580017 * worldTile.x + i_36_;
							int i_64_ = 283514611 * worldTile.y + i_37_;
							Class298_Sub2 class298_sub2 = ((Class298_Sub2) (GameClient.groundTiles.get((long) ((class335.aClass365_Sub1_3616.plane) << 28 | i_64_ << 14 | i_63_))));
							if (null != class298_sub2) {
								int i_65_ = 0;
								Class298_Sub12 class298_sub12 = ((Class298_Sub12) class298_sub2.aLinkedNodeList_7166.method5942(-1921101370));
								while (class298_sub12 != null) {
									ItemDefinitions class468 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions((1768239597 * class298_sub12.anInt7257)));
									int i_66_;
									if (class468.aBoolean5771)
										i_66_ = class468.anInt5763 * 292187293;
									else if (class468.aBoolean5731)
										i_66_ = (IdentityKitTypeList.aClass381_1563.anInt4110) * 1295181471;
									else
										i_66_ = 363537303 * (IdentityKitTypeList.aClass381_1563.anInt4117);
									if (GameClient.aBoolean8835 && ((class335.aClass365_Sub1_3616.plane) == (Class287.myPlayer.plane))) {
										Class497 class497 = ((Class132.anInt1508 * 831522399 != -1) ? (Class92.aClass504_905.method6251((Class132.anInt1508 * 831522399), 1640464070)) : null);
										if (0 != ((Node.anInt3192 * -112110875) & 0x1) && (null == class497 || ((class468.method6037((831522399 * Class132.anInt1508), (-388931549 * class497.anInt6100), -2028636758)) != (-388931549 * (class497.anInt6100)))))
											Class234.method2174(GameClient.aString8838, new StringBuilder().append(GameClient.aString8754).append(" ").append(Symbol.RIGHT_ARROW).append(" ").append(Class285.method2709(i_66_, -1803338083)).append(class468.itemName).toString(), (MapDecoder.anInt2704 * 697885143), 17, -1, (long) ((class298_sub12.anInt7257) * 1768239597), i_36_, i_37_, true, false, (long) i_65_, false, -1282887596);
									}
									if (class335.aClass365_Sub1_3616.plane == (Class287.myPlayer.plane)) {
										String[] strings = class468.aStringArray5723;
										for (int i_67_ = strings.length - 1; i_67_ >= 0; i_67_--) {
											if (null != strings[i_67_]) {
												int i_68_ = 0;
												int i_69_ = (GameClient.anInt8690 * 1395924385);
												if (0 == i_67_)
													i_68_ = 18;
												if (i_67_ == 1)
													i_68_ = 19;
												if (i_67_ == 2)
													i_68_ = 20;
												if (3 == i_67_)
													i_68_ = 21;
												if (i_67_ == 4)
													i_68_ = 22;
												if (i_67_ == 5)
													i_68_ = 1004;
												if (i_67_ == (1109145023 * class468.anInt5729))
													i_69_ = (1605315453 * (class468.anInt5725));
												if ((class468.anInt5730 * 693471665) == i_67_)
													i_69_ = (class468.anInt5703 * -1818170233);
												Class234.method2174(strings[i_67_], new StringBuilder().append(Class285.method2709(i_66_, -1300852022)).append(class468.itemName).toString(), i_69_, i_68_, -1, (long) ((class298_sub12.anInt7257) * 1768239597), i_36_, i_37_, true, false, (long) i_65_, false, -1707817875);
											}
										}
									}
									class298_sub12 = ((Class298_Sub12) class298_sub2.aLinkedNodeList_7166.method5947(293661745));
									i_65_++;
								}
							}
						}
						if (class335.aClass365_Sub1_3616 instanceof Interface3) {
							Interface3 interface3 = (Interface3) class335.aClass365_Sub1_3616;
							LocType class432 = (GameClient.map.method2641(-151154213).list(interface3.method32((byte) 32)));
							if (class432.anIntArray5366 != null)
								class432 = class432.method5777((Class128.aClass148_6331), 2026923830);
							if (class432 == null) {
								if (i_15_ == 202437353)
									break;
							} else {
								if (GameClient.aBoolean8835 && (class335.aClass365_Sub1_3616.plane == (Class287.myPlayer.plane))) {
									Class497 class497 = (831522399 * Class132.anInt1508 != -1 ? (Class92.aClass504_905.method6251(Class132.anInt1508 * 831522399, -616098570)) : null);
									if (0 != (Node.anInt3192 * -112110875 & 0x4) && (class497 == null || ((class432.method5776((831522399 * Class132.anInt1508), (class497.anInt6100 * -388931549), (byte) 2)) != (-388931549 * class497.anInt6100))))
										Class234.method2174(GameClient.aString8838, new StringBuilder().append(GameClient.aString8754).append(" ").append(Symbol.RIGHT_ARROW).append(" ").append(Class285.method2709(65535, -1704073338)).append(class432.name).toString(), MapDecoder.anInt2704 * 697885143, 2, -1, RSInterface.method1301(interface3, i_36_, i_37_, 2139321433), i_36_, i_37_, true, false, (long) interface3.hashCode(), false, -978621849);
								}
								if (class335.aClass365_Sub1_3616.plane == (Class287.myPlayer.plane)) {
									String[] strings = class432.aStringArray5394;
									if (strings != null) {
										for (int i_70_ = strings.length - 1; i_70_ >= 0; i_70_--) {
											if (strings[i_70_] != null) {
												int i_71_ = 0;
												int i_72_ = (GameClient.anInt8690 * 1395924385);
												if (0 == i_70_)
													i_71_ = 3;
												if (1 == i_70_)
													i_71_ = 4;
												if (i_70_ == 2)
													i_71_ = 5;
												if (i_70_ == 3)
													i_71_ = 6;
												if (i_70_ == 4)
													i_71_ = 1001;
												if (i_70_ == 5)
													i_71_ = 1002;
												if (i_70_ == (class432.anInt5397 * -1412413471))
													i_72_ = (1501072109 * (class432.anInt5436));
												if (i_70_ == (class432.anInt5398 * 1498416223))
													i_72_ = (class432.anInt5364 * -143998181);
												Class234.method2174(strings[i_70_], new StringBuilder().append(Class285.method2709(65535, -1882925758)).append(class432.name).toString(), i_72_, i_71_, -1, (RSInterface.method1301(interface3, i_36_, i_37_, 2141756436)), i_36_, i_37_, true, false, (long) interface3.hashCode(), false, -1317659949);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dz.e(").append(')').toString());
		}
	}

	static final void method1056(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			int i_73_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			boolean bool = 1 == (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_74_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]);
			boolean bool_75_ = ((((ClientScript2) class403).anIntArray5244[3 + 681479919 * ((ClientScript2) class403).anInt5239]) == 1);
			Class298_Sub32_Sub20.method3263(i_73_, bool, i_74_, bool_75_, 1687031105);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dz.alr(").append(')').toString());
		}
	}

	static int method1057(int i, int i_76_, int i_77_) {
		try {
			int i_78_ = i >> 31 & i_76_ - 1;
			return i_78_ + (i + (i >>> 31)) % i_76_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dz.r(").append(')').toString());
		}
	}

	static void method1058(int i, String string, byte i_79_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(3, (long) i);
			class298_sub37_sub12.method3449((byte) 104);
			((Class298_Sub37_Sub12) class298_sub37_sub12).aString9611 = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dz.ah(").append(')').toString());
		}
	}
}
