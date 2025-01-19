public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute";
  //constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
   


    //method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: Rs" + fee);
        System.out.println("Institute Name: " + instituteName);
    }


    //method to update institute name


    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }


    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 8, 400.0);
        Course course2 = new Course("Python Programming", 6, 350.0);


        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();


        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();


        System.out.println("\nUpdating Institute Name...");
        Course.updateInstituteName("Bridgelabz");


        System.out.println("\nCourse 1 Details After Update:");
        course1.displayCourseDetails();
    }
}
