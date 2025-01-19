public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 100.0;


    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }


    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }


    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }


    public static void main(String[] args) {
     
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");


        System.out.println("Vehicle 1 Details:");
        v1.displayVehicleDetails();


        System.out.println("\nVehicle 2 Details:");
        v2.displayVehicleDetails();


        System.out.println("\nUpdating Registration Fee to $120...");
        Vehicle.updateRegistrationFee(120.0);


        System.out.println("\nVehicle 1 Details After Update:");
        v1.displayVehicleDetails();
    }
}


