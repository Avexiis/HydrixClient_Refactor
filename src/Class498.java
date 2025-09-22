/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class498 {
	public short[] aShortArray6107;
	public int[] models;
	public short[] aShortArray6109;
	public long aLong6110;

	public Class498(NPCType class503, boolean bool) {
		if (bool) {
			models = new int[class503.modelIds.length];
			System.arraycopy(class503.modelIds, 0, models, 0, models.length);
		} else {
			models = new int[class503.chatHeads.length];
			System.arraycopy(class503.chatHeads, 0, models, 0, models.length);
		}
		if (null != class503.modifiedModelColors) {
			aShortArray6109 = new short[class503.modifiedModelColors.length];
			System.arraycopy(class503.modifiedModelColors, 0, aShortArray6109, 0, aShortArray6109.length);
		}
		if (null != class503.modifiedTextureColors) {
			aShortArray6107 = new short[class503.modifiedTextureColors.length];
			System.arraycopy(class503.modifiedTextureColors, 0, aShortArray6107, 0, aShortArray6107.length);
		}
	}

	public Class498(long l, int[] is, short[] is_0_, short[] is_1_) {
		aLong6110 = 3177550440302969639L * l;
		models = is;
		aShortArray6109 = is_0_;
		aShortArray6107 = is_1_;
	}

	public static Class177 method6209(Packet class298_sub53, byte i) {
		try {
			Class177 class177 = new Class177();
			class177.anInt1787 = class298_sub53.readUnsignedShort() * -1496580327;
			class177.aClass298_Sub37_Sub14_1788 = Class447.aClass469_5618.method6045((class177.anInt1787 * -2034569943), (short) -12386);
			return class177;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("up.a(").append(')').toString());
		}
	}

	static final void method6210(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsSetup.clientPreferences.aVolumePreference_7587.method5726(-2147059683);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("up.akq(").append(')').toString());
		}
	}

	static final void method6211(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5241 -= 1938723502;
			String string = (String) (((ClientScript2) class403).anObjectArray5240[-203050393 * ((ClientScript2) class403).anInt5241]);
			String string_2_ = ((String) (((ClientScript2) class403).anObjectArray5240[-203050393 * ((ClientScript2) class403).anInt5241 + 1]));
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = string.indexOf(string_2_, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("up.aay(").append(')').toString());
		}
	}
}
