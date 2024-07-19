package gui;

import design.ScrollBarWin11UI;
import objects.JuntaApi;
import objects.LauncherJunta;
import util.JuandaUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import javax.swing.JOptionPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import org.json.JSONArray;
import org.json.JSONObject;
import org.apache.commons.io.FileUtils;

public class LoadingWindow extends javax.swing.JFrame {
    public LoadingWindow() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        datosDeCarga = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Junta Launcher");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        datosDeCarga.setForeground(new java.awt.Color(255, 255, 255));
        datosDeCarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosDeCarga.setText("Cargando");
        datosDeCarga.setToolTipText("");
        datosDeCarga.setAlignmentX(0.5F);
        datosDeCarga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/junta_full_logo_resizedlow.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jProgressBar1.setBackground(new java.awt.Color(102, 102, 102));
        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setValue(32);
        jProgressBar1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(datosDeCarga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datosDeCarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
        UIDefaults ui = UIManager.getDefaults();
        ui.put("ScrollBarUI", ScrollBarWin11UI.class.getCanonicalName());

// Poniendo pantalla de carga
        LoadingWindow thisWindow = new LoadingWindow();
        thisWindow.setVisible(true);
        thisWindow.setLocationRelativeTo(null);
        
        String LAUNCHER_VERSION = "2.2.0"; ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JuandaUtils JUANDA_UTILS = new JuandaUtils();
        String DOT_MINECRAFT = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.minecraft";
        String LAUNCHER_DIR = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/diomedes";
        String DOT_DIOMEDES = LAUNCHER_DIR + "/.diomedes";
        String SETTINGS_FILE = LAUNCHER_DIR + "/settings.json";

        URL API_DATA_URL = new URL("https://pastebin.com/raw/nj6RWKmF");
//        URL API_LAUNCHER_URL = new URL("https://pastebin.com/raw/nj6RWKmF");
//        URL API_NEWS_URL = new URL("https://pastebin.com/raw/nj6RWKmF");

        
//        URL API_DATA_URL = new URL("https://raw.githubusercontent.com/Juanda553/junta_api/main/data.json");
        URL API_LAUNCHER_URL = new URL("https://raw.githubusercontent.com/Juanda553/junta_api/main/launcher.json");
        URL API_NEWS_URL = new URL("https://raw.githubusercontent.com/Juanda553/junta_api/main/news.json");
        
        thisWindow.jProgressBar1.setValue(1);
        JuntaApi JUNTA_API = null;
        try {
            // chupar la api
            thisWindow.datosDeCarga.setText("Obteniendo datos de la nube");
            thisWindow.jProgressBar1.setValue(10);
            JSONObject apiData = JUANDA_UTILS.getApi(API_DATA_URL);
            JSONObject apiLauncherProperties = JUANDA_UTILS.getApi(API_LAUNCHER_URL).getJSONObject("launcher_properties");
            JSONObject apiNews = JUANDA_UTILS.getApi(API_NEWS_URL);
            
            thisWindow.jProgressBar1.setValue(20);

            // objetos padre del Json
            JSONObject apiLauncherColors = apiLauncherProperties.getJSONObject("colores");
            thisWindow.jProgressBar1.setValue(25);
            
            thisWindow.datosDeCarga.setText("Instanciando datos de la API");
            JUNTA_API = new JuntaApi(
                    apiData.getString("last_update"),
                    apiData.getString("juntaName"),
                    apiData.getString("juntaVersion"),
                    apiData.getString("modLoader"),
                    apiData.getString("modLoaderVersion"),
                    apiData.getString("vanillaVersion"),
                    apiData.getString("indexVersion"),
                    apiData.getString("icon"),
                    apiData.getString("modpackInstall"),
                    apiData.getString("modPackUpdate"),

                    apiLauncherProperties.getString("launcherVersion"),
                    apiLauncherProperties.getString("titleImage"),
                    apiLauncherProperties.getInt("serverPrice"),
                    0,

                    apiLauncherColors.getString("background1"),
                    apiLauncherColors.getString("background2"),
                    apiLauncherColors.getString("button1"),
                    apiLauncherColors.getString("button2"),
                    apiLauncherColors.getString("buttonPlay"),
                    apiLauncherColors.getString("fontPlay"),
                    apiLauncherColors.getString("font1"),
                    apiLauncherColors.getString("font2"),
                    apiLauncherColors.getString("border"),
                    apiLauncherProperties.getJSONObject("feature"),
                    apiNews.getJSONArray("news"),
                    apiData.getJSONArray("partners"),
                    apiData.getJSONArray("deletedMods"),
                    apiData.getJSONObject("high_quality"),
                    apiLauncherProperties.getString("ip")
                );

            // Imprime en consola toda desa vaina
            System.out.println(JUNTA_API.getDetails());
            thisWindow.jProgressBar1.setValue(30);
            
            try {
                if (LAUNCHER_VERSION.equals(JUNTA_API.getLauncherVersion())) {
                    thisWindow.datosDeCarga.setText("Abriendo settings.json");
                    // Intentar leer los datos del settings json, en caso de existir los imprime, pero si no pues tira error y crea desde cero esa carpeta junto al settings.json
                    try {
                        //abrir archivo
                        String settingsContent = new String(Files.readAllBytes(Paths.get(SETTINGS_FILE)));
                        JSONObject settingsJson = new JSONObject(settingsContent);
                        
                        // Creando nuevos ajsutes del settings.json
                        try {
                            System.out.println(settingsJson.getBoolean("highQualityMode"));
                        } catch (Exception e) {
                            System.out.println("creando nuevos ajustes");
                            System.out.println(e);
                            String newSettingsContent = new String(Files.readAllBytes(Paths.get(SETTINGS_FILE)));
                            JSONObject newSettingsJson = new JSONObject(newSettingsContent);
                        
                            newSettingsJson.put("highQualityMode", false);
                            
                            Files.write(Paths.get(SETTINGS_FILE), newSettingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);
                        }

                        //imprimir
                        System.out.println(settingsJson.getString("juntaServerVersion"));
                        System.out.println(settingsJson.getString("username"));
                        System.out.println(UUID.nameUUIDFromBytes(("OfflinePlayer:"+settingsJson.getString("username")).getBytes()));
                        System.out.println(settingsJson.getInt("minecraftRam") + "GB");
                        System.out.println(settingsJson.getString("diomedesDir"));
                        thisWindow.jProgressBar1.setValue(32);

                    } catch (Exception e) {
                        thisWindow.datosDeCarga.setText("No se encontró el directorio");
                        thisWindow.datosDeCarga.setText("Creando nuevo directorio jeje");
                        // crear el directorio diomedes
                        File carpeta = new File(DOT_DIOMEDES);
                        carpeta.mkdirs();

                        JUANDA_UTILS.createLocalSettings(SETTINGS_FILE, DOT_DIOMEDES);
                    }
                    thisWindow.jProgressBar1.setValue(40);

                    // ahora si abriendo esos datos para utilizar
                    String settingsContent = new String(Files.readAllBytes(Paths.get(SETTINGS_FILE)));
                    JSONObject settingsJson = new JSONObject(settingsContent);
                    thisWindow.jProgressBar1.setValue(50);

                    // comprobar si es primera vez que abre el launcher, lo hace de forma que si username es vacio pida el username, y si ram es 0 que pida la ram pal juego
                    // Por ahora se hará con joptionpane XD
                    // de paso los guarda en el objeto json
                    if(settingsJson.getString("username").equals("")){
                        System.out.println("no tiene user");
                        String username = JOptionPane.showInputDialog(null, "Por favor, ingresa tu nombre de usuario (TODO PEGADO, NO USES ESPACIOS)", "Ingreso de Usuario", JOptionPane.QUESTION_MESSAGE);

                        settingsJson.put("username", username);

                    } if (settingsJson.getInt("minecraftRam") <= 0) {
                       System.out.println("no ram");
                        String ramString = JOptionPane.showInputDialog(null, "<html><center>Ingresa la cantidad de ram que quieres asignar al juego.<br>(NO AGREGUES MAS RAM DE LA QUE TIENES EN TU PC)<br>(Recuerda que esta es la ram que usarás en el juego, no pongas la ram de tu pc XD)</center></html>", "Ingreso de Usuario", JOptionPane.QUESTION_MESSAGE);
                        int ram = Integer.parseInt(ramString);

                        settingsJson.put("minecraftRam", ram);
                    }
                    thisWindow.jProgressBar1.setValue(55);
                    // guarda el archivo settings.json para que no se pierda esos datos
                    Files.write(Paths.get(SETTINGS_FILE), settingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);

                    //Literalmente lo que dice abajo es lo que hace esto xd x2 | VVVV
                    thisWindow.datosDeCarga.setText("Instanciando propiedades del Launcher");
                    LauncherJunta LAUNCHER_CLASS = new LauncherJunta(
                            JUNTA_API.getModLoaderVersion(),
                            JUNTA_API.getIndexVersion(),
                            settingsJson.getString("username"),
                            settingsJson.getInt("minecraftRam"),
                            settingsJson.getString("juntaServerVersion"),
                            settingsJson.getString("juntaName"),
                            DOT_DIOMEDES,
                            settingsJson.getBoolean("highQualityMode")
                    );
                    thisWindow.jProgressBar1.setValue(64);
                    
                    // aqui deberia de comprobar la version de la junta y la temporada en caso que sea nueva

                    thisWindow.datosDeCarga.setText("Comprobando temporada...");
                    thisWindow.jProgressBar1.setValue(68);
                    if (!LAUNCHER_CLASS.getJuntaName().equals(JUNTA_API.getName())) {
                        thisWindow.datosDeCarga.setText("Tienes una temporada antigua!");
                        thisWindow.jProgressBar1.setValue(68);

                        try {
                            thisWindow.jProgressBar1.setValue(70);
                            thisWindow.datosDeCarga.setText("Descargando nueva temporada. " + JUNTA_API.getName());

                            FileUtils.copyURLToFile(new URL(JUNTA_API.getModpackInitial()), new File(LAUNCHER_DIR + "/current.zip"));

                            thisWindow.datosDeCarga.setText("Temporada descargada.");
                            thisWindow.jProgressBar1.setValue(72);
                            settingsJson.put("juntaName", JUNTA_API.getName());
                            LAUNCHER_CLASS.setJuntaName(JUNTA_API.getName());
                            
                            thisWindow.datosDeCarga.setText("Descomprimiendo modpack...");
                            thisWindow.jProgressBar1.setValue(85);
                            
                            FileUtils.cleanDirectory(new File(DOT_DIOMEDES));
                            JUANDA_UTILS.descomprimir(LAUNCHER_DIR + "/current.zip", DOT_DIOMEDES);
                            
                            thisWindow.jProgressBar1.setValue(95);
                            thisWindow.datosDeCarga.setText("Limpiando archivos innecesarios " + JUNTA_API.getServerVersion());
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Envia captura de este error: Descargar Primera Vez\n" + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
                        }

                    } 
                    if (!LAUNCHER_CLASS.getServerVersion().equals(JUNTA_API.getServerVersion())) {
                        thisWindow.datosDeCarga.setText("Hay una nueva version disponible!");
                        thisWindow.jProgressBar1.setValue(68);

                        try {
                            thisWindow.jProgressBar1.setValue(70);
                            thisWindow.datosDeCarga.setText("Descargando actualizacion " + JUNTA_API.getServerVersion());

                            FileUtils.copyURLToFile(new URL(JUNTA_API.getModpackUpdate()), new File(LAUNCHER_DIR + "/current.zip"));
                            
                            if (LAUNCHER_CLASS.isHighQualityMode()) {
                                thisWindow.datosDeCarga.setText("Actualizando modo HQ " + JUNTA_API.getServerVersion());
                                JSONArray filesHQ = new JSONArray(JUNTA_API.getHighQualityData().getJSONArray("files"));
            
                                for (int i = 0; i < filesHQ.length(); i++) {
                                    JSONObject mod = filesHQ.getJSONObject(i);
                                    String name = mod.getString("name");
                                    File loc = new File(DOT_DIOMEDES + "/" + mod.getString("loc"));
                                    URL downloadLink = new URL(mod.getString("download"));

                                    FileUtils.copyURLToFile(downloadLink, loc);
                                    System.out.println(name + " descargado");
                                }
                            }

                            thisWindow.datosDeCarga.setText("Actualizacion descargada");
                            thisWindow.jProgressBar1.setValue(72);
                            settingsJson.put("juntaServerVersion", JUNTA_API.getServerVersion());
                            LAUNCHER_CLASS.setServerVersion(JUNTA_API.getServerVersion());

                            thisWindow.datosDeCarga.setText("Descomprimiendo modpack...");
                            thisWindow.jProgressBar1.setValue(85);
                            if (JUANDA_UTILS.descomprimir(LAUNCHER_DIR + "/current.zip", DOT_DIOMEDES)) {
                                thisWindow.datosDeCarga.setText("Descomprimido con exito!");
                                thisWindow.jProgressBar1.setValue(90);
                                
                                thisWindow.jProgressBar1.setValue(95);
                                thisWindow.datosDeCarga.setText("Limpiando archivos innecesarios " + JUNTA_API.getServerVersion());
                                
                                JSONArray deletedFiles = JUNTA_API.getDeletedFiles();
                                for (int i = 0; i < deletedFiles.length(); i++) {
                                    File vagina = new File(DOT_DIOMEDES+"/"+deletedFiles.getString(i));
                                    System.out.println(vagina);
                                    vagina.delete();
                                }
                            }
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Envia captura de este error: Actualizar\n" + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                        // guarda el archivo settings.json para que no se pierda esos datos
                        Files.write(Paths.get(SETTINGS_FILE), settingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);

                        // Abrir ya la ventana del launcher
                        thisWindow.datosDeCarga.setText("Abriendo...");
                        thisWindow.jProgressBar1.setValue(100);
                        LauncherWindow LAUNCHER_WINDOW = new LauncherWindow(JUNTA_API, LAUNCHER_CLASS, LAUNCHER_VERSION, LAUNCHER_DIR, DOT_DIOMEDES);
                        LAUNCHER_WINDOW.setLocationRelativeTo(null);
                        LAUNCHER_WINDOW.setVisible(true);
                        thisWindow.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "<html><center>Tienes una version antigua del launcher.<br>Por favor descargue la ultima versión para continuar. :)<br>Actualmente tienes la version " + LAUNCHER_VERSION + " y la ultima version es la "  + JUNTA_API.getLauncherVersion() + "</center></html>", "Versión antigua", JOptionPane.ERROR_MESSAGE);
                        thisWindow.datosDeCarga.setText("Actualiza el Launcher para poder abrir :)");
                        thisWindow.jProgressBar1.setValue(0);
                        System.exit(0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Envia captura de este error:\n" + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar.\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datosDeCarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}