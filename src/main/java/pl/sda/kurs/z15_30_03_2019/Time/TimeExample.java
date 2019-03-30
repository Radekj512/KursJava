package pl.sda.kurs.z15_30_03_2019.Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class TimeExample {

    public static void main(String[] args) {
        //do java7 :
        // uzywac tylko JODATIME
        Date date = new Date();
        org.joda.time.LocalDate jodaDate = new org.joda.time.LocalDate();


        // od Java 8:
        LocalTime localTime = LocalTime.now();
        LocalDate localDate  = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

    }
}
