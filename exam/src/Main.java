import model.Exam;
import model.AbstractTeacher;
import model.EnglishTeacher;
import model.MathTeacher;
import model.Student;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import static java.lang.Math.random;

public class Main {
    public static void main(String args[]) throws IOException {

        ArrayList <AbstractTeacher> tArray = new ArrayList<>();
        tArray.add(new EnglishTeacher("Абдулова Гульсия Янусовна ", (int) (random() * 100), (int) (random() * 1)));
        tArray.add(new MathTeacher("Чернова Ядвига Виктровна", (int) (random() * 200), (int) (random() * 1)));

        ArrayList<Student> sArray = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            sArray.add(new Student());
        }

        tArray.forEach(t -> {
            Exam exam = new Exam(t, sArray);
            try (FileWriter writer = new FileWriter(t.getClass().getSimpleName() +
                    " " + new SimpleDateFormat("dd.MM.yyyy").format(new Date()) + " model.txt")) {
                sArray.forEach(s -> {
                    try {
                        writer.write(new StringBuilder()
                                .append("Студент - ")
                                .append(s.getFullName())
                                .append(" -> ")
                                .append(t.getFullName())
                                .append(" (IqT-")
                                .append(t.getExpectedIQ())
                                .append(") (IqS-")
                                .append(s.getIqStudent())
                                .append(") -> ")
                                .append((exam.Start(t, s) ? "сдал" : "не сдал"))
                                .toString());
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
