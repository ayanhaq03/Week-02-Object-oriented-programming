package vehicle_rental_system;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car("C123", "Car", 50);
        Vehicle v2 = new Bike("B456", "Bike", 20);
        Vehicle v3 = new Truck("T789", "Truck", 100);

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + ", Rental Cost: " + v.calculateRentalCost(5));
        }
    }
}
