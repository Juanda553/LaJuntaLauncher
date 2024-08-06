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
import org.json.JSONArray;
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
        credClient = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        credLauncher = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        credServidor = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Creditos");
        setUndecorated(true);

        jPanel1.setBackground(Color.decode(JUNTA_API.getGbColor2()));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel2.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel2.setText("Fundador y dueño: JuanDa553");

        credClient.setBackground(Color.decode(JUNTA_API.getGbColor2()));
        credClient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel9.setText("Cliente");

        jLabel1.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel1.setText("Diseñador: JuanDa553");

        jLabel10.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel10.setText("Actualizar 1.19.2: Lentinoo");

        jLabel7.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel7.setText("Modpack Tester: JuanDa553");

        jLabel12.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel12.setText("Diseñador menú Principal: JuanDa553");

        jLabel13.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel13.setText("Diseñador menú pausa: JuanDa553");

        javax.swing.GroupLayout credClientLayout = new javax.swing.GroupLayout(credClient);
        credClient.setLayout(credClientLayout);
        credClientLayout.setHorizontalGroup(
            credClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credClientLayout.createSequentialGroup()
                .addGroup(credClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(credClientLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(credClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)))
                    .addGroup(credClientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        credClientLayout.setVerticalGroup(
            credClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(16, 16, 16))
        );

        credLauncher.setBackground(Color.decode(JUNTA_API.getGbColor2()));
        credLauncher.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel8.setText("Launcher");

        jLabel4.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel4.setText("Programadores: JuanDa553");
        jLabel4.setToolTipText("");

        jLabel5.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel5.setText("Diseñadores: JuanDa553");

        jLabel6.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel6.setText("Testers: JuanDa553, Chucho");

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
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        credLauncherLayout.setVerticalGroup(
            credLauncherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, credLauncherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(credLauncherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(credLauncherLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(credLauncherLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );

        credServidor.setBackground(Color.decode(JUNTA_API.getGbColor2()));
        credServidor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel11.setText("Servidor");

        jLabel14.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel14.setText("Host: Vultam");

        jLabel15.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel15.setText("Programador: JuanDa553");

        jLabel16.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel16.setText("Diseño: JuanDa553");

        jLabel3.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel3.setText("Constructores: JuanDa553");

        jLabel17.setForeground(Color.decode(JUNTA_API.getFontColor1()));
        jLabel17.setText("Historia: JuanDa553");

        javax.swing.GroupLayout credServidorLayout = new javax.swing.GroupLayout(credServidor);
        credServidor.setLayout(credServidorLayout);
        credServidorLayout.setHorizontalGroup(
            credServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credServidorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(credServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        credServidorLayout.setVerticalGroup(
            credServidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(credServidorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(16, 16, 16))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(credLauncher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(credClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(credLauncher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JPanel credClient;
    private javax.swing.JPanel credLauncher;
    private javax.swing.JPanel credServidor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
