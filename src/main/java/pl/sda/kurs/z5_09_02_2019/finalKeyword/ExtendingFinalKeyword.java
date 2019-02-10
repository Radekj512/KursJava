package pl.sda.zajecia5.finalKeyword;

public final class ExtendingFinalKeyword extends FinalKeyword {
    public ExtendingFinalKeyword(int someNumber) {
        super(someNumber);
    }

    @Override
    public void foo() {
    }

//    public final void methodThatCannotBeOverriden(){
//          nie mozna nadpisac bo w klasie bazowej jest final
//    }
}