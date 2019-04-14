package pl.sda.patterns.structural.adapter;

import lombok.Data;
@Data
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return new Volt(getVolt().getVolts() /10);
    }

    @Override
    public Volt get3Volt() {
        return new Volt(getVolt().getVolts()/40);
    }
}
