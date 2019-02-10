package pl.sda.zajecia4.task1.cw3;

public class IntArray {
    private int[] intArr;

    public IntArray(int[] intArr) {
        this.intArr = intArr;
    }

    public void twoSmallesAndTwoLargest() {
        if (intArr.length < 2) {
            System.out.println("Tablica za mala");
        } else {
            int min1 = intArr[0];
            int min2 = intArr[1];
            int max1 = intArr[0];
            int max2 = intArr[1];

            for (int i = 1; i < intArr.length; i++) {
                if (min1 > intArr[i]) {
                    min2 = min1;
                    min1 = intArr[i];
                } else if ((min2 > intArr[i])) {
                    min2 = intArr[i];
                }
                if (max1 < intArr[i]) {
                    max2 = max1;
                    max1 = intArr[i];
                } else if ((max2 < intArr[i])) {
                    max2 = intArr[i];
                }
            }
            System.out.println(min1 + "\n" + min2 + "\n" + max1 + "\n" + max2);
        }
    }
}
