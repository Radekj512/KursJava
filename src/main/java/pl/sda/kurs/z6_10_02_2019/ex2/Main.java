package pl.sda.kurs.z6_10_02_2019.ex2;

public class Main {
    public static void main(String[] args) {
        GradeConverter gradeConverter = new GradeConverter();
        System.out.println(gradeConverter.convert(1));
        System.out.println(gradeConverter.convert(2));
        System.out.println(gradeConverter.convert(3));
        System.out.println(gradeConverter.convert(4));
        System.out.println(gradeConverter.convert(5));
        System.out.println(gradeConverter.convert(6));
        System.out.println(gradeConverter.convert(65));
    }
}
