package pl.sda.kurs.z6_10_02_2019.exceptions.zadania.zad2_pliki;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ConfigurationLoader {
    private static final Path DEFAULT_CONFIG_PATH = Paths.get("src", "main", "resources", "defaultConfig.txt");
    private List<String> config;
    private Map<String, String> configMap = new LinkedHashMap<>();

    public List<String> getConfig() {
        return config;
    }

    public Map<String, String> getConfigMap() {
        return configMap;
    }

    public void load(Path path) {
        try {
            config = Files.readAllLines(path, Charset.defaultCharset());
        } catch (IOException e) {
            //e.printStackTrace();
            try {
                config = Files.readAllLines(DEFAULT_CONFIG_PATH);
            } catch (IOException e1) {
                System.out.println("Brak defaultConfig.txt");
            }
        }
        for (String line : config) {
            line = line.trim();
            if (StringUtils.isNoneBlank(line)) {
                String[] keyValueArray = line.split("=");
                configMap.put(keyValueArray[0], keyValueArray[1]);
            }
        }


    }
}
