package pl.sda.kurs.z8_17_02_2019.generic;

public class Main {
    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<>();
        MoreRestrictiveGenericClass<Integer> moreRestrictiveGenericClass = new MoreRestrictiveGenericClass<Integer>();
        GenericMethod genericMethod = new GenericMethod();

        genericClass.set("123");
        System.out.println(genericClass.get());
        genericMethod.print('a');

    }
}
