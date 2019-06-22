package Exams.TeachersСomposition;

import Exams.Student;
import java.util.ArrayList;

public class AbstractTeacher extends  ArrayList implements Teacher {
    private String fullname; //ФИО
    private int expectediq; // Ожидаемый IQ
    private int moodfactor; // Коэффициент настроения

    public AbstractTeacher(String fullname, int expectediq, int moodfactor){
        this.fullname = fullname;
        this.expectediq = expectediq;
        this.moodfactor = moodfactor;
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
    public ArrayList testStudent(Student student){
        if ((student.getIQStudent() > this.expectediq) || (student.getIQStudent() / this.expectediq > (1 - this.moodfactor * student.getLuckRatio()))) {
            student.getRecords().add(new Student.Records(this.fullname, student.getIQStudent(), true));
            return student.getRecords();
        }else {
            student.getRecords().add(new Student.Records(this.fullname, student.getIQStudent(),  false));
            return student.getRecords();
        }
    }

}
