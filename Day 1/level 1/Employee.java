class Employee {

    String name ;
    int id ;
    int salary;
    
    //method to display employee details
    void display (){
    Employee obj = new Employee();
    obj.name = "jordan" ;
    obj.id = 134 ;
    obj.salary = 15000 ;
    System.out.println(obj.name);
    System.out.println(obj.id);

    System.out.println(obj.salary);
    }
     public static void main(String args[]){
     
     //obj of employee class
      Employee obj2 = new Employee();
      obj2.display();
    
     }
 }
 