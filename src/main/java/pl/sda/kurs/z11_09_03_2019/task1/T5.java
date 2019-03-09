package pl.sda.kurs.z11_09_03_2019.task1;

import java.util.ArrayList;
import java.util.List;

public class T5 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        for(int i = b.size()-1 ; i>= 0; i--){
            a.add(b.get(i));
        }
        System.out.println(a);
    }
}
