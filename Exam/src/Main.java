import model.Exam;
import model.AbstractTeacher;
import model.EnglishTeacher;
import model.MathTeacher;
import model.StudentMagazine;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import static java.lang.Math.random;

public class Main {
    public static void main(String args[]) throws IOException {

        AbstractTeacher tArray = new AbstractTeacher();
        tArray.add(new EnglishTeacher("Гульсия Янусовна", (int)(random() *100),(int)(random() * 1)));
        tArray.add(new MathTeacher("Ядвига Виктровна", (int)(random() *200),(int)(random() * 1)));

        StudentMagazine students = new StudentMagazine(10);

        for (int i = 0; i < tArray.size(); i++)
            try (FileWriter writer = new FileWriter(tArray.get(i).getClass().getSimpleName() +
                    " " + new SimpleDateFormat("dd.MM.yyyy").format(new Date()) + " model.txt")) {
                writer.write(WriteToFileStr(students, tArray.get(i), i).toString());
                writer.append('\n');
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }

    private static StringBuilder WriteToFileStr (StudentMagazine students, AbstractTeacher abstractTeacher, int index) throws IOException {
        StringBuilder results = new StringBuilder();
        new Exam(abstractTeacher,students).Start();
        for (StudentMagazine studentMagazine : students){
            results
                    .append("Студент №")
                    .append(studentMagazine.getFullName())
                    .append(" ")
                    .append(studentMagazine.getRecords().get(index).getFullNameTeacherRecord())
                    .append(" (IqT-")
                    .append(abstractTeacher.getExpectedIQ())
                    .append(") (IqS-")
                    .append(studentMagazine.getRecords().get(index).getEvaluation())
                    .append(") ")
                    .append((studentMagazine.getRecords().get(index).getTest() ? "сдал" : "не сдал"))
                    .append('\n');
        }
        System.out.println(results.toString());
        return results.append('\n');
    }


}
