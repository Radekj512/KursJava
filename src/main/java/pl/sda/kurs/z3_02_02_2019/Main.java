package pl.sda.kurs.z3_02_02_2019;

public class Main {
    public static void main(String[] args) {
        Person janKowalski = new Person();
        Person radekJanus = new Person("Radek", "Janus", 26, 'M');

        System.out.println(janKowalski.getFirstName() + " " + janKowalski.getSurname() + " " + janKowalski.getAge());
        System.out.println(janKowalski.toString());
        System.out.println(radekJanus.toString());
        janKowalski.setAge(10);
        System.out.println(janKowalski.toString());

        Cake applePie = new Cake(4f, 2f, 12);
        System.out.println(applePie.isTasty());

        Cake tattyApplePie = new Cake(2f, 4f, 12);
        System.out.println(tattyApplePie.isTasty());

        Cake superTastyPie = new Cake(2, 4, 6);
        System.out.println(superTastyPie.isTasty());

        Dog reksio = new Dog("Reksio", "kundel", 'M');
        System.out.println(reksio.toString());
        System.out.println(reksio);

    }
}
