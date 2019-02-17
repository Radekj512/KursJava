package pl.sda.kurs.z8_17_02_2019.lambda_and_stream.Lambdas.task1;

public class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
