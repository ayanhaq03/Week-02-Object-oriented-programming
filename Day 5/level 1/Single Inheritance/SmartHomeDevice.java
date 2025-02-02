//base class
class Device {
  int deviceId ;
  String status ;

  //constructor
  Device(int deviceId , String status){
    this.deviceId = deviceId ;
    this.status = status;

  }

  void displayStatus(){
      
  }
}
//subclass 
class Thermostat extends Device{
    String temperatureSetting;

    //inheriting constructor
    Thermostat (int deviceId , String status,String temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;

    }
   //overriding method to display status

   void displayStatus(){
    System.out.println("device id : " + deviceId);
    System.out.println("current status : " + status);
    System.out.println("temperature setting : " + temperatureSetting);
   }
}
public class SmartHomeDevice {
    public static void main(String[] args) {

        Thermostat t = new Thermostat(12, "working", "max");
        t.displayStatus();
        
    }
    
}
