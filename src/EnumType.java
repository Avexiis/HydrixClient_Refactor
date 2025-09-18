/* Class483 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EnumType {
	int anInt6036;
	public char aChar6037;
	int anInt6038;
	HashMap aHashMap6039;
	Map aMap6040;
	Object[] anObjectArray6041;
	public char aChar6042;
	String aString6043 = "null";
	public static Applet mainApplet;

	public String method6122(int i, byte i_0_) {
		try {
			Object object = method6126(i, (short) 5996);
			if (object == null)
				return ((EnumType) this).aString6043;
			return (String) object;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.p(").append(')').toString());
		}
	}

	void method6123(Packet class298_sub53, int i) {
		try {
			for (;;) {
				int i_1_ = class298_sub53.readUnsignedByte();
				if (0 == i_1_) {
					if (i >= 1635270652) {
						/* empty */
					}
					break;
				}
				method6124(class298_sub53, i_1_, 950174382);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.a(").append(')').toString());
		}
	}

	void method6124(Packet class298_sub53, int i, int i_2_) {
		try {
			if (1 == i)
				aChar6042 = Class493.method6190(class298_sub53.readByte(), 2015897871);
			else if (i == 2)
				aChar6037 = Class493.method6190(class298_sub53.readByte(), 1877656812);
			else if (3 == i)
				((EnumType) this).aString6043 = class298_sub53.getString();
			else if (4 == i)
				((EnumType) this).anInt6038 = class298_sub53.readUnsignedInt() * -1961153765;
			else if (i == 5 || i == 6) {
				((EnumType) this).anInt6036 = class298_sub53.readUnsignedShort() * -1158380671;
				((EnumType) this).aMap6040 = new HashMap(-1179140991 * ((EnumType) this).anInt6036);
				for (int i_3_ = 0; i_3_ < ((EnumType) this).anInt6036 * -1179140991; i_3_++) {
					int i_4_ = class298_sub53.readUnsignedInt();
					java.io.Serializable serializable;
					if (i == 5)
						serializable = class298_sub53.getString();
					else
						serializable = new Integer(class298_sub53.readUnsignedInt());
					((EnumType) this).aMap6040.put(new Integer(i_4_), serializable);
				}
			} else if (7 == i || 8 == i) {
				int i_5_ = class298_sub53.readUnsignedShort();
				((EnumType) this).anInt6036 = class298_sub53.readUnsignedShort() * -1158380671;
				((EnumType) this).anObjectArray6041 = new Object[i_5_];
				for (int i_6_ = 0; i_6_ < -1179140991 * ((EnumType) this).anInt6036; i_6_++) {
					int i_7_ = class298_sub53.readUnsignedShort();
					if (i == 7)
						((EnumType) this).anObjectArray6041[i_7_] = class298_sub53.getString();
					else
						((EnumType) this).anObjectArray6041[i_7_] = new Integer(class298_sub53.readUnsignedInt());
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.f(").append(')').toString());
		}
	}

	public int method6125(int i, int i_8_) {
		try {
			Object object = method6126(i, (short) 31709);
			if (null == object)
				return ((EnumType) this).anInt6038 * -1363462381;
			return ((Integer) object).intValue();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.b(").append(')').toString());
		}
	}

	Object method6126(int i, short i_9_) {
		try {
			if (((EnumType) this).anObjectArray6041 != null) {
				if (i < 0 || i >= ((EnumType) this).anObjectArray6041.length)
					return null;
				return ((EnumType) this).anObjectArray6041[i];
			}
			if (null != ((EnumType) this).aMap6040)
				return ((EnumType) this).aMap6040.get(new Integer(i));
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.i(").append(')').toString());
		}
	}

	public boolean method6127(Object object, byte i) {
		try {
			if (((EnumType) this).anInt6036 * -1179140991 == 0)
				return false;
			if (((EnumType) this).aHashMap6039 == null)
				method6130(671224629);
			return ((EnumType) this).aHashMap6039.containsKey(object);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.k(").append(')').toString());
		}
	}

	public int[] method6128(Object object, short i) {
		try {
			if (0 == ((EnumType) this).anInt6036 * -1179140991)
				return null;
			if (((EnumType) this).aHashMap6039 == null)
				method6130(817562642);
			return (int[]) ((EnumType) this).aHashMap6039.get(object);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.d(").append(')').toString());
		}
	}

	public int method6129(byte i) {
		try {
			return ((EnumType) this).anInt6036 * -1179140991;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.u(").append(')').toString());
		}
	}

	EnumType() {
		((EnumType) this).anInt6036 = 0;
	}

	void method6130(int i) {
		try {
			HashMap hashmap = new HashMap();
			if (null != ((EnumType) this).anObjectArray6041) {
				for (int i_10_ = 0; i_10_ < ((EnumType) this).anObjectArray6041.length; i_10_++) {
					if (null == ((EnumType) this).anObjectArray6041[i_10_]) {
						if (i <= 49152) {
							/* empty */
						}
					} else {
						Object object = ((EnumType) this).anObjectArray6041[i_10_];
						List list = (List) hashmap.get(object);
						if (null == list) {
							list = new LinkedList();
							hashmap.put(object, list);
						}
						list.add(new Integer(i_10_));
					}
				}
			} else if (null != ((EnumType) this).aMap6040) {
				Iterator iterator = ((EnumType) this).aMap6040.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Object object = entry.getValue();
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(entry.getKey());
				}
			} else
				throw new IllegalStateException();
			((EnumType) this).aHashMap6039 = new HashMap();
			Iterator iterator = hashmap.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				List list = (List) entry.getValue();
				int[] is = new int[list.size()];
				int i_11_ = 0;
				Iterator iterator_12_ = list.iterator();
				while (iterator_12_.hasNext()) {
					Integer integer = (Integer) iterator_12_.next();
					is[i_11_++] = integer.intValue();
				}
				((EnumType) this).aHashMap6039.put(entry.getKey(), is);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.x(").append(')').toString());
		}
	}

	public static String method6131(byte i) {
		try {
			String string = "www";
			if (ReferenceTable.aReferenceTable_6555 == Class242.aReferenceTable_2708)
				string = "www-wtrc";
			else if (Class242.aReferenceTable_2708 == ReferenceTable.aReferenceTable_6554)
				string = "www-wtqa";
			else if (ReferenceTable.aReferenceTable_6560 == Class242.aReferenceTable_2708)
				string = "www-wtwip";
			else if (ReferenceTable.aReferenceTable_6553 == Class242.aReferenceTable_2708)
				string = "www-wti";
			String string_13_ = "";
			if (GameClient.aString8927 != null)
				string_13_ = new StringBuilder().append("/p=").append(GameClient.aString8927).toString();
			String string_14_ = new StringBuilder().append(GameClient.aGameContext_8944.aString5317).append(".com").toString();
			return new StringBuilder().append("http://").append(string).append(".").append(string_14_).append("/l=").append(Class321.ACTIVE_LANGUAGE).append("/a=").append(GameClient.anInt8665 * -1154804873).append(string_13_).append("/").toString();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.nn(").append(')').toString());
		}
	}

	static void method6132(int i, int i_15_, int i_16_, byte i_17_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(11, (long) i);
			class298_sub37_sub12.method3449((byte) 23);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = 1274450087 * i_15_;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608 = i_16_ * 293101103;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tx.aj(").append(')').toString());
		}
	}
}
