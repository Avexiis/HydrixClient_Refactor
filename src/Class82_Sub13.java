/* Class82_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub13 extends Class82 {
	int anInt6868;
	int anInt6869;

	@Override
	public void method866(int i) {
		try {
			GameClient.anInt8728 = 938117879 * GameClient.anInt8884;
			GameClient.anInt8737 = 1303928015 * GameClient.anInt8884 + 1252628863 * anInt6868;
			Class256.anInt2801 = GameClient.anInt8681 * -1680550441;
			Class108.anInt1321 = 410053157 * GameClient.anInt8731;
			Class474.anInt5980 = GameClient.anInt8732 * -1645861677;
			Class115.anInt1389 = GameClient.anInt8720 * -933884753;
			GameClient.anInt8681 = 563175129 * (392492523 * anInt6869 >>> 24);
			GameClient.anInt8731 = -1719011785 * (anInt6869 * 392492523 >>> 16 & 0xff);
			GameClient.anInt8732 = -1294785203 * (392492523 * anInt6869 >>> 8 & 0xff);
			GameClient.anInt8720 = -1656733051 * (392492523 * anInt6869 & 0xff);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("ya.f(").append(')').toString());
		}
	}

	Class82_Sub13(Packet class298_sub53) {
		super(class298_sub53);
		anInt6868 = class298_sub53.readUnsignedShort() * -477707085;
		anInt6869 = class298_sub53.readUnsignedInt() * -1164408125;
	}

	@Override
	public void method868() {
		GameClient.anInt8728 = 938117879 * GameClient.anInt8884;
		GameClient.anInt8737 = 1303928015 * GameClient.anInt8884 + 1252628863 * anInt6868;
		Class256.anInt2801 = GameClient.anInt8681 * -1680550441;
		Class108.anInt1321 = 410053157 * GameClient.anInt8731;
		Class474.anInt5980 = GameClient.anInt8732 * -1645861677;
		Class115.anInt1389 = GameClient.anInt8720 * -933884753;
		GameClient.anInt8681 = 563175129 * (392492523 * anInt6869 >>> 24);
		GameClient.anInt8731 = -1719011785 * (anInt6869 * 392492523 >>> 16 & 0xff);
		GameClient.anInt8732 = -1294785203 * (392492523 * anInt6869 >>> 8 & 0xff);
		GameClient.anInt8720 = -1656733051 * (392492523 * anInt6869 & 0xff);
	}

	@Override
	public void method869() {
		GameClient.anInt8728 = 938117879 * GameClient.anInt8884;
		GameClient.anInt8737 = 1303928015 * GameClient.anInt8884 + 1252628863 * anInt6868;
		Class256.anInt2801 = GameClient.anInt8681 * -1680550441;
		Class108.anInt1321 = 410053157 * GameClient.anInt8731;
		Class474.anInt5980 = GameClient.anInt8732 * -1645861677;
		Class115.anInt1389 = GameClient.anInt8720 * -933884753;
		GameClient.anInt8681 = 563175129 * (392492523 * anInt6869 >>> 24);
		GameClient.anInt8731 = -1719011785 * (anInt6869 * 392492523 >>> 16 & 0xff);
		GameClient.anInt8732 = -1294785203 * (392492523 * anInt6869 >>> 8 & 0xff);
		GameClient.anInt8720 = -1656733051 * (392492523 * anInt6869 & 0xff);
	}

	public static final int method910(ObjectTypeList class433, byte[] data, int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		int i_4_ = 0;
		final boolean osrs = data[0] == 'O' && data[1] == 'S' && data[2] == 'R' && data[3] == 'S';
		Packet buffer = new Packet(data);
		if (osrs) {
			buffer.readUnsignedInt();
		}
		int locid = -1;
		for (;;) {
			int i_6_ = osrs ? buffer.readUnsignedSmart() : buffer.readSmart();
			if (0 == i_6_) {
				break;
			}
			locid += i_6_;
			int i_7_ = 0;
			boolean bool = false;
			for (;;) {
				if (bool) {
					int i_8_ = buffer.readUnsignedSmart();
					if (i_8_ == 0) {
						break;
					}
					buffer.readUnsignedByte();
				} else {
					int i_9_ = buffer.readUnsignedSmart();
					if (i_9_ == 0) {
						break;
					}
					i_7_ += i_9_ - 1;
					int i_10_ = i_7_ & 0x3f;
					int i_11_ = i_7_ >> 6 & 0x3f;
					int i_12_ = buffer.readUnsignedByte() >> 2;
					int i_13_ = i + i_11_;
					int i_14_ = i_10_ + i_0_;
					if (i_13_ > 0 && i_14_ > 0 && i_13_ < i_1_ - 1 && i_14_ < i_2_ - 1) {
						LocType class432 = class433.list(locid + (osrs ? OSRSData.LOCS_OFFSET : 0));
						if (-1976050083 * Class424.aClass424_6610.anInt6613 == i_12_ && GraphicsSetup.clientPreferences.aRemoveRoofPreference_7547.method5629(-1915667162) == 0 && 0 == 1532834983 * class432.anInt5382 && -2144543407 * class432.anInt5380 != 1 && !class432.aBoolean5410) {
							if (i_3_ == 3) {
								/* empty */
							}
						} else {
							if (!class432.method5772(-1755524122)) {
								i_4_++;
							}
							bool = true;
						}
					}
				}
			}
		}
		return i_4_;
	}
}
