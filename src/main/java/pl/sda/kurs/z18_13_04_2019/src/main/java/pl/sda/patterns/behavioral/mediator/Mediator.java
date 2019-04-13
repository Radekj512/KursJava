package pl.sda.patterns.behavioral.mediator;

//TODO
public interface Mediator {
    void sendMessage(String msg, BaseConsumer consumer);

    void addConsumer(BaseConsumer consumer);
}
