package pl.sda.kurs.z15_30_03_2019.OOP;

public class Person {

    int age;
    int salary;

    String firstName;
    String lastName;
    Gender gender;

    public Person(int age, int salary, String firstName, String lastName, Gender gender) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
