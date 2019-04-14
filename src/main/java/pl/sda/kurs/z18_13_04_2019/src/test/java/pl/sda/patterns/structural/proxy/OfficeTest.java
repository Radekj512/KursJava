package pl.sda.patterns.structural.proxy;

import org.junit.jupiter.api.Test;

class OfficeTest {

    @Test
    void init() {
        //given
        Office office = new Office();
        //when
        office.init();
        office.printLooser();
        //then
        //TODO asercja!
    }
}