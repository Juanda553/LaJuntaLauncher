package util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import objects.JuntaApi;
import org.json.JSONObject;

public class JuandaUtils {
    
    public void changeStatus(String textStatus, int progreso, JProgressBar BAR){
        
    }
    
    public boolean donwloadFile(String fileURL, String saveDir, JProgressBar progressBar) {
        BufferedInputStream in = null;
        FileOutputStream out = null;

        try {
            URL url = new URL(fileURL);
            in = new BufferedInputStream(url.openStream());

            // Definir la ruta de salida
            Path outputPath = Paths.get(saveDir);
            out = new FileOutputStream(outputPath.toFile());

            // Obtener el tamaño total del archivo para el seguimiento del progreso
            int fileSize = url.openConnection().getContentLength();
            progressBar.setMaximum(fileSize);

            byte[] buffer = new byte[1024];
            int count;
            int downloaded = 0;
            while ((count = in.read(buffer, 0, 1024)) != -1) {
                out.write(buffer, 0, count);
                downloaded += count;
                progressBar.setValue(downloaded);
            }

            System.out.println("descargado " + outputPath);
            progressBar.setValue(0);
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al descargar. Envia captura de este error:\n" + e, "Error al descargar", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static String getFileSizeMb(String fileURL) {
        try {
            URL url = new URL(fileURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD"); // Solicitud para obtener solo los encabezados
            connection.connect();

            long fileSizeInBytes = connection.getContentLengthLong(); // Tamaño en bytes

            // Formato de salida
            DecimalFormat df = new DecimalFormat("#.##");

            // Convertir a MB o GB según corresponda
            if (fileSizeInBytes >= 1024L * 1024L * 1024L) {
                double fileSizeInGB = fileSizeInBytes / (1024.0 * 1024.0 * 1024.0);
                return df.format(fileSizeInGB) + " GB";
            } else {
                double fileSizeInMB = fileSizeInBytes / (1024.0 * 1024.0);
                return df.format(fileSizeInMB) + " MB";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al obtener el tamaño del archivo";
        }
    }
    
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
            JOptionPane.showMessageDialog(null, "No se pudieron obtemer los datos del servidor, pero esto no afectara la ejecucion del launcher. \n" + e, "Error leve", JOptionPane.WARNING_MESSAGE);
            return new JSONObject().put("online", false);
        }
    }
    
    public boolean descomprimir(String archivo, String destino, JProgressBar progressBar) {
        try {
            File comprimidom = new File(archivo);
            FileInputStream xd = new FileInputStream(archivo);
            ZipInputStream zipInputStream = new ZipInputStream(xd);
            ZipEntry entry;

            // Calcular el tamaño total de todos los archivos dentro del ZIP
            int totalSize = 0;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                totalSize += entry.getSize();
                zipInputStream.closeEntry();
            }

            // Reiniciar el ZipInputStream para empezar la descompresión
            zipInputStream.close();
            xd.close();
            xd = new FileInputStream(archivo);
            zipInputStream = new ZipInputStream(xd);

            // Configurar la barra de progreso
            progressBar.setMaximum(totalSize > 0 ? totalSize : 100); // Si no se puede calcular el tamaño, usar 100 como valor arbitrario
            int bytesReadTotal = 0;

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
                        bytesReadTotal += length;
                        progressBar.setValue(bytesReadTotal);
                    }
                    fos.close();
                }
                zipInputStream.closeEntry();
            }
            zipInputStream.close();
            xd.close();

            System.out.println("descomprimido");
            comprimidom.delete();
            progressBar.setValue(0);
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