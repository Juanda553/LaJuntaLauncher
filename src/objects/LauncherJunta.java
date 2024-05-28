package objects;

public class LauncherJunta {
    private String launcherVersion, minecraftVersion, username, serverVersion, diomedesDir;
    int ram;

    public LauncherJunta(String launcherVersion, String minecraftVersion, String username, int ram, String serverVersion, String diomedesDir) {
        this.launcherVersion = launcherVersion;
        this.minecraftVersion = minecraftVersion;
        this.username = username;
        this.ram = ram;
        this.serverVersion = serverVersion;
        this.diomedesDir = diomedesDir;
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
