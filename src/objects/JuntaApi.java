package objects;

import java.io.FileWriter;
import org.json.JSONArray;
import org.json.JSONObject;

public class JuntaApi {
    private String name, serverVersion, forgeVersion, serverIcon, modpackInitial, modpackUpdate;
    
    private String launcherVersion, titleImg;
    private String bgColor1, gbColor2, buttonColor1, buttonColor2, buttonPlay, fontColor1, fontColor2;
    
    private JSONObject event;
    private JSONArray news;

    public JuntaApi(String name, String serverVersion, String forgeVersion, String serverIcon, String modpackInitial, String modpackUpdate, String launcherVersion, String titleImg, String bgColor1, String gbColor2, String buttonColor1, String buttonColor2, String buttonPlay, String fontColor1, String fontColor2, JSONObject event, JSONArray news) {
        this.name = name;
        this.serverVersion = serverVersion;
        this.forgeVersion = forgeVersion;
        this.serverIcon = serverIcon;
        this.modpackInitial = modpackInitial;
        this.modpackUpdate = modpackUpdate;
        this.launcherVersion = launcherVersion;
        this.titleImg = titleImg;
        this.bgColor1 = bgColor1;
        this.gbColor2 = gbColor2;
        this.buttonColor1 = buttonColor1;
        this.buttonColor2 = buttonColor2;
        this.buttonPlay = buttonPlay;
        this.fontColor1 = fontColor1;
        this.fontColor2 = fontColor2;
        this.event = event;
        this.news = news;
    }
    
    public void createJson(String juntaLauncherDir){
        String apiBase = "";
        
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("localVersion", serverVersion);
        try (FileWriter fileWriter = new FileWriter(juntaLauncherDir+"/junta_data.json")) {
            String jsonString = jsonObject.toString();

            fileWriter.write(jsonString);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
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

    public String getLauncherVersion() {
        return launcherVersion;
    }

    public void setLauncherVersion(String launcherVersion) {
        this.launcherVersion = launcherVersion;
    }

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    public String getBgColor1() {
        return bgColor1;
    }

    public void setBgColor1(String bgColor1) {
        this.bgColor1 = bgColor1;
    }

    public String getGbColor2() {
        return gbColor2;
    }

    public void setGbColor2(String gbColor2) {
        this.gbColor2 = gbColor2;
    }

    public String getButtonColor1() {
        return buttonColor1;
    }

    public void setButtonColor1(String buttonColor1) {
        this.buttonColor1 = buttonColor1;
    }

    public String getButtonColor2() {
        return buttonColor2;
    }

    public void setButtonColor2(String buttonColor2) {
        this.buttonColor2 = buttonColor2;
    }

    public String getButtonPlay() {
        return buttonPlay;
    }

    public void setButtonPlay(String buttonPlay) {
        this.buttonPlay = buttonPlay;
    }

    public String getFontColor1() {
        return fontColor1;
    }

    public void setFontColor1(String fontColor1) {
        this.fontColor1 = fontColor1;
    }

    public String getFontColor2() {
        return fontColor2;
    }

    public void setFontColor2(String fontColor2) {
        this.fontColor2 = fontColor2;
    }

    public JSONObject getEvent() {
        return event;
    }

    public void setEvent(JSONObject event) {
        this.event = event;
    }

    public JSONArray getNews() {
        return news;
    }

    public void setNews(JSONArray news) {
        this.news = news;
    }
    
    
    
    
}
