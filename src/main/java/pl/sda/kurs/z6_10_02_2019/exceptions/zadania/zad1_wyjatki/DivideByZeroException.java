package pl.sda.kurs.z6_10_02_2019.exceptions.zadania.zad1_wyjatki;

public class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }

    public DivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
