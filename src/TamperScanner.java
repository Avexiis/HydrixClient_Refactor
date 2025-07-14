import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;
 /**
 * This class uses PowerShell to detect process names against the following list of disallowed programs.
 * It makes no attempt to block or notify the suspected user, nor does it do anything less than friendly.
 * It simply captures the data and sends a webhook to Discord for review by server staff.
 * Obviously, because it uses PowerShell, this makes the client only run properly on Windows.
 * 
 * If you do not wish to force Windows, disable this class and its executor in Loader.java, as well as the single call in RichPresence.java.
 * 
 * @author Xeon
 */
public class TamperScanner {

	private static final String[] BLACKLIST_PATTERNS = { //not all of these will apply to RSPS, add or remove as needed
		"fiddler",
		"dnspy",
		"ollydbg",
		"x32dbg",
		"x64dbg",
		"cheat\\s*engine",
		"cheatengine",
		"extreme\\s*injector",
		"injector",
		"process\\s*hacker",
		"process\\s*monitor",
		"procmon",
		"resource\\s*hacker",
		"scylla",
		"dbgclr",
		"frida",
		"dumper",
		"dotPeek",
		"universal\\s*debugger",
		"debugger",
		"xenos",
		"sandboxie",
		"wireshark",
		"wpepro",
		"packet\\s*logger",
		"packet\\s*editor",
		"packet\\s*sniffer",
		"autoclick",
		"auto\\s*clicker",
		"auto\\s*click",
		"macro\\s*recorder",
		"autoit",
		"ahk",
		"ghost\\s*mouse",
		"mouse\\s*recorder",
		"keyboard\\s*recorder",
		"key\\s*presser",
		"sikuli",
		"pyautogui",
		"pulover",
		"jitbit",
		"auto\\s*macro",
		"mini\\s*mouse\\s*macro",
		"ghost\\s*control",
		"fastkeys",
		"phraseexpress",
		"tiny\\s*loader",
		"blitz\\s*loader",
		"razer\\s*macro",
		"razer\\s*synapse\\s*macro",
		"razer\\s*naga\\s*macro",
		"logitech\\s*macro",
		"corsair\\s*utility\\s*engine",
		"cue\\s*macro",
		"steelseries\\s*macro",
		"redragon\\s*macro",
		"redragon\\s*m\\d+\\s*macro",
		"bloody7",
		"bloody\\s*macro",
		"roccat\\s*macro",
		"hyperx\\s*macro",
		"cooler\\s*master\\s*macro",
		"asus\\s*rog\\s*macro",
		"msi\\s*macro"
	};

    private static final Pattern[] COMPILED_BLACKLIST;
    static {
        COMPILED_BLACKLIST = new Pattern[BLACKLIST_PATTERNS.length];
        for (int i = 0; i < BLACKLIST_PATTERNS.length; i++) {
            COMPILED_BLACKLIST[i] = Pattern.compile(".*" + BLACKLIST_PATTERNS[i] + ".*", Pattern.CASE_INSENSITIVE);
        }
    }

    private static volatile String lastKnownUsername = "Unknown";

    public static void setLastKnownUsername(String username) {
        if (username == null || username.isEmpty())
            lastKnownUsername = "Unknown";
        else
            lastKnownUsername = username;
    }

    public static String getLastKnownUsername() {
        return lastKnownUsername;
    }

	public static String scanForBlacklistedProcesses() {
		Set<String> reported = new HashSet<>();

		try {
			Process proc = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "tasklist"});
			BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String line;
			boolean headerSkipped = false;
			while ((line = reader.readLine()) != null) {
				if (!headerSkipped) {
					if (line.contains("=====")) {
						headerSkipped = true;
					}
					continue;
				}
				if (line.trim().isEmpty()) continue;
				String[] tokens = line.trim().split("\\s+");
				if (tokens.length == 0) continue;
				String processName = tokens[0];

				for (Pattern pattern : COMPILED_BLACKLIST) {
					if (pattern.matcher(processName).find()) {
						reported.add(processName.toLowerCase());
						return processName;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			String powershellCmd =
				"powershell -Command \"Get-Process | Where-Object {$_.MainWindowTitle} | " +
				"Select-Object -ExpandProperty MainWindowTitle\"";
			Process psProc = Runtime.getRuntime().exec(powershellCmd);
			BufferedReader psReader = new BufferedReader(new InputStreamReader(psProc.getInputStream()));
			String winTitle;
			while ((winTitle = psReader.readLine()) != null) {
				winTitle = winTitle.trim();
				if (winTitle.isEmpty()) continue;
				for (Pattern pattern : COMPILED_BLACKLIST) {
					if (pattern.matcher(winTitle).find()) {
						String key = winTitle.toLowerCase();
						if (!reported.contains(key)) {
							return winTitle;
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

    public static void sendDiscordWebhook(String webhookUrl, String content) {
        try {
            URL url = new URL(webhookUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.addRequestProperty("Content-Type", "application/json");
            con.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:124.0) Gecko/20100101 Firefox/124.0");
            con.setDoOutput(true);

            String safeContent = content.replace("\\", "\\\\")
                                        .replace("\"", "\\\"")
                                        .replace("\n", "\\n")
                                        .replace("\r", "");
            String payload = "{\"content\": \"" + safeContent + "\"}";

            OutputStream os = con.getOutputStream();
            os.write(payload.getBytes("UTF-8"));
            os.flush();
            os.close();

            int code = con.getResponseCode();
         
            if (code >= 400) {
                BufferedReader err = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                String line;
                while ((line = err.readLine()) != null);
                err.close();
            } else {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String line;
                while ((line = in.readLine()) != null);
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean scanAndReport(String webhookUrl, String username) {
        String detected = scanForBlacklistedProcesses();
        if (detected != null) {
            String mac = MacAddress.getMacAddress();

            if (username == null || username.isEmpty())
                username = getLastKnownUsername();

            if (username == null || username.isEmpty())
                username = "Unknown";

            String content =
                "__**Possible Tampering detected!**__\n" +
                "Program: `" + detected + "`\n" +
                "MAC: || " + mac + " ||\n" +
                "Username: `" + username + "`\n" +
                "Timestamp: <t:" + (System.currentTimeMillis()/1000L) + ">";
            sendDiscordWebhook(webhookUrl, content);
            return true;
        }
        return false;
    }

    public static boolean scanAndReport(String webhookUrl) {
        return scanAndReport(webhookUrl, getLastKnownUsername());
    }

    public static void main(String[] args) {
        String webhook = "https://discord.com/api/webhooks/1382430347152719973/JOB3VIgLZyF0dOsM_PMAPc5jVXt4TJsOyFbyTG-YOhpYjwVMFAM7FJ8-nz7RDTh_WT00";
        setLastKnownUsername(Class360.username);
        scanAndReport(webhook);
    }
}
