package pl.sda.patterns.creational.builder;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

//TODO implement builder instead of using constructor here
public class Student {
    //Required Parameters
    private String firstName;
    private String lastName;
    private String pesel;
    private Year birthYear;

    //Optional Parameters
    private Month birthMonth;
    private DayOfWeek birthDayOfWeek;
    private Boolean scholarship;

    public Student(String firstName,
                   String lastName,
                   String pesel,
                   Year birthYear,
                   Month birthMonth,
                   DayOfWeek birthDayOfWeek,
                   Boolean scholarship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDayOfWeek = birthDayOfWeek;
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", birthYear=" + birthYear +
                ", birthMonth=" + birthMonth +
                ", birthDayOfWeek=" + birthDayOfWeek +
                ", scholarship=" + scholarship +
                '}';
    }

    public Student() {
    }

    public static class StudentBuilder{
        private String firstName;
        private String lastName;
        private String pesel;
        private Year birthYear;

        //Optional Parameters
        private Month birthMonth;
        private DayOfWeek birthDayOfWeek;
        private Boolean scholarship;

        public StudentBuilder firstName(String name){
            this.firstName = name;
            return this;
        }
        public StudentBuilder latsName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public StudentBuilder pesel(String pesel){
            this.pesel = pesel;
            return this;
        }
        public Student build(){
            return new Student(firstName, lastName, pesel, birthYear, birthMonth, birthDayOfWeek, scholarship);
        }
    }
    public static StudentBuilder builder(){
        return new StudentBuilder();
    }
}