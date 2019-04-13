package pl.sda.patterns.structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return null;
    }

    @Override
    public Volt get12Volt() {
        return null;

    }

    @Override
    public Volt get3Volt() {
        return null;

    }

}
