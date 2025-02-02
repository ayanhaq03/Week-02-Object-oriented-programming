// Base class: Course
class Course {
    String courseName;
    int duration; // in weeks

    // Constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Display details
    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    // Constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Net Fee: $" + (fee - (fee * discount / 100)));
    }
}

// Main Class
public class CourseManagement {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Programming", 10);
        course.displayDetails();

        System.out.println("------------------------------------------------");

        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 8, "Coursera", true);
        onlineCourse.displayDetails();

        System.out.println("------------------------------------------------");

        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Full-Stack Development", 12, "Udemy", true, 499.99, 20);
        paidOnlineCourse.displayDetails();
    }
}
