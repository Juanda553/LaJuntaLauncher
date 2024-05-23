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

public class LoadingWindow extends javax.swing.JFrame {
    public LoadingWindow() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) throws MalformedURLException, ProtocolException, IOException {
        // Poniendo pantalla de carga
        LoadingWindow ldngWin = new LoadingWindow();
        ldngWin.setVisible(true);
        ldngWin.setLocationRelativeTo(null);
        
        // chupar la api
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

        System.out.println("Mathias te amo");
        
        JuntaApi JUNTA_API = new JuntaApi(
                api.getString("juntaName"),
                api.getString("serverIcon"),
                api.getString("forgeVersion"),
                api.getString("icon"),
                api.getString("modpackFirstInstall"),
                api.getString("modPackUpdate")
            );
        
        LauncherJunta LAUNCHER_JUNTA = new LauncherJunta(
               api.getString("launcherVersion"),
               api.getString("titleImage"),
               api.getString("background1"),
               api.getString("background2"),
               api.getString("button1"),
               api.getString("button2"),
               api.getString("buttonPlay"),
               api.getString("font1"),
               api.getString("font2")
            );
        
        NewsSection NEWS_SECTION = new NewsSection(
                api.getString("title"),
                api.getString("img"),
                api.getString("desc"),
                api.getString("date")
            );
        
        EventsSection EVENTS_SECTION = new EventsSection(
                api.getString("title"),
                api.getString("img"),
                api.getString("desc"),
                api.getString("startDate"),
                api.getString("endDate")
            );
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
