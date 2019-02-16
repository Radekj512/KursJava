package pl.sda.zajecia4.homework.task2;

public abstract class Pracownik {
    int dostep;
    String stanowisko;

    public Pracownik(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getDostep() {
        return dostep;
    }
    /*
    Dostep:
    0 - uczen
    1 - Wozny
    2 - Nauczyciel
    3 - Dyrektor
     */
}
