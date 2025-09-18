/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class UnderlayTypeList {
	Js5 aClass243_5639;
	CachingHashMap aClass348_5640 = new CachingHashMap(128);
	public static Js5 aClass243_5641;

	public void method5929(int i) {
		try {
			synchronized (this.aClass348_5640) {
				this.aClass348_5640.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sp.f(").append(')').toString());
		}
	}

	public void method5930(int i, int i_0_) {
		try {
			synchronized (this.aClass348_5640) {
				this.aClass348_5640.method4186(i, -328942985);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sp.b(").append(')').toString());
		}
	}

	public void method5931(int i) {
		try {
			synchronized (this.aClass348_5640) {
				this.aClass348_5640.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sp.p(").append(')').toString());
		}
	}

	public FluType method5932(int i, byte i_1_) {
		try {
			FluType class443;
			synchronized (this.aClass348_5640) {
				class443 = (FluType) this.aClass348_5640.get(i);
			}
			if (class443 != null) {
				return class443;
			}
			byte[] is;
			synchronized (this.aClass243_5639) {
				is = this.aClass243_5639.getFileFromArchive(-1006924897 * Js5ConfigGroup.FLUTYPE.anInt1460, i, (byte) -122);
			}
			class443 = new FluType();
			if (is != null) {
				class443.decode(new Packet(is));
			}
			synchronized (this.aClass348_5640) {
				this.aClass348_5640.put(class443, i);
			}
			return class443;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sp.a(").append(')').toString());
		}
	}

	public UnderlayTypeList(GameContext gameContext, Language language, Js5 class243) {
		this.aClass243_5639 = class243;
		this.aClass243_5639.method2316(-1006924897 * Js5ConfigGroup.FLUTYPE.anInt1460, -978414795);
	}

	static final void method5933(ClientScript2 class403, int i) {
		try {
			class403.anInt5239 -= -783761378;
			int i_2_ = class403.anIntArray5244[class403.anInt5239 * 681479919];
			int i_3_ = class403.anIntArray5244[class403.anInt5239 * 681479919 + 1];
			Class497 class497 = Class92.aClass504_905.method6251(i_3_, 1053350248);
			if (class497.method6206(1883696427)) {
				class403.anObjectArray5240[(class403.anInt5241 += 969361751) * -203050393 - 1] = Class501.aClass395_6122.method4903(i_2_, (byte) -26).method4877(i_3_, class497.aString6101, -130818690);
			} else {
				class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class501.aClass395_6122.method4903(i_2_, (byte) 51).method4881(i_3_, -388931549 * class497.anInt6100, 240769181);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sp.abq(").append(')').toString());
		}
	}

	public static void method5934(Player player, byte i) {
		try {
			Class298_Sub41 class298_sub41 = (Class298_Sub41) Class298_Sub41.aClass437_7440.get(1888274983 * player.entityIndex);
			if (null == class298_sub41) {
				SeqType.method4884(player.plane, player.scenePositionXQueue[0], player.scenePositionYQueue[0], 0, null, null, player, (byte) 58);
			} else {
				class298_sub41.method3519(-1931224140);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sp.u(").append(')').toString());
		}
	}
}
