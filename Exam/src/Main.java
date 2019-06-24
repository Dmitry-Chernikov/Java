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

        ArrayList<Student> students = new ArrayList<Student>();;


        Exam exams = new Exam(t.get(0),students);

        File file = new File("Exams.txt");

        if (!file.exists()){
            // Создание файла
                if(file.createNewFile()) {
                    // Создание объекта FileWriter
                    try (FileWriter writer = new FileWriter(file,true)){
                 //       WriteToFile(writer, exams);
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
                 //   WriteToFile(writer, exams);
                    writer.flush();
                    writer.close();
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            } else{//Дописываем
                try (FileWriter writer = new FileWriter(file,false)){
                 //   WriteToFile(writer, exams);
                    writer.flush();
                    writer.close();
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }

        }
    }
        private static void WriteToFile (FileWriter writer, Exam exams) throws IOException {
            /*for (int i = 0; i < exams.students.size(); i++)
                for (int j = 0; j < exams.students.get(i).getRecords().size(); j++) {
                    System.out.println("Студент №"+ exams.students.get(i).getFullName() +
                            " " + exams.students.get(i).getRecords().get(j).getFullNameTeacherRecord() +
                            "(IQ=" + exams.students.get(i).getRecords().get(j).getEvaluation() +
                            ")-" + (exams.students.get(i).getRecords().get(j).getTest() ? "сдал" : "не сдал"));
                    // Запись содержимого в файл
                    writer.write(exams.students.get(i).getFullName() +
                            " " + exams.students.get(i).getRecords().get(j).getFullNameTeacherRecord() +
                            "(IQ=" + exams.students.get(i).getRecords().get(j).getEvaluation() +
                            ")-" + (exams.students.get(i).getRecords().get(j).getTest() ? "сдал" : "не сдал"));
                    writer.append('\n');
                }*/
        }


}
