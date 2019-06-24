package Exams;

import Exams.TeachersСomposition.EnglishTeacher;
import Exams.TeachersСomposition.MathTeacher;

import java.util.ArrayList;

import static java.lang.Math.random;

public class Exam  {
    public ArrayList<Student> students = new ArrayList<Student>();
    public MathTeacher mathteacher = new MathTeacher("Гульсия Янусовна", 200,(int)(random() * 1));
    public EnglishTeacher englishteacher = new EnglishTeacher("Ядвига Виктровна", 200,(int)(random() * 1));

    public void  start ()
    {
        for (int i = 0; i < 9; i++) {
            students.add(new Student(String.valueOf(i), (int)(random() * (mathteacher.getExpectedIQ())+10),(int)(random() * 1)));
            mathteacher.testStudent(students.get(i));
            englishteacher.testStudent(students.get(i));
        }
    }
}

