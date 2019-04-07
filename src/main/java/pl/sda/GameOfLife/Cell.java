package pl.sda.GameOfLife;

public class Cell {

    private CellState state;
    private int x;
    private int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.state = CellState.LIVE;
    }

    public Cell() {
        this.state = CellState.DEAD;
    }

    public void die(){
        this.state = CellState.DEAD;
    }

    public CellState getCellState() {
        return state;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
