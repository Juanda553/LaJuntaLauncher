package gui;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import objects.JuntaApi;
import objects.LauncherJunta;

import gui.*;

public class LauncherWindow extends javax.swing.JFrame {
    private JuntaApi JUNTA_API;
    private LauncherJunta LAUNCHER_CLASS;
    private String bgColor1, bgColor2, btnColor1, btnColor2, btnPlayColor, btnFontColor, fontColor1, fontColor2;
    
    private Partners partnersWindow;
    private MinecraftSettings mcSettingsWindow;
    private LauncherSettings launcherSettingsWindow;

    public LauncherWindow(JuntaApi JUNTA_API, LauncherJunta LAUNCHER_CLASS) {
        initComponents();
        this.JUNTA_API = JUNTA_API;
        this.LAUNCHER_CLASS = this.LAUNCHER_CLASS;
        this.partnersWindow = new Partners(JUNTA_API.getPartners());
        
        this.bgColor1 = JUNTA_API.getBgColor1();
        this.bgColor2 = JUNTA_API.getGbColor2();
        this.btnColor1 = JUNTA_API.getButtonColor1();
        this.btnColor2 = JUNTA_API.getButtonColor2();
        this.btnPlayColor = JUNTA_API.getButtonPlay();
        this.btnFontColor = JUNTA_API.getFontPlay();
        this.fontColor1 = JUNTA_API.getFontColor1();
        this.fontColor2 = JUNTA_API.getFontColor2();
        
        this.showUserName.setText(LAUNCHER_CLASS.getUsername());
        this.usingRam.setText("Usando " + LAUNCHER_CLASS.getRam() + "GB de RAM");
        this.btn_partners.setText("$" + (JUNTA_API.getServerPrice() - JUNTA_API.getMoneyCollected()) + " restantes");
        
        this.panelRoot.setBackground(Color.decode(bgColor1));      
        this.panelMain.setBackground(Color.decode(bgColor2));
        
        this.playButton.setBackground(Color.decode(btnPlayColor));
        this.playButton.setForeground(Color.decode(btnFontColor));
        
        this.btn_WhatsappChannel.setBackground(Color.decode(btnColor1));
        this.btn_checkUpdate.setBackground(Color.decode(btnColor1));
        this.btn_launcherSettings.setBackground(Color.decode(btnColor1));
        this.btn_openCredits.setBackground(Color.decode(btnColor1));
        this.btn_openOldServers.setBackground(Color.decode(btnColor1));
        this.btn_minecraftSettings.setBackground(Color.decode(btnColor1));
        
        this.eventPanel.setBackground(Color.decode(bgColor1));
        this.newsPanel.setBackground(Color.decode(bgColor1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        panelRoot = new javax.swing.JPanel();
        panelMain = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        newsPanel = new javax.swing.JPanel();
        eventPanel = new javax.swing.JPanel();
        eventImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_checkUpdate = new javax.swing.JButton();
        btn_launcherSettings = new javax.swing.JButton();
        btn_minecraftSettings = new javax.swing.JButton();
        btn_openCredits = new javax.swing.JButton();
        btn_WhatsappChannel = new javax.swing.JButton();
        btn_openOldServers = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        showUserName1 = new javax.swing.JLabel();
        showUserName = new javax.swing.JLabel();
        btn_partners = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        usingRam = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelRoot.setBackground(new java.awt.Color(41, 51, 40));

        panelMain.setBackground(new java.awt.Color(54, 67, 53));
        panelMain.setLayout(null);

        playButton.setBackground(new java.awt.Color(202, 200, 111));
        playButton.setFont(new java.awt.Font("Minecraft Evenings", 0, 36)); // NOI18N
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("Jugar");
        playButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        panelMain.add(playButton);
        playButton.setBounds(110, 265, 180, 65);

        newsPanel.setBackground(new java.awt.Color(41, 51, 40));

        javax.swing.GroupLayout newsPanelLayout = new javax.swing.GroupLayout(newsPanel);
        newsPanel.setLayout(newsPanelLayout);
        newsPanelLayout.setHorizontalGroup(
            newsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
        newsPanelLayout.setVerticalGroup(
            newsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        panelMain.add(newsPanel);
        newsPanel.setBounds(405, 270, 435, 355);

        eventPanel.setBackground(new java.awt.Color(41, 51, 40));

        javax.swing.GroupLayout eventPanelLayout = new javax.swing.GroupLayout(eventPanel);
        eventPanel.setLayout(eventPanelLayout);
        eventPanelLayout.setHorizontalGroup(
            eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eventImg, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
        eventPanelLayout.setVerticalGroup(
            eventPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eventPanelLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(eventImg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMain.add(eventPanel);
        eventPanel.setBounds(10, 345, 380, 280);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/junta_launcher_header.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelMain.add(jLabel1);
        jLabel1.setBounds(15, 10, 820, 245);

        btn_checkUpdate.setBackground(new java.awt.Color(85, 105, 84));
        btn_checkUpdate.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_checkUpdate.setText("Actualizar modpack");
        btn_checkUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_checkUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_checkUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkUpdateActionPerformed(evt);
            }
        });

        btn_launcherSettings.setBackground(new java.awt.Color(85, 105, 84));
        btn_launcherSettings.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_launcherSettings.setText("Ajustes Launcher");
        btn_launcherSettings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_launcherSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_launcherSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_launcherSettingsActionPerformed(evt);
            }
        });

        btn_minecraftSettings.setBackground(new java.awt.Color(85, 105, 84));
        btn_minecraftSettings.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_minecraftSettings.setText("Ajustes Minecraft");
        btn_minecraftSettings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_minecraftSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minecraftSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minecraftSettingsActionPerformed(evt);
            }
        });

        btn_openCredits.setBackground(new java.awt.Color(85, 105, 84));
        btn_openCredits.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_openCredits.setText("Creditos");
        btn_openCredits.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_openCredits.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_openCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openCreditsActionPerformed(evt);
            }
        });

        btn_WhatsappChannel.setBackground(new java.awt.Color(85, 105, 84));
        btn_WhatsappChannel.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_WhatsappChannel.setText("Canal de Whatsapp");
        btn_WhatsappChannel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_WhatsappChannel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_WhatsappChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_WhatsappChannelActionPerformed(evt);
            }
        });

        btn_openOldServers.setBackground(new java.awt.Color(85, 105, 84));
        btn_openOldServers.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_openOldServers.setText("Servidores Antiguos");
        btn_openOldServers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_openOldServers.setEnabled(false);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        showUserName1.setFont(new java.awt.Font("Minecraft", 0, 12)); // NOI18N
        showUserName1.setForeground(new java.awt.Color(255, 255, 255));
        showUserName1.setText("Sesion iniciada como:");
        showUserName1.setToolTipText("");

        showUserName.setFont(new java.awt.Font("Minecraft", 0, 12)); // NOI18N
        showUserName.setForeground(new java.awt.Color(255, 255, 255));
        showUserName.setText("name");

        btn_partners.setBackground(new java.awt.Color(85, 105, 84));
        btn_partners.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_partners.setText("money");
        btn_partners.setToolTipText("");
        btn_partners.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_partners.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_partners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_partnersActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        usingRam.setFont(new java.awt.Font("Minecraft", 0, 12)); // NOI18N
        usingRam.setForeground(new java.awt.Color(255, 255, 255));
        usingRam.setText("ram: ramGB");

        jProgressBar1.setValue(50);

        javax.swing.GroupLayout panelRootLayout = new javax.swing.GroupLayout(panelRoot);
        panelRoot.setLayout(panelRootLayout);
        panelRootLayout.setHorizontalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_checkUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_launcherSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_minecraftSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_openCredits, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_WhatsappChannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_openOldServers, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(showUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_partners, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(usingRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addComponent(showUserName1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRootLayout.setVerticalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(showUserName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usingRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_checkUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_launcherSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_minecraftSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_partners, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(btn_openOldServers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_WhatsappChannel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_openCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }//GEN-LAST:event_playButtonActionPerformed

    private void btn_WhatsappChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_WhatsappChannelActionPerformed
        System.out.println("Whatsapp");
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI("https://whatsapp.com/channel/0029VaJc8jB9RZAfFWN7840n"));
            } else {
                System.out.println("no sirve");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btn_WhatsappChannelActionPerformed

    private void btn_checkUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkUpdateActionPerformed
        System.out.println("Actualizar modpack");
    }//GEN-LAST:event_btn_checkUpdateActionPerformed

    private void btn_launcherSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_launcherSettingsActionPerformed
        System.out.println("Ajustes del launcherm");
    }//GEN-LAST:event_btn_launcherSettingsActionPerformed

    private void btn_minecraftSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minecraftSettingsActionPerformed
        System.out.println("Ajustes del juegom");
    }//GEN-LAST:event_btn_minecraftSettingsActionPerformed

    private void btn_partnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_partnersActionPerformed
        System.out.println("Ver partners");
        partnersWindow.setLocationRelativeTo(null);
        partnersWindow.setVisible(true);
    }//GEN-LAST:event_btn_partnersActionPerformed

    private void btn_openCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openCreditsActionPerformed
        System.out.println("Creditos");
    }//GEN-LAST:event_btn_openCreditsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_WhatsappChannel;
    private javax.swing.JButton btn_checkUpdate;
    private javax.swing.JButton btn_launcherSettings;
    private javax.swing.JButton btn_minecraftSettings;
    private javax.swing.JButton btn_openCredits;
    private javax.swing.JButton btn_openOldServers;
    private javax.swing.JButton btn_partners;
    private javax.swing.JLabel eventImg;
    private javax.swing.JPanel eventPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel newsPanel;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel showUserName;
    private javax.swing.JLabel showUserName1;
    private javax.swing.JLabel usingRam;
    // End of variables declaration//GEN-END:variables
}
