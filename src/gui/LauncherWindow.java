package gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import objects.JuntaApi;
import objects.LauncherJunta;

import gui.*;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import org.json.JSONObject;
import util.LaunchMinecraft;

public class LauncherWindow extends javax.swing.JFrame {
    private JuntaApi JUNTA_API;
    private LauncherJunta LAUNCHER_CLASS;
    private String bgColor1, bgColor2, btnColor1, btnColor2, btnPlayColor, btnPlayFontString, fontColor1, fontColor2, eventTitle, LAUNCHER_VERSION;
    
    private Partners partnersWindow;
    private MinecraftSettings mcSettingsWindow;
    private LauncherSettings launcherSettingsWindow;
    private Credits creditsWindow;
    
    private LaunchMinecraft Launch_Minecraft;
    
    private JSONObject currentEvent;
    
    private Font mcFont, mcTitleFont;
    private ImageIcon headerIcon, userHeadIcon, eventIcon, btnPlayFontIcon;

    public LauncherWindow(JuntaApi JUNTA_API, LauncherJunta LAUNCHER_CLASS, String LAUNCHER_VERSION) throws MalformedURLException {
        
        this.JUNTA_API = JUNTA_API;
        this.LAUNCHER_CLASS = LAUNCHER_CLASS;
        this.LAUNCHER_VERSION = LAUNCHER_VERSION;
        
        this.partnersWindow = new Partners(JUNTA_API.getPartners(), this.JUNTA_API.getMoneyCollected());
        this.mcSettingsWindow = new MinecraftSettings();
        this.launcherSettingsWindow = new LauncherSettings();
        this.creditsWindow = new Credits(LAUNCHER_CLASS, JUNTA_API, this);
        this.Launch_Minecraft = new LaunchMinecraft();

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
        btn_credits = new javax.swing.JButton();
        LauncherVersionLabelJIJIJIJIJI1 = new javax.swing.JLabel();
        btn_settings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Junta Launcher");
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
        LauncherVersionLabelJIJIJIJIJI.setText("Launcher v" + this.LAUNCHER_VERSION);

        btn_credits.setBackground(Color.decode(btnColor1));
        btn_credits.setForeground(Color.decode(fontColor2));
        btn_credits.setText("Creditos");
        btn_credits.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_credits.setFocusPainted(false);
        btn_credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditsActionPerformed(evt);
            }
        });

        LauncherVersionLabelJIJIJIJIJI1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LauncherVersionLabelJIJIJIJIJI1.setForeground(Color.decode(fontColor2));
        LauncherVersionLabelJIJIJIJIJI1.setText("Client v" + this.LAUNCHER_CLASS.getServerVersion());

        btn_settings.setBackground(Color.decode(btnColor1));
        btn_settings.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_settings.setForeground(Color.decode(fontColor2));
        btn_settings.setText("Ajustes");
        btn_settings.setToolTipText("");
        btn_settings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_settings.setFocusPainted(false);
        btn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingsActionPerformed(evt);
            }
        });

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
                    .addComponent(btn_credits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LauncherVersionLabelJIJIJIJIJI)
                            .addComponent(LauncherVersionLabelJIJIJIJIJI1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_settings, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
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
                                .addComponent(showUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                            .addComponent(userHead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usingRam, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_partners, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(399, 399, 399)
                        .addComponent(LauncherVersionLabelJIJIJIJIJI1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LauncherVersionLabelJIJIJIJIJI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_credits, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        int exitCodeMC = Launch_Minecraft.launch(LAUNCHER_CLASS, JUNTA_API, this, LAUNCHER_CLASS.getUsername());
    }//GEN-LAST:event_playButtonActionPerformed

    private void btn_partnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_partnersActionPerformed
        System.out.println("Ver partners");
        partnersWindow.setLocationRelativeTo(null);
        partnersWindow.setVisible(true);
    }//GEN-LAST:event_btn_partnersActionPerformed

    private void btn_creditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditsActionPerformed
        creditsWindow.setLocationRelativeTo(null);
        creditsWindow.setVisible(true);
    }//GEN-LAST:event_btn_creditsActionPerformed

    private void btn_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_settingsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EventTitle;
    private javax.swing.JLabel LauncherVersionLabelJIJIJIJIJI;
    private javax.swing.JLabel LauncherVersionLabelJIJIJIJIJI1;
    private javax.swing.JButton btn_credits;
    private javax.swing.JButton btn_partners;
    private javax.swing.JButton btn_settings;
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
