package Exams;

import java.util.ArrayList;

public class Student extends ArrayList<Student>  {

    private String fullName; //ФИО
    private int iqStudent; //IQ студент
    private int luckRatio; //Коэффициент удачи
    //private ArrayList<Records>  records = new ArrayList<Records>();
    private Records records = new Records();;


    public Student() {

    }

    public Student(int initialCapacity) {
        for (int i = 0; i < initialCapacity; i++) {
            this.add(new Student());
        }
        //super(initialCapacity);
    }

    public Student(String fullName, int iqStudent, int luckRatio) {
        this.fullName = fullName;
        this.iqStudent = iqStudent;
        this.luckRatio = luckRatio;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIqStudent() {
        return iqStudent;
    }

    public void setIqStudent(int iqStudent) {
        this.iqStudent = iqStudent;
    }

    public int getLuckRatio() {
        return luckRatio;
    }

    public void setLuckRatio(int luckRatio) {
        this.luckRatio = luckRatio;
    }

    public Records getRecords() {
        return records;
    }

    public void setRecords(Records records) {
        this.records = records;
    }

    public static class Records extends ArrayList<Records> {
        private String fullNameTeacherRecord; //Полное имя учителя
        private int evaluation; //Оценка
        private boolean test; //Зачёт

        Records() {

        }

        public Records(String fullNameTeacherRecord, int evaluation, boolean test) {
            this.fullNameTeacherRecord = fullNameTeacherRecord;
            this.evaluation = evaluation;
            this.test = test;
        }


        public String getFullNameTeacherRecord() {
            return fullNameTeacherRecord;
        }

        public int getEvaluation() {
            return evaluation;
        }

        public boolean getTest() {
            return test;
        }




    }

}

