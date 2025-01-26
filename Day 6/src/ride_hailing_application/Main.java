package ride_hailing_application;

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "ayan", 10.0);
        Vehicle v2 = new Bike("B202", "vivek", 5.0);
        Vehicle v3 = new Auto("A303", "kanak", 7.0);

        Vehicle[] vehicles = {v1, v2, v3};

        double distance = 15; // Example distance in kilometers
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " KM: " + v.calculateFare(distance));
        }
    }
}
