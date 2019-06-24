package Exams.TeachersСomposition;

import Exams.Student;

public interface Teacher {

    default void testStudent(Student student) {
    }
}
