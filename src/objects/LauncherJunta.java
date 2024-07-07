package objects;

import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import gui.LoadingWindow;
import java.nio.file.StandardOpenOption;

public class LauncherJunta {
    private String minecraftVersion, indexVersion, username, serverVersion, juntaName, diomedesDir;
    int ram;
    boolean highQualityMode;
    LoadingWindow asd;

    public LauncherJunta(String minecraftVersion, String indexVersion, String username, int ram, String serverVersion, String juntaName, String diomedesDir, boolean highQualityMode) {
        this.minecraftVersion = minecraftVersion;
        this.indexVersion = indexVersion;
        this.username = username;
        this.ram = ram;
        this.serverVersion = serverVersion;
        this.juntaName = juntaName;
        this.diomedesDir = diomedesDir;
        this.highQualityMode = highQualityMode;
    }
    
    public boolean saveLocalSettingsCustom(String path, String newServerVersion, String newJuntaName, String newUsername, int newMinecraftRam, String newDiomeDir, boolean newHqMode){
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
            JOptionPane.showMessageDialog(null, e, "Ocurrió un error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean saveLocalSettings(String path){
        try {
            String settingsContent = new String(Files.readAllBytes(Paths.get(path)));
            JSONObject settingsJson = new JSONObject(settingsContent);
            
            JSONObject localSettings = new JSONObject();
            localSettings.put("juntaServerVersion", this.serverVersion);
            localSettings.put("juntaName", this.juntaName);
            localSettings.put("username", this.username);
            localSettings.put("minecraftRam", this.ram);
            localSettings.put("diomedesDir", this.diomedesDir);
            localSettings.put("highQualityMode", this.highQualityMode);
            
            Files.write(Paths.get(path), settingsJson.toString(4).getBytes(), StandardOpenOption.WRITE);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Ocurrió un error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean isHighQualityMode() {
        return highQualityMode;
    }

    public void setHighQualityMode(boolean highQualityMode) {
        this.highQualityMode = highQualityMode;
    }

    public String getJuntaName() {
        return juntaName;
    }

    public void setJuntaName(String juntaName) {
        this.juntaName = juntaName;
    }
    
    public String getIndexVersion() {
        return indexVersion;
    }

    public void setIndexVersion(String indexVersion) {
        this.indexVersion = indexVersion;
    }

    public String getDiomedesDir() {
        return diomedesDir;
    }

    public void setDiomedesDir(String diomedesDir) {
        this.diomedesDir = diomedesDir;
    }

    public String getMinecraftVersion() {
        return minecraftVersion;
    }

    public void setMinecraftVersion(String minecraftVersion) {
        this.minecraftVersion = minecraftVersion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    
}
