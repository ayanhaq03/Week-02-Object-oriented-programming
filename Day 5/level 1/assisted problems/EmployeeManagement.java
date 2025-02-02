 
//base class
 class Employee{
     
    String name ;
    int id ;
    int salary;
     //constructor
    Employee(String name ,int id ,int salary){
        this.name = name;
        this.id = id ;
        this.salary = salary;
    }
    //method to display details
    void displayDetails(){
        System.out.println("Employee name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee salary is : " + salary);
    }
 }
 //subclass manager 
 class Manager extends Employee {
     int teamSize;
     //inheriting constructor using super 
     Manager(String name , int id , int salary,int teamSize){
        super( name,  id,   salary );
        this.teamSize = teamSize;
     }
     void displayDetails(){
        
        System.out.println("Manager name is " + name);
        System.out.println("manager id is : " + id );
        System.out.println("manager salary is : " + salary);
        System.out.println("manager team size is : " + teamSize);
     }
       
 }

 //subclass developer 
 class Developer extends Employee  {
    String ProgLanguage;
    
         //inheriting constructor using super 
    Developer(String name , int id , int salary , String ProgLanguage){
        super(name, id, salary);
        this.ProgLanguage = ProgLanguage;
    }

     void displayDetails(){
        System.out.println("developer  name is " + name);
        System.out.println("developer id is : " + id );
        System.out.println("developer salary is : " + salary);
        System.out.println("developer programming language is " + ProgLanguage);
     }

 }

 //subclass Intern
 class Intern extends Employee {
     
    int duration ;
         //inheriting constructor using super 
    Intern(String name , int id , int salary, int duration){
        super(name, id, salary);
        this.duration = duration;
    }
    void displayDetails(){
        System.out.println("Intern name is " + name);
        System.out.println("Intern id is : " + id );
        System.out.println("Intern Stipend is : " + salary);
        System.out.println("Intern work duration is : " + duration + "months");
    }

 }
 
 
 
 
 
 public class EmployeeManagement {
 
    public static void main(String[] args) {
         

        Manager m = new Manager("vivek", 2340, 3000000, 4);
        m.displayDetails();

        System.out.println("----------------------------------------------------------------------");
        Developer d = new Developer("ayan", 345, 3455555,"java");
        d.displayDetails();
         System.out.println("-----------------------------------------------------------------------");
        Intern i = new Intern("kanak", 3455, 10000, 3);
         i.displayDetails();

    }
 }