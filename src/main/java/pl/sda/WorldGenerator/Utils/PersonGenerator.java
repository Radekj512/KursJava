package pl.sda.WorldGenerator.Utils;

import pl.sda.WorldGenerator.Gender;
import pl.sda.WorldGenerator.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static pl.sda.WorldGenerator.Utils.Creator.get;

public class PersonGenerator {
    Path firstNamePath = Paths.get("src", "main", "java", "pl", "sda", "WorldGenerator", "Data", "first-names.txt");
    Path lastNamePath = Paths.get("src", "main", "java", "pl", "sda", "WorldGenerator", "Data", "names.txt");
    List<String> firstNameList;
    List<String> lastNameList;
    Random random = new Random();

    {
        try {
            firstNameList = Files.lines(firstNamePath).parallel().collect(Collectors.toList());
            lastNameList = Files.lines(lastNamePath).parallel().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Błąd wczytywania imion lub nazwisk");
        }
    }

    Person getRandomPerson(){
        return get(
                new Person(
                        getAge(),
                        getSalary(),
                        getFirstName(),
                        getLastName(),
                        Gender.getGender()
                ));
    }
    private String getLastName() {
        return lastNameList.get(random.nextInt(lastNameList.size()));
    }
    private String getFirstName() {
        return firstNameList.get(random.nextInt(firstNameList.size()));
    }
    private int getAge() {
        return 18 + random.nextInt(80);
    }
    private int getSalary() {
        return 1000 + random.nextInt(5000);
    }
}
