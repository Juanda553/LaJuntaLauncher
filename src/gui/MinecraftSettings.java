/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import com.sun.org.apache.bcel.internal.generic.Select;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import objects.LauncherJunta;
import org.json.JSONObject;

/**
 *
 * @author juanz
 */
public class MinecraftSettings extends javax.swing.JFrame {
    String launcherVersion, forgeVersion;
    public MinecraftSettings(String launcherVersion, String forgeVersion) {
        initComponents();
        this.launcherVersion = launcherVersion;
        this.forgeVersion = forgeVersion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username_fiield = new javax.swing.JTextField();
        selectRam = new javax.swing.JSlider();
        okbnt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        currentRam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        username_fiield.setToolTipText("Nombre de usuario");

        selectRam.setMaximum(16);
        selectRam.setMinimum(4);
        selectRam.setSnapToTicks(true);
        selectRam.setValue(4);

        okbnt.setText("Aceptar");
        okbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbntActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecciona tu ram y username");

        currentRam.setText("ram");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username_fiield, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(currentRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okbnt))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username_fiield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okbnt)
                    .addComponent(currentRam))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbntActionPerformed
        try {
            String path = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/diomedes/settings.json";
            String settingsContent;
            settingsContent = new String(Files.readAllBytes(Paths.get(path)));
            JSONObject settingsJson = new JSONObject(settingsContent);
            
            String username = username_fiield.getText();
            int ram = selectRam.getValue();
            
            settingsJson.put("username",username);
            settingsJson.put("minecraftRam",ram);
            
            Files.write(Paths.get(path), settingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);
            
            LauncherJunta LAUNCHER_CLASS = new LauncherJunta(
                launcherVersion,
                forgeVersion,
                settingsJson.getString("username"),
                settingsJson.getInt("minecraftRam")
        );
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_okbntActionPerformed

    public static void main(String args[]) {
        MinecraftSettings thisWindow = new MinecraftSettings("","");
        
        thisWindow.currentRam.setText("RAM: " + thisWindow.selectRam.getValue() + "GB");
        thisWindow.selectRam.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e) {
                thisWindow.currentRam.setText("RAM: " + thisWindow.selectRam.getValue() + "GB");
            }
        }
        );
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentRam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okbnt;
    private javax.swing.JSlider selectRam;
    private javax.swing.JTextField username_fiield;
    // End of variables declaration//GEN-END:variables
}
