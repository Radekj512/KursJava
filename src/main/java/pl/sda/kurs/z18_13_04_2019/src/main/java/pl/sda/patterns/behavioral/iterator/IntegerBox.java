package pl.sda.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

// TODO implement iterator here to avoid calling wrong methods on the list
class IntegerBox {
    private final List<Integer> list = new ArrayList<>();

    public void add(int in) {
        list.add(in);
    }

    public List getData() {
        return list;
    }
}
