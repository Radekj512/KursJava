package pl.sda.kurs.z7_16_02_2019.cwiczenia.task2;

public class Calculator {
    public int sum(int a, int... b){
        int res = a;
        for (int i = 0; i< b.length; i++){
            res = res + b[i];
        }
        return res;
    }
}
