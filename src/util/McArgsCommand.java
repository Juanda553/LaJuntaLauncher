package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class McArgsCommand {
    String mineDir, miyeisonString, yeisonFile, miyeisonStringVanilla, yeisonFileVanilla, versionForge, mcVersion, dotMinecraft, modLoader;
    JSONObject yeison, argsssss, yeisonVanilla;

    public McArgsCommand(String mineDir, String mcVersion, String versionForge, String modLoader) throws IOException {
        this.mineDir = mineDir;
        this.mcVersion = mcVersion;
        this.versionForge = versionForge;
        this.modLoader = modLoader;
        this.dotMinecraft = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.minecraft";
        
        miyeisonString = mineDir + "/versions/"+ versionForge +"/"+versionForge+".json";
        yeisonFile = new String(Files.readAllBytes(Paths.get(miyeisonString)));
        this.yeison = new JSONObject(yeisonFile);
        
        miyeisonStringVanilla = mineDir + "/versions/"+ mcVersion +"/"+ mcVersion +".json";
        yeisonFileVanilla = new String(Files.readAllBytes(Paths.get(miyeisonStringVanilla)));
        this.yeisonVanilla = new JSONObject(yeisonFileVanilla);
        
        
        this.argsssss = yeison.getJSONObject("arguments");
    }
    
    public String getForgeCpLibs(){
        String result;
        List<String> clp = new ArrayList<>();
        for (int i = 0; i < yeison.getJSONArray("libraries").length(); i++){
            String libsJAJA = yeison.getJSONArray("libraries").getJSONObject(i).getJSONObject("downloads").getJSONObject("artifact").getString("path");
            clp.add(mineDir + "/libraries/" +libsJAJA);
        }
        clp.add(mineDir + "/versions/" + versionForge + "/" + versionForge + ".jar");
        result = String.join(";", clp);
        return result;
    }
    
    public String getFabricCpLibs(){
        String result;
        List<String> clp = new ArrayList<>();
        for (int i = 0; i < yeison.getJSONArray("libraries").length(); i++){
            JSONObject thisLib = yeison.getJSONArray("libraries").getJSONObject(i);
            
            if(thisLib.has("name")) {
                String name = thisLib.getString("name");
                
                String[] parts = name.split(":");
                if (parts.length >= 3) {
                    String group = parts[0].replace('.', '/');
                    String artifact = parts[1];
                    String version = parts[2];
                    String classifier = parts.length > 3 ? parts[3] : "";
                    String jarName = artifact + "-" + version + (!classifier.isEmpty() ? "-" + classifier : "") + ".jar";
                    
                    String dirPath = group + "/" + artifact + "/" + version + "/";
                    String filePath = dirPath + jarName;
                    clp.add(mineDir + "/libraries/" + filePath);
                    System.out.println(filePath);
                }
            }
        }
        clp.add(mineDir + "/versions/" + versionForge + "/" + versionForge + ".jar");
        result = String.join(";", clp);
        System.out.println(result);
        return result;
    }
    
    public String getCpLibsVanillaForged(){
        String result;
        List<String> clp = new ArrayList<>();
        for (int i = 0; i < yeisonVanilla.getJSONArray("libraries").length(); i++){
            String libsJAJA;
            
            try {
                if (yeisonVanilla.getJSONArray("libraries").getJSONObject(i).getJSONArray("rules").length() == 2) {
                    System.out.println("Saltau");
                    continue;
                }
            } catch (Exception e) {}
            
            try {
                libsJAJA = yeisonVanilla.getJSONArray("libraries").getJSONObject(i).getJSONObject("downloads").getJSONObject("classifiers").getJSONObject("natives-windows").getString("path");
                System.out.println("A | " + libsJAJA);
            } catch (Exception e) {
                libsJAJA = yeisonVanilla.getJSONArray("libraries").getJSONObject(i).getJSONObject("downloads").getJSONObject("artifact").getString("path");
                System.out.println("B | " + libsJAJA);
            }
            
            clp.add(mineDir + "/libraries/" +libsJAJA);
        }
        System.out.println("Librerias compiladas");
        result = String.join(";", clp);
        return result;
    }
    
    public String getCpLibsVanilla(){
        String result;
        List<String> clp = new ArrayList<>();
        for (int i = 0; i < yeisonVanilla.getJSONArray("libraries").length(); i++){
            String libsJAJA;
            
            try {
                if (yeisonVanilla.getJSONArray("libraries").getJSONObject(i).getJSONArray("rules").length() == 2) {
                    System.out.println("Saltau");
                    continue;
                }
            } catch (Exception e) {}
            
            try {
                libsJAJA = yeisonVanilla.getJSONArray("libraries").getJSONObject(i).getJSONObject("downloads").getJSONObject("classifiers").getJSONObject("natives-windows").getString("path");
                System.out.println("A | " + libsJAJA);
            } catch (Exception e) {
                libsJAJA = yeisonVanilla.getJSONArray("libraries").getJSONObject(i).getJSONObject("downloads").getJSONObject("artifact").getString("path");
                System.out.println("B | " + libsJAJA);
            }
            
            clp.add(mineDir + "/libraries/" +libsJAJA);
        }
        clp.add(mineDir + "/versions/" + mcVersion + "/" + mcVersion + ".jar");
        System.out.println("Librerias compiladas");
        result = String.join(";", clp);
        return result;
    }
    
    public List<String> getJvmArgs(){
        List<String> jvmArgs = new ArrayList<>();
        for (int i = 0; i < argsssss.getJSONArray("jvm").length(); i++){
            jvmArgs.add(argsssss.getJSONArray("jvm").getString(i));
        }
        return jvmArgs;
    }
    
    public List<String> getGamerArgs(){
        List<String> gameArgs = new ArrayList<>();
        for (int i = 0; i < argsssss.getJSONArray("game").length(); i++){
            gameArgs.add(argsssss.getJSONArray("game").getString(i));
        }
        return gameArgs;
    }
    
    public String getMainClassMC(){
        String out = "";
        switch (modLoader) {
                case "forge":
                    out = this.yeison.getString("mainClass");
                    break;
                case "fabric":
                    out = this.yeison.getString("mainClass");
                    break;
                case "vanilla":
                    out = this.yeisonVanilla.getString("mainClass");
                    break;
                default:
                    out = this.yeisonVanilla.getString("mainClass");
                    break;
            }
        System.out.println(out);
        return out;
    }
}