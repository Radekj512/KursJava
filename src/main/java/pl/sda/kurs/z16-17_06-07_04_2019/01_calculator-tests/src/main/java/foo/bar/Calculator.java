package foo.bar;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) throws IllegalArgumentException {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new IllegalArgumentException("b nie moze byc zerem");
        }
    }

    public double power(int a, int b) {
        double pow = 1;
        double doubleA = (double)a;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                pow = pow * a;
            }
        }else{
            for (int i = b; i < 0;i++){
                pow = pow * (1/doubleA);

            }
        }
        return pow;
    }
}
