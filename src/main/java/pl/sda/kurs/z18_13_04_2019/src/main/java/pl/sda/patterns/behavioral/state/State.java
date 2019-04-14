package pl.sda.patterns.behavioral.state;

//TODO implement a new states for jira task
//TODO, INPROGRESS, CODEREVIEW, IN TESTING, DONE
public interface State {

    void assignTo(String name);

    void doAction();
}
