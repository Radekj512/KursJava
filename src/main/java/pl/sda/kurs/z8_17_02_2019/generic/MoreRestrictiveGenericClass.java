package pl.sda.kurs.z8_17_02_2019.generic;

public class MoreRestrictiveGenericClass<T extends Number> { //mozna przyjmowac tylko typy dziedziczace po klasie Number

    public double add(T a, T b){
        return a.doubleValue()+b.doubleValue();
    }

}
