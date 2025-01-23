import java.util.*;

class Employee {
    String name;
    
    //constructor
    public Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    //arraylist to store employees
    ArrayList<Employee> employees = new ArrayList<>();
     //constructo
    public Department(String name) {
        this.name = name;
    }
    //method to add employees
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

class Company {
    String name;
    //arraylist to store multiple departments
    ArrayList<Department> departments = new ArrayList<>();
    //constructor
    public Company(String name) {
        this.name = name;
    }
    //method to add departments
    public void addDepartment(Department department) {
        departments.add(department);
    }
}

public class CompanyExample {
    public static void main(String[] args) {
        Company company = new Company("Bridgelabz");

        Department itDept = new Department("IT");
        itDept.addEmployee(new Employee("ayan"));
        itDept.addEmployee(new Employee("kanak"));
        company.addDepartment(itDept);
        System.out.println("Company: " + company.name + " has " + company.departments.size() + " departments.");
    }
}

