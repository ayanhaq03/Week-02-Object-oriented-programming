import java.util.*;


class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>(); // List of students enrolled in the course

    public Course(String name) {
        this.name = name;
    }

    // Enrolls a student in the course and links the course to the student
    public void enrollStudent(Student student) {
        students.add(student);
        student.enrollCourse(this);
    }

    // Displays the list of students enrolled in the course
    public void displayStudents() {
        System.out.println("Course: " + name + " has the following students:");
        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }
}


class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>(); // List of courses the student is enrolled in

    public Student(String name) {
        this.name = name;
    }

    // Enrolls the student in a course if not already enrolled
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    // Displays the list of courses the student is enrolled in
    public void displayCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println("- " + course.name);
        }
    }
}


class School {
    String name;
    ArrayList<Student> students = new ArrayList<>(); // List of students in the school

    public School(String name) {
        this.name = name;
    }

    // Adds a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolExample {
    public static void main(String[] args) {
      
        School school = new School("Greenwood High");

     
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

      
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

   
        math.enrollStudent(student1);
        math.enrollStudent(student2);
        science.enrollStudent(student1);

        
        student1.displayCourses();
        student2.displayCourses();

        math.displayStudents();
        science.displayStudents();
    }
}
