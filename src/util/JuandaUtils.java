package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.swing.JOptionPane;
import objects.JuntaApi;
import org.json.JSONObject;

public class JuandaUtils {
    
    public JSONObject getApi(URL url){
        try {

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while(scanner.hasNext()){
                    informationString.append(scanner.nextLine());
            }
            scanner.close();

            JSONObject api = new JSONObject(informationString.toString());
            return api;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener la API.\nEnvia captura de este error: " + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
            return new JSONObject();
        }
    }
    
    public boolean descomprimir(String archivo, String destino) {
        try {
                File comprimidom = new File(archivo);
                FileInputStream xd = new FileInputStream(archivo);
                ZipInputStream zipInputStream = new ZipInputStream(xd);
                ZipEntry entry;
                
                while ((entry = zipInputStream.getNextEntry()) != null) {
                    String entryName = entry.getName();
                    if (!entry.isDirectory()) {
                        File entryFile = new File(destino, entryName);
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
                return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error al descomprimir.\nEnvia captura de este error: " + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
                return false;
            }
    }
    
    public boolean createLocalSettings(String path, String newDiomeDir){
        try {
            JSONObject localSettings = new JSONObject();
            localSettings.put("juntaServerVersion", "");
            localSettings.put("juntaName", "");
            localSettings.put("username", "");
            localSettings.put("minecraftRam", 0);
            localSettings.put("diomedesDir", newDiomeDir);
            localSettings.put("highQualityMode", false);
            
            String jsonParla = localSettings.toString(4);
            try (FileWriter file = new FileWriter(path)) {
                file.write(jsonParla);
                file.flush();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Envia captura de este error: " + ex, "Error Rancio", JOptionPane.ERROR_MESSAGE);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e, "Hubo un error al crear settings.json\nEnvia captura de este error: " + e, JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean saveLocalSettings(String path, String newServerVersion, String newJuntaName, String newUsername, int newMinecraftRam, String newDiomeDir, boolean newHqMode){
        try {
            String settingsContent = new String(Files.readAllBytes(Paths.get(path)));
            JSONObject settingsJson = new JSONObject(settingsContent);

            JSONObject localSettings = new JSONObject();
            localSettings.put("juntaServerVersion", newServerVersion);
            localSettings.put("juntaName", newJuntaName);
            localSettings.put("username", newUsername);
            localSettings.put("minecraftRam", newMinecraftRam);
            localSettings.put("diomedesDir", newDiomeDir);
            localSettings.put("highQualityMode", newHqMode);
            
            Files.write(Paths.get(path), settingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Hubo un error al guardar settings.json\nEnvia captura del error: " + e, JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}