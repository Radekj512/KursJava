package pl.sda.kurs.z15_30_03_2019.Generics;

public class ArrayUtils {

    public static <T> void printArray(T[] array){
        StringBuilder sb = new StringBuilder();
        sb.append("Array = [");
        for (T t: array){
            sb.append(t + ", ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
