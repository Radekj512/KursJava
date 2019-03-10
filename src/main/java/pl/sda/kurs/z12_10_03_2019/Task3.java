package pl.sda.kurs.z12_10_03_2019;

import pl.sda.kurs.z12_10_03_2019.Task1.Stos;

public class Task3 {
    private static Stos<Character> stos = new Stos<>();

    public static boolean checkBrackets(String str) {
        if (str.isEmpty()) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stos.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                if (stos.isEmpty())
                    return false;

                char last = stos.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stos.pop();
                else
                    return false;
            }
        }
        return stos.isEmpty();
    }

    @Override
    public String toString() {
        return stos.toString();
    }


    public static void main(String[] args) {

        System.out.println(checkBrackets("[{()]"));
    }
}
