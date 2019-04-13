package pl.sda.patterns.behavioral.interpreter;

//TODO context should contain tables with data
//TODO we should pass our conditions to the context
//TODO and use them during search query invocation
public class Context {
    private String projection;
    private String table;
    private String condition;
}
