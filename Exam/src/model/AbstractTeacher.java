package model;

import java.util.ArrayList;

public class AbstractTeacher extends  ArrayList<AbstractTeacher> implements Teacher {
    private String fullName; //ФИО
    private int expectedIq; // Ожидаемый IQ
    private int moodFactor; // Коэффициент настроения

    public AbstractTeacher(String fullName, int expectedIq, int moodFactor){
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
        if ((studentMagazine.getIqStudent() > this.expectedIq) || (studentMagazine.getIqStudent() / this.expectedIq > (1 - this.moodFactor * studentMagazine.getLuckRatio()))) {
           // new StudentMagazine.Records(this.fullname, studentMagazine.getIQStudent(), true).add(studentMagazine.getRecords());
            studentMagazine.getRecords().add(new StudentMagazine.Records(this.fullName, studentMagazine.getIqStudent(), true));
        }else {
            studentMagazine.getRecords().add(new StudentMagazine.Records(this.fullName, studentMagazine.getIqStudent(), false));
        }

    }
}