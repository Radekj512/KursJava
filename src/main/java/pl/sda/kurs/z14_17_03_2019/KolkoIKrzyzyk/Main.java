package pl.sda.kurs.z14_17_03_2019.KolkoIKrzyzyk;

public class Main {
    public static void main(String[] args) {
        Board x = new Board();
        Player p1 = new Player();
        Player p2 = new Player();

        while(!x.gameOver()){
            System.out.println("Gracz " + p1.getMark() + ":");
            p1.addmove(x);
            System.out.println("Gracz " + p2.getMark() + ":");
            p2.addmove(x);
            x.printField();
        }



    }
}
