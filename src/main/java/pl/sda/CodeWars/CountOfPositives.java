package pl.sda.CodeWars;

public class CountOfPositives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int positiveCounter = 0;
        int sumOfNegatives = 0;
        if (input==null || input.length == 0) {
            return new int[]{};
        }else{
            for (int number : input) {
                if (number > 0) {
                    positiveCounter++;
                } else if (number < 0) {
                    sumOfNegatives += number;
                }
            }
        }

        return  new int[]{positiveCounter, sumOfNegatives}; //return an array with count of positives and sum of negatives
    }
}
