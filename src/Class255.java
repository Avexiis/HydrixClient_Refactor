/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class Class255 implements Runnable {
	boolean aBoolean2791;
	Thread aThread2792;
	int anInt2793;
	Class461 aClass461_2794 = new Class461();
	static Class4 aClass4_2795;

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
			synchronized (((Class255) this).aClass461_2794) {
				for (Class298_Sub37_Sub16_Sub2 class298_sub37_sub16_sub2_2_ = ((Class298_Sub37_Sub16_Sub2) ((Class255) this).aClass461_2794.method5984(686363137)); class298_sub37_sub16_sub2_2_ != null; class298_sub37_sub16_sub2_2_ = ((Class298_Sub37_Sub16_Sub2) ((Class255) this).aClass461_2794.method5985(-852978429))) {
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
			synchronized (((Class255) this).aClass461_2794) {
				((Class255) this).aClass461_2794.method5982(class298_sub37_sub16_sub2, (byte) -98);
				((Class255) this).anInt2793 += 872113935;
				((Class255) this).aClass461_2794.notifyAll();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.p(" + ')');
		}
	}

	public void run() {
		try {
			while (!((Class255) this).aBoolean2791) {
				Class298_Sub37_Sub16_Sub2 class298_sub37_sub16_sub2;
				synchronized (((Class255) this).aClass461_2794) {
					class298_sub37_sub16_sub2 = ((Class298_Sub37_Sub16_Sub2) ((Class255) this).aClass461_2794.method5983(-2118324639));
					if (class298_sub37_sub16_sub2 != null)
						((Class255) this).anInt2793 -= 872113935;
					else {
						try {
							((Class255) this).aClass461_2794.wait();
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

	public Class255() {
		((Class255) this).anInt2793 = 0;
		((Class255) this).aBoolean2791 = false;
		((Class255) this).aThread2792 = new Thread(this);
		((Class255) this).aThread2792.setDaemon(true);
		((Class255) this).aThread2792.start();
		((Class255) this).aThread2792.setPriority(1);
	}

	public void method2433(int i) {
		try {
			((Class255) this).aBoolean2791 = true;
			synchronized (((Class255) this).aClass461_2794) {
				((Class255) this).aClass461_2794.notifyAll();
			}
			try {
				((Class255) this).aThread2792.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			((Class255) this).aThread2792 = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.i(" + ')');
		}
	}

	static final void method2434(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.groundBlendingPreference.method5725((byte) 12) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "kr.anz(" + ')');
		}
	}

	public static void sendDevConsoleMsg(String string, int i) {
		try {
			if (Class8.aStringArray107 == null)
				Class372_Sub3.method4599(-219758847);
			GameClient.date.setTime(new Date(TimeUtils.getTime((byte) 1)));
			int hour = GameClient.date.get(Calendar.HOUR_OF_DAY);
			int minute = GameClient.date.get(Calendar.MINUTE);
			int second = GameClient.date.get(Calendar.SECOND);
			String time = Integer.toString(hour / 10) + hour % 10 + ":" + minute / 10 + minute % 10 + ":" + second / 10 + second % 10;
			String[] strings = Class365_Sub1_Sub3_Sub1.method4508(string, '\n', 1593698305);
			for (int i_9_ = 0; i_9_ < strings.length; i_9_++) {
				for (int i_10_ = -2035787443 * Class8.anInt102; i_10_ > 0; i_10_--)
					Class8.aStringArray107[i_10_] = Class8.aStringArray107[i_10_ - 1];
				Class8.aStringArray107[0] = time + ": " + strings[i_9_];
				if (null != Class78.aFileOutputStream731) {
					try {
						Class78.aFileOutputStream731.write(Class77.method840(Class8.aStringArray107[0] + "\n", 6758905));
					} catch (IOException ioexception) {
						/* empty */
					}
				}
				if (Class8.anInt102 * -2035787443 < Class8.aStringArray107.length - 1) {
					Class8.anInt102 += 674924421;
					if (Class8.anInt103 * -1731316011 > 0)
						Class8.anInt103 += 205738621;
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

	public static Class505 method2439(Js5 class243, int i, int i_15_) {
		try {
			byte[] is = class243.method2294(i, (byte) 105);
			if (null == is)
				return null;
			return new Class505(is);
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
