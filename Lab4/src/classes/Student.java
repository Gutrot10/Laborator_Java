package classes;

public class Student extends Person {
    int groupNumber;

    public Student(String firstName, String lastName, int groupNumber) {
        super(firstName, lastName);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


    @Override
    public int compareTo(Student otherStudent) {
        int lastNameComparison = this.getSurname().compareTo(otherStudent.getSurname());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        return this.getName().compareTo(otherStudent.getName());
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