package pl.sda.kurs.z14_17_03_2019.task2;

public class Pies implements Zwierze {
    public final static String preferowanieJedzenie = "PSIE";
    @Override
    public void dajGlos() {
        System.out.println("Hau");
    }
    @Override
    public String getPrefferedFood() {
        return preferowanieJedzenie;
    }
}
