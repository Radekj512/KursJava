package pl.sda.patterns.structural.adapter;

//TODO write tests and add missing implementation for:
//TODO SocketObjectAdapterImpl
//TODO SocketClassAdapterImpl
//TODO Fill Junit Test
public class SocketAdapterConverter {

    static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i) {
            case 3:
                return sockAdapter.get3Volt();
            case 12:
                return sockAdapter.get12Volt();
            case 120:
                return sockAdapter.get120Volt();
            default:
                return sockAdapter.get120Volt();
        }
    }
}
