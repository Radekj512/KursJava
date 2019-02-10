package pl.sda.kurs.z6_10_02_2019.exceptions;

import java.io.IOException;

public class MainExceptions {
    public static void main(String[] args) throws Exception {
        // methodThatThrowsException(3);
//       methodThatThrowsException(3324);
        //methodThatExecutesMethodWithException(3);
        try {
            methodThatExecutesMethodWithException(300);
        } catch (IndexOutOfBoundsException | NullPointerException e) { // kolejnosc catch ma  znaczenie, od szczegolowych do ogolnych // obsluga indexOutOfBounds i NUllPointer w jednym

        } catch (RuntimeException e) {
            e.printStackTrace();
            //obsluzenie lub ignorowanie
        }finally {
            //to sie wykona zawsze niezaleznie czy zostal rzucony wyjetek czy nie
        }

        System.out.println("koniec programu");
    }

    public static void methodThatThrowsException(int number) throws Exception {
        if (number > 100) { // jak sie nie da inczaje tego obsluzyc
            throw new Exception();
            // throw new IOException(); // wyjatek wejscia/ wyjsca
        }
        System.out.println("Koniec metody");
    }

    public static void methodThatExecutesMethodWithException(int i) {
        try {
            methodThatHandlesException(i);
            System.out.println("zwykle instrukcje"); // nie wykona sie jesli wyjagtek zostal wyrzucony
        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println("Normalne dzialanie metody");
    }

    public static void methodThatHandlesException(int i) throws IOException {
        if (i > 100) {
            throw new IOException();
        }
        System.out.println("metoda wykonana");
    }

    public static void methodThatThrowsUncheckedExceptions() {
        throw new RuntimeException();
        // throw new NullPointerException();
        //throw new IndexOutOfBoundsException();
    }
}
