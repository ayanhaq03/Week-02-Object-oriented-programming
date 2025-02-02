
//base class
class Book{
  
    String title ;
    int publicationYear;
   //constructor
    Book(String title , int publicationYear){
      this.title = title;
      this.publicationYear = publicationYear;

    }
    //method to display information 
    void displayInfo(){
         System.out.println("title of book is : " + title);
         System.out.println("published in year : " + publicationYear);
    }

}
//base class
class Author extends Book{
    String name ;
    String bio ;
    Author(String title , int publicationYear,String name ,String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio ;

    }
   //overriding display method 
   void displayInfo(){
    System.out.println("title of book is : " + title);
         System.out.println("published in year : " + publicationYear);
         System.out.println("Author of book is : " + name );
         System.out.println("Author's bio : " + bio);
         

    }
}
public class LibraryManagement {
    public static void main(String[] args) {

        Author a = new Author("jungle book", 1984, "rudyard kipling", "born in India ,Bombay");
        a.displayInfo();
        
    }

    
}
