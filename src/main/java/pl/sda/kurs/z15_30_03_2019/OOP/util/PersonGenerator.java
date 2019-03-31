package pl.sda.kurs.z15_30_03_2019.OOP.util;

import pl.sda.kurs.z15_30_03_2019.OOP.Gender;
import pl.sda.kurs.z15_30_03_2019.OOP.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static pl.sda.kurs.z15_30_03_2019.OOP.util.Creator.getOrNull;

public class PersonGenerator {

    Person getRandomPerson() throws IOException {
        return getOrNull(
                new Person(
                        getAge(),
                        getSalary(),
                        getFirstName(),
                        getLastName(),
                        Gender.getGender()
                ));
    }

    // IMPLEMENT


    private String getLastName() throws IOException {
        Path pathLastName = Paths.get("src", "main", "java", "pl", "sda", "kurs", "z15_30_03_2019", "IO", "data", "names.txt");
        List<String> lastNames;
        lastNames = Files.lines(pathLastName).parallel().collect(Collectors.toList());
        Random r = new Random();
        return lastNames.get(r.nextInt(lastNames.size()));
    }

    private String getFirstName() throws IOException {
        Path name = Paths.get("src", "main", "java", "pl", "sda", "kurs", "z15_30_03_2019", "IO", "data", "first-names.txt");
        List<String> names;
        names = Files.lines(name).parallel().collect(Collectors.toList());
        Random r = new Random();
        return names.get(r.nextInt(names.size()));
    }

    private int getAge() {
        Random r = new Random();
        return 18 + r.nextInt(80);
    }

    private int getSalary() {
        Random r = new Random();
        return 1000 + r.nextInt(2000);

    }

}
