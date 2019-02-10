package pl.sda.kurs.z6_10_02_2019.exceptions.zadania.zad1_wyjatki;

public class Calculator {
    public double divide(double a, double b) throws DivideByZeroException {
        double res;
        if (b==0){
            throw new DivideByZeroException("Cannot divide by zero");
        }
        return a/b;
    }

}
