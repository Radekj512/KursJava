package pl.sda.kurs.z5_09_02_2019.mapy.zadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listy {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("kot");
        animals.add("pies");
        animals.add("bocian");
        animals.add("aligator");

        System.out.println(animals); // oryginalna

        Collections.reverse(animals); // odwrocona
        System.out.println(animals);

        Collections.sort(animals); // alfabettycznie
        System.out.println(animals);

        Collections.shuffle(animals); // wymieszana
        System.out.println(animals);

        animals.sort(Collections.reverseOrder()); // odwrotnie alfabetycznie
        System.out.println(animals);

    }
}
