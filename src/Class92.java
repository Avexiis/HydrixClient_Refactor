/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class92 {
	static Map aMap901;
	public static long aLong902 = 1000L;
	static HashMap aHashMap903 = new HashMap();
	public static Js5 aClass243_904;
	public static Class504 aClass504_905;

	public static String method1003(Date date, String string, int i) {
		try {
			return method1004(date, string, method1006(455698199), Language.aLanguage_6624, 791568674);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dt.a(").append(')').toString());
		}
	}

	static String method1004(Date date, String string, TimeZone timezone, Language language, int i) {
		try {
			if (null == aMap901) {
				aMap901 = new HashMap(6);
				Language[] languages = Language.method5756(-515036392);
				for (int i_0_ = 0; i_0_ < languages.length; i_0_++) {
					Language language_1_ = languages[i_0_];
					aMap901.put(language_1_, new ConcurrentLinkedQueue());
				}
			}
			ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap901.get(language);
			SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
			if (simpledateformat == null)
				simpledateformat = new SimpleDateFormat(string, language.method5755(-734484116));
			else
				simpledateformat.applyPattern(string);
			simpledateformat.setTimeZone(timezone);
			String string_2_ = simpledateformat.format(date);
			concurrentlinkedqueue.add(simpledateformat);
			return string_2_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dt.f(").append(')').toString());
		}
	}

	static TimeZone method1005(String string, int i) {
		try {
			synchronized (aHashMap903) {
				TimeZone timezone = (TimeZone) aHashMap903.get(string);
				if (null == timezone) {
					timezone = TimeZone.getTimeZone(string);
					aHashMap903.put(string, timezone);
				}
				TimeZone timezone_3_ = timezone;
				return timezone_3_;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dt.p(").append(')').toString());
		}
	}

	static {
		Calendar.getInstance(method1005("Europe/London", -1482930137));
	}

	static TimeZone method1006(int i) {
		try {
			return method1005("Europe/London", -1697874218);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dt.b(").append(')').toString());
		}
	}

	Class92() throws Throwable {
		throw new Error();
	}

	public static void method1007(int i) {
		try {
			Class365_Sub1_Sub3_Sub2.method4512(1137952217);
			ContextMenu.aClass57Array5501 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dt.ae(").append(')').toString());
		}
	}

	static final void method1008(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_5_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			Class497 class497 = aClass504_905.method6251(i_5_, 198575555);
			if (class497.method6206(1883696427))
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = Class477.aClass500_6001.method6219(i_4_, 1811541401).method3427(i_5_, class497.aString6101, (byte) -113);
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (Class477.aClass500_6001.method6219(i_4_, 685502248).method3425(i_5_, -388931549 * class497.anInt6100, (short) -22084));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("dt.abl(").append(')').toString());
		}
	}
}
