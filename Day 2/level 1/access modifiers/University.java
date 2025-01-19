



class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;
    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }


    // Public methods to access and modify CGPA
    public double getCGPA() {
        return CGPA;
    }


    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}


// PostgraduateStudent subclass demonstrating protected member access
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }


    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}


public class University {
    public static void main(String[] args) {
        Student student = new Student(101, "vivek", 7.8);
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("CGPA: " + student.getCGPA());


        System.out.println("\nPostgraduate Student Details:");
        PostgraduateStudent pgStudent = new PostgraduateStudent(94, "ayan", 8.0);
        pgStudent.displayDetails();
    }
}
