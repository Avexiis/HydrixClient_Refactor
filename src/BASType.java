
/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Iterator;

public class BASType {
	public boolean osrs;
	public int[][] anIntArrayArray3710;
	public int anInt3711 = 512849763;
	public int[] anIntArray3712 = null;
	public int[] anIntArray3713 = null;
	int anInt3714 = 0;
	public int anInt3715 = -241536037;
	public int anInt3716;
	public int anInt3717;
	Matrix43f[] aClass222Array3718;
	public int anInt3719;
	public int anInt3720;
	public int anInt3721;
	public int anInt3722;
	public int anInt3723;
	public int anInt3724;
	Class349 aClass349_3725;
	public int anInt3726;
	public int anInt3727;
	public int anInt3728;
	public int anInt3729;
	public int anInt3730;
	public int anInt3731;
	public int[] anIntArray3732;
	public int anInt3733 = 1442268255;
	public int anInt3734;
	public int anInt3735;
	public int anInt3736;
	public int anInt3737;
	public int anInt3738;
	public int anInt3739;
	public int anInt3740;
	public int anInt3741;
	public int[] anIntArray3742;
	public int anInt3743;
	public int anInt3744;
	public int anInt3745;
	public int anInt3746;
	public int anInt3747;
	public int anInt3748;
	public int anInt3749;
	public int anInt3750;
	public int anInt3751;
	public int anInt3752;
	public int[][] anIntArrayArray3753;
	public int anInt3754;
	public int anInt3755;
	public boolean aBoolean3756;
	public static Class298_Sub25 aClass298_Sub25_3757;
	static int anInt3758;
	public static String aString3759;

	public void decode(Packet buffer, int opcode) {
		if (1 == opcode) {
			anInt3711 = get_sequence_id(buffer.readBigSmart()) * -512849763;
			anInt3717 = get_sequence_id(buffer.readBigSmart()) * -1216995793;
		} else if (2 == opcode) {
			anInt3755 = get_sequence_id(buffer.readBigSmart()) * -1201368129;
		} else if (opcode == 3) {
			anInt3722 = get_sequence_id(buffer.readBigSmart()) * 1316025001;
		} else if (4 == opcode) {
			anInt3727 = get_sequence_id(buffer.readBigSmart()) * -1511636755;
		} else if (5 == opcode) {
			anInt3728 = get_sequence_id(buffer.readBigSmart()) * 1034489103;
		} else if (opcode == 6) {
			anInt3721 = get_sequence_id(buffer.readBigSmart()) * -1261244237;
		} else if (opcode == 7) {
			anInt3749 = get_sequence_id(buffer.readBigSmart()) * -1711775317;
		} else if (opcode == 8) {
			anInt3746 = get_sequence_id(buffer.readBigSmart()) * -1593946535;
		} else if (9 == opcode) {
			anInt3724 = get_sequence_id(buffer.readBigSmart()) * 1566713043;
		} else if (26 == opcode) {
			anInt3735 = (short) (buffer.readUnsignedByte() * 4) * 1013056483;
			anInt3736 = (short) (buffer.readUnsignedByte() * 4) * -1453025501;
		} else if (opcode == 27) {
			if (anIntArrayArray3710 == null) {
				anIntArrayArray3710 = new int[aClass349_3725.aClass405_3707.anIntArray5267.length][];
			}
			int i_1_ = buffer.readUnsignedByte();
			anIntArrayArray3710[i_1_] = new int[6];
			for (int i_2_ = 0; i_2_ < 6; i_2_++) {
				anIntArrayArray3710[i_1_][i_2_] = buffer.readShort(2080193946);
			}
		} else if (opcode == 28) {
			int i_3_ = buffer.readUnsignedByte();
			anIntArray3732 = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				anIntArray3732[i_4_] = buffer.readUnsignedByte();
				if (anIntArray3732[i_4_] == 255) {
					anIntArray3732[i_4_] = -1;
				}
			}
		} else if (opcode == 29) {
			anInt3744 = buffer.readUnsignedByte() * 115903875;
		} else if (opcode == 30) {
			anInt3745 = buffer.readUnsignedShort() * 719028937;
		} else if (31 == opcode) {
			anInt3726 = buffer.readUnsignedByte() * -369164975;
		} else if (32 == opcode) {
			anInt3747 = buffer.readUnsignedShort() * 1012239243;
		} else if (33 == opcode) {
			anInt3748 = buffer.readShort(1712856653) * 92325015;
		} else if (34 == opcode) {
			anInt3720 = buffer.readUnsignedByte() * 477826083;
		} else if (opcode == 35) {
			anInt3750 = buffer.readUnsignedShort() * -1803824059;
		} else if (36 == opcode) {
			anInt3751 = buffer.readShort(1850319623) * 1175766897;
		} else if (37 == opcode) {
			anInt3752 = buffer.readUnsignedByte() * 1083720273;
		} else if (38 == opcode) {
			anInt3715 = get_sequence_id(buffer.readBigSmart()) * 241536037;
		} else if (39 == opcode) {
			anInt3733 = get_sequence_id(buffer.readBigSmart()) * -1442268255;
		} else if (opcode == 40) {
			anInt3741 = get_sequence_id(buffer.readBigSmart()) * 564296781;
		} else if (opcode == 41) {
			anInt3719 = get_sequence_id(buffer.readBigSmart()) * -1440097851;
		} else if (42 == opcode) {
			anInt3723 = get_sequence_id(buffer.readBigSmart()) * 1270333873;
		} else if (opcode == 43) {
			anInt3738 = get_sequence_id(buffer.readBigSmart()) * 697230329;
		} else if (44 == opcode) {
			anInt3754 = get_sequence_id(buffer.readBigSmart()) * -853635893;
		} else if (opcode == 45) {
			anInt3716 = buffer.readUnsignedShort() * -928434405;
		} else if (46 == opcode) {
			anInt3729 = get_sequence_id(buffer.readBigSmart()) * 537960313;
		} else if (opcode == 47) {
			anInt3743 = get_sequence_id(buffer.readBigSmart()) * 1019547381;
		} else if (48 == opcode) {
			anInt3731 = get_sequence_id(buffer.readBigSmart()) * -1402060193;
		} else if (opcode == 49) {
			anInt3739 = get_sequence_id(buffer.readBigSmart()) * -549936551;
		} else if (50 == opcode) {
			anInt3737 = get_sequence_id(buffer.readBigSmart()) * -71356649;
		} else if (opcode == 51) {
			anInt3730 = get_sequence_id(buffer.readBigSmart()) * -1236000399;
		} else if (52 == opcode) {
			int i_5_ = buffer.readUnsignedByte();
			anIntArray3712 = new int[i_5_];
			anIntArray3713 = new int[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				anIntArray3712[i_6_] = get_sequence_id(buffer.readBigSmart());
				int i_7_ = buffer.readUnsignedByte();
				anIntArray3713[i_6_] = i_7_;
				anInt3714 += i_7_ * 81529747;
			}
		} else if (opcode == 53) {
			aBoolean3756 = false;
		} else if (opcode == 54) {
			anInt3734 = (buffer.readUnsignedByte() << 6) * 989376361;
			anInt3740 = (buffer.readUnsignedByte() << 6) * -1343302987;
		} else if (55 == opcode) {
			if (anIntArray3742 == null) {
				anIntArray3742 = new int[aClass349_3725.aClass405_3707.anIntArray5267.length];
			}
			int i_8_ = buffer.readUnsignedByte();
			anIntArray3742[i_8_] = buffer.readUnsignedShort();
		} else if (opcode == 56) {
			if (null == anIntArrayArray3753) {
				anIntArrayArray3753 = new int[aClass349_3725.aClass405_3707.anIntArray5267.length][];
			}
			int i_9_ = buffer.readUnsignedByte();
			anIntArrayArray3753[i_9_] = new int[3];
			for (int i_10_ = 0; i_10_ < 3; i_10_++) {
				anIntArrayArray3753[i_9_][i_10_] = buffer.readShort(1788063911);
			}
		}
	}

	public int get_sequence_id(int sequence) {
		if (!osrs) {
			return sequence;
		}
		if (sequence == 65535 || sequence == -1) {
			return -1;
		}
		return sequence + OSRSData.SEQUENCES_OFFSET;
	}

	public Matrix43f[] method4207(byte i) {
		try {
			if (aClass222Array3718 != null) {
				return aClass222Array3718;
			}
			if (null == anIntArrayArray3710) {
				return null;
			}
			aClass222Array3718 = new Matrix43f[anIntArrayArray3710.length];
			for (int i_11_ = 0; i_11_ < anIntArrayArray3710.length; i_11_++) {
				int i_12_ = 0;
				int i_13_ = 0;
				int i_14_ = 0;
				int i_15_ = 0;
				int i_16_ = 0;
				int i_17_ = 0;
				if (anIntArrayArray3710[i_11_] != null) {
					i_12_ = anIntArrayArray3710[i_11_][0];
					i_13_ = anIntArrayArray3710[i_11_][1];
					i_14_ = anIntArrayArray3710[i_11_][2];
					i_15_ = anIntArrayArray3710[i_11_][3] << 3;
					i_16_ = anIntArrayArray3710[i_11_][4] << 3;
					i_17_ = anIntArrayArray3710[i_11_][5] << 3;
				}
				if (i_12_ == 0 && 0 == i_13_ && 0 == i_14_ && 0 == i_15_ && 0 == i_16_ && i_17_ == 0) {
					if (i <= 12) {
						throw new IllegalStateException();
					}
				} else {
					Matrix43f class222 = aClass222Array3718[i_11_] = new Matrix43f();
					if (0 != i_17_) {
						class222.method2071(0.0F, 0.0F, 1.0F, Class220.method2049(i_17_));
					}
					if (0 != i_15_) {
						class222.method2071(1.0F, 0.0F, 0.0F, Class220.method2049(i_15_));
					}
					if (0 != i_16_) {
						class222.method2071(0.0F, 1.0F, 0.0F, Class220.method2049(i_16_));
					}
					class222.method2064(i_12_, i_13_, i_14_);
				}
			}
			return aClass222Array3718;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.i(").append(')').toString());
		}
	}

	BASType() {
		anInt3717 = 1216995793;
		anInt3741 = -564296781;
		anInt3719 = 1440097851;
		anInt3723 = -1270333873;
		anInt3721 = 1261244237;
		anInt3749 = 1711775317;
		anInt3746 = 1593946535;
		anInt3724 = -1566713043;
		anInt3755 = 1201368129;
		anInt3722 = -1316025001;
		anInt3727 = 1511636755;
		anInt3728 = -1034489103;
		anInt3729 = -537960313;
		anInt3743 = -1019547381;
		anInt3731 = 1402060193;
		anInt3739 = 549936551;
		anInt3737 = 71356649;
		anInt3730 = 1236000399;
		anInt3735 = 0;
		anInt3736 = 0;
		anInt3734 = 0;
		anInt3740 = 0;
		anInt3744 = 0;
		anInt3745 = 0;
		anInt3726 = 0;
		anInt3747 = 0;
		anInt3748 = 0;
		anInt3720 = 0;
		anInt3750 = 0;
		anInt3751 = 0;
		anInt3752 = -1083720273;
		anInt3738 = -697230329;
		anInt3754 = 853635893;
		anInt3716 = 928434405;
		aBoolean3756 = true;
	}

	public int method4208(int i) {
		try {
			if (anInt3711 * -809747019 != -1) {
				return anInt3711 * -809747019;
			}
			if (null != anIntArray3712) {
				int i_18_ = (int) (Math.random() * (-5125477 * anInt3714));
				int i_19_;
				for (i_19_ = 0; i_18_ >= anIntArray3713[i_19_]; i_19_++) {
					i_18_ -= anIntArray3713[i_19_];
				}
				return anIntArray3712[i_19_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.b(").append(')').toString());
		}
	}

	public boolean method4209(int i, byte i_20_) {
		try {
			if (-1 == i) {
				return false;
			}
			if (i == -809747019 * anInt3711) {
				return true;
			}
			if (null != anIntArray3712) {
				for (int element : anIntArray3712) {
					if (i == element) {
						return true;
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.p(").append(')').toString());
		}
	}

	public int[] method4210(int i) {
		try {
			HashTable class437 = new HashTable(16);
			Class316.method3844(-809747019 * anInt3711, class437, -518506092);
			if (null != anIntArray3712) {
				int[] is = anIntArray3712;
				for (int i_23_ : is) {
					Class316.method3844(i_23_, class437, -996745872);
				}
			}
			Class316.method3844(844607405 * anInt3715, class437, -1466126807);
			Class316.method3844(1061677153 * anInt3733, class437, -537938152);
			Class316.method3844(-129111857 * anInt3717, class437, -1080833419);
			Class316.method3844(anInt3741 * -277799803, class437, -1770644447);
			Class316.method3844(315374861 * anInt3719, class437, -1518977416);
			Class316.method3844(anInt3723 * -1532631215, class437, -674677793);
			Class316.method3844(230243963 * anInt3721, class437, -1811756409);
			Class316.method3844(491753731 * anInt3749, class437, -1070117202);
			Class316.method3844(-2054940183 * anInt3746, class437, -891093089);
			Class316.method3844(-783166629 * anInt3724, class437, -2016176230);
			Class316.method3844(anInt3755 * 328817727, class437, -1375066780);
			Class316.method3844(anInt3722 * -1238642279, class437, -1493937450);
			Class316.method3844(anInt3727 * -907666203, class437, -1237374124);
			Class316.method3844(124010991 * anInt3728, class437, -707153443);
			Class316.method3844(anInt3729 * 371497673, class437, -455707757);
			Class316.method3844(anInt3743 * -279532195, class437, -455027567);
			Class316.method3844(anInt3731 * 1885772191, class437, -507782637);
			Class316.method3844(anInt3739 * 914130409, class437, -997447340);
			Class316.method3844(anInt3737 * 250017959, class437, -1792088224);
			Class316.method3844(anInt3730 * -119373935, class437, -909523000);
			int[] is = new int[class437.method5814(1901508554)];
			int i_24_ = 0;
			Iterator iterator = class437.iterator();
			while (iterator.hasNext()) {
				Node node = (Node) iterator.next();
				is[i_24_++] = (int) (node.aLong3188 * 7051297995265073167L);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.k(").append(')').toString());
		}
	}

	void method4211(Packet class298_sub53, int i) {
		for (;;) {
			int i_25_ = class298_sub53.readUnsignedByte();
			if (i_25_ == 0) {
				if (i != 162499609) {
					throw new IllegalStateException();
				}
				break;
			}
			decode(class298_sub53, i_25_);
		}
	}

	static final void method4212(ClientScript2 class403, short i) {
		try {
			int i_26_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			class403.anInt5241 -= 1938723502;
			String string = (String) class403.anObjectArray5240[class403.anInt5241 * -203050393];
			String string_27_ = (String) class403.anObjectArray5240[1 + class403.anInt5241 * -203050393];
			if (string.length() <= 500 && string_27_.length() <= 500) {
				GameShell.method2791(i_26_, string, string_27_, 600657777);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.aps(").append(')').toString());
		}
	}

	static final void method4213(ClientScript2 class403, int i) {
		try {
			Class242.anInt2709 = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.abp(").append(')').toString());
		}
	}

	public static Class336 method4214(int i, int i_28_, short i_29_) {
		try {
			Class315.aClass336_Sub6_3307.toX = i * -760677635;
			Class315.aClass336_Sub6_3307.toY = i_28_ * 167105303;
			Class315.aClass336_Sub6_3307.sizeX = -1544157451;
			Class315.aClass336_Sub6_3307.sizeY = -1468199503;
			return Class315.aClass336_Sub6_3307;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.a(").append(')').toString());
		}
	}

	public static int method4215(int i, int i_30_, float f, int i_31_) {
		try {
			return Class298_Sub32_Sub38.method3387(i, i_30_, (int) f, 1963059640);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.x(").append(')').toString());
		}
	}

	static final void method4216(ClientScript2 class403, int i) {
		try {
			GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aGraphicsPresetPreference_7576, 0,
					-1906997591);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.anv(").append(')').toString());
		}
	}

	static final void method4217(ClientScript2 class403, int i) {
		try {
			int i_32_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919
					- 1] = GraphicsSetup.clientPreferences.aRemoveRoofPreference_7547.method5612(i_32_, 1352882135);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.aoc(").append(')').toString());
		}
	}

	static void method4218(int i) {
		try {
			if (DevConsoleState.anInt98 * 256666041 < 102) {
				DevConsoleState.anInt98 += 879545142;
			}
			if (-917301319 * DevConsoleState.anInt104 != -1
					&& 3224865510845692061L * Class146.aLong1576 < TimeUtils.getTime((byte) 1)) {
				for (int i_33_ = DevConsoleState.anInt104 * -917301319; i_33_ < DevConsoleState.aStringArray109.length; i_33_++) {
					if (DevConsoleState.aStringArray109[i_33_].startsWith("pause")) {
						int i_34_ = 5;
						try {
							i_34_ = Integer.parseInt(DevConsoleState.aStringArray109[i_33_].substring(6));
						} catch (Exception exception) {
							/* empty */
						}
						DevConsole.sendDevConsoleMsg(new StringBuilder().append("Pausing for ").append(i_34_)
								.append(" seconds...").toString());
						DevConsoleState.anInt104 = (i_33_ + 1) * -1428832631;
						Class146.aLong1576 = (TimeUtils.getTime((byte) 1) + 1000 * i_34_) * 6717445677357895093L;
						return;
					}
					DevConsoleState.aString101 = DevConsoleState.aStringArray109[i_33_];
					Class142.method1568(false, 1496417723);
				}
				DevConsoleState.anInt104 = 1428832631;
			}
			if (0 != 1170859143 * GameClient.anInt8682) {
				DevConsoleState.scrollOffset -= GameClient.anInt8682 * 1787831191;
				if (DevConsoleState.scrollOffset * -1731316011 >= DevConsoleState.lineCount * -2035787443) {
					DevConsoleState.scrollOffset = DevConsoleState.lineCount * -1477098343 - 205738621;
				}
				if (-1731316011 * DevConsoleState.scrollOffset < 0) {
					DevConsoleState.scrollOffset = 0;
				}
				GameClient.anInt8682 = 0;
			}
			for (int i_35_ = 0; i_35_ < 1351936279 * GameClient.anInt8894; i_35_++) {
				Interface16 interface16 = GameClient.anInterface16Array8710[i_35_];
				int i_36_ = interface16.method218((byte) -29);
				char c = interface16.method217((byte) -110);
				int i_37_ = interface16.method220((byte) 0);
				if (84 == i_36_) {
					Class142.method1568(false, 1496417723);
				}
				if (i_36_ == 80) {
					Class142.method1568(true, 1496417723);
				} else if (i_36_ == 66 && 0 != (i_37_ & 0x4)) {
					if (Wall.aClipboard9941 != null) {
						String string = "";
						for (int i_38_ = DevConsoleState.lines.length - 1; i_38_ >= 0; i_38_--) {
							if (DevConsoleState.lines[i_38_] != null && DevConsoleState.lines[i_38_].length() > 0) {
								string = new StringBuilder().append(string).append(DevConsoleState.lines[i_38_])
										.append('\n').toString();
							}
						}
						Wall.aClipboard9941.setContents(new StringSelection(string), null);
					}
				} else if (67 == i_36_ && 0 != (i_37_ & 0x4)) {
					if (Wall.aClipboard9941 != null) {
						try {
							Transferable transferable = Wall.aClipboard9941.getContents(null);
							if (transferable != null) {
								String string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
								if (null != string) {
									String[] strings = SceneObject.splitText(string, '\n', 1017779885);
									Class55.method606(strings, 399274522);
								}
							}
						} catch (Exception exception) {
							/* empty */
						}
					}
				} else if (i_36_ == 85 && -1182747927 * DevConsoleState.anInt99 > 0) {
					DevConsoleState.aString101 = new StringBuilder()
							.append(DevConsoleState.aString101.substring(0, -1182747927 * DevConsoleState.anInt99 - 1))
							.append(DevConsoleState.aString101.substring(DevConsoleState.anInt99 * -1182747927)).toString();
					DevConsoleState.anInt99 -= 1914783065;
				} else if (101 == i_36_ && -1182747927 * DevConsoleState.anInt99 < DevConsoleState.aString101.length()) {
					DevConsoleState.aString101 = new StringBuilder()
							.append(DevConsoleState.aString101.substring(0, -1182747927 * DevConsoleState.anInt99))
							.append(DevConsoleState.aString101.substring(1 + DevConsoleState.anInt99 * -1182747927)).toString();
				} else if (i_36_ == 96 && DevConsoleState.anInt99 * -1182747927 > 0) {
					DevConsoleState.anInt99 -= 1914783065;
				} else if (i_36_ == 97 && -1182747927 * DevConsoleState.anInt99 < DevConsoleState.aString101.length()) {
					DevConsoleState.anInt99 += 1914783065;
				} else if (102 == i_36_) {
					DevConsoleState.anInt99 = 0;
				} else if (103 == i_36_) {
					DevConsoleState.anInt99 = DevConsoleState.aString101.length() * 1914783065;
				} else if (104 == i_36_ && -1217082313 * DevConsoleState.anInt105 < DevConsoleState.lines.length) {
					DevConsoleState.anInt105 += -1305958009;
					Class55.method607(-214283222);
					DevConsoleState.anInt99 = DevConsoleState.aString101.length() * 1914783065;
				} else if (105 == i_36_ && -1217082313 * DevConsoleState.anInt105 > 0) {
					DevConsoleState.anInt105 -= -1305958009;
					Class55.method607(1763987987);
					DevConsoleState.anInt99 = DevConsoleState.aString101.length() * 1914783065;
				} else if (LocType.method5788(c, (short) 160) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
					DevConsoleState.aString101 = new StringBuilder()
							.append(DevConsoleState.aString101.substring(0, -1182747927 * DevConsoleState.anInt99))
							.append(GameClient.anInterface16Array8710[i_35_].method217((byte) 9))
							.append(DevConsoleState.aString101.substring(DevConsoleState.anInt99 * -1182747927)).toString();
					DevConsoleState.anInt99 += 1914783065;
				}
			}
			GameClient.anInt8894 = 0;
			GameClient.anInt8687 = 0;
			LoginData.method4301(2005471811);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("op.u(").append(')').toString());
		}
	}
}
