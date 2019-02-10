package pl.sda.kurs.z6_10_02_2019.exceptions.zadania.zad1_wyjatki;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            System.out.println(calc.divide(2.0, 3.0));
            System.out.println(calc.divide(10, 0));
        } catch (DivideByZeroException e) {
            System.out.println("Wystapil wyjatek programu \"" + e.getMessage() + "\"");
        }finally {
            System.out.println("Wykonane po bloku try");
        }

    }
}
