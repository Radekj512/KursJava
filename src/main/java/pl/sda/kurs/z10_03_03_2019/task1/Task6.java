package pl.sda.kurs.z10_03_03_2019.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    private int numberOfNumbers;
    private ArrayList numbersArr = new ArrayList();

    private void setNumberOfNumbers() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Podaj ilosc liczb:");
            this.numberOfNumbers = scan.nextInt();
        } while (numberOfNumbers == 0);
    }

    public void loadNumbers() {
        setNumberOfNumbers();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.print("Podaj " + (int) (i + 1) + " liczbe: ");
            numbersArr.add(scan.nextInt());
        }
    }

    public void printMultiply() {
        loadNumbers();
        int tmp=1;
        for (int i = 0 ; i < numberOfNumbers;i++){
            tmp=tmp * (int)numbersArr.get(i);
        }
        System.out.println(tmp);
    }
    public double task7(){
        loadNumbers();
        double tmp=0;
        for (int i = 0 ; i < numberOfNumbers;i++){
            tmp=tmp + (int)numbersArr.get(i);
        }
        return tmp/numberOfNumbers;
    }
}