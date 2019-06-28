package model;
//Поведение учителея (проверка усвоенного материала)
public interface Teacher {

    default void testStudent(StudentMagazine studentMagazine) { }
}
