package pl.sda.kurs.z3_02_02_2019;

public class Index {
    private double avg;
    private boolean InDanger;
    private Person person;
    private int[] grades;


    public Index(Person person) {
        this.person = person;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public void setInDanger(boolean inDanger) {
        InDanger = inDanger;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public double getAvg() {
        return avg;
    }

    public boolean isInDanger() {
        for(int tmp : grades){
            if (tmp == 1 || tmp == 2){
                return true;
            }
        }
        return false;
    }

    public Person getPerson() {
        return person;
    }

    public int[] getGrades() {
        return grades;
    }

    public double countAvg(int[] grades){
        double tmp = 0;
        for (int i = 0 ; i < grades.length; i++){
            tmp = tmp + grades[i];
        }
        avg = (tmp/grades.length);
        return avg;
    }
}
