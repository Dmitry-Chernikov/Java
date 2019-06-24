package Exams;

import java.util.ArrayList;

public class Student extends ArrayList<Student>  {

    private String fullname; //ФИО
    private int iqstudent; //IQ студент
    private int luckratio; //Коэффициент удачи

    //private ArrayList<Records>  records = new ArrayList<Records>();
    private Records records = new Records();;

    public Student() {

    }

    public Student(String fullname, int iqstudent, int luckratio) {
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

    public Records getRecords() {
        return records;
    }

    public void setRecords(Records records) {
        this.records = records;
    }

    public static class Records extends ArrayList<Records> {
        private String fullnameteacherrecord; //Полное имя учителя
        private int evaluation; //Оценка
        private boolean test; //Зачёт

        Records() {

        }

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

