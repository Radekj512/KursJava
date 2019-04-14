package pl.sda.patterns.behavioral.visitor;

public interface Profession {
    default void accept(Visitor v) {
        v.visit(this);
    }

    default String getName() {
        return this.getClass().getSimpleName();
    }
}
