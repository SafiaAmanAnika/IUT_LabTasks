public class Driver extends Employee {
    private String licenseNumber;
    private boolean available = true;

    public Driver(int id, String name, String licenseNumber) {
        super(id, name);
        this.licenseNumber = licenseNumber;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean status) {
        this.available = status;
    }

    public void checkoutOrder(Order order, String licenseInput) {
        System.out.println("\n--- Driver Checkout ---");

        if (!licenseNumber.equals(licenseInput)) {
            System.out.println("License verification failed.");
            return;
        }
        if (order.getDriver() != this) {
            System.out.println("Order not assigned to this driver.");
            return;
        }

        order.setStatus(OrderStatus.OUT_FOR_DELIVERY);
        System.out.println("Checkout successful. Order is OUT FOR DELIVERY.");
    }
}