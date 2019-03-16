package pl.sda.kurs.z13_16_03_2019;

public class Task2 {
    public static boolean isTherePairOfNumbersThatSumIsX(int[] tab, int sum){
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab.length; j++){
                if(tab[i] + tab[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(isTherePairOfNumbersThatSumIsX(a,33));
    }
}
