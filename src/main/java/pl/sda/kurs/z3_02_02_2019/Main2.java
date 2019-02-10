package pl.sda.kurs.z3_02_02_2019;

public class Main2 {
    public static void main(String[] args) {
        Person ja = new Person("Radek", "Janus", 25, 'M');
        Index radek = new Index(ja);
        radek.setGrades(new int[]{2, 4, 5, 6});
        radek.countAvg(radek.getGrades());
        System.out.println(radek.getAvg());
        System.out.println(radek.isInDanger());

    }

}
