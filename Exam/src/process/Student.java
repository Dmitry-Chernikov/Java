package process;

import java.util.ArrayList;

public class Student {
    public String FullName; //ФИО
    public int IQStudent; //IQ студент
    public int LuckRatio; //Коэффициент удачи
    public ArrayList<Records>  records = new ArrayList<Records>();
    public Student (){

    }
    public Student (String FullName, int IQStudent, int LuckRatio){
        this.FullName =  FullName;
        this.IQStudent = IQStudent;
        this.LuckRatio = LuckRatio;
    }

    public static class Records {
        public String FullNameTeacher; //Полное имя учителя
        public int Evaluation; //Оценка
        public boolean Test; //Зачёт

        public Records() {

        }

        public Records(String FullNameTeacher, int Evaluation, boolean Test) {
            this.FullNameTeacher = FullNameTeacher;
            this.Evaluation = Evaluation;
            this.Test = Test;
        }
    }

}

