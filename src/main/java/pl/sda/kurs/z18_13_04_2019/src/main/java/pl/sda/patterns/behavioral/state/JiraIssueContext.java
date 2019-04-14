package pl.sda.patterns.behavioral.state;

public class JiraIssueContext implements State {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void assignTo(String name) {
        this.state.assignTo(name);
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
