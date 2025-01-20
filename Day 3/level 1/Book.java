
public class Book {
    static String libraryName = "central library";

    String title;
    String author;
    final int isbn;

    Book(String title,
            String author,
            int isbn) {
       this.title = title;
       this.isbn = isbn;
       this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("name of library : " + libraryName);
    }
    
    void display(){
    
        System.out.println("book title " + title);
        System.out.println("author name is " + author);
        System.out.println("isbn number  " + isbn);
               
     }

   
     public static void main(String[] args) {
        
        Book b1 = new Book("the jungle book", "rudyard kipling", 9837640);
         displayLibraryName();
        if(b1 instanceof Book){
         b1.display();
        }
     }


}
