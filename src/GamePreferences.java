
/* GamePreferences - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GamePreferences extends Node {
	public Class422_Sub12 aClass422_Sub12_7543;
	static int anInt7544 = 23;
	public static int anInt7545 = 245;
	public static int anInt7546 = 500;
	public Class422_Sub2 aClass422_Sub2_7547;
	public GroundDecorPreference aGroundDecorPreference_7548;
	public AntialiasPreference antialiasPreference;
	public AntialiasPreference aAntialiasPreference_7550;
	public BloomPreference bloomPreference;
	public Class422_Sub1 aClass422_Sub1_7552;
	public VolumePreference aVolumePreference_7553;
	public Class422_Sub24 aClass422_Sub24_7554;
	public FlickeringPreference flickeringPreference;
	public FogPreference fogPreference;
	public TexturePreference texturePreference;
	public MapSizePreference aMapSizePreference_7558;
	static int anInt7559 = 40;
	public LightingPreference lightingPreference;
	public CharacterShadowPreference characterShadowPreference;
	Class417 aClass417_7562;
	public ParticlePreference particlePreference;
	public Class422_Sub17 aClass422_Sub17_7564;
	public Class422_Sub17 aClass422_Sub17_7565;
	public ScreenSizePreference aScreenSizePreference_7566;
	public Class422_Sub19 aClass422_Sub19_7567;
	GameContext aGameContext_7568;
	public GraphicsAutoSetup aGraphicsAutoSetup_7569;
	public ToolkitPreference aToolkitPreference_7570;
	public ToolkitPreference graphicsPreference;
	public WaterDetailPreference waterDetailPreference;
	public GroundBlendingPreference groundBlendingPreference;
	public Class422_Sub12 aClass422_Sub12_7574;
	public CustomCursorPreference cursorPreference;
	public GraphicsPresetPreference aGraphicsPresetPreference_7576;
	public CPUUsagePreference aClass422_Sub26_7577;
	public CompressionType aCompressionType_7578;
	public SafemodePreference safemodePreference;
	public Class422_Sub21 aClass422_Sub21_7580;
	public SceneryShadowPreference sceneryShadowPreference;
	public VolumePreference aVolumePreference_7582;
	public VolumePreference aVolumePreference_7583;
	public VolumePreference aVolumePreference_7584;
	static int anInt7585 = 27;
	public Class422_Sub22 aClass422_Sub22_7586;
	public VolumePreference aVolumePreference_7587;

	void method3536(short i) {
		try {
			antialiasPreference.method5673((byte) 52);
			aAntialiasPreference_7550.method5673((byte) 99);
			bloomPreference.method5645(-537563818);
			aClass422_Sub1_7552.method5624((byte) 61);
			aMapSizePreference_7558.method5665((byte) -6);
			aClass422_Sub24_7554.method5712((byte) -33);
			flickeringPreference.method5656(1954264806);
			fogPreference.method5634((byte) -91);
			groundBlendingPreference.method5723(-921904225);
			aClass422_Sub2_7547.method5627(67108864);
			aGraphicsAutoSetup_7569.method5715((byte) -33);
			lightingPreference.method5683(-2119597982);
			sceneryShadowPreference.method5649(-801698141);
			aGroundDecorPreference_7548.method5659(-879410912);
			particlePreference.method5637(1352488412);
			aClass422_Sub17_7564.method5688(1996990972);
			aClass422_Sub17_7565.method5688(1853645608);
			aScreenSizePreference_7566.method5652((short) 769);
			aClass422_Sub19_7567.method5697((short) -142);
			characterShadowPreference.method5691(-1894585587);
			texturePreference.method5685(1466344729);
			aToolkitPreference_7570.method5678((byte) 28);
			graphicsPreference.method5678((byte) -80);
			waterDetailPreference.method5640(-500168009);
			aClass422_Sub12_7543.method5670(1079042483);
			aClass422_Sub12_7574.method5670(1079042483);
			cursorPreference.method5731(1430761433);
			aGraphicsPresetPreference_7576.method5708(-604043841);
			aClass422_Sub26_7577.method5718(316051104);
			aCompressionType_7578.method5699(-2131884322);
			safemodePreference.method5721((byte) -88);
			aClass422_Sub21_7580.method5702(1691541488);
			aVolumePreference_7553.method5727((byte) -23);
			aVolumePreference_7582.method5727((byte) -24);
			aVolumePreference_7583.method5727((byte) -13);
			aVolumePreference_7584.method5727((byte) -1);
			aVolumePreference_7587.method5727((byte) -15);
			aClass422_Sub22_7586.method5707((byte) 124);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "aco.d(" + ')');
		}
	}

	void method3537(boolean bool, int i) {
		try {
			if (bool || antialiasPreference == null) {
				antialiasPreference = new AntialiasPreference(this);
			}
			if (bool || aAntialiasPreference_7550 == null) {
				aAntialiasPreference_7550 = new AntialiasPreference(antialiasPreference.getValue(-2009967400), this);
			}
			if (bool || null == bloomPreference) {
				bloomPreference = new BloomPreference(this);
			}
			if (bool || null == aClass422_Sub1_7552) {
				aClass422_Sub1_7552 = new Class422_Sub1(this);
			}
			if (bool || null == aMapSizePreference_7558) {
				aMapSizePreference_7558 = new MapSizePreference(this);
			}
			if (bool || aClass422_Sub24_7554 == null) {
				aClass422_Sub24_7554 = new Class422_Sub24(this);
			}
			if (bool || null == flickeringPreference) {
				flickeringPreference = new FlickeringPreference(this);
			}
			if (bool || null == fogPreference) {
				fogPreference = new FogPreference(this);
			}
			if (bool || groundBlendingPreference == null) {
				groundBlendingPreference = new GroundBlendingPreference(this);
			}
			if (bool || aClass422_Sub2_7547 == null) {
				aClass422_Sub2_7547 = new Class422_Sub2(this);
			}
			if (bool || aGraphicsAutoSetup_7569 == null) {
				aGraphicsAutoSetup_7569 = new GraphicsAutoSetup(this);
			}
			if (bool || lightingPreference == null) {
				lightingPreference = new LightingPreference(this);
			}
			if (bool || sceneryShadowPreference == null) {
				sceneryShadowPreference = new SceneryShadowPreference(this);
			}
			if (bool || null == aGroundDecorPreference_7548) {
				aGroundDecorPreference_7548 = new GroundDecorPreference(this);
			}
			if (bool || null == particlePreference) {
				particlePreference = new ParticlePreference(this);
			}
			if (bool || aClass422_Sub17_7564 == null) {
				aClass422_Sub17_7564 = new Class422_Sub17(this);
			}
			if (bool || aClass422_Sub17_7565 == null) {
				aClass422_Sub17_7565 = new Class422_Sub17(aClass422_Sub17_7564.method5689(-2013953489), this);
			}
			if (bool || null == aScreenSizePreference_7566) {
				aScreenSizePreference_7566 = new ScreenSizePreference(this);
			}
			if (bool || aClass422_Sub19_7567 == null) {
				aClass422_Sub19_7567 = new Class422_Sub19(this);
			}
			if (bool || null == characterShadowPreference) {
				characterShadowPreference = new CharacterShadowPreference(this);
			}
			if (bool || null == texturePreference) {
				texturePreference = new TexturePreference(this);
			}
			if (bool || null == aToolkitPreference_7570) {
				aToolkitPreference_7570 = new ToolkitPreference(this);
			}
			if (bool || graphicsPreference == null) {
				graphicsPreference = new ToolkitPreference(aToolkitPreference_7570.getValue(-1476305765), this);
			}
			if (bool || waterDetailPreference == null) {
				waterDetailPreference = new WaterDetailPreference(this);
			}
			if (bool || aClass422_Sub12_7543 == null) {
				aClass422_Sub12_7543 = new Class422_Sub12(this);
			}
			if (bool || aClass422_Sub12_7574 == null) {
				aClass422_Sub12_7574 = new Class422_Sub12(aClass422_Sub12_7543.method5669((byte) 55), this);
			}
			if (bool || null == cursorPreference) {
				cursorPreference = new CustomCursorPreference(this);
			}
			if (bool || null == aGraphicsPresetPreference_7576) {
				aGraphicsPresetPreference_7576 = new GraphicsPresetPreference(this);
			}
			if (bool || aClass422_Sub26_7577 == null) {
				aClass422_Sub26_7577 = new CPUUsagePreference(this);
			}
			if (bool || null == aCompressionType_7578) {
				aCompressionType_7578 = new CompressionType(this);
			}
			if (bool || null == safemodePreference) {
				safemodePreference = new SafemodePreference(this);
			}
			if (bool || aClass422_Sub21_7580 == null) {
				aClass422_Sub21_7580 = new Class422_Sub21(this);
			}
			if (bool || aVolumePreference_7553 == null) {
				aVolumePreference_7553 = new VolumePreference(this);
			}
			if (bool || null == aVolumePreference_7582) {
				aVolumePreference_7582 = new VolumePreference(this);
			}
			if (bool || null == aVolumePreference_7583) {
				aVolumePreference_7583 = new VolumePreference(this);
			}
			if (bool || null == aVolumePreference_7584) {
				aVolumePreference_7584 = new VolumePreference(this);
			}
			if (bool || null == aVolumePreference_7587) {
				aVolumePreference_7587 = new VolumePreference(this);
			}
			if (bool || aClass422_Sub22_7586 == null) {
				aClass422_Sub22_7586 = new Class422_Sub22(this);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "aco.f(" + ')');
		}
	}

	void loadPreference(Packet packet, int size, int i_0_) {
		try {
			aClass422_Sub1_7552 = new Class422_Sub1(packet.readUnsignedByte(), this);
			packet.pos += 116413311;
			aClass422_Sub17_7564 = new Class422_Sub17(packet.readUnsignedByte() + 1, this);
			aClass422_Sub2_7547 = new Class422_Sub2(packet.readUnsignedByte(), this);
			packet.pos += 116413311;
			aGraphicsAutoSetup_7569 = new GraphicsAutoSetup(packet.readUnsignedByte(), this);
			flickeringPreference = new FlickeringPreference(packet.readUnsignedByte(), this);
			packet.readUnsignedByte();
			characterShadowPreference = new CharacterShadowPreference(packet.readUnsignedByte(), this);
			int pref = packet.readUnsignedByte();
			int none = 0;
			if (size >= 17) {
				none = packet.readUnsignedByte();
			}
			sceneryShadowPreference = new SceneryShadowPreference(pref > none ? pref : none, this);
			boolean general = true;
			boolean scenery = true;
			if (size >= 2) {
				general = packet.readUnsignedByte() == 1;
				if (size >= 17) {
					scenery = packet.readUnsignedByte() == 1;
				}
			} else {
				general = packet.readUnsignedByte() == 1;
				packet.readUnsignedByte();
			}
			lightingPreference = new LightingPreference(general | scenery ? 1 : 0, this);
			waterDetailPreference = new WaterDetailPreference(packet.readUnsignedByte(), this);
			fogPreference = new FogPreference(packet.readUnsignedByte(), this);
			antialiasPreference = new AntialiasPreference(packet.readUnsignedByte(), this);
			aClass422_Sub22_7586 = new Class422_Sub22(packet.readUnsignedByte(), this);
			aVolumePreference_7553 = new VolumePreference(packet.readUnsignedByte(), this);
			if (size >= 20) {
				aVolumePreference_7583 = new VolumePreference(packet.readUnsignedByte(), this);
			} else {
				aVolumePreference_7583 = new VolumePreference(aVolumePreference_7553.method5726(-2142505283), this);
			}
			aVolumePreference_7584 = new VolumePreference(packet.readUnsignedByte(), this);
			aVolumePreference_7582 = new VolumePreference(packet.readUnsignedByte(), this);
			if (size >= 21) {
				aVolumePreference_7587 = new VolumePreference(packet.readUnsignedByte(), this);
			} else {
				aVolumePreference_7587 = new VolumePreference(aVolumePreference_7584.method5726(-2141789529), this);
			}
			if (size >= 1) {
				packet.readUnsignedShort();
				packet.readUnsignedShort();
			}
			if (size >= 3 && size < 6) {
				packet.readUnsignedByte();
			}
			if (size >= 4) {
				particlePreference = new ParticlePreference(packet.readUnsignedByte(), this);
			}
			packet.readUnsignedInt();
			if (size >= 6) {
				aClass422_Sub12_7543 = new Class422_Sub12(packet.readUnsignedByte(), this);
			}
			if (size >= 7) {
				safemodePreference = new SafemodePreference(packet.readUnsignedByte(), this);
			}
			if (size >= 8) {
				packet.readUnsignedByte();
			}
			if (size >= 9) {
				aMapSizePreference_7558 = new MapSizePreference(packet.readUnsignedByte(), this);
			}
			if (size >= 10) {
				bloomPreference = new BloomPreference(packet.readUnsignedByte(), this);
			}
			if (size >= 11) {
				cursorPreference = new CustomCursorPreference(packet.readUnsignedByte(), this);
			}
			if (size >= 12) {
				aGraphicsAutoSetup_7569 = new GraphicsAutoSetup(packet.readUnsignedByte(), this);
			}
			if (size >= 13) {
				groundBlendingPreference = new GroundBlendingPreference(packet.readUnsignedByte(), this);
			}
			if (size >= 14) {
				aToolkitPreference_7570 = new ToolkitPreference(packet.readUnsignedByte(), this);
			}
			if (size >= 15) {
				aClass422_Sub26_7577 = new CPUUsagePreference(packet.readUnsignedByte(), this);
			}
			if (size >= 16) {
				texturePreference = new TexturePreference(packet.readUnsignedByte(), this);
			}
			if (size >= 18) {
				aGraphicsPresetPreference_7576 = new GraphicsPresetPreference(packet.readUnsignedByte(), this);
			}
			if (size >= 19) {
				aScreenSizePreference_7566 = new ScreenSizePreference(packet.readUnsignedByte(), this);
			}
			if (size >= 22) {
				aCompressionType_7578 = new CompressionType(packet.readUnsignedByte(), this);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "aco.b(" + ')');
		}
	}

	public void method3539(ToolkitPreference toolkitPreference, boolean bool, int i) {
		try {
			toolkitPreference.method5680(bool, 987947106);
			method3536((short) -12304);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aco.k(").append(')').toString());
		}
	}

	public void method3540(IntegerPreferenceField integerPreferenceField, int i, int i_4_) {
		try {
			integerPreferenceField.method5613(i, -1130882310);
			method3536((short) -7745);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aco.i(").append(')').toString());
		}
	}

	public GameContext method3541(byte i) {
		try {
			return aGameContext_7568;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aco.u(").append(')').toString());
		}
	}

	public Packet createBuffer() {
		Packet buffer = new Packet(40);
		buffer.writeByte(27);
		buffer.writeByte(antialiasPreference.getValue(-263957055));
		buffer.writeByte(bloomPreference.method5647(-1699421232));
		buffer.writeByte(aClass422_Sub1_7552.method5625(434246407));
		buffer.writeByte(aMapSizePreference_7558.method5667(-369768513));
		buffer.writeByte(aClass422_Sub24_7554.method5713((byte) 23));
		buffer.writeByte(flickeringPreference.method5655(1995968381));
		buffer.writeByte(fogPreference.method5633(-521957289));
		buffer.writeByte(groundBlendingPreference.method5724(1089456139));
		buffer.writeByte(aClass422_Sub2_7547.method5629(-952901154));
		buffer.writeByte(aGraphicsAutoSetup_7569.method5716((byte) -44));
		buffer.writeByte(lightingPreference.getValue(-1895382088));
		buffer.writeByte(sceneryShadowPreference.getValue(79813518));
		buffer.writeByte(aGroundDecorPreference_7548.method5661((byte) 124));
		buffer.writeByte(particlePreference.method5636(-487880226));
		buffer.writeByte(aClass422_Sub17_7564.method5689(-2013953489));
		buffer.writeByte(aScreenSizePreference_7566.method5654(-1747444886));
		buffer.writeByte(aClass422_Sub19_7567.getValue(-1741518508));
		buffer.writeByte(characterShadowPreference.method5693(-1354329238));
		buffer.writeByte(texturePreference.getValue(1872936450));
		buffer.writeByte(aToolkitPreference_7570.getValue(-605734712));
		buffer.writeByte(0);
		buffer.writeByte(waterDetailPreference.getValue(-1219854302));
		buffer.writeByte(aClass422_Sub12_7543.method5669((byte) 99));
		buffer.writeByte(cursorPreference.method5730(2045848485));
		buffer.writeByte(aGraphicsPresetPreference_7576.method5709(594825158));
		buffer.writeByte(aClass422_Sub26_7577.method5717((byte) 1));
		buffer.writeByte(aCompressionType_7578.method5700(-227415438));
		buffer.writeByte(safemodePreference.getValue((byte) -45));
		buffer.writeByte(aClass422_Sub21_7580.getValue((byte) -47));
		buffer.writeByte(aVolumePreference_7553.method5726(-2146682284));
		buffer.writeByte(aVolumePreference_7582.method5726(-2142574071));
		buffer.writeByte(aVolumePreference_7583.method5726(-2142179744));
		buffer.writeByte(aVolumePreference_7584.method5726(-2145558245));
		buffer.writeByte(aVolumePreference_7587.method5726(-2147404124));
		buffer.writeByte(aClass422_Sub22_7586.method5706((byte) 98));
		return buffer;
	}

	public Class417 method3543(int i) {
		try {
			return aClass417_7562;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("aco.x(").append(')').toString());
		}
	}

	void method3544(Packet packet, int i) {
		if (packet == null || null == packet.payload) {
			method3537(true, -273116061);
		} else {
			int version = packet.readUnsignedByte();
			if (version < 23) {
				try {
					loadPreference(packet, version, 1254790663);
				} catch (Exception exception) {
					method3537(true, 971392217);
				}
				method3537(false, 964241731);
			} else if (version > 27) {
				method3537(true, -1917001762);
			} else {
				antialiasPreference = new AntialiasPreference(packet.readUnsignedByte(), this);
				aAntialiasPreference_7550 = new AntialiasPreference(antialiasPreference.getValue(-1467162774), this);
				bloomPreference = new BloomPreference(packet.readUnsignedByte(), this);
				aClass422_Sub1_7552 = new Class422_Sub1(packet.readUnsignedByte(), this);
				aMapSizePreference_7558 = new MapSizePreference(packet.readUnsignedByte(), this);
				if (version >= 27) {
					aClass422_Sub24_7554 = new Class422_Sub24(packet.readUnsignedByte(), this);
				}
				flickeringPreference = new FlickeringPreference(packet.readUnsignedByte(), this);
				fogPreference = new FogPreference(packet.readUnsignedByte(), this);
				groundBlendingPreference = new GroundBlendingPreference(packet.readUnsignedByte(), this);
				aClass422_Sub2_7547 = new Class422_Sub2(packet.readUnsignedByte(), this);
				aGraphicsAutoSetup_7569 = new GraphicsAutoSetup(packet.readUnsignedByte(), this);
				lightingPreference = new LightingPreference(packet.readUnsignedByte(), this);
				sceneryShadowPreference = new SceneryShadowPreference(packet.readUnsignedByte(), this);
				if (version >= 24) {
					aGroundDecorPreference_7548 = new GroundDecorPreference(packet.readUnsignedByte(), this);
				}
				particlePreference = new ParticlePreference(packet.readUnsignedByte(), this);
				aClass422_Sub17_7564 = new Class422_Sub17(packet.readUnsignedByte(), this);
				aClass422_Sub17_7565 = new Class422_Sub17(aClass422_Sub17_7564.method5689(-2013953489), this);
				aScreenSizePreference_7566 = new ScreenSizePreference(packet.readUnsignedByte(), this);
				if (version >= 25) {
					aClass422_Sub19_7567 = new Class422_Sub19(packet.readUnsignedByte(), this);
				}
				characterShadowPreference = new CharacterShadowPreference(packet.readUnsignedByte(), this);
				if (version <= 25) {
					packet.pos += 116413311;
				}
				texturePreference = new TexturePreference(packet.readUnsignedByte(), this);
				aToolkitPreference_7570 = new ToolkitPreference(packet.readUnsignedByte(), this);
				graphicsPreference = new ToolkitPreference(aToolkitPreference_7570.getValue(-1765693260), this);
				packet.readUnsignedByte();
				waterDetailPreference = new WaterDetailPreference(packet.readUnsignedByte(), this);
				aClass422_Sub12_7543 = new Class422_Sub12(packet.readUnsignedByte(), this);
				aClass422_Sub12_7574 = new Class422_Sub12(aClass422_Sub12_7543.method5669((byte) 124), this);
				cursorPreference = new CustomCursorPreference(packet.readUnsignedByte(), this);
				aGraphicsPresetPreference_7576 = new GraphicsPresetPreference(packet.readUnsignedByte(), this);
				aClass422_Sub26_7577 = new CPUUsagePreference(packet.readUnsignedByte(), this);
				aCompressionType_7578 = new CompressionType(packet.readUnsignedByte(), this);
				safemodePreference = new SafemodePreference(packet.readUnsignedByte(), this);
				if (version >= 26) {
					aClass422_Sub21_7580 = new Class422_Sub21(packet.readUnsignedByte(), this);
				}
				aVolumePreference_7553 = new VolumePreference(packet.readUnsignedByte(), this);
				aVolumePreference_7582 = new VolumePreference(packet.readUnsignedByte(), this);
				aVolumePreference_7583 = new VolumePreference(packet.readUnsignedByte(), this);
				aVolumePreference_7584 = new VolumePreference(packet.readUnsignedByte(), this);
				aVolumePreference_7587 = new VolumePreference(packet.readUnsignedByte(), this);
				aClass422_Sub22_7586 = new Class422_Sub22(packet.readUnsignedByte(), this);
				method3537(false, 95343379);
			}
		}
		method3536((short) -25361);
	}

	public GamePreferences(GameContext gameContext, int i) {
		aGameContext_7568 = gameContext;
		aClass417_7562 = new Class417(GameShell.maximumMemory * 1126040225, GameShell.availableCPU * 1090452523, Class344.aString3687.toLowerCase().indexOf("arm") != -1);
		graphicsPreference = new ToolkitPreference(i, this);
		method3537(true, -214971626);
	}

	public GamePreferences(Packet class298_sub53, GameContext gameContext, int i) {
		aGameContext_7568 = gameContext;
		aClass417_7562 = new Class417(GameShell.maximumMemory * 1126040225, 1090452523 * GameShell.availableCPU, Class344.aString3687.indexOf("arm") != -1);
		graphicsPreference = new ToolkitPreference(i, this);
		method3544(class298_sub53, -2103020083);
	}
}
