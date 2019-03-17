package pl.sda.kurs.z14_17_03_2019.task2;

import java.util.ArrayList;
import java.util.List;

public class Osoba {
    private String imie;
    public List<Zwierze> listaZwierzat = new ArrayList<>();
    public List<Jedzenie> listaPotraw = new ArrayList<>();

    public Osoba(String imie) {
        this.imie = imie;
    }

    public void feedAll() {
        for (Zwierze z : listaZwierzat) {
            feed(z);
        }
    }

    public void feed(Zwierze animal) {
        String pref = animal.getPrefferedFood();
        if (listaPotraw.get(1).getRodzaj().equals(pref)){
            //int food = listaPotraw.lastIndexOf(pref);
            //listaPotraw.remove(food);
            System.out.println(animal.getClass().getName() + " nakarmiony/a");
        }
    }
}
