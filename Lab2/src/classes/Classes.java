package classes;

public class Classes {
    public static void main(String[] args) {
    Student[] students = new Student[]{new Student("Andrei","Negoita", 2231), new Student("Ion","Matescu",4221)};
    Student stud1 = new Student("Andrei","Manaila",2331);
    Professor prof = new Professor("Anton", "Panaitescu");
    double[] grades = {7.6, 8.7, 9.3, 6.4, 8.1};
  

     Course course = new Course("Material Resistance","Calculations of reactions , \n"
             + "effort diagrams, calculations of geometric characteristics of \n" +
             "flat surfaces and calculations of resistance elements to simple stresses",prof,students);

        System.out.println("Full name of a student: " + stud1.getFullname());
        System.out.println("Full name of a professor: " + prof.getFullname());
     CourseManager courseManager = new CourseManager();
     courseManager.AddCourse(course);

     courseManager.DisplayCoursesToConsole();
     courseManager.listStudentsInCourse("Material Resistance");
     courseManager.enrollStudent("Material Resistance",stud1);
     double averageGrade = courseManager.calculateAverageGradeForCourse("Material Resistance", grades);
     System.out.println("Average Grade for Material Resistance: " + averageGrade);
        double averageProfessorGrade = courseManager.calculateAverageProfessorGrade(prof);
        System.out.println("Average Grade for Professor " + prof.getFullname() + ": " + averageProfessorGrade);


    }
}