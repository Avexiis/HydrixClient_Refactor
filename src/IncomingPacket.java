/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class IncomingPacket {
	public static IncomingPacket SET_CAMERA_LOOK_PACKET;
	public static IncomingPacket aClass202_2151;
	public static IncomingPacket FRIENDS_PACKET;
	public static IncomingPacket unknown;
	public static IncomingPacket aClass202_2154;
	public static IncomingPacket CLOSE_INTERFACE_PACKET;
	public static IncomingPacket PLAYER_UNDER_NPC_PRIORITY_PACKET;
	public static IncomingPacket aClass202_2157;
	public static IncomingPacket aClass202_2158;
	public static IncomingPacket MUSIC_EFFECT_PACKET;
	public static IncomingPacket aClass202_2160;
    public static IncomingPacket SHOW_FULL_NPC;
    public static IncomingPacket SPIN_MYSTERY_BOX;
    public static IncomingPacket SET_ZOOM_DIS;
	public static IncomingPacket WORLD_LIST_PACKET;
	public static IncomingPacket aClass202_2162;
	public static IncomingPacket aClass202_2163;
	public static IncomingPacket INTERFACE_PACKET;
	public int value;
	public static IncomingPacket aClass202_2166;
	public static IncomingPacket OPEN_URL_PACKET;
	public static IncomingPacket aClass202_2168;
	public static IncomingPacket ICOMPONENT_TEXT_PACKET;
	public static IncomingPacket PROJECTILE_PACKET;
	public static IncomingPacket SHAKE_CAMERA_PACKET;
	public static IncomingPacket aClass202_2172;
	public static IncomingPacket PLAYER_ON_ICOMPONENT_PACKET;
	public static IncomingPacket aClass202_2174;
	public static IncomingPacket RUN_ENERGY_PACKET;
	public static IncomingPacket aClass202_2176;
	public static IncomingPacket aClass202_2177;
	public static IncomingPacket aClass202_2178;
	public static IncomingPacket aClass202_2179;
	public static IncomingPacket SEND_FRIEND_QUICK_CHAT_MESSAGE_PACKET;
	public static IncomingPacket MODEL_ON_ICOMPONENT_PACKET;
	public static IncomingPacket aClass202_2182;
	public static IncomingPacket RECEIVE_PERSONAL_MESSAGE_PACKET;
	public static IncomingPacket aClass202_2184;
	public static IncomingPacket aClass202_2185;
	public static IncomingPacket aClass202_2186;
	public int packetId;
	public static IncomingPacket aClass202_2188;
	public static IncomingPacket GAME_PANE_PACKET;
	public static IncomingPacket ICOMPONENT_SETTINGS_PACKET;
	public static IncomingPacket aClass202_2191;
	public static IncomingPacket LOAD_MAP_SCENE_PACKET;
	public static IncomingPacket aClass202_2193;
	public static IncomingPacket aClass202_2194;
	public static IncomingPacket aClass202_2195;
	public static IncomingPacket RESET_CAMERA_PACKET;
	public static IncomingPacket WORLD_TILE_PACKET;
	public static IncomingPacket SWITCH_ITEMS_LOOK_PACKET;
	public static IncomingPacket aClass202_2198;
	public static IncomingPacket aClass202_2199;
	public static IncomingPacket NPC_UPDATE_PACKET;
	public static IncomingPacket aClass202_2201;
	public static IncomingPacket SPAWN_OBJECT_PACKET;
	public static IncomingPacket aClass202_2203;
	public static IncomingPacket aClass202_2204;
	public static IncomingPacket SET_MOUSE_PACKET;
	public static IncomingPacket CONFIG2_PACKET;
	public static IncomingPacket OPEN_INTERFACE_NPC;
	public static IncomingPacket aClass202_2208;
	public static IncomingPacket aClass202_2209;
	public static IncomingPacket GLOBAL_STRING_PACKET_2;
	public static IncomingPacket IGNORES_PACKET;
	public static IncomingPacket aClass202_2212;
	public static IncomingPacket GLOBAL_CONFIG2_PACKET;
	public static IncomingPacket LARGE_NPC_UPDATE_PACKET;
	public static IncomingPacket aClass202_2215;
	public static IncomingPacket ITEMS_PACKET;
	public static IncomingPacket aClass202_2217;
	public static IncomingPacket aClass202_2218;
	public static IncomingPacket RECEIVE_FRIEND_CHAT_QUICK_MESSAGE_PACKET;
	public static IncomingPacket aClass202_2220;
	public static IncomingPacket aClass202_2221;
	public static IncomingPacket GLOBAL_STRING_PACKET;
	public static IncomingPacket aClass202_2223;
	public static IncomingPacket SET_CAMERA_POS_PACKET;
	public static IncomingPacket PRIVATE_GAME_BAR_STAGE_PACKET;
	public static IncomingPacket OBJECT_ANIMATION_PACKET;
	public static IncomingPacket aClass202_2227 = new IncomingPacket(0, -1);
	public static IncomingPacket aClass202_2228;
	public static IncomingPacket SOUND_INDEX15;
	public static IncomingPacket aClass202_2230;
	public static IncomingPacket aClass202_2231;
	public static IncomingPacket aClass202_2232;
	public static IncomingPacket CUTSCENE_PACKET;
	public static IncomingPacket aClass202_2234;
	public static IncomingPacket CONFIG_BY_FILE2_PACKET;
	public static IncomingPacket aClass202_2236;
	public static IncomingPacket aClass202_2237;
	public static IncomingPacket aClass202_2238;
	public static IncomingPacket aClass202_2239;
	public static IncomingPacket GRAPHICS_PACKET;
	public static IncomingPacket CAMERA_ROTATION_PACKET;
	public static IncomingPacket aClass202_2242;
	public static IncomingPacket LOBBY_LOGOUT_PACKET;
	public static IncomingPacket FRIENDS_CHAT_CHANNEL_PACKET;
	public static IncomingPacket aClass202_2245;
	public static IncomingPacket PLAYER_UPDATE_PACKET;
	public static IncomingPacket aClass202_2247;
	public static IncomingPacket aClass202_2248;
	public static IncomingPacket aClass202_2249;
	public static IncomingPacket aClass202_2250;
	public static IncomingPacket aClass202_2251;
	public static IncomingPacket SEND_PRIVATE_MESSAGE_PACKET;
	public static IncomingPacket aClass202_2253;
	public static IncomingPacket RECEIVE_PRIVATE_QUICK_CHAT_MESSAGE_PACKET;
	public static IncomingPacket aClass202_2255;
	public static IncomingPacket PUBLIC_MESSAGE_PACKET;
	public static IncomingPacket TILE_MESSAGE_PACKET;
	public static IncomingPacket REMOVE_GROUND_ITEM_PACKET;
	public static IncomingPacket aClass202_2259;
	public static IncomingPacket CONFIG1_PACKET;
	public static IncomingPacket aClass202_2261;
	public static IncomingPacket HIDE_ICOMPONENT_PACKET;
	public static IncomingPacket OPEN_INTERFACE_PLAYER;
	public static IncomingPacket ICOMPONENT_MODEL_PACKET;
	public static IncomingPacket aClass202_2265;
	public static IncomingPacket RECEIVE_QUICK_PRIVATE_MESSAGE = new IncomingPacket(1, -1);
	public static IncomingPacket aClass202_2267;
	public static IncomingPacket PLAYER_OPTION_PACKET;
	public static IncomingPacket RUN_SCRIPT_PACKET;
	public static IncomingPacket aClass202_2270;
	public static IncomingPacket aClass202_2271;
	public static IncomingPacket aClass202_2272;
	public static IncomingPacket OPEN_INTERFACE_OBJECT;
	public static IncomingPacket aClass202_2274;
	public static IncomingPacket SEND_GROUND_ITEM_PACKET;
	public static IncomingPacket aClass202_2276;
	public static IncomingPacket aClass202_2277;
	public static IncomingPacket IGNORE_PACKET;
	public static IncomingPacket MUSIC_PACKET;
	public static IncomingPacket DESTROY_OBJECT_PACKET;
	public static IncomingPacket STOP_CAMERA_SHAKE_PACKET;
	public static IncomingPacket SECURITY_PACKET;
	public static IncomingPacket aClass202_2283;
	public static IncomingPacket aClass202_2284;
	public static IncomingPacket BLACK_OUT_PACKET;
	public static IncomingPacket MESSAGE_PACKET;
	public static IncomingPacket aClass202_2287;
	public static IncomingPacket ITEMS_UPDATE_PACKET;
	public static IncomingPacket RECEIVE_FRIEND_CHAT_MESSAGE_PACKET;
	public static IncomingPacket aClass202_2290;
	public static IncomingPacket SYSTEM_UPDATE_PACKET;
	public static IncomingPacket RECEIVE_PRIVATE_MESSAGE_PACKET;
	public static IncomingPacket aClass202_2293;
	public static IncomingPacket LOAD_MAP_SCENE_DYNAMIC_PACKET;
	public static IncomingPacket RESET_SOUNDS_PACKET;
	public static IncomingPacket SKILL_LEVEL_PACKET;
	public static IncomingPacket aClass202_2297;
	public static IncomingPacket aClass202_2298;
	public static IncomingPacket aClass202_2299;
	public static IncomingPacket HINT_ICON_PACKET;
	public static IncomingPacket CLIENT_CONSOLE_COMMAND_PACKET;
	public static IncomingPacket ITEM_ON_ICOMPONENT_PACKET;
	public static IncomingPacket NPC_ON_ICOMPONENT_PACKET;

	/**
	 * The keep alive packet, also used as ping packet.
	 */
	public static IncomingPacket KEEP_ALIVE_PACKET;
	public static IncomingPacket GLOBAL_CONFIG1_PACKET;
	public static IncomingPacket aClass202_2305;
	public static IncomingPacket aClass202_2306;
	public static IncomingPacket aClass202_2307;
	public static IncomingPacket LOGOUT_PACKET;
	public static IncomingPacket aClass202_2309;
	public static IncomingPacket CONFIG_BY_FILE1_PACKET;
	public static IncomingPacket RICH_PRESENCE;

	static {
		FRIENDS_PACKET = new IncomingPacket(2, -2);
		unknown = new IncomingPacket(3, -1);
		aClass202_2154 = new IncomingPacket(4, 19);
		CLOSE_INTERFACE_PACKET = new IncomingPacket(5, 4);
		PLAYER_UNDER_NPC_PRIORITY_PACKET = new IncomingPacket(6, 1);
		aClass202_2157 = new IncomingPacket(7, 4);
		aClass202_2158 = new IncomingPacket(8, -1);
		MUSIC_EFFECT_PACKET = new IncomingPacket(9, 6);
		SET_MOUSE_PACKET = new IncomingPacket(10, -1);
		WORLD_LIST_PACKET = new IncomingPacket(11, -2);
		aClass202_2162 = new IncomingPacket(12, 1);
		aClass202_2163 = new IncomingPacket(13, 2);
		INTERFACE_PACKET = new IncomingPacket(14, 23);
		aClass202_2195 = new IncomingPacket(15, 1);
		aClass202_2166 = new IncomingPacket(16, 0);
		OPEN_URL_PACKET = new IncomingPacket(17, -2);
		aClass202_2168 = new IncomingPacket(18, 0);
		aClass202_2186 = new IncomingPacket(19, 2);
		PROJECTILE_PACKET = new IncomingPacket(20, 16);
		aClass202_2151 = new IncomingPacket(21, 6);
		aClass202_2172 = new IncomingPacket(22, 10);
		PLAYER_ON_ICOMPONENT_PACKET = new IncomingPacket(23, 4);
		aClass202_2174 = new IncomingPacket(24, -1);
		RUN_ENERGY_PACKET = new IncomingPacket(25, 1);
		aClass202_2176 = new IncomingPacket(26, 8);
		aClass202_2177 = new IncomingPacket(27, 28);
		aClass202_2284 = new IncomingPacket(28, 7);
		aClass202_2179 = new IncomingPacket(29, 9);
		SEND_FRIEND_QUICK_CHAT_MESSAGE_PACKET = new IncomingPacket(30, -1);
		MODEL_ON_ICOMPONENT_PACKET = new IncomingPacket(31, 8);
		RECEIVE_FRIEND_CHAT_QUICK_MESSAGE_PACKET = new IncomingPacket(32, -1);
		RECEIVE_PERSONAL_MESSAGE_PACKET = new IncomingPacket(33, -1);
		GLOBAL_STRING_PACKET_2 = new IncomingPacket(34, -2);
		aClass202_2185 = new IncomingPacket(35, 0);
		aClass202_2160 = new IncomingPacket(36, 29);
		aClass202_2259 = new IncomingPacket(37, 4);
		aClass202_2188 = new IncomingPacket(38, 6);
		GAME_PANE_PACKET = new IncomingPacket(39, 19);
		ICOMPONENT_SETTINGS_PACKET = new IncomingPacket(40, 12);
		aClass202_2191 = new IncomingPacket(41, 6);
		LOAD_MAP_SCENE_PACKET = new IncomingPacket(42, -2);
		aClass202_2193 = new IncomingPacket(43, -1);
		SHAKE_CAMERA_PACKET = new IncomingPacket(44, 6);
		DESTROY_OBJECT_PACKET = new IncomingPacket(45, 2);
		aClass202_2209 = new IncomingPacket(46, 4);
		aClass202_2184 = new IncomingPacket(47, 8);
		aClass202_2198 = new IncomingPacket(48, 10);
		aClass202_2199 = new IncomingPacket(49, -1);
		aClass202_2212 = new IncomingPacket(50, 5);
		aClass202_2201 = new IncomingPacket(51, 2);
		aClass202_2194 = new IncomingPacket(52, 11);
		aClass202_2203 = new IncomingPacket(53, 20);
		aClass202_2238 = new IncomingPacket(54, 10);
		IGNORES_PACKET = new IncomingPacket(55, -2);
		CONFIG2_PACKET = new IncomingPacket(56, 6);
		OPEN_INTERFACE_NPC = new IncomingPacket(57, 25);
		aClass202_2208 = new IncomingPacket(58, 2);
		LOBBY_LOGOUT_PACKET = new IncomingPacket(59, 0);
		LOGOUT_PACKET = new IncomingPacket(60, 0);
		CLIENT_CONSOLE_COMMAND_PACKET = new IncomingPacket(61, -1);
		aClass202_2261 = new IncomingPacket(62, -2);
		GLOBAL_CONFIG2_PACKET = new IncomingPacket(63, 6);
		LARGE_NPC_UPDATE_PACKET = new IncomingPacket(64, -2);
		aClass202_2215 = new IncomingPacket(65, 7);
		aClass202_2204 = new IncomingPacket(66, 0);
		aClass202_2217 = new IncomingPacket(67, 0);
		aClass202_2218 = new IncomingPacket(68, 8);
		BLACK_OUT_PACKET = new IncomingPacket(69, 1);
		SOUND_INDEX15 = new IncomingPacket(70, 6);
		aClass202_2221 = new IncomingPacket(71, 9);
		NPC_UPDATE_PACKET = new IncomingPacket(72, -2);
		aClass202_2223 = new IncomingPacket(73, 4);
		SET_CAMERA_POS_PACKET = new IncomingPacket(74, 6);
		PRIVATE_GAME_BAR_STAGE_PACKET = new IncomingPacket(75, 1);
		OBJECT_ANIMATION_PACKET = new IncomingPacket(76, 9);
		ITEMS_PACKET = new IncomingPacket(77, -2);
		aClass202_2228 = new IncomingPacket(78, 0);
		HINT_ICON_PACKET = new IncomingPacket(79, 14);
		aClass202_2230 = new IncomingPacket(80, 6);
		CONFIG_BY_FILE2_PACKET = new IncomingPacket(81, 6);
		aClass202_2248 = new IncomingPacket(82, 1);
		aClass202_2247 = new IncomingPacket(83, -1);
		aClass202_2270 = new IncomingPacket(84, 6);
		aClass202_2245 = new IncomingPacket(85, -2);
		aClass202_2290 = new IncomingPacket(86, 22);
		aClass202_2237 = new IncomingPacket(87, 3);
		aClass202_2236 = new IncomingPacket(88, -2);
		aClass202_2239 = new IncomingPacket(89, 2);
		GRAPHICS_PACKET = new IncomingPacket(90, 12);
		aClass202_2178 = new IncomingPacket(91, -1);
		aClass202_2242 = new IncomingPacket(92, 1);
		aClass202_2293 = new IncomingPacket(93, 3);
		aClass202_2231 = new IncomingPacket(94, 17);
		RESET_CAMERA_PACKET = new IncomingPacket(95, 0);
		PLAYER_UPDATE_PACKET = new IncomingPacket(96, -2);
		aClass202_2234 = new IncomingPacket(97, -2);
		aClass202_2309 = new IncomingPacket(98, 2);
		aClass202_2249 = new IncomingPacket(99, 10);
		aClass202_2267 = new IncomingPacket(100, 10);
		aClass202_2251 = new IncomingPacket(101, 8);
		ICOMPONENT_MODEL_PACKET = new IncomingPacket(102, 8);
		aClass202_2253 = new IncomingPacket(103, 8);
		RECEIVE_PRIVATE_QUICK_CHAT_MESSAGE_PACKET = new IncomingPacket(104, -1);
		RECEIVE_PRIVATE_MESSAGE_PACKET = new IncomingPacket(105, -2);
		PUBLIC_MESSAGE_PACKET = new IncomingPacket(106, -1);
		TILE_MESSAGE_PACKET = new IncomingPacket(107, -1);
		REMOVE_GROUND_ITEM_PACKET = new IncomingPacket(108, 3);
		aClass202_2250 = new IncomingPacket(109, 4);
		CONFIG1_PACKET = new IncomingPacket(110, 3);
		CONFIG_BY_FILE1_PACKET = new IncomingPacket(111, 3);
		HIDE_ICOMPONENT_PACKET = new IncomingPacket(112, 5);
		OPEN_INTERFACE_PLAYER = new IncomingPacket(113, 25);
		aClass202_2182 = new IncomingPacket(114, 6);
		aClass202_2265 = new IncomingPacket(115, 5);
		SET_CAMERA_LOOK_PACKET = new IncomingPacket(116, 6);
		FRIENDS_CHAT_CHANNEL_PACKET = new IncomingPacket(117, -2);
		PLAYER_OPTION_PACKET = new IncomingPacket(118, -1);
		RUN_SCRIPT_PACKET = new IncomingPacket(119, -2);
		SPAWN_OBJECT_PACKET = new IncomingPacket(120, 6);
		aClass202_2271 = new IncomingPacket(121, 8);
		aClass202_2272 = new IncomingPacket(122, 8);
		CAMERA_ROTATION_PACKET = new IncomingPacket(123, 4);
		aClass202_2274 = new IncomingPacket(124, 8);
		SEND_GROUND_ITEM_PACKET = new IncomingPacket(125, 5);
		aClass202_2276 = new IncomingPacket(126, -2);
		aClass202_2277 = new IncomingPacket(127, 10);
		IGNORE_PACKET = new IncomingPacket(128, -1);
		MUSIC_PACKET = new IncomingPacket(129, 4);
		SEND_PRIVATE_MESSAGE_PACKET = new IncomingPacket(130, -2);
		STOP_CAMERA_SHAKE_PACKET = new IncomingPacket(131, 0);
		SECURITY_PACKET = new IncomingPacket(132, -2);
		aClass202_2283 = new IncomingPacket(133, -2);
		GLOBAL_STRING_PACKET = new IncomingPacket(134, -1);
		ICOMPONENT_TEXT_PACKET = new IncomingPacket(135, -2);
		MESSAGE_PACKET = new IncomingPacket(136, -1);
		aClass202_2287 = new IncomingPacket(137, 5);
		ITEMS_UPDATE_PACKET = new IncomingPacket(138, -2);
		RECEIVE_FRIEND_CHAT_MESSAGE_PACKET = new IncomingPacket(139, -1);
		aClass202_2232 = new IncomingPacket(140, 8);
		SYSTEM_UPDATE_PACKET = new IncomingPacket(141, 2);
		CUTSCENE_PACKET = new IncomingPacket(142, -2);
		OPEN_INTERFACE_OBJECT = new IncomingPacket(143, 32);
		LOAD_MAP_SCENE_DYNAMIC_PACKET = new IncomingPacket(144, -2);
		RESET_SOUNDS_PACKET = new IncomingPacket(145, 0);
		SKILL_LEVEL_PACKET = new IncomingPacket(146, 6);
		aClass202_2297 = new IncomingPacket(147, 1);
		aClass202_2298 = new IncomingPacket(148, -2);
		aClass202_2299 = new IncomingPacket(149, 2);
		aClass202_2255 = new IncomingPacket(150, 2);
		aClass202_2220 = new IncomingPacket(151, 3);
		ITEM_ON_ICOMPONENT_PACKET = new IncomingPacket(152, 10);
		KEEP_ALIVE_PACKET = new IncomingPacket(153, 0);
		GLOBAL_CONFIG1_PACKET = new IncomingPacket(154, 3);
		aClass202_2305 = new IncomingPacket(155, 8);
		aClass202_2306 = new IncomingPacket(156, 3);
		aClass202_2307 = new IncomingPacket(157, 5);
		WORLD_TILE_PACKET = new IncomingPacket(158, 3);
		SHOW_FULL_NPC = new IncomingPacket(160, -2);
		SPIN_MYSTERY_BOX = new IncomingPacket(161, -2);//this has a chance to work now cool:)
		SET_ZOOM_DIS = new IncomingPacket(162, -2);
		SWITCH_ITEMS_LOOK_PACKET = new IncomingPacket(159, 1);
		RICH_PRESENCE = new IncomingPacket(163,-2);
	}

	IncomingPacket(int packetId, int value) {
		this.packetId = -477306055 * packetId;
		this.value = -1324781857 * value;
	}

	static final void method1903(ClientScript2 class403, int i) {
		try {
			class403.anInt5239 -= -783761378;
			int i_1_ = class403.anIntArray5244[681479919 * class403.anInt5239];
			int i_2_ = class403.anIntArray5244[681479919 * class403.anInt5239 + 1];
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class82_Sub6.method886(i_1_, i_2_, false, 1051533242);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "in.tv(" + ')');
		}
	}

	static final void method1904(ClientScript2 class403, byte i) {
		try {
			class403.anInt5239 -= -783761378;
			int i_3_ = class403.anIntArray5244[681479919 * class403.anInt5239];
			int i_4_ = class403.anIntArray5244[1 + class403.anInt5239 * 681479919];
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = i_4_ + i_3_;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "in.yk(" + ')');
		}
	}

	static final void method1905(ClientScript2 class403, byte i) {
		try {
			GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.fogPreference, class403.anIntArray5244[(class403.anInt5239 -= -391880689) * 681479919] == 1 ? 1 : 0, -802327901);
			GameClient.map.method2667(549218846);
			Class3.writePreferences();
			GameClient.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "in.aii(" + ')');
		}
	}

	static final void method1906(ClientScript2 class403, byte i) {
		try {
			String string = (String) class403.anObjectArray5240[(class403.anInt5241 -= 969361751) * -203050393];
			int i_5_ = 0;
			if (Class51.method543(string, 1423765975)) {
				i_5_ = Class216.method1998(string, (short) 6366);
			}
			Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.aClass198_2074, GameClient.gameConnection.aClass449_330, (byte) 125);
			class298_sub36.buffer.writeInt(i_5_, -1055367891);
			GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -42);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "in.sz(" + ')');
		}
	}

	static final void method1907(ClientScript2 class403, int i) {
		try {
			Class390 class390 = class403.aBoolean5261 ? class403.aClass390_5247 : class403.aClass390_5246;
			IComponentDefinition class105 = class390.aClass105_4168;
			RSInterface RSInterface = class390.aRSInterface_4167;
			Class388.method4854(class105, RSInterface, class403, (byte) 16);
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "in.gd(" + ')');
		}
	}
}
