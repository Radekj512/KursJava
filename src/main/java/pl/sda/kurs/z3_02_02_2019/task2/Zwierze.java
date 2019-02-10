package pl.sda.kurs.z3_02_02_2019.task2;

public class Zwierze {
    private String gatunek;

    public Zwierze(String gatunek){
        if (gatunek.equals("gad") || gatunek.equals("płaz") || gatunek.equals("ssak")){
            this.gatunek = gatunek;
        }
        this.gatunek = "Nienznay";
    }

}
