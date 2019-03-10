package pl.sda.kurs.z12_10_03_2019;

import pl.sda.kurs.z12_10_03_2019.Task1.Stos;

import java.util.Arrays;

public class Task4 {
    private static Stos<Integer> stos = new Stos<>();

    public static void biggestToEnd() {
        int indexOfBiggest = 0;
        for (int i = 0; i < stos.size(); i++) {
            if(stos.peek(i) > stos.peek(indexOfBiggest)){
                indexOfBiggest = i;
            }
        }
        stos.push(stos.peek(indexOfBiggest));
        stos.pop(indexOfBiggest);
    }

    public static void main(String[] args) {
        stos.push(3);
        stos.push(1);
        stos.push(8);
        stos.push(2);
        stos.push(7);
        System.out.println(stos);
        biggestToEnd();
        System.out.println(stos);
    }

}
