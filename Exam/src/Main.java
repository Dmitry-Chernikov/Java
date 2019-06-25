import Exams.Exam;
import Exams.Exam.*;
import Exams.TeachersСomposition.AbstractTeacher;
import Exams.TeachersСomposition.EnglishTeacher;
import Exams.TeachersСomposition.MathTeacher;
import Exams.Student;
import java.util.*;
import java.io.*;
import static java.lang.Math.random;

public class Main {
    public static void main(String args[]) throws IOException {

        AbstractTeacher t = new AbstractTeacher();
        t.add(new EnglishTeacher("Гульсия Янусовна", (int)(random() *100),(int)(random() * 1)));
        t.add(new MathTeacher("Ядвига Виктровна", (int)(random() *200),(int)(random() * 1)));
        //

        Student students = new Student(10);

        Exam exams = new Exam(t.get(0),students);


        System.out.println( exams.Start().toString());

        File file = new File("Exams.txt");

        if (!file.exists()){
            // Создание файла
                if(file.createNewFile()) {
                    // Создание объекта FileWriter
                    try (FileWriter writer = new FileWriter(file,true)){
                        WriteToFile(writer, students, t.get(0));
                        writer.flush();
                        writer.close();
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                }
        }
        else {//Если существует проверить пустой или нет
            if (file.length() == 0) {
                try (FileWriter writer = new FileWriter(file,true)){
                    WriteToFile(writer, students, t.get(0));
                    writer.flush();
                    writer.close();
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            } else{//Дописываем
                try (FileWriter writer = new FileWriter(file,false)){
                    WriteToFile(writer, students, t.get(0));
                    writer.flush();
                    writer.close();
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }

        }
    }
        private static void WriteToFile (FileWriter writer, Student students, AbstractTeacher abstractteacher) throws IOException {
            for (Student student : students)
                for (int j = 0; j < student.getRecords().size(); j++) {
                    System.out.println("Студент №" + student.getFullName() +
                            " " + student.getRecords().get(j).getFullNameTeacherRecord() +
                            "(IQT" + abstractteacher.getExpectedIQ() +
                            ") (IQ=" + student.getRecords().get(j).getEvaluation() +
                            ")-" + (student.getRecords().get(j).getTest() ? "сдал" : "не сдал"));
                    // Запись содержимого в файл
                    writer.write(student.getFullName() +
                            " " + student.getRecords().get(j).getFullNameTeacherRecord() +
                            "(IQ=" + student.getRecords().get(j).getEvaluation() +
                            ")-" + (student.getRecords().get(j).getTest() ? "сдал" : "не сдал"));
                    writer.append('\n');
                }
        }


}
