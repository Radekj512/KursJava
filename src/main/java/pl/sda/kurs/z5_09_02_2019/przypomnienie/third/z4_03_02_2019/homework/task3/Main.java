package pl.sda.zajecia4.homework.task3;

public class Main {
    public static void main(String[] args) {
        Board playerOne = new Board(6,6);
        Board playerTwo = new Board(6,6);
        Ships gameOne = new Ships(playerOne,playerTwo);
//Added few Ships to PlayerOne game board
        gameOne.addShip(playerOne,4,4,4,4);
        gameOne.addShip(playerOne,1,3,1,5);
        gameOne.addShip(playerOne,2,2,4,2);
//Added some Ships to PlayerTwo game board
        gameOne.addShip(playerTwo,1,1,4,1);
        gameOne.addShip(playerTwo,2,3,2,5);
        gameOne.addShip(playerTwo,4,4,6,4);
        gameOne.printBoards();
//PlayerOne shoots and hit
        gameOne.shoot(playerTwo,1,1);
//PlayerTwo shoots and miss
        gameOne.shoot(playerOne,6,6);
// Next shoots
        gameOne.shoot(playerTwo,2,4);
        gameOne.shoot(playerOne,4,4);
        gameOne.shoot(playerOne,2,2);
        gameOne.shoot(playerOne,3,2);
        gameOne.shoot(playerOne,4,2);
        gameOne.shoot(playerOne,5,2);
        gameOne.shoot(playerTwo,3,1);
        gameOne.shoot(playerTwo,4,1);
        gameOne.shoot(playerTwo,2,3);
        gameOne.shoot(playerTwo,2,4);
        gameOne.shoot(playerTwo,2,5);
        gameOne.shoot(playerTwo,4,4);
        gameOne.shoot(playerTwo,5,4);
        gameOne.shoot(playerTwo,6,4);
// Last shoot
        gameOne.shoot(playerTwo,2,1);
    }
}
