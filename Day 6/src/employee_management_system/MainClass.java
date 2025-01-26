package employee_management_system;

public class MainClass {

    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(1, "ayan", 50000, 80000);
        Employee emp2 = new PartTimeEmployee(2, "vivek", 20000, 20, 50);

        emp1.displayDetails();
        System.out.println("Salary: " + emp1.calculateSalary());

        emp2.displayDetails();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}
