/**
 * Central class to store settings
 * @author Kryeus
 */

public class Settings {
	
	static BuildInstance ins = new BuildInstance("LIVE");
	//static BuildInstance ins = new BuildInstance("BETA");
	// static BuildInstance ins = new BuildInstance("LOCAL");

	
	public static boolean SNOW = false;
	public static String IP = ins.getBuild().GameIP;
	public static String LOBBY_IP = ins.getBuild().LobbyIP;
	public static int PORT = ins.getBuild().Port;
	public static final int REVISION = ins.getBuild().Revision;
	public static final int SUB_REVISION = ins.getBuild().SubRevision;
	
	public static boolean isLive = ins.getBuild() == Build.Live;
	public static boolean isBeta = ins.getBuild() == Build.Beta;
	public static boolean isLocl = ins.getBuild() == Build.Local;

	/* Client Settings */
	public static boolean LOBBY_ENABLED = false,
			DISABLE_XTEA_CRASH = true,
			DISABLE_USELESS_PACKETS = true,
			DISABLE_RSA = false,
			DISABLE_SOFTWARE_MODE = true,
			useIsaac = false;
	public static final String key = "hAJWGrsaETglRjuwxMwnlA/d5W6EgYWx";
	
	
	/* Frame Settings */
	public static String frame_base = "Nexus";
	public static String frame_build = isLive ? "Live" :
										isBeta ? "Beta" :
										 isLocl ? "LOCAL (127.0.0.1)" : "Unknown";
	public static String frame_lobby = LOBBY_ENABLED ? "Lobby: Enabled" : "Lobby: Disabled";
	public static String char_sep = " | ";
	public static String FRAME_TITLE = frame_base + char_sep + "Build: " + frame_build + char_sep;
	

}
