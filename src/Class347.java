/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class347 {
	Js5 aClass243_3698;
	Js5 aClass243_3699;
	CachingHashMap aClass348_3700 = new CachingHashMap(20);
	CachingHashMap aClass348_3701 = new CachingHashMap(64);

	public HitType method4176(int i, int i_0_) {
		try {
			HitType hitType;
			synchronized (((Class347) this).aClass348_3701) {
				hitType = (HitType) ((Class347) this).aClass348_3701.get((long) i);
			}
			if (null != hitType)
				return hitType;
			byte[] is;
			synchronized (((Class347) this).aClass243_3698) {
				is = (((Class347) this).aClass243_3698.getFileFromArchive(-1006924897 * Js5ConfigGroup.aClass120_1451.anInt1460, i, (byte) -66));
			}
			hitType = new HitType();
			((HitType) hitType).aClass347_3856 = this;
			if (null != is)
				hitType.method4277(new Packet(is), -1860141420);
			synchronized (((Class347) this).aClass348_3701) {
				((Class347) this).aClass348_3701.put(hitType, (long) i);
			}
			return hitType;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("om.a(").append(')').toString());
		}
	}

	public void method4177(short i) {
		try {
			synchronized (((Class347) this).aClass348_3701) {
				((Class347) this).aClass348_3701.method4187();
			}
			synchronized (((Class347) this).aClass348_3700) {
				((Class347) this).aClass348_3700.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("om.f(").append(')').toString());
		}
	}

	public void method4178(int i, int i_1_) {
		try {
			synchronized (((Class347) this).aClass348_3701) {
				((Class347) this).aClass348_3701.method4186(i, -1794430367);
			}
			synchronized (((Class347) this).aClass348_3700) {
				((Class347) this).aClass348_3700.method4186(i, -1227911326);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("om.b(").append(')').toString());
		}
	}

	public void method4179(int i) {
		try {
			synchronized (((Class347) this).aClass348_3701) {
				((Class347) this).aClass348_3701.method4189();
			}
			synchronized (((Class347) this).aClass348_3700) {
				((Class347) this).aClass348_3700.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("om.p(").append(')').toString());
		}
	}

	public Class347(GameContext gameContext, Language language, Js5 class243, Js5 class243_2_) {
		((Class347) this).aClass243_3699 = class243_2_;
		((Class347) this).aClass243_3698 = class243;
		((Class347) this).aClass243_3698.method2316((Js5ConfigGroup.aClass120_1451.anInt1460) * -1006924897, -790264977);
	}

	static final void method4180(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			RSInterface RSInterface = ((Class390) class390).aRSInterface_4167;
			Class486.method6157(class105, RSInterface, class403, (byte) 55);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("om.fp(").append(')').toString());
		}
	}

	static final void method4181(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_3_, (byte) -22);
			Js5Archive.method1235(class105, class403, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("om.qu(").append(')').toString());
		}
	}
}
