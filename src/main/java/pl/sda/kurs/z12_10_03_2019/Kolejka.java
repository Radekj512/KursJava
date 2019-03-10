package pl.sda.kurs.z12_10_03_2019;

import java.util.ArrayList;
import java.util.List;

public class Kolejka<T> {
    private List<T> values = new ArrayList<>();

    public void push(T element){
        values.add(element);
    }

    public void pop(){
        values.remove(0);
    }

    public T peek(){
        return values.get(0);
    }

    public boolean isEmpty(){
        return values.isEmpty();
    }

    public int size(){
        return values.size();
    }

    @Override
    public String toString() {
        return  values.toString();
    }
}
