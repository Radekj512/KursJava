package pl.sda.kurs.z14_17_03_2019.task2;

public class Jedzenie {
    private String nazwa;
    private String rodzaj;

    public Jedzenie(String nazwa, String rodzaj) {
        this.nazwa = nazwa;
        this.rodzaj = rodzaj;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getRodzaj() {
        return rodzaj;
    }
}
