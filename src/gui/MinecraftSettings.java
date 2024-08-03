/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;
import objects.JuntaApi;
import objects.LauncherJunta;
import org.json.JSONObject;
import gui.LauncherWindow;
import java.io.File;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import util.cargando;



/**
 *
 * @author juanz
 */
public class MinecraftSettings extends javax.swing.JFrame {
    private JuntaApi JUNTA_API;
    private LauncherJunta LAUNCHER_CLASS;
    private String bgColor1, bgColor2, btnColor1, btnColor2, btnPlayColor, btnPlayFontString, fontColor1, fontColor2, eventTitle, launcherDir, dotDiomedes;
    
    private String back_username;
    private int back_ram;
    private boolean back_highQuality;
    
    public MinecraftSettings(JuntaApi JUNTA_API, LauncherJunta LAUNCHER_CLASS, String launcherDir, String dotDiomedes) {
        this.JUNTA_API = JUNTA_API;
        this.LAUNCHER_CLASS = LAUNCHER_CLASS;
        
        this.bgColor1 = JUNTA_API.getBgColor1();
        this.bgColor2 = JUNTA_API.getGbColor2();
        this.btnColor1 = JUNTA_API.getButtonColor1();
        this.btnColor2 = JUNTA_API.getButtonColor2();
        this.btnPlayColor = JUNTA_API.getButtonPlay();
        this.btnPlayFontString = JUNTA_API.getFontPlay();
        this.fontColor1 = JUNTA_API.getFontColor1();
        this.fontColor2 = JUNTA_API.getFontColor2();
        
        this.launcherDir = launcherDir;
        this.dotDiomedes = dotDiomedes;
        
        initComponents();
        loadSettings();
        
        
        
        
        jPanel1.setBackground(Color.decode(bgColor2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        highQualityCheck = new javax.swing.JCheckBox();
        btn_apply = new javax.swing.JButton();
        btn_load = new javax.swing.JButton();
        btn_changeName = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        current_user = new javax.swing.JLabel();
        sliderRam = new javax.swing.JSlider();
        selectedRam = new javax.swing.JLabel();
        btn_hardResetSeason = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajustes");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(Color.decode(JUNTA_API.getBorderColor()), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(Color.decode(fontColor1));
        jLabel1.setText("Ajustes del juego");

        jLabel2.setForeground(Color.decode(fontColor1));
        jLabel2.setText("Ram del juego");

        jLabel3.setForeground(Color.decode(fontColor1));
        jLabel3.setText("Modo Alta Calidad");

        highQualityCheck.setBackground(Color.decode(bgColor1));
        highQualityCheck.setForeground(Color.decode(fontColor1));
        highQualityCheck.setText("Alta Calidad");
        highQualityCheck.setToolTipText("Activa los shaders y otos efectos visuales");
        highQualityCheck.setFocusable(false);

        btn_apply.setBackground(Color.decode(btnColor2));
        btn_apply.setForeground(Color.decode(fontColor1));
        btn_apply.setText("Aplicar");
        btn_apply.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_apply.setFocusPainted(false);
        btn_apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_applyActionPerformed(evt);
            }
        });

        btn_load.setBackground(Color.decode(btnColor2));
        btn_load.setForeground(Color.decode(fontColor1));
        btn_load.setText("Restablecer");
        btn_load.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_load.setFocusPainted(false);
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });

        btn_changeName.setBackground(Color.decode(btnColor2));
        btn_changeName.setForeground(Color.decode(fontColor1));
        btn_changeName.setText("Cambiar Usuario");
        btn_changeName.setFocusPainted(false);
        btn_changeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeNameActionPerformed(evt);
            }
        });

        btn_close.setBackground(Color.decode(btnColor2));
        btn_close.setForeground(Color.decode(fontColor1));
        btn_close.setText("Cerrar");
        btn_close.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_close.setFocusPainted(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jLabel4.setForeground(Color.decode(fontColor1));
        jLabel4.setText("Nombre de usuario");

        current_user.setForeground(Color.decode(fontColor1));
        current_user.setText("abcdefghijk");

        sliderRam.setBackground(Color.decode(bgColor2));
        sliderRam.setMaximum(16);
        sliderRam.setMinimum(4);
        sliderRam.setSnapToTicks(true);
        sliderRam.setValue(5);
        sliderRam.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                sliderRamAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        sliderRam.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                sliderRamAncestorMoved1(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        sliderRam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sliderRamMouseReleased(evt);
            }
        });
        sliderRam.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                sliderRamVetoableChange(evt);
            }
        });

        selectedRam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectedRam.setForeground(Color.decode(fontColor1));
        selectedRam.setText("ram");

        btn_hardResetSeason.setBackground(Color.decode(btnColor2));
        btn_hardResetSeason.setForeground(Color.decode(fontColor1));
        btn_hardResetSeason.setText("Formatear");
        btn_hardResetSeason.setFocusPainted(false);
        btn_hardResetSeason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hardResetSeasonActionPerformed(evt);
            }
        });

        jLabel5.setForeground(Color.decode(fontColor1));
        jLabel5.setText("Formatear datos de La Junta Actual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sliderRam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_load, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectedRam)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(highQualityCheck)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(current_user)
                            .addComponent(jLabel1)
                            .addComponent(btn_changeName)
                            .addComponent(btn_hardResetSeason)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sliderRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedRam))
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highQualityCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(current_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_changeName)
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hardResetSeason)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_load)
                    .addComponent(btn_apply)
                    .addComponent(btn_close))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadActionPerformed
        try {
            if (loadSettings()) {
                System.out.println("Ya");
            } else {
                System.out.println(10/0);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_loadActionPerformed

    private void btn_applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_applyActionPerformed
        try {
                LAUNCHER_CLASS.setRam(sliderRam.getValue());
                LAUNCHER_CLASS.setHighQualityMode(highQualityCheck.isSelected());
                LAUNCHER_CLASS.setUsername(current_user.getText());

                String path = this.launcherDir+"/settings.json";
                String settingsContent = new String(Files.readAllBytes(Paths.get(path)));
                JSONObject settingsJson = new JSONObject(settingsContent);

                settingsJson.put("minecraftRam", sliderRam.getValue());
                settingsJson.put("highQualityMode", highQualityCheck.isSelected());
                settingsJson.put("username", current_user.getText());

                Files.write(Paths.get(path), settingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);
                
                if (this.back_highQuality != highQualityCheck.isSelected())
                    if (highQualityCheck.isSelected()){
                        activandoHihgQuality();
                    } else {
                        desactivandoHihgQuality();
                    }
                
                loadSettings();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_applyActionPerformed

    private void btn_changeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changeNameActionPerformed
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_changeNameActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        try {
            if (!this.back_username.equals(current_user.getText()) || this.back_ram != sliderRam.getValue() || this.back_highQuality != highQualityCheck.isSelected()) {
                int ex = JOptionPane.showConfirmDialog(null, "Aún no has aplicado los cambios, estás seguro de cerrar sin guardar cambios?");
                
                if (ex == 0) {
                    loadSettings();
                    dispose();
                }
            } else {
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error cerrar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_closeActionPerformed

    private void sliderRamMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderRamMouseReleased
        try {
            selectedRam.setText(sliderRam.getValue() + " GB");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error Ram", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sliderRamMouseReleased

    private void sliderRamAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sliderRamAncestorMoved

    }//GEN-LAST:event_sliderRamAncestorMoved

    private void sliderRamAncestorMoved1(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_sliderRamAncestorMoved1

    }//GEN-LAST:event_sliderRamAncestorMoved1

    private void sliderRamVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_sliderRamVetoableChange

    }//GEN-LAST:event_sliderRamVetoableChange

    private void btn_hardResetSeasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hardResetSeasonActionPerformed
        try {
            int formatear = JOptionPane.showConfirmDialog(null, "Seguro quieres formatear tu Junta? Esto no hará que pierdas tu inventario, solo reiniciará todos tus ajustes del juego.");
            
            if(formatear == 0) {
                FileUtils.cleanDirectory(new File(dotDiomedes)); // Eliminar el .diomedes

                String path = this.launcherDir + "/settings.json";
                String settingsContent = new String(Files.readAllBytes(Paths.get(path)));
                JSONObject settingsJson = new JSONObject(settingsContent);

                settingsJson.put("juntaName", "Junta Nothing");
                settingsJson.put("juntaServerVersion", "0.0.0");

                Files.write(Paths.get(path), settingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);
                
                JOptionPane.showMessageDialog(null, "Formateo con exito, por favor reinicia el Launcher.", "Fomatear", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error de formateo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_hardResetSeasonActionPerformed

    private boolean loadSettings(){
        try {
            sliderRam.setValue(LAUNCHER_CLASS.getRam());
            highQualityCheck.setSelected(LAUNCHER_CLASS.isHighQualityMode());
            current_user.setText(LAUNCHER_CLASS.getUsername());
            selectedRam.setText(sliderRam.getValue() + " GB");
            
            this.back_ram = sliderRam.getValue();
            this.back_highQuality = highQualityCheck.isSelected();
            this.back_username = current_user.getText();
            
            if (LAUNCHER_CLASS.getRam() <= 5) {
                highQualityCheck.setEnabled(false);
                highQualityCheck.setToolTipText("No tienes la Ram suficiente");
            } else if (LAUNCHER_CLASS.getRam() >= 5) {
                highQualityCheck.setEnabled(true);
                highQualityCheck.setToolTipText("Activa los shaders y otos efectos visuales");
            }
            
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error de carga", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private boolean activandoHihgQuality(){
        try {
            JSONArray filesHQ = new JSONArray(JUNTA_API.getHighQualityData().getJSONArray("files"));
            
            for (int i = 0; i < filesHQ.length(); i++) {
                JSONObject mod = filesHQ.getJSONObject(i);
                String name = mod.getString("name");
                File loc = new File(dotDiomedes + "/" + mod.getString("loc"));
                URL downloadLink = new URL(mod.getString("download"));
                
                FileUtils.copyURLToFile(downloadLink, loc);
                System.out.println(name + " descargado");
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error HQ", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    private boolean desactivandoHihgQuality(){
        try {
            JSONArray filesHQ = new JSONArray(JUNTA_API.getHighQualityData().getJSONArray("files"));
            
            for (int i = 0; i < filesHQ.length(); i++) {
                JSONObject mod = filesHQ.getJSONObject(i);
                String name = mod.getString("name");
                File loc = new File(dotDiomedes + "/" + mod.getString("loc"));
                
                loc.delete();
                System.out.println(name + " eliminado");
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error HQ", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apply;
    private javax.swing.JButton btn_changeName;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_hardResetSeason;
    private javax.swing.JButton btn_load;
    private javax.swing.JLabel current_user;
    private javax.swing.JCheckBox highQualityCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel selectedRam;
    private javax.swing.JSlider sliderRam;
    // End of variables declaration//GEN-END:variables
}
