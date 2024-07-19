/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juanz
 */
public class replacePalceholder {
    String dotDiomedes, mcVersion, dotMinecraft;

    public replacePalceholder(String dotDiomedes, String mcVersion) {
        this.dotDiomedes = dotDiomedes;
        this.mcVersion = mcVersion;
        this.dotMinecraft = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.minecraft";
    }

    public List<String> getPlacedHoldediiiii(List<String> asd) {
        try {
            Map<String, String> placeholders = new HashMap<>();
            placeholders.put("library_directory", dotDiomedes + "/libraries");
            placeholders.put("classpath_separator", ";");
            placeholders.put("version_name", mcVersion);

            for (int i = 0; i < asd.size(); i++) {
                String arg = asd.get(i);
                for (Map.Entry<String, String> entry : placeholders.entrySet()) {
                    arg = arg.replace("${" + entry.getKey() + "}", entry.getValue());
                }
                asd.set(i, arg);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return asd;
    }
}
