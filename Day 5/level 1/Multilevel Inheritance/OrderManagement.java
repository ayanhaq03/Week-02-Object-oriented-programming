// Base class: Order
class Order {
    String orderId;
    String orderDate;

    // Constructor
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    String getOrderStatus() {
        return "Order placed.";
    }

    // Display details
    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking number: " + trackingNumber;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main Class
public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "2025-01-20");
        order.displayDetails();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println("------------------------------------------------");

        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2025-01-18", "TRACK1234");
        shippedOrder.displayDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());

        System.out.println("------------------------------------------------");

        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2025-01-15", "TRACK5678", "2025-01-21");
        deliveredOrder.displayDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}

