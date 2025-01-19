public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;
 
    //constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
 


    //method to display details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
   
    //method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }


    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Smartphone", 800.0);


        System.out.println("Product 1 Details:");
        p1.displayProductDetails();


        System.out.println("\nProduct 2 Details:");
        p2.displayProductDetails();


        System.out.println("\nDisplaying Total Products:");
        Product.displayTotalProducts();
    }
}
