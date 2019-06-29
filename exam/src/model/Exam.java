package model;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.random;

public class Exam  {

    private ArrayList<String> lastName = new ArrayList<String>(
            Arrays.asList("Кирил", "Дмитрий", "Вячеслав", "Игорь", "Илья",
                          "Тамерлан", "Ильмир", "Александр", "Георгий", "Владимир"));

    private ArrayList<String> firstName = new ArrayList<String>(
            Arrays.asList("Абрамов", "Путин", "Жуйков", "Тузов", "Кузнецов",
                          "Насыбулин", "Токарев", "Свистунов", "Нарышкин", "Чемезов", "Абрамян"));

    private ArrayList<String> middleName = new ArrayList<String>(
            Arrays.asList("Дмитривич", "Александрович", "Георгиевич", "Константинович", "Сергеевич",
                          "Иванович", "Вяславович", "Антонович", "Владимирович", "Павлович"));

    public Exam (AbstractTeacher abstractTeacher, ArrayList<Student> students) {

            students.stream().forEach(s -> {
            s.setFullName(lastName.get((int)(random()*9))+
                    " "+firstName.get((int)(random()*9))+
                    " "+middleName.get((int)(random()*9)));
            s.setIqStudent(abstractTeacher.getExpectedIQ() + (int)(random() * (abstractTeacher.getExpectedIQ() *0.2)));
            s.setLuckRatio((int) (random() * 1));
        });
    }

    public boolean Start (AbstractTeacher abstractTeacher, Student student){
        return abstractTeacher.testStudent(student);
    }
}

