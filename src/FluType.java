/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class FluType {
	int anInt5593 = 0;
	public int anInt5594 = 328024129;
	public int saturation;
	public boolean aBoolean5596;
	public int anInt5597 = -381610496;
	public int anInt5598;
	public boolean aBoolean5599 = true;
	public int lightness;
	public int hueMultiplier;

	void method5880(int i, byte i_0_) {
		try {
			double d = (i >> 16 & 0xff) / 256.0;
			double d_1_ = (i >> 8 & 0xff) / 256.0;
			double d_2_ = (i & 0xff) / 256.0;
			double d_3_ = d;
			if (d_1_ < d_3_) {
				d_3_ = d_1_;
			}
			if (d_2_ < d_3_) {
				d_3_ = d_2_;
			}
			double d_4_ = d;
			if (d_1_ > d_4_) {
				d_4_ = d_1_;
			}
			if (d_2_ > d_4_) {
				d_4_ = d_2_;
			}
			double d_5_ = 0.0;
			double d_6_ = 0.0;
			double d_7_ = (d_3_ + d_4_) / 2.0;
			if (d_3_ != d_4_) {
				if (d_7_ < 0.5) {
					d_6_ = (d_4_ - d_3_) / (d_3_ + d_4_);
				}
				if (d_7_ >= 0.5) {
					d_6_ = (d_4_ - d_3_) / (2.0 - d_4_ - d_3_);
				}
				if (d == d_4_) {
					d_5_ = (d_1_ - d_2_) / (d_4_ - d_3_);
				} else if (d_4_ == d_1_) {
					d_5_ = 2.0 + (d_2_ - d) / (d_4_ - d_3_);
				} else if (d_4_ == d_2_) {
					d_5_ = (d - d_1_) / (d_4_ - d_3_) + 4.0;
				}
			}
			d_5_ /= 6.0;
			saturation = (int) (256.0 * d_6_) * 10667035;
			lightness = (int) (d_7_ * 256.0) * -656706385;
			if (saturation * -620399085 < 0) {
				saturation = 0;
			} else if (-620399085 * saturation > (Settings.SNOW ? -255 : 255)) {
				saturation = -1574873371;
			}
			if (656695887 * lightness < 0) {
				lightness = 0;
			} else if (lightness * 656695887 > (Settings.SNOW ? -255 : 255)) {
				lightness = 43596369;
			}
			if (d_7_ > 0.5) {
				hueMultiplier = 1823857443 * (int) (512.0 * (d_6_ * (1.0 - d_7_)));
			} else {
				hueMultiplier = (int) (512.0 * (d_6_ * d_7_)) * 1823857443;
			}
			if (hueMultiplier * -813159285 < 1) {
				hueMultiplier = 1823857443;
			}
			anInt5598 = 599548295 * (int) (hueMultiplier * -813159285 * d_5_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sh.b(").append(')').toString());
		}
	}

	void decode(Packet buffer, int opcode) {
		if (1 == opcode) {
			this.anInt5593 = buffer.g3() * -1369220863;
			method5880(2106435329 * this.anInt5593, (byte) -123);
		} else if (2 == opcode) {
			anInt5594 = buffer.readUnsignedShort() * -328024129;
			if (65535 == anInt5594 * 2012295231) {
				anInt5594 = 328024129;
			}
		} else if (opcode == 3) {
			anInt5597 = (buffer.readUnsignedShort() << 2) * -562782069;
		} else if (4 == opcode) {
			aBoolean5599 = false;
		} else if (5 == opcode) {
			aBoolean5596 = false;
		}
	}

	FluType() {
		aBoolean5596 = true;
	}

	public void decode(Packet buffer) {
		for (;;) {
			int opcode = buffer.readUnsignedByte();
			if (0 == opcode) {
				break;
			}
			decode(buffer, opcode);
		}
	}

	static void method5883(IComponentDefinition class105, Class_ta class_ta, int i, int i_10_, int i_11_, int i_12_,
			Class57 class57, byte i_13_) {
		try {
			if (null != class57) {
				int i_14_;
				if (-863531439 * ObjectDeque.anInt7164 == 2) {
					i_14_ = (int) GameClient.aFloat8949 & 0x3fff;
				} else {
					i_14_ = (int) GameClient.aFloat8949 + GameClient.anInt8801 * 1227356013 & 0x3fff;
				}
				int i_15_ = Math.max(class105.width * -2093041337 / 2, 457937409 * class105.height / 2) + 10;
				int i_16_ = i_12_ * i_12_ + i_11_ * i_11_;
				if (i_16_ <= i_15_ * i_15_) {
					int i_17_ = Class220.SINE[i_14_];
					int i_18_ = Class220.COSINE[i_14_];
					if (2 != ObjectDeque.anInt7164 * -863531439) {
						i_17_ = 256 * i_17_ / (256 + GameClient.anInt8749 * 356727603);
						i_18_ = 256 * i_18_ / (356727603 * GameClient.anInt8749 + 256);
					}
					int i_19_ = i_12_ * i_17_ + i_11_ * i_18_ >> 14;
					int i_20_ = i_18_ * i_12_ - i_11_ * i_17_ >> 14;
					class57.method654(i_19_ + class105.width * -2093041337 / 2 + i - class57.method271() / 2,
							457937409 * class105.height / 2 + i_10_ - i_20_ - class57.method626() / 2, class_ta, i,
							i_10_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sh.t(").append(')').toString());
		}
	}

	static final void method5884(int i, int i_21_) {
		try {
			if (Class378.method4671(i, null, -1926955800)) {
				GameContext.method5578(SpotAnimTypeList.aRSInterfaceArray4165[i].aClass105Array1405, -1, (byte) 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sh.lf(").append(')').toString());
		}
	}

	static final void method5885(ClientScript2 class403, int i) {
		try {
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919
					- 1] = Class95.anInt923 * -2009663223;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sh.ami(").append(')').toString());
		}
	}

	static final void method5886(ClientScript2 class403, short i) {
		try {
			String string = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751)
					* -203050393];
			Class495.method6194(string, 1988988347);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sh.vk(").append(')').toString());
		}
	}

	static final void method5887(IComponentDefinition class105, RSInterface RSInterface, ClientScript2 class403, int i) {
		try {
			class403.anInt5239 -= -1175642067;
			int i_22_ = class403.anIntArray5244[class403.anInt5239 * 681479919]
					- 1;
			int i_23_ = class403.anIntArray5244[681479919 * class403.anInt5239
					+ 1];
			int i_24_ = class403.anIntArray5244[2
					+ 681479919 * class403.anInt5239];
			if (i_22_ < 0 || i_22_ > 9) {
				throw new RuntimeException();
			}
			Class127.method1423(class105, i_22_, i_23_, i_24_, class403, 890851226);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sh.ke(").append(')').toString());
		}
	}
}
