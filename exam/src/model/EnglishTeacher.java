package model;

public class EnglishTeacher  extends AbstractTeacher {
    public EnglishTeacher(String fullName, int expectedIq, int moodFactor) {
        super(fullName, expectedIq, moodFactor);
    }

    @Override
    public boolean testStudent(Student student) {
        return student.getIqStudent() > this.getExpectedIQ() || (double)(student.getIqStudent() / this.getExpectedIQ()) > (1 - this.getMoodFactor() * student.getLuckRatio());
    }

    @Override
    public void display() {
        System.out.println(this.getFullName());
    }
}
