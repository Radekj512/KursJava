package pl.sda.kurs.z1_26_01_2019;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        System.out.println("Hello World");
        System.out.println(df.format(date));
        //==============================================//
        System.out.println("\"Adam\"");
        System.out.println("Adam\nNowak");
        //literały: (wypisywanie roznych typow zmiennych)
        System.out.println(13);
        System.out.println('a');
        System.out.println("napis");
        System.out.println(true);
        //=========================================//
        String text = "Tekst w cudzyslowiu";
        String newText = new String("Inny tekst");
        int textLenght = text.length();
        System.out.println(text.length()); // pierwszy spsob
        System.out.println(textLenght); // drugi sposob
        String textWithWhiteSpaces = " Adam ";
        System.out.println(textWithWhiteSpaces.trim());
        //=======================================//
        System.out.println("a " + (2 + 3));
        System.out.println("b " + (2 - 4));
        System.out.println("c " + (5 / 2));
        System.out.println("d " + (5.0 / 2));
        System.out.println("e " + (5 / 2.0));
        System.out.println("f " + (5.0 / 2.0));
        System.out.println("g " + (100L - 10));
        System.out.println("h " + (2f - 3));
        System.out.println("i " + (5f / 2));
        System.out.println("j " + (5d / 2));
        System.out.println("k " + ('A' + 2));
        System.out.println("l " + ('a' + 2));
        System.out.println("m " + ("a" + "b"));
        System.out.println("n " + ("a" + 'b'));
        System.out.println("o " + ('a' + 'b'));
        System.out.println("p " + ("a" + 'b' + 3));
        System.out.println("q " + ('b' + 3 + "a"));
        System.out.println("r " + (9 % 4));
        System.out.println("s " + (-5 + 8 * 6));
        System.out.println("t " + ("" + 5 + 8 + 6));
        System.out.println("u " + ((55 + 9) % 9));
        System.out.println("w " + (20 + (-3) * 5 / 8));
        System.out.println("x " + (5 + 15 / 3 * 2 - 8 % 3));
        //==============================//

    }
}
