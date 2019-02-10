package pl.sda.kurs.z3_02_02_2019.task2;

public class Pies extends Zwierze {
    private String rasa;

    public Pies(String rasa) {
        super("ssak");
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public String szczekaj() {
        return "hau";
    }
}
