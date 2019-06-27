package model;

import static java.lang.Math.random;

public class Exam  {
    private StudentMagazine students;
    private AbstractTeacher abstractTeacher;

    public Exam (AbstractTeacher abstractTeacher, StudentMagazine students) {
        this.students = students;
        this.abstractTeacher = abstractTeacher;

        for (int i = 0; i < students.size(); i++) {
            students.get(i).setFullName(String.valueOf(i));
            students.get(i).setIqStudent(abstractTeacher.getExpectedIQ() + (int)(random() * (abstractTeacher.getExpectedIQ() *0.1)));
            students.get(i).setLuckRatio((int) (random() * 1));
        }
        /*for (int i = 0; i < 10; i++) {
            students.add(new StudentMagazine(String.valueOf(i),abstractTeacher.getExpectedIQ() + (int)(random() * (abstractTeacher.getExpectedIQ() *0.1)),(int) (random() * 1)));
        }*/
        /*for (StudentMagazine student:students) {
            student.setFullName(String.valueOf(student.size() - (student.size()-1)));
            student.setIqStudent(abstractTeacher.getExpectedIQ() + (int)(random() * (abstractTeacher.getExpectedIQ() *0.1)));
            student.setLuckRatio((int) (random() * 1));
            System.out.println(student.getFullName());
            System.out.println(student.getIqStudent());
        }*/
    }
    public void Start (){
        students.forEach(s -> abstractTeacher.testStudent(s));
    }
}

