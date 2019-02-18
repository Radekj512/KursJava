package pl.sda.kurs.z8_17_02_2019.zapisDoPliku;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class SaveToFile {
    public void save(Path path, List<String> lines) throws IOException {
        Files.write(path, lines);
    }
}
