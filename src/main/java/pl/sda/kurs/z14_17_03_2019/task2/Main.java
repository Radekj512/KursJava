package pl.sda.kurs.z14_17_03_2019.task2;

public class Main {
    public static void main(String[] args) {
        Osoba o = new Osoba("Jan");
        {
            o.listaZwierzat.add(new Kot());
            o.listaZwierzat.add(new Pies());
            o.listaZwierzat.add(new Pies());
            o.listaPotraw.add(new Jedzenie("Kielbasa", "PSIE"));
            o.listaPotraw.add(new Jedzenie("Szynka", "KOCIE"));
            o.listaPotraw.add(new Jedzenie("Psie chrupki", "PSIE"));
            o.listaPotraw.add(new Jedzenie("Kocie chrupki", "KOCIE"));
        } // dodaje zwierzeta i jedzenie dla osoby o

        o.feedAll();

    }


}
