/* Class510 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class510 {
	public int anInt6218;
	public int anInt6219;
	public int anInt6220;
	static ClientBuild aClientBuild_6221;
	public static boolean aBoolean6222;

	Class510(int i, int i_0_, int i_1_) {
		anInt6220 = -1047476297 * i;
		anInt6218 = i_0_ * 463745529;
		anInt6219 = i_1_ * 50067731;
	}

	public static int[] method6287(int i) {
		try {
			return new int[] { 399302739 * Class74.anInt691, Class74.anInt690 * 1178461027, Class74.anInt698 * -1372765471 };
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("vc.b(").append(')').toString());
		}
	}

	static final void method6288(ClientScript2 class403, int i) {
		try {
			class403.anInt5241 -= 969361751;
			class403.anInt5239 -= -1175642067;
			String string = (String) class403.anObjectArray5240[-203050393 * class403.anInt5241];
			boolean bool = class403.anIntArray5244[681479919 * class403.anInt5239] == 1;
			boolean bool_2_ = 1 == class403.anIntArray5244[1 + 681479919 * class403.anInt5239];
			boolean bool_3_ = class403.anIntArray5244[class403.anInt5239 * 681479919 + 2] == 1;
			Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2093, GameClient.aClass25_8693.aClass449_330, (byte) 102);
			class298_sub36.buffer.writeShort(Class58.method693(string, 1218902925) + 1, 16711935);
			class298_sub36.buffer.writeString(string, 2143999999);
			int i_4_ = 0;
			if (bool) {
				i_4_ |= 0x1;
			}
			if (bool_2_) {
				i_4_ |= 0x2;
			}
			if (bool_3_) {
				i_4_ |= 0x4;
			}
			class298_sub36.buffer.writeByte(i_4_);
			GameClient.aClass25_8693.writeOutboundPacket(class298_sub36, (byte) -104);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("vc.ve(").append(')').toString());
		}
	}

	public static void method6289(int i) {
		try {
			for (Class298_Sub49 class298_sub49 = (Class298_Sub49) Class423.aClass437_5354.method5816(1729958795); class298_sub49 != null; class298_sub49 = (Class298_Sub49) Class423.aClass437_5354.method5815((byte) -77)) {
				if (class298_sub49.aClass308_Sub1_7591.method3773(-263786809)) {
					Class285.method2710(1566028323 * class298_sub49.anInt7589, (byte) 5);
				} else {
					class298_sub49.aClass308_Sub1_7591.method3785((byte) 40);
					try {
						class298_sub49.aClass308_Sub1_7591.method3780((byte) -21);
					} catch (Exception exception) {
						IPAddress.method6062(new StringBuilder().append("").append(1566028323 * class298_sub49.anInt7589).toString(), exception, (short) -20610);
						Class285.method2710(1566028323 * class298_sub49.anInt7589, (byte) 85);
					}
					if (!class298_sub49.aBoolean7593 && !class298_sub49.aBoolean7592) {
						Class298_Sub24_Sub1 class298_sub24_sub1 = class298_sub49.aClass308_Sub1_7591.method3763(2034757591);
						if (class298_sub24_sub1 != null) {
							Class298_Sub19_Sub3 class298_sub19_sub3 = class298_sub24_sub1.method3082(-411389991);
							if (null != class298_sub19_sub3) {
								class298_sub19_sub3.method3030(1064671451 * class298_sub49.anInt7590, (byte) 0);
								Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub3);
								class298_sub49.aBoolean7593 = true;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("vc.d(").append(')').toString());
		}
	}

	public static IncomingPacket[] method6290(int i) {
		try {
			return new IncomingPacket[] { IncomingPacket.aClass202_2227, IncomingPacket.RECEIVE_QUICK_PRIVATE_MESSAGE, IncomingPacket.FRIENDS_PACKET, IncomingPacket.unknown, IncomingPacket.aClass202_2154, IncomingPacket.CLOSE_INTERFACE_PACKET, IncomingPacket.PLAYER_UNDER_NPC_PRIORITY_PACKET, IncomingPacket.aClass202_2157, IncomingPacket.aClass202_2158, IncomingPacket.MUSIC_EFFECT_PACKET, IncomingPacket.SET_MOUSE_PACKET, IncomingPacket.WORLD_LIST_PACKET, IncomingPacket.aClass202_2162, IncomingPacket.aClass202_2163, IncomingPacket.INTERFACE_PACKET, IncomingPacket.aClass202_2195, IncomingPacket.aClass202_2166, IncomingPacket.OPEN_URL_PACKET, IncomingPacket.aClass202_2168, IncomingPacket.aClass202_2186, IncomingPacket.PROJECTILE_PACKET, IncomingPacket.aClass202_2151, IncomingPacket.aClass202_2172, IncomingPacket.PLAYER_ON_ICOMPONENT_PACKET, IncomingPacket.aClass202_2174, IncomingPacket.RUN_ENERGY_PACKET, IncomingPacket.aClass202_2176, IncomingPacket.aClass202_2177, IncomingPacket.aClass202_2284, IncomingPacket.aClass202_2179, IncomingPacket.SEND_FRIEND_QUICK_CHAT_MESSAGE_PACKET, IncomingPacket.MODEL_ON_ICOMPONENT_PACKET, IncomingPacket.RECEIVE_FRIEND_CHAT_QUICK_MESSAGE_PACKET, IncomingPacket.RECEIVE_PERSONAL_MESSAGE_PACKET, IncomingPacket.GLOBAL_STRING_PACKET_2, IncomingPacket.aClass202_2185, IncomingPacket.aClass202_2160, IncomingPacket.aClass202_2259, IncomingPacket.aClass202_2188, IncomingPacket.GAME_PANE_PACKET, IncomingPacket.ICOMPONENT_SETTINGS_PACKET, IncomingPacket.aClass202_2191, IncomingPacket.LOAD_MAP_SCENE_PACKET, IncomingPacket.aClass202_2193, IncomingPacket.SHAKE_CAMERA_PACKET, IncomingPacket.DESTROY_OBJECT_PACKET, IncomingPacket.aClass202_2209, IncomingPacket.aClass202_2184, IncomingPacket.aClass202_2198, IncomingPacket.aClass202_2199, IncomingPacket.aClass202_2212, IncomingPacket.aClass202_2201, IncomingPacket.aClass202_2194, IncomingPacket.aClass202_2203, IncomingPacket.aClass202_2238, IncomingPacket.IGNORES_PACKET, IncomingPacket.CONFIG2_PACKET, IncomingPacket.OPEN_INTERFACE_NPC, IncomingPacket.aClass202_2208, IncomingPacket.LOBBY_LOGOUT_PACKET, IncomingPacket.LOGOUT_PACKET, IncomingPacket.CLIENT_CONSOLE_COMMAND_PACKET, IncomingPacket.aClass202_2261, IncomingPacket.GLOBAL_CONFIG2_PACKET, IncomingPacket.LARGE_NPC_UPDATE_PACKET, IncomingPacket.aClass202_2215, IncomingPacket.aClass202_2204, IncomingPacket.aClass202_2217, IncomingPacket.aClass202_2218, IncomingPacket.BLACK_OUT_PACKET, IncomingPacket.SOUND_INDEX15, IncomingPacket.aClass202_2221, IncomingPacket.NPC_UPDATE_PACKET, IncomingPacket.aClass202_2223, IncomingPacket.SET_CAMERA_POS_PACKET, IncomingPacket.PRIVATE_GAME_BAR_STAGE_PACKET, IncomingPacket.OBJECT_ANIMATION_PACKET, IncomingPacket.ITEMS_PACKET, IncomingPacket.aClass202_2228, IncomingPacket.HINT_ICON_PACKET, IncomingPacket.aClass202_2230, IncomingPacket.CONFIG_BY_FILE2_PACKET, IncomingPacket.aClass202_2248, IncomingPacket.aClass202_2247, IncomingPacket.aClass202_2270, IncomingPacket.aClass202_2245, IncomingPacket.aClass202_2290, IncomingPacket.aClass202_2237, IncomingPacket.aClass202_2236, IncomingPacket.aClass202_2239, IncomingPacket.GRAPHICS_PACKET, IncomingPacket.aClass202_2178, IncomingPacket.aClass202_2242, IncomingPacket.aClass202_2293, IncomingPacket.aClass202_2231, IncomingPacket.RESET_CAMERA_PACKET, IncomingPacket.PLAYER_UPDATE_PACKET, IncomingPacket.aClass202_2234, IncomingPacket.aClass202_2309, IncomingPacket.aClass202_2249, IncomingPacket.aClass202_2267, IncomingPacket.aClass202_2251, IncomingPacket.ICOMPONENT_MODEL_PACKET, IncomingPacket.aClass202_2253, IncomingPacket.RECEIVE_PRIVATE_QUICK_CHAT_MESSAGE_PACKET, IncomingPacket.RECEIVE_PRIVATE_MESSAGE_PACKET, IncomingPacket.PUBLIC_MESSAGE_PACKET, IncomingPacket.TILE_MESSAGE_PACKET, IncomingPacket.REMOVE_GROUND_ITEM_PACKET, IncomingPacket.aClass202_2250, IncomingPacket.CONFIG1_PACKET, IncomingPacket.CONFIG_BY_FILE1_PACKET, IncomingPacket.HIDE_ICOMPONENT_PACKET, IncomingPacket.OPEN_INTERFACE_PLAYER, IncomingPacket.aClass202_2182, IncomingPacket.aClass202_2265, IncomingPacket.SET_CAMERA_LOOK_PACKET, IncomingPacket.FRIENDS_CHAT_CHANNEL_PACKET, IncomingPacket.PLAYER_OPTION_PACKET, IncomingPacket.RUN_SCRIPT_PACKET, IncomingPacket.SPAWN_OBJECT_PACKET, IncomingPacket.aClass202_2271, IncomingPacket.aClass202_2272, IncomingPacket.CAMERA_ROTATION_PACKET, IncomingPacket.aClass202_2274, IncomingPacket.SEND_GROUND_ITEM_PACKET, IncomingPacket.aClass202_2276, IncomingPacket.aClass202_2277, IncomingPacket.IGNORE_PACKET, IncomingPacket.MUSIC_PACKET, IncomingPacket.SEND_PRIVATE_MESSAGE_PACKET, IncomingPacket.STOP_CAMERA_SHAKE_PACKET, IncomingPacket.SECURITY_PACKET, IncomingPacket.aClass202_2283, IncomingPacket.GLOBAL_STRING_PACKET, IncomingPacket.ICOMPONENT_TEXT_PACKET, IncomingPacket.MESSAGE_PACKET, IncomingPacket.aClass202_2287, IncomingPacket.ITEMS_UPDATE_PACKET, IncomingPacket.RECEIVE_FRIEND_CHAT_MESSAGE_PACKET, IncomingPacket.aClass202_2232, IncomingPacket.SYSTEM_UPDATE_PACKET, IncomingPacket.CUTSCENE_PACKET, IncomingPacket.OPEN_INTERFACE_OBJECT, IncomingPacket.LOAD_MAP_SCENE_DYNAMIC_PACKET, IncomingPacket.RESET_SOUNDS_PACKET, IncomingPacket.SKILL_LEVEL_PACKET, IncomingPacket.aClass202_2297, IncomingPacket.aClass202_2298, IncomingPacket.aClass202_2299, IncomingPacket.aClass202_2255, IncomingPacket.aClass202_2220, IncomingPacket.ITEM_ON_ICOMPONENT_PACKET, IncomingPacket.KEEP_ALIVE_PACKET, IncomingPacket.GLOBAL_CONFIG1_PACKET, IncomingPacket.aClass202_2305, IncomingPacket.aClass202_2306, IncomingPacket.aClass202_2307, IncomingPacket.WORLD_TILE_PACKET, IncomingPacket.SWITCH_ITEMS_LOOK_PACKET,
					IncomingPacket.SHOW_FULL_NPC,
					IncomingPacket.SPIN_MYSTERY_BOX,
					IncomingPacket.SET_ZOOM_DIS,
					IncomingPacket.RICH_PRESENCE,
					};
			/*
			 * aClass202_2305 = new IncomingPacket(155, 8);
		aClass202_2306 = new IncomingPacket(156, 3);
		aClass202_2307 = new IncomingPacket(157, 5);
		WORLD_TILE_PACKET = new IncomingPacket(158, 3);
		SHOW_FULL_NPC = new IncomingPacket(160, -2);
		SPIN_MYSTERY_BOX = new IncomingPacket(161, -2);
		SET_ZOOM_DIS = new IncomingPacket(162, -2);
		SWITCH_ITEMS_LOOK_PACKET = new IncomingPacket(159, 1);
		NPC_ON_ICOMPONENT_PACKET = new IncomingPacket(31, 8);
		RICH_PRESENCE = new IncomingPacket(163,-1);
			 */
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("vc.a(").append(')').toString());
		}
	}
}
