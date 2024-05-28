package testPack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class McArgsCommand {
    String mineDir, miyeisonString, yeisonFile;
    JSONObject yeison, argsssss;

    public McArgsCommand(String mineDir) throws IOException {
        this.mineDir = mineDir;
        
        miyeisonString = mineDir + "/versions/1.18.2-forge-40.2.21/1.18.2-forge-40.2.21.json";
        yeisonFile = new String(Files.readAllBytes(Paths.get(miyeisonString)));
        this.yeison = new JSONObject(yeisonFile);
        this.argsssss = yeison.getJSONObject("arguments");
    }
    
    public String getCpLibs(){
        String result;
        List<String> clp = new ArrayList<>();
        for (int i = 0; i < yeison.getJSONArray("libraries").length(); i++){
            String libsJAJA = yeison.getJSONArray("libraries").getJSONObject(i).getJSONObject("downloads").getJSONObject("artifact").getString("path");
            clp.add(miyeisonString + "/" +libsJAJA);
        }
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
        return this.yeison.getString("mainClass");
    }
}