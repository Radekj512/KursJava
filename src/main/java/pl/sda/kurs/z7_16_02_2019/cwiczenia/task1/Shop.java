package pl.sda.kurs.z7_16_02_2019.cwiczenia.task1;


import java.time.DayOfWeek;
import java.time.LocalTime;

import java.util.Map;

public class Shop extends Building implements OpeningHours {
    private Map<DayOfWeek, TimeRange> openingHours;

    public Shop(Map<DayOfWeek, TimeRange> openingHours) {
        super(1);
        this.openingHours = openingHours;
    }

    @Override
    public BuildingType getBuildingType() {
        return BuildingType.CIVIL;
    }

    @Override
    public LocalTime openFrom(DayOfWeek dayOfWeek) throws MissingDayOfWeekException {
        TimeRange timeRange = openingHours.get(dayOfWeek);
        if (timeRange == null) {
            throw new MissingDayOfWeekException(dayOfWeek);
        } else {
            return timeRange.getOpenFrom();
        }
    }

    @Override
    public LocalTime openTo(DayOfWeek dayOfWeek) throws MissingDayOfWeekException {
        TimeRange timeRange = openingHours.get(dayOfWeek);
        if (timeRange == null) {
            throw new MissingDayOfWeekException(dayOfWeek);
        } else {
            return timeRange.getOpenTo();
        }
    }

    @Override
    public boolean isOpen(DayOfWeek dayOfWeek, LocalTime localTime) {
        if (openingHours.containsKey(dayOfWeek)) {
            TimeRange timeRange = openingHours.get(dayOfWeek);
            if (localTime.isAfter(timeRange.getOpenFrom().minusSeconds(1)) && localTime.isBefore(timeRange.getOpenTo().plusSeconds(1))) {
                return true;
            }
        }
        return false;
    }
}
