/* ChecksumTableEntry - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class ChecksumTableEntry extends Class242 {
	HashTable aClass437_7085;
	Class247 aClass247_7086;
	byte[] aByteArray7087;
	int anInt7088;
	Class329 aClass329_7089;
	Class298_Sub37_Sub16 aClass298_Sub37_Sub16_7090;
	Class255 aClass255_7091;
	int anInt7092 = 0;
	Class329 aClass329_7093;
	Class226 aClass226_7094;
	static byte aByte7095 = 0;
	static byte aByte7096 = 1;
	static byte aByte7097 = -1;
	byte[] aByteArray7098;
	static int anInt7099 = 1000;
	LinkedNodeList aLinkedNodeList_7100;
	int anInt7101;
	boolean aBoolean7102;
	int anInt7103;
	static int anInt7104 = 0;
	LinkedNodeList aLinkedNodeList_7105;
	boolean aBoolean7106;
	long aLong7107;
	int anInt7108;
	static int anInt7109 = 250;
	static CRC32 aCRC32_7110 = new CRC32();
	boolean aBoolean7111;
	static int anInt7112 = 1;
	static int anInt7113 = 2;

	public int method2270(int i) {
		try {
			if (method2250(2127930788) == null) {
				if (null == ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090)
					return 0;
				return ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090.method3468(-2104540777);
			}
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.v(").append(')').toString());
		}
	}

	void method2260(int i) {
		if (null != ((ChecksumTableEntry) this).aClass329_7093) {
			for (Node node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5939(1766612795); null != node; node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5944(49146)) {
				if (7051297995265073167L * node.aLong3188 == (long) i)
					return;
			}
			Node node = new Node();
			node.aLong3188 = (long) i * 4191220306876042991L;
			((ChecksumTableEntry) this).aLinkedNodeList_7105.addlast(node, 1807588241);
		}
	}

	void method2256(int i, short i_0_) {
		try {
			if (null != ((ChecksumTableEntry) this).aClass329_7093) {
				for (Node node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5939(1766612795); null != node; node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5944(49146)) {
					if (7051297995265073167L * node.aLong3188 == (long) i)
						return;
				}
				Node node = new Node();
				node.aLong3188 = (long) i * 4191220306876042991L;
				((ChecksumTableEntry) this).aLinkedNodeList_7105.addlast(node, -68518310);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.b(").append(')').toString());
		}
	}

	Class298_Sub37_Sub16 method2271(int i, int i_1_, byte i_2_) {
		try {
			Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass437_7085.get((long) i));
			if (class298_sub37_sub16 != null && 0 == i_1_ && !((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670)) {
				class298_sub37_sub16.unlink(-1460969981);
				class298_sub37_sub16 = null;
			}
			if (null == class298_sub37_sub16) {
				if (i_1_ == 0) {
					if (((ChecksumTableEntry) this).aClass329_7093 != null && ((ChecksumTableEntry) this).aByteArray7098[i] != -1)
						class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass255_7091.method2430(i, ((ChecksumTableEntry) this).aClass329_7093, -1787098666));
					else if (!((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
						class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass247_7086.method2338(-553176479 * ((ChecksumTableEntry) this).anInt7088, i, (byte) 2, true, -393413622));
					else
						return null;
				} else if (i_1_ == 1) {
					if (((ChecksumTableEntry) this).aClass329_7093 == null)
						throw new RuntimeException();
					class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass255_7091.method2429(i, ((ChecksumTableEntry) this).aClass329_7093, (byte) -18));
				} else if (2 == i_1_) {
					if (null == ((ChecksumTableEntry) this).aClass329_7093)
						throw new RuntimeException();
					if (-1 != ((ChecksumTableEntry) this).aByteArray7098[i])
						throw new RuntimeException();
					if (!((ChecksumTableEntry) this).aClass247_7086.method2347((byte) -70))
						class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass247_7086.method2338(((ChecksumTableEntry) this).anInt7088 * -553176479, i, (byte) 2, false, 67458398));
					else
						return null;
				} else
					throw new RuntimeException();
				((ChecksumTableEntry) this).aClass437_7085.method5817(class298_sub37_sub16, (long) i);
			}
			if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670)
				return null;
			byte[] is = class298_sub37_sub16.method3465((short) 657);
			if (class298_sub37_sub16 instanceof Class298_Sub37_Sub16_Sub2) {
				Class298_Sub37_Sub16 class298_sub37_sub16_3_;
				try {
					if (null == is || is.length <= 2)
						throw new RuntimeException();
					aCRC32_7110.reset();
					aCRC32_7110.update(is, 0, is.length - 2);
					int i_4_ = (int) aCRC32_7110.getValue();
					if ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2522[i]) != i_4_)
						throw new RuntimeException();
					if ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516) != null && null != (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i])) {
						byte[] is_5_ = (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i]);
						byte[] is_6_ = Class152.method1654(is, 0, is.length - 2, (byte) 21);
						for (int i_7_ = 0; i_7_ < 64; i_7_++) {
							if (is_5_[i_7_] != is_6_[i_7_])
								throw new RuntimeException();
						}
					}
					int i_8_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
					if (i_8_ != ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2514[i]) & 0xffff))
						throw new RuntimeException();
					if (((ChecksumTableEntry) this).aByteArray7098[i] != 1) {
						if (((ChecksumTableEntry) this).aByteArray7098[i] != 0) {
							/* empty */
						}
						((ChecksumTableEntry) this).anInt7092 += 13538129;
						((ChecksumTableEntry) this).aByteArray7098[i] = (byte) 1;
					}
					if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
						class298_sub37_sub16.unlink(-1460969981);
					class298_sub37_sub16_3_ = class298_sub37_sub16;
				} catch (Exception exception) {
					((ChecksumTableEntry) this).aByteArray7098[i] = (byte) -1;
					class298_sub37_sub16.unlink(-1460969981);
					if ((((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672) && !((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14)) {
						Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = (((ChecksumTableEntry) this).aClass247_7086.method2338(-553176479 * ((ChecksumTableEntry) this).anInt7088, i, (byte) 2, true, 61291917));
						((ChecksumTableEntry) this).aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
					}
					return null;
				}
				return class298_sub37_sub16_3_;
			}
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7110.reset();
				aCRC32_7110.update(is, 0, is.length - 2);
				int i_9_ = (int) aCRC32_7110.getValue();
				if (i_9_ != (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2522[i]))
					throw new RuntimeException();
				if ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516) != null && (null != (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i]))) {
					byte[] is_10_ = (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i]);
					byte[] is_11_ = Class152.method1654(is, 0, is.length - 2, (byte) -6);
					for (int i_12_ = 0; i_12_ < 64; i_12_++) {
						if (is_10_[i_12_] != is_11_[i_12_])
							throw new RuntimeException();
					}
				}
				((ChecksumTableEntry) this).aClass247_7086.anInt2735 = 0;
				((ChecksumTableEntry) this).aClass247_7086.anInt2745 = 0;
			} catch (RuntimeException runtimeexception) {
				((ChecksumTableEntry) this).aClass247_7086.method2359(-1195501767);
				class298_sub37_sub16.unlink(-1460969981);
				if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && !((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14)) {
					Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = (((ChecksumTableEntry) this).aClass247_7086.method2338(-553176479 * ((ChecksumTableEntry) this).anInt7088, i, (byte) 2, true, -791962540));
					((ChecksumTableEntry) this).aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
				}
				return null;
			}
			is[is.length - 2] = (byte) ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2514[i]) >>> 8);
			is[is.length - 1] = (byte) (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2514[i]);
			if (((ChecksumTableEntry) this).aClass329_7093 != null) {
				((ChecksumTableEntry) this).aClass255_7091.method2431(i, is, ((ChecksumTableEntry) this).aClass329_7093, -645332532);
				if (((ChecksumTableEntry) this).aByteArray7098[i] != 1) {
					((ChecksumTableEntry) this).anInt7092 += 13538129;
					((ChecksumTableEntry) this).aByteArray7098[i] = (byte) 1;
				}
			}
			if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
				class298_sub37_sub16.unlink(-1460969981);
			return class298_sub37_sub16;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.g(").append(')').toString());
		}
	}

	void method2272(byte i) {
		try {
			if (null != ((ChecksumTableEntry) this).aLinkedNodeList_7100 && method2250(2079218396) != null) {
				for (Node node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5939(1766612795); node != null; node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5944(49146)) {
					int i_13_ = (int) (7051297995265073167L * node.aLong3188);
					if (i_13_ < 0 || i_13_ >= -1583970959 * ((Class226) (((ChecksumTableEntry) this).aClass226_7094)).anInt2521 || 0 == (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2525[i_13_]))
						node.unlink(-1460969981);
					else {
						if (((ChecksumTableEntry) this).aByteArray7098[i_13_] == 0)
							method2271(i_13_, 1, (byte) 96);
						if (-1 == ((ChecksumTableEntry) this).aByteArray7098[i_13_])
							method2271(i_13_, 2, (byte) 26);
						if (1 == ((ChecksumTableEntry) this).aByteArray7098[i_13_])
							node.unlink(-1460969981);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.e(").append(')').toString());
		}
	}

	void method2273(int i) {
		try {
			if (null != ((ChecksumTableEntry) this).aLinkedNodeList_7100) {
				if (method2250(2060715797) == null)
					return;
				if (((ChecksumTableEntry) this).aBoolean7102) {
					boolean bool = true;
					for (Node node = ((ChecksumTableEntry) this).aLinkedNodeList_7100.method5939(1766612795); null != node; node = ((ChecksumTableEntry) this).aLinkedNodeList_7100.method5944(49146)) {
						int i_14_ = (int) (node.aLong3188 * 7051297995265073167L);
						if (((ChecksumTableEntry) this).aByteArray7098[i_14_] == 0)
							method2271(i_14_, 1, (byte) 113);
						if (0 != ((ChecksumTableEntry) this).aByteArray7098[i_14_])
							node.unlink(-1460969981);
						else
							bool = false;
					}
					while (((ChecksumTableEntry) this).anInt7101 * 2044090087 < (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2525).length) {
						if (0 == (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2525[(2044090087 * ((ChecksumTableEntry) this).anInt7101)]))
							((ChecksumTableEntry) this).anInt7101 += -303145769;
						else {
							if ((-2031048721 * ((Class255) (((ChecksumTableEntry) this).aClass255_7091)).anInt2793) >= 250) {
								bool = false;
								break;
							}
							if ((((ChecksumTableEntry) this).aByteArray7098[(2044090087 * ((ChecksumTableEntry) this).anInt7101)]) == 0)
								method2271(2044090087 * (((ChecksumTableEntry) this).anInt7101), 1, (byte) 122);
							if ((((ChecksumTableEntry) this).aByteArray7098[(((ChecksumTableEntry) this).anInt7101 * 2044090087)]) == 0) {
								Node node = new Node();
								node.aLong3188 = ((long) ((ChecksumTableEntry) this).anInt7101 * -1525375729483922519L);
								((ChecksumTableEntry) this).aLinkedNodeList_7100.addlast(node, 2047339116);
								bool = false;
							}
							((ChecksumTableEntry) this).anInt7101 += -303145769;
						}
					}
					if (bool) {
						((ChecksumTableEntry) this).aBoolean7102 = false;
						((ChecksumTableEntry) this).anInt7101 = 0;
					}
				} else if (((ChecksumTableEntry) this).aBoolean7111) {
					boolean bool = true;
					for (Node node = ((ChecksumTableEntry) this).aLinkedNodeList_7100.method5939(1766612795); null != node; node = ((ChecksumTableEntry) this).aLinkedNodeList_7100.method5944(49146)) {
						int i_15_ = (int) (7051297995265073167L * node.aLong3188);
						if (((ChecksumTableEntry) this).aByteArray7098[i_15_] != 1)
							method2271(i_15_, 2, (byte) 80);
						if (1 == ((ChecksumTableEntry) this).aByteArray7098[i_15_])
							node.unlink(-1460969981);
						else
							bool = false;
					}
					while (2044090087 * ((ChecksumTableEntry) this).anInt7101 < (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2525).length) {
						if ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2525[2044090087 * ((ChecksumTableEntry) this).anInt7101]) == 0)
							((ChecksumTableEntry) this).anInt7101 += -303145769;
						else {
							if (((ChecksumTableEntry) this).aClass247_7086.method2347((byte) 57)) {
								bool = false;
								break;
							}
							if (1 != (((ChecksumTableEntry) this).aByteArray7098[(2044090087 * ((ChecksumTableEntry) this).anInt7101)]))
								method2271((((ChecksumTableEntry) this).anInt7101 * 2044090087), 2, (byte) 99);
							if (1 != (((ChecksumTableEntry) this).aByteArray7098[(((ChecksumTableEntry) this).anInt7101 * 2044090087)])) {
								Node node = new Node();
								node.aLong3188 = (-1525375729483922519L * (long) (((ChecksumTableEntry) this).anInt7101));
								((ChecksumTableEntry) this).aLinkedNodeList_7100.addlast(node, 120115319);
								bool = false;
							}
							((ChecksumTableEntry) this).anInt7101 += -303145769;
						}
					}
					if (bool) {
						((ChecksumTableEntry) this).aBoolean7111 = false;
						((ChecksumTableEntry) this).anInt7101 = 0;
					}
				} else
					((ChecksumTableEntry) this).aLinkedNodeList_7100 = null;
			}
			if (((ChecksumTableEntry) this).aBoolean7106 && (TimeUtils.getTime((byte) 1) >= (((ChecksumTableEntry) this).aLong7107 * 2822951764100643313L))) {
				for (Class298_Sub37_Sub16 class298_sub37_sub16 = (Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass437_7085.method5816(1614241493); null != class298_sub37_sub16; class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass437_7085.method5815((byte) -12))) {
					if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670) {
						if (i == -1065641321)
							return;
					} else if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9671) {
						if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
							throw new RuntimeException();
						class298_sub37_sub16.unlink(-1460969981);
					} else
						((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9671 = true;
				}
				((ChecksumTableEntry) this).aLong7107 = ((TimeUtils.getTime((byte) 1) + 1000L) * -7842795960219478255L);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.c(").append(')').toString());
		}
	}

	ChecksumTableEntry(int i, Class329 class329, Class329 class329_16_, Class247 class247, Class255 class255, int i_17_, byte[] is, int i_18_, boolean bool) {
		((ChecksumTableEntry) this).aClass437_7085 = new HashTable(16);
		((ChecksumTableEntry) this).anInt7101 = 0;
		((ChecksumTableEntry) this).aLinkedNodeList_7105 = new LinkedNodeList();
		((ChecksumTableEntry) this).aLong7107 = 0L;
		((ChecksumTableEntry) this).anInt7088 = i * 160231841;
		((ChecksumTableEntry) this).aClass329_7093 = class329;
		if (null == ((ChecksumTableEntry) this).aClass329_7093)
			((ChecksumTableEntry) this).aBoolean7102 = false;
		else {
			((ChecksumTableEntry) this).aBoolean7102 = true;
			((ChecksumTableEntry) this).aLinkedNodeList_7100 = new LinkedNodeList();
		}
		((ChecksumTableEntry) this).aClass329_7089 = class329_16_;
		((ChecksumTableEntry) this).aClass247_7086 = class247;
		((ChecksumTableEntry) this).aClass255_7091 = class255;
		((ChecksumTableEntry) this).anInt7108 = i_17_ * 235523743;
		((ChecksumTableEntry) this).aByteArray7087 = is;
		((ChecksumTableEntry) this).anInt7103 = 1761064455 * i_18_;
		((ChecksumTableEntry) this).aBoolean7106 = bool;
		if (null != ((ChecksumTableEntry) this).aClass329_7089)
			((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass255_7091.method2430(((ChecksumTableEntry) this).anInt7088 * -553176479, ((ChecksumTableEntry) this).aClass329_7089, -1787098666));
	}

	public int method2274(byte i) {
		try {
			return ((ChecksumTableEntry) this).anInt7092 * -150039119;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.w(").append(')').toString());
		}
	}

	public int method2275(int i) {
		try {
			if (null == ((ChecksumTableEntry) this).aClass226_7094)
				return 0;
			if (!((ChecksumTableEntry) this).aBoolean7102)
				return (-2145352941 * (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anInt2527));
			Node node = ((ChecksumTableEntry) this).aLinkedNodeList_7100.method5939(1766612795);
			if (null == node)
				return 0;
			return (int) (7051297995265073167L * node.aLong3188);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.j(").append(')').toString());
		}
	}

	byte[] method2252(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 95);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) 9305);
		class298_sub37_sub16.unlink(-1460969981);
		return is;
	}

	Class226 method2264() {
		if (((ChecksumTableEntry) this).aClass226_7094 != null)
			return ((ChecksumTableEntry) this).aClass226_7094;
		if (null == ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090) {
			if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
				return null;
			((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, -553176479 * ((ChecksumTableEntry) this).anInt7088, (byte) 0, true, 1341135400));
		}
		if (((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090).aBoolean9670)
			return null;
		byte[] is = ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090.method3465((short) -18101);
		do {
			if (((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
				try {
					if (null == is)
						throw new RuntimeException();
					((ChecksumTableEntry) this).aClass226_7094 = new Class226(is, (28953951 * ((ChecksumTableEntry) this).anInt7108), ((ChecksumTableEntry) this).aByteArray7087);
					if (1598805943 * ((ChecksumTableEntry) this).anInt7103 != 201380083 * (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anInt2529))
						throw new RuntimeException();
					break;
				} catch (RuntimeException runtimeexception) {
					((ChecksumTableEntry) this).aClass226_7094 = null;
					if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
						((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
					else
						((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, -553176479 * ((ChecksumTableEntry) this).anInt7088, (byte) 0, true, 694224083));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				((ChecksumTableEntry) this).aClass226_7094 = new Class226(is, 28953951 * ((ChecksumTableEntry) this).anInt7108, ((ChecksumTableEntry) this).aByteArray7087);
			} catch (RuntimeException runtimeexception) {
				((ChecksumTableEntry) this).aClass247_7086.method2359(-1690580411);
				((ChecksumTableEntry) this).aClass226_7094 = null;
				if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
					((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
				else
					((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, ((ChecksumTableEntry) this).anInt7088 * -553176479, (byte) 0, true, -1212933335));
				return null;
			}
			if (((ChecksumTableEntry) this).aClass329_7089 != null)
				((ChecksumTableEntry) this).aClass255_7091.method2431(-553176479 * ((ChecksumTableEntry) this).anInt7088, is, ((ChecksumTableEntry) this).aClass329_7089, 628603077);
		} while (false);
		((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
		if (((ChecksumTableEntry) this).aClass329_7093 != null) {
			((ChecksumTableEntry) this).aByteArray7098 = new byte[(((Class226) ((ChecksumTableEntry) this).aClass226_7094).anInt2521) * -1583970959];
			((ChecksumTableEntry) this).anInt7092 = 0;
		}
		return ((ChecksumTableEntry) this).aClass226_7094;
	}

	int method2253(int i, int i_19_) {
		try {
			Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass437_7085.get((long) i));
			if (class298_sub37_sub16 != null)
				return class298_sub37_sub16.method3468(-2048847327);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.p(").append(')').toString());
		}
	}

	Class226 method2254() {
		if (((ChecksumTableEntry) this).aClass226_7094 != null)
			return ((ChecksumTableEntry) this).aClass226_7094;
		if (null == ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090) {
			if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
				return null;
			((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, -553176479 * ((ChecksumTableEntry) this).anInt7088, (byte) 0, true, -1923437147));
		}
		if (((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090).aBoolean9670)
			return null;
		byte[] is = ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090.method3465((short) 17552);
		do {
			if (((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
				try {
					if (null == is)
						throw new RuntimeException();
					((ChecksumTableEntry) this).aClass226_7094 = new Class226(is, (28953951 * ((ChecksumTableEntry) this).anInt7108), ((ChecksumTableEntry) this).aByteArray7087);
					if (1598805943 * ((ChecksumTableEntry) this).anInt7103 != 201380083 * (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anInt2529))
						throw new RuntimeException();
					break;
				} catch (RuntimeException runtimeexception) {
					((ChecksumTableEntry) this).aClass226_7094 = null;
					if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
						((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
					else
						((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, -553176479 * ((ChecksumTableEntry) this).anInt7088, (byte) 0, true, -313120105));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				((ChecksumTableEntry) this).aClass226_7094 = new Class226(is, 28953951 * ((ChecksumTableEntry) this).anInt7108, ((ChecksumTableEntry) this).aByteArray7087);
			} catch (RuntimeException runtimeexception) {
				((ChecksumTableEntry) this).aClass247_7086.method2359(-1420399817);
				((ChecksumTableEntry) this).aClass226_7094 = null;
				if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
					((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
				else
					((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, ((ChecksumTableEntry) this).anInt7088 * -553176479, (byte) 0, true, 76396423));
				return null;
			}
			if (((ChecksumTableEntry) this).aClass329_7089 != null)
				((ChecksumTableEntry) this).aClass255_7091.method2431(-553176479 * ((ChecksumTableEntry) this).anInt7088, is, ((ChecksumTableEntry) this).aClass329_7089, -1430287423);
		} while (false);
		((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
		if (((ChecksumTableEntry) this).aClass329_7093 != null) {
			((ChecksumTableEntry) this).aByteArray7098 = new byte[(((Class226) ((ChecksumTableEntry) this).aClass226_7094).anInt2521) * -1583970959];
			((ChecksumTableEntry) this).anInt7092 = 0;
		}
		return ((ChecksumTableEntry) this).aClass226_7094;
	}

	byte[] method2251(int i, byte i_20_) {
		try {
			Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 38);
			if (null == class298_sub37_sub16)
				return null;
			byte[] is = class298_sub37_sub16.method3465((short) 6593);
			class298_sub37_sub16.unlink(-1460969981);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.f(").append(')').toString());
		}
	}

	byte[] method2258(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 21);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) -8951);
		class298_sub37_sub16.unlink(-1460969981);
		return is;
	}

	Class298_Sub37_Sub16 method2276(int i, int i_21_) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass437_7085.get((long) i));
		if (class298_sub37_sub16 != null && 0 == i_21_ && !((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && ((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670) {
			class298_sub37_sub16.unlink(-1460969981);
			class298_sub37_sub16 = null;
		}
		if (null == class298_sub37_sub16) {
			if (i_21_ == 0) {
				if (((ChecksumTableEntry) this).aClass329_7093 != null && ((ChecksumTableEntry) this).aByteArray7098[i] != -1)
					class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass255_7091.method2430(i, ((ChecksumTableEntry) this).aClass329_7093, -1787098666));
				else if (!((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
					class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass247_7086.method2338(-553176479 * ((ChecksumTableEntry) this).anInt7088, i, (byte) 2, true, -418226880));
				else
					return null;
			} else if (i_21_ == 1) {
				if (((ChecksumTableEntry) this).aClass329_7093 == null)
					throw new RuntimeException();
				class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass255_7091.method2429(i, ((ChecksumTableEntry) this).aClass329_7093, (byte) -52));
			} else if (2 == i_21_) {
				if (null == ((ChecksumTableEntry) this).aClass329_7093)
					throw new RuntimeException();
				if (-1 != ((ChecksumTableEntry) this).aByteArray7098[i])
					throw new RuntimeException();
				if (!((ChecksumTableEntry) this).aClass247_7086.method2347((byte) -63))
					class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass247_7086.method2338(((ChecksumTableEntry) this).anInt7088 * -553176479, i, (byte) 2, false, -620070396));
				else
					return null;
			} else
				throw new RuntimeException();
			((ChecksumTableEntry) this).aClass437_7085.method5817(class298_sub37_sub16, (long) i);
		}
		if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) 369);
		if (class298_sub37_sub16 instanceof Class298_Sub37_Sub16_Sub2) {
			Class298_Sub37_Sub16 class298_sub37_sub16_22_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7110.reset();
				aCRC32_7110.update(is, 0, is.length - 2);
				int i_23_ = (int) aCRC32_7110.getValue();
				if ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2522[i]) != i_23_)
					throw new RuntimeException();
				if ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516) != null && (null != (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i]))) {
					byte[] is_24_ = (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i]);
					byte[] is_25_ = Class152.method1654(is, 0, is.length - 2, (byte) 3);
					for (int i_26_ = 0; i_26_ < 64; i_26_++) {
						if (is_24_[i_26_] != is_25_[i_26_])
							throw new RuntimeException();
					}
				}
				int i_27_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (i_27_ != ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2514[i]) & 0xffff))
					throw new RuntimeException();
				if (((ChecksumTableEntry) this).aByteArray7098[i] != 1) {
					if (((ChecksumTableEntry) this).aByteArray7098[i] != 0) {
						/* empty */
					}
					((ChecksumTableEntry) this).anInt7092 += 13538129;
					((ChecksumTableEntry) this).aByteArray7098[i] = (byte) 1;
				}
				if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
					class298_sub37_sub16.unlink(-1460969981);
				class298_sub37_sub16_22_ = class298_sub37_sub16;
			} catch (Exception exception) {
				((ChecksumTableEntry) this).aByteArray7098[i] = (byte) -1;
				class298_sub37_sub16.unlink(-1460969981);
				if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && !((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14)) {
					Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = (((ChecksumTableEntry) this).aClass247_7086.method2338(-553176479 * ((ChecksumTableEntry) this).anInt7088, i, (byte) 2, true, 65779920));
					((ChecksumTableEntry) this).aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
				}
				return null;
			}
			return class298_sub37_sub16_22_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7110.reset();
			aCRC32_7110.update(is, 0, is.length - 2);
			int i_28_ = (int) aCRC32_7110.getValue();
			if (i_28_ != (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2522[i]))
				throw new RuntimeException();
			if ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516) != null && null != (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i])) {
				byte[] is_29_ = (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i]);
				byte[] is_30_ = Class152.method1654(is, 0, is.length - 2, (byte) -72);
				for (int i_31_ = 0; i_31_ < 64; i_31_++) {
					if (is_29_[i_31_] != is_30_[i_31_])
						throw new RuntimeException();
				}
			}
			((ChecksumTableEntry) this).aClass247_7086.anInt2735 = 0;
			((ChecksumTableEntry) this).aClass247_7086.anInt2745 = 0;
		} catch (RuntimeException runtimeexception) {
			((ChecksumTableEntry) this).aClass247_7086.method2359(106727223);
			class298_sub37_sub16.unlink(-1460969981);
			if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && !((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14)) {
				Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = (((ChecksumTableEntry) this).aClass247_7086.method2338(-553176479 * ((ChecksumTableEntry) this).anInt7088, i, (byte) 2, true, 1559389901));
				((ChecksumTableEntry) this).aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2514[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2514[i]);
		if (((ChecksumTableEntry) this).aClass329_7093 != null) {
			((ChecksumTableEntry) this).aClass255_7091.method2431(i, is, ((ChecksumTableEntry) this).aClass329_7093, 408687877);
			if (((ChecksumTableEntry) this).aByteArray7098[i] != 1) {
				((ChecksumTableEntry) this).anInt7092 += 13538129;
				((ChecksumTableEntry) this).aByteArray7098[i] = (byte) 1;
			}
		}
		if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
			class298_sub37_sub16.unlink(-1460969981);
		return class298_sub37_sub16;
	}

	byte[] method2259(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 38);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) -19395);
		class298_sub37_sub16.unlink(-1460969981);
		return is;
	}

	int method2257(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass437_7085.get((long) i));
		if (class298_sub37_sub16 != null)
			return class298_sub37_sub16.method3468(-2007766703);
		return 0;
	}

	int method2261(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass437_7085.get((long) i));
		if (class298_sub37_sub16 != null)
			return class298_sub37_sub16.method3468(-2126560995);
		return 0;
	}

	Class298_Sub37_Sub16 method2277(int i, int i_32_) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = ((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass437_7085.get((long) i));
		if (class298_sub37_sub16 != null && 0 == i_32_ && !((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && ((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670) {
			class298_sub37_sub16.unlink(-1460969981);
			class298_sub37_sub16 = null;
		}
		if (null == class298_sub37_sub16) {
			if (i_32_ == 0) {
				if (((ChecksumTableEntry) this).aClass329_7093 != null && ((ChecksumTableEntry) this).aByteArray7098[i] != -1)
					class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass255_7091.method2430(i, ((ChecksumTableEntry) this).aClass329_7093, -1787098666));
				else if (!((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
					class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass247_7086.method2338(-553176479 * ((ChecksumTableEntry) this).anInt7088, i, (byte) 2, true, 1037407823));
				else
					return null;
			} else if (i_32_ == 1) {
				if (((ChecksumTableEntry) this).aClass329_7093 == null)
					throw new RuntimeException();
				class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass255_7091.method2429(i, ((ChecksumTableEntry) this).aClass329_7093, (byte) -21));
			} else if (2 == i_32_) {
				if (null == ((ChecksumTableEntry) this).aClass329_7093)
					throw new RuntimeException();
				if (-1 != ((ChecksumTableEntry) this).aByteArray7098[i])
					throw new RuntimeException();
				if (!((ChecksumTableEntry) this).aClass247_7086.method2347((byte) -55))
					class298_sub37_sub16 = (((ChecksumTableEntry) this).aClass247_7086.method2338(((ChecksumTableEntry) this).anInt7088 * -553176479, i, (byte) 2, false, -835440234));
				else
					return null;
			} else
				throw new RuntimeException();
			((ChecksumTableEntry) this).aClass437_7085.method5817(class298_sub37_sub16, (long) i);
		}
		if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9670)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) -10519);
		if (class298_sub37_sub16 instanceof Class298_Sub37_Sub16_Sub2) {
			Class298_Sub37_Sub16 class298_sub37_sub16_33_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7110.reset();
				aCRC32_7110.update(is, 0, is.length - 2);
				int i_34_ = (int) aCRC32_7110.getValue();
				if ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2522[i]) != i_34_)
					throw new RuntimeException();
				if ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516) != null && (null != (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i]))) {
					byte[] is_35_ = (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i]);
					byte[] is_36_ = Class152.method1654(is, 0, is.length - 2, (byte) 67);
					for (int i_37_ = 0; i_37_ < 64; i_37_++) {
						if (is_35_[i_37_] != is_36_[i_37_])
							throw new RuntimeException();
					}
				}
				int i_38_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (i_38_ != ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2514[i]) & 0xffff))
					throw new RuntimeException();
				if (((ChecksumTableEntry) this).aByteArray7098[i] != 1) {
					if (((ChecksumTableEntry) this).aByteArray7098[i] != 0) {
						/* empty */
					}
					((ChecksumTableEntry) this).anInt7092 += 13538129;
					((ChecksumTableEntry) this).aByteArray7098[i] = (byte) 1;
				}
				if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
					class298_sub37_sub16.unlink(-1460969981);
				class298_sub37_sub16_33_ = class298_sub37_sub16;
			} catch (Exception exception) {
				((ChecksumTableEntry) this).aByteArray7098[i] = (byte) -1;
				class298_sub37_sub16.unlink(-1460969981);
				if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && !((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14)) {
					Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = (((ChecksumTableEntry) this).aClass247_7086.method2338(-553176479 * ((ChecksumTableEntry) this).anInt7088, i, (byte) 2, true, -155086608));
					((ChecksumTableEntry) this).aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
				}
				return null;
			}
			return class298_sub37_sub16_33_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7110.reset();
			aCRC32_7110.update(is, 0, is.length - 2);
			int i_39_ = (int) aCRC32_7110.getValue();
			if (i_39_ != (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2522[i]))
				throw new RuntimeException();
			if ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516) != null && null != (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i])) {
				byte[] is_40_ = (((Class226) ((ChecksumTableEntry) this).aClass226_7094).aByteArrayArray2516[i]);
				byte[] is_41_ = Class152.method1654(is, 0, is.length - 2, (byte) -11);
				for (int i_42_ = 0; i_42_ < 64; i_42_++) {
					if (is_40_[i_42_] != is_41_[i_42_])
						throw new RuntimeException();
				}
			}
			((ChecksumTableEntry) this).aClass247_7086.anInt2735 = 0;
			((ChecksumTableEntry) this).aClass247_7086.anInt2745 = 0;
		} catch (RuntimeException runtimeexception) {
			((ChecksumTableEntry) this).aClass247_7086.method2359(556604655);
			class298_sub37_sub16.unlink(-1460969981);
			if (((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672 && !((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14)) {
				Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = (((ChecksumTableEntry) this).aClass247_7086.method2338(-553176479 * ((ChecksumTableEntry) this).anInt7088, i, (byte) 2, true, -1299366949));
				((ChecksumTableEntry) this).aClass437_7085.method5817(class298_sub37_sub16_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2514[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anIntArray2514[i]);
		if (((ChecksumTableEntry) this).aClass329_7093 != null) {
			((ChecksumTableEntry) this).aClass255_7091.method2431(i, is, ((ChecksumTableEntry) this).aClass329_7093, 1120335343);
			if (((ChecksumTableEntry) this).aByteArray7098[i] != 1) {
				((ChecksumTableEntry) this).anInt7092 += 13538129;
				((ChecksumTableEntry) this).aByteArray7098[i] = (byte) 1;
			}
		}
		if (!((Class298_Sub37_Sub16) class298_sub37_sub16).aBoolean9672)
			class298_sub37_sub16.unlink(-1460969981);
		return class298_sub37_sub16;
	}

	Class226 method2255() {
		if (((ChecksumTableEntry) this).aClass226_7094 != null)
			return ((ChecksumTableEntry) this).aClass226_7094;
		if (null == ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090) {
			if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
				return null;
			((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, -553176479 * ((ChecksumTableEntry) this).anInt7088, (byte) 0, true, -1646455310));
		}
		if (((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090).aBoolean9670)
			return null;
		byte[] is = ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090.method3465((short) 15445);
		do {
			if (((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
				try {
					if (null == is)
						throw new RuntimeException();
					((ChecksumTableEntry) this).aClass226_7094 = new Class226(is, (28953951 * ((ChecksumTableEntry) this).anInt7108), ((ChecksumTableEntry) this).aByteArray7087);
					if (1598805943 * ((ChecksumTableEntry) this).anInt7103 != 201380083 * (((Class226) ((ChecksumTableEntry) this).aClass226_7094).anInt2529))
						throw new RuntimeException();
					break;
				} catch (RuntimeException runtimeexception) {
					((ChecksumTableEntry) this).aClass226_7094 = null;
					if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
						((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
					else
						((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, -553176479 * ((ChecksumTableEntry) this).anInt7088, (byte) 0, true, -1760474693));
					return null;
				}
			}
			try {
				if (null == is)
					throw new RuntimeException();
				((ChecksumTableEntry) this).aClass226_7094 = new Class226(is, 28953951 * ((ChecksumTableEntry) this).anInt7108, ((ChecksumTableEntry) this).aByteArray7087);
			} catch (RuntimeException runtimeexception) {
				((ChecksumTableEntry) this).aClass247_7086.method2359(-1856562324);
				((ChecksumTableEntry) this).aClass226_7094 = null;
				if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
					((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
				else
					((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, ((ChecksumTableEntry) this).anInt7088 * -553176479, (byte) 0, true, 1078557293));
				return null;
			}
			if (((ChecksumTableEntry) this).aClass329_7089 != null)
				((ChecksumTableEntry) this).aClass255_7091.method2431(-553176479 * ((ChecksumTableEntry) this).anInt7088, is, ((ChecksumTableEntry) this).aClass329_7089, -1078065022);
		} while (false);
		((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
		if (((ChecksumTableEntry) this).aClass329_7093 != null) {
			((ChecksumTableEntry) this).aByteArray7098 = new byte[(((Class226) ((ChecksumTableEntry) this).aClass226_7094).anInt2521) * -1583970959];
			((ChecksumTableEntry) this).anInt7092 = 0;
		}
		return ((ChecksumTableEntry) this).aClass226_7094;
	}

	public void method2278(byte i) {
		try {
			if (((ChecksumTableEntry) this).aClass329_7093 != null) {
				((ChecksumTableEntry) this).aBoolean7111 = true;
				if (((ChecksumTableEntry) this).aLinkedNodeList_7100 == null)
					((ChecksumTableEntry) this).aLinkedNodeList_7100 = new LinkedNodeList();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.o(").append(')').toString());
		}
	}

	Class226 method2250(int i) {
		try {
			if (((ChecksumTableEntry) this).aClass226_7094 != null)
				return ((ChecksumTableEntry) this).aClass226_7094;
			if (null == ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090) {
				if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
					return null;
				((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, -553176479 * ((ChecksumTableEntry) this).anInt7088, (byte) 0, true, -1469164318));
			}
			if (((Class298_Sub37_Sub16) ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090).aBoolean9670)
				return null;
			byte[] is = ((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090.method3465((short) -4612);
			do {
				if (((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 instanceof Class298_Sub37_Sub16_Sub2) {
					try {
						if (null == is)
							throw new RuntimeException();
						((ChecksumTableEntry) this).aClass226_7094 = new Class226(is, 28953951 * (((ChecksumTableEntry) this).anInt7108), (((ChecksumTableEntry) this).aByteArray7087));
						if (1598805943 * ((ChecksumTableEntry) this).anInt7103 != 201380083 * (((Class226) (((ChecksumTableEntry) this).aClass226_7094)).anInt2529))
							throw new RuntimeException();
						break;
					} catch (RuntimeException runtimeexception) {
						((ChecksumTableEntry) this).aClass226_7094 = null;
						if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
							((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
						else
							((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, (-553176479 * ((ChecksumTableEntry) this).anInt7088), (byte) 0, true, -165290458));
						return null;
					}
				}
				try {
					if (null == is)
						throw new RuntimeException();
					((ChecksumTableEntry) this).aClass226_7094 = new Class226(is, (28953951 * ((ChecksumTableEntry) this).anInt7108), ((ChecksumTableEntry) this).aByteArray7087);
				} catch (RuntimeException runtimeexception) {
					((ChecksumTableEntry) this).aClass247_7086.method2359(674708053);
					((ChecksumTableEntry) this).aClass226_7094 = null;
					if (((ChecksumTableEntry) this).aClass247_7086.method2340((byte) 14))
						((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
					else
						((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = (((ChecksumTableEntry) this).aClass247_7086.method2338(255, ((ChecksumTableEntry) this).anInt7088 * -553176479, (byte) 0, true, 1947550865));
					return null;
				}
				if (((ChecksumTableEntry) this).aClass329_7089 != null)
					((ChecksumTableEntry) this).aClass255_7091.method2431(-553176479 * ((ChecksumTableEntry) this).anInt7088, is, ((ChecksumTableEntry) this).aClass329_7089, -586951023);
			} while (false);
			((ChecksumTableEntry) this).aClass298_Sub37_Sub16_7090 = null;
			if (((ChecksumTableEntry) this).aClass329_7093 != null) {
				((ChecksumTableEntry) this).aByteArray7098 = (new byte[(((Class226) ((ChecksumTableEntry) this).aClass226_7094).anInt2521) * -1583970959]);
				((ChecksumTableEntry) this).anInt7092 = 0;
			}
			return ((ChecksumTableEntry) this).aClass226_7094;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.a(").append(')').toString());
		}
	}

	byte[] method2262(int i) {
		Class298_Sub37_Sub16 class298_sub37_sub16 = method2271(i, 0, (byte) 124);
		if (null == class298_sub37_sub16)
			return null;
		byte[] is = class298_sub37_sub16.method3465((short) 20083);
		class298_sub37_sub16.unlink(-1460969981);
		return is;
	}

	void method2263(int i) {
		if (null != ((ChecksumTableEntry) this).aClass329_7093) {
			for (Node node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5939(1766612795); null != node; node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5944(49146)) {
				if (7051297995265073167L * node.aLong3188 == (long) i)
					return;
			}
			Node node = new Node();
			node.aLong3188 = (long) i * 4191220306876042991L;
			((ChecksumTableEntry) this).aLinkedNodeList_7105.addlast(node, 1192203281);
		}
	}

	public int method2279(int i) {
		try {
			if (((ChecksumTableEntry) this).aClass226_7094 == null)
				return 0;
			return ((((Class226) ((ChecksumTableEntry) this).aClass226_7094).anInt2527) * -2145352941);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.m(").append(')').toString());
		}
	}

	void method2249(int i) {
		if (null != ((ChecksumTableEntry) this).aClass329_7093) {
			for (Node node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5939(1766612795); null != node; node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5944(49146)) {
				if (7051297995265073167L * node.aLong3188 == (long) i)
					return;
			}
			Node node = new Node();
			node.aLong3188 = (long) i * 4191220306876042991L;
			((ChecksumTableEntry) this).aLinkedNodeList_7105.addlast(node, 429546119);
		}
	}

	void method2265(int i) {
		if (null != ((ChecksumTableEntry) this).aClass329_7093) {
			for (Node node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5939(1766612795); null != node; node = ((ChecksumTableEntry) this).aLinkedNodeList_7105.method5944(49146)) {
				if (7051297995265073167L * node.aLong3188 == (long) i)
					return;
			}
			Node node = new Node();
			node.aLong3188 = (long) i * 4191220306876042991L;
			((ChecksumTableEntry) this).aLinkedNodeList_7105.addlast(node, 1262906259);
		}
	}

	static void method2280(int i, byte i_43_) {
		try {
			for (Node node = GameClient.aClass437_8896.method5816(2109381941); null != node; node = GameClient.aClass437_8896.method5815((byte) -58)) {
				if ((long) i == (7051297995265073167L * node.aLong3188 >> 48 & 0xffffL))
					node.unlink(-1460969981);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.mu(").append(')').toString());
		}
	}

	static final void method2281(ClientScript2 class403, short i) {
		try {
			if (Class452.aBoolean5642 && Class231.aFrame2589 != null)
				Class357.method4276(GraphicsAutoSetup.clientPreferences.aClass422_Sub12_7543.method5669((byte) 4), -1, -1, false, 1414482658);
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			boolean bool = ((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) == 1);
			String string_44_ = new StringBuilder().append(EnumType.method6131((byte) -59)).append(string).toString();
			ErrorContext.method4172(string_44_, bool, GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-1851684401) == 5, GameClient.aBoolean8867, GameClient.aBoolean8651, (byte) 49);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.afo(").append(')').toString());
		}
	}

	public static void method2282(int i, int i_45_, String string, String string_46_, String string_47_, String string_48_, int i_49_) {
		try {
			Class25.method393(i, i_45_, string, string_46_, string_47_, string_48_, null, -1, 1446000206);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.p(").append(')').toString());
		}
	}

	static void method2283(byte i) {
		try {
			int i_50_ = 0;
			if (GraphicsAutoSetup.clientPreferences != null)
				i_50_ = GraphicsAutoSetup.clientPreferences.aScreenSizePreference_7566.method5654(-1747444886);
			if (i_50_ == 2) {
				int i_51_ = (-639974669 * Class78.anInt733 > 800 ? 800 : Class78.anInt733 * -639974669);
				int i_52_ = (GameClient.anInt6472 * 1282634425 > 600 ? 600 : 1282634425 * GameClient.anInt6472);
				Class462.canvasWidth = -2010408377 * i_51_;
				GameClient.anInt6473 = -753018213 * ((Class78.anInt733 * -639974669 - i_51_) / 2);
				Class298_Sub40_Sub9.anInt9716 = 1445266787 * i_52_;
				GameClient.anInt6474 = 0;
			} else if (i_50_ == 1) {
				int i_53_ = (-639974669 * Class78.anInt733 > 1024 ? 1024 : Class78.anInt733 * -639974669);
				int i_54_ = (GameClient.anInt6472 * 1282634425 > 768 ? 768 : GameClient.anInt6472 * 1282634425);
				Class462.canvasWidth = i_53_ * -2010408377;
				GameClient.anInt6473 = -753018213 * ((-639974669 * Class78.anInt733 - i_53_) / 2);
				Class298_Sub40_Sub9.anInt9716 = 1445266787 * i_54_;
				GameClient.anInt6474 = 0;
			} else {
				Class462.canvasWidth = Class78.anInt733 * -607961243;
				GameClient.anInt6473 = 0;
				Class298_Sub40_Sub9.anInt9716 = GameClient.anInt6472 * -1935672693;
				GameClient.anInt6474 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aaz.gm(").append(')').toString());
		}
	}
}
