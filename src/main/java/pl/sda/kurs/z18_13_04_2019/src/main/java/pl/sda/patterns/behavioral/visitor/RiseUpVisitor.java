package pl.sda.patterns.behavioral.visitor;

public class RiseUpVisitor implements Visitor {

    @Override
    public void visit(Profession profession) {
        System.out.println("Rise up for you! " + profession.getName());
    }
}
