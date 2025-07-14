/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Animator {
	public static int anInt5521 = 2;
	public static int anInt5522 = 1;
	int anInt5523;
	SeqType aClass391_5524;
	int anInt5525;
	int anInt5526;
	int anInt5527;
	public static int anInt5528 = 0;
	int anInt5529;
	boolean aBoolean5530 = false;
	boolean aBoolean5531 = false;
	int anInt5532 = 0;
	boolean aBoolean5533 = false;
	Class441 aClass441_5534;
	Class441 aClass441_5535;

	public final boolean method5819(byte i) {
		try {
			return null != aClass391_5524;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.b(").append(')').toString());
		}
	}

	public final SeqType method5820(int i) {
		try {
			return aClass391_5524;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.p(").append(')').toString());
		}
	}

	public final void method5821(int i, int i_0_) {
		try {
			method5824(i, 0, 0, false, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.k(").append(')').toString());
		}
	}

	public final boolean method5822(int i, int i_1_) {
		try {
			if (null == aClass391_5524 || i == 0) {
				return false;
			}
			if (anInt5526 * -1577984117 > 0) {
				if (-1577984117 * anInt5526 >= i) {
					anInt5526 -= -2070327261 * i;
					return false;
				}
				i -= anInt5526 * -1577984117;
				anInt5526 = 0;
				method5837(aClass391_5524, -8792169 * anInt5523, (byte) 71);
			}
			i += anInt5525 * 458730501;
			boolean bool = aClass391_5524.aBoolean4176 | SeqType.aBoolean4186;
			if (i > 100 && aClass391_5524.anInt4175 * -658922537 > 0) {
				int i_2_;
				for (i_2_ = aClass391_5524.frames.length - aClass391_5524.anInt4175 * -658922537; anInt5523 * -8792169 < i_2_ && i > aClass391_5524.delays[anInt5523 * -8792169]; anInt5523 += 282466343) {
					i -= aClass391_5524.delays[anInt5523 * -8792169];
				}
				if (anInt5523 * -8792169 >= i_2_) {
					int i_3_ = 0;
					for (int i_4_ = i_2_; i_4_ < aClass391_5524.frames.length; i_4_++) {
						i_3_ += aClass391_5524.delays[i_4_];
					}
					if (0 == anInt5532 * -1542612693) {
						anInt5527 += 1129171511 * (i / i_3_);
					}
					i %= i_3_;
				}
				anInt5529 = -64061137 * anInt5523 + -1266936279;
				if (-112073191 * anInt5529 >= aClass391_5524.frames.length) {
					if (aClass391_5524.anInt4175 * -658922537 == -1 && aBoolean5533) {
						anInt5529 = 0;
					} else {
						anInt5529 -= aClass391_5524.anInt4175 * 838055791;
					}
					if (anInt5529 * -112073191 < 0 || anInt5529 * -112073191 >= aClass391_5524.frames.length) {
						anInt5529 = 1266936279;
					}
				}
				bool = true;
			}
			while (i > aClass391_5524.delays[-8792169 * anInt5523]) {
				bool = true;
				i -= aClass391_5524.delays[(anInt5523 += 282466343) * -8792169 - 1];
				if (-8792169 * anInt5523 >= aClass391_5524.frames.length) {
					if (aClass391_5524.anInt4175 * -658922537 != -1 && -1542612693 * anInt5532 != 2) {
						anInt5523 -= aClass391_5524.anInt4175 * -782361151;
						if (-1542612693 * anInt5532 == 0) {
							anInt5527 += 1129171511;
						}
					}
					if (2063993735 * anInt5527 >= aClass391_5524.anInt4181 * -23055529 || -8792169 * anInt5523 < 0 || -8792169 * anInt5523 >= aClass391_5524.frames.length) {
						aBoolean5530 = true;
						break;
					}
				}
				method5837(aClass391_5524, -8792169 * anInt5523, (byte) 75);
				anInt5529 = anInt5523 * -64061137 + -1266936279;
				if (-112073191 * anInt5529 >= aClass391_5524.frames.length) {
					if (-1 == aClass391_5524.anInt4175 * -658922537 && aBoolean5533) {
						anInt5529 = 0;
					} else {
						anInt5529 -= 838055791 * aClass391_5524.anInt4175;
					}
					if (-112073191 * anInt5529 < 0 || anInt5529 * -112073191 >= aClass391_5524.frames.length) {
						anInt5529 = 1266936279;
					}
				}
			}
			anInt5525 = -993902387 * i;
			if (bool) {
				method5844(1397320731);
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.j(").append(')').toString());
		}
	}

	public final int method5823(int i) {
		try {
			return aClass391_5524 != null ? -1945308871 * aClass391_5524.anInt4171 : -1;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.i(").append(')').toString());
		}
	}

	public final void method5824(int i, int i_5_, int i_6_, boolean bool, byte i_7_) {
		try {
			method5825(i, i_5_, i_6_, bool, false, -1437479972);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.r(").append(')').toString());
		}
	}

	final void method5825(int i, int i_8_, int i_9_, boolean bool, boolean bool_10_, int i_11_) {
		try {
			if (i != method5823(1947694560)) {
				if (-1 != i) {
					if (null != aClass391_5524 && i == aClass391_5524.anInt4171 * -1945308871) {
						if (0 == -1117238071 * aClass391_5524.anInt4184) {
							return;
						}
					} else {
						aClass391_5524 = Class298_Sub2.aClass395_7165.method4903(i, (byte) 32);
					}
					anInt5527 = 0;
					anInt5526 = i_8_ * -2070327261;
					anInt5532 = -1775084157 * i_9_;
					aBoolean5533 = bool_10_;
					if (bool) {
						anInt5523 = (int) (Math.random() * aClass391_5524.frames.length) * 282466343;
						anInt5525 = (int) (Math.random() * aClass391_5524.delays[-8792169 * anInt5523]) * -993902387;
					} else {
						anInt5523 = 0;
						anInt5525 = 0;
					}
					anInt5529 = -1266936279 + -64061137 * anInt5523;
					if (anInt5529 * -112073191 < 0 || anInt5529 * -112073191 >= aClass391_5524.frames.length) {
						anInt5529 = 1266936279;
					}
					if (0 == -1577984117 * anInt5526) {
						method5837(aClass391_5524, -8792169 * anInt5523, (byte) 59);
					}
					aBoolean5530 = false;
				} else {
					aClass391_5524 = null;
				}
				method5844(898280732);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.q(").append(')').toString());
		}
	}

	public final boolean method5826(int i) {
		try {
			return 0 != -1577984117 * anInt5526;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.n(").append(')').toString());
		}
	}

	public final int method5827(short i) {
		try {
			return -1577984117 * anInt5526;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.s(").append(')').toString());
		}
	}

	public final void method5828(int i, int i_12_) {
		try {
			anInt5526 = i * -2070327261;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.z(").append(')').toString());
		}
	}

	public final int method5829(int i) {
		try {
			if (method5838((short) 225)) {
				int i_13_ = 0;
				if (method5838((short) 225)) {
					i_13_ |= -1050600049 * aClass441_5534.anInt5588;
					if (aBoolean5531 && null != aClass391_5524.iframes) {
						i_13_ |= -1050600049 * aClass441_5535.anInt5588;
					}
				}
				return i_13_;
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.y(").append(')').toString());
		}
	}

	public final void method5830(ModelPart modelPart, int i, int i_14_, byte i_15_) {
		try {
			if (null != aClass391_5524.frames && method5838((short) 225)) {
				modelPart.method4765(aClass441_5534.aClass298_Sub37_Sub4_5583, aClass441_5534.anInt5584 * 806878007, aClass441_5534.aClass298_Sub37_Sub4_5587, -643912397 * aClass441_5534.anInt5586, 458730501 * anInt5525, aClass391_5524.delays[-8792169 * anInt5523], i, i_14_, aClass391_5524.aBoolean4185, null);
				if (aBoolean5531 && aClass391_5524.iframes != null && aClass441_5535.aBoolean5585) {
					modelPart.method4765(aClass441_5535.aClass298_Sub37_Sub4_5583, aClass441_5535.anInt5584 * 806878007, aClass441_5535.aClass298_Sub37_Sub4_5587, -643912397 * aClass441_5535.anInt5586, 458730501 * anInt5525, aClass391_5524.delays[-8792169 * anInt5523], i, i_14_, aClass391_5524.aBoolean4185, null);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.h(").append(')').toString());
		}
	}

	public final void method5831(ModelPart modelPart, int i) {
		try {
			if (aClass391_5524.frames != null && method5838((short) 225)) {
				modelPart.method4737(aClass441_5534.aClass298_Sub37_Sub4_5583, aClass441_5534.anInt5584 * 806878007);
				if (aBoolean5531 && null != aClass391_5524.iframes && aClass441_5535.aBoolean5585) {
					modelPart.method4737(aClass441_5535.aClass298_Sub37_Sub4_5583, aClass441_5535.anInt5584 * 806878007);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.v(").append(')').toString());
		}
	}

	public final boolean method5832(int i) {
		try {
			return aBoolean5530;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.e(").append(')').toString());
		}
	}

	public final void method5833(int i, int i_16_, int i_17_) {
		try {
			method5824(i, i_16_, 0, false, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.d(").append(')').toString());
		}
	}

	public final void method5834(int i) {
		try {
			method5835(0, (byte) 97);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.m(").append(')').toString());
		}
	}

	public final void method5835(int i, byte i_18_) {
		try {
			anInt5523 = 0;
			anInt5529 = -1266936279 * (aClass391_5524.frames.length > 1 ? 1 : -1);
			anInt5525 = 0;
			aBoolean5530 = false;
			anInt5526 = i * -2070327261;
			anInt5527 = 0;
			if (null != aClass391_5524 & aClass391_5524.frames != null) {
				method5837(aClass391_5524, -8792169 * anInt5523, (byte) -16);
				method5844(1713813277);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.w(").append(')').toString());
		}
	}

	public final boolean method5836(int i, int i_19_) {
		try {
			if (aClass391_5524 == null | (i -= anInt5526 * -1577984117) <= 0) {
				return false;
			}
			return aClass391_5524.aBoolean4176 | 458730501 * anInt5525 + i > aClass391_5524.delays[-8792169 * anInt5523];
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.o(").append(')').toString());
		}
	}

	void method5837(SeqType class391, int i, byte i_20_) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.l(").append(')').toString());
		}
	}

	final boolean method5838(short i) {
		try {
			if (null != aClass391_5524) {
				boolean bool = aClass441_5534.method5863(Class298_Sub2.aClass395_7165, aClass391_5524, anInt5523 * -8792169, -112073191 * anInt5529, aClass391_5524.frames, (byte) 103);
				if (bool && aBoolean5531 && aClass391_5524.iframes != null) {
					aClass441_5535.method5863(Class298_Sub2.aClass395_7165, aClass391_5524, anInt5523 * -8792169, anInt5529 * -112073191, aClass391_5524.iframes, (byte) 103);
				}
				return bool;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.ax(").append(')').toString());
		}
	}

	public final void method5839(ModelPart modelPart, int i, int i_21_) {
		try {
			if (aClass391_5524 != null) {
				if (null != aClass391_5524.frames && method5838((short) 225)) {
					modelPart.method4735(aClass441_5534.aClass298_Sub37_Sub4_5583, aClass441_5534.anInt5584 * 806878007, aClass441_5534.aClass298_Sub37_Sub4_5587, aClass441_5534.anInt5586 * -643912397, anInt5525 * 458730501, aClass391_5524.delays[-8792169 * anInt5523], i, aClass391_5524.aBoolean4185);
					if (aBoolean5531 && null != aClass391_5524.iframes && aClass441_5535.aBoolean5585) {
						modelPart.method4735(aClass441_5535.aClass298_Sub37_Sub4_5583, aClass441_5535.anInt5584 * 806878007, aClass441_5535.aClass298_Sub37_Sub4_5587, -643912397 * aClass441_5535.anInt5586, anInt5525 * 458730501, aClass391_5524.delays[-8792169 * anInt5523], i, aClass391_5524.aBoolean4185);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.t(").append(')').toString());
		}
	}

	public final void method5840(Animator animator_22_, int i) {
		try {
			aClass391_5524 = animator_22_.aClass391_5524;
			aBoolean5530 = animator_22_.aBoolean5530;
			aBoolean5531 = animator_22_.aBoolean5531;
			anInt5526 = 1 * animator_22_.anInt5526;
			anInt5527 = animator_22_.anInt5527 * 1;
			anInt5523 = animator_22_.anInt5523 * 1;
			anInt5529 = animator_22_.anInt5529 * 1;
			anInt5525 = 1 * animator_22_.anInt5525;
			method5844(853197244);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.f(").append(')').toString());
		}
	}

	public final void method5841(int i, boolean bool, boolean bool_23_, byte i_24_) {
		try {
			method5825(i, 0, 0, bool, bool_23_, -1437479972);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.x(").append(')').toString());
		}
	}

	public final void method5842(int i) {
		try {
			anInt5527 = 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.c(").append(')').toString());
		}
	}

	public final void method5843(int i, boolean bool, int i_25_) {
		try {
			method5824(i, 0, 0, bool, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.u(").append(')').toString());
		}
	}

	final void method5844(int i) {
		try {
			aClass441_5534.method5864(-2015637843);
			if (aBoolean5531) {
				aClass441_5535.method5864(-2050586678);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.aa(").append(')').toString());
		}
	}

	Animator(boolean bool) {
		aBoolean5531 = bool;
		aClass441_5534 = new Class441();
		if (aBoolean5531) {
			aClass441_5535 = new Class441();
		} else {
			aClass441_5535 = null;
		}
	}

	public static void method5845(RSInterface RSInterface, IComponentDefinition class105, int i) {
		try {
			IComponentDefinition class105_26_ = Class523.method6331(RSInterface, class105, -499945373);
			int i_27_;
			int i_28_;
			if (null == class105_26_) {
				i_27_ = Class462.canvasWidth * -2110394505;
				i_28_ = Class298_Sub40_Sub9.anInt9716 * -1111710645;
			} else {
				i_27_ = -2093041337 * class105_26_.width;
				i_28_ = class105_26_.height * 457937409;
			}
			Class82_Sub10.method904(class105, i_27_, i_28_, false, (byte) -73);
			Class292.method2816(class105, i_27_, i_28_, (byte) 6);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.kz(").append(')').toString());
		}
	}

	public static void method5846(String string, boolean bool, int i, int i_29_, int i_30_) {
		try {
			Class384.method4699(string, bool, i, i_29_, null, false, (short) -5215);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("sb.nl(").append(')').toString());
		}
	}
}
