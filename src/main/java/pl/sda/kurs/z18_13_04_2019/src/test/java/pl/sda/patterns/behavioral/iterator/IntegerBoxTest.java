package pl.sda.patterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

class IntegerBoxTest {

    private static final int BOX_SIZE = 9;
    private static final int WRONG_BOX_SIZE = 0;

    @Test
    void shouldWeDisablePossibilityOfChangingOfAccidentalChange() {
        //given
        IntegerBox box = new IntegerBox();
        for (int i = BOX_SIZE; i > 0; --i) {
            box.add(i);
        }
        //when
        Collection integerList = box.getData();
        //then
        assertEquals(9, integerList.size());
        //when
        integerList.clear();
        //then
        //TODO -> IT HAS TO BE FIXED, CURRENTLY WE HAVE A POSSIBILITY TO CHANGE INTEGER BOX CONTENT
        assertEquals(WRONG_BOX_SIZE, integerList.size());
    }
}