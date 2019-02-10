package pl.sda.kurs.z6_10_02_2019;

public class Main {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();

//        PrivateNestedClass -- nie ma dostepu
        ParentClass.PublicNestedClass publicNestedClass;
        publicNestedClass = parentClass.returnNestedClass();

        ParentClass.PublicStaticNestedClass publicStaticNestedClass = new ParentClass.PublicStaticNestedClass();

        ExampleInterface exampleInterface = new ExampleInterface() { // klasa anonimowa
            @Override
            public void fun() {
                System.out.println("Implementacja metody anonimowej");
            }
        };

        exampleInterface.fun();

    }
}
