package pl.sda.kurs.z4_03_02_2019;

public class Computer {
    private String processorName;
    private int ramInGb;
    private int discSizeInGb;

    public Computer(String processorName, int ramInGb, int discSizeInGb) {
        this.processorName = processorName;
        this.ramInGb = ramInGb;
        this.discSizeInGb = discSizeInGb;
    }

    public String getProcessorName() {
        return processorName;
    }

    public int getRamInGb() {
        return ramInGb;
    }

    public int getDiscSizeInGb() {
        return discSizeInGb;
    }

    public boolean powerOn(){
        if (discSizeInGb > 0){
            return true;
        }
        return false;
    }
}
