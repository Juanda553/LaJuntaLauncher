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
import org.json.JSONArray;

import objects.JuntaApi;
import objects.LauncherJunta;
import objects.NewsSection;
import objects.EventsSection;

import gui.LauncherWindow;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class LoadingWindow extends javax.swing.JFrame {
    private String mineDir, diomedesDir, juntaLauncherDir;
    
    public LoadingWindow() {
        initComponents();
        
        this.mineDir = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.minecraft";
        this.juntaLauncherDir = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/diomedes";
        this.diomedesDir = juntaLauncherDir + "/.diomedes";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        datosDeCarga = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Junta Launcher");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));

        datosDeCarga.setForeground(new java.awt.Color(255, 255, 255));
        datosDeCarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosDeCarga.setText("Cargando");
        datosDeCarga.setToolTipText("");
        datosDeCarga.setAlignmentX(0.5F);
        datosDeCarga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/junta_full_logo_resizedlow.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(datosDeCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datosDeCarga)
                .addContainerGap(25, Short.MAX_VALUE))
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
    
    public static void main(String args[]) throws MalformedURLException, ProtocolException, IOException, InterruptedException {
        // Poniendo pantalla de carga
        LoadingWindow thisWindow = new LoadingWindow();
        thisWindow.setVisible(true);
        thisWindow.setLocationRelativeTo(null);
        
        // chupar la api
        thisWindow.datosDeCarga.setText("Obteniendo datos de la nube");
        URL url = new URL("https://raw.githubusercontent.com/Juanda553/junta_api/main/junta_api.json");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        
        thisWindow.datosDeCarga.setText("Guardando datos");
        StringBuilder informationString = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
                
            while(scanner.hasNext()){
                informationString.append(scanner.nextLine());
        }
        scanner.close();
        
        // poner la api como0 json
        thisWindow.datosDeCarga.setText("Parseando datos a Json");
        JSONObject api = new JSONObject(informationString.toString());
        //System.out.println(api);
        
        // haciendo variables del json
        JSONObject apiLauncherProperties = (JSONObject) api.get("launcher_properties");
        JSONObject apiLauncherColors = (JSONObject) apiLauncherProperties.get("colores");
        
        // Mathias te amo
        thisWindow.datosDeCarga.setText("Mathias te amo");
        Thread.sleep(1000);
        
        thisWindow.datosDeCarga.setText("Instanciando datos del servidor");
        JuntaApi JUNTA_API = new JuntaApi(
                api.getString("juntaName"),
                api.getString("juntaVersion"),
                api.getString("forgeVersion"),
                api.getString("icon"),
                api.getString("modpackFirstInstall"),
                api.getString("modPackUpdate"),

                apiLauncherProperties.getString("launcherVersion"),
                apiLauncherProperties.getString("titleImage"),
                apiLauncherColors.getString("background1"),
                apiLauncherColors.getString("background2"),
                apiLauncherColors.getString("button1"),
                apiLauncherColors.getString("button2"),
                apiLauncherColors.getString("buttonPlay"),
                apiLauncherColors.getString("fontPlay"),
                apiLauncherColors.getString("font1"),
                apiLauncherColors.getString("font2"),
                apiLauncherProperties.getJSONObject("event"),
                apiLauncherProperties.getJSONArray("news"),
                apiLauncherProperties.getJSONArray("partners"),
                apiLauncherProperties.getJSONArray("splashes")
            );
        
        System.out.println(JUNTA_API.getDetails());
        
        thisWindow.datosDeCarga.setText("Abriendo settings.json");
        try {
            FileInputStream archivoEntrada = new FileInputStream(thisWindow.juntaLauncherDir+"/settings.json");
            InputStreamReader lector = new InputStreamReader(archivoEntrada, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(lector);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            bufferedReader.close();
        } catch (IOException e) {
            thisWindow.datosDeCarga.setText("Instalando requerimientos");
            File carpeta = new File(thisWindow.diomedesDir);
            carpeta.mkdirs();
            
            JSONObject localSettings = new JSONObject();
            localSettings.put("localVersion", JUNTA_API.getServerVersion());
            
            String jsonParla = localSettings.toString(4);
            
            try (FileWriter file = new FileWriter(thisWindow.juntaLauncherDir + "/settings.json")) {
                file.write(jsonParla);
                file.flush();
            } catch (Exception ex) {
                System.out.println("no " + ex);
            }
        }
            
        
        
        
        
        
        
        
        thisWindow.datosDeCarga.setText("Instanciando propiedades del Launcher");
        LauncherJunta LAUNCHER_CLASS = new LauncherJunta(
                JUNTA_API.getLauncherVersion(),
                JUNTA_API.getForgeVersion(),
                "Diomedes",
                "12"
        );
        
        thisWindow.datosDeCarga.setText("Terminado :)");
        
        
        LauncherWindow LAUNCHER_WINDOW = new LauncherWindow(JUNTA_API, LAUNCHER_CLASS);
        LAUNCHER_WINDOW.setLocationRelativeTo(null);
        LAUNCHER_WINDOW.setVisible(true);
        thisWindow.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datosDeCarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
