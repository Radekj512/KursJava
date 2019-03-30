package pl.sda.kurs.z8_17_02_2019.generic.task1;

import java.util.ArrayList;

import java.util.List;

public class QuickList<T> {
    private List<T> myList = new ArrayList<>();

    public QuickList(T... elements) {
        for (T addable : elements) {
            myList.add(addable);
        }
    }

    public <T> List toList() {
        return myList;
    }
}
