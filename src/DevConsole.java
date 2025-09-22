/* DevConsole - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class DevConsole implements Runnable {
	boolean aBoolean2791;
	Thread aThread2792;
	int anInt2793;
	Class461 aClass461_2794 = new Class461();
	static Class4 aClass4_2795;

	private static boolean uses24HourClock() {
		DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.getDefault());
		if (df instanceof SimpleDateFormat) {
			String p = ((SimpleDateFormat) df).toPattern();
			for (int i = 0; i < p.length(); i++) {
				char c = p.charAt(i);
				if (c == 'H' || c == 'k') return true;
				if (c == 'h' || c == 'K') return false;
			}
		}
		String sample = df.format(new Date(0));
		String s = sample.toLowerCase(Locale.ROOT);
		return !(s.contains("am") || s.contains("pm"));
	}

	private static String formatLocalizedTime(Date when) {
		final boolean is24 = uses24HourClock();
		final SimpleDateFormat fmt = new SimpleDateFormat(is24 ? "HH:mm:ss" : "hh:mm:ss a", Locale.getDefault());
		return fmt.format(when);
	}

	Class298_Sub37_Sub16_Sub2 method2429(int i, Class329 class329, byte i_0_) {
		try {
			Class298_Sub37_Sub16_Sub2 class298_sub37_sub16_sub2 = new Class298_Sub37_Sub16_Sub2();
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).anInt10006 = -745165359;
			class298_sub37_sub16_sub2.aLong7406 = (long) i * 1476940603538232441L;
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aClass329_10010 = class329;
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aBoolean9672 = false;
			method2432(class298_sub37_sub16_sub2, (byte) 103);
			return class298_sub37_sub16_sub2;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.b(" + ')');
		}
	}

	Class298_Sub37_Sub16_Sub2 method2430(int i, Class329 class329, int i_1_) {
		try {
			Class298_Sub37_Sub16_Sub2 class298_sub37_sub16_sub2 = new Class298_Sub37_Sub16_Sub2();
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).anInt10006 = -248388453;
			synchronized (((DevConsole) this).aClass461_2794) {
				for (Class298_Sub37_Sub16_Sub2 class298_sub37_sub16_sub2_2_ = ((Class298_Sub37_Sub16_Sub2) ((DevConsole) this).aClass461_2794.method5984(686363137)); class298_sub37_sub16_sub2_2_ != null; class298_sub37_sub16_sub2_2_ = ((Class298_Sub37_Sub16_Sub2) ((DevConsole) this).aClass461_2794.method5985(-852978429))) {
					if ((long) i == (-5533549728640346679L * class298_sub37_sub16_sub2_2_.aLong7406) && class329 == (((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2_2_).aClass329_10010) && -1906220653 * (((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2_2_).anInt10006) == 2) {
						((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aByteArray10011 = ((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2_2_).aByteArray10011;
						((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aBoolean9670 = false;
						Class298_Sub37_Sub16_Sub2 class298_sub37_sub16_sub2_3_ = class298_sub37_sub16_sub2;
						return class298_sub37_sub16_sub2_3_;
					}
				}
			}
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aByteArray10011 = class329.method3992(i, -250604251);
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aBoolean9670 = false;
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aBoolean9672 = true;
			return class298_sub37_sub16_sub2;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.a(" + ')');
		}
	}

	Class298_Sub37_Sub16_Sub2 method2431(int i, byte[] is, Class329 class329, int i_4_) {
		try {
			Class298_Sub37_Sub16_Sub2 class298_sub37_sub16_sub2 = new Class298_Sub37_Sub16_Sub2();
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).anInt10006 = -496776906;
			class298_sub37_sub16_sub2.aLong7406 = 1476940603538232441L * (long) i;
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aByteArray10011 = is;
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aClass329_10010 = class329;
			((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aBoolean9672 = false;
			method2432(class298_sub37_sub16_sub2, (byte) 39);
			return class298_sub37_sub16_sub2;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.f(" + ')');
		}
	}

	void method2432(Class298_Sub37_Sub16_Sub2 class298_sub37_sub16_sub2, byte i) {
		try {
			synchronized (((DevConsole) this).aClass461_2794) {
				((DevConsole) this).aClass461_2794.method5982(class298_sub37_sub16_sub2, (byte) -98);
				((DevConsole) this).anInt2793 += 872113935;
				((DevConsole) this).aClass461_2794.notifyAll();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.p(" + ')');
		}
	}

	public void run() {
		try {
			while (!((DevConsole) this).aBoolean2791) {
				Class298_Sub37_Sub16_Sub2 class298_sub37_sub16_sub2;
				synchronized (((DevConsole) this).aClass461_2794) {
					class298_sub37_sub16_sub2 = ((Class298_Sub37_Sub16_Sub2) ((DevConsole) this).aClass461_2794.method5983(-2118324639));
					if (class298_sub37_sub16_sub2 != null)
						((DevConsole) this).anInt2793 -= 872113935;
					else {
						try {
							((DevConsole) this).aClass461_2794.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					if (-1906220653 * ((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).anInt10006 == 2)
						((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aClass329_10010.method3993((int) (class298_sub37_sub16_sub2.aLong7406 * -5533549728640346679L), ((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aByteArray10011, (((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aByteArray10011).length, 267663991);
					else if (3 == (((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).anInt10006 * -1906220653))
						((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aByteArray10011 = (((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aClass329_10010.method3992((int) (-5533549728640346679L * class298_sub37_sub16_sub2.aLong7406), -250604251));
				} catch (Exception exception) {
					IPAddress.method6062(null, exception, (short) 666);
				}
				((Class298_Sub37_Sub16_Sub2) class298_sub37_sub16_sub2).aBoolean9670 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.run(" + ')');
		}
	}

	public DevConsole() {
		((DevConsole) this).anInt2793 = 0;
		((DevConsole) this).aBoolean2791 = false;
		((DevConsole) this).aThread2792 = new Thread(this);
		((DevConsole) this).aThread2792.setDaemon(true);
		((DevConsole) this).aThread2792.start();
		((DevConsole) this).aThread2792.setPriority(1);
	}

	public void method2433(int i) {
		try {
			((DevConsole) this).aBoolean2791 = true;
			synchronized (((DevConsole) this).aClass461_2794) {
				((DevConsole) this).aClass461_2794.notifyAll();
			}
			try {
				((DevConsole) this).aThread2792.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			((DevConsole) this).aThread2792 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.i(" + ')');
		}
	}

	static final void method2434(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsSetup.clientPreferences.groundBlendingPreference.method5725((byte) 12) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.anz(" + ')');
		}
	}

	public static void sendDevConsoleMsg(String string) {
		try {
			if (DevConsoleState.lines == null)
				DevConsoleInit.initConsoleState();
			GameClient.date.setTime(new Date(TimeUtils.getTime((byte) 1)));
			String time = formatLocalizedTime(GameClient.date.getTime());
			String[] strings = SceneObject.splitText(string, '\n', 1593698305);
			for (String s : strings) {
				for (int shiftIndex = -2035787443 * DevConsoleState.lineCount; shiftIndex > 0; shiftIndex--)
					DevConsoleState.lines[shiftIndex] = DevConsoleState.lines[shiftIndex - 1];
				DevConsoleState.lines[0] = time + ": " + s;
				if (null != DisplayMode.consoleLogStream) {
					try {
						DisplayMode.consoleLogStream.write(TextEncoder.encodeText(DevConsoleState.lines[0] + "\n", 6758905));
					} catch (IOException ignored) {
					}
				}
				if (DevConsoleState.lineCount * -2035787443 < DevConsoleState.lines.length - 1) {
					DevConsoleState.lineCount += 674924421;
					if (DevConsoleState.scrollOffset * -1731316011 > 0)
						DevConsoleState.scrollOffset += 205738621;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.n(" + ')');
		}
	}

	public static Class516 method2436(int i, int i_11_) {
		try {
			Class516[] class516s = Class320.method3914((byte) -107);
			Class516[] class516s_12_ = class516s;
			for (int i_13_ = 0; i_13_ < class516s_12_.length; i_13_++) {
				Class516 class516 = class516s_12_[i_13_];
				if (-509770143 * ((Class516) class516).anInt6235 == i)
					return class516;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.f(" + ')');
		}
	}

	static Class298_Sub9 method2437(int i, boolean bool, int i_14_) {
		try {
			long l = (long) (i | (bool ? -2147483648 : 0));
			return (Class298_Sub9) Class298_Sub9.aClass437_7224.get(l);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.k(" + ')');
		}
	}

	static final void method2438(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class499.method6218(class105, RSInterface, class403, (byte) 20);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.le(" + ')');
		}
	}

	public static GameFont method2439(Js5 class243, int i, int i_15_) {
		try {
			byte[] is = class243.method2294(i, (byte) 105);
			if (null == is)
				return null;
			return new GameFont(is);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.f(" + ')');
		}
	}

	static final void method2440(Class365_Sub1 class365_sub1, int i, int i_16_) {
		try {
			Class82_Sub21.method936(class365_sub1, i, false, -630739459);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.ju(" + ')');
		}
	}
}
