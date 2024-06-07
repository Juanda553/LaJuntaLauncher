package util;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.json.JSONArray;

import util.*;
import util.McArgsCommand;
import util.replacePalceholder;
import objects.LauncherJunta;
import objects.JuntaApi;

public class LaunchMinecraft {
    
    
    
    
    
    
    public String launch(LauncherJunta LAUNCHER_CLASS, JuntaApi JUNTA_API, JFrame ventana){
        try {                                           
            String dotDiomedes = LAUNCHER_CLASS.getDiomedesDir();
            String mcVersion = LAUNCHER_CLASS.getMinecraftVersion();
            String verIndex = LAUNCHER_CLASS.getIndexVersion();
            
            
            String ram = String.valueOf(LAUNCHER_CLASS.getRam());
            String ramFinal = "-Xmx" + ram + "G";
            
            McArgsCommand mcArgsCommand = new McArgsCommand(dotDiomedes, JUNTA_API.getVanillaVersion(), JUNTA_API.getForgeVersion());
            replacePalceholder pene = new replacePalceholder(dotDiomedes, mcVersion);
            
            List<String> command = new ArrayList<>();
            command.add("java");
            command.add(ramFinal);
            command.add(ramFinal);
            command.add("-XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump");
            command.add("-Djava.library.path=" + dotDiomedes + "/versions/" + mcVersion + "/natives");
            command.add("-cp");
            command.add(mcArgsCommand.getCpLibs() + ";" + mcArgsCommand.getCpLibsVanilla());
            //System.out.println(mcArgsCommand.getCpLibs() + ";" + mcArgsCommand.getCpLibsVanilla());
            
            command.addAll(pene.getPlacedHoldediiiii(mcArgsCommand.getJvmArgs()));
            
            command.add(mcArgsCommand.getMainClassMC());
            
            command.add("--username");
            command.add(LAUNCHER_CLASS.getUsername());
            command.add("--version");
            command.add(mcVersion);
            command.add("--gameDir");
            command.add(dotDiomedes);
            command.add("--assetsDir");
            command.add(dotDiomedes + "/assets");
            command.add("--assetIndex");
            command.add(verIndex);
            command.add("--uuid");
            command.add("");
            command.add("--accessToken");
            command.add("");
            command.add("--clientId");
            command.add("${clientid}");
            command.add("--xuid");
            command.add("${auth_xuid}");
            command.add("--userType");
            command.add("msa");
            command.add("--versionType");
            command.add("release");
            command.addAll(mcArgsCommand.getGamerArgs());
            
            //System.out.println(command);
            JSONArray dsfgsdfghsdfh = new JSONArray(command);
            System.out.println(dsfgsdfghsdfh);
            
            try {
                // penetrar datos al cmd
                ProcessBuilder processBuilder = new ProcessBuilder(command);
                processBuilder.directory(new File(dotDiomedes));
                processBuilder.inheritIO();
                Process process = processBuilder.start();
                
                process.waitFor();
                String sxitCodeUwU = "Exitcode: " + process.exitValue();
                return sxitCodeUwU;
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        } catch (Exception ex) {
            System.out.println("error ejecutar");
            System.out.println(ex);
        }
        return "";
    }

}
