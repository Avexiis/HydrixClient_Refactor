/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class504 {
	Js5 aClass243_6194;
	CachingHashMap aClass348_6195 = new CachingHashMap(64);
	public static FloTypeList aClass375_6196;

	public void method6248(int i) {
		try {
			synchronized (this.aClass348_6195) {
				this.aClass348_6195.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uv.p(").append(')').toString());
		}
	}

	public Class504(GameContext gameContext, Language language, Js5 class243) {
		this.aClass243_6194 = class243;
		if (null != this.aClass243_6194) {
			this.aClass243_6194.method2316(Js5ConfigGroup.aClass120_1416.anInt1460 * -1006924897, 1020653544);
		}
	}

	public void method6249(int i, byte i_0_) {
		try {
			synchronized (this.aClass348_6195) {
				this.aClass348_6195.method4186(i, -2004411058);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uv.b(").append(')').toString());
		}
	}

	public void method6250(int i) {
		try {
			synchronized (this.aClass348_6195) {
				this.aClass348_6195.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uv.f(").append(')').toString());
		}
	}

	public Class497 method6251(int i, int i_1_) {
		try {
			Class497 class497;
			synchronized (this.aClass348_6195) {
				class497 = (Class497) this.aClass348_6195.get(i);
			}
			if (class497 != null) {
				return class497;
			}
			byte[] is;
			synchronized (this.aClass243_6194) {
				is = this.aClass243_6194.getFileFromArchive(-1006924897 * Js5ConfigGroup.aClass120_1416.anInt1460, i, (byte) -62);
			}
			class497 = new Class497();
			if (is != null) {
				class497.method6204(new Packet(is), -1070488617);
			}
			synchronized (this.aClass348_6195) {
				this.aClass348_6195.put(class497, i);
			}
			return class497;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uv.a(").append(')').toString());
		}
	}

	static final void method6252(ClientScript2 class403, int i) {
		try {
			String string = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
			boolean bool = class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919] == 1;
			Class311.method3817(string, bool, 729356820);
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class344.anInt3688 * 367592105;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("uv.adv(").append(')').toString());
		}
	}
}
