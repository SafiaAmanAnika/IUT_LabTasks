public class Customer extends User {
    private boolean registered;
    private int monthlyOrderCount;

    public Customer(int id, String name, boolean registered, int previousOrders) {
        super(id, name);
        this.registered = registered;
        this.monthlyOrderCount = previousOrders;
    }

    public Order placeOrder(String items, double basePrice) {
        double finalPrice = basePrice;

        if (registered) {
            if (monthlyOrderCount >= 10) {
                finalPrice *= 0.90;
            } else if (monthlyOrderCount >= 5) {
                finalPrice *= 0.95;
            }
        }

        Order order = new Order(this, items, finalPrice);
        monthlyOrderCount++;

        System.out.println("--- Placing an Order ---");
        System.out.println("Customer: " + name);
        System.out.println("Items: " + items);
        System.out.println("Total Bill: $" + String.format("%.2f", finalPrice));
        System.out.println("Queue Number: " + order.getOrderId());

        return order;
    }

    public void confirmDelivery(Order order, String comment, int rating) {
        order.setStatus(OrderStatus.DELIVERED);
        order.setFeedback(comment, rating);

        System.out.println("\n--- Customer Feedback ---");
        System.out.println("Order #" + order.getOrderId() + " marked as DELIVERED");
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Comment: " + comment);
    }
}