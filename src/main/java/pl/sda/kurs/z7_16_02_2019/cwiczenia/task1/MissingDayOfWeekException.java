package pl.sda.kurs.z7_16_02_2019.cwiczenia.task1;

import java.time.DayOfWeek;

public class MissingDayOfWeekException extends Exception {
    private DayOfWeek missingDayOfWeek;
    public MissingDayOfWeekException(DayOfWeek missing) {
        super("Godziny otwarcia nie maja nastepujacego dnia: " + missing);
        this.missingDayOfWeek = missing;
    }
}
