package pl.sda.kurs.z15_30_03_2019.OOP.util;

import pl.sda.kurs.z15_30_03_2019.OOP.Flat;
import pl.sda.kurs.z15_30_03_2019.OOP.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.sda.kurs.z15_30_03_2019.OOP.util.Creator.getOrNull;

public class FlatGenerator {

    Flat getRandomFlat() throws IOException {
        return getOrNull(
                new Flat(getRandomArea(),
                        getRandomPeopleList()
                )
        );
    }

    private double getRandomArea() {
        Random r = new Random();
        double rangeMin = 30;
        double rangeMax = 150;
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return Math.round(randomValue);
    }

    private List<Person> getRandomPeopleList() throws IOException {
        PersonGenerator randomPerson = new PersonGenerator();
        Random ran = new Random();
        int peopleListSize = 1 + ran.nextInt(4);
        List<Person> randomPeopleList = new ArrayList<>();
        //System.out.println("Nowie mieszkanie z " + peopleListSize + "lokatorami");
        /*IntStream.rangeClosed(0,peopleListSize).parallel()
                .mapToObj(i-> {
                    try {
                        randomPeopleList.add(randomPerson.getRandomPerson());
                    } catch (IOException e) {
                        e.printStackTrace();

                    }
                    return null;
                })
                .collect(Collectors.toList());*/
        for (int i = 0; i < peopleListSize; i++){
                randomPeopleList.add(randomPerson.getRandomPerson());
        }
        return randomPeopleList;
    }

    public static void main(String[] args) throws IOException {
        FlatGenerator f = new FlatGenerator();
        Flat flat = f.getRandomFlat();
        System.out.println(flat);
    }
}
