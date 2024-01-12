package classes;

import java.util.ArrayList;
import java.util.List;

public class MockClassesManager implements ManagerCourseOperations {

    private List<Course> courses;

    public MockClassesManager() {
        this.courses = new ArrayList<>();
    }

    @Override
    public void AddCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void UpdateCourse(Course updatedCourse) {

        for (Course course : courses) {
            if (course.getName().equals(updatedCourse.getName())) {
                // Update the existing course with the new information
                course.setDescription(updatedCourse.getDescription());
                course.setTeacher(updatedCourse.getTeacher());
                course.setStudentsSet(updatedCourse.getStudentsSet());
                break;
            }
        }
    }

    @Override
    public void DeleteCourse(Course courseToDelete) {
        courses.removeIf(course -> course.getName().equals(courseToDelete.getName()));
    }

    public ArrayList<Course> GenerateCourses() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrei", "Negoita", 2231));
        students.add(new Student("Ion", "Matescu", 4221));

        Professor prof = new Professor("Anton", "Panaitescu");

        courses.add(new Course("Rezistenta Materialelor",
                "calculul reactiunilor,\n" + "diagramele de eforturi,calculul caracteristicilor" +
                        "geometrice ale \n" + "suprafetelor plane si calculul elementelor de rezistenta la solicitari simple \n",
                prof));

        return new ArrayList<>(courses);
    }


    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }
}