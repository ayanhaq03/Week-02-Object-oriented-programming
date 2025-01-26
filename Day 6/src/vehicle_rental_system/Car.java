package vehicle_rental_system;

// Subclasses: Car, Bike, Truck
class Car extends Vehicle {
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 50; // Rate per day
    }
}