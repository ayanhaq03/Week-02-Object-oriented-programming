

//base class
class Person{
   String name;
   int id ;
  //constructor
   Person (String name , int id){
        this.name = name ;
        this.id = id ;
   }

}
//interface worker to implement multiple inheritance
interface Worker {
    void performDuties();
} 

//subclass 
class  Chef extends Person implements Worker {
      String duty ;
    
      Chef(String name , int id , String duty){

        super(name, id);
        this.duty = duty;

      }
    @Override
    public void performDuties() {
         System.out.println("Worker's name : " + name);
         System.out.println("worker's  id : " + id);
         System.out.println("worker's duty : " + duty);
        
    }
} 
//subclass
class Waiter extends Person implements Worker{

    Waiter(String name , int id , String duty){

        super(name, id);
        this.duty = duty;

      }
    String duty;
    public void performDuties(){
        System.out.println("Worker's name : " + name);
         System.out.println("worker's  id : " + id);
         System.out.println("worker's duty : " + duty);

    }
}
public class ResturantManagement {
   public static void main(String[] args) {


     Waiter w = new Waiter("Waiter", 1, "serves customer");
     w.performDuties();

     System.out.println("---------------------------------------------");
     Chef c = new Chef("Chef", 123, "cooks");
     c.performDuties();
    
   } 
}
