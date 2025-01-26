package online_food_delivery_system;

public class Main {

    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Paneer Curry", 200, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 300, 1);

        FoodItem[] items = {item1, item2};

        for (FoodItem item : items) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
        }
    }
}
