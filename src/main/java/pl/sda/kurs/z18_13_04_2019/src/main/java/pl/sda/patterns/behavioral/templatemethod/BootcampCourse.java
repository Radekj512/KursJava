package pl.sda.patterns.behavioral.templatemethod;

//TODO fill methods, write tests
public class BootcampCourse {
    public void init() {
        BootcampStudentTemplate student = new JavaJunior();
        student.completeTheCourse();
    }
}
