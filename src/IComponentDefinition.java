import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* IComponentDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IComponentDefinition {
	short[] aShortArray1118;
	public static int anInt1119;
	public Object[] anObjectArray1120;
	public static int anInt1121;
	public Object[] onMouseLeaveScript;
	public static int anInt1123;
	public int anInt1124;
	public static int anInt1125;
	public static int anInt1126;

	static void method50123(int x) {
		try {
			Class var_class = java.lang.ClassLoader.class;
			Field field = var_class.getDeclaredField("nativeLibraries");
			Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
			Method method = var_class_124_.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public static int anInt1127;
	public static int anInt1128;
	public static int anInt1129;
	public static int anInt1130;
	public static int anInt1131;
	public static int anInt1132;
	public int anInt1133;
	public static int anInt1134 = 5;
	public static CachingHashMap aClass348_1135;
	static CachingHashMap aClass348_1136;
	public Object[] anObjectArray1137;
	public static CachingHashMap aClass348_1138;
	public static boolean aBoolean1139;
	public int anInt1140;
	public int anInt1141;
	public int interfacehash = -533296807;
	public int anInt1143;
	public int type;
	public int contentType;
	public byte aByte1146;
	public byte aByte1147;
	public byte aByte1148;
	public byte aByte1149;
	public Object[] anObjectArray1150;
	public int anInt1151;
	public Animator aAnimator_1152;
	public int anInt1153;
	public int component = 263105643;
	public int anInt1155;
	public int width;
	public Object[] anObjectArray1157;
	public int anInt1158;
	public int anInt1159;
	public int parentId;
	public boolean hidden;
	public int height;
	public int anInt1163;
	public Object[] anObjectArray1164;
	public boolean disableHover;
	public int anInt1166;
	public int anInt1167;
	public int anInt1168;
	public int anInt1169;
	public int anInt1170;
	public boolean aBoolean1171;
	public Object[] anObjectArray1172;
	public int anInt1173;
	public boolean aBoolean1174;
	public int anInt1175;
	public int anInt1176;
	public Object[] anObjectArray1177;
	public int anInt1178;
	public int anInt1179;
	public boolean aBoolean1180;
	public boolean aBoolean1181;
	public boolean aBoolean1182;
	public boolean clickMask;
	public int anInt1184;
	public byte[] aByteArray1185;
	public boolean aBoolean1186;
	public boolean aBoolean1187;
	public int[] configScript;
	public int[] anIntArray1189;
	public int anInt1190;
	public int anInt1191;
	public int anInt1192;
	public int anInt1193;
	public int anInt1194;
	public String[] aStringArray1195;
	public boolean repeat;
	public int anInt1197;
	public int anInt1198;
	public boolean aBoolean1199;
	public Object[] anObjectArray1200;
	public int anInt1201;
	public int anInt1202;
	short[] aShortArray1203;
	short[] aShortArray1204;
	public static int anInt1205 = 5;
	public static int anInt1206;
	public int anInt1207;
	public int anInt1208;
	public Object[] anObjectArray1209;
	public int anInt1210;
	public boolean aBoolean1211;
	public String aString1212;
	public boolean aBoolean1213;
	public int anInt1214;
	public int anInt1215;
	public boolean aBoolean1216;
	public int anInt1217;
	public ClickableGeometry aClickableGeometry_1218;
	public Class298_Sub38 aClass298Sub38_1219;
	public boolean aBoolean1220;
	public int anInt1221;
	public byte[] aByteArray1222;
	public int transparency;
	public static int anInt1224 = 1;
	public static int anInt1225 = 2;
	public static int anInt1226 = 4;
	public static int anInt1227 = 8;
	public String aString1228;
	public Object[] anObjectArray1229;
	public String aString1230;
	public int[] anIntArray1231;
	public int anInt1232;
	public IComponentDefinition aClass105_1233;
	short[] aShortArray1234;
	public int anInt1235;
	public int anInt1236;
	public String aString1237;
	public boolean hasScripts;
	public int anInt1239;
	public Object[] anObjectArray1240;
	public int anInt1241;
	public int anInt1242;
	public Object[] anObjectArray1243;
	public Object[] onMouseHoverScript;
	public Object[] onMouseHoverTextScript;
	public boolean aBoolean1246;
	public Object[] anObjectArray1247;
	public int anInt1248;
	public Object[] anObjectArray1249;
	public Object[] anObjectArray1250;
	public int anInt1251;
	public int anInt1252;
	public int anInt1253;
	public int[] anIntArray1254;
	public Object[] anObjectArray1255;
	public int[] anIntArray1256;
	public Object[] anObjectArray1257;
	public int[] anIntArray1258;
	public String aString1259;
	public int[] anIntArray1260;
	public Object[] anObjectArray1261;
	public int anInt1262;
	public Object[] anObjectArray1263;
	public Object[] anObjectArray1264;
	public static int anInt1265;
	public static int anInt1266 = 0;
	public Object[] anObjectArray1267;
	public Object[] anObjectArray1268;
	public static int anInt1269;
	public Object[] anObjectArray1270;
	public Object[] anObjectArray1271;
	public int mouseOverCursor;
	public Object[] anObjectArray1273;
	public Object[] anObjectArray1274;
	public Object[] anObjectArray1275;
	public int[] anIntArray1276;
	public Object[] anObjectArray1277;
	public int anInt1278;
	HashTable aClass437_1279;
	public int zds3;
	public int anInt1281;
	public int anInt1282;
	public int anInt1283;
	public int tempZoomDistance;
	public Object[] anObjectArray1285;
	public int anInt1286;
	public Object[] anObjectArray1287;
	public int anInt1288;
	public int anInt1289;
	public int anInt1290;
	public Object[] anObjectArray1291;
	public IComponentDefinition[] aClass105Array1292;
	public IComponentDefinition[] aClass105Array1293;
	public boolean aBoolean1294;
	public boolean aBoolean1295;
	static CachingHashMap aClass348_1296;
	public int anInt1297;
	public int anInt1298;
	public int anInt1299;
	public int anInt1300;
	public int anInt1301;
	public int anInt1302;
	public int anInt1303;
	public int anInt1304;
	public int[] anIntArray1305;
	public int zoomDistance;
	public int anInt1306;
	public Class498 aClass498_1307;
    public int interHash;
    public int basePositionX;
    public int basePositionY;
    
    
    public void setBasePositionX(int x) {
	this.basePositionX = x;
	this.anInt1286 = this.basePositionX * 2145953887;
    }

    public void setBasePositionY(int y) {
	this.basePositionY = y;
	anInt1159 = basePositionY * 1215865909;
    }

	public String method1109(int i, String string, int i_0_) {
		try {
			if (null == this.aClass437_1279) {
				return string;
			}
			LinkableObject linkableObject = (LinkableObject) this.aClass437_1279.get(i);
			if (linkableObject == null) {
				return string;
			}
			return (String) linkableObject.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.aa(").append(')').toString());
		}
	}

	void method1110(Packet class298_sub53, int i) {
		try {
			int i_1_ = class298_sub53.readUnsignedByte();
			if (i_1_ == 255) {
				i_1_ = -1;
			}
			type = class298_sub53.readUnsignedByte() * -800405999;
			if ((-1215239439 * type & 0x80) != 0) {
				type = -800405999 * (type * -1215239439 & 0x7f);
				aString1259 = class298_sub53.gstr();
			}
			contentType = class298_sub53.readUnsignedShort() * -680446123;
			anInt1286 = class298_sub53.readShort(1719356411) * 2145953887;
			anInt1159 = class298_sub53.readShort(2010058143) * 1215865909;
			anInt1253 = class298_sub53.readUnsignedShort() * -478399925;
			anInt1153 = class298_sub53.readUnsignedShort() * -1661995333;
			aByte1148 = class298_sub53.readByte();
			aByte1149 = class298_sub53.readByte();
			aByte1146 = class298_sub53.readByte();
			aByte1147 = class298_sub53.readByte();
			parentId = class298_sub53.readUnsignedShort() * -1171161349;
			if (65535 == parentId * 1573706803) {
				parentId = 1171161349;
			} else {
				parentId = (parentId * 1573706803 + (-440872681 * interfacehash & ~0xffff)) * -1171161349;
			}
			int i_2_ = class298_sub53.readUnsignedByte();
			hidden = 0 != (i_2_ & 0x1);
			if (i_1_ >= 0) {
				disableHover = (i_2_ & 0x2) != 0;
			}
			if (0 == type * -1215239439) {
				anInt1168 = class298_sub53.readUnsignedShort() * -1609060375;
				anInt1169 = class298_sub53.readUnsignedShort() * -1638942269;
				if (i_1_ < 0) {
					disableHover = class298_sub53.readUnsignedByte() == 1;
				}
			}
			if (-1215239439 * type == 5) {
				anInt1175 = class298_sub53.readUnsignedInt() * 1986266571;
				anInt1306 = class298_sub53.readUnsignedShort() * -216431639;
				int i_3_ = class298_sub53.readUnsignedByte();
				repeat = 0 != (i_3_ & 0x1);
				aBoolean1182 = (i_3_ & 0x2) != 0;
				transparency = class298_sub53.readUnsignedByte() * 728904583;
				anInt1178 = class298_sub53.readUnsignedByte() * 1158843261;
				anInt1251 = class298_sub53.readUnsignedInt() * -1448553585;
				aBoolean1180 = class298_sub53.readUnsignedByte() == 1;
				aBoolean1181 = class298_sub53.readUnsignedByte() == 1;
				anInt1170 = class298_sub53.readUnsignedInt() * -695431873;
				if (i_1_ >= 3) {
					clickMask = class298_sub53.readUnsignedByte() == 1;
				}
			}
			if (6 == -1215239439 * type) {
				anInt1184 = -1530138943;
				anInt1151 = class298_sub53.gSmart2or4n() * -1825442367;
				int i_4_ = class298_sub53.readUnsignedByte();
				boolean bool = 1 == (i_4_ & 0x1);
				aBoolean1187 = (i_4_ & 0x2) == 2;
				aBoolean1199 = 4 == (i_4_ & 0x4);
				aBoolean1186 = 8 == (i_4_ & 0x8);
				if (bool) {
					anInt1193 = class298_sub53.readShort(1863144228) * 437213185;
					anInt1194 = class298_sub53.readShort(1761728846) * 1266800241;
					anInt1190 = class298_sub53.readUnsignedShort() * -801721775;
					anInt1262 = class298_sub53.readUnsignedShort() * 1590511671;
					anInt1192 = class298_sub53.readUnsignedShort() * -2064327287;
					zoomDistance = class298_sub53.readUnsignedShort();
					tempZoomDistance = zoomDistance * -1066050969;
				} else if (aBoolean1187) {
					anInt1193 = class298_sub53.readShort(1670425609) * 437213185;
					anInt1194 = class298_sub53.readShort(1566977554) * 1266800241;
					anInt1282 = class298_sub53.readShort(1594666911) * -1324973519;
					anInt1190 = class298_sub53.readUnsignedShort() * -801721775;
					anInt1262 = class298_sub53.readUnsignedShort() * 1590511671;
					anInt1192 = class298_sub53.readUnsignedShort() * -2064327287;
					tempZoomDistance = class298_sub53.readShort(1622637773) * -1066050969;
				}
				anInt1290 = class298_sub53.gSmart2or4n() * 1587382585;
				if (0 != aByte1148) {
					anInt1221 = class298_sub53.readUnsignedShort() * 1811727251;
				}
				if (0 != aByte1149) {
					anInt1198 = class298_sub53.readUnsignedShort() * 1572578003;
				}
			}
			if (type * -1215239439 == 4) {
				anInt1210 = class298_sub53.gSmart2or4n() * -2074006897;
				if (i_1_ >= 2) {
					aBoolean1211 = class298_sub53.readUnsignedByte() == 1;
				}
				aString1212 = class298_sub53.gstr();
				if (aString1212.toLowerCase().contains("runescape")) {
					aString1212 = aString1212.replace("runescape", "Nexus");
					aString1212 = aString1212.replace("RuneScape", "Nexus");
					aString1212 = aString1212.replace("Runescape", "Nexus");
				}
				anInt1191 = class298_sub53.readUnsignedByte() * 1629063197;
				anInt1214 = class298_sub53.readUnsignedByte() * -1733811909;
				anInt1124 = class298_sub53.readUnsignedByte() * 210030285;
				aBoolean1216 = class298_sub53.readUnsignedByte() == 1;
				anInt1170 = class298_sub53.readUnsignedInt() * -695431873;
				transparency = class298_sub53.readUnsignedByte() * 728904583;
				if (i_1_ >= 0) {
					anInt1217 = class298_sub53.readUnsignedByte() * -1455284437;
				}
			}
			if (3 == -1215239439 * type) {
				anInt1170 = class298_sub53.readUnsignedInt() * -695431873;
				aBoolean1171 = class298_sub53.readUnsignedByte() == 1;
				transparency = class298_sub53.readUnsignedByte() * 728904583;
			}
			if (9 == -1215239439 * type) {
				anInt1173 = class298_sub53.readUnsignedByte() * -1041514725;
				anInt1170 = class298_sub53.readUnsignedInt() * -695431873;
				aBoolean1174 = class298_sub53.readUnsignedByte() == 1;
			}
			int i_5_ = class298_sub53.g3();
			int i_6_ = class298_sub53.readUnsignedByte();
			if (i_6_ != 0) {
				aByteArray1185 = new byte[11];
				aByteArray1222 = new byte[11];
				anIntArray1276 = new int[11];
				for (/**/; i_6_ != 0; i_6_ = class298_sub53.readUnsignedByte()) {
					int i_7_ = (i_6_ >> 4) - 1;
					i_6_ = i_6_ << 8 | class298_sub53.readUnsignedByte();
					i_6_ &= 0xfff;
					if (i_6_ == 4095) {
						i_6_ = -1;
					}
					byte i_8_ = class298_sub53.readByte();
					if (i_8_ != 0) {
						aBoolean1220 = true;
					}
					byte i_9_ = class298_sub53.readByte();
					anIntArray1276[i_7_] = i_6_;
					aByteArray1185[i_7_] = i_8_;
					aByteArray1222[i_7_] = i_9_;
				}
			}
			aString1228 = class298_sub53.gstr();
			int i_10_ = class298_sub53.readUnsignedByte();
			int i_11_ = i_10_ & 0xf;
			int i_12_ = i_10_ >> 4;
			if (i_11_ > 0) {
				aStringArray1195 = new String[i_11_];
				for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
					aStringArray1195[i_13_] = class298_sub53.gstr();
				}
			}
			if (i_12_ > 0) {
				int i_14_ = class298_sub53.readUnsignedByte();
				anIntArray1231 = new int[1 + i_14_];
				for (int i_15_ = 0; i_15_ < anIntArray1231.length; i_15_++) {
					anIntArray1231[i_15_] = -1;
				}
				anIntArray1231[i_14_] = class298_sub53.readUnsignedShort();
			}
			if (i_12_ > 1) {
				int i_16_ = class298_sub53.readUnsignedByte();
				anIntArray1231[i_16_] = class298_sub53.readUnsignedShort();
			}
			aString1230 = class298_sub53.gstr();
			if (aString1230.equals("")) {
				aString1230 = null;
			}
			anInt1239 = class298_sub53.readUnsignedByte() * 476443207;
			anInt1235 = class298_sub53.readUnsignedByte() * -978869921;
			anInt1236 = class298_sub53.readUnsignedByte() * 2138287179;
			aString1237 = class298_sub53.gstr();
			int i_17_ = -1;
			if (MagnetConfig.method784(i_5_, (byte) 111) != 0) {
				i_17_ = class298_sub53.readUnsignedShort();
				if (i_17_ == 65535) {
					i_17_ = -1;
				}
				anInt1179 = class298_sub53.readUnsignedShort() * 2021607495;
				if (-2051415689 * anInt1179 == 65535) {
					anInt1179 = -2021607495;
				}
				anInt1163 = class298_sub53.readUnsignedShort() * 1830595391;
				if (65535 == anInt1163 * -1149188929) {
					anInt1163 = -1830595391;
				}
			}
			if (i_1_ >= 0) {
				mouseOverCursor = class298_sub53.readUnsignedShort() * -1122372539;
				if (65535 == -1200030067 * mouseOverCursor) {
					mouseOverCursor = 1122372539;
				}
			}
			aClass298Sub38_1219 = new Class298_Sub38(i_5_, i_17_);
			if (i_1_ >= 0) {
				int i_18_ = class298_sub53.readUnsignedByte();
				for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
					int i_20_ = class298_sub53.g3();
					int i_21_ = class298_sub53.readUnsignedInt();
					this.aClass437_1279.method5817(new Class298_Sub35(i_21_), i_20_);
				}
				int i_22_ = class298_sub53.readUnsignedByte();
				for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
					int i_24_ = class298_sub53.g3();
					String string = class298_sub53.readJagString(681479919);
					this.aClass437_1279.method5817(new LinkableObject(string), i_24_);
				}
			}
			anObjectArray1257 = method1111(class298_sub53, 422796707);
			onMouseHoverScript = method1111(class298_sub53, 1852122968);
			onMouseLeaveScript = method1111(class298_sub53, 747815110);
			anObjectArray1120 = method1111(class298_sub53, -1548123654);
			anObjectArray1249 = method1111(class298_sub53, 1097191149);
			anObjectArray1177 = method1111(class298_sub53, 1634014672);
			anObjectArray1172 = method1111(class298_sub53, -756661481);
			anObjectArray1255 = method1111(class298_sub53, 1661043786);
			anObjectArray1209 = method1111(class298_sub53, 1194567641);
			anObjectArray1264 = method1111(class298_sub53, 1382442228);
			if (i_1_ >= 0) {
				anObjectArray1247 = method1111(class298_sub53, -699098198);
			}
			onMouseHoverTextScript = method1111(class298_sub53, 1910073926);
			anObjectArray1240 = method1111(class298_sub53, 1197869623);
			anObjectArray1263 = method1111(class298_sub53, -894827658);
			anObjectArray1150 = method1111(class298_sub53, 281193138);
			anObjectArray1243 = method1111(class298_sub53, -2041361593);
			anObjectArray1291 = method1111(class298_sub53, 138548004);
			anObjectArray1137 = method1111(class298_sub53, 756814807);
			anObjectArray1229 = method1111(class298_sub53, 22261945);
			anObjectArray1200 = method1111(class298_sub53, -354820234);
			anObjectArray1157 = method1111(class298_sub53, 749663504);
			configScript = method1118(class298_sub53, 1930385253);
			anIntArray1254 = method1118(class298_sub53, 1885577185);
			anIntArray1256 = method1118(class298_sub53, 2036299454);
			anIntArray1258 = method1118(class298_sub53, 1866337228);
			anIntArray1260 = method1118(class298_sub53, 1808578494);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.x(").append(')').toString());
		}
	}

	Object[] method1111(Packet class298_sub53, int i) {
		try {
			int i_25_ = class298_sub53.readUnsignedByte();
			if (0 == i_25_) {
				return null;
			}
			Object[] objects = new Object[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
				int i_27_ = class298_sub53.readUnsignedByte();
				if (i_27_ == 0) {
					objects[i_26_] = new Integer(class298_sub53.readUnsignedInt());
				} else if (i_27_ == 1) {
					objects[i_26_] = class298_sub53.gstr();
				}
			}
			hasScripts = true;
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.r(").append(')').toString());
		}
	}

	public Class264 method1112(Class197 class197, Interface10 interface10, int i) {
		try {
			Class264 class264 = (Class264) class197.method1883(interface10, 1508815983 * anInt1210, false, aBoolean1211, -2063324548);
			aBoolean1139 = class264 == null;
			return class264;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.s(").append(')').toString());
		}
	}

	public Class505 method1113(Class197 class197, Interface10 interface10, byte i) {
		try {
			Class505 class505 = class197.method1879(interface10, anInt1210 * 1508815983, 522165232);
			aBoolean1139 = null == class505;
			return class505;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.z(").append(')').toString());
		}
	}

	public void method1114(GraphicsToolkit class_ra, ModelPart modelPart, Matrix43f class222, int i, int i_28_) {
		try {
			modelPart.method4786(class222);
			Class85[] class85s = modelPart.method4781();
			MagnetConfig[] magnetConfigs = modelPart.method4728();
			if ((null == aClickableGeometry_1218 || aClickableGeometry_1218.aBoolean3772) && (null != class85s || magnetConfigs != null)) {
				aClickableGeometry_1218 = ClickableGeometry.method4232(i, false);
			}
			if (aClickableGeometry_1218 != null) {
				aClickableGeometry_1218.method4231(class_ra, i, class85s, magnetConfigs, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.t(").append(')').toString());
		}
	}

	public void method1115(int i, String string, int i_29_) {
		try {
			if (aStringArray1195 == null || aStringArray1195.length <= i) {
				String[] strings = new String[1 + i];
				if (null != aStringArray1195) {
					for (int i_30_ = 0; i_30_ < aStringArray1195.length; i_30_++) {
						strings[i_30_] = aStringArray1195[i_30_];
					}
				}
				aStringArray1195 = strings;
			}
			aStringArray1195[i] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.j(").append(')').toString());
		}
	}

	public Class117 method1116(GraphicsToolkit class_ra, int i) {
		try {
			long l = (long) (interfacehash * -440872681) << 32 | -1309843523 * component & 0xffffffffL;
			Class117 class117 = (Class117) aClass348_1136.get(l);
			if (class117 != null) {
				if (anInt1175 * 1411971043 != class117.anInt1398 * 1509093479) {
					aClass348_1136.method4193(l);
					class117 = null;
				}
				if (class117 != null) {
					return class117;
				}
			}
			Class89 class89 = Class89.method987(Class124.aClass243_1480, 1411971043 * anInt1175, 0);
			if (null == class89) {
				return null;
			}
			int i_31_ = class89.anInt812 + class89.anInt815 + class89.anInt814;
			int i_32_ = class89.anInt811 + class89.anInt816 + class89.anInt813;
			int[] is = new int[i_32_];
			int[] is_33_ = new int[i_32_];
			for (int i_34_ = 0; i_34_ < class89.anInt816; i_34_++) {
				int i_35_ = 0;
				int i_36_ = class89.anInt812;
				for (int i_37_ = 0; i_37_ < class89.anInt812; i_37_++) {
					if (class89.aByteArray818[class89.anInt812 * i_34_ + i_37_] != 0) {
						i_35_ = i_37_;
						break;
					}
				}
				for (int i_38_ = class89.anInt812 - 1; i_38_ >= i_35_; i_38_--) {
					if (class89.aByteArray818[class89.anInt812 * i_34_ + i_38_] != 0) {
						i_36_ = 1 + i_38_;
						break;
					}
				}
				is[class89.anInt811 + i_34_] = class89.anInt815 + i_35_;
				is_33_[i_34_ + class89.anInt811] = i_36_ - i_35_;
			}
			Class_ta class_ta = class_ra.method5034(i_31_, i_32_, is, is_33_);
			if (null == class_ta) {
				return null;
			}
			class117 = new Class117(i_31_, i_32_, is_33_, is, class_ta, 1411971043 * anInt1175);
			aClass348_1136.put(class117, l);
			return class117;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.l(").append(')').toString());
		}
	}

	public int method1117(int i, int i_39_, int i_40_) {
		try {
			if (null == this.aClass437_1279) {
				return i_39_;
			}
			Class298_Sub35 class298_sub35 = (Class298_Sub35) this.aClass437_1279.get(i);
			if (class298_sub35 == null) {
				return i_39_;
			}
			return class298_sub35.anInt7394 * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.ax(").append(')').toString());
		}
	}

	int[] method1118(Packet class298_sub53, int i) {
		try {
			int i_41_ = class298_sub53.readUnsignedByte();
			if (0 == i_41_) {
				return null;
			}
			int[] is = new int[i_41_];
			for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
				is[i_42_] = class298_sub53.readUnsignedInt();
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.q(").append(')').toString());
		}
	}

	public void method1119(int i, String string, byte i_43_) {
		try {
			if (null == this.aClass437_1279) {
				this.aClass437_1279 = new HashTable(16);
				this.aClass437_1279.method5817(new LinkableObject(string), i);
			} else {
				LinkableObject linkableObject = (LinkableObject) this.aClass437_1279.get(i);
				if (null != linkableObject) {
					linkableObject.unlink(-1460969981);
				}
				this.aClass437_1279.method5817(new LinkableObject(string), i);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.ae(").append(')').toString());
		}
	}

	public void method1120(int i, short i_44_, short i_45_, int i_46_) {
		try {
			if (i < 5) {
				if (this.aShortArray1204 == null) {
					this.aShortArray1204 = new short[5];
					this.aShortArray1234 = new short[5];
				}
				this.aShortArray1204[i] = i_44_;
				this.aShortArray1234[i] = i_45_;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.av(").append(')').toString());
		}
	}

	static {
		anInt1119 = -100407581;
		anInt1206 = 1654605574;
		anInt1121 = -1904191576;
		anInt1269 = -196322511;
		anInt1123 = 196278887;
		anInt1265 = 232770470;
		anInt1125 = -256176781;
		anInt1126 = -1056295064;
		anInt1127 = -569549655;
		anInt1128 = 1370710423;
		anInt1129 = 1219781210;
		anInt1130 = -8749061;
		anInt1131 = 1611206784;
		anInt1132 = -1933463779;
		aClass348_1135 = new CachingHashMap(3000000, 200);
		aClass348_1136 = new CachingHashMap(8);
		aClass348_1296 = new CachingHashMap(4);
		aClass348_1138 = new CachingHashMap(50);
		aBoolean1139 = false;
	}

	public Skybox method1121(Class317 class317, Class131 class131, int i) {
		try {
			if (-1 == anInt1283 * 925824753) {
				return null;
			}
			long l = (1779368503 * anInt1304 & 0xffffL) << 48 | (anInt1202 * -163313477 & 0xffffL) << 32 | (anInt1176 * -1234146137 & 0xffffL) << 16 | anInt1283 * 925824753 & 0xffffL;
			Skybox skybox = (Skybox) aClass348_1296.get(l);
			if (skybox == null) {
				skybox = class317.createSkyboxFace(anInt1283 * 925824753, 1779368503 * anInt1304, -163313477 * anInt1202, anInt1176 * -1234146137, class131, (byte) 89);
				aClass348_1296.put(skybox, l);
			}
			return skybox;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.h(").append(')').toString());
		}
	}

	public void method1122(int i) {
		try {
			anObjectArray1257 = null;
			anObjectArray1240 = null;
			anObjectArray1263 = null;
			anObjectArray1150 = null;
			anObjectArray1243 = null;
			onMouseHoverScript = null;
			onMouseHoverTextScript = null;
			onMouseLeaveScript = null;
			anObjectArray1291 = null;
			anObjectArray1137 = null;
			anObjectArray1249 = null;
			anObjectArray1120 = null;
			anObjectArray1177 = null;
			configScript = null;
			anObjectArray1172 = null;
			anIntArray1254 = null;
			anObjectArray1255 = null;
			anIntArray1256 = null;
			anObjectArray1200 = null;
			anIntArray1258 = null;
			anObjectArray1157 = null;
			anIntArray1260 = null;
			anObjectArray1209 = null;
			anObjectArray1264 = null;
			anObjectArray1247 = null;
			anObjectArray1229 = null;
			anObjectArray1267 = null;
			anObjectArray1268 = null;
			anObjectArray1285 = null;
			anObjectArray1270 = null;
			anObjectArray1271 = null;
			anObjectArray1273 = null;
			anObjectArray1274 = null;
			anObjectArray1275 = null;
			anObjectArray1250 = null;
			anObjectArray1277 = null;
			anObjectArray1164 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.w(").append(')').toString());
		}
	}

	public void method1123(int i, int i_47_) {
		try {
			if (this.aClass437_1279 != null) {
				Node node = this.aClass437_1279.get(i);
				if (node != null) {
					node.unlink(-1460969981);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.ao(").append(')').toString());
		}
	}

	public ModelPart method1124(GraphicsToolkit class_ra, int i, Class349 class349, IdentityKitTypeList identityKitTypeList, Class507 class507, Class477 class477, SeqTypeList class395, Interface23 interface23, Animator animator, Class366 class366, int i_48_) {
		try {
			aBoolean1139 = false;
			if (0 == 1548853569 * anInt1184) {
				return null;
			}
			if (1 == 1548853569 * anInt1184 && -1 == anInt1151 * 572201537) {
				return null;
			}
			if (1 == anInt1184 * 1548853569) {
				int i_49_ = i;
				if (null != animator) {
					i |= animator.method5829(-1790708337);
				}
				long l = -1L;
				long[] ls = Packet.aLongArray7619;
				if (this.aShortArray1118 != null) {
					for (int i_50_ = 0; i_50_ < this.aShortArray1118.length; i_50_++) {
						l = l >>> 8 ^ ls[(int) ((l ^ this.aShortArray1118[i_50_] >> 8) & 0xffL)];
						l = l >>> 8 ^ ls[(int) ((l ^ this.aShortArray1118[i_50_]) & 0xffL)];
						l = l >>> 8 ^ ls[(int) ((l ^ this.aShortArray1203[i_50_] >> 8) & 0xffL)];
						l = l >>> 8 ^ ls[(int) ((l ^ this.aShortArray1203[i_50_]) & 0xffL)];
					}
					i |= 0x4000;
				}
				if (null != this.aShortArray1204) {
					for (int i_51_ = 0; i_51_ < this.aShortArray1204.length; i_51_++) {
						l = l >>> 8 ^ ls[(int) ((l ^ this.aShortArray1204[i_51_] >> 8) & 0xffL)];
						l = l >>> 8 ^ ls[(int) ((l ^ this.aShortArray1204[i_51_]) & 0xffL)];
						l = l >>> 8 ^ ls[(int) ((l ^ this.aShortArray1234[i_51_] >> 8) & 0xffL)];
						l = l >>> 8 ^ ls[(int) ((l ^ this.aShortArray1234[i_51_]) & 0xffL)];
					}
					i |= 0x8000;
				}
				long l_52_ = (long) (class_ra.anInt5298 * 580915349) << 59 | (long) (anInt1184 * 1548853569) << 54 | (long) (anInt1151 * 572201537) << 38 | l & 0x3fffffffffL;
				ModelPart modelPart = (ModelPart) aClass348_1138.get(l_52_);
				if (null == modelPart || class_ra.method5017(modelPart.m(), i) != 0) {
					if (modelPart != null) {
						i = class_ra.method5004(i, modelPart.m());
					}
					Model class64 = Model.method751(RuntimeException_Sub3.aClass243_6310, 572201537 * anInt1151, 0);
					if (null == class64) {
						aBoolean1139 = true;
						return null;
					}
					if (class64.version < 13) {
						class64.method755(2);
					}
					modelPart = class_ra.method5037(class64, i, Class21.anInt275 * 951783317, 64, 768);
					if (null != this.aShortArray1118) {
						for (int i_53_ = 0; i_53_ < this.aShortArray1118.length; i_53_++) {
							modelPart.X(this.aShortArray1118[i_53_], this.aShortArray1203[i_53_]);
						}
					}
					if (this.aShortArray1204 != null) {
						for (int i_54_ = 0; i_54_ < this.aShortArray1204.length; i_54_++) {
							modelPart.W(this.aShortArray1204[i_54_], this.aShortArray1234[i_54_]);
						}
					}
					aClass348_1138.put(modelPart, l_52_);
				}
				if (animator != null) {
					modelPart = modelPart.method4755((byte) 1, i, true);
					animator.method5839(modelPart, 0, -719593032);
				}
				modelPart.KA(i_49_);
				return modelPart;
			}
			if (2 == 1548853569 * anInt1184) {
				ModelPart modelPart = class507.method6269(572201537 * anInt1151, -1438978079).method6237(class_ra, i, interface23, animator, aClass498_1307, 636300802);
				if (null == modelPart) {
					aBoolean1139 = true;
					return null;
				}
				return modelPart;
			}
			if (anInt1184 * 1548853569 == 3) {
				if (class366 == null) {
					return null;
				}
				ModelPart modelPart = class366.method4543(class_ra, i, identityKitTypeList, class507, class477, class395, interface23, animator, -275612851);
				if (modelPart == null) {
					aBoolean1139 = true;
					return null;
				}
				return modelPart;
			}
			if (anInt1184 * 1548853569 == 4) {
				ItemDefinitions class468 = class477.getItemDefinitions(anInt1151 * 572201537);
				ModelPart modelPart = class468.method6029(class_ra, i, 10, class366, animator, 0, 0, 0, 0, 2097526071);
				if (null == modelPart) {
					aBoolean1139 = true;
					return null;
				}
				return modelPart;
			}
			if (6 == anInt1184 * 1548853569) {
				ModelPart modelPart = class507.method6269(anInt1151 * 572201537, -2061874989).method6246(class_ra, i, class349, interface23, animator, null, null, null, 0, aClass498_1307, -884053309);
				if (modelPart == null) {
					aBoolean1139 = true;
					return null;
				}
				return modelPart;
			}
			if (7 == 1548853569 * anInt1184) {
				if (null == class366) {
					return null;
				}
				int i_55_ = anInt1151 * 572201537 >>> 16;
				int i_56_ = anInt1151 * 572201537 & 0xffff;
				int i_57_ = 1148770405 * anInt1140;
				ModelPart modelPart = class366.method4544(class_ra, i, identityKitTypeList, class395, animator, i_55_, i_56_, i_57_, (byte) 0);
				if (null == modelPart) {
					aBoolean1139 = true;
					return null;
				}
				return modelPart;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.y(").append(')').toString());
		}
	}

	public void method1125(int i, int i_58_, int i_59_) {
		try {
			if (null == this.aClass437_1279) {
				this.aClass437_1279 = new HashTable(16);
				this.aClass437_1279.method5817(new Class298_Sub35(i_58_), i);
			} else {
				Class298_Sub35 class298_sub35 = (Class298_Sub35) this.aClass437_1279.get(i);
				if (class298_sub35 == null) {
					this.aClass437_1279.method5817(new Class298_Sub35(i_58_), i);
				} else {
					class298_sub35.anInt7394 = -898670337 * i_58_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.ak(").append(')').toString());
		}
	}

	public void method1126(int i, short i_60_, short i_61_, int i_62_) {
		try {
			if (i < 5) {
				if (null == this.aShortArray1118) {
					this.aShortArray1118 = new short[5];
					this.aShortArray1203 = new short[5];
				}
				this.aShortArray1118[i] = i_60_;
				this.aShortArray1203[i] = i_61_;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.ad(").append(')').toString());
		}
	}

	public void method1127(int i, int i_63_, byte i_64_) {
		try {
			if (anIntArray1231 == null || anIntArray1231.length <= i) {
				int[] is = new int[i + 1];
				if (null != anIntArray1231) {
					for (int i_65_ = 0; i_65_ < anIntArray1231.length; i_65_++) {
						is[i_65_] = anIntArray1231[i_65_];
					}
					for (int i_66_ = anIntArray1231.length; i_66_ < i; i_66_++) {
						is[i_66_] = -1;
					}
				}
				anIntArray1231 = is;
			}
			anIntArray1231[i] = i_63_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.o(").append(')').toString());
		}
	}

	public IComponentDefinition() {
		contentType = 0;
		aByte1146 = (byte) 0;
		aByte1147 = (byte) 0;
		aByte1148 = (byte) 0;
		aByte1149 = (byte) 0;
		anInt1286 = 0;
		anInt1159 = 0;
		anInt1253 = 0;
		anInt1153 = 0;
		anInt1143 = 0;
		anInt1155 = 0;
		width = 0;
		height = 0;
		anInt1158 = 349940087;
		anInt1242 = 153098785;
		parentId = 1171161349;
		hidden = false;
		anInt1179 = -2021607495;
		anInt1163 = -1830595391;
		mouseOverCursor = 1122372539;
		disableHover = false;
		anInt1166 = 0;
		anInt1167 = 0;
		anInt1168 = 0;
		anInt1169 = 0;
		anInt1170 = 0;
		aBoolean1171 = false;
		transparency = 0;
		anInt1173 = -1041514725;
		aBoolean1174 = false;
		anInt1175 = -1986266571;
		anInt1306 = 0;
		repeat = false;
		anInt1178 = 0;
		anInt1251 = 0;
		aBoolean1182 = false;
		clickMask = true;
		anInt1184 = -1530138943;
		anInt1140 = -908204397;
		anInt1297 = 0;
		anInt1248 = 0;
		anInt1190 = 0;
		anInt1262 = 0;
		anInt1192 = 0;
		anInt1193 = 0;
		anInt1194 = 0;
		anInt1282 = 0;
		tempZoomDistance = 769085500;
		anInt1221 = 0;
		anInt1198 = 0;
		aBoolean1199 = false;
		aBoolean1186 = false;
		anInt1201 = -1251584190;
		anInt1210 = 2074006897;
		aBoolean1211 = true;
		aString1212 = "";
		anInt1191 = 0;
		anInt1214 = 0;
		anInt1124 = 0;
		aBoolean1216 = false;
		anInt1217 = 0;
		aBoolean1246 = false;
		aClass298Sub38_1219 = Class298_Sub38.aClass298Sub38_7415;
		aBoolean1220 = false;
		aString1228 = "";
		anInt1232 = 7527659;
		aClass105_1233 = null;
		anInt1239 = 0;
		anInt1235 = 0;
		anInt1236 = anInt1266 * 623805157;
		aString1237 = "";
		hasScripts = false;
		zds3 = -643064669;
		anInt1281 = 0;
		aBoolean1213 = false;
		anInt1283 = 153142767;
		anInt1289 = -1025047959;
		anInt1290 = -1587382585;
		aBoolean1294 = false;
		aBoolean1295 = false;
		anInt1215 = -607532293;
		anInt1288 = 0;
		anInt1298 = 0;
		anInt1299 = 0;
		anInt1300 = 0;
		anInt1301 = 0;
		anInt1302 = 0;
		anInt1303 = -1339690151;
		anInt1133 = 217934215;
	}

	public Class57 method1128(GraphicsToolkit class_ra, int i) {
		try {
			aBoolean1139 = false;
			long l = ((aBoolean1180 ? 1L : 0L) << 38) + ((aBoolean1182 ? 1L : 0L) << 35) + anInt1175 * 1411971043 + ((long) (anInt1178 * 547522005) << 36) + ((aBoolean1181 ? 1L : 0L) << 39) + ((long) (anInt1251 * -2065110161) << 40);
			Class57 class57 = (Class57) aClass348_1135.get(l);
			if (null != class57) {
				return class57;
			}
			Class89 class89 = Class89.method987(Class124.aClass243_1480, 1411971043 * anInt1175, 0);
			if (class89 == null) {
				aBoolean1139 = true;
				return null;
			}
			if (aBoolean1180) {
				class89.method980();
			}
			if (aBoolean1181) {
				class89.method992();
			}
			if (anInt1178 * 547522005 > 0) {
				class89.method985(547522005 * anInt1178);
			} else if (0 != -2065110161 * anInt1251) {
				class89.method985(1);
			}
			if (547522005 * anInt1178 >= 1) {
				class89.method986(1);
			}
			if (anInt1178 * 547522005 >= 2) {
				class89.method986(16777215);
			}
			if (0 != anInt1251 * -2065110161) {
				class89.method988(~0xffffff | -2065110161 * anInt1251);
			}
			class57 = class_ra.method5125(class89, true);
			aClass348_1135.method4185(class57, l, class57.method623() * class57.method625() * 4, (byte) -114);
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.n(").append(')').toString());
		}
	}

	public static void method1129(int[] is, Object[] objects, byte i) {
		try {
			Class419.method5602(is, objects, 0, is.length - 1, -641027314);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.u(").append(')').toString());
		}
	}

	static void method1130(ClientScript2 class403, int i) {
		try {
			class403.anIntArray5244[class403.anInt5239 * 681479919 - 1] = Class316.aClass362_3318.method4307(class403.anIntArray5244[class403.anInt5239 * 681479919 - 1], 245040087).method4563(Class128.aClass148_6331, GameClient.anIntArray8828, (byte) 76) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.m(").append(')').toString());
		}
	}

	static final void method1131(ClientScript2 class403, short i) {
		try {
			Class390 class390 = class403.aBoolean5261 ? class403.aClass390_5247 : class403.aClass390_5246;
			IComponentDefinition class105 = class390.aClass105_4168;
			RSInterface RSInterface = class390.aRSInterface_4167;
			Class321.method3925(class105, RSInterface, class403, (byte) -72);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.im(").append(')').toString());
		}
	}

	static final void method1132(ClientScript2 class403, int i) {
		try {
			int i_67_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2057, GameClient.gameConnection.aClass449_330, (byte) 37);
			class298_sub36.buffer.writeShort(i_67_, 16711935);
			GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -67);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.su(").append(')').toString());
		}
	}

	static final void method1133(ClientScript2 class403, short i) {
		try {
			if (null != BASType.aClass298_Sub25_3757) {
				class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = 1;
				class403.aClass298_Sub25_5237 = BASType.aClass298_Sub25_3757;
			} else {
				class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.xe(").append(')').toString());
		}
	}

	static final void method1134(ClientScript2 class403, int i) {
		try {
			int i_68_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
			MapDetails mapDetails = Class298_Sub7.method2864(142245824);
			if (null != mapDetails) {
				boolean bool = mapDetails.method3451(i_68_ >> 14 & 0x3fff, i_68_ & 0x3fff, Class388.anIntArray4156, -1054516511);
				if (bool) {
					class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class388.anIntArray4156[1];
					class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class388.anIntArray4156[2];
				} else {
					class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = -1;
					class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = -1;
				}
			} else {
				class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = -1;
				class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.aee(").append(')').toString());
		}
	}

	static final void method1135(Class365_Sub1 class365_sub1, ClientScript2 class403, int i) {
		try {
			boolean bool = false;
			int i_69_ = 0;
			int i_70_ = 0;
			int i_71_ = 0;
			int i_72_ = 0;
			if (class365_sub1.aClass302_Sub1Array7726 != null) {
				for (Class302_Sub1 class302_sub1 : class365_sub1.aClass302_Sub1Array7726) {
					if (class302_sub1.aBoolean7644) {
						int i_74_;
						int i_75_;
						if (class302_sub1.anInt7643 < class302_sub1.anInt7641) {
							i_74_ = class302_sub1.anInt7643 - class302_sub1.anInt7645;
							i_75_ = class302_sub1.anInt7641 + class302_sub1.anInt7645;
						} else {
							i_74_ = class302_sub1.anInt7641 - class302_sub1.anInt7645;
							i_75_ = class302_sub1.anInt7645 + class302_sub1.anInt7643;
						}
						int i_76_;
						int i_77_;
						if (class302_sub1.anInt7640 < class302_sub1.anInt7642) {
							i_76_ = class302_sub1.anInt7640 - class302_sub1.anInt7645;
							i_77_ = class302_sub1.anInt7645 + class302_sub1.anInt7642;
						} else {
							i_76_ = class302_sub1.anInt7642 - class302_sub1.anInt7645;
							i_77_ = class302_sub1.anInt7645 + class302_sub1.anInt7640;
						}
						if (!bool || i_74_ < i_69_) {
							i_69_ = i_74_;
						}
						if (!bool || i_76_ < i_70_) {
							i_70_ = i_76_;
						}
						if (!bool || i_75_ > i_71_) {
							i_71_ = i_75_;
						}
						if (!bool || i_77_ > i_72_) {
							i_72_ = i_77_;
						}
						bool = true;
					}
				}
			}
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = bool ? 1 : 0;
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = i_69_;
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = i_70_;
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = i_71_;
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = i_72_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.apj(").append(')').toString());
		}
	}

	public static void method1136(int i, int i_78_) {
		try {
			Class79.aClass298_Sub19_Sub1_737.method2975(i >> 8, 911461196);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("eg.d(").append(')').toString());
		}
    }

    public int getComponentId() {
	return interHash - (getWidgetId() << 16);
    }

    public int getWidgetId() {
	return interHash >> 16;
    }
}

