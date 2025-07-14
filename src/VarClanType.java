/* VarClanType - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarClanType {
	public int anInt6275;
	public int anInt6276;
	public char aChar6277;
	public int anInt6278;

	void method6320(Packet buffer, int opcode, int i_0_) {
		try {
			if (opcode == 1)
				aChar6277 = Class493.method6190(buffer.readByte(), 1830993802);
			else if (3 == opcode) {
				anInt6276 = buffer.readUnsignedShort() * -1544029687;
				anInt6275 = buffer.readUnsignedByte() * -786049945;
				anInt6278 = buffer.readUnsignedByte() * -2127046785;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "vy.f(" + ')');
		}
	}

	VarClanType() {
		/* empty */
	}

	void method6321(Packet class298_sub53, int i) {
		try {
			for (;;) {
				int i_1_ = class298_sub53.readUnsignedByte();
				if (0 == i_1_) {
					if (i == -1099657695)
						break;
					break;
				}
				method6320(class298_sub53, i_1_, 1972113647);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "vy.a(" + ')');
		}
	}
}
