/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class16 {
	boolean aBoolean225;
	int anInt226;
	byte aByte227;
	short aShort228;
	short aShort229;
	byte aByte230;
	short aShort231;
	int anInt232;

	Class16(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_) {
		((Class16) this).anInt226 = 1348854581 * i;
		((Class16) this).aShort229 = (short) i_3_;
		((Class16) this).aShort231 = (short) i_4_;
		((Class16) this).aShort228 = (short) i_5_;
		((Class16) this).aByte230 = (byte) i_6_;
		((Class16) this).aByte227 = (byte) i_7_;
		((Class16) this).aBoolean225 = bool;
		((Class16) this).anInt232 = -44074183 * i_8_;
	}

	public static void method352(int i) {
		try {
			if (null != Class288_Sub1.aClass219_7147)
				Class288_Sub1.aClass219_7147.method2042((byte) -63);
			if (null != Class459.aThread5674) {
				for (;;) {
					try {
						Class459.aThread5674.join();
						break;
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aq.y(").append(')').toString());
		}
	}

	static final void method353(GraphicsToolkit class_ra, int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			class_ra.r(i, i_9_, i + i_10_, i_9_ + i_11_);
			class_ra.method5015(i, i_9_, i_10_, i_11_, -16777216, (byte) 7);
			if (Class301_Sub1.anInt7624 * -1289394455 >= 100) {
				float f = ((float) Class301_Sub1.worldMapHeight / (float) Class301_Sub1.worldMapWidth);
				int i_13_ = i_10_;
				int i_14_ = i_11_;
				if (f < 1.0F)
					i_14_ = (int) (f * (float) i_10_);
				else
					i_13_ = (int) ((float) i_11_ / f);
				i += (i_10_ - i_13_) / 2;
				i_9_ += (i_11_ - i_14_) / 2;
				if (Class274.aClass57_6539 == null || Class274.aClass57_6539.method623() != i_10_ || Class274.aClass57_6539.method625() != i_11_) {
					Class301_Sub1.method3709(Class301_Sub1.mapX, (Class301_Sub1.mapY + Class301_Sub1.worldMapHeight), (Class301_Sub1.mapX + Class301_Sub1.worldMapWidth), Class301_Sub1.mapY, i, i_9_, i_13_ + i, i_14_ + i_9_);
					Class301_Sub1.method3698(class_ra);
					Class274.aClass57_6539 = class_ra.method5033(i, i_9_, i_13_, i_14_, false);
				}
				Class274.aClass57_6539.method645(i, i_9_);
				int i_15_ = (i_13_ * (1484045541 * Class301_Sub1.anInt7625) / Class301_Sub1.worldMapWidth);
				int i_16_ = (1464638883 * Class413.anInt6590 * i_14_ / Class301_Sub1.worldMapHeight);
				int i_17_ = i + (i_13_ * (Class402.anInt5232 * 331474003) / Class301_Sub1.worldMapWidth);
				int i_18_ = i_14_ + i_9_ - (1786832569 * Class261.anInt2825 * i_14_ / Class301_Sub1.worldMapHeight) - i_16_;
				int i_19_ = -1996554240;
				if (GameContext.stellar_dawn == GameClient.aGameContext_8944)
					i_19_ = -1996488705;
				class_ra.drawFilledBox(i_17_, i_18_, i_15_, i_16_, i_19_, 1);
				class_ra.method5019(i_17_, i_18_, i_15_, i_16_, i_19_, 0);
				if (Class137_Sub1.anInt6991 * -1983068885 > 0) {
					int i_20_;
					if (-1581933633 * Class88.anInt810 > 50)
						i_20_ = 500 - Class88.anInt810 * 680266427;
					else
						i_20_ = 680266427 * Class88.anInt810;
					for (WorldMapArea worldMapArea = (WorldMapArea) Class301_Sub1.aLinkedNodeList_3236.method5939(1766612795); null != worldMapArea; worldMapArea = (WorldMapArea) Class301_Sub1.aLinkedNodeList_3236.method5944(49146)) {
						WorldMapLabel worldMapLabel = (Class301_Sub1.aWorldMapLabelList_3251.method4116(-530122905 * worldMapArea.mapAreaId, -1892291274));
						if (!VolumePreference.method5728(worldMapLabel, 1502593597)) {
							if (i_12_ <= 46531020) {
								/* empty */
							}
						} else if (Class301_Sub1.anInt7633 * -271159611 == worldMapArea.mapAreaId * -530122905) {
							int i_21_ = ((i_13_ * (2122110429 * worldMapArea.x) / Class301_Sub1.worldMapWidth) + i);
							int i_22_ = (i_9_ + ((Class301_Sub1.worldMapHeight - worldMapArea.y * -372920341) * i_14_ / Class301_Sub1.worldMapHeight));
							class_ra.method5015(i_21_ - 2, i_22_ - 2, 4, 4, i_20_ << 24 | 0xffff00, (byte) 7);
						} else if (-1 != -484575331 * Class301_Sub1.anInt7630 && (-804513353 * worldMapLabel.anInt3817 == (Class301_Sub1.anInt7630 * -484575331))) {
							int i_23_ = i + (2122110429 * worldMapArea.x * i_13_ / Class301_Sub1.worldMapWidth);
							int i_24_ = ((i_14_ * (Class301_Sub1.worldMapHeight - worldMapArea.y * -372920341) / Class301_Sub1.worldMapHeight) + i_9_);
							class_ra.method5015(i_23_ - 2, i_24_ - 2, 4, 4, i_20_ << 24 | 0xffff00, (byte) 7);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aq.br(").append(')').toString());
		}
	}

	public static Region method354(int i, int i_25_, int i_26_) {
		try {
			Region region = new Region();
			region.anInt3151 = -1780317135;
			region.anInt3152 = 599015853;
			((Region) region).anInt3153 = (1 + i + 5) * -2121339651;
			((Region) region).anInt3154 = (5 + (i_25_ + 1)) * -1973125931;
			region.anIntArrayArray3155 = (new int[843157589 * ((Region) region).anInt3153][((Region) region).anInt3154 * -16196483]);
			region.method2731(-1639552658);
			return region;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aq.a(").append(')').toString());
		}
	}
}
