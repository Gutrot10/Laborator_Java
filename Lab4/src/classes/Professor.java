package classes;

public class Professor extends Person {


    public Professor(String name, String surname) {
        super(name, surname);
    }

    public String getFullName() {
        return getName() + " " + getSurname();
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
        return "Professor{" + "name=" + getName() + ", surame=" +
                getSurname() + '}';
    }


}

