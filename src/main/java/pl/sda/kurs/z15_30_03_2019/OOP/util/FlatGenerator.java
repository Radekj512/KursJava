package pl.sda.kurs.z15_30_03_2019.OOP.util;

import pl.sda.kurs.z15_30_03_2019.OOP.Flat;
import pl.sda.kurs.z15_30_03_2019.OOP.Person;

import java.util.Collections;
import java.util.List;

import static pl.sda.kurs.z15_30_03_2019.OOP.util.Creator.getOrNull;

public class FlatGenerator {

    Flat getRandomFlat(){
        return getOrNull(
                new Flat(getRandomArea(),
                        getRandomPeopleList()
                )
        );
    }

    private double getRandomArea() {
        return 0;
    }

    private List<Person> getRandomPeopleList() {
        return Collections.emptyList();
    }
}
