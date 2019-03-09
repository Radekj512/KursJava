package pl.sda.kurs.z11_09_03_2019.task1.T6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class T6 {
    public static void main(String[] args) throws IOException {

        Map<String, String> panstwaMiasta = new HashMap<>();
        Path path = Paths.get("src", "main", "resources", "stolice.txt");
        Stream<String> lines = Files.lines(path);
        List<PanstwoMiasto> lista;
        Scanner s = new Scanner(System.in);
        String panstwo;

        lista = lines.map(line -> line.split(":"))
                .map(arr -> new PanstwoMiasto(arr[0], arr[1]))
                .collect(Collectors.toList());

        for (int i = 0; i < lista.size(); i++) {
            panstwaMiasta.put(lista.get(i).getPanstwo(), lista.get(i).getMiasto());
        }
       /* System.out.println("Podaj panstwo: ");
        panstwo = s.nextLine();
        panstwo = panstwo.substring(0,1).toUpperCase() + panstwo.substring(1).toLowerCase();
        if (panstwaMiasta.get(panstwo) == null){
            System.out.println("Podanego panstwa nie ma w bazie");
        }else{
            System.out.println(panstwaMiasta.get(panstwo));
        }*/
        System.out.print("Chcesz zgadywac Panstwa(1) czy Stolice(2)?: ");
        int wybor = s.nextInt();
        int wynik = 0;
        if (wybor == 1) {
            for (Map.Entry<String, String> kv : panstwaMiasta.entrySet()) {
                System.out.print("Stolica jakiego Panstwa jest " + kv.getValue() + ": ");
                String odp = s.next();
                odp = odp.substring(0,1).toUpperCase() + odp.substring(1).toLowerCase();
                if (odp.equals(kv.getKey())) {
                    wynik++;
                }
            }
            System.out.println("Twoj wynik to: " + wynik);
        } else if (wybor == 2) {
            for (Map.Entry<String, String> kv : panstwaMiasta.entrySet()) {
                System.out.print("Co jest stolica " + kv.getKey() + ": ");
                String odp = s.next();
                odp = odp.substring(0,1).toUpperCase() + odp.substring(1).toLowerCase();
                if (odp.equals(kv.getValue())) {
                    wynik++;
                }
            }
            System.out.println("Twoj wynik to: " + wynik);
        } else {
            System.out.println("Wprowadzono zla liczbe");
        }
    }

    public static void dodaj(String panstwo, String miasto) throws IOException {
        Path path = Paths.get("src", "main", "resources", "stolice.txt");
        List<String> lista = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(panstwo).append(":").append(miasto);
        lista.add(sb.toString());
        Files.write(path, lista, StandardOpenOption.APPEND);
    }
}
