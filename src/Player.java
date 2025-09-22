/* Class365_Sub1_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Player extends Entity {
	public int lastAnimationDelay;
	public String username;
	public boolean isMale;
	String overheadSuffix;
	public boolean hidden;
	String overheadPrefix;
	public String displayName;
	public int combatLevel;
	public int skillLevel;
	public boolean isClickable;
	public int animationDelay;
	public int currentHitpoints;
	public int maxHitpoints;
	public boolean isTransforming;
	public int teamId;
	public Class366 appearance;
	public int standAnimation;
	public int walkAnimation;
	public int runAnimation;
	public int turnAnimation;
	public int turnLeftAnimation;
	public int turnRightAnimation;
	int faceDirection;
	public boolean isTeleporting;
	public int teleportX;
	public int teleportY;
	public byte appearanceFlag = 0;
	public int chatIcon;
	public boolean isInCombat;
	public Class70 hitSplatQueue;

	public Player(SceneGraph sceneGraph, int playerIndex) {
		super(sceneGraph, playerIndex);
		skillLevel = -1944760989;
		combatLevel = -218110545;
		maxHitpoints = 0;
		turnAnimation = 0;
		animationDelay = 1031683529;
		currentHitpoints = 0;
		chatIcon = 1530078181;
		isTransforming = false;
		teamId = 0;
		lastAnimationDelay = -361000179;
		standAnimation = -1839540625;
		walkAnimation = -1358158739;
		runAnimation = 1578398049;
		isMale = false;
		turnLeftAnimation = 0;
		turnRightAnimation = -664381027;
		isTeleporting = false;
		isClickable = false;
		hidden = false;
		isInCombat = false;
		hitSplatQueue = new Class70(16);
	}

	public final void sendAppearence(Packet stream, byte i) {
		try {
			stream.pos = 0;
			int flag = stream.readUnsignedByte();
			appearanceFlag = (byte) (flag & 0x1);
			boolean bool = isMale;
			isMale = 0 != (flag & 0x2);
			boolean bool_1_ = (flag & 0x4) != 0;
			int i_2_ = super.getSize();
			updateSize((flag >> 3 & 0x7) + 1, -2030022890);
			boolean bool_3_ = 0 != (flag & 0x40);
			boolean bool_4_ = 0 != (flag & 0x80);
			SceneObjectPosition sceneObjectPosition = SceneObjectPosition.method2005(method4337().aSceneObjectPosition_2599);
			sceneObjectPosition.x += (float) (getSize() - i_2_ << 8);
			sceneObjectPosition.z += (float) (getSize() - i_2_ << 8);
			method4340(sceneObjectPosition);
			sceneObjectPosition.method2006();
			if (bool_3_)
				((Player) this).overheadPrefix = stream.readJagString(681479919);
			else
				((Player) this).overheadPrefix = null;
			if (bool_4_)
				((Player) this).overheadSuffix = stream.readJagString(681479919);
			else
				((Player) this).overheadSuffix = null;
			skillLevel = stream.readByte() * 1944760989;
			combatLevel = stream.readByte() * 218110545;
			hidden = stream.readByte() == 1;
			if (Class242.aReferenceTable_2708 == ReferenceTable.aReferenceTable_6557 && 1806357379 * GameClient.playerRights >= 2)
				hidden = false;
			int i_5_ = -1;
			teamId = 0;
			int[] is = new int[Class82_Sub18.aClass405_6892.anIntArray5267.length];
			Class464[] class464s = (new Class464[Class82_Sub18.aClass405_6892.anIntArray5267.length]);
			ItemDefinitions[] class468s = (new ItemDefinitions[Class82_Sub18.aClass405_6892.anIntArray5267.length]);
			for (int i_6_ = 0; i_6_ < Class82_Sub18.aClass405_6892.anIntArray5267.length; i_6_++) {
				if (1 != Class82_Sub18.aClass405_6892.anIntArray5267[i_6_]) {
					int i_7_ = stream.readUnsignedByte();
					if (0 == i_7_)
						is[i_6_] = 0;
					else {
						int i_8_ = stream.readUnsignedByte();
						int i_9_ = (i_7_ << 8) + i_8_;
						if (i_6_ == 0 && 65535 == i_9_) {
							i_5_ = stream.readBigSmart();
							teamId = (stream.readUnsignedByte() * 1076333291);
							break;
						}
						if (i_9_ >= 32768) {
							i_9_ = Class519.anIntArray6274[i_9_ - 32768];
							is[i_6_] = i_9_ | 0x40000000;
							class468s[i_6_] = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_9_);
							int i_10_ = class468s[i_6_].teamIds * 1832088845;
							if (0 != i_10_)
								teamId = 1076333291 * i_10_;
						} else
							is[i_6_] = i_9_ - 256 | ~0x7fffffff;
					}
				}
			}
			if (-1 == i_5_) {
				int i_11_ = stream.readUnsignedShort();
				int i_12_ = 0;
				for (int i_13_ = 0; (i_13_ < Class82_Sub18.aClass405_6892.anIntArray5267.length); i_13_++) {
					if (0 != (Class82_Sub18.aClass405_6892.anIntArray5267[i_13_])) {
						if (i != 3)
							return;
					} else {
						if ((i_11_ & 1 << i_12_) != 0)
							class464s[i_13_] = ReferenceTable.method4937(class468s[i_13_], stream, (byte) 15);
						i_12_++;
					}
				}
			}
			int[] is_14_ = new int[10];
			for (int i_15_ = 0; i_15_ < 10; i_15_++) {
				int i_16_ = stream.readUnsignedByte();
				if (Class22.aShortArrayArrayArray278.length < 1 || i_16_ < 0 || (i_16_ >= Class22.aShortArrayArrayArray278[i_15_][0].length))
					i_16_ = 0;
				is_14_[i_15_] = i_16_;
			}
			((Player) this).faceDirection = stream.readUnsignedShort() * 148972467;
			displayName = stream.getString();
			username = displayName;
			if (this == Class287.myPlayer)
				RuntimeException_Sub2.aString6305 = displayName;
			maxHitpoints = stream.readUnsignedByte() * 1202458455;
			if (bool_1_) {
				currentHitpoints = stream.readUnsignedShort() * -1214139113;
				if (65535 == 242930343 * currentHitpoints)
					currentHitpoints = 1214139113;
				turnAnimation = maxHitpoints * -1911826885;
				animationDelay = 1031683529;
			} else {
				currentHitpoints = 0;
				turnAnimation = stream.readUnsignedByte() * 1144472333;
				animationDelay = stream.readUnsignedByte() * -1031683529;
				if (255 == animationDelay * 1792775047)
					animationDelay = 1031683529;
			}
			int i_17_ = turnLeftAnimation * 780357347;
			turnLeftAnimation = stream.readUnsignedByte() * -1973000501;
			if (0 != 780357347 * turnLeftAnimation) {
				int i_18_ = lastAnimationDelay * 1728220219;
				int i_19_ = standAnimation * -1304250511;
				int i_20_ = walkAnimation * 1899133595;
				int i_21_ = -978842273 * runAnimation;
				int i_22_ = 933675083 * turnRightAnimation;
				lastAnimationDelay = stream.readUnsignedShort() * 361000179;
				standAnimation = stream.readUnsignedShort() * 1839540625;
				walkAnimation = stream.readUnsignedShort() * 1358158739;
				runAnimation = stream.readUnsignedShort() * -1578398049;
				turnRightAnimation = stream.readUnsignedByte() * -895284893;
				if (isMale != bool || turnLeftAnimation * 780357347 != i_17_ || 1728220219 * lastAnimationDelay != i_18_ || -1304250511 * standAnimation != i_19_ || i_20_ != walkAnimation * 1899133595 || i_21_ != -978842273 * runAnimation || turnRightAnimation * 933675083 != i_22_)
					UnderlayTypeList.method5934(this, (byte) 8);
			} else
				Class_v.method3670(this, (byte) -41);
			if (null == appearance)
				appearance = new Class366();
			int i_23_ = 164936249 * appearance.anInt3974;
			int[] is_24_ = appearance.anIntArray3973;
			appearance.method4546(method4432(-1515602233), is, class464s, is_14_, 1 == appearanceFlag, i_5_, 775068819);
			if (i_23_ != i_5_) {
				sceneObjectPosition = SceneObjectPosition.method2005(method4337().aSceneObjectPosition_2599);
				sceneObjectPosition.x = (float) ((scenePositionXQueue[0] << 9) + (getSize() << 8));
				sceneObjectPosition.z = (float) ((scenePositionYQueue[0] << 9) + (getSize() << 8));
				method4340(sceneObjectPosition);
				sceneObjectPosition.method2006();
			}
			if (GameClient.playerIndex * -442628795 == entityIndex * 1888274983 && null != is_24_) {
				for (int i_25_ = 0; i_25_ < is_14_.length; i_25_++) {
					if (is_24_[i_25_] != is_14_[i_25_]) {
						Class298_Sub32_Sub14.aClass477_9400.method6089(-2137955741);
						break;
					}
				}
			}
			if (((Player) this).clickGeo != null)
				((Player) this).clickGeo.method4220();
			if (spotAnimAnimator.method5819((byte) -68) && outlineDirty) {
				BASType class350 = getDefinition(-244281365);
				if (!class350.method4209(spotAnimAnimator.method5823(1971304294), (byte) -15)) {
					spotAnimAnimator.method5821(-1, -2110667700);
					outlineDirty = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.gf(" + ')');
		}
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.bc(" + ')');
		}
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			if (null == appearance || !buildAppearance(class_ra, 2048, (byte) 12))
				return null;
			Matrix43f class222 = class_ra.method5178();
			Matrix43f class222_26_ = method4347();
			Class235 class235 = method4337();
			int i_27_ = primaryAnim.method4719((byte) 0);
			Class326 class326 = (aSceneGraph_7722.aClass326ArrayArrayArray3516[plane][(int) class235.aSceneObjectPosition_2599.x >> 9][(int) class235.aSceneObjectPosition_2599.z >> 9]);
			if (null != class326 && null != class326.aClass365_Sub1_Sub2_3461) {
				int i_28_ = ((((Player) this).anInt10122 * -661498661) - class326.aClass365_Sub1_Sub2_3461.aShort9801);
				((Player) this).anInt10122 = (int) ((float) (-661498661 * (((Player) this).anInt10122)) - (float) i_28_ / 10.0F) * 1394444115;
			} else
				((Player) this).anInt10122 = (int) ((float) ((((Player) this).anInt10122) * -661498661) - (float) ((((Player) this).anInt10122) * -661498661) / 10.0F) * 1394444115;
			class222.method2070(class222_26_);
			class222.method2064(0.0F, (float) (-20 - (-661498661 * ((Player) this).anInt10122)), 0.0F);
			Class335 class335 = null;
			((Player) this).aBoolean10129 = false;
			if (GraphicsSetup.clientPreferences.characterShadowPreference.method5693(-591782935) == 1) {
				BASType class350 = getDefinition(-97958061);
				if (class350.aBoolean3756 && (164936249 * appearance.anInt3974 == -1 || (Class15.aClass507_224.method6269(appearance.anInt3974 * 164936249, -465726953).aBoolean6165))) {
					Animator animator = ((projectileAnimator.method5819((byte) -70) && projectileAnimator.method5826(-65534)) ? projectileAnimator : null);
					Animator animator_29_ = ((spotAnimAnimator.method5819((byte) -61) && (!outlineDirty || animator == null)) ? spotAnimAnimator : null);
					ModelPart modelPart = (GameMap.method2678(class_ra, i_27_, -155466425 * (((Player) this).anInt10097), -197572281 * (((Player) this).anInt10073), -104151209 * (((Player) this).anInt10074), 1, modelParts[0], 0, 0, 160, 240, animator_29_ != null ? animator_29_ : animator, 1812843484));
					if (null != modelPart) {
						if (null == aClass302_Sub1Array7726 || (aClass302_Sub1Array7726.length < 1 + modelParts.length))
							method4362(modelParts.length + 1, -1332935516);
						class335 = Class73.method818(true, 1694437358);
						((Player) this).aBoolean10129 = true;
						class_ra.RA(false);
						modelPart.method4739(class222, (aClass302_Sub1Array7726[modelParts.length]), 0);
						class_ra.RA(true);
					}
				}
			}
			if (this == Class287.myPlayer) {
				for (int i_30_ = GameClient.hintIcons.length - 1; i_30_ >= 0; i_30_--) {
					HintIcon hintIcon = GameClient.hintIcons[i_30_];
					if (null != hintIcon && hintIcon.anInt263 * 408071539 != -1) {
						if (958933333 * hintIcon.anInt266 == 1) {
							LinkableObject linkableObject = ((LinkableObject) (GameClient.npcs.get((long) (-841622081 * hintIcon.anInt256))));
							if (null != linkableObject) {
								NPC class365_sub1_sub1_sub2_sub1 = ((NPC) linkableObject.anObject7366);
								SceneObjectPosition sceneObjectPosition = (SceneObjectPosition.method2011(class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599, Class287.myPlayer.method4337().aSceneObjectPosition_2599));
								int i_31_ = (int) sceneObjectPosition.x;
								int i_32_ = (int) sceneObjectPosition.z;
								drawIcons(class_ra, class222, modelParts[0], (long) i_31_, (long) i_32_, hintIcon.anInt263 * 408071539, 92160000L);
							}
						}
						if (2 == hintIcon.anInt266 * 958933333) {
							SceneObjectPosition sceneObjectPosition = (Class287.myPlayer.method4337().aSceneObjectPosition_2599);
							long l = (long) (-1338192389 * hintIcon.anInt260 - (int) sceneObjectPosition.x);
							long l_33_ = (long) (hintIcon.anInt261 * 1018128075 - (int) sceneObjectPosition.z);
							long l_34_ = (long) (2140036693 * hintIcon.anInt257 << 9);
							l_34_ *= l_34_;
							drawIcons(class_ra, class222, modelParts[0], l, l_33_, 408071539 * hintIcon.anInt263, l_34_);
						}
						if (10 == hintIcon.anInt266 * 958933333 && -841622081 * hintIcon.anInt256 >= 0 && (-841622081 * hintIcon.anInt256 < (GameClient.players).length)) {
							Player player_35_ = (GameClient.players[hintIcon.anInt256 * -841622081]);
							if (player_35_ != null) {
								SceneObjectPosition sceneObjectPosition = (SceneObjectPosition.method2011(player_35_.method4337().aSceneObjectPosition_2599, Class287.myPlayer.method4337().aSceneObjectPosition_2599));
								int i_36_ = (int) sceneObjectPosition.x;
								int i_37_ = (int) sceneObjectPosition.z;
								drawIcons(class_ra, class222, modelParts[0], (long) i_36_, (long) i_37_, 408071539 * hintIcon.anInt263, 92160000L);
							}
						}
					}
				}
			}
			class222.method2070(class222_26_);
			class222.method2064(0.0F, (float) (-5 - (-661498661 * ((Player) this).anInt10122)), 0.0F);
			if (null == aClass302_Sub1Array7726 || aClass302_Sub1Array7726.length < modelParts.length)
				method4362(modelParts.length, 1335663590);
			if (class335 == null)
				class335 = Class73.method818(true, 1293324019);
			method4445(class_ra, modelParts, class222, false, 482140235);
			for (int i_38_ = 0; i_38_ < modelParts.length; i_38_++) {
				if (modelParts[i_38_] != null)
					modelParts[i_38_].method4739(class222, aClass302_Sub1Array7726[i_38_], (this == Class287.myPlayer ? 1 : 0));
			}
			if (null != ((Player) this).clickGeo) {
				Class69 class69 = ((Player) this).clickGeo.method4229();
				class_ra.method5042(class69);
			}
			for (int i_39_ = 0; i_39_ < modelParts.length; i_39_++) {
				if (null != modelParts[i_39_])
					((Player) this).aBoolean10129 |= modelParts[i_39_].i();
				modelParts[i_39_] = null;
			}
			lastUpdateTick = GameClient.anInt8777 * -815465993;
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.bo(" + ')');
		}
	}

	int method4438() {
		return ((Player) this).faceDirection * 613696379;
	}

	void drawIcons(GraphicsToolkit class_ra, Matrix43f class222, ModelPart modelPart, long l, long l_40_, int i, long l_41_) {
		try {
			long l_42_ = l * l + l_40_ * l_40_;
			if (l_42_ >= 262144L && l_42_ <= l_41_) {
				int i_43_ = ((int) ((Math.atan2((double) l, (double) l_40_) * 2607.5945876176133) - (double) primaryAnim.method4719((byte) 0)) & 0x3fff);
				ModelPart modelPart_44_ = (Class219.method2044(class_ra, i_43_, (((Player) this).anInt10097 * -155466425), (-197572281 * ((Player) this).anInt10073), (((Player) this).anInt10074 * -104151209), i, -2134746538));
				if (modelPart_44_ != null) {
					class_ra.RA(false);
					modelPart_44_.method4739(class222, null, 0);
					class_ra.RA(true);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.gb(" + ')');
		}
	}

	boolean buildAppearance(GraphicsToolkit class_ra, int i, byte i_45_) {
		try {
			int i_46_ = i;
			BASType class350 = getDefinition(1841046440);
			Animator animator = ((projectileAnimator.method5819((byte) -54) && !projectileAnimator.method5826(-65534)) ? projectileAnimator : null);
			Animator animator_47_ = ((spotAnimAnimator.method5819((byte) -28) && !isTransforming && (!outlineDirty || animator == null)) ? spotAnimAnimator : null);
			int i_48_ = class350.anInt3735 * 250567115;
			int i_49_ = 1110265995 * class350.anInt3736;
			if (i_48_ != 0 || 0 != i_49_ || class350.anInt3748 * 1185872679 != 0 || 0 != -330229359 * class350.anInt3751)
				i |= 0x7;
			int i_50_ = primaryAnim.method4719((byte) 0);
			boolean bool = (0 != walkStyle && 443738891 * GameClient.anInt8884 >= anInt10105 * 1920148979 && 443738891 * GameClient.anInt8884 < 1953154657 * anInt10106);
			if (bool)
				i |= 0x80000;
			ModelPart modelPart = (modelParts[0] = (appearance.method4545(class_ra, i, Class94.aClass349_913, Class212.aIdentityKitTypeList_2433, Class15.aClass507_224, Class298_Sub32_Sub14.aClass477_9400, Class501.aClass395_6122, Class128.aClass148_6331, animator, animator_47_, aClass438_Sub2_Sub1Array10112, turnQueue, i_50_, true, Class82_Sub18.aClass405_6892, 1284357526)));
			int i_51_ = Class297.method2836((byte) 1);
			if (GameShell.maximumMemory * 1126040225 < 96 && i_51_ > 50)
				Class234.method2183(-824617958);
			if (Class242.aReferenceTable_2708 != ReferenceTable.aReferenceTable_6557 && i_51_ < 50) {
				int i_52_;
				for (i_52_ = 50 - i_51_; i_52_ > -837572863 * GameClient.anInt8677; GameClient.anInt8677 += 836589825)
					Class98.aByteArrayArray949[GameClient.anInt8677 * -837572863] = new byte[102400];
				while (i_52_ < -837572863 * GameClient.anInt8677) {
					GameClient.anInt8677 -= 836589825;
					Class98.aByteArrayArray949[-837572863 * GameClient.anInt8677] = null;
				}
			} else if (ReferenceTable.aReferenceTable_6557 != Class242.aReferenceTable_2708) {
				Class98.aByteArrayArray949 = new byte[50][];
				GameClient.anInt8677 = 0;
			}
			if (modelPart == null)
				return false;
			((Player) this).elevationOffset = modelPart.YA() * -49760597;
			modelPart.n();
			applyModelRotation(modelPart, 839093609);
			if (i_48_ != 0 || 0 != i_49_) {
				updateOrientationVectors(i_50_, i_48_, i_49_, class350.anInt3734 * -947990311, 1869548445 * class350.anInt3740, 1427427127);
				if ((((Player) this).anInt10097 * -155466425) != 0)
					modelPart.t(-155466425 * ((Player) this).anInt10097);
				if ((((Player) this).anInt10073 * -197572281) != 0)
					modelPart.EA((((Player) this).anInt10073) * -197572281);
				if (0 != (-104151209 * ((Player) this).anInt10074))
					modelPart.ia(0, -104151209 * ((Player) this).anInt10074, 0);
			} else
				updateOrientationVectors(i_50_, getSize() << 9, getSize() << 9, 0, 0, 1352604124);
			if (bool)
				modelPart.PA(aByte10117, aByte10108, aByte10109, walkStyle & 0xff);
			if (!isTransforming)
				applyGraphicsEffects(class_ra, class350, i_46_, i_48_, i_49_, i_50_, 1438640232);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.gx(" + ')');
		}
	}

	public String getFullName(boolean bool, int i) {
		try {
			String string = "";
			if (((Player) this).overheadPrefix != null)
				string = ((Player) this).overheadPrefix;
			if (bool)
				string = string + displayName;
			else
				string = string + username;
			if (null != ((Player) this).overheadSuffix)
				string = string + ((Player) this).overheadSuffix;
			return string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.gk(" + ')');
		}
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		return null;
	}

	public final void resetPosition(int i, int i_53_, byte i_54_, int i_55_) {
		try {
			if (projectileAnimator.method5819((byte) -119) && (projectileAnimator.method5820(1546485881).anInt4189 * -882531177) == 1) {
				anIntArray10093 = null;
				projectileAnimator.method5821(-1, -1739646413);
			}
			for (int i_56_ = 0; i_56_ < currentGraphics.length; i_56_++) {
				if (-1 != currentGraphics[i_56_].id * -967533709) {
					Class398 class398 = (Class158_Sub1.aSpotAnimTypeList_8568.method4857(-967533709 * currentGraphics[i_56_].id, -1891757366));
					if (class398.aBoolean5215 && 1505778629 * class398.anInt5205 != -1 && (Class501.aClass395_6122.method4903(class398.anInt5205 * 1505778629, (byte) 83).anInt4189) * -882531177 == 1) {
						currentGraphics[i_56_].aAnimator_569.method5821(-1, -1843943010);
						currentGraphics[i_56_].id = -1313669563;
					}
				}
			}
			chatIcon = 1530078181;
			if (i < 0 || i >= GameClient.map.upperX(-1987519551) || i_53_ < 0 || i_53_ >= GameClient.map.upperY(1479162339))
				method4472(i, i_53_, -2049230528);
			else if (scenePositionXQueue[0] < 0 || (scenePositionXQueue[0] >= GameClient.map.upperX(-1906686754)) || scenePositionYQueue[0] < 0 || (scenePositionYQueue[0] >= GameClient.map.upperY(-964068282)))
				method4472(i, i_53_, -2022261810);
			else {
				if (MovementType.aMovementType_6541.type == i_54_)
					Class303.method3737(this, i, i_53_, MovementType.aMovementType_6541.type, (byte) 98);
				step(i, i_53_, i_54_, (byte) 94);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.gy(" + ')');
		}
	}

	public void method4472(int i, int i_57_, int i_58_) {
		try {
			moveQueueSize = 0;
			anInt10125 = 0;
			anInt10124 = 0;
			scenePositionXQueue[0] = i;
			scenePositionYQueue[0] = i_57_;
			int i_59_ = getSize();
			SceneObjectPosition sceneObjectPosition = SceneObjectPosition.method2005(method4337().aSceneObjectPosition_2599);
			sceneObjectPosition.x = (float) (256 * i_59_ + scenePositionXQueue[0] * 512);
			sceneObjectPosition.z = (float) (i_59_ * 256 + scenePositionYQueue[0] * 512);
			method4340(sceneObjectPosition);
			sceneObjectPosition.method2006();
			if (this == Class287.myPlayer)
				GameClient.map.method2640((byte) 35).forceUpdate(-1515011512);
			if (null != ((Player) this).clickGeo)
				((Player) this).clickGeo.method4220();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.gu(" + ')');
		}
	}

	public final void step(int i, int i_60_, byte i_61_, byte i_62_) {
		try {
			if (2050671733 * moveQueueSize < scenePositionXQueue.length - 1)
				moveQueueSize += -1013322787;
			for (int i_63_ = 2050671733 * moveQueueSize; i_63_ > 0; i_63_--) {
				scenePositionXQueue[i_63_] = scenePositionXQueue[i_63_ - 1];
				scenePositionYQueue[i_63_] = scenePositionYQueue[i_63_ - 1];
				moveDir[i_63_] = moveDir[i_63_ - 1];
			}
			scenePositionXQueue[0] = i;
			scenePositionYQueue[0] = i_60_;
			moveDir[0] = i_61_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.gh(" + ')');
		}
	}

	final void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_64_, int i_65_, boolean bool) {
		throw new IllegalStateException();
	}

	public int getSize() {
		try {
			if (null != appearance && -1 != appearance.anInt3974 * 164936249)
				return ((Class15.aClass507_224.method6269(164936249 * appearance.anInt3974, 1333509149).size) * -2095128707);
			return super.getSize();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.q(" + ')');
		}
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		return null;
	}

	public int getAnimId(byte i) {
		try {
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.h(" + ')');
		}
	}

	public void method4474(String string, int i, int i_66_, int i_67_) {
		try {
			method4430(string, i, i_66_, (Class82_Sub5.method883((byte) 6) * (453178367 * HashTable.aClass371_5520.anInt4037)), (byte) -79);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.gz(" + ')');
		}
	}

	final boolean method4366(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.bw(" + ')');
		}
	}

	final void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_68_, int i_69_, boolean bool, int i_70_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.bk(" + ')');
		}
	}

	final void method4398(byte i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.bq(" + ')');
		}
	}

	public boolean method4429(byte i) {
		try {
			return HashTable.aClass371_5520.aBoolean4043;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.by(" + ')');
		}
	}

	public String getDisplayName(boolean bool, byte i) {
		try {
			if (bool)
				return displayName;
			return username;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.gr(" + ')');
		}
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_71_) {
		if (null == appearance || !buildAppearance(class_ra, 131072, (byte) -3))
			return false;
		Matrix43f class222 = method4347();
		boolean bool = false;
		for (int i_72_ = 0; i_72_ < modelParts.length; i_72_++) {
			if (modelParts[i_72_] != null && modelParts[i_72_].method4787(i, i_71_, class222, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_73_ = 0; i_73_ < modelParts.length; i_73_++)
			modelParts[i_73_] = null;
		return bool;
	}

	final boolean method4387() {
		return false;
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		if (null == appearance || !buildAppearance(class_ra, 2048, (byte) 38))
			return null;
		Matrix43f class222 = class_ra.method5178();
		Matrix43f class222_74_ = method4347();
		Class235 class235 = method4337();
		int i = primaryAnim.method4719((byte) 0);
		Class326 class326 = (aSceneGraph_7722.aClass326ArrayArrayArray3516[plane][(int) class235.aSceneObjectPosition_2599.x >> 9][(int) class235.aSceneObjectPosition_2599.z >> 9]);
		if (null != class326 && null != class326.aClass365_Sub1_Sub2_3461) {
			int i_75_ = ((((Player) this).anInt10122 * -661498661) - class326.aClass365_Sub1_Sub2_3461.aShort9801);
			((Player) this).anInt10122 = (int) ((float) (-661498661 * (((Player) this).anInt10122)) - (float) i_75_ / 10.0F) * 1394444115;
		} else
			((Player) this).anInt10122 = (int) ((float) ((((Player) this).anInt10122) * -661498661) - (float) ((((Player) this).anInt10122) * -661498661) / 10.0F) * 1394444115;
		class222.method2070(class222_74_);
		class222.method2064(0.0F, (float) (-20 - (-661498661 * ((Player) this).anInt10122)), 0.0F);
		Class335 class335 = null;
		((Player) this).aBoolean10129 = false;
		if (GraphicsSetup.clientPreferences.characterShadowPreference.method5693(-1650118723) == 1) {
			BASType class350 = getDefinition(-231420914);
			if (class350.aBoolean3756 && (164936249 * appearance.anInt3974 == -1 || (Class15.aClass507_224.method6269(appearance.anInt3974 * 164936249, -824172978).aBoolean6165))) {
				Animator animator = ((projectileAnimator.method5819((byte) -76) && projectileAnimator.method5826(-65534)) ? projectileAnimator : null);
				Animator animator_76_ = ((spotAnimAnimator.method5819((byte) -39) && (!outlineDirty || animator == null)) ? spotAnimAnimator : null);
				ModelPart modelPart = (GameMap.method2678(class_ra, i, (-155466425 * ((Player) this).anInt10097), (-197572281 * ((Player) this).anInt10073), (-104151209 * ((Player) this).anInt10074), 1, modelParts[0], 0, 0, 160, 240, animator_76_ != null ? animator_76_ : animator, 1812843484));
				if (null != modelPart) {
					if (null == aClass302_Sub1Array7726 || (aClass302_Sub1Array7726.length < 1 + modelParts.length))
						method4362(modelParts.length + 1, -1158693755);
					class335 = Class73.method818(true, 1781263344);
					((Player) this).aBoolean10129 = true;
					class_ra.RA(false);
					modelPart.method4739(class222, (aClass302_Sub1Array7726[modelParts.length]), 0);
					class_ra.RA(true);
				}
			}
		}
		if (this == Class287.myPlayer) {
			for (int i_77_ = GameClient.hintIcons.length - 1; i_77_ >= 0; i_77_--) {
				HintIcon hintIcon = GameClient.hintIcons[i_77_];
				if (null != hintIcon && hintIcon.anInt263 * 408071539 != -1) {
					if (958933333 * hintIcon.anInt266 == 1) {
						LinkableObject linkableObject = ((LinkableObject) (GameClient.npcs.get((long) (-841622081 * hintIcon.anInt256))));
						if (null != linkableObject) {
							NPC class365_sub1_sub1_sub2_sub1 = ((NPC) linkableObject.anObject7366);
							SceneObjectPosition sceneObjectPosition = (SceneObjectPosition.method2011((class365_sub1_sub1_sub2_sub1.method4337().aSceneObjectPosition_2599), Class287.myPlayer.method4337().aSceneObjectPosition_2599));
							int i_78_ = (int) sceneObjectPosition.x;
							int i_79_ = (int) sceneObjectPosition.z;
							drawIcons(class_ra, class222, modelParts[0], (long) i_78_, (long) i_79_, hintIcon.anInt263 * 408071539, 92160000L);
						}
					}
					if (2 == hintIcon.anInt266 * 958933333) {
						SceneObjectPosition sceneObjectPosition = (Class287.myPlayer.method4337().aSceneObjectPosition_2599);
						long l = (long) (-1338192389 * hintIcon.anInt260 - (int) sceneObjectPosition.x);
						long l_80_ = (long) (hintIcon.anInt261 * 1018128075 - (int) sceneObjectPosition.z);
						long l_81_ = (long) (2140036693 * hintIcon.anInt257 << 9);
						l_81_ *= l_81_;
						drawIcons(class_ra, class222, modelParts[0], l, l_80_, 408071539 * hintIcon.anInt263, l_81_);
					}
					if (10 == hintIcon.anInt266 * 958933333 && -841622081 * hintIcon.anInt256 >= 0 && (-841622081 * hintIcon.anInt256 < (GameClient.players).length)) {
						Player player_82_ = (GameClient.players[hintIcon.anInt256 * -841622081]);
						if (player_82_ != null) {
							SceneObjectPosition sceneObjectPosition = (SceneObjectPosition.method2011(player_82_.method4337().aSceneObjectPosition_2599, Class287.myPlayer.method4337().aSceneObjectPosition_2599));
							int i_83_ = (int) sceneObjectPosition.x;
							int i_84_ = (int) sceneObjectPosition.z;
							drawIcons(class_ra, class222, modelParts[0], (long) i_83_, (long) i_84_, 408071539 * hintIcon.anInt263, 92160000L);
						}
					}
				}
			}
		}
		class222.method2070(class222_74_);
		class222.method2064(0.0F, (float) (-5 - (-661498661 * ((Player) this).anInt10122)), 0.0F);
		if (null == aClass302_Sub1Array7726 || aClass302_Sub1Array7726.length < modelParts.length)
			method4362(modelParts.length, 984553269);
		if (class335 == null)
			class335 = Class73.method818(true, 1891741263);
		method4445(class_ra, modelParts, class222, false, -135783625);
		for (int i_85_ = 0; i_85_ < modelParts.length; i_85_++) {
			if (modelParts[i_85_] != null)
				modelParts[i_85_].method4739(class222, aClass302_Sub1Array7726[i_85_], (this == Class287.myPlayer ? 1 : 0));
		}
		if (null != ((Player) this).clickGeo) {
			Class69 class69 = ((Player) this).clickGeo.method4229();
			class_ra.method5042(class69);
		}
		for (int i_86_ = 0; i_86_ < modelParts.length; i_86_++) {
			if (null != modelParts[i_86_])
				((Player) this).aBoolean10129 |= modelParts[i_86_].i();
			modelParts[i_86_] = null;
		}
		lastUpdateTick = GameClient.anInt8777 * -815465993;
		return class335;
	}

	void method4371(GraphicsToolkit class_ra) {
		if (null != appearance && (((Player) this).aBoolean10128 || buildAppearance(class_ra, 0, (byte) 83))) {
			Matrix43f class222 = class_ra.method5178();
			class222.method2054(method4337());
			class222.method2064(0.0F, -5.0F, 0.0F);
			method4445(class_ra, modelParts, class222, ((Player) this).aBoolean10128, -639077471);
			for (int i = 0; i < modelParts.length; i++)
				modelParts[i] = null;
		}
	}

	public OverheadString method4437(int i) {
		try {
			if (null != ((Player) this).overheadString) {
				if (null == ((OverheadString) (((Player) this).overheadString)).aString608)
					return null;
				if (0 == GameClient.anInt8837 * -1168328513 || -1168328513 * GameClient.anInt8837 == 3 || (GameClient.anInt8837 * -1168328513 == 1 && VarClientTypeList.method6192(username, -1511804216)))
					return (((Player) this).overheadString);
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.bl(" + ')');
		}
	}

	public Player(SceneGraph sceneGraph) {
		super(sceneGraph);
		skillLevel = -1944760989;
		combatLevel = -218110545;
		maxHitpoints = 0;
		turnAnimation = 0;
		animationDelay = 1031683529;
		currentHitpoints = 0;
		chatIcon = 1530078181;
		isTransforming = false;
		teamId = 0;
		lastAnimationDelay = -361000179;
		standAnimation = -1839540625;
		walkAnimation = -1358158739;
		runAnimation = 1578398049;
		isMale = false;
		turnLeftAnimation = 0;
		turnRightAnimation = -664381027;
		isTeleporting = false;
		isClickable = false;
		hidden = false;
		isInCombat = false;
		hitSplatQueue = new Class70(16);
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_87_) {
		if (null == appearance || !buildAppearance(class_ra, 131072, (byte) -89))
			return false;
		Matrix43f class222 = method4347();
		boolean bool = false;
		for (int i_88_ = 0; i_88_ < modelParts.length; i_88_++) {
			if (modelParts[i_88_] != null && modelParts[i_88_].method4787(i, i_87_, class222, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_89_ = 0; i_89_ < modelParts.length; i_89_++)
			modelParts[i_89_] = null;
		return bool;
	}

	final void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_90_, int i_91_, boolean bool) {
		throw new IllegalStateException();
	}

	int method4446() {
		return ((Player) this).faceDirection * 613696379;
	}

	final void method4377() {
		throw new IllegalStateException();
	}

	public int method4476() {
		if (null != appearance && -1 != appearance.anInt3974 * 164936249)
			return ((Class15.aClass507_224.method6269(164936249 * appearance.anInt3974, 1538306428).size) * -2095128707);
		return super.getSize();
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_92_, byte i_93_) {
		try {
			if (null == appearance || !buildAppearance(class_ra, 131072, (byte) 31))
				return false;
			Matrix43f class222 = method4347();
			boolean bool = false;
			for (int i_94_ = 0; i_94_ < modelParts.length; i_94_++) {
				if (modelParts[i_94_] != null && modelParts[i_94_].method4787(i, i_92_, class222, true, 0)) {
					bool = true;
					break;
				}
			}
			for (int i_95_ = 0; i_95_ < modelParts.length; i_95_++)
				modelParts[i_95_] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.bu(" + ')');
		}
	}

	public boolean method4452() {
		return HashTable.aClass371_5520.aBoolean4043;
	}

	int method4447() {
		return ((Player) this).faceDirection * 613696379;
	}

	final boolean method4384() {
		return false;
	}

	int method4448() {
		return ((Player) this).faceDirection * 613696379;
	}

	public int method4449() {
		return -1;
	}

	public final boolean method4477(int i) {
		try {
			if (appearance == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.ga(" + ')');
		}
	}

	final boolean method4400() {
		return false;
	}

	final boolean method4386() {
		return false;
	}

	void method4373(GraphicsToolkit class_ra) {
		if (null != appearance && (((Player) this).aBoolean10128 || buildAppearance(class_ra, 0, (byte) -3))) {
			Matrix43f class222 = class_ra.method5178();
			class222.method2054(method4337());
			class222.method2064(0.0F, -5.0F, 0.0F);
			method4445(class_ra, modelParts, class222, ((Player) this).aBoolean10128, -758371208);
			for (int i = 0; i < modelParts.length; i++)
				modelParts[i] = null;
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			if (null != appearance && (((Player) this).aBoolean10128 || buildAppearance(class_ra, 0, (byte) 34))) {
				Matrix43f class222 = class_ra.method5178();
				class222.method2054(method4337());
				class222.method2064(0.0F, -5.0F, 0.0F);
				method4445(class_ra, modelParts, class222, ((Player) this).aBoolean10128, 1138059762);
				for (int i_96_ = 0; i_96_ < modelParts.length; i_96_++)
					modelParts[i_96_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.bb(" + ')');
		}
	}

	int method4432(int i) {
		try {
			return (((Player) this).faceDirection * 613696379);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "akm.t(" + ')');
		}
	}

	public OverheadString method4443() {
		if (null != ((Player) this).overheadString) {
			if (null == ((OverheadString) (((Player) this).overheadString)).aString608)
				return null;
			if (0 == GameClient.anInt8837 * -1168328513 || -1168328513 * GameClient.anInt8837 == 3 || (GameClient.anInt8837 * -1168328513 == 1 && VarClientTypeList.method6192(username, -1800657283)))
				return ((Player) this).overheadString;
		}
		return null;
	}

	public boolean isClickable() {
		return HashTable.aClass371_5520.aBoolean4043;
	}

	final void method4378() {
		throw new IllegalStateException();
	}

	public int method4478() {
		if (null != appearance && -1 != appearance.anInt3974 * 164936249)
			return ((Class15.aClass507_224.method6269(164936249 * appearance.anInt3974, 662796254).size) * -2095128707);
		return super.getSize();
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_97_) {
		if (null == appearance || !buildAppearance(class_ra, 131072, (byte) -34))
			return false;
		Matrix43f class222 = method4347();
		boolean bool = false;
		for (int i_98_ = 0; i_98_ < modelParts.length; i_98_++) {
			if (modelParts[i_98_] != null && modelParts[i_98_].method4787(i, i_97_, class222, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_99_ = 0; i_99_ < modelParts.length; i_99_++)
			modelParts[i_99_] = null;
		return bool;
	}
}
