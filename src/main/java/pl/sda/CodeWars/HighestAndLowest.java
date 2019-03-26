package pl.sda.CodeWars;

import java.util.ArrayList;
import java.util.List;

public class HighestAndLowest {
    public static String HighAndLow(String numbers) {
        StringBuilder result = new StringBuilder();
        String[] numArray = numbers.split(" ");
        List<Integer> integerList = new ArrayList<>();
        for (String s : numArray) {
            integerList.add(Integer.valueOf(s));
        }
        result.append(integerList.stream().max(Integer::compare).get());
        result.append(" ");
        result.append(integerList.stream().min(Integer::compare).get());
        return result.toString();
    }
}
