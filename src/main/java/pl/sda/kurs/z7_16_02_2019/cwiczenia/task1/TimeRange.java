package pl.sda.kurs.z7_16_02_2019.cwiczenia.task1;

import java.time.LocalTime;

public class TimeRange {
    private LocalTime openFrom;
    private LocalTime openTo;

    public TimeRange(LocalTime openFrom, LocalTime openTo) {
        this.openFrom = openFrom;
        this.openTo = openTo;
    }

    public LocalTime getOpenFrom() {
        return openFrom;
    }

    public LocalTime getOpenTo() {
        return openTo;
    }
}
