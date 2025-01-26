package e_commerce_platforn;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Electronics(101, "Laptop", 1000);
        Product p2 = new Clothing(102, "T-Shirt", 50);
        Product p3 = new Groceries(103, "Milk", 5);

        Product[] products = {p1, p2, p3};

        for (Product p : products) {
            double finalPrice = p.getPrice() - p.calculateDiscount();
            System.out.println("Product: " + p.getName() + ", Final Price: " + finalPrice);
        }
    }
}
