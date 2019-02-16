package pl.sda.kurs.z6_10_02_2019.homework.task3;

import java.math.BigDecimal;

public class Waluta {
    private String nazwa;
    private String skrot;
    private BigDecimal kursKupna;
    private BigDecimal kursSprzedazy;

    public Waluta(String nazwa, String skrot, String kursKupna, String kursSprzedazy) {
        this.nazwa = nazwa;
        this.skrot = skrot;
        this.kursKupna = new BigDecimal(kursKupna);
        this.kursSprzedazy = new BigDecimal(kursSprzedazy);
    }

    @Override
    public String toString() {
        return nazwa + "(" + skrot + ")\t" + kursKupna + "\t" + kursSprzedazy;
    }

    public String getSkrot() {
        return skrot;
    }

    public BigDecimal getKursKupna() {
        return kursKupna;
    }

    public BigDecimal getKursSprzedazy() {
        return kursSprzedazy;
    }
}
