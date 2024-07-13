/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author juanz
 */
public class Partners extends javax.swing.JFrame {
    public Partners(JSONArray jsonArray, int  totalMoney) {
        initComponents();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Dinero Aportado");
        
        int collected = 0;
        String[] cachones = new String[2];
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject cachon = new JSONObject(String.valueOf(jsonArray.get(i)));
    
            cachones[0] = cachon.getString("name");
            cachones[1] = "$" + cachon.getInt("paid");
            collected += cachon.getInt("paid");
            
            model.addRow(cachones);
            partnersList.setModel(model);
        }
        
        cachones[0] = "";
        cachones[1] = "";
            
        model.addRow(cachones);
        
        cachones[0] = "Total";
        cachones[1] = "$" + collected;
            
        model.addRow(cachones);
        partnersList.setModel(model);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        partnersList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Partners");
        setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        partnersList.setBackground(new java.awt.Color(102, 102, 102));
        partnersList.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        partnersList.setForeground(new java.awt.Color(255, 255, 255));
        partnersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        partnersList.setGridColor(new java.awt.Color(51, 51, 51));
        partnersList.setRowHeight(32);
        jScrollPane1.setViewportView(partnersList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable partnersList;
    // End of variables declaration//GEN-END:variables
}
