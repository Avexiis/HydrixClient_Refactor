/* VarClanSettings - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class VarClanSettings {
	public char aChar4085;
	public int anInt4086;
	public int anInt4087;
	public int anInt4088;
	public static int anInt4089;
	public static int anInt4090;

	void decode(Packet buffer, int i) {
		try {
			for (;;) {
				int opcode = buffer.readUnsignedByte();
				if (opcode == 0) {
					if (i <= 1110101469) {
						/* empty */
					}
					break;
				}
				method4656(buffer, opcode, 2123525160);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pq.a(" + ')');
		}
	}

	void method4656(Packet buffer, int opcode, int i_1_) {
		try {
			if (opcode == 1)
				aChar4085 = Class493.method6190(buffer.readByte(), 2024016549);
			else if (opcode == 2) {
				anInt4086 = buffer.readUnsignedShort() * -1304139699;
				anInt4087 = buffer.readUnsignedByte() * 480047535;
				anInt4088 = buffer.readUnsignedByte() * -1977314169;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pq.f(" + ')');
		}
	}

	VarClanSettings() {
		/* empty */
	}

	static final void method4657(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class102 class102 = Class298_Sub40_Sub13.method3517(i_2_, -1228274394);
			int i_3_ = -1;
			if (null != class102)
				i_3_ = class102.anInt1087 * -945858763;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pq.abv(" + ')');
		}
	}

	static final void method4658(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = GraphicsAutoSetup.clientPreferences.aClass422_Sub2_7547.method5629(-460328639) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pq.ajg(" + ')');
		}
	}

	public static void method4659(int i, int i_4_) {
		try {
			if (Class400.method4931((byte) 56)) {
				if (2084404473 * Class360.anInt3873 != i)
					Class360.aLong3874 = 2742373017286080113L;
				Class360.anInt3873 = i * 2035975497;
				GameClient.aClass25_8693.method384((byte) 49);
				Class439.method5851(4, 1551250847);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pq.q(" + ')');
		}
	}

	static final void method4660(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) (TimeUtils.getTime((byte) 1) / 60000L);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "pq.akn(" + ')');
		}
	}
}
