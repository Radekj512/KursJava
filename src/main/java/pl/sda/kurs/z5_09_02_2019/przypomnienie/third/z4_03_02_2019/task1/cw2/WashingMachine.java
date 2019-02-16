package pl.sda.zajecia4.task1.cw2;

public class WashingMachine {
    private boolean turnedOn;

    public WashingMachine() {
    }

    public void start() {
        System.out.println("Uruchomiono pralke");
        turnedOn = true;
    }

    public void dry() {
        if (turnedOn) {
            System.out.println("Uruchomione funkcję suszenia prania");
        } else {
            System.out.println("Pierw musisz właczyć pralkę");
        }
    }

    public void spin() {
        if (turnedOn) {
            System.out.println("Uruchomiono wirowanie");
        } else {
            System.out.println("Pierw musisz włączyć pralke");
        }
    }
}
