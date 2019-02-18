package pl.sda.kurs.z8_17_02_2019.zapisDoPliku;

import pl.sda.kurs.z8_17_02_2019.generic.task1.QuickList;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src","main", "resources", "pli1k.txt");
        QuickList<String> lista = new QuickList<>("a","b","c");
        List<String> ss = lista.toList();
        SaveToFile s = new SaveToFile();
        s.save(path, ss);
    }
}
