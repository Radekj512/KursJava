package pl.sda.kurs.z12_10_03_2019.Task2;

public class Main {
    public static void main(String[] args) throws Exception {

        Stos<String> s = new Stos<>(String.class, 10);
        System.out.println(s);
        System.out.println(s.isEmpty());
        s.push("aaa");
        s.push("bbb");
        System.out.println(s);
        System.out.println(s.isEmpty());
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
    }
}
