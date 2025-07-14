/* Class298_Sub37_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimFrameset extends Class298_Sub37 {
	AnimFrame[] frames;
	int framegroup;
	byte[][] framesData;
	final boolean osrs;
	static Js5 aClass243_9582;

	public boolean isReady() {
		try {
			if (frames != null) {
				return true;
			}
			int groupid = 1899473659 * framegroup;
			boolean osrs = this.osrs;
			if (framesData == null) {
				synchronized (Class317.aClass243_3321) {
					if (!Class317.aClass243_3321.method2291(groupid, 334179097)) {
						boolean bool = false;
						return bool;
					}
					int[] is = Class317.aClass243_3321.getFileIds(groupid, -2074944518);
					framesData = new byte[is.length][];
					for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
						framesData[i_0_] = Class317.aClass243_3321.getFileFromArchive(groupid, is[i_0_], (byte) -7);
					}
				}
			}
			boolean bool = true;
			for (byte[] is : framesData) {
				Packet packet = new Packet(is);
				packet.pos = osrs ? 0 : 116413311;
				int baseid = packet.readUnsignedShort();
				if (osrs) {
					baseid += OSRSData.BASES_OFFSET;
				}
				synchronized (aClass243_9582) {
					bool &= aClass243_9582.method2310(baseid, -457216440);
				}
			}
			if (!bool) {
				return false;
			}
			Class458 class458 = new Class458();
			int[] is;
			synchronized (Class317.aClass243_3321) {
				int i_3_ = Class317.aClass243_3321.method2316(groupid, -222662329);
				frames = new AnimFrame[i_3_];
				is = Class317.aClass243_3321.getFileIds(groupid, -2046558264);
			}
			for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
				byte[] is_5_ = framesData[i_4_];
				Packet class298_sub53 = new Packet(is_5_);
				class298_sub53.pos = osrs ? 0 : 116413311;
				int baseid = class298_sub53.readUnsignedShort();
				if (osrs) {
					baseid += OSRSData.BASES_OFFSET;
				}
				AnimBase class298_sub15 = null;
				for (AnimBase class298_sub15_7_ = (AnimBase) class458
						.method5967(2084946117); class298_sub15_7_ != null; class298_sub15_7_ = (AnimBase) class458
								.method5969((byte) -23)) {
					if (baseid == class298_sub15_7_.anInt7276 * 1029066723) {
						class298_sub15 = class298_sub15_7_;
						break;
					}
				}
				if (null == class298_sub15) {
					synchronized (aClass243_9582) {
						class298_sub15 = new AnimBase(baseid, aClass243_9582.method2294(baseid, (byte) 34), osrs);
					}
					class458.method5968(class298_sub15, 805140432);
				}
				frames[is[i_4_]] = new AnimFrame(is_5_, class298_sub15, osrs);
			}
			framesData = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aih.f(").append(')').toString());
		}
	}

	public boolean method3413(int i, byte i_8_) {
		try {
			return frames[i].aBoolean940;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aih.p(").append(')').toString());
		}
	}

	public boolean method3414(int i, byte i_9_) {
		try {
			return frames[i].aBoolean941;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aih.i(").append(')').toString());
		}
	}

	public AnimFrameset(int framegroup) {
		if (osrs = (framegroup & 0x8000) != 0) {
			framegroup &= ~0x8000;
			framegroup += OSRSData.FRAMES_OFFSET;
		}
		this.framegroup = -2073571277 * framegroup;
	}

	public boolean method3415(int i, int i_10_) {
		try {
			return frames[i].aBoolean939;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aih.b(").append(')').toString());
		}
	}
}
