package pl.sda.zajecia4.homework.task3;

public class Board {
    private int[][] board;
    private int bW;
    private int bH;
    private boolean flag;


    public Board(int boardHeight, int boardWidth) {
        this.board = new int[boardWidth][boardHeight];
        this.bW = boardWidth;
        this.bH = boardHeight;
    }

    protected void addShip(int xBeginingCoordinates, int yBeginingCoordinates, int xEndCoordinates, int yEndCoordinates) {
        flag = false;
        if ((xBeginingCoordinates <= bW) && (xEndCoordinates <= bW) && (yBeginingCoordinates <= bH) && (yEndCoordinates <= bH)) {
            if ((xBeginingCoordinates == xEndCoordinates) || (yBeginingCoordinates == yEndCoordinates)) {
                for (int i = xBeginingCoordinates; i <= xEndCoordinates; i++) {
                    for (int j = yBeginingCoordinates; j <= yEndCoordinates; j++) {
                        if ((board[i - 1][j - 1] == 1) || (board[j - 1][i - 1] == 1)) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (!flag) {
                    for (int i = xBeginingCoordinates; i <= xEndCoordinates; i++) {
                        for (int j = yBeginingCoordinates; j <= yEndCoordinates; j++) {
                            board[j - 1][i - 1] = 1;
                        }
                    }
                    System.out.println("Dodano statek");
                } else {
                    System.out.println("Nie moga na siebie nachodzic");
                }
            } else {
                System.out.println("Statek mmoze byc skierowany tylko pinowo lub poziomo");
            }
        } else {
            System.out.println("Ten statek nie zmiesci sie na planszy");
        }
    }

    public boolean shot(int x, int y) {
        if (board[y - 1][x - 1] == 1) {
            board[y - 1][x - 1] = 0;
            return true;
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < bH; i++) {
            System.out.print("\t" + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < bH; i++) {
            System.out.print("-----");
        }
        System.out.println();
        for (int i = 0; i < bW; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < bH; j++) {
                System.out.print("\t" + board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean gameOver() {
        for (int i = 0; i < bW; i++) {
            for (int j = 0; j < bH; j++) {
                if ((board[i][j] == 1) || (board[j][i] == 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}

