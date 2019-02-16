package pl.sda.kurs.z7_16_02_2019.cwiczenia.task1;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<DayOfWeek, TimeRange> godzinyOtwarcia = new HashMap<>();

        Shop sklep = new Shop(godzinyOtwarcia);

        System.out.println(sklep.getBuildingType());
        boolean isOpen = sklep.isOpen(DayOfWeek.MONDAY, LocalTime.of(12,0));
        System.out.println("Czy sklep jest otwarty w poniedzialek o 12.00?  " + isOpen);

        try {
            LocalTime localTime = sklep.openFrom(DayOfWeek.FRIDAY);
            System.out.println("W piatek sklep jest otwary od: " + localTime);
        } catch (MissingDayOfWeekException e) {
            System.out.println(e.getMessage());
        }

    }
}
