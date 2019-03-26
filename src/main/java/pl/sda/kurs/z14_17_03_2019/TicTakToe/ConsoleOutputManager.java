package pl.sda.kurs.z14_17_03_2019.TicTakToe;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConsoleOutputManager implements OutputManager {
    @Override
    public void printGameField(SingleNode[][] gameField) {
        System.out.println(
                Arrays.stream(gameField)
                        .map(x -> concat(x))  // wydzieliliśmy wewnętrzny stream do metody concat
                        .collect(Collectors.joining("\n")));
    }

    // transformacja tablicy SingleNode[] na String
    // gdzie Stringiem są kolejne elementy tablicy
    // oddzielone przecinkiem
    private String concat(SingleNode[] stream) {
        return Arrays.stream(stream).map(field -> field.toString())
                .collect(Collectors.joining(" "));
    }

    @Override
    public void printWelcome() {
        System.out.println("Dzień dobry, zagrajmy w Kółko i Krzyżyk.");
    }

    @Override
    public void printSelectSign() {
        System.out.println("Graczu 1 wybierz X lub O");
    }

    @Override
    public void printSelectFieldPoint(Player currentPlayer) {
        System.out.println("Graczu " + (currentPlayer.isPlayerOne()? 1:2)+
                " wybierz pole.");
        printFieldNumbers();
    }

    private void printFieldNumbers() {
        System.out.println("1 2 3\n" +
                           "4 5 6\n" +
                           "7 8 9 "
        );
    }

    @Override
    public void printSelectFieldPoint() {

    }

    @Override
    public void fieldAlreadyTaken() {
        System.out.println("Pole już było wybrane! Wybierz poprawne pole!");
    }

    @Override
    public void printVictory(Player currentPlayer) {
        System.out.println("Wygrał gracz " +
                (currentPlayer.isPlayerOne() ? 1 : 2) + "! Gratulacje! "
        );
    }

    @Override
    public void printWrongInput() {
        System.out.println("Podałeś niewłaściwą wartość! Spróbuj jeszcze raz!");
    }


}
