package pl.sda.kurs.z12_10_03_2019.Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Stos<T> {
    private ArrayList<T> values = new ArrayList<>();

    public void push(T element) {
        values.add(element);
    }

    public void pop() {
        values.remove(values.size() - 1);
    }
    public void pop(int index) {
        values.remove(index);
    }

    public T peek() {
        return values.get(values.size()-1);
    }

    public T peek(int index) {
        return values.get(index);
    }

    public boolean isEmpty() {
        if (values.size() == 0)
            return true;

        return false;
    }

    public int size() {
        return values.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T e : values) {
            sb.append(e);
            sb.append(" ");
        }
        return sb.toString();
    }
}
