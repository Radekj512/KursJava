package pl.sda.kurs.z6_10_02_2019.exceptions;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
