package pl.sda.kurs.z8_17_02_2019.generic;

public class GenericClass<T> { // w nawiasie <> moze byc cokolwiek, ale zazwyczaj sie wpisuje <T>, moze byc kilka <A,B,C,D,>
    private T someValue;


    public void set(T value) {
        this.someValue = value;
    }

    public T get() {
        return someValue;
    }

    public String convertToString(T value){
        return String.valueOf(value);
    }

}
