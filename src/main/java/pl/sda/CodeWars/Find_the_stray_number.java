package pl.sda.CodeWars;

public class Find_the_stray_number {
    static int stray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int counter = 0;
                for (int j = 0; j < numbers.length; j++){
                    if (numbers[i] == numbers[j]){
                        counter++;
                    }
                }
                if (counter == 0 ) return numbers[i];
        }
        return 0;
    }

}
