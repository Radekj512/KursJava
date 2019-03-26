package pl.sda.kurs.z13_16_03_2019;

import java.util.Arrays;

public class Task3 {

    public static int function(int[] array, int szukana){
        Arrays.sort(array);
        if (array.length <= 1) {
            return array[0]==szukana ? 0 : -1;
        }
        int srodek = array.length/2;

        int[] lewa = new int[srodek];
        int[] prawa = new int[array.length - srodek];
        if(array[srodek] == szukana){
            return srodek;
        }
        for (int i = 0; i < srodek; i++) {
            lewa[i] = array[i];
        }
        for (int i = srodek; i < array.length; i++) {
            prawa[i - srodek] = array[i];
        }
        if(array[srodek] > szukana){
           return function(lewa, szukana);
        }
        if(array[srodek] < szukana){
           return function(prawa, szukana);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {6,7,6,1,9,41,2,3,4,8,9,7,3,2,21};

        System.out.println(function(a,41));
    }
}