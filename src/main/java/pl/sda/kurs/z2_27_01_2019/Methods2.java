package pl.sda.kurs.z2_27_01_2019;

public class Methods2 {
    public static void main(String[] args) {
        String someText = "9.3";

        System.out.println(ApplicationUtils.convertToDouble(someText));
        someText = someText + "  ";
        System.out.println(ApplicationUtils.convertToDouble(someText));
        someText = null;
        System.out.println(ApplicationUtils.convertToDoubleObject(someText));
    }
}
