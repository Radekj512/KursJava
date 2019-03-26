package pl.sda.kurs.z14_17_03_2019.KolkoIKrzyzyk;

import java.util.Arrays;

public class Board {
    private final int x = 3;
    private final int y = 3;
    private Field[][] board = new Field[x][y];

    public Board() {
        fillBoardWithNewObejcts();
    }

    private String getMark(int x, int y) {
        if (x < this.x && y < this.y) {
            return board[x][y].getContains();
        }
        return "_";
    }

    private boolean checkBoard() {
        boolean endGame = false;
        String[] sings = {"X", "O"};



        for (String s : sings) {
//poziomo
            if (getMark(0, 0).equals(s) && getMark(0, 1).equals(s) && getMark(0, 2).equals(s))
                return true;
            if (getMark(1, 0).equals(s) && getMark(1, 1).equals(s) && getMark(1, 2).equals(s))
                return true;
            if (getMark(2, 0).equals(s) && getMark(2, 1).equals(s) && getMark(2, 2).equals(s))
                return true;
//pionowo
            if (getMark(0, 0).equals(s) && getMark(1, 0).equals(s) && getMark(2, 1).equals(s))
                return true;
            if (getMark(0, 1).equals(s) && getMark(1, 1).equals(s) && getMark(2, 1).equals(s))
                return true;
            if (getMark(0, 2).equals(s) && getMark(1, 2).equals(s) && getMark(2, 2).equals(s))
                return true;
//skos
            if (getMark(0, 0).equals(s) && getMark(1, 1).equals(s) && getMark(2, 2).equals(s))
                return true;
            if (getMark(0, 2).equals(s) && getMark(1, 1).equals(s) && getMark(0, 2).equals(s))
                return true;
        }
        return endGame;
    }

    public void setField(int x, int y, String s) {
        board[x][y].setContains(s.toUpperCase());
        if (gameOver()) {
            System.out.println("Koniec gry");
            printField();
        }
    }

    public void printField() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(getMark(i, j));
            }
            System.out.println();
        }
    }
    public boolean gameOver(){
        return checkBoard();
    }

    private void fillBoardWithNewObejcts() {
        Arrays.asList(board).stream()
                .forEach(x -> Arrays.asList(x).replaceAll(y -> new Field()));
    }
}
