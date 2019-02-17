package pl.sda.kurs.z8_17_02_2019.generic.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuickList<Integer> lista = new QuickList<>(1,2,3,4,5,6,7);

        List<Integer> lista2 = lista.toList();
        System.out.println(lista2);
    }
}
