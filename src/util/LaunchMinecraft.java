package util;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.JSONArray;


import objects.LauncherJunta;
import objects.JuntaApi;

public class LaunchMinecraft {
    public int launch(LauncherJunta LAUNCHER_CLASS, JuntaApi JUNTA_API, JFrame ventana, String userName){
        try {                                           
            String dotDiomedes = LAUNCHER_CLASS.getDiomedesDir();
            String mcVersion = LAUNCHER_CLASS.getMinecraftVersion();
            String verIndex = LAUNCHER_CLASS.getIndexVersion();
            String dotMinecraft = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.minecraft";
            
            
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
            command.add(userName);
            command.add("--version");
            command.add(mcVersion);
            command.add("--gameDir");
            command.add(dotDiomedes);
            command.add("--assetsDir");
            command.add(dotMinecraft + "/assets");
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
                ventana.dispose();
                
                process.waitFor();
                if (process.exitValue() == 0) {
                    System.exit(0);
                } else {
                    ventana.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Joabro, el juego te crasheó JKASJKAJKSJK" + "\n\nCodigo de Salida: " + process.exitValue(), "Crash xd", JOptionPane.ERROR_MESSAGE);
                }
                
                return process.exitValue();
            } catch (IOException | InterruptedException e) {
                JOptionPane.showMessageDialog(null, "Envia captura de este error: Class LaunchMinecraft.java Process\n" + e, "Error Rancio", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Envia captura de este error: Class LaunchMinecraft.java full\n" + ex, "Error Rancio", JOptionPane.ERROR_MESSAGE);
        }
        return 1;
    }

}
