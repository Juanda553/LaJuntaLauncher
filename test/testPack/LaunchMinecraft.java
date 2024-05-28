package testPack;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import testPack.*;

public class LaunchMinecraft {
    public static void main(String[] args) throws IOException {
        String dotDiomedes = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.jnt-copia";
        String mcVersion = "1.18.2-forge-40.2.21";
        
        String verIndex = mcVersion.substring(0, mcVersion.lastIndexOf('.'));
        
        
        String ram = "16";
        String ramFinal = "-Xmx" + ram + "G";
        
        McArgsCommand mcArgsCommand = new McArgsCommand("C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.jnt-copia");
        replacePalceholder pene = new replacePalceholder(dotDiomedes, mcVersion);

        List<String> command = new ArrayList<>();
        command.add("java");
        command.add(ramFinal);
        command.add(ramFinal);
        command.add("-XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump");
        command.add("-Djava.library.path=" + dotDiomedes + "/versions/" + mcVersion + "/natives");
        command.add("-cp");
        command.add(mcArgsCommand.getCpLibs());
        
        command.addAll(pene.getPlacedHoldediiiii(mcArgsCommand.getJvmArgs()));
        
        command.add(mcArgsCommand.getMainClassMC());
        
        command.add("--username");
        command.add("Diomedes");
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
        
        System.out.println(command);
        
        

        try {
            // penetrar datos al cmd
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.directory(new File(dotDiomedes));
            processBuilder.inheritIO();
            Process process = processBuilder.start();

            process.waitFor();
            System.out.println("Exitcode: " + process.exitValue());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
