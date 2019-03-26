package pl.sda.AdditionalTasks.Zoo;

public class Tiger extends Animal {
    private int clawLength;

    public Tiger(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }

    public int getClawLength() {
        return clawLength;
    }
}
