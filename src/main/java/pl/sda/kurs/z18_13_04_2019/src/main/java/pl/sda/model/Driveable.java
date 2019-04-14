package pl.sda.model;

//TODO implement generic way of informing about interface implementation
public interface Driveable {

    default void drive() {
        System.out.println("brum brum");
    }

}
