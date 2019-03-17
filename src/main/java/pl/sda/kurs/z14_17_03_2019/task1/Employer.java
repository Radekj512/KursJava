package pl.sda.kurs.z14_17_03_2019.task1;

public class Employer extends Person {

    public Employer(String name, String lastName) {
        super(name, lastName);
    }

    public void paySalary(){
        this.addAmmountOfMoney(10);
    }
}
