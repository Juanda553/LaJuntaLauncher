package gui;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import objects.JuntaApi;
import objects.LauncherJunta;

import gui.*;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ScrollBarUI;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import org.json.JSONArray;
import org.json.JSONObject;
import util.McArgsCommand;
import util.replacePalceholder;

public class LauncherWindow extends javax.swing.JFrame {
    private JuntaApi JUNTA_API;
    private LauncherJunta LAUNCHER_CLASS;
    private String bgColor1, bgColor2, btnColor1, btnColor2, btnPlayColor, btnPlayFontString, fontColor1, fontColor2, eventTitle;
    
    private Partners partnersWindow;
    private MinecraftSettings mcSettingsWindow;
    private LauncherSettings launcherSettingsWindow;
    private Credits creditsWindow;
    
    private JSONObject currentEvent;
    
    private Font mcFont, mcTitleFont;
    private ImageIcon headerIcon, userHeadIcon, eventIcon, btnPlayFontIcon;

    public LauncherWindow(JuntaApi JUNTA_API, LauncherJunta LAUNCHER_CLASS) throws MalformedURLException {
        
        this.JUNTA_API = JUNTA_API;
        this.LAUNCHER_CLASS = LAUNCHER_CLASS;
        
        this.partnersWindow = new Partners(JUNTA_API.getPartners(), this.JUNTA_API.getMoneyCollected());
        this.mcSettingsWindow = new MinecraftSettings();
        this.launcherSettingsWindow = new LauncherSettings();
        this.creditsWindow = new Credits();

        this.bgColor1 = JUNTA_API.getBgColor1();
        this.bgColor2 = JUNTA_API.getGbColor2();
        this.btnColor1 = JUNTA_API.getButtonColor1();
        this.btnColor2 = JUNTA_API.getButtonColor2();
        this.btnPlayColor = JUNTA_API.getButtonPlay();
        this.btnPlayFontString = JUNTA_API.getFontPlay();
        this.fontColor1 = JUNTA_API.getFontColor1();
        this.fontColor2 = JUNTA_API.getFontColor2();
        this.currentEvent = JUNTA_API.getEvent();
        
        URL userHeadUrl = new URL("https://cravatar.eu/helmhead/" + LAUNCHER_CLASS.getUsername() + "/32.png");
        this.userHeadIcon = new ImageIcon(userHeadUrl);
        
        URL headerUrl = new URL(JUNTA_API.getTitleImg());
        this.headerIcon = new ImageIcon(headerUrl);
        
        URL eventImgUrl = new URL(currentEvent.getString("img"));
        this.eventIcon = new ImageIcon(eventImgUrl);
         
        URL btnPlayFontUrl = new URL(btnPlayFontString);
        this.btnPlayFontIcon = new ImageIcon(btnPlayFontUrl);
        
        initComponents();
        
        this.panelRoot.setBackground(Color.decode(bgColor1));      
        this.panelMain.setBackground(Color.decode(bgColor2));
        this.eventPanel.setBackground(Color.decode(bgColor1));
        this.newsPanel.setBackground(Color.decode(bgColor1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRoot = new javax.swing.JPanel();
        panelMain = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        newsPanel = new javax.swing.JPanel();
        EventTitle = new javax.swing.JLabel();
        eventDesc = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        eventImg = new javax.swing.JLabel();
        eventPanel = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        showUserName1 = new javax.swing.JLabel();
        showUserName = new javax.swing.JLabel();
        btn_partners = new javax.swing.JButton();
        usingRam = new javax.swing.JLabel();
        userHead = new javax.swing.JLabel();
        LauncherVersionLabelJIJIJIJIJI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Junta Laucnher");
        setResizable(false);

        panelRoot.setBackground(new java.awt.Color(51, 51, 51));

        panelMain.setBackground(new java.awt.Color(102, 102, 102));
        panelMain.setLayout(null);

        playButton.setBackground(Color.decode(btnPlayColor));
        playButton.setIcon(btnPlayFontIcon);
        playButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.setFocusPainted(false);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        panelMain.add(playButton);
        playButton.setBounds(140, 220, 180, 65);

        newsPanel.setBackground(new java.awt.Color(51, 51, 51));
        newsPanel.setLayout(null);

        EventTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EventTitle.setForeground(Color.decode(fontColor1));
        EventTitle.setText(currentEvent.getString("title"));
        newsPanel.add(EventTitle);
        EventTitle.setBounds(10, 10, 360, 25);

        eventDesc.setBackground(Color.decode(bgColor1));
        eventDesc.setBorder(null);
        eventDesc.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(Color.decode(bgColor1));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(Color.decode(fontColor1));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(currentEvent.getString("desc") + "\n\n" + currentEvent.getString("date"));
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setDisabledTextColor(Color.decode(fontColor1));
        eventDesc.setViewportView(jTextArea1);

        newsPanel.add(eventDesc);
        eventDesc.setBounds(10, 45, 360, 135);

        eventImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventImg.setIcon(eventIcon);
        eventImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        newsPanel.add(eventImg);
        eventImg.setBounds(5, 185, 368, 165);

        panelMain.add(newsPanel);
        newsPanel.setBounds(455, 270, 380, 355);

        eventPanel.setBackground(new java.awt.Color(51, 51, 51));
        eventPanel.setLayout(null);
        panelMain.add(eventPanel);
        eventPanel.setBounds(15, 295, 430, 330);

        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setIcon(headerIcon);
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelMain.add(header);
        header.setBounds(15, 10, 820, 245);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        showUserName1.setForeground(Color.decode(fontColor1));
        showUserName1.setText("Sesion iniciada como:");
        showUserName1.setToolTipText("");

        showUserName.setForeground(Color.decode(fontColor1));
        showUserName.setText(LAUNCHER_CLASS.getUsername());

        btn_partners.setBackground(Color.decode(btnColor1));
        btn_partners.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_partners.setForeground(Color.decode(fontColor2));
        btn_partners.setText("$" + (JUNTA_API.getServerPrice() - JUNTA_API.getMoneyCollected()) + " restantes");
        btn_partners.setToolTipText("");
        btn_partners.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_partners.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_partners.setFocusPainted(false);
        btn_partners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_partnersActionPerformed(evt);
            }
        });

        usingRam.setForeground(Color.decode(fontColor1));
        usingRam.setText("Usando " + LAUNCHER_CLASS.getRam() + "GB de RAM");

        userHead.setIcon(userHeadIcon);

        LauncherVersionLabelJIJIJIJIJI.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LauncherVersionLabelJIJIJIJIJI.setForeground(Color.decode(fontColor2));
        LauncherVersionLabelJIJIJIJIJI.setText("Version: " + LAUNCHER_CLASS.getLauncherVersion());

        javax.swing.GroupLayout panelRootLayout = new javax.swing.GroupLayout(panelRoot);
        panelRoot.setLayout(panelRootLayout);
        panelRootLayout.setHorizontalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(btn_partners, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(usingRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showUserName1)
                            .addComponent(showUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userHead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addComponent(LauncherVersionLabelJIJIJIJIJI)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRootLayout.setVerticalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRootLayout.createSequentialGroup()
                                .addComponent(showUserName1)
                                .addGap(4, 4, 4)
                                .addComponent(showUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                            .addComponent(userHead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usingRam, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_partners, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(502, 502, 502)
                        .addComponent(LauncherVersionLabelJIJIJIJIJI))
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        System.out.println("Jugar");
        try {                                           
            String dotDiomedes = LAUNCHER_CLASS.getDiomedesDir();
            String mcVersion = LAUNCHER_CLASS.getMinecraftVersion();
            String verIndex = LAUNCHER_CLASS.getIndexVersion();
            
            
            String ram = String.valueOf(LAUNCHER_CLASS.getRam());
            String ramFinal = "-Xmx" + ram + "G";
            
            McArgsCommand mcArgsCommand = new McArgsCommand(dotDiomedes);
            replacePalceholder pene = new replacePalceholder(dotDiomedes, mcVersion);
            
            List<String> command = new ArrayList<>();
            command.add("java");
            command.add(ramFinal);
            command.add(ramFinal);
            command.add("-XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump");
            command.add("-Djava.library.path=" + dotDiomedes + "/versions/" + mcVersion + "/natives");
            command.add("-cp");
            command.add(mcArgsCommand.getCpLibs() + ";" + mcArgsCommand.getCpLibsVanilla());
            
            command.addAll(pene.getPlacedHoldediiiii(mcArgsCommand.getJvmArgs()));
            
            command.add(mcArgsCommand.getMainClassMC());
            
            command.add("--username");
            command.add(LAUNCHER_CLASS.getUsername());
            command.add("--version");
            command.add(mcVersion);
            command.add("--gameDir");
            command.add(dotDiomedes);
            command.add("--assetsDir");
            command.add(dotDiomedes + "/assets");
            command.add("--assetIndex");
            command.add(verIndex);
            command.add("--uuid");
            command.add("");
            command.add("--accessToken");
            command.add("");
            command.add("--clientId");
            command.add("${clientid}");
            command.add("--xuid");
            command.add("${auth_xuid}");
            command.add("--userType");
            command.add("msa");
            command.add("--versionType");
            command.add("release");
            command.addAll(mcArgsCommand.getGamerArgs());
            
            //System.out.println(command);
            JSONArray dsfgsdfghsdfh = new JSONArray(command);
            System.out.println(dsfgsdfghsdfh);
            
            try {
                // penetrar datos al cmd
                ProcessBuilder processBuilder = new ProcessBuilder(command);
                processBuilder.directory(new File(dotDiomedes));
                processBuilder.inheritIO();
                Process process = processBuilder.start();
                Thread.sleep(2500);
                dispose();
                
                process.waitFor();
                System.out.println("Exitcode: " + process.exitValue());
                setVisible(true);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void btn_partnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_partnersActionPerformed
        System.out.println("Ver partners");
        partnersWindow.setLocationRelativeTo(null);
        partnersWindow.setVisible(true);
    }//GEN-LAST:event_btn_partnersActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EventTitle;
    private javax.swing.JLabel LauncherVersionLabelJIJIJIJIJI;
    private javax.swing.JButton btn_partners;
    private javax.swing.JScrollPane eventDesc;
    private javax.swing.JLabel eventImg;
    private javax.swing.JPanel eventPanel;
    private javax.swing.JLabel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel newsPanel;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel showUserName;
    private javax.swing.JLabel showUserName1;
    private javax.swing.JLabel userHead;
    private javax.swing.JLabel usingRam;
    // End of variables declaration//GEN-END:variables
}
