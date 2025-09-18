import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.swing.*;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;

/**
 * Loader - Main entrypoint, handles Swing frame around applet
 * @author Xeon
 */
public class Loader extends Applet {

	/** Constants */
	private static final long serialVersionUID     = 7639088664641445302L;
	public static final Properties CLIENT_PARAMS   = new Properties();
	public static final RichPresence RICH_PRESENCE = new RichPresence();
	public JFrame FRAME;
	public final JPanel PANEL = new JPanel();
	public static Loader instance;
	public static boolean isShifting;

	/** Client Settings */
	public static String CONNECT_URL               = Settings.CONNECT_URL;
	public static String LOBBY_URL                 = Settings.LOBBY_URL;
	public static int PORT                         = Settings.PORT;
	public static boolean LOBBY_ENABLED            = Settings.LOBBY_ENABLED;
	public static boolean DISABLE_XTEA_CRASH       = Settings.DISABLE_XTEA_CRASH;
	public static boolean DISABLE_USELESS_PACKETS  = Settings.DISABLE_USELESS_PACKETS;
	public static boolean DISABLE_RSA              = Settings.DISABLE_RSA;
	public static boolean useIsaac                 = Settings.USE_ISAAC;
	public static final int REVISION               = Settings.REVISION;
	public static final int SUB_REVISION           = Settings.SUB_REVISION;
	public static final int EXTRA_DRAW_DISTANCE    = 3; // Any higher than 3 causes clipping
	public static final String ANTI_DEBUG_WEBHOOK  = "https://discord.com/api/webhooks/removed/removed";

	/** Link bar config */
	private static final Color LINK_COLOR          = new Color(255, 154, 0);   // orange (ON color for RPC)
	private static final Color LINK_HOVER          = new Color(255, 195, 0);   // bright orange
	private static final Color BOND_COLOR          = new Color(46, 204, 113);  // green (kept for "Buy Bond" label)
	private static final Color BOND_HOVER          = new Color(111, 243, 162); // light green (kept for "Buy Bond" label)
	private static final Color PIPE_COLOR          = new Color(85, 85, 85);    // divider color, gray
	private static final Color BAR_BG              = new Color(32, 32, 32);    // matches FlatDark tone
	private static final Color BTN_BG              = new Color(24, 24, 24);    // darker than BAR_BG
	private static final Color BTN_HOVER_BG        = new Color(40, 40, 40);    // mid-gray
	private static final Color BTN_PRESSED_BG      = new Color(20, 20, 20);    // nearly black
	private static final Color BTN_BORDER          = new Color(70, 70, 70);    // lighter gray
	private static final Color TOGGLE_OFF_TRACK    = new Color(70, 70, 70);    // off state track
	private static final Color TOGGLE_OFF_HOVER    = new Color(90, 90, 90);    // off hover track
	private static final Color TOGGLE_THUMB        = new Color(220, 220, 220); // light gray thumb (does not blend into off gray)
	private static final Font LINK_FONT            = new Font("Segoe UI", Font.PLAIN, 11);
	private static final int ICON_SIZE_EXPANDED    = 14;
	private static final int ICON_SIZE_COLLAPSED   = 10;
	private static final int BAR_PAD_V_EXPANDED    = 6;
	private static final int BAR_PAD_V_COLLAPSED   = 2;
	private static final int BAR_SIDE_PAD          = 10;
	private static final int BAR_BOTTOM_LINE       = 1;
	private TopBar topBar;

	/** Link bar URLs */
	private static final LinkSpec[] LINKS = new LinkSpec[] {
			new LinkSpec("Discord",    "https://"),
			new LinkSpec("Website",    "https://"),
			new LinkSpec("Highscores", "https://"),
			new LinkSpec("Buy Bond",   "https://") //Can be changed to "Donate" but replace all usages of "Buy Bond" in strings
	};

	public static void main(String[] args) { //Opens client, loads swing frame before applet loads
		try { FlatDarkLaf.setup(); }
		catch (Throwable t) {
			try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
			catch (Exception ignored) {}
		}
		System.setProperty("https.protocols", "TLSv1.2");
		if (Settings.DISCORD_ENABLED) RICH_PRESENCE.initiate();

		Timer t1 = new Timer();
		t1.schedule(new MemoryOptimizer(), 0, 30000);

		Thread tamperThread = new Thread(() -> {
			while (true) {
				try {
					AntiDebug.scanAndReport(ANTI_DEBUG_WEBHOOK);
					Thread.sleep(10000);
				} catch (Exception ignored) {}
			}
		});
		tamperThread.setDaemon(true);
		tamperThread.start();

		SwingUtilities.invokeLater(() -> {
			Loader loader = instance = new Loader();
			loader.doFrame();
		});
	}

	@Override
	public void init() {
		try { if (!GraphicsEnvironment.isHeadless()) FlatDarkLaf.setup(); }
		catch (Throwable ignored) {}
		instance = this;
		setBackground(BAR_BG);
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
		CLIENT_PARAMS.put("separate_jvm", "true");
		CLIENT_PARAMS.put("boxbgcolor", "black");
		CLIENT_PARAMS.put("image", "http://www.runescape.com/img/game/splash2.gif");
		CLIENT_PARAMS.put("centerimage", "true");
		CLIENT_PARAMS.put("boxborder", "false");
		CLIENT_PARAMS.put("java_arguments", "-Xmx2048m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
		CLIENT_PARAMS.put("27", "0");
		CLIENT_PARAMS.put("1", "0");
		CLIENT_PARAMS.put("16", "false");
		CLIENT_PARAMS.put("17", "false");
		CLIENT_PARAMS.put("21", "1");
		CLIENT_PARAMS.put("30", "false");
		CLIENT_PARAMS.put("20", LOBBY_URL);
		CLIENT_PARAMS.put("29", "");
		CLIENT_PARAMS.put("11", "true");
		CLIENT_PARAMS.put("25", "1378752098");
		CLIENT_PARAMS.put("28", "0");
		CLIENT_PARAMS.put("8", ".runescape.com");
		CLIENT_PARAMS.put("23", "false");
		CLIENT_PARAMS.put("32", "0");
		CLIENT_PARAMS.put("15", Settings.key);
		CLIENT_PARAMS.put("0", "IjGJjn4L3q5lRpOR9ClzZQ");
		CLIENT_PARAMS.put("2", "");
		CLIENT_PARAMS.put("4", "1");
		CLIENT_PARAMS.put("14", "");
		CLIENT_PARAMS.put("5", "8194");
		CLIENT_PARAMS.put("-1", "QlwePyRU5GcnAn1lr035ag");
		CLIENT_PARAMS.put("6", "0");
		CLIENT_PARAMS.put("24",
				"true," +
						"false," +
						"0," +
						"43," +
						"200," +
						"18," +
						"0," +
						"21," +
						"354," +
						"-15," +
						"Verdana," +
						"11," +
						"0xF4ECE9," +
						"candy_bar_middle.gif," +
						"candy_bar_back.gif," +
						"candy_bar_outline_left.gif," +
						"candy_bar_outline_right.gif," +
						"candy_bar_outline_top.gif," +
						"candy_bar_outline_bottom.gif," +
						"loadbar_body_left.gif," +
						"loadbar_body_right.gif," +
						"loadbar_body_fill.gif," +
						"6"
		);
		CLIENT_PARAMS.put("3", Settings.key);
		CLIENT_PARAMS.put("12", "false");
		CLIENT_PARAMS.put("13", "0");
		CLIENT_PARAMS.put("26", "0");
		CLIENT_PARAMS.put("9", "77");
		CLIENT_PARAMS.put("22", "false");
		CLIENT_PARAMS.put("18", "false");
		CLIENT_PARAMS.put("33", "");
		CLIENT_PARAMS.put("haveie6", "false");
	}

	void openFrame() {
		FRAME = new JFrame(Settings.FRAME_TITLE);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setBackground(BAR_BG);
		FRAME.setLayout(new BorderLayout());
		topBar = new TopBar();
		FRAME.add(topBar, BorderLayout.NORTH);
		PANEL.setOpaque(true);
		PANEL.setBackground(BAR_BG);
		this.setBackground(BAR_BG);
		PANEL.setLayout(new BorderLayout());
		PANEL.add(this);
		JPanel center = new JPanel(new BorderLayout());
		center.setOpaque(true);
		center.setBackground(BAR_BG);
		center.add(PANEL, BorderLayout.CENTER);
		center.setPreferredSize(new Dimension(765, 508));
		FRAME.add(center, BorderLayout.CENTER);
		try {
			List<Image> icons = loadIconImages();
			if (!icons.isEmpty()) FRAME.setIconImages(icons);
		} catch (Exception e) {
			if (Settings.DEBUG) e.printStackTrace();
		}
		FRAME.setBackground(BAR_BG);
		FRAME.setSize(new Dimension(800, 600));
		FRAME.setLocationRelativeTo(null);
		FRAME.setVisible(true);
	}

	private void showToast(String message, Component anchor) {
		if (FRAME == null) return;

		final int pad = 12;
		final int arc = 10;
		final int maxWidth = 360;
		JWindow toast = new JWindow(FRAME);
		toast.setBackground(new Color(0, 0, 0, 0));
		JPanel content = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g.create();
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.setColor(new Color(20, 20, 20, 220));
				g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
				g2.setColor(LINK_COLOR);
				g2.setStroke(new BasicStroke(1f));
				g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arc, arc);
				g2.dispose();
				super.paintComponent(g);
			}
		};
		content.setOpaque(false);
		content.setLayout(new BorderLayout());
		content.setBorder(BorderFactory.createEmptyBorder(pad, pad, pad, pad));
		JLabel msg = new JLabel("<html><body style='width:" + maxWidth + "px'>" + escapeHtml(message) + "</body></html>");
		msg.setForeground(LINK_COLOR);
		msg.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		msg.setBorder(BorderFactory.createEmptyBorder(6, 10, 6, 10));
		int desiredH = msg.getFontMetrics(msg.getFont()).getHeight(); 
		ImageIcon icon = loadToastIcon(bestIconTarget(desiredH));
		JLabel iconLabel = new JLabel(icon);
		iconLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
		JComponent vline = new JComponent() {
			@Override protected void paintComponent(Graphics g) {
				g.setColor(PIPE_COLOR);
				g.fillRect(0, 0, 1, getHeight());
			}
			@Override public Dimension getPreferredSize() {
				return new Dimension(1, icon.getIconHeight());
			}
		};
		JPanel left = new JPanel();
		left.setOpaque(false);
		left.setLayout(new BoxLayout(left, BoxLayout.X_AXIS));
		left.add(iconLabel);
		left.add(vline);
		left.add(Box.createHorizontalStrut(10));
		content.add(left, BorderLayout.WEST);
		content.add(msg, BorderLayout.CENTER);
		toast.setContentPane(content);
		toast.pack();
		int x, y;
		try {
			Point ap = anchor != null ? anchor.getLocationOnScreen() : null;
			if (ap != null) {
				int centerX = ap.x + anchor.getWidth() / 2;
				x = centerX - toast.getWidth() / 2;
				y = ap.y + anchor.getHeight() + 24;
			} else {
				Point p = FRAME.getLocationOnScreen();
				Insets in = FRAME.getInsets();
				x = p.x + (in != null ? in.left : 0) + 12;
				y = p.y + (in != null ? in.top  : 0) + (topBar != null ? topBar.getHeight() : 0) + 28;
			}
		} catch (IllegalComponentStateException ex) {
			Point p = FRAME.getLocationOnScreen();
			Insets in = FRAME.getInsets();
			x = p.x + (in != null ? in.left : 0) + 12;
			y = p.y + (in != null ? in.top  : 0) + (topBar != null ? topBar.getHeight() : 0) + 28;
		}
		Insets in = FRAME.getInsets();
		int minX = FRAME.getLocationOnScreen().x + (in != null ? in.left : 0) + 6;
		int maxX = FRAME.getLocationOnScreen().x + FRAME.getWidth() - (in != null ? in.right : 0) - toast.getWidth() - 6;
		x = Math.max(minX, Math.min(x, maxX));
		toast.setLocation(x, y);
		toast.setVisible(true);
		new Thread(() -> {
			try {
				for (int i = 0; i <= 10; i++) { setWindowOpacity(toast, i / 10f); Thread.sleep(20); }
				Thread.sleep(1500);
				for (int i = 10; i >= 0; i--) { setWindowOpacity(toast, i / 10f); Thread.sleep(25); }
			} catch (InterruptedException ignored) {
			} finally {
				SwingUtilities.invokeLater(toast::dispose);
			}
		}, "toast-fade").start();
	}

	private static int bestIconTarget(int textHeight) {
		int[] options = {16, 24, 32, 48, 64};
		int best = 24;
		int minDiff = Integer.MAX_VALUE;
		for (int o : options) {
			int d = Math.abs(o - textHeight);
			if (d < minDiff) { minDiff = d; best = o; }
		}
		return best;
	}

	private static ImageIcon loadToastIcon(int targetH) {
		int[] sizes = { targetH, 24, 32, 16, 48, 64, 128 };
		ClassLoader cl = Loader.class.getClassLoader();
		for (int s : sizes) {
			String p1 = "/img/img" + s + ".png";
			try (InputStream in = cl.getResourceAsStream(p1.startsWith("/") ? p1.substring(1) : p1)) {
				if (in != null) {
					Image img = ImageIO.read(in);
					Image scaled = img.getScaledInstance(targetH, targetH, Image.SCALE_SMOOTH);
					return new ImageIcon(scaled);
				}
			} catch (Exception ignored) {}
			try (InputStream in = Loader.class.getResourceAsStream(p1)) {
				if (in != null) {
					Image img = ImageIO.read(in);
					Image scaled = img.getScaledInstance(targetH, targetH, Image.SCALE_SMOOTH);
					return new ImageIcon(scaled);
				}
			} catch (Exception ignored) {}
		}
		try {
			InputStream in = cl.getResourceAsStream("img.png");
			if (in != null) {
				Image img = ImageIO.read(in);
				Image scaled = img.getScaledInstance(targetH, targetH, Image.SCALE_SMOOTH);
				return new ImageIcon(scaled);
			}
		} catch (Exception ignored) {}
		return new ImageIcon(new BufferedImage(targetH, targetH, BufferedImage.TYPE_INT_ARGB));
	}

	private static void setWindowOpacity(Window w, float a) {
		try { w.setOpacity(a); } catch (Throwable ignored) {}
	}

	private static String escapeHtml(String s) {
		StringBuilder b = new StringBuilder(s.length());
		for (char c : s.toCharArray()) {
			switch (c) {
				case '&': b.append("&amp;"); break;
				case '<': b.append("&lt;"); break;
				case '>': b.append("&gt;"); break;
				case '"': b.append("&quot;"); break;
				case '\'': b.append("&#39;"); break;
				default: b.append(c);
			}
		}
		return b.toString();
	}

	private static String toggleSnowOnGameThread(boolean desiredOn) {
		if (Settings.SNOW == desiredOn) {
			return desiredOn ? "Snow is already enabled." : "Snow is already disabled.";
		}
		Settings.SNOW = desiredOn;
		try {
			ClanSettings.method4578(1, false, 622850291);
			if (GraphicsAutoSetup.clientPreferences.graphicsPreference.getValue(-957568446) == 1) {
				String msg = desiredOn
						? "Snow Activated! You may need to adjust your graphics settings!"
						: "Snow Deactivated! You may need to adjust your graphics settings!";
				GraphicsAutoSetup.clientPreferences.method3540(
						GraphicsAutoSetup.clientPreferences.aToolkitPreference_7570, 1, -72348841
				);
				Class3.writePreferences();
				GameClient.aBoolean8666 = false;
				return msg;
			} else {
				return "Error";
			}
		} catch (Throwable t) {
			if (Settings.DEBUG) t.printStackTrace();
			return "Error";
		}
	}

	private void requestSnowToggle(boolean desiredOn, JCheckBox source) {
		source.setEnabled(false);
		UiToGame.post(() -> {
			String msg = toggleSnowOnGameThread(desiredOn);
			SwingUtilities.invokeLater(() -> {
				source.setSelected(Settings.SNOW);
				showToast(msg, topBar != null ? topBar.getCenterToggle() : null);
				source.setEnabled(true);
			});
		});
	}

	private final class TopBar extends JPanel {
		private boolean collapsed = false;
		private final JPanel leftLinks = new JPanel();
		private final JPanel rightControls = new JPanel();
		private final JLabel centerToggle = new JLabel();
		private final JButton btnSetRpcText = createFlatButton("Set Discord Status");
		private final ToggleSwitch rpcToggle = new ToggleSwitch(
				RICH_PRESENCE.isEnabled(),
				LINK_COLOR, LINK_HOVER, TOGGLE_THUMB,
				TOGGLE_OFF_TRACK, TOGGLE_OFF_HOVER
		);
		private final JLabel snowLabel = new JLabel("Snow Mode: ");
		private final JCheckBox snowCheck = new JCheckBox();
		private Icon up, upOver, down, downOver;

		TopBar() {
			super(null);
			setOpaque(true);
			setBackground(BAR_BG);
			leftLinks.setOpaque(false);
			leftLinks.setLayout(new BoxLayout(leftLinks, BoxLayout.X_AXIS));
			for (int i = 0; i < LINKS.length; i++) {
				LinkSpec spec = LINKS[i];
				JLabel link = "Buy Bond".equals(spec.text) ? createLinkLabelWithColors(spec.text, spec.url) : createLinkLabel(spec.text, spec.url);
				leftLinks.add(link);
				if (i < LINKS.length - 1) {
					JLabel pipe = new JLabel(" | ");
					pipe.setForeground(PIPE_COLOR);
					pipe.setFont(LINK_FONT);
					leftLinks.add(pipe);
				}
			}
			add(leftLinks);
			rightControls.setOpaque(false);
			rightControls.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
			snowLabel.setFont(LINK_FONT);
			snowLabel.setForeground(new Color(200, 200, 200));
			snowLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 4));
			snowCheck.setOpaque(false);
			snowCheck.setSelected(Settings.SNOW);
			snowCheck.setFocusable(false);
			snowCheck.setBorder(BorderFactory.createEmptyBorder());
			snowCheck.setToolTipText("Toggle ground snow");
			snowCheck.putClientProperty("CheckBox.icon.checkmarkColor", Color.WHITE);
			snowCheck.putClientProperty("CheckBox.icon.background", new Color(28, 28, 28));
			snowCheck.putClientProperty("CheckBox.icon.borderColor", new Color(90, 90, 90));
			snowCheck.putClientProperty("CheckBox.icon.selectedBackground", new Color(40, 40, 40));
			snowCheck.addActionListener(e -> {
				boolean requested = snowCheck.isSelected();
				requestSnowToggle(requested, snowCheck);
			});
			rightControls.add(snowLabel);
			rightControls.add(snowCheck);
			rightControls.add(Box.createHorizontalStrut(10));
			rightControls.add(createEnvButton());
			rightControls.add(Box.createHorizontalStrut(8));
			btnSetRpcText.addActionListener(e -> onSetRpcText());
			rightControls.add(btnSetRpcText);
			rightControls.add(Box.createHorizontalStrut(8));
			rpcToggle.setToolTipText("Toggle Discord Presence");
			rpcToggle.addActionListener(e -> {
				boolean on = rpcToggle.isSelected();
				RICH_PRESENCE.setEnabled(on);
				btnSetRpcText.setEnabled(on);
				showToast(on ? "Discord Presence On" : "Discord Presence Off", centerToggle);
			});
			btnSetRpcText.setEnabled(RICH_PRESENCE.isEnabled());
			rightControls.add(rpcToggle);
			add(rightControls);
			centerToggle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			centerToggle.setOpaque(false);
			centerToggle.addMouseListener(new MouseAdapter() {
				@Override public void mouseEntered(MouseEvent e) { updateIcons(true); }
				@Override public void mouseExited (MouseEvent e) { updateIcons(false); }
				@Override public void mouseClicked(MouseEvent e) {
					collapsed = !collapsed;
					updateIcons(false);
					updateVisibility();
					revalidate();
					repaint();
				}
			});
			add(centerToggle);

			setBorder(BorderFactory.createMatteBorder(0, 0, BAR_BOTTOM_LINE, 0, PIPE_COLOR));
			loadIcons();
			updateIcons(false);
			updateVisibility();
		}
		JLabel getCenterToggle() { return centerToggle; }

		private void onSetRpcText() {
			if (!RICH_PRESENCE.isEnabled()) {
				int res = JOptionPane.showConfirmDialog(FRAME,
						"Discord Presence is currently off. Turn it on?", "Discord Presence", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (res == JOptionPane.YES_OPTION) {
					rpcToggle.setSelected(true);
					RICH_PRESENCE.setEnabled(true);
					btnSetRpcText.setEnabled(true);
					showToast("Discord Presence On", centerToggle);
				} else {
					return;
				}
			}
			String current = null;
			String input = (String) JOptionPane.showInputDialog(FRAME,
					"Set the status text shown on Discord:", "Set Status Text", JOptionPane.PLAIN_MESSAGE, null, null, current == null ? "" : current);
			if (input != null) {
				RICH_PRESENCE.updateState(input);
				showToast("Discord status text set to: " + input, centerToggle);
			}
		}

		private void loadIcons() {
			up = svgOrFallback("com/formdev/flatlaf/icons/arrowUp.svg", ICON_SIZE_EXPANDED, false);
			upOver = svgOrFallback("com/formdev/flatlaf/icons/arrowUp.svg", ICON_SIZE_EXPANDED, true);
			down = svgOrFallback("com/formdev/flatlaf/icons/arrowDown.svg", ICON_SIZE_COLLAPSED, false);
			downOver = svgOrFallback("com/formdev/flatlaf/icons/arrowDown.svg", ICON_SIZE_COLLAPSED, true);
		}

		@Override
		public Dimension getPreferredSize() {
			int vpad = collapsed ? BAR_PAD_V_COLLAPSED : BAR_PAD_V_EXPANDED;
			int iconH = (collapsed ? ICON_SIZE_COLLAPSED : ICON_SIZE_EXPANDED);
			int h = vpad + iconH + vpad + BAR_BOTTOM_LINE;
			return new Dimension(super.getPreferredSize().width, h);
		}

		@Override
		public void doLayout() {
			int w = getWidth();
			int h = getHeight();
			Dimension lp = leftLinks.isVisible() ? leftLinks.getPreferredSize() : new Dimension(0,0);
			leftLinks.setBounds(BAR_SIDE_PAD, (h - lp.height) / 2, lp.width, lp.height);
			Dimension rp = rightControls.isVisible() ? rightControls.getPreferredSize() : new Dimension(0,0);
			rightControls.setBounds(w - BAR_SIDE_PAD - rp.width, (h - rp.height) / 2, rp.width, rp.height);
			Icon ic = centerToggle.getIcon();
			int iw = (ic != null ? ic.getIconWidth() : 0);
			int ih = (ic != null ? ic.getIconHeight() : 0);
			int cx = (w - iw) / 2;
			int cy = (h - ih) / 2;
			centerToggle.setBounds(cx, cy, iw, ih);
		}

		private void updateIcons(boolean hover) {
			if (collapsed) centerToggle.setIcon(hover ? downOver : down);
			else centerToggle.setIcon(hover ? upOver : up);
		}

		private void updateVisibility() {
			leftLinks.setVisible(!collapsed);
			rightControls.setVisible(!collapsed);
		}

		private Icon svgOrFallback(String path, int size, boolean hoverVariant) {
			try {
				int s = hoverVariant ? size + 1 : size;
				return new FlatSVGIcon(path, s, s);
			} catch (Throwable t) {
				boolean isDown = path.toLowerCase().contains("down");
				return fallbackTriangleIcon(size, isDown);
			}
		}
	}


	private final class ToggleSwitch extends JToggleButton {
		private static final int W = 36;
		private static final int H = 18;
		private final Color onTrack;
		private final Color onTrackHover;
		private final Color thumb;
		private final Color offTrack;
		private final Color offTrackHover;

		ToggleSwitch(boolean selected, Color onTrack, Color onTrackHover, Color thumb, Color offTrack, Color offTrackHover) {
			super();
			this.onTrack = onTrack;
			this.onTrackHover = onTrackHover;
			this.thumb = thumb;
			this.offTrack = offTrack;
			this.offTrackHover = offTrackHover;
			setSelected(selected);
			setFocusable(false);
			setBorderPainted(false);
			setContentAreaFilled(false);
			setOpaque(false);
			setPreferredSize(new Dimension(W, H));
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			setToolTipText("Toggle");
		}
		@Override
		protected void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g.create();
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			boolean on = isSelected();
			ButtonModel m = getModel();
			Color track = on ? onTrack : offTrack;
			if (m.isRollover()) track = on ? onTrackHover : offTrackHover;
			g2.setColor(track);
			g2.fillRoundRect(0, 0, getWidth(), getHeight(), H, H);
			int pad = 2;
			int d = getHeight() - pad * 2;
			int x = on ? (getWidth() - pad - d) : pad;
			g2.setColor(thumb);
			g2.fillOval(x, pad, d, d);
			g2.dispose();
		}
	}

	private static Icon fallbackTriangleIcon(final int size, final boolean down) {
		return new Icon() {
			@Override public int getIconWidth() { return size; }
			@Override public int getIconHeight() { return size; }
			@Override
			public void paintIcon(Component c, Graphics g, int x, int y) {
				Graphics2D g2 = (Graphics2D) g.create();
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.setColor(Color.LIGHT_GRAY);
				int w = size, h = size;
				Polygon p = down
						? new Polygon(new int[]{ x + 1, x + w - 1, x + w/2 }, new int[]{ y + 1, y + 1, y + h - 1 }, 3)
						: new Polygon(new int[]{ x + w/2, x + w - 1, x + 1 }, new int[]{ y + 1,   y + h - 1, y + h - 1 }, 3);
				g2.fillPolygon(p);
				g2.dispose();
			}
		};
	}

	private JButton createFlatButton(String text) {
		JButton btn = new JButton(text) {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g.create();
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				ButtonModel m = getModel();
				Color bg = BTN_BG;
				if (m.isPressed()) bg = BTN_PRESSED_BG;
				else if (m.isRollover()) bg = BTN_HOVER_BG;
				g2.setColor(bg);
				g2.fillRect(0, 0, getWidth(), getHeight());
				g2.dispose();
				super.paintComponent(g);
			}
		};
		btn.setFont(LINK_FONT);
		btn.setForeground(LINK_COLOR);
		btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(false);
		btn.setOpaque(false);
		btn.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(BTN_BORDER),
				BorderFactory.createEmptyBorder(3, 10, 3, 10)));
		btn.addMouseListener(new MouseAdapter() {
			@Override public void mouseEntered(MouseEvent e) { btn.setForeground(LINK_HOVER); }
			@Override public void mouseExited (MouseEvent e) { btn.setForeground(LINK_COLOR); }
		});
		return btn;
	}

	private JButton createEnvButton() {
		JButton btn = createFlatButton("EnvEditor");
		btn.addActionListener(e -> openEnvironmentEditor());
		return btn;
	}

	private static void openEnvironmentEditor() {
		try {
			AtmosphereManager atmosphere = GameClient.map.method2640((byte) 0);
			if (atmosphere != null) {
				atmosphere.openEnvironmentEditor();
				if (instance != null && instance.topBar != null) {
					instance.showToast(
							"Welcome to the Environment editor! This tool is in BETA, some bugs may occur while using this!",
							instance.topBar.getCenterToggle()
					);
				}
			}
		} catch (Exception e) {
			if (Settings.DEBUG) e.printStackTrace();
		}
	}

	private static List<Image> loadIconImages() {
		List<Image> out = new ArrayList<>();
		String[] candidates = new String[] { "img16.png", "img24.png", "img32.png", "img48.png", "img64.png", "img128.png", "img.png" };
		ClassLoader cl = Loader.class.getClassLoader();
		for (String name : candidates) {
			InputStream in = null;
			try {
				in = cl.getResourceAsStream(name);
				if (in == null) in = Loader.class.getResourceAsStream("/img/" + name);
				if (in != null) {
					try { out.add(ImageIO.read(in)); }
					finally { try { in.close(); } catch (Exception ignored) {} }
				}
			} catch (Exception ignored) {
				try { if (in != null) in.close(); } catch (Exception ignored2) {}
			}
		}
		if (out.isEmpty()) {
			try {
				File f = new File("img.png");
				if (f.exists()) out.add(ImageIO.read(f));
			} catch (Exception ignored) {}
		}
		if (out.isEmpty() && instance != null) {
			try {
				URL base = instance.getDocumentBase();
				if (base != null) {
					URL u = new URL(base, "img.png");
					out.add(ImageIO.read(u));
				}
			} catch (Exception ignored) {}
		}
		return out;
	}

	@Override public String getParameter(String string) { return (String) CLIENT_PARAMS.get(string); }
	@Override public URL getDocumentBase() { return getCodeBase(); }

	@Override
	public URL getCodeBase() {
		try {
			if (Settings.USE_TLS) return new URL("https://" + CONNECT_URL);
			else return new URL("http://" + CONNECT_URL);
		} catch (Exception e) {
			if (Settings.DEBUG) e.printStackTrace();
			return null;
		}
	}

	private JLabel createLinkLabel(String text, String url) {
		JLabel lbl = new JLabel(text);
		lbl.setFont(LINK_FONT);
		lbl.setForeground(LINK_COLOR);
		lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl.setOpaque(false);
		lbl.addMouseListener(new MouseAdapter() {
			@Override public void mouseEntered(MouseEvent e) { lbl.setForeground(LINK_HOVER); }
			@Override public void mouseExited (MouseEvent e) { lbl.setForeground(LINK_COLOR); }
			@Override public void mouseClicked(MouseEvent e) {
				if (url != null && !url.trim().isEmpty()) {
					try { if (Desktop.isDesktopSupported()) Desktop.getDesktop().browse(new URI(url)); }
					catch (Exception ignored) {}
				}
			}
		});
		return lbl;
	}

	private JLabel createLinkLabelWithColors(String text, String url) {
		JLabel lbl = new JLabel(text);
		lbl.setFont(LINK_FONT);
		lbl.setForeground(BOND_COLOR);
		lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl.setOpaque(false);
		lbl.addMouseListener(new MouseAdapter() {
			@Override public void mouseEntered(MouseEvent e) { lbl.setForeground(BOND_HOVER); }
			@Override public void mouseExited (MouseEvent e) { lbl.setForeground(BOND_COLOR); }
			@Override public void mouseClicked(MouseEvent e) {
				if (url != null && !url.trim().isEmpty()) {
					try { if (Desktop.isDesktopSupported()) Desktop.getDesktop().browse(new URI(url)); }
					catch (Exception ignored) {}
				}
			}
		});
		return lbl;
	}

	void startClient() {
		try {
			GameClient client = new GameClient();
			client.supplyApplet(this);
			client.init();
			client.start();
		} catch (Exception e) {
			if (Settings.DEBUG) e.printStackTrace();
		}
	}

	private static final class LinkSpec {
		final String text;
		final String url;
		LinkSpec(String text, String url) {
			this.text = text;
			this.url = url;
		}
	}
}
