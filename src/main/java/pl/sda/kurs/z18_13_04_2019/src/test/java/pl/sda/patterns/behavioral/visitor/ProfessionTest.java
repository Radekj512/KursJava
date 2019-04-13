package pl.sda.patterns.behavioral.visitor;

import org.junit.jupiter.api.Test;

class ProfessionTest {

    @Test
    void shouldCheckVisitorPattern() {
        //given
        Profession[] list = {new Politician(), new Programmer(), new Teacher()};
        RiseUpVisitor up = new RiseUpVisitor();
        //when
        for (Profession profession : list) {
            profession.accept(up);
        }
        //then
        //TODO

        //given
        ReductionVisitor down = new ReductionVisitor();
        //when
        for (Profession profession : list) {
            profession.accept(down);
        }

        //then
        //TODO
    }
}