package pl.sda.patterns.creational.singleton;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PropertyLoaderTest {

    @Test
    void load() {
        //given
        PropertyLoader sut = new PropertyLoader();
        //when
        sut.load();
        //then
        Assert.assertEquals("test",sut.getProperties().getProperty("user") );
        Assert.assertEquals("test123",sut.getProperties().getProperty("password") );
        Assert.assertEquals("127.0.0.1",sut.getProperties().getProperty("address") );
        Assert.assertEquals("test",sut.getProperties().getProperty("db") );
    }
}