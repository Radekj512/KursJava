package pl.sda.kurs.z11_09_03_2019.task1;

import java.util.*;

public class T1 {
    public static Set<Integer> lotto(){
        Set<Integer> wynik = new HashSet<>();
        Random gen = new Random();
        while(wynik.size() != 20){
            wynik.add(gen.nextInt(48)+1);
        }
        return wynik;
    }
    public static ArrayList<Integer> lootoLista(){
        ArrayList<Integer> wynik = new ArrayList<>();
        Random gen = new Random();
        while(wynik.size() != 20){
            int el = gen.nextInt(48)+1;
            for(int i = 0; i<wynik.size(); i++){
                if(el == wynik.get(i)){
                    continue;
                }
            }
            wynik.add(el);
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println(lotto());
        System.out.println(lootoLista());
    }
}
