import Exams.Exams;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        Exams exams = new Exams();

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
                                    " "+exams.students.get(i).getRecords().get(j).FullNameTeacher +
                                    "(IQ=" + exams.students.get(i).getRecords().get(j).Evaluation +
                                    ")-" + exams.students.get(i).getRecords().get(j).Test);
                            // Запись содержимого в файл
                            writer.write(exams.students.get(i).getFullName()+" "+exams.students.get(i).getRecords().get(j).FullNameTeacher + "(IQ=" + exams.students.get(i).getRecords().get(j).Evaluation + ")-" + exams.students.get(i).getRecords().get(j).Test);
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
