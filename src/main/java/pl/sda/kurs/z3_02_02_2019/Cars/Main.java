package pl.sda.kurs.z3_02_02_2019.Cars;

public class Main {
    public static void main(String[] args) {
        Mercedes pierwszy = new Mercedes(2.5f,"Black", true);
        pierwszy.ride();
        pierwszy.engineStart();
        pierwszy.ride();
        System.out.println(pierwszy.isSportVersion()+"\n\n");

        Volkswagen vw = new Volkswagen( 4, "White");
        vw.engineStart();
        vw.ride();

        Car syrenka = new Car(3.0f,4,"Yellow");

    }
}
