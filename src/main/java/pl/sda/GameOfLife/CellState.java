package pl.sda.GameOfLife;

public enum CellState {
    LIVE('X'),
    DEAD('O');

    private char state;

    CellState(char state) {
        this.state = state;
    }

    public char getState() {
        return state;
    }
}
