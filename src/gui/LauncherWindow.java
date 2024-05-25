package gui;

import java.awt.Color;
import objects.JuntaApi;
import objects.LauncherJunta;

public class LauncherWindow extends javax.swing.JFrame {
    private JuntaApi JUNTA_API;
    private LauncherJunta LAUNCHER_CLASS;
    private String bgColor1, bgColor2, btnColor1, btnColor2, btnPlayColor, btnFontColor, fontColor1, fontColor2;

    public LauncherWindow(JuntaApi JUNTA_API, LauncherJunta LAUNCHER_CLASS) {
        initComponents();
        this.JUNTA_API = JUNTA_API;
        this.LAUNCHER_CLASS = this.LAUNCHER_CLASS;
        
        this.bgColor1 = JUNTA_API.getBgColor1();
        this.bgColor2 = JUNTA_API.getGbColor2();
        this.btnColor1 = JUNTA_API.getButtonColor1();
        this.btnColor2 = JUNTA_API.getButtonColor2();
        this.btnPlayColor = JUNTA_API.getButtonPlay();
        this.btnFontColor = JUNTA_API.getFontPlay();
        this.fontColor1 = JUNTA_API.getFontColor1();
        this.fontColor2 = JUNTA_API.getFontColor2();
        
        
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

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelRoot.setBackground(new java.awt.Color(41, 51, 40));

        panelMain.setBackground(new java.awt.Color(54, 67, 53));
        panelMain.setLayout(null);

        playButton.setBackground(new java.awt.Color(168, 229, 127));
        playButton.setFont(new java.awt.Font("Minecraft Evenings", 0, 36)); // NOI18N
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("Jugar");
        playButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        btn_checkUpdate.setFont(new java.awt.Font("Minecraft", 0, 18)); // NOI18N
        btn_checkUpdate.setText("Actualizar");
        btn_checkUpdate.setBorder(null);

        btn_launcherSettings.setBackground(new java.awt.Color(85, 105, 84));
        btn_launcherSettings.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_launcherSettings.setText("Ajustes Launcher");
        btn_launcherSettings.setBorder(null);

        btn_minecraftSettings.setBackground(new java.awt.Color(85, 105, 84));
        btn_minecraftSettings.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_minecraftSettings.setText("Ajustes Minecraft");
        btn_minecraftSettings.setBorder(null);

        btn_openCredits.setBackground(new java.awt.Color(85, 105, 84));
        btn_openCredits.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_openCredits.setText("Creditos");
        btn_openCredits.setBorder(null);

        btn_WhatsappChannel.setBackground(new java.awt.Color(85, 105, 84));
        btn_WhatsappChannel.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_WhatsappChannel.setText("Canal de Whatsapp");
        btn_WhatsappChannel.setBorder(null);

        btn_openOldServers.setBackground(new java.awt.Color(85, 105, 84));
        btn_openOldServers.setFont(new java.awt.Font("Minecraft", 0, 14)); // NOI18N
        btn_openOldServers.setText("Servidores Antiguos");
        btn_openOldServers.setBorder(null);
        btn_openOldServers.setEnabled(false);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

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
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRootLayout.setVerticalGroup(
            panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRootLayout.createSequentialGroup()
                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_checkUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_launcherSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_minecraftSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_openOldServers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_WhatsappChannel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_openCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_playButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_WhatsappChannel;
    private javax.swing.JButton btn_checkUpdate;
    private javax.swing.JButton btn_launcherSettings;
    private javax.swing.JButton btn_minecraftSettings;
    private javax.swing.JButton btn_openCredits;
    private javax.swing.JButton btn_openOldServers;
    private javax.swing.JLabel eventImg;
    private javax.swing.JPanel eventPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel newsPanel;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables
}
