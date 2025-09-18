
/* Class476 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class DiskFile {
	long aLong5983;
	RandomAccessFile aRandomAccessFile5984;
	long aLong5985;
	static LinkedNodeList aLinkedNodeList_5986;

	final void method6077(long l) throws IOException {
		try {
			aRandomAccessFile5984.seek(l);
			aLong5985 = 5892097441890682535L * l;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tp.a(").append(')').toString());
		}
	}

	public final void write(byte[] is, int i, int i_0_) throws IOException {
		try {
			if (-1855833292870549225L * aLong5985 + i_0_ > aLong5983 * -1095537870969537929L) {
				aRandomAccessFile5984.seek(-1095537870969537929L * aLong5983);
				aRandomAccessFile5984.write(1);
				throw new EOFException();
			}
			aRandomAccessFile5984.write(is, i, i_0_);
			aLong5985 += 5892097441890682535L * i_0_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tp.f(").append(')').toString());
		}
	}

	public final void close() throws IOException {
		try {
			if (null != aRandomAccessFile5984) {
				aRandomAccessFile5984.close();
				aRandomAccessFile5984 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tp.b(").append(')').toString());
		}
	}

	public final long method6080(int i) throws IOException {
		try {
			return aRandomAccessFile5984.length();
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tp.p(").append(')').toString());
		}
	}

	public final int method6081(byte[] is, int i, int i_2_, short i_3_) throws IOException {
		try {
			int i_4_ = aRandomAccessFile5984.read(is, i, i_2_);
			if (i_4_ > 0) {
				aLong5985 += i_4_ * 5892097441890682535L;
			}
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tp.i(").append(')').toString());
		}
	}

	@Override
	protected void finalize() throws Throwable {
		try {
			if (null != aRandomAccessFile5984) {
				close();
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("tp.finalize(").append(')').toString());
		}
	}

	public DiskFile(File file, String string, long l) throws IOException {
		if (l == -1L) {
			l = 9223372036854775807L;
		}
		if (file.length() > l) {
			System.out.println("Error!" + file.getName() + " is corrupted. Deleting.");
			file.delete();
		}
		aRandomAccessFile5984 = new RandomAccessFile(file, string);
		aLong5983 = l * 1728399846774964039L;
		aLong5985 = 0L;
		int i = aRandomAccessFile5984.read();
		if (-1 != i && !string.equals("r")) {
			aRandomAccessFile5984.seek(0L);
			aRandomAccessFile5984.write(i);
		}
		aRandomAccessFile5984.seek(0L);
	}

	static final void method6082(ClientScript2 class403, byte i) {
		try {
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = 707299179 * LoginData.anInt3892;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "tp.ahm(" + ')');
		}
	}

	static final void method6083(int plane, int i_5_, int i_6_, int i_7_) {
		try {
			String string = "tele " + plane + Symbol.COMMA + (i_5_ >> 6) + Symbol.COMMA + (i_6_ >> 6) + Symbol.COMMA + (i_5_ & 0x3f) + Symbol.COMMA + (i_6_ & 0x3f);
			//System.out.println(string);
			ConsoleCommands.method5605(string, true, false, 1405738364);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "tp.gd(" + ')');
		}
	}
}
