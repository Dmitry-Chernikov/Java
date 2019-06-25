package Exams;

import Exams.TeachersСomposition.AbstractTeacher;
import Exams.TeachersСomposition.EnglishTeacher;
import Exams.TeachersСomposition.MathTeacher;

import java.util.ArrayList;

import static java.lang.Math.random;

public class Exam  {
    private Student students;
    private AbstractTeacher abstractTeacher;



    public Exam (AbstractTeacher abstractTeacher, Student students) {
        this.students = students;
        this.abstractTeacher = abstractTeacher;

        for (int i = 0; i < students.size(); i++) {
            students.get(i).setFullName(String.valueOf(i));
            students.get(i).setIqStudent(abstractTeacher.getExpectedIQ() + (int)(random() * (abstractTeacher.getExpectedIQ() *0.1)));
            students.get(i).setLuckRatio((int) (random() * 1));
        }
        /*for (int i = 0; i < 10; i++) {
            students.add(new Student(String.valueOf(i),abstractTeacher.getExpectedIQ() + (int)(random() * (abstractTeacher.getExpectedIQ() *0.1)),(int) (random() * 1)));
        }*/
        /*for (Student student:students) {
            student.setFullName(String.valueOf(student.size() - (student.size()-1)));
            student.setIqStudent(abstractTeacher.getExpectedIQ() + (int)(random() * (abstractTeacher.getExpectedIQ() *0.1)));
            student.setLuckRatio((int) (random() * 1));
            System.out.println(student.getFullName());
            System.out.println(student.getIqStudent());
        }*/

    }
    public StringBuilder Start (){

        StringBuilder results = new StringBuilder();

        students.forEach(s -> abstractTeacher.testStudent(s));

        students.forEach(s -> s.getRecords().forEach(r -> results
                .append("Студент №")
                .append(s.getFullName())
                .append(" ")
                .append(r.getFullNameTeacherRecord())
                .append(" (IqT-")
                .append(abstractTeacher.getExpectedIQ())
                .append(") (IqS-")
                .append(r.getEvaluation())
                .append(") ")
                .append((r.getTest() ? "сдал" : "не сдал"))
                .append('\n')));

        return  results;
    }
}

