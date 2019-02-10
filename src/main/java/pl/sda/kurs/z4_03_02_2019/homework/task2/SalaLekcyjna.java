package pl.sda.zajecia4.homework.task2;

public class SalaLekcyjna implements Sala {
    public void otworz(int poziomDostepu) {
        if (sprawdDostep(poziomDostepu)) {
            System.out.println("Otworzyłeś " + nazwa());
        } else {
            System.out.println("Nie masz doetępu do tego pomieszczenia");
        }
    }

    public String nazwa() {
        return this.getClass().getSimpleName();
    }

    public boolean sprawdDostep(int poziomDostepu) {
        if (poziomDostepu >= 0) {
            return true;
        }
        return false;
    }
}
