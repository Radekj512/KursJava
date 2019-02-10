package pl.sda.kurs.z6_10_02_2019;

public class ParentClass {
    private PrivateNestedClass privateNestedClass;
    private PublicNestedClass publicNestedClass;
    private PublicStaticNestedClass publicStaticNestedClass;

    public PublicNestedClass returnNestedClass(){
        return new PublicNestedClass();
    }
    private class PrivateNestedClass{
        //widoczna tylko w klasie bazowej
    }
    public class PublicNestedClass{
        // widoczna na zewnatrz, ale nie mozna stworzyc obiektu
    }
    public static class PublicStaticNestedClass{
        // widoczna na zewnatrz i mozna utworzyc nowy obiekt tej klasy
    }
}
