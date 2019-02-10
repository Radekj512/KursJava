package pl.sda.kurs.z4_03_02_2019;

public class Main {
    public static void main(String[] args) {
        Computer komp = new Computer("Ryzen 5", 8, 1024);
        System.out.println(komp.getDiscSizeInGb());
        System.out.println(komp.getProcessorName());
        System.out.println(komp.getRamInGb());
        System.out.println(komp.powerOn());
        System.out.println();
        Laptop laptop = new Laptop("Celeron", 2, 0, false, 15f);
        System.out.println(laptop.getDiscSizeInGb());
        System.out.println(laptop.getProcessorName());
        System.out.println(laptop.getRamInGb());
        System.out.println(laptop.powerOn());
        System.out.println();
        Dell dell = new Dell(12, 200, 15f);
        System.out.println(dell.getDiscSizeInGb());
        System.out.println(dell.getProcessorName());
        System.out.println(dell.getRamInGb());
        System.out.println(dell.powerOn());
        System.out.println();
        Computer laptopComputer = new Laptop("Celeron", 2, 0, false, 15f);
        laptopComputer.getRamInGb();

        Computer dellComputer = new Dell(12, 200, 15f);
        dellComputer.powerOn();

        Computer[] computers = {komp, laptop, dell, laptopComputer, dellComputer};
        for (Computer tComputer : computers) {
            tComputer.getRamInGb();
        }

    }
}
