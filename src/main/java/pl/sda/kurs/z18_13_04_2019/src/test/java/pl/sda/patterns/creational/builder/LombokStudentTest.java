package pl.sda.patterns.creational.builder;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class LombokStudentTest {

    @Test
    public void test(){
        LombokStudent.LombokStudentBuilder builder = LombokStudent.builder();
        LombokStudent student = builder.birthDayOfWeek(DayOfWeek.THURSDAY)
                .birthMonth(Month.APRIL)
                .birthYear(Year.now())
                .firstName("Janek")
                .lastName("Kowalski")
                .build();
        System.out.println(student);

        Student.StudentBuilder studentBuilder = Student.builder();
        Student s2 = studentBuilder.firstName("Janek")
                .latsName("Nowak")
                .pesel("123456").build();
        System.out.println(s2);
    }

}