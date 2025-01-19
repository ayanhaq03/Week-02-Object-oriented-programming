class Books{


    String title;
    String author;
    int price;
   
      //creating a parameterised constructor
     Books(String title,
            String author,
            int price) {


        this.title = title;
        this.author = author;
        this.price = price;


    }


    //default constructor


    Books(){


    }


    //method to display details
    void display() {
        System.out.println("book's name is : " + title);
        System.out.println("book's author is : " + author);
        System.out.println("book's price is : " + price);
    }


    public static void main(String args[]) {
        Books obj = new Books("The jungle book", "Rudyard kipling", 454);
        Books obj2 = new Books();
        obj2.display();
     
        obj.display();


    }
}
