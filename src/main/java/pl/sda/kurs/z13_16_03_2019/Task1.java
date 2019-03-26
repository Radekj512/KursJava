package pl.sda.kurs.z13_16_03_2019;

public class Task1 {
    public static int findX(int[] tab, int x) {
        for (int i =0; i< tab.length; i++){
            if (tab[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(findX(a, 5));
    }
}
