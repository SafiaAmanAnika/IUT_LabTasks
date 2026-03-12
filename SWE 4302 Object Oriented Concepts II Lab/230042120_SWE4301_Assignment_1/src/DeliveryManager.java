import java.util.List;

public class DeliveryManager extends Employee {
    public DeliveryManager(int id, String name) {
        super(id, name);
    }

    public void assignDelivery(Order order, List<Driver> drivers) {
        System.out.println("\n--- Delivery Assignment ---");

        if (order.getPriority() == OrderPriority.PRIORITY) {
            System.out.println("Priority order detected (assign within 10 minutes)");
        }

        for (Driver d : drivers) {
            if (d.isAvailable()) {
                order.assignDriver(d);
                d.setAvailable(false);
                System.out.println("Assigned Driver: " + d.getName());
                return;
            }
        }

        System.out.println("No drivers available currently.");
    }
}