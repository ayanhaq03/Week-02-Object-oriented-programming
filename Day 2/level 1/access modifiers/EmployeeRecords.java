

class Employee {
    public int employeeID;
    protected String department;
    private double salary;


    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }


    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }


    // Public method to get salary
    public double getSalary() {
        return salary;
    }
}


// Manager subclass demonstrating access to public and protected members
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }


    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + getSalary());
    }
}


public class EmployeeRecords{
    public static void main(String[] args) {
        Manager manager = new Manager(101, "IT", 90000.0);
        System.out.println("Manager Details:");
        manager.displayDetails();


        System.out.println("\nUpdating Salary...");
        manager.setSalary(95000.0);


        System.out.println("\nManager Details After Update:");
        manager.displayDetails();
    }
}
