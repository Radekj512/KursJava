package pl.sda.kurs.z10_03_03_2019.task3;

import java.util.Arrays;

public class T3 {

    public static int[] sumOfTwoArrays(int[] a, int[] b) {
        int returnedArrayLength = 0;
        int aLen = a.length;
        int bLen = b.length;
        if (a.length > b.length) {
            returnedArrayLength = a.length;
        } else{
            returnedArrayLength = b.length;
        }

        int[] arryToReturn = new int[returnedArrayLength];
        int i = 0;
        while (i < aLen && i < bLen) {
            arryToReturn[i] = a[i] + b[i];
            i++;
        }
        if(i >= aLen){
            for (int j = i; j< returnedArrayLength; j++){
                arryToReturn[j] = b[j];
            }
        }else if (i >= bLen){
            for (int j = i; j< returnedArrayLength; j++){
                arryToReturn[j] = a[j];
            }
        }
        return arryToReturn;
    }

    public static void main(String[] args) {

        int[] a = {1};
        int[] b = {1,2,3,4,5};
        System.out.println(Arrays.toString(sumOfTwoArrays(a, b)));
    }
}
