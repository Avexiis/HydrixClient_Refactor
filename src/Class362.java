/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class362 {
	Class369[] aClass369Array3915;
	int anInt3916;
	Js5 aClass243_3917;
	public static int anInt3918;

	public Class369 method4307(int i, int i_0_) {
		try {
			return ((Class362) this).aClass369Array3915[i];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pb.a(").append(')').toString());
		}
	}

	int method4308(Interface23 interface23, int i) {
		try {
			int i_1_ = 0;
			for (int i_2_ = 0; i_2_ < 1223397457 * ((Class362) this).anInt3916; i_2_++) {
				Class369 class369 = method4307(i_2_, 245040087);
				if (class369.method4562(interface23, -1717639697))
					i_1_ += class369.anInt4014 * 1646094589;
			}
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pb.f(").append(')').toString());
		}
	}

	public Class362(GameContext gameContext, Language language, Js5 class243, boolean bool) {
		((Class362) this).aClass243_3917 = class243;
		if (((Class362) this).aClass243_3917 != null)
			((Class362) this).anInt3916 = (((Class362) this).aClass243_3917.method2316(-1006924897 * Js5ConfigGroup.aClass120_1440.anInt1460, -941078932)) * 70760625;
		else
			((Class362) this).anInt3916 = 0;
		if (bool) {
			((Class362) this).aClass369Array3915 = new Class369[1223397457 * ((Class362) this).anInt3916];
			for (int i = 0; i < ((Class362) this).anInt3916 * 1223397457; i++) {
				byte[] is;
				synchronized (((Class362) this).aClass243_3917) {
					is = (((Class362) this).aClass243_3917.getFileFromArchive(Js5ConfigGroup.aClass120_1440.anInt1460 * -1006924897, i, (byte) -67));
				}
				Class369 class369 = new Class369();
				if (is != null)
					class369.method4558(new Packet(is), -1666342024);
				class369.method4560(234785741);
				((Class362) this).aClass369Array3915[i] = class369;
				((Class369) ((Class362) this).aClass369Array3915[i]).aClass362_4007 = this;
			}
		}
	}

	static final void method4309(ClientScript2 class403, byte i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_4_ = GameClient.aClass251Array8920[i_3_].method2400(-574288948);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_4_ == 0 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pb.ys(").append(')').toString());
		}
	}

	public static void method4310(Interface27 interface27, byte i) {
		try {
			if (null != Class506.anInterface27_6203)
				throw new IllegalStateException("");
			Class506.anInterface27_6203 = interface27;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pb.a(").append(')').toString());
		}
	}

	public static byte[] method4311(File file, int i) {
		try {
			return Class135.method1493(file, (int) file.length(), 1835792429);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pb.b(").append(')').toString());
		}
	}

	static final void method4312(ClientScript2 class403, byte i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (2 == 1131012101 * GameClient.anInt8942 && i_5_ < GameClient.anInt8941 * -1054937867)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = GameClient.anIntArray8946[i_5_];
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pb.vx(").append(')').toString());
		}
	}
}
