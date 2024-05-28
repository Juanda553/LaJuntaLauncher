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
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;

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
        
        URL API_URL = new URL("https://pastebin.com/raw/nj6RWKmF");
        
        // chupar la api
        thisWindow.datosDeCarga.setText("Obteniendo datos de la nube");
        HttpURLConnection connection = (HttpURLConnection) API_URL.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        
        thisWindow.datosDeCarga.setText("Guardando datos de la nube");
        StringBuilder informationString = new StringBuilder();
            Scanner scanner = new Scanner(API_URL.openStream());
                
            while(scanner.hasNext()){
                informationString.append(scanner.nextLine());
        }
        scanner.close();
        
        // poner la api como0 json
        thisWindow.datosDeCarga.setText("Parseando datos a Json");
        JSONObject api = new JSONObject(informationString.toString());
        
        // objetos padre del Json
        JSONObject apiLauncherProperties = (JSONObject) api.get("launcher_properties");
        JSONObject apiLauncherColors = (JSONObject) apiLauncherProperties.get("colores");

        
        // Literalmente lo que dice abajo es lo que hace esto xd | VVVV
        thisWindow.datosDeCarga.setText("Instanciando datos de la API");
        JuntaApi JUNTA_API = new JuntaApi(
                api.getString("juntaName"),
                api.getString("juntaVersion"),
                api.getString("forgeVersion"),
                api.getString("icon"),
                api.getString("modpackFirstInstall"),
                api.getString("modPackUpdate"),

                apiLauncherProperties.getString("launcherVersion"),
                apiLauncherProperties.getString("titleImage"),
                apiLauncherProperties.getInt("serverPrice"),
                apiLauncherProperties.getInt("moneyCollected"),
                
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
        
        // Imprime en consola toda desa vaina
        System.out.println(JUNTA_API.getDetails());
        
        thisWindow.datosDeCarga.setText("Abriendo settings.json");
        // Intentar leer los datos del settings json, en caso de existir los imprime, pero si no pues tira error y crea desde cero esa carpeta junto al settings.json
        try {
            //abrir archivo
            String path = thisWindow.juntaLauncherDir+"/settings.json";
            String settingsContent = new String(Files.readAllBytes(Paths.get(path)));
            JSONObject settingsJson = new JSONObject(settingsContent);
            
            //imprimir
            System.out.println(settingsJson.getString("juntaServerVersion"));
            System.out.println(settingsJson.getString("launcherVersion"));
            System.out.println(settingsJson.getString("username"));
            System.out.println(settingsJson.getInt("minecraftRam") + "GB");
            System.out.println(settingsJson.getString("diomedesDir"));
            
        } catch (Exception e) {
            thisWindow.datosDeCarga.setText("No se encontró el directorio");
            thisWindow.datosDeCarga.setText("Creando nuevo directorio jeje");
            // crear el directorio diomedes
            File carpeta = new File(thisWindow.diomedesDir);
            carpeta.mkdirs();
            
            // Agregando los datos necesarios actuales para el launcher de forma local
            JSONObject localSettings = new JSONObject();
            localSettings.put("juntaServerVersion", JUNTA_API.getServerVersion());
            localSettings.put("launcherVersion", JUNTA_API.getLauncherVersion());
            localSettings.put("username", "");
            localSettings.put("minecraftRam", 0);
            localSettings.put("diomedesDir", thisWindow.diomedesDir);
            
            // pasandoe ese objeto a un archivo settings.json y guardando
            String jsonParla = localSettings.toString(4);
            try (FileWriter file = new FileWriter(thisWindow.juntaLauncherDir + "/settings.json")) {
                file.write(jsonParla);
                file.flush();
            } catch (Exception ex) {
                System.out.println("no " + ex);
            }
        }
        
        // ahora si abriendo esos datos para utilizar
        String path = thisWindow.juntaLauncherDir+"/settings.json";
        String settingsContent = new String(Files.readAllBytes(Paths.get(path)));
        JSONObject settingsJson = new JSONObject(settingsContent);
        
        // comprobar si es primera vez que abre el launcher, lo hace de forma que si username es vacio pida el username, y si ram es 0 que pida la ram pal juego
        // Por ahora se hará con joptionpane XD
        // de paso los guarda en el objeto json
        if(settingsJson.getString("username").equals("")){
            System.out.println("no tiene user");
            String username = JOptionPane.showInputDialog(null, "Por favor, ingresa tu nombre de usuario:", "Ingreso de Usuario", JOptionPane.QUESTION_MESSAGE);
            
            settingsJson.put("username", username);
            
        } if (settingsJson.getInt("minecraftRam") <= 0) {
            String ramString = JOptionPane.showInputDialog(null, "Ingresa la cantidad de ram que quieres asignar al juego \n(NO AGREGUES MAS RAM DE LA QUE TIENES EN TU PC)\n(Recuerda que esta es la ram que usarás en el juego, no pongas la ram de tu pc XD)", "Ingreso de Usuario", JOptionPane.QUESTION_MESSAGE);
            int ram = Integer.parseInt(ramString);
            
            settingsJson.put("minecraftRam", ram);
        }
        
        // guarda el archivo settings.json para que no se pierda esos datos
        Files.write(Paths.get(path), settingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);
        
        //Literalmente lo que dice abajo es lo que hace esto xd x2 | VVVV
        thisWindow.datosDeCarga.setText("Instanciando propiedades del Launcher");
        LauncherJunta LAUNCHER_CLASS = new LauncherJunta(
                JUNTA_API.getLauncherVersion(),
                JUNTA_API.getForgeVersion(),
                settingsJson.getString("username"),
                settingsJson.getInt("minecraftRam"),
                settingsJson.getString("juntaServerVersion"),
                thisWindow.diomedesDir
        );
        
        // aqui deberia de comprobar la version de la junta y la temporada en caso que sea nueva
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Abrir ya la ventana del launcher
        thisWindow.datosDeCarga.setText("Abriendo...");
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
