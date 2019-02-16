package pl.sda.zajecia4.homework.task1;

public class Calculator {

    public static int addTwoNumbers(int a, int b) {
        return (a + b);
    }

    public static int substractTwoNumbers(int a, int b) {
        return (a - b);
    }

    public static int multiplyTwoNumbers(int a, int b) {
        return (a * b);
    }

    public static Double divideTwoNumbers(double a, double b) {
        if (b != 0) {
            return (a / b);
        }
        return null;
    }

    public static int modulo(int a, int b) {
        return (a % b);
    }

    public static int biggestFromArray(int[] arr) {
        int max = arr[0];
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int sumOfWholeArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double averageOfArray(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return (sum / arr.length);
    }

    public static int powerOfTwoNumbers(int a, int b) {
        return (int)(Math.pow(a,b));
    }
}
