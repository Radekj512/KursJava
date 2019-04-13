package pl.sda.patterns.behavioral.mediator;

import java.util.List;

public class TopicMediator implements Mediator {

    private List<BaseConsumer> list;

    public TopicMediator(List<BaseConsumer> list) {
        this.list = list;
    }

    @Override
    public void sendMessage(String msg, BaseConsumer consumer) {

    }

    @Override
    public void addConsumer(BaseConsumer consumer) {

    }
}
