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

        int lastNameComparison = this.surname.compareTo(otherStudent.surname);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }


        return this.name.compareTo(otherStudent.name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        if (groupNumber != student.groupNumber) return false;
        if (!name.equals(student.name)) return false;
        return surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + groupNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}