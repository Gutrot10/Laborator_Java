package classes;
import java.util.ArrayList;
import java.util.List;

public class Classes {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Andrei", "Negoita", 2231);
        Student student2 = new Student("Ion", "Matescu", 4221);


        Professor prof = new Professor("Anton", "Panaitescu");
        Professor prof2 = new Professor("Cornel","Iancu");
        Course course = new Course("Material Resistance",
                "Calculations of reactions , \n" +
                        "effort diagrams, calculations of geometric characteristics of \n" +
                        "flat surfaces and calculations of resistance elements to simple stresses",
                prof, students);
        Course course2 = new Course("nume","descriere",prof2,students);
        CourseManager courseManager = new CourseManager();
        courseManager.AddCourse(course);
        course.addStudent(student1);
        course.addStudent(student2);
        courseManager.DisplayCoursesToConsole();


        Student newStudent = new Student("Matei", "Popescu", 2331);
        course.addStudent(newStudent);


        Student updatedStudent = new Student("Updated", "Student", 1234);
        course.UpdateStudent(updatedStudent);

        course.RemoveStudent(student2);
        courseManager.UpdateCourse(course);
        courseManager.DeleteCourse(course2);
        courseManager.DisplayCoursesToConsole();
    }
}