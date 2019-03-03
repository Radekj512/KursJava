package pl.sda.kurs.z10_03_03_2019.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Methods {
    public double szescian(double a) {
        return Math.pow(a, 3);
    }

    public void printStarLine(int length) {
        for (int i = 0; i < length; i++)
            System.out.print("*");
        System.out.println();
    }

    public void printOddNumbers(int limit) {
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void fizzBuzz() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                sb.append(i);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public void printRectangle(int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public void task8(int limit) {
        int sum = 0;
        int count = 0;
        while (sum < limit) {
            sum = sum + count;
            count++;
        }
        System.out.println("Suma: " + sum + "\nIlosc dodanych liczb: " + count);
    }

    public void task9() {
        int[] arr = new int[100];
        Random gen = new Random();
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(21);
        }
        for (int i = 0; i < arr.length; i++) {
            //intMap.put(arr[i], intMap.get(arr[i] + 1));
            if (intMap.containsKey(arr[i])) {
                intMap.put(arr[i], intMap.get(arr[i]) + 1);
            } else {
                intMap.putIfAbsent(arr[i], 1);
            }
        }
        for (Map.Entry kv : intMap.entrySet()) {
            System.out.println("Liczba: " + kv.getKey() + "\nIlosc wystapien: " + kv.getValue());
        }
    }

    public void task10() {
        Random g = new Random();
        int tmp = 10 + g.nextInt(1000);
        int wynik = 0;
        System.out.println("Wylosoewana liczba: " + tmp);
        while (tmp != 0) {
            wynik += tmp % 10;
            tmp /= 10;
        }
        System.out.println("Suma jej cyfr to: " + wynik);
    }

}
