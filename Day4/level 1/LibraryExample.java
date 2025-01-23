

import java.util.*;
 class library {
 
   String name;
   ArrayList<Book> books = new ArrayList<>();
    //constructor
   library(String name){
      this.name = name;
   }
   void addBook(Book obj){
      books.add(obj);
 }
}
class Book{
   String title ;
   String author;
   //constructor
   Book(String title , String author){
      this.title = title;
      this.author = author;
   }
}




public class LibraryExample {
   public static void main(String[] args) {
    
      //object for library 
      library l1 = new library("Cenral libray");
      //object for book 
      Book l1b1 = new Book("jungle book" ,"rudyard kipling");
      Book l1b2 = new Book("blood and fire" ,"george R.R martin");
      l1.addBook(l1b1);
      l1.addBook(l1b2);


      library l2 = new library("state library");
      Book l2b1 = new Book("subtle art of not giving a hell " ,"unknown");
      l2.addBook(l2b1);

      System.out.println("----------------------------------------------------------------------");

      System.out.println("library name is : "+ l1.name);
     System.out.println("------------------------------------------------------------------------");
     for(Book lib : l1.books){
         
      System.out.println("books name :  " + lib.title + " | " + "author name :  " + lib.author);
     }
     System.out.println("-------------------------------------------------------------------------");


     

   }
    
}