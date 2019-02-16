package pl.sda.kurs.z6_10_02_2019.homework.task3;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Kantor kantor = new Kantor();

        try {
            kantor.pobierzKursyWalut();
            kantor.wypiszWaluty();
            System.out.println("\n");
            kantor.znajdzIWypiszWalute("USD", "jpy", "cad");
            kantor.kupWalute("usd", 100);
            kantor.sprzdajWalute("cad", 100);
            kantor.wymienWaluty("usd", "jpy", 1);
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.out.println("Wystąpił błąd przy pobieraniu listy walut!");
        }
    }
}
