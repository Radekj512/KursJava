package pl.sda.kurs.z6_10_02_2019.exceptions.zadania.zad2_pliki;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        //String pathname = "src/main/resources/plik.txt";

        Path path = Paths.get("src", "main", "resources", "productionConfig.txt");
        ConfigurationLoader configurationLoader = new ConfigurationLoader();

        configurationLoader.load(path);

        for (Map.Entry keyValue : (configurationLoader.getConfigMap()).entrySet()) {
            System.out.println(keyValue.getKey() + " -> " + keyValue.getValue());

        }
    }
}
