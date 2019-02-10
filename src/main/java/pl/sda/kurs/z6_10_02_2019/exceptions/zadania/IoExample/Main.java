package pl.sda.kurs.z6_10_02_2019.exceptions.zadania.IoExample;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {

        String pathname = "src/Main/resources/plik.txt";
        IoExample ioExample = new IoExample();

        System.out.println("--- Old style ---");
        ioExample.readFile(pathname);
        System.out.println();

        System.out.println("--- Using try with resources ---");
        File file = new File(pathname);
        ioExample.readFileUsingTryWithResources(file);
        System.out.println();

        System.out.println("--- Using IOUtils ---");
        ioExample.readFileUsingIOUtils(file);
        System.out.println();

        System.out.println("--- Using FileUtils ---");
        ioExample.readFileUsingFileUtils(file);
        System.out.println();

        System.out.println("--- From classpath ---");
        InputStream inputStream = Main.class.getResourceAsStream("/plik.txt");
        ioExample.readFileUsingInputStream(inputStream);
        System.out.println();
// najlepszy \/
        System.out.println("--- Using new I/O ---");
        Path path = Paths.get(pathname);
        //Path path0 = Paths.get("src/Main/resources/exampleFile.txt"); // Tworzenie ścieżki do pliku
        //Path path1 = Paths.get("src", "Main", "resources", "exampleFile.txt"); // To samo co wyżej, ale nie martwimy się o obsługę ścieżki przez system operacyjny
        ioExample.readFileUsingNio(path);
        System.out.println();

        System.out.println("--- Using Streams ---");
        ioExample.readFilesUsingStreams(path);

    }
}
