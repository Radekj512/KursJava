package pl.sda.kurs.z6_10_02_2019.ex2;

public class GradeConverter {
    public String convert(int grade) {
        switch (grade) {
            case 1:
                return ("niedostateczny");
            case 2:
                return ("dopuszczajacy");
            case 3:
                return ("dostateczny");
            case 4:
                return ("dobry");
            case 5:
                return ("bardzo dobry");
            case 6:
                return ("celujacy");
        }
        return ("nieznana");
    }
}
