package pl.sda.kurs.z6_10_02_2019.exceptions.zadania.IoExample;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class IoExample {

    /**
     * @author Michal Jaszczyk
     **/

    // "C:/Programowanie/mojProjekt/src/Main/resources/jakisTamPlik.txt"
    // "src/Main/resources/jakisTamPlik.txt"
    public void readFile(String filename) {
        BufferedReader bufferedReader = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filename); // Otworzenie uchwytu do pliku
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line; // zmienna pomocnicza
            while ((line = bufferedReader.readLine()) != null) { // Wczytujemy kolejną linię, zapisujemy ją do zmiennej pomocniczej a następnie sprawdzamy czy nie jest nullem (co wskazywałoby na koniec pliku)
                System.out.println(line);
            }
        } catch (IOException e) { // łapiemy wyjątek
            e.printStackTrace();
        } finally { // Sprzątanie
            if (bufferedReader != null) { // Jeżeli udało się otworzyć to trzeba będzie zamknąć
                try {
                    bufferedReader.close(); // Zamykanie uchwytu do pliku. Niestety też może polecieć wyjątek
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readFileUsingTryWithResources(File file) {
        // try with resources - uchwyt do pliku zostanie automatycznie zamknięty po zakończeniu bloku try catch
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileUsingInputStream(InputStream inputStream) {
        // Inna wersja powyższej metody
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileUsingIOUtils(File file) {
        try {
            // Skorzystanie z biblioteki commons-io
            List<String> strings = IOUtils.readLines(new FileInputStream(file), Charset.defaultCharset());
            for (String line : strings) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileUsingFileUtils(File file) {
        try {
            // Skorzystanie z biblioteki commons-io, ale bardziej przyjazna metoda
            new File("sciezka i nazwa do pliku");
            List<String> strings = FileUtils.readLines(file, Charset.defaultCharset());
            for (String line : strings) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//----------------------------UZYWAC TEGO------------------------------//
    public void readFileUsingNio(Path path) {
        try {
            // łatwiejszy sposób wczytywania plików od Javy 1.7
            Path pathToJava = Paths.get("c:", "progrgam files", "java");
            List<String> strings = Files.readAllLines(path, Charset.defaultCharset());
            for (String line : strings) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//----------------------------------------------------------------------//
    public void readFilesUsingStreams(Path path) {
        // Od Javy 1.8 możemy wczytać plik jako strumień. Przydatne przy dużych plikach
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(line -> System.out.println(line)); // dla każdej linii wyświetl ją na konsolę
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


