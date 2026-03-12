import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TasteBuds Catering System ===");

        HeadChef chef = new HeadChef(101, "Gordon");
        DeliveryManager manager = new DeliveryManager(102, "Monica");

        Driver d1 = new Driver(201, "Dan (Bike)", "LIC-9999");
        Driver d2 = new Driver(202, "Mike (Van)", "LIC-8888");
        List<Driver> drivers = Arrays.asList(d1, d2);

        Customer customer = new Customer(1, "Anika", true, 6);
        // Placing Order
        Order order = customer.placeOrder("Wedding Platter", 200);

        System.out.println("\n[Main Page]");
        System.out.println("Currently Serving Order: #" + (order.getOrderId() - 1));
        // Kitchen
        chef.prepareOrder(order, true, "Team Alpha", "45 minutes");
        // Delivery
        manager.assignDelivery(order, drivers);
        // Driver Checkout
        if (order.getDriver() != null) {
            order.getDriver().checkoutOrder(order, "LIC-9999");
        }
        // Customer Feedback
        customer.confirmDelivery(order, "Excellent service and food quality!", 5);

        System.out.println(order);
        System.out.println("\n=== System End ===");
    }
}