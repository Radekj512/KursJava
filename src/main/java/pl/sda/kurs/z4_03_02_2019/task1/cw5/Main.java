package pl.sda.zajecia4.task1.cw5;

public class Main {
    public static void main(String[] args) {
        //Fruit fruit = new Fruit();
        Fruit apple = new Apple();
        Fruit cherry = new Cherry();
        Fruit pear = new Orange();
        Fruit appleFruit = new Apple();
        Fruit cherryFruit = new Cherry();
        Fruit pearFruit = new Orange();

        Fruit[] fruits = {apple, cherry, pear, appleFruit, cherryFruit, pearFruit};

        for(Fruit f: fruits){
            System.out.print("Kolor: "+f.color());
            System.out.print("\tSmak: "+f.taste());
            System.out.println("\tRozmar: "+f.size());
        }
    }
}
