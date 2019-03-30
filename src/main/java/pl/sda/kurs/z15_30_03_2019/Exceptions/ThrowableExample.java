package pl.sda.kurs.z15_30_03_2019.Exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ThrowableExample {

    public static void main(String[] args) {
        // Error examples:
        //Stack Overflow
//        recursiveStackOverflow(1);

        // OOM
//        try {
//            generateOOM();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Unchecked exception examples
        // NPE
//        generateNPE();

        //IndexOutOfBounds
//        generateIndexOutOfBounds();



        //Checked exceptions Examples
        // IOExcetion
//        generateIOException(); //fixme


        // Try with resource
//        String path = "zajęcia_3003/f_io/data/places.txt";
//        String path = "C:\\sda\\programowanie_I\\src\\main\\java\\zajęcia_3003\\f_io\\data\\places.txt";

//        try(BufferedReader fileInputStream = new BufferedReader(new FileReader(path))){
//            System.out.println(fileInputStream.readLine());
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

    }

    private static void generateIOException(){
//        throw new IOException();
    }

    private static void generateIndexOutOfBounds() {
        int[] ints = new int[3];
        int i = ints[3];
    }

    private static void generateNPE() {
        List<String> strings = new ArrayList<>();
        strings.add(null);
        strings.get(0).length();
    }

    private static int recursiveStackOverflow(int input) {
        return recursiveStackOverflow(input);
    }

    private static void generateOOM() throws Exception {
        int iteratorValue = 40;
        System.out.println("\n=================> OOM test started..\n");
        for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
            System.out.println("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory());
            int loop1 = 2;
            int[] memoryFillIntVar = new int[iteratorValue];
// feel memoryFillIntVar array in loop..
            do {
                memoryFillIntVar[loop1] = 0;
                loop1--;
            } while (loop1 > 0);
            iteratorValue = iteratorValue * 5;
            System.out.println("\nRequired Memory for next loop: " + iteratorValue);
            Thread.sleep(1000);
        }
    }
}
