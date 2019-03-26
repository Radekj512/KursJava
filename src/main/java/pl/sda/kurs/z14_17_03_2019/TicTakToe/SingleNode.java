package pl.sda.kurs.z14_17_03_2019.TicTakToe;

enum SingleNode {
    X("X"),
    O("O"),
    BLANK("_");

    private String field;

    SingleNode(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public String toString() {
        return getField();
    }
}
