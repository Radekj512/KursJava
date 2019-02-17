package pl.sda.kurs.z8_17_02_2019.optionals.task1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class NumberMapping {
    private Map<Integer, String> numberMapping = new HashMap<>();

    public void add(int a, String n){
        numberMapping.putIfAbsent(a,n);
    }
    public Optional<String> get(Integer key){
        String word = numberMapping.get(key);
        return Optional.ofNullable(word);
    }
}
