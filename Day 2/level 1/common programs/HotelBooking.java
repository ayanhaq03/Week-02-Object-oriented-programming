public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;


    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }


    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }


    // Copy constructor
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }


    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }


    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Alice", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);


        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();


        System.out.println("\nCustom Booking:");
        customBooking.displayBookingDetails();


        System.out.println("\nCopied Booking:");
        copiedBooking.displayBookingDetails();
    }
}


