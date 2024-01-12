package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Collections;
import java.util.Comparator;

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
                currentCourse.setStudentsSet(courseToUpdate.getStudentsSet());
                break;
            }
        }
    }

    @Override
    public void DeleteCourse(Course courseToDelete) {
        courses.removeIf(course -> course.getName().equals(courseToDelete.getName()));
    }



    public Map<Integer, List<Student>> groupStudentsByGroupNumber() {
        Map<Integer, List<Student>> groupedStudents = new HashMap<>();

        for (Course course : courses) {
            for (Student student : course.getStudentsSet()) {
                int groupNumber = student.getGroupNumber();


                groupedStudents.computeIfAbsent(groupNumber, k -> new ArrayList<>());


                groupedStudents.get(groupNumber).add(student);
            }
        }

        return groupedStudents;
    }

    public Optional<Course> findCourseByName(String courseName) {
        return courses.stream()
                .filter(course -> course.getName().equals(courseName))
                .findFirst();
    }

    public void sortCourses(String sortBy) {
        switch (sortBy.toLowerCase()) {
            case "name":
                Collections.sort(courses, Comparator.comparing(Course::getName));
                break;
            case "professor":
                Collections.sort(courses, Comparator.comparing(course -> course.getTeacher().getFullName()));
                break;
            case "enrolledstudents":
                Collections.sort(courses, Comparator.comparingInt(course -> course.getStudentsSet().size()));
                break;
            default:
                System.out.println("Invalid sorting criteria");
        }
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

