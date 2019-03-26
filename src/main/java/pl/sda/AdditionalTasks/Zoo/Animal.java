package pl.sda.AdditionalTasks.Zoo;

public abstract class Animal {
    private static int idGlobal= 1;
    private int id;
    private String name;
    private float weight;

    public Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
        this.id = idGlobal;
        idGlobal++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }
}
