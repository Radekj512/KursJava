package pl.sda.kurs.z6_10_02_2019.homework.task2;

import java.util.HashMap;
import java.util.Map;

public class Ubezpieczyciel {
    private Map<Long, Osoba> listaOsob = new HashMap<>();

    public boolean dodajOsobe(Long pesel, Osoba osoba) {
        if (listaOsob.get(pesel) == null) {
            listaOsob.put(pesel, osoba);
            return true;
        }
        return false;
    }

    public Osoba znajdzOsobe(Long pesel) {
        return listaOsob.get(pesel);
    }
    public boolean aktualizujOsobe(Long pesel, Osoba osoba){
        if(listaOsob.get(pesel) != null){
            listaOsob.put(pesel, osoba);
            return true;
        }
        return false;
    }
    public void wypiszOsoby(){
        for (Map.Entry<Long, Osoba> osoba:
        listaOsob.entrySet()){
            System.out.println("PESEL: " + osoba.getKey() + "\t" +  osoba.getValue().getImie()+ "\t"+ osoba.getValue().getNazwisko()+ "\t" + osoba.getValue().getDataUrodzenia());

        }
    }

}
