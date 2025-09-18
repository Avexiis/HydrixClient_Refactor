/* ConsoleCommands - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ConsoleCommands {
	static char[] aCharArray5340 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
	static int anInt5341;
	private static final String[] DEV_COMMANDS = {
			"THESE COMMANDS ARE MEANT FOR THIS CONSOLE AND ARE",
			"SEPARATE FROM THE SERVER COMMANDS YOU MAY BE USED TO!",
			"USE THE :: OR ;; METHOD TO RUN NORMAL COMMANDS!",
			"commands - List all commands",
			"help - Alias for commands",
			"cls - Clear console",
			"displayfps - Toggle FPS and diagnostic info",
			"renderer - Print graphics renderer details",
			"heap - Print Java heap usage",
			"getcamerapos - Print camera position & direction",
			"discordstatus (on/off) - Enable or disable Discord status",
			"setdiscordstatus - Set custom text to appear on your profile while playing!",
			"atmo/atmos/atmosphere - Open the EnvEditor to change sun & fog colors or set presets",
			//"snow - puts snow on the ground!"
	};
	ConsoleCommands() throws Throwable {
		throw new Error();
	}

	public static void method5602(int[] is, Object[] objects, int i, int i_0_, int i_1_) {
		try {
			if (i < i_0_) {
				int i_2_ = (i_0_ + i) / 2;
				int i_3_ = i;
				int i_4_ = is[i_2_];
				is[i_2_] = is[i_0_];
				is[i_0_] = i_4_;
				Object object = objects[i_2_];
				objects[i_2_] = objects[i_0_];
				objects[i_0_] = object;
				int i_5_ = 2147483647 == i_4_ ? 0 : 1;
				for (int i_6_ = i; i_6_ < i_0_; i_6_++) {
					if (is[i_6_] < (i_6_ & i_5_) + i_4_) {
						int i_7_ = is[i_6_];
						is[i_6_] = is[i_3_];
						is[i_3_] = i_7_;
						Object object_8_ = objects[i_6_];
						objects[i_6_] = objects[i_3_];
						objects[i_3_++] = object_8_;
					}
				}
				is[i_0_] = is[i_3_];
				is[i_3_] = i_4_;
				objects[i_0_] = objects[i_3_];
				objects[i_3_] = object;
				method5602(is, objects, i, i_3_ - 1, -641027314);
				method5602(is, objects, i_3_ + 1, i_0_, -641027314);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rj.x(").append(')').toString());
		}
	}

	static boolean method5603(IComponentDefinition class105, int i) {
		try {
			Class298_Sub38 class298Sub38 = GameClient.method2801(class105);
			if (class298Sub38.method3493((byte) 1) > 0) {
				return true;
			}
			if (class298Sub38.method3496(-1320707999)) {
				return true;
			}
			if (null != class105.aClass105_1233) {
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rj.lo(").append(')').toString());
		}
	}

	static final void method5604(ClientScript2 class403, int i) {
		try {
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class165.recorder.method3878(1767596149) ? 1 : 0;
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class165.recorder.method3887(1474356836) ? 1 : 0;
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class165.recorder.method3880((byte) -46) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, new StringBuilder().append("rj.vg(").append(')').toString());
		}
	}

	public static void method5605(String cmd, boolean bool, boolean bool_9_, int i) {
		try {
			do {
				try {
					if (cmd.equalsIgnoreCase("commands") || cmd.equalsIgnoreCase("help")) {
						for (String c : DEV_COMMANDS) {
							Class255.sendDevConsoleMsg(c, 0);
						}
					} else if (cmd.equalsIgnoreCase("cls")) {
						Class8.anInt102 = 0;
						Class8.anInt103 = 0;
					} else if (cmd.equalsIgnoreCase("displayfps")) {
						GameClient.showingFPS = !GameClient.showingFPS;
						if (GameClient.showingFPS) {
							Class255.sendDevConsoleMsg("FPS on", 899052076);
						} else {
							Class255.sendDevConsoleMsg("FPS off", 1184714257);
						}
						Class8.anInt103 = 0;
					} else if (cmd.equalsIgnoreCase("discordstatus on")) {
						if (Loader.RICH_PRESENCE != null) {
							Loader.RICH_PRESENCE.setEnabled(true);
							Class255.sendDevConsoleMsg("Discord Status ENABLED.", 0);
						} else {
							Class255.sendDevConsoleMsg("Discord Status not initialized.", 0);
						}
						return;
					} else if (cmd.equalsIgnoreCase("discordstatus off")) {
						if (Loader.RICH_PRESENCE != null) {
							Loader.RICH_PRESENCE.setEnabled(false);
							Class255.sendDevConsoleMsg("Discord Status DISABLED.", 0);
						} else {
							Class255.sendDevConsoleMsg("Discord Status not initialized.", 0);
						}
						return;
					}
					else if (
							cmd.equalsIgnoreCase("snow") || cmd.equalsIgnoreCase("snow on") || cmd.equalsIgnoreCase("snow off") || cmd.equalsIgnoreCase("snowoff")) {
						boolean desiredOn = !(cmd.equalsIgnoreCase("snow off") || cmd.equalsIgnoreCase("snowoff"));
						if (Settings.SNOW == desiredOn) {
							if (desiredOn) {
								Class255.sendDevConsoleMsg("Snow is already enabled.", 0);
							} else {
								Class255.sendDevConsoleMsg("Snow is already disabled.", 0);
							}
							return;
						}
						Settings.SNOW = desiredOn;
						ClanSettings.method4578(1, false, 622850291);
						if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-957568446) == 1) { //reload toolkit, opengl as it's what most use.
							if (desiredOn) {        															//they can set directx again by hand if they really care
								Class255.sendDevConsoleMsg("Snow Activated! You may need to adjust your graphics settings!", 1271200712);
							} else {
								Class255.sendDevConsoleMsg("Snow Deactivated! You may need to adjust your graphics settings!", 1271200712);
							}
							GraphicsAutoSetup.clientPreferences.method3540(
									GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570, 1, -72348841
							);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							Class255.sendDevConsoleMsg("Error", 1851865795);
							return;
						}
					}
					else if (cmd.toLowerCase().startsWith("setdiscordstatus ")) {
						String customState = cmd.substring("setdiscordstatus ".length()).trim();
						if (Loader.RICH_PRESENCE != null) {
							Loader.RICH_PRESENCE.setCustomState(customState);
							if (customState.isEmpty()) {
								Class255.sendDevConsoleMsg("Discord status reset to default.", 0);
							} else {
								Class255.sendDevConsoleMsg("Discord status updated.", 0);
							}
						} else {
							Class255.sendDevConsoleMsg("Discord Rich Presence not initialized.", 0);
						}
						return;
					} else if (cmd.equalsIgnoreCase("atmo")
							|| cmd.equalsIgnoreCase("atmos")
							|| cmd.equalsIgnoreCase("atmosphere")) {
						AtmosphereManager atmos = GameClient.map.method2640((byte) 0);
						if (atmos != null) {
							atmos.openEnvironmentEditor();
						} else {
							Class255.sendDevConsoleMsg("Atmosphere editor not initialized.", 0);
						}
						return;
					} else if (cmd.equals("renderer")) {
						Class58 class58 = OverlayType.activeToolkit.method4987();
						Class255.sendDevConsoleMsg("Toolkit ID: " + GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-481266690), 1038434697);
						Class255.sendDevConsoleMsg("Vendor: " + class58.anInt574 * 267107087, 212944002);
						Class255.sendDevConsoleMsg("Name: " + class58.aString582, 723527437);
						Class255.sendDevConsoleMsg("Version: " + class58.anInt581 * 1959468245, 1382813939);
						Class255.sendDevConsoleMsg("Device: " + class58.aString577, 536857078);
						Class255.sendDevConsoleMsg("Driver Version: " + class58.aLong583 * 703334160035735425L, 1218429557);
					} else if (cmd.equals("heap")) {
						Class255.sendDevConsoleMsg("Heap: " + GameShell.maximumMemory * 1126040225 + "MB", 170718628);
					} else {
						if (!cmd.equalsIgnoreCase("getcamerapos")) {
							break;
						}
						WorldTile worldTile = GameClient.map.getRegionStart(681479919);
						Class255.sendDevConsoleMsg("Pos: " + Class287.myPlayer.plane + "," + ((-1740717447 * Class367.anInt4000 >> 9) + worldTile.x * -1760580017 >> 6) + "," + ((Class146.anInt1575 * -299812095 >> 9) + 283514611 * worldTile.y >> 6) + "," + (-1760580017 * worldTile.x + (-1740717447 * Class367.anInt4000 >> 9) & 0x3f) + "," + (worldTile.y * 283514611 + (-299812095 * Class146.anInt1575 >> 9) & 0x3f) + " Height: " + (Class356.method4271(Class367.anInt4000 * -1740717447, Class146.anInt1575 * -299812095, Class287.myPlayer.plane, -1453034846) - Class110.anInt6403 * 1449634147), 306448697);
						Class255.sendDevConsoleMsg("Look: " + Class287.myPlayer.plane + "," + (-1125224763 * Ground.anInt6292 + worldTile.x * -1760580017 >> 6) + "," + (283514611 * worldTile.y + IPAddress.anInt5959 * -1758389953 >> 6) + "," + (worldTile.x * -1760580017 + -1125224763 * Ground.anInt6292 & 0x3f) + "," + (283514611 * worldTile.y + -1758389953 * IPAddress.anInt5959 & 0x3f) + " Height: " + (Class356.method4271(Ground.anInt6292 * -1125224763, -1758389953 * IPAddress.anInt5959, Class287.myPlayer.plane, -860898067) - 771695069 * Class18.anInt255), 1171744016);
					}
				} catch (Exception exception) {
					Class255.sendDevConsoleMsg(LocalizedString.MESSAGE_COMMAND_EXECUTION_ERROR.getText(Class321.ACTIVE_LANGUAGE, -875414210), 247216384);
				}
				return;
			} while (false);
			if (Class242.aReferenceTable_2708 != ReferenceTable.aReferenceTable_6557 || 1806357379 * GameClient.playerRights >= 2) {
				try {
					if (cmd.equalsIgnoreCase("wm1")) {
						Class357.method4276(1, -1, -1, false, 1791719030);
						if (MagnetDefinitions.method1859((byte) -15) == 1) {
							Class255.sendDevConsoleMsg("Success", 1472876448);
						} else {
							Class255.sendDevConsoleMsg("Failure", 1016209121);
						}
						return;
					}
					if (cmd.equalsIgnoreCase("wm2")) {
						Class357.method4276(2, -1, -1, false, -674111799);
						if (MagnetDefinitions.method1859((byte) -79) == 2) {
							Class255.sendDevConsoleMsg("Success", 1308535348);
						} else {
							Class255.sendDevConsoleMsg("Failure", 863221927);
						}
						return;
					}
					if (Class452.aBoolean5642 && cmd.equalsIgnoreCase("wm3")) {
						Class357.method4276(3, 1024, 768, false, 1894568246);
						if (MagnetDefinitions.method1859((byte) -25) == 3) {
							Class255.sendDevConsoleMsg("Success", 2072006321);
						} else {
							Class255.sendDevConsoleMsg("Failure", 1988552564);
						}
						return;
					}
					if (cmd.equalsIgnoreCase("safemode")) {
						ClanSettings.method4578(0, false, 622850291);
						if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-1547826526) == 0) {
							Class255.sendDevConsoleMsg("Success", 267543271);
							GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570, 0, -458723189);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							Class255.sendDevConsoleMsg("Failure", 268000194);
						}
						return;
					}
					if (cmd.equalsIgnoreCase("opengl")) {
						ClanSettings.method4578(1, false, 622850291);
						if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-957568446) == 1) {
							Class255.sendDevConsoleMsg("Success", 1271200712);
							GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570, 1, -72348841);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							Class255.sendDevConsoleMsg("Failure", 1851865795);
						}
						return;
					}
					if (cmd.equalsIgnoreCase("tk2")) {
						ClanSettings.method4578(2, false, 622850291);
						if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-565622932) == 2) {
							Class255.sendDevConsoleMsg("Success", 1728166997);
							GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570, 2, 345084383);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							Class255.sendDevConsoleMsg("Failure", 807691994);
						}
						return;
					}
					if (cmd.equalsIgnoreCase("directx")) {
						ClanSettings.method4578(3, false, 622850291);
						if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-1899485997) == 3) {
							Class255.sendDevConsoleMsg("Success", 2073339182);
							GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570, 3, 1121469356);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							Class255.sendDevConsoleMsg("Failure", 1035326643);
						}
						return;
					}
					if (cmd.equalsIgnoreCase("tk5")) {
						ClanSettings.method4578(5, false, 622850291);
						if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-996545824) == 5) {
							Class255.sendDevConsoleMsg("Success", 892097548);
							GraphicsAutoSetup.clientPreferences.method3540(GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570, 5, -1087457820);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							Class255.sendDevConsoleMsg("Failure", 1743942992);
						}
						return;
					}
					if (cmd.equalsIgnoreCase("clientdrop")) {
						if (0 == GameClient.anInt8752 * -1233866115) {
							SubIncommingPacket.method1923(554378996);
						} else if (17 == -1233866115 * GameClient.anInt8752) {
							GameClient.gameConnection.aBoolean347 = true;
						}
						return;
					}
					if (cmd.equalsIgnoreCase("breakcon")) {
						Class25[] class25s = GameClient.aClass25Array8679;
						for (Class25 class25 : class25s) {
							if (class25.method387(537308016) != null) {
								class25.method387(537308016).method3867((byte) 100);
							}
						}
						Class248.aClass247_2752.method2353((short) 2067);
						return;
					}
					if (cmd.startsWith("getclientvarpbit")) {
						int i_11_ = Integer.parseInt(cmd.substring(17));
						Class255.sendDevConsoleMsg("varpbit=" + Class128.aClass148_6331.method250(i_11_, (byte) 49), 812809440);
						return;
					}
					if (cmd.startsWith("getclientvarp")) {
						int i_12_ = Integer.parseInt(cmd.substring(14));
						Class255.sendDevConsoleMsg("varp=" + Class128.aClass148_6331.method252(i_12_, (byte) 25), 1156644577);
						return;
					}
					if (cmd.startsWith("directlogin")) {
						String[] strings = Class365_Sub1_Sub3_Sub1.method4508(cmd.substring(12), ' ', 1545850593);
						if (2 == strings.length) {
							Class63.method741(strings[0], strings[1], 2101690439);
						}
						return;
					}
					if (cmd.startsWith("snlogin ")) {
						String[] strings = Class365_Sub1_Sub3_Sub1.method4508(cmd.substring(8), ' ', 259158417);
						int i_13_ = Integer.parseInt(strings[0]);
						Class124.method1385(i_13_, (byte) -22);
						return;
					}
					if (cmd.startsWith("setoutput ")) {
						File file = new File(cmd.substring(10));
						if (file.exists()) {
							file = new File(cmd.substring(10) + "." + TimeUtils.getTime((byte) 1) + ".log");
							if (file.exists()) {
								Class255.sendDevConsoleMsg("file already exists!", 1609687254);
								return;
							}
						}
						if (null != Class78.aFileOutputStream731) {
							Class78.aFileOutputStream731.close();
							Class78.aFileOutputStream731 = null;
						}
						try {
							Class78.aFileOutputStream731 = new FileOutputStream(file);
						} catch (FileNotFoundException filenotfoundexception) {
							Class255.sendDevConsoleMsg("Could not create " + file.getName(), 2057720306);
						} catch (SecurityException securityexception) {
							Class255.sendDevConsoleMsg("Cannot write to " + file.getName(), 651886745);
						}
						return;
					}
					if (cmd.equals("closeoutput")) {
						if (Class78.aFileOutputStream731 != null) {
							Class78.aFileOutputStream731.close();
						}
						Class78.aFileOutputStream731 = null;
						return;
					}
					if (cmd.startsWith("runscript ")) {
						File file = new File(cmd.substring(10));
						if (!file.exists()) {
							Class255.sendDevConsoleMsg("No such file", 1833830484);
							return;
						}
						byte[] is = Class362.method4311(file, -1944658057);
						if (null == is) {
							Class255.sendDevConsoleMsg("Failed to read file", 1208919662);
							return;
						}
						String[] strings = Class365_Sub1_Sub3_Sub1.method4508(Class123.method1378(Class146.method1598(is, 1704231187), '\r', "", (short) 316), '\n', 714918179);
						Class55.method606(strings, 408166320);
					}
					if (GameClient.anInt8752 * -1233866115 == 0) {
						Class298_Sub36 class298_sub36 = Class18.method359(OutgoingPacket.COMMANDS_PACKET, GameClient.gameConnection.aClass449_330, (byte) 6);
						class298_sub36.buffer.writeByte(cmd.length() + 3);
						class298_sub36.buffer.writeByte(bool ? 1 : 0);
						class298_sub36.buffer.writeByte(bool_9_ ? 1 : 0);
						class298_sub36.buffer.writeString(cmd, 2127017558);
						GameClient.gameConnection.writeOutboundPacket(class298_sub36, (byte) -55);
					}
				} catch (Exception exception) {
					Class255.sendDevConsoleMsg(LocalizedString.MESSAGE_COMMAND_EXECUTION_ERROR.getText(Class321.ACTIVE_LANGUAGE, -875414210), 417864665);
					return;
				}
			}
			if (GameClient.anInt8752 * -1233866115 != 0) {
				Class255.sendDevConsoleMsg(LocalizedString.MESSAGE_UNKNOWN_DEV_COMMAND_PREFIX.getText(Class321.ACTIVE_LANGUAGE, -875414210) + cmd, 276776266);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "rj.t(" + ')');
		}
	}
}
