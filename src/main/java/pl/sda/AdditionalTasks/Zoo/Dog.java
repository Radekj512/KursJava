package pl.sda.AdditionalTasks.Zoo;

public class Dog extends Animal implements Canine {

    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void bark() {
        System.out.println("bark bark bark");
    }
    public void sitPretty(){
        System.out.println(this.getName() + " sits pretty.");
    }
}
