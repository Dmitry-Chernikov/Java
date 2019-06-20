package process;
import java.io.*;

public class EnglishTeacher implements Teacher {
    public String FullName; //ФИО
    public int ExpectedIQ; // Ожидаемый IQ
    public int MoodFactor; // Коэффициент настроения
    public EnglishTeacher(){
    }
    public EnglishTeacher(String FullName, int ExpectedIQ, int MoodFactor){
        this.FullName = FullName;
        this.ExpectedIQ = ExpectedIQ;
        this.MoodFactor = MoodFactor;
    }
    public void testStudent(Student student){
        if ((student.IQStudent > this.ExpectedIQ) || (student.IQStudent / this.ExpectedIQ > (1 - this.MoodFactor * student.LuckRatio))) {
            student.records.add(new Student.Records(this.FullName, student.IQStudent, true));
        }else
        {
            student.records.add(new Student.Records(this.FullName, student.IQStudent, false));
        }
    }
}
