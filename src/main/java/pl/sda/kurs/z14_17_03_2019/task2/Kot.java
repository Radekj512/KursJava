package pl.sda.kurs.z14_17_03_2019.task2;

public class Kot implements Zwierze {
    public final static String preferowanieJedzenie = "KOCIE";

    @Override
    public void dajGlos() {
        System.out.println("Miau");
    }

    @Override
    public String getPrefferedFood() {
        return preferowanieJedzenie;
    }
}
