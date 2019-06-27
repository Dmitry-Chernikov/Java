package model;

import static java.lang.Math.random;

public class Exam  {
    private StudentMagazine students;
    private AbstractTeacher abstractTeacher;

    public Exam (AbstractTeacher abstractTeacher, StudentMagazine students) {
        this.students = students;
        this.abstractTeacher = abstractTeacher;

        students.forEach(s -> {
            s.setFullName(String.valueOf(students.indexOf(s)));
            s.setIqStudent(abstractTeacher.getExpectedIQ() + (int)(random() * (abstractTeacher.getExpectedIQ() *0.1)));
            s.setLuckRatio((int) (random() * 1));
        });
    }

    public void Start (){
        students.forEach(s -> abstractTeacher.testStudent(s));
    }
}

