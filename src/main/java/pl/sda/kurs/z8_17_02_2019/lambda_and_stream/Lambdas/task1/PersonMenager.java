package pl.sda.kurs.z8_17_02_2019.lambda_and_stream.Lambdas.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonMenager {
    private List<Person> personList = new ArrayList<>();

    public void load(Path path) throws IOException {
        Stream<String> lines = Files.lines(path);

        personList =
                lines.filter(line -> line.contains(";"))
                        .map(line -> line.split(";"))
                        .map(wordsArr -> new Person(wordsArr[0], wordsArr[1]))
                        .collect(Collectors.toList());
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
