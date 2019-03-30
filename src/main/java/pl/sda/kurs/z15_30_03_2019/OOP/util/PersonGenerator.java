package pl.sda.kurs.z15_30_03_2019.OOP.util;

import pl.sda.kurs.z15_30_03_2019.OOP.Gender;
import pl.sda.kurs.z15_30_03_2019.OOP.Person;

import static pl.sda.kurs.z15_30_03_2019.OOP.util.Creator.getOrNull;

public class PersonGenerator {

    Person getRandomPerson() {
        return getOrNull(
                new Person(
                        getSalary(),
                        getAge(),
                        getFirstName(),
                        getLastName(),
                        Gender.getGender()
                ));
    }

    // IMPLEMENT
    private String getLastName() {
        return null;
    }

    private String getFirstName() {
        return null;
    }

    private int getAge() {
        return 0;
    }

    private int getSalary() {
        return 0;
    }

}
