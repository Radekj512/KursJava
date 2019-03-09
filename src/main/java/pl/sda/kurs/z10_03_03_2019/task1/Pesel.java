package pl.sda.kurs.z10_03_03_2019.task1;


import java.util.Arrays;
import java.util.Scanner;

public class Pesel {
    String pesel;

    private void setPesel(){
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj numer PESEL: ");
        this.pesel = s.nextLine();
    }

    public void validatePesel(){
        setPesel();
        int[] peselArr = new int[pesel.length()];
        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int sum=0;
        for (int i =0; i < pesel.length(); i++){
            peselArr[i] = Integer.parseInt(Character.toString(pesel.charAt(i)));
        }
        //System.out.println(Arrays.toString(peselArr));
        int[] copyPeselArr = peselArr;
//
        for (int i = 0; i < wagi.length; i++){
            copyPeselArr[i] = copyPeselArr[i]*wagi[i];
        }

        for (int i = 0; i < peselArr.length-1;i++){
            sum = sum+copyPeselArr[i];
        }
        int sumModulo = sum%10;
        int tmp = 0;
        if(sumModulo > 0){
            tmp = 10 - sumModulo;
        }

        if (tmp == peselArr[peselArr.length-1]){
            System.out.println("PESEL poprawny");
        }else{
            System.out.println("PESEL niepoprawny");
        }
    }
}
