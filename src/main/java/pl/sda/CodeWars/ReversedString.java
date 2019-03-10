package pl.sda.CodeWars;

public class ReversedString {
    public static String solution(String str) {
        String s = "";
        for (int i = str.length()-1; i >= 0; i--){
            s = s + str.charAt(i);
        }
        return s;
        //return new StringBuilder(str).reverse().toString();
    }
}
