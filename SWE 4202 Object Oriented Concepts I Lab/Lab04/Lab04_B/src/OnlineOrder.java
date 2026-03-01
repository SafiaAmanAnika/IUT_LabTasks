public class OnlineOrder extends Order {
    
    @Override
    public void processOrder() {
        System.out.println("Processing an online order.");
    }

    @Override
    public void processOrder(String orderID) {
        System.out.println("Processing an online order with ID: " + orderID);
    }
}