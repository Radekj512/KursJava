package pl.sda.kurs.z15_30_03_2019.OOP;

public enum Gender {
    MALE,
    FEMALE;

    public static Gender getGender() {
        return Math.random() > 0.5 ? MALE: FEMALE;
    }
}
