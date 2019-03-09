package pl.sda.kurs.z11_09_03_2019.task1;

import java.util.*;

import static java.util.Comparator.*;

public class Kolo implements Comparable {
    private double promien;

    public Kolo() {
        Random g = new Random();
        this.promien = g.nextDouble();
    }

    public double getPromien() {
        return promien;
    }


    public static double getMax(List<Kolo> a) {
        double max = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getPromien() > max)
                max = a.get(i).getPromien();
        }
        return max;
    }

    public static double getMin(List<Kolo> a) {
        double min = 1;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getPromien() < min)
                min = a.get(i).getPromien();
        }
        return min;
    }

    public static double srednia(List<Kolo> a) {
        double srednia = 0;
        for (int i = 0; i < a.size(); i++) {
            srednia += a.get(i).getPromien();
        }
        return srednia / a.size();
    }

    public static double sredniaStream(List<Kolo> a) {
        return (a.stream()
                .map(x -> x.getPromien())
                .reduce((aa, b) -> (aa + b))
                .get())/a.size();
    }


    public static void main(String[] args) {
        List<Kolo> lista = new ArrayList<>();
        int i = 0;
        do {
            lista.add(new Kolo());

        } while (lista.get(i++).getPromien() > 0.01);

        System.out.println("lista elementow: ");
        for (Kolo e : lista) {
            System.out.println(e.getPromien());
        }
        System.out.println("Najwiekszy element: ");
        System.out.println(getMax(lista));
        System.out.println("Najmniejszy element: ");
        System.out.println(getMin(lista));
        System.out.println("Srednia: ");
        System.out.println(srednia(lista));


        Collections.sort(lista);
        System.out.println("Posortowana");
        for (Kolo e : lista) {
            System.out.println(e.getPromien());
        }
    }


    public int compareTo(Object o) {
        if (!(o instanceof Kolo)) {
            throw new IllegalArgumentException();
        } else {
            if ((((Kolo) o).getPromien() > this.getPromien())) {
                return -1;
            }
            if (((Kolo) o).getPromien() == this.getPromien()) {
                return 0;
            }
        }
        return 1;
    }
}
