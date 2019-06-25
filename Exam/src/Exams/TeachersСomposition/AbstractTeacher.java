package Exams.TeachersСomposition;

import Exams.Student;
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
    public void testStudent(Student student){
        if ((student.getIqStudent() > this.expectedIq) || (student.getIqStudent() / this.expectedIq > (1 - this.moodFactor * student.getLuckRatio()))) {
           // new Student.Records(this.fullname, student.getIQStudent(), true).add(student.getRecords());
            student.getRecords().add(new Student.Records(this.fullName, student.getIqStudent(), true));
        }else {
            student.getRecords().add(new Student.Records(this.fullName, student.getIqStudent(), false));
        }

    }
}
