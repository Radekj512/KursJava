package pl.sda.CodeWars;

public class RemoveFirstAndLast {
    public static String remove(String str) {
        return str.substring(1, str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(remove("Radek"));
        System.out.println(remove("Ala ma kota"));
        System.out.println(remove("Kot nie ma ali"));

    }
}
