package Exams;

import Exams.TeachersСomposition.AbstractTeacher;
import Exams.TeachersСomposition.EnglishTeacher;
import Exams.TeachersСomposition.MathTeacher;

import java.util.ArrayList;

import static java.lang.Math.random;

public class Exam  {
    public ArrayList<Student> students;
    //public MathTeacher mathteacher;
    //public EnglishTeacher englishteacher;

    public Exam (AbstractTeacher abstractTeacher, ArrayList students) {
        //students = new ArrayList<Student>();
        //mathteacher = new MathTeacher("Гульсия Янусовна", 200,(int)(random() * 1));
        //englishteacher = new EnglishTeacher("Ядвига Виктровна", 200,(int)(random() * 1));
        for (int i = 0; i < 9; i++) {

            students.add(new Student(String.valueOf(i), (int)(random() * (abstractTeacher.getExpectedIQ())*0.1),(int)(random() * 1)));

            //abstractTeacher.testStudent(students.get(i));
        }
    }
}

