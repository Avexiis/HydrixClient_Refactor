/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Iterator;

public class VarBitType {

	public int startinBit;
	public int realConfigId;
	public int endingBit;
	static Packet aClass298_Sub53_3471;
	public static Class317 aClass317_3472;

	void parseBuffer(Packet buffer, int i) {
		try {
			for (;;) {
				int opcode = buffer.readUnsignedByte();
				if (opcode == 0) {
					break;
				}
				parseOpcode(buffer, opcode);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nq.a(").append(')').toString());
		}
	}

	void parseOpcode(Packet buffer, int opcode) {
		if (opcode == 1) {
			realConfigId = buffer.readUnsignedShort() * 2019336269;
			startinBit = buffer.readUnsignedByte() * 2083582845;
			endingBit = buffer.readUnsignedByte() * 627221103;
		}
	}

	VarBitType() {
		/* empty */
	}

	public static void method3977(SceneGraph sceneGraph, GraphicsToolkit class_ra, int i) {
		try {
			Iterator iterator = Class344.aList3683.iterator();
			while (iterator.hasNext()) {
				ClickableGeometry clickableGeometry = (ClickableGeometry) iterator.next();
				if (clickableGeometry.aBoolean3771) {
					clickableGeometry.method4228(sceneGraph, class_ra);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nq.b(").append(')').toString());
		}
	}

	static final void method3978(IComponentDefinition interfacedef, RSInterface RSInterface, ClientScript2 script, int i) {
		try {
			String string = (String) (script.anObjectArray5240[(script.anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, script, -68836416) != null) {
				string = string.substring(0, string.length() - 1);
			}
			interfacedef.anObjectArray1291 = Class128_Sub2.method1441(string, script, -2046058202);
			interfacedef.hasScripts = true;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nq.lt(").append(')').toString());
		}
	}

	public static void method3979(boolean bool, byte[] is, int i) {
		try {
			if (aClass298_Sub53_3471 == null) {
				aClass298_Sub53_3471 = new Packet(20000);
			}
			aClass298_Sub53_3471.writeBytes(is, 0, is.length, (short) -3701);
			if (bool) {
				Class431.method5763(aClass298_Sub53_3471.payload, 325303236);
				Class474.aClass343_Sub1Array5975 = new Class343_Sub1[1017276543 * Class24.anInt9950];
				int i_2_ = 0;
				for (int i_3_ = -1648308965 * SeqTypeList.anInt5190; i_3_ <= -499146007 * Class338.anInt3630; i_3_++) {
					Class343_Sub1 class343_sub1 = Class226.method2105(i_3_, (byte) 40);
					if (class343_sub1 != null) {
						Class474.aClass343_Sub1Array5975[i_2_++] = class343_sub1;
					}
				}
				Class474.aBoolean5974 = false;
				Class325.aLong3454 = TimeUtils.getTime((byte) 1) * -4824082235216898149L;
				aClass298_Sub53_3471 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nq.p(").append(')').toString());
		}
	}

	static final boolean method3980(char c, int i) {
		try {
			return c == '\u00a0' || c == ' ' || c == '_' || '-' == c;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nq.b(").append(')').toString());
		}
	}

	static TextureOperation method3981(Packet class298_sub53, int i) {
		try {
			class298_sub53.readUnsignedByte();
			int i_4_ = class298_sub53.readUnsignedByte();
			TextureOperation textureOperation = Class234.method2182(i_4_, (byte) 11);
			textureOperation.anInt7381 = class298_sub53.readUnsignedByte() * -2127296983;
			int i_5_ = class298_sub53.readUnsignedByte();
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				int i_7_ = class298_sub53.readUnsignedByte();
				textureOperation.method3137(i_7_, class298_sub53, (byte) 92);
			}
			textureOperation.method3133(-245700254);
			return textureOperation;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nq.u(").append(')').toString());
		}
	}

	static final void method3982(ClientScript2 class403, int i) {
		try {
			String string = "";
			if (Wall.aClipboard9941 != null) {
				Transferable transferable = Wall.aClipboard9941.getContents(null);
				if (transferable != null) {
					try {
						string = ((String) transferable.getTransferData(DataFlavor.stringFlavor));
						if (null == string) {
							string = "";
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
			class403.anObjectArray5240[((class403.anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nq.afl(").append(')').toString());
		}
	}

	static void method3983(int i) {
		try {
			ContextMenu.aClass298_Sub37_Sub15_5466 = (new Class298_Sub37_Sub15(LocalizedString.BUTTON_CANCEL.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210), "", -1808468501 * GameClient.anInt8937, 1006, -1, 0L, 0, 0, true, false, 0L, true));
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nq.k(").append(')').toString());
		}
	}

	static final void method3984(ClientScript2 class403, int i) {
		try {
			int i_8_ = ((GameClient.anIntArrayArrayArray8767[(class403.anIntArray5244[((class403.anInt5239 -= -391880689) * 681479919)])]).length >> 1);
			class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = i_8_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("nq.afz(").append(')').toString());
		}
	}
}
