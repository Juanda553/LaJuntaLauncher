package testPack;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

import testPack.*;

public class LaunchMinecraft {
    public static void main(String[] args) throws IOException {
        String dotDiomedes = "C:/Users/"+ System.getProperty("user.name") +"/AppData/Roaming/.jnt-copia";
        String mcVersion = "1.18.2-forge-40.2.21";
        String verIndex = "1.18";
        
        
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
        command.add(mcArgsCommand.getCpLibs() + ";" + mcArgsCommand.getCpLibsVanilla());
        
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
        
        //System.out.println(command);
        JSONArray dsfgsdfghsdfh = new JSONArray(command);
        System.out.println(dsfgsdfghsdfh);
        
        String[] amigo = {  "java",
   "-Xmx16G",
   "-Xmx16G",
   "-XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump",
   "-Djava.library.path=C:/Users/juanz/AppData/Roaming/.jnt-copia\\versions\\1.18.2-forge-40.2.21\\natives",
   "-cp",
   "C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\cpw\\mods\\securejarhandler\\1.0.8\\securejarhandler-1.0.8.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\ow2\\asm\\asm\\9.7\\asm-9.7.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\ow2\\asm\\asm-commons\\9.7\\asm-commons-9.7.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\ow2\\asm\\asm-tree\\9.7\\asm-tree-9.7.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\ow2\\asm\\asm-util\\9.7\\asm-util-9.7.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\ow2\\asm\\asm-analysis\\9.7\\asm-analysis-9.7.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\minecraftforge\\accesstransformers\\8.0.4\\accesstransformers-8.0.4.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\antlr\\antlr4-runtime\\4.9.1\\antlr4-runtime-4.9.1.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\minecraftforge\\eventbus\\5.0.3\\eventbus-5.0.3.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\minecraftforge\\forgespi\\4.0.15-4.x\\forgespi-4.0.15-4.x.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\minecraftforge\\coremods\\5.0.1\\coremods-5.0.1.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\cpw\\mods\\modlauncher\\9.1.3\\modlauncher-9.1.3.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\minecraftforge\\unsafe\\0.2.0\\unsafe-0.2.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\electronwill\\night-config\\core\\3.6.4\\core-3.6.4.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\electronwill\\night-config\\toml\\3.6.4\\toml-3.6.4.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\apache\\maven\\maven-artifact\\3.6.3\\maven-artifact-3.6.3.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\jodah\\typetools\\0.8.3\\typetools-0.8.3.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\minecrell\\terminalconsoleappender\\1.2.0\\terminalconsoleappender-1.2.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\jline\\jline-reader\\3.12.1\\jline-reader-3.12.1.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\jline\\jline-terminal\\3.12.1\\jline-terminal-3.12.1.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\spongepowered\\mixin\\0.8.5\\mixin-0.8.5.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\openjdk\\nashorn\\nashorn-core\\15.3\\nashorn-core-15.3.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\minecraftforge\\JarJarSelector\\0.3.19\\JarJarSelector-0.3.19.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\minecraftforge\\JarJarMetadata\\0.3.19\\JarJarMetadata-0.3.19.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\cpw\\mods\\bootstraplauncher\\1.0.0\\bootstraplauncher-1.0.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\minecraftforge\\JarJarFileSystems\\0.3.19\\JarJarFileSystems-0.3.19.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\minecraftforge\\fmlloader\\1.18.2-40.2.21\\fmlloader-1.18.2-40.2.21.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\mojang\\logging\\1.0.0\\logging-1.0.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\mojang\\blocklist\\1.0.10\\blocklist-1.0.10.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\mojang\\patchy\\2.2.10\\patchy-2.2.10.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\github\\oshi\\oshi-core\\5.8.5\\oshi-core-5.8.5.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\java\\dev\\jna\\jna\\5.10.0\\jna-5.10.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\java\\dev\\jna\\jna-platform\\5.10.0\\jna-platform-5.10.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\slf4j\\slf4j-api\\1.8.0-beta4\\slf4j-api-1.8.0-beta4.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\apache\\logging\\log4j\\log4j-slf4j18-impl\\2.17.0\\log4j-slf4j18-impl-2.17.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\ibm\\icu\\icu4j\\70.1\\icu4j-70.1.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\mojang\\javabridge\\1.2.24\\javabridge-1.2.24.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\net\\sf\\jopt-simple\\jopt-simple\\5.0.4\\jopt-simple-5.0.4.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\io\\netty\\netty-all\\4.1.68.Final\\netty-all-4.1.68.Final.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\google\\guava\\failureaccess\\1.0.1\\failureaccess-1.0.1.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\google\\guava\\guava\\31.0.1-jre\\guava-31.0.1-jre.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\apache\\commons\\commons-lang3\\3.12.0\\commons-lang3-3.12.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\commons-io\\commons-io\\2.11.0\\commons-io-2.11.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\commons-codec\\commons-codec\\1.15\\commons-codec-1.15.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\mojang\\brigadier\\1.0.18\\brigadier-1.0.18.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\mojang\\datafixerupper\\4.1.27\\datafixerupper-4.1.27.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\google\\code\\gson\\gson\\2.8.9\\gson-2.8.9.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\mojang\\authlib\\3.3.39\\authlib-3.3.39.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\apache\\commons\\commons-compress\\1.21\\commons-compress-1.21.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\apache\\httpcomponents\\httpclient\\4.5.13\\httpclient-4.5.13.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\commons-logging\\commons-logging\\1.2\\commons-logging-1.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\apache\\httpcomponents\\httpcore\\4.4.14\\httpcore-4.4.14.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\it\\unimi\\dsi\\fastutil\\8.5.6\\fastutil-8.5.6.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\apache\\logging\\log4j\\log4j-api\\2.17.0\\log4j-api-2.17.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\apache\\logging\\log4j\\log4j-core\\2.17.0\\log4j-core-2.17.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl\\3.2.2\\lwjgl-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-jemalloc\\3.2.2\\lwjgl-jemalloc-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-openal\\3.2.2\\lwjgl-openal-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-opengl\\3.2.2\\lwjgl-opengl-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-glfw\\3.2.2\\lwjgl-glfw-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-stb\\3.2.2\\lwjgl-stb-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-tinyfd\\3.2.2\\lwjgl-tinyfd-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl\\3.2.2\\lwjgl-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org/lwjgl/lwjgl/3.2.2/lwjgl-3.2.2-natives-windows.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-jemalloc\\3.2.2\\lwjgl-jemalloc-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org/lwjgl/lwjgl-jemalloc/3.2.2/lwjgl-jemalloc-3.2.2-natives-windows.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-openal\\3.2.2\\lwjgl-openal-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org/lwjgl/lwjgl-openal/3.2.2/lwjgl-openal-3.2.2-natives-windows.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-opengl\\3.2.2\\lwjgl-opengl-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org/lwjgl/lwjgl-opengl/3.2.2/lwjgl-opengl-3.2.2-natives-windows.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-glfw\\3.2.2\\lwjgl-glfw-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org/lwjgl/lwjgl-glfw/3.2.2/lwjgl-glfw-3.2.2-natives-windows.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-tinyfd\\3.2.2\\lwjgl-tinyfd-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org/lwjgl/lwjgl-tinyfd/3.2.2/lwjgl-tinyfd-3.2.2-natives-windows.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org\\lwjgl\\lwjgl-stb\\3.2.2\\lwjgl-stb-3.2.2.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\org/lwjgl/lwjgl-stb/3.2.2/lwjgl-stb-3.2.2-natives-windows.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\mojang\\text2speech\\1.12.4\\text2speech-1.12.4.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com\\mojang\\text2speech\\1.12.4\\text2speech-1.12.4.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries\\com/mojang/text2speech/1.12.4/text2speech-1.12.4-natives-windows.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\versions\\1.18.2-forge-40.2.21\\1.18.2-forge-40.2.21.jar",
   "-Djava.net.preferIPv6Addresses=system",
   "-DignoreList=bootstraplauncher,securejarhandler,asm-commons,asm-util,asm-analysis,asm-tree,asm,JarJarFileSystems,client-extra,fmlcore,javafmllanguage,lowcodelanguage,mclanguage,forge-,1.18.2-forge-40.2.21.jar",
   "-DmergeModules=jna-5.10.0.jar,jna-platform-5.10.0.jar,java-objc-bridge-1.0.0.jar",
   "-DlibraryDirectory=C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries",
   "-p",
   "C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries/cpw/mods/bootstraplauncher/1.0.0/bootstraplauncher-1.0.0.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries/cpw/mods/securejarhandler/1.0.8/securejarhandler-1.0.8.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries/org/ow2/asm/asm-util/9.7/asm-util-9.7.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries/org/ow2/asm/asm-analysis/9.7/asm-analysis-9.7.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries/org/ow2/asm/asm/9.7/asm-9.7.jar;C:/Users/juanz/AppData/Roaming/.jnt-copia\\libraries/net/minecraftforge/JarJarFileSystems/0.3.19/JarJarFileSystems-0.3.19.jar",
   "--add-modules",
   "ALL-MODULE-PATH",
   "--add-opens",
   "java.base/java.util.jar=cpw.mods.securejarhandler",
   "--add-opens",
   "java.base/java.lang.invoke=cpw.mods.securejarhandler",
   "--add-exports",
   "java.base/sun.security.util=cpw.mods.securejarhandler",
   "--add-exports",
   "jdk.naming.dns/com.sun.jndi.dns=java.naming",
   "cpw.mods.bootstraplauncher.BootstrapLauncher",
   "--username",
   "Diomedes",
   "--version",
   "1.18.2-forge-40.2.21",
   "--gameDir",
   "C:/Users/juanz/AppData/Roaming/.jnt-copia",
   "--assetsDir",
   "C:/Users/juanz/AppData/Roaming/.jnt-copia\\assets",
   "--assetIndex",
   "1.18",
   "--uuid",
   "",
   "--accessToken",
   "",
   "--clientId",
   "${clientid}",
   "--xuid",
   "${auth_xuid}",
   "--userType",
   "msa",
   "--versionType",
   "release",
   
   "--launchTarget",
   "forgeclient",
   "--fml.forgeVersion",
   "40.2.21",
   "--fml.mcVersion",
   "1.18.2",
   "--fml.forgeGroup",
   "net.minecraftforge",
   "--fml.mcpVersion",
   "20220404.173914"};
        

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
