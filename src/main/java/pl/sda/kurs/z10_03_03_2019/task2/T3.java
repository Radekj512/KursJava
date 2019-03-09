package pl.sda.kurs.z10_03_03_2019.task2;

public class T3 {

    static int fib(int n) {
        if (n < 3)
            return 1;

        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fib(1));
    }
}
