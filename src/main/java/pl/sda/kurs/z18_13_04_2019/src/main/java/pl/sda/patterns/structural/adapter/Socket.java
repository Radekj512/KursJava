package pl.sda.patterns.structural.adapter;

class Socket {
    Volt getVolt() {
        return new Volt(120);
    }
}
