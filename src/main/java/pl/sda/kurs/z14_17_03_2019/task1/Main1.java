package pl.sda.kurs.z14_17_03_2019.task1;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    static  List<Product> listaProduktów = new ArrayList<>();
    static {
        listaProduktów.add(new Product("Chleb", 2.5));
        listaProduktów.add(new Product("Chleb razowy", 4.0));
        listaProduktów.add(new Product("Bulka", 0.35));
        listaProduktów.add(new Product("Woda mineralna", 1.25));
        listaProduktów.add(new Product("Woda gazowana", 1.75));
        listaProduktów.add(new Product("Coca cola", 5.0));
        listaProduktów.add(new Product("Szynka", 8.99));
        listaProduktów.add(new Product("Proszek do prania", 15.68));
        listaProduktów.add(new Product("Herbata", 9.99));
        listaProduktów.add(new Product("Kawa mielona", 11.11));
        listaProduktów.add(new Product("Kawa ziarnista", 16.59));
    }

    public static void main(String[] args) throws InterruptedException {
        Shop sklep = new Shop(listaProduktów);
//Klient kupuje wszystkie produkty które są na liście z kartą kredytową * mając dość pienieędzy na koncie *
        Person janKowalski = new Person("Jan", "Kowalski");
        janKowalski.addAmmountOfMoney(9999);
        for (int i = 0; i < 5; i++) {
            List<String> listaZakupow = losowaLiczbaZakupow();
            System.out.println(listaZakupow);
            janKowalski.buy(listaZakupow, sklep);
            System.out.println();
            Thread.currentThread().sleep(1500);
        }

    }

    public static List<String> losowaLiczbaZakupow() {
        List<String> givenList = Lists.newArrayList("Chleb", "Bulka", "Chleb razowy", "Woda mineralna", "Woda gazowana", "Coca cola",
                "Szynka", "Proszek do prania", "Herbata", "Kawa mielona", "Kawa ziarnista");
        Collections.shuffle(givenList);
        int randomSeriesLength = 5;
        List<String> randomSeries = givenList.subList(0, randomSeriesLength);
        return randomSeries;
    }
}
