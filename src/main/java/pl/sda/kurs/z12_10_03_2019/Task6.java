package pl.sda.kurs.z12_10_03_2019;

import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        Kolejka<Character> k = new Kolejka<>();
        String rownanie = "1+1+1+1+1+1+1";

        for (int i = 0; i < rownanie.length(); i++) {
            k.push(rownanie.charAt(i));
        }
        int wynik = 0;
        Kolejka<Integer> numbers = new Kolejka<>();
        Kolejka<Character> digits = new Kolejka<>();

        while (k.size() > 0) {
            if (Character.isDigit(k.peek())) {
                numbers.push(Character.getNumericValue(k.peek()));
                k.pop();
            } else {
                digits.push(k.peek());
                k.pop();
            }
        }

        wynik = numbers.peek();
        numbers.pop();

        while (numbers.size() > 0) {
            if (!digits.isEmpty()) {
                switch (digits.peek()) {
                    case '+':
                        wynik += numbers.peek();
                        numbers.pop();
                        break;
                    case '-':
                        wynik -= numbers.peek();
                        numbers.pop();
                        break;
                    case '*':
                        wynik *= numbers.peek();
                        numbers.pop();
                        break;
                    case '/':
                        wynik /= numbers.peek();
                        numbers.pop();
                        break;
                }
            }
            digits.pop();
        }
        System.out.println(wynik);

    }
}
