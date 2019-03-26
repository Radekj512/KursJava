package pl.sda.kurs.z14_17_03_2019.TicTakToe;

import java.util.Arrays;
import java.util.stream.IntStream;

import static pl.sda.kurs.z14_17_03_2019.TicTakToe.SingleNode.O;
import static pl.sda.kurs.z14_17_03_2019.TicTakToe.SingleNode.X;


public class TicTacToe {

    SingleNode[][] gameField = new SingleNode[3][3];
    Player playerOne;
    Player playerTwo;
    InputManager input;
    OutputManager output;


    public TicTacToe(InputManager input, OutputManager output) {
        this.input = input;
        this.output = output;

        initGameField();
        initPlayers();
    }

    public void play() {
        Player currentPlayer = playerTwo;

        while (!hasWon(currentPlayer)) {
            currentPlayer = currentPlayer.equals(playerOne) ? playerTwo : playerOne;

            turn(currentPlayer);
        }

        output.printGameField(gameField);
        output.printVictory(currentPlayer);
    }

    private void turn(Player currentPlayer) {
        output.printGameField(gameField);
        output.printSelectFieldPoint(currentPlayer);
        String field = getField();
        if (gameField[getRow(field, 0)][getColumn(field, 1)] == SingleNode.BLANK)
            gameField[getRow(field, 0)][getColumn(field, 1)] = currentPlayer.getSign();
        else
            turn(currentPlayer);
    }

    private String getField() {
        try {
            return input.getField(output);
        } catch (IllegalArgumentException e) {
            output.printWrongInput();
            return getField();
        }
    }

    private int getColumn(String field, int i) {
        return Character.getNumericValue(field.charAt(i));
    }

    private int getRow(String field, int i) {
        return Character.getNumericValue(field.charAt(i));
    }

    private void initGameField() {
        Arrays.asList(gameField).stream()
                .forEach(row -> Arrays.asList(row)
                        .replaceAll(x -> SingleNode.BLANK));
    }

    private void initPlayers() {
        playerOne = getPlayerOne();
        playerTwo = new Player(false,
                //getPlayeTwoSign());
                playerOne.getSign() == X ? O : X);
    }

    private Player getPlayerOne() {
        try {
            return new Player(true, input.getPlayerOneSign(output));
        } catch (IllegalArgumentException e) {
            output.printWrongInput();
            return getPlayerOne();
        }
    }

    private SingleNode getPlayeTwoSign() {
        if (playerOne.getSign() == X)
            return O;
        return X;
    }

    private boolean hasWon(Player player) {
        return checkRows(player)
                || checkColumns(player)
                || checkDiagonals(player);
    }

    private boolean checkDiagonals(Player player) {
        return checkSymetricalDiagonal(player)
                || checkAsymmetricalDiagonal(player);
    }

    private boolean checkAsymmetricalDiagonal(Player player) {
        return IntStream.range(0, 3)
                .mapToObj(i -> gameField[2 - i][i])
                .filter(x -> x.equals(player.getSign()))
                .count() == 3L;
    }

    private boolean checkSymetricalDiagonal(Player player) {
        return IntStream.range(0, 3)
                .mapToObj(i -> gameField[i][i])
                .filter(x -> x.equals(player.getSign()))
                .count() == 3L;
    }

//    private boolean checkSymetricalDiagonal(Player player) {
//        long count = 0L;
//        for (int i = 0; i < 3; i++) {
//            SingleNode x = gameField[i][i];
//            if (x.equals(player.getSign())) {
//                count++;
//            }
//        }
//        return count == 3L;
//    }

    private boolean checkColumns(Player player) {
        return IntStream.range(0, gameField.length)
                .mapToObj(i -> checkColumn(i, player))
                .anyMatch(b -> b.equals(Boolean.TRUE));
    }

    private boolean checkColumn(int collumnIndex, Player player) {
        return IntStream.range(0, 3)
                .mapToObj(i -> gameField[i][collumnIndex])
                .filter(x -> x.equals(player.getSign()))
                .count() == 3L;
    }

    private boolean checkRows(Player player) {
        return Arrays.stream(gameField)
                .map(row -> checkRow(row, player))
                .anyMatch(b -> b.equals(Boolean.TRUE));
    }

    private Boolean checkRow(SingleNode[] row, Player player) {
        return Arrays.stream(row)
                .filter(x -> x.equals(player.getSign()))
                .count() == 3L;
    }
}
