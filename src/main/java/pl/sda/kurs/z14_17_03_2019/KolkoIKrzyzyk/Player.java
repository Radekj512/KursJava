package pl.sda.kurs.z14_17_03_2019.KolkoIKrzyzyk;

import java.util.Scanner;

public class Player {
    private String mark;
    private int score = 0;

    public Player() {
        Scanner s = new Scanner(System.in);
        System.out.print("Wybierz znak (X lub O): ");
        setMark(s.next());
    }

    private void move(Board b, int x, int y) {
        b.setField(x, y, mark);
    }

    private void setMark(String m) {
        if (m.length() == 1 && (m.toUpperCase().equals("X") || m.toUpperCase().equals("O"))) {
            this.mark = m;
        } else {
            throw new IllegalArgumentException("Wybierz X lub O");
        }
    }

    public void addmove(Board b) {
        Scanner s = new Scanner(System.in);
        int x, y;
        System.out.print("Podaj wspolrzedna X: ");
        x = s.nextInt();
        System.out.print("Podaj wspolrzedna Y: ");
        y = s.nextInt();

        move(b, x, y);

    }

    public String getMark() {
        return mark;
    }

    public void addScore() {
        this.score++;
    }

    public int getScore() {
        return this.score;
    }
}
