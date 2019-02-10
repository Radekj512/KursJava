package pl.sda.kurs.z1_26_01_2019;

public class Methods {
    public static final double INCH_TO_METER_MULTIPLIER  = 0.0254;
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c;
        printSum(a,b);

        c = returnSum(a,b);
        System.out.println(c);

        test(a,b);
        System.out.println(a+" cali to " + inchesToMeters(a) + " metrow");

    }

    public static void printSum(int a, int b){
        System.out.println("Efetk dzialania metody printSum(): "+(a+b));
    }
    public static int returnSum(int a, int b){
        return a+b;
    }
    public static void test(int a, int b){
        System.out.println("Suma argumentow: " + (a+b));
        System.out.println("Roznica argumentow: " + (a-b));
        System.out.println("Iloczyn argumentow: " + (a*b));
    }
    public static double inchesToMeters(double a){
        return (a*INCH_TO_METER_MULTIPLIER);
    }

}
