package pl.sda.WorldGenerator.Utils;

import pl.sda.WorldGenerator.Flat;
import pl.sda.WorldGenerator.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static pl.sda.WorldGenerator.Data.Conf.*;
import static pl.sda.WorldGenerator.Utils.Creator.get;

public class FlatGenerator {
    Random random = new Random();

    Flat getRandomFlat() {
        return get(
                new Flat(getRandomArea(),
                        getRandomPeopleList()
                )
        );
    }

    private double getRandomArea() {
        double rangeMin = MIN_FLAT_AREA.getValue();
        double rangeMax = MAX_FLAT_AREA.getValue();
        double randomValue = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
        return Math.round(randomValue);
    }

    private List<Person> getRandomPeopleList() {
        PersonGenerator randomPerson = new PersonGenerator();
        int peopleListSize = 1 + random.nextInt(5);
        List<Person> randomPeopleList = new ArrayList<>();
                IntStream.range(0, peopleListSize)
                        .mapToObj(i -> randomPeopleList.add(randomPerson.getRandomPerson()))
                        .collect(Collectors.toList());
        return randomPeopleList;
    }
}
