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
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.json.JSONObject;

public class LauncherWindow extends javax.swing.JFrame {
    private JuntaApi JUNTA_API;
    private LauncherJunta LAUNCHER_CLASS;
    private String bgColor1, bgColor2, btnColor1, btnColor2, btnPlayColor, btnPlayFont, fontColor1, fontColor2, eventTitle;
    
    private Partners partnersWindow;
    private MinecraftSettings mcSettingsWindow;
    private LauncherSettings launcherSettingsWindow;
    private JSONObject currentEvent;
    
    private Font mcFont, mcTitleFont;
    private ImageIcon headerIcon, userHeadIcon, eventIcon;

    public LauncherWindow(JuntaApi JUNTA_API, LauncherJunta LAUNCHER_CLASS) throws MalformedURLException {
        
        this.JUNTA_API = JUNTA_API;
        this.LAUNCHER_CLASS = LAUNCHER_CLASS;
        this.partnersWindow = new Partners(JUNTA_API.getPartners());
        
        try {
            this.mcFont = Font.createFont(Font.TRUETYPE_FONT, new File("src/resources/font/Minecraft.ttf"));
            this.mcTitleFont = Font.createFont(Font.TRUETYPE_FONT, new File("src/resources/font/MinecraftEvenings.ttf"));
        } catch (FontFormatException | IOException e) {
            System.out.println(e);
        }

        this.bgColor1 = JUNTA_API.getBgColor1();
        this.bgColor2 = JUNTA_API.getGbColor2();
        this.btnColor1 = JUNTA_API.getButtonColor1();
        this.btnColor2 = JUNTA_API.getButtonColor2();
        this.btnPlayColor = JUNTA_API.getButtonPlay();
        this.btnPlayFont = JUNTA_API.getFontPlay();
        this.fontColor1 = JUNTA_API.getFontColor1();
        this.fontColor2 = JUNTA_API.getFontColor2();
        this.currentEvent = JUNTA_API.getEvent();
        
        URL userHeadUrl = new URL("https://cravatar.eu/helmhead/" + LAUNCHER_CLASS.getUsername() + "/32.png");
        this.userHeadIcon = new ImageIcon(userHeadUrl);
        
        URL headerUrl = new URL(JUNTA_API.getTitleImg());
        this.headerIcon = new ImageIcon(headerUrl);
        
        URL eventImgUrl = new URL(currentEvent.getString("img"));
        this.eventIcon = new ImageIcon(eventImgUrl);
        
        initComponents();
        
        this.panelRoot.setBackground(Color.decode(bgColor1));      
        this.panelMain.setBackground(Color.decode(bgColor2));
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
        EventTitle = new javax.swing.JLabel();
        eventDesc = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
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
        userHead = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Junta Laucnher");
        setResizable(false);

        panelRoot.setBackground(new java.awt.Color(51, 51, 51));

        panelMain.setBackground(new java.awt.Color(102, 102, 102));
        panelMain.setLayout(null);

        playButton.setBackground(Color.decode(btnPlayColor));
        playButton.setFont(mcTitleFont.deriveFont(36f));
        playButton.setForeground(Color.decode(btnPlayFont));
        playButton.setText("Jugar");
        playButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.setFocusPainted(false);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        panelMain.add(playButton);
        playButton.setBounds(110, 265, 180, 65);

        newsPanel.setBackground(new java.awt.Color(51, 51, 51));

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

        eventPanel.setBackground(new java.awt.Color(51, 51, 51));
        eventPanel.setLayout(null);

        eventImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventImg.setIcon(eventIcon);
        eventImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        eventPanel.add(eventImg);
        eventImg.setBounds(5, 105, 368, 165);

        EventTitle.setFont(mcTitleFont.deriveFont(24f));
        EventTitle.setForeground(Color.decode(fontColor1));
        EventTitle.setText(currentEvent.getString("title"));
        eventPanel.add(EventTitle);
        EventTitle.setBounds(10, 10, 360, 16);

        eventDesc.setForeground(Color.decode(fontColor1));
        eventDesc.setText(currentEvent.getString("desc"));
        eventDesc.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        eventPanel.add(eventDesc);
        eventDesc.setBounds(9, 33, 360, 65);

        panelMain.add(eventPanel);
        eventPanel.setBounds(10, 345, 380, 280);

        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/junta_launcher_header.jpg"))); // NOI18N
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelMain.add(header);
        header.setBounds(15, 10, 820, 245);

        btn_checkUpdate.setBackground(Color.decode(btnColor1));
        btn_checkUpdate.setFont(mcFont.deriveFont(14f));
        btn_checkUpdate.setForeground(Color.decode(fontColor2));
        btn_checkUpdate.setText("Actualizar modpack");
        btn_checkUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_checkUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_checkUpdate.setFocusPainted(false);
        btn_checkUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkUpdateActionPerformed(evt);
            }
        });

        btn_launcherSettings.setBackground(Color.decode(btnColor1));
        btn_launcherSettings.setFont(mcFont.deriveFont(14f));
        btn_launcherSettings.setForeground(Color.decode(fontColor2));
        btn_launcherSettings.setText("Ajustes Launcher");
        btn_launcherSettings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_launcherSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_launcherSettings.setFocusPainted(false);
        btn_launcherSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_launcherSettingsActionPerformed(evt);
            }
        });

        btn_minecraftSettings.setBackground(Color.decode(btnColor1));
        btn_minecraftSettings.setFont(mcFont.deriveFont(14f));
        btn_minecraftSettings.setForeground(Color.decode(fontColor2));
        btn_minecraftSettings.setText("Ajustes Minecraft");
        btn_minecraftSettings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_minecraftSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_minecraftSettings.setFocusPainted(false);
        btn_minecraftSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minecraftSettingsActionPerformed(evt);
            }
        });

        btn_openCredits.setBackground(Color.decode(btnColor1));
        btn_openCredits.setFont(mcFont.deriveFont(14f));
        btn_openCredits.setForeground(Color.decode(fontColor2));
        btn_openCredits.setText("Creditos");
        btn_openCredits.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_openCredits.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_openCredits.setFocusPainted(false);
        btn_openCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openCreditsActionPerformed(evt);
            }
        });

        btn_WhatsappChannel.setBackground(Color.decode(btnColor1));
        btn_WhatsappChannel.setFont(mcFont.deriveFont(14f));
        btn_WhatsappChannel.setForeground(Color.decode(fontColor2));
        btn_WhatsappChannel.setText("Canal de Whatsapp");
        btn_WhatsappChannel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_WhatsappChannel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_WhatsappChannel.setFocusPainted(false);
        btn_WhatsappChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_WhatsappChannelActionPerformed(evt);
            }
        });

        btn_openOldServers.setBackground(Color.decode(btnColor1));
        btn_openOldServers.setFont(mcFont.deriveFont(14f));
        btn_openOldServers.setForeground(Color.decode(fontColor2));
        btn_openOldServers.setText("Servidores Antiguos");
        btn_openOldServers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_openOldServers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_openOldServers.setFocusPainted(false);
        btn_openOldServers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openOldServersActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        showUserName1.setFont(new java.awt.Font("Minecraft", 0, 12)); // NOI18N
        showUserName1.setForeground(Color.decode(fontColor1));
        showUserName1.setText("Sesion iniciada como:");
        showUserName1.setToolTipText("");

        showUserName.setFont(new java.awt.Font("Minecraft", 0, 12)); // NOI18N
        showUserName.setForeground(Color.decode(fontColor1));
        showUserName.setText(LAUNCHER_CLASS.getUsername());

        btn_partners.setBackground(Color.decode(btnColor1));
        btn_partners.setFont(mcFont.deriveFont(14f));
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

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        usingRam.setFont(new java.awt.Font("Minecraft", 0, 12)); // NOI18N
        usingRam.setForeground(Color.decode(fontColor1));
        usingRam.setText("Usando " + LAUNCHER_CLASS.getRam() + "GB de RAM");

        userHead.setIcon(userHeadIcon);

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
                    .addComponent(btn_partners, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(usingRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelRootLayout.createSequentialGroup()
                        .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showUserName1)
                            .addComponent(showUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userHead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRootLayout.createSequentialGroup()
                                .addComponent(showUserName1)
                                .addGap(4, 4, 4)
                                .addComponent(showUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(userHead, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
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
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                JOptionPane.showMessageDialog(null, "Esta función aún sigue en desarrollo.", "Mensaje de Diomedes", JOptionPane.INFORMATION_MESSAGE);
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
            } else {
                System.out.println("no sirve");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
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
        JOptionPane.showMessageDialog(null, "Esta función aún sigue en desarrollo.", "Mensaje de Diomedes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_checkUpdateActionPerformed

    private void btn_launcherSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_launcherSettingsActionPerformed
        System.out.println("Ajustes del launcherm");
        JOptionPane.showMessageDialog(null, "Esta función aún sigue en desarrollo.", "Mensaje de Diomedes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_launcherSettingsActionPerformed

    private void btn_minecraftSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minecraftSettingsActionPerformed
        System.out.println("Ajustes del juegom");
        JOptionPane.showMessageDialog(null, "Esta función aún sigue en desarrollo.", "Mensaje de Diomedes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_minecraftSettingsActionPerformed

    private void btn_partnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_partnersActionPerformed
        System.out.println("Ver partners");
        partnersWindow.setLocationRelativeTo(null);
        partnersWindow.setVisible(true);
    }//GEN-LAST:event_btn_partnersActionPerformed

    private void btn_openCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openCreditsActionPerformed
        System.out.println("Creditos");
        JOptionPane.showMessageDialog(null, "Esta función aún sigue en desarrollo.", "Mensaje de Diomedes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_openCreditsActionPerformed

    private void btn_openOldServersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openOldServersActionPerformed
        System.out.println("Servidores viejos");
        JOptionPane.showMessageDialog(null, "Esta función aún sigue en desarrollo.", "Mensaje de Diomedes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_openOldServersActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EventTitle;
    private javax.swing.JButton btn_WhatsappChannel;
    private javax.swing.JButton btn_checkUpdate;
    private javax.swing.JButton btn_launcherSettings;
    private javax.swing.JButton btn_minecraftSettings;
    private javax.swing.JButton btn_openCredits;
    private javax.swing.JButton btn_openOldServers;
    private javax.swing.JButton btn_partners;
    private javax.swing.JLabel eventDesc;
    private javax.swing.JLabel eventImg;
    private javax.swing.JPanel eventPanel;
    private javax.swing.JLabel header;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
