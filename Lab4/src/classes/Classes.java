package classes;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


public class Classes {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Dr. Smith", "Physics");
        Professor professor2 = new Professor("Dr. Johnson", "Mathematics");


        Student student1 = new Student("Andrei", "Catalin", 4221);
        Student student2 = new Student("Daniel", "Radu", 4224);
        Student student3 = new Student("Andra", "Gogan", 3156);


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        Course physicsCourse = new Course("Physics 101", "Introduction to Physics", professor1, studentList);


        Student newStudent = new Student("New", "Student", 1234);
        physicsCourse.addStudent(newStudent);


        System.out.println(physicsCourse);


        physicsCourse.UpdateCourse("Physics 102", "Advanced Physics");


        System.out.println("\nUpdated course details:");
        System.out.println(physicsCourse);


        Student studentToUpdate = new Student("Andrei", "Catalin", 4221);
        studentToUpdate.setGroupNumber(4321);
        physicsCourse.UpdateStudent(studentToUpdate);


        System.out.println("\nCourse details after updating a student:");
        System.out.println(physicsCourse);
    }
    }
