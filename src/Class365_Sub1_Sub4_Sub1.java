/* Class365_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365_Sub1_Sub4_Sub1 extends Class365_Sub1_Sub4 {
	public int anInt10142;
	public int anInt10143;
	boolean aBoolean10144;
	public int anInt10145;
	public int anInt10146;
	public int anInt10147;
	int anInt10148;
	int anInt10149;
	public int anInt10150 = -474510257;
	int anInt10151;
	public int anInt10152;
	int anInt10153;
	int anInt10154;

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			SceneObjectPosition sceneObjectPosition = SceneObjectPosition.method2005(method4337().aSceneObjectPosition_2599);
			Class322 class322 = aSceneGraph_7722.method4036(plane, (int) sceneObjectPosition.x >> 9, (int) sceneObjectPosition.z >> 9, -583169676);
			Class365_Sub1_Sub2 class365_sub1_sub2 = aSceneGraph_7722.method4058(plane, (int) sceneObjectPosition.x >> 9, (int) sceneObjectPosition.z >> 9, (byte) 55);
			int i_0_ = 0;
			if (null != class322 && class322.aClass365_Sub1_Sub1_3359.aBoolean9799)
				i_0_ = class322.aClass365_Sub1_Sub1_3359.method4361(1951240662);
			if (class365_sub1_sub2 != null && class365_sub1_sub2.aShort9801 > -i_0_)
				i_0_ = -class365_sub1_sub2.aShort9801;
			if (-1184748693 * anInt10142 != i_0_) {
				sceneObjectPosition.y += (float) (i_0_ - anInt10142 * -1184748693);
				method4340(sceneObjectPosition);
				anInt10142 = 472885571 * i_0_;
			}
			Matrix43f class222 = class_ra.method5178();
			class222.method2055();
			if (anInt10142 * -1184748693 == 0) {
				boolean bool = false;
				boolean bool_1_ = false;
				boolean bool_2_ = false;
				Ground ground = aSceneGraph_7722.aGroundArray3517[aByte7724];
				int i_3_ = (455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149 << 1);
				int i_4_ = i_3_;
				int i_5_ = -i_3_ / 2;
				int i_6_ = -i_4_ / 2;
				int i_7_ = ground.method6340(i_5_ + (int) sceneObjectPosition.x, (int) sceneObjectPosition.z + i_6_, -1982900642);
				int i_8_ = i_3_ / 2;
				int i_9_ = -i_4_ / 2;
				int i_10_ = ground.method6340((int) sceneObjectPosition.x + i_8_, i_9_ + (int) sceneObjectPosition.z, -1725399320);
				int i_11_ = -i_3_ / 2;
				int i_12_ = i_4_ / 2;
				int i_13_ = ground.method6340((int) sceneObjectPosition.x + i_11_, (int) sceneObjectPosition.z + i_12_, -1471266970);
				int i_14_ = i_3_ / 2;
				int i_15_ = i_4_ / 2;
				int i_16_ = ground.method6340(i_14_ + (int) sceneObjectPosition.x, i_15_ + (int) sceneObjectPosition.z, -1424760570);
				int i_17_ = i_7_ < i_10_ ? i_7_ : i_10_;
				int i_18_ = i_13_ < i_16_ ? i_13_ : i_16_;
				int i_19_ = i_10_ < i_16_ ? i_10_ : i_16_;
				int i_20_ = i_7_ < i_13_ ? i_7_ : i_13_;
				if (i_4_ != 0) {
					int i_21_ = ((int) (Math.atan2((double) (i_17_ - i_18_), (double) i_4_) * 2607.5945876176133) & 0x3fff);
					if (i_21_ != 0)
						class222.method2071(1.0F, 0.0F, 0.0F, Class220.method2049(i_21_));
				}
				if (i_3_ != 0) {
					int i_22_ = ((int) (Math.atan2((double) (i_20_ - i_19_), (double) i_3_) * 2607.5945876176133) & 0x3fff);
					if (i_22_ != 0)
						class222.method2071(0.0F, 0.0F, 1.0F, Class220.method2049(-i_22_));
				}
				int i_23_ = i_7_ + i_16_;
				if (i_10_ + i_13_ < i_23_)
					i_23_ = i_13_ + i_10_;
				i_23_ = (i_23_ >> 1) - (int) sceneObjectPosition.y;
				if (i_23_ != 0)
					class222.method2064(0.0F, (float) i_23_, 0.0F);
			}
			sceneObjectPosition.method2006();
			SceneObjectPosition sceneObjectPosition_24_ = method4337().aSceneObjectPosition_2599;
			class222.method2064(sceneObjectPosition_24_.x, sceneObjectPosition_24_.y - 10.0F, sceneObjectPosition_24_.z);
			Class335 class335 = Class73.method818(true, 2098850781);
			((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 = false;
			((Class365_Sub1_Sub4_Sub1) this).anInt10149 = 0;
			if (anInt10146 * -1651799761 != -1) {
				ModelPart modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 526336, 1271433065 * anInt10147, null, null, (1191848641 * ((Class365_Sub1_Sub4_Sub1) this).anInt10151), (((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391), (-1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153), (-1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154), 1919430109));
				if (null != modelPart) {
					modelPart.method4739(class222, aClass302_Sub1Array7726[2], 0);
					((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= modelPart.i();
					((Class365_Sub1_Sub4_Sub1) this).anInt10149 = modelPart.n() * 674558949;
				}
			}
			if (-1 != -909380271 * anInt10150) {
				ModelPart modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 526336, 442323255 * anInt10145, null, null, (1191848641 * ((Class365_Sub1_Sub4_Sub1) this).anInt10151), (((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391), (-1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153), (-1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154), 1944203535));
				if (null != modelPart) {
					modelPart.method4739(class222, aClass302_Sub1Array7726[1], 0);
					((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= modelPart.i();
					if (modelPart.n() > (455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149))
						((Class365_Sub1_Sub4_Sub1) this).anInt10149 = modelPart.n() * 674558949;
				}
			}
			ModelPart modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 526336, 825822935 * anInt10143, null, null, ((Class365_Sub1_Sub4_Sub1) this).anInt10151 * 1191848641, ((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391, -1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153, -1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154, 1623001467));
			if (null != modelPart) {
				modelPart.method4739(class222, aClass302_Sub1Array7726[0], 0);
				((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= modelPart.i();
				if (modelPart.n() > 455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149)
					((Class365_Sub1_Sub4_Sub1) this).anInt10149 = modelPart.n() * 674558949;
			}
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("akc.bo(").append(')').toString());
		}
	}

	void method4516(int i) {
		try {
			((Class365_Sub1_Sub4_Sub1) this).anInt10151 = (32 + (int) (Math.random() * 4.0)) * 2009949505;
			((Class365_Sub1_Sub4_Sub1) this).anInt10148 = (3 + (int) (Math.random() * 2.0)) * 880372431;
			((Class365_Sub1_Sub4_Sub1) this).anInt10153 = (16 + (int) (Math.random() * 3.0)) * -1003661399;
			if (GraphicsAutoSetup.clientPreferences.texturePreference.getValue(1941334276) == 1)
				((Class365_Sub1_Sub4_Sub1) this).anInt10154 = (int) (Math.random() * 10.0) * 1183208523;
			else
				((Class365_Sub1_Sub4_Sub1) this).anInt10154 = (int) (Math.random() * 20.0) * 1183208523;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("akc.a(").append(')').toString());
		}
	}

	public int method4379() {
		return -10;
	}

	boolean method4376(short i) {
		try {
			return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("akc.be(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("akc.bc(").append(')').toString());
		}
	}

	public int method4381() {
		return -10;
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("akc.bb(").append(')').toString());
		}
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		SceneObjectPosition sceneObjectPosition = SceneObjectPosition.method2005(method4337().aSceneObjectPosition_2599);
		Class322 class322 = aSceneGraph_7722.method4036(plane, (int) sceneObjectPosition.x >> 9, (int) sceneObjectPosition.z >> 9, 1738520080);
		Class365_Sub1_Sub2 class365_sub1_sub2 = aSceneGraph_7722.method4058(plane, (int) sceneObjectPosition.x >> 9, (int) sceneObjectPosition.z >> 9, (byte) 15);
		int i = 0;
		if (null != class322 && class322.aClass365_Sub1_Sub1_3359.aBoolean9799)
			i = class322.aClass365_Sub1_Sub1_3359.method4361(1951240662);
		if (class365_sub1_sub2 != null && class365_sub1_sub2.aShort9801 > -i)
			i = -class365_sub1_sub2.aShort9801;
		if (-1184748693 * anInt10142 != i) {
			sceneObjectPosition.y += (float) (i - anInt10142 * -1184748693);
			method4340(sceneObjectPosition);
			anInt10142 = 472885571 * i;
		}
		Matrix43f class222 = class_ra.method5178();
		class222.method2055();
		if (anInt10142 * -1184748693 == 0) {
			boolean bool = false;
			boolean bool_25_ = false;
			boolean bool_26_ = false;
			Ground ground = aSceneGraph_7722.aGroundArray3517[aByte7724];
			int i_27_ = 455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149 << 1;
			int i_28_ = i_27_;
			int i_29_ = -i_27_ / 2;
			int i_30_ = -i_28_ / 2;
			int i_31_ = ground.method6340(i_29_ + (int) sceneObjectPosition.x, (int) sceneObjectPosition.z + i_30_, -1545427351);
			int i_32_ = i_27_ / 2;
			int i_33_ = -i_28_ / 2;
			int i_34_ = ground.method6340((int) sceneObjectPosition.x + i_32_, i_33_ + (int) sceneObjectPosition.z, -1284070566);
			int i_35_ = -i_27_ / 2;
			int i_36_ = i_28_ / 2;
			int i_37_ = ground.method6340((int) sceneObjectPosition.x + i_35_, (int) sceneObjectPosition.z + i_36_, -1982262190);
			int i_38_ = i_27_ / 2;
			int i_39_ = i_28_ / 2;
			int i_40_ = ground.method6340(i_38_ + (int) sceneObjectPosition.x, i_39_ + (int) sceneObjectPosition.z, -1609235363);
			int i_41_ = i_31_ < i_34_ ? i_31_ : i_34_;
			int i_42_ = i_37_ < i_40_ ? i_37_ : i_40_;
			int i_43_ = i_34_ < i_40_ ? i_34_ : i_40_;
			int i_44_ = i_31_ < i_37_ ? i_31_ : i_37_;
			if (i_28_ != 0) {
				int i_45_ = ((int) (Math.atan2((double) (i_41_ - i_42_), (double) i_28_) * 2607.5945876176133) & 0x3fff);
				if (i_45_ != 0)
					class222.method2071(1.0F, 0.0F, 0.0F, Class220.method2049(i_45_));
			}
			if (i_27_ != 0) {
				int i_46_ = ((int) (Math.atan2((double) (i_44_ - i_43_), (double) i_27_) * 2607.5945876176133) & 0x3fff);
				if (i_46_ != 0)
					class222.method2071(0.0F, 0.0F, 1.0F, Class220.method2049(-i_46_));
			}
			int i_47_ = i_31_ + i_40_;
			if (i_34_ + i_37_ < i_47_)
				i_47_ = i_37_ + i_34_;
			i_47_ = (i_47_ >> 1) - (int) sceneObjectPosition.y;
			if (i_47_ != 0)
				class222.method2064(0.0F, (float) i_47_, 0.0F);
		}
		sceneObjectPosition.method2006();
		SceneObjectPosition sceneObjectPosition_48_ = method4337().aSceneObjectPosition_2599;
		class222.method2064(sceneObjectPosition_48_.x, sceneObjectPosition_48_.y - 10.0F, sceneObjectPosition_48_.z);
		Class335 class335 = Class73.method818(true, 1609695805);
		((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 = false;
		((Class365_Sub1_Sub4_Sub1) this).anInt10149 = 0;
		if (anInt10146 * -1651799761 != -1) {
			ModelPart modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 526336, 1271433065 * anInt10147, null, null, 1191848641 * ((Class365_Sub1_Sub4_Sub1) this).anInt10151, ((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391, -1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153, -1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154, 1928416812));
			if (null != modelPart) {
				modelPart.method4739(class222, aClass302_Sub1Array7726[2], 0);
				((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= modelPart.i();
				((Class365_Sub1_Sub4_Sub1) this).anInt10149 = modelPart.n() * 674558949;
			}
		}
		if (-1 != -909380271 * anInt10150) {
			ModelPart modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 526336, 442323255 * anInt10145, null, null, 1191848641 * ((Class365_Sub1_Sub4_Sub1) this).anInt10151, ((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391, -1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153, -1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154, 1479435475));
			if (null != modelPart) {
				modelPart.method4739(class222, aClass302_Sub1Array7726[1], 0);
				((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= modelPart.i();
				if (modelPart.n() > 455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149)
					((Class365_Sub1_Sub4_Sub1) this).anInt10149 = modelPart.n() * 674558949;
			}
		}
		ModelPart modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 526336, 825822935 * anInt10143, null, null, ((Class365_Sub1_Sub4_Sub1) this).anInt10151 * 1191848641, ((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391, -1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153, -1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154, 1686923112));
		if (null != modelPart) {
			modelPart.method4739(class222, aClass302_Sub1Array7726[0], 0);
			((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= modelPart.i();
			if (modelPart.n() > 455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149)
				((Class365_Sub1_Sub4_Sub1) this).anInt10149 = modelPart.n() * 674558949;
		}
		return class335;
	}

	public int method4517() {
		return anInt10142 * -1184748693 - method4361(1951240662);
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_49_, byte i_50_) {
		try {
			Matrix43f class222 = class_ra.method5178();
			class222.method2054(method4337());
			class222.method2064(0.0F, -10.0F, 0.0F);
			ModelPart modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 131072, anInt10143 * 825822935, null, null, 0, 0, 0, 0, 1524116625));
			if (modelPart != null && modelPart.method4787(i, i_49_, class222, true, 0))
				return true;
			if (-1 != -909380271 * anInt10150) {
				modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 131072, anInt10145 * 442323255, null, null, 0, 0, 0, 0, 1865340976));
				if (null != modelPart && modelPart.method4787(i, i_49_, class222, true, 0))
					return true;
			}
			if (-1651799761 * anInt10146 != -1) {
				modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 131072, anInt10147 * 1271433065, null, null, 0, 0, 0, 0, 1786172187));
				if (null != modelPart && modelPart.method4787(i, i_49_, class222, true, 0))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("akc.bu(").append(')').toString());
		}
	}

	public int method4363(byte i) {
		try {
			return anInt10142 * -1184748693 - method4361(1951240662);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("akc.bx(").append(')').toString());
		}
	}

	boolean method4353() {
		return false;
	}

	boolean method4365() {
		return false;
	}

	boolean method4374() {
		return false;
	}

	public int method4361(int i) {
		try {
			return -10;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("akc.bm(").append(')').toString());
		}
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_51_) {
		Matrix43f class222 = class_ra.method5178();
		class222.method2054(method4337());
		class222.method2064(0.0F, -10.0F, 0.0F);
		ModelPart modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 131072, anInt10143 * 825822935, null, null, 0, 0, 0, 0, 1941958028));
		if (modelPart != null && modelPart.method4787(i, i_51_, class222, true, 0))
			return true;
		if (-1 != -909380271 * anInt10150) {
			modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 131072, anInt10145 * 442323255, null, null, 0, 0, 0, 0, 1793640460));
			if (null != modelPart && modelPart.method4787(i, i_51_, class222, true, 0))
				return true;
		}
		if (-1651799761 * anInt10146 != -1) {
			modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 131072, anInt10147 * 1271433065, null, null, 0, 0, 0, 0, 1580885065));
			if (null != modelPart && modelPart.method4787(i, i_51_, class222, true, 0))
				return true;
		}
		return false;
	}

	public int method4518() {
		return anInt10142 * -1184748693 - method4361(1951240662);
	}

	boolean method4399(byte i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("akc.bf(").append(')').toString());
		}
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		return null;
	}

	void method4371(GraphicsToolkit class_ra) {
		/* empty */
	}

	void method4373(GraphicsToolkit class_ra) {
		/* empty */
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_52_) {
		Matrix43f class222 = class_ra.method5178();
		class222.method2054(method4337());
		class222.method2064(0.0F, -10.0F, 0.0F);
		ModelPart modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 131072, anInt10143 * 825822935, null, null, 0, 0, 0, 0, 1821520052));
		if (modelPart != null && modelPart.method4787(i, i_52_, class222, true, 0))
			return true;
		if (-1 != -909380271 * anInt10150) {
			modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 131072, anInt10145 * 442323255, null, null, 0, 0, 0, 0, 1489694814));
			if (null != modelPart && modelPart.method4787(i, i_52_, class222, true, 0))
				return true;
		}
		if (-1651799761 * anInt10146 != -1) {
			modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 131072, anInt10147 * 1271433065, null, null, 0, 0, 0, 0, 1473872743));
			if (null != modelPart && modelPart.method4787(i, i_52_, class222, true, 0))
				return true;
		}
		return false;
	}

	int method4519() {
		ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152);
		int i = class468.anInt5768 * -427528997;
		if (anInt10150 * -909380271 != -1) {
			ItemDefinitions class468_53_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271);
			if (-427528997 * class468_53_.anInt5768 > i)
				i = -427528997 * class468_53_.anInt5768;
		}
		if (-1 != -1651799761 * anInt10146) {
			ItemDefinitions class468_54_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761);
			if (-427528997 * class468_54_.anInt5768 > i)
				i = class468_54_.anInt5768 * -427528997;
		}
		return i;
	}

	int method4356(byte i) {
		try {
			ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152);
			int i_55_ = class468.anInt5768 * -427528997;
			if (anInt10150 * -909380271 != -1) {
				ItemDefinitions class468_56_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271);
				if (-427528997 * class468_56_.anInt5768 > i_55_)
					i_55_ = -427528997 * class468_56_.anInt5768;
			}
			if (-1 != -1651799761 * anInt10146) {
				ItemDefinitions class468_57_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761);
				if (-427528997 * class468_57_.anInt5768 > i_55_)
					i_55_ = class468_57_.anInt5768 * -427528997;
			}
			return i_55_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("akc.dh(").append(')').toString());
		}
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_58_) {
		Matrix43f class222 = class_ra.method5178();
		class222.method2054(method4337());
		class222.method2064(0.0F, -10.0F, 0.0F);
		ModelPart modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 131072, anInt10143 * 825822935, null, null, 0, 0, 0, 0, 1529040042));
		if (modelPart != null && modelPart.method4787(i, i_58_, class222, true, 0))
			return true;
		if (-1 != -909380271 * anInt10150) {
			modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 131072, anInt10145 * 442323255, null, null, 0, 0, 0, 0, 1915148901));
			if (null != modelPart && modelPart.method4787(i, i_58_, class222, true, 0))
				return true;
		}
		if (-1651799761 * anInt10146 != -1) {
			modelPart = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 131072, anInt10147 * 1271433065, null, null, 0, 0, 0, 0, 1728888293));
			if (null != modelPart && modelPart.method4787(i, i_58_, class222, true, 0))
				return true;
		}
		return false;
	}

	public int method4380() {
		return -10;
	}

	public Class365_Sub1_Sub4_Sub1(SceneGraph sceneGraph, int i, int i_59_, int i_60_, int i_61_, int i_62_) {
		super(sceneGraph, i, i_59_, i_60_, i_61_, i_62_);
		anInt10146 = 2004197937;
		anInt10142 = 0;
		((Class365_Sub1_Sub4_Sub1) this).anInt10149 = 0;
		((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 = false;
		method4362(3, -2110276499);
		method4516(-1068420966);
	}

	boolean method4369() {
		return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
	}

	boolean method4382() {
		return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
	}

	boolean method4349() {
		return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
	}

	boolean method4383() {
		return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
	}

	boolean method4351() {
		return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
	}

	int method4520() {
		ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152);
		int i = class468.anInt5768 * -427528997;
		if (anInt10150 * -909380271 != -1) {
			ItemDefinitions class468_63_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271);
			if (-427528997 * class468_63_.anInt5768 > i)
				i = -427528997 * class468_63_.anInt5768;
		}
		if (-1 != -1651799761 * anInt10146) {
			ItemDefinitions class468_64_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761);
			if (-427528997 * class468_64_.anInt5768 > i)
				i = class468_64_.anInt5768 * -427528997;
		}
		return i;
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		return null;
	}

	int method4521() {
		ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152);
		int i = class468.anInt5768 * -427528997;
		if (anInt10150 * -909380271 != -1) {
			ItemDefinitions class468_65_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271);
			if (-427528997 * class468_65_.anInt5768 > i)
				i = -427528997 * class468_65_.anInt5768;
		}
		if (-1 != -1651799761 * anInt10146) {
			ItemDefinitions class468_66_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761);
			if (-427528997 * class468_66_.anInt5768 > i)
				i = class468_66_.anInt5768 * -427528997;
		}
		return i;
	}
}
