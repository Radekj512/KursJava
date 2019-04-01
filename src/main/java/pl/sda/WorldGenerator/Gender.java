package pl.sda.WorldGenerator;

public enum Gender {
    MALE,
    FEMALE;

    public static Gender getGender() {
        return Math.random() > 0.5 ? MALE: FEMALE;
    }
}
