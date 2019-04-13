package pl.sda.patterns.behavioral.visitor;

public class ReductionVisitor implements Visitor {

    @Override
    public void visit(Profession profession) {
        System.out.println("Reduction for you: " + profession.getName());
    }
}
