package pl.sda.kurs.z14_17_03_2019.task2;

public interface Zwierze {
    void dajGlos();
    default void przedstawSie(){
        System.out.println(getClass().getName());
    };
    String getPrefferedFood();

}
