package classes;

import java.util.*;

public class Course implements CourseOperations {
    private String name;
    private String description;
    private Professor teacher;
    private Set<Student> studentsSet;

    public Course(String name, String description, Professor teacher) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.studentsSet = new HashSet<>();
    }

    private String getCompositeKey(Student student) {
        return student.getName() + student.getSurname() + student.getGroupNumber();
    }

    public void addStudent(Student student) {
        String compositeKey = getCompositeKey(student);
        if (!studentsSet.contains(student)) {
            studentsSet.add(student);
        } else {
            System.out.println("Student already exists in the course.");
        }
    }




    public void UpdateStudent(Student studentToUpdate) {
        String compositeKey = getCompositeKey(studentToUpdate);
        if (studentsSet.contains(studentToUpdate)) {
            studentsSet.remove(studentToUpdate);
            studentsSet.add(studentToUpdate);
        } else {
            System.out.println("Student not found in the course.");
        }
    }

    public void RemoveStudent(Student studentToRemove) {
        if (studentsSet.contains(studentToRemove)) {
            studentsSet.remove(studentToRemove);
        } else {
            System.out.println("Student not found in the course.");
        }
    }

    @Override
    public void UpdateProfessor(Professor p) {
        // Implementation for updating professor
    }

    @Override
    public void UpdateCourse(Course updatedCourse) {
        this.name = updatedCourse.getName();
        this.description = updatedCourse.getDescription();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Professor getTeacher() {
        return teacher;
    }

    public void setTeacher(Professor teacher) {
        this.teacher = teacher;
    }

    public Set<Student> getStudentsSet() {
        return studentsSet;
    }

    public void setStudentsSet(Set<Student> studentsSet) {
        this.studentsSet = studentsSet;
    }

    public List<Student> getStudentsList() {
        return new ArrayList<>(studentsSet);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Course: " + "name=" + name + ", description=" + description + ",\nTeacher=" + teacher + ",\nStudents:\n");
        for (Student s : studentsSet) {
            str.append(s).append("\n");
        }
        return str.toString();
    }
}