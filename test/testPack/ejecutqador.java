package testPack;
import util.McArgsCommand;
import java.io.IOException;
import testPack.*;

public class ejecutqador {
    public static void main(String[] args) throws IOException {
        McArgsCommand mcArgsCommand = new McArgsCommand("C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.jnt-copia", "", "");
        System.out.println(mcArgsCommand.getCpLibs() + ";" + mcArgsCommand.getCpLibsVanilla());
        
        //System.out.println(ola.getMainClassMC());
        //System.out.println(ola.getJvmArgs());
        
        //replacePalceholder pene = new replacePalceholder("C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.jnt-copia", "1.18.2");
        //System.out.println(ola.getJvmArgs());
    }
}
