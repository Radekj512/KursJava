package pl.sda.CodeWars;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//posortowac cyfry malejaco
public class DescendingOrder {
    public static int sortDesc(final int num) {
        String n = Integer.toString(num);
        String[] tmp = n.split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(tmp, Collections.reverseOrder());
        for (String s: tmp){
            sb.append(s);
        }
        return Integer.valueOf(sb.toString());
    }
}
