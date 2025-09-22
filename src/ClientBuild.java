/* ClientBuild - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class ClientBuild {
	public static ClientBuild aClientBuild_5602;
	public static ClientBuild aClientBuild_5603;
	public static ClientBuild aClientBuild_5604 = new ClientBuild("LIVE", 0);
	public static ClientBuild aClientBuild_5605;
	static ClientBuild aClientBuild_5606;
	public String aString5607;
	public int anInt5608;

	static {
		aClientBuild_5603 = new ClientBuild("BUILDLIVE", 3);
		aClientBuild_5602 = new ClientBuild("RC", 1);
		aClientBuild_5605 = new ClientBuild("WIP", 2);
		aClientBuild_5606 = new ClientBuild("INTBETA", 4);
	}

	ClientBuild(String string, int i) {
		aString5607 = string;
		anInt5608 = i * -1854515921;
	}

	public static ClientBuild getClientBuild(int i, byte i_0_) {
		try {
			ClientBuild[] clientBuilds = Class408.method4965((byte) 16);
			for (int i_1_ = 0; i_1_ < clientBuilds.length; i_1_++) {
				ClientBuild clientBuild = clientBuilds[i_1_];
				if (i == clientBuild.anInt5608 * 1286017487)
					return clientBuild;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("si.f(").append(')').toString());
		}
	}

	public static void execute(ScriptContext scriptContext, byte i) {
		try {
			Class203.method1908(scriptContext, 200000, (short) 3156);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("si.b(").append(')').toString());
		}
	}

	static void method5890(byte i) {
		try {
			if (DisplayMode.consoleLogStream != null) {
				try {
					DisplayMode.consoleLogStream.close();
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			DisplayMode.consoleLogStream = null;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("si.i(").append(')').toString());
		}
	}
}
