public class Order {

    public void processOrder() {
        System.out.println("Processing a general order.");
    }

    public void processOrder(String orderID) {
        System.out.println("Processing order with ID: " + orderID);
    }

    public void processOrder(String orderID, boolean isPriority) {
        if(isPriority == true) {
            System.out.println("Processing a priority order with ID: " + orderID);
        } else {
            System.out.println("Processing a non-priority order with ID: " + orderID);
        }
    }
}