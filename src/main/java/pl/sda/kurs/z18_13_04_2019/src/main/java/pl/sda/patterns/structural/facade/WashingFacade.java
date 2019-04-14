package pl.sda.patterns.structural.facade;


public class WashingFacade {
    private WashingMachine wm = new WashingMachine();
    private LaundryBasket lb = new LaundryBasket();
    private DryingRack dr = new DryingRack();


    public void start() {
        lb.emptyOut();
        wm.loadLaundry();
        wm.chooseProgram();
        wm.setTemperature(90);
        wm.start();
    }


    public void stop() {
        wm.stop();
        dr.removeOldLaundry();
        dr.hangLaundry();

    }
}
