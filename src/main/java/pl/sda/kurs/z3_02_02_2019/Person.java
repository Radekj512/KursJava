package pl.sda.kurs.z3_02_02_2019;

public class Person {
    private String firstName = "Gal";
    private String surname = "Anonim";
    private int age = 0;
    private char gender = ' ';

    public Person() {
    }

    public Person(String firstName, String surname, int age, char gender) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'K') {
            this.gender = gender;
        }
    }

    public String toString() {
        return (this.firstName + " " + this.surname + " " + this.age);
    }
}
