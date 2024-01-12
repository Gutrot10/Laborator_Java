package classes;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int groupNumber;

    public Student() {
        super("", "");
        this.groupNumber = 0;
    }

    public Student(String firstName, String lastName, int groupNumber) {
        super(firstName, lastName);
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }


}
