package pl.sda.kurs.z12_10_03_2019.Task1;

public class Main {
    public static void main(String[] args) {
        Stos<String> s = new Stos<>();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.push("jeden");
        s.push("dwa");
        s.push("trzy");
        s.push("cztery");
        s.push("piec");

        System.out.println(s.isEmpty());
        System.out.println(s.size());
        //System.out.println(s.peek("trzy"));
        s.pop();
        System.out.println(s.size());
    }
}
