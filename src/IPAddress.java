import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class IPAddress {
	boolean aBoolean5952;
	public String address;
	public int anInt5954 = 1723266594;
	public int anInt5955 = -2031127069;
	boolean aBoolean5956 = true;
	public int worldId;
	public static int anInt5958;
	public static int anInt5959;

	public Socket method6056(int i) throws IOException {
		return new Socket(InetAddress.getByName(Loader.IP), Loader.PORT);
	}

	public static Socket createSocket(String address, int port) throws IOException {
		return new Socket(InetAddress.getByName(address), port);
	}

	public boolean method6057(IPAddress class471_0_, int i) {
		if (class471_0_ == null) {
			return false;
		}
		return worldId * 1606920449 == class471_0_.worldId * 1606920449 && address.equals(class471_0_.address);
	}

	public IPAddress() {
		aBoolean5952 = false;
	}

	public void method6058(int i) {
		if (!aBoolean5956) {
			aBoolean5956 = true;
			aBoolean5952 = true;
		} else if (aBoolean5952) {
			aBoolean5952 = false;
		} else {
			aBoolean5956 = false;
		}
	}

	static final void method6059(ClientScript2 class403, int i) {
		int i_1_ = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919];
		class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_1_).anInt5721 * 785788887;
	}

	public static final void method6060(long l) {
		if (l > 0L) {
			if (l % 10L == 0L) {
				Class302.method3717(l - 1L);
				Class302.method3717(1L);
			} else {
				Class302.method3717(l);
			}
		}
	}

	static void method6061(ClientScript2 class403, byte i) {
		class403.anIntArray5244[681479919 * class403.anInt5239 - 1] = Class316.aClass362_3318.method4307(class403.anIntArray5244[class403.anInt5239 * 681479919 - 1], 245040087).anInt4011 * -1570899057;
	}

	public static void method6062(String string, Throwable throwable, short i) {
		if (true) {
			throwable.printStackTrace();
			return;
		}
		try {
			String string_2_ = "";
			if (throwable != null) {
				string_2_ = Class298_Sub28.method3110(throwable, (byte) 10);
			}
			if (string != null) {
				if (throwable != null) {
					string_2_ = string_2_ + " | ";
				}
				string_2_ = string_2_ + string;
			}
			Class82_Sub6.method888(string_2_, (byte) -97);
			string_2_ = Class24.method381(string_2_, 1866879375);
			if (RuntimeException_Sub2.anApplet6306 != null) {
				String string_3_ = "Unknown";
				String string_4_ = "1.1";
				try {
					string_3_ = System.getProperty("java.vendor");
					string_4_ = System.getProperty("java.version");
				} catch (Exception localException1) {
				}
				URL url = new URL(RuntimeException_Sub2.anApplet6306.getCodeBase(),
						"clienterror.ws?c=" + 1879961195 * RuntimeException_Sub2.anInt6307 + "&cs=" + Class400.anInt5225 * -518231893 + "&u="
								+ (RuntimeException_Sub2.aString6305 != null ? Class24.method381(RuntimeException_Sub2.aString6305, 1755268630) : new StringBuilder().append("").append(RuntimeException_Sub2.aLong6304 * -6049538010378147713L).toString()) + "&v1=" + Class24.method381(string_3_, 1908813810) + "&v2="
								+ Class24.method381(string_4_, 1870225284) + "&e=" + string_2_);
				DataInputStream datainputstream = new DataInputStream(url.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return;
	}
}
