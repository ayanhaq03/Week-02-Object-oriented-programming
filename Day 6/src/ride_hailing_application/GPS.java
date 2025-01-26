package ride_hailing_application;

// Interface: GPS
interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}