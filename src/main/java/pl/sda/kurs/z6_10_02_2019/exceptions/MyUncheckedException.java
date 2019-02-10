package pl.sda.kurs.z6_10_02_2019.exceptions;

public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }

    public MyUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
