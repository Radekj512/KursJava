package pl.sda.kurs.z2_27_01_2019;

public class LoopsExample {
    public static void main(String[] args) {
        //printNumbers(3);

        //printFewNaturalNumbersWithoutDividableByParam(20, 3);
        //System.out.println(sumNaturalNumbersToLimit(1000));
        //numberTree(9);
        //System.out.println(sumToLimitDoWhile(1000));
        fibonacci(10);
    }

    public static void printNumbers(int lastNumber) {
        for (int i = 0; i < lastNumber; i++) {
            System.out.println(i);
        }
    }

    public static void printFewNaturalNumbersWithoutDividableByParam(int max, int param) {
        for (int i = 0; i < max; i++) {
            if (i % param == 0) continue;
            System.out.println(i);
        }
    }

    public static int sumNaturalNumbersToLimit(int limit) {
        int sum = 0;
        for (int i = 0; ; i++) {
            if (sum + i >= limit) break;
            sum = sum + i;
        }
        return sum;
    }

    public static void numberTree(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static int sumToLimitWhile(int limit) {
        int sum = 0;
        int i = 0;
        while (sum + i < limit) {
            sum = sum + (++i);
        }
        return sum;
    }

    public static int sumToLimitDoWhile(int limit) {
        int sum = 0;
        int i = 0;
        do {
            sum = sum + (++i);
        } while (sum + i < limit);
        return sum;
    }
    public static void fibonacci(int howMuchElements){
        int element1=0;
        int element2=1;
        int counter = 1;
        int element3 = 0;
        System.out.println(element1+"\n"+element2);
        while(counter <= howMuchElements-2){

            element3 = element1+element2;
            element1 = element2;
            element2 = element3;
            System.out.println(element3);
            counter++;
        }

    }
}

