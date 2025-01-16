
class MobilePhone{

    String brand ;
    String model ;
    int price ;
  //creating a parameterised constructor
    MobilePhone(String brand , String model , int price){

        this.brand = brand ;
        this.model = model;
        this.price = price;
    }
    //method to display mobile phone detail
    void display() {

        System.out.println("brand name is : " + brand);
        System.out.println("model is : " + model);
        System.out.println("price is : " + price);

    }

}
public class handlePhoneDetails {
    
    public static void main(String args[]){
   
        MobilePhone obj = new MobilePhone("realme","narzo 60x",9999);
        obj.display();

    }
}
