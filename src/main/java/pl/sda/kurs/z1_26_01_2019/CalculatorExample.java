package pl.sda.kurs.z1_26_01_2019;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        int firstValue;
        int secondValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe: ");
        firstValue = scanner.nextInt();
        System.out.print("Podaj druga liczbe: ");
        secondValue = scanner.nextInt();

        System.out.println("Wynik dodawania liczb to: " + (firstValue+secondValue));
        System.out.println("Wynik odejmowania liczb to: " + (firstValue-secondValue));
        System.out.println("Wynik mnozenia liczb to: " + (firstValue*secondValue));
        System.out.println("Wynik dzielenia liczb to: " + (firstValue/secondValue));
        System.out.println("Wartosc bezwzgledna z odejmowania: " + Math.abs(firstValue-secondValue));
        System.out.println("Wartosc maksymalna: " + Math.max(firstValue,secondValue));
        System.out.println("Pierwsza^drugiej: " + Math.pow(firstValue,secondValue));


    }
}
