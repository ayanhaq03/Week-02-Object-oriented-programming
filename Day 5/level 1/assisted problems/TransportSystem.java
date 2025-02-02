//base class

import java.util.ArrayList;

class Vehicle{
  int maxSpeed ;
  String fuelType;
  String name;
//constructor

;

  
  Vehicle(String name ,int maxSpeed,String fuelType ){
    this.maxSpeed = maxSpeed;
    this.fuelType = fuelType;
    this.name = name ;
  }
  //method to display details of vehicle
  void displayInfo(){
    System.out.println("maximum speed of vehicle is : " + maxSpeed);
    System.out.println("type of fuel in vehicle is " + fuelType);

  }


}
 //subclass car 
class Car extends Vehicle{

    int seatCapacity ;
    // inheriting constructor  using super 
    Car(String name, int maxSpeed , String fuelType  ,int seatCapacity ){
         super(name ,maxSpeed,fuelType );
         this.seatCapacity = seatCapacity;
    }

         //method overriding 
    void displayInfo(){
        System.out.println("vehicel name is : "+ name);
        System.out.println("maximum speed of vehicle is : " + maxSpeed);
        System.out.println("type of fuel in vehicle is : " + fuelType);
        System.out.println("seat capacity of car is : " + seatCapacity);
      }

}

//subclass truck
class Truck extends Vehicle{

    int loadcapacity;
        // inheriting constructor  using super 
    Truck(String name ,int maxSpeed,String fuelType ,int loadcapacity){
        super(name ,maxSpeed, fuelType);
        this.loadcapacity = loadcapacity;
    }
  
        //method overriding 
    void displayInfo(){
        System.out.println("vehicle name is : "+ name);
        System.out.println("maximum speed of vehicle is : " + maxSpeed);
        System.out.println("type of fuel in vehicle is " + fuelType);
         System.out.println("load capacity of truck us : " + loadcapacity + "kg");
      }

}

class Motorcycle extends Vehicle {
      int engine ;
          // inheriting constructor  using super 
     Motorcycle(String name ,int maxSpeed , String fuelType ,  int engine){
         super(name ,maxSpeed, fuelType );
         
     }
    //method overriding 
     void displayInfo(){
        System.out.println("vehicle name is : "+ name);
        System.out.println("maximum speed of vehicle is : " + maxSpeed);
        System.out.println("type of fuel in vehicle is " + fuelType);
        System.out.println("cc of motorcycle's engine " + engine + "CC");
    
      }
}

public class TransportSystem {

    public static void main(String[] args) {
        
        Car c = new Car("Car", 200, "diesel", 4);
      
        Motorcycle m = new Motorcycle("Motorcycle",120, "petrol", 120);
       
       
        Truck t  = new Truck("Truck",200, "diesel", 800);
       

        ArrayList<Vehicle> arr = new ArrayList<>();
        arr.add(c);
        arr.add(m);
        arr.add(t);

        for(Vehicle v : arr){
          v.displayInfo();
          System.out.println("--------------------------------------------------------------------");
        }
        
        
    }
    
}
