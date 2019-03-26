package pl.sda.CodeWars;
//An isogram is a word that has no repeating letters, consecutive or non-consecutive.
// Implement a function that determines whether a string that contains only letters is an isogram.
// Assume the empty string is an isogram. Ignore letter case.
public class Isograms {
    public static boolean  isIsogram(String str) {
        String s = str.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            for (int j = i+1; j< s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
        //return str.length() == str.toLowerCase().chars().distinct().count(); // so easier way ..
    }
}
