package pl.sda.kurs.z15_30_03_2019.ENUMS;

public enum MyEnum {
    JEDEN(1),
    DWA(2);


    private int i;

    MyEnum(int i) {
        this.i = i;
    }

    public int getI(){
        return i;
    }

    public void setI(int i){
        this.i = i;
    }

}
