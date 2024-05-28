package testPack;
import java.io.IOException;
import testPack.*;

public class ejecutqador {
    public static void main(String[] args) throws IOException {
        McArgsCommand ola = new McArgsCommand("C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.jnt-copia");
        System.out.println(ola.getMainClassMC());
        
        replacePalceholder pene = new replacePalceholder("C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.jnt-copia", "1.18.2");
        System.out.println(pene.getPlacedHoldediiiii(ola.getJvmArgs()));
    }
}
