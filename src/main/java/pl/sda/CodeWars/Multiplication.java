package pl.sda.CodeWars;
//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
public class Multiplication {
    public static int simpleMultiplication(int n) {
        return (n%2 == 0)? n*8: n*9;
    }

    public static void main(String[] args) {
        System.out.println(simpleMultiplication(1));
        System.out.println(simpleMultiplication(3));
        System.out.println(simpleMultiplication(21));
        System.out.println(simpleMultiplication(23));
    }
}
