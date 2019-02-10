package pl.sda.zajecia4.homework.task2;

public interface Sala {
    void otworz(int poziomDostepu);

    String nazwa();

    boolean sprawdDostep(int poziomDostepu);
}
