



public class LibraryBooks {
    private String title;
    private String author;
    private double price;
    private boolean availability;
 
    //constructor
     LibraryBooks(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
 
    //method to borrow books
    public boolean borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
            return true;
        } else {
            System.out.println("Book is not available.");
            return false;
        }
    }
  //method to display details
    public  void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs" + price);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
    }


    public static void main(String[] args) {
         
        LibraryBooks obj = new LibraryBooks("the jungle book", "rudyard kipling", 500, true);
        obj.displayBookDetails();


        System.out.println("\nAttempting to borrow the book:");
        obj.borrowBook();


        System.out.println("\nBook Details after borrowing:");
        obj.displayBookDetails();
    }
}


