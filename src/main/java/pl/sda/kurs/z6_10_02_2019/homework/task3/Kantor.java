package pl.sda.kurs.z6_10_02_2019.homework.task3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Kantor {
    private List<Waluta> listaWalut = new ArrayList<>();

    public void pobierzKursyWalut() throws IOException, ParserConfigurationException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new URL("http://api.nbp.pl/api/exchangerates/tables/C?format=xml").openStream());
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("Rate");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                listaWalut.add(new Waluta(element.getElementsByTagName("Currency").item(0).getTextContent(),
                        element.getElementsByTagName("Code").item(0).getTextContent(),
                        element.getElementsByTagName("Bid").item(0).getTextContent(),
                        element.getElementsByTagName("Ask").item(0).getTextContent()));
            }
        }
    }

    public void wypiszWaluty() {
        System.out.println("Waluta:\tSkrót:\tKurs zakupu:\tKurs sprzedaży:");
        System.out.println("----------------------------------------------");
        for (Waluta w : listaWalut) {
            System.out.println(w);

        }
    }

    public void znajdzIWypiszWalute(String... skrot) {
        boolean czyZnaleziono = false;
        System.out.println("Waluta:\tSkrót:\tKurs zakupu:\tKurs sprzedaży:");
        System.out.println("----------------------------------------------");
        for (Waluta lista : listaWalut) {
            for (String s : skrot) {
                if (s.toUpperCase().equals(lista.getSkrot())) {
                    System.out.println(lista);
                    czyZnaleziono = true;
                }
            }
        }
        if (!czyZnaleziono) {
            System.out.println("Nie znaleziono podanej waluty!");
        }
    }

    public boolean znajdzWalute(String skrot) {
        for (Waluta lista : listaWalut) {
            if (skrot.toUpperCase().equals(lista.getSkrot())) {
                return true;
            }
        }
        return false;
    }

    public void kupWalute(String skrot, int ile) {
        if (znajdzWalute(skrot.toUpperCase())) {
            System.out.println("Kupiłes/aś " + ile + " " + skrot.toUpperCase() + " za " + BigDecimal.valueOf(ile).multiply(dajKursSprzedazy(skrot.toUpperCase())));
        } else {
            System.out.println("Nie znaleziono podajen waluty!");
        }
    }

    public void sprzdajWalute(String skrot, int ile) {
        if (znajdzWalute(skrot.toUpperCase())) {
            System.out.println("Sprzedałeś/aś " + ile + " " + skrot.toUpperCase() + " za " + BigDecimal.valueOf(ile).multiply(dajKursKupna(skrot.toUpperCase())));
        } else {
            System.out.println("Nie znaleziono podajen waluty!");
        }
    }

    public void wymienWaluty(String skrotWalutyZKtorejWymieniamy, String skrotWalutyNaKtoraWymieniamy, int ile) {
        if (znajdzWalute(skrotWalutyZKtorejWymieniamy.toUpperCase()) && znajdzWalute(skrotWalutyNaKtoraWymieniamy.toUpperCase())) {
            BigDecimal bIle = BigDecimal.valueOf(ile);
            BigDecimal tmp = dajKursSprzedazy(skrotWalutyZKtorejWymieniamy.toUpperCase()).multiply(bIle).divide(dajKursKupna(skrotWalutyNaKtoraWymieniamy.toUpperCase()), 1);

            System.out.println("Wymieniłeś/aś " + ile + " " + skrotWalutyZKtorejWymieniamy.toUpperCase() + " na " + tmp + " " + skrotWalutyNaKtoraWymieniamy.toUpperCase());
        }
    }

    public BigDecimal dajKursSprzedazy(String skrot) {
        for (Waluta lista : listaWalut) {
            if (skrot.toUpperCase().equals(lista.getSkrot())) {
                return lista.getKursSprzedazy();
            }
        }
        return BigDecimal.valueOf(0);
    }

    public BigDecimal dajKursKupna(String skrot) {
        for (Waluta lista : listaWalut) {
            if (skrot.toUpperCase().equals(lista.getSkrot())) {
                return lista.getKursKupna();
            }
        }
        return BigDecimal.valueOf(0);
    }
}