import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                cart.remove(i);
                System.out.println(itemName + " removed from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cart) {
            totalCost += item.price * item.quantity;
        }
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 2.5, 4); // Adding Apple
        cart.addItem("Banana", 1.2, 6); // Adding Banana
        cart.displayTotalCost(); // Display total cost
        cart.removeItem("Apple"); // Removing Apple
        cart.displayTotalCost(); // Display total cost after removal   
    }
}
