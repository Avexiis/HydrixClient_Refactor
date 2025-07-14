/* Class519 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class Class519 {
	Inflater anInflater6273;
	public static int[] anIntArray6274;

	public byte[] method6317(byte[] is, short i) {
		try {
			Packet class298_sub53 = new Packet(is);
			class298_sub53.pos = (is.length - 4) * 116413311;
			int i_0_ = class298_sub53.method3600(-471458915);
			byte[] is_1_ = new byte[i_0_];
			class298_sub53.pos = 0;
			method6318(class298_sub53, is_1_, -1056793705);
			return is_1_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("vv.a(").append(')').toString());
		}
	}

	public void method6318(Packet class298_sub53, byte[] is, int i) {
		try {
			if (31 != (class298_sub53.payload[class298_sub53.pos * 385051775]) || -117 != (class298_sub53.payload[class298_sub53.pos * 385051775 + 1]))
				throw new RuntimeException("");
			if (((Class519) this).anInflater6273 == null)
				((Class519) this).anInflater6273 = new Inflater(true);
			try {
				((Class519) this).anInflater6273.setInput(class298_sub53.payload, 10 + 385051775 * class298_sub53.pos, (class298_sub53.payload.length - (8 + (385051775 * class298_sub53.pos + 10))));
				((Class519) this).anInflater6273.inflate(is);
			} catch (Exception exception) {
				((Class519) this).anInflater6273.reset();
				throw new RuntimeException("");
			}
			((Class519) this).anInflater6273.reset();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("vv.f(").append(')').toString());
		}
	}

	public Class519() {
		this(-1, 1000000, 1000000);
	}

	Class519(int i, int i_2_, int i_3_) {
		/* empty */
	}

	static final String[] method6319(String[] strings, int i) {
		try {
			String[] strings_4_ = new String[5];
			for (int i_5_ = 0; i_5_ < 5; i_5_++) {
				strings_4_[i_5_] = new StringBuilder().append(i_5_).append(" ").toString();
				if (null != strings && strings[i_5_] != null)
					strings_4_[i_5_] = new StringBuilder().append(strings_4_[i_5_]).append(strings[i_5_]).toString();
			}
			return strings_4_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("vv.ly(").append(')').toString());
		}
	}
}
