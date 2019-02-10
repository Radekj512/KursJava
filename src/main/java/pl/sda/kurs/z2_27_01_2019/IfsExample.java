package pl.sda.kurs.z2_27_01_2019;

import java.util.Scanner;

public class IfsExample {
    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(dividableByThreeAdnFive(14));
        System.out.println(introduce("Jan", 20, true));
        System.out.println(threeParamsSum(1, 2, 4));
        System.out.println(switchCalculator(2, 4, 'a'));
        System.out.println(isEvenTernary(3));
        System.out.println(introduceTernary("Michal", 30, true));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) return true;
        return false;
    }

    public static boolean dividableByThreeAdnFive(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return true;
        return false;
    }

    public static String introduce(String name, int age, boolean isMale) {
        String resultMale = "Cześć! Nazywam się " + name + " mam " + age + " lat i jestem meżczyzną";
        String resultFemale = "Cześć! Nazywam się " + name + " mam " + age + " lat i jestem kobietą";
        if (name.length() > 1 && age > 0 && isMale)
            return resultMale;

        return resultFemale;
    }

    public static boolean threeParamsSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else if (a + c == b) {
            return true;
        } else if (b + c == a) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean answerCell(boolean isMama, boolean isMorning, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else if (!isMama && isMorning) {
            return false;
        } else {
            return true;
        }
    }

    public static Integer switchCalculator(int a, int b, char sign) {
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b != 0) {
                    return a / b;
                }
                System.out.println("Nie mozna dzielic przez zero!");
                return null;

            default:
                System.out.println("Nie wybrales znaku");
                return null;

        }
    }

    public static boolean isEvenTernary(int a) {
        return a % 2 == 0 ? true : false;
    }

    public static String introduceTernary(String name, int age, boolean isMale) {
        String gender;
        gender = isMale ? "meżczyzna" : "kobietą";
        return "Cześć. Nazywam się " + name + " mam " + age + " lat i jestem " + gender + ".";
    }
}
