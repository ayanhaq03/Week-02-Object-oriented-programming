class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    final int rollNumber;

    String name;
    String grade;

    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 1, "A");
        Student s2 = new Student("Bob", 2, "B");
        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}
