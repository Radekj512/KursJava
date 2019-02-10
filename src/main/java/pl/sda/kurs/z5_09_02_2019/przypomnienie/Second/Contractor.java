package pl.sda.kurs.z5_09_02_2019.przypomnienie.Second;

public class Contractor extends User {
    private String companyName;

    public Contractor(String companyName, String userName, String email) {
        super(userName, email);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

}
