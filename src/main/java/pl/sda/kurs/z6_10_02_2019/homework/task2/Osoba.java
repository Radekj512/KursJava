package pl.sda.kurs.z6_10_02_2019.homework.task2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie) &&
                Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    public int hashCode() {

        return Objects.hash(imie, nazwisko, dataUrodzenia);
    }

    @Override
    public String toString() {
        return ""+imie+"\t"+nazwisko+"\t"+dataUrodzenia;
    }
}
