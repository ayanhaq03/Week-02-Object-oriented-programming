public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
   
    //constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
   
    //method to calculate total cost
    public double calculateTotalCost(double ratePerDay) {
        return rentalDays * ratePerDay;
    }
 


    //methods to display details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
    }


    public static void main(String[] args) {
        CarRental rental = new CarRental("Ayan", "Nano", 5);


        System.out.println("Rental Details:");
        rental.displayRentalDetails();


        double totalCost = rental.calculateTotalCost(400.0);
        System.out.println("\nTotal Cost: Rs" + totalCost);
    }
}


