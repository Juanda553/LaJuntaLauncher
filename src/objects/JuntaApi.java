package objects;

import java.io.FileWriter;
import org.json.JSONArray;
import org.json.JSONObject;

public class JuntaApi {
    private String name, serverVersion, forgeVersion, indexVersion, serverIcon, modpackInitial, modpackUpdate;
    
    private String launcherVersion, titleImg;
    private int serverPrice, MoneyCollected;
    private String bgColor1, gbColor2, buttonColor1, buttonColor2, buttonPlay, fontPlay, fontColor1, fontColor2;
    
    private JSONObject event;
    private JSONArray news, partners, splashes;

    public JuntaApi(String name, String serverVersion, String forgeVersion, String indexVersion, String serverIcon, String modpackInitial, String modpackUpdate, String launcherVersion, String titleImg, int serverPrice, int MoneyCollected, String bgColor1, String gbColor2, String buttonColor1, String buttonColor2, String buttonPlay, String fontPlay, String fontColor1, String fontColor2, JSONObject event, JSONArray news, JSONArray partners, JSONArray splashes) {
        this.name = name;
        this.serverVersion = serverVersion;
        this.forgeVersion = forgeVersion;
        this.indexVersion = indexVersion;
        this.serverIcon = serverIcon;
        this.modpackInitial = modpackInitial;
        this.modpackUpdate = modpackUpdate;
        this.launcherVersion = launcherVersion;
        this.titleImg = titleImg;
        this.serverPrice = serverPrice;
        this.MoneyCollected = MoneyCollected;
        this.bgColor1 = bgColor1;
        this.gbColor2 = gbColor2;
        this.buttonColor1 = buttonColor1;
        this.buttonColor2 = buttonColor2;
        this.buttonPlay = buttonPlay;
        this.fontPlay = fontPlay;
        this.fontColor1 = fontColor1;
        this.fontColor2 = fontColor2;
        this.event = event;
        this.news = news;
        this.partners = partners;
        this.splashes = splashes;
    }
    
    public String getDetails() {
        StringBuilder result = new StringBuilder();
        result.append("name: ").append(this.name).append("\n");
        result.append("serverVersion: ").append(this.serverVersion).append("\n");
        result.append("forgeVersion: ").append(this.forgeVersion).append("\n");
        result.append("serverIcon: ").append(this.serverIcon).append("\n");
        result.append("modpackInitial: ").append(this.modpackInitial).append("\n");
        result.append("modpackUpdate: ").append(this.modpackUpdate).append("\n");
        result.append("launcherVersion: ").append(this.launcherVersion).append("\n");
        result.append("serverPrice: ").append(this.serverPrice).append("\n");
        result.append("moneyCollected: ").append(this.MoneyCollected).append("\n");
        result.append("titleImg: ").append(this.titleImg).append("\n");
        result.append("bgColor1: ").append(this.bgColor1).append("\n");
        result.append("gbColor2: ").append(this.gbColor2).append("\n");
        result.append("buttonColor1: ").append(this.buttonColor1).append("\n");
        result.append("buttonColor2: ").append(this.buttonColor2).append("\n");
        result.append("buttonPlay: ").append(this.buttonPlay).append("\n");
        result.append("fontPlay: ").append(this.fontPlay).append("\n");
        result.append("fontColor1: ").append(this.fontColor1).append("\n");
        result.append("fontColor2: ").append(this.fontColor2).append("\n");
        
        return result.toString();
    }

    public String getIndexVersion() {
        return indexVersion;
    }

    public void setIndexVersion(String indexVersion) {
        this.indexVersion = indexVersion;
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

    public int getServerPrice() {
        return serverPrice;
    }

    public void setServerPrice(int serverPrice) {
        this.serverPrice = serverPrice;
    }

    public int getMoneyCollected() {
        return MoneyCollected;
    }

    public void setMoneyCollected(int MoneyCollected) {
        this.MoneyCollected = MoneyCollected;
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

    public String getFontPlay() {
        return fontPlay;
    }

    public void setFontPlay(String fontPlay) {
        this.fontPlay = fontPlay;
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

    public JSONArray getPartners() {
        return partners;
    }

    public void setPartners(JSONArray partners) {
        this.partners = partners;
    }

    public JSONArray getSplashes() {
        return splashes;
    }

    public void setSplashes(JSONArray splashes) {
        this.splashes = splashes;
    }

    
    
}