package pl.sda.zajecia4.homework.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Szkola {

    public static void main(String[] args) {
        Uczen u1 = new Uczen("Jan Kowalski");
        Uczen u2 = new Uczen("Gosia Nowak");
        Uczen u3 = new Uczen("Antoni Macierewicz");
        Wozny w1 = new Wozny("Wozny 1");
        Wozny w2 = new Wozny("Wozny 2");
        Nauczyciel n1 = new Nauczyciel("Nauczyciel 1");
        Nauczyciel n2 = new Nauczyciel("Nauczyciel 2");
        Dyrektor d1 = new Dyrektor("Pan Dyrektor");

        Szatnia sz1 = new Szatnia();
        SalaLekcyjna sl1 = new SalaLekcyjna();
        SalaLekcyjna sl2 = new SalaLekcyjna();
        PokojNauczycielski pn1 = new PokojNauczycielski();
        GabinetDyrektora gd1 = new GabinetDyrektora();
        PomieszczenieGospodarcze pg1 = new PomieszczenieGospodarcze();

        Pracownik[] pracownicy = {w1, w2, n1, n2, d1, u1, u2, u3};
        List<Sala> pomieszczenia = new ArrayList<Sala>();
        pomieszczenia.add(sz1);
        pomieszczenia.add(sl1);
        pomieszczenia.add(sl2);
        pomieszczenia.add(pn1);
        pomieszczenia.add(gd1);
        pomieszczenia.add(pg1);
        pg1.otworz(u1.getDostep());
        wypiszDostep(pomieszczenia, pracownicy);

    }

    public static void wypiszDostep(List<Sala> rooms, Pracownik[] persons) {
        for (Sala s : rooms) {
            System.out.println("Dostęp do: " + s.nazwa());
            for (int i = 0; i < persons.length; i++) {
                if (s.sprawdDostep(persons[i].dostep)) {
                    System.out.println("\t" + persons[i].stanowisko);
                }
            }
            System.out.println();
        }
    }
}
