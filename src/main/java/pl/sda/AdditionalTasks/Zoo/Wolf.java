package pl.sda.AdditionalTasks.Zoo;

public class Wolf extends Animal implements Canine {
    private int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }

    public int getFangLength() {
        return fangLength;
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK BARK");
    }
}
