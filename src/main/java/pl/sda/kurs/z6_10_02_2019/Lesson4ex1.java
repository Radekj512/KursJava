package pl.sda.kurs.z6_10_02_2019;

public class Lesson4ex1 {
    public static void main(String[] args) {
        for (int i = 20; i <= 123; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = -40; i <= 15; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = 100; i > 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) System.out.print(i + ", ");
        }
        System.out.println("\n");
        for (int i = 0; i <= 100; i++) {
            if (modulo2(i) || modulo3(i) || modulo5(i)) {
                System.out.print(i + ", podzielne przez: ");
                if (modulo2(i)) {
                    System.out.print("2");
                }

                if (modulo3(i)) {
                    if (modulo2(i)) System.out.print(", ");
                    System.out.print("3");
                }

                if (modulo5(i)) {
                    if (dividibleByMoreThanOne(i)) System.out.print(", ");
                    System.out.print("5");
                }
                System.out.println();
            } else {
                System.out.println(i);
            }
        }

    }

    public static boolean modulo2(int number) {
        return number % 2 == 0;
    }

    public static boolean modulo3(int number) {
        return number % 3 == 0;
    }

    public static boolean modulo5(int number) {
        return number % 5 == 0;
    }

    public static boolean dividibleByMoreThanOne(int number) {
        int counter = 0;
        if (modulo2(number)) counter++;
        if (modulo3(number)) counter++;
        if (modulo5(number)) counter++;
        return counter > 1;
    }
}
