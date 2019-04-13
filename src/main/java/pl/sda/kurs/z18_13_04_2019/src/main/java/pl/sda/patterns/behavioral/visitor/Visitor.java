package pl.sda.patterns.behavioral.visitor;

public interface Visitor {
    default void visit(Profession profession) {
        System.out.println("do change on " + profession.getName());
    }
}
