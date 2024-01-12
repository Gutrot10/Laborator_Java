package classes;

public class Professor extends Person {

    public Professor() {
        super("", ""); // Default constructor with empty strings for names
    }

    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                '}';
    }
}
