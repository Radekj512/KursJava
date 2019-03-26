package pl.sda.kurs.z14_17_03_2019.TicTakToe;

interface OutputManager {

    void printGameField(SingleNode[][] field);

    void printWelcome();

    void printSelectSign();

    void printSelectFieldPoint(Player currentPlayer);

    void printSelectFieldPoint();

    void fieldAlreadyTaken();

    void printVictory(Player currentPlayer);

    void printWrongInput();
}
