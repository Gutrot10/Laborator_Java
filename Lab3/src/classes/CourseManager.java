package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class CourseManager implements ManagerCourseOperations {

        List<Course> courses;
        public CourseManager() {
            courses = new ArrayList<>();
        }

        public void AddCourse(Course course) {
            courses.add(course);
        }

        @Override
        public void UpdateCourse(Course courseToUpdate) {
            for (Course currentCourse : courses) {
                if (currentCourse.getName().equals(courseToUpdate.getName())) {
                    currentCourse.setDescription(courseToUpdate.getDescription());
                    currentCourse.setTeacher(courseToUpdate.getTeacher());
                    currentCourse.setStudents(courseToUpdate.getStudents());
                    break;
                }
            }
        }

        @Override
        public void DeleteCourse(Course courseToDelete) {
            courses.removeIf(course -> course.getName().equals(courseToDelete.getName()));
        }

        public void enrollStudent(String courseName, Student student) {
            Course targetCourse = courses.stream()
                    .filter(course -> course.getName().equals(courseName))
                    .findFirst()
                    .orElse(null);

            if (targetCourse != null) {
                targetCourse.addStudent(student);
                System.out.println(student + " a fost inscris la " + courseName);
            } else {
                System.out.println("Cursul cu numele " + courseName + " nu exista");
            }
        }



    public void DisplayCoursesToConsole() {
        for (Course c : courses) {
            System.out.println(c);
        }
    }

}

