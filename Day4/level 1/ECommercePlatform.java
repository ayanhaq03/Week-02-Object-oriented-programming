import java.util.ArrayList;
import java.util.List;


class Product {
    private String name; 
    private double price; 
    //constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Returns the product name
    public String getName() {
        return name;
    }

    // Returns the product price
    public double getPrice() {
        return price;
    }
}


class Order {
    private List<Product> products; // List of products in the order

    public Order() {
        this.products = new ArrayList<>();
    }

    // Adds a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Displays details of the order, including product names and prices
    public void showOrderDetails() {
        System.out.println("Order Details:");
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }
}


class Customer {
    private String name; 
    private List<Order> orders; // List of orders placed by the customer

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Places an order and adds it to the customer's order list
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed a new order.");
    }
}


public class ECommercePlatform {
    public static void main(String[] args) {
        // Create a customer instance
        Customer customer = new Customer("Emma Davis");

        // Create product instances
        Product product1 = new Product("Laptop", 1200);
        Product product2 = new Product("Headphones", 200);

        // Create an order instance and add products to it
        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);

        // Customer places the order
        customer.placeOrder(order);

        // Display the order details
        order.showOrderDetails();
    }
}
