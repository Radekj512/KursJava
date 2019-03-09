package pl.sda.kurs.z11_09_03_2019.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class T4 {
    private int pole;

    public T4() {
        Random g = new Random();
        this.pole = g.nextInt(20)+1;
    }

    @Override
    public String toString() {
        return  "" + pole + ", ";
    }

    public static void main(String[] args) {
        T4[] tabA = {new T4(),new T4(),new T4(),new T4(),new T4() };
        List<T4> lista = new ArrayList<>();
        for (T4 element: tabA){
            lista.add(element);
        }
        List<T4> sub = lista.subList(1,4);
        System.out.println(lista);
        System.out.println(sub);
        lista.removeAll(sub);
        System.out.println(lista);
    }
}
