package pl.sda.kurs.z7_16_02_2019.cwiczenia.task2;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        WordCounter wc = new WordCounter();

        try {
            wc.loadFile(Paths.get("src", "main", "resources", "plik.txt"));
            System.out.println(wc.countWords());
            System.out.println(wc.uniqueWords().size());
            //System.out.println(wc.uniqueWords());
            System.out.println(wc.countDuplicatedWords());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}