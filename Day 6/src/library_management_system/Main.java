package library_management_system;

public class Main {
    public static void main(String[] args) {
        LibraryItem item1 = new Book(101, "jungle book", "rudyard kipling");
        LibraryItem item2 = new Magazine(102, "Times India", "Times India corp.");
        LibraryItem item3 = new DVD(103, "Inception", "Christopher Nolan");

        LibraryItem[] items = {item1, item2, item3};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}
