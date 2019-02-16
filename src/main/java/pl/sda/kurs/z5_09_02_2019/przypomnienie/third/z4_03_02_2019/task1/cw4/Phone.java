package pl.sda.zajecia4.task1.cw4;

import java.util.Objects;

public class Phone extends Handheld {
    private boolean has4G;

    public Phone(int screenSize, int numberOfCameras, boolean has4G) {
        super(screenSize, numberOfCameras);
        this.has4G = has4G;
    }
    @Override
    public void ring(){
        System.out.println("Phone is ringing");
    }

    @Override
    public void turnoff() {
        System.out.println("Phone is shutting down");
    }

    public void call(){
        if(has4G){
            System.out.println("Dzwonie.");
        }else{
            System.out.println("Nie dzwonie");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return has4G == phone.has4G;
    }

    @Override
    public int hashCode() {
        return Objects.hash(has4G);
    }
}
