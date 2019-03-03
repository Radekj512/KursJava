package pl.sda.kurs.z10_03_03_2019.task1;

public class Choinka {

    private static StringBuilder pien(int rows) {
        StringBuilder sb = new StringBuilder();
        if (rows <= 5) {
            for (int i = 0; i < rows/2+1; i++) {
                sb.append(" ");
            }
        }else{
            for (int i = 0; i < rows/2+2; i++) {
                sb.append(" ");
            }
        }
        for (int j = 0; j < 5; j++) {
            sb.append("|");
        }

        return sb;
    }

    public static void rysujChoinke(int rows) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append(printBlankSpaces(rows, i));
            sb.append(printBranches(i + 1));
            sb.append(printBlankSpaces(rows, i));
            sb.append("\n");
        }

        sb.append(pien(rows));
        System.out.println(sb);
    }

    public static StringBuilder printBlankSpaces(int c, int i) {
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < c - i; j++) {
            s.append(" ");
        }
        return s;
    }

    public static StringBuilder printBranches(int count) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            s.append("*");
        }
        for (int i = 1; i < count; i++) {
            s.append("*");
        }
        return s;
    }

    public static void main(String[] args) {
        rysujChoinke(10);
    }

}
