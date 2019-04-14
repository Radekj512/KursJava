package pl.sda.patterns.structural.adapter;

public interface SocketAdapter {
    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();
}
