package pl.sda.patterns.behavioral.chainofresponsibility;

//TODO Implement simple logger, sth
//TODO which will print message to the:
//TODO 1. console
//TODO 2. file
//TODO 3. collection
public interface Chain {

    void setNext(Chain nextInChain);

    void process(String message);

}
