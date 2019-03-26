package pl.sda.kurs.z14_17_03_2019.task2;

public class Ryba implements Zwierze {
    public final static String preferowanieJedzenie = "DLA_RYBEK";
    @Override
    public void dajGlos() {
        System.out.println("Ryba glosu nie ma");
    }
    @Override
    public String getPrefferedFood() {
        return preferowanieJedzenie;
    }
}
