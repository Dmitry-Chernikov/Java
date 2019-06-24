package Exams;

import java.util.ArrayList;

public class Student  {

    private String fullname; //ФИО
    private int iqstudent; //IQ студент
    private int luckratio; //Коэффициент удачи
    private ArrayList<Records>  records = new ArrayList<Records>();

    Student(String fullname, int iqstudent, int luckratio) {
        this.fullname = fullname;
        this.iqstudent = iqstudent;
        this.luckratio = luckratio;
    }

    public String getFullName() {
        return fullname;
    }

    public int getIQStudent() {
        return iqstudent;
    }

    public int getLuckRatio() {
        return luckratio;
    }

    public ArrayList<Records> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Records> records) {
       this.records = records;
    }

    public static class Records {
        private String fullnameteacherrecord; //Полное имя учителя
        private int evaluation; //Оценка
        private boolean test; //Зачёт

        public Records(String fullnameteacherrecord, int evaluation, boolean test) {
            this.fullnameteacherrecord = fullnameteacherrecord;
            this.evaluation = evaluation;
            this.test = test;
        }


        public String getFullNameTeacherRecord() {
            return fullnameteacherrecord;
        }

        public int getEvaluation() {
            return evaluation;
        }

        public boolean getTest() {
            return test;
        }




    }

}

