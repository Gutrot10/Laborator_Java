package classes;

public class Professor extends classes.Person {


    public Professor(String name, String surname) {
        super(name, surname);
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }
    @Override
    public int compareTo(Student otherStudent) {
        return 0;
    }

    @Override
    public String toString() {
        return "Professor{" + "name=" + name + ", surame=" +
                surname + '}';
    }


}

