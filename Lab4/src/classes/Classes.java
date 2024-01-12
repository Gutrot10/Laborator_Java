package classes;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class Classes {
    public static void main(String[] args) {

        MockClassesManager mockManager = new MockClassesManager();
        CourseManager courseManager = new CourseManager();


        ArrayList<Course> courses = mockManager.GenerateCourses();
        for (Course course : courses) {
            mockManager.AddCourse(course);
        }

        // Test sortCourses
        System.out.println("Sorted by Name:");
        courseManager.sortCourses("name");
        courseManager.DisplayCoursesToConsole();

        System.out.println("\nSorted by Professor:");
        courseManager.sortCourses("professor");
        courseManager.DisplayCoursesToConsole();

        System.out.println("\nSorted by Enrolled Students:");
        courseManager.sortCourses("enrolledstudents");
        courseManager.DisplayCoursesToConsole();



        // Test groupStudentsByGroupNumber
        Map<Integer, List<Student>> groupedStudents = courseManager.groupStudentsByGroupNumber();
        System.out.println("\nGrouped Students by Group Number:");
        for (Map.Entry<Integer, List<Student>> entry : groupedStudents.entrySet()) {
            System.out.println("Group " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
