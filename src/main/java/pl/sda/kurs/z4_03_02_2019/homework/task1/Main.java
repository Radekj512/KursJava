package pl.sda.zajecia4.homework.task1;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int[] tab1 = {1, 2, 3, 4, 5};
        double[] tab2 = {1.0, 2.1, 3.2, 4.3, 5, 4};
        System.out.println("Suma: " + Calculator.addTwoNumbers(a, b));
        System.out.println("Różnica: " + Calculator.substractTwoNumbers(a, b));
        System.out.println("Mnożenie: " + Calculator.multiplyTwoNumbers(a, b));
        System.out.println("Dzielenie: " + Calculator.divideTwoNumbers(a, b));
        System.out.println("Reszta z dzielenia: " + Calculator.modulo(a, b));
        System.out.println("Najwieksza z tablicy: " + Calculator.biggestFromArray(tab1));
        System.out.println("Suma tablicy: " + Calculator.sumOfWholeArray(tab1));
        System.out.println("Srednia tablicy zmniennoprzecinkowej: " + Calculator.averageOfArray(tab2));
        System.out.println("Potęga: " + Calculator.powerOfTwoNumbers(a, b));
    }
}
