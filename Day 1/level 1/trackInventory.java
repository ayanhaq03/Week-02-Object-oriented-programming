class Item{

    int itemCode;
    String itemName;
    int price ;
 

     //creating a parameterised constructor 
    public Item (int itemCode , String itemName , int price){

        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;

    }
 //method to display and calculate total cost for items
    void calculateCost(int quantity){
       
        int cost = quantity*price ;

        System.out.println("item name is : "+ itemName);
        System.out.println("item code is : " +itemCode);
        System.out.println("item price is :" + price);
        System.out.println("total cost for "+ quantity + " item is : " + cost);


    }


}

public class trackInventory {

    public static void main(String[] args) {
        int quantity = 5 ;
        Item obj = new Item(356,"sugar",42);
        obj.calculateCost(quantity);


    }
    
}
