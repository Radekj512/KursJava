package pl.sda.GameOfLife;

public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        b.printBoard();
        b.addCell(0,1);
        b.addCell(1,1);
        b.addCell(2,1);

        System.out.println();
        b.printBoard();
        System.out.println(b.checkNeighborhood(0,1));
    }
}
