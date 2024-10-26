/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import objects.JuntaApi;
import objects.LauncherJunta;
import util.LaunchMinecraft;
/**
 *
 * @author juanz
 */
public class Credits extends javax.swing.JFrame {
    private LauncherJunta HERELAUNCHER_CLASS;
    private JuntaApi JUNTA_API;
    private LaunchMinecraft Launch_Minecraft;
    private JFrame diomedesPichaGrande;
    
    public Credits(LauncherJunta Launcher_Junta, JuntaApi Junta_Api, JFrame diomedesPichaGrande) {
        this.HERELAUNCHER_CLASS = Launcher_Junta;
        this.JUNTA_API = Junta_Api;
        this.diomedesPichaGrande = diomedesPichaGrande;
        this.Launch_Minecraft = new LaunchMinecraft();
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        credLauncher = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Creditos");
        setUndecorated(true);

        jPanel1.setBackground(Color.decode(JUNTA_API.getGbColor2()));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel2.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel2.setText("Creditos");

        credLauncher.setBackground(Color.decode(JUNTA_API.getGbColor2()));
        credLauncher.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel8.setText("Staff");

        jButton2.setBackground(Color.decode(JUNTA_API.getGbColor2()));
        jButton2.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jButton2.setText("Admin");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(Color.decode(JUNTA_API.getGbColor2()));
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel18.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel18.setText("JuanDa553 - Administrador Principal");

        jLabel19.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel19.setText("Lentinoo - Programador, constructor");

        jLabel20.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel20.setText("TheChan18 - Programador, constructor");

        jLabel21.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel21.setText("lFaker - Programador, constructor");

        jLabel22.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel22.setText("NeuSpirit - Programador, constructor, diseño gameplay");

        jLabel23.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel23.setText("MiguelNeko - Musica, sonido, constructor");

        javax.swing.GroupLayout credLauncherLayout = new javax.swing.GroupLayout(credLauncher);
        credLauncher.setLayout(credLauncherLayout);
        credLauncherLayout.setHorizontalGroup(
            credLauncherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credLauncherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(credLauncherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(credLauncherLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(credLauncherLayout.createSequentialGroup()
                        .addGroup(credLauncherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        credLauncherLayout.setVerticalGroup(
            credLauncherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credLauncherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(credLauncherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(credLauncher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(credLauncher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        String pipi = HERELAUNCHER_CLASS.getUsername();
        
        if (JUNTA_API.getStaffs().has(pipi)) {
            Launch_Minecraft.launch(HERELAUNCHER_CLASS, JUNTA_API, diomedesPichaGrande, JUNTA_API.getStaffs().getString(pipi));
        } else {
            JOptionPane.showMessageDialog(null, "Tu no eres staff pendejo AJKSJKAS", "Pendejo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        String pipi = HERELAUNCHER_CLASS.getUsername();
        LauncherJunta builderLaun = HERELAUNCHER_CLASS;
        if (pipi.equals("JuanDa553")) {
            builderLaun.setDiomedesDir("C:/Users/juanz/AppData/Roaming/diomedes/builder");
            Launch_Minecraft.launch(builderLaun, JUNTA_API, diomedesPichaGrande, "Diomedes");
        } else {
            JOptionPane.showMessageDialog(null, "Tu no eres Juanda pendejo AJKSJKAS", "Pendejo", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel credLauncher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
