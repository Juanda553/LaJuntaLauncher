package objects;

import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import gui.LoadingWindow;

public class LauncherJunta {
    private String launcherVersion, minecraftVersion, indexVersion, username, serverVersion, juntaName, diomedesDir;
    int ram;
    LoadingWindow asd;

    public LauncherJunta(String launcherVersion, String minecraftVersion, String indexVersion, String username, int ram, String serverVersion, String juntaName, String diomedesDir) {
        this.launcherVersion = launcherVersion;
        this.minecraftVersion = minecraftVersion;
        this.indexVersion = indexVersion;
        this.username = username;
        this.ram = ram;
        this.serverVersion = serverVersion;
        this.juntaName = juntaName;
        this.diomedesDir = diomedesDir;
    }
    
    public boolean saveData(){
        try {
            String path = asd.juntaLauncherDir+"/settings.json";
            String settingsContent = new String(Files.readAllBytes(Paths.get(path)));
            JSONObject settingsJson = new JSONObject(settingsContent);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Ocurrió un pequeno error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean loadData(){
        try {
            
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Ocurrió un pequeno error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
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

    public String getLauncherVersion() {
        return launcherVersion;
    }

    public void setLauncherVersion(String launcherVersion) {
        this.launcherVersion = launcherVersion;
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
