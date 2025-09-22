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
			//"atmo/atmos/atmosphere - Open the EnvEditor to change sun & fog colors or set presets",
			"snow on/off- puts snow on the ground!"
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
			throw ErrorContext.info(runtimeexception, "rj.x(" + ')');
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
			throw ErrorContext.info(runtimeexception, "rj.lo(" + ')');
		}
	}

	static final void method5604(ClientScript2 class403, int i) {
		try {
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class165.recorder.method3878(1767596149) ? 1 : 0;
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class165.recorder.method3887(1474356836) ? 1 : 0;
			class403.anIntArray5244[(class403.anInt5239 += -391880689) * 681479919 - 1] = Class165.recorder.method3880((byte) -46) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "rj.vg(" + ')');
		}
	}

	public static void clientCommands(String cmd, boolean hasColonPrefix, boolean hasSemicolonPrefix, int i) {
		try {
			do {
				try {
					if (cmd.equalsIgnoreCase("commands") || cmd.equalsIgnoreCase("help")) {
						for (String c : DEV_COMMANDS) {
							DevConsole.sendDevConsoleMsg(c);
						}
					} else if (cmd.equalsIgnoreCase("cls")) {
						DevConsoleState.lineCount = 0;
						DevConsoleState.scrollOffset = 0;
					} else if (cmd.equalsIgnoreCase("displayfps")) {
						GameClient.showingFPS = !GameClient.showingFPS;
						if (GameClient.showingFPS) {
							DevConsole.sendDevConsoleMsg("FPS on");
						} else {
							DevConsole.sendDevConsoleMsg("FPS off");
						}
						DevConsoleState.scrollOffset = 0;
					} else if (cmd.equalsIgnoreCase("discordstatus on")) {
						if (Loader.RICH_PRESENCE != null) {
							Loader.RICH_PRESENCE.setEnabled(true);
							DevConsole.sendDevConsoleMsg("Discord Status ENABLED.");
						} else {
							DevConsole.sendDevConsoleMsg("Discord Status not initialized.");
						}
						return;
					} else if (cmd.equalsIgnoreCase("discordstatus off")) {
						if (Loader.RICH_PRESENCE != null) {
							Loader.RICH_PRESENCE.setEnabled(false);
							DevConsole.sendDevConsoleMsg("Discord Status DISABLED.");
						} else {
							DevConsole.sendDevConsoleMsg("Discord Status not initialized.");
						}
						return;
					}
					else if (
							cmd.equalsIgnoreCase("snow") || cmd.equalsIgnoreCase("snow on") || cmd.equalsIgnoreCase("snow off") || cmd.equalsIgnoreCase("snowoff")) {
						boolean desiredOn = !(cmd.equalsIgnoreCase("snow off") || cmd.equalsIgnoreCase("snowoff"));
						if (Settings.SNOW == desiredOn) {
							if (desiredOn) {
								DevConsole.sendDevConsoleMsg("Snow is already enabled.");
							} else {
								DevConsole.sendDevConsoleMsg("Snow is already disabled.");
							}
							return;
						}
						Settings.SNOW = desiredOn;
						ClanSettings.method4578(1, false, 622850291);
						if (GraphicsSetup.clientPreferences.graphicsPreference.getValue(-957568446) == 1) {
							if (desiredOn) {
								DevConsole.sendDevConsoleMsg("Snow Activated! You may need to adjust your graphics settings!");
							} else {
								DevConsole.sendDevConsoleMsg("Snow Deactivated! You may need to adjust your graphics settings!");
							}
							GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aToolkitPreference_7570, 1, -72348841);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							DevConsole.sendDevConsoleMsg("Error");
							return;
						}
					}
					else if (cmd.toLowerCase().startsWith("setdiscordstatus ")) {
						String customState = cmd.substring("setdiscordstatus ".length()).trim();
						if (Loader.RICH_PRESENCE != null) {
							Loader.RICH_PRESENCE.setCustomState(customState);
							if (customState.isEmpty()) {
								DevConsole.sendDevConsoleMsg("Discord status reset to default.");
							} else {
								DevConsole.sendDevConsoleMsg("Discord status updated.");
							}
						} else {
							DevConsole.sendDevConsoleMsg("Discord Rich Presence not initialized.");
						}
						return;
					} else if (cmd.equals("renderer")) {
						Class58 class58 = OverlayType.activeToolkit.method4987();
						DevConsole.sendDevConsoleMsg("Toolkit ID: " + GraphicsSetup.clientPreferences.graphicsPreference.getValue(-481266690));
						DevConsole.sendDevConsoleMsg("Vendor: " + class58.anInt574 * 267107087);
						DevConsole.sendDevConsoleMsg("Name: " + class58.aString582);
						DevConsole.sendDevConsoleMsg("Version: " + class58.anInt581 * 1959468245);
						DevConsole.sendDevConsoleMsg("Device: " + class58.aString577);
						DevConsole.sendDevConsoleMsg("Driver Version: " + class58.aLong583 * 703334160035735425L);
					} else if (cmd.equals("heap")) {
						DevConsole.sendDevConsoleMsg("Heap: " + GameShell.maximumMemory * 1126040225 + "MB");
					} else {
						if (!cmd.equalsIgnoreCase("getcamerapos")) {
							break;
						}
						WorldTile worldTile = GameClient.map.getRegionStart(681479919);
						DevConsole.sendDevConsoleMsg("Pos: " + Class287.myPlayer.plane + "," + ((-1740717447 * Class367.anInt4000 >> 9) + worldTile.x * -1760580017 >> 6) + "," + ((Class146.anInt1575 * -299812095 >> 9) + 283514611 * worldTile.y >> 6) + "," + (-1760580017 * worldTile.x + (-1740717447 * Class367.anInt4000 >> 9) & 0x3f) + "," + (worldTile.y * 283514611 + (-299812095 * Class146.anInt1575 >> 9) & 0x3f) + " Height: " + (Class356.method4271(Class367.anInt4000 * -1740717447, Class146.anInt1575 * -299812095, Class287.myPlayer.plane, -1453034846) - Class110.anInt6403 * 1449634147));
						DevConsole.sendDevConsoleMsg("Look: " + Class287.myPlayer.plane + "," + (-1125224763 * Ground.anInt6292 + worldTile.x * -1760580017 >> 6) + "," + (283514611 * worldTile.y + IPAddress.anInt5959 * -1758389953 >> 6) + "," + (worldTile.x * -1760580017 + -1125224763 * Ground.anInt6292 & 0x3f) + "," + (283514611 * worldTile.y + -1758389953 * IPAddress.anInt5959 & 0x3f) + " Height: " + (Class356.method4271(Ground.anInt6292 * -1125224763, -1758389953 * IPAddress.anInt5959, Class287.myPlayer.plane, -860898067) - 771695069 * Class18.anInt255));
					}
				} catch (Exception exception) {
					DevConsole.sendDevConsoleMsg(LocalizedString.MESSAGE_COMMAND_EXECUTION_ERROR.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210));
				}
				return;
			} while (false);
			if (Class242.aReferenceTable_2708 != ReferenceTable.aReferenceTable_6557 || 1806357379 * GameClient.playerRights >= 2) {
				try {
					//////////////////////////////////////////ADMIN BRANCH//////////////////////////////////////////
					if (cmd.equalsIgnoreCase("prefspath")) {
						DevConsole.sendDevConsoleMsg("Prefs path: " + PrefsIO.prefsPath().toString());
						return;
					}
					if (cmd.equalsIgnoreCase("prefsdump") || cmd.equalsIgnoreCase("dump_prefs_json")) {
						ClientPrefs prefs = GamePreferencesJsonBridge.fromGamePreferences(GraphicsSetup.clientPreferences);
						boolean ok = PrefsIO.save(prefs);
						if (ok) {
							DevConsole.sendDevConsoleMsg("Wrote prefs JSON to: " + PrefsIO.prefsPath().toString());
						} else {
							DevConsole.sendDevConsoleMsg("Failed to write prefs JSON.");
						}
						return;
					}
					if (cmd.equalsIgnoreCase("prefsload") || cmd.equalsIgnoreCase("load_prefs_json")) {
						ClientPrefs prefs = PrefsIO.loadOrNull();
						if (prefs == null) {
							DevConsole.sendDevConsoleMsg("No prefs JSON found at: " + PrefsIO.prefsPath().toString());
							return;
						}
						GamePreferencesJsonBridge.applyToGamePreferences(prefs, GraphicsSetup.clientPreferences);
						Class3.writePreferences();
						GameClient.aBoolean8666 = false;
						DevConsole.sendDevConsoleMsg("Loaded prefs JSON and applied.");
						return;
					}

					if (cmd.equalsIgnoreCase("wm1")) {
						Class357.method4276(1, -1, -1, false, 1791719030);
						if (MagnetDefinitions.method1859((byte) -15) == 1) {
							DevConsole.sendDevConsoleMsg("Success");
						} else {
							DevConsole.sendDevConsoleMsg("Failure");
						}
						return;
					}
					if (cmd.equalsIgnoreCase("wm2")) {
						Class357.method4276(2, -1, -1, false, -674111799);
						if (MagnetDefinitions.method1859((byte) -79) == 2) {
							DevConsole.sendDevConsoleMsg("Success");
						} else {
							DevConsole.sendDevConsoleMsg("Failure");
						}
						return;
					}
					if (Class452.aBoolean5642 && cmd.equalsIgnoreCase("wm3")) {
						Class357.method4276(3, 1024, 768, false, 1894568246);
						if (MagnetDefinitions.method1859((byte) -25) == 3) {
							DevConsole.sendDevConsoleMsg("Success");
						} else {
							DevConsole.sendDevConsoleMsg("Failure");
						}
						return;
					}
					if (cmd.equalsIgnoreCase("safemode")) {
						ClanSettings.method4578(0, false, 622850291);
						if (GraphicsSetup.clientPreferences.graphicsPreference.getValue(-1547826526) == 0) {
							DevConsole.sendDevConsoleMsg("Success");
							GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aToolkitPreference_7570, 0, -458723189);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							DevConsole.sendDevConsoleMsg("Failure");
						}
						return;
					}
					if (cmd.equalsIgnoreCase("opengl")) {
						ClanSettings.method4578(1, false, 622850291);
						if (GraphicsSetup.clientPreferences.graphicsPreference.getValue(-957568446) == 1) {
							DevConsole.sendDevConsoleMsg("Success");
							GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aToolkitPreference_7570, 1, -72348841);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							DevConsole.sendDevConsoleMsg("Failure");
						}
						return;
					}
					if (cmd.equalsIgnoreCase("tk2")) {
						ClanSettings.method4578(2, false, 622850291);
						if (GraphicsSetup.clientPreferences.graphicsPreference.getValue(-565622932) == 2) {
							DevConsole.sendDevConsoleMsg("Success");
							GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aToolkitPreference_7570, 2, 345084383);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							DevConsole.sendDevConsoleMsg("Failure");
						}
						return;
					}
					if (cmd.equalsIgnoreCase("directx")) {
						ClanSettings.method4578(3, false, 622850291);
						if (GraphicsSetup.clientPreferences.graphicsPreference.getValue(-1899485997) == 3) {
							DevConsole.sendDevConsoleMsg("Success");
							GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aToolkitPreference_7570, 3, 1121469356);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							DevConsole.sendDevConsoleMsg("Failure");
						}
						return;
					}
					if (cmd.equalsIgnoreCase("tk5")) {
						ClanSettings.method4578(5, false, 622850291);
						if (GraphicsSetup.clientPreferences.graphicsPreference.getValue(-996545824) == 5) {
							DevConsole.sendDevConsoleMsg("Success");
							GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aToolkitPreference_7570, 5, -1087457820);
							Class3.writePreferences();
							GameClient.aBoolean8666 = false;
						} else {
							DevConsole.sendDevConsoleMsg("Failure");
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
						DevConsole.sendDevConsoleMsg("varpbit=" + Class128.aClass148_6331.method250(i_11_, (byte) 49));
						return;
					}
					if (cmd.startsWith("getclientvarp")) {
						int i_12_ = Integer.parseInt(cmd.substring(14));
						DevConsole.sendDevConsoleMsg("varp=" + Class128.aClass148_6331.method252(i_12_, (byte) 25));
						return;
					}
					if (cmd.startsWith("directlogin")) {
						String[] strings = SceneObject.splitText(cmd.substring(12), ' ', 1545850593);
						if (2 == strings.length) {
							Class63.method741(strings[0], strings[1], 2101690439);
						}
						return;
					}
					if (cmd.startsWith("snlogin ")) {
						String[] strings = SceneObject.splitText(cmd.substring(8), ' ', 259158417);
						int i_13_ = Integer.parseInt(strings[0]);
						Class124.method1385(i_13_, (byte) -22);
						return;
					}
					if (cmd.startsWith("setoutput ")) {
						File file = new File(cmd.substring(10));
						if (file.exists()) {
							file = new File(cmd.substring(10) + "." + TimeUtils.getTime((byte) 1) + ".log");
							if (file.exists()) {
								DevConsole.sendDevConsoleMsg("file already exists!");
								return;
							}
						}
						if (null != DisplayMode.consoleLogStream) {
							DisplayMode.consoleLogStream.close();
							DisplayMode.consoleLogStream = null;
						}
						try {
							DisplayMode.consoleLogStream = new FileOutputStream(file);
						} catch (FileNotFoundException filenotfoundexception) {
							DevConsole.sendDevConsoleMsg("Could not create " + file.getName());
						} catch (SecurityException securityexception) {
							DevConsole.sendDevConsoleMsg("Cannot write to " + file.getName());
						}
						return;
					}
					if (cmd.equals("closeoutput")) {
						if (DisplayMode.consoleLogStream != null) {
							DisplayMode.consoleLogStream.close();
						}
						DisplayMode.consoleLogStream = null;
						return;
					}
					if (cmd.startsWith("runscript ")) {
						File file = new File(cmd.substring(10));
						if (!file.exists()) {
							DevConsole.sendDevConsoleMsg("No such file");
							return;
						}
						byte[] is = Class362.method4311(file, -1944658057);
						if (null == is) {
							DevConsole.sendDevConsoleMsg("Failed to read file");
							return;
						}
						String[] strings = SceneObject.splitText(Class123.method1378(Class146.method1598(is, 1704231187), '\r', "", (short) 316), '\n', 714918179);
						Class55.method606(strings, 408166320);
					}
					if (GameClient.anInt8752 * -1233866115 == 0) {
						Class298_Sub36 c = Class18.method359(OutgoingPacket.COMMANDS_PACKET, GameClient.gameConnection.aClass449_330, (byte) 6);
						c.buffer.writeByte(cmd.length() + 3);
						c.buffer.writeByte(hasColonPrefix ? 1 : 0);
						c.buffer.writeByte(hasSemicolonPrefix ? 1 : 0);
						c.buffer.writeString(cmd, 2127017558);
						GameClient.gameConnection.writeOutboundPacket(c, (byte) -55);
					}
				} catch (Exception exception) {
					DevConsole.sendDevConsoleMsg(LocalizedString.MESSAGE_COMMAND_EXECUTION_ERROR.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210));
					return;
				}
			}
			if (GameClient.anInt8752 * -1233866115 != 0) {
				DevConsole.sendDevConsoleMsg(LocalizedString.MESSAGE_UNKNOWN_DEV_COMMAND_PREFIX.getText(DynamicLight.ACTIVE_LANGUAGE, -875414210) + cmd);
			}
		} catch (RuntimeException runtimeexception) {
			throw ErrorContext.info(runtimeexception, "rj.t(" + ')');
		}
	}
}
