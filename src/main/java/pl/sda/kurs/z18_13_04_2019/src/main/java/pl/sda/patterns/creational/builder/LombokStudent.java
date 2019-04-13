package pl.sda.patterns.creational.builder;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

public class LombokStudent {
    //Required Parameters
    private String firstName;
    private String lastName;
    private String pesel;
    private Year birthYear;

    //Optional Parameters
    private Month birthMonth;
    private DayOfWeek birthDayOfWeek;
    private Boolean scholarship;
}
