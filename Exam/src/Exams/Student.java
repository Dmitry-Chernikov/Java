package Exams;

import java.util.ArrayList;

public class Student  {

    private String fullname; //ФИО
    private int iqstudent; //IQ студент
    private int luckratio; //Коэффициент удачи

    public Records getRecords() {
        return records;
    }

    public void setRecords(Records records) {
        this.records = records;
    }

    private Records records;
    //private ArrayList<Records>  records = new ArrayList<Records>();

    public Student(String fullname, int iqstudent, int luckratio) {
        this.fullname = fullname;
        this.iqstudent = iqstudent;
        this.luckratio = luckratio;
    }

    public String getFullName() {
        Persone newper = new Persone("name", 123);
        return fullname;
    }

    public int getIQStudent() {
        return iqstudent;
    }

    public int getLuckRatio() {
        return luckratio;
    }

    /*public ArrayList<Records> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Records> records) {
       this.records = records;
    }*/

    public static class Records extends ArrayList {
        private String fullnameteacherrecord; //Полное имя учителя
        private int evaluation; //Оценка
        private boolean test; //Зачёт

        public String getFullNameTeacherRecord() {
            return fullnameteacherrecord;
        }

        public int getEvaluation() {
            return evaluation;
        }

        public boolean getTest() {
            return test;
        }


        public Records(String fullnameteacherrecord, int evaluation, boolean test) {
            this.fullnameteacherrecord = fullnameteacherrecord;
            this.evaluation = evaluation;
            this.test = test;
        }

    }

}

