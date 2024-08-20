/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;
import util.JuandaUtils;

/**
 *
 * @author juanz
 */
public class Playing extends javax.swing.JFrame {
    int maxplayers, onlinePlayers;
    String motd, serverVersion;
    JSONArray playerList;
    boolean OnLine;
    
    public Playing(String _serverIP) throws MalformedURLException, IOException {
        String serverIP = _serverIP;
        JuandaUtils utils = new JuandaUtils();

        initComponents();
        URL mcSrvStatURl = new URL("https://api.mcsrvstat.us/3/" + serverIP);
        
        JSONObject mcSrvStat = utils.getApi(mcSrvStatURl);
        
        if (mcSrvStat.getBoolean("online")){
            this.OnLine = true;
            this.motd = (String) mcSrvStat.getJSONObject("motd").getJSONArray("raw").get(0);
            this.onlinePlayers = mcSrvStat.getJSONObject("players").getInt("online");
            this.maxplayers = mcSrvStat.getJSONObject("players").getInt("max");
            this.serverVersion = (String) mcSrvStat.getJSONObject("motd").getJSONArray("raw").get(1);
            try {
                this.playerList = mcSrvStat.getJSONObject("players").getJSONArray("list");
            } catch (Exception e) {
                this.playerList = new JSONArray("[{\"name\": \"Nadie conectado\", \"uuid\": \"\"}]");
            }
        } else {
            this.OnLine = false;
            this.motd = "Apagado";
            this.onlinePlayers = 0;
            this.maxplayers = 20;
            this.serverVersion = "vDesconocida";
            this.playerList = new JSONArray("[{\"name\": \"Nadie conectado\", \"uuid\": \"\"}]");
        }

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        
        String[] cachones = new String[1];
        for (int i = 0; i < playerList.length(); i++) {
            JSONObject cachon = new JSONObject(String.valueOf(playerList.get(i)));
    
            cachones[0] = cachon.getString("name");
            
            model.addRow(cachones);
            playerlist.setModel(model);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        playerlist = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        playerlist.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        playerlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        playerlist.setRowHeight(32);
        jScrollPane1.setViewportView(playerlist);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int getOnlinePlayers(){
        try {
            return this.onlinePlayers;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Este es un error que no daña el launcher, pero igual envia captura de este error: \n" + e, "Error Suave", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public int getMaxPlayers(){
        try {
            return this.maxplayers;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Este es un error que no daña el launcher, pero igual envia captura de este error: \n" + e, "Error Suave", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public boolean isOnLine() {
        return OnLine;
    }

    public void setOnLine(boolean OnLine) {
        this.OnLine = OnLine;
    }
    
    public String getServerVersion(){
        try {
            return this.serverVersion;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Este es un error que no daña el launcher, pero igual envia captura de este error: \n" + e, "Error Suave", JOptionPane.ERROR_MESSAGE);
            return "";
        }
    }
    
    public String getServerMotd(){
        try {
            return this.motd;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Este es un error que no daña el launcher, pero igual envia captura de este error: \n" + e, "Error Suave", JOptionPane.ERROR_MESSAGE);
            return "";
        }
    }
    
    public JSONArray getPlayerList(){
        try {
            return this.playerList;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Este es un error que no daña el launcher, pero igual envia captura de este error: \n" + e, "Error Suave", JOptionPane.ERROR_MESSAGE);
            return this.playerList;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable playerlist;
    // End of variables declaration//GEN-END:variables
}
