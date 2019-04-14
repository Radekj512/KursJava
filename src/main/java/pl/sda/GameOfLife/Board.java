package pl.sda.GameOfLife;

import java.util.Arrays;

public class Board {
    private final int BOARD_WIDTH = 5;
    private final int BOARD_HEIGHT = 5;

    private Cell[][] board = new Cell[BOARD_WIDTH][BOARD_HEIGHT];

    public Board() {
        for (int i = 0; i < BOARD_WIDTH; i++) {
            for (int j = 0; j < BOARD_HEIGHT; j++) {
                board[i][j] = new Cell();
            }
        }
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void printBoard() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                System.out.print(board[i][j].getCellState().getState() + "\t");
            }
            System.out.println();
        }
    }

    public void addCell(int x, int y) {
        board[y][x] = new Cell(y, x);
    }

    public void nextStep() {
        Cell[][] b = getBoard();


    }

    public int checkNeighborhood(int x, int y) {
        int neightbors = 0;
        if (x > 0 && y > 0) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (i == x && j == y) continue;
                    if (board[i][j].getCellState().getState() == 'X') {
                        neightbors++;
                    }
                }
            }
        }else{
            for (int i = x; i <= x + 1; i++) {
                for (int j = y ; j <= y + 1; j++) {
                    if (i == x && j == y) continue;
                    if (board[i][j].getCellState().getState() == 'X') {
                        neightbors++;
                    }
                }
            }
        }

        return neightbors;
    }
}
