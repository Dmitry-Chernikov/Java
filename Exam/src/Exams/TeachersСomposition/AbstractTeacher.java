package Exams.TeachersСomposition;

import Exams.Student;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;

public class AbstractTeacher extends  ArrayList<AbstractTeacher> implements Teacher {
    private String fullname; //ФИО
    private int expectediq; // Ожидаемый IQ
    private int moodfactor; // Коэффициент настроения

    public AbstractTeacher(String fullname, int expectediq, int moodfactor){
        this.fullname = fullname;
        this.expectediq = expectediq;
        this.moodfactor = moodfactor;
    }

    public AbstractTeacher() {

    }

    public String getFullName() {
        return fullname;
    }

    public int getExpectedIQ() {
        return expectediq;
    }

    public int getMoodFactor() {
        return moodfactor;
    }

    @Override
    public void testStudent(Student student){
        if ((student.getIQStudent() > this.expectediq) || (student.getIQStudent() / this.expectediq > (1 - this.moodfactor * student.getLuckRatio()))) {
           // new Student.Records(this.fullname, student.getIQStudent(), true).add(student.getRecords());
            student.getRecords().add(new Student.Records(this.fullname, student.getIQStudent(), true));
        }else {
            student.getRecords().add(new Student.Records(this.fullname, student.getIQStudent(), false));
        }
    }
}
