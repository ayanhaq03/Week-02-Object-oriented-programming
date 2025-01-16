class Books {

    String title;
    String author;
    int price;
      //creating a parameterised constructor
    public Books(String title,
            String author,
            int price) {

        this.title = title;
        this.author = author;
        this.price = price;

    }
    //method to display details
    void display() {
        System.out.println("book's name is : " + title);
        System.out.println("book's author is : " + author);
        System.out.println("book's price is : " + price);
    }
}
class handleBooks {
    public static void main(String args[]) {
        Books obj = new Books("The jungle book", "Rudyard kipling", 454);
        obj.display();

    }

}