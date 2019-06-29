package model;

//Реализация общих своитв и методов учителя
public abstract class AbstractTeacher extends AbstractPerson implements Teacher  {
    private int expectedIq; // Ожидаемый IQ
    private int moodFactor; // Коэффициент настроения

    AbstractTeacher(String fullName, int expectedIq, int moodFactor){
        super(fullName);
        this.expectedIq = expectedIq;
        this.moodFactor = moodFactor;
    }

    public AbstractTeacher() {
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    public int getExpectedIQ() {
        return expectedIq;
    }

    public int getMoodFactor() {
        return moodFactor;
    }

    @Override
    public abstract boolean testStudent(Student student);
}
