package Exams.TeachersСomposition;

import Exams.Student;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface Teacher {

    default ArrayList testStudent(Student student) {
        return null;
    }
}
