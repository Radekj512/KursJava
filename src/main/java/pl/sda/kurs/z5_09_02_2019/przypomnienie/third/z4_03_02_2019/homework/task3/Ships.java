package pl.sda.zajecia4.homework.task3;

public class Ships {
    private static Board playerOne;
    private static Board playerTwo;
    private int scoreP1;
    private int scoreP2;

    public Ships(Board playerOne, Board playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void addShip(Board player, int xBeginingCoordinates, int yBeginingCoordinates, int xEndCoordinates, int yEndCoordinates) {
        player.addShip(xBeginingCoordinates, yBeginingCoordinates, xEndCoordinates, yEndCoordinates);
    }

    public int getScoreP1() {
        return scoreP1;
    }

    public int getScoreP2() {
        return scoreP2;
    }

    public void shoot(Board player, int x, int y) {
        if (player.shot(x, y)) {

            System.out.println("Trafiony!");
            if (player.equals(playerOne)) {
                scoreP2++;
            } else {
                scoreP1++;
            }
            if (playerTwo.gameOver()) {
                System.out.println("Koniec gry!\nWyniki:\n\t*Gracz 1: " + getScoreP1() + "\n\t*Gracz 2: " + getScoreP2());
                printBoards();
            } else if (playerOne.gameOver()) {
                System.out.println("Koniec gry!\nWyniki:\n\t*Gracz 2: " + getScoreP2() + "\n\t*Gracz 1: " + getScoreP1());
                printBoards();
            }

        } else {
            System.out.println("Pudło!");
        }
    }

    public void printBoard(Board player) {
        player.printBoard();
    }

    public void printBoards() {
        System.out.println("Plansza pierwszego gracza: ");
        playerOne.printBoard();
        System.out.println("\nPlansza drugiego gracza: ");
        playerTwo.printBoard();
    }
}
