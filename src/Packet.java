
/* RsByteBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Packet extends Node {
	public byte[] payload;
	public int pos;
	static int[] anIntArray7614 = new int[256];
	static int anInt7615 = -306674912;
	public static int anInt7616 = 5000;
	static long aLong7617 = -3932672073523589310L;
	public static int anInt7618 = 100;
	public static long[] aLongArray7619;

	public void method3584(long l) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 32);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 24);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 16);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 8);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.r(" + ')');
		}
	}

	public void writeByte(int i) {
		payload[(pos += 116413311) * 385051775 - 1] = (byte) i;
	}

	public void writeShort(int i, int i_1_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.i(" + ')');
		}
	}

	public void method3587(int i, int i_2_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) i;
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.k(" + ')');
		}
	}

	public void writeInt(int i, int i_3_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 24);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.u(" + ')');
		}
	}

	public void writeLEInt(int i, int i_4_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) i;
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.x(" + ')');
		}
	}

	public void writeString(String string, int i) {
		try {
			int i_5_ = string.indexOf('\0');
			if (i_5_ >= 0) {
				throw new IllegalArgumentException("");
			}
			pos += Class361.method4304(string, 0, string.length(), payload, 385051775 * pos, (byte) 41) * 116413311;
			payload[(pos += 116413311) * 385051775 - 1] = (byte) 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.z(" + ')');
		}
	}

	public int readShort(int i) {
		try {
			pos += 232826622;
			int i_6_ = ((payload[pos * 385051775 - 2] & 0xff) << 8) + (payload[385051775 * pos - 1] & 0xff);
			if (i_6_ > 32767) {
				i_6_ -= 65536;
			}
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ao(" + ')');
		}
	}

	public void writeIntV1(int i, byte i_7_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) i;
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 24);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 16);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ba(" + ')');
		}
	}

	public void method3593(int i, int i_8_) {
		try {
			payload[385051775 * pos - i - 2] = (byte) (i >> 8);
			payload[385051775 * pos - i - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.j(" + ')');
		}
	}

	public void method3594(int i, byte i_9_) {
		try {
			if (i >= 0 && i < 128) {
				writeByte(i);
			} else if (i >= 0 && i < 32768) {
				writeShort(32768 + i, 16711935);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.l(" + ')');
		}
	}

	public int readUnsignedByte() {
		try {
			return payload[(pos += 116413311) * 385051775 - 1] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.aa(" + ')');
		}
	}

	public byte readByte() {
		try {
			return payload[(pos += 116413311) * 385051775 - 1];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ak(" + ')');
		}
	}

	final int readCustomUnsignedShort() {
		int v = readUnsignedShort();
		if (v == 65535) {
			return -1;
		}
		return v;
	}

	public int readUnsignedShort() {
		try {
			pos += 232826622;
			int val = (payload[pos * 385051775 - 1] & 0xff) + ((payload[pos * 385051775 - 2] & 0xff) << 8);
			return val;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ae(" + ')');
		}
	}

	public long readLong(short i) {
		try {
			long l = readUnsignedInt() & 0xffffffffL;
			long l_10_ = readUnsignedInt() & 0xffffffffL;
			return (l << 32) + l_10_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.al(" + ')');
		}
	}

	public void method3599(int i, int i_11_) {
		try {
			payload[385051775 * pos - i - 4] = (byte) (i >> 24);
			payload[pos * 385051775 - i - 3] = (byte) (i >> 16);
			payload[385051775 * pos - i - 2] = (byte) (i >> 8);
			payload[385051775 * pos - i - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.w(" + ')');
		}
	}

	public int method3600(int i) {
		try {
			pos += 465653244;
			return ((payload[pos * 385051775 - 1] & 0xff) << 24) + ((payload[pos * 385051775 - 2] & 0xff) << 16) + ((payload[pos * 385051775 - 3] & 0xff) << 8) + (payload[385051775 * pos - 4] & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ah(" + ')');
		}
	}

	public long method3601(byte i) {
		try {
			long l = readUnsignedByte() & 0xffffffffL;
			long l_12_ = readUnsignedInt() & 0xffffffffL;
			return (l << 32) + l_12_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ai(" + ')');
		}
	}

	public String gstr() {
		try {
			int i_13_ = 385051775 * pos;
			while (payload[(pos += 116413311) * 385051775 - 1] != 0) {
			}
			int i_14_ = pos * 385051775 - i_13_ - 1;
			if (i_14_ == 0) {
				return "";
			}
			return Class52.method556(payload, i_13_, i_14_, 964250329);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.af(" + ')');
		}
	}

	public void method3603(long l, int i, int i_15_) {
		try {
			if (--i < 0 || i > 7) {
				throw new IllegalArgumentException();
			}
			for (int i_16_ = i * 8; i_16_ >= 0; i_16_ -= 8) {
				payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> i_16_);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.n(" + ')');
		}
	}

	public void readBytes(byte[] is, int i, int i_17_, int i_18_) {
		try {
			for (int i_19_ = i; i_19_ < i + i_17_; i_19_++) {
				is[i_19_] = payload[(pos += 116413311) * 385051775 - 1];
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ab(" + ')');
		}
	}

	public int readUnsignedSmart() {
		try {
			int i_20_ = payload[pos * 385051775] & 0xff;
			if (i_20_ < 128) {
				return readUnsignedByte();
			}
			return readUnsignedShort() - 32768;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ay(" + ')');
		}
	}

	public int readSmart() {
		int i_21_ = 0;
		int i_22_;
		for (i_22_ = readUnsignedSmart(); 32767 == i_22_; i_22_ = readUnsignedSmart()) {
			i_21_ += 32767;
		}
		i_21_ += i_22_;
		return i_21_;
	}

	public int method3607(int i) {
		try {
			if (payload[pos * 385051775] < 0) {
				return readUnsignedInt() & 0x7fffffff;
			}
			return readUnsignedShort();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ag(" + ')');
		}
	}

	public void writeLong(long l) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 56);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 48);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 40);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 32);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 24);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 16);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) (l >> 8);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.q(" + ')');
		}
	}

	public int method3609(int i) {
		try {
			int i_23_ = payload[(pos += 116413311) * 385051775 - 1];
			int i_24_ = 0;
			for (/**/; i_23_ < 0; i_23_ = payload[(pos += 116413311) * 385051775 - 1]) {
				i_24_ = (i_24_ | i_23_ & 0x7f) << 7;
			}
			return i_24_ | i_23_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.au(" + ')');
		}
	}

	public void method3610(int[] is, int i) {
		try {
			int i_25_ = 385051775 * pos / 8;
			pos = 0;
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
				int i_27_ = readUnsignedInt();
				int i_28_ = readUnsignedInt();
				int i_29_ = -957401312;
				int i_30_ = -1640531527;
				int i_31_ = 32;
				while (i_31_-- > 0) {
					i_28_ -= i_27_ + (i_27_ << 4 ^ i_27_ >>> 5) ^ is[i_29_ >>> 11 & 0x3] + i_29_;
					i_29_ -= i_30_;
					i_27_ -= i_28_ + (i_28_ << 4 ^ i_28_ >>> 5) ^ i_29_ + is[i_29_ & 0x3];
				}
				pos -= 931306488;
				writeInt(i_27_, -429646008);
				writeInt(i_28_, 96557392);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ar(" + ')');
		}
	}

	public void method3611(int[] is, int i, int i_32_, int i_33_) {
		try {
			int i_34_ = 385051775 * pos;
			pos = i * 116413311;
			int i_35_ = (i_32_ - i) / 8;
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
				int i_37_ = readUnsignedInt();
				int i_38_ = readUnsignedInt();
				int i_39_ = 0;
				int i_40_ = -1640531527;
				int i_41_ = 32;
				while (i_41_-- > 0) {
					i_37_ += (i_38_ << 4 ^ i_38_ >>> 5) + i_38_ ^ is[i_39_ & 0x3] + i_39_;
					i_39_ += i_40_;
					i_38_ += (i_37_ << 4 ^ i_37_ >>> 5) + i_37_ ^ i_39_ + is[i_39_ >>> 11 & 0x3];
				}
				pos -= 931306488;
				writeInt(i_37_, -1455722924);
				writeInt(i_38_, -1798688670);
			}
			pos = 116413311 * i_34_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ac(" + ')');
		}
	}

	public void method3612(int[] is, int i, int i_42_, int i_43_) {
		try {
			int i_44_ = pos * 385051775;
			pos = i * 116413311;
			int i_45_ = (i_42_ - i) / 8;
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
				int i_47_ = readUnsignedInt();
				int i_48_ = readUnsignedInt();
				int i_49_ = -957401312;
				int i_50_ = -1640531527;
				int i_51_ = 32;
				while (i_51_-- > 0) {
					i_48_ -= i_47_ + (i_47_ << 4 ^ i_47_ >>> 5) ^ i_49_ + is[i_49_ >>> 11 & 0x3];
					i_49_ -= i_50_;
					i_47_ -= i_48_ + (i_48_ << 4 ^ i_48_ >>> 5) ^ is[i_49_ & 0x3] + i_49_;
				}
				pos -= 931306488;
				writeInt(i_47_, -1451619282);
				writeInt(i_48_, -1662476613);
			}
			pos = i_44_ * 116413311;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.am(" + ')');
		}
	}

	public int g3() {
		try {
			pos += 349239933;
			return (payload[385051775 * pos - 1] & 0xff) + ((payload[pos * 385051775 - 3] & 0xff) << 16) + ((payload[385051775 * pos - 2] & 0xff) << 8);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ad(" + ')');
		}
	}

	public int method3614(int i, int i_52_) {
		try {
			int i_53_ = Class11.method328(payload, i, pos * 385051775, -1501053505);
			writeInt(i_53_, 533083974);
			return i_53_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bf(" + ')');
		}
	}

	public boolean method3615(byte i) {
		try {
			pos -= 465653244;
			int i_54_ = Class11.method328(payload, 0, 385051775 * pos, -395934040);
			int i_55_ = readUnsignedInt();
			if (i_55_ == i_54_) {
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.be(" + ')');
		}
	}

	public void writeByte128(int i, int i_56_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (128 + i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.by(" + ')');
		}
	}

	public void method3617(int i, int i_57_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (0 - i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bm(" + ')');
		}
	}

	public int readUnsignedByte128(int i) {
		try {
			return payload[(pos += 116413311) * 385051775 - 1] - 128 & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bx(" + ')');
		}
	}

	public int readUnsignedByteC(short i) {
		try {
			return 0 - payload[(pos += 116413311) * 385051775 - 1] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bo(" + ')');
		}
	}

	public int readUnsigned128Byte(byte i) {
		try {
			return 128 - payload[(pos += 116413311) * 385051775 - 1] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bb(" + ')');
		}
	}

	public byte readByteC(int i) {
		try {
			return (byte) (0 - payload[(pos += 116413311) * 385051775 - 1]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bu(" + ')');
		}
	}

	public byte read128Byte(int i) {
		try {
			return (byte) (128 - payload[(pos += 116413311) * 385051775 - 1]);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bw(" + ')');
		}
	}

	public void writeShortLE128(int i) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i + 128);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bg(" + ')');
		}
	}

	public int readUnsignedShortLE(byte i) {
		try {
			pos += 232826622;
			return (payload[385051775 * pos - 2] & 0xff) + ((payload[pos * 385051775 - 1] & 0xff) << 8);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bs(" + ')');
		}
	}

	public int readUnsignedShort128(int i) {
		try {
			pos += 232826622;
			return ((payload[385051775 * pos - 2] & 0xff) << 8) + (payload[pos * 385051775 - 1] - 128 & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bp(" + ')');
		}
	}

	public int readUnsignedShortLE128(int i) {
		try {
			pos += 232826622;
			return ((payload[385051775 * pos - 1] & 0xff) << 8) + (payload[385051775 * pos - 2] - 128 & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bv(" + ')');
		}
	}

	public int read24BitInteger(byte i) {
		try {
			pos += 349239933;
			int i_59_ = ((payload[pos * 385051775 - 3] & 0xff) << 16) + ((payload[pos * 385051775 - 2] & 0xff) << 8) + (payload[385051775 * pos - 1] & 0xff);
			if (i_59_ > 8388607) {
				i_59_ -= 16777216;
			}
			return i_59_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.av(" + ')');
		}
	}

	public int read24BitUnsignedIntegerV2(byte i) {
		try {
			pos += 349239933;
			return (payload[385051775 * pos - 2] & 0xff) + ((payload[pos * 385051775 - 3] & 0xff) << 16) + ((payload[385051775 * pos - 1] & 0xff) << 8);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bn(" + ')');
		}
	}

	public void writeIntLE(int i, byte i_60_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) i;
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bi(" + ')');
		}
	}

	public byte readByte128(byte i) {
		try {
			return (byte) (payload[(pos += 116413311) * 385051775 - 1] - 128);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bl(" + ')');
		}
	}

	public void writeIntV2(int i) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 24);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) i;
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bt(" + ')');
		}
	}

	public int readIntLE(int i) {
		try {
			pos += 465653244;
			return ((payload[pos * 385051775 - 3] & 0xff) << 8) + ((payload[pos * 385051775 - 1] & 0xff) << 24) + ((payload[pos * 385051775 - 2] & 0xff) << 16) + (payload[pos * 385051775 - 4] & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bj(" + ')');
		}
	}

	public int readIntV2(byte i) {
		try {
			pos += 465653244;
			return (payload[385051775 * pos - 2] & 0xff) + ((payload[pos * 385051775 - 1] & 0xff) << 8) + ((payload[pos * 385051775 - 4] & 0xff) << 16) + ((payload[385051775 * pos - 3] & 0xff) << 24);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bz(" + ')');
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_62_ = i;
			for (int i_63_ = 0; i_63_ < 8; i_63_++) {
				if ((i_62_ & 0x1) == 1) {
					i_62_ = i_62_ >>> 1 ^ ~0x12477cdf;
				} else {
					i_62_ >>>= 1;
				}
			}
			anIntArray7614[i] = i_62_;
		}
		aLongArray7619 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = i;
			for (int i_64_ = 0; i_64_ < 8; i_64_++) {
				if ((l & 0x1L) == 1L) {
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				} else {
					l >>>= 1;
				}
			}
			aLongArray7619[i] = l;
		}
	}

	public void putTriByte(int i, byte i_65_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 16);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.d(" + ')');
		}
	}

	public void applyRsa(BigInteger biginteger, BigInteger biginteger_66_, int i) {
		try {
			int i_67_ = pos * 385051775;
			pos = 0;
			byte[] is = new byte[i_67_];
			readBytes(is, 0, i_67_, -953523806);
			BigInteger biginteger_68_ = new BigInteger(is);
			BigInteger biginteger_69_ = Loader.DISABLE_RSA ? biginteger_68_ : biginteger_68_.modPow(biginteger, biginteger_66_);
			byte[] is_70_ = biginteger_69_.toByteArray();
			pos = 0;
			writeShort(is_70_.length, 16711935);
			writeBytes(is_70_, 0, is_70_.length, (short) -25461);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bd(" + ')');
		}
	}

	public Packet(int i) {
		payload = Class416.method5589(i, (short) -31789);
		pos = 0;
	}

	public String readJagString(int i) {
		try {
			byte i_71_ = payload[(pos += 116413311) * 385051775 - 1];
			if (0 != i_71_) {
				throw new IllegalStateException("");
			}
			int i_72_ = pos * 385051775;
			while_13_: do {
				do {
					if (payload[(pos += 116413311) * 385051775 - 1] == 0) {
						break while_13_;
					}
				} while (i == 681479919);
				throw new IllegalStateException();
			} while (false);
			int i_73_ = pos * 385051775 - i_72_ - 1;
			if (0 == i_73_) {
				return "";
			}
			return Class52.method556(payload, i_72_, i_73_, -1673599026);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.aw(" + ')');
		}
	}

	public int readIntV1(int i) {
		try {
			pos += 465653244;
			return ((payload[385051775 * pos - 1] & 0xff) << 16) + ((payload[385051775 * pos - 2] & 0xff) << 24) + ((payload[pos * 385051775 - 4] & 0xff) << 8) + (payload[pos * 385051775 - 3] & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.br(" + ')');
		}
	}

	public void write128Byte(int i, byte i_74_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (128 - i);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bc(" + ')');
		}
	}

	public void method3639(int i, int i_75_) {
		try {
			if ((i & ~0x7f) != 0) {
				if ((i & ~0x3fff) != 0) {
					if ((i & ~0x1fffff) != 0) {
						if (0 != (i & ~0xfffffff)) {
							writeByte(i >>> 28 | 0x80);
						}
						writeByte(i >>> 21 | 0x80);
					}
					writeByte(i >>> 14 | 0x80);
				}
				writeByte(i >>> 7 | 0x80);
			}
			writeByte(i & 0x7f);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ax(" + ')');
		}
	}

	public long method3640(int i) {
		try {
			long l = method3600(143621107) & 0xffffffffL;
			long l_76_ = method3600(742659427) & 0xffffffffL;
			return (l_76_ << 32) + l;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.az(" + ')');
		}
	}

	public void putJagString(String string, short i) {
		try {
			int i_77_ = string.indexOf('\0');
			if (i_77_ >= 0) {
				throw new IllegalArgumentException("");
			}
			payload[(pos += 116413311) * 385051775 - 1] = (byte) 0;
			pos += Class361.method4304(string, 0, string.length(), payload, 385051775 * pos, (byte) 102) * 116413311;
			payload[(pos += 116413311) * 385051775 - 1] = (byte) 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.c(" + ')');
		}
	}

	public void writeShort128(int i) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i + 128);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bq(" + ')');
		}
	}

	public int readUnsignedInt() {
		try {
			pos += 465653244;
			return ((payload[385051775 * pos - 3] & 0xff) << 16) + ((payload[385051775 * pos - 4] & 0xff) << 24) + ((payload[pos * 385051775 - 2] & 0xff) << 8) + (payload[385051775 * pos - 1] & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.at(" + ')');
		}
	}

	public void writeShortLE(int i, int i_79_) {
		try {
			payload[(pos += 116413311) * 385051775 - 1] = (byte) i;
			payload[(pos += 116413311) * 385051775 - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bk(" + ')');
		}
	}

	public Packet(byte[] is) {
		payload = is;
		pos = 0;
	}

	public int gSmart1or2s() {
		try {
			int i_80_ = payload[385051775 * pos] & 0xff;
			if (i_80_ < 128) {
				return readUnsignedByte() - 64;
			}
			return readUnsignedShort() - 49152;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.aj(" + ')');
		}
	}

	public int gSmart2or4n() {// readBigSmart
		try {
			if (payload[385051775 * pos] < 0) {
				return readUnsignedInt() & 0x7fffffff;
			}
			int i_81_ = readUnsignedShort();
			if (32767 == i_81_) {
				return -1;
			}
			return i_81_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.an(" + ')');
		}
	}

	public long method3647(int i, byte i_82_) {
		try {
			if (--i < 0 || i > 7) {
				throw new IllegalArgumentException();
			}
			int i_83_ = 8 * i;
			long l = 0L;
			for (/**/; i_83_ >= 0; i_83_ -= 8) {
				l |= (payload[(pos += 116413311) * 385051775 - 1] & 0xffL) << i_83_;
			}
			return l;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.as(" + ')');
		}
	}

	public void writeBytes(byte[] is, int i, int i_84_, short i_85_) {
		try {
			for (int i_86_ = i; i_86_ < i_84_ + i; i_86_++) {
				payload[(pos += 116413311) * 385051775 - 1] = is[i_86_];
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.m(" + ')');
		}
	}

	public void method3649(int i, byte i_87_) {
		try {
			payload[pos * 385051775 - i - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.o(" + ')');
		}
	}

	public void method3650(int i) {
		try {
			if (null != payload) {
				Class201.method1900(payload, -860028882);
			}
			payload = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.b(" + ')');
		}
	}

	public int method3651(int i) {
		try {
			pos += 232826622;
			int i_88_ = (payload[pos * 385051775 - 2] & 0xff) + ((payload[pos * 385051775 - 1] & 0xff) << 8);
			if (i_88_ > 32767) {
				i_88_ -= 65536;
			}
			return i_88_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bh(" + ')');
		}
	}

	public String method3652(int i) {
		try {
			if (payload[385051775 * pos] == 0) {
				pos += 116413311;
				return null;
			}
			return gstr();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.ap(" + ')');
		}
	}

	static final void method3653(ClientScript2 class403, int i) {
		try {
			String string = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
			class403.anObjectArray5240[(class403.anInt5241 += 969361751) * -203050393 - 1] = string.toLowerCase();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.zd(" + ')');
		}
	}

	static final void method3654(ClientScript2 class403, int i) {
		try {
			int i_89_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_89_, (byte) 28);
			RSInterface RSInterface = SpotAnimTypeList.aRSInterfaceArray4165[i_89_ >> 16];
			SeqType.method4887(class105, RSInterface, class403, (byte) -121);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.dp(" + ')');
		}
	}

	static final void method3655(ClientScript2 class403, int i) {
		try {
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = GraphicsAutoSetup.clientPreferences.antialiasPreference.method5674(-484902399) && OverlayType.activeToolkit.method5032() ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.anb(" + ')');
		}
	}

	static void method3656(int i, int i_90_, int i_91_, short i_92_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(9, i);
			class298_sub37_sub12.method3449((byte) 105);
			class298_sub37_sub12.anInt9610 = 1274450087 * i_90_;
			class298_sub37_sub12.anInt9608 = 293101103 * i_91_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.aw(" + ')');
		}
	}

	static final void method3657(ClientScript2 class403, byte i) {
		try {
			String string = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
			int i_93_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			if (-1 == i_93_) {
				throw new RuntimeException("");
			}
			class403.anObjectArray5240[(class403.anInt5241 += 969361751) * -203050393 - 1] = string + (char) i_93_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.za(" + ')');
		}
	}
	
	public int g1s() {
		try {
			return 0 - payload[(pos += 116413311) * 385051775 - 1] & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "acx.bo(" + ')');
		}
	}
}
