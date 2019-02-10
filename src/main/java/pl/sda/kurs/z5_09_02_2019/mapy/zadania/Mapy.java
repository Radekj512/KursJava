package pl.sda.kurs.z5_09_02_2019.mapy.zadania;

import java.util.HashMap;
import java.util.Map;

public class Mapy {
    public static void main(String[] args) {
        Map<Integer, String> intStringMap = new HashMap<>();

        intStringMap.put(5, "piec");
        intStringMap.put(3, "trzy");
        intStringMap.put(9, "dziewiec");
        intStringMap.put(0, "zero");

        System.out.println(intStringMap.get(1));
        

        for (int i : intStringMap.keySet()) {
            System.out.println(i);

        }
        for (String s : intStringMap.values()) {
            System.out.println(s);

        }


        for (Map.Entry kv : intStringMap.entrySet()) {
            System.out.println("" + kv.getKey() + " -> " + kv.getValue());
        }

    }
}
