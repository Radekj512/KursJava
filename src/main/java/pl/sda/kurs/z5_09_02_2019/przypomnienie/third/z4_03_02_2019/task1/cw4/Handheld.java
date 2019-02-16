package pl.sda.zajecia4.task1.cw4;

public class Handheld {
    private int screenSize;
    private int numberOfCameras;

    public Handheld() {
        this.screenSize = 4;
        this.numberOfCameras = 1;
    }

    public Handheld(int screenSize, int numberOfCameras) {
        this.screenSize = screenSize;
        this.numberOfCameras = numberOfCameras;
    }
    public void ring(){
        System.out.println("I'm ringing!");
    }
    public void turnoff(){
        System.out.println("Goodbye.");
    }
}
