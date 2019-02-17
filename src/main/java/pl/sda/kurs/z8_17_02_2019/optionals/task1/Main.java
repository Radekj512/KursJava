package pl.sda.kurs.z8_17_02_2019.optionals.task1;

public class Main {
    public static void main(String[] args) {
        NumberMapping n = new NumberMapping();
        n.add(1,"jeden");
        n.add(2,"dwa");
        n.add(3,"trzy");
        System.out.println(n.get(3).isPresent());
        System.out.println(n.get(5).isPresent());
    }
}
