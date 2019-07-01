package model;

public class Student extends AbstractPerson {
    private int iqStudent; //IQ студент
    private int luckRatio; //Коэффициент удачи

    public Student() {

    }

    public Student(String fullName, int iqStudent, int luckRatio) {
        super(fullName);
        this.iqStudent = iqStudent;
        this.luckRatio = luckRatio;
    }

    @Override
    public void display() {
        System.out.println(this.getFullName());
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    void setFullName(String fullName) {
        super.setFullName(fullName);
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

}

