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

    /*@Override
    public void testStudent(Student student){

        return student.iq > getIqNeeded() || (double)(student.iq / getIqNeeded()) > (1 - getMoodFactor() * luckFactor);

        if ((student.getIqStudent() > this.expectedIq) || (student.getIqStudent() / this.expectedIq > (1 - this.moodFactor * student.getLuckRatio()))) {
            student.getRecords().add(new Student.Records(this.fullName, student.getIqStudent(), true));
        }else {
            student.getRecords().add(new Student.Records(this.fullName, student.getIqStudent(), false));
        }

    }*/

    // public EnglishTeacher(String fullName, int expectedIq, int moodFactor) {
    //    super(fullName, expectedIq, moodFactor);
    //}
}
