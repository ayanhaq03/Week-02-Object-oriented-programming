class Product {

    
    String ProductName;
    int price;
    static int discount = 45 ;
    int quantity;
    final int ProductId ;

    Product(String ProductName, int price, int quantity,int ProductId) {

        this.ProductName = ProductName;
        this.price = price;
        this.quantity = quantity;
        this.ProductId = ProductId;

    }

    static void updateDiscount() {
        discount = 56;
    }



    
    void display() {
        System.out.println("product name is " + ProductName);
        System.out.println("product id " + ProductId);
        System.out.println("price is " + price);
        System.out.println("quantity is : " + quantity);
        System.out.println("discount applied is : " + discount+ "%" );
    }

    public static void main(String args[]) {
    
        Product p1 = new Product("earbuds", 450, 2, 34);
        Product p2 = new Product("headphones", 400, 1, 34);

        p1.display();
        updateDiscount();
        p2.display();



       

    }
}
