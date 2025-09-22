import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.URI;
import java.util.List;
import java.util.*;
import java.util.function.Consumer;
import java.nio.file.Files;

public class EnvEditorPanel extends JPanel {
    private static final Color ORANGE = new Color(255, 154, 0);
    private static final Color YELLOW = new Color(255, 195, 0);
    private static final Color PIPE_COLOR = new Color(85, 85, 85);
    private static final Color BAR_BG = new Color(32, 32, 32);
    private static final Color BTN_BG = new Color(24, 24, 24);
    private static final Color BTN_HOVER_BG = new Color(40, 40, 40);
    private static final Color BTN_PRESSED_BG = new Color(20, 20, 20);
    private static final Color BTN_BORDER = new Color(70, 70, 70);
    private static final Color GREEN = new Color(46, 204, 113);
    private static final Color LIGHT_GREEN = new Color(111, 243, 162);
    private static final Color SLIDER_TRACK_OFF = new Color(70, 70, 70);
    private static final Color SLIDER_TRACK_ON = ORANGE;
    private static final Color SLIDER_THUMB = Color.WHITE;
    private static final Color OFFWHITE = new Color(235, 235, 235);

    private static final Font FONT = new Font("Segoe UI", Font.PLAIN, 11);
    private static final Dimension FIXED_CLIENT_AREA = new Dimension(765, 503);
    private final AtmosphereManager manager;
    private final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    private final JComboBox<String> combo;
    private final JButton btnSave;
    private final JButton btnDelete;
    private final JButton btnExport;
    private final JButton btnImport;
    private final JButton btnReset;
    private final JButton btnApply;
    private final JCheckBox chkLive;

    private final JButton btnHelp;
    private HelpWindow helpWindow;

    private final JSlider sR, sG, sB;
    private final JTextField sunHex;
    private final JSlider fR, fG, fB, fogDist;
    private final JTextField fogHex;
    private final JSlider yawSlider, pitchSlider;
    private final JSlider fl4130, fl4131, fl4137, fl4132, fl4138, fl4139;
    private final JSlider skyIdSlider, un1Slider, un2Slider, un3Slider, un4Slider;

    private final float initialF4130, initialF4131, initialF4137, initialF4132, initialF4138, initialF4139;
    private final float initialYaw, initialPitch;

    private final int defaultColorSun, defaultColorFog, defaultFogNear, defaultFogFar;
    private final int openColorSun, openColorFog, openFogNear, openFogFar;

    private final int initSkyId, initUn1, initUn2, initUn3, initUn4;
    private boolean suppressLive = false;

    private float lastScale = 1f;
    private final Font labelFontBig;
    private final Font labelFontSmall;

    public EnvEditorPanel(AtmosphereManager manager) {
        super(new BorderLayout());
        setOpaque(true);
        setBackground(BAR_BG);
        this.manager = manager;
        manager.setEditorActive(true);
        defaultColorSun = manager.getDefaultSunColor();
        defaultColorFog = manager.getDefaultFogColor();
        defaultFogNear = manager.getDefaultFogNear();
        defaultFogFar = manager.getDefaultFogFar();
        openColorSun = manager.getCurrentAtmosphere((byte)0).sunColor;
        openColorFog = manager.getCurrentAtmosphere((byte)0).fogColor;
        openFogNear  = manager.getCurrentAtmosphere((byte)0).fogNearDistance;
        openFogFar = defaultFogFar;
        initialF4130 = manager.currentAtmosphere.sunIntensity;
        initialF4131 = manager.currentAtmosphere.shadowIntensity;
        initialF4137 = manager.currentAtmosphere.diffusion;
        initialF4132 = manager.currentAtmosphere.fogIntensity;
        initialF4138 = manager.currentAtmosphere.ambientLight;
        initialF4139 = manager.currentAtmosphere.sunBrightness;
        initialYaw  = manager.sunDirection.x;
        initialPitch = manager.sunDirection.y;
        initSkyId = manager.getOverrideSkyId();
        initUn1 = manager.getOverrideParam1();
        initUn2 = manager.getOverrideParam2();
        initUn3 = manager.getOverrideParam3();
        initUn4 = manager.getOverrideParam4();

        Font base = UIManager.getFont("Label.font");
        if (base == null) base = new Font("Dialog", Font.PLAIN, 12);
        labelFontBig = base.deriveFont(14f);
        labelFontSmall = base.deriveFont(12f);
        combo = new JComboBox<>(presetNames());
        combo.setFont(labelFontBig);
        tintCombo(combo);

        btnSave = Loader.createFlatButton("Save Preset");
        btnDelete = Loader.createFlatButton("Delete Preset");
        btnExport = Loader.createFlatButton("Export Preset");
        btnImport = Loader.createFlatButton("Import Preset");

        chkLive = new JCheckBox("Live Preview", true);
        chkLive.setFont(labelFontBig);
        tintCheck(chkLive);

        btnHelp = createGreenLinkButton("Help");
        btnHelp.setToolTipText("Open/Close Environment Editor Help");

        JPanel presetRow = new JPanel();
        presetRow.setOpaque(true);
        presetRow.setBackground(BAR_BG);
        presetRow.setLayout(new GridBagLayout());
        GridBagConstraints pc = new GridBagConstraints();
        pc.insets = new Insets(4, 6, 4, 6);
        pc.gridy = 0;
        pc.gridx = 0; pc.weightx = 0.5; pc.fill = GridBagConstraints.HORIZONTAL; presetRow.add(btnSave, pc);
        pc.gridx = 1; pc.weightx = 0.5; presetRow.add(btnDelete, pc);
        pc.gridy = 1; pc.gridx = 0; pc.weightx = 0.5; presetRow.add(btnExport, pc);
        pc.gridx = 1; pc.weightx = 0.5; presetRow.add(btnImport, pc);
        pc.gridy = 2; pc.gridx = 0; pc.gridwidth = 2; pc.weightx = 1; pc.fill = GridBagConstraints.HORIZONTAL;
        JPanel presetLine = new JPanel(new BorderLayout(6, 0));
        presetLine.setOpaque(false);
        JLabel lblPreset = lblCategorySmall("Preset:");
        presetLine.add(lblPreset, BorderLayout.WEST);
        presetLine.add(combo, BorderLayout.CENTER);
        presetRow.add(presetLine, pc);
        pc.gridwidth = 1;
        pc.gridy = 3; pc.gridx = 0; pc.gridwidth = 2; pc.weightx = 1; pc.fill = GridBagConstraints.HORIZONTAL;
        JPanel liveWrap = new JPanel(new GridBagLayout());
        liveWrap.setOpaque(true);
        liveWrap.setBackground(BAR_BG);
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.weightx = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(0, 0, 0, 6);
        btnHelp.setHorizontalAlignment(SwingConstants.CENTER);
        //btnHelp.setVerticalAlignment(SwingConstants.CENTER);
        liveWrap.add(btnHelp, gc);
        gc = new GridBagConstraints();
        gc.gridx = 1;
        gc.weightx = 0;
        gc.anchor = GridBagConstraints.EAST;
        liveWrap.add(chkLive, gc);
        presetRow.add(liveWrap, pc);
        pc.gridwidth = 1;
        presetRow.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, PIPE_COLOR));
        add(presetRow, BorderLayout.NORTH);

        VerticalScrollPanel main = new VerticalScrollPanel();
        int cr = clamp((openColorSun >> 16) & 0xFF, 0, 255);
        int cg = clamp((openColorSun >> 8) & 0xFF, 0, 255);
        int cb = clamp(openColorSun & 0xFF,0 ,255);

        JPanel sunPanel = titledPanel("Sun Color", false);
        ShadowLabel lSR = rgbLabel("RED:", new Color(220, 64, 64));
        ShadowLabel lSG = rgbLabel("GREEN:", new Color(64, 200, 64));
        ShadowLabel lSB = rgbLabel("BLUE:", new Color(64, 128, 255));
        JLabel lSunHex = lblCategorySmall("Hex:");
        sR = new JSlider(0,255,cr);
        sG = new JSlider(0,255,cg);
        sB = new JSlider(0,255,cb);
        tintSlider(sR, new Color(220, 64, 64), SLIDER_THUMB, OFFWHITE);
        tintSlider(sG, new Color(64, 200, 64), SLIDER_THUMB, OFFWHITE);
        tintSlider(sB, new Color(64, 128, 255), SLIDER_THUMB, OFFWHITE);
        setSliderFont(labelFontBig, sR,sG,sB);
        sunHex = new JTextField(String.format("#%02X%02X%02X",cr,cg,cb),8);
        tintTextField(sunHex);
        sunHex.setFont(labelFontBig);
        addKV(sunPanel, lSR, sR);
        addKV(sunPanel, lSG, sG);
        addKV(sunPanel, lSB, sB);
        addKV(sunPanel, lSunHex, sunHex);
        main.add(sunPanel);
        main.add(Box.createVerticalStrut(4));
        int fr = clamp((openColorFog >> 16) & 0xFF, 0, 255);
        int fg = clamp((openColorFog >> 8) & 0xFF, 0, 255);
        int fb = clamp( openColorFog & 0xFF, 0, 255);

        JPanel fogPanel = titledPanel("Fog", true);
        ShadowLabel lFR = rgbLabel("RED:", new Color(220, 64, 64));
        ShadowLabel lFG = rgbLabel("GREEN:", new Color(64, 200, 64));
        ShadowLabel lFB = rgbLabel("BLUE:", new Color(64, 128, 255));
        JLabel lFogHex  = lblCategorySmall("Hex:");
        JLabel lFogDist = lblCategorySmall("Fog Far:");
        fR = new JSlider(0,255,fr);
        fG = new JSlider(0,255,fg);
        fB = new JSlider(0,255,fb);
        tintSlider(fR, new Color(220, 64, 64), SLIDER_THUMB, OFFWHITE);
        tintSlider(fG, new Color(64, 200, 64), SLIDER_THUMB, OFFWHITE);
        tintSlider(fB, new Color(64, 128, 255), SLIDER_THUMB, OFFWHITE);
        setSliderFont(labelFontBig, fR,fG,fB);
        fogHex = new JTextField(String.format("#%02X%02X%02X",fr,fg,fb),8);
        tintTextField(fogHex);
        fogDist = new JSlider(0,15000, clamp(openFogFar,0,15000));
        fogDist.setFont(labelFontBig);
        tintSlider(fogDist, SLIDER_TRACK_ON, SLIDER_THUMB, OFFWHITE);
        addKV(fogPanel, lFR, fR);
        addKV(fogPanel, lFG, fG);
        addKV(fogPanel, lFB, fB);
        addKV(fogPanel, lFogHex, fogHex);
        addKV(fogPanel, lFogDist, fogDist);
        main.add(fogPanel);
        main.add(Box.createVerticalStrut(4));

        JPanel dirPanel = titledPanel("Sun Direction", false);
        JLabel lYaw   = lblCategorySmall("Yaw:");
        JLabel lPitch = lblCategorySmall("Pitch:");
        yawSlider = new JSlider(-180, 180, clamp((int)initialYaw, -180, 180));
        yawSlider.setPaintTicks(true);
        yawSlider.setPaintLabels(true);
        yawSlider.setFont(labelFontBig);
        tintSlider(yawSlider, SLIDER_TRACK_ON, SLIDER_THUMB, ORANGE);
        pitchSlider = new JSlider(-45, 45, clamp((int)initialPitch, -45, 45));
        pitchSlider.setPaintTicks(true);
        pitchSlider.setPaintLabels(true);
        pitchSlider.setFont(labelFontBig);
        tintSlider(pitchSlider, SLIDER_TRACK_ON, SLIDER_THUMB, ORANGE);
        applyTickDensity(getWidth());
        addKV(dirPanel, lYaw, yawSlider);
        addKV(dirPanel, lPitch, pitchSlider);
        main.add(dirPanel);
        main.add(Box.createVerticalStrut(4));

        JPanel advPanel = titledPanel("Advanced", true);
        fl4130 = makeFloatSlider("Sun Intensity", initialF4130,0f,3f,100, advPanel,"Sun intensity", labelFontSmall);
        fl4131 = makeFloatSlider("Shadow Intensity", initialF4131,0f,1f,100, advPanel,"Shadow intensity", labelFontSmall);
        fl4137 = makeFloatSlider("Diffusion", initialF4137,0f,1f,100, advPanel,"Diffusion", labelFontSmall);
        fl4132 = makeFloatSlider("Fog Intensity", initialF4132,0f,3f,100, advPanel,"Fog intensity", labelFontSmall);
        fl4138 = makeFloatSlider("Ambient Light", initialF4138,0f,1f,100, advPanel,"Ambient light", labelFontSmall);
        fl4139 = makeFloatSlider("Sun Brightness", initialF4139,0f,1f,100, advPanel,"Sun brightness", labelFontSmall);
        for (JSlider s : new JSlider[]{fl4130, fl4131, fl4137, fl4132, fl4138, fl4139}) tintSlider(s, SLIDER_TRACK_ON, SLIDER_THUMB, OFFWHITE);
        main.add(advPanel);
        main.add(Box.createVerticalStrut(4));

        JPanel skyboxPanel = titledPanel("Skybox Settings", true);
        JLabel lSkyId = lblCategorySmall("Skyboxes:");
        skyIdSlider = new JSlider(0, 10, clamp(initSkyId, 0, 10)); skyIdSlider.setFont(labelFontBig);
        tintSlider(skyIdSlider, SLIDER_TRACK_ON, SLIDER_THUMB, OFFWHITE);
        addKV(skyboxPanel, lSkyId, skyIdSlider);
        JLabel lUn1 = lblCategorySmall("Rotation:");
        un1Slider = new JSlider(0, 255, clamp(initUn1,0,255)); un1Slider.setFont(labelFontBig);
        tintSlider(un1Slider, SLIDER_TRACK_ON, SLIDER_THUMB, OFFWHITE);
        addKV(skyboxPanel, lUn1, un1Slider);
        JLabel lUn2 = lblCategorySmall("Color:");
        un2Slider = new JSlider(0, 255, clamp(initUn2,0,255)); un2Slider.setFont(labelFontBig);
        tintSlider(un2Slider, SLIDER_TRACK_ON, SLIDER_THUMB, OFFWHITE);
        addKV(skyboxPanel, lUn2, un2Slider);
        JLabel lUn3 = lblCategorySmall("Brightness:");
        un3Slider = new JSlider(0, 255, clamp(initUn3,0,255)); un3Slider.setFont(labelFontBig);
        tintSlider(un3Slider, SLIDER_TRACK_ON, SLIDER_THUMB, OFFWHITE);
        addKV(skyboxPanel, lUn3, un3Slider);
        JLabel lUn4 = lblCategorySmall("Contrast:");
        un4Slider = new JSlider(0, 255, clamp(initUn4,0,255)); un4Slider.setFont(labelFontBig);
        tintSlider(un4Slider, SLIDER_TRACK_ON, SLIDER_THUMB, OFFWHITE);
        addKV(skyboxPanel, lUn4, un4Slider);
        main.add(skyboxPanel);

        main.add(Box.createVerticalStrut(4));
        JScrollPane scroll = new JScrollPane(main);
        scroll.setBorder(BorderFactory.createLineBorder(PIPE_COLOR));
        scroll.setBackground(BAR_BG);
        scroll.getViewport().setBackground(BAR_BG);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.getVerticalScrollBar().setUnitIncrement(48);
        scroll.getVerticalScrollBar().setBlockIncrement(192);
        add(scroll, BorderLayout.CENTER);
        JPanel bottom = new JPanel(new BorderLayout());
        bottom.setOpaque(true);
        bottom.setBackground(BAR_BG);
        bottom.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, PIPE_COLOR));
        JPanel btnRow = new JPanel(new FlowLayout(FlowLayout.RIGHT, 6, 6));
        btnRow.setOpaque(true);
        btnRow.setBackground(BAR_BG);

        btnReset = Loader.createFlatButton("Reset");
        btnApply = Loader.createFlatButton("Apply");
        btnRow.add(btnReset);
        btnRow.add(btnApply);
        bottom.add(btnRow, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        btnHelp.addActionListener(e -> toggleHelp());

        Timer debounce = new Timer(250, e -> {
            if (chkLive.isSelected()) btnApply.doClick();
        });
        debounce.setRepeats(false);
        ChangeListener liveListener = e -> {
            if (!suppressLive && chkLive.isSelected()) debounce.restart();
        };
        pitchSlider.addChangeListener(e -> {
            if (!pitchSlider.getValueIsAdjusting() && chkLive.isSelected()) btnApply.doClick();
        });
        for (JSlider slider : new JSlider[]{
                sR, sG, sB, fR(), fG(), fB(), fogDist, fl4130, fl4131, fl4137, fl4132, fl4138, fl4139, yawSlider,
                pitchSlider, skyIdSlider, un1Slider, un2Slider, un3Slider, un4Slider
        }) {
            slider.addChangeListener(liveListener);
        }

        sunHex.addActionListener(e -> {
            try {
                String t = sunHex.getText().replace("#","");
                int col = Integer.parseInt(t,16);
                sR.setValue((col>>16)&0xFF);
                sG.setValue((col>>8)&0xFF);
                sB.setValue(col&0xFF);
            } catch(Exception ignored){}
            debounce.restart();
        });

        fogHex.addActionListener(e -> {
            try {
                String t = fogHex.getText().replace("#","");
                int col = Integer.parseInt(t,16);
                fR().setValue((col>>16)&0xFF);
                fG().setValue((col>>8)&0xFF);
                fB().setValue(col&0xFF);
            } catch(Exception ignored){}
            debounce.restart();
        });

        ChangeListener skyListener = e -> {
            manager.setOverrideSkyId(skyIdSlider.getValue());
            manager.setOverrideParam1(un1Slider.getValue());
            manager.setOverrideParam2(un2Slider.getValue());
            manager.setOverrideParam3(un3Slider.getValue());
            manager.setOverrideParam4(un4Slider.getValue());
            Packet pkt = new Packet(10);
            pkt.writeShort(skyIdSlider.getValue(), 0);
            pkt.writeShort(un1Slider.getValue(), 0);
            pkt.writeShort(un2Slider.getValue(), 0);
            pkt.writeShort(un3Slider.getValue(), 0);
            pkt.writeShort(un4Slider.getValue(), 0);
            manager.queueRebuildAllSkyboxes(pkt);
        };
        skyIdSlider.addChangeListener(skyListener);
        un1Slider .addChangeListener(skyListener);
        un2Slider .addChangeListener(skyListener);
        un3Slider .addChangeListener(skyListener);
        un4Slider .addChangeListener(skyListener);

        btnApply.addActionListener(e -> applyFromUIToEngine());
        btnReset.addActionListener(e -> {
            suppressLive = true;
            UiToGame.post(() -> { //reload GL toolkit the same way the "tk#" console command does.
                try {             //TODO DirectX TK reload support
                    ClanSettings.method4578(1, false, 622850291);
                    if (GraphicsSetup.clientPreferences.graphicsPreference.getValue(-957568446) == 1) {
                        GraphicsSetup.clientPreferences.method3540(GraphicsSetup.clientPreferences.aToolkitPreference_7570, 1, -72348841);
                        Class3.writePreferences();
                        GameClient.aBoolean8666 = false;
                    }
                    manager.resetToDefaultsPublic();
                } finally {
                    SwingUtilities.invokeLater(() -> {
                        repopulateFromManagerDefaults();
                        suppressLive = false;
                        if (chkLive.isSelected()) btnApply.doClick();
                    });
                }
            });
        });

        combo.addActionListener(e -> {
            String name = (String) combo.getSelectedItem();
            if (name == null || !manager.getPresetsView().containsKey(name)) return;
            EnvPreset p = manager.getPresetsView().get(name);
            if (p != null) loadPresetIntoUIAndApply(p);
        });

        btnSave.addActionListener(e -> onSavePreset());
        btnDelete.addActionListener(e -> onDeletePreset());
        btnExport.addActionListener(e -> onExportPreset());
        btnImport.addActionListener(e -> onImportPreset());

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                float scale = Math.max(0.9f, Math.min(1.4f, getWidth() / 500f));
                if (Math.abs(scale - lastScale) > 0.05f) {
                    lastScale = scale;
                    applyScale(scale);
                }
                applyTickDensity(getWidth());
                revalidate();
                repaint();

                if (helpWindow != null && helpWindow.isVisible()) {
                    helpWindow.recenter(isFixedMode());
                }
            }
        });
    }

    private void toggleHelp() {
        if (helpWindow != null && helpWindow.isVisible()) {
            helpWindow.close();
            return;
        }
        if (helpWindow == null) helpWindow = new HelpWindow();
        helpWindow.open(isFixedMode());
    }

    private String[] presetNames() {
        return manager.getPresetsView().keySet().toArray(new String[0]);
    }

    private void refreshPresetCombo(String select) {
        suppressLive = true;
        String prev = (String) combo.getSelectedItem();
        combo.setModel(new DefaultComboBoxModel<>(presetNames()));
        if (select != null) combo.setSelectedItem(select);
        else if (prev != null) combo.setSelectedItem(prev);
        suppressLive = false;
    }

    private EnvPreset currentUIToPreset(String name) {
        EnvPreset p = new EnvPreset(name);
        p.sunColor = (sR.getValue()<<16)|(sG.getValue()<<8)|sB.getValue();
        p.fogColor = (fR().getValue()<<16)|(fG().getValue()<<8)|fB().getValue();
        p.fogFar = fogDist.getValue();
        p.fogNear = manager.getDefaultFogNear();
        p.sunIntensity = fl4130.getValue()/100f;
        p.shadowIntensity = fl4131.getValue()/100f;
        p.diffusion  = fl4137.getValue()/100f;
        p.fogIntensity = fl4132.getValue()/100f;
        p.ambientLight = fl4138.getValue()/100f;
        p.sunBrightness = fl4139.getValue()/100f;
        p.yawDeg = yawSlider.getValue();
        p.pitchDeg = pitchSlider.getValue();
        p.skyId = skyIdSlider.getValue();
        p.un1 = un1Slider.getValue();
        p.un2 = un2Slider.getValue();
        p.un3 = un3Slider.getValue();
        p.un4 = un4Slider.getValue();
        return p;
    }

    private void applyPresetToUI(EnvPreset p) {
        suppressLive = true;
        int sc = p.sunColor;
        sR.setValue((sc >> 16) & 0xFF);
        sG.setValue((sc >> 8) & 0xFF);
        sB.setValue(sc & 0xFF);
        sunHex.setText(String.format("#%02X%02X%02X",(sc >> 16) & 0xFF, (sc >> 8) & 0xFF, sc & 0xFF));
        int fc = p.fogColor;
        fR().setValue((fc >> 16) & 0xFF);
        fG().setValue((fc >> 8) & 0xFF);
        fB().setValue(fc & 0xFF);
        fogHex.setText(String.format("#%02X%02X%02X",(fc >> 16) & 0xFF, (fc >> 8) & 0xFF, fc & 0xFF));
        fogDist.setValue(clamp(p.fogFar, 0, 15000));
        fl4130.setValue((int)(p.sunIntensity*100f));
        fl4131.setValue((int)(p.shadowIntensity*100f));
        fl4137.setValue((int)(p.diffusion*100f));
        fl4132.setValue((int)(p.fogIntensity*100f));
        fl4138.setValue((int)(p.ambientLight*100f));
        fl4139.setValue((int)(p.sunBrightness*100f));
        yawSlider.setValue(clamp(p.yawDeg, -180, 180));
        pitchSlider.setValue(clamp(p.pitchDeg, -45, 45));
        skyIdSlider.setValue(p.skyId);
        un1Slider.setValue(p.un1);
        un2Slider.setValue(p.un2);
        un3Slider.setValue(p.un3);
        un4Slider.setValue(p.un4);
        suppressLive = false;
    }

    private void loadPresetIntoUIAndApply(EnvPreset p) {
        applyPresetToUI(p);
        if (chkLive.isSelected()) applyFromUIToEngine();
    }

    private void onSavePreset() {
        String defaultName = (String) combo.getSelectedItem();
        String name = (String) JOptionPane.showInputDialog(this, "Preset name:", "Save Preset", JOptionPane.PLAIN_MESSAGE, null, null, defaultName == null ? "" : defaultName);
        if (name == null) return;
        name = name.trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name can't be empty.", "Save Preset", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Map<String, EnvPreset> map = manager.getPresetsView();
        boolean exists = map.containsKey(name);
        if (exists) {
            int res = JOptionPane.showConfirmDialog(this, "Overwrite preset \""+name+"\"?", "Confirm Overwrite", JOptionPane.YES_NO_OPTION);
            if (res != JOptionPane.YES_OPTION) return;
        }
        EnvPreset p = currentUIToPreset(name);
        map.put(name, p);
        manager.savePresetsPublic();
        refreshPresetCombo(name);
        JOptionPane.showMessageDialog(this, "Preset saved.", "Save Preset", JOptionPane.INFORMATION_MESSAGE);
    }

    private void onDeletePreset() {
        String name = (String) combo.getSelectedItem();
        if (name == null) {
            JOptionPane.showMessageDialog(this, "No preset selected.", "Delete Preset", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int res = JOptionPane.showConfirmDialog(this, "Delete preset \""+name+"\"?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (res != JOptionPane.YES_OPTION) return;
        Map<String, EnvPreset> map = manager.getPresetsView();
        map.remove(name);
        manager.savePresetsPublic();
        refreshPresetCombo(null);
        JOptionPane.showMessageDialog(this, "Preset deleted.", "Delete Preset", JOptionPane.INFORMATION_MESSAGE);
    }

    private void onExportPreset() {
        String name = (String) combo.getSelectedItem();
        if (name == null || !manager.getPresetsView().containsKey(name)) {
            JOptionPane.showMessageDialog(this, "Select a preset to export.", "Export Preset", JOptionPane.WARNING_MESSAGE);
            return;
        }
        EnvPreset p = manager.getPresetsView().get(name);
        JFileChooser fc = new JFileChooser();
        tintChooser(fc);
        fc.setDialogTitle("Export Preset");
        fc.setSelectedFile(new File(name.replaceAll("[^A-Za-z0-9_\\-\\.]+","_") + ".json"));
        fc.setFileFilter(new FileNameExtensionFilter("JSON (*.json)", "json"));
        int r = fc.showSaveDialog(this);
        if (r != JFileChooser.APPROVE_OPTION) return;
        File out = fc.getSelectedFile();
        if (!out.getName().toLowerCase().endsWith(".json")) {
            out = new File(out.getParentFile(), out.getName() + ".json");
        }
        try (Writer w = Files.newBufferedWriter(out.toPath())) {
            mapper.writeValue(w, p);
            JOptionPane.showMessageDialog(this, "Exported to:\n" + out.getAbsolutePath(), "Export Preset", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Failed to export:\n" + ex.getMessage(), "Export Preset", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void onImportPreset() {
        JFileChooser fc = new JFileChooser();
        tintChooser(fc);
        fc.setDialogTitle("Import Preset(s)");
        fc.setMultiSelectionEnabled(true);
        fc.setFileFilter(new FileNameExtensionFilter("JSON (*.json)", "json"));
        int r = fc.showOpenDialog(this);
        if (r != JFileChooser.APPROVE_OPTION) return;
        List<File> files = Arrays.asList(fc.getSelectedFiles());
        if (files.isEmpty()) return;
        Map<String, EnvPreset> map = manager.getPresetsView();
        String lastImportedName = null;
        int imported = 0;
        for (File f : files) {
            try {
                EnvPreset single = mapper.readValue(f, EnvPreset.class);
                if (single != null && single.name != null && !single.name.trim().isEmpty()) {
                    map.put(single.name, single);
                    lastImportedName = single.name;
                    imported++;
                    continue;
                }
            } catch (Exception ignore) {
            } try {
                List<EnvPreset> list = mapper.readValue(f, new TypeReference<List<EnvPreset>>() {});
                for (EnvPreset p : list) {
                    if (p != null && p.name != null && !p.name.trim().isEmpty()) {
                        map.put(p.name, p);
                        lastImportedName = p.name;
                        imported++;
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Failed to import \""+f.getName()+"\":\n"+ex.getMessage(), "Import Preset", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (imported > 0) {
            manager.savePresetsPublic();
            refreshPresetCombo(lastImportedName);
            JOptionPane.showMessageDialog(this, "Imported " + imported + " preset(s).", "Import Preset", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No presets imported.", "Import Preset", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void applyFromUIToEngine() {
        int sunColor = (sR.getValue()<<16)|(sG.getValue()<<8)|sB.getValue();
        int fogColor = (fR().getValue()<<16)|(fG().getValue()<<8)|fB().getValue();
        manager.setOverrideSunColor(sunColor);
        manager.setOverrideFogColor(fogColor);
        int far = fogDist.getValue();
        int near = defaultFogNear > 0 ? defaultFogNear : Math.max(256, far - 2048);
        manager.setOverrideFogNear(near);
        manager.setOverrideFogFar(far);
        manager.currentAtmosphere.sunIntensity = fl4130.getValue()/100f;
        manager.currentAtmosphere.shadowIntensity = fl4131.getValue()/100f;
        manager.currentAtmosphere.diffusion = fl4137.getValue()/100f;
        manager.currentAtmosphere.fogIntensity = fl4132.getValue()/100f;
        manager.currentAtmosphere.ambientLight = fl4138.getValue()/100f;
        manager.currentAtmosphere.sunBrightness = fl4139.getValue()/100f;
        manager.sunDirection.x = yawSlider.getValue();
        manager.sunDirection.y = pitchSlider.getValue();
        manager.setCustomOverrideEnabled(true);
        AtmosphereManager.enqueueOnRenderThread(manager::applyAtmosphereSettingsPublic);
        sunHex.setText(String.format("#%02X%02X%02X",(sunColor >> 16) & 0xFF,(sunColor >> 8) & 0xFF, sunColor & 0xFF));
        fogHex.setText(String.format("#%02X%02X%02X",(fogColor >> 16) & 0xFF,(fogColor >> 8) & 0xFF, fogColor & 0xFF));
    }

    private void repopulateFromManagerDefaults() {
        sR.setValue((defaultColorSun >> 16) & 0xFF);
        sG.setValue((defaultColorSun >> 8) & 0xFF);
        sB.setValue(defaultColorSun & 0xFF);
        sunHex.setText(String.format("#%02X%02X%02X", (defaultColorSun >> 16) & 0xFF, (defaultColorSun >> 8) & 0xFF, defaultColorSun & 0xFF));
        fR().setValue((defaultColorFog >> 16) & 0xFF);
        fG().setValue((defaultColorFog >> 8) & 0xFF);
        fB().setValue(defaultColorFog & 0xFF);
        fogHex.setText(String.format("#%02X%02X%02X", (defaultColorFog >> 16) & 0xFF, (defaultColorFog >> 8) & 0xFF, defaultColorFog & 0xFF));
        fogDist.setValue(clamp(defaultFogFar, 0, 15000));
        fl4130.setValue((int) (initialF4130 * 100));
        fl4131.setValue((int) (initialF4131 * 100));
        fl4137.setValue((int) (initialF4137 * 100));
        fl4132.setValue((int) (initialF4132 * 100));
        fl4138.setValue((int) (initialF4138 * 100));
        fl4139.setValue((int) (initialF4139 * 100));
        yawSlider.setValue(clamp((int) initialYaw, -180, 180));
        pitchSlider.setValue(clamp((int) initialPitch, -45, 45));
        skyIdSlider.setValue(initSkyId);
        un1Slider.setValue(initUn1);
        un2Slider.setValue(initUn2);
        un3Slider.setValue(initUn3);
        un4Slider.setValue(initUn4);
    }

    private void applyScale(float scale) {
        scaleFontsRecursively(this, scale);
    }

    private static void scaleFontsRecursively(Component c, float scale) {
        Font f = c.getFont();
        if (f != null) c.setFont(f.deriveFont(Math.max(10f, f.getSize2D() * scale)));
        if (c instanceof Container) {
            for (Component child : ((Container) c).getComponents()) {
                scaleFontsRecursively(child, scale);
            }
        }
    }

    private void applyTickDensity(int width) {
        int yawMajor = (width < 380) ? 120 : (width < 460) ? 90 : 60;
        int yawMinor = yawMajor / 3;
        yawSlider.setMajorTickSpacing(yawMajor);
        yawSlider.setMinorTickSpacing(yawMinor);
        yawSlider.setLabelTable(tintedLabels(yawSlider.createStandardLabels(yawMajor), ORANGE));
        int pitchMajor = (width < 380) ? 15 : (width < 460) ? 10 : 5;
        int pitchMinor = Math.max(1, pitchMajor / 5);
        pitchSlider.setMajorTickSpacing(pitchMajor);
        pitchSlider.setMinorTickSpacing(pitchMinor);
        pitchSlider.setLabelTable(tintedLabels(pitchSlider.createStandardLabels(pitchMajor), ORANGE));
    }

    private JLabel lblCategorySmall(String s) {
        JLabel l = new JLabel(s);
        l.setFont(labelFontSmall);
        l.setForeground(OFFWHITE);
        return l;
    }

    private ShadowLabel rgbLabel(String s, Color shadow) {
        ShadowLabel l = new ShadowLabel(s, shadow);
        l.setFont(labelFontSmall);
        l.setForeground(OFFWHITE);
        return l;
    }

    private JPanel titledPanel(String title, boolean beta) {
        JPanel container = new JPanel(new BorderLayout());
        container.setOpaque(true);
        container.setBackground(BAR_BG);
        container.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, PIPE_COLOR), BorderFactory.createEmptyBorder(2, 0, 2, 0)));
        JPanel header = new JPanel(new BorderLayout());
        header.setOpaque(false);
        JLabel headerLbl = new JLabel(beta ? headerWithBeta(title) : title);
        headerLbl.setFont(labelFontBig);
        headerLbl.setForeground(ORANGE);
        header.add(headerLbl, BorderLayout.WEST);
        header.setBorder(new EmptyBorder(0, 8, 0, 8));
        container.add(header, BorderLayout.NORTH);
        JPanel grid = new JPanel(new GridBagLayout());
        grid.setOpaque(false);
        grid.putClientProperty("row", 0);
        container.add(grid, BorderLayout.CENTER);
        grid.setBorder(new EmptyBorder(0, 0, 4, 0));
        container.putClientProperty("kvGrid", grid);
        return container;
    }


    private static String headerWithBeta(String title) {
        String brWhite = "rgb(235,235,235)";
        String orange  = "rgb(" + ORANGE.getRed() + "," + ORANGE.getGreen() + "," + ORANGE.getBlue() + ")";
        return "<html><span style='color:" + brWhite + "'>[</span>" + "<span style='color:" + orange +
                "'>BETA</span>" + "<span style='color:" + brWhite + "'>]</span> " + escape(title) + "</html>";
    }

    private void addKV(JPanel panel, JComponent key, JComponent value) {
        JPanel grid = (JPanel) (panel.getClientProperty("kvGrid") instanceof JPanel ? panel.getClientProperty("kvGrid") : panel);
        key.setForeground(OFFWHITE);
        value.setForeground(OFFWHITE);
        if (value instanceof JComponent) ((JComponent) value).setBackground(BAR_BG);
        Integer row = (Integer) grid.getClientProperty("row");
        if (row == null) row = 0;
        GridBagConstraints left = new GridBagConstraints();
        left.gridx = 0; left.gridy = row;
        left.insets = new Insets(4,8,4,8);
        left.anchor = GridBagConstraints.LINE_START;
        left.weightx = 0; left.fill = GridBagConstraints.NONE;
        GridBagConstraints right = new GridBagConstraints();
        right.gridx = 1; right.gridy = row;
        right.insets = new Insets(4,8,4,8);
        right.weightx = 1; right.fill = GridBagConstraints.HORIZONTAL;
        grid.add(key, left);
        grid.add(value, right);
        grid.putClientProperty("row", row + 1);
        if (value instanceof JComponent) {
            ((JComponent) value).setMaximumSize(new Dimension(Integer.MAX_VALUE, value.getPreferredSize().height));
        }
    }


    private JButton createGreenLinkButton(String text) {
        final Color GREEN =  new Color(46, 204, 113);
        final Color GREEN_HOVER = new Color(111, 243, 162);
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
        btn.setFont(FONT.deriveFont(FONT.getSize2D() + 2f));
        btn.setForeground(GREEN);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.setFocusPainted(false);
        btn.setContentAreaFilled(false);
        btn.setOpaque(false);
        btn.setBackground(BAR_BG);
        btn.setHorizontalTextPosition(SwingConstants.CENTER);
        btn.setVerticalTextPosition(SwingConstants.CENTER);
        btn.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BTN_BORDER),
                BorderFactory.createEmptyBorder(3, 10, 3, 20)
        ));
        int h = btn.getPreferredSize().height;
        btn.setPreferredSize(new Dimension(88, h));
        btn.setMinimumSize(new Dimension(88, h));
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setForeground(GREEN_HOVER);
            }
            @Override public void mouseExited (MouseEvent e) {
                btn.setForeground(GREEN);
            }
        });
        return btn;
    }


    private JSlider makeFloatSlider(String label, float value, float min, float max, int steps, JPanel panel, String tooltip, Font labelFont) {
        if (steps < 1) steps = 1;
        if (max < min) max = min + 1;
        final float step = (max - min) / steps;
        int sliderMin = 0;
        int sliderMax = steps;
        value = clamp(value, min, max);
        int sliderValue = Math.round((value - min) / step);
        sliderValue = clamp(sliderValue, sliderMin, sliderMax);
        JSlider slider = new JSlider(sliderMin, sliderMax, sliderValue);
        slider.setToolTipText(tooltip);
        tintSlider(slider, SLIDER_TRACK_ON, SLIDER_THUMB, OFFWHITE);
        JLabel lbl = new JLabel(label);
        lbl.setFont(labelFont);
        lbl.setForeground(OFFWHITE);
        lbl.setToolTipText(tooltip);
        addKV(panel, lbl, slider);
        return slider;
    }

    private static void setSliderFont(Font f, JSlider... sliders) {
        for (JSlider s : sliders) s.setFont(f);
    }

    private int clamp(int v, int min, int max) {
        return v < min ? min : (v > max ? max : v);
    }

    private float clamp(float val, float min, float max) {
        return Math.max(min, Math.min(max, val));
    }

    private JSlider fR() {
        return fR;
    }

    private JSlider fG() {
        return fG;
    }

    private JSlider fB() {
        return fB;
    }

    private void tintTextField(JTextField tf) {
        tf.setForeground(OFFWHITE);
        tf.setCaretColor(ORANGE);
        tf.setBackground(BTN_BG);
        tf.setSelectionColor(new Color(60, 60, 60));
        tf.setSelectedTextColor(OFFWHITE);
        tf.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(BTN_BORDER), BorderFactory.createEmptyBorder(4, 6, 4, 6)
        ));
    }

    private void tintCheck(JCheckBox cb) {
        cb.setOpaque(false);
        cb.setForeground(OFFWHITE);
        cb.setBackground(BAR_BG);
        cb.setFocusPainted(false);
        cb.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    private void tintCombo(JComboBox<String> box) {
        box.setForeground(OFFWHITE);
        box.setBackground(BTN_BG);
        box.setBorder(BorderFactory.createLineBorder(BTN_BORDER));
        box.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel c = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                c.setFont(getFont());
                c.setOpaque(true);
                c.setForeground(isSelected ? YELLOW : OFFWHITE);
                c.setBackground(isSelected ? BTN_HOVER_BG : BTN_BG);
                return c;
            }
        });
    }

    private void tintSlider(JSlider slider) {
        tintSlider(slider, SLIDER_TRACK_ON, SLIDER_THUMB, OFFWHITE);
    }

    private void tintSlider(JSlider slider, Color activeTrack, Color thumbColor, Color tickLabelColor) {
        slider.setBackground(BAR_BG);
        slider.setForeground(tickLabelColor);
        slider.setUI(new ThemedSliderUI(slider, SLIDER_TRACK_OFF, activeTrack, thumbColor));
        Consumer<JSlider> tintLabels = s -> {
            Dictionary<?, ?> dict = s.getLabelTable();
            if (dict == null) return;
            Enumeration<?> e = dict.keys();
            while (e.hasMoreElements()) {
                Object k = e.nextElement();
                Object v = dict.get(k);
                if (v instanceof JLabel) {
                    ((JLabel) v).setForeground(tickLabelColor);
                }
            }
        };
        slider.addChangeListener(ev -> tintLabels.accept(slider));
        tintLabels.accept(slider);
    }

    private Dictionary<Integer, JLabel> tintedLabels(Dictionary<Integer, JLabel> dict, Color color) {
        if (dict == null) return null;
        Enumeration<Integer> e = dict.keys();
        while (e.hasMoreElements()) {
            Integer k = e.nextElement();
            JLabel l = dict.get(k);
            if (l != null) {
                l.setForeground(color);
                l.setBackground(BAR_BG);
                l.setOpaque(false);
            }
        }
        return dict;
    }

    private void tintChooser(JFileChooser fc) {
        fc.setBackground(BAR_BG);
        fc.setForeground(OFFWHITE);
        SwingUtilities.invokeLater(() -> {
            setColorsRecursively(fc, c -> {
                if (c instanceof JLabel) ((JLabel) c).setForeground(OFFWHITE);
                if (c instanceof JTextField) {
                    JTextField tf = (JTextField) c;
                    tf.setForeground(OFFWHITE);
                    tf.setBackground(BTN_BG);
                    tf.setCaretColor(ORANGE);
                }
                if (c instanceof JList) {
                    c.setBackground(BTN_BG);
                    c.setForeground(OFFWHITE);
                }
                if (c instanceof JPanel) c.setBackground(BAR_BG);
                if (c instanceof JButton) {
                    JButton b = (JButton) c;
                    b.setForeground(ORANGE);
                    b.setBackground(BTN_BG);
                }
            });
        });
    }

    private void setColorsRecursively(Component root, Consumer<Component> f) {
        f.accept(root);
        if (root instanceof Container) {
            for (Component ch : ((Container) root).getComponents()) {
                setColorsRecursively(ch, f);
            }
        }
    }

    private static final class ThemedSliderUI extends BasicSliderUI {
        private static final int TRACK_HEIGHT = 6;
        private static final int THUMB_DIAM = 14;
        private final Color offTrack;
        private final Color onTrack;
        private final Color thumbCol;

        ThemedSliderUI(JSlider b, Color offTrack, Color onTrack, Color thumbCol) {
            super(b);
            this.offTrack = offTrack;
            this.onTrack = onTrack;
            this.thumbCol = thumbCol;
        }

        @Override
        protected Dimension getThumbSize() {
            return new Dimension(THUMB_DIAM, THUMB_DIAM);
        }

        @Override
        public void paintTrack(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int trackY = trackRect.y + (trackRect.height - TRACK_HEIGHT) / 2;
            int x = trackRect.x;
            int w = trackRect.width;
            g2.setColor(offTrack);
            g2.fillRoundRect(x, trackY, w, TRACK_HEIGHT, TRACK_HEIGHT, TRACK_HEIGHT);
            int valuePos = xPositionForValue(slider.getValue());
            int activeX = slider.getInverted() ? valuePos : x;
            int activeW = slider.getInverted() ? (x + w - valuePos) : (valuePos - x);
            activeW = Math.max(0, activeW);
            g2.setColor(onTrack);
            g2.fillRoundRect(activeX, trackY, activeW, TRACK_HEIGHT, TRACK_HEIGHT, TRACK_HEIGHT);
            g2.dispose();
        }

        @Override
        public void paintThumb(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int d = THUMB_DIAM;
            int cx = thumbRect.x + (thumbRect.width - d) / 2;
            int cy = thumbRect.y + (thumbRect.height - d) / 2;
            g2.setColor(thumbCol);
            g2.fillOval(cx, cy, d, d);
            g2.setColor(new Color(0, 0, 0, 80));
            g2.drawOval(cx, cy, d, d);
            g2.dispose();
        }
    }

    private static final class VerticalScrollPanel extends JPanel implements Scrollable {
        VerticalScrollPanel() {
            super();
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setOpaque(true);
            setBackground(BAR_BG);
        }
        @Override
        public Dimension getPreferredScrollableViewportSize() {
            return getPreferredSize();
        }
        @Override
        public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
            return 32;
        }
        @Override
        public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
            return 160;
        }
        @Override
        public boolean getScrollableTracksViewportWidth() {
            return true;
        }
        @Override
        public boolean getScrollableTracksViewportHeight() {
            return false;
        }
    }

    private static final class ShadowLabel extends JLabel {
        private final Color shadow;
        ShadowLabel(String text, Color shadow) {
            super(text);
            this.shadow = shadow;
            setOpaque(false);
        }
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            String s = getText();
            FontMetrics fm = g2.getFontMetrics(getFont());
            Insets in = getInsets();
            int x = in.left;
            int y = in.top + fm.getAscent();
            g2.setColor(shadow);
            g2.drawString(s, x + 1, y + 1);
            g2.setColor(getForeground());
            g2.drawString(s, x, y);
            g2.dispose();
        }
        @Override
        public Dimension getPreferredSize() {
            Dimension d = super.getPreferredSize();
            return new Dimension(d.width + 1, d.height + 1);
        }
    }

    private static String escape(String s) {
        StringBuilder b = new StringBuilder();
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

    private final class HelpWindow extends JWindow {
        private final JPanel card;
        private final JButton closeBtn;

        HelpWindow() {
            super();
            setBackground(new Color(0, 0, 0, 0));

            card = new JPanel(new BorderLayout()) {
                @Override
                protected void paintComponent(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    int arc = 14;
                    g2.setColor(new Color(20, 20, 20, 235));
                    g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
                    g2.setColor(ORANGE);
                    g2.setStroke(new BasicStroke(1.2f));
                    g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arc, arc);
                    g2.dispose();
                    super.paintComponent(g);
                }
            };
            card.setOpaque(false);
            card.setBorder(new EmptyBorder(12, 12, 12, 12));
            JPanel header = new JPanel(new BorderLayout(8, 0));
            header.setOpaque(false);
            JLabel imgLabel = new JLabel(loadHelpIcon(48));
            header.add(imgLabel, BorderLayout.WEST);
            closeBtn = new JButton("✕");
            styleClose(closeBtn);
            closeBtn.addActionListener(e -> close());
            JPanel closeWrap = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
            closeWrap.setOpaque(false);
            closeWrap.add(closeBtn);
            header.add(closeWrap, BorderLayout.EAST);
            card.add(header, BorderLayout.NORTH);
            JScrollPane sp = new JScrollPane(buildHelpContent());
            sp.setBorder(BorderFactory.createEmptyBorder());
            sp.getViewport().setBackground(new Color(0,0,0,0));
            sp.setOpaque(false);
            sp.getViewport().setOpaque(false);
            sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            sp.getVerticalScrollBar().setUnitIncrement(24);
            card.add(sp, BorderLayout.CENTER);
            setContentPane(card);
            pack();
        }

        void open(boolean fixedMode) {
            pack();
            enforceBounds(fixedMode);
            setVisible(true);
        }

        void recenter(boolean fixedMode) {
            enforceBounds(fixedMode);
        }

        void close() {
            setVisible(false);
        }

        private void enforceBounds(boolean fixedMode) {
            JFrame frame = getTopFrame();
            if (frame == null) return;
            int prefW = Math.min(720, card.getPreferredSize().width + 24);
            int prefH = Math.min(480, card.getPreferredSize().height + 24);
            if (!fixedMode) {
                setSize(new Dimension(prefW, prefH));
                Point p = frame.getLocationOnScreen();
                int x = p.x + (frame.getWidth() - prefW) / 2;
                int y = p.y + (frame.getHeight() - prefH) / 2;
                setLocation(x, y);
                return;
            }

            Insets in = frame.getInsets();
            int left = (in != null ? in.left : 0);
            int top  = (in != null ? in.top  : 0);
            int topBarGuess = 28;
            int areaW = FIXED_CLIENT_AREA.width;
            int areaH = FIXED_CLIENT_AREA.height;
            int w = Math.min(prefW, areaW - 24);
            int h = Math.min(prefH, areaH - 24);
            setSize(new Dimension(w, h));
            Point p = frame.getLocationOnScreen();
            int baseX = p.x + left;
            int baseY = p.y + top + topBarGuess;
            int x = baseX + (areaW - w) / 2;
            int y = baseY + (areaH - h) / 2;
            setLocation(x, y);
        }

        private JFrame getTopFrame() {
            Window w = SwingUtilities.getWindowAncestor(EnvEditorPanel.this);
            if (w instanceof JFrame) return (JFrame) w;
            try {
                return Loader.instance != null ? Loader.instance.FRAME : null;
            } catch (Throwable t) {
                return null;
            }
        }

        private void styleClose(JButton b) {
            b.setFont(new Font("Dialog", Font.BOLD, 16));
            b.setForeground(ORANGE);
            b.setContentAreaFilled(false);
            b.setOpaque(false);
            b.setBorder(BorderFactory.createEmptyBorder(2, 6, 2, 6));
            b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            b.addMouseListener(new MouseAdapter() {
                @Override public void mouseEntered(MouseEvent e) {
                    b.setForeground(YELLOW);
                }
                @Override public void mouseExited (MouseEvent e) {
                    b.setForeground(ORANGE);
                }
            });
        }

        private ImageIcon loadHelpIcon(int targetH) {
            int[] sizes = { targetH, 64, 48, 32, 24, 16, 128 };
            for (int s : sizes) {
                String p1 = "/img/img" + s + ".png";
                try (InputStream in = getClass().getResourceAsStream(p1)) {
                    if (in != null) {
                        Image img = ImageIO.read(in);
                        Image scaled = img.getScaledInstance(targetH, targetH, Image.SCALE_SMOOTH);
                        return new ImageIcon(scaled);
                    }
                } catch (Exception ignored) {}
                try (InputStream in = getClass().getClassLoader().getResourceAsStream(p1.startsWith("/") ? p1.substring(1) : p1)) {
                    if (in != null) {
                        Image img = ImageIO.read(in);
                        Image scaled = img.getScaledInstance(targetH, targetH, Image.SCALE_SMOOTH);
                        return new ImageIcon(scaled);
                    }
                } catch (Exception ignored) {}
            }
            try (InputStream in = getClass().getResourceAsStream("/img/img.png")) {
                if (in != null) {
                    Image img = ImageIO.read(in);
                    Image scaled = img.getScaledInstance(targetH, targetH, Image.SCALE_SMOOTH);
                    return new ImageIcon(scaled);
                }
            } catch (Exception ignored) {}
            return new ImageIcon(new BufferedImage(targetH, targetH, BufferedImage.TYPE_INT_ARGB));
        }

        private JPanel buildHelpContent() {
            JPanel root = new JPanel();
            root.setOpaque(false);
            root.setLayout(new BoxLayout(root, BoxLayout.Y_AXIS));

            final java.util.function.Function<JComponent, JPanel> leftWrap = (comp) -> {
                JPanel p = new JPanel(new BorderLayout());
                p.setOpaque(false);
                p.setAlignmentX(Component.LEFT_ALIGNMENT);
                p.add(comp, BorderLayout.WEST);
                return p;
            };

            JLabel title = htmlLabel(
                    "<span style='font-size:18pt;color:" + rgb(ORANGE) + "'>Welcome to the " + escape(Settings.SERVER_NAME) + "  Environment Editor!</span>"
            );
            root.add(leftWrap.apply(title));
            root.add(divider());

            JLabel intro = htmlLabel(
                    "<span style='font-size:12pt;color:" + rgb(ORANGE) + "'>This popup card will go over a brief " +
                    "summary of this tool and the options inside it.</span>"
            );
            root.add(leftWrap.apply(intro));
            root.add(divider());

            JLabel hOptions = htmlLabel("<span style='font-size:12pt;text-decoration:underline;color:" + rgb(ORANGE) + "'>Options</span>");
            root.add(leftWrap.apply(hOptions));

            addBullet(root, "Save Preset",  "Save a .JSON environment preset to the /EnvEditor/presets.json file.");
            addBullet(root, "Delete Preset","Delete a preset from the presets file.");
            addBullet(root, "Export Preset","Export a single preset as a .JSON file, to share what you make with others!");
            addBullet(root, "Import Preset","Combine an exported preset from another player with your preset list!");
            addBullet(root, "Preset Dropdown","Select a saved preset.");
            addBullet(root, "Live Preview [BETA]","See the changes made by the editor in real time (Only applies to certain fields).");
            addBullet(root, "Sun Color panel","Set the color of the sun with sliders or hex (example, red is #FF0000). Press enter to set typed hex values.");
            addBullet(root, "Fog Panel [BETA]","Set RGB fog colors with sliders or hex. Drag fog inwards towards the player or away with a slider [BETA].");
            addBullet(root, "Sun Direction Panel","Set the pitch and yaw (angle/tilt) of the sun with sliders. Changing PITCH too fast may cause a crash.");
            addBullet(root, "Advanced Panel [BETA]","Set sun/shadow/fog intensities, sun brightness/diffusion, and ambient light with sliders.");
            addBullet(root, "Skybox Panel [BETA]","Set skyboxes (1-5) anywhere. Rotation/color/brightness/contrast sliders not fully functional.");
            addBullet(root, "Reset Button","Reloads OpenGL, clears any unsaved settings. You may need to click this twice to fully reset the environment.");
            addBullet(root, "Apply Button","Apply the settings you pick if not using Live Preview.");
            root.add(divider());

            JLabel hDisc = htmlLabel("<span style='font-size:12pt;text-decoration:underline;color:" + rgb(ORANGE) + "'>Disclaimer</span>");
            root.add(leftWrap.apply(hDisc));
            addBulletPlain(root, "This editor modifies active rendering tasks in the client.");
            addBulletPlain(root, "Using its options should be done with a fair bit of caution.");
            addBulletPlain(root, "Dragging sliders too quickly or setting/resetting too many values quickly may overload it and glitch or crash.");
            root.add(divider());

            JLabel hBugs = htmlLabel("<span style='font-size:12pt;text-decoration:underline;color:" + rgb(ORANGE) + "'>Known Bugs and quick fixes</span>");
            root.add(leftWrap.apply(hBugs));

            JLabel s1 = htmlLabel("<span style='font-size:11pt;color:" + rgb(ORANGE) + "'>Random, glitchy \"disco\" fog while setting related or unrelated values:</span>");
            root.add(leftWrap.apply(s1));
            root.add(shadowBullet(
                    "Press the reset button or disable fog in the graphics settings.\n" +
                    "Disabling fog just turns off the edge of the fog, where the glitch occurs.", new Color(64, 200, 64)));
            root.add(smallDivider());

            JLabel s2 = htmlLabel(
                    "<span style='font-size:11pt;color:" + rgb(ORANGE) + "'>Blue/cyan fog at the edges of the visible area, " +
                    "any time even if values have not been modified:</span>"
            );
            root.add(leftWrap.apply(s2));
            addBulletPlain(root, "The cause of this is currently unknown but is being worked on.");
            root.add(shadowBullet(
                    "For now, disable fog in the graphics settings.\n" +
                    "Disabling fog just turns off the edge of the fog.", new Color(64, 200, 64)));
            root.add(smallDivider());

            JLabel s3 = htmlLabel("<span style='font-size:11pt;color:" + rgb(ORANGE) + "'>Skyboxes disappear when moving around the map by running or walking:</span>");
            root.add(leftWrap.apply(s3));
            addBulletPlain(root,
                    "This happens because the skyboxes are sent into the game at an unexpected time,\n" +
                    "so when it loads its own environment settings, the skybox can get ejected."
            );
            root.add(shadowBullet("No current fix.", new Color(220, 64, 64)));
            root.add(smallDivider());

            JLabel s4 = htmlLabel(
                    "<span style='font-size:11pt;color:" + rgb(ORANGE) + "'>Sun Direction Settings revert while moving around the map by running or walking:</span>"
            );
            root.add(leftWrap.apply(s4));
            addBulletPlain(root,
                    "Same as above, the game doesn't expect the values you have set and each region (64x64 tiles) may have its own environment\n" +
                    "settings which eject the overrides."
            );
            root.add(shadowBullet("No current fix.", new Color(220, 64, 64)));
            root.add(smallDivider());

            JLabel s5 = htmlLabel("<span style='font-size:11pt;color:" + rgb(ORANGE) + "'>Some of the sliders seem to do nothing</span>");
            root.add(leftWrap.apply(s5));
            addBulletPlain(root,
                    "A handful of the sliders in the Advanced category may seem to do nothing.\n" +
                    "This is likely because they are currently inverted and work right -> left, or their adjustments are too slight to notice."
            );
            root.add(shadowBullet("No current fix.", new Color(220, 64, 64)));
            addBulletPlain(root,
                    "The Skybox adjustments (rotation/color/etc) are not functional at this time.\n" +
                    "They values they modify do not appear, they may be removed in a future update if not fixed."
            );
            root.add(shadowBullet("No current fix.", new Color(220, 64, 64)));
            root.add(divider());

            JPanel discordLine = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
            discordLine.setOpaque(false);
            discordLine.setAlignmentX(Component.LEFT_ALIGNMENT);

            JLabel report = htmlLabel("<span style='font-size:12pt;color:" + rgb(ORANGE) + "'>Please report any bugs via the #bug-reports forum in our</span>");
            JLabel link = linkLabel("Discord", Settings.DISCORD_INVITE);
            JLabel report2 = htmlLabel("<span style='font-size:12pt;color:" + rgb(ORANGE) + "'>!</span>");

            report.setBorder(new EmptyBorder(0, 0, 0, 2));
            link.setBorder(new EmptyBorder(0, 0, 0, 2));
            report2.setBorder(new EmptyBorder(0, 0, 0, 0));

            discordLine.add(report);
            discordLine.add(link);
            discordLine.add(report2);
            root.add(discordLine);
            return root;
        }

        private JLabel htmlLabel(String html) {
            String body = inlineBeta(html).replace("\r\n", "\n").replace("\n", "<br/>");
            JLabel l = new JLabel("<html>" + body + "</html>");
            l.setForeground(OFFWHITE);
            l.setOpaque(false);
            l.setBorder(new EmptyBorder(2, 2, 2, 8));
            l.setAlignmentX(Component.LEFT_ALIGNMENT);
            l.setHorizontalAlignment(SwingConstants.LEFT);
            return l;
        }

        private Component divider() {
            JComponent c = new JComponent() {
                @Override protected void paintComponent(Graphics g) {
                    g.setColor(PIPE_COLOR);
                    g.fillRect(8, getHeight()/2, getWidth()-16, 1);
                }
            };
            c.setPreferredSize(new Dimension(1, 10));
            c.setAlignmentX(Component.LEFT_ALIGNMENT);
            return c;
        }

        private Component smallDivider() {
            JComponent c = new JComponent() {
                @Override protected void paintComponent(Graphics g) {
                    g.setColor(new Color(80,80,80));
                    g.fillRect(20, getHeight()/2, getWidth()-40, 1);
                }
            };
            c.setPreferredSize(new Dimension(1, 6));
            c.setAlignmentX(Component.LEFT_ALIGNMENT);
            return c;
        }

        private void addBullet(JPanel root, String beforeColon, String afterColon) {
            JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
            row.setOpaque(false);
            row.setAlignmentX(Component.LEFT_ALIGNMENT);
            JLabel dash = htmlLabel("<span style='color:" + rgb(OFFWHITE) + "'>-&nbsp;</span>");
            JLabel content = htmlLabel(
                    "<span style='color:" + rgb(ORANGE) + "'>" + inlineBeta(escape(beforeColon)) + "</span>" +
                    "<span style='color:" + rgb(OFFWHITE) + "'>: " + inlineBeta(escape(afterColon)) + "</span>"
            );
            row.add(dash);
            row.add(content);
            root.add(row);
        }


        private void addBulletPlain(JPanel root, String text) {
            JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
            row.setOpaque(false);
            row.setAlignmentX(Component.LEFT_ALIGNMENT);
            row.setAlignmentX(Component.LEFT_ALIGNMENT);
            JLabel dash = htmlLabel("<span style='color:" + rgb(OFFWHITE) + "'>-&nbsp;</span>");
            JLabel content = htmlLabel("<span style='color:" + rgb(OFFWHITE) + "'>" + inlineBeta(escape(text)) + "</span>");
            row.add(dash);
            row.add(content);
            root.add(row);
        }

        private JPanel shadowBullet(String text, Color shadowColor) {
            JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
            row.setOpaque(false);
            row.setAlignmentX(Component.LEFT_ALIGNMENT);
            JLabel dash = htmlLabel("<span style='color:" + rgb(OFFWHITE) + "'>-&nbsp;</span>");
            ShadowLabel sl = new ShadowLabel(text, shadowColor);
            sl.setForeground(OFFWHITE);
            sl.setFont(labelFontSmall);
            sl.setBorder(new EmptyBorder(2, 2, 2, 8));
            row.add(dash);
            row.add(sl);
            return row;
        }

        private JLabel linkLabel(String text, String url) {
            JLabel lbl = new JLabel("<html><span style='text-decoration:underline;color:" + rgb(GREEN) + "'>" + escape(text) + "</span></html>");
            lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lbl.setBorder(new EmptyBorder(2, 2, 2, 2));
            lbl.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    lbl.setText("<html><span style='text-decoration:underline;color:" + rgb(LIGHT_GREEN) + "'>" + escape(text) + "</span></html>");
                }
                @Override
                public void mouseExited (MouseEvent e) {
                    lbl.setText("<html><span style='text-decoration:underline;color:" + rgb(GREEN) + "'>" + escape(text) + "</span></html>");
                }
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        if (Desktop.isDesktopSupported()) Desktop.getDesktop().browse(new URI(url));
                    }
                    catch (Exception ignored) {}
                }
            });
            return lbl;
        }

        private String rgb(Color c) {
            return "rgb(" + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ")";
        }

        private String inlineBeta(String s) {
            String brWhite = "rgb(235,235,235)";
            String orange  = rgb(ORANGE);
            return s.replace("[BETA]", "<span style='color:" + brWhite + "'>[</span>" +
                            "<span style='color:" + orange  + "'>BETA</span>" +
                            "<span style='color:" + brWhite + "'>]</span>");
        }
    }

    private boolean isFixedMode() {
        try {
            GamePreferences gp = GraphicsSetup.clientPreferences;
            if (gp == null) return false;
            if (gp.windowMode == null || gp.windowModeShadow == null) return false;
            int a = gp.windowMode.getWindowMode((byte)0);
            int b = gp.windowModeShadow.getWindowMode((byte)0);
            return a == 1 && b == 1;
        } catch (Throwable t) {
            return false;
        }
    }
}
