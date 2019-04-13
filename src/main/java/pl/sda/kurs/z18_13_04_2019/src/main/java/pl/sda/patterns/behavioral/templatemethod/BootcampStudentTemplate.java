package pl.sda.patterns.behavioral.templatemethod;

//TODO write junior and senior template
//TODO write test
public abstract class BootcampStudentTemplate {
    public final void completeTheCourse() {
        learnGit();
        learnSpring();
        learnJava();
        learnHibernate();
        ignoreJavascript();
    }

    protected abstract boolean learnSpring();

    protected abstract boolean learnJava();

    private void learnHibernate() {
        //nah, time to learn NoSQL instead
    }

    private void ignoreJavascript() {
        //YUP, only backend!
    }

    private void learnGit() {
        //nah SVN is better
    }
}
