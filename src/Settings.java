/**
 * Central class to store settings
 * @author Kryeus
 * @author Xeon (refactor/additions)
 */

public class Settings {
	/** Server and owner names */
	public static String SERVER_NAME   = "Nexus";
	public static String SERVER_OWNER1 = "xeon"; //these usernames will get the owner crown if they have rights 2
	public static String SERVER_OWNER2 = "not_puragen";

	/**Discord Settings*/
	public static boolean DISCORD_ENABLED = true;
	public static String DISCORD_INVITE   = "https://discord.gg/dqTN9fax6s";

	/** Client Settings */
	static BuildInstance instance         = new BuildInstance("LIVE" /*"BETA"*/ /*"LOCAL"*/);
	public static boolean DEBUG           = true; //hides certain stack traces for errors if false, use true for local or beta/false for live
	public static boolean USE_TLS         = true; //Enables SSL, only use this if your server is reachable via HTTPS, if it is HTTP, using TLS will fail.
	public static boolean SNOW            = false; //Christmas/winter time, puts snow on the ground
	public static String CONNECT_URL      = instance.getBuild().GameURL;
	public static String LOBBY_URL        = instance.getBuild().LobbyURL;
	public static int PORT                = instance.getBuild().Port;
	public static final int REVISION      = instance.getBuild().Revision;
	public static final int SUB_REVISION  = instance.getBuild().SubRevision;
	public static boolean isLive          = instance.getBuild() == Build.LIVE;
	public static boolean isBeta          = instance.getBuild() == Build.BETA;
	public static boolean isLocal         = instance.getBuild() == Build.LOCAL;
	public static final String key        = "hAJWGrsaETglRjuwxMwnlA/d5W6EgYWx";
	public static boolean
			LOBBY_ENABLED           = false,
			DISABLE_XTEA_CRASH      = true,
			DISABLE_USELESS_PACKETS = true,
			DISABLE_RSA             = false,
			DISABLE_SOFTWARE_MODE   = true,
			USE_ISAAC               = false;

	/** Frame Settings */
	public static String BUILD       = isLive ? "Public" : isBeta ? "Beta" : isLocal ? "LOCAL (127.0.0.1)" : "Unknown";
	public static String VERSION     = "v2.0.0";
	public static String LOBBY       = LOBBY_ENABLED ? "Lobby: Enabled" : "Lobby: Disabled";
	public static String FRAME_TITLE = SERVER_NAME + " | " + VERSION + " | Build: " + BUILD;

	/**Dev console settings*/
	public static int CONSOLE_COLOR           = 0xA34400;
	public static int CONSOLE_SCROLLBAR_COLOR = 0xFF5900;
	public static String CONSOLE_MAIN_TEXT    = "<col=ffe100>Welcome to the</col> <col=00a6ff>" + SERVER_NAME + "</col> <col=ffe100>Developer Console!</col>";
	public static String CONSOLE_RIGHT_TEXT   = "<col=ffe100>742</col> <col=ffffff>(</col><col=00a6ff>Custom</col><col=ffffff>)</col>";
	public static String CONSOLE_CARET        = ">>> "; //keep the space on the end
	public static String CONSOLE_WARN_MSG     =
			"<col=00ff00>Commands sent here are meant for this console and are separate from the</col> <col=ffffff>:: / ;;</col> <col=00ff00>server commands!</col>";
}
