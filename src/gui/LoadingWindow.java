package gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;
import org.apache.commons.io.FileUtils;

import objects.JuntaApi;
import objects.LauncherJunta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import javax.swing.JOptionPane;
import org.json.JSONArray;

public class LoadingWindow extends javax.swing.JFrame {
    //public String mineDir, diomedesDir, juntaLauncherDir;
    
    public String dotMinecraft = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.minecraft";
    public String juntaLauncherDir = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/diomedes";
    public String diomedesDir = juntaLauncherDir + "/.diomedes";
    public String LAUNCHER_VERSION = "2.1.0";
    
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
        // Poniendo pantalla de carga
        LoadingWindow thisWindow = new LoadingWindow();
        thisWindow.setVisible(true);
        thisWindow.setLocationRelativeTo(null);
        
        URL API_URL = new URL("https://raw.githubusercontent.com/Juanda553/junta_api/main/junta_api.json");
        //URL API_URL = new URL("https://pastebin.com/raw/nj6RWKmF");
        thisWindow.jProgressBar1.setValue(1);
        
        // Literalmente lo que dice abajo es lo que hace esto xd | VVVV
        JuntaApi JUNTA_API = null;
        try {
            // chupar la api
            thisWindow.datosDeCarga.setText("Obteniendo datos de la nube");
            HttpURLConnection connection = (HttpURLConnection) API_URL.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            thisWindow.jProgressBar1.setValue(10);

            thisWindow.datosDeCarga.setText("Guardando datos de la nube");
            StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(API_URL.openStream());

                while(scanner.hasNext()){
                    informationString.append(scanner.nextLine());
            }
            scanner.close();
            thisWindow.jProgressBar1.setValue(20);

            // poner la api como0 json
            thisWindow.datosDeCarga.setText("Parseando datos a Json");
            JSONObject api = new JSONObject(informationString.toString());

            // objetos padre del Json
            JSONObject apiLauncherProperties = (JSONObject) api.get("launcher_properties");
            JSONObject apiLauncherColors = (JSONObject) apiLauncherProperties.get("colores");
            thisWindow.jProgressBar1.setValue(25);
            
            thisWindow.datosDeCarga.setText("Instanciando datos de la API");
            JUNTA_API = new JuntaApi(
                    api.getString("juntaName"),
                    api.getString("juntaVersion"),
                    api.getString("forgeVersion"),
                    api.getString("vanillaVersion"),
                    api.getString("indexVersion"),
                    api.getString("icon"),
                    api.getString("modpackInstall"),
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
                    apiLauncherProperties.getJSONArray("deletedMods"),
                    apiLauncherProperties.getJSONObject("high_quality")
                );

            // Imprime en consola toda desa vaina
            System.out.println(JUNTA_API.getDetails());
            thisWindow.jProgressBar1.setValue(30);
            
            try {
                if (thisWindow.LAUNCHER_VERSION.equals(JUNTA_API.getLauncherVersion())) {
                    thisWindow.datosDeCarga.setText("Abriendo settings.json");
                    // Intentar leer los datos del settings json, en caso de existir los imprime, pero si no pues tira error y crea desde cero esa carpeta junto al settings.json
                    try {
                        //abrir archivo
                        String path = thisWindow.juntaLauncherDir+"/settings.json";
                        String settingsContent = new String(Files.readAllBytes(Paths.get(path)));
                        JSONObject settingsJson = new JSONObject(settingsContent);
                        
                        // Creando nuevos ajsutes del settings.json
                        try {
                            System.out.println(settingsJson.getBoolean("highQualityMode"));
                        } catch (Exception e) {
                            System.out.println("creando nuevos ajustes");
                            System.out.println(e);
                            String TEMPsettingsContent = new String(Files.readAllBytes(Paths.get(path)));
                            JSONObject tempSettingsJson = new JSONObject(settingsContent);
                        
                            tempSettingsJson.put("highQualityMode", false);
                            
                            Files.write(Paths.get(path), tempSettingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);
                        }

                        //imprimir
                        System.out.println(settingsJson.getString("juntaServerVersion"));
                        System.out.println(settingsJson.getString("username"));
                        System.out.println(settingsJson.getInt("minecraftRam") + "GB");
                        System.out.println(settingsJson.getString("diomedesDir"));
                        thisWindow.jProgressBar1.setValue(32);

                    } catch (Exception e) {
                        thisWindow.datosDeCarga.setText("No se encontró el directorio");
                        thisWindow.datosDeCarga.setText("Creando nuevo directorio jeje");
                        // crear el directorio diomedes
                        File carpeta = new File(thisWindow.diomedesDir);
                        carpeta.mkdirs();

                        // Agregando los datos necesarios actuales para el launcher de forma local
                        JSONObject localSettings = new JSONObject();
                        localSettings.put("juntaServerVersion", "");
                        localSettings.put("juntaName", "");
                        localSettings.put("username", "");
                        localSettings.put("minecraftRam", 0);
                        localSettings.put("diomedesDir", thisWindow.diomedesDir);
                        localSettings.put("highQualityMode", false);

                        // pasandoe ese objeto a un archivo settings.json y guardando
                        String jsonParla = localSettings.toString(4);
                        try (FileWriter file = new FileWriter(thisWindow.juntaLauncherDir + "/settings.json")) {
                            file.write(jsonParla);
                            file.flush();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Envia captura de este error: " + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    thisWindow.jProgressBar1.setValue(40);

                    // ahora si abriendo esos datos para utilizar
                    String path = thisWindow.juntaLauncherDir+"/settings.json";
                    String settingsContent = new String(Files.readAllBytes(Paths.get(path)));
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
                    Files.write(Paths.get(path), settingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);

                    //Literalmente lo que dice abajo es lo que hace esto xd x2 | VVVV
                    thisWindow.datosDeCarga.setText("Instanciando propiedades del Launcher");
                    LauncherJunta LAUNCHER_CLASS = new LauncherJunta(
                            JUNTA_API.getForgeVersion(),
                            JUNTA_API.getIndexVersion(),
                            settingsJson.getString("username"),
                            settingsJson.getInt("minecraftRam"),
                            settingsJson.getString("juntaServerVersion"),
                            settingsJson.getString("juntaName"),
                            settingsJson.getString("diomedesDir"),
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
                            FileUtils.cleanDirectory(new File(thisWindow.diomedesDir));
                            thisWindow.jProgressBar1.setValue(70);
                            thisWindow.datosDeCarga.setText("Descargando nueva temporada. " + JUNTA_API.getName());

                            FileUtils.copyURLToFile(new URL(JUNTA_API.getModpackInitial()), new File(thisWindow.juntaLauncherDir + "/current.zip"));

                            thisWindow.datosDeCarga.setText("Temporada descargada.");
                            thisWindow.jProgressBar1.setValue(72);
                            settingsJson.put("juntaName", JUNTA_API.getName());
                            LAUNCHER_CLASS.setJuntaName(JUNTA_API.getName());

                            thisWindow.descomprimir(new FileInputStream(thisWindow.juntaLauncherDir + "/current.zip"));
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

                            FileUtils.copyURLToFile(new URL(JUNTA_API.getModpackUpdate()), new File(thisWindow.juntaLauncherDir + "/current.zip"));

                            thisWindow.datosDeCarga.setText("Actualizacion descargada");
                            thisWindow.jProgressBar1.setValue(72);
                            settingsJson.put("juntaServerVersion", JUNTA_API.getServerVersion());
                            LAUNCHER_CLASS.setServerVersion(JUNTA_API.getServerVersion());

                            if (thisWindow.descomprimir(new FileInputStream(thisWindow.juntaLauncherDir + "/current.zip"))) {
                                thisWindow.jProgressBar1.setValue(70);
                                thisWindow.datosDeCarga.setText("Limpiando archivos innecesarios " + JUNTA_API.getServerVersion());
                                
                                JSONArray deletedFiles = JUNTA_API.getDeletedFiles();
                                for (int i = 0; i < deletedFiles.length(); i++) {
                                    File vagina = new File(thisWindow.diomedesDir+"/"+deletedFiles.getString(i));
                                    System.out.println(vagina);
                                    vagina.delete();
                                }
                            }
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Envia captura de este error: Actualizar\n" + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                        // guarda el archivo settings.json para que no se pierda esos datos
                        Files.write(Paths.get(path), settingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);

                        // Abrir ya la ventana del launcher
                        thisWindow.datosDeCarga.setText("Abriendo...");
                        thisWindow.jProgressBar1.setValue(100);
                        LauncherWindow LAUNCHER_WINDOW = new LauncherWindow(JUNTA_API, LAUNCHER_CLASS, thisWindow.LAUNCHER_VERSION, thisWindow.juntaLauncherDir, thisWindow.diomedesDir);
                        LAUNCHER_WINDOW.setLocationRelativeTo(null);
                        LAUNCHER_WINDOW.setVisible(true);
                        thisWindow.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "<html><center>Tienes una version antigua del launcher.<br>Por favor revisa el Canal de Discord para descargar la ultima versión. :)</center></html>", "Versión antigua", JOptionPane.ERROR_MESSAGE);
                        thisWindow.datosDeCarga.setText("Actualiza el Launcher para poder abrir :)");
                        thisWindow.jProgressBar1.setValue(0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Envia captura de este error:\n" + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: Descarga de API\n" + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    public boolean descomprimir(FileInputStream xd) {
        try {
                datosDeCarga.setText("Descomprimiendo modpack...");
                jProgressBar1.setValue(85);

                File comprimidom = new File(juntaLauncherDir + "/current.zip");
                
                ZipInputStream zipInputStream = new ZipInputStream(xd);
                ZipEntry entry;
                while ((entry = zipInputStream.getNextEntry()) != null) {
                    String entryName = entry.getName();
                    if (!entry.isDirectory()) {
                        File entryFile = new File(diomedesDir, entryName);
                        entryFile.getParentFile().mkdirs();

                        byte[] buffer = new byte[1024];
                        FileOutputStream fos = new FileOutputStream(entryFile);
                        int length;
                        while ((length = zipInputStream.read(buffer)) > 0) {
                            fos.write(buffer, 0, length);
                        }
                        fos.close();
                    }
                    zipInputStream.closeEntry();
                }
                zipInputStream.close();

                comprimidom.delete();

                datosDeCarga.setText("Descomprimido con exito!");
                jProgressBar1.setValue(90);
                return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Envia captura de este error: descomprimir\n" + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
                return false;
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datosDeCarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}