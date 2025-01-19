

class Book {
    public String ISBN;
    protected String title;
    private String author;


    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }


    // Public methods to access and modify author
    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }
}


// EBook subclass demonstrating protected and public member access
class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }


    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}


public class LibBooks {
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "Java Programming", "James ");
        System.out.println("EBook Details:");
        ebook.displayDetails();


        System.out.println("\nUpdating Author Name...");
        ebook.setAuthor("James Gosling");


        System.out.println("\nEBook Details After Update:");
        ebook.displayDetails();
    }
}
