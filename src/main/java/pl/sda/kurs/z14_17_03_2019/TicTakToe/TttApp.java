package pl.sda.kurs.z14_17_03_2019.TicTakToe;

public class TttApp {

    public static void main(String[] args) {
        new TicTacToe(new ConsoleInputManager(), new ConsoleOutputManager()).play();

    }
}
