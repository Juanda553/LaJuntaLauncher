/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author juanz
 */
public class replacePalceholder {
    public static void main(String[] args, String dotDiomedes, String mcVersion) {
        
        Map<String, String> placeholders = new HashMap<>();
        placeholders.put("library_directory", dotDiomedes);
        placeholders.put("classpath_separator", ";");

        List<String> arguments = new ArrayList<>();
        arguments.add("-Djava.net.preferIPv6Addresses=system");
        arguments.add("-DignoreList=bootstraplauncher,securejarhandler,asm-commons,asm-util,asm-analysis,asm-tree,asm,JarJarFileSystems,client-extra,fmlcore,javafmllanguage,lowcodelanguage,mclanguage,forge-,${version_name}.jar");
        arguments.add("-DmergeModules=jna-5.10.0.jar,jna-platform-5.10.0.jar,java-objc-bridge-1.0.0.jar");
        arguments.add("-DlibraryDirectory=${library_directory}");
        arguments.add("-p");
        arguments.add("${library_directory}/cpw/mods/bootstraplauncher/1.0.0/bootstraplauncher-1.0.0.jar${classpath_separator}${library_directory}/cpw/mods/securejarhandler/1.0.8/securejarhandler-1.0.8.jar${classpath_separator}${library_directory}/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.jar${classpath_separator}${library_directory}/org/ow2/asm/asm-util/9.7/asm-util-9.7.jar${classpath_separator}${library_directory}/org/ow2/asm/asm-analysis/9.7/asm-analysis-9.7.jar${classpath_separator}${library_directory}/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.jar${classpath_separator}${library_directory}/org/ow2/asm/asm/9.7/asm-9.7.jar${classpath_separator}${library_directory}/net/minecraftforge/JarJarFileSystems/0.3.19/JarJarFileSystems-0.3.19.jar");
        arguments.add("--add-modules");
        arguments.add("ALL-MODULE-PATH");
        arguments.add("--add-opens");
        arguments.add("java.base/java.util.jar=cpw.mods.securejarhandler");
        arguments.add("--add-opens");
        arguments.add("java.base/java.lang.invoke=cpw.mods.securejarhandler");
        arguments.add("--add-exports");
        arguments.add("java.base/sun.security.util=cpw.mods.securejarhandler");
        arguments.add("--add-exports");
        arguments.add("jdk.naming.dns/com.sun.jndi.dns=java.naming");

        replacePlaceholders(arguments, placeholders);

        for (String arg : arguments) {
            System.out.println(arg);
        }
    }

    public static void replacePlaceholders(List<String> arguments, Map<String, String> placeholders) {
        for (int i = 0; i < arguments.size(); i++) {
            String arg = arguments.get(i);
            for (Map.Entry<String, String> entry : placeholders.entrySet()) {
                arg = arg.replace("${" + entry.getKey() + "}", entry.getValue());
            }
            arguments.set(i, arg);
        }
    }
}
