/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimFrame {
	int anInt925;
	static short[] aShortArray926;
	static short[] aShortArray927 = new short[500];
	static short[] aShortArray928;
	static short[] aShortArray929;
	short[] aShortArray930;
	AnimBase aClass298_Sub15_931 = null;
	static short[] aShortArray932;
	short[] aShortArray933;
	short[] aShortArray934;
	static int anInt935 = 2;
	short[] aShortArray936;
	short[] aShortArray937;
	byte[] aByteArray938;
	boolean aBoolean939;
	boolean aBoolean940;
	boolean aBoolean941;
	static int anInt942 = 1;
	static int anInt943 = 2;
	static byte[] aByteArray944;

	AnimFrame(byte[] is, AnimBase base, boolean osrs) {
		anInt925 = 0;
		aBoolean939 = false;
		aBoolean940 = false;
		aBoolean941 = false;
		aClass298_Sub15_931 = base;
		try {
			Packet tbuffer = new Packet(is);
			Packet ibuffer = new Packet(is);
			if (!osrs) {
				tbuffer.readUnsignedByte();
			}
			tbuffer.pos += 232826622;
			int i = tbuffer.readUnsignedByte();
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = -1;
			ibuffer.pos = (tbuffer.pos * 385051775 + i) * 116413311;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				int i_5_ = aClass298_Sub15_931.transforms[i_4_];
				if (i_5_ == 0) {
					i_2_ = i_4_;
				}
				int i_6_ = tbuffer.readUnsignedByte();
				if (i_6_ > 0) {
					if (i_5_ == 0) {
						i_3_ = i_4_;
					}
					aShortArray927[i_1_] = (short) i_4_;
					short i_7_ = 0;
					if (i_5_ == 3 || i_5_ == 10) {
						i_7_ = (short) 128;
					}
					if ((i_6_ & 0x1) != 0) {
						aShortArray926[i_1_] = (short) ibuffer.gSmart1or2s();
					} else {
						aShortArray926[i_1_] = i_7_;
					}
					if ((i_6_ & 0x2) != 0) {
						aShortArray932[i_1_] = (short) ibuffer.gSmart1or2s();
					} else {
						aShortArray932[i_1_] = i_7_;
					}
					if ((i_6_ & 0x4) != 0) {
						aShortArray928[i_1_] = (short) ibuffer.gSmart1or2s();
					} else {
						aShortArray928[i_1_] = i_7_;
					}
					aByteArray944[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
					if (i_5_ == 2 || i_5_ == 9) {
						if (osrs) {
							aShortArray926[i_1_] = (short) (aShortArray926[i_1_] & 0xff);
							aShortArray932[i_1_] = (short) (aShortArray932[i_1_] & 0xff);
							aShortArray928[i_1_] = (short) (aShortArray928[i_1_] & 0xff);
						} else {
							aShortArray926[i_1_] = (short) (aShortArray926[i_1_] << 2 & 0x3fff);
							aShortArray932[i_1_] = (short) (aShortArray932[i_1_] << 2 & 0x3fff);
							aShortArray928[i_1_] = (short) (aShortArray928[i_1_] << 2 & 0x3fff);
						}
					}
					aShortArray929[i_1_] = (short) -1;
					if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
						if (i_2_ > i_3_) {
							aShortArray929[i_1_] = (short) i_2_;
							i_3_ = i_2_;
						}
					} else if (i_5_ == 5) {
						aBoolean939 = true;
					} else if (i_5_ == 7) {
						aBoolean940 = true;
					} else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8) {
						aBoolean941 = true;
					}
					i_1_++;
				}
			}
			if (ibuffer.pos * 385051775 != is.length) {
				throw new RuntimeException();
			}
			anInt925 = i_1_;
			aShortArray933 = new short[i_1_];
			aShortArray934 = new short[i_1_];
			aShortArray930 = new short[i_1_];
			aShortArray936 = new short[i_1_];
			aShortArray937 = new short[i_1_];
			aByteArray938 = new byte[i_1_];
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				aShortArray933[i_8_] = aShortArray927[i_8_];
				aShortArray934[i_8_] = aShortArray926[i_8_];
				aShortArray930[i_8_] = aShortArray932[i_8_];
				aShortArray936[i_8_] = aShortArray928[i_8_];
				aShortArray937[i_8_] = aShortArray929[i_8_];
				aByteArray938[i_8_] = aByteArray944[i_8_];
			}
		} catch (Exception exception) {
			anInt925 = 0;
			aBoolean939 = false;
			aBoolean940 = false;
		}
	}

	static {
		aShortArray926 = new short[500];
		aShortArray932 = new short[500];
		aShortArray928 = new short[500];
		aShortArray929 = new short[500];
		aByteArray944 = new byte[500];
	}
}
