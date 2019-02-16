package pl.sda.kurs.z6_10_02_2019.homework.task1;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        KalendarzAlergikow kal = new KalendarzAlergikow();
        kal.add("Trawa", new ZakresDat(LocalDate.now().withMonth(4), LocalDate.now().withMonth(9)));
        kal.add("Brzoza", new ZakresDat(LocalDate.now().withMonth(3), LocalDate.now().withMonth(5)));
        kal.add("Leszczyna", new ZakresDat(LocalDate.now().withMonth(1), LocalDate.now().withMonth(4)));
        kal.wypiszAlergeny(3);



    }
}
