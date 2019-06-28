package model;
import java.util.ArrayList;

//Реализация общих своитв и методов учителя
public class AbstractTeacher implements Teacher {
    private String fullName; //ФИО
    private int expectedIq; // Ожидаемый IQ
    private int moodFactor; // Коэффициент настроения

    AbstractTeacher(String fullName, int expectedIq, int moodFactor){
        this.fullName = fullName;
        this.expectedIq = expectedIq;
        this.moodFactor = moodFactor;
    }

    public AbstractTeacher() {

    }

    public String getFullName() {
        return fullName;
    }

    public int getExpectedIQ() {
        return expectedIq;
    }

    public int getMoodFactor() {
        return moodFactor;
    }

    @Override
    public void testStudent(StudentMagazine studentMagazine){

        return student.iq > getIqNeeded() || (double)(student.iq / getIqNeeded()) > (1 - getMoodFactor() * luckFactor);

        if ((studentMagazine.getIqStudent() > this.expectedIq) || (studentMagazine.getIqStudent() / this.expectedIq > (1 - this.moodFactor * studentMagazine.getLuckRatio()))) {
            studentMagazine.getRecords().add(new StudentMagazine.Records(this.fullName, studentMagazine.getIqStudent(), true));
        }else {
            studentMagazine.getRecords().add(new StudentMagazine.Records(this.fullName, studentMagazine.getIqStudent(), false));
        }

    }
}
