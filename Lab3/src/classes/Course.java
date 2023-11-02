package classes;

public class Course implements CourseOperations {
    String name;
    String description;
    Professor teacher;
    Student[] students;


    public Course(String name, String description,
                  Professor teacher, Student[] students) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
    }


    public void addStudent(Student student){

        int newLength = students.length + 1;
        Student[] aux = new Student[newLength];
        int index = 0;
        for(Student s : students) {
            aux[index++]=s;
        }

        aux[index] = student;
        this.students = new Student[newLength];
        System.arraycopy(aux,0,students,0,newLength);

    }
    public void removeStudent(Student student){
        int studentIndex = -1;
        for(int i = 0;i<=students.length;i++) {
            if(students[i] == student){
                studentIndex=i;
                break;
            }


        }
    }

    public void UpdateProfessor(Professor teacher){

        this.teacher = teacher;
    }
    public void UpdateStudent(Student studentToUpdate) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(studentToUpdate.name)
                    && students[i].surname.equals(studentToUpdate.surname)) {
                students[i] = studentToUpdate;
                break;
            }
        }
    }
    public void UpdateCourse(String name,String description){
        this.name = name;
        this.description = description;
    }
   public void AddStudent(Student student){
        addStudent(student);
   }
   public void RemoveStudent(Student student){
        removeStudent(student);
   }
    public Student[] getEnrolledStudents()
    {
        return students;
    }

    @Override
    public String toString() {
        String str = "Course: " + "name=" + name + ", description=" +
                description + ",\nTeacher=" + teacher + ",\nStudents:\n";
        for(Student s : students) {
            str +=s + "\n";
        }

        return str;
    }

}
