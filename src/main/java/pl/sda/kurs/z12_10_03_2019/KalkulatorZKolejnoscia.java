package pl.sda.kurs.z12_10_03_2019;

import java.util.ArrayList;
import java.util.List;

public class KalkulatorZKolejnoscia {
    public static void main(String[] args) {
        String rownanie = "2+2*2";

        List<Integer> cyfry = new ArrayList<>();
        List<Character> znaki = new ArrayList<>();

        for (int i = 0; i < rownanie.length(); i++){
            if (Character.isDigit(rownanie.charAt(i))){
                cyfry.add(Character.getNumericValue(rownanie.charAt(i)));
            }else{
                znaki.add(rownanie.charAt(i));
            }
        }
        int wynik =0;
        for(char c: znaki){
            if(c == '*'){
                wynik += cyfry.get(znaki.indexOf(c))*cyfry.get(znaki.indexOf(c)+1);

            }
        }
        System.out.println(cyfry);
        System.out.println(znaki);
        System.out.println(wynik);

    }
}
