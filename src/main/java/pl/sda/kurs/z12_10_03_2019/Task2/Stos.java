package pl.sda.kurs.z12_10_03_2019.Task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stos<T> {
    private T[] values;
    private final int size;

    public Stos(Class<T> type, int size) {
        this.size = size;
        this.values = (T[]) Array.newInstance(type, size);
    }

    public void push(T element) {
        for (int i = 0; i < size; i++) {
            if (values[i] == null) {
                values[i] = element;
                break;
            }
        }

    }

    public void pop() {
        for (int i = 0; i < size - 1; i++) {
            if (values[i] != null && values[i + 1] == null) {
                values[i] = null;
                break;
            }
        }
    }

    public T peek() throws Exception {
        for (int i = 0; i < size; i++) {
            if (values[i] != null && values[i + 1] == null) {
                return values[i];
            }
        }
        throw new Exception("Stos jest pusty");
    }

    public boolean isEmpty() {
        for (T element : values) {
            if (element != null)
                return false;
        }
        return true;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
