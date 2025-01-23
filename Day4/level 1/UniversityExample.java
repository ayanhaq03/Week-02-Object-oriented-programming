import java.util.ArrayList;


class Faculty {
    String name; 
   //constructor
    public Faculty(String name) {
        this.name = name;
    }
}


class Department {
    String name;
    //constructor
    public Department(String name) {
        this.name = name;
    }
}

// Represents a university with a name, departments, and faculties
class University {
    String name; // Name of the university
    ArrayList<Department> departments = new ArrayList<>(); // List of departments in the university
    ArrayList<Faculty> faculties = new ArrayList<>(); // List of faculties in the university

    public University(String name) {
        this.name = name;
    }

    // Adds a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Adds a faculty member to the university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}


public class UniversityExample {
    public static void main(String[] args) {
        // Create a university instance
        University university = new University("Tech University");

        // Create department instances
        Department cs = new Department("Computer Science");
        Department ee = new Department("Electrical Engineering");

        // Create faculty instances
        Faculty prof1 = new Faculty("Dr. Smith");
        Faculty prof2 = new Faculty("Dr. Brown");

        // Add departments to the university
        university.addDepartment(cs);
        university.addDepartment(ee);

        // Add faculties to the university
        university.addFaculty(prof1);
        university.addFaculty(prof2);

        // Display the number of departments and faculties in the university
        System.out.println("University: " + university.name + " has " + university.departments.size() +
                " departments and " + university.faculties.size() + " faculties.");
    }
}
