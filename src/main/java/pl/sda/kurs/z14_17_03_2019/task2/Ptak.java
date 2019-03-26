package pl.sda.kurs.z14_17_03_2019.task2;

public class Ptak implements Zwierze {
    public final static String preferowanieJedzenie = "DLA_PTAKOW";
    @Override
    public void dajGlos() {
        System.out.println("ćwir");
    }
    @Override
    public String getPrefferedFood() {
        return preferowanieJedzenie;
    }
}
