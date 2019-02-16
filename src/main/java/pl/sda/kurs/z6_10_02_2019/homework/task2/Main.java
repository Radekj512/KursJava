package pl.sda.kurs.z6_10_02_2019.homework.task2;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Ubezpieczyciel bazaOsob = new Ubezpieczyciel();

        System.out.println(bazaOsob.dodajOsobe(1L,new Osoba("Radek","Janus", LocalDate.of(1992,12,5)))?"Dodano osobe do bazy" : "Osoba z takim numerem pesel juz isnieje");
        System.out.println(bazaOsob.dodajOsobe(2L,new Osoba("Zosia","Nowak", LocalDate.of(1989,8,15)))?"Dodano osobe do bazy" : "Osoba z takim numerem pesel juz isnieje");
        System.out.println(bazaOsob.dodajOsobe(3L,new Osoba("Antek","Macierewicz", LocalDate.of(1954,5,1)))?"Dodano osobe do bazy" : "Osoba z takim numerem pesel juz isnieje");

        System.out.println(bazaOsob.znajdzOsobe(92120501457L));

        bazaOsob.aktualizujOsobe(4L,new Osoba("Maciek", "Kowalski",LocalDate.of(2000,4,17)));

        bazaOsob.wypiszOsoby();
    }
}
