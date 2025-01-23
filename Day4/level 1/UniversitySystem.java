import java.util.*;


class Course {
    private String courseName; 
    private Professor professor; 
    private ArrayList<Student> students; // List of enrolled students

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Assigns a professor to the course and prints confirmation
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " is assigned to " + courseName + ".");
    }

    // Enrolls a student in the course and adds the course to the student's list
    public void enrollStudent(Student student) {
        students.add(student);
        student.addCourse(this);
        System.out.println("Student " + student.getName() + " is enrolled in " + courseName + ".");
    }

    // Returns the course name
    public String getCourseName() {
        return courseName;
    }
}


class Professor {
    private String name; 

    public Professor(String name) {
        this.name = name;
    }

    // Returns the professor's name
    public String getName() {
        return name;
    }
}


class Student {
    private String name; 
    private List<Course> courses; // List of courses the student is enrolled in

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Returns the student's name
    public String getName() {
        return name;
    }

    // Adds a course to the student's list of courses
    public void addCourse(Course course) {
        courses.add(course);
    }
}


public class UniversitySystem {
    public static void main(String[] args) {
        // Create a student
        Student student1 = new Student("Lucas Green");

        // Create a professor
        Professor professor1 = new Professor("Dr. Emily Carter");

        // Create a course
        Course course1 = new Course("Data Structures");

        // Assign a professor to the course
        course1.assignProfessor(professor1);

        // Enroll a student in the course
        course1.enrollStudent(student1);
    }
}
