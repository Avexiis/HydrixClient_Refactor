import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Properties;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Loader extends Applet {

	private static final long serialVersionUID = 7639088664641445302L;

	public static final Properties client_parameters = new Properties();

	public JFrame client_frame;
	public final JPanel client_panel = new JPanel();

	/* Links to new static location for all GameClient settings */
	public static String IP = Settings.IP;
	public static String LOBBY_IP = Settings.LOBBY_IP;
	public static int PORT = Settings.PORT;
	public static boolean LOBBY_ENABLED = Settings.LOBBY_ENABLED;
	public static boolean DISABLE_XTEA_CRASH = Settings.DISABLE_XTEA_CRASH;
	public static boolean DISABLE_USELESS_PACKETS = Settings.DISABLE_USELESS_PACKETS;
	public static boolean DISABLE_RSA = Settings.DISABLE_RSA;
	public static boolean useIsaac = Settings.useIsaac;
	public static final int REVISION = Settings.REVISION;
	public static final int SUB_REVISION = Settings.SUB_REVISION;
	public static boolean isShifting;
	public static final RichPresence RICH_PRESENCE = new RichPresence();
	public static final int EXTRA_DRAW_DISTANCE = 3; //don't set it too high or it starts to clip, 3 is pushing it as is.
	public static Loader instance;
	public static final String TAMPER_WEBHOOK = "https://discord.com/api/webhooks/YOUR_WEBHOOK/GOES_HERE";


	public static void main(String[] args) {
		System.setProperty("https.protocols", "TLSv1.2");
		RICH_PRESENCE.initiate(); //discord thing that shows on your profile as "Playing _"
		
		/* Anti-Tamper - DISABLE THIS IF SUPPORTING MACOS/LINUX*/
		Timer t1 = new Timer();
		t1.schedule(new MemoryOptimizer(), 0, 30000);
			Thread tamperThread = new Thread(() -> {
				while (true) {
					try {
						TamperScanner.scanAndReport(TAMPER_WEBHOOK);
						Thread.sleep(30000);
					} catch (Exception e) {
					}
				}
			});
		tamperThread.setDaemon(true);
		tamperThread.start();  
		/* END ANTI-TAMPER */
		
		/* Game Frame Initialization */
		Loader loader = instance = new Loader();
		loader.doFrame();
	}

	@Override
	public void init() {
		instance = this;
		doApplet();
	}

	void doApplet() {
		setParams();
		startClient();
	}

	public void doFrame() {
		setParams();
		openFrame();
		startClient();
	}

	void setParams() {
		client_parameters.put("separate_jvm", "true");
		client_parameters.put("boxbgcolor", "black");
		client_parameters.put("image", "http://www.runescape.com/img/game/splash2.gif");
		client_parameters.put("centerimage", "true");
		client_parameters.put("boxborder", "false");
		client_parameters.put("java_arguments", "-Xmx1024m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
		client_parameters.put("27", "0");
		client_parameters.put("1", "0");
		client_parameters.put("16", "false");
		client_parameters.put("17", "false");
		client_parameters.put("21", "1"); // WORLD ID
		client_parameters.put("30", "false");
		client_parameters.put("20", LOBBY_IP);
		client_parameters.put("29", "");
		client_parameters.put("11", "true");
		client_parameters.put("25", "1378752098");
		client_parameters.put("28", "0");
		client_parameters.put("8", ".runescape.com");
		client_parameters.put("23", "false");
		client_parameters.put("32", "0");
		client_parameters.put("15", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
		client_parameters.put("0", "IjGJjn4L3q5lRpOR9ClzZQ");
		client_parameters.put("2", "");
		client_parameters.put("4", "1"); // WORLD ID
		client_parameters.put("14", "");
		client_parameters.put("5", "8194");
		client_parameters.put("-1", "QlwePyRU5GcnAn1lr035ag");
		client_parameters.put("6", "0");
		client_parameters.put("24", "true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
		client_parameters.put("3", Settings.key);
		client_parameters.put("12", "false");
		client_parameters.put("13", "0");
		client_parameters.put("26", "0");
		client_parameters.put("9", "77");
		client_parameters.put("22", "false");
		client_parameters.put("18", "false");
		client_parameters.put("33", "");
		client_parameters.put("haveie6", "false");
	}

	void openFrame() {
		client_frame = new JFrame(Settings.FRAME_TITLE);
		client_frame.setLayout(new BorderLayout());
		client_panel.setLayout(new BorderLayout());
		client_panel.add(this);
		client_panel.setPreferredSize(new Dimension(765, 508));
		client_frame.getContentPane().add(client_panel, "Center");
		client_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			URL localURL = new URL("\\img\\img.png");
			BufferedImage localBufferedImage = ImageIO.read(localURL);
			client_frame.setIconImage(localBufferedImage);
		} catch (Exception localException) {
//			localException.printStackTrace();
		}
		client_frame.pack();
		client_frame.setVisible(true);
		client_frame.setLocationRelativeTo(null);

	}

	void startClient() {
		try {
			GameClient clnt = new GameClient();
			clnt.supplyApplet(this);
			clnt.init();
			clnt.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public String getParameter(String string) {
		return (String) client_parameters.get(string);
	}

	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://" + IP);
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}

}
