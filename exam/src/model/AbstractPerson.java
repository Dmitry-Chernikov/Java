package model;

public abstract class AbstractPerson {
    private String lastName;
    private String firstName;
    private String middleName;

    public abstract void display();

    public AbstractPerson() {
    }

    public AbstractPerson(String fullName){
        String[] fIO = fullName.split(" +");
        this.lastName = fIO[0];
        this.firstName = fIO[1];
        this.middleName = fIO[2];
    }

    String getFullName() {
        return String.join(" ", lastName, firstName, middleName);
    }

    void setFullName(String fullName) {
        String[] fIO = fullName.split(" +");
        this.lastName = fIO[0];
        this.firstName = fIO[1];
        this.middleName = fIO[2];
    }



}
