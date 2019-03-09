package pl.sda.kurs.z11_09_03_2019.task1;

import java.util.Arrays;

public class T2 {

    private static int[] foo(int[] a){
        int[] wynik = new int[]{0,0};
        if (a == null || a.length ==0){
            return new int[0];
        }else{
            for (int i = 0; i < a.length; i++){
                if (a[i]>0){
                    wynik[1] = wynik[1] + a[i];
                }
                else{
                    wynik[0]++;
                }
            }
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(foo(new int[]{1, 2, 3, -4})));
    }
}
