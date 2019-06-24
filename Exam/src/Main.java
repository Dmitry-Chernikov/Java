import Exams.Exam;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        Exam exams = new Exam();

        File file = new File("Exams.txt");

        if (!file.exists()){
            // Создание файла
            try
            {
                if(file.createNewFile())
                {
                    // Создание объекта FileWriter
                    FileWriter writer = new FileWriter(file);

                    for (int i = 0 ;  i < exams.students.size(); i++)
                        for (int j = 0; j < exams.students.get(i).getRecords().size(); j++) {
                            System.out.println(exams.students.get(i).getFullName()+
                                    " "+exams.students.get(i).getRecords().get(j).getFullNameTeacherRecord() +
                                    "(IQ=" + exams.students.get(i).getRecords().get(j).getEvaluation() +
                                    ")-" + exams.students.get(i).getRecords().get(j).getTest());
                            // Запись содержимого в файл
                            writer.write(exams.students.get(i).getFullName()+
                                    " "+exams.students.get(i).getRecords().get(j).getFullNameTeacherRecord() +
                                    "(IQ=" + exams.students.get(i).getRecords().get(j).getEvaluation() +
                                    ")-" + exams.students.get(i).getRecords().get(j).getTest());
                            writer.append('\n');
                        }


                    writer.flush();
                    writer.close();
                }

            }
            catch(IOException ex){


            }
        }
        else
        {
            //Если существует проверить пустой или нет
            if (file.length() == 0) {
                return;
            }
            //Дописываем

        }

    }
}
