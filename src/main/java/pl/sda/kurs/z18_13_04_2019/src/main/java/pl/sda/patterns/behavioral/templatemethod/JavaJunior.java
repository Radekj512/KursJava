package pl.sda.patterns.behavioral.templatemethod;

public class JavaJunior extends BootcampStudentTemplate {
    @Override
    protected boolean learnSpring() {
        return improveTheKnowledge("Spring");
    }

    @Override
    protected boolean learnJava() {
        return improveTheKnowledge("Java");
    }

    private boolean improveTheKnowledge(String subject) {
        return true;
    }
}
