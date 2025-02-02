// Base class: Person
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Display role
    void displayRole() {
        System.out.println("General Person");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    // Constructor
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    String grade;

    // Constructor
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String department;

    // Constructor
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Staff");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Main Class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("ayan", 25, "Mathematics");
        teacher.displayRole();
        teacher.displayDetails();

        System.out.println("------------------------------------------------");

        Student student = new Student("kanak", 18, "12th Grade");
        student.displayRole();
        student.displayDetails();

        System.out.println("------------------------------------------------");

        Staff staff = new Staff("Charlie", 40, "Administration");
        staff.displayRole();
        staff.displayDetails();
    }
}
