package vehicle_rental_system;

class Truck extends Vehicle {
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * 100; // Rate per day
    }
}