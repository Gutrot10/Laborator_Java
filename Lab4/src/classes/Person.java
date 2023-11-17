package classes;

public abstract class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public abstract int compareTo(Student otherStudent);

    @Override
    public String toString(){
        return "Person(" + "name=" + name + ",surname=" + surname + ")";
    }
}
