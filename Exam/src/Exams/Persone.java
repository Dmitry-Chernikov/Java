package Exams;
import java.util.ArrayList;

public class Persone extends ArrayList {
        private String namePerson;
        private int yearsPerson;

        public Persone() {
        }

        public Persone(String namePerson, int yearsPerson) {
            this.namePerson = namePerson;
            this.yearsPerson = yearsPerson;

        }

        public void setNamePerson(String name) {
            namePerson = name;
        }

        public void setYearsPerson(int years) {
            yearsPerson = years;
        }

        public String getNamePerson() {
            return namePerson;
        }

        public int getYearsPerson() {
            return yearsPerson;
        }


}
