package gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

import objects.JuntaApi;
import objects.LauncherJunta;
import objects.NewsSection;
import objects.EventsSection;

import gui.LauncherWindow;

public class LoadingWindow extends javax.swing.JFrame {
    private LauncherWindow LAUNCHER_WINDOW;
    
    public LoadingWindow() {
        initComponents();
        
        this.LAUNCHER_WINDOW = new LauncherWindow();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datosDeCarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datosDeCarga.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(datosDeCarga)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(datosDeCarga)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) throws MalformedURLException, ProtocolException, IOException {
        // Poniendo pantalla de carga
        LoadingWindow ldngWin = new LoadingWindow();
        ldngWin.setVisible(true);
        ldngWin.setLocationRelativeTo(null);
        
        // chupar la api
        ldngWin.datosDeCarga.setText("Obteniendo datos de la nube");
        URL url = new URL("https://pastebin.com/raw/nj6RWKmF");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        
        
        StringBuilder informationString = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
                
            while(scanner.hasNext()){
                informationString.append(scanner.nextLine());
        }
        scanner.close();
        
        // poner la api como0 json
        JSONObject api = new JSONObject(informationString.toString());
        System.out.println(api);
        
        JSONObject apiLauncherProperties = (JSONObject) api.get("launcher_properties");
        JSONObject apiLauncherColors = (JSONObject) apiLauncherProperties.get("colores");
        
        //JSONObject apiNews = (JSONObject) apiLauncherProperties.get("news");
        //JSONObject apiEvents = (JSONObject) apiLauncherProperties.get("events");

        System.out.println("Mathias te amo");
        
        JuntaApi JUNTA_API = new JuntaApi(
                api.getString("juntaName"),
                api.getString("juntaVersion"),
                api.getString("forgeVersion"),
                api.getString("icon"),
                api.getString("modpackFirstInstall"),
                api.getString("modPackUpdate")
            );
        
        LauncherJunta LAUNCHER_JUNTA = new LauncherJunta(
               apiLauncherProperties.getString("launcherVersion"),
               apiLauncherProperties.getString("titleImage"),
               apiLauncherColors.getString("background1"),
               apiLauncherColors.getString("background2"),
               apiLauncherColors.getString("button1"),
               apiLauncherColors.getString("button2"),
               apiLauncherColors.getString("buttonPlay"),
               apiLauncherColors.getString("font1"),
               apiLauncherColors.getString("font2")
            ); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datosDeCarga;
    // End of variables declaration//GEN-END:variables
}
