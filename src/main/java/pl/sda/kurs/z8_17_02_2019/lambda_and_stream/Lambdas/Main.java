package pl.sda.kurs.z8_17_02_2019.lambda_and_stream.Lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        LambdaExmaple lambdaExmaple = new LambdaExmaple();

        System.out.println(lambdaExmaple.power().apply(5));

        System.out.println(lambdaExmaple.sum().apply(2, 3));

        Path path = Paths.get("src", "main", "resources", "plik.txt");
        Stream<String> lines = Files.lines(path);

        List<String> parsedLines = lines.filter(line -> line.contains("."))// bierze tyle to ktore zawieraja kropke
                .filter(line -> line.contains("a"))  // bierze tyle to ktore zawieraja listere a
                .map(line -> line.toLowerCase()) // zamiana na male litery
                .collect(Collectors.toList());

        System.out.println(parsedLines);

        List<String> words = new ArrayList<>();
        words.add("Ala ma kota");
        words.add("Hello World!");
        words.add("Dzisiaj jest niedziela");
        List<String>parsedWords = words.stream().filter(word -> word.contains("!"))
                .map(line -> line.split(" "))
                .map(wordsArr -> Arrays.asList(wordsArr))
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(parsedWords);

    }
}
