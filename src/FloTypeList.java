/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class FloTypeList {
	CachingHashMap aClass348_4079 = new CachingHashMap(64);
	public int anInt4080 = 0;
	public int anInt4081;
	Js5 aClass243_4082;
	static int basePlane;
	public static Class298_Sub25 aClass298_Sub25_4084;

	public OverlayType getOverlayDefinition(int i, int i_0_) {
		try {
			OverlayType class373;
			synchronized (this.aClass348_4079) {
				class373 = (OverlayType) this.aClass348_4079.get(i);
			}
			if (null != class373) {
				return class373;
			}
			byte[] is;
			synchronized (this.aClass243_4082) {
				is = this.aClass243_4082.getFileFromArchive(Js5ConfigGroup.FLOTYPE.anInt1460 * -1006924897, i, (byte) -18);
			}
			class373 = new OverlayType();
			class373.aClass375_4065 = this;
			class373.anInt4053 = 1723715693 * i;
			if (is != null) {
				class373.decode(new Packet(is));
			}
			class373.method4603((byte) 75);
			synchronized (this.aClass348_4079) {
				this.aClass348_4079.put(class373, i);
			}
			return class373;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pp.a(").append(')').toString());
		}
	}
	public FloTypeList(GameContext gameContext, Language language, Js5 class243) {
		this.aClass243_4082 = class243;
		anInt4081 = this.aClass243_4082.method2316(-1006924897 * Js5ConfigGroup.FLOTYPE.anInt1460, 774356441) * 1970250293;
	}

	public void method4646(byte i) {
		try {
			synchronized (this.aClass348_4079) {
				this.aClass348_4079.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pp.p(").append(')').toString());
		}
	}

	public void method4647(int i, byte i_1_) {
		try {
			synchronized (this.aClass348_4079) {
				this.aClass348_4079.method4186(i, -1937713048);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pp.b(").append(')').toString());
		}
	}

	public void method4648(byte i) {
		try {
			synchronized (this.aClass348_4079) {
				this.aClass348_4079.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pp.f(").append(')').toString());
		}
	}

	static final void method4649(ClientScript2 class403, int i) {
		try {
			class403.anInt5239 -= -1175642067;
			int i_2_ = class403.anIntArray5244[class403.anInt5239 * 681479919];
			int i_3_ = class403.anIntArray5244[1 + class403.anInt5239 * 681479919];
			int i_4_ = class403.anIntArray5244[681479919 * class403.anInt5239 + 2];
			if (i_3_ == -1) {
				throw new RuntimeException();
			}
			EnumType class483 = Class51.aClass475_506.getClientScriptMap(i_3_, 1528209569);
			if (class483.aChar6037 != i_2_) {
				throw new RuntimeException();
			}
			int[] is = class483.method6128(Integer.valueOf(i_4_), (short) 19520);
			int i_5_ = 0;
			if (is != null) {
				i_5_ = is.length;
			}
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pp.vs(").append(')').toString());
		}
	}

	static final void method4650(ClientScript2 class403, int i) {
		try {
			String string = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
			Class342.method4152(string, (byte) 62);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pp.vl(").append(')').toString());
		}
	}

	static final void method4651(ClientScript2 class403, int i) {
		try {
			if (Class452.aBoolean5642 && Class231.aFrame2589 != null) {
				Class357.method4276(GraphicsAutoSetup.clientPreferences.aClass422_Sub12_7543.method5669((byte) 70), -1, -1, false, -489329335);
			}
			if (SpotAnimTypeList.method4865((byte) 35) == Class292.aClass292_3162) {
				Class52_Sub2.writeVarcs(1556288352);
				System.exit(0);
			} else {
				Class117.method1279(-849889720);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pp.afq(").append(')').toString());
		}
	}

	static int method4652(Player class365_sub1_sub1_sub2_sub2, int i) {
		try {
			int i_6_ = 1899133595 * class365_sub1_sub1_sub2_sub2.walkAnimation;
			BASType class350 = class365_sub1_sub1_sub2_sub2.getDefinition(657972326);
			int i_7_ = class365_sub1_sub1_sub2_sub2.spotAnimAnimator.method5823(1741170329);
			if (-1 == i_7_ || class365_sub1_sub1_sub2_sub2.outlineDirty) {
				i_6_ = 1728220219 * class365_sub1_sub1_sub2_sub2.lastAnimationDelay;
			} else if (class350.anInt3721 * 230243963 == i_7_ || i_7_ == class350.anInt3749 * 491753731 || class350.anInt3724 * -783166629 == i_7_ || i_7_ == class350.anInt3746 * -2054940183) {
				i_6_ = class365_sub1_sub1_sub2_sub2.runAnimation * -978842273;
			} else if (i_7_ == class350.anInt3755 * 328817727 || -1238642279 * class350.anInt3722 == i_7_ || 124010991 * class350.anInt3728 == i_7_ || -907666203 * class350.anInt3727 == i_7_) {
				i_6_ = class365_sub1_sub1_sub2_sub2.standAnimation * -1304250511;
			}
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pp.r(").append(')').toString());
		}
	}

	static void method4653(int i) {
		try {
			if (Class394.method4897(-185972710)) {
				if (null == Class8.aStringArray107) {
					Class372_Sub3.method4599(-219758847);
				}
				Class8.aBoolean108 = true;
				Class8.anInt98 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pp.f(").append(')').toString());
		}
	}

	static final void method4654(int i, int i_8_, byte i_9_) {
		try {
			if (GameClient.aGameContext_8944 != GameContext.stellar_dawn) {
				if (!Class82_Sub21.method938(i, i_8_, false, MovementType.method2619(i, i_8_, 1, 1, 1978833308), -1273389367)) {
					Class82_Sub21.method938(i, i_8_, false, Class325.method3963(i, i_8_, 1, 1, 0, (byte) -5), 1260408128);
				}
			} else if (!Class82_Sub21.method938(i, i_8_, false, Class325.method3963(i, i_8_, 1, 1, 0, (byte) -71), 301836586)) {
				Class82_Sub21.method938(i, i_8_, false, MovementType.method2619(i, i_8_, 1, 1, 1349485510), 605242163);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("pp.jv(").append(')').toString());
		}
	}
}
