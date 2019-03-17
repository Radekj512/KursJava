package pl.sda.kurs.z14_17_03_2019.KolkoIKrzyzyk;

public class Field {
    private String contains;

    public Field() {
        setContains("_");
    }

    String getContains() {
        return contains.toUpperCase();
    }

    public void setContains(String contains) {
        this.contains = contains;
    }
    public boolean isEmpty(){
        if (getContains().equals("_")){
            return true;
        }
        return false;
    }
}
