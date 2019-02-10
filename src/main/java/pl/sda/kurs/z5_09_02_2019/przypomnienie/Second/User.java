package pl.sda.kurs.z5_09_02_2019.przypomnienie.Second;

public class User {
    private static int uniqeId;
    private int id;
    private String userName;
    private String email;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.id = uniqeId;
        uniqeId++;
    }

    public  int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return                 "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'';
    }
}
