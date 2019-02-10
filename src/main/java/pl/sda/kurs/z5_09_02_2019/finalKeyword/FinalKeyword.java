package pl.sda.zajecia5.finalKeyword;

public class FinalKeyword {
    private final int NUMBER = 5;
    private final int ANOTHERNUMBER;

    public FinalKeyword(int someNumber){
        ANOTHERNUMBER = someNumber;
    }

    public void foo(){
//        NUMBER = 4; // nie mozna zmienic bo fnial
    }

    public final void methodThatCannotBeOverriden(){

    }

}
