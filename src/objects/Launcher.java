package objects;

public class Launcher {
    private String version, titleImg;
    //colores
    private String bgColor1, gbColor2, buttonColor1, buttonColor2, fontColor1, fontColor2;

    public Launcher(String version, String titleImg, String bgColor1, String gbColor2, String buttonColor2, String fontColor1, String fontColor2) {
        this.version = version;
        this.titleImg = titleImg;
        this.bgColor1 = bgColor1;
        this.gbColor2 = gbColor2;
        this.buttonColor2 = buttonColor2;
        this.fontColor1 = fontColor1;
        this.fontColor2 = fontColor2;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
    
    
}
