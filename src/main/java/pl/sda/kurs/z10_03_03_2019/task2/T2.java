package pl.sda.kurs.z10_03_03_2019.task2;

public class T2 {

    static int silnia(int a) {
        if (a < 2)
            return 1;

        return a * silnia(a - 1);
    }

    public static void main(String[] args) {
        System.out.println(silnia(5));
    }
}
