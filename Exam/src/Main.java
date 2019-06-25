import Exams.Exam;
import Exams.TeachersСomposition.AbstractTeacher;
import Exams.TeachersСomposition.EnglishTeacher;
import Exams.TeachersСomposition.MathTeacher;
import Exams.Student;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import static java.lang.Math.random;

public class Main {
    public static void main(String args[]) throws IOException {

        AbstractTeacher tArray = new AbstractTeacher();
        tArray.add(new EnglishTeacher("Гульсия Янусовна", (int)(random() *100),(int)(random() * 1)));
        tArray.add(new MathTeacher("Ядвига Виктровна", (int)(random() *200),(int)(random() * 1)));

        Student students = new Student(10);

        for (int i = 0; i < tArray.size(); i++)
            try (FileWriter writer = new FileWriter(tArray.get(i).getClass().getSimpleName() +
                    " " + new SimpleDateFormat("dd.MM.yyyy").format(new Date()) + " Exams.txt")) {
                writer.write(WriteToFileStr(students, tArray.get(i), i).toString());
                writer.append('\n');
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }

    private static StringBuilder WriteToFileStr (Student students, AbstractTeacher abstractTeacher, int index) throws IOException {
        StringBuilder results = new StringBuilder();
        new Exam(abstractTeacher,students).Start();
        for (Student student : students){
            results
                    .append("Студент №")
                    .append(student.getFullName())
                    .append(" ")
                    .append(student.getRecords().get(index).getFullNameTeacherRecord())
                    .append(" (IqT-")
                    .append(abstractTeacher.getExpectedIQ())
                    .append(") (IqS-")
                    .append(student.getRecords().get(index).getEvaluation())
                    .append(") ")
                    .append((student.getRecords().get(index).getTest() ? "сдал" : "не сдал"))
                    .append('\n');
        }
        System.out.println(results.toString());
        return results.append('\n');
    }


}
