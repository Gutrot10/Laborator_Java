package classes;

public abstract class Person {
    String name;
    String surname;

    @Override
    public String toString(){
        return "Person(" + "name=" + ",surname=" + surname + ")";
    }
}
