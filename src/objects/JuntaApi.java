package objects;

public class JuntaApi {
    private String name, serverVersion, forgeVersion, serverIcon, modpackInitial, modpackUpdate;
    
    public JuntaApi(String _name, String _serverVersion, String _forgeVersion, String _serverIcon, String _modpackInitial, String _modpackUpdate){
        this.name = _name;
        this.serverIcon = _serverIcon;
        this.forgeVersion = _forgeVersion;
        this.serverIcon = _serverIcon;
        this.modpackInitial = _modpackInitial;
        this.modpackUpdate = _modpackUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getForgeVersion() {
        return forgeVersion;
    }

    public void setForgeVersion(String forgeVersion) {
        this.forgeVersion = forgeVersion;
    }

    public String getServerIcon() {
        return serverIcon;
    }

    public void setServerIcon(String serverIcon) {
        this.serverIcon = serverIcon;
    }

    public String getModpackInitial() {
        return modpackInitial;
    }

    public void setModpackInitial(String modpackInitial) {
        this.modpackInitial = modpackInitial;
    }

    public String getModpackUpdate() {
        return modpackUpdate;
    }

    public void setModpackUpdate(String modpackUpdate) {
        this.modpackUpdate = modpackUpdate;
    }
    
    
}
