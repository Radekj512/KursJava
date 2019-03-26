package pl.sda.AdditionalTasks.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal bear = new Bear("Yogi", 200, 40);
        Animal tiger = new Tiger("Jataka", 150, 25);
        Animal wolf = new Wolf("Howler", 70, 40);
        Animal dog = new Dog("Scooby", 30);

        List<Animal> animals = new ArrayList<>();
        animals.add(bear);
        animals.add(tiger);
        animals.add(wolf);
        animals.add(dog);

        List<Animal> howlers = new ArrayList<>();
        howlers.add(wolf);
        howlers.add(dog);

        System.out.println(bear.getId() + ": I'm a bear. My name is " + bear.getName() + ". I weight " + bear.getWeight()+".0 kg and my fur lenght is " + ((Bear) bear).getFurLenght()+".");
        System.out.println(tiger.getId() + ": I'm a tiger. My name is " + tiger.getName() + ". I weight " + tiger.getWeight()+".0 kg and my claw lenght is " + ((Tiger) tiger).getClawLength()+".");
        System.out.println(wolf.getId() + ": I'm a wolf. My name is " + wolf.getName() + ". I weight " + wolf.getWeight()+".0 kg and my fang lenght is " + ((Wolf) wolf).getFangLength()+".");
        System.out.println(dog.getId() + ": I'm a dog. My name is " + dog.getName() + ". I weight " + dog.getWeight()+".0 kg.");

        for (Animal a: howlers){
            if (a instanceof Wolf){
                System.out.print("My name is " + a.getName() + " and I am barking: "); ((Wolf) a).bark();
            }
            if (a instanceof Dog){
                System.out.print("My name is " + a.getName() + " and I am barking: ");
                ((Dog) a).bark();
                ((Dog) a).sitPretty();
            }
        }

    }
}
