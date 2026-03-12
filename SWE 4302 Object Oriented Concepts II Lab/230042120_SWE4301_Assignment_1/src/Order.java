public class Order {
    private static int counter = 0;

    private int orderId, rating;
    private Customer customer;
    private String items, chefTeam, estimatedTime, feedback;
    private double totalAmount;

    private OrderStatus status;
    private OrderPriority priority;

    private Driver driver;

    public Order(Customer customer, String items, double amount) {
        this.orderId = ++counter;
        this.customer = customer;
        this.items = items;
        this.totalAmount = amount;
        this.status = OrderStatus.PLACED;
        this.priority = OrderPriority.NORMAL;
    }

    public int getOrderId() {
        return orderId;
    }
    public OrderPriority getPriority() {
        return priority;
    }
    public void setPriority(OrderPriority priority) {
        this.priority = priority;
    }
    public void setKitchenDetails(String chefs, String time) {
        this.chefTeam = chefs;
        this.estimatedTime = time;
    }
    public void assignDriver(Driver driver) {
        this.driver = driver;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setFeedback(String feedback, int rating) {
        if (rating < 1 || rating > 5) {
            rating = 3;
        }
        this.feedback = feedback;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "\nOrder Summary\n" +
               "-------------\n" +
               "Order ID: " + orderId +
               "\nItems: " + items +
               "\nAmount: $" + String.format("%.2f", totalAmount) +
               "\nPriority: " + priority +
               "\nStatus: " + status +
               "\nChef Team: " + chefTeam +
               "\nEstimated Time: " + estimatedTime +
               "\nDriver: " + (driver != null ? driver.getName() : "Not Assigned") +
               "\nRating: " + rating +
               "\nFeedback: " + feedback;
    }
}