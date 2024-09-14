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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import org.json.JSONObject;

public class JuandaUtils {
    
    public void changeStatus(String textStatus, int progreso, JProgressBar BAR){
        
    }
    
    public boolean downloadFile(String fileURL, String saveDir, JProgressBar progressBar, JLabel peso, JLabel tiempo) {
        BufferedInputStream in = null;
        FileOutputStream out = null;

        try {
            URL url = new URL(fileURL);
            in = new BufferedInputStream(url.openStream());

            Path outputPath = Paths.get(saveDir);
            out = new FileOutputStream(outputPath.toFile());

            int fileSize = url.openConnection().getContentLength();
            progressBar.setMaximum(fileSize);

            byte[] buffer = new byte[1024];
            int count;
            int downloaded = 0;

            long startTime = System.currentTimeMillis();

            while ((count = in.read(buffer, 0, 1024)) != -1) {
                out.write(buffer, 0, count);
                downloaded += count;
                progressBar.setValue(downloaded);

                // Actualiza la información del JLabel
                long elapsedTime = System.currentTimeMillis() - startTime;
                double downloadSpeedKB = (downloaded / 1024.0) / (elapsedTime / 1000.0); // KB/s
                double downloadSpeedMB = downloadSpeedKB / 1024.0; // MB/s
                double remainingTimeSecs = ((double) (fileSize - downloaded) / (1024.0 * downloadSpeedKB)); // Tiempo restante en segundos

                String timeRemainingText;
                if (remainingTimeSecs >= 60) {
                    double remainingTimeMins = remainingTimeSecs / 60.0;
                    timeRemainingText = "" + Math.round(remainingTimeMins) + " minutos";
                } else {
                    timeRemainingText = "" + Math.round(remainingTimeSecs) + " segundos";
                }

                String speedText = downloadSpeedMB >= 1 ? 
                    "" + roundToOneDecimal(downloadSpeedMB) + " MB/s" : 
                    "" + roundToOneDecimal(downloadSpeedKB) + " KB/s";

                peso.setText(formatSize(downloaded) + " / " + formatSize(fileSize));
                tiempo.setText(speedText + ", " + timeRemainingText);
            }

            System.out.println("Descargado " + outputPath);
            progressBar.setValue(0);
            peso.setText("");
            tiempo.setText("");
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
    
    public boolean downloadFileNormal(String fileURL, String saveDir) {
        BufferedInputStream in = null;
        FileOutputStream out = null;

        try {
            URL url = new URL(fileURL);
            in = new BufferedInputStream(url.openStream());

            Path outputPath = Paths.get(saveDir);
            out = new FileOutputStream(outputPath.toFile());

            byte[] buffer = new byte[1024];
            int count;

            while ((count = in.read(buffer, 0, 1024)) != -1) {
                out.write(buffer, 0, count);
            }

            System.out.println("Descargado " + outputPath);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
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
    
    // infoLabel.setText("");
    private String formatSize(int size) {
        double kb = size / 1024.0;
        double mb = kb / 1024.0;
        double gb = mb / 1024.0;

        if (gb >= 1) {
            return "" + roundToOneDecimal(gb) + " GB";
        } else if (mb >= 1) {
            return "" + roundToOneDecimal(mb) + " MB";
        } else {
            return "" + roundToOneDecimal(kb) + " KB";
        }
    }
    
    private String roundToOneDecimal(double value) {
        return "" + Math.round(value * 10.0) / 10.0;
    }

    public void updateOptions(String optionsFilePath, String newOptionsFilePath) throws IOException {
        try {
            // Lee todas las líneas del archivo options.txt
            List<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(optionsFilePath)));

            // Carga los ajustes nuevos desde new_options.txt en un mapa
            Map<String, String> newSettings = new HashMap<>();
            List<String> newLines = Files.readAllLines(Paths.get(newOptionsFilePath));
            for (String line : newLines) {
                if (line.contains(":")) {
                    String[] parts = line.split(":", 2);
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    newSettings.put(key, value);
                }
            }

            // Marca si se encontró la clave
            Set<String> keysFound = new HashSet<>();

            // Actualiza las líneas en options.txt con los valores de new_options.txt
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                if (line.contains(":")) {
                    String key = line.split(":", 2)[0].trim();
                    if (newSettings.containsKey(key)) {
                        lines.set(i, key + ":" + newSettings.get(key));
                        keysFound.add(key);
                    }
                }
            }

            // Agrega cualquier nueva configuración que no estaba previamente en options.txt
            for (Map.Entry<String, String> entry : newSettings.entrySet()) {
                if (!keysFound.contains(entry.getKey())) {
                    lines.add(entry.getKey() + ":" + entry.getValue());
                }
            }

            // Escribe las líneas actualizadas de nuevo en options.txt
            Files.write(Paths.get(optionsFilePath), lines, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Ajustes updateados");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getFileSizeMb(String fileURL) {
        try {
            URL url = new URL(fileURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            long fileSizeInBytes = connection.getContentLengthLong();

            DecimalFormat df = new DecimalFormat("#.##");

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

            int totalSize = 0;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                totalSize += entry.getSize();
                zipInputStream.closeEntry();
            }

            zipInputStream.close();
            xd.close();
            xd = new FileInputStream(archivo);
            zipInputStream = new ZipInputStream(xd);

            progressBar.setMaximum(totalSize > 0 ? totalSize : 100);
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
    
    public boolean descomprimirNormal(String archivo, String destino) {
        try {
            File comprimidom = new File(archivo);
            FileInputStream xd = new FileInputStream(archivo);
            ZipInputStream zipInputStream = new ZipInputStream(xd);
            ZipEntry entry;

            int totalSize = 0;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                totalSize += entry.getSize();
                zipInputStream.closeEntry();
            }

            zipInputStream.close();
            xd.close();
            xd = new FileInputStream(archivo);
            zipInputStream = new ZipInputStream(xd);

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
                    }
                    fos.close();
                }
                zipInputStream.closeEntry();
            }
            zipInputStream.close();
            xd.close();

            System.out.println("descomprimido");
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