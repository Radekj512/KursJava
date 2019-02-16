package pl.sda.kurs.z7_16_02_2019.cwiczenia.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public interface OpeningHours {
    LocalTime openFrom(DayOfWeek dayOfWeek) throws MissingDayOfWeekException;

    LocalTime openTo(DayOfWeek dayOfWeek) throws MissingDayOfWeekException;

    static DayOfWeek currentDay() {
        return LocalDate.now().getDayOfWeek();
    }

    default boolean isOpen(DayOfWeek dayOfWeek, LocalTime localTime) {
        return false;
    }

}
