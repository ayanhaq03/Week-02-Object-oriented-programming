class Employee {

   static String companyName = "Capgemini" ;
    String empName ;
    final int id ;
    String designationOfEmp;
      static int totalEmployees = 0;
    

      Employee(String empName ,int id ,String designationOfEmp){
      
        this.empName = empName;
        this.id = id;
        this.designationOfEmp = designationOfEmp;
        totalEmployees++;
        
    
    }
      static void displayTotalEmployees(){
          System.out.println("total numbers of employee in company are " +totalEmployees);
      }

  

    //method to display employee details
    void display (){
    System.out.println("employee name is " + empName);
        System.out.println("employee id " + id);
        System.out.println("designation "+ designationOfEmp);

    }
     public static void main(String args[]){
     
     
        Employee b1 = new Employee("ayan", 345, "ASE");

        Employee e = new Employee("nova", 346, "ASE");

        displayTotalEmployees();
       if(b1 instanceof Employee){
        b1.display();
       }
     
    
     }
 }
 