package pl.sda.patterns.structural.adapter;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocketClassAdapterImplTest {

    private static SocketClassAdapterImpl sut;
    @BeforeAll
    public static void init(){
        //given
        sut = new SocketClassAdapterImpl();
    }

    @Test
    void get120Volt() {
        //when
        Volt volt = sut.get120Volt();
        //then
        assertEquals(volt.getVolts(), 120);
        assertEquals(volt, new Volt(120));
        Assert.assertThat(volt, CoreMatchers.equalTo(new Volt(120)));
    }

    @Test
    void get12Volt() {
        //when
        Volt volt = sut.get12Volt();
        //then
        assertEquals(volt.getVolts(), 12);
        assertEquals(volt, new Volt(12));
    }

    @Test
    void get3Volt() {
        //when
        Volt volt = sut.get3Volt();
        //then
        assertEquals(volt.getVolts(), 3);
        assertEquals(volt, new Volt(3));
    }
}