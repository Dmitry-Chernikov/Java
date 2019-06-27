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
        tArray.add(new EnglishTeacher("Гульсия Янусовна", (int) (random() * 100), (int) (random() * 1)));
        tArray.add(new MathTeacher("Ядвига Виктровна", (int) (random() * 200), (int) (random() * 1)));

        StudentMagazine smArray = new StudentMagazine(10);

        tArray.forEach(t -> {
            try (FileWriter writer = new FileWriter(t.getClass().getSimpleName() +
                    " " + new SimpleDateFormat("dd.MM.yyyy").format(new Date()) + " model.txt")) {
                smArray.forEach(s -> {
                    new Exam(t, s).Start();
                    try {
                        writer.write(" ");
                        /*writer.write(new StringBuilder()
                                .append("Студент №")
                                .append(s.getFullName())
                                .append(" ")
                                .append(s.getRecords().get(tArray.indexOf(t)).getFullNameTeacherRecord())
                                .append(" (IqT-")
                                .append(t.getExpectedIQ())
                                .append(") (IqS-")
                                .append(s.getRecords().get(tArray.indexOf(t)).getEvaluation())
                                .append(") ")
                                .append((s.getRecords().get(tArray.indexOf(t)).getTest() ? "сдал" : "не сдал"))
                                .append('\n' + '\n')
                                .toString());*/

                        writer.append('\n');
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });
    }
}
