package pl.sda.kurs.z5_09_02_2019.przypomnienie.Second;

public class Employee extends User {
    private int accessLevel;

    public Employee(int accessLevel, String userName, String email) {
        super(userName, email);
        this.accessLevel = accessLevel;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public boolean canOpenRoom(int accessLevel){
        return accessLevel > 1;
    }
}
