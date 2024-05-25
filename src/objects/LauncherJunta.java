package objects;

public class LauncherJunta {
    private String launcherVersion, minecraftVersion, username, ram;

    public LauncherJunta(String launcherVersion, String minecraftVersion, String username, String ram) {
        this.launcherVersion = launcherVersion;
        this.minecraftVersion = minecraftVersion;
        this.username = username;
        this.ram = ram;
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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    
}
