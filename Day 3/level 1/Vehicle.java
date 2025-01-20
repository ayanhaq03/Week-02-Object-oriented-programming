class Vehicle {
    static double registrationFee = 500.0;

    final String registrationNumber;

    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John Doe", "Car", "12345");
        Vehicle v2 = new Vehicle("Jane Smith", "Motorcycle", "67890");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(600.0);
        v1.displayDetails();
    }
}
