package process;
import java.util.ArrayList;
import static java.lang.Math.random;

public class Instance {

    public ArrayList<Student> students = new ArrayList<Student>();
    public MathTeacher mathteacher = new MathTeacher("Гульсия Янусовна", 200,(int)(random() * 1));
    public EnglishTeacher englishteacher = new EnglishTeacher("Ядвига Виктровна", 200,(int)(random() * 1));

    public  Instance () {
        for (int i = 0; i < 9; i++) {
            students.add(new Student(String.valueOf(i), (int)(random() * (mathteacher.ExpectedIQ)+10),(int)(random() * 1)));
            mathteacher.testStudent(students.get(i));
            englishteacher.testStudent(students.get(i));
        }
    }

}
